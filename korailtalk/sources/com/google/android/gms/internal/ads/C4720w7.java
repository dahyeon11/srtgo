package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.w7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4720w7 implements InterfaceC4834x7 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f23416a;

    public C4720w7(ByteBuffer byteBuffer) {
        this.f23416a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4834x7
    public final long zza() {
        return this.f23416a.capacity();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4834x7
    public final void zzb(MessageDigest[] messageDigestArr, long j8, int i8) {
        ByteBuffer byteBufferSlice;
        synchronized (this.f23416a) {
            int i9 = (int) j8;
            this.f23416a.position(i9);
            this.f23416a.limit(i9 + i8);
            byteBufferSlice = this.f23416a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
