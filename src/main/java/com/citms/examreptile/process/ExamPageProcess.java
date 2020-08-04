package com.citms.examreptile.process;

import com.alibaba.fastjson.JSONObject;
import com.citms.examreptile.ovo.OptionList;
import com.citms.examreptile.ovo.Question;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
import com.jayway.jsonpath.TypeRef;
import com.jayway.jsonpath.spi.json.JacksonJsonProvider;
import com.jayway.jsonpath.spi.json.JsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import com.jayway.jsonpath.spi.mapper.MappingProvider;
import org.apache.commons.lang3.StringUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author pei.wang
 */
public class ExamPageProcess implements PageProcessor {

    @Override
    public void process(Page page) {
        List<String> links = page.getHtml().links().regex("http://www.wenjuan.top/s/773Mre9/\\d+").all();
        page.addTargetRequests(links);
        String  result   = page.getHtml().regex("(?<=project =).*?(.*)").get();
        String s =  page.getHtml().regex("(?<=globalData =).*?(.*)").get();
        result = result.replace(s,"").replace("// 全局数据对象","").replace("var globalData =","");
//        sb.append(result);
        page.putField("answer",result);
    }

    @Override
    public Site getSite() {
        return Site.me().setDomain("www.wenjuan.top ");
    }

    public static void main(String[] args) {

    }
}
