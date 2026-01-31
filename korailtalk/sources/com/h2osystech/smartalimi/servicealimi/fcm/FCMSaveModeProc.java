package com.h2osystech.smartalimi.servicealimi.fcm;

import android.content.Context;
import android.os.Bundle;
import com.h2osystech.smartalimi.common.CommonUtil;
import com.h2osystech.smartalimi.common.Const;
import com.h2osystech.smartalimi.servicealimi.NotiManager;

/* loaded from: classes2.dex */
public class FCMSaveModeProc {
    public static final String TAG = "FCMSaveModeProc";

    public static boolean deviceSaveModeProc(Context context, Bundle bundle) {
        if (!CommonUtil.isSaveMode(context) || Const.GCM_CALLBACK_MESSAGE != 1) {
            return false;
        }
        NotiManager.execute_GCMERROR_Receiver(context, bundle, Const.GCM_CALLBACK_SAVEMODE);
        return true;
    }
}
