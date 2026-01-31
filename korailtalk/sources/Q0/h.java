package Q0;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3923a = H0.l.tagWithPrefix("PackageManagerHelper");

    public static boolean isComponentExplicitlyEnabled(Context context, Class<?> cls) {
        return isComponentExplicitlyEnabled(context, cls.getName());
    }

    public static void setComponentEnabled(Context context, Class<?> cls, boolean z8) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z8 ? 1 : 2, 1);
            H0.l.get().debug(f3923a, String.format("%s %s", cls.getName(), z8 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e8) {
            H0.l.get().debug(f3923a, String.format("%s could not be %s", cls.getName(), z8 ? "enabled" : "disabled"), e8);
        }
    }

    public static boolean isComponentExplicitlyEnabled(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str)) == 1;
    }
}
