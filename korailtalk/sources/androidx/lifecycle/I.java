package androidx.lifecycle;

import R6.InterfaceC0749c;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p.InterfaceC6046a;

/* loaded from: classes.dex */
public abstract class I {

    static final class a extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ r f9959a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f9960b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r rVar, Ref.BooleanRef booleanRef) {
            super(1);
            this.f9959a = rVar;
            this.f9960b = booleanRef;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m390invoke((a) obj);
            return R6.G.INSTANCE;
        }

        /* renamed from: invoke */
        public final void m390invoke(X x8) {
            Object value = this.f9959a.getValue();
            if (this.f9960b.element || ((value == null && x8 != 0) || !(value == null || Intrinsics.areEqual(value, x8)))) {
                this.f9960b.element = false;
                this.f9959a.setValue(x8);
            }
        }
    }

    static final class b extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ r f9961a;

        /* renamed from: b */
        final /* synthetic */ f7.l f9962b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r rVar, f7.l lVar) {
            super(1);
            this.f9961a = rVar;
            this.f9962b = lVar;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m391invoke((b) obj);
            return R6.G.INSTANCE;
        }

        /* renamed from: invoke */
        public final void m391invoke(X x8) {
            this.f9961a.setValue(this.f9962b.invoke(x8));
        }
    }

    public static final class c extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ r f9963a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC6046a f9964b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r rVar, InterfaceC6046a interfaceC6046a) {
            super(1);
            this.f9963a = rVar;
            this.f9964b = interfaceC6046a;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m392invoke(obj);
            return R6.G.INSTANCE;
        }

        /* renamed from: invoke */
        public final void m392invoke(Object obj) {
            this.f9963a.setValue(this.f9964b.apply(obj));
        }
    }

    public static final class d implements u, FunctionAdapter {

        /* renamed from: a */
        private final /* synthetic */ f7.l f9965a;

        d(f7.l function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f9965a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof u) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final InterfaceC0749c getFunctionDelegate() {
            return this.f9965a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f9965a.invoke(obj);
        }
    }

    public static final class e implements u {

        /* renamed from: a */
        private LiveData f9966a;

        /* renamed from: b */
        final /* synthetic */ f7.l f9967b;

        /* renamed from: c */
        final /* synthetic */ r f9968c;

        static final class a extends Lambda implements f7.l {

            /* renamed from: a */
            final /* synthetic */ r f9969a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar) {
                super(1);
                this.f9969a = rVar;
            }

            @Override // f7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m393invoke((a) obj);
                return R6.G.INSTANCE;
            }

            /* renamed from: invoke */
            public final void m393invoke(Y y8) {
                this.f9969a.setValue(y8);
            }
        }

        e(f7.l lVar, r rVar) {
            this.f9967b = lVar;
            this.f9968c = rVar;
        }

        public final LiveData getLiveData() {
            return this.f9966a;
        }

        @Override // androidx.lifecycle.u
        public void onChanged(X x8) {
            LiveData liveData = (LiveData) this.f9967b.invoke(x8);
            LiveData liveData2 = this.f9966a;
            if (liveData2 == liveData) {
                return;
            }
            if (liveData2 != null) {
                r rVar = this.f9968c;
                Intrinsics.checkNotNull(liveData2);
                rVar.removeSource(liveData2);
            }
            this.f9966a = liveData;
            if (liveData != null) {
                r rVar2 = this.f9968c;
                Intrinsics.checkNotNull(liveData);
                rVar2.addSource(liveData, new d(new a(this.f9968c)));
            }
        }

        public final void setLiveData(LiveData liveData) {
            this.f9966a = liveData;
        }
    }

    public static final class f implements u {

        /* renamed from: a */
        private LiveData f9970a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC6046a f9971b;

        /* renamed from: c */
        final /* synthetic */ r f9972c;

        static final class a extends Lambda implements f7.l {

            /* renamed from: a */
            final /* synthetic */ r f9973a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar) {
                super(1);
                this.f9973a = rVar;
            }

            @Override // f7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m394invoke(obj);
                return R6.G.INSTANCE;
            }

            /* renamed from: invoke */
            public final void m394invoke(Object obj) {
                this.f9973a.setValue(obj);
            }
        }

        f(InterfaceC6046a interfaceC6046a, r rVar) {
            this.f9971b = interfaceC6046a;
            this.f9972c = rVar;
        }

        public final LiveData getLiveData() {
            return this.f9970a;
        }

        @Override // androidx.lifecycle.u
        public void onChanged(Object obj) {
            LiveData liveData = (LiveData) this.f9971b.apply(obj);
            LiveData liveData2 = this.f9970a;
            if (liveData2 == liveData) {
                return;
            }
            if (liveData2 != null) {
                r rVar = this.f9972c;
                Intrinsics.checkNotNull(liveData2);
                rVar.removeSource(liveData2);
            }
            this.f9970a = liveData;
            if (liveData != null) {
                r rVar2 = this.f9972c;
                Intrinsics.checkNotNull(liveData);
                rVar2.addSource(liveData, new d(new a(this.f9972c)));
            }
        }

        public final void setLiveData(LiveData liveData) {
            this.f9970a = liveData;
        }
    }

    public static final <X> LiveData distinctUntilChanged(LiveData liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        r rVar = new r();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (liveData.isInitialized()) {
            rVar.setValue(liveData.getValue());
            booleanRef.element = false;
        }
        rVar.addSource(liveData, new d(new a(rVar, booleanRef)));
        return rVar;
    }

    public static final <X, Y> LiveData map(LiveData liveData, f7.l transform) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        r rVar = new r();
        rVar.addSource(liveData, new d(new b(rVar, transform)));
        return rVar;
    }

    public static final <X, Y> LiveData switchMap(LiveData liveData, f7.l transform) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        r rVar = new r();
        rVar.addSource(liveData, new e(transform, rVar));
        return rVar;
    }

    public static final /* synthetic */ LiveData map(LiveData liveData, InterfaceC6046a mapFunction) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        r rVar = new r();
        rVar.addSource(liveData, new d(new c(rVar, mapFunction)));
        return rVar;
    }

    public static final /* synthetic */ LiveData switchMap(LiveData liveData, InterfaceC6046a switchMapFunction) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(switchMapFunction, "switchMapFunction");
        r rVar = new r();
        rVar.addSource(liveData, new f(switchMapFunction, rVar));
        return rVar;
    }
}
