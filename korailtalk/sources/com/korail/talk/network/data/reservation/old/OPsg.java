package com.korail.talk.network.data.reservation.old;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class OPsg extends LinkedHashMap<String, String> {
    public static final String CARD_NO = "txtCardNo_";
    public static final String COMPA_CNT = "txtCompaCnt";
    public static final String DISC_KND_CD = "txtDiscKndCd";
    public static final String PSG_TP_CD = "txtPsgTpCd";
    public static final String TOT_PSG_CNT = "txtTotPsgCnt";

    public void setCardNo(int i8, String str) {
        put(CARD_NO + i8, str);
    }

    public void setCompaCnt(int i8, String str) {
        put(COMPA_CNT + i8, str);
    }

    public void setDiscKndCd(int i8, String str) {
        put(DISC_KND_CD + i8, str);
    }

    public void setPsgTpCd(int i8, String str) {
        put(PSG_TP_CD + i8, str);
    }

    public void setTotPsgCnt(String str) {
        put(TOT_PSG_CNT, str);
    }
}
