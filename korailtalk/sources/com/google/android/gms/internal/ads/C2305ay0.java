package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.ay0 */
/* loaded from: classes2.dex */
final class C2305ay0 implements Comparator {
    C2305ay0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC3677my0 abstractC3677my0 = (AbstractC3677my0) obj;
        AbstractC3677my0 abstractC3677my02 = (AbstractC3677my0) obj2;
        InterfaceC2648dy0 it = abstractC3677my0.iterator();
        InterfaceC2648dy0 it2 = abstractC3677my02.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC3677my0.zzd()).compareTo(Integer.valueOf(abstractC3677my02.zzd()));
    }
}
