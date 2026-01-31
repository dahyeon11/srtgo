package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3482lE0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f20645a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map f20646b;

    public final synchronized Map zza() {
        try {
            if (this.f20646b == null) {
                this.f20646b = Collections.unmodifiableMap(new HashMap(this.f20645a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20646b;
    }
}
