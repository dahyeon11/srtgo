package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ft0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2868ft0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f19267a;

    /* renamed from: d, reason: collision with root package name */
    private C3098ht0 f19270d;

    /* renamed from: b, reason: collision with root package name */
    private Map f19268b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final List f19269c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private Mu0 f19271e = Mu0.zza;

    /* synthetic */ C2868ft0(Class cls, AbstractC2753et0 abstractC2753et0) {
        this.f19267a = cls;
    }

    private final C2868ft0 a(Object obj, C5138zo0 c5138zo0, C5040yw0 c5040yw0, boolean z8) throws GeneralSecurityException {
        byte[] bArrZzc;
        if (this.f19268b == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (c5040yw0.zzd() != EnumC3901ow0.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Tw0 tw0 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = c5040yw0.zzg().ordinal();
        if (iOrdinal == 1) {
            bArrZzc = Ks0.zzb(c5040yw0.zza()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = Ks0.zza(c5040yw0.zza()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = Ks0.zza(c5040yw0.zza()).zzc();
        } else {
            bArrZzc = AbstractC4568uo0.zza;
        }
        C3098ht0 c3098ht0 = new C3098ht0(obj, Mx0.zzb(bArrZzc), c5040yw0.zzd(), c5040yw0.zzg(), c5040yw0.zza(), c5040yw0.zzc().zzg(), c5138zo0, null);
        Map map = this.f19268b;
        List list = this.f19269c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c3098ht0);
        List list2 = (List) map.put(c3098ht0.f19858b, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(c3098ht0);
            map.put(c3098ht0.f19858b, Collections.unmodifiableList(arrayList2));
        }
        list.add(c3098ht0);
        if (z8) {
            if (this.f19270d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f19270d = c3098ht0;
        }
        return this;
    }

    public final C2868ft0 zza(Object obj, C5138zo0 c5138zo0, C5040yw0 c5040yw0) {
        a(obj, c5138zo0, c5040yw0, false);
        return this;
    }

    public final C2868ft0 zzb(Object obj, C5138zo0 c5138zo0, C5040yw0 c5040yw0) {
        a(obj, c5138zo0, c5040yw0, true);
        return this;
    }

    public final C2868ft0 zzc(Mu0 mu0) {
        if (this.f19268b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.f19271e = mu0;
        return this;
    }

    public final C3325jt0 zzd() {
        Map map = this.f19268b;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        C3325jt0 c3325jt0 = new C3325jt0(map, this.f19269c, this.f19270d, this.f19271e, this.f19267a, null);
        this.f19268b = null;
        return c3325jt0;
    }
}
