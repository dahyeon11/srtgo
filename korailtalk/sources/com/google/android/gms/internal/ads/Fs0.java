package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Fs0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Fs0 f13081b = new Fs0();

    /* renamed from: a, reason: collision with root package name */
    private final Map f13082a = new HashMap();

    Fs0() {
    }

    public static Fs0 zzb() {
        return f13081b;
    }

    public final synchronized AbstractC1730Oo0 zza(String str) {
        if (!this.f13082a.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (AbstractC1730Oo0) this.f13082a.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, AbstractC1730Oo0 abstractC1730Oo0) {
        try {
            if (!this.f13082a.containsKey(str)) {
                this.f13082a.put(str, abstractC1730Oo0);
                return;
            }
            if (((AbstractC1730Oo0) this.f13082a.get(str)).equals(abstractC1730Oo0)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f13082a.get(str)) + "), cannot insert " + String.valueOf(abstractC1730Oo0));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (AbstractC1730Oo0) entry.getValue());
        }
    }
}
