package o2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import f2.AbstractC5402l;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f34446a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f34447b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f34448c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f34449d;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f34450e;

    /* renamed from: f, reason: collision with root package name */
    private static Boolean f34451f;

    /* renamed from: g, reason: collision with root package name */
    private static Boolean f34452g;

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f34453h;

    /* renamed from: i, reason: collision with root package name */
    private static Boolean f34454i;

    /* renamed from: j, reason: collision with root package name */
    private static Boolean f34455j;

    /* renamed from: k, reason: collision with root package name */
    private static Boolean f34456k;

    /* renamed from: l, reason: collision with root package name */
    private static Boolean f34457l;

    /* renamed from: m, reason: collision with root package name */
    private static Boolean f34458m;

    /* renamed from: n, reason: collision with root package name */
    private static Boolean f34459n;

    public static boolean isAuto(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f34455j == null) {
            boolean z8 = false;
            if (n.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z8 = true;
            }
            f34455j = Boolean.valueOf(z8);
        }
        return f34455j.booleanValue();
    }

    public static boolean isBstar(Context context) {
        if (f34458m == null) {
            boolean z8 = false;
            if (n.isAtLeastR() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z8 = true;
            }
            f34458m = Boolean.valueOf(z8);
        }
        return f34458m.booleanValue();
    }

    public static boolean isFoldable(Context context) {
        if (f34448c == null) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            boolean z8 = false;
            if (n.isAtLeastR() && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                z8 = true;
            }
            f34448c = Boolean.valueOf(z8);
        }
        return f34448c.booleanValue();
    }

    public static boolean isLatchsky(Context context) {
        if (f34452g == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z8 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z8 = true;
            }
            f34452g = Boolean.valueOf(z8);
        }
        return f34452g.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isPhone(android.content.Context r4) {
        /*
            java.lang.Boolean r0 = o2.j.f34446a
            if (r0 != 0) goto L76
            boolean r0 = isFoldable(r4)
            r1 = 1
            if (r0 != 0) goto L70
            boolean r0 = isTablet(r4)
            r2 = 0
            if (r0 != 0) goto L6f
            boolean r0 = isWearable(r4)
            if (r0 != 0) goto L6f
            boolean r0 = zzb(r4)
            if (r0 != 0) goto L6f
            java.lang.Boolean r0 = o2.j.f34454i
            if (r0 != 0) goto L32
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "org.chromium.arc"
            boolean r0 = r0.hasSystemFeature(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            o2.j.f34454i = r0
        L32:
            java.lang.Boolean r0 = o2.j.f34454i
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L6f
            boolean r0 = isAuto(r4)
            if (r0 != 0) goto L6f
            boolean r0 = isTv(r4)
            if (r0 != 0) goto L6f
            java.lang.Boolean r0 = o2.j.f34457l
            if (r0 != 0) goto L5a
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "com.google.android.feature.AMATI_EXPERIENCE"
            boolean r0 = r0.hasSystemFeature(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            o2.j.f34457l = r0
        L5a:
            java.lang.Boolean r0 = o2.j.f34457l
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L6f
            boolean r0 = isBstar(r4)
            if (r0 != 0) goto L6f
            boolean r4 = isXr(r4)
            if (r4 != 0) goto L6f
            goto L70
        L6f:
            r1 = r2
        L70:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            o2.j.f34446a = r4
        L76:
            java.lang.Boolean r4 = o2.j.f34446a
            boolean r4 = r4.booleanValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.j.isPhone(android.content.Context):boolean");
    }

    public static boolean isSevenInchTablet(Context context) {
        return zzc(context.getResources());
    }

    public static boolean isSidewinder(Context context) {
        return zza(context);
    }

    public static boolean isTablet(Context context) {
        return isTablet(context.getResources());
    }

    public static boolean isTv(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f34456k == null) {
            boolean z8 = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z8 = false;
            }
            f34456k = Boolean.valueOf(z8);
        }
        return f34456k.booleanValue();
    }

    public static boolean isUserBuild() {
        int i8 = AbstractC5402l.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    public static boolean isWearable(Context context) {
        return zzd(context.getPackageManager());
    }

    public static boolean isWearableWithoutPlayStore(Context context) {
        if (isWearable(context) && !n.isAtLeastN()) {
            return true;
        }
        if (zza(context)) {
            return !n.isAtLeastO() || n.isAtLeastR();
        }
        return false;
    }

    public static boolean isXr(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f34459n == null) {
            f34459n = Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.immersive"));
        }
        return f34459n.booleanValue();
    }

    public static boolean zza(Context context) {
        if (f34451f == null) {
            boolean z8 = false;
            if (n.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z8 = true;
            }
            f34451f = Boolean.valueOf(z8);
        }
        return f34451f.booleanValue();
    }

    public static boolean zzb(Context context) {
        if (f34453h == null) {
            boolean z8 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z8 = false;
            }
            f34453h = Boolean.valueOf(z8);
        }
        return f34453h.booleanValue();
    }

    public static boolean zzc(Resources resources) {
        boolean z8 = false;
        if (resources == null) {
            return false;
        }
        if (f34449d == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z8 = true;
            }
            f34449d = Boolean.valueOf(z8);
        }
        return f34449d.booleanValue();
    }

    @SideEffectFree
    public static boolean zzd(PackageManager packageManager) {
        if (f34450e == null) {
            boolean z8 = false;
            if (n.isAtLeastKitKatWatch() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z8 = true;
            }
            f34450e = Boolean.valueOf(z8);
        }
        return f34450e.booleanValue();
    }

    public static boolean isTablet(Resources resources) {
        if (resources == null) {
            return false;
        }
        if (f34447b == null) {
            f34447b = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources));
        }
        return f34447b.booleanValue();
    }
}
