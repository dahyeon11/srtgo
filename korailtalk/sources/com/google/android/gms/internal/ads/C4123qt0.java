package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4123qt0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f22034a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f22035b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f22036c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f22037d;

    public C4123qt0() {
        this.f22034a = new HashMap();
        this.f22035b = new HashMap();
        this.f22036c = new HashMap();
        this.f22037d = new HashMap();
    }

    public final C4123qt0 zza(AbstractC3437ks0 abstractC3437ks0) throws GeneralSecurityException {
        C4350st0 c4350st0 = new C4350st0(abstractC3437ks0.zzd(), abstractC3437ks0.zzc(), null);
        if (this.f22035b.containsKey(c4350st0)) {
            AbstractC3437ks0 abstractC3437ks02 = (AbstractC3437ks0) this.f22035b.get(c4350st0);
            if (!abstractC3437ks02.equals(abstractC3437ks0) || !abstractC3437ks0.equals(abstractC3437ks02)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c4350st0.toString()));
            }
        } else {
            this.f22035b.put(c4350st0, abstractC3437ks0);
        }
        return this;
    }

    public final C4123qt0 zzb(AbstractC3893os0 abstractC3893os0) throws GeneralSecurityException {
        C4578ut0 c4578ut0 = new C4578ut0(abstractC3893os0.zzc(), abstractC3893os0.zzd(), null);
        if (this.f22034a.containsKey(c4578ut0)) {
            AbstractC3893os0 abstractC3893os02 = (AbstractC3893os0) this.f22034a.get(c4578ut0);
            if (!abstractC3893os02.equals(abstractC3893os0) || !abstractC3893os0.equals(abstractC3893os02)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c4578ut0.toString()));
            }
        } else {
            this.f22034a.put(c4578ut0, abstractC3893os0);
        }
        return this;
    }

    public final C4123qt0 zzc(Os0 os0) throws GeneralSecurityException {
        C4350st0 c4350st0 = new C4350st0(os0.zzd(), os0.zzc(), null);
        if (this.f22037d.containsKey(c4350st0)) {
            Os0 os02 = (Os0) this.f22037d.get(c4350st0);
            if (!os02.equals(os0) || !os0.equals(os02)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c4350st0.toString()));
            }
        } else {
            this.f22037d.put(c4350st0, os0);
        }
        return this;
    }

    public final C4123qt0 zzd(Ss0 ss0) throws GeneralSecurityException {
        C4578ut0 c4578ut0 = new C4578ut0(ss0.zzc(), ss0.zzd(), null);
        if (this.f22036c.containsKey(c4578ut0)) {
            Ss0 ss02 = (Ss0) this.f22036c.get(c4578ut0);
            if (!ss02.equals(ss0) || !ss0.equals(ss02)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c4578ut0.toString()));
            }
        } else {
            this.f22036c.put(c4578ut0, ss0);
        }
        return this;
    }

    public C4123qt0(C4806wt0 c4806wt0) {
        this.f22034a = new HashMap(c4806wt0.f23552a);
        this.f22035b = new HashMap(c4806wt0.f23553b);
        this.f22036c = new HashMap(c4806wt0.f23554c);
        this.f22037d = new HashMap(c4806wt0.f23555d);
    }
}
