package androidx.lifecycle;

import androidx.lifecycle.AbstractC1019h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n.C5921c;
import o.C6020a;
import o.C6021b;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public class C1026o extends AbstractC1019h {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private final boolean f10048b;

    /* renamed from: c */
    private C6020a f10049c;

    /* renamed from: d */
    private AbstractC1019h.b f10050d;

    /* renamed from: e */
    private final WeakReference f10051e;

    /* renamed from: f */
    private int f10052f;

    /* renamed from: g */
    private boolean f10053g;

    /* renamed from: h */
    private boolean f10054h;

    /* renamed from: i */
    private ArrayList f10055i;

    /* renamed from: androidx.lifecycle.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1026o createUnsafe(InterfaceC1025n owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new C1026o(owner, false, null);
        }

        public final AbstractC1019h.b min$lifecycle_runtime_release(AbstractC1019h.b state1, AbstractC1019h.b bVar) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        private a() {
        }
    }

    /* renamed from: androidx.lifecycle.o$b */
    public static final class b {

        /* renamed from: a */
        private AbstractC1019h.b f10056a;

        /* renamed from: b */
        private InterfaceC1023l f10057b;

        public b(InterfaceC1024m interfaceC1024m, AbstractC1019h.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(interfaceC1024m);
            this.f10057b = q.lifecycleEventObserver(interfaceC1024m);
            this.f10056a = initialState;
        }

        public final void dispatchEvent(InterfaceC1025n interfaceC1025n, AbstractC1019h.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC1019h.b targetState = event.getTargetState();
            this.f10056a = C1026o.Companion.min$lifecycle_runtime_release(this.f10056a, targetState);
            InterfaceC1023l interfaceC1023l = this.f10057b;
            Intrinsics.checkNotNull(interfaceC1025n);
            interfaceC1023l.onStateChanged(interfaceC1025n, event);
            this.f10056a = targetState;
        }

        public final InterfaceC1023l getLifecycleObserver() {
            return this.f10057b;
        }

        public final AbstractC1019h.b getState() {
            return this.f10056a;
        }

        public final void setLifecycleObserver(InterfaceC1023l interfaceC1023l) {
            Intrinsics.checkNotNullParameter(interfaceC1023l, "<set-?>");
            this.f10057b = interfaceC1023l;
        }

        public final void setState(AbstractC1019h.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            this.f10056a = bVar;
        }
    }

    public /* synthetic */ C1026o(InterfaceC1025n interfaceC1025n, boolean z8, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1025n, z8);
    }

    private final void a(InterfaceC1025n interfaceC1025n) {
        Iterator<Map.Entry<Object, Object>> itDescendingIterator = this.f10049c.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f10054h) {
            Map.Entry<Object, Object> next = itDescendingIterator.next();
            Intrinsics.checkNotNullExpressionValue(next, "next()");
            InterfaceC1024m interfaceC1024m = (InterfaceC1024m) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.getState().compareTo(this.f10050d) > 0 && !this.f10054h && this.f10049c.contains(interfaceC1024m)) {
                AbstractC1019h.a aVarDownFrom = AbstractC1019h.a.Companion.downFrom(bVar.getState());
                if (aVarDownFrom == null) {
                    throw new IllegalStateException("no event down from " + bVar.getState());
                }
                h(aVarDownFrom.getTargetState());
                bVar.dispatchEvent(interfaceC1025n, aVarDownFrom);
                g();
            }
        }
    }

    private final AbstractC1019h.b b(InterfaceC1024m interfaceC1024m) {
        b bVar;
        Map.Entry<Object, Object> entryCeil = this.f10049c.ceil(interfaceC1024m);
        AbstractC1019h.b bVar2 = null;
        AbstractC1019h.b state = (entryCeil == null || (bVar = (b) entryCeil.getValue()) == null) ? null : bVar.getState();
        if (!this.f10055i.isEmpty()) {
            bVar2 = (AbstractC1019h.b) this.f10055i.get(r0.size() - 1);
        }
        a aVar = Companion;
        return aVar.min$lifecycle_runtime_release(aVar.min$lifecycle_runtime_release(this.f10050d, state), bVar2);
    }

    private final void c(String str) {
        if (!this.f10048b || C5921c.getInstance().isMainThread()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public static final C1026o createUnsafe(InterfaceC1025n interfaceC1025n) {
        return Companion.createUnsafe(interfaceC1025n);
    }

    private final void d(InterfaceC1025n interfaceC1025n) {
        C6021b.d dVarIteratorWithAdditions = this.f10049c.iteratorWithAdditions();
        Intrinsics.checkNotNullExpressionValue(dVarIteratorWithAdditions, "observerMap.iteratorWithAdditions()");
        while (dVarIteratorWithAdditions.hasNext() && !this.f10054h) {
            Map.Entry entry = (Map.Entry) dVarIteratorWithAdditions.next();
            InterfaceC1024m interfaceC1024m = (InterfaceC1024m) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.getState().compareTo(this.f10050d) < 0 && !this.f10054h && this.f10049c.contains(interfaceC1024m)) {
                h(bVar.getState());
                AbstractC1019h.a aVarUpFrom = AbstractC1019h.a.Companion.upFrom(bVar.getState());
                if (aVarUpFrom == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.dispatchEvent(interfaceC1025n, aVarUpFrom);
                g();
            }
        }
    }

    private final boolean e() {
        if (this.f10049c.size() == 0) {
            return true;
        }
        Map.Entry<Object, Object> entryEldest = this.f10049c.eldest();
        Intrinsics.checkNotNull(entryEldest);
        AbstractC1019h.b state = ((b) entryEldest.getValue()).getState();
        Map.Entry<Object, Object> entryNewest = this.f10049c.newest();
        Intrinsics.checkNotNull(entryNewest);
        AbstractC1019h.b state2 = ((b) entryNewest.getValue()).getState();
        return state == state2 && this.f10050d == state2;
    }

    private final void f(AbstractC1019h.b bVar) {
        AbstractC1019h.b bVar2 = this.f10050d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC1019h.b.INITIALIZED && bVar == AbstractC1019h.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f10050d + " in component " + this.f10051e.get()).toString());
        }
        this.f10050d = bVar;
        if (this.f10053g || this.f10052f != 0) {
            this.f10054h = true;
            return;
        }
        this.f10053g = true;
        i();
        this.f10053g = false;
        if (this.f10050d == AbstractC1019h.b.DESTROYED) {
            this.f10049c = new C6020a();
        }
    }

    private final void g() {
        this.f10055i.remove(r0.size() - 1);
    }

    private final void h(AbstractC1019h.b bVar) {
        this.f10055i.add(bVar);
    }

    private final void i() {
        InterfaceC1025n interfaceC1025n = (InterfaceC1025n) this.f10051e.get();
        if (interfaceC1025n == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!e()) {
            this.f10054h = false;
            AbstractC1019h.b bVar = this.f10050d;
            Map.Entry<Object, Object> entryEldest = this.f10049c.eldest();
            Intrinsics.checkNotNull(entryEldest);
            if (bVar.compareTo(((b) entryEldest.getValue()).getState()) < 0) {
                a(interfaceC1025n);
            }
            Map.Entry<Object, Object> entryNewest = this.f10049c.newest();
            if (!this.f10054h && entryNewest != null && this.f10050d.compareTo(((b) entryNewest.getValue()).getState()) > 0) {
                d(interfaceC1025n);
            }
        }
        this.f10054h = false;
    }

    @Override // androidx.lifecycle.AbstractC1019h
    public void addObserver(InterfaceC1024m observer) {
        InterfaceC1025n interfaceC1025n;
        Intrinsics.checkNotNullParameter(observer, "observer");
        c("addObserver");
        AbstractC1019h.b bVar = this.f10050d;
        AbstractC1019h.b bVar2 = AbstractC1019h.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1019h.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f10049c.putIfAbsent(observer, bVar3)) == null && (interfaceC1025n = (InterfaceC1025n) this.f10051e.get()) != null) {
            boolean z8 = this.f10052f != 0 || this.f10053g;
            AbstractC1019h.b bVarB = b(observer);
            this.f10052f++;
            while (bVar3.getState().compareTo(bVarB) < 0 && this.f10049c.contains(observer)) {
                h(bVar3.getState());
                AbstractC1019h.a aVarUpFrom = AbstractC1019h.a.Companion.upFrom(bVar3.getState());
                if (aVarUpFrom == null) {
                    throw new IllegalStateException("no event up from " + bVar3.getState());
                }
                bVar3.dispatchEvent(interfaceC1025n, aVarUpFrom);
                g();
                bVarB = b(observer);
            }
            if (!z8) {
                i();
            }
            this.f10052f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1019h
    public AbstractC1019h.b getCurrentState() {
        return this.f10050d;
    }

    public int getObserverCount() {
        c("getObserverCount");
        return this.f10049c.size();
    }

    public void handleLifecycleEvent(AbstractC1019h.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        c("handleLifecycleEvent");
        f(event.getTargetState());
    }

    public void markState(AbstractC1019h.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        c("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.AbstractC1019h
    public void removeObserver(InterfaceC1024m observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        c("removeObserver");
        this.f10049c.remove(observer);
    }

    public void setCurrentState(AbstractC1019h.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        c("setCurrentState");
        f(state);
    }

    private C1026o(InterfaceC1025n interfaceC1025n, boolean z8) {
        this.f10048b = z8;
        this.f10049c = new C6020a();
        this.f10050d = AbstractC1019h.b.INITIALIZED;
        this.f10055i = new ArrayList();
        this.f10051e = new WeakReference(interfaceC1025n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1026o(InterfaceC1025n provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
