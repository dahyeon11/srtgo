package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class N extends PL0 implements U {

    /* renamed from: Y0 */
    private static final int[] f14759Y0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: Z0 */
    private static boolean f14760Z0;

    /* renamed from: a1 */
    private static boolean f14761a1;

    /* renamed from: A0 */
    private final V f14762A0;

    /* renamed from: B0 */
    private final T f14763B0;

    /* renamed from: C0 */
    private M f14764C0;

    /* renamed from: D0 */
    private boolean f14765D0;

    /* renamed from: E0 */
    private boolean f14766E0;

    /* renamed from: F0 */
    private Surface f14767F0;

    /* renamed from: G0 */
    private C1839Rh0 f14768G0;

    /* renamed from: H0 */
    private Q f14769H0;

    /* renamed from: I0 */
    private boolean f14770I0;

    /* renamed from: J0 */
    private int f14771J0;

    /* renamed from: K0 */
    private long f14772K0;

    /* renamed from: L0 */
    private int f14773L0;

    /* renamed from: M0 */
    private int f14774M0;

    /* renamed from: N0 */
    private int f14775N0;

    /* renamed from: O0 */
    private long f14776O0;

    /* renamed from: P0 */
    private int f14777P0;

    /* renamed from: Q0 */
    private long f14778Q0;

    /* renamed from: R0 */
    private IQ f14779R0;

    /* renamed from: S0 */
    private IQ f14780S0;

    /* renamed from: T0 */
    private boolean f14781T0;

    /* renamed from: U0 */
    private boolean f14782U0;

    /* renamed from: V0 */
    private int f14783V0;

    /* renamed from: W0 */
    private S f14784W0;

    /* renamed from: X0 */
    private InterfaceC4364t0 f14785X0;

    /* renamed from: w0 */
    private final Context f14786w0;

    /* renamed from: x0 */
    private final InterfaceC4478u0 f14787x0;

    /* renamed from: y0 */
    private final C3795o0 f14788y0;

    /* renamed from: z0 */
    private final boolean f14789z0;

    public N(Context context, InterfaceC5091zL0 interfaceC5091zL0, RL0 rl0, long j8, boolean z8, Handler handler, InterfaceC3909p0 interfaceC3909p0, int i8, float f8) {
        super(2, interfaceC5091zL0, rl0, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f14786w0 = applicationContext;
        this.f14788y0 = new C3795o0(handler, interfaceC3909p0);
        F fZzc = new C4363t(applicationContext).zzc();
        if (fZzc.zzc() == null) {
            fZzc.zzs(new V(applicationContext, this, 0L));
        }
        this.f14787x0 = fZzc;
        V vZzc = fZzc.zzc();
        F10.zzb(vZzc);
        this.f14762A0 = vZzc;
        this.f14763B0 = new T();
        this.f14789z0 = "NVIDIA".equals(AbstractC2281am0.zzc);
        this.f14771J0 = 1;
        this.f14779R0 = IQ.zza;
        this.f14783V0 = 0;
        this.f14780S0 = null;
    }

    private final void A0() {
        Surface surface = this.f14767F0;
        Q q8 = this.f14769H0;
        if (surface == q8) {
            this.f14767F0 = null;
        }
        if (q8 != null) {
            q8.release();
            this.f14769H0 = null;
        }
    }

    private final boolean B0(DL0 dl0) {
        if (AbstractC2281am0.zza < 23 || w0(dl0.zza)) {
            return false;
        }
        return !dl0.zzf || Q.zzb(this.f14786w0);
    }

    protected static int C0(DL0 dl0, Q5 q52) {
        if (q52.zzo == -1) {
            return zzad(dl0, q52);
        }
        int size = q52.zzp.size();
        int length = 0;
        for (int i8 = 0; i8 < size; i8++) {
            length += ((byte[]) q52.zzp.get(i8)).length;
        }
        return q52.zzo + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final boolean w0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.N.w0(java.lang.String):boolean");
    }

    private static List x0(Context context, RL0 rl0, Q5 q52, boolean z8, boolean z9) {
        String str = q52.zzn;
        if (str == null) {
            return AbstractC2394bl0.zzm();
        }
        if (AbstractC2281am0.zza >= 26 && "video/dolby-vision".equals(str) && !L.zza(context)) {
            List listZzd = AbstractC3157iM0.zzd(rl0, q52, z8, z9);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return AbstractC3157iM0.zzf(rl0, q52, z8, z9);
    }

    private final void y0() {
        IQ iq = this.f14780S0;
        if (iq != null) {
            this.f14788y0.zzt(iq);
        }
    }

    public final void z0() {
        this.f14788y0.zzq(this.f14767F0);
        this.f14770I0 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzad(com.google.android.gms.internal.ads.DL0 r10, com.google.android.gms.internal.ads.Q5 r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.N.zzad(com.google.android.gms.internal.ads.DL0, com.google.android.gms.internal.ads.Q5):int");
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void A() {
        super.A();
        this.f14775N0 = 0;
    }

    protected final void F0(AL0 al0, int i8, long j8, long j9) {
        Trace.beginSection("releaseOutputBuffer");
        al0.zzm(i8, j9);
        Trace.endSection();
        this.f15307p0.zze++;
        this.f14774M0 = 0;
        if (this.f14785X0 == null) {
            IQ iq = this.f14779R0;
            if (!iq.equals(IQ.zza) && !iq.equals(this.f14780S0)) {
                this.f14780S0 = iq;
                this.f14788y0.zzt(iq);
            }
            if (!this.f14762A0.zzp() || this.f14767F0 == null) {
                return;
            }
            z0();
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final boolean G(DL0 dl0) {
        return this.f14767F0 != null || B0(dl0);
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final int S(RL0 rl0, Q5 q52) {
        boolean z8;
        if (!AbstractC4239rv.zzh(q52.zzn)) {
            return 128;
        }
        int i8 = 1;
        int i9 = 0;
        boolean z9 = q52.zzq != null;
        List listX0 = x0(this.f14786w0, rl0, q52, z9, false);
        if (z9 && listX0.isEmpty()) {
            listX0 = x0(this.f14786w0, rl0, q52, false, false);
        }
        if (!listX0.isEmpty()) {
            if (PL0.H(q52)) {
                DL0 dl0 = (DL0) listX0.get(0);
                boolean zZze = dl0.zze(q52);
                if (zZze) {
                    z8 = true;
                } else {
                    for (int i10 = 1; i10 < listX0.size(); i10++) {
                        DL0 dl02 = (DL0) listX0.get(i10);
                        if (dl02.zze(q52)) {
                            zZze = true;
                            z8 = false;
                            dl0 = dl02;
                            break;
                        }
                    }
                    z8 = true;
                }
                int i11 = true != zZze ? 3 : 4;
                int i12 = true != dl0.zzf(q52) ? 8 : 16;
                int i13 = true != dl0.zzg ? 0 : 64;
                int i14 = true != z8 ? 0 : 128;
                if (AbstractC2281am0.zza >= 26 && "video/dolby-vision".equals(q52.zzn) && !L.zza(this.f14786w0)) {
                    i14 = 256;
                }
                if (zZze) {
                    List listX02 = x0(this.f14786w0, rl0, q52, z9, true);
                    if (!listX02.isEmpty()) {
                        DL0 dl03 = (DL0) AbstractC3157iM0.zzg(listX02, q52).get(0);
                        if (dl03.zze(q52) && dl03.zzf(q52)) {
                            i9 = 32;
                        }
                    }
                }
                return i11 | i12 | i9 | i13 | i14;
            }
            i8 = 2;
        }
        return i8 | 128;
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final ME0 T(DL0 dl0, Q5 q52, Q5 q53) {
        int i8;
        int i9;
        ME0 me0Zzb = dl0.zzb(q52, q53);
        int i10 = me0Zzb.zze;
        M m8 = this.f14764C0;
        m8.getClass();
        if (q53.zzs > m8.zza || q53.zzt > m8.zzb) {
            i10 |= 256;
        }
        if (C0(dl0, q53) > m8.zzc) {
            i10 |= 64;
        }
        String str = dl0.zza;
        if (i10 != 0) {
            i9 = i10;
            i8 = 0;
        } else {
            i8 = me0Zzb.zzd;
            i9 = 0;
        }
        return new ME0(str, q52, q53, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final ME0 U(ZF0 zf0) {
        ME0 me0U = super.U(zf0);
        Q5 q52 = zf0.zza;
        q52.getClass();
        this.f14788y0.zzf(q52, me0U);
        return me0U;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x00ce, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x023d  */
    @Override // com.google.android.gms.internal.ads.PL0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.C4977yL0 X(com.google.android.gms.internal.ads.DL0 r20, com.google.android.gms.internal.ads.Q5 r21, android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.N.X(com.google.android.gms.internal.ads.DL0, com.google.android.gms.internal.ads.Q5, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.yL0");
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final List Y(RL0 rl0, Q5 q52, boolean z8) {
        return AbstractC3157iM0.zzg(x0(this.f14786w0, rl0, q52, false, false), q52);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    protected final void a() {
        if (this.f14785X0 != null) {
            this.f14787x0.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void b0(BE0 be0) {
        if (this.f14766E0) {
            ByteBuffer byteBuffer = be0.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b9 = byteBuffer.get();
                short s8 = byteBuffer.getShort();
                short s9 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b9 == -75 && s8 == 60 && s9 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        AL0 al0O0 = o0();
                        al0O0.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        al0O0.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0
    protected final void c() {
        try {
            super.c();
            this.f14782U0 = false;
            if (this.f14769H0 != null) {
                A0();
            }
        } catch (Throwable th) {
            this.f14782U0 = false;
            if (this.f14769H0 != null) {
                A0();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void c0(Exception exc) {
        AbstractC2834fc0.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f14788y0.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    protected final void d() {
        this.f14773L0 = 0;
        n();
        this.f14772K0 = SystemClock.elapsedRealtime();
        this.f14776O0 = 0L;
        this.f14777P0 = 0;
        this.f14762A0.zzg();
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void d0(String str, C4977yL0 c4977yL0, long j8, long j9) {
        this.f14788y0.zza(str, j8, j9);
        this.f14765D0 = w0(str);
        DL0 dl0Q0 = q0();
        dl0Q0.getClass();
        boolean z8 = false;
        if (AbstractC2281am0.zza >= 29 && "video/x-vnd.on2.vp9".equals(dl0Q0.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzh = dl0Q0.zzh();
            int length = codecProfileLevelArrZzh.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (codecProfileLevelArrZzh[i8].profile == 16384) {
                    z8 = true;
                    break;
                }
                i8++;
            }
        }
        this.f14766E0 = z8;
    }

    @Override // com.google.android.gms.internal.ads.KE0
    protected final void e() {
        if (this.f14773L0 > 0) {
            n();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f14788y0.zzd(this.f14773L0, jElapsedRealtime - this.f14772K0);
            this.f14773L0 = 0;
            this.f14772K0 = jElapsedRealtime;
        }
        int i8 = this.f14777P0;
        if (i8 != 0) {
            this.f14788y0.zzr(this.f14776O0, i8);
            this.f14776O0 = 0L;
            this.f14777P0 = 0;
        }
        this.f14762A0.zzh();
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void e0(String str) {
        this.f14788y0.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void f0(Q5 q52, MediaFormat mediaFormat) {
        AL0 al0O0 = o0();
        if (al0O0 != null) {
            al0O0.zzq(this.f14771J0);
        }
        mediaFormat.getClass();
        boolean z8 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z8 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z8 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f8 = q52.zzw;
        int i8 = AbstractC2281am0.zza;
        int i9 = q52.zzv;
        if (i9 == 90 || i9 == 270) {
            f8 = 1.0f / f8;
            int i10 = integer2;
            integer2 = integer;
            integer = i10;
        }
        this.f14779R0 = new IQ(integer, integer2, 0, f8);
        this.f14762A0.zzl(q52.zzu);
        InterfaceC4364t0 interfaceC4364t0 = this.f14785X0;
        if (interfaceC4364t0 != null) {
            O4 o4Zzb = q52.zzb();
            o4Zzb.zzac(integer);
            o4Zzb.zzI(integer2);
            o4Zzb.zzW(0);
            o4Zzb.zzT(f8);
            interfaceC4364t0.zzg(1, o4Zzb.zzad());
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void h0() {
        this.f14762A0.zzf();
        this.f14787x0.zzd().zzj(m0());
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final boolean j0(long j8, long j9, AL0 al0, ByteBuffer byteBuffer, int i8, int i9, int i10, long j10, boolean z8, boolean z9, Q5 q52) throws WE0 {
        al0.getClass();
        long jM0 = j10 - m0();
        int iZza = this.f14762A0.zza(j10, j8, j9, n0(), z9, this.f14763B0);
        if (z8 && !z9) {
            s0(al0, i8, jM0);
            return true;
        }
        if (this.f14767F0 != this.f14769H0 || this.f14785X0 != null) {
            InterfaceC4364t0 interfaceC4364t0 = this.f14785X0;
            if (interfaceC4364t0 != null) {
                try {
                    interfaceC4364t0.zzh(j8, j9);
                    long jZzd = this.f14785X0.zzd(jM0, z9);
                    if (jZzd != -9223372036854775807L) {
                        int i11 = AbstractC2281am0.zza;
                        F0(al0, i8, jM0, jZzd);
                        return true;
                    }
                } catch (C4250s0 e8) {
                    throw o(e8, e8.zza, false, 7001);
                }
            } else {
                if (iZza == 0) {
                    n();
                    long jNanoTime = System.nanoTime();
                    int i12 = AbstractC2281am0.zza;
                    F0(al0, i8, jM0, jNanoTime);
                    u0(this.f14763B0.zzc());
                    return true;
                }
                if (iZza == 1) {
                    T t8 = this.f14763B0;
                    long jZzd2 = t8.zzd();
                    long jZzc = t8.zzc();
                    int i13 = AbstractC2281am0.zza;
                    if (jZzd2 == this.f14778Q0) {
                        s0(al0, i8, jM0);
                    } else {
                        F0(al0, i8, jM0, jZzd2);
                    }
                    u0(jZzc);
                    this.f14778Q0 = jZzd2;
                    return true;
                }
                if (iZza == 2) {
                    Trace.beginSection("dropVideoBuffer");
                    al0.zzn(i8, false);
                    Trace.endSection();
                    t0(0, 1);
                    u0(this.f14763B0.zzc());
                    return true;
                }
                if (iZza == 3) {
                    s0(al0, i8, jM0);
                    u0(this.f14763B0.zzc());
                    return true;
                }
            }
        } else if (this.f14763B0.zzc() < H0.y.DEFAULT_BACKOFF_DELAY_MILLIS) {
            s0(al0, i8, jM0);
            u0(this.f14763B0.zzc());
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final int l0(BE0 be0) {
        int i8 = AbstractC2281am0.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final CL0 p0(Throwable th, DL0 dl0) {
        return new I(th, dl0, this.f14767F0);
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0
    protected final void r() {
        this.f14780S0 = null;
        this.f14762A0.zzd();
        this.f14770I0 = false;
        try {
            super.r();
        } finally {
            this.f14788y0.zzc(this.f15307p0);
            this.f14788y0.zzt(IQ.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0
    protected final void s(boolean z8, boolean z9) {
        super.s(z8, z9);
        p();
        this.f14788y0.zze(this.f15307p0);
        this.f14762A0.zze(z9);
    }

    protected final void s0(AL0 al0, int i8, long j8) {
        Trace.beginSection("skipVideoBuffer");
        al0.zzn(i8, false);
        Trace.endSection();
        this.f15307p0.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.KE0
    protected final void t() {
        this.f14762A0.zzk(n());
    }

    protected final void t0(int i8, int i9) {
        LE0 le0 = this.f15307p0;
        le0.zzh += i8;
        int i10 = i8 + i9;
        le0.zzg += i10;
        this.f14773L0 += i10;
        int i11 = this.f14774M0 + i10;
        this.f14774M0 = i11;
        le0.zzi = Math.max(i11, le0.zzi);
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0
    protected final void u(long j8, boolean z8) {
        this.f14787x0.zzd().zze();
        super.u(j8, z8);
        this.f14762A0.zzi();
        if (z8) {
            this.f14762A0.zzc(false);
        }
        this.f14774M0 = 0;
    }

    protected final void u0(long j8) {
        LE0 le0 = this.f15307p0;
        le0.zzk += j8;
        le0.zzl++;
        this.f14776O0 += j8;
        this.f14777P0++;
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final float v(float f8, Q5 q52, Q5[] q5Arr) {
        float fMax = -1.0f;
        for (Q5 q53 : q5Arr) {
            float f9 = q53.zzu;
            if (f9 != -1.0f) {
                fMax = Math.max(fMax, f9);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f8;
    }

    protected final boolean v0(long j8, boolean z8) {
        int iL = l(j8);
        if (iL == 0) {
            return false;
        }
        if (z8) {
            LE0 le0 = this.f15307p0;
            le0.zzd += iL;
            le0.zzf += this.f14775N0;
        } else {
            this.f15307p0.zzj++;
            t0(iL, this.f14775N0);
        }
        C();
        InterfaceC4364t0 interfaceC4364t0 = this.f14785X0;
        if (interfaceC4364t0 != null) {
            interfaceC4364t0.zze();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void w(long j8) {
        super.w(j8);
        this.f14775N0--;
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void x(BE0 be0) {
        this.f14775N0++;
        int i8 = AbstractC2281am0.zza;
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void y(Q5 q52) throws WE0 {
        C1839Rh0 c1839Rh0;
        if (this.f14781T0 && !this.f14782U0) {
            InterfaceC4364t0 interfaceC4364t0Zzd = this.f14787x0.zzd();
            this.f14785X0 = interfaceC4364t0Zzd;
            try {
                interfaceC4364t0Zzd.zzf(q52, n());
                this.f14785X0.zzi(new J(this), AbstractC2285ao0.zzb());
                S s8 = this.f14784W0;
                if (s8 != null) {
                    ((D) this.f14785X0).f12603l.f12892i = s8;
                }
                this.f14785X0.zzj(m0());
                Surface surface = this.f14767F0;
                if (surface != null && (c1839Rh0 = this.f14768G0) != null) {
                    this.f14787x0.zzq(surface, c1839Rh0);
                }
            } catch (C4250s0 e8) {
                throw o(e8, q52, false, 7000);
            }
        }
        this.f14782U0 = true;
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public final void zzM(float f8, float f9) {
        super.zzM(f8, f9);
        this.f14762A0.zzn(f8);
        InterfaceC4364t0 interfaceC4364t0 = this.f14785X0;
        if (interfaceC4364t0 != null) {
            F.e(((D) interfaceC4364t0).f12603l, f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.GG0
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public final void zzV(long j8, long j9) throws WE0 {
        super.zzV(j8, j9);
        InterfaceC4364t0 interfaceC4364t0 = this.f14785X0;
        if (interfaceC4364t0 != null) {
            try {
                interfaceC4364t0.zzh(j8, j9);
            } catch (C4250s0 e8) {
                throw o(e8, e8.zza, false, 7001);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public final boolean zzW() {
        return super.zzW() && this.f14785X0 == null;
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public final boolean zzX() {
        Q q8;
        boolean z8 = false;
        if (super.zzX() && this.f14785X0 == null) {
            z8 = true;
        }
        if (!z8 || (((q8 = this.f14769H0) == null || this.f14767F0 != q8) && o0() != null)) {
            return this.f14762A0.zzo(z8);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public final void zzs() {
        this.f14762A0.zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.InterfaceC5081zG0
    public final void zzt(int i8, Object obj) {
        Surface surface;
        if (i8 != 1) {
            if (i8 == 7) {
                obj.getClass();
                S s8 = (S) obj;
                this.f14784W0 = s8;
                InterfaceC4364t0 interfaceC4364t0 = this.f14785X0;
                if (interfaceC4364t0 != null) {
                    ((D) interfaceC4364t0).f12603l.f12892i = s8;
                    return;
                }
                return;
            }
            if (i8 == 10) {
                obj.getClass();
                int iIntValue = ((Integer) obj).intValue();
                if (this.f14783V0 != iIntValue) {
                    this.f14783V0 = iIntValue;
                    return;
                }
                return;
            }
            if (i8 == 4) {
                obj.getClass();
                int iIntValue2 = ((Integer) obj).intValue();
                this.f14771J0 = iIntValue2;
                AL0 al0O0 = o0();
                if (al0O0 != null) {
                    al0O0.zzq(iIntValue2);
                    return;
                }
                return;
            }
            if (i8 == 5) {
                V v8 = this.f14762A0;
                obj.getClass();
                v8.zzj(((Integer) obj).intValue());
                return;
            }
            if (i8 == 13) {
                obj.getClass();
                this.f14787x0.zzr((List) obj);
                this.f14781T0 = true;
                return;
            } else {
                if (i8 != 14) {
                    return;
                }
                obj.getClass();
                C1839Rh0 c1839Rh0 = (C1839Rh0) obj;
                this.f14768G0 = c1839Rh0;
                if (this.f14785X0 == null || c1839Rh0.zzb() == 0 || c1839Rh0.zza() == 0 || (surface = this.f14767F0) == null) {
                    return;
                }
                this.f14787x0.zzq(surface, c1839Rh0);
                return;
            }
        }
        Q qZza = obj instanceof Surface ? (Surface) obj : null;
        if (qZza == null) {
            Q q8 = this.f14769H0;
            if (q8 != null) {
                qZza = q8;
            } else {
                DL0 dl0Q0 = q0();
                if (dl0Q0 != null && B0(dl0Q0)) {
                    qZza = Q.zza(this.f14786w0, dl0Q0.zzf);
                    this.f14769H0 = qZza;
                }
            }
        }
        if (this.f14767F0 == qZza) {
            if (qZza == null || qZza == this.f14769H0) {
                return;
            }
            y0();
            Surface surface2 = this.f14767F0;
            if (surface2 == null || !this.f14770I0) {
                return;
            }
            this.f14788y0.zzq(surface2);
            return;
        }
        this.f14767F0 = qZza;
        this.f14762A0.zzm(qZza);
        this.f14770I0 = false;
        int iZzcU = zzcU();
        AL0 al0O02 = o0();
        Q q9 = qZza;
        if (al0O02 != null) {
            q9 = qZza;
            if (this.f14785X0 == null) {
                Q q10 = qZza;
                if (AbstractC2281am0.zza < 23) {
                    z();
                    r0();
                    q9 = q10;
                } else {
                    if (qZza != null) {
                        q10 = qZza;
                        if (!this.f14765D0) {
                            al0O02.zzo(qZza);
                            q9 = qZza;
                        }
                    } else {
                        q10 = null;
                    }
                    z();
                    r0();
                    q9 = q10;
                }
            }
        }
        if (q9 == null || q9 == this.f14769H0) {
            this.f14780S0 = null;
            if (this.f14785X0 != null) {
                this.f14787x0.zzk();
                return;
            }
            return;
        }
        y0();
        if (iZzcU == 2) {
            this.f14762A0.zzc(true);
        }
        if (this.f14785X0 != null) {
            this.f14787x0.zzq(q9, C1839Rh0.zza);
        }
    }
}
