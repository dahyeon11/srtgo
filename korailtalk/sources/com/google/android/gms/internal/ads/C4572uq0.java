package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.uq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4572uq0 extends C2181Zo0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4800wq0 f23117a;

    /* renamed from: b, reason: collision with root package name */
    private final Mx0 f23118b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f23119c;

    private C4572uq0(C4800wq0 c4800wq0, Mx0 mx0, Integer num) {
        this.f23117a = c4800wq0;
        this.f23118b = mx0;
        this.f23119c = num;
    }

    public static C4572uq0 zza(C4800wq0 c4800wq0, Integer num) throws GeneralSecurityException {
        Mx0 mx0Zzb;
        if (c4800wq0.zzb() == C4686vq0.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            mx0Zzb = Mx0.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (c4800wq0.zzb() != C4686vq0.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(c4800wq0.zzb().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            mx0Zzb = Mx0.zzb(new byte[0]);
        }
        return new C4572uq0(c4800wq0, mx0Zzb, num);
    }

    public final C4800wq0 zzb() {
        return this.f23117a;
    }

    public final Mx0 zzc() {
        return this.f23118b;
    }

    public final Integer zzd() {
        return this.f23119c;
    }
}
