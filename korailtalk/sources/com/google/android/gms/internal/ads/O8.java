package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes2.dex */
public final class O8 extends AbstractC3822oD0 {

    /* renamed from: l, reason: collision with root package name */
    private Date f15052l;

    /* renamed from: m, reason: collision with root package name */
    private Date f15053m;

    /* renamed from: n, reason: collision with root package name */
    private long f15054n;

    /* renamed from: o, reason: collision with root package name */
    private long f15055o;

    /* renamed from: p, reason: collision with root package name */
    private double f15056p;

    /* renamed from: q, reason: collision with root package name */
    private float f15057q;

    /* renamed from: r, reason: collision with root package name */
    private C5075zD0 f15058r;

    /* renamed from: s, reason: collision with root package name */
    private long f15059s;

    public O8() {
        super("mvhd");
        this.f15056p = 1.0d;
        this.f15057q = 1.0f;
        this.f15058r = C5075zD0.zza;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f15052l + ";modificationTime=" + this.f15053m + ";timescale=" + this.f15054n + ";duration=" + this.f15055o + ";rate=" + this.f15056p + ";volume=" + this.f15057q + ";matrix=" + this.f15058r + ";nextTrackId=" + this.f15059s + "]";
    }

    public final long zzd() {
        return this.f15055o;
    }

    public final long zze() {
        return this.f15054n;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3594mD0
    public final void zzf(ByteBuffer byteBuffer) {
        b(byteBuffer);
        if (zzh() == 1) {
            this.f15052l = AbstractC4505uD0.zza(K8.zzf(byteBuffer));
            this.f15053m = AbstractC4505uD0.zza(K8.zzf(byteBuffer));
            this.f15054n = K8.zze(byteBuffer);
            this.f15055o = K8.zzf(byteBuffer);
        } else {
            this.f15052l = AbstractC4505uD0.zza(K8.zze(byteBuffer));
            this.f15053m = AbstractC4505uD0.zza(K8.zze(byteBuffer));
            this.f15054n = K8.zze(byteBuffer);
            this.f15055o = K8.zze(byteBuffer);
        }
        this.f15056p = K8.zzb(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f15057q = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        K8.zzd(byteBuffer);
        K8.zze(byteBuffer);
        K8.zze(byteBuffer);
        this.f15058r = new C5075zD0(K8.zzb(byteBuffer), K8.zzb(byteBuffer), K8.zzb(byteBuffer), K8.zzb(byteBuffer), K8.zza(byteBuffer), K8.zza(byteBuffer), K8.zza(byteBuffer), K8.zzb(byteBuffer), K8.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f15059s = K8.zze(byteBuffer);
    }
}
