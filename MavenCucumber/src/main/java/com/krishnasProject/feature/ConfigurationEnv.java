package com.krishnasProject.feature;

import com.google.gson.annotations.SerializedName;

public class ConfigurationEnv {
    private String BrowserType;

    private String TimeOut;

    private String Country_of_birth;

    private String Case1Url;

    @SerializedName("BaseUrl")
    private String BaseUrl;

    public ConfigurationEnv() {
        // TODO Auto-generated constructor stub
    }

    public String getBrowserType() {
        return BrowserType;
    }

    public void setBrowserType(String browserType) {
        BrowserType = browserType;
    }

    public String getTimeOut() {
        return TimeOut;
    }

    public void setTimeOut(String timeOut) {
        TimeOut = timeOut;
    }

    public String getCountry_of_birth() {
        return Country_of_birth;
    }

    public void setCountry_of_birth(String country_of_birth) {
        Country_of_birth = country_of_birth;
    }

    public String getBaseUrl() {
        return BaseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.BaseUrl = baseUrl;
    }

    public String getCase1Url() {
        return Case1Url;
    }

    public void setCase1Url(String case1Url) {
        Case1Url = case1Url;
    }
}
