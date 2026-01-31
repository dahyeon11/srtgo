package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3556lv {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f20787a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private long f20788b;

    C3556lv() {
    }

    final long a() throws NumberFormatException {
        Iterator it = this.f20787a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((C2567dE0) it.next()).zze().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.f20788b = Math.max(this.f20788b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.f20788b;
    }

    final void b(C2567dE0 c2567dE0) {
        this.f20787a.add(c2567dE0);
    }
}
