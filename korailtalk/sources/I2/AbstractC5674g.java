package i2;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import f2.C5394d;
import f2.C5397g;
import g2.AbstractC5544f;
import g2.C5539a;
import h2.InterfaceC5587d;
import h2.InterfaceC5591h;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: i2.g */
/* loaded from: classes.dex */
public abstract class AbstractC5674g extends AbstractC5670c implements C5539a.f, InterfaceC5650I {

    /* renamed from: E */
    private final C5671d f31801E;

    /* renamed from: F */
    private final Set f31802F;

    /* renamed from: G */
    private final Account f31803G;

    protected AbstractC5674g(Context context, Looper looper, int i8, C5671d c5671d, AbstractC5544f.b bVar, AbstractC5544f.c cVar) {
        this(context, looper, i8, c5671d, (InterfaceC5587d) bVar, (InterfaceC5591h) cVar);
    }

    private final Set H(Set set) {
        Set setG = G(set);
        Iterator it = setG.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setG;
    }

    protected final C5671d F() {
        return this.f31801E;
    }

    @Override // i2.AbstractC5670c
    protected final Executor d() {
        return null;
    }

    @Override // i2.AbstractC5670c
    protected final Set g() {
        return this.f31802F;
    }

    @Override // i2.AbstractC5670c
    public final Account getAccount() {
        return this.f31803G;
    }

    @Override // g2.C5539a.f
    public C5394d[] getRequiredFeatures() {
        return new C5394d[0];
    }

    @Override // g2.C5539a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.f31802F : Collections.emptySet();
    }

    protected AbstractC5674g(Context context, Looper looper, int i8, C5671d c5671d, InterfaceC5587d interfaceC5587d, InterfaceC5591h interfaceC5591h) {
        this(context, looper, AbstractC5675h.getInstance(context), C5397g.getInstance(), i8, c5671d, (InterfaceC5587d) AbstractC5683p.checkNotNull(interfaceC5587d), (InterfaceC5591h) AbstractC5683p.checkNotNull(interfaceC5591h));
    }

    protected AbstractC5674g(Context context, Looper looper, AbstractC5675h abstractC5675h, C5397g c5397g, int i8, C5671d c5671d, InterfaceC5587d interfaceC5587d, InterfaceC5591h interfaceC5591h) {
        super(context, looper, abstractC5675h, c5397g, i8, interfaceC5587d == null ? null : new C5648G(interfaceC5587d), interfaceC5591h == null ? null : new C5649H(interfaceC5591h), c5671d.zac());
        this.f31801E = c5671d;
        this.f31803G = c5671d.getAccount();
        this.f31802F = H(c5671d.getAllRequestedScopes());
    }

    protected Set G(Set set) {
        return set;
    }
}
