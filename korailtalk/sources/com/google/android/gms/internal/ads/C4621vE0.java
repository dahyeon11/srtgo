package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4621vE0 {

    /* renamed from: a, reason: collision with root package name */
    private int f23192a;

    protected final boolean a(int i8) {
        return (this.f23192a & i8) == i8;
    }

    public final void zza(int i8) {
        this.f23192a |= 536870912;
    }

    public void zzb() {
        this.f23192a = 0;
    }

    public final void zzc(int i8) {
        this.f23192a = i8;
    }

    public final boolean zze() {
        return a(268435456);
    }

    public final boolean zzf() {
        return a(4);
    }

    public final boolean zzg() {
        return a(1);
    }

    public final boolean zzh() {
        return a(536870912);
    }
}
