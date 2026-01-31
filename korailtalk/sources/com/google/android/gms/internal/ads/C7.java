package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* loaded from: classes2.dex */
final class C7 extends D7 {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12490b;

    public C7(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f12490b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.D7, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f12490b;
    }
}
