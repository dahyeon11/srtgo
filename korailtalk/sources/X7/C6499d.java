package x7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import com.kakao.sdk.common.Constants;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import l7.r;

/* renamed from: x7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6499d {
    public static final C6499d INSTANCE = new C6499d();

    private C6499d() {
    }

    public final boolean checkDebugAppSettings$DynaPathMobileSDK_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String string = Settings.Global.getString(context.getContentResolver(), "debug_app");
            if (string != null) {
                return string.length() != 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean checkDeveloperOptionsAlternative$DynaPathMobileSDK_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) != 0) {
                return true;
            }
            return checkDebugAppSettings$DynaPathMobileSDK_release(context);
        } catch (SecurityException unused) {
            return checkDeveloperOptionsFallback$DynaPathMobileSDK_release(context);
        } catch (Exception unused2) {
            return false;
        }
    }

    public final boolean checkDeveloperOptionsFallback$DynaPathMobileSDK_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String str = Build.TYPE;
            return (Intrinsics.areEqual(str, "eng") || Intrinsics.areEqual(str, "userdebug")) || ((context.getApplicationInfo().flags & 2) != 0);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean checkEmulatorFiles$DynaPathMobileSDK_release() {
        boolean zExists;
        String[] strArr = {"/dev/socket/qemud", "/dev/qemu_pipe", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
        for (int i8 = 0; i8 < 7; i8++) {
            try {
                zExists = new File(strArr[i8]).exists();
            } catch (Exception unused) {
                zExists = false;
            }
            if (zExists) {
                return true;
            }
        }
        return false;
    }

    public final boolean checkEmulatorProperties$DynaPathMobileSDK_release() {
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (!r.contains$default((CharSequence) FINGERPRINT, (CharSequence) "generic", false, 2, (Object) null)) {
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (!r.contains$default((CharSequence) FINGERPRINT, (CharSequence) "unknown", false, 2, (Object) null)) {
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                if (!r.contains$default((CharSequence) MODEL, (CharSequence) "google_sdk", false, 2, (Object) null)) {
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    if (!r.contains$default((CharSequence) MODEL, (CharSequence) "Emulator", false, 2, (Object) null)) {
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        if (!r.contains$default((CharSequence) MODEL, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
                            String MANUFACTURER = Build.MANUFACTURER;
                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                            if (!r.contains$default((CharSequence) MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null)) {
                                String str = Build.HARDWARE;
                                if (!Intrinsics.areEqual(str, "goldfish") && !Intrinsics.areEqual(str, "vbox86") && !Intrinsics.areEqual(str, "vbox86p") && !Intrinsics.areEqual(str, "ranchu")) {
                                    String str2 = Build.PRODUCT;
                                    if (!Intrinsics.areEqual(str2, Constants.SDK) && !Intrinsics.areEqual(str2, "google_sdk") && !Intrinsics.areEqual(str2, "sdk_x86") && !Intrinsics.areEqual(str2, "vbox86p")) {
                                        String str3 = Build.BOARD;
                                        if (!Intrinsics.areEqual(str3, "unknown") && !Intrinsics.areEqual(str3, "goldfish")) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean checkRootApps$DynaPathMobileSDK_release(Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        String[] strArr = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
        for (int i8 = 0; i8 < 12; i8++) {
            try {
                context.getPackageManager().getPackageInfo(strArr[i8], 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public final boolean checkRootBinaries$DynaPathMobileSDK_release() {
        boolean zExists;
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i8 = 0; i8 < 10; i8++) {
            try {
                zExists = new File(strArr[i8]).exists();
            } catch (Exception unused) {
                zExists = false;
            }
            if (zExists) {
                return true;
            }
        }
        return false;
    }

    public final boolean checkRootProperties$DynaPathMobileSDK_release() {
        try {
            String str = Build.TAGS;
            if (str != null) {
                return r.contains$default((CharSequence) str, (CharSequence) "test-keys", false, 2, (Object) null);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final List<String> getCurrentSignatureHashes$DynaPathMobileSDK_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return g.extractCurrentSignature(context);
    }

    public final boolean isDebuggingDetected$DynaPathMobileSDK_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            boolean z8 = (context.getApplicationInfo().flags & 2) != 0;
            boolean zIsDebuggerConnected = Debug.isDebuggerConnected();
            boolean zWaitingForDebugger = Debug.waitingForDebugger();
            StringBuilder sb = new StringBuilder();
            sb.append("isDebuggingDetected: ");
            sb.append(z8 || zIsDebuggerConnected || zWaitingForDebugger);
            return z8 || zIsDebuggerConnected || zWaitingForDebugger;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isDeveloperOptionsEnabled$DynaPathMobileSDK_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (SecurityException unused) {
            return checkDeveloperOptionsAlternative$DynaPathMobileSDK_release(context);
        } catch (Exception unused2) {
            return false;
        }
    }

    public final boolean isEmulatorDetected$DynaPathMobileSDK_release() {
        boolean z8 = checkEmulatorProperties$DynaPathMobileSDK_release() || checkEmulatorFiles$DynaPathMobileSDK_release();
        StringBuilder sb = new StringBuilder();
        sb.append("isEmulatorDetected(): ");
        sb.append(z8);
        return z8;
    }

    public final boolean isHookingDetected$DynaPathMobileSDK_release() {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNull(stackTrace);
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                String lowerCase = className.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (r.contains$default((CharSequence) lowerCase, (CharSequence) "xposed", false, 2, (Object) null) || r.contains$default((CharSequence) lowerCase, (CharSequence) "substrate", false, 2, (Object) null) || r.contains$default((CharSequence) lowerCase, (CharSequence) "frida", false, 2, (Object) null) || r.contains$default((CharSequence) lowerCase, (CharSequence) "cydia", false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isRootDetected$DynaPathMobileSDK_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z8 = checkRootBinaries$DynaPathMobileSDK_release() || checkRootApps$DynaPathMobileSDK_release(context) || checkRootProperties$DynaPathMobileSDK_release();
        StringBuilder sb = new StringBuilder();
        sb.append("isRootDetected: ");
        sb.append(z8);
        return z8;
    }
}
