package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class V7 {
    public final int zza;
    public final byte[] zzb;
    public final Map zzc;
    public final List zzd;
    public final boolean zze;

    private V7(int i8, byte[] bArr, Map map, List list, boolean z8, long j8) {
        this.zza = i8;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : Collections.unmodifiableList(list);
        this.zze = z8;
    }

    private static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Q7((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public V7(int i8, byte[] bArr, Map map, boolean z8, long j8) {
        this(i8, bArr, map, a(map), z8, j8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public V7(int i8, byte[] bArr, boolean z8, long j8, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Q7 q72 = (Q7) it.next();
                treeMap.put(q72.zza(), q72.zzb());
            }
        }
        this(i8, bArr, treeMap, list, z8, j8);
    }

    @Deprecated
    public V7(byte[] bArr, Map map) {
        this(200, bArr, map, a(map), false, 0L);
    }
}
