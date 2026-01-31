package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2908gD implements InterfaceC3058hZ {
    public final List zza;

    public C2908gD(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3058hZ
    public final void zzq() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            AbstractC1483In0.zzr((com.google.common.util.concurrent.C) it.next(), new C2793fD(this), AbstractC2285ao0.zzb());
        }
    }

    public C2908gD(YC yc) {
        this.zza = Collections.singletonList(AbstractC1483In0.zzh(yc));
    }
}
