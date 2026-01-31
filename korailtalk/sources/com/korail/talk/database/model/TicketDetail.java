package com.korail.talk.database.model;

import com.j256.ormlite.field.DatabaseField;

/* loaded from: classes.dex */
public class TicketDetail {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String pnrNo;

    @DatabaseField
    private String ticketDetail;

    public int getId() {
        return this.id;
    }

    public String getPnrNo() {
        return this.pnrNo;
    }

    public String getTicketDetail() {
        return this.ticketDetail;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setPnrNo(String str) {
        this.pnrNo = str;
    }

    public void setTicketDetail(String str) {
        this.ticketDetail = str;
    }
}
