package com.h2osystech.smartalimi.servicealimimodule;

import android.content.Context;
import android.content.SharedPreferences;
import com.h2osystech.smartalimi.common.AES256test;

/* loaded from: classes2.dex */
public class SharedData {
    static final String TAG = "SharedData";

    public static void clear(Context context, String str) {
        context.getSharedPreferences(str, 0).edit().clear();
    }

    public static String decText(String str) {
        String strDecryptBase64;
        StringBuilder sb = new StringBuilder();
        sb.append("[decText] encText:");
        sb.append(str);
        try {
            strDecryptBase64 = AES256test.decryptBase64(str);
        } catch (Exception e8) {
            e8.printStackTrace();
            strDecryptBase64 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[decText] decText:");
        sb2.append(strDecryptBase64);
        return strDecryptBase64;
    }

    public static String encText(String str) {
        String strEncryptBase64;
        StringBuilder sb = new StringBuilder();
        sb.append("[encText] text:");
        sb.append(str);
        try {
            strEncryptBase64 = AES256test.encryptBase64(str);
        } catch (Exception e8) {
            e8.printStackTrace();
            strEncryptBase64 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[encText] encText:");
        sb2.append(strEncryptBase64);
        return strEncryptBase64;
    }

    public static boolean getSharedBool(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).getBoolean(str2, false);
    }

    public static String getSharedData(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).getString(str2, "");
    }

    public static int getSharedNoData(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).getInt(str2, 0);
    }

    public static void setSharedBool(Context context, String str, String str2, boolean z8) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putBoolean(str2, z8);
        editorEdit.commit();
    }

    public static void setSharedData(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }

    public static void setSharedNoData(Context context, String str, String str2, int i8) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putInt(str2, i8);
        editorEdit.commit();
    }
}
