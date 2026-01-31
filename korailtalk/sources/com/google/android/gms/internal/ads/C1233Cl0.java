package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.Cl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1233Cl0 extends AbstractC1397Gl0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f12573a;

    C1233Cl0(Comparator comparator) {
        this.f12573a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1397Gl0
    final Map a() {
        return new TreeMap(this.f12573a);
    }
}
