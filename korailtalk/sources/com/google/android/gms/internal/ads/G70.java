package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class G70 implements GD0 {
    public static Q50 zza(Context context, C2185Zs c2185Zs, C2294at c2294at, Object obj, C4036q60 c4036q60, C3468l70 c3468l70, AD0 ad0, AD0 ad02, AD0 ad03, AD0 ad04, AD0 ad05, AD0 ad06, AD0 ad07, AD0 ad08, AD0 ad09, Executor executor, RunnableC4660vd0 runnableC4660vd0, LQ lq) {
        HashSet hashSet = new HashSet();
        hashSet.add((C2667e70) obj);
        hashSet.add(c4036q60);
        hashSet.add(c3468l70);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfS)).booleanValue()) {
            hashSet.add((N50) ad0.zzb());
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfT)).booleanValue()) {
            hashSet.add((N50) ad02.zzb());
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfU)).booleanValue()) {
            hashSet.add((N50) ad03.zzb());
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfV)).booleanValue()) {
            hashSet.add((N50) ad04.zzb());
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfZ)).booleanValue()) {
            hashSet.add((N50) ad06.zzb());
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzga)).booleanValue()) {
            hashSet.add((N50) ad07.zzb());
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcQ)).booleanValue()) {
            hashSet.add((N50) ad09.zzb());
        }
        return new Q50(context, executor, hashSet, runnableC4660vd0, lq);
    }
}
