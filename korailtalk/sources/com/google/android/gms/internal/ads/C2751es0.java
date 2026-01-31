package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.es0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2751es0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f18837a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f18838b;

    /* synthetic */ C2751es0(Map map, Map map2, AbstractC2636ds0 abstractC2636ds0) {
        this.f18837a = map;
        this.f18838b = map2;
    }

    public static C2522cs0 zza() {
        return new C2522cs0(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r02 = (Enum) this.f18838b.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r32) throws GeneralSecurityException {
        Object obj = this.f18837a.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}
