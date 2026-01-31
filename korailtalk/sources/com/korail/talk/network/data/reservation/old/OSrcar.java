package com.korail.talk.network.data.reservation.old;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class OSrcar extends LinkedHashMap<String, String> {
    public static final String SEAT_NO = "txtSeatNo";
    public static final String SEAT_NO1 = "txtSeatNo1_";
    public static final String SRCAR_CNT = "txtSrcarCnt";
    public static final String SRCAR_CNT1 = "txtSrcarCnt1";
    public static final String SRCAR_NO = "txtSrcarNo";
    public static final String SRCAR_NO1 = "txtSrcarNo1_";

    public void setSeatNo(int i8, int i9, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(i8 == 1 ? "txtSeatNo" : SEAT_NO1);
        sb.append(i9);
        put(sb.toString(), str);
    }

    public void setSrcarCnt(int i8, String str) {
        put(i8 == 1 ? "txtSrcarCnt" : SRCAR_CNT1, str);
    }

    public void setSrcarNo(int i8, int i9, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(i8 == 1 ? "txtSrcarNo" : SRCAR_NO1);
        sb.append(i9);
        put(sb.toString(), str);
    }
}
