package n3;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34221a;

    /* renamed from: b, reason: collision with root package name */
    private final c f34222b;

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f34223a;

        private Bundle a(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f34223a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f34223a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        private b(Class cls) {
            this.f34223a = cls;
        }

        @Override // n3.g.c
        public List<String> retrieve(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleA = a(context);
            if (bundleA == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleA.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleA.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    interface c {
        List<String> retrieve(Object obj);
    }

    g(Object obj, c cVar) {
        this.f34221a = obj;
        this.f34222b = cVar;
    }

    private static List a(List list) throws ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (i.class.isAssignableFrom(cls)) {
                    arrayList.add((i) cls.getDeclaredConstructor(null).newInstance(null));
                } else {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                }
            } catch (ClassNotFoundException e8) {
                Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str), e8);
            } catch (IllegalAccessException e9) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str), e9);
            } catch (InstantiationException e10) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str), e10);
            } catch (NoSuchMethodException e11) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str), e11);
            } catch (InvocationTargetException e12) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str), e12);
            }
        }
        return arrayList;
    }

    public static g forContext(Context context, Class<? extends Service> cls) {
        return new g(context, new b(cls));
    }

    public List<i> discover() {
        return a(this.f34222b.retrieve(this.f34221a));
    }
}
