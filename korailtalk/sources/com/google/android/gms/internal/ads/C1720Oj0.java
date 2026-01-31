package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Oj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1720Oj0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3533lj0 f15146a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1679Nj0 f15147b;

    private C1720Oj0(InterfaceC1679Nj0 interfaceC1679Nj0) {
        AbstractC3533lj0 abstractC3533lj0 = C3419kj0.f20456b;
        this.f15147b = interfaceC1679Nj0;
        this.f15146a = abstractC3533lj0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator c(CharSequence charSequence) {
        return this.f15147b.zza(this, charSequence);
    }

    public static C1720Oj0 zzb(int i8) {
        return new C1720Oj0(new C1557Kj0(4000));
    }

    public static C1720Oj0 zzc(AbstractC3533lj0 abstractC3533lj0) {
        return new C1720Oj0(new C1475Ij0(abstractC3533lj0));
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new C1598Lj0(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itC = c(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itC.hasNext()) {
            arrayList.add((String) itC.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
