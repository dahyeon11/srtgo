package com.korail.talk.network.request.payment;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class PaymentMethod extends LinkedHashMap<String, String> {
    private final String USER_YN = "hiduserYn";
    private final String MB_CRD_NO = "hidMbCrdNo";
    private final String INRECMNS_GRID_CNT = "hidInrecmnsGridcnt";
    private final String STL_MNS_SQ_NO = "hidStlMnsSqno";
    private final String STL_MNS_CD = "hidStlMnsCd";
    private final String MNS_STL_AMT = "hidMnsStlAmt";
    private final String CRD_INP_WAY_CD = "hidCrdInpWayCd";
    private final String STL_CR_CRD_NO = "hidStlCrCrdNo";
    private final String VAN_PWD = "hidVanPwd";
    private final String CRD_VLID_TRM = "hidCrdVlidTrm";
    private final String ISMT_MNTH_NUM = "hidIsmtMnthNum";
    private final String ATHN_DV_CD = "hidAthnDvCd";
    private final String ATHN_VAL = "hidAthnVal";
    private final String PONT_DV_CD = "hidPontDvCd";
    private final String PONT_INP_DV_CD = "hidPontInpDvCd";
    private final String PONT_CRD_PWD = "hidPontCrdPwd";
    private final String SH_STL_CR_CRD_NO = "shStlCrCrdNo";
    private final String SH_CRD_VLID_TRM = "shCrdVlidTrm";
    private final String SPAY_DV_CD_1_1 = "spayDvCd_1_1";
    private final String ST_SPAY_GRID_CNT_1 = "stSpayGridcnt_1";
    private final String SPAY_CPHD_DAT_VAL_1_1 = "spayCphdDatVal_1_1";
    private final String DSCP_MG_NO = "hidDscpMgNo";
    private final String DFPY_DSCP_NO = "hidDfpyDscpNo";
    private final String DFPY_SRT_CD = "hidDfpySrtCd";

    public void setHidAthnDvCd(int i8, String str) {
        put("hidAthnDvCd" + i8, str);
    }

    public void setHidAthnVal(int i8, String str) {
        put("hidAthnVal" + i8, str);
    }

    public void setHidCrdInpWayCd(int i8, String str) {
        put("hidCrdInpWayCd" + i8, str);
    }

    public void setHidCrdVlidTrm(int i8, String str) {
        put("hidCrdVlidTrm" + i8, str);
    }

    public void setHidDfpyDscpNo(int i8, String str) {
        put("hidDfpyDscpNo" + i8, str);
    }

    public void setHidDscpMgNo(int i8, String str) {
        put("hidDscpMgNo" + i8, str);
    }

    public void setHidInrecmnsGridcnt(String str) {
        put("hidInrecmnsGridcnt", str);
    }

    public void setHidIsmtMnthNum(int i8, String str) {
        put("hidIsmtMnthNum" + i8, str);
    }

    public void setHidMbCrdNo(String str) {
        put("hidMbCrdNo", str);
    }

    public void setHidMnsStlAmt(int i8, String str) {
        put("hidMnsStlAmt" + i8, str);
    }

    public void setHidPontCrdPwd(int i8, String str) {
        put("hidPontCrdPwd" + i8, str);
    }

    public void setHidPontDvCd(int i8, String str) {
        put("hidPontDvCd" + i8, str);
    }

    public void setHidPontInpDvCd(int i8, String str) {
        put("hidPontInpDvCd" + i8, str);
    }

    public void setHidStlCrCrdNo(int i8, String str) {
        put("hidStlCrCrdNo" + i8, str);
    }

    public void setHidStlMnsCd(int i8, String str) {
        put("hidStlMnsCd" + i8, str);
    }

    public void setHidStlMnsSqno(int i8, String str) {
        put("hidStlMnsSqno" + i8, str);
    }

    public void setHidVanPwd(int i8, String str) {
        put("hidVanPwd" + i8, str);
    }

    public void setHidfpySrtCd(int i8, String str) {
        put("hidDfpySrtCd" + i8, str);
    }

    public void setHiduserYn(String str) {
        put("hiduserYn", str);
    }

    public void setShCrdVldTrm(int i8, String str) {
        put("shCrdVlidTrm" + i8, str);
    }

    public void setShStlCrCrdNo(int i8, String str) {
        put("shStlCrCrdNo" + i8, str);
    }

    public void setSpayCphdDatVal(String str) {
        put("spayCphdDatVal_1_1", str);
    }

    public void setSpayCphdDatVal2(String str) {
        put("spayCphdDatVal_2_1", str);
    }

    public void setSpayDvCd(String str) {
        put("spayDvCd_1_1", str);
    }

    public void setSpayDvCd2(String str) {
        put("spayDvCd_2_1", str);
    }

    public void setStSpayGridCnt(String str) {
        put("stSpayGridcnt_1", str);
    }

    public void setStSpayGridCnt2(String str) {
        put("stSpayGridcnt_2", str);
    }
}
