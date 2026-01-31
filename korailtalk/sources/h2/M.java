package h2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import f2.C5392b;
import g2.AbstractC5544f;
import g2.C5539a;
import i2.AbstractC5683p;
import i2.C5661U;
import i2.C5671d;
import java.util.Set;

/* loaded from: classes.dex */
public final class M extends G2.d implements AbstractC5544f.b, AbstractC5544f.c {

    /* renamed from: h, reason: collision with root package name */
    private static final C5539a.AbstractC0301a f31392h = F2.d.zac;

    /* renamed from: a, reason: collision with root package name */
    private final Context f31393a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f31394b;

    /* renamed from: c, reason: collision with root package name */
    private final C5539a.AbstractC0301a f31395c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f31396d;

    /* renamed from: e, reason: collision with root package name */
    private final C5671d f31397e;

    /* renamed from: f, reason: collision with root package name */
    private F2.e f31398f;

    /* renamed from: g, reason: collision with root package name */
    private L f31399g;

    public M(Context context, Handler handler, C5671d c5671d) {
        C5539a.AbstractC0301a abstractC0301a = f31392h;
        this.f31393a = context;
        this.f31394b = handler;
        this.f31397e = (C5671d) AbstractC5683p.checkNotNull(c5671d, "ClientSettings must not be null");
        this.f31396d = c5671d.getRequiredScopes();
        this.f31395c = abstractC0301a;
    }

    static /* bridge */ /* synthetic */ void c(M m8, G2.l lVar) {
        C5392b c5392bZaa = lVar.zaa();
        if (c5392bZaa.isSuccess()) {
            C5661U c5661u = (C5661U) AbstractC5683p.checkNotNull(lVar.zab());
            C5392b c5392bZaa2 = c5661u.zaa();
            if (!c5392bZaa2.isSuccess()) {
                String strValueOf = String.valueOf(c5392bZaa2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                m8.f31399g.zae(c5392bZaa2);
                m8.f31398f.disconnect();
                return;
            }
            m8.f31399g.zaf(c5661u.zab(), m8.f31396d);
        } else {
            m8.f31399g.zae(c5392bZaa);
        }
        m8.f31398f.disconnect();
    }

    @Override // g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnected(Bundle bundle) {
        this.f31398f.zad(this);
    }

    @Override // g2.AbstractC5544f.c, h2.InterfaceC5591h
    public final void onConnectionFailed(C5392b c5392b) {
        this.f31399g.zae(c5392b);
    }

    @Override // g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnectionSuspended(int i8) {
        this.f31398f.disconnect();
    }

    @Override // G2.d, G2.e, G2.f
    public final void zab(G2.l lVar) {
        this.f31394b.post(new K(this, lVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [F2.e, g2.a$f] */
    public final void zae(L l8) {
        F2.e eVar = this.f31398f;
        if (eVar != null) {
            eVar.disconnect();
        }
        this.f31397e.zae(Integer.valueOf(System.identityHashCode(this)));
        C5539a.AbstractC0301a abstractC0301a = this.f31395c;
        Context context = this.f31393a;
        Looper looper = this.f31394b.getLooper();
        C5671d c5671d = this.f31397e;
        this.f31398f = abstractC0301a.buildClient(context, looper, c5671d, (Object) c5671d.zaa(), (AbstractC5544f.b) this, (AbstractC5544f.c) this);
        this.f31399g = l8;
        Set set = this.f31396d;
        if (set == null || set.isEmpty()) {
            this.f31394b.post(new J(this));
        } else {
            this.f31398f.zab();
        }
    }

    public final void zaf() {
        F2.e eVar = this.f31398f;
        if (eVar != null) {
            eVar.disconnect();
        }
    }
}
