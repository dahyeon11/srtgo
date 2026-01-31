package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Bs0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Bs0 f12326b = new Bs0();

    /* renamed from: a, reason: collision with root package name */
    private final Map f12327a = new HashMap();

    public static Bs0 zza() {
        return f12326b;
    }

    public final synchronized void zzb(As0 as0, Class cls) {
        try {
            As0 as02 = (As0) this.f12327a.get(cls);
            if (as02 != null && !as02.equals(as0)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f12327a.put(cls, as0);
        } catch (Throwable th) {
            throw th;
        }
    }
}
