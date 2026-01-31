package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;

/* loaded from: classes2.dex */
abstract class Wx0 {
    static int a(byte[] bArr, int i8, Vx0 vx0) {
        int iH = h(bArr, i8, vx0);
        int i9 = vx0.zza;
        if (i9 < 0) {
            throw C4021pz0.f();
        }
        if (i9 > bArr.length - iH) {
            throw C4021pz0.i();
        }
        if (i9 == 0) {
            vx0.zzc = AbstractC3677my0.zzb;
            return iH;
        }
        vx0.zzc = AbstractC3677my0.zzv(bArr, iH, i9);
        return iH + i9;
    }

    static int b(byte[] bArr, int i8) {
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    static int c(InterfaceC3360kA0 interfaceC3360kA0, byte[] bArr, int i8, int i9, int i10, Vx0 vx0) {
        Object objZze = interfaceC3360kA0.zze();
        int iL = l(objZze, interfaceC3360kA0, bArr, i8, i9, i10, vx0);
        interfaceC3360kA0.zzf(objZze);
        vx0.zzc = objZze;
        return iL;
    }

    static int d(InterfaceC3360kA0 interfaceC3360kA0, byte[] bArr, int i8, int i9, Vx0 vx0) {
        Object objZze = interfaceC3360kA0.zze();
        int iM = m(objZze, interfaceC3360kA0, bArr, i8, i9, vx0);
        interfaceC3360kA0.zzf(objZze);
        vx0.zzc = objZze;
        return iM;
    }

    static int e(InterfaceC3360kA0 interfaceC3360kA0, int i8, byte[] bArr, int i9, int i10, InterfaceC3679mz0 interfaceC3679mz0, Vx0 vx0) {
        int iD = d(interfaceC3360kA0, bArr, i9, i10, vx0);
        interfaceC3679mz0.add(vx0.zzc);
        while (iD < i10) {
            int iH = h(bArr, iD, vx0);
            if (i8 != vx0.zza) {
                break;
            }
            iD = d(interfaceC3360kA0, bArr, iH, i10, vx0);
            interfaceC3679mz0.add(vx0.zzc);
        }
        return iD;
    }

    static int f(byte[] bArr, int i8, InterfaceC3679mz0 interfaceC3679mz0, Vx0 vx0) {
        C2307az0 c2307az0 = (C2307az0) interfaceC3679mz0;
        int iH = h(bArr, i8, vx0);
        int i9 = vx0.zza + iH;
        while (iH < i9) {
            iH = h(bArr, iH, vx0);
            c2307az0.zzi(vx0.zza);
        }
        if (iH == i9) {
            return iH;
        }
        throw C4021pz0.i();
    }

    static int g(int i8, byte[] bArr, int i9, int i10, CA0 ca0, Vx0 vx0) {
        if ((i8 >>> 3) == 0) {
            throw C4021pz0.c();
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            int iK = k(bArr, i9, vx0);
            ca0.f(i8, Long.valueOf(vx0.zzb));
            return iK;
        }
        if (i11 == 1) {
            ca0.f(i8, Long.valueOf(n(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int iH = h(bArr, i9, vx0);
            int i12 = vx0.zza;
            if (i12 < 0) {
                throw C4021pz0.f();
            }
            if (i12 > bArr.length - iH) {
                throw C4021pz0.i();
            }
            if (i12 == 0) {
                ca0.f(i8, AbstractC3677my0.zzb);
            } else {
                ca0.f(i8, AbstractC3677my0.zzv(bArr, iH, i12));
            }
            return iH + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw C4021pz0.c();
            }
            ca0.f(i8, Integer.valueOf(b(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i8 & (-8)) | 4;
        CA0 ca0C = CA0.c();
        int i14 = 0;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            int iH2 = h(bArr, i9, vx0);
            int i15 = vx0.zza;
            i14 = i15;
            if (i15 == i13) {
                i9 = iH2;
                break;
            }
            int iG = g(i14, bArr, iH2, i10, ca0C, vx0);
            i14 = i15;
            i9 = iG;
        }
        if (i9 > i10 || i14 != i13) {
            throw C4021pz0.g();
        }
        ca0.f(i8, ca0C);
        return i9;
    }

    static int h(byte[] bArr, int i8, Vx0 vx0) {
        int i9 = i8 + 1;
        byte b9 = bArr[i8];
        if (b9 < 0) {
            return i(b9, bArr, i9, vx0);
        }
        vx0.zza = b9;
        return i9;
    }

    static int i(int i8, byte[] bArr, int i9, Vx0 vx0) {
        byte b9 = bArr[i9];
        int i10 = i9 + 1;
        int i11 = i8 & 127;
        if (b9 >= 0) {
            vx0.zza = i11 | (b9 << 7);
            return i10;
        }
        int i12 = i11 | ((b9 & 127) << 7);
        int i13 = i9 + 2;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            vx0.zza = i12 | (b10 << AbstractC5358c.SO);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 14);
        int i15 = i9 + 3;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            vx0.zza = i14 | (b11 << AbstractC5358c.NAK);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 21);
        int i17 = i9 + 4;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            vx0.zza = i16 | (b12 << AbstractC5358c.FS);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                vx0.zza = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    static int j(int i8, byte[] bArr, int i9, int i10, InterfaceC3679mz0 interfaceC3679mz0, Vx0 vx0) {
        C2307az0 c2307az0 = (C2307az0) interfaceC3679mz0;
        int iH = h(bArr, i9, vx0);
        c2307az0.zzi(vx0.zza);
        while (iH < i10) {
            int iH2 = h(bArr, iH, vx0);
            if (i8 != vx0.zza) {
                break;
            }
            iH = h(bArr, iH2, vx0);
            c2307az0.zzi(vx0.zza);
        }
        return iH;
    }

    static int k(byte[] bArr, int i8, Vx0 vx0) {
        long j8 = bArr[i8];
        int i9 = i8 + 1;
        if (j8 >= 0) {
            vx0.zzb = j8;
            return i9;
        }
        int i10 = i8 + 2;
        byte b9 = bArr[i9];
        long j9 = (j8 & 127) | ((b9 & 127) << 7);
        int i11 = 7;
        while (b9 < 0) {
            int i12 = i10 + 1;
            i11 += 7;
            j9 |= (r10 & 127) << i11;
            b9 = bArr[i10];
            i10 = i12;
        }
        vx0.zzb = j9;
        return i10;
    }

    static int l(Object obj, InterfaceC3360kA0 interfaceC3360kA0, byte[] bArr, int i8, int i9, int i10, Vx0 vx0) {
        int iU = ((Sz0) interfaceC3360kA0).u(obj, bArr, i8, i9, i10, vx0);
        vx0.zzc = obj;
        return iU;
    }

    static int m(Object obj, InterfaceC3360kA0 interfaceC3360kA0, byte[] bArr, int i8, int i9, Vx0 vx0) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = i(i11, bArr, i10, vx0);
            i11 = vx0.zza;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw C4021pz0.i();
        }
        int i13 = i11 + i12;
        interfaceC3360kA0.zzi(obj, bArr, i12, i13, vx0);
        vx0.zzc = obj;
        return i13;
    }

    static long n(byte[] bArr, int i8) {
        return (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48) | ((bArr[i8 + 7] & 255) << 56);
    }
}
