package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1638Mj0 extends AbstractC2848fj0 {

    /* renamed from: c, reason: collision with root package name */
    final CharSequence f14696c;

    /* renamed from: d, reason: collision with root package name */
    final AbstractC3533lj0 f14697d;

    /* renamed from: e, reason: collision with root package name */
    int f14698e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f14699f = Integer.MAX_VALUE;

    protected AbstractC1638Mj0(C1720Oj0 c1720Oj0, CharSequence charSequence) {
        this.f14697d = c1720Oj0.f15146a;
        this.f14696c = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2848fj0
    protected final /* bridge */ /* synthetic */ Object a() {
        int iZzc;
        int i8 = this.f14698e;
        while (true) {
            int i9 = this.f14698e;
            if (i9 == -1) {
                b();
                return null;
            }
            int iZzd = zzd(i9);
            if (iZzd == -1) {
                iZzd = this.f14696c.length();
                this.f14698e = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.f14698e = iZzc;
            }
            if (iZzc != i8) {
                if (i8 < iZzd) {
                    this.f14696c.charAt(i8);
                }
                if (i8 < iZzd) {
                    this.f14696c.charAt(iZzd - 1);
                }
                int i10 = this.f14699f;
                if (i10 == 1) {
                    iZzd = this.f14696c.length();
                    this.f14698e = -1;
                    if (iZzd > i8) {
                        this.f14696c.charAt(iZzd - 1);
                    }
                } else {
                    this.f14699f = i10 - 1;
                }
                return this.f14696c.subSequence(i8, iZzd).toString();
            }
            int i11 = iZzc + 1;
            this.f14698e = i11;
            if (i11 > this.f14696c.length()) {
                this.f14698e = -1;
            }
        }
    }

    abstract int zzc(int i8);

    abstract int zzd(int i8);
}
