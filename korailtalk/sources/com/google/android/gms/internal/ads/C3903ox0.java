package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ox0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3903ox0 implements InterfaceC4472tx0 {

    /* renamed from: a, reason: collision with root package name */
    private final Cx0 f21584a;

    /* synthetic */ C3903ox0(Cx0 cx0, AbstractC3789nx0 abstractC3789nx0) {
        this.f21584a = cx0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4472tx0
    public final Object zza(String str) {
        Iterator it = C4586ux0.zzb("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.f21584a.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.f21584a.zza(str, null);
    }
}
