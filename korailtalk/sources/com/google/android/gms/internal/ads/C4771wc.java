package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.wc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4771wc {

    /* renamed from: a, reason: collision with root package name */
    private final Map f23522a = new HashMap();

    public final AtomicReference zza(String str) {
        synchronized (this) {
            try {
                if (!this.f23522a.containsKey(str)) {
                    this.f23522a.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.f23522a.get(str);
    }
}
