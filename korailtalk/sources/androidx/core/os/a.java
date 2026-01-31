package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import m7.AbstractC5916c;

/* loaded from: classes.dex */
public final class a {
    public static final int AD_SERVICES_EXTENSION_INT;
    public static final a INSTANCE = new a();
    public static final int R_EXTENSION_INT;
    public static final int S_EXTENSION_INT;
    public static final int T_EXTENSION_INT;

    /* renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    private static final class C0138a {
        public static final C0138a INSTANCE = new C0138a();

        private C0138a() {
        }

        public final int getExtensionVersion(int i8) {
            return SdkExtensions.getExtensionVersion(i8);
        }
    }

    static {
        int i8 = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i8 >= 30 ? C0138a.INSTANCE.getExtensionVersion(30) : 0;
        S_EXTENSION_INT = i8 >= 30 ? C0138a.INSTANCE.getExtensionVersion(31) : 0;
        T_EXTENSION_INT = i8 >= 30 ? C0138a.INSTANCE.getExtensionVersion(33) : 0;
        AD_SERVICES_EXTENSION_INT = i8 >= 30 ? C0138a.INSTANCE.getExtensionVersion(AbstractC5916c.NANOS_IN_MILLIS) : 0;
    }

    private a() {
    }

    public static final boolean isAtLeastN() {
        return true;
    }

    public static final boolean isAtLeastNMR1() {
        return Build.VERSION.SDK_INT >= 25;
    }

    public static final boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static final boolean isAtLeastPreReleaseCodename(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.areEqual("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static final boolean isAtLeastS() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 31) {
            if (i8 >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("S", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean isAtLeastSv2() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 32) {
            if (i8 >= 31) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("Sv2", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean isAtLeastT() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 33) {
            if (i8 >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("Tiramisu", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean isAtLeastU() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 34) {
            if (i8 >= 33) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("UpsideDownCake", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean isAtLeastV() {
        if (Build.VERSION.SDK_INT >= 34) {
            String CODENAME = Build.VERSION.CODENAME;
            Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
            if (isAtLeastPreReleaseCodename("VanillaIceCream", CODENAME)) {
                return true;
            }
        }
        return false;
    }
}
