package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2902gA implements InterfaceC2069Wz {

    /* renamed from: a, reason: collision with root package name */
    private final C2941gX f19310a;

    /* renamed from: b, reason: collision with root package name */
    com.google.common.util.concurrent.C f19311b;

    C2902gA(C2941gX c2941gX) {
        this.f19310a = c2941gX;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069Wz
    public final void zza(Map map) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkt)).booleanValue()) {
            this.f19311b = AbstractC1483In0.zzf(AbstractC5136zn0.zzu(this.f19310a.zza(true)), Throwable.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.fA
                @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                public final com.google.common.util.concurrent.C zza(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzku)).booleanValue()) {
                        G1.u.zzo().zzx(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
                    } else {
                        G1.u.zzo().zzv(th, "GetTopicsApiWithRecordObservationActionHandler");
                    }
                    return AbstractC1483In0.zzh(new androidx.privacysandbox.ads.adservices.topics.b(AbstractC2394bl0.zzm()));
                }
            }, AbstractC4805wt.zza);
        }
    }
}
