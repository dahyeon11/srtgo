package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.Ca0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1211Ca0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3002h20 f12545a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4721w70 f12546b;

    /* renamed from: c, reason: collision with root package name */
    private final A90 f12547c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f12548d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque f12549e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f12550f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f12551g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12552h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12553i;

    public C1211Ca0(Looper looper, InterfaceC3002h20 interfaceC3002h20, A90 a90) {
        this(new CopyOnWriteArraySet(), looper, interfaceC3002h20, a90, true);
    }

    private final void a() {
        if (this.f12553i) {
            F10.zzf(Thread.currentThread() == this.f12546b.zza().getThread());
        }
    }

    public static /* synthetic */ boolean zzg(C1211Ca0 c1211Ca0, Message message) {
        Iterator it = c1211Ca0.f12548d.iterator();
        while (it.hasNext()) {
            ((C2372ba0) it.next()).zzb(c1211Ca0.f12547c);
            if (c1211Ca0.f12546b.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    public final C1211Ca0 zza(Looper looper, A90 a90) {
        return new C1211Ca0(this.f12548d, looper, this.f12545a, a90, this.f12553i);
    }

    public final void zzb(Object obj) {
        synchronized (this.f12551g) {
            try {
                if (this.f12552h) {
                    return;
                }
                this.f12548d.add(new C2372ba0(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        a();
        if (this.f12550f.isEmpty()) {
            return;
        }
        if (!this.f12546b.zzg(0)) {
            InterfaceC4721w70 interfaceC4721w70 = this.f12546b;
            interfaceC4721w70.zzk(interfaceC4721w70.zzb(0));
        }
        boolean zIsEmpty = this.f12549e.isEmpty();
        this.f12549e.addAll(this.f12550f);
        this.f12550f.clear();
        if (zIsEmpty) {
            while (!this.f12549e.isEmpty()) {
                ((Runnable) this.f12549e.peekFirst()).run();
                this.f12549e.removeFirst();
            }
        }
    }

    public final void zzd(final int i8, final Z80 z80) {
        a();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f12548d);
        this.f12550f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.y80
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    Z80 z802 = z80;
                    ((C2372ba0) it.next()).zza(i8, z802);
                }
            }
        });
    }

    public final void zze() {
        a();
        synchronized (this.f12551g) {
            this.f12552h = true;
        }
        Iterator it = this.f12548d.iterator();
        while (it.hasNext()) {
            ((C2372ba0) it.next()).zzc(this.f12547c);
        }
        this.f12548d.clear();
    }

    public final void zzf(Object obj) {
        a();
        Iterator it = this.f12548d.iterator();
        while (it.hasNext()) {
            C2372ba0 c2372ba0 = (C2372ba0) it.next();
            if (c2372ba0.zza.equals(obj)) {
                c2372ba0.zzc(this.f12547c);
                this.f12548d.remove(c2372ba0);
            }
        }
    }

    private C1211Ca0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC3002h20 interfaceC3002h20, A90 a90, boolean z8) {
        this.f12545a = interfaceC3002h20;
        this.f12548d = copyOnWriteArraySet;
        this.f12547c = a90;
        this.f12551g = new Object();
        this.f12549e = new ArrayDeque();
        this.f12550f = new ArrayDeque();
        this.f12546b = interfaceC3002h20.zzb(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.X70
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C1211Ca0.zzg(this.zza, message);
                return true;
            }
        });
        this.f12553i = z8;
    }
}
