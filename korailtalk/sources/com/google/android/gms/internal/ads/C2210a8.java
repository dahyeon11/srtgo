package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.a8 */
/* loaded from: classes2.dex */
public final class C2210a8 {

    /* renamed from: a */
    private final AtomicInteger f17897a;

    /* renamed from: b */
    private final Set f17898b;

    /* renamed from: c */
    private final PriorityBlockingQueue f17899c;

    /* renamed from: d */
    private final PriorityBlockingQueue f17900d;

    /* renamed from: e */
    private final I7 f17901e;

    /* renamed from: f */
    private final R7 f17902f;

    /* renamed from: g */
    private final S7[] f17903g;

    /* renamed from: h */
    private K7 f17904h;

    /* renamed from: i */
    private final List f17905i;

    /* renamed from: j */
    private final List f17906j;

    /* renamed from: k */
    private final P7 f17907k;

    public C2210a8(I7 i72, R7 r72, int i8) {
        P7 p72 = new P7(new Handler(Looper.getMainLooper()));
        this.f17897a = new AtomicInteger();
        this.f17898b = new HashSet();
        this.f17899c = new PriorityBlockingQueue();
        this.f17900d = new PriorityBlockingQueue();
        this.f17905i = new ArrayList();
        this.f17906j = new ArrayList();
        this.f17901e = i72;
        this.f17902f = r72;
        this.f17903g = new S7[4];
        this.f17907k = p72;
    }

    final void a(Z7 z72) {
        synchronized (this.f17898b) {
            this.f17898b.remove(z72);
        }
        synchronized (this.f17905i) {
            Iterator it = this.f17905i.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.f.a(it.next());
                throw null;
            }
        }
        b(z72, 5);
    }

    final void b(Z7 z72, int i8) {
        synchronized (this.f17906j) {
            try {
                Iterator it = this.f17906j.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.f.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Z7 zza(Z7 z72) {
        z72.zzf(this);
        synchronized (this.f17898b) {
            this.f17898b.add(z72);
        }
        z72.zzg(this.f17897a.incrementAndGet());
        z72.zzm("add-to-queue");
        b(z72, 0);
        this.f17899c.add(z72);
        return z72;
    }

    public final void zzd() {
        K7 k72 = this.f17904h;
        if (k72 != null) {
            k72.zzb();
        }
        S7[] s7Arr = this.f17903g;
        for (int i8 = 0; i8 < 4; i8++) {
            S7 s72 = s7Arr[i8];
            if (s72 != null) {
                s72.zza();
            }
        }
        K7 k73 = new K7(this.f17899c, this.f17900d, this.f17901e, this.f17907k);
        this.f17904h = k73;
        k73.start();
        for (int i9 = 0; i9 < 4; i9++) {
            S7 s73 = new S7(this.f17900d, this.f17902f, this.f17901e, this.f17907k);
            this.f17903g[i9] = s73;
            s73.start();
        }
    }
}
