package com.google.android.gms.internal.ads;

import Q7.C0709m;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class FQ {

    /* renamed from: a */
    private final ConcurrentHashMap f13019a;

    /* renamed from: b */
    private final C4122qt f13020b;

    /* renamed from: c */
    private final C1825Ra0 f13021c;

    /* renamed from: d */
    private final String f13022d;

    /* renamed from: e */
    private final String f13023e;

    /* renamed from: f */
    private final G1.j f13024f;

    /* renamed from: g */
    private final Bundle f13025g = new Bundle();

    /* renamed from: h */
    private final Context f13026h;

    public FQ(Context context, QQ qq, C4122qt c4122qt, C1825Ra0 c1825Ra0, String str, String str2, G1.j jVar) {
        ActivityManager.MemoryInfo memoryInfoZzc;
        ConcurrentHashMap concurrentHashMapZzc = qq.zzc();
        this.f13019a = concurrentHashMapZzc;
        this.f13020b = c4122qt;
        this.f13021c = c1825Ra0;
        this.f13022d = str;
        this.f13023e = str2;
        this.f13024f = jVar;
        this.f13026h = context;
        concurrentHashMapZzc.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjz)).booleanValue()) {
            int iZzj = jVar.zzj();
            int i8 = iZzj - 1;
            if (iZzj == 0) {
                throw null;
            }
            concurrentHashMapZzc.put("asv", i8 != 0 ? i8 != 1 ? "na" : "2" : "1");
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzc("rt_f", String.valueOf(runtime.freeMemory()));
            zzc("rt_m", String.valueOf(runtime.maxMemory()));
            zzc("rt_t", String.valueOf(runtime.totalMemory()));
            zzc("wv_c", String.valueOf(G1.u.zzo().zzb()));
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcf)).booleanValue() && (memoryInfoZzc = L1.g.zzc(context)) != null) {
                zzc("mem_avl", String.valueOf(memoryInfoZzc.availMem));
                zzc("mem_tt", String.valueOf(memoryInfoZzc.totalMem));
                zzc("low_m", true != memoryInfoZzc.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhj)).booleanValue()) {
            int iZzf = R1.W.zzf(c1825Ra0) - 1;
            if (iZzf == 0) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("scar", C0709m.FALSE);
                return;
            }
            if (iZzf == 1) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("se", "query_g");
            } else if (iZzf == 2) {
                concurrentHashMapZzc.put("se", "r_adinfo");
            } else if (iZzf != 3) {
                concurrentHashMapZzc.put("se", "r_both");
            } else {
                concurrentHashMapZzc.put("se", "r_adstring");
            }
            concurrentHashMapZzc.put("scar", C0709m.TRUE);
            zzc("ragent", c1825Ra0.zzd.zzp);
            zzc("rtype", R1.W.zzb(R1.W.zzc(c1825Ra0.zzd)));
        }
    }

    public final Bundle zza() {
        return this.f13025g;
    }

    public final Map zzb() {
        return this.f13019a;
    }

    public final void zzc(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f13019a.put(str, str2);
    }

    public final void zzd(C1457Ia0 c1457Ia0) {
        if (!c1457Ia0.zzb.zza.isEmpty()) {
            C4654va0 c4654va0 = (C4654va0) c1457Ia0.zzb.zza.get(0);
            zzc("ad_format", C4654va0.zza(c4654va0.zzb));
            if (c4654va0.zzb == 6) {
                this.f13019a.put("as", true != this.f13020b.zzm() ? "0" : "1");
            }
        }
        zzc("gqi", c1457Ia0.zzb.zzb.zzb);
    }

    public final void zze(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzc("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzc("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
