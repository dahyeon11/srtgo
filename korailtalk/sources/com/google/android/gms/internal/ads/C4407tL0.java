package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.tL0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4407tL0 implements BL0 {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f22811g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f22812h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f22813a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f22814b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f22815c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f22816d;

    /* renamed from: e, reason: collision with root package name */
    private final K30 f22817e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22818f;

    public C4407tL0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        K30 k30 = new K30(InterfaceC3002h20.zza);
        this.f22813a = mediaCodec;
        this.f22814b = handlerThread;
        this.f22817e = k30;
        this.f22816d = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void a(com.google.android.gms.internal.ads.C4407tL0 r9, android.os.Message r10) throws android.media.MediaCodec.CryptoException {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L58
            r2 = 1
            if (r0 == r2) goto L36
            r2 = 2
            if (r0 == r2) goto L30
            r2 = 3
            if (r0 == r2) goto L1f
            java.util.concurrent.atomic.AtomicReference r9 = r9.f22816d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.AbstractC4066qL0.zza(r9, r1, r0)
            goto L72
        L1f:
            java.lang.Object r10 = r10.obj
            android.os.Bundle r10 = (android.os.Bundle) r10
            android.media.MediaCodec r0 = r9.f22813a     // Catch: java.lang.RuntimeException -> L29
            r0.setParameters(r10)     // Catch: java.lang.RuntimeException -> L29
            goto L72
        L29:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.f22816d
            com.google.android.gms.internal.ads.AbstractC4066qL0.zza(r9, r1, r10)
            goto L72
        L30:
            com.google.android.gms.internal.ads.K30 r9 = r9.f22817e
            r9.zze()
            goto L72
        L36:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.sL0 r10 = (com.google.android.gms.internal.ads.C4293sL0) r10
            int r3 = r10.zza
            android.media.MediaCodec$CryptoInfo r5 = r10.zzd
            long r6 = r10.zze
            int r8 = r10.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.C4407tL0.f22812h     // Catch: java.lang.RuntimeException -> L50
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L50
            android.media.MediaCodec r2 = r9.f22813a     // Catch: java.lang.Throwable -> L4d
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            goto L56
        L4d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r2     // Catch: java.lang.RuntimeException -> L50
        L50:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.f22816d
            com.google.android.gms.internal.ads.AbstractC4066qL0.zza(r9, r1, r0)
        L56:
            r1 = r10
            goto L72
        L58:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.sL0 r10 = (com.google.android.gms.internal.ads.C4293sL0) r10
            int r3 = r10.zza
            int r5 = r10.zzc
            long r6 = r10.zze
            int r8 = r10.zzf
            android.media.MediaCodec r2 = r9.f22813a     // Catch: java.lang.RuntimeException -> L6b
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L6b
            goto L56
        L6b:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.f22816d
            com.google.android.gms.internal.ads.AbstractC4066qL0.zza(r9, r1, r0)
            goto L56
        L72:
            if (r1 == 0) goto L7f
            java.util.ArrayDeque r9 = com.google.android.gms.internal.ads.C4407tL0.f22811g
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7c
            return
        L7c:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7c
            throw r10
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4407tL0.a(com.google.android.gms.internal.ads.tL0, android.os.Message):void");
    }

    private static C4293sL0 b() {
        ArrayDeque arrayDeque = f22811g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C4293sL0();
                }
                return (C4293sL0) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static byte[] c(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] d(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzb() {
        if (this.f22818f) {
            try {
                Handler handler = this.f22815c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.f22817e.zzc();
                Handler handler2 = this.f22815c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(2).sendToTarget();
                this.f22817e.zza();
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.f22816d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzd(int i8, int i9, int i10, long j8, int i11) {
        zzc();
        C4293sL0 c4293sL0B = b();
        c4293sL0B.zza(i8, 0, i10, j8, i11);
        Handler handler = this.f22815c;
        int i12 = AbstractC2281am0.zza;
        handler.obtainMessage(0, c4293sL0B).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zze(int i8, int i9, C4963yE0 c4963yE0, long j8, int i10) {
        zzc();
        C4293sL0 c4293sL0B = b();
        c4293sL0B.zza(i8, 0, 0, j8, 0);
        MediaCodec.CryptoInfo cryptoInfo = c4293sL0B.zzd;
        cryptoInfo.numSubSamples = c4963yE0.zzf;
        cryptoInfo.numBytesOfClearData = d(c4963yE0.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = d(c4963yE0.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrC = c(c4963yE0.zzb, cryptoInfo.key);
        bArrC.getClass();
        cryptoInfo.key = bArrC;
        byte[] bArrC2 = c(c4963yE0.zza, cryptoInfo.iv);
        bArrC2.getClass();
        cryptoInfo.iv = bArrC2;
        cryptoInfo.mode = c4963yE0.zzc;
        if (AbstractC2281am0.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c4963yE0.zzg, c4963yE0.zzh));
        }
        this.f22815c.obtainMessage(1, c4293sL0B).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.f22815c;
        int i8 = AbstractC2281am0.zza;
        handler.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzg() {
        if (this.f22818f) {
            zzb();
            this.f22814b.quit();
        }
        this.f22818f = false;
    }

    @Override // com.google.android.gms.internal.ads.BL0
    public final void zzh() {
        if (this.f22818f) {
            return;
        }
        this.f22814b.start();
        this.f22815c = new HandlerC4179rL0(this, this.f22814b.getLooper());
        this.f22818f = true;
    }
}
