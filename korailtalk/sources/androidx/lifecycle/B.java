package androidx.lifecycle;

import S6.Q;
import S6.d0;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q7.AbstractC6134U;
import q7.AbstractC6149k;
import q7.InterfaceC6118D;
import q7.InterfaceC6132S;

/* loaded from: classes.dex */
public final class B {
    public static final a Companion = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Class[] f9930f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    private final Map f9931a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f9932b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f9933c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f9934d;

    /* renamed from: e, reason: collision with root package name */
    private final a.c f9935e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final B createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new B();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new B(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = parcelableArrayList.get(i8);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i8));
            }
            return new B(linkedHashMap);
        }

        public final boolean validateValue(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : B.f9930f) {
                Intrinsics.checkNotNull(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public B(Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f9931a = linkedHashMap;
        this.f9932b = new LinkedHashMap();
        this.f9933c = new LinkedHashMap();
        this.f9934d = new LinkedHashMap();
        this.f9935e = new a.c() { // from class: androidx.lifecycle.A
            @Override // androidx.savedstate.a.c
            public final Bundle saveState() {
                return B.c(this.f9929a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    private final t b(String str, boolean z8, Object obj) {
        b bVar;
        Object obj2 = this.f9933c.get(str);
        t tVar = obj2 instanceof t ? (t) obj2 : null;
        if (tVar != null) {
            return tVar;
        }
        if (this.f9931a.containsKey(str)) {
            bVar = new b(this, str, this.f9931a.get(str));
        } else if (z8) {
            this.f9931a.put(str, obj);
            bVar = new b(this, str, obj);
        } else {
            bVar = new b(this, str);
        }
        this.f9933c.put(str, bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle c(B this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : Q.toMap(this$0.f9932b).entrySet()) {
            this$0.set((String) entry.getKey(), ((a.c) entry.getValue()).saveState());
        }
        Set<String> setKeySet = this$0.f9931a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f9931a.get(str));
        }
        return androidx.core.os.d.bundleOf(R6.v.to("keys", arrayList), R6.v.to("values", arrayList2));
    }

    public static final B createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    public final void clearSavedStateProvider(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f9932b.remove(key);
    }

    public final boolean contains(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f9931a.containsKey(key);
    }

    public final <T> T get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (T) this.f9931a.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    public final <T> t getLiveData(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        t tVarB = b(key, false, null);
        Intrinsics.checkNotNull(tVarB, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return tVarB;
    }

    public final <T> InterfaceC6132S getStateFlow(String key, T t8) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = this.f9934d;
        Object objMutableStateFlow = map.get(key);
        if (objMutableStateFlow == null) {
            if (!this.f9931a.containsKey(key)) {
                this.f9931a.put(key, t8);
            }
            objMutableStateFlow = AbstractC6134U.MutableStateFlow(this.f9931a.get(key));
            this.f9934d.put(key, objMutableStateFlow);
            map.put(key, objMutableStateFlow);
        }
        InterfaceC6132S interfaceC6132SAsStateFlow = AbstractC6149k.asStateFlow((InterfaceC6118D) objMutableStateFlow);
        Intrinsics.checkNotNull(interfaceC6132SAsStateFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return interfaceC6132SAsStateFlow;
    }

    public final Set<String> keys() {
        return d0.plus(d0.plus(this.f9931a.keySet(), (Iterable) this.f9932b.keySet()), (Iterable) this.f9933c.keySet());
    }

    public final <T> T remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t8 = (T) this.f9931a.remove(key);
        b bVar = (b) this.f9933c.remove(key);
        if (bVar != null) {
            bVar.detach();
        }
        this.f9934d.remove(key);
        return t8;
    }

    public final a.c savedStateProvider() {
        return this.f9935e;
    }

    public final <T> void set(String key, T t8) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!Companion.validateValue(t8)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            Intrinsics.checkNotNull(t8);
            sb.append(t8.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj = this.f9933c.get(key);
        t tVar = obj instanceof t ? (t) obj : null;
        if (tVar != null) {
            tVar.setValue(t8);
        } else {
            this.f9931a.put(key, t8);
        }
        InterfaceC6118D interfaceC6118D = (InterfaceC6118D) this.f9934d.get(key);
        if (interfaceC6118D == null) {
            return;
        }
        interfaceC6118D.setValue(t8);
    }

    public final void setSavedStateProvider(String key, a.c provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f9932b.put(key, provider);
    }

    public final <T> t getLiveData(String key, T t8) {
        Intrinsics.checkNotNullParameter(key, "key");
        return b(key, true, t8);
    }

    public static final class b extends t {

        /* renamed from: l, reason: collision with root package name */
        private String f9936l;

        /* renamed from: m, reason: collision with root package name */
        private B f9937m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(B b9, String key, Object obj) {
            super(obj);
            Intrinsics.checkNotNullParameter(key, "key");
            this.f9936l = key;
            this.f9937m = b9;
        }

        public final void detach() {
            this.f9937m = null;
        }

        @Override // androidx.lifecycle.t, androidx.lifecycle.LiveData
        public void setValue(Object obj) {
            B b9 = this.f9937m;
            if (b9 != null) {
                b9.f9931a.put(this.f9936l, obj);
                InterfaceC6118D interfaceC6118D = (InterfaceC6118D) b9.f9934d.get(this.f9936l);
                if (interfaceC6118D != null) {
                    interfaceC6118D.setValue(obj);
                }
            }
            super.setValue(obj);
        }

        public b(B b9, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f9936l = key;
            this.f9937m = b9;
        }
    }

    public B() {
        this.f9931a = new LinkedHashMap();
        this.f9932b = new LinkedHashMap();
        this.f9933c = new LinkedHashMap();
        this.f9934d = new LinkedHashMap();
        this.f9935e = new a.c() { // from class: androidx.lifecycle.A
            @Override // androidx.savedstate.a.c
            public final Bundle saveState() {
                return B.c(this.f9929a);
            }
        };
    }
}
