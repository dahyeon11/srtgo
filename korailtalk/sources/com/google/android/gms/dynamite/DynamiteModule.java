package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import f2.C5398h;
import i2.AbstractC5681n;
import i2.AbstractC5683p;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final int REMOTE = 1;

    /* renamed from: b */
    private static Boolean f12118b = null;

    /* renamed from: c */
    private static String f12119c = null;

    /* renamed from: d */
    private static boolean f12120d = false;

    /* renamed from: e */
    private static int f12121e = -1;

    /* renamed from: f */
    private static Boolean f12122f;

    /* renamed from: j */
    private static m f12126j;

    /* renamed from: k */
    private static n f12127k;

    /* renamed from: a */
    private final Context f12128a;

    /* renamed from: g */
    private static final ThreadLocal f12123g = new ThreadLocal();

    /* renamed from: h */
    private static final ThreadLocal f12124h = new com.google.android.gms.dynamite.b();

    /* renamed from: i */
    private static final b.a f12125i = new c();
    public static final b PREFER_REMOTE = new d();
    public static final b PREFER_LOCAL = new e();
    public static final b PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new f();
    public static final b PREFER_HIGHEST_OR_LOCAL_VERSION = new g();
    public static final b PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new h();
    public static final b PREFER_HIGHEST_OR_REMOTE_VERSION = new i();
    public static final b zza = new j();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, s2.f fVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, s2.f fVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z8);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class C0195b {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        C0195b selectModule(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        AbstractC5683p.checkNotNull(context);
        this.f12128a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule b(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    private static void c(ClassLoader classLoader) throws a {
        n nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
            }
            f12127k = nVar;
        } catch (ClassNotFoundException e8) {
            e = e8;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (IllegalAccessException e9) {
            e = e9;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (InstantiationException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (NoSuchMethodException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, null);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, null);
        }
    }

    private static boolean d(Cursor cursor) {
        k kVar = (k) f12123g.get();
        if (kVar == null || kVar.zza != null) {
            return false;
        }
        kVar.zza = cursor;
        return true;
    }

    private static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f12122f)) {
            return true;
        }
        boolean z8 = false;
        if (f12122f == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C5398h.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z8 = true;
            }
            f12122f = Boolean.valueOf(z8);
            if (z8 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f12120d = true;
            }
        }
        if (!z8) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z8;
    }

    private static m f(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f12126j;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f12126j = mVar;
                    return mVar;
                }
            } catch (Exception e8) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e8.getMessage());
            }
            return null;
        }
    }

    public static int getLocalVersion(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC5681n.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e8) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e8.getMessage())));
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x007e A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #2 {all -> 0x0070, blocks: (B:152:0x0029, B:156:0x006a, B:163:0x0078, B:166:0x007e, B:169:0x0088, B:247:0x01d2, B:248:0x01dd, B:251:0x01e0, B:252:0x01e1, B:253:0x01e9, B:271:0x0242, B:272:0x0259, B:254:0x01ea, B:256:0x0208, B:258:0x0217, B:269:0x0239, B:270:0x0241, B:273:0x025a, B:274:0x028a), top: B:288:0x0029, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0230  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.b r19, java.lang.String r20) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.load(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x00af A[Catch: all -> 0x0036, TryCatch #10 {, blocks: (B:157:0x0026, B:159:0x0032, B:200:0x00b8, B:164:0x003b, B:166:0x0042, B:168:0x0048, B:173:0x004e, B:175:0x0052, B:179:0x005c, B:181:0x0064, B:184:0x006b, B:191:0x0097, B:192:0x009f, B:187:0x0072, B:189:0x0078, B:190:0x0089, B:195:0x00a2, B:198:0x00a5, B:199:0x00af, B:165:0x003e), top: B:290:0x0026, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0177 A[Catch: all -> 0x00eb, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00eb, blocks: (B:151:0x0002, B:212:0x00e0, B:214:0x00e6, B:221:0x010a, B:249:0x0169, B:253:0x0177, B:271:0x01c9, B:272:0x01cc, B:266:0x01c1, B:219:0x00ef, B:274:0x01ce, B:152:0x0003, B:155:0x0009, B:156:0x0025, B:210:0x00dd, B:169:0x0049, B:193:0x00a0, B:196:0x00a3, B:203:0x00bb, B:211:0x00df, B:209:0x00c1), top: B:284:0x0002, inners: #5, #12 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:265:0x01bf -> B:278:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:266:0x01c1 -> B:278:0x01c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    @ResultIgnorabilityUnspecified
    public Context getModuleContext() {
        return this.f12128a;
    }

    public IBinder instantiate(String str) throws a {
        try {
            return (IBinder) this.f12128a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e8, null);
        }
    }
}
