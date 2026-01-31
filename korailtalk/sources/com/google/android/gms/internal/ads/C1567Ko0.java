package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ko0 */
/* loaded from: classes2.dex */
public final class C1567Ko0 {

    /* renamed from: a */
    private final C5154zw0 f13862a;

    /* renamed from: b */
    private final List f13863b;

    /* renamed from: c */
    private final Mu0 f13864c;

    /* synthetic */ C1567Ko0(C5154zw0 c5154zw0, List list, Mu0 mu0, AbstractC1526Jo0 abstractC1526Jo0) {
        this.f13862a = c5154zw0;
        this.f13863b = list;
        this.f13864c = mu0;
    }

    static final C1567Ko0 a(C5154zw0 c5154zw0) throws GeneralSecurityException {
        f(c5154zw0);
        return new C1567Ko0(c5154zw0, e(c5154zw0));
    }

    private final Object d(C2866fs0 c2866fs0, Class cls, Class cls2) throws GeneralSecurityException {
        Charset charset = AbstractC2099Xo0.zza;
        C5154zw0 c5154zw0 = this.f13862a;
        int iZzc = c5154zw0.zzc();
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = true;
        for (C5040yw0 c5040yw0 : c5154zw0.zzh()) {
            if (c5040yw0.zzd() == EnumC3901ow0.ENABLED) {
                if (!c5040yw0.zzl()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c5040yw0.zza())));
                }
                if (c5040yw0.zzg() == Tw0.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c5040yw0.zza())));
                }
                if (c5040yw0.zzd() == EnumC3901ow0.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c5040yw0.zza())));
                }
                if (c5040yw0.zza() == iZzc) {
                    if (z8) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z8 = true;
                }
                z9 &= c5040yw0.zzc().zzc() == EnumC3559lw0.ASYMMETRIC_PUBLIC;
                i8++;
            }
        }
        if (i8 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z8 && !z9) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        C2868ft0 c2868ft0Zza = C3325jt0.zza(cls2);
        c2868ft0Zza.zzc(this.f13864c);
        for (int i9 = 0; i9 < this.f13863b.size(); i9++) {
            C5040yw0 c5040yw0Zze = this.f13862a.zze(i9);
            if (c5040yw0Zze.zzd().equals(EnumC3901ow0.ENABLED)) {
                C1485Io0 c1485Io0 = (C1485Io0) this.f13863b.get(i9);
                if (c1485Io0 == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i9 + " and type_url " + c5040yw0Zze.zzc().zzg() + " failed, unable to get primitive");
                }
                C5138zo0 c5138zo0Zza = c1485Io0.zza();
                try {
                    Object objZzc = Gs0.zza().zzc(c5138zo0Zza, cls2);
                    if (c5040yw0Zze.zza() == this.f13862a.zzc()) {
                        c2868ft0Zza.zzb(objZzc, c5138zo0Zza, c5040yw0Zze);
                    } else {
                        c2868ft0Zza.zza(objZzc, c5138zo0Zza, c5040yw0Zze);
                    }
                } catch (GeneralSecurityException e8) {
                    throw new GeneralSecurityException("Unable to get primitive " + cls2.toString() + " for key of type " + c5040yw0Zze.zzc().zzg() + ", see https://developers.google.com/tink/faq/registration_errors", e8);
                }
            }
        }
        C3325jt0 c3325jt0Zzd = c2868ft0Zza.zzd();
        int i10 = AbstractC1935To0.zza;
        return Gs0.zza().zzd(c3325jt0Zzd, cls);
    }

    private static List e(C5154zw0 c5154zw0) throws GeneralSecurityException {
        C1198Bo0 c1198Bo0;
        ArrayList arrayList = new ArrayList(c5154zw0.zza());
        for (C5040yw0 c5040yw0 : c5154zw0.zzh()) {
            int iZza = c5040yw0.zza();
            try {
                C3439kt0 c3439kt0Zza = C3439kt0.zza(c5040yw0.zzc().zzg(), c5040yw0.zzc().zzf(), c5040yw0.zzc().zzc(), c5040yw0.zzg(), c5040yw0.zzg() == Tw0.RAW ? null : Integer.valueOf(c5040yw0.zza()));
                Js0 js0Zzc = Js0.zzc();
                C1976Uo0 c1976Uo0A = C1976Uo0.a();
                C5138zo0 c4234rs0 = !js0Zzc.zzj(c3439kt0Zza) ? new C4234rs0(c3439kt0Zza, c1976Uo0A) : js0Zzc.zza(c3439kt0Zza, c1976Uo0A);
                EnumC3901ow0 enumC3901ow0Zzd = c5040yw0.zzd();
                EnumC3901ow0 enumC3901ow0 = EnumC3901ow0.UNKNOWN_STATUS;
                int iOrdinal = enumC3901ow0Zzd.ordinal();
                if (iOrdinal == 1) {
                    c1198Bo0 = C1198Bo0.zza;
                } else if (iOrdinal == 2) {
                    c1198Bo0 = C1198Bo0.zzb;
                } else {
                    if (iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    c1198Bo0 = C1198Bo0.zzc;
                }
                arrayList.add(new C1485Io0(c4234rs0, c1198Bo0, iZza, iZza == c5154zw0.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void f(C5154zw0 c5154zw0) throws GeneralSecurityException {
        if (c5154zw0 == null || c5154zw0.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static final C1567Ko0 zzb(AbstractC1730Oo0 abstractC1730Oo0) {
        C1403Go0 c1403Go0 = new C1403Go0();
        C1321Eo0 c1321Eo0 = new C1321Eo0(abstractC1730Oo0, null);
        c1321Eo0.zzd();
        c1321Eo0.zzc();
        c1403Go0.zza(c1321Eo0);
        return c1403Go0.zzb();
    }

    final C5154zw0 b() {
        return this.f13862a;
    }

    public final String toString() {
        Charset charset = AbstractC2099Xo0.zza;
        Bw0 bw0Zza = Ew0.zza();
        C5154zw0 c5154zw0 = this.f13862a;
        bw0Zza.zzb(c5154zw0.zzc());
        for (C5040yw0 c5040yw0 : c5154zw0.zzh()) {
            Cw0 cw0Zza = Dw0.zza();
            cw0Zza.zzd(c5040yw0.zzc().zzg());
            cw0Zza.zzc(c5040yw0.zzd());
            cw0Zza.zzb(c5040yw0.zzg());
            cw0Zza.zza(c5040yw0.zza());
            bw0Zza.zza((Dw0) cw0Zza.zzbr());
        }
        return ((Ew0) bw0Zza.zzbr()).toString();
    }

    public final Object zzd(C4454to0 c4454to0, Class cls) throws GeneralSecurityException {
        Class clsZza = AbstractC1935To0.zza(cls);
        if (clsZza != null) {
            return d((C2866fs0) c4454to0, cls, clsZza);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    private C1567Ko0(C5154zw0 c5154zw0, List list) {
        this.f13862a = c5154zw0;
        this.f13863b = list;
        this.f13864c = Mu0.zza;
    }
}
