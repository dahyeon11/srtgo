package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4704vz0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Iy0 f23387c = Iy0.f13552c;

    /* renamed from: a, reason: collision with root package name */
    protected volatile Pz0 f23388a;

    /* renamed from: b, reason: collision with root package name */
    private volatile AbstractC3677my0 f23389b;

    protected final void a(Pz0 pz0) {
        if (this.f23388a != null) {
            return;
        }
        synchronized (this) {
            if (this.f23388a != null) {
                return;
            }
            try {
                this.f23388a = pz0;
                this.f23389b = AbstractC3677my0.zzb;
            } catch (C4021pz0 unused) {
                this.f23388a = pz0;
                this.f23389b = AbstractC3677my0.zzb;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4704vz0)) {
            return false;
        }
        C4704vz0 c4704vz0 = (C4704vz0) obj;
        Pz0 pz0 = this.f23388a;
        Pz0 pz02 = c4704vz0.f23388a;
        if (pz0 == null && pz02 == null) {
            return zzb().equals(c4704vz0.zzb());
        }
        if (pz0 != null && pz02 != null) {
            return pz0.equals(pz02);
        }
        if (pz0 != null) {
            c4704vz0.a(pz0.zzbt());
            return pz0.equals(c4704vz0.f23388a);
        }
        a(pz02.zzbt());
        return this.f23388a.equals(pz02);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.f23389b != null) {
            return ((C2993gy0) this.f23389b).f19725d.length;
        }
        if (this.f23388a != null) {
            return this.f23388a.zzaY();
        }
        return 0;
    }

    public final AbstractC3677my0 zzb() {
        if (this.f23389b != null) {
            return this.f23389b;
        }
        synchronized (this) {
            try {
                if (this.f23389b != null) {
                    return this.f23389b;
                }
                if (this.f23388a == null) {
                    this.f23389b = AbstractC3677my0.zzb;
                } else {
                    this.f23389b = this.f23388a.zzaN();
                }
                return this.f23389b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Pz0 zzc(Pz0 pz0) {
        Pz0 pz02 = this.f23388a;
        this.f23389b = null;
        this.f23388a = pz0;
        return pz02;
    }
}
