package com.nhn.android.naverlogin.util;

/* loaded from: classes.dex */
public class DeviceDisplayInfo {
    public static boolean isHdpi(int i8) {
        return !isMdpi(i8) && i8 <= 240;
    }

    public static boolean isMdpi(int i8) {
        return i8 <= 160;
    }

    public static boolean isXhdpi(int i8) {
        return (isMdpi(i8) || isHdpi(i8)) ? false : true;
    }
}
