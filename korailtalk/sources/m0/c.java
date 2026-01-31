package M0;

import P0.r;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c implements L0.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f3088a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private Object f3089b;

    /* renamed from: c, reason: collision with root package name */
    private N0.d f3090c;

    /* renamed from: d, reason: collision with root package name */
    private a f3091d;

    public interface a {
        void onConstraintMet(List<String> list);

        void onConstraintNotMet(List<String> list);
    }

    c(N0.d dVar) {
        this.f3090c = dVar;
    }

    private void c(a aVar, Object obj) {
        if (this.f3088a.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            aVar.onConstraintNotMet(this.f3088a);
        } else {
            aVar.onConstraintMet(this.f3088a);
        }
    }

    abstract boolean a(r rVar);

    abstract boolean b(Object obj);

    public boolean isWorkSpecConstrained(String str) {
        Object obj = this.f3089b;
        return obj != null && b(obj) && this.f3088a.contains(str);
    }

    @Override // L0.a
    public void onConstraintChanged(Object obj) {
        this.f3089b = obj;
        c(this.f3091d, obj);
    }

    public void replace(Iterable<r> iterable) {
        this.f3088a.clear();
        for (r rVar : iterable) {
            if (a(rVar)) {
                this.f3088a.add(rVar.id);
            }
        }
        if (this.f3088a.isEmpty()) {
            this.f3090c.removeListener(this);
        } else {
            this.f3090c.addListener(this);
        }
        c(this.f3091d, this.f3089b);
    }

    public void reset() {
        if (this.f3088a.isEmpty()) {
            return;
        }
        this.f3088a.clear();
        this.f3090c.removeListener(this);
    }

    public void setCallback(a aVar) {
        if (this.f3091d != aVar) {
            this.f3091d = aVar;
            c(aVar, this.f3089b);
        }
    }
}
