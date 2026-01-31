package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.rU, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4191rU implements NS {

    /* renamed from: a, reason: collision with root package name */
    private int f22468a;

    /* renamed from: b, reason: collision with root package name */
    private float f22469b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private float f22470c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private KR f22471d;

    /* renamed from: e, reason: collision with root package name */
    private KR f22472e;

    /* renamed from: f, reason: collision with root package name */
    private KR f22473f;

    /* renamed from: g, reason: collision with root package name */
    private KR f22474g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22475h;

    /* renamed from: i, reason: collision with root package name */
    private QT f22476i;

    /* renamed from: j, reason: collision with root package name */
    private ByteBuffer f22477j;

    /* renamed from: k, reason: collision with root package name */
    private ShortBuffer f22478k;

    /* renamed from: l, reason: collision with root package name */
    private ByteBuffer f22479l;

    /* renamed from: m, reason: collision with root package name */
    private long f22480m;

    /* renamed from: n, reason: collision with root package name */
    private long f22481n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22482o;

    public C4191rU() {
        KR kr2 = KR.zza;
        this.f22471d = kr2;
        this.f22472e = kr2;
        this.f22473f = kr2;
        this.f22474g = kr2;
        ByteBuffer byteBuffer = NS.zza;
        this.f22477j = byteBuffer;
        this.f22478k = byteBuffer.asShortBuffer();
        this.f22479l = byteBuffer;
        this.f22468a = -1;
    }

    @Override // com.google.android.gms.internal.ads.NS
    public final KR zza(KR kr2) throws C3620mS {
        if (kr2.zzd != 2) {
            throw new C3620mS("Unhandled input format:", kr2);
        }
        int i8 = this.f22468a;
        if (i8 == -1) {
            i8 = kr2.zzb;
        }
        this.f22471d = kr2;
        KR kr3 = new KR(i8, kr2.zzc, 2);
        this.f22472e = kr3;
        this.f22475h = true;
        return kr3;
    }

    @Override // com.google.android.gms.internal.ads.NS
    public final ByteBuffer zzb() {
        int iZza;
        QT qt = this.f22476i;
        if (qt != null && (iZza = qt.zza()) > 0) {
            if (this.f22477j.capacity() < iZza) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iZza).order(ByteOrder.nativeOrder());
                this.f22477j = byteBufferOrder;
                this.f22478k = byteBufferOrder.asShortBuffer();
            } else {
                this.f22477j.clear();
                this.f22478k.clear();
            }
            qt.zzd(this.f22478k);
            this.f22481n += iZza;
            this.f22477j.limit(iZza);
            this.f22479l = this.f22477j;
        }
        ByteBuffer byteBuffer = this.f22479l;
        this.f22479l = NS.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.NS
    public final void zzc() {
        if (zzg()) {
            KR kr2 = this.f22471d;
            this.f22473f = kr2;
            KR kr3 = this.f22472e;
            this.f22474g = kr3;
            if (this.f22475h) {
                this.f22476i = new QT(kr2.zzb, kr2.zzc, this.f22469b, this.f22470c, kr3.zzb);
            } else {
                QT qt = this.f22476i;
                if (qt != null) {
                    qt.zzc();
                }
            }
        }
        this.f22479l = NS.zza;
        this.f22480m = 0L;
        this.f22481n = 0L;
        this.f22482o = false;
    }

    @Override // com.google.android.gms.internal.ads.NS
    public final void zzd() {
        QT qt = this.f22476i;
        if (qt != null) {
            qt.zze();
        }
        this.f22482o = true;
    }

    @Override // com.google.android.gms.internal.ads.NS
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            QT qt = this.f22476i;
            qt.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f22480m += iRemaining;
            qt.zzf(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.NS
    public final void zzf() {
        this.f22469b = 1.0f;
        this.f22470c = 1.0f;
        KR kr2 = KR.zza;
        this.f22471d = kr2;
        this.f22472e = kr2;
        this.f22473f = kr2;
        this.f22474g = kr2;
        ByteBuffer byteBuffer = NS.zza;
        this.f22477j = byteBuffer;
        this.f22478k = byteBuffer.asShortBuffer();
        this.f22479l = byteBuffer;
        this.f22468a = -1;
        this.f22475h = false;
        this.f22476i = null;
        this.f22480m = 0L;
        this.f22481n = 0L;
        this.f22482o = false;
    }

    @Override // com.google.android.gms.internal.ads.NS
    public final boolean zzg() {
        if (this.f22472e.zzb == -1) {
            return false;
        }
        if (Math.abs(this.f22469b - 1.0f) >= 1.0E-4f || Math.abs(this.f22470c - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.f22472e.zzb != this.f22471d.zzb;
    }

    @Override // com.google.android.gms.internal.ads.NS
    public final boolean zzh() {
        if (!this.f22482o) {
            return false;
        }
        QT qt = this.f22476i;
        return qt == null || qt.zza() == 0;
    }

    public final long zzi(long j8) {
        long j9 = this.f22481n;
        if (j9 < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (this.f22469b * j8);
        }
        long j10 = this.f22480m;
        this.f22476i.getClass();
        long jZzb = j10 - r3.zzb();
        int i8 = this.f22474g.zzb;
        int i9 = this.f22473f.zzb;
        return i8 == i9 ? AbstractC2281am0.zzt(j8, jZzb, j9, RoundingMode.FLOOR) : AbstractC2281am0.zzt(j8, jZzb * i8, j9 * i9, RoundingMode.FLOOR);
    }

    public final void zzj(float f8) {
        if (this.f22470c != f8) {
            this.f22470c = f8;
            this.f22475h = true;
        }
    }

    public final void zzk(float f8) {
        if (this.f22469b != f8) {
            this.f22469b = f8;
            this.f22475h = true;
        }
    }
}
