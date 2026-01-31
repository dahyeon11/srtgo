package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2638dt0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f18698a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f18699b;

    /* synthetic */ C2638dt0(Zs0 zs0, AbstractC2524ct0 abstractC2524ct0) {
        this.f18698a = new HashMap(zs0.f17634a);
        this.f18699b = new HashMap(zs0.f17635b);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.f18699b.containsKey(cls)) {
            return ((InterfaceC1771Po0) this.f18699b.get(cls)).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object zzb(C5138zo0 c5138zo0, Class cls) throws GeneralSecurityException {
        C2410bt0 c2410bt0 = new C2410bt0(c5138zo0.getClass(), cls, null);
        if (this.f18698a.containsKey(c2410bt0)) {
            return ((Ws0) this.f18698a.get(c2410bt0)).zza(c5138zo0);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + c2410bt0.toString() + " available");
    }

    public final Object zzc(C3325jt0 c3325jt0, Class cls) throws GeneralSecurityException {
        if (!this.f18699b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        InterfaceC1771Po0 interfaceC1771Po0 = (InterfaceC1771Po0) this.f18699b.get(cls);
        if (c3325jt0.zzd().equals(interfaceC1771Po0.zza()) && interfaceC1771Po0.zza().equals(c3325jt0.zzd())) {
            return interfaceC1771Po0.zzc(c3325jt0);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
