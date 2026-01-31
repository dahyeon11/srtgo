package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.ads.c90, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2442c90 implements InterfaceC3875oj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2901g90 f18254a;

    C2442c90(C2901g90 c2901g90) {
        this.f18254a = c2901g90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        L1.n.zzh("", (YT) obj);
        AbstractC0667v0.zza("Failed to get a cache key, reverting to legacy flow.");
        C2901g90 c2901g90 = this.f18254a;
        c2901g90.f19309d = new C2786f90(null, c2901g90.d(), 0 == true ? 1 : 0);
        return this.f18254a.f19309d;
    }
}
