package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.Gb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1377Gb0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f13174b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13175c;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList f13173a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private final C2949gc0 f13176d = new C2949gc0();

    public C1377Gb0(int i8, int i9) {
        this.f13174b = i8;
        this.f13175c = i9;
    }

    private final void a() {
        while (!this.f13173a.isEmpty()) {
            if (G1.u.zzB().currentTimeMillis() - ((C1786Qb0) this.f13173a.getFirst()).zzd < this.f13175c) {
                return;
            }
            this.f13176d.zzg();
            this.f13173a.remove();
        }
    }

    public final int zza() {
        return this.f13176d.zza();
    }

    public final int zzb() {
        a();
        return this.f13173a.size();
    }

    public final long zzc() {
        return this.f13176d.zzb();
    }

    public final long zzd() {
        return this.f13176d.zzc();
    }

    public final C1786Qb0 zze() {
        this.f13176d.zzf();
        a();
        if (this.f13173a.isEmpty()) {
            return null;
        }
        C1786Qb0 c1786Qb0 = (C1786Qb0) this.f13173a.remove();
        if (c1786Qb0 != null) {
            this.f13176d.zzh();
        }
        return c1786Qb0;
    }

    public final C2719ec0 zzf() {
        return this.f13176d.zzd();
    }

    public final String zzg() {
        return this.f13176d.zze();
    }

    public final boolean zzh(C1786Qb0 c1786Qb0) {
        this.f13176d.zzf();
        a();
        if (this.f13173a.size() == this.f13174b) {
            return false;
        }
        this.f13173a.add(c1786Qb0);
        return true;
    }
}
