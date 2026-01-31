package u2;

import I2.AbstractC0608l;
import I2.C0609m;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import i2.AbstractC5683p;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class l implements X1.b {

    /* renamed from: e, reason: collision with root package name */
    private static X1.b f37106e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f37107a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37108b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f37109c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f37110d;

    l(Context context) {
        this.f37108b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f37109c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f37110d = Executors.newSingleThreadExecutor();
        this.f37107a = context;
        if (this.f37108b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f37108b = true;
    }

    static synchronized X1.b c(Context context) {
        try {
            AbstractC5683p.checkNotNull(context, "Context must not be null");
            if (f37106e == null) {
                f37106e = new l(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f37106e;
    }

    protected static final void e(Context context) {
        if (!f(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (f(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    private static final SharedPreferences f(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void g(Context context) throws k {
        if (f(context).edit().putLong("app_set_id_last_used_time", o2.i.getInstance().currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    protected final long a() {
        long j8 = f(this.f37107a).getLong("app_set_id_last_used_time", -1L);
        if (j8 != -1) {
            return j8 + 33696000000L;
        }
        return -1L;
    }

    final /* synthetic */ void d(C0609m c0609m) throws k {
        String string = f(this.f37107a).getString("app_set_id", null);
        long jA = a();
        if (string == null || o2.i.getInstance().currentTimeMillis() > jA) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f37107a;
                if (!f(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                g(context);
                Context context2 = this.f37107a;
                if (!f(context2).edit().putLong("app_set_id_creation_time", o2.i.getInstance().currentTimeMillis()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e8) {
                c0609m.setException(e8);
                return;
            }
        } else {
            try {
                g(this.f37107a);
            } catch (k e9) {
                c0609m.setException(e9);
                return;
            }
        }
        c0609m.setResult(new X1.c(string, 1));
    }

    @Override // X1.b
    public final AbstractC0608l getAppSetIdInfo() {
        final C0609m c0609m = new C0609m();
        this.f37110d.execute(new Runnable() { // from class: u2.h
            @Override // java.lang.Runnable
            public final void run() throws k {
                this.zza.d(c0609m);
            }
        });
        return c0609m.getTask();
    }
}
