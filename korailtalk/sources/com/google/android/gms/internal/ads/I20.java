package com.google.android.gms.internal.ads;

import com.korail.talk.network.dao.delay.CashRfnDao;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class I20 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f13395a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f13396b = {"", "A", CashRfnDao.f27551B, "C"};
    public static final /* synthetic */ int zza = 0;

    public static String zza(int i8, int i9, int i10) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public static String zzb(int i8, boolean z8, int i9, int i10, int[] iArr, int i11) {
        int i12;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", f13396b[i8], Integer.valueOf(i9), Integer.valueOf(i10), Character.valueOf(true != z8 ? 'L' : 'H'), Integer.valueOf(i11)));
        int i13 = 6;
        while (true) {
            if (i13 <= 0) {
                break;
            }
            int i14 = i13 - 1;
            if (iArr[i14] != 0) {
                break;
            }
            i13 = i14;
        }
        for (i12 = 0; i12 < i13; i12++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i12])));
        }
        return sb.toString();
    }

    public static byte[] zzc(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9 + 4];
        System.arraycopy(f13395a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i8, bArr2, 4, i9);
        return bArr2;
    }
}
