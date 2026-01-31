package androidx.startup;

import B0.c;
import C0.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f10769d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f10770e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f10773c;

    /* renamed from: b, reason: collision with root package name */
    final Set f10772b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map f10771a = new HashMap();

    a(Context context) {
        this.f10773c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objCreate;
        if (b.isEnabled()) {
            try {
                b.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                b.endSection();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f10771a.containsKey(cls)) {
            objCreate = this.f10771a.get(cls);
        } else {
            set.add(cls);
            try {
                B0.a aVar = (B0.a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends B0.a>> listDependencies = aVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends B0.a> cls2 : listDependencies) {
                        if (!this.f10771a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objCreate = aVar.create(this.f10773c);
                set.remove(cls);
                this.f10771a.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        b.endSection();
        return objCreate;
    }

    public static a getInstance(Context context) {
        if (f10769d == null) {
            synchronized (f10770e) {
                try {
                    if (f10769d == null) {
                        f10769d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f10769d;
    }

    void a() {
        try {
            try {
                b.beginSection("Startup");
                b(this.f10773c.getPackageManager().getProviderInfo(new ComponentName(this.f10773c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e8) {
                throw new c(e8);
            }
        } finally {
            b.endSection();
        }
    }

    void b(Bundle bundle) throws ClassNotFoundException {
        String string = this.f10773c.getString(B0.b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (B0.a.class.isAssignableFrom(cls)) {
                            this.f10772b.add(cls);
                        }
                    }
                }
                Iterator it = this.f10772b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e8) {
                throw new c(e8);
            }
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f10770e) {
            try {
                objD = this.f10771a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public <T> T initializeComponent(Class<? extends B0.a> cls) {
        return (T) c(cls);
    }

    public boolean isEagerlyInitialized(Class<? extends B0.a> cls) {
        return this.f10772b.contains(cls);
    }
}
