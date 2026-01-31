package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.jn */
/* loaded from: classes2.dex */
public final class C3312jn {

    /* renamed from: a */
    private final Object f20304a = new Object();

    /* renamed from: b */
    private final Object f20305b = new Object();

    /* renamed from: c */
    private C4451tn f20306c;

    /* renamed from: d */
    private C4451tn f20307d;

    private static final Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final C4451tn zza(Context context, L1.a aVar, RunnableC5002yd0 runnableC5002yd0) {
        C4451tn c4451tn;
        synchronized (this.f20304a) {
            try {
                if (this.f20306c == null) {
                    this.f20306c = new C4451tn(a(context), aVar, (String) H1.C.zzc().zza(AbstractC4439th.zza), runnableC5002yd0);
                }
                c4451tn = this.f20306c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4451tn;
    }

    public final C4451tn zzb(Context context, L1.a aVar, RunnableC5002yd0 runnableC5002yd0) {
        C4451tn c4451tn;
        synchronized (this.f20305b) {
            try {
                if (this.f20307d == null) {
                    this.f20307d = new C4451tn(a(context), aVar, (String) AbstractC1144Ai.zzb.zze(), runnableC5002yd0);
                }
                c4451tn = this.f20307d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4451tn;
    }
}
