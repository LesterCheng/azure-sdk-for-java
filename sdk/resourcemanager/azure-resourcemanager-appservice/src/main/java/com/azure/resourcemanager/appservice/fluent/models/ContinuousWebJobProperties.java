// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ContinuousWebJobStatus;
import com.azure.resourcemanager.appservice.models.WebJobType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** ContinuousWebJob resource specific properties. */
@Fluent
public final class ContinuousWebJobProperties {
    /*
     * Job status.
     */
    @JsonProperty(value = "status")
    private ContinuousWebJobStatus status;

    /*
     * Detailed status.
     */
    @JsonProperty(value = "detailed_status")
    private String detailedStatus;

    /*
     * Log URL.
     */
    @JsonProperty(value = "log_url")
    private String logUrl;

    /*
     * Run command.
     */
    @JsonProperty(value = "run_command")
    private String runCommand;

    /*
     * Job URL.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * Extra Info URL.
     */
    @JsonProperty(value = "extra_info_url")
    private String extraInfoUrl;

    /*
     * Job type.
     */
    @JsonProperty(value = "web_job_type")
    private WebJobType webJobType;

    /*
     * Error information.
     */
    @JsonProperty(value = "error")
    private String error;

    /*
     * Using SDK?
     */
    @JsonProperty(value = "using_sdk")
    private Boolean usingSdk;

    /*
     * Job settings.
     */
    @JsonProperty(value = "settings")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> settings;

    /**
     * Get the status property: Job status.
     *
     * @return the status value.
     */
    public ContinuousWebJobStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Job status.
     *
     * @param status the status value to set.
     * @return the ContinuousWebJobProperties object itself.
     */
    public ContinuousWebJobProperties withStatus(ContinuousWebJobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the detailedStatus property: Detailed status.
     *
     * @return the detailedStatus value.
     */
    public String detailedStatus() {
        return this.detailedStatus;
    }

    /**
     * Set the detailedStatus property: Detailed status.
     *
     * @param detailedStatus the detailedStatus value to set.
     * @return the ContinuousWebJobProperties object itself.
     */
    public ContinuousWebJobProperties withDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
        return this;
    }

    /**
     * Get the logUrl property: Log URL.
     *
     * @return the logUrl value.
     */
    public String logUrl() {
        return this.logUrl;
    }

    /**
     * Set the logUrl property: Log URL.
     *
     * @param logUrl the logUrl value to set.
     * @return the ContinuousWebJobProperties object itself.
     */
    public ContinuousWebJobProperties withLogUrl(String logUrl) {
        this.logUrl = logUrl;
        return this;
    }

    /**
     * Get the runCommand property: Run command.
     *
     * @return the runCommand value.
     */
    public String runCommand() {
        return this.runCommand;
    }

    /**
     * Set the runCommand property: Run command.
     *
     * @param runCommand the runCommand value to set.
     * @return the ContinuousWebJobProperties object itself.
     */
    public ContinuousWebJobProperties withRunCommand(String runCommand) {
        this.runCommand = runCommand;
        return this;
    }

    /**
     * Get the url property: Job URL.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: Job URL.
     *
     * @param url the url value to set.
     * @return the ContinuousWebJobProperties object itself.
     */
    public ContinuousWebJobProperties withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the extraInfoUrl property: Extra Info URL.
     *
     * @return the extraInfoUrl value.
     */
    public String extraInfoUrl() {
        return this.extraInfoUrl;
    }

    /**
     * Set the extraInfoUrl property: Extra Info URL.
     *
     * @param extraInfoUrl the extraInfoUrl value to set.
     * @return the ContinuousWebJobProperties object itself.
     */
    public ContinuousWebJobProperties withExtraInfoUrl(String extraInfoUrl) {
        this.extraInfoUrl = extraInfoUrl;
        return this;
    }

    /**
     * Get the webJobType property: Job type.
     *
     * @return the webJobType value.
     */
    public WebJobType webJobType() {
        return this.webJobType;
    }

    /**
     * Set the webJobType property: Job type.
     *
     * @param webJobType the webJobType value to set.
     * @return the ContinuousWebJobProperties object itself.
     */
    public ContinuousWebJobProperties withWebJobType(WebJobType webJobType) {
        this.webJobType = webJobType;
        return this;
    }

    /**
     * Get the error property: Error information.
     *
     * @return the error value.
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error property: Error information.
     *
     * @param error the error value to set.
     * @return the ContinuousWebJobProperties object itself.
     */
    public ContinuousWebJobProperties withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get the usingSdk property: Using SDK?.
     *
     * @return the usingSdk value.
     */
    public Boolean usingSdk() {
        return this.usingSdk;
    }

    /**
     * Set the usingSdk property: Using SDK?.
     *
     * @param usingSdk the usingSdk value to set.
     * @return the ContinuousWebJobProperties object itself.
     */
    public ContinuousWebJobProperties withUsingSdk(Boolean usingSdk) {
        this.usingSdk = usingSdk;
        return this;
    }

    /**
     * Get the settings property: Job settings.
     *
     * @return the settings value.
     */
    public Map<String, Object> settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Job settings.
     *
     * @param settings the settings value to set.
     * @return the ContinuousWebJobProperties object itself.
     */
    public ContinuousWebJobProperties withSettings(Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
