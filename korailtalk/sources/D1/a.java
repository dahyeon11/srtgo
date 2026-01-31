package D1;

import H0.y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import f2.C5398h;
import f2.C5399i;
import f2.ServiceConnectionC5391a;
import i2.AbstractC5683p;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import t2.e;
import t2.f;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    ServiceConnectionC5391a f895a;

    /* renamed from: b, reason: collision with root package name */
    f f896b;

    /* renamed from: c, reason: collision with root package name */
    boolean f897c;

    /* renamed from: d, reason: collision with root package name */
    final Object f898d;

    /* renamed from: e, reason: collision with root package name */
    c f899e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f900f;

    /* renamed from: g, reason: collision with root package name */
    final long f901g;

    /* renamed from: D1.a$a, reason: collision with other inner class name */
    public static final class C0017a {

        /* renamed from: a, reason: collision with root package name */
        private final String f902a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f903b;

        @Deprecated
        public C0017a(String str, boolean z8) {
            this.f902a = str;
            this.f903b = z8;
        }

        public String getId() {
            return this.f902a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f903b;
        }

        public String toString() {
            String str = this.f902a;
            boolean z8 = this.f903b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z8);
            return sb.toString();
        }
    }

    public a(Context context) {
        this(context, y.DEFAULT_BACKOFF_DELAY_MILLIS, false, false);
    }

    private final C0017a c(int i8) {
        C0017a c0017a;
        AbstractC5683p.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f897c) {
                    synchronized (this.f898d) {
                        c cVar = this.f899e;
                        if (cVar == null || !cVar.f908d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        a(false);
                        if (!this.f897c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e8) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                    }
                }
                AbstractC5683p.checkNotNull(this.f895a);
                AbstractC5683p.checkNotNull(this.f896b);
                try {
                    c0017a = new C0017a(this.f896b.zzc(), this.f896b.zze(true));
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d();
        return c0017a;
    }

    private final void d() {
        synchronized (this.f898d) {
            c cVar = this.f899e;
            if (cVar != null) {
                cVar.f907c.countDown();
                try {
                    this.f899e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j8 = this.f901g;
            if (j8 > 0) {
                this.f899e = new c(this, j8);
            }
        }
    }

    public static C0017a getAdvertisingIdInfo(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.a(false);
            C0017a c0017aC = aVar.c(-1);
            aVar.b(c0017aC, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return c0017aC;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean zZzd;
        a aVar = new a(context, -1L, false, false);
        try {
            aVar.a(false);
            AbstractC5683p.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (aVar) {
                try {
                    if (!aVar.f897c) {
                        synchronized (aVar.f898d) {
                            c cVar = aVar.f899e;
                            if (cVar == null || !cVar.f908d) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            aVar.a(false);
                            if (!aVar.f897c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e8) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                        }
                    }
                    AbstractC5683p.checkNotNull(aVar.f895a);
                    AbstractC5683p.checkNotNull(aVar.f896b);
                    try {
                        zZzd = aVar.f896b.zzd();
                    } catch (RemoteException unused) {
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            aVar.d();
            return zZzd;
        } finally {
            aVar.zza();
        }
    }

    protected final void a(boolean z8) {
        AbstractC5683p.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f897c) {
                    zza();
                }
                Context context = this.f900f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iIsGooglePlayServicesAvailable = C5398h.getInstance().isGooglePlayServicesAvailable(context, 12451000);
                    if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC5391a serviceConnectionC5391a = new ServiceConnectionC5391a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!n2.b.getInstance().bindService(context, intent, serviceConnectionC5391a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f895a = serviceConnectionC5391a;
                        try {
                            this.f896b = e.zza(serviceConnectionC5391a.getServiceWithTimeout(y.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS));
                            this.f897c = true;
                            if (z8) {
                                d();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C5399i(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean b(C0017a c0017a, boolean z8, float f8, long j8, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c0017a != null) {
            map.put("limit_ad_tracking", true != c0017a.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = c0017a.getId();
            if (id != null) {
                map.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j8));
        new b(this, map).start();
        return true;
    }

    protected final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public C0017a getInfo() {
        return c(-1);
    }

    public void start() {
        a(true);
    }

    public final void zza() {
        AbstractC5683p.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f900f == null || this.f895a == null) {
                    return;
                }
                try {
                    if (this.f897c) {
                        n2.b.getInstance().unbindService(this.f900f, this.f895a);
                    }
                } catch (Throwable unused) {
                }
                this.f897c = false;
                this.f896b = null;
                this.f895a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public a(Context context, long j8, boolean z8, boolean z9) {
        Context applicationContext;
        this.f898d = new Object();
        AbstractC5683p.checkNotNull(context);
        if (z8 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f900f = context;
        this.f897c = false;
        this.f901g = j8;
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z8) {
    }
}
