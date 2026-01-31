package com.korail.talk.network.data.reservation.old;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import z4.t;

/* loaded from: classes.dex */
public class OSeat extends LinkedHashMap<String, String> {
    public static final String PSRM_CL_CD = "txtPsrmClCd";
    public static final String SEAT_ATT_CD1 = "txtSeatAttCd1";
    public static final String SEAT_ATT_CD2 = "txtSeatAttCd2";
    public static final String SEAT_ATT_CD3 = "txtSeatAttCd3";
    public static final String SEAT_ATT_CD4 = "txtSeatAttCd4";
    public static final String SEAT_ATT_CD4_1 = "txtSeatAttCd4_1";
    public static final String SEAT_ATT_CD5 = "txtSeatAttCd5";

    public void setPsrmClCd(int i8, String str) {
        put(PSRM_CL_CD + i8, str);
    }

    public void setSeatAttCd1(String str) {
        put(SEAT_ATT_CD1, str);
    }

    public void setSeatAttCd2(String str) {
        put(SEAT_ATT_CD2, str);
    }

    public void setSeatAttCd3(String str) {
        put(SEAT_ATT_CD3, str);
    }

    public void setSeatAttCd4(int i8, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        t.d("sqNo : " + i8);
        put(i8 == 1 ? SEAT_ATT_CD4 : SEAT_ATT_CD4_1, str);
    }

    public void setSeatAttCd5(String str) {
        put(SEAT_ATT_CD5, str);
    }
}
