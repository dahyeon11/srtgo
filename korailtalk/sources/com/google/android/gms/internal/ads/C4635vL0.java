package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: com.google.android.gms.internal.ads.vL0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4635vL0 extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f23202b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f23203c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f23208h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f23209i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f23210j;

    /* renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f23211k;

    /* renamed from: l, reason: collision with root package name */
    private long f23212l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f23213m;

    /* renamed from: n, reason: collision with root package name */
    private IllegalStateException f23214n;

    /* renamed from: a, reason: collision with root package name */
    private final Object f23201a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final O.c f23204d = new O.c();

    /* renamed from: e, reason: collision with root package name */
    private final O.c f23205e = new O.c();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f23206f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f23207g = new ArrayDeque();

    C4635vL0(HandlerThread handlerThread) {
        this.f23202b = handlerThread;
    }

    private final void a(MediaFormat mediaFormat) {
        this.f23205e.addLast(-2);
        this.f23207g.add(mediaFormat);
    }

    private final void b() {
        if (!this.f23207g.isEmpty()) {
            this.f23209i = (MediaFormat) this.f23207g.getLast();
        }
        this.f23204d.clear();
        this.f23205e.clear();
        this.f23206f.clear();
        this.f23207g.clear();
    }

    private final void c() {
        IllegalStateException illegalStateException = this.f23214n;
        if (illegalStateException != null) {
            this.f23214n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f23210j;
        if (codecException != null) {
            this.f23210j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f23211k;
        if (cryptoException == null) {
            return;
        }
        this.f23211k = null;
        throw cryptoException;
    }

    private final boolean d() {
        return this.f23212l > 0 || this.f23213m;
    }

    public static /* synthetic */ void zzd(C4635vL0 c4635vL0) {
        synchronized (c4635vL0.f23201a) {
            try {
                if (c4635vL0.f23213m) {
                    return;
                }
                long j8 = c4635vL0.f23212l - 1;
                c4635vL0.f23212l = j8;
                if (j8 > 0) {
                    return;
                }
                if (j8 >= 0) {
                    c4635vL0.b();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (c4635vL0.f23201a) {
                    c4635vL0.f23214n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f23201a) {
            this.f23211k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f23201a) {
            this.f23210j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i8) {
        synchronized (this.f23201a) {
            this.f23204d.addLast(i8);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i8, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f23201a) {
            try {
                MediaFormat mediaFormat = this.f23209i;
                if (mediaFormat != null) {
                    a(mediaFormat);
                    this.f23209i = null;
                }
                this.f23205e.addLast(i8);
                this.f23206f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f23201a) {
            a(mediaFormat);
            this.f23209i = null;
        }
    }

    public final int zza() {
        synchronized (this.f23201a) {
            try {
                c();
                int iPopFirst = -1;
                if (d()) {
                    return -1;
                }
                if (!this.f23204d.isEmpty()) {
                    iPopFirst = this.f23204d.popFirst();
                }
                return iPopFirst;
            } finally {
            }
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f23201a) {
            try {
                c();
                if (d()) {
                    return -1;
                }
                if (this.f23205e.isEmpty()) {
                    return -1;
                }
                int iPopFirst = this.f23205e.popFirst();
                if (iPopFirst >= 0) {
                    F10.zzb(this.f23208h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f23206f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iPopFirst == -2) {
                    this.f23208h = (MediaFormat) this.f23207g.remove();
                    iPopFirst = -2;
                }
                return iPopFirst;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.f23201a) {
            try {
                mediaFormat = this.f23208h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.f23201a) {
            this.f23212l++;
            Handler handler = this.f23203c;
            int i8 = AbstractC2281am0.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.uL0
                @Override // java.lang.Runnable
                public final void run() {
                    C4635vL0.zzd(this.zza);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        F10.zzf(this.f23203c == null);
        this.f23202b.start();
        Handler handler = new Handler(this.f23202b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f23203c = handler;
    }

    public final void zzg() {
        synchronized (this.f23201a) {
            this.f23213m = true;
            this.f23202b.quit();
            b();
        }
    }
}
