package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import e3.AbstractC5358c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.x5 */
/* loaded from: classes2.dex */
public final class C4830x5 implements InterfaceC3349k5 {

    /* renamed from: h */
    private static final byte[] f23632h = {0, 7, 8, AbstractC5358c.SI};

    /* renamed from: i */
    private static final byte[] f23633i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f23634j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f23635a;

    /* renamed from: b */
    private final Paint f23636b;

    /* renamed from: c */
    private final Canvas f23637c;

    /* renamed from: d */
    private final C4033q5 f23638d;

    /* renamed from: e */
    private final C3805o5 f23639e;

    /* renamed from: f */
    private final C4716w5 f23640f;

    /* renamed from: g */
    private Bitmap f23641g;

    public C4830x5(List list) {
        C4099qh0 c4099qh0 = new C4099qh0((byte[]) list.get(0));
        int iZzq = c4099qh0.zzq();
        int iZzq2 = c4099qh0.zzq();
        Paint paint = new Paint();
        this.f23635a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f23636b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f23637c = new Canvas();
        this.f23638d = new C4033q5(719, 575, 0, 719, 0, 575);
        this.f23639e = new C3805o5(0, f(), g(), h());
        this.f23640f = new C4716w5(iZzq, iZzq2);
    }

    private static int a(int i8, int i9, int i10, int i11) {
        return (i8 << 24) | (i9 << 16) | (i10 << 8) | i11;
    }

