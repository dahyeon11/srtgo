package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class Y5 {

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f17336c = new Comparator() { // from class: com.google.android.gms.internal.ads.W5
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((Y5) obj).f17337a.zzb, ((Y5) obj2).f17337a.zzb);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Z5 f17337a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17338b;

    /* synthetic */ Y5(Z5 z52, int i8, X5 x52) {
        this.f17337a = z52;
        this.f17338b = i8;
    }
}
