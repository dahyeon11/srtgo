package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class Hz0 implements InterfaceC3588mA0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Nz0 f13379b = new Fz0();

    /* renamed from: a, reason: collision with root package name */
    private final Nz0 f13380a;

    public Hz0() {
        Nz0 nz0;
        Sy0 sy0Zza = Sy0.zza();
        try {
            nz0 = (Nz0) Class.forName("com.google.protobuf.v").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            nz0 = f13379b;
        }
        Gz0 gz0 = new Gz0(sy0Zza, nz0);
        byte[] bArr = AbstractC3793nz0.zzd;
        this.f13380a = gz0;
    }

    private static boolean a(Mz0 mz0) {
        return mz0.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3588mA0
    public final InterfaceC3360kA0 zza(Class cls) {
        AbstractC3702nA0.zzs(cls);
        Mz0 mz0Zzb = this.f13380a.zzb(cls);
        return mz0Zzb.zzb() ? Zy0.class.isAssignableFrom(cls) ? Tz0.a(AbstractC3702nA0.zzn(), My0.b(), mz0Zzb.zza()) : Tz0.a(AbstractC3702nA0.zzm(), My0.a(), mz0Zzb.zza()) : Zy0.class.isAssignableFrom(cls) ? a(mz0Zzb) ? Sz0.w(cls, mz0Zzb, Wz0.b(), Dz0.e(), AbstractC3702nA0.zzn(), My0.b(), Lz0.b()) : Sz0.w(cls, mz0Zzb, Wz0.b(), Dz0.e(), AbstractC3702nA0.zzn(), null, Lz0.b()) : a(mz0Zzb) ? Sz0.w(cls, mz0Zzb, Wz0.a(), Dz0.d(), AbstractC3702nA0.zzm(), My0.a(), Lz0.a()) : Sz0.w(cls, mz0Zzb, Wz0.a(), Dz0.d(), AbstractC3702nA0.zzm(), null, Lz0.a());
    }
}
