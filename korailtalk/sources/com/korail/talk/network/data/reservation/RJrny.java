package com.korail.talk.network.data.reservation;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class RJrny extends LinkedHashMap<String, String> {
    public static final String ARV_DT = "arvDt_";
    public static final String ARV_RS_STN_CD = "arvRsStnCd_";
    public static final String ARV_STN_CONS_ORDR = "arvStnConsOrdr_";
    public static final String ARV_STN_RUN_ORDR = "arvStnRunOrdr_";
    public static final String ARV_TM = "arvTm_";
    public static final String CHG_FLG = "chgFlg_";
    public static final String DPT_DT = "dptDt_";
    public static final String DPT_RS_STN_CD = "dptRsStnCd_";
    public static final String DPT_STN_CONS_ORDR = "dptStnConsOrdr_";
    public static final String DPT_STN_RUN_ORDR = "dptStnRunOrdr_";
    public static final String DPT_TM = "dptTm_";
    public static final String JRNY_CNT = "jrnyCnt";
    public static final String JRNY_SQ_NO = "jrnySqno_";
    public static final String JRNY_TP_CD = "jrnyTpCd_";
    public static final String RUN_DT = "runDt_";
    public static final String STLB_TRN_CLSF_CD = "stlbTrnClsfCd_";
    public static final String TRN_GP_CD = "trnGpCd_";
    public static final String TRN_NO = "trnNo_";

    public void setArvDt(int i8, String str) {
        put("arvDt_" + i8, str);
    }

    public void setArvRsStnCd(int i8, String str) {
        put(ARV_RS_STN_CD + i8, str);
    }

    public void setArvStnConsOrdr(int i8, String str) {
        put(ARV_STN_CONS_ORDR + i8, str);
    }

    public void setArvStnRunOrdr(int i8, String str) {
        put(ARV_STN_RUN_ORDR + i8, str);
    }

    public void setArvTm(int i8, String str) {
        put("arvTm_" + i8, str);
    }

    public void setChgFlg(int i8, String str) {
        put(CHG_FLG + i8, str);
    }

    public void setDptDt(int i8, String str) {
        put(DPT_DT + i8, str);
    }

    public void setDptRsStnCd(int i8, String str) {
        put(DPT_RS_STN_CD + i8, str);
    }

    public void setDptStnConsOrdr(int i8, String str) {
        put(DPT_STN_CONS_ORDR + i8, str);
    }

    public void setDptStnRunOrdr(int i8, String str) {
        put(DPT_STN_RUN_ORDR + i8, str);
    }

    public void setDptTm(int i8, String str) {
        put(DPT_TM + i8, str);
    }

    public void setJrnyCnt(String str) {
        put(JRNY_CNT, str);
    }

    public void setJrnySqNo(int i8, String str) {
        put(JRNY_SQ_NO + i8, str);
    }

    public void setJrnyTpCd(int i8, String str) {
        put(JRNY_TP_CD + i8, str);
    }

    public void setRunDt(int i8, String str) {
        put(RUN_DT + i8, str);
    }

    public void setStlbTrnClsfCd(int i8, String str) {
        put(STLB_TRN_CLSF_CD + i8, str);
    }

    public void setTrnGpCd(int i8, String str) {
        put(TRN_GP_CD + i8, str);
    }

    public void setTrnNo(int i8, String str) {
        put(TRN_NO + i8, str);
    }
}
