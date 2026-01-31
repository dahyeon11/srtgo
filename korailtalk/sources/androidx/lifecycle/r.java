package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import o.C6021b;

/* loaded from: classes.dex */
public class r extends t {

    /* renamed from: l, reason: collision with root package name */
    private C6021b f10061l;

    private static class a implements u {

        /* renamed from: a, reason: collision with root package name */
        final LiveData f10062a;

        /* renamed from: b, reason: collision with root package name */
        final u f10063b;

        /* renamed from: c, reason: collision with root package name */
        int f10064c = -1;

        a(LiveData liveData, u uVar) {
            this.f10062a = liveData;
            this.f10063b = uVar;
        }

        void a() {
            this.f10062a.observeForever(this);
        }

        void b() {
            this.f10062a.removeObserver(this);
        }

        @Override // androidx.lifecycle.u
        public void onChanged(Object obj) {
            if (this.f10064c != this.f10062a.e()) {
                this.f10064c = this.f10062a.e();
                this.f10063b.onChanged(obj);
            }
        }
    }

    public r() {
        this.f10061l = new C6021b();
    }

    public <S> void addSource(LiveData liveData, u uVar) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(liveData, uVar);
        a aVar2 = (a) this.f10061l.putIfAbsent(liveData, aVar);
        if (aVar2 != null && aVar2.f10063b != uVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar2 == null && hasActiveObservers()) {
            aVar.a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void f() {
        Iterator<Map.Entry<Object, Object>> it = this.f10061l.iterator();
        while (it.hasNext()) {
            ((a) it.next().getValue()).a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void g() {
        Iterator<Map.Entry<Object, Object>> it = this.f10061l.iterator();
        while (it.hasNext()) {
            ((a) it.next().getValue()).b();
        }
    }

    public <S> void removeSource(LiveData liveData) {
        a aVar = (a) this.f10061l.remove(liveData);
        if (aVar != null) {
            aVar.b();
        }
    }

    public r(Object obj) {
        super(obj);
        this.f10061l = new C6021b();
    }
}
