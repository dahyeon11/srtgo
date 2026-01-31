package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wt0 */
/* loaded from: classes2.dex */
public final class C4806wt0 {

    /* renamed from: a */
    private final Map f23552a;

    /* renamed from: b */
    private final Map f23553b;

    /* renamed from: c */
    private final Map f23554c;

    /* renamed from: d */
    private final Map f23555d;

    /* synthetic */ C4806wt0(C4123qt0 c4123qt0, AbstractC4692vt0 abstractC4692vt0) {
        this.f23552a = new HashMap(c4123qt0.f22034a);
        this.f23553b = new HashMap(c4123qt0.f22035b);
        this.f23554c = new HashMap(c4123qt0.f22036c);
        this.f23555d = new HashMap(c4123qt0.f22037d);
    }

    public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        C4350st0 c4350st0 = new C4350st0(interfaceC4009pt0.getClass(), interfaceC4009pt0.zzd(), null);
        if (this.f23553b.containsKey(c4350st0)) {
            return ((AbstractC3437ks0) this.f23553b.get(c4350st0)).zza(interfaceC4009pt0, c1976Uo0);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + c4350st0.toString() + " available");
    }

    public final AbstractC1730Oo0 zzb(InterfaceC4009pt0 interfaceC4009pt0) throws GeneralSecurityException {
        C4350st0 c4350st0 = new C4350st0(interfaceC4009pt0.getClass(), interfaceC4009pt0.zzd(), null);
        if (this.f23555d.containsKey(c4350st0)) {
            return ((Os0) this.f23555d.get(c4350st0)).zza(interfaceC4009pt0);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + c4350st0.toString() + " available");
    }

    public final InterfaceC4009pt0 zzc(C5138zo0 c5138zo0, Class cls, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        C4578ut0 c4578ut0 = new C4578ut0(c5138zo0.getClass(), cls, null);
        if (this.f23552a.containsKey(c4578ut0)) {
            return ((AbstractC3893os0) this.f23552a.get(c4578ut0)).zza(c5138zo0, c1976Uo0);
        }
        throw new GeneralSecurityException("No Key serializer for " + c4578ut0.toString() + " available");
    }

    public final InterfaceC4009pt0 zzd(AbstractC1730Oo0 abstractC1730Oo0, Class cls) throws GeneralSecurityException {
        C4578ut0 c4578ut0 = new C4578ut0(abstractC1730Oo0.getClass(), cls, null);
        if (this.f23554c.containsKey(c4578ut0)) {
            return ((Ss0) this.f23554c.get(c4578ut0)).zza(abstractC1730Oo0);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + c4578ut0.toString() + " available");
    }

    public final boolean zzi(InterfaceC4009pt0 interfaceC4009pt0) {
        return this.f23553b.containsKey(new C4350st0(interfaceC4009pt0.getClass(), interfaceC4009pt0.zzd(), null));
    }

    public final boolean zzj(InterfaceC4009pt0 interfaceC4009pt0) {
        return this.f23555d.containsKey(new C4350st0(interfaceC4009pt0.getClass(), interfaceC4009pt0.zzd(), null));
    }
}
