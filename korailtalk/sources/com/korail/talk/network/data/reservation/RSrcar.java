package com.korail.talk.network.data.reservation;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class RSrcar extends LinkedHashMap<String, String> {
    public static final String SCAR_CNT = "scarCnt_";
    public static final String SCAR_NO = "scarNo_";
    public static final String SEAT_NO = "seatNo_";
    public static final String SRCAR_CNT = "srcarCnt_";

    public void setScarCnt(int i8, String str) {
        put(SCAR_CNT + i8, str);
    }

    public void setSeatNo(int i8, int i9, String str) {
        put(SEAT_NO + i8 + "_" + i9, str);
    }

    public void setSrcarCnt(int i8, String str) {
        put(SRCAR_CNT + i8, str);
    }

    public void setSrcarNo(int i8, int i9, String str) {
        put(SCAR_NO + i8 + "_" + i9, str);
    }
}
