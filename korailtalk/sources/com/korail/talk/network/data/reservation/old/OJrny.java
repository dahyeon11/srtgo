package com.korail.talk.network.data.reservation.old;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class OJrny extends LinkedHashMap<String, String> {
    public static final String ARV_DT = "arvDt_";
    public static final String ARV_RS_STN_CD = "txtArvRsStnCd";
    public static final String ARV_STN_CONS_ORDR = "txtArvStnConsOrdr";
    public static final String ARV_STN_RUN_ORDR = "txtArvStnRunOrdr";
    public static final String ARV_TM = "arvTm_";
    public static final String CHG_FLG = "txtChgFlg";
    public static final String DPT_DT = "txtDptDt";
    public static final String DPT_RS_STN_CD = "txtDptRsStnCd";
    public static final String DPT_STN_CONS_ORDR = "txtDptStnConsOrdr";
    public static final String DPT_STN_RUN_ORDR = "txtDptStnRunOrdr";
    public static final String DPT_TM = "txtDptTm";
    public static final String JRNY_CNT = "txtJrnyCnt";
    public static final String JRNY_SQ_NO = "txtJrnySqno";
    public static final String JRNY_TP_CD = "txtJrnyTpCd";
    public static final String RUN_DT = "txtRunDt";
    public static final String TRN_CLSF_CD = "txtTrnClsfCd";
    public static final String TRN_GP_CD = "txtTrnGpCd";
    public static final String TRN_NO = "txtTrnNo";
    public static final String TXT_SEAT_NO = "txtSeatNo";
    public static final String TXT_SRCAR_CNT = "txtSrcarCnt";
    public static final String TXT_SRCAR_NO = "txtSrcarNo";

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

    public void setSeatNo(int i8, String str) {
        put("txtSeatNo" + i8, str);
    }

    public void setSrcarCnt(String str) {
        put("txtSrcarCnt", str);
    }

    public void setSrcarNo(int i8, String str) {
        put("txtSrcarNo" + i8, str);
    }

    public void setTrnClsfCd(int i8, String str) {
        put(TRN_CLSF_CD + i8, str);
    }

    public void setTrnGpCd(int i8, String str) {
        put(TRN_GP_CD + i8, str);
    }

    public void setTrnNo(int i8, String str) {
        put(TRN_NO + i8, str);
    }
}
