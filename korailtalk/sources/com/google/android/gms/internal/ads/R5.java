package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import e3.AbstractC5358c;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes2.dex */
public final class R5 implements InterfaceC3349k5 {

    /* renamed from: a */
    private final C4099qh0 f16053a = new C4099qh0();

    /* renamed from: b */
    private final boolean f16054b;

    /* renamed from: c */
    private final int f16055c;

    /* renamed from: d */
    private final int f16056d;

    /* renamed from: e */
    private final String f16057e;

    /* renamed from: f */
    private final float f16058f;

    /* renamed from: g */
    private final int f16059g;

    public R5(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f16055c = 0;
            this.f16056d = -1;
            this.f16057e = "sans-serif";
            this.f16054b = false;
            this.f16058f = 0.85f;
            this.f16059g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f16055c = bArr[24];
        this.f16056d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f16057e = true == "Serif".equals(AbstractC2281am0.zzB(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i8 = bArr[25] * AbstractC5358c.DC4;
        this.f16059g = i8;
        boolean z8 = (bArr[0] & 32) != 0;
        this.f16054b = z8;
        if (z8) {
            this.f16058f = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i8, 0.95f));
        } else {
            this.f16058f = 0.85f;
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i8, int i9, int i10, int i11, int i12) {
        if (i8 != i9) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i8 >>> 8) | ((i8 & 255) << 24)), i10, i11, i12 | 33);
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i8, int i9, int i10, int i11, int i12) {
        if (i8 != i9) {
            int i13 = i12 | 33;
            int i14 = i8 & 1;
            int i15 = i8 & 2;
            boolean z8 = true;
            if (i14 != 0) {
                if (i15 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i10, i11, i13);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i10, i11, i13);
                    z8 = false;
                }
            } else if (i15 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, i13);
            } else {
                z8 = false;
            }
            if ((i8 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, i13);
            } else {
                if (i14 != 0 || z8) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i10, i11, i13);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3349k5
    public final void zza(byte[] bArr, int i8, int i9, C3235j5 c3235j5, InterfaceC3462l40 interfaceC3462l40) {
        String strZzA;
        int i10;
        int i11;
        int length;
        this.f16053a.zzI(bArr, i8 + i9);
        this.f16053a.zzK(i8);
        C4099qh0 c4099qh0 = this.f16053a;
        int i12 = 1;
        int i13 = 0;
        int i14 = 2;
        F10.zzd(c4099qh0.zzb() >= 2);
        int iZzq = c4099qh0.zzq();
        if (iZzq == 0) {
            strZzA = "";
        } else {
            int iZzd = c4099qh0.zzd();
            Charset charsetZzB = c4099qh0.zzB();
            int iZzd2 = c4099qh0.zzd() - iZzd;
            if (charsetZzB == null) {
                charsetZzB = AbstractC3647mj0.zzc;
            }
            strZzA = c4099qh0.zzA(iZzq - iZzd2, charsetZzB);
        }
        if (strZzA.isEmpty()) {
            interfaceC3462l40.zza(new C2433c5(AbstractC2394bl0.zzm(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzA);
        b(spannableStringBuilder, this.f16055c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f16056d, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.f16057e;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fMax = this.f16058f;
        while (true) {
            C4099qh0 c4099qh02 = this.f16053a;
            if (c4099qh02.zzb() < 8) {
                C4649vW c4649vW = new C4649vW();
                c4649vW.zzl(spannableStringBuilder);
                c4649vW.zze(fMax, 0);
                c4649vW.zzf(0);
                interfaceC3462l40.zza(new C2433c5(AbstractC2394bl0.zzn(c4649vW.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int iZzd3 = c4099qh02.zzd();
            int iZzg = c4099qh02.zzg();
            int iZzg2 = this.f16053a.zzg();
            if (iZzg2 == 1937013100) {
                F10.zzd(this.f16053a.zzb() >= i14 ? i12 : i13);
                int iZzq2 = this.f16053a.zzq();
                int i15 = i13;
                while (i15 < iZzq2) {
                    C4099qh0 c4099qh03 = this.f16053a;
                    F10.zzd(c4099qh03.zzb() >= 12 ? i12 : i13);
                    int iZzq3 = c4099qh03.zzq();
                    int iZzq4 = c4099qh03.zzq();
                    c4099qh03.zzL(i14);
                    int iZzm = c4099qh03.zzm();
                    c4099qh03.zzL(i12);
                    int iZzg3 = c4099qh03.zzg();
                    if (iZzq4 > spannableStringBuilder.length()) {
                        int length3 = spannableStringBuilder.length();
                        StringBuilder sb = new StringBuilder();
                        i11 = iZzq2;
                        sb.append("Truncating styl end (");
                        sb.append(iZzq4);
                        sb.append(") to cueText.length() (");
                        sb.append(length3);
                        sb.append(").");
                        AbstractC2834fc0.zzf("Tx3gParser", sb.toString());
                        length = spannableStringBuilder.length();
                    } else {
                        i11 = iZzq2;
                        length = iZzq4;
                    }
                    if (iZzq3 >= length) {
                        AbstractC2834fc0.zzf("Tx3gParser", "Ignoring styl with start (" + iZzq3 + ") >= end (" + length + ").");
                    } else {
                        int i16 = length;
                        b(spannableStringBuilder, iZzm, this.f16055c, iZzq3, i16, 0);
                        a(spannableStringBuilder, iZzg3, this.f16056d, iZzq3, i16, 0);
                    }
                    i15++;
                    iZzq2 = i11;
                    i12 = 1;
                    i13 = 0;
                    i14 = 2;
                }
                i10 = i14;
            } else if (iZzg2 == 1952608120 && this.f16054b) {
                i10 = 2;
                F10.zzd(this.f16053a.zzb() >= 2);
                fMax = Math.max(0.0f, Math.min(this.f16053a.zzq() / this.f16059g, 0.95f));
            } else {
                i10 = 2;
            }
            this.f16053a.zzK(iZzd3 + iZzg);
            i14 = i10;
            i12 = 1;
            i13 = 0;
        }
    }
}
