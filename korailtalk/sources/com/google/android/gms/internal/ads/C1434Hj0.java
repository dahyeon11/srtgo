package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Hj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1434Hj0 extends AbstractC1638Mj0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C1475Ij0 f13354g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1434Hj0(C1475Ij0 c1475Ij0, C1720Oj0 c1720Oj0, CharSequence charSequence) {
        super(c1720Oj0, charSequence);
        this.f13354g = c1475Ij0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1638Mj0
    final int zzc(int i8) {
        return i8 + 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1638Mj0
    final int zzd(int i8) {
        CharSequence charSequence = this.f14696c;
        int length = charSequence.length();
        AbstractC1188Bj0.zzb(i8, length, "index");
        while (i8 < length) {
            C1475Ij0 c1475Ij0 = this.f13354g;
            if (c1475Ij0.f13491a.zzb(charSequence.charAt(i8))) {
                return i8;
            }
            i8++;
        }
        return -1;
    }
}
