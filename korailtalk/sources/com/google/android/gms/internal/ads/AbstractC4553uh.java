package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.uh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4553uh {
    static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, C2272ai.zzc("gad:dynamite_module:experiment_id", ""));
        c(arrayList, AbstractC3758ni.zza);
        c(arrayList, AbstractC3758ni.zzb);
        c(arrayList, AbstractC3758ni.zzc);
        c(arrayList, AbstractC3758ni.zzd);
        c(arrayList, AbstractC3758ni.zze);
        c(arrayList, AbstractC3758ni.zzu);
        c(arrayList, AbstractC3758ni.zzf);
        c(arrayList, AbstractC3758ni.zzm);
        c(arrayList, AbstractC3758ni.zzn);
        c(arrayList, AbstractC3758ni.zzo);
        c(arrayList, AbstractC3758ni.zzp);
        c(arrayList, AbstractC3758ni.zzq);
        c(arrayList, AbstractC3758ni.zzr);
        c(arrayList, AbstractC3758ni.zzs);
        c(arrayList, AbstractC3758ni.zzt);
        c(arrayList, AbstractC3758ni.zzg);
        c(arrayList, AbstractC3758ni.zzh);
        c(arrayList, AbstractC3758ni.zzi);
        c(arrayList, AbstractC3758ni.zzj);
        c(arrayList, AbstractC3758ni.zzk);
        c(arrayList, AbstractC3758ni.zzl);
        return arrayList;
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, AbstractC1185Bi.zza);
        return arrayList;
    }

    private static void c(List list, C2272ai c2272ai) {
        String str = (String) c2272ai.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
