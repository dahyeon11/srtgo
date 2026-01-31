package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class Jx0 implements InterfaceC1689No0 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f13706e = {0};

    /* renamed from: a, reason: collision with root package name */
    private final Uu0 f13707a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13708b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f13709c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f13710d;

    private Jx0(Et0 et0) {
        this.f13707a = new Fx0(et0.zzd().zzd(AbstractC5024yo0.zza()));
        this.f13708b = et0.zzb().zzb();
        this.f13709c = et0.zzc().zzc();
        if (et0.zzb().zzf().equals(Lt0.zzc)) {
            this.f13710d = Arrays.copyOf(f13706e, 1);
        } else {
            this.f13710d = new byte[0];
        }
    }

    public static InterfaceC1689No0 zza(Et0 et0) {
        return new Jx0(et0);
    }

    public static InterfaceC1689No0 zzb(Vt0 vt0) {
        return new Jx0(vt0);
    }

    public final byte[] zzc(byte[] bArr) {
        byte[] bArr2 = this.f13710d;
        return bArr2.length > 0 ? AbstractC3447kx0.zzb(this.f13709c, this.f13707a.zza(AbstractC3447kx0.zzb(bArr, bArr2), this.f13708b)) : AbstractC3447kx0.zzb(this.f13709c, this.f13707a.zza(bArr, this.f13708b));
    }

    private Jx0(Vt0 vt0) {
        String strValueOf = String.valueOf(vt0.zzb().zzf());
        this.f13707a = new Ix0("HMAC".concat(strValueOf), new SecretKeySpec(vt0.zzd().zzd(AbstractC5024yo0.zza()), "HMAC"));
        this.f13708b = vt0.zzb().zzb();
        this.f13709c = vt0.zzc().zzc();
        if (vt0.zzb().zzg().equals(C2870fu0.zzc)) {
            this.f13710d = Arrays.copyOf(f13706e, 1);
        } else {
            this.f13710d = new byte[0];
        }
    }

    public Jx0(Uu0 uu0, int i8) {
        this.f13707a = uu0;
        this.f13708b = i8;
        this.f13709c = new byte[0];
        this.f13710d = new byte[0];
        uu0.zza(new byte[0], i8);
    }
}
