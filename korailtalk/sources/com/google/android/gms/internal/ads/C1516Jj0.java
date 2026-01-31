package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1516Jj0 extends AbstractC1638Mj0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C1557Kj0 f13681g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1516Jj0(C1557Kj0 c1557Kj0, C1720Oj0 c1720Oj0, CharSequence charSequence) {
        super(c1720Oj0, charSequence);
        this.f13681g = c1557Kj0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1638Mj0
    public final int zzc(int i8) {
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1638Mj0
    public final int zzd(int i8) {
        int i9 = i8 + 4000;
        if (i9 < this.f14696c.length()) {
            return i9;
        }
        return -1;
    }
}
