
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
    "extra_option_list",
    "has_open_option",
    "project_id",
    "jumpconstraint_id_list",
    "related_question_list",
    "cid",
    "questionpage_id",
    "title",
    "updated",
    "matrixrow_list",
    "matrixrow_id_list",
    "option_list",
    "jumpconstraint_id_list2",
    "option_id_list",
    "question_type",
    "displayconstraint_id_list2",
    "option_group_list",
    "_id",
    "displayconstraint_id_list",
    "custom_attr",
    "extra_option_id_list"
})
public class Question {

    @JsonProperty("extra_option_list")
    private List<Object> extraOptionList = null;
    @JsonProperty("has_open_option")
    private Boolean hasOpenOption;
    @JsonProperty("project_id")
    private String projectId;
    @JsonProperty("jumpconstraint_id_list")
    private List<Object> jumpconstraintIdList = null;
    @JsonProperty("related_question_list")
    private List<Object> relatedQuestionList = null;
    @JsonProperty("cid")
    private String cid;
    @JsonProperty("questionpage_id")
    private String questionpageId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("updated")
    private Updated updated;
    @JsonProperty("matrixrow_list")
    private List<Object> matrixrowList = null;
    @JsonProperty("matrixrow_id_list")
    private List<Object> matrixrowIdList = null;
    @JsonProperty("option_list")
    private List<OptionList> optionList = null;
    @JsonProperty("jumpconstraint_id_list2")
    private List<Object> jumpconstraintIdList2 = null;
    @JsonProperty("option_id_list")
    private List<String> optionIdList = null;
    @JsonProperty("question_type")
    private Integer questionType;
    @JsonProperty("displayconstraint_id_list2")
    private List<Object> displayconstraintIdList2 = null;
    @JsonProperty("option_group_list")
    private List<OptionGroupList> optionGroupList = null;
    @JsonProperty("displayconstraint_id_list")
    private List<Object> displayconstraintIdList = null;
    @JsonProperty("custom_attr")
    private CustomAttr customAttr;
    @JsonProperty("extra_option_id_list")
    private List<Object> extraOptionIdList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("extra_option_list")
    public List<Object> getExtraOptionList() {
        return extraOptionList;
    }

    @JsonProperty("extra_option_list")
    public void setExtraOptionList(List<Object> extraOptionList) {
        this.extraOptionList = extraOptionList;
    }

    @JsonProperty("has_open_option")
    public Boolean getHasOpenOption() {
        return hasOpenOption;
    }

    @JsonProperty("has_open_option")
    public void setHasOpenOption(Boolean hasOpenOption) {
        this.hasOpenOption = hasOpenOption;
    }

    @JsonProperty("project_id")
    public String getProjectId() {
        return projectId;
    }

    @JsonProperty("project_id")
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @JsonProperty("jumpconstraint_id_list")
    public List<Object> getJumpconstraintIdList() {
        return jumpconstraintIdList;
    }

    @JsonProperty("jumpconstraint_id_list")
    public void setJumpconstraintIdList(List<Object> jumpconstraintIdList) {
        this.jumpconstraintIdList = jumpconstraintIdList;
    }

    @JsonProperty("related_question_list")
    public List<Object> getRelatedQuestionList() {
        return relatedQuestionList;
    }

    @JsonProperty("related_question_list")
    public void setRelatedQuestionList(List<Object> relatedQuestionList) {
        this.relatedQuestionList = relatedQuestionList;
    }

    @JsonProperty("cid")
    public String getCid() {
        return cid;
    }

    @JsonProperty("cid")
    public void setCid(String cid) {
        this.cid = cid;
    }

    @JsonProperty("questionpage_id")
    public String getQuestionpageId() {
        return questionpageId;
    }

    @JsonProperty("questionpage_id")
    public void setQuestionpageId(String questionpageId) {
        this.questionpageId = questionpageId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("updated")
    public Updated getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(Updated updated) {
        this.updated = updated;
    }

    @JsonProperty("matrixrow_list")
    public List<Object> getMatrixrowList() {
        return matrixrowList;
    }

    @JsonProperty("matrixrow_list")
    public void setMatrixrowList(List<Object> matrixrowList) {
        this.matrixrowList = matrixrowList;
    }

    @JsonProperty("matrixrow_id_list")
    public List<Object> getMatrixrowIdList() {
        return matrixrowIdList;
    }

    @JsonProperty("matrixrow_id_list")
    public void setMatrixrowIdList(List<Object> matrixrowIdList) {
        this.matrixrowIdList = matrixrowIdList;
    }

    @JsonProperty("option_list")
    public List<OptionList> getOptionList() {
        return optionList;
    }

    @JsonProperty("option_list")
    public void setOptionList(List<OptionList> optionList) {
        this.optionList = optionList;
    }

    @JsonProperty("jumpconstraint_id_list2")
    public List<Object> getJumpconstraintIdList2() {
        return jumpconstraintIdList2;
    }

    @JsonProperty("jumpconstraint_id_list2")
    public void setJumpconstraintIdList2(List<Object> jumpconstraintIdList2) {
        this.jumpconstraintIdList2 = jumpconstraintIdList2;
    }

    @JsonProperty("option_id_list")
    public List<String> getOptionIdList() {
        return optionIdList;
    }

    @JsonProperty("option_id_list")
    public void setOptionIdList(List<String> optionIdList) {
        this.optionIdList = optionIdList;
    }

    @JsonProperty("question_type")
    public Integer getQuestionType() {
        return questionType;
    }

    @JsonProperty("question_type")
    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    @JsonProperty("displayconstraint_id_list2")
    public List<Object> getDisplayconstraintIdList2() {
        return displayconstraintIdList2;
    }

    @JsonProperty("displayconstraint_id_list2")
    public void setDisplayconstraintIdList2(List<Object> displayconstraintIdList2) {
        this.displayconstraintIdList2 = displayconstraintIdList2;
    }

    @JsonProperty("option_group_list")
    public List<OptionGroupList> getOptionGroupList() {
        return optionGroupList;
    }

    @JsonProperty("option_group_list")
    public void setOptionGroupList(List<OptionGroupList> optionGroupList) {
        this.optionGroupList = optionGroupList;
    }

    @JsonProperty("displayconstraint_id_list")
    public List<Object> getDisplayconstraintIdList() {
        return displayconstraintIdList;
    }

    @JsonProperty("displayconstraint_id_list")
    public void setDisplayconstraintIdList(List<Object> displayconstraintIdList) {
        this.displayconstraintIdList = displayconstraintIdList;
    }

    @JsonProperty("custom_attr")
    public CustomAttr getCustomAttr() {
        return customAttr;
    }

    @JsonProperty("custom_attr")
    public void setCustomAttr(CustomAttr customAttr) {
        this.customAttr = customAttr;
    }

    @JsonProperty("extra_option_id_list")
    public List<Object> getExtraOptionIdList() {
        return extraOptionIdList;
    }

    @JsonProperty("extra_option_id_list")
    public void setExtraOptionIdList(List<Object> extraOptionIdList) {
        this.extraOptionIdList = extraOptionIdList;
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
