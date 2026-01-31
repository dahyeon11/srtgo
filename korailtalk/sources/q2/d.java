package q2;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import o2.n;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f34917a;

    public d(Context context) {
        this.f34917a = context;
    }

    public int checkCallingOrSelfPermission(String str) {
        return this.f34917a.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    public int checkPermission(String str, String str2) {
        return this.f34917a.getPackageManager().checkPermission(str, str2);
    }

    @ResultIgnorabilityUnspecified
    public ApplicationInfo getApplicationInfo(String str, int i8) {
        return this.f34917a.getPackageManager().getApplicationInfo(str, i8);
    }

    public CharSequence getApplicationLabel(String str) {
        Context context = this.f34917a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    public Z.d getApplicationLabelAndIcon(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f34917a.getPackageManager().getApplicationInfo(str, 0);
        return Z.d.create(this.f34917a.getPackageManager().getApplicationLabel(applicationInfo), this.f34917a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @ResultIgnorabilityUnspecified
    public PackageInfo getPackageInfo(String str, int i8) {
        return this.f34917a.getPackageManager().getPackageInfo(str, i8);
    }

    public boolean isCallerInstantApp() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.isInstantApp(this.f34917a);
        }
        if (!n.isAtLeastO() || (nameForUid = this.f34917a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f34917a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean zza(int i8, String str) {
        if (n.isAtLeastKitKat()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f34917a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i8, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f34917a.getPackageManager().getPackagesForUid(i8);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
