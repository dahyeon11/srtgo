package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class YJ0 extends Exception {
    public final int zza;
    public final boolean zzb;
    public final Q5 zzc;

    public YJ0(int i8, Q5 q52, boolean z8) {
        super("AudioTrack write failed: " + i8);
        this.zzb = z8;
        this.zza = i8;
        this.zzc = q52;
    }
}
