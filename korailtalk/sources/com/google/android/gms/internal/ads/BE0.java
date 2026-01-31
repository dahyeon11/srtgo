package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class BE0 extends C4621vE0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f12259b;
    public Q5 zza;
    public final C4963yE0 zzb = new C4963yE0();
    public ByteBuffer zzc;
    public boolean zzd;
    public long zze;
    public ByteBuffer zzf;

    static {
        AbstractC1609Lp.zzb("media3.decoder");
    }

    public BE0(int i8, int i9) {
        this.f12259b = i8;
    }

    private final ByteBuffer b(int i8) {
        int i9 = this.f12259b;
        if (i9 == 1) {
            return ByteBuffer.allocate(i8);
        }
        if (i9 == 2) {
            return ByteBuffer.allocateDirect(i8);
        }
        ByteBuffer byteBuffer = this.zzc;
        throw new AE0(byteBuffer == null ? 0 : byteBuffer.capacity(), i8);
    }

    @Override // com.google.android.gms.internal.ads.C4621vE0
    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzd = false;
    }

    public final void zzi(int i8) {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            this.zzc = b(i8);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i9 = i8 + iPosition;
        if (iCapacity >= i9) {
            this.zzc = byteBuffer;
            return;
        }
        ByteBuffer byteBufferB = b(i9);
        byteBufferB.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferB.put(byteBuffer);
        }
        this.zzc = byteBufferB;
    }

    public final void zzj() {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean zzk() {
        return a(1073741824);
    }
}
