package h2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC1010e;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import k0.AbstractC5837a;

/* loaded from: classes.dex */
public final class a0 extends Fragment implements InterfaceC5589f {

    /* renamed from: e0, reason: collision with root package name */
    private static final WeakHashMap f31417e0 = new WeakHashMap();

    /* renamed from: b0, reason: collision with root package name */
    private final Map f31418b0 = Collections.synchronizedMap(new O.a());

    /* renamed from: c0, reason: collision with root package name */
    private int f31419c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    private Bundle f31420d0;

    public static a0 zzc(ActivityC1010e activityC1010e) {
        a0 a0Var;
        WeakHashMap weakHashMap = f31417e0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activityC1010e);
        if (weakReference != null && (a0Var = (a0) weakReference.get()) != null) {
            return a0Var;
        }
        try {
            a0 a0Var2 = (a0) activityC1010e.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (a0Var2 == null || a0Var2.isRemoving()) {
                a0Var2 = new a0();
                activityC1010e.getSupportFragmentManager().beginTransaction().add(a0Var2, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activityC1010e, new WeakReference(a0Var2));
            return a0Var2;
        } catch (ClassCastException e8) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e8);
        }
    }

    @Override // h2.InterfaceC5589f
    public final void addCallback(String str, LifecycleCallback lifecycleCallback) {
        if (this.f31418b0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f31418b0.put(str, lifecycleCallback);
        if (this.f31419c0 > 0) {
            new z2.t(Looper.getMainLooper()).post(new Z(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f31418b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // h2.InterfaceC5589f
    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        return cls.cast(this.f31418b0.get(str));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // h2.InterfaceC5589f
    public final /* synthetic */ Activity getLifecycleActivity() {
        return getActivity();
    }

    @Override // h2.InterfaceC5589f
    public final boolean isCreated() {
        return this.f31419c0 > 0;
    }

    @Override // h2.InterfaceC5589f
    public final boolean isStarted() {
        return this.f31419c0 >= 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        Iterator it = this.f31418b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i8, i9, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31419c0 = 1;
        this.f31420d0 = bundle;
        for (Map.Entry entry : this.f31418b0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f31419c0 = 5;
        Iterator it = this.f31418b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f31419c0 = 3;
        Iterator it = this.f31418b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f31418b0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f31419c0 = 2;
        Iterator it = this.f31418b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f31419c0 = 4;
        Iterator it = this.f31418b0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
