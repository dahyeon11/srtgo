package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.view.C0924a0;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class WE0 extends AbstractC2066Ww {

    /* renamed from: f */
    final boolean f16955f;
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final Q5 zzh;
    public final int zzi;
    public final NM0 zzj;

    @Deprecated
    public static final RG0 zzd = new RG0() { // from class: com.google.android.gms.internal.ads.VE0
    };

    /* renamed from: g */
    private static final String f16949g = Integer.toString(1001, 36);

    /* renamed from: h */
    private static final String f16950h = Integer.toString(1002, 36);

    /* renamed from: i */
    private static final String f16951i = Integer.toString(1003, 36);

    /* renamed from: j */
    private static final String f16952j = Integer.toString(1004, 36);

    /* renamed from: k */
    private static final String f16953k = Integer.toString(1005, 36);

    /* renamed from: l */
    private static final String f16954l = Integer.toString(C0924a0.TYPE_CELL, 36);

    private WE0(int i8, Throwable th, int i9) {
        this(i8, th, null, i9, null, -1, null, 4, false);
    }

    public static WE0 zzb(Throwable th, String str, int i8, Q5 q52, int i9, boolean z8, int i10) {
        return new WE0(1, th, null, i10, str, i8, q52, q52 == null ? 4 : i9, z8);
    }

    public static WE0 zzc(IOException iOException, int i8) {
        return new WE0(0, iOException, i8);
    }

    public static WE0 zzd(RuntimeException runtimeException, int i8) {
        return new WE0(2, runtimeException, i8);
    }

    final WE0 a(NM0 nm0) {
        String message = getMessage();
        int i8 = AbstractC2281am0.zza;
        return new WE0(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, nm0, this.zzc, this.f16955f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private WE0(int i8, Throwable th, String str, int i9, String str2, int i10, Q5 q52, int i11, boolean z8) {
        String str3;
        String str4;
        if (i8 == 0) {
            str3 = "Source error";
        } else if (i8 != 1) {
            str3 = "Unexpected runtime error";
        } else {
            String strValueOf = String.valueOf(q52);
            int i12 = AbstractC2281am0.zza;
            if (i11 == 0) {
                str4 = "NO";
            } else if (i11 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i11 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i11 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            str3 = str2 + " error, index=" + i10 + ", format=" + strValueOf + ", format_supported=" + str4;
        }
        this(TextUtils.isEmpty(null) ? str3 : str3.concat(": null"), th, i9, i8, str2, i10, q52, i11, null, SystemClock.elapsedRealtime(), z8);
    }

    private WE0(String str, Throwable th, int i8, int i9, String str2, int i10, Q5 q52, int i11, NM0 nm0, long j8, boolean z8) {
        int i12;
        boolean z9;
        super(str, th, i8, j8);
        if (z8) {
            i12 = i9;
            if (i12 == 1) {
                i12 = 1;
                z9 = true;
            } else {
                z9 = false;
            }
        } else {
            i12 = i9;
            z9 = true;
        }
        F10.zzd(z9);
        F10.zzd(th != null);
        this.zze = i12;
        this.zzf = str2;
        this.zzg = i10;
        this.zzh = q52;
        this.zzi = i11;
        this.zzj = nm0;
        this.f16955f = z8;
    }
}
