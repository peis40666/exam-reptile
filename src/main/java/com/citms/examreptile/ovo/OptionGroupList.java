
package com.citms.examreptile.ovo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "option_id_list",
    "related_q_id_list"
})
public class OptionGroupList {

    @JsonProperty("title")
    private Object title;
    @JsonProperty("option_id_list")
    private List<String> optionIdList = null;
    @JsonProperty("related_q_id_list")
    private List<Object> relatedQIdList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public Object getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Object title) {
        this.title = title;
    }

    @JsonProperty("option_id_list")
    public List<String> getOptionIdList() {
        return optionIdList;
    }

    @JsonProperty("option_id_list")
    public void setOptionIdList(List<String> optionIdList) {
        this.optionIdList = optionIdList;
    }

    @JsonProperty("related_q_id_list")
    public List<Object> getRelatedQIdList() {
        return relatedQIdList;
    }

    @JsonProperty("related_q_id_list")
    public void setRelatedQIdList(List<Object> relatedQIdList) {
        this.relatedQIdList = relatedQIdList;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
