package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Hh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1429Hh {

    /* renamed from: a, reason: collision with root package name */
    private final Map f13348a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C1511Jh f13349b;

    public C1429Hh(C1511Jh c1511Jh) {
        this.f13349b = c1511Jh;
    }

    public final C1511Jh zza() {
        return this.f13349b;
    }

    public final void zzb(String str, C1388Gh c1388Gh) {
        this.f13348a.put(str, c1388Gh);
    }

    public final void zzc(String str, String str2, long j8) {
        C1388Gh c1388Gh = (C1388Gh) this.f13348a.get(str2);
        String[] strArr = {str};
        if (c1388Gh != null) {
            this.f13349b.zze(c1388Gh, j8, strArr);
        }
        this.f13348a.put(str, new C1388Gh(j8, null, null));
    }
}
