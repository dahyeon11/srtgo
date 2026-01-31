package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class VJ0 extends Exception {
    public final int zza;
    public final boolean zzb;
    public final Q5 zzc;

    public VJ0(int i8, int i9, int i10, int i11, Q5 q52, boolean z8, Exception exc) {
        String strValueOf = String.valueOf(q52);
        StringBuilder sb = new StringBuilder();
        sb.append("AudioTrack init failed ");
        sb.append(i8);
        sb.append(" Config(");
        sb.append(i9);
        sb.append(", ");
        sb.append(i10);
        sb.append(", ");
        sb.append(i11);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z8 ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.zza = i8;
        this.zzb = z8;
        this.zzc = q52;
    }
}
