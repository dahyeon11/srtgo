package f2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.kakao.sdk.auth.Constants;
import i2.AbstractC5683p;
import i2.b0;
import i2.c0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import o2.C6029a;

/* renamed from: f2.F */
/* loaded from: classes.dex */
abstract class AbstractC5390F {

    /* renamed from: e */
    private static volatile c0 f30534e;

    /* renamed from: g */
    private static Context f30536g;

    /* renamed from: a */
    static final AbstractBinderC5388D f30530a = new x(AbstractBinderC5386B.b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    static final AbstractBinderC5388D f30531b = new y(AbstractBinderC5386B.b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    static final AbstractBinderC5388D f30532c = new z(AbstractBinderC5386B.b("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    static final AbstractBinderC5388D f30533d = new BinderC5385A(AbstractBinderC5386B.b("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    private static final Object f30535f = new Object();

    static P a(String str, AbstractBinderC5386B abstractBinderC5386B, boolean z8, boolean z9) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, abstractBinderC5386B, z8, z9);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static P b(String str, boolean z8, boolean z9, boolean z10) {
        return g(str, z8, false, false, true);
    }

    static /* synthetic */ String c(boolean z8, String str, AbstractBinderC5386B abstractBinderC5386B) throws NoSuchAlgorithmException {
        String str2 = (z8 || !f(str, abstractBinderC5386B, true, false).f30553a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestZza = C6029a.zza(Constants.CODE_CHALLENGE_ALGORITHM);
        AbstractC5683p.checkNotNull(messageDigestZza);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, o2.k.bytesToStringLowercase(messageDigestZza.digest(abstractBinderC5386B.c())), Boolean.valueOf(z8), "12451000.false");
    }

    static synchronized void d(Context context) {
        if (f30536g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f30536g = context.getApplicationContext();
        }
    }

    static boolean e() {
        boolean zZzi;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                zZzi = f30534e.zzi();
            } catch (RemoteException | DynamiteModule.a e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                zZzi = false;
            }
            return zZzi;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static P f(final String str, final AbstractBinderC5386B abstractBinderC5386B, final boolean z8, boolean z9) {
        try {
            h();
            AbstractC5683p.checkNotNull(f30536g);
            try {
                return f30534e.zzh(new K(str, abstractBinderC5386B, z8, z9), r2.b.wrap(f30536g.getPackageManager())) ? P.b() : new N(new Callable() { // from class: f2.w
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC5390F.c(z8, str, abstractBinderC5386B);
                    }
                }, null);
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                return P.d("module call", e8);
            }
        } catch (DynamiteModule.a e9) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            return P.d("module init: ".concat(String.valueOf(e9.getMessage())), e9);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, r2.a] */
    private static P g(String str, boolean z8, boolean z9, boolean z10, boolean z11) {
        P pD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC5683p.checkNotNull(f30536g);
            try {
                h();
                G g8 = new G(str, z8, false, r2.b.wrap(f30536g), false, true);
                try {
                    I iZze = z11 ? f30534e.zze(g8) : f30534e.zzf(g8);
                    if (iZze.zzb()) {
                        pD = P.f(iZze.zzc());
                    } else {
                        String strZza = iZze.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = iZze.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZza == null) {
                            strZza = "error checking package certificate";
                        }
                        pD = P.g(iZze.zzc(), iZze.zzd(), strZza, nameNotFoundException);
                    }
                } catch (RemoteException e8) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                    pD = P.d("module call", e8);
                }
            } catch (DynamiteModule.a e9) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
                pD = P.d("module init: ".concat(String.valueOf(e9.getMessage())), e9);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return pD;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static void h() {
        if (f30534e != null) {
            return;
        }
        AbstractC5683p.checkNotNull(f30536g);
        synchronized (f30535f) {
            try {
                if (f30534e == null) {
                    f30534e = b0.zzb(DynamiteModule.load(f30536g, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
