package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class LA0 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f14247a;

    /* renamed from: b, reason: collision with root package name */
    private Map f14248b;

    /* renamed from: c, reason: collision with root package name */
    private long f14249c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14250d;

    /* renamed from: e, reason: collision with root package name */
    private int f14251e;

    /* synthetic */ LA0(NB0 nb0, AbstractC3474lA0 abstractC3474lA0) {
        this.f14247a = nb0.zza;
        this.f14248b = nb0.zzd;
        this.f14249c = nb0.zze;
        this.f14250d = nb0.zzf;
        this.f14251e = nb0.zzg;
    }

    public final LA0 zza(int i8) {
        this.f14251e = 6;
        return this;
    }

    public final LA0 zzb(Map map) {
        this.f14248b = map;
        return this;
    }

    public final LA0 zzc(long j8) {
        this.f14249c = j8;
        return this;
    }

    public final LA0 zzd(Uri uri) {
        this.f14247a = uri;
        return this;
    }

    public final NB0 zze() {
        if (this.f14247a == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new NB0(this.f14247a, this.f14248b, this.f14249c, this.f14250d, this.f14251e);
    }

    public LA0() {
        this.f14248b = Collections.emptyMap();
        this.f14250d = -1L;
    }
}
