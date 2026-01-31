package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.nD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3708nD0 extends C4163rD0 implements L8 {

    /* renamed from: i, reason: collision with root package name */
    M8 f21224i;

    /* renamed from: j, reason: collision with root package name */
    protected final String f21225j = "moov";

    public C3708nD0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.L8
    public final String zza() {
        return this.f21225j;
    }

    @Override // com.google.android.gms.internal.ads.L8
    public final void zzb(InterfaceC4277sD0 interfaceC4277sD0, ByteBuffer byteBuffer, long j8, I8 i8) {
        interfaceC4277sD0.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f22398b = interfaceC4277sD0;
        this.f22400d = interfaceC4277sD0.zzb();
        interfaceC4277sD0.zze(interfaceC4277sD0.zzb() + j8);
        this.f22401e = interfaceC4277sD0.zzb();
        this.f22397a = i8;
    }

    @Override // com.google.android.gms.internal.ads.L8
    public final void zzc(M8 m8) {
        this.f21224i = m8;
    }
}
