package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Rt0 implements InterfaceC1771Po0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Rt0 f16156a = new Rt0();

    private Rt0() {
    }

    static void a() {
        Gs0.zza().zzf(f16156a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Po0
    public final Class zza() {
        return Ot0.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Po0
    public final Class zzb() {
        return Ot0.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Po0
    public final /* bridge */ /* synthetic */ Object zzc(C3325jt0 c3325jt0) throws GeneralSecurityException {
        if (c3325jt0.zzb() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = c3325jt0.zze().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new Qt0(c3325jt0, null);
    }
}
