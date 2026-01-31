package com.google.android.gms.ads.internal.offline.buffering;

import H1.C0591z;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC1686Nn;
import com.google.android.gms.internal.ads.InterfaceC1568Kp;

/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1568Kp f11747g;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f11747g = C0591z.zza().zzm(context, new BinderC1686Nn());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.f11747g.zzh();
            return ListenableWorker.a.success();
        } catch (RemoteException unused) {
            return ListenableWorker.a.failure();
        }
    }
}
