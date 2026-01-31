package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C1106d;
import i2.AbstractC5683p;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1107e {

    /* renamed from: a, reason: collision with root package name */
    private final Set f12020a = Collections.newSetFromMap(new WeakHashMap());

    public static <L> C1106d createListenerHolder(L l8, Looper looper, String str) {
        AbstractC5683p.checkNotNull(l8, "Listener must not be null");
        AbstractC5683p.checkNotNull(looper, "Looper must not be null");
        AbstractC5683p.checkNotNull(str, "Listener type must not be null");
        return new C1106d(looper, l8, str);
    }

    public static <L> C1106d.a createListenerKey(L l8, String str) {
        AbstractC5683p.checkNotNull(l8, "Listener must not be null");
        AbstractC5683p.checkNotNull(str, "Listener type must not be null");
        AbstractC5683p.checkNotEmpty(str, "Listener type must not be empty");
        return new C1106d.a(l8, str);
    }

    public final <L> C1106d zaa(L l8, Looper looper, String str) {
        C1106d c1106dCreateListenerHolder = createListenerHolder(l8, looper, "NO_TYPE");
        this.f12020a.add(c1106dCreateListenerHolder);
        return c1106dCreateListenerHolder;
    }

    public final void zab() {
        Iterator it = this.f12020a.iterator();
        while (it.hasNext()) {
            ((C1106d) it.next()).clear();
        }
        this.f12020a.clear();
    }

    public static <L> C1106d createListenerHolder(L l8, Executor executor, String str) {
        AbstractC5683p.checkNotNull(l8, "Listener must not be null");
        AbstractC5683p.checkNotNull(executor, "Executor must not be null");
        AbstractC5683p.checkNotNull(str, "Listener type must not be null");
        return new C1106d(executor, l8, str);
    }
}
