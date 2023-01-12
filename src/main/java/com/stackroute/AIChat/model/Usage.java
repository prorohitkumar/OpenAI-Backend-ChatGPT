package com.stackroute.AIChat.model;

import java.util.HashMap;
import java.util.Map;

public class Usage {
    private Integer promptTokens;
    private Integer completionTokens;
    private Integer totalTokens;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Usage() {
    }

    public Usage(Integer promptTokens, Integer completionTokens, Integer totalTokens, Map<String, Object> additionalProperties) {
        this.promptTokens = promptTokens;
        this.completionTokens = completionTokens;
        this.totalTokens = totalTokens;
        this.additionalProperties = additionalProperties;
    }

    public Integer getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
    }

    public Integer getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
    }

    public Integer getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
