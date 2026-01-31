package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class VK0 extends AbstractC3963pT {

    /* renamed from: i, reason: collision with root package name */
    private int f16826i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16827j;

    /* renamed from: k, reason: collision with root package name */
    private int f16828k;

    /* renamed from: l, reason: collision with root package name */
    private long f16829l;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f16831n;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f16834q;

    /* renamed from: m, reason: collision with root package name */
    private int f16830m = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f16832o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f16833p = 0;

    /* renamed from: h, reason: collision with root package name */
    private KR f16825h = KR.zza;

    public VK0() {
        byte[] bArr = AbstractC2281am0.zzf;
        this.f16831n = bArr;
        this.f16834q = bArr;
    }

    private final int c(int i8) {
        int iD = ((d(2000000L) - this.f16830m) * this.f16826i) - (this.f16831n.length >> 1);
        F10.zzf(iD >= 0);
        int iMin = (int) Math.min((i8 * 0.2f) + 0.5f, iD);
        int i9 = this.f16826i;
        return (iMin / i9) * i9;
    }

    private final int d(long j8) {
        return (int) ((j8 * this.f16825h.zzb) / 1000000);
    }

    private static int e(byte b9, byte b10) {
        return (b9 << 8) | (b10 & 255);
    }

    private final void f(boolean z8) {
        int i8;
        int length;
        int i9 = this.f16833p;
        int length2 = this.f16831n.length;
        if (i9 != length2) {
            if (!z8) {
                return;
            } else {
                z8 = true;
            }
        }
        if (this.f16830m == 0) {
            if (z8) {
                g(i9, 3);
                length = i9;
            } else {
                F10.zzf(i9 >= (length2 >> 1));
                length = this.f16831n.length >> 1;
                g(length, 0);
            }
            i8 = length;
        } else {
            int i10 = length2 >> 1;
            int i11 = i9 - i10;
            if (z8) {
                int iC = c(i11) + (this.f16831n.length >> 1);
                g(iC, 2);
                int i12 = i10 + i11;
                i8 = iC;
                length = i12;
            } else {
                int iC2 = c(i11);
                g(iC2, 1);
                i8 = iC2;
                length = i11;
            }
        }
        F10.zzg(length % this.f16826i == 0, "bytesConsumed is not aligned to frame size: %s" + length);
        F10.zzf(i9 >= i8);
        this.f16833p -= length;
        int i13 = this.f16832o + length;
        this.f16832o = i13;
        this.f16832o = i13 % this.f16831n.length;
        this.f16830m = this.f16830m + (i8 / this.f16826i);
        this.f16829l += (length - i8) / r2;
    }

    private final void g(int i8, int i9) {
        int i10;
        if (i8 == 0) {
            return;
        }
        F10.zzd(this.f16833p >= i8);
        if (i9 == 2) {
            int i11 = this.f16832o;
            int i12 = this.f16833p;
            int i13 = i11 + i12;
            byte[] bArr = this.f16831n;
            int length = bArr.length;
            if (i13 <= length) {
                System.arraycopy(bArr, i13 - i8, this.f16834q, 0, i8);
            } else {
                int i14 = i12 - (length - i11);
                if (i14 >= i8) {
                    System.arraycopy(bArr, i14 - i8, this.f16834q, 0, i8);
                } else {
                    int i15 = i8 - i14;
                    System.arraycopy(bArr, length - i15, this.f16834q, 0, i15);
                    System.arraycopy(this.f16831n, 0, this.f16834q, i15, i14);
                }
            }
        } else {
            int i16 = this.f16832o;
            int i17 = i16 + i8;
            byte[] bArr2 = this.f16831n;
            int length2 = bArr2.length;
            if (i17 <= length2) {
                System.arraycopy(bArr2, i16, this.f16834q, 0, i8);
            } else {
                int i18 = length2 - i16;
                System.arraycopy(bArr2, i16, this.f16834q, 0, i18);
                System.arraycopy(this.f16831n, 0, this.f16834q, i18, i8 - i18);
            }
        }
        F10.zze(i8 % this.f16826i == 0, "sizeToOutput is not aligned to frame size: " + i8);
        F10.zzf(this.f16832o < this.f16831n.length);
        byte[] bArr3 = this.f16834q;
        F10.zze(i8 % this.f16826i == 0, "byteOutput size is not aligned to frame size " + i8);
        if (i9 != 3) {
            for (int i19 = 0; i19 < i8; i19 += 2) {
                int i20 = i19 + 1;
                int iE = e(bArr3[i20], bArr3[i19]);
                if (i9 == 0) {
                    i10 = ((((i19 * 1000) / (i8 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i10 = 10;
                    if (i9 == 2) {
                        i10 = 10 + (((90000 * i19) / (i8 - 1)) / 1000);
                    }
                }
                int i21 = (iE * i10) / 100;
                if (i21 >= 32767) {
                    bArr3[i19] = -1;
                    bArr3[i20] = 127;
                } else if (i21 <= -32768) {
                    bArr3[i19] = 0;
                    bArr3[i20] = -128;
                } else {
                    bArr3[i19] = (byte) (i21 & 255);
                    bArr3[i20] = (byte) (i21 >> 8);
                }
            }
        }
        a(i8).put(bArr3, 0, i8).flip();
    }

    private static final boolean h(byte b9, byte b10) {
        return Math.abs(e(b9, b10)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT, com.google.android.gms.internal.ads.NS
    public final void zze(ByteBuffer byteBuffer) {
        int iLimit;
        int i8;
        int iPosition;
        while (byteBuffer.hasRemaining() && !b()) {
            if (this.f16828k != 0) {
                F10.zzf(this.f16832o < this.f16831n.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (h(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i9 = this.f16826i;
                            iLimit = i9 * (iPosition2 / i9);
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i10 = this.f16832o;
                int i11 = this.f16833p;
                int i12 = i10 + i11;
                int length = this.f16831n.length;
                if (i12 < length) {
                    i8 = length - i12;
                } else {
                    i12 = i11 - (length - i10);
                    i8 = i10 - i12;
                }
                int iMin = Math.min(iPosition3, i8);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f16831n, i12, iMin);
                int i13 = this.f16833p + iMin;
                this.f16833p = i13;
                F10.zzf(i13 <= this.f16831n.length);
                boolean z8 = iLimit < iLimit2 && iPosition3 < i8;
                f(z8);
                if (z8) {
                    this.f16828k = 0;
                    this.f16830m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f16831n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (h(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i14 = this.f16826i;
                            iPosition = ((iLimit4 / i14) * i14) + i14;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f16828k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    a(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT, com.google.android.gms.internal.ads.NS
    public final boolean zzg() {
        return this.f16825h.zzb != -1 && this.f16827j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    protected final KR zzi(KR kr2) throws C3620mS {
        if (kr2.zzd != 2) {
            throw new C3620mS("Unhandled input format:", kr2);
        }
        this.f16825h = kr2;
        int i8 = kr2.zzc;
        this.f16826i = i8 + i8;
        return kr2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    public final void zzk() {
        if (zzg()) {
            int iD = d(100000L) / 2;
            int i8 = this.f16826i;
            int i9 = (iD / i8) * i8;
            int i10 = i9 + i9;
            if (this.f16831n.length != i10) {
                this.f16831n = new byte[i10];
                this.f16834q = new byte[i10];
            }
        }
        this.f16828k = 0;
        this.f16829l = 0L;
        this.f16830m = 0;
        this.f16832o = 0;
        this.f16833p = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    public final void zzl() {
        if (this.f16833p > 0) {
            f(true);
            this.f16830m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    public final void zzm() {
        this.f16827j = false;
        this.f16825h = KR.zza;
        byte[] bArr = AbstractC2281am0.zzf;
        this.f16831n = bArr;
        this.f16834q = bArr;
    }

    public final long zzo() {
        return this.f16829l;
    }

    public final void zzp(boolean z8) {
        this.f16827j = z8;
    }
}
