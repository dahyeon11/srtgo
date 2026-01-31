package com.h2osystech.smartalimi.servicealimi;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.r;
import com.google.firebase.messaging.z;
import com.h2osystech.smartalimi.aidllib.MSGVo;
import com.h2osystech.smartalimi.common.CommonUtil;
import com.h2osystech.smartalimi.common.Const;
import com.h2osystech.smartalimi.common.LogFile;

/* loaded from: classes2.dex */
public class NotiManager {
    public static String NOTIFICATION_UNISEQ = null;
    public static final String TAG = "NotiManager";
    public static final String permissionValue = ".BroadcastPermission";

    public static void executeReceiver(Context context, String str, int i8, MSGVo mSGVo, int i9) {
        Intent intent = new Intent(context.getPackageName() + ".NewMsgReceiver");
        LogFile.log(TAG, 4, "executeReceiver " + context.getPackageName());
        intent.putExtra(r.CATEGORY_MESSAGE, mSGVo);
        intent.putExtra("notiType", i8);
        intent.putExtra("uniseq", str);
        intent.putExtra("badge", i9);
        StringBuilder sb = new StringBuilder();
        sb.append("in executeReceiver Data");
        sb.append(i9);
        if (Build.VERSION.SDK_INT < 26) {
            context.sendBroadcast(intent);
            return;
        }
        context.sendBroadcast(intent, context.getPackageName() + permissionValue);
    }

    public static void execute_FCMERROR_Receiver(Context context, z zVar, int i8) {
        Intent intent = new Intent(context.getPackageName() + ".GCM_Error_Receiver");
        LogFile.log(TAG, 4, "execute_GCMERROR_Receiver EX Flag" + context.getPackageName());
        if (CommonUtil.isSaveMode(context)) {
            intent.putExtra("errorNo", Const.GCM_CALLBACK_SAVEMODE);
        } else {
            intent.putExtra("errorNo", i8);
        }
        intent.putExtra("gcm", zVar.getData().toString());
        if (Build.VERSION.SDK_INT < 26) {
            context.sendBroadcast(intent);
            return;
        }
        context.sendBroadcast(intent, context.getPackageName() + permissionValue);
    }

    public static void execute_GCMERROR_Receiver(Context context, Bundle bundle, int i8) {
        Intent intent = new Intent(context.getPackageName() + ".GCM_Error_Receiver");
        LogFile.log(TAG, 4, "execute_GCMERROR_Receiver EX Flag" + context.getPackageName());
        if (CommonUtil.isSaveMode(context)) {
            intent.putExtra("errorNo", Const.GCM_CALLBACK_SAVEMODE);
        } else {
            intent.putExtra("errorNo", i8);
        }
        intent.putExtra("gcm", bundle);
        if (Build.VERSION.SDK_INT < 26) {
            context.sendBroadcast(intent);
            return;
        }
        context.sendBroadcast(intent, context.getPackageName() + permissionValue);
    }

    public static void notiPushData(Context context, String str) {
        Intent intent = new Intent(context.getPackageName() + ".NewMsgReceiver");
        intent.putExtra("MessageStatus", 3);
        intent.putExtra("Msg", str);
        if (Build.VERSION.SDK_INT < 26) {
            context.sendBroadcast(intent);
            return;
        }
        context.sendBroadcast(intent, context.getPackageName() + permissionValue);
    }

    public static void notiPushData(Context context, MSGVo mSGVo) {
        int iIntValue;
        try {
            iIntValue = Integer.valueOf(mSGVo.getNotiType().trim()).intValue();
        } catch (Exception unused) {
            iIntValue = -1;
        }
        executeReceiver(context, mSGVo.getUniqSeq(), iIntValue, mSGVo);
    }

    public static void notiPushData(Context context, MSGVo mSGVo, String str, int i8) {
        executeReceiver(context, mSGVo.getUniqSeq(), Integer.valueOf(mSGVo.getNotiType().trim()).intValue(), mSGVo, str, i8);
    }

    public static void executeReceiver(Context context, String str, int i8, MSGVo mSGVo) {
        Intent intent = new Intent(context.getPackageName() + ".NewMsgReceiver");
        LogFile.log(TAG, 4, "executeReceiver " + context.getPackageName());
        intent.putExtra(r.CATEGORY_MESSAGE, mSGVo);
        intent.putExtra("notiType", i8);
        intent.putExtra("uniseq", str);
        if (Build.VERSION.SDK_INT >= 26) {
            context.sendBroadcast(intent, context.getPackageName() + permissionValue);
            return;
        }
        context.sendBroadcast(intent);
    }

    public static void notiPushData(Context context, MSGVo mSGVo, int i8) {
        int iIntValue;
        try {
            iIntValue = Integer.valueOf(mSGVo.getNotiType().trim()).intValue();
        } catch (Exception unused) {
            iIntValue = -1;
        }
        executeReceiver(context, mSGVo.getUniqSeq(), iIntValue, mSGVo, i8);
    }

    public static void notiPushData(Context context, MSGVo mSGVo, String str) {
        executeReceiver(context, mSGVo.getUniqSeq(), Integer.valueOf(mSGVo.getNotiType().trim()).intValue(), mSGVo, str);
    }

    public static void executeReceiver(Context context, String str, int i8, MSGVo mSGVo, String str2, int i9) {
        Intent intent = new Intent(context.getPackageName() + ".NewMsgReceiver");
        LogFile.log(TAG, 4, "executeReceiver EX Flag" + context.getPackageName());
        intent.putExtra(r.CATEGORY_MESSAGE, mSGVo);
        intent.putExtra("notiType", i8);
        intent.putExtra("uniseq", str);
        intent.putExtra("getNewMsgStartEnd", str2);
        intent.putExtra("badge", i9);
        if (Build.VERSION.SDK_INT >= 26) {
            context.sendBroadcast(intent, context.getPackageName() + permissionValue);
            return;
        }
        context.sendBroadcast(intent);
    }

    public static void executeReceiver(Context context, String str, int i8, MSGVo mSGVo, String str2) {
        Intent intent = new Intent(context.getPackageName() + ".NewMsgReceiver");
        LogFile.log(TAG, 4, "executeReceiver EX Flag" + context.getPackageName());
        intent.putExtra(r.CATEGORY_MESSAGE, mSGVo);
        intent.putExtra("notiType", i8);
        intent.putExtra("uniseq", str);
        intent.putExtra("getNewMsgStartEnd", str2);
        if (Build.VERSION.SDK_INT >= 26) {
            context.sendBroadcast(intent, context.getPackageName() + permissionValue);
            return;
        }
        context.sendBroadcast(intent);
    }
}
