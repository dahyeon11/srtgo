package f;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.AbstractC0920d;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.InterfaceC1023l;
import androidx.lifecycle.InterfaceC1025n;
import f7.InterfaceC5519a;
import g.AbstractC5530a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import k7.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: h, reason: collision with root package name */
    private static final b f30478h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f30479a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f30480b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f30481c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final List f30482d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final transient Map f30483e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map f30484f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f30485g = new Bundle();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5379b f30486a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5530a f30487b;

        public a(InterfaceC5379b callback, AbstractC5530a contract) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.f30486a = callback;
            this.f30487b = contract;
        }

        public final InterfaceC5379b getCallback() {
            return this.f30486a;
        }

        public final AbstractC5530a getContract() {
            return this.f30487b;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1019h f30488a;

        /* renamed from: b, reason: collision with root package name */
        private final List f30489b;

        public c(AbstractC1019h lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f30488a = lifecycle;
            this.f30489b = new ArrayList();
        }

        public final void addObserver(InterfaceC1023l observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f30488a.addObserver(observer);
            this.f30489b.add(observer);
        }

        public final void clearObservers() {
            Iterator it = this.f30489b.iterator();
            while (it.hasNext()) {
                this.f30488a.removeObserver((InterfaceC1023l) it.next());
            }
            this.f30489b.clear();
        }

        public final AbstractC1019h getLifecycle() {
            return this.f30488a;
        }
    }

    static final class d extends Lambda implements InterfaceC5519a {
        public static final d INSTANCE = new d();

        d() {
            super(0);
        }

        @Override // f7.InterfaceC5519a
        public final Integer invoke() {
            return Integer.valueOf(h7.f.Default.nextInt(2147418112) + 65536);
        }
    }

    public static final class e extends f.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5530a f30492c;

        e(String str, AbstractC5530a abstractC5530a) {
            this.f30491b = str;
            this.f30492c = abstractC5530a;
        }

        @Override // f.d
        public AbstractC5530a getContract() {
            return this.f30492c;
        }

        @Override // f.d
        public void launch(I i8, AbstractC0920d abstractC0920d) throws Exception {
            Object obj = f.this.f30480b.get(this.f30491b);
            AbstractC5530a abstractC5530a = this.f30492c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                f.this.f30482d.add(this.f30491b);
                try {
                    f.this.onLaunch(iIntValue, this.f30492c, i8, abstractC0920d);
                    return;
                } catch (Exception e8) {
                    f.this.f30482d.remove(this.f30491b);
                    throw e8;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC5530a + " and input " + i8 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // f.d
        public void unregister() {
            f.this.unregister$activity_release(this.f30491b);
        }
    }

    /* renamed from: f.f$f, reason: collision with other inner class name */
    public static final class C0283f extends f.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30494b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5530a f30495c;

        C0283f(String str, AbstractC5530a abstractC5530a) {
            this.f30494b = str;
            this.f30495c = abstractC5530a;
        }

        @Override // f.d
        public AbstractC5530a getContract() {
            return this.f30495c;
        }

        @Override // f.d
        public void launch(I i8, AbstractC0920d abstractC0920d) throws Exception {
            Object obj = f.this.f30480b.get(this.f30494b);
            AbstractC5530a abstractC5530a = this.f30495c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                f.this.f30482d.add(this.f30494b);
                try {
                    f.this.onLaunch(iIntValue, this.f30495c, i8, abstractC0920d);
                    return;
                } catch (Exception e8) {
                    f.this.f30482d.remove(this.f30494b);
                    throw e8;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC5530a + " and input " + i8 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // f.d
        public void unregister() {
            f.this.unregister$activity_release(this.f30494b);
        }
    }

    private final void b(int i8, String str) {
        this.f30479a.put(Integer.valueOf(i8), str);
        this.f30480b.put(str, Integer.valueOf(i8));
    }

    private final void c(String str, int i8, Intent intent, a aVar) {
        if ((aVar != null ? aVar.getCallback() : null) == null || !this.f30482d.contains(str)) {
            this.f30484f.remove(str);
            this.f30485g.putParcelable(str, new C5378a(i8, intent));
        } else {
            aVar.getCallback().onActivityResult(aVar.getContract().parseResult(i8, intent));
            this.f30482d.remove(str);
        }
    }

    private final int d() {
        for (Number number : p.generateSequence(d.INSTANCE)) {
            if (!this.f30479a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(f this$0, String key, InterfaceC5379b callback, AbstractC5530a contract, InterfaceC1025n interfaceC1025n, AbstractC1019h.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(contract, "$contract");
        Intrinsics.checkNotNullParameter(interfaceC1025n, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (AbstractC1019h.a.ON_START != event) {
            if (AbstractC1019h.a.ON_STOP == event) {
                this$0.f30483e.remove(key);
                return;
            } else {
                if (AbstractC1019h.a.ON_DESTROY == event) {
                    this$0.unregister$activity_release(key);
                    return;
                }
                return;
            }
        }
        this$0.f30483e.put(key, new a(callback, contract));
        if (this$0.f30484f.containsKey(key)) {
            Object obj = this$0.f30484f.get(key);
            this$0.f30484f.remove(key);
            callback.onActivityResult(obj);
        }
        C5378a c5378a = (C5378a) androidx.core.os.c.getParcelable(this$0.f30485g, key, C5378a.class);
        if (c5378a != null) {
            this$0.f30485g.remove(key);
            callback.onActivityResult(contract.parseResult(c5378a.getResultCode(), c5378a.getData()));
        }
    }

    private final void f(String str) {
        if (((Integer) this.f30480b.get(str)) != null) {
            return;
        }
        b(d(), str);
    }

    public final boolean dispatchResult(int i8, int i9, Intent intent) {
        String str = (String) this.f30479a.get(Integer.valueOf(i8));
        if (str == null) {
            return false;
        }
        c(str, i9, intent, (a) this.f30483e.get(str));
        return true;
    }

    public abstract <I, O> void onLaunch(int i8, AbstractC5530a abstractC5530a, I i9, AbstractC0920d abstractC0920d);

    public final void onRestoreInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f30482d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f30485g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            String str = stringArrayList.get(i8);
            if (this.f30480b.containsKey(str)) {
                Integer num = (Integer) this.f30480b.remove(str);
                if (!this.f30485g.containsKey(str)) {
                    TypeIntrinsics.asMutableMap(this.f30479a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i8);
            Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i8);
            Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
            b(iIntValue, str2);
        }
    }

    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f30480b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f30480b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f30482d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f30485g));
    }

    public final <I, O> f.d register(final String key, InterfaceC1025n lifecycleOwner, final AbstractC5530a contract, final InterfaceC5379b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1019h lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(AbstractC1019h.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        f(key);
        c cVar = (c) this.f30481c.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.addObserver(new InterfaceC1023l() { // from class: f.e
            @Override // androidx.lifecycle.InterfaceC1023l
            public final void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
                f.e(this.f30474a, key, callback, contract, interfaceC1025n, aVar);
            }
        });
        this.f30481c.put(key, cVar);
        return new e(key, contract);
    }

    public final void unregister$activity_release(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f30482d.contains(key) && (num = (Integer) this.f30480b.remove(key)) != null) {
            this.f30479a.remove(num);
        }
        this.f30483e.remove(key);
        if (this.f30484f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f30484f.get(key));
            this.f30484f.remove(key);
        }
        if (this.f30485g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C5378a) androidx.core.os.c.getParcelable(this.f30485g, key, C5378a.class)));
            this.f30485g.remove(key);
        }
        c cVar = (c) this.f30481c.get(key);
        if (cVar != null) {
            cVar.clearObservers();
            this.f30481c.remove(key);
        }
    }

    public final <O> boolean dispatchResult(int i8, O o8) {
        String str = (String) this.f30479a.get(Integer.valueOf(i8));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f30483e.get(str);
        if ((aVar != null ? aVar.getCallback() : null) == null) {
            this.f30485g.remove(str);
            this.f30484f.put(str, o8);
            return true;
        }
        InterfaceC5379b callback = aVar.getCallback();
        Intrinsics.checkNotNull(callback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f30482d.remove(str)) {
            return true;
        }
        callback.onActivityResult(o8);
        return true;
    }

    public final <I, O> f.d register(String key, AbstractC5530a contract, InterfaceC5379b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        f(key);
        this.f30483e.put(key, new a(callback, contract));
        if (this.f30484f.containsKey(key)) {
            Object obj = this.f30484f.get(key);
            this.f30484f.remove(key);
            callback.onActivityResult(obj);
        }
        C5378a c5378a = (C5378a) androidx.core.os.c.getParcelable(this.f30485g, key, C5378a.class);
        if (c5378a != null) {
            this.f30485g.remove(key);
            callback.onActivityResult(contract.parseResult(c5378a.getResultCode(), c5378a.getData()));
        }
        return new C0283f(key, contract);
    }
}
