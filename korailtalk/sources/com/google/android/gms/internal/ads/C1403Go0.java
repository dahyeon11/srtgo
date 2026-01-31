package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Go0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1403Go0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f13198a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Mu0 f13199b = Mu0.zza;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13200c = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        Iterator it = this.f13198a.iterator();
        while (it.hasNext()) {
            ((C1321Eo0) it.next()).f12855a = false;
        }
    }

    public final C1403Go0 zza(C1321Eo0 c1321Eo0) {
        if (c1321Eo0.f12860f != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (c1321Eo0.f12855a) {
            b();
        }
        c1321Eo0.f12860f = this;
        this.f13198a.add(c1321Eo0);
        return this;
    }

    public final C1567Ko0 zzb() throws GeneralSecurityException {
        int i8;
        EnumC3901ow0 enumC3901ow0;
        if (this.f13200c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c9 = 1;
        this.f13200c = true;
        List list = this.f13198a;
        C4812ww0 c4812ww0Zzd = C5154zw0.zzd();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.f13198a;
        int i9 = 0;
        int i10 = 0;
        while (i10 < list2.size() - 1) {
            int i11 = i10 + 1;
            if (((C1321Eo0) list2.get(i10)).f12859e == C1362Fo0.f13071a && ((C1321Eo0) list2.get(i11)).f12859e != C1362Fo0.f13071a) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i10 = i11;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (C1321Eo0 c1321Eo0 : this.f13198a) {
            C1198Bo0 unused = c1321Eo0.f12856b;
            if (c1321Eo0.f12859e == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (c1321Eo0.f12859e == C1362Fo0.f13071a) {
                i8 = i9;
                while (true) {
                    if (i8 != 0 && !hashSet.contains(Integer.valueOf(i8))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i12 = i9;
                    while (i12 == 0) {
                        secureRandom.nextBytes(bArr);
                        i12 = ((bArr[i9] & 255) << 24) | ((bArr[c9] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i8 = i12;
                }
            } else {
                C1362Fo0 unused2 = c1321Eo0.f12859e;
                i8 = i9;
            }
            Integer numValueOf = Integer.valueOf(i8);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + i8 + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            C1321Eo0.a(c1321Eo0);
            C5138zo0 c5138zo0Zza = C5146zs0.zzb().zza(c1321Eo0.f12858d, c9 != c1321Eo0.f12858d.zza() ? null : numValueOf);
            C1485Io0 c1485Io0 = new C1485Io0(c5138zo0Zza, c1321Eo0.f12856b, i8, c1321Eo0.f12855a, null);
            C1198Bo0 c1198Bo0 = c1321Eo0.f12856b;
            C3439kt0 c3439kt0 = (C3439kt0) Js0.zzc().zzd(c5138zo0Zza, C3439kt0.class, C1976Uo0.a());
            Integer numZzf = c3439kt0.zzf();
            if (numZzf != null && numZzf.intValue() != i8) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            C1198Bo0 c1198Bo02 = C1198Bo0.zza;
            if (c1198Bo02.equals(c1198Bo0)) {
                enumC3901ow0 = EnumC3901ow0.ENABLED;
            } else if (C1198Bo0.zzb.equals(c1198Bo0)) {
                enumC3901ow0 = EnumC3901ow0.DISABLED;
            } else {
                if (!C1198Bo0.zzc.equals(c1198Bo0)) {
                    throw new IllegalStateException("Unknown key status");
                }
                enumC3901ow0 = EnumC3901ow0.DESTROYED;
            }
            C4926xw0 c4926xw0Zze = C5040yw0.zze();
            C3331jw0 c3331jw0Zza = C3673mw0.zza();
            c3331jw0Zza.zzb(c3439kt0.zzg());
            c3331jw0Zza.zzc(c3439kt0.zze());
            c3331jw0Zza.zza(c3439kt0.zzb());
            c4926xw0Zze.zza(c3331jw0Zza);
            c4926xw0Zze.zzd(enumC3901ow0);
            c4926xw0Zze.zzb(i8);
            c4926xw0Zze.zzc(c3439kt0.zzc());
            c4812ww0Zzd.zza((C5040yw0) c4926xw0Zze.zzbr());
            if (c1321Eo0.f12855a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (c1321Eo0.f12856b != c1198Bo02) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(c1485Io0);
            c9 = 1;
            i9 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        c4812ww0Zzd.zzb(num.intValue());
        C5154zw0 c5154zw0 = (C5154zw0) c4812ww0Zzd.zzbr();
        C1567Ko0.f(c5154zw0);
        return new C1567Ko0(c5154zw0, arrayList, this.f13199b, null);
    }
}
