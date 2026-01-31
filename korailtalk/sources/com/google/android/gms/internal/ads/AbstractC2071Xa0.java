package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y1.C6528i;

/* renamed from: com.google.android.gms.internal.ads.Xa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2071Xa0 {
    public static H1.d2 zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4768wa0 c4768wa0 = (C4768wa0) it.next();
            if (c4768wa0.zzc) {
                arrayList.add(C6528i.FLUID);
            } else {
                arrayList.add(new C6528i(c4768wa0.zza, c4768wa0.zzb));
            }
        }
        return new H1.d2(context, (C6528i[]) arrayList.toArray(new C6528i[arrayList.size()]));
    }

    public static C4768wa0 zzb(H1.d2 d2Var) {
        return d2Var.zzi ? new C4768wa0(-3, 0, true) : new C4768wa0(d2Var.zze, d2Var.zzb, false);
    }
}
