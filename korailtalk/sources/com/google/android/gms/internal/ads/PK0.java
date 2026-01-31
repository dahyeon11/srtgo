package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class PK0 implements InterfaceC4405tK0 {
    protected PK0(OK0 ok0) {
    }

    protected static int a(int i8, int i9, int i10) {
        return AbstractC1235Cm0.zzb(((i8 * i9) * i10) / 1000000);
    }

    protected static int b(int i8) {
        switch (i8) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }
}
