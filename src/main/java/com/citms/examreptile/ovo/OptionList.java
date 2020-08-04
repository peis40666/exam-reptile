
package com.citms.examreptile.ovo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "updated",
    "title",
    "cid",
    "is_open",
    "_id",
    "custom_attr",
    "question_id"
})
public class OptionList {

    @JsonProperty("title")
    private String title;
    @JsonProperty("cid")
    private String cid;
    @JsonProperty("is_open")
    private Boolean isOpen;
    @JsonProperty("_id")
    private Id id;
    @JsonProperty("custom_attr")
    private CustomAttr customAttr;
    @JsonProperty("question_id")
    private String questionId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("cid")
    public String getCid() {
        return cid;
    }

    @JsonProperty("cid")
    public void setCid(String cid) {
        this.cid = cid;
    }

    @JsonProperty("is_open")
    public Boolean getIsOpen() {
        return isOpen;
    }

    @JsonProperty("is_open")
    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    @JsonProperty("_id")
    public Id getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(Id id) {
        this.id = id;
    }

    @JsonProperty("custom_attr")
    public CustomAttr getCustomAttr() {
        return customAttr;
    }

    @JsonProperty("custom_attr")
    public void setCustomAttr(CustomAttr customAttr) {
        this.customAttr = customAttr;
    }

    @JsonProperty("question_id")
    public String getQuestionId() {
        return questionId;
    }

    @JsonProperty("question_id")
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
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
