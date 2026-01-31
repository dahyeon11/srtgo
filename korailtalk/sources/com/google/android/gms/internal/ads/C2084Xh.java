package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Xh */
/* loaded from: classes2.dex */
public final class C2084Xh {

    /* renamed from: a */
    private MotionEvent f17277a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b */
    private MotionEvent f17278b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c */
    private final Context f17279c;

    /* renamed from: d */
    private final ScheduledExecutorService f17280d;

    /* renamed from: e */
    private final RunnableC4660vd0 f17281e;

    /* renamed from: f */
    private final C2166Zh f17282f;

    public C2084Xh(Context context, ScheduledExecutorService scheduledExecutorService, C2166Zh c2166Zh, RunnableC4660vd0 runnableC4660vd0) {
        this.f17279c = context;
        this.f17280d = scheduledExecutorService;
        this.f17282f = c2166Zh;
        this.f17281e = runnableC4660vd0;
    }

    public final com.google.common.util.concurrent.C zza() {
        return (AbstractC5136zn0) AbstractC1483In0.zzo(AbstractC5136zn0.zzu(AbstractC1483In0.zzh(null)), ((Long) AbstractC3986pi.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.f17280d);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f17277a.getEventTime()) {
            this.f17277a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f17278b.getEventTime()) {
                return;
            }
            this.f17278b = MotionEvent.obtain(motionEvent);
        }
    }
}
