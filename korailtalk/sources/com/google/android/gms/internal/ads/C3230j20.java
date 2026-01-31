package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.j20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3230j20 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f20175a;

    C3230j20(Set set) {
        this.f20175a = set;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.f20175a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return AbstractC1483In0.zzh(new M50() { // from class: com.google.android.gms.internal.ads.i20
            @Override // com.google.android.gms.internal.ads.M50
            public final void zzj(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
