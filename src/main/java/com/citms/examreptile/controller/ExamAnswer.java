package com.citms.examreptile.controller;

import com.citms.examreptile.ovo.OptionList;
import com.citms.examreptile.ovo.Question;
import com.citms.examreptile.process.ExamPageProcess;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
import com.jayway.jsonpath.TypeRef;
import com.jayway.jsonpath.spi.json.JacksonJsonProvider;
import com.jayway.jsonpath.spi.json.JsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import com.jayway.jsonpath.spi.mapper.MappingProvider;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import us.codecraft.webmagic.*;

import java.util.*;

/**
 * @author pei.wang
 */
@RequestMapping("/exam")
@RestController
public class ExamAnswer {

    @GetMapping("/answer")
    public String answer(@RequestParam("url") String url){
        Spider spider = Spider.create(new ExamPageProcess());
        ResultItems result = spider.get(url);
        Map<String,Object> map=  result.getAll();
        String rs = map.get("answer").toString();
        StringBuilder sb = new StringBuilder();
        Configuration.setDefaults(new Configuration.Defaults() {
            private final JsonProvider jsonProvider = new JacksonJsonProvider();
            private final MappingProvider mappingProvider = new JacksonMappingProvider();

            @Override
            public JsonProvider jsonProvider() {
                return jsonProvider;
            }

            @Override
            public MappingProvider mappingProvider() {
                return mappingProvider;
            }

            @Override
            public Set<Option> options() {
                return EnumSet.noneOf(Option.class);
            }
        });

//        List<String> questionIdList = JsonPath.parse(rs).read("$.questionpage_list[0].question_id_list");
        List<Question> questions = JsonPath.parse(rs).read("$.questionpage_list[0].question_list", new TypeRef<List<Question>>() {
        });
        for (Question question : questions) {
            List<String> answers = new ArrayList<>();
            for (OptionList optionList : question.getOptionList()) {
                if (optionList.getCustomAttr().getIsCorrect() != null && optionList.getCustomAttr().getIsCorrect().equalsIgnoreCase("1")) {
                    answers.add(optionList.getTitle());
                }

                if (StringUtils.isNotEmpty(optionList.getCustomAttr().getCorrectAnswer())) {
                    answers.add(optionList.getCustomAttr().getCorrectAnswer());
                }
            }
            sb.append("</br>");
            sb.append(question.getTitle());
            sb.append("</br>");
            sb.append("<font color=\"#FF0000\">答案: ");
            for (String answer : answers) {
                sb.append(answer);
            }
            if(StringUtils.isNotEmpty(question.getCustomAttr().getAnswerAnalysis())){
                sb.append(question.getCustomAttr().getAnswerAnalysis());
            }
            sb.append("</font> </br>");
        }
        spider.stop();
        spider.close();

        return sb.toString();
    }

}
