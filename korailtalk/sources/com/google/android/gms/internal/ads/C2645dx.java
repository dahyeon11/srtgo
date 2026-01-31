package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.dx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2645dx {

    /* renamed from: a, reason: collision with root package name */
    private final L1.a f18710a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18711b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18712c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference f18713d;

    /* synthetic */ C2645dx(C2417bx c2417bx, AbstractC2531cx abstractC2531cx) {
        this.f18710a = c2417bx.f18212a;
        this.f18711b = c2417bx.f18213b;
        this.f18713d = c2417bx.f18215d;
        this.f18712c = c2417bx.f18214c;
    }

    final long a() {
        return this.f18712c;
    }

    final Context b() {
        return this.f18711b;
    }

    final C1554Ki c() {
        return new C1554Ki(this.f18711b);
    }

    final L1.a d() {
        return this.f18710a;
    }

    final String e() {
        return G1.u.zzp().zzc(this.f18711b, this.f18710a.afmaVersion);
    }

    final WeakReference f() {
        return this.f18713d;
    }

    public final G1.j zzc() {
        return new G1.j(this.f18711b, this.f18710a);
    }
}
