package f3;

import e3.AbstractC5358c;
import e3.p;
import f3.D0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class C0 {

    /* renamed from: a */
    boolean f30614a;

    /* renamed from: b */
    int f30615b = -1;

    /* renamed from: c */
    int f30616c = -1;

    /* renamed from: d */
    D0.n f30617d;

    /* renamed from: e */
    D0.n f30618e;

    /* renamed from: f */
    e3.j f30619f;

    int a() {
        int i8 = this.f30616c;
        if (i8 == -1) {
            return 4;
        }
        return i8;
    }

    int b() {
        int i8 = this.f30615b;
        if (i8 == -1) {
            return 16;
        }
        return i8;
    }

    e3.j c() {
        return (e3.j) e3.p.firstNonNull(this.f30619f, d().b());
    }

    public C0 concurrencyLevel(int i8) {
        int i9 = this.f30616c;
        e3.w.checkState(i9 == -1, "concurrency level was already set to %s", i9);
        e3.w.checkArgument(i8 > 0);
        this.f30616c = i8;
        return this;
    }

    D0.n d() {
        return (D0.n) e3.p.firstNonNull(this.f30617d, D0.n.STRONG);
    }

    D0.n e() {
        return (D0.n) e3.p.firstNonNull(this.f30618e, D0.n.STRONG);
    }

    C0 f(D0.n nVar) {
        D0.n nVar2 = this.f30617d;
        e3.w.checkState(nVar2 == null, "Key strength was already set to %s", nVar2);
        this.f30617d = (D0.n) e3.w.checkNotNull(nVar);
        if (nVar != D0.n.STRONG) {
            this.f30614a = true;
        }
        return this;
    }

    C0 g(D0.n nVar) {
        D0.n nVar2 = this.f30618e;
        e3.w.checkState(nVar2 == null, "Value strength was already set to %s", nVar2);
        this.f30618e = (D0.n) e3.w.checkNotNull(nVar);
        if (nVar != D0.n.STRONG) {
            this.f30614a = true;
        }
        return this;
    }

    public C0 initialCapacity(int i8) {
        int i9 = this.f30615b;
        e3.w.checkState(i9 == -1, "initial capacity was already set to %s", i9);
        e3.w.checkArgument(i8 >= 0);
        this.f30615b = i8;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> makeMap() {
        return !this.f30614a ? new ConcurrentHashMap(b(), 0.75f, a()) : D0.b(this);
    }

    public String toString() {
        p.b stringHelper = e3.p.toStringHelper(this);
        int i8 = this.f30615b;
        if (i8 != -1) {
            stringHelper.add("initialCapacity", i8);
        }
        int i9 = this.f30616c;
        if (i9 != -1) {
            stringHelper.add("concurrencyLevel", i9);
        }
        D0.n nVar = this.f30617d;
        if (nVar != null) {
            stringHelper.add("keyStrength", AbstractC5358c.toLowerCase(nVar.toString()));
        }
        D0.n nVar2 = this.f30618e;
        if (nVar2 != null) {
            stringHelper.add("valueStrength", AbstractC5358c.toLowerCase(nVar2.toString()));
        }
        if (this.f30619f != null) {
            stringHelper.addValue("keyEquivalence");
        }
        return stringHelper.toString();
    }

    public C0 weakKeys() {
        return f(D0.n.WEAK);
    }

    public C0 weakValues() {
        return g(D0.n.WEAK);
    }
}
