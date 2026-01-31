package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class LQ {

    /* renamed from: a, reason: collision with root package name */
    private final QQ f14285a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f14286b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f14287c;

    public LQ(QQ qq, Executor executor) {
        this.f14285a = qq;
        this.f14287c = qq.zza();
        this.f14286b = executor;
    }

    public final KQ zza() {
        KQ kq = new KQ(this);
        KQ.a(kq);
        return kq;
    }

    public final void zze() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlG)).booleanValue()) {
            KQ kqZza = zza();
            kqZza.zzb("action", "pecr");
            kqZza.zzf();
        }
    }
}
