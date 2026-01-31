package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class Iu0 {

    /* renamed from: a */
    private static final Mx0 f13513a;

    /* renamed from: b */
    private static final C2751es0 f13514b;

    /* renamed from: c */
    private static final C2751es0 f13515c;

    /* renamed from: d */
    private static final Ss0 f13516d;

    /* renamed from: e */
    private static final Os0 f13517e;

    /* renamed from: f */
    private static final AbstractC3893os0 f13518f;

    /* renamed from: g */
    private static final AbstractC3437ks0 f13519g;
    public static final /* synthetic */ int zza = 0;

    static {
        Mx0 mx0Zzb = At0.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        f13513a = mx0Zzb;
        C2522cs0 c2522cs0Zza = C2751es0.zza();
        c2522cs0Zza.zza(Tw0.RAW, C2870fu0.zzd);
        c2522cs0Zza.zza(Tw0.TINK, C2870fu0.zza);
        c2522cs0Zza.zza(Tw0.LEGACY, C2870fu0.zzc);
        c2522cs0Zza.zza(Tw0.CRUNCHY, C2870fu0.zzb);
        f13514b = c2522cs0Zza.zzb();
        C2522cs0 c2522cs0Zza2 = C2751es0.zza();
        c2522cs0Zza2.zza(Xv0.SHA1, C2755eu0.zza);
        c2522cs0Zza2.zza(Xv0.SHA224, C2755eu0.zzb);
        c2522cs0Zza2.zza(Xv0.SHA256, C2755eu0.zzc);
        c2522cs0Zza2.zza(Xv0.SHA384, C2755eu0.zzd);
        c2522cs0Zza2.zza(Xv0.SHA512, C2755eu0.zze);
        f13515c = c2522cs0Zza2.zzb();
        f13516d = Ss0.zzb(new Qs0() { // from class: com.google.android.gms.internal.ads.Eu0
            @Override // com.google.android.gms.internal.ads.Qs0
            public final InterfaceC4009pt0 zza(AbstractC1730Oo0 abstractC1730Oo0) {
                return Iu0.zzb((C3100hu0) abstractC1730Oo0);
            }
        }, C3100hu0.class, C3553lt0.class);
        f13517e = Os0.zzb(new Ms0() { // from class: com.google.android.gms.internal.ads.Fu0
            @Override // com.google.android.gms.internal.ads.Ms0
            public final AbstractC1730Oo0 zza(InterfaceC4009pt0 interfaceC4009pt0) {
                return Iu0.zzd((C3553lt0) interfaceC4009pt0);
            }
        }, mx0Zzb, C3553lt0.class);
        f13518f = AbstractC3893os0.zzb(new InterfaceC3665ms0() { // from class: com.google.android.gms.internal.ads.Gu0
            @Override // com.google.android.gms.internal.ads.InterfaceC3665ms0
            public final InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0) {
                return Iu0.zza((Vt0) c5138zo0, c1976Uo0);
            }
        }, Vt0.class, C3439kt0.class);
        f13519g = AbstractC3437ks0.zzb(new InterfaceC3210is0() { // from class: com.google.android.gms.internal.ads.Hu0
            @Override // com.google.android.gms.internal.ads.InterfaceC3210is0
            public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) {
                return Iu0.zzc((C3439kt0) interfaceC4009pt0, c1976Uo0);
            }
        }, mx0Zzb, C3439kt0.class);
    }

    private static C3104hw0 a(C3100hu0 c3100hu0) {
        C2989gw0 c2989gw0Zzd = C3104hw0.zzd();
        c2989gw0Zzd.zzb(c3100hu0.zzb());
        c2989gw0Zzd.zza((Xv0) f13515c.zzb(c3100hu0.zzf()));
        return (C3104hw0) c2989gw0Zzd.zzbr();
    }

    public static /* synthetic */ C3439kt0 zza(Vt0 vt0, C1976Uo0 c1976Uo0) {
        Zv0 zv0Zzc = C2301aw0.zzc();
        zv0Zzc.zzb(a(vt0.zzb()));
        byte[] bArrZzd = vt0.zzd().zzd(c1976Uo0);
        zv0Zzc.zza(AbstractC3677my0.zzv(bArrZzd, 0, bArrZzd.length));
        return C3439kt0.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((C2301aw0) zv0Zzc.zzbr()).zzaN(), EnumC3559lw0.SYMMETRIC, (Tw0) f13514b.zzb(vt0.zzb().zzg()), vt0.zze());
    }

    public static /* synthetic */ C3553lt0 zzb(C3100hu0 c3100hu0) {
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        C2530cw0 c2530cw0Zzd = C2644dw0.zzd();
        c2530cw0Zzd.zzb(a(c3100hu0));
        c2530cw0Zzd.zza(c3100hu0.zzc());
        c4129qw0Zza.zzc(((C2644dw0) c2530cw0Zzd.zzbr()).zzaN());
        c4129qw0Zza.zza((Tw0) f13514b.zzb(c3100hu0.zzg()));
        return C3553lt0.zzb((C4242rw0) c4129qw0Zza.zzbr());
    }

    public static /* synthetic */ Vt0 zzc(C3439kt0 c3439kt0, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        if (!c3439kt0.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            C2301aw0 c2301aw0Zzf = C2301aw0.zzf(c3439kt0.zze(), Iy0.zza());
            if (c2301aw0Zzf.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C2640du0 c2640du0Zze = C3100hu0.zze();
            c2640du0Zze.zzb(c2301aw0Zzf.zzh().zzd());
            c2640du0Zze.zzc(c2301aw0Zzf.zzg().zza());
            c2640du0Zze.zza((C2755eu0) f13515c.zzc(c2301aw0Zzf.zzg().zzc()));
            c2640du0Zze.zzd((C2870fu0) f13514b.zzc(c3439kt0.zzc()));
            C3100hu0 c3100hu0Zze = c2640du0Zze.zze();
            Tt0 tt0Zza = Vt0.zza();
            tt0Zza.zzc(c3100hu0Zze);
            tt0Zza.zzb(Nx0.zzb(c2301aw0Zzf.zzh().zzB(), c1976Uo0));
            tt0Zza.zza(c3439kt0.zzf());
            return tt0Zza.zzd();
        } catch (C4021pz0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ C3100hu0 zzd(C3553lt0 c3553lt0) throws GeneralSecurityException {
        if (!c3553lt0.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(c3553lt0.zzc().zzi())));
        }
        try {
            C2644dw0 c2644dw0Zzg = C2644dw0.zzg(c3553lt0.zzc().zzh(), Iy0.zza());
            if (c2644dw0Zzg.zzc() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + c2644dw0Zzg.zzc());
            }
            C2640du0 c2640du0Zze = C3100hu0.zze();
            c2640du0Zze.zzb(c2644dw0Zzg.zza());
            c2640du0Zze.zzc(c2644dw0Zzg.zzh().zza());
            c2640du0Zze.zza((C2755eu0) f13515c.zzc(c2644dw0Zzg.zzh().zzc()));
            c2640du0Zze.zzd((C2870fu0) f13514b.zzc(c3553lt0.zzc().zzg()));
            return c2640du0Zze.zze();
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e8);
        }
    }

    public static void zze(Js0 js0) {
        js0.zzi(f13516d);
        js0.zzh(f13517e);
        js0.zzg(f13518f);
        js0.zzf(f13519g);
    }
}
