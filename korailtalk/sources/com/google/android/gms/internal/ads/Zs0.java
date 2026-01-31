package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Zs0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f17634a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f17635b;

    /* synthetic */ Zs0(Xs0 xs0) {
        this.f17634a = new HashMap();
        this.f17635b = new HashMap();
    }

    public final Zs0 zza(Ws0 ws0) throws GeneralSecurityException {
        if (ws0 == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        C2410bt0 c2410bt0 = new C2410bt0(ws0.zzc(), ws0.zzd(), null);
        if (this.f17634a.containsKey(c2410bt0)) {
            Ws0 ws02 = (Ws0) this.f17634a.get(c2410bt0);
            if (!ws02.equals(ws0) || !ws0.equals(ws02)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(c2410bt0.toString()));
            }
        } else {
            this.f17634a.put(c2410bt0, ws0);
        }
        return this;
    }

    public final Zs0 zzb(InterfaceC1771Po0 interfaceC1771Po0) throws GeneralSecurityException {
        Map map = this.f17635b;
        Class clsZzb = interfaceC1771Po0.zzb();
        if (map.containsKey(clsZzb)) {
            InterfaceC1771Po0 interfaceC1771Po02 = (InterfaceC1771Po0) this.f17635b.get(clsZzb);
            if (!interfaceC1771Po02.equals(interfaceC1771Po0) || !interfaceC1771Po0.equals(interfaceC1771Po02)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            this.f17635b.put(clsZzb, interfaceC1771Po0);
        }
        return this;
    }

    /* synthetic */ Zs0(C2638dt0 c2638dt0, Xs0 xs0) {
        this.f17634a = new HashMap(c2638dt0.f18698a);
        this.f17635b = new HashMap(c2638dt0.f18699b);
    }
}
