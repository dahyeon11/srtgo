package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4111qn0 extends AbstractC4338sn0 {
    C4111qn0(AbstractC2009Vk0 abstractC2009Vk0, boolean z8) {
        super(abstractC2009Vk0, z8);
        N();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4338sn0
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList arrayListZza = AbstractC4220rl0.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4224rn0 c4224rn0 = (C4224rn0) it.next();
            arrayListZza.add(c4224rn0 != null ? c4224rn0.f22513a : null);
        }
        return Collections.unmodifiableList(arrayListZza);
    }
}
