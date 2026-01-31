package com.korail.talk.network.data.reservation;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class RPsg extends LinkedHashMap<String, String> {
    public static final String PSG_CNT = "psgCnt";
    public static final String PSG_INFO_PER_PRNB = "psgInfoPerPrnb_";
    public static final String PSG_TP_DV_CD = "psgTpDvCd_";

    public void setPsgCnt(String str) {
        put(PSG_CNT, str);
    }

    public void setPsgInfoPerPrnb(int i8, String str) {
        put(PSG_INFO_PER_PRNB + i8, str);
    }

    public void setPsgTpDvCd(int i8, String str) {
        put(PSG_TP_DV_CD + i8, str);
    }
}
