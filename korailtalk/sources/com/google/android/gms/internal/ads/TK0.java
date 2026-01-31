package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class TK0 extends PL0 implements InterfaceC2800fG0 {

    /* renamed from: A0 */
    private boolean f16442A0;

    /* renamed from: B0 */
    private boolean f16443B0;

    /* renamed from: C0 */
    private Q5 f16444C0;

    /* renamed from: D0 */
    private Q5 f16445D0;

    /* renamed from: E0 */
    private long f16446E0;

    /* renamed from: F0 */
    private boolean f16447F0;

    /* renamed from: G0 */
    private boolean f16448G0;

    /* renamed from: H0 */
    private DG0 f16449H0;

    /* renamed from: I0 */
    private boolean f16450I0;

    /* renamed from: w0 */
    private final Context f16451w0;

    /* renamed from: x0 */
    private final RJ0 f16452x0;

    /* renamed from: y0 */
    private final ZJ0 f16453y0;

    /* renamed from: z0 */
    private int f16454z0;

    public TK0(Context context, InterfaceC5091zL0 interfaceC5091zL0, RL0 rl0, boolean z8, Handler handler, SJ0 sj0, ZJ0 zj0) {
        super(1, interfaceC5091zL0, rl0, false, 44100.0f);
        this.f16451w0 = context.getApplicationContext();
        this.f16453y0 = zj0;
        this.f16452x0 = new RJ0(handler, sj0);
        zj0.zzq(new SK0(this, null));
    }

    private final int s0(DL0 dl0, Q5 q52) {
        int i8;
        if (!"OMX.google.raw.decoder".equals(dl0.zza) || (i8 = AbstractC2281am0.zza) >= 24 || (i8 == 23 && AbstractC2281am0.zzN(this.f16451w0))) {
            return q52.zzo;
        }
        return -1;
    }

    private static List t0(RL0 rl0, Q5 q52, boolean z8, ZJ0 zj0) {
        DL0 dl0Zzb;
        return q52.zzn == null ? AbstractC2394bl0.zzm() : (!zj0.zzA(q52) || (dl0Zzb = AbstractC3157iM0.zzb()) == null) ? AbstractC3157iM0.zzf(rl0, q52, false, false) : AbstractC2394bl0.zzn(dl0Zzb);
    }

    private final void u0() {
        long jZzb = this.f16453y0.zzb(zzW());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.f16447F0) {
                jZzb = Math.max(this.f16446E0, jZzb);
            }
            this.f16446E0 = jZzb;
            this.f16447F0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final int S(RL0 rl0, Q5 q52) {
        int i8;
        boolean z8;
        int i9 = 1;
        if (!AbstractC4239rv.zzg(q52.zzn)) {
            return 128;
        }
        int i10 = AbstractC2281am0.zza;
        int i11 = q52.zzH;
        boolean zH = PL0.H(q52);
        if (!zH || (i11 != 0 && AbstractC3157iM0.zzb() == null)) {
            i8 = 0;
        } else {
            EJ0 ej0Zzd = this.f16453y0.zzd(q52);
            if (ej0Zzd.zzb) {
                i8 = true != ej0Zzd.zzc ? 512 : 1536;
                if (ej0Zzd.zzd) {
                    i8 |= 2048;
                }
            } else {
                i8 = 0;
            }
            if (this.f16453y0.zzA(q52)) {
                return i8 | 172;
            }
        }
        if ((!"audio/raw".equals(q52.zzn) || this.f16453y0.zzA(q52)) && this.f16453y0.zzA(AbstractC2281am0.zzz(2, q52.zzA, q52.zzB))) {
            List listT0 = t0(rl0, q52, false, this.f16453y0);
            if (!listT0.isEmpty()) {
                if (zH) {
                    DL0 dl0 = (DL0) listT0.get(0);
                    boolean zZze = dl0.zze(q52);
                    if (zZze) {
                        z8 = true;
                    } else {
                        for (int i12 = 1; i12 < listT0.size(); i12++) {
                            DL0 dl02 = (DL0) listT0.get(i12);
                            if (dl02.zze(q52)) {
                                zZze = true;
                                z8 = false;
                                dl0 = dl02;
                                break;
                            }
                        }
                        z8 = true;
                    }
                    int i13 = true != zZze ? 3 : 4;
                    int i14 = 8;
                    if (zZze && dl0.zzf(q52)) {
                        i14 = 16;
                    }
                    return i13 | i14 | 32 | (true != dl0.zzg ? 0 : 64) | (true != z8 ? 0 : 128) | i8;
                }
                i9 = 2;
            }
        }
        return i9 | 128;
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final ME0 T(DL0 dl0, Q5 q52, Q5 q53) {
        int i8;
        int i9;
        ME0 me0Zzb = dl0.zzb(q52, q53);
        int i10 = me0Zzb.zze;
        if (F(q53)) {
            i10 |= 32768;
        }
        if (s0(dl0, q53) > this.f16454z0) {
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
        Q5 q52 = zf0.zza;
        q52.getClass();
        this.f16444C0 = q52;
        ME0 me0U = super.U(zf0);
        this.f16452x0.zzi(q52, me0U);
        return me0U;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x005e  */
    @Override // com.google.android.gms.internal.ads.PL0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.C4977yL0 X(com.google.android.gms.internal.ads.DL0 r8, com.google.android.gms.internal.ads.Q5 r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TK0.X(com.google.android.gms.internal.ads.DL0, com.google.android.gms.internal.ads.Q5, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.yL0");
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final List Y(RL0 rl0, Q5 q52, boolean z8) {
        return AbstractC3157iM0.zzg(t0(rl0, q52, false, this.f16453y0), q52);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    protected final void a() {
        this.f16453y0.zzk();
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void b0(BE0 be0) {
        Q5 q52;
        if (AbstractC2281am0.zza < 29 || (q52 = be0.zza) == null || !Objects.equals(q52.zzn, "audio/opus") || !E()) {
            return;
        }
        ByteBuffer byteBuffer = be0.zzf;
        byteBuffer.getClass();
        Q5 q53 = be0.zza;
        q53.getClass();
        if (byteBuffer.remaining() == 8) {
            this.f16453y0.zzr(q53.zzD, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0
    protected final void c() {
        this.f16450I0 = false;
        try {
            super.c();
            if (this.f16448G0) {
                this.f16448G0 = false;
                this.f16453y0.zzl();
            }
        } catch (Throwable th) {
            if (this.f16448G0) {
                this.f16448G0 = false;
                this.f16453y0.zzl();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void c0(Exception exc) {
        AbstractC2834fc0.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f16452x0.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    protected final void d() {
        this.f16453y0.zzi();
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void d0(String str, C4977yL0 c4977yL0, long j8, long j9) {
        this.f16452x0.zze(str, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    protected final void e() {
        u0();
        this.f16453y0.zzh();
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void e0(String str) {
        this.f16452x0.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void f0(Q5 q52, MediaFormat mediaFormat) throws WE0 {
        int i8;
        Q5 q53 = this.f16445D0;
        int[] iArr = null;
        boolean z8 = true;
        if (q53 != null) {
            q52 = q53;
        } else if (o0() != null) {
            mediaFormat.getClass();
            int iZzl = "audio/raw".equals(q52.zzn) ? q52.zzC : (AbstractC2281am0.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? AbstractC2281am0.zzl(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            O4 o42 = new O4();
            o42.zzX("audio/raw");
            o42.zzR(iZzl);
            o42.zzF(q52.zzD);
            o42.zzG(q52.zzE);
            o42.zzQ(q52.zzl);
            o42.zzK(q52.zzb);
            o42.zzM(q52.zzc);
            o42.zzN(q52.zzd);
            o42.zzO(q52.zze);
            o42.zzZ(q52.zzf);
            o42.zzV(q52.zzg);
            o42.zzy(mediaFormat.getInteger("channel-count"));
            o42.zzY(mediaFormat.getInteger("sample-rate"));
            Q5 q5Zzad = o42.zzad();
            if (this.f16442A0 && q5Zzad.zzA == 6 && (i8 = q52.zzA) < 6) {
                iArr = new int[i8];
                for (int i9 = 0; i9 < q52.zzA; i9++) {
                    iArr[i9] = i9;
                }
            } else if (this.f16443B0) {
                int i10 = q5Zzad.zzA;
                if (i10 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i10 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i10 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i10 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i10 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            q52 = q5Zzad;
        }
        try {
            int i11 = AbstractC2281am0.zza;
            if (i11 >= 29) {
                if (E()) {
                    p();
                }
                if (i11 < 29) {
                    z8 = false;
                }
                F10.zzf(z8);
            }
            this.f16453y0.zze(q52, 0, iArr);
        } catch (UJ0 e8) {
            throw o(e8, e8.zza, false, 5001);
        }
    }

    protected final void g0() {
        this.f16447F0 = true;
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void h0() {
        this.f16453y0.zzg();
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final void i0() throws WE0 {
        try {
            this.f16453y0.zzj();
        } catch (YJ0 e8) {
            throw o(e8, e8.zzc, e8.zzb, true != E() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final boolean j0(long j8, long j9, AL0 al0, ByteBuffer byteBuffer, int i8, int i9, int i10, long j10, boolean z8, boolean z9, Q5 q52) throws WE0 {
        byteBuffer.getClass();
        if (this.f16445D0 != null && (i9 & 2) != 0) {
            al0.getClass();
            al0.zzn(i8, false);
            return true;
        }
        if (z8) {
            if (al0 != null) {
                al0.zzn(i8, false);
            }
            this.f15307p0.zzf += i10;
            this.f16453y0.zzg();
            return true;
        }
        try {
            if (!this.f16453y0.zzx(byteBuffer, j10, i10)) {
                return false;
            }
            if (al0 != null) {
                al0.zzn(i8, false);
            }
            this.f15307p0.zze += i10;
            return true;
        } catch (VJ0 e8) {
            Q5 q53 = this.f16444C0;
            if (E()) {
                p();
            }
            throw o(e8, q53, e8.zzb, 5001);
        } catch (YJ0 e9) {
            if (E()) {
                p();
            }
            throw o(e9, q52, e9.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final boolean k0(Q5 q52) {
        p();
        return this.f16453y0.zzA(q52);
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0
    protected final void r() {
        this.f16448G0 = true;
        this.f16444C0 = null;
        try {
            this.f16453y0.zzf();
            super.r();
        } catch (Throwable th) {
            super.r();
            throw th;
        } finally {
            this.f16452x0.zzg(this.f15307p0);
        }
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0
    protected final void s(boolean z8, boolean z9) {
        super.s(z8, z9);
        this.f16452x0.zzh(this.f15307p0);
        p();
        this.f16453y0.zzt(q());
        this.f16453y0.zzp(n());
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0
    protected final void u(long j8, boolean z8) {
        super.u(j8, z8);
        this.f16453y0.zzf();
        this.f16446E0 = j8;
        this.f16450I0 = false;
        this.f16447F0 = true;
    }

    @Override // com.google.android.gms.internal.ads.PL0
    protected final float v(float f8, Q5 q52, Q5[] q5Arr) {
        int iMax = -1;
        for (Q5 q53 : q5Arr) {
            int i8 = q53.zzB;
            if (i8 != -1) {
                iMax = Math.max(iMax, i8);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f8;
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.GG0
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public final boolean zzW() {
        return super.zzW() && this.f16453y0.zzz();
    }

    @Override // com.google.android.gms.internal.ads.PL0, com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public final boolean zzX() {
        return this.f16453y0.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final long zza() {
        if (zzcU() == 2) {
            u0();
        }
        return this.f16446E0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final C2149Yx zzc() {
        return this.f16453y0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final void zzg(C2149Yx c2149Yx) {
        this.f16453y0.zzs(c2149Yx);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final boolean zzj() {
        boolean z8 = this.f16450I0;
        this.f16450I0 = false;
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0
    public final InterfaceC2800fG0 zzk() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.InterfaceC5081zG0
    public final void zzt(int i8, Object obj) {
        if (i8 == 2) {
            ZJ0 zj0 = this.f16453y0;
            obj.getClass();
            zj0.zzw(((Float) obj).floatValue());
            return;
        }
        if (i8 == 3) {
            C3940pF0 c3940pF0 = (C3940pF0) obj;
            ZJ0 zj02 = this.f16453y0;
            c3940pF0.getClass();
            zj02.zzm(c3940pF0);
            return;
        }
        if (i8 == 6) {
            RF0 rf0 = (RF0) obj;
            ZJ0 zj03 = this.f16453y0;
            rf0.getClass();
            zj03.zzo(rf0);
            return;
        }
        switch (i8) {
            case 9:
                ZJ0 zj04 = this.f16453y0;
                obj.getClass();
                zj04.zzv(((Boolean) obj).booleanValue());
                break;
            case 10:
                ZJ0 zj05 = this.f16453y0;
                obj.getClass();
                zj05.zzn(((Integer) obj).intValue());
                break;
            case 11:
                this.f16449H0 = (DG0) obj;
                break;
            case 12:
                if (AbstractC2281am0.zza >= 23) {
                    QK0.zza(this.f16453y0, obj);
                    break;
                }
                break;
        }
    }
}
