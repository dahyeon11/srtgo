package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.eM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2696eM {
    public static final C2696eM zza = new C2696eM(new C2467cM());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1310Ej f18749a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1187Bj f18750b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1883Sj f18751c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1760Pj f18752d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4335sm f18753e;

    /* renamed from: f, reason: collision with root package name */
    private final O.h f18754f;

    /* renamed from: g, reason: collision with root package name */
    private final O.h f18755g;

    public final InterfaceC1187Bj zza() {
        return this.f18750b;
    }

    public final InterfaceC1310Ej zzb() {
        return this.f18749a;
    }

    public final InterfaceC1433Hj zzc(String str) {
        return (InterfaceC1433Hj) this.f18755g.get(str);
    }

    public final InterfaceC1597Lj zzd(String str) {
        return (InterfaceC1597Lj) this.f18754f.get(str);
    }

    public final InterfaceC1760Pj zze() {
        return this.f18752d;
    }

    public final InterfaceC1883Sj zzf() {
        return this.f18751c;
    }

    public final InterfaceC4335sm zzg() {
        return this.f18753e;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.f18754f.size());
        for (int i8 = 0; i8 < this.f18754f.size(); i8++) {
            arrayList.add((String) this.f18754f.keyAt(i8));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.f18751c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f18749a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f18750b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f18754f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f18753e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    private C2696eM(C2467cM c2467cM) {
        this.f18749a = c2467cM.f18291a;
        this.f18750b = c2467cM.f18292b;
        this.f18751c = c2467cM.f18293c;
        this.f18754f = new O.h(c2467cM.f18296f);
        this.f18755g = new O.h(c2467cM.f18297g);
        this.f18752d = c2467cM.f18294d;
        this.f18753e = c2467cM.f18295e;
    }
}
