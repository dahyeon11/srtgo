package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1511Jh {

    /* renamed from: a, reason: collision with root package name */
    private final List f13678a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Map f13679b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f13680c;

    public C1511Jh(boolean z8, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f13679b = linkedHashMap;
        this.f13680c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final C1388Gh zzf() {
        return new C1388Gh(G1.u.zzB().elapsedRealtime(), null, null);
    }

    public final C1470Ih zza() {
        C1470Ih c1470Ih;
        boolean zBooleanValue = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f13680c) {
            try {
                for (C1388Gh c1388Gh : this.f13678a) {
                    long jZza = c1388Gh.zza();
                    String strZzc = c1388Gh.zzc();
                    C1388Gh c1388GhZzb = c1388Gh.zzb();
                    if (c1388GhZzb != null && jZza > 0) {
                        long jZza2 = jZza - c1388GhZzb.zza();
                        sb.append(strZzc);
                        sb.append(Q7.C.PACKAGE_SEPARATOR_CHAR);
                        sb.append(jZza2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(c1388GhZzb.zza()))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(c1388GhZzb.zza()));
                                sb2.append('+');
                                sb2.append(strZzc);
                            } else {
                                map.put(Long.valueOf(c1388GhZzb.zza()), new StringBuilder(strZzc));
                            }
                        }
                    }
                }
                this.f13678a.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append(Q7.C.PACKAGE_SEPARATOR_CHAR);
                        sb3.append(G1.u.zzB().currentTimeMillis() + (((Long) entry.getKey()).longValue() - G1.u.zzB().elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                c1470Ih = new C1470Ih(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1470Ih;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.f13680c) {
            G1.u.zzo().zzg();
            map = this.f13679b;
        }
        return map;
    }

    public final void zzc(C1511Jh c1511Jh) {
        synchronized (this.f13680c) {
        }
    }

    public final void zzd(String str, String str2) {
        C5009yh c5009yhZzg;
        if (TextUtils.isEmpty(str2) || (c5009yhZzg = G1.u.zzo().zzg()) == null) {
            return;
        }
        synchronized (this.f13680c) {
            AbstractC1347Fh abstractC1347FhZza = c5009yhZzg.zza(str);
            Map map = this.f13679b;
            map.put(str, abstractC1347FhZza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(C1388Gh c1388Gh, long j8, String... strArr) {
        synchronized (this.f13680c) {
            this.f13678a.add(new C1388Gh(j8, strArr[0], c1388Gh));
        }
        return true;
    }
}
