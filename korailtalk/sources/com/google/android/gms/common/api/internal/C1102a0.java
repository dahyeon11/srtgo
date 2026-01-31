package com.google.android.gms.common.api.internal;

import I2.AbstractC0608l;
import I2.InterfaceC0602f;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import f2.C5392b;
import g2.C5540b;
import h2.C5585b;
import i2.AbstractC5670c;
import i2.C5672e;
import i2.C5680m;
import i2.C5684q;
import i2.C5685r;
import o2.AbstractC6030b;

/* renamed from: com.google.android.gms.common.api.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1102a0 implements InterfaceC0602f {

    /* renamed from: a, reason: collision with root package name */
    private final C1105c f11982a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11983b;

    /* renamed from: c, reason: collision with root package name */
    private final C5585b f11984c;

    /* renamed from: d, reason: collision with root package name */
    private final long f11985d;

    /* renamed from: e, reason: collision with root package name */
    private final long f11986e;

    C1102a0(C1105c c1105c, int i8, C5585b c5585b, long j8, long j9, String str, String str2) {
        this.f11982a = c1105c;
        this.f11983b = i8;
        this.f11984c = c5585b;
        this.f11985d = j8;
        this.f11986e = j9;
    }

    static C1102a0 a(C1105c c1105c, int i8, C5585b c5585b) {
        boolean methodTimingTelemetryEnabled;
        if (!c1105c.c()) {
            return null;
        }
        C5685r config = C5684q.getInstance().getConfig();
        if (config == null) {
            methodTimingTelemetryEnabled = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            methodTimingTelemetryEnabled = config.getMethodTimingTelemetryEnabled();
            U uS = c1105c.s(c5585b);
            if (uS != null) {
                if (!(uS.zaf() instanceof AbstractC5670c)) {
                    return null;
                }
                AbstractC5670c abstractC5670c = (AbstractC5670c) uS.zaf();
                if (abstractC5670c.hasConnectionInfo() && !abstractC5670c.isConnecting()) {
                    C5672e c5672eB = b(uS, abstractC5670c, i8);
                    if (c5672eB == null) {
                        return null;
                    }
                    uS.v();
                    methodTimingTelemetryEnabled = c5672eB.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new C1102a0(c1105c, i8, c5585b, methodTimingTelemetryEnabled ? System.currentTimeMillis() : 0L, methodTimingTelemetryEnabled ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static C5672e b(U u8, AbstractC5670c abstractC5670c, int i8) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        C5672e telemetryConfiguration = abstractC5670c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !AbstractC6030b.contains(methodInvocationMethodKeyAllowlist, i8) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !AbstractC6030b.contains(methodInvocationMethodKeyDisallowlist, i8))) || u8.n() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // I2.InterfaceC0602f
    public final void onComplete(AbstractC0608l abstractC0608l) {
        U uS;
        int version;
        int i8;
        int i9;
        int errorCode;
        long j8;
        long j9;
        int iElapsedRealtime;
        if (this.f11982a.c()) {
            C5685r config = C5684q.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (uS = this.f11982a.s(this.f11984c)) != null && (uS.zaf() instanceof AbstractC5670c)) {
                AbstractC5670c abstractC5670c = (AbstractC5670c) uS.zaf();
                int i10 = 0;
                boolean methodTimingTelemetryEnabled = this.f11985d > 0;
                int gCoreServiceId = abstractC5670c.getGCoreServiceId();
                if (config != null) {
                    methodTimingTelemetryEnabled &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    version = config.getVersion();
                    if (abstractC5670c.hasConnectionInfo() && !abstractC5670c.isConnecting()) {
                        C5672e c5672eB = b(uS, abstractC5670c, this.f11983b);
                        if (c5672eB == null) {
                            return;
                        }
                        boolean z8 = c5672eB.getMethodTimingTelemetryEnabled() && this.f11985d > 0;
                        maxMethodInvocationsInBatch = c5672eB.getMaxMethodInvocationsLogged();
                        methodTimingTelemetryEnabled = z8;
                    }
                    i9 = batchPeriodMillis;
                    i8 = maxMethodInvocationsInBatch;
                } else {
                    version = 0;
                    i8 = 100;
                    i9 = 5000;
                }
                C1105c c1105c = this.f11982a;
                if (abstractC0608l.isSuccessful()) {
                    errorCode = 0;
                } else {
                    if (abstractC0608l.isCanceled()) {
                        i10 = 100;
                    } else {
                        Exception exception = abstractC0608l.getException();
                        if (exception instanceof C5540b) {
                            Status status = ((C5540b) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            C5392b connectionResult = status.getConnectionResult();
                            errorCode = connectionResult == null ? -1 : connectionResult.getErrorCode();
                            i10 = statusCode;
                        } else {
                            i10 = 101;
                        }
                    }
                    errorCode = -1;
                }
                if (methodTimingTelemetryEnabled) {
                    long j10 = this.f11985d;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f11986e);
                    j8 = j10;
                    j9 = jCurrentTimeMillis;
                } else {
                    j8 = 0;
                    j9 = 0;
                    iElapsedRealtime = -1;
                }
                c1105c.y(new C5680m(this.f11983b, i10, errorCode, j8, j9, null, null, gCoreServiceId, iElapsedRealtime), version, i9, i8);
            }
        }
    }
}
