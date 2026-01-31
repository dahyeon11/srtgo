package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ll0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3537ll0 {
    static Object a(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    static void b(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean zzc(Collection collection, Iterator it) {
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }
}
