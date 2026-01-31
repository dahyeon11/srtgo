package com.h2osystech.smartalimi.aidllib;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class MSGVo implements Parcelable {
    public static final Parcelable.Creator<MSGVo> CREATOR = new Parcelable.Creator<MSGVo>() { // from class: com.h2osystech.smartalimi.aidllib.MSGVo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MSGVo createFromParcel(Parcel parcel) {
            return new MSGVo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MSGVo[] newArray(int i8) {
            return new MSGVo[i8];
        }
    };
    private String attachfile;
    private int attachfileCnt;
    private String contactName;
    private String content;
    private String date;
    private String downfilePath;
    private String msgType;
    private String newMsgCnt;
    private String notiType;
    private String param;
    private String readYn;
    private String receiveTime;
    private String receiver;
    private String sender;
    private String seq;
    private String taskName;
    private String timeStamp;
    private String title;
    private String uniqSeq;
    private String url;

    public MSGVo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.uniqSeq.equals(((MSGVo) obj).uniqSeq);
    }

    public String getAttachfile() {
        return this.attachfile;
    }

    public int getAttachfileCnt() {
        return this.attachfileCnt;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContent() {
        return this.content;
    }

    public String getDate() {
        return this.date;
    }

    public String getDownfilePath() {
        return this.downfilePath;
    }

    public String getMsgType() {
        return this.msgType;
    }

    public MSGVo getMsgVo() {
        return this;
    }

    public String getNewMsgCnt() {
        return this.newMsgCnt;
    }

    public String getNotiType() {
        return this.notiType;
    }

    public String getParam() {
        return this.param;
    }

    public String getReadYN() {
        return this.readYn;
    }

    public String getReadYn() {
        return this.readYn;
    }

    public String getReceiveTime() {
        return this.receiveTime;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public String getSender() {
        return this.sender;
    }

    public String getSeq() {
        return this.seq;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUniqSeq() {
        return this.uniqSeq;
    }

    public String getUrl() {
        return this.url;
    }

    public void readFromParcel(Parcel parcel) {
        this.uniqSeq = parcel.readString();
        this.seq = parcel.readString();
        this.timeStamp = parcel.readString();
        this.date = parcel.readString();
        this.readYn = parcel.readString();
        this.receiver = parcel.readString();
        this.sender = parcel.readString();
        this.title = parcel.readString();
        this.msgType = parcel.readString();
        this.content = parcel.readString();
        this.url = parcel.readString();
        this.attachfileCnt = parcel.readInt();
        this.attachfile = parcel.readString();
        this.downfilePath = parcel.readString();
        this.taskName = parcel.readString();
        this.newMsgCnt = parcel.readString();
        this.contactName = parcel.readString();
        this.notiType = parcel.readString();
        this.receiveTime = parcel.readString();
        this.param = parcel.readString();
    }

    public void setAttachfile(String str) {
        this.attachfile = str;
    }

    public void setAttachfileCnt(int i8) {
        this.attachfileCnt = i8;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setDownfilePath(String str) {
        this.downfilePath = str;
    }

    public void setMsgType(String str) {
        this.msgType = str;
    }

    public void setNewMsgCnt(String str) {
        this.newMsgCnt = str;
    }

    public void setNotiType(String str) {
        this.notiType = str;
    }

    public void setParam(String str) {
        this.param = str;
    }

    public void setReadYN(String str) {
        this.readYn = str;
    }

    public void setReadYn(String str) {
        this.readYn = str;
    }

    public void setReceiveTime(String str) {
        this.receiveTime = str;
    }

    public void setReceiver(String str) {
        this.receiver = str;
    }

    public void setSender(String str) {
        this.sender = str;
    }

    public void setSeq(String str) {
        this.seq = str;
    }

    public void setTaskName(String str) {
        this.taskName = str;
    }

    public void setTimeStamp(String str) {
        this.timeStamp = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUniqSeq(String str) {
        this.uniqSeq = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "[uniqSeq = " + this.uniqSeq + "] [seq = " + this.seq + "] [timeStamp = " + this.timeStamp + "] [date = " + this.date + "][readYn = " + this.readYn + "][receiver = " + this.receiver + "][sender = " + this.sender + "][title = " + this.title + "][msgType = " + this.msgType + "][content = " + this.content + "][url = " + this.url + "][taskname = " + this.taskName + "][notitype = " + this.notiType + "][param = " + this.param;
    }

    public void writeToParcel(Parcel parcel) {
        parcel.writeString(this.uniqSeq);
        parcel.writeString(this.seq);
        parcel.writeString(this.timeStamp);
        parcel.writeString(this.date);
        parcel.writeString(this.readYn);
        parcel.writeString(this.receiver);
        parcel.writeString(this.sender);
        parcel.writeString(this.title);
        parcel.writeString(this.msgType);
        parcel.writeString(this.content);
        parcel.writeString(this.url);
        parcel.writeInt(this.attachfileCnt);
        parcel.writeString(this.attachfile);
        parcel.writeString(this.downfilePath);
        parcel.writeString(this.taskName);
        parcel.writeString(this.newMsgCnt);
        parcel.writeString(this.contactName);
        parcel.writeString(this.notiType);
        parcel.writeString(this.receiveTime);
        parcel.writeString(this.param);
    }

    public MSGVo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i8, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.uniqSeq = str;
        this.seq = str2;
        this.timeStamp = str3;
        this.date = str4;
        this.readYn = str5;
        this.receiver = str6;
        this.sender = str7;
        this.title = str8;
        this.msgType = str9;
        this.content = str10;
        this.url = str11;
        this.attachfileCnt = i8;
        this.attachfile = str12;
        this.downfilePath = str13;
        this.taskName = str14;
        this.newMsgCnt = str15;
        this.contactName = str16;
        this.notiType = str17;
        this.receiveTime = str18;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        writeToParcel(parcel);
    }

    public MSGVo(Parcel parcel) {
        this.uniqSeq = parcel.readString();
        this.seq = parcel.readString();
        this.timeStamp = parcel.readString();
        this.date = parcel.readString();
        this.readYn = parcel.readString();
        this.receiver = parcel.readString();
        this.sender = parcel.readString();
        this.title = parcel.readString();
        this.msgType = parcel.readString();
        this.content = parcel.readString();
        this.url = parcel.readString();
        this.attachfileCnt = parcel.readInt();
        this.attachfile = parcel.readString();
        this.downfilePath = parcel.readString();
        this.taskName = parcel.readString();
        this.newMsgCnt = parcel.readString();
        this.contactName = parcel.readString();
        this.notiType = parcel.readString();
        this.receiveTime = parcel.readString();
        this.param = parcel.readString();
    }
}
