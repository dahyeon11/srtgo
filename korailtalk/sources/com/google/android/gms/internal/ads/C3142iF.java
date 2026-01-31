package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.iF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3142iF {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19900a;

    /* renamed from: b, reason: collision with root package name */
    private final C1825Ra0 f19901b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f19902c;

    /* renamed from: d, reason: collision with root package name */
    private final C1498Ja0 f19903d;

    /* renamed from: e, reason: collision with root package name */
    private final C2224aF f19904e;

    /* renamed from: f, reason: collision with root package name */
    private final C3739nX f19905f;

    /* synthetic */ C3142iF(C2912gF c2912gF, AbstractC3027hF abstractC3027hF) {
        this.f19900a = c2912gF.f19333a;
        this.f19901b = c2912gF.f19334b;
        this.f19902c = c2912gF.f19335c;
        this.f19903d = c2912gF.f19336d;
        this.f19904e = c2912gF.f19337e;
        this.f19905f = c2912gF.f19338f;
    }

    final Context a(Context context) {
        return this.f19900a;
    }

    final Bundle b() {
        return this.f19902c;
    }

    final C2224aF c() {
        return this.f19904e;
    }

    final C2912gF d() {
        C2912gF c2912gF = new C2912gF();
        c2912gF.zze(this.f19900a);
        c2912gF.zzi(this.f19901b);
        c2912gF.zzf(this.f19902c);
        c2912gF.zzg(this.f19904e);
        c2912gF.zzd(this.f19905f);
        return c2912gF;
    }

    final C3739nX e(String str) {
        C3739nX c3739nX = this.f19905f;
        return c3739nX != null ? c3739nX : new C3739nX(str);
    }

    final C1498Ja0 f() {
        return this.f19903d;
    }

    final C1825Ra0 g() {
        return this.f19901b;
    }
}
