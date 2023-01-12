package com.stackroute.AIChat.model;

import java.util.HashMap;
import java.util.Map;

public class Choice {

    private String text;
    private Integer index;
    private Object logprobs;
    private String finishReason;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Choice() {
    }

    public Choice(String text, Integer index, Object logprobs, String finishReason, Map<String, Object> additionalProperties) {
        this.text = text;
        this.index = index;
        this.logprobs = logprobs;
        this.finishReason = finishReason;
        this.additionalProperties = additionalProperties;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Object getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(Object logprobs) {
        this.logprobs = logprobs;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
