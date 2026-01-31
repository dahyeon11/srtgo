package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.wL0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4749wL0 extends BE0 {

    /* renamed from: c, reason: collision with root package name */
    private long f23481c;

    /* renamed from: d, reason: collision with root package name */
    private int f23482d;

    /* renamed from: e, reason: collision with root package name */
    private int f23483e;

    public C4749wL0() {
        super(2, 0);
        this.f23483e = 32;
    }

    @Override // com.google.android.gms.internal.ads.BE0, com.google.android.gms.internal.ads.C4621vE0
    public final void zzb() {
        super.zzb();
        this.f23482d = 0;
    }

    public final int zzl() {
        return this.f23482d;
    }

    public final long zzm() {
        return this.f23481c;
    }

    public final void zzn(int i8) {
        this.f23483e = i8;
    }

    public final boolean zzo(BE0 be0) {
        ByteBuffer byteBuffer;
        F10.zzd(!be0.a(1073741824));
        F10.zzd(!be0.a(268435456));
        F10.zzd(!be0.a(4));
        if (zzp()) {
            if (this.f23482d >= this.f23483e) {
                return false;
            }
            ByteBuffer byteBuffer2 = be0.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i8 = this.f23482d;
        this.f23482d = i8 + 1;
        if (i8 == 0) {
            this.zze = be0.zze;
            if (be0.a(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = be0.zzc;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.f23481c = be0.zze;
        return true;
    }

    public final boolean zzp() {
        return this.f23482d > 0;
    }
}
