package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4338sn0 extends AbstractC2971gn0 {

    /* renamed from: p, reason: collision with root package name */
    private List f22686p;

    AbstractC4338sn0(AbstractC2009Vk0 abstractC2009Vk0, boolean z8) {
        super(abstractC2009Vk0, z8, true);
        List listEmptyList = abstractC2009Vk0.isEmpty() ? Collections.emptyList() : AbstractC4220rl0.zza(abstractC2009Vk0.size());
        for (int i8 = 0; i8 < abstractC2009Vk0.size(); i8++) {
            listEmptyList.add(null);
        }
        this.f22686p = listEmptyList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2971gn0
    final void L(int i8, Object obj) {
        List list = this.f22686p;
        if (list != null) {
            list.set(i8, new C4224rn0(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2971gn0
    final void M() {
        List list = this.f22686p;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2971gn0
    final void Q(int i8) {
        super.Q(i8);
        this.f22686p = null;
    }

    abstract Object zzG(List list);
}
