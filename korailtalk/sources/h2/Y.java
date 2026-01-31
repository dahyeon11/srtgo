package h2;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Y extends Fragment implements InterfaceC5589f {

    /* renamed from: d, reason: collision with root package name */
    private static final WeakHashMap f31410d = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map f31411a = Collections.synchronizedMap(new O.a());

    /* renamed from: b, reason: collision with root package name */
    private int f31412b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f31413c;

    public static Y zzc(Activity activity) {
        Y y8;
        WeakHashMap weakHashMap = f31410d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (y8 = (Y) weakReference.get()) != null) {
            return y8;
        }
        try {
            Y y9 = (Y) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (y9 == null || y9.isRemoving()) {
                y9 = new Y();
                activity.getFragmentManager().beginTransaction().add(y9, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(y9));
            return y9;
        } catch (ClassCastException e8) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e8);
        }
    }

    @Override // h2.InterfaceC5589f
    public final void addCallback(String str, LifecycleCallback lifecycleCallback) {
        if (this.f31411a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f31411a.put(str, lifecycleCallback);
        if (this.f31412b > 0) {
            new z2.t(Looper.getMainLooper()).post(new X(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f31411a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // h2.InterfaceC5589f
    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        return cls.cast(this.f31411a.get(str));
    }

    @Override // h2.InterfaceC5589f
    public final Activity getLifecycleActivity() {
        return getActivity();
    }

    @Override // h2.InterfaceC5589f
    public final boolean isCreated() {
        return this.f31412b > 0;
    }

    @Override // h2.InterfaceC5589f
    public final boolean isStarted() {
        return this.f31412b >= 2;
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        Iterator it = this.f31411a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i8, i9, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31412b = 1;
        this.f31413c = bundle;
        for (Map.Entry entry : this.f31411a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f31412b = 5;
        Iterator it = this.f31411a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f31412b = 3;
        Iterator it = this.f31411a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f31411a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f31412b = 2;
        Iterator it = this.f31411a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f31412b = 4;
        Iterator it = this.f31411a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
