package com.korail.talk.network.data.reservation;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class RSeat extends LinkedHashMap<String, String> {
    public static final String DIR_SEAT_ATT_CD = "dirSeatAttCd_";
    public static final String ETC_SEAT_ATT_CD = "etcSeatAttCd_";
    public static final String LOC_SEAT_ATT_CD = "locSeatAttCd_";
    public static final String ROOM_CLSF_CD = "roomClsfCd_";
    public static final String RQ_SEAT_ATT_CD = "rqSeatAttCd_";
    public static final String SEAT_CNT = "seatCnt_";
    public static final String SEAT_PSRM_CL_CD = "seatPsrmClCd_";
    public static final String SMK_SEAT_ATT_CD = "smkSeatAttCd_";

    public void setDirSeatAttCd(int i8, int i9, String str) {
        put(DIR_SEAT_ATT_CD + i8 + "_" + i9, str);
    }

    public void setEtcSeatAttCd(int i8, int i9, String str) {
        put(ETC_SEAT_ATT_CD + i8 + "_" + i9, str);
    }

    public void setLocSeatAttCd(int i8, int i9, String str) {
        put(LOC_SEAT_ATT_CD + i8 + "_" + i9, str);
    }

    public void setRoomClsfCd(int i8, int i9, String str) {
        put(ROOM_CLSF_CD + i8 + "_" + i9, str);
    }

    public void setRqSeatAttCd(int i8, int i9, String str) {
        put(RQ_SEAT_ATT_CD + i8 + "_" + i9, str);
    }

    public void setSeatCnt(int i8, String str) {
        put(SEAT_CNT + i8, str);
    }

    public void setSeatPsrmClCd(int i8, int i9, String str) {
        put(SEAT_PSRM_CL_CD + i8 + "_" + i9, str);
    }

    public void setSmkSeatAttCd(int i8, int i9, String str) {
        put(SMK_SEAT_ATT_CD + i8 + "_" + i9, str);
    }
}
