package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Pu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1777Pu implements InterfaceC4277sD0 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f15417a;

    C1777Pu(ByteBuffer byteBuffer) {
        this.f15417a = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277sD0
    public final int zza(ByteBuffer byteBuffer) {
        if (this.f15417a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.f15417a.remaining());
        byte[] bArr = new byte[iMin];
        this.f15417a.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277sD0
    public final long zzb() {
        return this.f15417a.position();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277sD0
    public final long zzc() {
        return this.f15417a.limit();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277sD0
    public final ByteBuffer zzd(long j8, long j9) {
        ByteBuffer byteBuffer = this.f15417a;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j8);
        ByteBuffer byteBufferSlice = this.f15417a.slice();
        byteBufferSlice.limit((int) j9);
        this.f15417a.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277sD0
    public final void zze(long j8) {
        this.f15417a.position((int) j8);
    }
}
