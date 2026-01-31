package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5146zs0 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC5032ys0 f24210b = new InterfaceC5032ys0() { // from class: com.google.android.gms.internal.ads.ws0
        @Override // com.google.android.gms.internal.ads.InterfaceC5032ys0
        public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) throws GeneralSecurityException {
            int i8 = C5146zs0.zza;
            C4242rw0 c4242rw0Zzc = ((C4348ss0) abstractC1730Oo0).zzb().zzc();
            InterfaceC1157Ao0 interfaceC1157Ao0Zzb = C2981gs0.zzc().zzb(c4242rw0Zzc.zzi());
            if (!C2981gs0.zzc().zze(c4242rw0Zzc.zzi())) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            C3673mw0 c3673mw0Zza = interfaceC1157Ao0Zzb.zza(c4242rw0Zzc.zzh());
            return new C4234rs0(C3439kt0.zza(c3673mw0Zza.zzg(), c3673mw0Zza.zzf(), c3673mw0Zza.zzc(), c4242rw0Zzc.zzg(), num), AbstractC5024yo0.zza());
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final C5146zs0 f24211c = b();
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f24212a = new HashMap();

    private final synchronized C5138zo0 a(AbstractC1730Oo0 abstractC1730Oo0, Integer num) {
        InterfaceC5032ys0 interfaceC5032ys0;
        interfaceC5032ys0 = (InterfaceC5032ys0) this.f24212a.get(abstractC1730Oo0.getClass());
        if (interfaceC5032ys0 == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + abstractC1730Oo0.toString() + ": no key creator for this class was registered.");
        }
        return interfaceC5032ys0.zza(abstractC1730Oo0, num);
    }

    private static C5146zs0 b() {
        C5146zs0 c5146zs0 = new C5146zs0();
        try {
            c5146zs0.zzc(f24210b, C4348ss0.class);
            return c5146zs0;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException("unexpected error.", e8);
        }
    }

    public static C5146zs0 zzb() {
        return f24211c;
    }

    public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) {
        return a(abstractC1730Oo0, num);
    }

    public final synchronized void zzc(InterfaceC5032ys0 interfaceC5032ys0, Class cls) {
        try {
            InterfaceC5032ys0 interfaceC5032ys02 = (InterfaceC5032ys0) this.f24212a.get(cls);
            if (interfaceC5032ys02 != null && !interfaceC5032ys02.equals(interfaceC5032ys0)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.f24212a.put(cls, interfaceC5032ys0);
        } catch (Throwable th) {
            throw th;
        }
    }
}
