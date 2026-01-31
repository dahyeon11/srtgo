package com.google.android.gms.common.api.internal;

import android.app.Activity;
import f2.C5392b;
import f2.C5397g;
import h2.C5585b;
import h2.InterfaceC5589f;
import i2.AbstractC5683p;

/* renamed from: com.google.android.gms.common.api.internal.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116n extends w0 {

    /* renamed from: f, reason: collision with root package name */
    private final O.b f12079f;

    /* renamed from: g, reason: collision with root package name */
    private final C1105c f12080g;

    C1116n(InterfaceC5589f interfaceC5589f, C1105c c1105c, C5397g c5397g) {
        super(interfaceC5589f, c5397g);
        this.f12079f = new O.b();
        this.f12080g = c1105c;
        this.f11930a.addCallback("ConnectionlessLifecycleHelper", this);
    }

    private final void j() {
        if (this.f12079f.isEmpty()) {
            return;
        }
        this.f12080g.zaC(this);
    }

    public static void zad(Activity activity, C1105c c1105c, C5585b c5585b) {
        InterfaceC5589f fragment = LifecycleCallback.getFragment(activity);
        C1116n c1116n = (C1116n) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", C1116n.class);
        if (c1116n == null) {
            c1116n = new C1116n(fragment, c1105c, C5397g.getInstance());
        }
        AbstractC5683p.checkNotNull(c5585b, "ApiKey cannot be null");
        c1116n.f12079f.add(c5585b);
        c1105c.zaC(c1116n);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    protected final void c(C5392b c5392b, int i8) {
        this.f12080g.zaz(c5392b, i8);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    protected final void d() {
        this.f12080g.zaA();
    }

    final O.b i() {
        return this.f12079f;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        j();
    }

    @Override // com.google.android.gms.common.api.internal.w0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        j();
    }

    @Override // com.google.android.gms.common.api.internal.w0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.f12080g.a(this);
    }
}
