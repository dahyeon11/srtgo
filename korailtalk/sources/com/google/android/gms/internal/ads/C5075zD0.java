package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5075zD0 {
    public static final C5075zD0 zza = new C5075zD0(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final C5075zD0 zzb = new C5075zD0(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final C5075zD0 zzc = new C5075zD0(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final C5075zD0 zzd = new C5075zD0(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;
    public final double zzj;
    public final double zzk;
    public final double zzl;
    public final double zzm;

    public C5075zD0(double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.zze = d13;
        this.zzf = d14;
        this.zzg = d15;
        this.zzh = d9;
        this.zzi = d10;
        this.zzj = d11;
        this.zzk = d12;
        this.zzl = d16;
        this.zzm = d17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5075zD0.class != obj.getClass()) {
            return false;
        }
        C5075zD0 c5075zD0 = (C5075zD0) obj;
        return Double.compare(c5075zD0.zzh, this.zzh) == 0 && Double.compare(c5075zD0.zzi, this.zzi) == 0 && Double.compare(c5075zD0.zzj, this.zzj) == 0 && Double.compare(c5075zD0.zzk, this.zzk) == 0 && Double.compare(c5075zD0.zzl, this.zzl) == 0 && Double.compare(c5075zD0.zzm, this.zzm) == 0 && Double.compare(c5075zD0.zze, this.zze) == 0 && Double.compare(c5075zD0.zzf, this.zzf) == 0 && Double.compare(c5075zD0.zzg, this.zzg) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zze);
        long j8 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zzf);
        long j9 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.zzg);
        long j10 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.zzh);
        long j11 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.zzi);
        long j12 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.zzj);
        long j13 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.zzk);
        long j14 = jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.zzl);
        long j15 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.zzm);
        return (((((((((((((((((int) j8) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zza)) {
            return "Rotate 0°";
        }
        if (equals(zzb)) {
            return "Rotate 90°";
        }
        if (equals(zzc)) {
            return "Rotate 180°";
        }
        if (equals(zzd)) {
            return "Rotate 270°";
        }
        double d9 = this.zze;
        double d10 = this.zzf;
        double d11 = this.zzg;
        double d12 = this.zzh;
        double d13 = this.zzi;
        double d14 = this.zzj;
        double d15 = this.zzk;
        double d16 = this.zzl;
        double d17 = this.zzm;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d9);
        sb.append(", v=");
        sb.append(d10);
        sb.append(", w=");
        sb.append(d11);
        sb.append(", a=");
        sb.append(d12);
        sb.append(", b=");
        sb.append(d13);
        sb.append(", c=");
        sb.append(d14);
        sb.append(", d=");
        sb.append(d15);
        sb.append(", tx=");
        sb.append(d16);
        sb.append(", ty=");
        sb.append(d17);
        sb.append("}");
        return sb.toString();
    }
}
