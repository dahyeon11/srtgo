package com.google.android.gms.common.api.internal;

import I2.C0609m;
import com.google.android.gms.common.api.Status;
import g2.C5540b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1115m {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12076a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f12077b = Collections.synchronizedMap(new WeakHashMap());

    private final void g(boolean z8, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f12076a) {
            map = new HashMap(this.f12076a);
        }
        synchronized (this.f12077b) {
            map2 = new HashMap(this.f12077b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z8 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z8 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C0609m) entry2.getKey()).trySetException(new C5540b(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z8) {
        this.f12076a.put(basePendingResult, Boolean.valueOf(z8));
        basePendingResult.addStatusListener(new C1113k(this, basePendingResult));
    }

    final void d(C0609m c0609m, boolean z8) {
        this.f12077b.put(c0609m, Boolean.valueOf(z8));
        c0609m.getTask().addOnCompleteListener(new C1114l(this, c0609m));
    }

    final void e(int i8, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i8 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i8 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        g(true, new Status(20, sb.toString()));
    }

    final boolean f() {
        return (this.f12076a.isEmpty() && this.f12077b.isEmpty()) ? false : true;
    }

    public final void zaf() {
        g(false, C1105c.zaa);
    }
}
