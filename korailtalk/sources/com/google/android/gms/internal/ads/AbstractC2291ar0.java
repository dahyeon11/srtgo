package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ar0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2291ar0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ws0 f18040a = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.Xq0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            Wq0 wq0 = (Wq0) c5138zo0;
            int i8 = AbstractC2291ar0.zza;
            return Qr0.zzc() ? Qr0.zzb(wq0) : Lx0.zzb(wq0);
        }
    }, Wq0.class, InterfaceC3885oo0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1157Ao0 f18041b = C4007ps0.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", InterfaceC3885oo0.class, EnumC3559lw0.SYMMETRIC, Zw0.zzg());

    /* renamed from: c, reason: collision with root package name */
    private static final As0 f18042c = new As0() { // from class: com.google.android.gms.internal.ads.Yq0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC5032ys0 f18043d = new InterfaceC5032ys0() { // from class: com.google.android.gms.internal.ads.Zq0
        @Override // com.google.android.gms.internal.ads.InterfaceC5032ys0
        public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) {
            int i8 = AbstractC2291ar0.zza;
            return Wq0.zza(((C2520cr0) abstractC1730Oo0).zzb(), Nx0.zzc(32), num);
        }
    };
    public static final /* synthetic */ int zza = 0;

    public static void zza(boolean z8) {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i8 = Vr0.zza;
        Vr0.zze(Js0.zzc());
        Gs0.zza().zze(f18040a);
        Fs0 fs0Zzb = Fs0.zzb();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", C2520cr0.zzc(C2406br0.zza));
        map.put("XCHACHA20_POLY1305_RAW", C2520cr0.zzc(C2406br0.zzc));
        fs0Zzb.zzd(Collections.unmodifiableMap(map));
        C5146zs0.zzb().zzc(f18043d, C2520cr0.class);
        Bs0.zza().zzb(f18042c, C2520cr0.class);
        C2981gs0.zzc().zzd(f18041b, true);
    }
}
