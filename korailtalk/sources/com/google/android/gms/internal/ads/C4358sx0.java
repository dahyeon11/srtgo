package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.sx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4358sx0 implements InterfaceC4472tx0 {

    /* renamed from: a, reason: collision with root package name */
    private final Cx0 f22750a;

    /* synthetic */ C4358sx0(Cx0 cx0, AbstractC4244rx0 abstractC4244rx0) {
        this.f22750a = cx0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4472tx0
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = C4586ux0.zzb("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f22750a.zza(str, (Provider) it.next());
            } catch (Exception e8) {
                if (exc == null) {
                    exc = e8;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
