package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.yd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5001yd implements Comparator {
    C5001yd(C1134Ad c1134Ad) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C1257Dd c1257Dd = (C1257Dd) obj;
        C1257Dd c1257Dd2 = (C1257Dd) obj2;
        int i8 = c1257Dd.f12698c - c1257Dd2.f12698c;
        return i8 != 0 ? i8 : Long.compare(c1257Dd.f12696a, c1257Dd2.f12696a);
    }
}
