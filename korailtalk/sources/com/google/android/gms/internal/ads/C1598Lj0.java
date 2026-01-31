package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Lj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1598Lj0 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CharSequence f14347a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1720Oj0 f14348b;

    C1598Lj0(C1720Oj0 c1720Oj0, CharSequence charSequence) {
        this.f14347a = charSequence;
        this.f14348b = c1720Oj0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14348b.c(this.f14347a);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        AbstractC3989pj0.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
