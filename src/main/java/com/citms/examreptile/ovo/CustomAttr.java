
package com.citms.examreptile.ovo;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "answer_match",
        "calculation",
        "total_score",
        "option_group",
        "answer_analysis",
        "show_seq",
        "is_correct",
        "score",
        "answer_analysis",
        "correct_answer"
})
public class CustomAttr {

    @JsonProperty("answer_match")
    private String answerMatch;
    @JsonProperty("calculation")
    private String calculation;
    @JsonProperty("total_score")
    private String totalScore;
    @JsonProperty("option_group")
    private List<Object> optionGroup = null;
    @JsonProperty("answer_analysis")
    private String answerAnalysis;
    @JsonProperty("show_seq")
    private String showSeq;
    @JsonProperty("is_correct")
    private String isCorrect;
    @JsonProperty("correct_answer")
    private String correctAnswer;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("answer_match")
    public String getAnswerMatch() {
        return answerMatch;
    }

    @JsonProperty("answer_match")
    public void setAnswerMatch(String answerMatch) {
        this.answerMatch = answerMatch;
    }

    @JsonProperty("calculation")
    public String getCalculation() {
        return calculation;
    }

    @JsonProperty("calculation")
    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    @JsonProperty("total_score")
    public String getTotalScore() {
        return totalScore;
    }

    @JsonProperty("total_score")
    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }

    @JsonProperty("option_group")
    public List<Object> getOptionGroup() {
        return optionGroup;
    }

    @JsonProperty("option_group")
    public void setOptionGroup(List<Object> optionGroup) {
        this.optionGroup = optionGroup;
    }

    @JsonProperty("answer_analysis")
    public String getAnswerAnalysis() {
        return answerAnalysis;
    }

    @JsonProperty("answer_analysis")
    public void setAnswerAnalysis(String answerAnalysis) {
        this.answerAnalysis = answerAnalysis;
    }

    @JsonProperty("show_seq")
    public String getShowSeq() {
        return showSeq;
    }

    @JsonProperty("show_seq")
    public void setShowSeq(String showSeq) {
        this.showSeq = showSeq;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("score")
    public void setScore(String score) {
    }

    @JsonProperty("is_correct")
    public String getIsCorrect() {
        return isCorrect;
    }

    @JsonProperty("is_correct")
    public void setIsCorrect(String isCorrect) {
        this.isCorrect = isCorrect;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
