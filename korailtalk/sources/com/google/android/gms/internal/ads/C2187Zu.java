package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Zu */
/* loaded from: classes2.dex */
public final class C2187Zu implements Iterable {

    /* renamed from: a */
    private final List f17636a = new ArrayList();

    final C2146Yu a(InterfaceC4579uu interfaceC4579uu) {
        Iterator it = iterator();
        while (it.hasNext()) {
            C2146Yu c2146Yu = (C2146Yu) it.next();
            if (c2146Yu.f17458c == interfaceC4579uu) {
                return c2146Yu;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f17636a.iterator();
    }

    public final void zzb(C2146Yu c2146Yu) {
        this.f17636a.add(c2146Yu);
    }

    public final void zzc(C2146Yu c2146Yu) {
        this.f17636a.remove(c2146Yu);
    }

    public final boolean zzd(InterfaceC4579uu interfaceC4579uu) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            C2146Yu c2146Yu = (C2146Yu) it.next();
            if (c2146Yu.f17458c == interfaceC4579uu) {
                arrayList.add(c2146Yu);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C2146Yu) it2.next()).f17459d.zzf();
        }
        return true;
    }
}
