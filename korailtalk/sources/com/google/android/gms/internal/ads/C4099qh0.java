package com.google.android.gms.internal.ads;

import Q7.C0712p;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.qh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4099qh0 {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f21975d = {C0712p.CR, '\n'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f21976e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC2967gl0 f21977f = AbstractC2967gl0.zzr(AbstractC3647mj0.zza, AbstractC3647mj0.zzc, AbstractC3647mj0.zzf, AbstractC3647mj0.zzd, AbstractC3647mj0.zze);

    /* renamed from: a, reason: collision with root package name */
    private byte[] f21978a;

    /* renamed from: b, reason: collision with root package name */
    private int f21979b;

    /* renamed from: c, reason: collision with root package name */
    private int f21980c;

    public C4099qh0(byte[] bArr, int i8) {
        this.f21978a = bArr;
        this.f21980c = i8;
    }

    private final char a(Charset charset, char[] cArr) {
        int iB = b(charset);
        if (iB != 0) {
            int i8 = iB >> 16;
            for (char c9 : cArr) {
                char c10 = (char) i8;
                if (c9 == c10) {
                    this.f21979b += (char) iB;
                    return c10;
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int b(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.AbstractC3647mj0.zzc
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 != 0) goto L11
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.AbstractC3647mj0.zza
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L25
        L11:
            int r0 = r4.f21980c
            int r2 = r4.f21979b
            int r0 = r0 - r2
            if (r0 <= 0) goto L25
            byte[] r5 = r4.f21978a
            r5 = r5[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r2 = (long) r5
            char r5 = com.google.android.gms.internal.ads.AbstractC5020ym0.zza(r2)
            byte r5 = (byte) r5
            goto L67
        L25:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.AbstractC3647mj0.zzf
            boolean r0 = r5.equals(r0)
            r2 = 2
            if (r0 != 0) goto L36
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.AbstractC3647mj0.zzd
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4b
        L36:
            int r0 = r4.f21980c
            int r3 = r4.f21979b
            int r0 = r0 - r3
            if (r0 < r2) goto L4b
            byte[] r5 = r4.f21978a
            r0 = r5[r3]
            int r3 = r3 + r1
            r5 = r5[r3]
            char r5 = com.google.android.gms.internal.ads.AbstractC5020ym0.zzb(r0, r5)
        L48:
            byte r5 = (byte) r5
            r1 = r2
            goto L67
        L4b:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.AbstractC3647mj0.zze
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L70
            int r5 = r4.f21980c
            int r0 = r4.f21979b
            int r5 = r5 - r0
            if (r5 < r2) goto L70
            byte[] r5 = r4.f21978a
            int r1 = r0 + 1
            r1 = r5[r1]
            r5 = r5[r0]
            char r5 = com.google.android.gms.internal.ads.AbstractC5020ym0.zzb(r1, r5)
            goto L48
        L67:
            long r2 = (long) r5
            char r5 = com.google.android.gms.internal.ads.AbstractC5020ym0.zza(r2)
            int r5 = r5 << 16
            int r5 = r5 + r1
            return r5
        L70:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4099qh0.b(java.nio.charset.Charset):int");
    }

    public final String zzA(int i8, Charset charset) {
        byte[] bArr = this.f21978a;
        int i9 = this.f21979b;
        String str = new String(bArr, i9, i8, charset);
        this.f21979b = i9 + i8;
        return str;
    }

    public final Charset zzB() {
        int i8 = this.f21980c;
        int i9 = this.f21979b;
        int i10 = i8 - i9;
        if (i10 >= 3) {
            byte[] bArr = this.f21978a;
            if (bArr[i9] == -17 && bArr[i9 + 1] == -69 && bArr[i9 + 2] == -65) {
                this.f21979b = i9 + 3;
                return AbstractC3647mj0.zzc;
            }
        }
        if (i10 < 2) {
            return null;
        }
        byte[] bArr2 = this.f21978a;
        byte b9 = bArr2[i9];
        if (b9 == -2) {
            if (bArr2[i9 + 1] != -1) {
                return null;
            }
            this.f21979b = i9 + 2;
            return AbstractC3647mj0.zzd;
        }
        if (b9 != -1 || bArr2[i9 + 1] != -2) {
            return null;
        }
        this.f21979b = i9 + 2;
        return AbstractC3647mj0.zze;
    }

    public final short zzC() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        int i10 = bArr[i8] & 255;
        this.f21979b = i8 + 2;
        return (short) (((bArr[i9] & 255) << 8) | i10);
    }

    public final short zzD() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        int i10 = bArr[i8] & 255;
        this.f21979b = i8 + 2;
        return (short) ((bArr[i9] & 255) | (i10 << 8));
    }

    public final void zzE(int i8) {
        byte[] bArr = this.f21978a;
        if (i8 > bArr.length) {
            this.f21978a = Arrays.copyOf(bArr, i8);
        }
    }

    public final void zzF(C1755Pg0 c1755Pg0, int i8) {
        zzG(c1755Pg0.zza, 0, i8);
        c1755Pg0.zzk(0);
    }

    public final void zzG(byte[] bArr, int i8, int i9) {
        System.arraycopy(this.f21978a, this.f21979b, bArr, i8, i9);
        this.f21979b += i9;
    }

    public final void zzH(int i8) {
        byte[] bArr = this.f21978a;
        if (bArr.length < i8) {
            bArr = new byte[i8];
        }
        zzI(bArr, i8);
    }

    public final void zzI(byte[] bArr, int i8) {
        this.f21978a = bArr;
        this.f21980c = i8;
        this.f21979b = 0;
    }

    public final void zzJ(int i8) {
        boolean z8 = false;
        if (i8 >= 0 && i8 <= this.f21978a.length) {
            z8 = true;
        }
        F10.zzd(z8);
        this.f21980c = i8;
    }

    public final void zzK(int i8) {
        boolean z8 = false;
        if (i8 >= 0 && i8 <= this.f21980c) {
            z8 = true;
        }
        F10.zzd(z8);
        this.f21979b = i8;
    }

    public final void zzL(int i8) {
        zzK(this.f21979b + i8);
    }

    public final byte[] zzM() {
        return this.f21978a;
    }

    public final char zza(Charset charset) {
        F10.zze(f21977f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (b(charset) >> 16);
    }

    public final int zzb() {
        return this.f21980c - this.f21979b;
    }

    public final int zzc() {
        return this.f21978a.length;
    }

    public final int zzd() {
        return this.f21979b;
    }

    public final int zze() {
        return this.f21980c;
    }

    public final int zzf() {
        return this.f21978a[this.f21979b] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.f21979b = i11;
        int i12 = bArr[i9] & 255;
        int i13 = i8 + 3;
        this.f21979b = i13;
        int i14 = bArr[i11] & 255;
        this.f21979b = i8 + 4;
        return (bArr[i13] & 255) | (i10 << 24) | (i12 << 16) | (i14 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.f21979b = i11;
        int i12 = bArr[i9] & 255;
        this.f21979b = i8 + 3;
        return (bArr[i11] & 255) | ((i10 << 24) >> 8) | (i12 << 8);
    }

    public final int zzi() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.f21979b = i11;
        int i12 = bArr[i9] & 255;
        int i13 = i8 + 3;
        this.f21979b = i13;
        int i14 = bArr[i11] & 255;
        this.f21979b = i8 + 4;
        return ((bArr[i13] & 255) << 24) | (i12 << 8) | i10 | (i14 << 16);
    }

    public final int zzj() {
        int iZzi = zzi();
        if (iZzi >= 0) {
            return iZzi;
        }
        throw new IllegalStateException("Top bit not zero: " + iZzi);
    }

    public final int zzk() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        int i10 = bArr[i8] & 255;
        this.f21979b = i8 + 2;
        return ((bArr[i9] & 255) << 8) | i10;
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        this.f21979b = i8 + 1;
        return bArr[i8] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        int i10 = bArr[i8] & 255;
        this.f21979b = i8 + 2;
        int i11 = bArr[i9] & 255;
        this.f21979b = i8 + 4;
        return i11 | (i10 << 8);
    }

    public final int zzo() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        int i10 = bArr[i8] & 255;
        int i11 = i8 + 2;
        this.f21979b = i11;
        int i12 = bArr[i9] & 255;
        this.f21979b = i8 + 3;
        return (bArr[i11] & 255) | (i10 << 16) | (i12 << 8);
    }

    public final int zzp() {
        int iZzg = zzg();
        if (iZzg >= 0) {
            return iZzg;
        }
        throw new IllegalStateException("Top bit not zero: " + iZzg);
    }

    public final int zzq() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        int i10 = bArr[i8] & 255;
        this.f21979b = i8 + 2;
        return (bArr[i9] & 255) | (i10 << 8);
    }

    public final long zzr() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        long j8 = bArr[i8];
        int i10 = i8 + 2;
        this.f21979b = i10;
        long j9 = bArr[i9];
        int i11 = i8 + 3;
        this.f21979b = i11;
        long j10 = bArr[i10];
        int i12 = i8 + 4;
        this.f21979b = i12;
        long j11 = bArr[i11];
        int i13 = i8 + 5;
        this.f21979b = i13;
        long j12 = bArr[i12];
        int i14 = i8 + 6;
        this.f21979b = i14;
        long j13 = bArr[i13];
        this.f21979b = i8 + 7;
        long j14 = bArr[i14];
        this.f21979b = i8 + 8;
        return ((bArr[r5] & 255) << 56) | ((j14 & 255) << 48) | ((j9 & 255) << 8) | (j8 & 255) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((j12 & 255) << 32) | ((j13 & 255) << 40);
    }

    public final long zzs() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        long j8 = bArr[i8];
        int i10 = i8 + 2;
        this.f21979b = i10;
        long j9 = bArr[i9];
        this.f21979b = i8 + 3;
        long j10 = bArr[i10];
        this.f21979b = i8 + 4;
        return ((bArr[r2] & 255) << 24) | (j8 & 255) | ((j9 & 255) << 8) | ((j10 & 255) << 16);
    }

    public final long zzt() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        long j8 = bArr[i8];
        int i10 = i8 + 2;
        this.f21979b = i10;
        long j9 = bArr[i9];
        int i11 = i8 + 3;
        this.f21979b = i11;
        long j10 = bArr[i10];
        int i12 = i8 + 4;
        this.f21979b = i12;
        long j11 = bArr[i11];
        int i13 = i8 + 5;
        this.f21979b = i13;
        long j12 = bArr[i12];
        int i14 = i8 + 6;
        this.f21979b = i14;
        long j13 = bArr[i13];
        this.f21979b = i8 + 7;
        long j14 = bArr[i14];
        this.f21979b = i8 + 8;
        return (bArr[r3] & 255) | ((j8 & 255) << 56) | ((j9 & 255) << 48) | ((j10 & 255) << 40) | ((j11 & 255) << 32) | ((j12 & 255) << 24) | ((j13 & 255) << 16) | ((j14 & 255) << 8);
    }

    public final long zzu() {
        byte[] bArr = this.f21978a;
        int i8 = this.f21979b;
        int i9 = i8 + 1;
        this.f21979b = i9;
        long j8 = bArr[i8];
        int i10 = i8 + 2;
        this.f21979b = i10;
        long j9 = bArr[i9];
        this.f21979b = i8 + 3;
        long j10 = bArr[i10];
        this.f21979b = i8 + 4;
        return (bArr[r2] & 255) | ((j8 & 255) << 24) | ((j9 & 255) << 16) | ((j10 & 255) << 8);
    }

    public final long zzv() {
        long jZzt = zzt();
        if (jZzt >= 0) {
            return jZzt;
        }
        throw new IllegalStateException("Top bit not zero: " + jZzt);
    }

    public final long zzw() {
        int i8;
        int i9;
        long j8 = this.f21978a[this.f21979b];
        int i10 = 7;
        while (true) {
            i8 = 0;
            if (i10 < 0) {
                break;
            }
            if (((1 << i10) & j8) != 0) {
                i10--;
            } else if (i10 < 6) {
                j8 &= r7 - 1;
                i8 = 7 - i10;
            } else if (i10 == 7) {
                i8 = 1;
            }
        }
        if (i8 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j8);
        }
        for (i9 = 1; i9 < i8; i9++) {
            if ((this.f21978a[this.f21979b + i9] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j8);
            }
            j8 = (j8 << 6) | (r2 & 63);
        }
        this.f21979b += i8;
        return j8;
    }

    public final String zzx(char c9) {
        int i8 = this.f21980c;
        int i9 = this.f21979b;
        if (i8 - i9 == 0) {
            return null;
        }
        while (i9 < this.f21980c && this.f21978a[i9] != 0) {
            i9++;
        }
        byte[] bArr = this.f21978a;
        int i10 = this.f21979b;
        String strZzB = AbstractC2281am0.zzB(bArr, i10, i9 - i10);
        this.f21979b = i9;
        if (i9 < this.f21980c) {
            this.f21979b = i9 + 1;
        }
        return strZzB;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzy(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.gl0 r0 = com.google.android.gms.internal.ads.C4099qh0.f21977f
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Unsupported charset: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.internal.ads.F10.zze(r0, r1)
            int r0 = r4.f21980c
            int r1 = r4.f21979b
            int r0 = r0 - r1
            if (r0 != 0) goto L1c
            r5 = 0
            return r5
        L1c:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.AbstractC3647mj0.zza
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L27
            r4.zzB()
        L27:
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.AbstractC3647mj0.zzc
            boolean r1 = r5.equals(r1)
            r3 = 1
            if (r1 != 0) goto L5f
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L37
            goto L5f
        L37:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.AbstractC3647mj0.zzf
            boolean r0 = r5.equals(r0)
            r3 = 2
            if (r0 != 0) goto L5f
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.AbstractC3647mj0.zze
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5f
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.AbstractC3647mj0.zzd
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L51
            goto L5f
        L51:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r2.concat(r5)
            r0.<init>(r5)
            throw r0
        L5f:
            int r0 = r4.f21979b
        L61:
            int r1 = r4.f21980c
            int r2 = r3 + (-1)
            int r2 = r1 - r2
            if (r0 >= r2) goto Lbe
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.AbstractC3647mj0.zzc
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L79
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.AbstractC3647mj0.zza
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L83
        L79:
            byte[] r1 = r4.f21978a
            r1 = r1[r0]
            boolean r1 = com.google.android.gms.internal.ads.AbstractC2281am0.zzM(r1)
            if (r1 != 0) goto Lbf
        L83:
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.AbstractC3647mj0.zzf
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L93
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.AbstractC3647mj0.zzd
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto La3
        L93:
            byte[] r1 = r4.f21978a
            r2 = r1[r0]
            if (r2 != 0) goto La3
            int r2 = r0 + 1
            r1 = r1[r2]
            boolean r1 = com.google.android.gms.internal.ads.AbstractC2281am0.zzM(r1)
            if (r1 != 0) goto Lbf
        La3:
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.AbstractC3647mj0.zze
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto Lbc
            int r1 = r0 + 1
            byte[] r2 = r4.f21978a
            r1 = r2[r1]
            if (r1 != 0) goto Lbc
            r1 = r2[r0]
            boolean r1 = com.google.android.gms.internal.ads.AbstractC2281am0.zzM(r1)
            if (r1 == 0) goto Lbc
            goto Lbf
        Lbc:
            int r0 = r0 + r3
            goto L61
        Lbe:
            r0 = r1
        Lbf:
            int r1 = r4.f21979b
            int r0 = r0 - r1
            java.lang.String r0 = r4.zzA(r0, r5)
            int r1 = r4.f21979b
            int r2 = r4.f21980c
            if (r1 == r2) goto Ldb
            char[] r1 = com.google.android.gms.internal.ads.C4099qh0.f21975d
            char r1 = r4.a(r5, r1)
            r2 = 13
            if (r1 != r2) goto Ldb
            char[] r1 = com.google.android.gms.internal.ads.C4099qh0.f21976e
            r4.a(r5, r1)
        Ldb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4099qh0.zzy(java.nio.charset.Charset):java.lang.String");
    }

    public final String zzz(int i8) {
        if (i8 == 0) {
            return "";
        }
        int i9 = this.f21979b;
        int i10 = (i9 + i8) - 1;
        String strZzB = AbstractC2281am0.zzB(this.f21978a, i9, (i10 >= this.f21980c || this.f21978a[i10] != 0) ? i8 : i8 - 1);
        this.f21979b += i8;
        return strZzB;
    }

    public C4099qh0() {
        this.f21978a = AbstractC2281am0.zzf;
    }

    public C4099qh0(int i8) {
        this.f21978a = new byte[i8];
        this.f21980c = i8;
    }

    public C4099qh0(byte[] bArr) {
        this.f21978a = bArr;
        this.f21980c = bArr.length;
    }
}
