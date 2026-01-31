package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.sf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4322sf0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1874Se0 f22679a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f22680b;

    public C4322sf0(C1874Se0 c1874Se0, String str) {
        ArrayList arrayList = new ArrayList();
        this.f22680b = arrayList;
        this.f22679a = c1874Se0;
        arrayList.add(str);
    }

    public final C1874Se0 zza() {
        return this.f22679a;
    }

    public final ArrayList zzb() {
        return this.f22680b;
    }

    public final void zzc(String str) {
        this.f22680b.add(str);
    }
}
