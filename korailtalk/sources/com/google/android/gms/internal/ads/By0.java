package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
final class By0 extends AbstractC5044yy0 {

    /* renamed from: h, reason: collision with root package name */
    private final OutputStream f12465h;

    By0(OutputStream outputStream, int i8) {
        super(i8);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f12465h = outputStream;
    }

    private final void l() throws IOException {
        this.f12465h.write(this.f24094d, 0, this.f24096f);
        this.f24096f = 0;
    }

    private final void m(int i8) throws IOException {
        if (this.f24095e - this.f24096f < i8) {
            l();
        }
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    final void e(int i8, Pz0 pz0, InterfaceC3360kA0 interfaceC3360kA0) throws IOException {
        zzu((i8 << 3) | 2);
        zzu(((Qx0) pz0).b(interfaceC3360kA0));
        interfaceC3360kA0.zzj(pz0, this.f12723a);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzL() throws IOException {
        if (this.f24096f > 0) {
            l();
        }
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzM(byte b9) throws IOException {
        if (this.f24096f == this.f24095e) {
            l();
        }
        g(b9);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzN(int i8, boolean z8) throws IOException {
        m(11);
        j(i8 << 3);
        g(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzO(int i8, AbstractC3677my0 abstractC3677my0) throws IOException {
        zzu((i8 << 3) | 2);
        zzu(abstractC3677my0.zzd());
        abstractC3677my0.i(this);
    }

    @Override // com.google.android.gms.internal.ads.Dy0, com.google.android.gms.internal.ads.Yx0
    public final void zza(byte[] bArr, int i8, int i9) throws IOException {
        zzr(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzh(int i8, int i9) throws IOException {
        m(14);
        j((i8 << 3) | 5);
        h(i9);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzi(int i8) throws IOException {
        m(4);
        h(i8);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzj(int i8, long j8) throws IOException {
        m(18);
        j((i8 << 3) | 1);
        i(j8);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzk(long j8) throws IOException {
        m(8);
        i(j8);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzl(int i8, int i9) throws IOException {
        m(20);
        j(i8 << 3);
        if (i9 >= 0) {
            j(i9);
        } else {
            k(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzm(int i8) throws IOException {
        if (i8 >= 0) {
            zzu(i8);
        } else {
            zzw(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzo(int i8, Pz0 pz0) throws IOException {
        zzu(11);
        zzt(2, i8);
        zzu(26);
        zzu(pz0.zzaY());
        pz0.zzda(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzp(int i8, AbstractC3677my0 abstractC3677my0) throws IOException {
        zzu(11);
        zzt(2, i8);
        zzO(3, abstractC3677my0);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzq(int i8, String str) throws IOException {
        zzu((i8 << 3) | 2);
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i8, int i9) throws IOException {
        int i10 = this.f24095e;
        int i11 = this.f24096f;
        int i12 = i10 - i11;
        if (i12 >= i9) {
            System.arraycopy(bArr, i8, this.f24094d, i11, i9);
            this.f24096f += i9;
            this.f24097g += i9;
            return;
        }
        System.arraycopy(bArr, i8, this.f24094d, i11, i12);
        int i13 = i8 + i12;
        this.f24096f = this.f24095e;
        this.f24097g += i12;
        l();
        int i14 = i9 - i12;
        if (i14 <= this.f24095e) {
            System.arraycopy(bArr, i13, this.f24094d, 0, i14);
            this.f24096f = i14;
        } else {
            this.f12465h.write(bArr, i13, i14);
        }
        this.f24097g += i14;
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzs(int i8, int i9) throws IOException {
        zzu((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzt(int i8, int i9) throws IOException {
        m(20);
        j(i8 << 3);
        j(i9);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzu(int i8) throws IOException {
        m(5);
        j(i8);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzv(int i8, long j8) throws IOException {
        m(20);
        j(i8 << 3);
        k(j8);
    }

    @Override // com.google.android.gms.internal.ads.Dy0
    public final void zzw(long j8) throws IOException {
        m(10);
        k(j8);
    }

    public final void zzx(String str) throws IOException {
        int iE;
        try {
            int length = str.length() * 3;
            int iZzD = Dy0.zzD(length);
            int i8 = iZzD + length;
            int i9 = this.f24095e;
            if (i8 > i9) {
                byte[] bArr = new byte[length];
                int iD = RA0.d(str, bArr, 0, length);
                zzu(iD);
                zzr(bArr, 0, iD);
                return;
            }
            if (i8 > i9 - this.f24096f) {
                l();
            }
            int iZzD2 = Dy0.zzD(str.length());
            int i10 = this.f24096f;
            try {
                if (iZzD2 == iZzD) {
                    int i11 = i10 + iZzD2;
                    this.f24096f = i11;
                    int iD2 = RA0.d(str, this.f24094d, i11, this.f24095e - i11);
                    this.f24096f = i10;
                    iE = (iD2 - i10) - iZzD2;
                    j(iE);
                    this.f24096f = iD2;
                } else {
                    iE = RA0.e(str);
                    j(iE);
                    this.f24096f = RA0.d(str, this.f24094d, this.f24096f, iE);
                }
                this.f24097g += iE;
            } catch (QA0 e8) {
                this.f24097g -= this.f24096f - i10;
                this.f24096f = i10;
                throw e8;
            } catch (ArrayIndexOutOfBoundsException e9) {
                throw new Ay0(e9);
            }
        } catch (QA0 e10) {
            c(str, e10);
        }
    }
}
