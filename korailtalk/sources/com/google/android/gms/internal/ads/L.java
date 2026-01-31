package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes2.dex */
abstract class L {
    public static boolean zza(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i8 : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i8 == 1) {
                return true;
            }
        }
        return false;
    }
}
