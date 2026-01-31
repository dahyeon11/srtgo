package com.korail.talk.database.model;

import com.j256.ormlite.field.DatabaseField;

/* loaded from: classes.dex */
public class IssueList {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String issueList;

    public int getId() {
        return this.id;
    }

    public String getIssueList() {
        return this.issueList;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setIssueList(String str) {
        this.issueList = str;
    }
}
