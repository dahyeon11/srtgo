package com.google.firebase.iid;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import I2.InterfaceC0599c;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.messaging.AbstractC5186c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f25639c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static E f25640d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f25641a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f25642b;

    public f(Context context) {
        this.f25641a = context;
        this.f25642b = ExecutorC5179a.f25632a;
    }

    private static AbstractC0608l a(Context context, Intent intent) {
        Log.isLoggable("FirebaseInstanceId", 3);
        return b(context, w.ACTION_MESSAGING_EVENT).sendIntent(intent).continueWith(h.a(), C5182d.f25637a);
    }

    private static E b(Context context, String str) {
        E e8;
        synchronized (f25639c) {
            try {
                if (f25640d == null) {
                    f25640d = new E(context, str);
                }
                e8 = f25640d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e8;
    }

    static final /* synthetic */ Integer c(AbstractC0608l abstractC0608l) {
        return -1;
    }

    static final /* synthetic */ AbstractC0608l f(Context context, Intent intent, AbstractC0608l abstractC0608l) {
        return (o2.n.isAtLeastO() && ((Integer) abstractC0608l.getResult()).intValue() == 402) ? a(context, intent).continueWith(h.a(), C5183e.f25638a) : abstractC0608l;
    }

    @VisibleForTesting
    public static void reset() {
        synchronized (f25639c) {
            f25640d = null;
        }
    }

    public AbstractC0608l process(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra(AbstractC5186c.a.RAW_DATA, Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return startMessagingService(this.f25641a, intent);
    }

    public AbstractC0608l startMessagingService(final Context context, final Intent intent) {
        return (!(o2.n.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) || ((intent.getFlags() & 268435456) != 0)) ? AbstractC0611o.call(this.f25642b, new Callable(context, intent) { // from class: com.google.firebase.iid.b

            /* renamed from: a, reason: collision with root package name */
            private final Context f25633a;

            /* renamed from: b, reason: collision with root package name */
            private final Intent f25634b;

            {
                this.f25633a = context;
                this.f25634b = intent;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(w.getInstance().startMessagingService(this.f25633a, this.f25634b));
            }
        }).continueWithTask(this.f25642b, new InterfaceC0599c(context, intent) { // from class: com.google.firebase.iid.c

            /* renamed from: a, reason: collision with root package name */
            private final Context f25635a;

            /* renamed from: b, reason: collision with root package name */
            private final Intent f25636b;

            {
                this.f25635a = context;
                this.f25636b = intent;
            }

            @Override // I2.InterfaceC0599c
            public final Object then(AbstractC0608l abstractC0608l) {
                return f.f(this.f25635a, this.f25636b, abstractC0608l);
            }
        }) : a(context, intent);
    }

    public f(Context context, ExecutorService executorService) {
        this.f25641a = context;
        this.f25642b = executorService;
    }
}
