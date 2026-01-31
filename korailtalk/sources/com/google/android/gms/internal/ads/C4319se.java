package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.se, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4319se {

    /* renamed from: a, reason: collision with root package name */
    private C2952ge f22674a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22675b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f22676c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f22677d = new Object();

    C4319se(Context context) {
        this.f22676c = context;
    }

    static /* bridge */ /* synthetic */ void e(C4319se c4319se) {
        synchronized (c4319se.f22677d) {
            try {
                C2952ge c2952ge = c4319se.f22674a;
                if (c2952ge == null) {
                    return;
                }
                c2952ge.disconnect();
                c4319se.f22674a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final Future c(C3067he c3067he) {
        C3636me c3636me = new C3636me(this);
        C4092qe c4092qe = new C4092qe(this, c3067he, c3636me);
        C4205re c4205re = new C4205re(this, c3636me);
        synchronized (this.f22677d) {
            C2952ge c2952ge = new C2952ge(this.f22676c, G1.u.zzt().zzb(), c4092qe, c4205re);
            this.f22674a = c2952ge;
            c2952ge.checkAvailabilityAndConnect();
        }
        return c3636me;
    }
}
