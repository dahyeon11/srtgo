package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.kt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3439kt0 implements InterfaceC4009pt0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f20491a;

    /* renamed from: b, reason: collision with root package name */
    private final Mx0 f20492b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3677my0 f20493c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC3559lw0 f20494d;

    /* renamed from: e, reason: collision with root package name */
    private final Tw0 f20495e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f20496f;

    private C3439kt0(String str, Mx0 mx0, AbstractC3677my0 abstractC3677my0, EnumC3559lw0 enumC3559lw0, Tw0 tw0, Integer num) {
        this.f20491a = str;
        this.f20492b = mx0;
        this.f20493c = abstractC3677my0;
        this.f20494d = enumC3559lw0;
        this.f20495e = tw0;
        this.f20496f = num;
    }

    public static C3439kt0 zza(String str, AbstractC3677my0 abstractC3677my0, EnumC3559lw0 enumC3559lw0, Tw0 tw0, Integer num) throws GeneralSecurityException {
        if (tw0 == Tw0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C3439kt0(str, At0.zza(str), abstractC3677my0, enumC3559lw0, tw0, num);
    }

    public final EnumC3559lw0 zzb() {
        return this.f20494d;
    }

    public final Tw0 zzc() {
        return this.f20495e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4009pt0
    public final Mx0 zzd() {
        return this.f20492b;
    }

    public final AbstractC3677my0 zze() {
        return this.f20493c;
    }

    public final Integer zzf() {
        return this.f20496f;
    }

    public final String zzg() {
        return this.f20491a;
    }
}
