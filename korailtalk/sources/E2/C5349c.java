package e2;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import I2.C0609m;
import I2.InterfaceC0599c;
import I2.InterfaceC0602f;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import e2.C5350d;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5349c {

    /* renamed from: h, reason: collision with root package name */
    private static int f30249h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f30250i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f30251j = ExecutorC5346C.f30245a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f30253b;

    /* renamed from: c, reason: collision with root package name */
    private final u f30254c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f30255d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f30257f;

    /* renamed from: g, reason: collision with root package name */
    private C5350d f30258g;

    /* renamed from: a, reason: collision with root package name */
    private final O.h f30252a = new O.h();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f30256e = new Messenger(new HandlerC5345B(this, Looper.getMainLooper()));

    public C5349c(Context context) {
        this.f30253b = context;
        this.f30254c = new u(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f30255d = scheduledThreadPoolExecutor;
    }

    static final /* synthetic */ AbstractC0608l a(Bundle bundle) {
        return k(bundle) ? AbstractC0611o.forResult(null) : AbstractC0611o.forResult(bundle);
    }

    static final /* synthetic */ Bundle c(AbstractC0608l abstractC0608l) throws IOException {
        if (abstractC0608l.isSuccessful()) {
            return (Bundle) abstractC0608l.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(abstractC0608l.getException());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(strValueOf);
        }
        throw new IOException(com.google.firebase.iid.o.ERROR_SERVICE_NOT_AVAILABLE, abstractC0608l.getException());
    }

    private static synchronized String d() {
        int i8;
        i8 = f30249h;
        f30249h = i8 + 1;
        return Integer.toString(i8);
    }

    static final /* synthetic */ void e(C0609m c0609m) {
        if (c0609m.trySetException(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }

    private static synchronized void f(Context context, Intent intent) {
        try {
            if (f30250i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f30250i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f30250i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C5350d.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C5350d) {
                        this.f30258g = (C5350d) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f30257f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String strValueOf = String.valueOf(action);
                        if (strValueOf.length() != 0) {
                            "Unexpected response action: ".concat(strValueOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (!Log.isLoggable("Rpc", 3) || stringExtra.length() == 0) {
                            return;
                        }
                        "Unexpected response string: ".concat(stringExtra);
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        i(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String strValueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(strValueOf2.length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(strValueOf2);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3) && stringExtra2.length() != 0) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (this.f30252a) {
                        for (int i8 = 0; i8 < this.f30252a.size(); i8++) {
                            try {
                                i((String) this.f30252a.keyAt(i8), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                i(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final void i(String str, Bundle bundle) {
        synchronized (this.f30252a) {
            try {
                C0609m c0609m = (C0609m) this.f30252a.remove(str);
                if (c0609m != null) {
                    c0609m.setResult(bundle);
                } else {
                    String strValueOf = String.valueOf(str);
                    Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean k(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private final AbstractC0608l l(Bundle bundle) throws RemoteException {
        final String strD = d();
        final C0609m c0609m = new C0609m();
        synchronized (this.f30252a) {
            this.f30252a.put(strD, c0609m);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f30254c.zza() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.f30253b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 5);
        sb.append("|ID|");
        sb.append(strD);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(strValueOf);
        }
        intent.putExtra("google.messenger", this.f30256e);
        if (this.f30257f != null || this.f30258g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f30257f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f30258g.zza(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
        } else if (this.f30254c.zza() == 2) {
            this.f30253b.sendBroadcast(intent);
        } else {
            this.f30253b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f30255d.schedule(new Runnable(c0609m) { // from class: e2.x

            /* renamed from: a, reason: collision with root package name */
            private final C0609m f30295a;

            {
                this.f30295a = c0609m;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C5349c.e(this.f30295a);
            }
        }, 30L, TimeUnit.SECONDS);
        c0609m.getTask().addOnCompleteListener(f30251j, new InterfaceC0602f(this, strD, scheduledFutureSchedule) { // from class: e2.A

            /* renamed from: a, reason: collision with root package name */
            private final C5349c f30241a;

            /* renamed from: b, reason: collision with root package name */
            private final String f30242b;

            /* renamed from: c, reason: collision with root package name */
            private final ScheduledFuture f30243c;

            {
                this.f30241a = this;
                this.f30242b = strD;
                this.f30243c = scheduledFutureSchedule;
            }

            @Override // I2.InterfaceC0602f
            public final void onComplete(AbstractC0608l abstractC0608l) {
                this.f30241a.j(this.f30242b, this.f30243c, abstractC0608l);
            }
        });
        return c0609m.getTask();
    }

    final /* synthetic */ AbstractC0608l b(Bundle bundle, AbstractC0608l abstractC0608l) {
        return (abstractC0608l.isSuccessful() && k((Bundle) abstractC0608l.getResult())) ? l(bundle).onSuccessTask(f30251j, z.f30298a) : abstractC0608l;
    }

    final /* synthetic */ void j(String str, ScheduledFuture scheduledFuture, AbstractC0608l abstractC0608l) {
        synchronized (this.f30252a) {
            this.f30252a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public AbstractC0608l send(final Bundle bundle) {
        return this.f30254c.zzb() >= 12000000 ? h.zza(this.f30253b).zzb(1, bundle).continueWith(f30251j, w.f30294a) : this.f30254c.zza() != 0 ? l(bundle).continueWithTask(f30251j, new InterfaceC0599c(this, bundle) { // from class: e2.y

            /* renamed from: a, reason: collision with root package name */
            private final C5349c f30296a;

            /* renamed from: b, reason: collision with root package name */
            private final Bundle f30297b;

            {
                this.f30296a = this;
                this.f30297b = bundle;
            }

            @Override // I2.InterfaceC0599c
            public final Object then(AbstractC0608l abstractC0608l) {
                return this.f30296a.b(this.f30297b, abstractC0608l);
            }
        }) : AbstractC0611o.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
    }
}
