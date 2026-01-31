package com.google.android.gms.ads.internal.offline.buffering;

import H1.C0591z;
import I1.a;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC1686Nn;
import com.google.android.gms.internal.ads.InterfaceC1568Kp;
import com.kakao.sdk.template.Constants;
import r2.b;

/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1568Kp f11746g;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f11746g = C0591z.zza().zzm(context, new BinderC1686Nn());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.f11746g.zzj(b.wrap(getApplicationContext()), new a(getInputData().getString("uri"), getInputData().getString("gws_query_id"), getInputData().getString(Constants.IMAGE_URL)));
            return ListenableWorker.a.success();
        } catch (RemoteException unused) {
            return ListenableWorker.a.failure();
        }
    }
}
