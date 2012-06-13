package com.weather.feedloadclient;

import java.util.Date;
import java.util.List;

public class Feed {
    private String name;
    private String source;
    private String cron;
    private String url;
    private int expiration;
    private String dmaDefault;
    private List<String> notificationEmails;
    private NotificationLevel notificationLevel;
    private Date lastRunDate;
    private RunResult lastRunResult;
    
    
    private enum NotificationLevel {ALL, ERRORS, SUMMARY}
    private enum RunResult {SUCCESS, PARTIAL_SUCCESS, FAILURE}
}