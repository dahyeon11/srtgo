package j4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f implements F3.t {

    /* renamed from: a, reason: collision with root package name */
    private F3.o f33442a;

    /* renamed from: b, reason: collision with root package name */
    private List f33443b = new ArrayList();

    public f(F3.o oVar) {
        this.f33442a = oVar;
    }

    protected F3.q a(F3.c cVar) {
        this.f33443b.clear();
        try {
            F3.o oVar = this.f33442a;
            if (oVar instanceof F3.k) {
                F3.q qVarDecodeWithState = ((F3.k) oVar).decodeWithState(cVar);
                this.f33442a.reset();
                return qVarDecodeWithState;
            }
            F3.q qVarDecode = oVar.decode(cVar);
            this.f33442a.reset();
            return qVarDecode;
        } catch (Exception unused) {
            this.f33442a.reset();
            return null;
        } catch (Throwable th) {
            this.f33442a.reset();
            throw th;
        }
    }

    protected F3.c b(F3.j jVar) {
        return new F3.c(new M3.j(jVar));
    }

    public F3.q decode(F3.j jVar) {
        return a(b(jVar));
    }

    @Override // F3.t
    public void foundPossibleResultPoint(F3.s sVar) {
        this.f33443b.add(sVar);
    }

    public List<F3.s> getPossibleResultPoints() {
        return new ArrayList(this.f33443b);
    }
}
