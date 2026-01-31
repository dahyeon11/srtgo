package f2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import i2.AbstractC5683p;

/* renamed from: f2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5403m {

    /* renamed from: c, reason: collision with root package name */
    private static C5403m f30578c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f30579a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f30580b;

    public C5403m(Context context) {
        this.f30579a = context.getApplicationContext();
    }

    static final AbstractBinderC5386B a(PackageInfo packageInfo, AbstractBinderC5386B... abstractBinderC5386BArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC5387C binderC5387C = new BinderC5387C(packageInfo.signatures[0].toByteArray());
            for (int i8 = 0; i8 < abstractBinderC5386BArr.length; i8++) {
                if (abstractBinderC5386BArr[i8].equals(binderC5387C)) {
                    return abstractBinderC5386BArr[i8];
                }
            }
        }
        return null;
    }

    private final P b(String str, boolean z8, boolean z9) throws PackageManager.NameNotFoundException {
        P pC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return P.c("null pkg");
        }
        if (str.equals(this.f30580b)) {
            return P.b();
        }
        if (AbstractC5390F.e()) {
            pC = AbstractC5390F.b(str, AbstractC5402l.honorsDebugCertificates(this.f30579a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f30579a.getPackageManager().getPackageInfo(str, 64);
                boolean zHonorsDebugCertificates = AbstractC5402l.honorsDebugCertificates(this.f30579a);
                if (packageInfo == null) {
                    pC = P.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        pC = P.c("single cert required");
                    } else {
                        BinderC5387C binderC5387C = new BinderC5387C(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        P pA = AbstractC5390F.a(str2, binderC5387C, zHonorsDebugCertificates, false);
                        pC = (!pA.f30553a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !AbstractC5390F.a(str2, binderC5387C, false, true).f30553a) ? pA : P.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e8) {
                return P.d("no pkg ".concat(str), e8);
            }
        }
        if (pC.f30553a) {
            this.f30580b = str;
        }
        return pC;
    }

    public static C5403m getInstance(Context context) {
        AbstractC5683p.checkNotNull(context);
        synchronized (C5403m.class) {
            try {
                if (f30578c == null) {
                    AbstractC5390F.d(context);
                    f30578c = new C5403m(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f30578c;
    }

    public static final boolean zzb(PackageInfo packageInfo, boolean z8) {
        PackageInfo packageInfo2;
        if (!z8) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z8 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z8 ? a(packageInfo2, AbstractC5389E.f30529a) : a(packageInfo2, AbstractC5389E.f30529a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (zzb(packageInfo, true)) {
            if (AbstractC5402l.honorsDebugCertificates(this.f30579a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean isPackageGoogleSigned(String str) throws PackageManager.NameNotFoundException {
        P pB = b(str, false, false);
        pB.e();
        return pB.f30553a;
    }

    public boolean isUidGoogleSigned(int i8) throws PackageManager.NameNotFoundException {
        P pC;
        int length;
        String[] packagesForUid = this.f30579a.getPackageManager().getPackagesForUid(i8);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            pC = null;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    AbstractC5683p.checkNotNull(pC);
                    break;
                }
                pC = b(packagesForUid[i9], false, false);
                if (pC.f30553a) {
                    break;
                }
                i9++;
            }
        } else {
            pC = P.c("no pkgs");
        }
        pC.e();
        return pC.f30553a;
    }
}
