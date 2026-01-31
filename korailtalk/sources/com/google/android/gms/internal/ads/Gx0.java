package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
final class Gx0 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ix0 f13217a;

    Gx0(Ix0 ix0) {
        this.f13217a = ix0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            Mac mac = (Mac) C4586ux0.zzb.zza(this.f13217a.f13548b);
            mac.init(this.f13217a.f13549c);
            return mac;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}