    private static C3805o5 b(C1755Pg0 c1755Pg0, int i8) {
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i9 = 8;
        int iZzd5 = c1755Pg0.zzd(8);
        c1755Pg0.zzm(8);
        int[] iArrF = f();
        int[] iArrG = g();
        int[] iArrH = h();
        int i10 = i8 - 2;
        while (i10 > 0) {
            int iZzd6 = c1755Pg0.zzd(i9);
            int iZzd7 = c1755Pg0.zzd(i9);
            int[] iArr = (iZzd7 & 128) != 0 ? iArrF : (iZzd7 & 64) != 0 ? iArrG : iArrH;
            if ((iZzd7 & 1) != 0) {
                iZzd3 = c1755Pg0.zzd(i9);
                iZzd4 = c1755Pg0.zzd(i9);
                iZzd = c1755Pg0.zzd(i9);
                iZzd2 = c1755Pg0.zzd(i9);
                i10 -= 6;
            } else {
                int iZzd8 = c1755Pg0.zzd(6) << 2;
                int iZzd9 = c1755Pg0.zzd(4) << 4;
                i10 -= 4;
                iZzd = c1755Pg0.zzd(4) << 4;
                iZzd2 = c1755Pg0.zzd(2) << 6;
                iZzd3 = iZzd8;
                iZzd4 = iZzd9;
            }
            if (iZzd3 == 0) {
                iZzd2 = 255;
            }
            if (iZzd3 == 0) {
                iZzd = 0;
            }
            if (iZzd3 == 0) {
                iZzd4 = 0;
            }
            double d9 = iZzd3;
            double d10 = iZzd4 - 128;
            double d11 = iZzd - 128;
            iArr[iZzd6] = a((byte) (255 - (iZzd2 & 255)), Math.max(0, Math.min((int) (d9 + (1.402d * d10)), 255)), Math.max(0, Math.min((int) ((d9 - (0.34414d * d11)) - (d10 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d9 + (d11 * 1.772d)), 255)));
            iZzd5 = iZzd5;
            i9 = 8;
        }
        return new C3805o5(iZzd5, iArrF, iArrG, iArrH);
    }

    private static C4146r5 c(C1755Pg0 c1755Pg0) {
        byte[] bArr;
        int iZzd = c1755Pg0.zzd(16);
        c1755Pg0.zzm(4);
        int iZzd2 = c1755Pg0.zzd(2);
        boolean zZzo = c1755Pg0.zzo();
        c1755Pg0.zzm(1);
        byte[] bArr2 = AbstractC2281am0.zzf;
        if (iZzd2 != 1) {
            if (iZzd2 == 0) {
                int iZzd3 = c1755Pg0.zzd(16);
                int iZzd4 = c1755Pg0.zzd(16);
                if (iZzd3 > 0) {
                    bArr2 = new byte[iZzd3];
                    c1755Pg0.zzh(bArr2, 0, iZzd3);
                }
                if (iZzd4 > 0) {
                    bArr = new byte[iZzd4];
                    c1755Pg0.zzh(bArr, 0, iZzd4);
                }
            }
            return new C4146r5(iZzd, zZzo, bArr2, bArr);
        }
        c1755Pg0.zzm(c1755Pg0.zzd(8) * 16);
        bArr = bArr2;
        return new C4146r5(iZzd, zZzo, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0228 A[LOOP:3: B:232:0x0172->B:263:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0222 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4830x5.d(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] e(int i8, int i9, C1755Pg0 c1755Pg0) {
        byte[] bArr = new byte[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            bArr[i10] = (byte) c1755Pg0.zzd(i9);
        }
        return bArr;
    }

    private static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i8 = 1; i8 < 16; i8++) {
            int i9 = i8 & 4;
            int i10 = i8 & 2;
            int i11 = i8 & 1;
            if (i8 < 8) {
                iArr[i8] = a(255, 1 != i11 ? 0 : 255, i10 != 0 ? 255 : 0, i9 != 0 ? 255 : 0);
            } else {
                iArr[i8] = a(255, 1 != i11 ? 0 : 127, i10 != 0 ? 127 : 0, i9 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i8 = 0; i8 < 256; i8++) {
            if (i8 < 8) {
                iArr[i8] = a(63, 1 != (i8 & 1) ? 0 : 255, (i8 & 2) != 0 ? 255 : 0, (i8 & 4) == 0 ? 0 : 255);
            } else {
                int i9 = i8 & 136;
                if (i9 == 0) {
                    iArr[i8] = a(255, (1 != (i8 & 1) ? 0 : 85) + ((i8 & 16) != 0 ? 170 : 0), ((i8 & 2) != 0 ? 85 : 0) + ((i8 & 32) != 0 ? 170 : 0), ((i8 & 4) == 0 ? 0 : 85) + ((i8 & 64) == 0 ? 0 : 170));
                } else if (i9 == 8) {
                    iArr[i8] = a(127, (1 != (i8 & 1) ? 0 : 85) + ((i8 & 16) != 0 ? 170 : 0), ((i8 & 2) != 0 ? 85 : 0) + ((i8 & 32) != 0 ? 170 : 0), ((i8 & 4) == 0 ? 0 : 85) + ((i8 & 64) == 0 ? 0 : 170));
                } else if (i9 == 128) {
                    iArr[i8] = a(255, (1 != (i8 & 1) ? 0 : 43) + 127 + ((i8 & 16) != 0 ? 85 : 0), ((i8 & 2) != 0 ? 43 : 0) + 127 + ((i8 & 32) != 0 ? 85 : 0), ((i8 & 4) == 0 ? 0 : 43) + 127 + ((i8 & 64) == 0 ? 0 : 85));
                } else if (i9 == 136) {
                    iArr[i8] = a(255, (1 != (i8 & 1) ? 0 : 43) + ((i8 & 16) != 0 ? 85 : 0), ((i8 & 2) != 0 ? 43 : 0) + ((i8 & 32) != 0 ? 85 : 0), ((i8 & 4) == 0 ? 0 : 43) + ((i8 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3349k5
    public final void zza(byte[] bArr, int i8, int i9, C3235j5 c3235j5, InterfaceC3462l40 interfaceC3462l40) {
        C2433c5 c2433c5;
        char c9;
        char c10;
        int i10;
        SparseArray sparseArray;
        int i11;
        SparseArray sparseArray2;
        C4488u5 c4488u5;
        int i12;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i13;
        int iZzd5;
        C1755Pg0 c1755Pg0 = new C1755Pg0(bArr, i8 + i9);
        c1755Pg0.zzk(i8);
        while (c1755Pg0.zza() >= 48 && c1755Pg0.zzd(8) == 15) {
            C4716w5 c4716w5 = this.f23640f;
            int iZzd6 = c1755Pg0.zzd(8);
            int iZzd7 = c1755Pg0.zzd(16);
            int iZzd8 = c1755Pg0.zzd(16);
            int iZzb = c1755Pg0.zzb() + iZzd8;
            if (iZzd8 * 8 > c1755Pg0.zza()) {
                AbstractC2834fc0.zzf("DvbParser", "Data field length exceeds limit");
                c1755Pg0.zzm(c1755Pg0.zza());
            } else {
                switch (iZzd6) {
                    case 16:
                        if (iZzd7 == c4716w5.zza) {
                            C4260s5 c4260s5 = c4716w5.zzi;
                            int iZzd9 = c1755Pg0.zzd(8);
                            int iZzd10 = c1755Pg0.zzd(4);
                            int iZzd11 = c1755Pg0.zzd(2);
                            c1755Pg0.zzm(2);
                            SparseArray sparseArray3 = new SparseArray();
                            for (int i14 = iZzd8 - 2; i14 > 0; i14 -= 6) {
                                int iZzd12 = c1755Pg0.zzd(8);
                                c1755Pg0.zzm(8);
                                sparseArray3.put(iZzd12, new C4374t5(c1755Pg0.zzd(16), c1755Pg0.zzd(16)));
                            }
                            C4260s5 c4260s52 = new C4260s5(iZzd9, iZzd10, iZzd11, sparseArray3);
                            if (c4260s52.zzb != 0) {
                                c4716w5.zzi = c4260s52;
                                c4716w5.zzc.clear();
                                c4716w5.zzd.clear();
                                c4716w5.zze.clear();
                                break;
                            } else if (c4260s5 != null) {
                                if (c4260s5.zza != c4260s52.zza) {
                                    c4716w5.zzi = c4260s52;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        C4260s5 c4260s53 = c4716w5.zzi;
                        if (iZzd7 == c4716w5.zza && c4260s53 != null) {
                            int iZzd13 = c1755Pg0.zzd(8);
                            c1755Pg0.zzm(4);
                            boolean zZzo = c1755Pg0.zzo();
                            c1755Pg0.zzm(3);
                            int iZzd14 = c1755Pg0.zzd(16);
                            int iZzd15 = c1755Pg0.zzd(16);
                            int iZzd16 = c1755Pg0.zzd(3);
                            int iZzd17 = c1755Pg0.zzd(3);
                            c1755Pg0.zzm(2);
                            int iZzd18 = c1755Pg0.zzd(8);
                            int iZzd19 = c1755Pg0.zzd(8);
                            int iZzd20 = c1755Pg0.zzd(4);
                            int iZzd21 = c1755Pg0.zzd(2);
                            c1755Pg0.zzm(2);
                            int i15 = iZzd8 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i15 > 0) {
                                int iZzd22 = c1755Pg0.zzd(16);
                                int iZzd23 = c1755Pg0.zzd(2);
                                int iZzd24 = c1755Pg0.zzd(2);
                                int iZzd25 = c1755Pg0.zzd(12);
                                c1755Pg0.zzm(4);
                                int iZzd26 = c1755Pg0.zzd(12);
                                int i16 = i15 - 6;
                                if (iZzd23 == 1) {
                                    i15 -= 8;
                                    i12 = iZzd23;
                                    iZzd = c1755Pg0.zzd(8);
                                    iZzd2 = c1755Pg0.zzd(8);
                                } else if (iZzd23 == 2) {
                                    iZzd23 = 2;
                                    i15 -= 8;
                                    i12 = iZzd23;
                                    iZzd = c1755Pg0.zzd(8);
                                    iZzd2 = c1755Pg0.zzd(8);
                                } else {
                                    i12 = iZzd23;
                                    i15 = i16;
                                    iZzd = 0;
                                    iZzd2 = 0;
                                }
                                sparseArray4.put(iZzd22, new C4602v5(i12, iZzd24, iZzd25, iZzd26, iZzd, iZzd2));
                            }
                            C4488u5 c4488u52 = new C4488u5(iZzd13, zZzo, iZzd14, iZzd15, iZzd16, iZzd17, iZzd18, iZzd19, iZzd20, iZzd21, sparseArray4);
                            if (c4260s53.zzb == 0 && (c4488u5 = (C4488u5) c4716w5.zzc.get(c4488u52.zza)) != null) {
                                int i17 = 0;
                                while (true) {
                                    SparseArray sparseArray5 = c4488u5.zzj;
                                    if (i17 < sparseArray5.size()) {
                                        c4488u52.zzj.put(sparseArray5.keyAt(i17), (C4602v5) sparseArray5.valueAt(i17));
                                        i17++;
                                    }
                                }
                            }
                            c4716w5.zzc.put(c4488u52.zza, c4488u52);
                            break;
                        }
                        break;
                    case 18:
                        if (iZzd7 == c4716w5.zza) {
                            C3805o5 c3805o5B = b(c1755Pg0, iZzd8);
                            c4716w5.zzd.put(c3805o5B.zza, c3805o5B);
                            break;
                        } else if (iZzd7 == c4716w5.zzb) {
                            C3805o5 c3805o5B2 = b(c1755Pg0, iZzd8);
                            c4716w5.zzf.put(c3805o5B2.zza, c3805o5B2);
                            break;
                        }
                        break;
                    case 19:
                        if (iZzd7 == c4716w5.zza) {
                            C4146r5 c4146r5C = c(c1755Pg0);
                            c4716w5.zze.put(c4146r5C.zza, c4146r5C);
                            break;
                        } else if (iZzd7 == c4716w5.zzb) {
                            C4146r5 c4146r5C2 = c(c1755Pg0);
                            c4716w5.zzg.put(c4146r5C2.zza, c4146r5C2);
                            break;
                        }
                        break;
                    case 20:
                        if (iZzd7 == c4716w5.zza) {
                            c1755Pg0.zzm(4);
                            boolean zZzo2 = c1755Pg0.zzo();
                            c1755Pg0.zzm(3);
                            int iZzd27 = c1755Pg0.zzd(16);
                            int iZzd28 = c1755Pg0.zzd(16);
                            if (zZzo2) {
                                int iZzd29 = c1755Pg0.zzd(16);
                                iZzd3 = c1755Pg0.zzd(16);
                                iZzd5 = c1755Pg0.zzd(16);
                                iZzd4 = c1755Pg0.zzd(16);
                                i13 = iZzd29;
                            } else {
                                iZzd3 = iZzd27;
                                iZzd4 = iZzd28;
                                i13 = 0;
                                iZzd5 = 0;
                            }
                            c4716w5.zzh = new C4033q5(iZzd27, iZzd28, i13, iZzd3, iZzd5, iZzd4);
                            break;
                        }
                        break;
                }
                c1755Pg0.zzn(iZzb - c1755Pg0.zzb());
            }
        }
        C4716w5 c4716w52 = this.f23640f;
        C4260s5 c4260s54 = c4716w52.zzi;
        if (c4260s54 == null) {
            c2433c5 = new C2433c5(AbstractC2394bl0.zzm(), -9223372036854775807L, -9223372036854775807L);
        } else {
            C4033q5 c4033q5 = c4716w52.zzh;
            if (c4033q5 == null) {
                c4033q5 = this.f23638d;
            }
            Bitmap bitmap = this.f23641g;
            if (bitmap == null || c4033q5.zza + 1 != bitmap.getWidth() || c4033q5.zzb + 1 != this.f23641g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c4033q5.zza + 1, c4033q5.zzb + 1, Bitmap.Config.ARGB_8888);
                this.f23641g = bitmapCreateBitmap;
                this.f23637c.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = c4260s54.zzc;
            int i18 = 0;
            while (i18 < sparseArray6.size()) {
                this.f23637c.save();
                C4374t5 c4374t5 = (C4374t5) sparseArray6.valueAt(i18);
                C4488u5 c4488u53 = (C4488u5) this.f23640f.zzc.get(sparseArray6.keyAt(i18));
                int i19 = c4374t5.zza + c4033q5.zzc;
                int i20 = c4374t5.zzb + c4033q5.zze;
                this.f23637c.clipRect(i19, i20, Math.min(c4488u53.zzc + i19, c4033q5.zzd), Math.min(c4488u53.zzd + i20, c4033q5.zzf));
                C3805o5 c3805o5 = (C3805o5) this.f23640f.zzd.get(c4488u53.zzf);
                if (c3805o5 == null) {
                    c3805o5 = (C3805o5) this.f23640f.zzf.get(c4488u53.zzf);
                    if (c3805o5 == null) {
                        c3805o5 = this.f23639e;
                    }
                }
                SparseArray sparseArray7 = c4488u53.zzj;
                int i21 = 0;
                while (i21 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i21);
                    C4602v5 c4602v5 = (C4602v5) sparseArray7.valueAt(i21);
                    C4146r5 c4146r5 = (C4146r5) this.f23640f.zze.get(iKeyAt);
                    if (c4146r5 == null) {
                        c4146r5 = (C4146r5) this.f23640f.zzg.get(iKeyAt);
                    }
                    if (c4146r5 != null) {
                        Paint paint = c4146r5.zzb ? null : this.f23635a;
                        int i22 = c4488u53.zze;
                        int i23 = c4602v5.zza + i19;
                        int i24 = c4602v5.zzb + i20;
                        sparseArray = sparseArray6;
                        Canvas canvas = this.f23637c;
                        sparseArray2 = sparseArray7;
                        i11 = i18;
                        int[] iArr = i22 == 3 ? c3805o5.zzd : i22 == 2 ? c3805o5.zzc : c3805o5.zzb;
                        Paint paint2 = paint;
                        d(c4146r5.zzc, iArr, i22, i23, i24, paint2, canvas);
                        d(c4146r5.zzd, iArr, i22, i23, i24 + 1, paint2, canvas);
                    } else {
                        sparseArray = sparseArray6;
                        i11 = i18;
                        sparseArray2 = sparseArray7;
                    }
                    i21++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    i18 = i11;
                }
                SparseArray sparseArray8 = sparseArray6;
                int i25 = i18;
                float f8 = i20;
                float f9 = i19;
                if (c4488u53.zzb) {
                    int i26 = c4488u53.zze;
                    c9 = 3;
                    if (i26 == 3) {
                        i10 = c3805o5.zzd[c4488u53.zzg];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        i10 = i26 == 2 ? c3805o5.zzc[c4488u53.zzh] : c3805o5.zzb[c4488u53.zzi];
                    }
                    this.f23636b.setColor(i10);
                    this.f23637c.drawRect(f9, f8, c4488u53.zzc + i19, c4488u53.zzd + i20, this.f23636b);
                } else {
                    c9 = 3;
                    c10 = 2;
                }
                C4649vW c4649vW = new C4649vW();
                c4649vW.zzc(Bitmap.createBitmap(this.f23641g, i19, i20, c4488u53.zzc, c4488u53.zzd));
                c4649vW.zzh(f9 / c4033q5.zza);
                c4649vW.zzi(0);
                c4649vW.zze(f8 / c4033q5.zzb, 0);
                c4649vW.zzf(0);
                c4649vW.zzk(c4488u53.zzc / c4033q5.zza);
                c4649vW.zzd(c4488u53.zzd / c4033q5.zzb);
                arrayList.add(c4649vW.zzp());
                this.f23637c.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f23637c.restore();
                i18 = i25 + 1;
                sparseArray6 = sparseArray8;
            }
            c2433c5 = new C2433c5(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        interfaceC3462l40.zza(c2433c5);
    }
}
