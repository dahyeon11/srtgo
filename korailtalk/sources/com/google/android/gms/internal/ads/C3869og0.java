package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.og0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3869og0 {

    /* renamed from: e, reason: collision with root package name */
    private static C3869og0 f21544e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f21545a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f21546b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Object f21547c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f21548d = 0;

    private C3869og0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C1671Nf0(this, null), intentFilter);
    }

    static /* synthetic */ void a(C3869og0 c3869og0, int i8) {
        synchronized (c3869og0.f21547c) {
            try {
                if (c3869og0.f21548d == i8) {
                    return;
                }
                c3869og0.f21548d = i8;
                Iterator it = c3869og0.f21546b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C2818fP0 c2818fP0 = (C2818fP0) weakReference.get();
                    if (c2818fP0 != null) {
                        c2818fP0.zza.c(i8);
                    } else {
                        c3869og0.f21546b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized C3869og0 zzb(Context context) {
        try {
            if (f21544e == null) {
                f21544e = new C3869og0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f21544e;
    }

    public final int zza() {
        int i8;
        synchronized (this.f21547c) {
            i8 = this.f21548d;
        }
        return i8;
    }

    public final void zzd(final C2818fP0 c2818fP0) {
        Iterator it = this.f21546b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f21546b.remove(weakReference);
            }
        }
        this.f21546b.add(new WeakReference(c2818fP0));
        this.f21545a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.je0
            @Override // java.lang.Runnable
            public final void run() {
                c2818fP0.zza.c(this.zza.zza());
            }
        });
    }
}
