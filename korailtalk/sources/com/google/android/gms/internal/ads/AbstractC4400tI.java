package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4400tI {

    /* renamed from: a, reason: collision with root package name */
    protected final Map f22805a = new HashMap();

    protected AbstractC4400tI(Set set) {
        zzp(set);
    }

    protected final synchronized void a(final InterfaceC4286sI interfaceC4286sI) {
        for (Map.Entry entry : this.f22805a.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rI
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        interfaceC4286sI.zza(key);
                    } catch (Throwable th) {
                        G1.u.zzo().zzv(th, "EventEmitter.notify");
                        AbstractC0667v0.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    public final synchronized void zzk(C4630vJ c4630vJ) {
        zzo(c4630vJ.zza, c4630vJ.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.f22805a.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((C4630vJ) it.next());
        }
    }
}
