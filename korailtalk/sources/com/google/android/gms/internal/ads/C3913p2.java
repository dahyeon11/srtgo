package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3913p2 extends AbstractC4140r2 {

    /* renamed from: b, reason: collision with root package name */
    private long f21624b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f21625c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f21626d;

    public C3913p2() {
        super(new C2311b1());
        this.f21624b = -9223372036854775807L;
        this.f21625c = new long[0];
        this.f21626d = new long[0];
    }

    private static Double c(C4099qh0 c4099qh0) {
        return Double.valueOf(Double.longBitsToDouble(c4099qh0.zzt()));
    }

    private static Object d(C4099qh0 c4099qh0, int i8) {
        if (i8 == 0) {
            return c(c4099qh0);
        }
        if (i8 == 1) {
            return Boolean.valueOf(c4099qh0.zzm() == 1);
        }
        if (i8 == 2) {
            return e(c4099qh0);
        }
        if (i8 != 3) {
            if (i8 == 8) {
                return f(c4099qh0);
            }
            if (i8 != 10) {
                if (i8 != 11) {
                    return null;
                }
                Date date = new Date((long) c(c4099qh0).doubleValue());
                c4099qh0.zzL(2);
                return date;
            }
            int iZzp = c4099qh0.zzp();
            ArrayList arrayList = new ArrayList(iZzp);
            for (int i9 = 0; i9 < iZzp; i9++) {
                Object objD = d(c4099qh0, c4099qh0.zzm());
                if (objD != null) {
                    arrayList.add(objD);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strE = e(c4099qh0);
            int iZzm = c4099qh0.zzm();
            if (iZzm == 9) {
                return map;
            }
            Object objD2 = d(c4099qh0, iZzm);
            if (objD2 != null) {
                map.put(strE, objD2);
            }
        }
    }

    private static String e(C4099qh0 c4099qh0) {
        int iZzq = c4099qh0.zzq();
        int iZzd = c4099qh0.zzd();
        c4099qh0.zzL(iZzq);
        return new String(c4099qh0.zzM(), iZzd, iZzq);
    }

    private static HashMap f(C4099qh0 c4099qh0) {
        int iZzp = c4099qh0.zzp();
        HashMap map = new HashMap(iZzp);
        for (int i8 = 0; i8 < iZzp; i8++) {
            String strE = e(c4099qh0);
            Object objD = d(c4099qh0, c4099qh0.zzm());
            if (objD != null) {
                map.put(strE, objD);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4140r2
    protected final boolean a(C4099qh0 c4099qh0) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4140r2
    protected final boolean b(C4099qh0 c4099qh0, long j8) {
        if (c4099qh0.zzm() == 2 && "onMetaData".equals(e(c4099qh0)) && c4099qh0.zzb() != 0 && c4099qh0.zzm() == 8) {
            HashMap mapF = f(c4099qh0);
            Object obj = mapF.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.f21624b = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapF.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f21625c = new long[size];
                    this.f21626d = new long[size];
                    for (int i8 = 0; i8 < size; i8++) {
                        Object obj5 = list.get(i8);
                        Object obj6 = list2.get(i8);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f21625c = new long[0];
                            this.f21626d = new long[0];
                            break;
                        }
                        this.f21625c[i8] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f21626d[i8] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.f21624b;
    }

    public final long[] zzd() {
        return this.f21626d;
    }

    public final long[] zze() {
        return this.f21625c;
    }
}
