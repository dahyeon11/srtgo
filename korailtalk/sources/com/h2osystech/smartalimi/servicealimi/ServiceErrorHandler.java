package com.h2osystech.smartalimi.servicealimi;

import Q7.X;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import com.h2osystech.smartalimi.common.LogFile;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* loaded from: classes2.dex */
public class ServiceErrorHandler implements Thread.UncaughtExceptionHandler {
    final String LINE_SEPARATOR = X.LF;
    final String TAG = "ServiceErrorHandler";
    Context context;

    public ServiceErrorHandler(Context context) {
        this.context = context;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        LogFile.log("ServiceErrorHandler", 1, "************ CAUSE OF ERROR ************\n\n" + stringWriter.toString() + "\n************ DEVICE INFORMATION ***********\nBrand: " + Build.BRAND + X.LF + "Device: " + Build.DEVICE + X.LF + "Model: " + Build.MODEL + X.LF + "Id: " + Build.ID + X.LF + "Product: " + Build.PRODUCT + X.LF + "\n************ FIRMWARE ************\nSDK: " + Build.VERSION.SDK_INT + X.LF + "Release: " + Build.VERSION.RELEASE + X.LF + "Incremental: " + Build.VERSION.INCREMENTAL + X.LF);
        this.context.startService(new Intent(this.context, (Class<?>) MessageManager.class));
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
