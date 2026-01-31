package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.pL0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3952pL0 implements AL0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f21731a;

    /* renamed from: b, reason: collision with root package name */
    private final C4635vL0 f21732b;

    /* renamed from: c, reason: collision with root package name */
    private final BL0 f21733c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21734d;

    /* renamed from: e, reason: collision with root package name */
    private int f21735e = 0;

    /* synthetic */ C3952pL0(MediaCodec mediaCodec, HandlerThread handlerThread, BL0 bl0, AbstractC3838oL0 abstractC3838oL0) {
        this.f21731a = mediaCodec;
        this.f21732b = new C4635vL0(handlerThread);
        this.f21733c = bl0;
    }

    static /* bridge */ /* synthetic */ void c(C3952pL0 c3952pL0, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i8) {
        c3952pL0.f21732b.zzf(c3952pL0.f21731a);
        Trace.beginSection("configureCodec");
        c3952pL0.f21731a.configure(mediaFormat, surface, (MediaCrypto) null, i8);
        Trace.endSection();
        c3952pL0.f21733c.zzh();
        Trace.beginSection("startCodec");
        c3952pL0.f21731a.start();
        Trace.endSection();
        c3952pL0.f21735e = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(int i8, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i8 == 1) {
            sb.append("Audio");
        } else if (i8 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i8);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final int zza() {
        this.f21733c.zzc();
        return this.f21732b.zza();
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.f21733c.zzc();
        return this.f21732b.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final MediaFormat zzc() {
        return this.f21732b.zzc();
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final ByteBuffer zzf(int i8) {
        return this.f21731a.getInputBuffer(i8);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final ByteBuffer zzg(int i8) {
        return this.f21731a.getOutputBuffer(i8);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzi() {
        this.f21733c.zzb();
        this.f21731a.flush();
        this.f21732b.zze();
        this.f21731a.start();
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzj(int i8, int i9, int i10, long j8, int i11) {
        this.f21733c.zzd(i8, 0, i10, j8, i11);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzk(int i8, int i9, C4963yE0 c4963yE0, long j8, int i10) {
        this.f21733c.zze(i8, 0, c4963yE0, j8, 0);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzl() {
        try {
            if (this.f21735e == 1) {
                this.f21733c.zzg();
                this.f21732b.zzg();
            }
            this.f21735e = 2;
            if (this.f21734d) {
                return;
            }
            this.f21731a.release();
            this.f21734d = true;
        } catch (Throwable th) {
            if (!this.f21734d) {
                this.f21731a.release();
                this.f21734d = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzm(int i8, long j8) {
        this.f21731a.releaseOutputBuffer(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzn(int i8, boolean z8) {
        this.f21731a.releaseOutputBuffer(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzo(Surface surface) {
        this.f21731a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzp(Bundle bundle) {
        this.f21733c.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AL0
    public final void zzq(int i8) {
        this.f21731a.setVideoScalingMode(i8);
    }
}
