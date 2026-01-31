package o2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import i2.AbstractC5683p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static final int f34465a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    private static final Method f34466b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f34467c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f34468d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f34469e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f34470f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f34471g;

    /* renamed from: h, reason: collision with root package name */
    private static final Method f34472h;

    /* renamed from: i, reason: collision with root package name */
    private static final Method f34473i;

    /* renamed from: j, reason: collision with root package name */
    private static Boolean f34474j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f34466b = method;
        if (n.isAtLeastJellyBeanMR2()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
            }
        } else {
            method2 = null;
        }
        f34467c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f34468d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f34469e = method4;
        if (n.isAtLeastJellyBeanMR2()) {
            try {
                method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
            }
        } else {
            method5 = null;
        }
        f34470f = method5;
        if (n.isAtLeastP()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e8) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e8);
            }
        } else {
            method6 = null;
        }
        f34471g = method6;
        if (n.isAtLeastP()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e9) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e9);
            }
        } else {
            method7 = null;
        }
        f34472h = method7;
        if (n.isAtLeastP()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method8 = null;
        }
        f34473i = method8;
        f34474j = null;
    }

    public static void add(WorkSource workSource, int i8, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f34467c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i8), str);
                return;
            } catch (Exception e8) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
                return;
            }
        }
        Method method2 = f34466b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i8));
            } catch (Exception e9) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e9);
            }
        }
    }

    public static WorkSource fromPackage(Context context, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = q2.e.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i8 = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i8, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static WorkSource fromPackageAndModuleExperimentalPi(Context context, String str, String str2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        int i8 = -1;
        try {
            ApplicationInfo applicationInfo = q2.e.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
            } else {
                i8 = applicationInfo.uid;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
        }
        if (i8 < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method2 = f34471g;
        if (method2 == null || (method = f34472h) == null) {
            add(workSource, i8, str);
        } else {
            try {
                Object objInvoke = method2.invoke(workSource, null);
                int i9 = f34465a;
                if (i8 != i9) {
                    method.invoke(objInvoke, Integer.valueOf(i8), str);
                }
                method.invoke(objInvoke, Integer.valueOf(i9), str2);
            } catch (Exception e8) {
                Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e8);
            }
        }
        return workSource;
    }

    public static int get(WorkSource workSource, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f34469e;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, Integer.valueOf(i8));
            AbstractC5683p.checkNotNull(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e8) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
            return 0;
        }
    }

    public static String getName(WorkSource workSource, int i8) {
        Method method = f34470f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i8));
        } catch (Exception e8) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
            return null;
        }
    }

    public static List<String> getNames(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i8 = 0; i8 < size; i8++) {
                String name = getName(workSource, i8);
                if (!r.isEmptyOrWhitespace(name)) {
                    AbstractC5683p.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    public static synchronized boolean hasWorkSourcePermission(Context context) {
        Boolean bool = f34474j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z8 = androidx.core.content.a.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f34474j = Boolean.valueOf(z8);
        return z8;
    }

    public static boolean isEmpty(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f34473i;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                AbstractC5683p.checkNotNull(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e8) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e8);
            }
        }
        return size(workSource) == 0;
    }

    public static int size(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f34468d;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, null);
            AbstractC5683p.checkNotNull(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e8) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
            return 0;
        }
    }
}
