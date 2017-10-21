package com.example.anup.gmailinbox.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Anup on 10/21/2017.
 */

public class Message {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("isImportant")
    @Expose
    private Boolean isImportant;
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("isRead")
    @Expose
    private Boolean isRead;
    private int color = -1;
    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
