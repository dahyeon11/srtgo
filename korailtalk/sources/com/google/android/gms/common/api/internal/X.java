package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import f2.C5392b;
import g2.C5539a;
import h2.C5585b;
import i2.AbstractC5670c;
import i2.InterfaceC5677j;
import java.util.Set;

/* loaded from: classes.dex */
final class X implements AbstractC5670c.InterfaceC0311c, h2.L {

    /* renamed from: a, reason: collision with root package name */
    private final C5539a.f f11970a;

    /* renamed from: b, reason: collision with root package name */
    private final C5585b f11971b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5677j f11972c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f11973d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11974e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C1105c f11975f;

    public X(C1105c c1105c, C5539a.f fVar, C5585b c5585b) {
        this.f11975f = c1105c;
        this.f11970a = fVar;
        this.f11971b = c5585b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        InterfaceC5677j interfaceC5677j;
        if (!this.f11974e || (interfaceC5677j = this.f11972c) == null) {
            return;
        }
        this.f11970a.getRemoteService(interfaceC5677j, this.f11973d);
    }

    @Override // i2.AbstractC5670c.InterfaceC0311c
    public final void onReportServiceBinding(C5392b c5392b) {
        this.f11975f.f12011p.post(new W(this, c5392b));
    }

    @Override // h2.L
    public final void zae(C5392b c5392b) {
        U u8 = (U) this.f11975f.f12007l.get(this.f11971b);
        if (u8 != null) {
            u8.zas(c5392b);
        }
    }

    @Override // h2.L
    public final void zaf(InterfaceC5677j interfaceC5677j, Set<Scope> set) {
        if (interfaceC5677j == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            zae(new C5392b(4));
        } else {
            this.f11972c = interfaceC5677j;
            this.f11973d = set;
            e();
        }
    }
}
