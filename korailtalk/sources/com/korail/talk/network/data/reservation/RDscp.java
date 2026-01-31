package com.korail.talk.network.data.reservation;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class RDscp extends LinkedHashMap<String, String> {
    public static final String DCNT_KND_CD = "dcntKndCd_";
    public static final String DLAY_OGRK_RET_PWD = "dlayOgtkRetPwd_";
    public static final String DLAY_OGRK_SALE_DD = "dlayOgtkSaleDd_";
    public static final String DLAY_OGRK_SALE_SQNO = "dlayOgtkSaleSqno_";
    public static final String DLAY_OGRK_WCT_NO = "dlayOgtkWctNo_";
    public static final String DSCP_CNT = "dscpCnt_";
    public static final String DSCP_NO = "dscpNo_";

    public String getDscpCnt(int i8) {
        return get(DSCP_CNT + i8);
    }

    public void setDcntKndCd(int i8, int i9, String str) {
        put(DCNT_KND_CD + i8 + "_" + i9, str);
    }

    public void setDlayOgtkRetPwd(int i8, int i9, String str) {
        put(DLAY_OGRK_RET_PWD + i8 + "_" + i9, str);
    }

    public void setDlayOgtkSaleDd(int i8, int i9, String str) {
        put(DLAY_OGRK_SALE_DD + i8 + "_" + i9, str);
    }

    public void setDlayOgtkSaleSqno(int i8, int i9, String str) {
        put(DLAY_OGRK_SALE_SQNO + i8 + "_" + i9, str);
    }

    public void setDlayOgtkWctNo(int i8, int i9, String str) {
        put(DLAY_OGRK_WCT_NO + i8 + "_" + i9, str);
    }

    public void setDscpCnt(int i8, String str) {
        put(DSCP_CNT + i8, str);
    }

    public void setDscpNo(int i8, int i9, String str) {
        put(DSCP_NO + i8 + "_" + i9, str);
    }
}
