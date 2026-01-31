package com.korail.talk.network.data.reservation;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class ROrtg extends LinkedHashMap<String, String> {
    public static final String CMT_RDV_CD = "cmtrDvCd_";
    public static final String OGTK_RET_PWD = "ogtkRetPwd_";
    public static final String OGTK_SALE_DD = "ogtkSaleDd_";
    public static final String OGTK_SALE_SQ_NO = "ogtkSaleSqno_";
    public static final String OGTK_SALE_WCT_NO = "ogtkSaleWctNo_";
    public static final String ORTG_CNT = "ortgCnt";
    public static final String RET_NO_MN_INP_FLG = "retNoMnlInpFlg_";

    public void setCmtrDvCd(int i8, String str) {
        put(CMT_RDV_CD + i8, str);
    }

    public void setOgtkRetPwd(int i8, String str) {
        put(OGTK_RET_PWD + i8, str);
    }

    public void setOgtkSaleDd(int i8, String str) {
        put(OGTK_SALE_DD + i8, str);
    }

    public void setOgtkSaleSqno(int i8, String str) {
        put(OGTK_SALE_SQ_NO + i8, str);
    }

    public void setOgtkSaleWctNo(int i8, String str) {
        put(OGTK_SALE_WCT_NO + i8, str);
    }

    public void setOrtgCnt(String str) {
        put(ORTG_CNT, str);
    }

    public void setRetNoMnlInpFlg(int i8, String str) {
        put(RET_NO_MN_INP_FLG + i8, str);
    }
}
