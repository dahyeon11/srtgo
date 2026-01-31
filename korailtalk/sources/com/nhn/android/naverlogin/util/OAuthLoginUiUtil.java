package com.nhn.android.naverlogin.util;

import C6.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class OAuthLoginUiUtil {
    public static Drawable getDrawableById(Context context, int i8) {
        try {
            return context.getDrawable(i8);
        } catch (Resources.NotFoundException unused) {
            a.d("OAuthLoginUiUtil", "drawable not found");
            return null;
        }
    }

    public static boolean isFixActivityPortrait(String str) {
        if (str != null) {
            try {
                if (str.length() > 4) {
                    String[] strArrSplit = str.split("\\.");
                    if (2 < strArrSplit.length) {
                        int iIntValue = Integer.valueOf(strArrSplit[0]).intValue();
                        int iIntValue2 = Integer.valueOf(strArrSplit[1]).intValue();
                        int iIntValue3 = Integer.valueOf(strArrSplit[2]).intValue();
                        if (4 < iIntValue) {
                            return false;
                        }
                        if (4 == iIntValue) {
                            if (1 < iIntValue2) {
                                return false;
                            }
                            if (1 == iIntValue2 && 2 < iIntValue3) {
                                return false;
                            }
                        }
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return true;
    }
}
