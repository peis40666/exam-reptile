package com.citms.examreptile.pipeline;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pei.wang
 */
public class AnswerPipeline implements Pipeline {
    private Map<String,String> answerMap = new HashMap<>();

    @Override
    public void process(ResultItems resultItems, Task task) {
        Map map = resultItems.getAll();
//        sb.append( map.get("answer"));
    }

    public String getAnswer(){
       return null;
    }
}
