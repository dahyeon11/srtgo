package com.korail.talk.network.data.reservation.old;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class OWait extends LinkedHashMap<String, String> {
    public static final String PHONE_NO = "PHONE_NO";
    public static final String PSRM_CL_CHG_FLG = "PSRM_CL_CHG_FLG";
    public static final String SMS_FLG = "SMS_FLG";

    public void setPhoneNo(String str) {
        put(PHONE_NO, str);
    }

    public void setPsrmClChgFlg(String str) {
        put(PSRM_CL_CHG_FLG, str);
    }

    public void setSmsFlg(String str) {
        put(SMS_FLG, str);
    }
}
