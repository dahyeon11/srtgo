package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3325jt0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f20323a;

    /* renamed from: b, reason: collision with root package name */
    private final List f20324b;

    /* renamed from: c, reason: collision with root package name */
    private final C3098ht0 f20325c;

    /* renamed from: d, reason: collision with root package name */
    private final Class f20326d;

    /* renamed from: e, reason: collision with root package name */
    private final Mu0 f20327e;

    /* synthetic */ C3325jt0(Map map, List list, C3098ht0 c3098ht0, Mu0 mu0, Class cls, AbstractC3211it0 abstractC3211it0) {
        this.f20323a = map;
        this.f20324b = list;
        this.f20325c = c3098ht0;
        this.f20326d = cls;
        this.f20327e = mu0;
    }

    public static C2868ft0 zza(Class cls) {
        return new C2868ft0(cls, null);
    }

    public final C3098ht0 zzb() {
        return this.f20325c;
    }

    public final Mu0 zzc() {
        return this.f20327e;
    }

    public final Class zzd() {
        return this.f20326d;
    }

    public final Collection zze() {
        return this.f20323a.values();
    }

    public final List zzf(byte[] bArr) {
        List list = (List) this.f20323a.get(Mx0.zzb(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean zzg() {
        return !this.f20327e.zza().isEmpty();
    }
}
