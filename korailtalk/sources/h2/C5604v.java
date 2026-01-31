package h2;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC1103b;
import com.google.android.gms.common.api.internal.j0;
import g2.AbstractC5543e;
import g2.C5539a;

/* renamed from: h2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5604v extends C5598o {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5543e f31440c;

    public C5604v(AbstractC5543e abstractC5543e) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f31440c = abstractC5543e;
    }

    @Override // g2.AbstractC5544f
    public final <A extends C5539a.b, R extends g2.n, T extends AbstractC1103b> T enqueue(T t8) {
        return (T) this.f31440c.doRead((AbstractC5543e) t8);
    }

    @Override // g2.AbstractC5544f
    public final <A extends C5539a.b, T extends AbstractC1103b> T execute(T t8) {
        return (T) this.f31440c.doWrite((AbstractC5543e) t8);
    }

    @Override // g2.AbstractC5544f
    public final Context getContext() {
        return this.f31440c.getApplicationContext();
    }

    @Override // g2.AbstractC5544f
    public final Looper getLooper() {
        return this.f31440c.getLooper();
    }

    @Override // g2.AbstractC5544f
    public final void zao(j0 j0Var) {
    }

    @Override // g2.AbstractC5544f
    public final void zap(j0 j0Var) {
    }
}
