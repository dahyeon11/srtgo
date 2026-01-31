package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class P8 extends AbstractC3594mD0 {

    /* renamed from: k, reason: collision with root package name */
    ByteBuffer f15216k;

    public P8(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3594mD0
    public final void zzf(ByteBuffer byteBuffer) {
        this.f15216k = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
