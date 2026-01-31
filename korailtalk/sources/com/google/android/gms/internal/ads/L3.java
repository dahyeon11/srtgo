package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class L3 implements InterfaceC2425c1 {

    /* renamed from: e0, reason: collision with root package name */
    private static final byte[] f14150e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f14151f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final byte[] f14152g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final UUID f14153h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final Map f14154i0;

    /* renamed from: A, reason: collision with root package name */
    private long f14155A;

    /* renamed from: B, reason: collision with root package name */
    private long f14156B;

    /* renamed from: C, reason: collision with root package name */
    private long f14157C;

    /* renamed from: D, reason: collision with root package name */
    private C1379Gc0 f14158D;

    /* renamed from: E, reason: collision with root package name */
    private C1379Gc0 f14159E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f14160F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f14161G;

    /* renamed from: H, reason: collision with root package name */
    private int f14162H;

    /* renamed from: I, reason: collision with root package name */
    private long f14163I;

    /* renamed from: J, reason: collision with root package name */
    private long f14164J;

    /* renamed from: K, reason: collision with root package name */
    private int f14165K;

    /* renamed from: L, reason: collision with root package name */
    private int f14166L;

    /* renamed from: M, reason: collision with root package name */
    private int[] f14167M;

    /* renamed from: N, reason: collision with root package name */
    private int f14168N;

    /* renamed from: O, reason: collision with root package name */
    private int f14169O;

    /* renamed from: P, reason: collision with root package name */
    private int f14170P;

    /* renamed from: Q, reason: collision with root package name */
    private int f14171Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f14172R;

    /* renamed from: S, reason: collision with root package name */
    private long f14173S;

    /* renamed from: T, reason: collision with root package name */
    private int f14174T;

    /* renamed from: U, reason: collision with root package name */
    private int f14175U;

    /* renamed from: V, reason: collision with root package name */
    private int f14176V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f14177W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f14178X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f14179Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f14180Z;

    /* renamed from: a, reason: collision with root package name */
    private final G3 f14181a;

    /* renamed from: a0, reason: collision with root package name */
    private byte f14182a0;

    /* renamed from: b, reason: collision with root package name */
    private final O3 f14183b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f14184b0;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f14185c;

    /* renamed from: c0, reason: collision with root package name */
    private InterfaceC2769f1 f14186c0;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14187d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3122i5 f14188e;

    /* renamed from: f, reason: collision with root package name */
    private final C4099qh0 f14189f;

    /* renamed from: g, reason: collision with root package name */
    private final C4099qh0 f14190g;

    /* renamed from: h, reason: collision with root package name */
    private final C4099qh0 f14191h;

    /* renamed from: i, reason: collision with root package name */
    private final C4099qh0 f14192i;

    /* renamed from: j, reason: collision with root package name */
    private final C4099qh0 f14193j;

    /* renamed from: k, reason: collision with root package name */
    private final C4099qh0 f14194k;

    /* renamed from: l, reason: collision with root package name */
    private final C4099qh0 f14195l;

    /* renamed from: m, reason: collision with root package name */
    private final C4099qh0 f14196m;

    /* renamed from: n, reason: collision with root package name */
    private final C4099qh0 f14197n;

    /* renamed from: o, reason: collision with root package name */
    private final C4099qh0 f14198o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f14199p;

    /* renamed from: q, reason: collision with root package name */
    private long f14200q;

    /* renamed from: r, reason: collision with root package name */
    private long f14201r;

    /* renamed from: s, reason: collision with root package name */
    private long f14202s;

    /* renamed from: t, reason: collision with root package name */
    private long f14203t;

    /* renamed from: u, reason: collision with root package name */
    private long f14204u;

    /* renamed from: v, reason: collision with root package name */
    private K3 f14205v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14206w;

    /* renamed from: x, reason: collision with root package name */
    private int f14207x;

    /* renamed from: y, reason: collision with root package name */
    private long f14208y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f14209z;

    @Deprecated
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.H3
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new L3(InterfaceC3122i5.zza, 2)};
        }
    };

    /* renamed from: d0, reason: collision with root package name */
    private static final byte[] f14149d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    static {
        int i8 = AbstractC2281am0.zza;
        f14150e0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AbstractC3647mj0.zzc);
        f14151f0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f14152g0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f14153h0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f14154i0 = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public L3() {
        this(new E3(), 2, InterfaceC3122i5.zza);
    }

    private final int j(InterfaceC2540d1 interfaceC2540d1, K3 k32, int i8, boolean z8) throws C1901Sv, EOFException, InterruptedIOException {
        int i9;
        if ("S_TEXT/UTF8".equals(k32.zzb)) {
            r(interfaceC2540d1, f14149d0, i8);
            int i10 = this.f14175U;
            q();
            return i10;
        }
        if ("S_TEXT/ASS".equals(k32.zzb)) {
            r(interfaceC2540d1, f14151f0, i8);
            int i11 = this.f14175U;
            q();
            return i11;
        }
        if ("S_TEXT/WEBVTT".equals(k32.zzb)) {
            r(interfaceC2540d1, f14152g0, i8);
            int i12 = this.f14175U;
            q();
            return i12;
        }
        K1 k12 = k32.zzW;
        if (!this.f14177W) {
            if (k32.zzg) {
                this.f14170P &= -1073741825;
                if (!this.f14178X) {
                    ((Q0) interfaceC2540d1).zzn(this.f14191h.zzM(), 0, 1, false);
                    this.f14174T++;
                    if ((this.f14191h.zzM()[0] & 128) == 128) {
                        throw C1901Sv.zza("Extension bit is set in signal byte", null);
                    }
                    this.f14182a0 = this.f14191h.zzM()[0];
                    this.f14178X = true;
                }
                byte b9 = this.f14182a0;
                if ((b9 & 1) == 1) {
                    int i13 = b9 & 2;
                    this.f14170P |= 1073741824;
                    if (!this.f14184b0) {
                        ((Q0) interfaceC2540d1).zzn(this.f14196m.zzM(), 0, 8, false);
                        this.f14174T += 8;
                        this.f14184b0 = true;
                        this.f14191h.zzM()[0] = (byte) ((i13 != 2 ? 0 : 128) | 8);
                        this.f14191h.zzK(0);
                        k12.zzr(this.f14191h, 1, 1);
                        this.f14175U++;
                        this.f14196m.zzK(0);
                        k12.zzr(this.f14196m, 8, 1);
                        this.f14175U += 8;
                    }
                    if (i13 == 2) {
                        if (!this.f14179Y) {
                            ((Q0) interfaceC2540d1).zzn(this.f14191h.zzM(), 0, 1, false);
                            this.f14174T++;
                            this.f14191h.zzK(0);
                            this.f14180Z = this.f14191h.zzm();
                            this.f14179Y = true;
                        }
                        int i14 = this.f14180Z * 4;
                        this.f14191h.zzH(i14);
                        ((Q0) interfaceC2540d1).zzn(this.f14191h.zzM(), 0, i14, false);
                        this.f14174T += i14;
                        int i15 = (this.f14180Z >> 1) + 1;
                        int i16 = (i15 * 6) + 2;
                        ByteBuffer byteBuffer = this.f14199p;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f14199p = ByteBuffer.allocate(i16);
                        }
                        this.f14199p.position(0);
                        this.f14199p.putShort((short) i15);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i9 = this.f14180Z;
                            if (i17 >= i9) {
                                break;
                            }
                            int iZzp = this.f14191h.zzp();
                            int i19 = iZzp - i18;
                            if (i17 % 2 == 0) {
                                this.f14199p.putShort((short) i19);
                            } else {
                                this.f14199p.putInt(i19);
                            }
                            i17++;
                            i18 = iZzp;
                        }
                        int i20 = (i8 - this.f14174T) - i18;
                        if ((i9 & 1) == 1) {
                            this.f14199p.putInt(i20);
                        } else {
                            this.f14199p.putShort((short) i20);
                            this.f14199p.putInt(0);
                        }
                        this.f14197n.zzI(this.f14199p.array(), i16);
                        k12.zzr(this.f14197n, i16, 1);
                        this.f14175U += i16;
                    }
                }
            } else {
                byte[] bArr = k32.zzh;
                if (bArr != null) {
                    this.f14194k.zzI(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(k32.zzb) ? k32.zzf > 0 : z8) {
                this.f14170P |= 268435456;
                this.f14198o.zzH(0);
                int iZze = (this.f14194k.zze() + i8) - this.f14174T;
                this.f14191h.zzH(4);
                this.f14191h.zzM()[0] = (byte) ((iZze >> 24) & 255);
                this.f14191h.zzM()[1] = (byte) ((iZze >> 16) & 255);
                this.f14191h.zzM()[2] = (byte) ((iZze >> 8) & 255);
                this.f14191h.zzM()[3] = (byte) (iZze & 255);
                k12.zzr(this.f14191h, 4, 2);
                this.f14175U += 4;
            }
            this.f14177W = true;
        }
        int iZze2 = i8 + this.f14194k.zze();
        if (!"V_MPEG4/ISO/AVC".equals(k32.zzb) && !"V_MPEGH/ISO/HEVC".equals(k32.zzb)) {
            if (k32.zzT != null) {
                F10.zzf(this.f14194k.zze() == 0);
                k32.zzT.zzd(interfaceC2540d1);
            }
            while (true) {
                int i21 = this.f14174T;
                if (i21 >= iZze2) {
                    break;
                }
                int iK = k(interfaceC2540d1, k12, iZze2 - i21);
                this.f14174T += iK;
                this.f14175U += iK;
            }
        } else {
            byte[] bArrZzM = this.f14190g.zzM();
            bArrZzM[0] = 0;
            bArrZzM[1] = 0;
            bArrZzM[2] = 0;
            int i22 = k32.zzX;
            int i23 = 4 - i22;
            while (this.f14174T < iZze2) {
                int i24 = this.f14176V;
                if (i24 == 0) {
                    int iMin = Math.min(i22, this.f14194k.zzb());
                    ((Q0) interfaceC2540d1).zzn(bArrZzM, i23 + iMin, i22 - iMin, false);
                    if (iMin > 0) {
                        this.f14194k.zzG(bArrZzM, i23, iMin);
                    }
                    this.f14174T += i22;
                    this.f14190g.zzK(0);
                    this.f14176V = this.f14190g.zzp();
                    this.f14189f.zzK(0);
                    H1.zzb(k12, this.f14189f, 4);
                    this.f14175U += 4;
                } else {
                    int iK2 = k(interfaceC2540d1, k12, i24);
                    this.f14174T += iK2;
                    this.f14175U += iK2;
                    this.f14176V -= iK2;
                }
            }
        }
        if ("A_VORBIS".equals(k32.zzb)) {
            this.f14192i.zzK(0);
            H1.zzb(k12, this.f14192i, 4);
            this.f14175U += 4;
        }
        int i25 = this.f14175U;
        q();
        return i25;
    }

    private final int k(InterfaceC2540d1 interfaceC2540d1, K1 k12, int i8) {
        int iZzb = this.f14194k.zzb();
        if (iZzb <= 0) {
            return H1.zza(k12, interfaceC2540d1, i8, false);
        }
        int iMin = Math.min(i8, iZzb);
        H1.zzb(k12, this.f14194k, iMin);
        return iMin;
    }

    private final long l(long j8) throws C1901Sv {
        long j9 = this.f14202s;
        if (j9 != -9223372036854775807L) {
            return AbstractC2281am0.zzt(j8, j9, 1000L, RoundingMode.FLOOR);
        }
        throw C1901Sv.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void m(int i8) throws C1901Sv {
        if (this.f14158D == null || this.f14159E == null) {
            throw C1901Sv.zza("Element " + i8 + " must be in a Cues", null);
        }
    }

    private final void n(int i8) throws C1901Sv {
        if (this.f14205v != null) {
            return;
        }
        throw C1901Sv.zza("Element " + i8 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 BREAK  A[LOOP:0: B:45:0x00c5->B:50:0x00dd], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void o(com.google.android.gms.internal.ads.K3 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.L3.o(com.google.android.gms.internal.ads.K3, long, int, int, int):void");
    }

    private final void p(InterfaceC2540d1 interfaceC2540d1, int i8) throws EOFException, InterruptedIOException {
        if (this.f14191h.zze() >= i8) {
            return;
        }
        if (this.f14191h.zzc() < i8) {
            C4099qh0 c4099qh0 = this.f14191h;
            int iZzc = c4099qh0.zzc();
            c4099qh0.zzE(Math.max(iZzc + iZzc, i8));
        }
        C4099qh0 c4099qh02 = this.f14191h;
        ((Q0) interfaceC2540d1).zzn(c4099qh02.zzM(), c4099qh02.zze(), i8 - c4099qh02.zze(), false);
        this.f14191h.zzJ(i8);
    }

    private final void q() {
        this.f14174T = 0;
        this.f14175U = 0;
        this.f14176V = 0;
        this.f14177W = false;
        this.f14178X = false;
        this.f14179Y = false;
        this.f14180Z = 0;
        this.f14182a0 = (byte) 0;
        this.f14184b0 = false;
        this.f14194k.zzH(0);
    }

    private final void r(InterfaceC2540d1 interfaceC2540d1, byte[] bArr, int i8) throws EOFException, InterruptedIOException {
        int length = bArr.length;
        int i9 = length + i8;
        if (this.f14195l.zzc() < i9) {
            C4099qh0 c4099qh0 = this.f14195l;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i9 + i8);
            c4099qh0.zzI(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f14195l.zzM(), 0, length);
        }
        ((Q0) interfaceC2540d1).zzn(this.f14195l.zzM(), length, i8, false);
        this.f14195l.zzK(0);
        this.f14195l.zzJ(i9);
    }

    private static byte[] s(long j8, String str, long j9) {
        F10.zzd(j8 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i8 = (int) (j8 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i8);
        long j10 = j8 - (i8 * 3600000000L);
        int i9 = (int) (j10 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i9);
        long j11 = j10 - (i9 * 60000000);
        int i10 = (int) (j11 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i10), Integer.valueOf((int) ((j11 - (i10 * 1000000)) / j9)));
        int i11 = AbstractC2281am0.zza;
        return str2.getBytes(AbstractC3647mj0.zzc);
    }

    private static int[] t(int[] iArr, int i8) {
        if (iArr == null) {
            return new int[i8];
        }
        int length = iArr.length;
        return length >= i8 ? iArr : new int[Math.max(length + length, i8)];
    }

    protected final void c(int i8, int i9, InterfaceC2540d1 interfaceC2540d1) {
        int i10;
        long j8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i8;
        Throwable th = null;
        int i17 = 1;
        if (i16 != 161 && i16 != 163) {
            if (i16 == 165) {
                if (this.f14162H != 2) {
                    return;
                }
                K3 k32 = (K3) this.f14185c.get(this.f14168N);
                if (this.f14171Q != 4 || !"V_VP9".equals(k32.zzb)) {
                    ((Q0) interfaceC2540d1).zzo(i9, false);
                    return;
                }
                this.f14198o.zzH(i9);
                ((Q0) interfaceC2540d1).zzn(this.f14198o.zzM(), 0, i9, false);
                return;
            }
            if (i16 == 16877) {
                n(i8);
                K3 k33 = this.f14205v;
                if (k33.f13723a != 1685485123 && k33.f13723a != 1685480259) {
                    ((Q0) interfaceC2540d1).zzo(i9, false);
                    return;
                }
                byte[] bArr = new byte[i9];
                k33.zzN = bArr;
                ((Q0) interfaceC2540d1).zzn(bArr, 0, i9, false);
                return;
            }
            if (i16 == 16981) {
                n(i8);
                byte[] bArr2 = new byte[i9];
                this.f14205v.zzh = bArr2;
                ((Q0) interfaceC2540d1).zzn(bArr2, 0, i9, false);
                return;
            }
            if (i16 == 18402) {
                byte[] bArr3 = new byte[i9];
                ((Q0) interfaceC2540d1).zzn(bArr3, 0, i9, false);
                n(i8);
                this.f14205v.zzi = new I1(1, bArr3, 0, 0);
                return;
            }
            if (i16 == 21419) {
                Arrays.fill(this.f14193j.zzM(), (byte) 0);
                ((Q0) interfaceC2540d1).zzn(this.f14193j.zzM(), 4 - i9, i9, false);
                this.f14193j.zzK(0);
                this.f14207x = (int) this.f14193j.zzu();
                return;
            }
            if (i16 == 25506) {
                n(i8);
                byte[] bArr4 = new byte[i9];
                this.f14205v.zzj = bArr4;
                ((Q0) interfaceC2540d1).zzn(bArr4, 0, i9, false);
                return;
            }
            if (i16 != 30322) {
                throw C1901Sv.zza("Unexpected id: " + i16, null);
            }
            n(i8);
            byte[] bArr5 = new byte[i9];
            this.f14205v.zzv = bArr5;
            ((Q0) interfaceC2540d1).zzn(bArr5, 0, i9, false);
            return;
        }
        if (this.f14162H == 0) {
            this.f14168N = (int) this.f14183b.zzd(interfaceC2540d1, false, true, 8);
            this.f14169O = this.f14183b.zza();
            this.f14164J = -9223372036854775807L;
            this.f14162H = 1;
            this.f14191h.zzH(0);
        }
        K3 k34 = (K3) this.f14185c.get(this.f14168N);
        if (k34 == null) {
            ((Q0) interfaceC2540d1).zzo(i9 - this.f14169O, false);
            this.f14162H = 0;
            return;
        }
        k34.zzW.getClass();
        if (this.f14162H == 1) {
            p(interfaceC2540d1, 3);
            int i18 = (this.f14191h.zzM()[2] & 6) >> 1;
            byte b9 = 255;
            if (i18 == 0) {
                this.f14166L = 1;
                int[] iArrT = t(this.f14167M, 1);
                this.f14167M = iArrT;
                iArrT[0] = (i9 - this.f14169O) - 3;
            } else {
                p(interfaceC2540d1, 4);
                int i19 = (this.f14191h.zzM()[3] & 255) + 1;
                this.f14166L = i19;
                int[] iArrT2 = t(this.f14167M, i19);
                this.f14167M = iArrT2;
                if (i18 == 2) {
                    int i20 = (i9 - this.f14169O) - 4;
                    int i21 = this.f14166L;
                    Arrays.fill(iArrT2, 0, i21, i20 / i21);
                } else {
                    if (i18 != 1) {
                        if (i18 != 3) {
                            throw C1901Sv.zza("Unexpected lacing value: 2", null);
                        }
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = 4;
                        while (true) {
                            int i25 = this.f14166L - 1;
                            if (i22 >= i25) {
                                this.f14167M[i25] = ((i9 - this.f14169O) - i24) - i23;
                                break;
                            }
                            this.f14167M[i22] = 0;
                            int i26 = i24 + 1;
                            p(interfaceC2540d1, i26);
                            if (this.f14191h.zzM()[i24] == 0) {
                                throw C1901Sv.zza("No valid varint length mask found", th);
                            }
                            int i27 = 0;
                            while (true) {
                                if (i27 >= 8) {
                                    j8 = 0;
                                    i11 = i26;
                                    break;
                                }
                                int i28 = i17 << (7 - i27);
                                if ((this.f14191h.zzM()[i24] & i28) != 0) {
                                    int i29 = i26 + i27;
                                    p(interfaceC2540d1, i29);
                                    j8 = this.f14191h.zzM()[i24] & b9 & (~i28);
                                    int i30 = i24 + 1;
                                    while (i30 < i29) {
                                        j8 = (j8 << 8) | (this.f14191h.zzM()[i30] & b9);
                                        i30++;
                                        i29 = i29;
                                        b9 = 255;
                                    }
                                    i11 = i29;
                                    if (i22 > 0) {
                                        j8 -= (1 << ((i27 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i27++;
                                    i17 = 1;
                                    b9 = 255;
                                }
                            }
                            if (j8 < -2147483648L || j8 > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.f14167M;
                            int i31 = (int) j8;
                            if (i22 != 0) {
                                i31 += iArr[i22 - 1];
                            }
                            iArr[i22] = i31;
                            i23 += i31;
                            i22++;
                            i24 = i11;
                            th = null;
                            i17 = 1;
                            b9 = 255;
                        }
                        throw C1901Sv.zza("EBML lacing sample size out of range.", null);
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i12 = this.f14166L - 1;
                        if (i32 >= i12) {
                            break;
                        }
                        this.f14167M[i32] = 0;
                        while (true) {
                            i13 = i34 + 1;
                            p(interfaceC2540d1, i13);
                            int i35 = this.f14191h.zzM()[i34] & 255;
                            int[] iArr2 = this.f14167M;
                            i14 = iArr2[i32] + i35;
                            iArr2[i32] = i14;
                            if (i35 != 255) {
                                break;
                            } else {
                                i34 = i13;
                            }
                        }
                        i33 += i14;
                        i32++;
                        i34 = i13;
                    }
                    this.f14167M[i12] = ((i9 - this.f14169O) - i34) - i33;
                }
            }
            this.f14163I = this.f14157C + l((this.f14191h.zzM()[0] << 8) | (this.f14191h.zzM()[1] & 255));
            if (k34.zzd == 2) {
                i15 = 1;
                this.f14170P = i15;
                this.f14162H = 2;
                this.f14165K = 0;
                i10 = 163;
            } else {
                if (i16 != 163) {
                    i15 = 0;
                } else if ((this.f14191h.zzM()[2] & 128) == 128) {
                    i16 = 163;
                    i15 = 1;
                } else {
                    i15 = 0;
                    i16 = 163;
                }
                this.f14170P = i15;
                this.f14162H = 2;
                this.f14165K = 0;
                i10 = 163;
            }
        } else {
            i10 = 163;
        }
        if (i16 == i10) {
            while (true) {
                int i36 = this.f14165K;
                if (i36 >= this.f14166L) {
                    this.f14162H = 0;
                    return;
                }
                o(k34, ((this.f14165K * k34.zze) / 1000) + this.f14163I, this.f14170P, j(interfaceC2540d1, k34, this.f14167M[i36], false), 0);
                this.f14165K++;
            }
        } else {
            while (true) {
                int i37 = this.f14165K;
                if (i37 >= this.f14166L) {
                    return;
                }
                int[] iArr3 = this.f14167M;
                iArr3[i37] = j(interfaceC2540d1, k34, iArr3[i37], true);
                this.f14165K++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0313  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void d(int r22) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.L3.d(int):void");
    }

    protected final void e(int i8, double d9) {
        if (i8 == 181) {
            n(i8);
            this.f14205v.zzQ = (int) d9;
            return;
        }
        if (i8 == 17545) {
            this.f14203t = (long) d9;
            return;
        }
        switch (i8) {
            case 21969:
                n(i8);
                this.f14205v.zzD = (float) d9;
                break;
            case 21970:
                n(i8);
                this.f14205v.zzE = (float) d9;
                break;
            case 21971:
                n(i8);
                this.f14205v.zzF = (float) d9;
                break;
            case 21972:
                n(i8);
                this.f14205v.zzG = (float) d9;
                break;
            case 21973:
                n(i8);
                this.f14205v.zzH = (float) d9;
                break;
            case 21974:
                n(i8);
                this.f14205v.zzI = (float) d9;
                break;
            case 21975:
                n(i8);
                this.f14205v.zzJ = (float) d9;
                break;
            case 21976:
                n(i8);
                this.f14205v.zzK = (float) d9;
                break;
            case 21977:
                n(i8);
                this.f14205v.zzL = (float) d9;
                break;
            case 21978:
                n(i8);
                this.f14205v.zzM = (float) d9;
                break;
            default:
                switch (i8) {
                    case 30323:
                        n(i8);
                        this.f14205v.zzs = (float) d9;
                        break;
                    case 30324:
                        n(i8);
                        this.f14205v.zzt = (float) d9;
                        break;
                    case 30325:
                        n(i8);
                        this.f14205v.zzu = (float) d9;
                        break;
                }
        }
    }

    protected final void f(int i8, long j8) {
        boolean z8;
        if (i8 == 20529) {
            if (j8 == 0) {
                return;
            }
            throw C1901Sv.zza("ContentEncodingOrder " + j8 + " not supported", null);
        }
        if (i8 == 20530) {
            if (j8 == 1) {
                return;
            }
            throw C1901Sv.zza("ContentEncodingScope " + j8 + " not supported", null);
        }
        switch (i8) {
            case 131:
                n(i8);
                this.f14205v.zzd = (int) j8;
                return;
            case 136:
                z8 = j8 == 1;
                n(i8);
                this.f14205v.zzV = z8;
                return;
            case 155:
                this.f14164J = l(j8);
                return;
            case 159:
                n(i8);
                this.f14205v.zzO = (int) j8;
                return;
            case 176:
                n(i8);
                this.f14205v.zzl = (int) j8;
                return;
            case 179:
                m(i8);
                this.f14158D.zzc(l(j8));
                return;
            case 186:
                n(i8);
                this.f14205v.zzm = (int) j8;
                return;
            case 215:
                n(i8);
                this.f14205v.zzc = (int) j8;
                return;
            case 231:
                this.f14157C = l(j8);
                return;
            case 238:
                this.f14171Q = (int) j8;
                return;
            case 241:
                if (this.f14160F) {
                    return;
                }
                m(i8);
                this.f14159E.zzc(j8);
                this.f14160F = true;
                return;
            case 251:
                this.f14172R = true;
                return;
            case 16871:
                n(i8);
                this.f14205v.f13723a = (int) j8;
                return;
            case 16980:
                if (j8 == 3) {
                    return;
                }
                throw C1901Sv.zza("ContentCompAlgo " + j8 + " not supported", null);
            case 17029:
                if (j8 < 1 || j8 > 2) {
                    throw C1901Sv.zza("DocTypeReadVersion " + j8 + " not supported", null);
                }
                return;
            case 17143:
                if (j8 == 1) {
                    return;
                }
                throw C1901Sv.zza("EBMLReadVersion " + j8 + " not supported", null);
            case 18401:
                if (j8 == 5) {
                    return;
                }
                throw C1901Sv.zza("ContentEncAlgo " + j8 + " not supported", null);
            case 18408:
                if (j8 == 1) {
                    return;
                }
                throw C1901Sv.zza("AESSettingsCipherMode " + j8 + " not supported", null);
            case 21420:
                this.f14208y = j8 + this.f14201r;
                return;
            case 21432:
                int i9 = (int) j8;
                n(i8);
                if (i9 == 0) {
                    this.f14205v.zzw = 0;
                    return;
                }
                if (i9 == 1) {
                    this.f14205v.zzw = 2;
                    return;
                } else if (i9 == 3) {
                    this.f14205v.zzw = 1;
                    return;
                } else {
                    if (i9 != 15) {
                        return;
                    }
                    this.f14205v.zzw = 3;
                    return;
                }
            case 21680:
                n(i8);
                this.f14205v.zzo = (int) j8;
                return;
            case 21682:
                n(i8);
                this.f14205v.zzq = (int) j8;
                return;
            case 21690:
                n(i8);
                this.f14205v.zzp = (int) j8;
                return;
            case 21930:
                z8 = j8 == 1;
                n(i8);
                this.f14205v.zzU = z8;
                return;
            case 21938:
                n(i8);
                K3 k32 = this.f14205v;
                k32.zzx = true;
                k32.zzn = (int) j8;
                return;
            case 21998:
                n(i8);
                this.f14205v.zzf = (int) j8;
                return;
            case 22186:
                n(i8);
                this.f14205v.zzR = j8;
                return;
            case 22203:
                n(i8);
                this.f14205v.zzS = j8;
                return;
            case 25188:
                n(i8);
                this.f14205v.zzP = (int) j8;
                return;
            case 30114:
                this.f14173S = j8;
                return;
            case 30321:
                int i10 = (int) j8;
                n(i8);
                if (i10 == 0) {
                    this.f14205v.zzr = 0;
                    return;
                }
                if (i10 == 1) {
                    this.f14205v.zzr = 1;
                    return;
                } else if (i10 == 2) {
                    this.f14205v.zzr = 2;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f14205v.zzr = 3;
                    return;
                }
            case 2352003:
                n(i8);
                this.f14205v.zze = (int) j8;
                return;
            case 2807729:
                this.f14202s = j8;
                return;
            default:
                switch (i8) {
                    case 21945:
                        int i11 = (int) j8;
                        n(i8);
                        if (i11 == 1) {
                            this.f14205v.zzA = 2;
                            return;
                        } else {
                            if (i11 != 2) {
                                return;
                            }
                            this.f14205v.zzA = 1;
                            return;
                        }
                    case 21946:
                        n(i8);
                        int iZzb = C3724nL0.zzb((int) j8);
                        if (iZzb != -1) {
                            this.f14205v.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21947:
                        n(i8);
                        this.f14205v.zzx = true;
                        int iZza = C3724nL0.zza((int) j8);
                        if (iZza != -1) {
                            this.f14205v.zzy = iZza;
                            return;
                        }
                        return;
                    case 21948:
                        n(i8);
                        this.f14205v.zzB = (int) j8;
                        return;
                    case 21949:
                        n(i8);
                        this.f14205v.zzC = (int) j8;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void g(int i8, long j8, long j9) {
        F10.zzb(this.f14186c0);
        if (i8 == 160) {
            this.f14172R = false;
            this.f14173S = 0L;
            return;
        }
        if (i8 == 174) {
            this.f14205v = new K3();
            return;
        }
        if (i8 == 187) {
            this.f14160F = false;
            return;
        }
        if (i8 == 19899) {
            this.f14207x = -1;
            this.f14208y = -1L;
            return;
        }
        if (i8 == 20533) {
            n(i8);
            this.f14205v.zzg = true;
            return;
        }
        if (i8 == 21968) {
            n(i8);
            this.f14205v.zzx = true;
            return;
        }
        if (i8 == 408125543) {
            long j10 = this.f14201r;
            if (j10 != -1 && j10 != j8) {
                throw C1901Sv.zza("Multiple Segment elements not supported", null);
            }
            this.f14201r = j8;
            this.f14200q = j9;
            return;
        }
        if (i8 == 475249515) {
            this.f14158D = new C1379Gc0(32);
            this.f14159E = new C1379Gc0(32);
        } else if (i8 == 524531317 && !this.f14206w) {
            if (this.f14187d && this.f14155A != -1) {
                this.f14209z = true;
            } else {
                this.f14186c0.zzO(new B1(this.f14204u, 0L));
                this.f14206w = true;
            }
        }
    }

    protected final void h(int i8, String str) {
        if (i8 == 134) {
            n(i8);
            this.f14205v.zzb = str;
            return;
        }
        if (i8 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw C1901Sv.zza("DocType " + str + " not supported", null);
        }
        if (i8 == 21358) {
            n(i8);
            this.f14205v.zza = str;
        } else {
            if (i8 != 2274716) {
                return;
            }
            n(i8);
            this.f14205v.f13724b = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) {
        this.f14161G = false;
        while (!this.f14161G) {
            if (!this.f14181a.zzc(interfaceC2540d1)) {
                for (int i8 = 0; i8 < this.f14185c.size(); i8++) {
                    K3 k32 = (K3) this.f14185c.valueAt(i8);
                    k32.zzW.getClass();
                    L1 l12 = k32.zzT;
                    if (l12 != null) {
                        l12.zza(k32.zzW, k32.zzi);
                    }
                }
                return -1;
            }
            long jZzf = interfaceC2540d1.zzf();
            if (this.f14209z) {
                this.f14156B = jZzf;
                c5050z1.zza = this.f14155A;
                this.f14209z = false;
                return 1;
            }
            if (this.f14206w) {
                long j8 = this.f14156B;
                if (j8 != -1) {
                    c5050z1.zza = j8;
                    this.f14156B = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f14186c0 = interfaceC2769f1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f14157C = -9223372036854775807L;
        this.f14162H = 0;
        this.f14181a.zzb();
        this.f14183b.zze();
        q();
        for (int i8 = 0; i8 < this.f14185c.size(); i8++) {
            L1 l12 = ((K3) this.f14185c.valueAt(i8)).zzT;
            if (l12 != null) {
                l12.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) {
        return new M3().zza(interfaceC2540d1);
    }

    L3(G3 g32, int i8, InterfaceC3122i5 interfaceC3122i5) {
        this.f14201r = -1L;
        this.f14202s = -9223372036854775807L;
        this.f14203t = -9223372036854775807L;
        this.f14204u = -9223372036854775807L;
        this.f14155A = -1L;
        this.f14156B = -1L;
        this.f14157C = -9223372036854775807L;
        this.f14181a = g32;
        g32.zza(new J3(this, null));
        this.f14188e = interfaceC3122i5;
        this.f14187d = true;
        this.f14183b = new O3();
        this.f14185c = new SparseArray();
        this.f14191h = new C4099qh0(4);
        this.f14192i = new C4099qh0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f14193j = new C4099qh0(4);
        this.f14189f = new C4099qh0(AbstractC5148zt0.zza);
        this.f14190g = new C4099qh0(4);
        this.f14194k = new C4099qh0();
        this.f14195l = new C4099qh0();
        this.f14196m = new C4099qh0(8);
        this.f14197n = new C4099qh0();
        this.f14198o = new C4099qh0();
        this.f14167M = new int[1];
    }

    public L3(InterfaceC3122i5 interfaceC3122i5, int i8) {
        this(new E3(), 2, interfaceC3122i5);
    }
}
