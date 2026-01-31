package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ij0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3192ij0 extends AbstractC3078hj0 {

    /* renamed from: a, reason: collision with root package name */
    private final char f19966a;

    C3192ij0(char c9) {
        this.f19966a = c9;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i8 = this.f19966a;
        for (int i9 = 0; i9 < 4; i9++) {
            cArr[5 - i9] = "0123456789ABCDEF".charAt(i8 & 15);
            i8 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3533lj0
    public final boolean zzb(char c9) {
        return c9 == this.f19966a;
    }
}
