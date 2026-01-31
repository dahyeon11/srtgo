package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xU, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4875xU {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f23722a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f23723b;

    /* renamed from: c, reason: collision with root package name */
    private final PU f23724c;

    C4875xU(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un02, PU pu) {
        this.f23722a = interfaceExecutorServiceC1974Un0;
        this.f23723b = interfaceExecutorServiceC1974Un02;
        this.f23724c = pu;
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(C1241Cq c1241Cq) {
        return this.f23724c.zza(c1241Cq, ((Long) H1.C.zzc().zza(AbstractC4439th.zzlC)).longValue());
    }

    public final com.google.common.util.concurrent.C zzb(final C1241Cq c1241Cq) {
        String str = c1241Cq.zzb;
        G1.u.zzp();
        return AbstractC1483In0.zzn(AbstractC1483In0.zzf(AbstractC5136zn0.zzu(K1.K0.zzC(str) ? AbstractC1483In0.zzg(new YT(1, "Ads signal service force local")) : AbstractC1483In0.zzf(AbstractC1483In0.zzk(new InterfaceC3769nn0() { // from class: com.google.android.gms.internal.ads.tU
            @Override // com.google.android.gms.internal.ads.InterfaceC3769nn0
            public final com.google.common.util.concurrent.C zza() {
                return this.zza.a(c1241Cq);
            }
        }, this.f23722a), ExecutionException.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.uU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return AbstractC1483In0.zzg(cause);
            }
        }, this.f23723b)), YT.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.vU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzh(null);
            }
        }, this.f23723b), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.wU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return AbstractC1483In0.zzh(jSONObject);
                }
                try {
                    G1.u.zzp();
                    jSONObject = new JSONObject(K1.K0.zzN(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e8) {
                    G1.u.zzo().zzw(e8, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return AbstractC1483In0.zzh(jSONObject);
            }
        }, this.f23723b);
    }
}
