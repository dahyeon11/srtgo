package com.korail.talk.network;

import java.io.Serializable;
import z3.InterfaceC6622c;

/* loaded from: classes.dex */
public class BaseResponse implements Serializable {
    public static final String FAIL = "FAIL";
    public static final String SUCCESS = "SUCC";

    @InterfaceC6622c("h_msg_cd")
    private String hMsgCd;

    @InterfaceC6622c("h_msg_txt")
    private String hMsgTxt;

    @InterfaceC6622c("strResult")
    private String strResult;

    public String getStrResult() {
        return this.strResult;
    }

    public String gethMsgCd() {
        return this.hMsgCd;
    }

    public String gethMsgTxt() {
        return this.hMsgTxt;
    }
}
