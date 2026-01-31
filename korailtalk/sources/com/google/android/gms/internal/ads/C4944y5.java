package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4944y5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f23827a = new C4099qh0();

    /* renamed from: b, reason: collision with root package name */
    private final int[] f23828b = new int[256];

    /* renamed from: c, reason: collision with root package name */
    private boolean f23829c;

    /* renamed from: d, reason: collision with root package name */
    private int f23830d;

    /* renamed from: e, reason: collision with root package name */
    private int f23831e;

    /* renamed from: f, reason: collision with root package name */
    private int f23832f;

    /* renamed from: g, reason: collision with root package name */
    private int f23833g;

    /* renamed from: h, reason: collision with root package name */
    private int f23834h;

    /* renamed from: i, reason: collision with root package name */
    private int f23835i;

    static /* bridge */ /* synthetic */ void a(C4944y5 c4944y5, C4099qh0 c4099qh0, int i8) {
        int iZzo;
        if (i8 < 4) {
            return;
        }
        c4099qh0.zzL(3);
        int i9 = i8 - 4;
        if ((c4099qh0.zzm() & 128) != 0) {
            if (i9 < 7 || (iZzo = c4099qh0.zzo()) < 4) {
                return;
            }
            c4944y5.f23834h = c4099qh0.zzq();
            c4944y5.f23835i = c4099qh0.zzq();
            c4944y5.f23827a.zzH(iZzo - 4);
            i9 = i8 - 11;
        }
        C4099qh0 c4099qh02 = c4944y5.f23827a;
        int iZzd = c4099qh02.zzd();
        int iZze = c4099qh02.zze();
        if (iZzd >= iZze || i9 <= 0) {
            return;
        }
        int iMin = Math.min(i9, iZze - iZzd);
        c4099qh0.zzG(c4099qh02.zzM(), iZzd, iMin);
        c4944y5.f23827a.zzK(iZzd + iMin);
    }

    static /* bridge */ /* synthetic */ void b(C4944y5 c4944y5, C4099qh0 c4099qh0, int i8) {
        if (i8 < 19) {
            return;
        }
        c4944y5.f23830d = c4099qh0.zzq();
        c4944y5.f23831e = c4099qh0.zzq();
        c4099qh0.zzL(11);
        c4944y5.f23832f = c4099qh0.zzq();
        c4944y5.f23833g = c4099qh0.zzq();
    }

    static /* bridge */ /* synthetic */ void c(C4944y5 c4944y5, C4099qh0 c4099qh0, int i8) {
        if (i8 % 5 != 2) {
            return;
        }
        c4099qh0.zzL(2);
        int i9 = 0;
        Arrays.fill(c4944y5.f23828b, 0);
        int i10 = i8 / 5;
        int i11 = 0;
        while (i11 < i10) {
            int iZzm = c4099qh0.zzm();
            int iZzm2 = c4099qh0.zzm();
            int iZzm3 = c4099qh0.zzm();
            int iZzm4 = c4099qh0.zzm();
            int iZzm5 = c4099qh0.zzm();
            double d9 = iZzm2;
            int[] iArr = c4944y5.f23828b;
            double d10 = iZzm3 - 128;
            int iMax = Math.max(i9, Math.min((int) ((1.402d * d10) + d9), 255)) << 16;
            double d11 = iZzm4 - 128;
            iArr[iZzm] = Math.max(0, Math.min((int) (d9 + (d11 * 1.772d)), 255)) | (iZzm5 << 24) | iMax | (Math.max(0, Math.min((int) ((d9 - (0.34414d * d11)) - (d10 * 0.71414d)), 255)) << 8);
            i11++;
            i9 = 0;
        }
        c4944y5.f23829c = true;
    }

    public final C4878xX zza() {
        int i8;
        if (this.f23830d == 0 || this.f23831e == 0 || this.f23834h == 0 || this.f23835i == 0) {
            return null;
        }
        C4099qh0 c4099qh0 = this.f23827a;
        if (c4099qh0.zze() == 0 || c4099qh0.zzd() != c4099qh0.zze() || !this.f23829c) {
            return null;
        }
        c4099qh0.zzK(0);
        int i9 = this.f23834h * this.f23835i;
        int[] iArr = new int[i9];
        int i10 = 0;
        while (i10 < i9) {
            int iZzm = this.f23827a.zzm();
            if (iZzm != 0) {
                i8 = i10 + 1;
                iArr[i10] = this.f23828b[iZzm];
            } else {
                int iZzm2 = this.f23827a.zzm();
                if (iZzm2 != 0) {
                    int iZzm3 = iZzm2 & 63;
                    if ((iZzm2 & 64) != 0) {
                        iZzm3 = (iZzm3 << 8) | this.f23827a.zzm();
                    }
                    i8 = iZzm3 + i10;
                    Arrays.fill(iArr, i10, i8, (iZzm2 & 128) == 0 ? 0 : this.f23828b[this.f23827a.zzm()]);
                }
            }
            i10 = i8;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f23834h, this.f23835i, Bitmap.Config.ARGB_8888);
        C4649vW c4649vW = new C4649vW();
        c4649vW.zzc(bitmapCreateBitmap);
        c4649vW.zzh(this.f23832f / this.f23830d);
        c4649vW.zzi(0);
        c4649vW.zze(this.f23833g / this.f23831e, 0);
        c4649vW.zzf(0);
        c4649vW.zzk(this.f23834h / this.f23830d);
        c4649vW.zzd(this.f23835i / this.f23831e);
        return c4649vW.zzp();
    }

    public final void zze() {
        this.f23830d = 0;
        this.f23831e = 0;
        this.f23832f = 0;
        this.f23833g = 0;
        this.f23834h = 0;
        this.f23835i = 0;
        this.f23827a.zzH(0);
        this.f23829c = false;
    }
}
