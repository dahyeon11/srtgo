package e2;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.AbstractC5186c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import y2.AbstractC6530a;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5348b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f30248a = AbstractC6530a.zza().zza(new p2.b("firebase-iid-executor"), y2.f.zza);

    private final int e(Context context, Intent intent) throws PendingIntent.CanceledException {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            d(context, extras);
            return -1;
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return com.google.firebase.iid.w.ERROR_UNKNOWN;
    }

    private final int g(Context context, Intent intent) {
        AbstractC0608l abstractC0608lZza;
        if (intent.getExtras() == null) {
            return com.google.firebase.iid.w.ERROR_UNKNOWN;
        }
        String stringExtra = intent.getStringExtra(AbstractC5186c.a.MSGID);
        if (TextUtils.isEmpty(stringExtra)) {
            abstractC0608lZza = AbstractC0611o.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(AbstractC5186c.a.MSGID, stringExtra);
            abstractC0608lZza = h.zza(context).zza(2, bundle);
        }
        int iB = b(context, new C5347a(intent));
        try {
            AbstractC0611o.await(abstractC0608lZza, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            String strValueOf = String.valueOf(e8);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(strValueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return iB;
    }

    protected Executor a() {
        return this.f30248a;
    }

    protected abstract int b(Context context, C5347a c5347a);

    final /* synthetic */ void f(Intent intent, Context context, boolean z8, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int iE = intent2 != null ? e(context, intent2) : g(context, intent);
            if (z8) {
                pendingResult.setResultCode(iE);
            }
            pendingResult.finish();
        } catch (Throwable th) {
            pendingResult.finish();
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        a().execute(new Runnable(this, intent, context, zIsOrderedBroadcast, pendingResultGoAsync) { // from class: e2.g

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC5348b f30260a;

            /* renamed from: b, reason: collision with root package name */
            private final Intent f30261b;

            /* renamed from: c, reason: collision with root package name */
            private final Context f30262c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f30263d;

            /* renamed from: e, reason: collision with root package name */
            private final BroadcastReceiver.PendingResult f30264e;

            {
                this.f30260a = this;
                this.f30261b = intent;
                this.f30262c = context;
                this.f30263d = zIsOrderedBroadcast;
                this.f30264e = pendingResultGoAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f30260a.f(this.f30261b, this.f30262c, this.f30263d, this.f30264e);
            }
        });
    }

    protected void c(Context context, Bundle bundle) {
    }

    protected void d(Context context, Bundle bundle) {
    }
}
