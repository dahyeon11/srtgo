package com.google.android.gms.internal.ads;

import com.google.protobuf.AbstractC5200c0;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.nA0 */
/* loaded from: classes2.dex */
abstract class AbstractC3702nA0 {

    /* renamed from: a */
    private static final Class f21216a;

    /* renamed from: b */
    private static final BA0 f21217b;

    /* renamed from: c */
    private static final BA0 f21218c;
    public static final /* synthetic */ int zza = 0;

    static {
        Class<AbstractC5200c0> cls;
        Class<?> cls2;
        BA0 ba0 = null;
        try {
            cls = AbstractC5200c0.class;
            int i8 = AbstractC5200c0.f26381a;
        } catch (Throwable unused) {
            cls = null;
        }
        f21216a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.J1");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                ba0 = (BA0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f21217b = ba0;
        f21218c = new DA0();
    }

    static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int b(List list) {
        int iZzE;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2307az0) {
            C2307az0 c2307az0 = (C2307az0) list;
            iZzE = 0;
            while (i8 < size) {
                iZzE += Dy0.zzE(c2307az0.zzd(i8));
                i8++;
            }
        } else {
            iZzE = 0;
            while (i8 < size) {
                iZzE += Dy0.zzE(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iZzE;
    }

    static int c(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (Dy0.zzD(i8 << 3) + 4);
    }

    static int d(List list) {
        return list.size() * 4;
    }

    static int e(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (Dy0.zzD(i8 << 3) + 8);
    }

    static int f(List list) {
        return list.size() * 8;
    }

    static int g(List list) {
        int iZzE;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2307az0) {
            C2307az0 c2307az0 = (C2307az0) list;
            iZzE = 0;
            while (i8 < size) {
                iZzE += Dy0.zzE(c2307az0.zzd(i8));
                i8++;
            }
        } else {
            iZzE = 0;
            while (i8 < size) {
                iZzE += Dy0.zzE(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iZzE;
    }

    static int h(List list) {
        int iZzE;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ez0) {
            Ez0 ez0 = (Ez0) list;
            iZzE = 0;
            while (i8 < size) {
                iZzE += Dy0.zzE(ez0.zza(i8));
                i8++;
            }
        } else {
            iZzE = 0;
            while (i8 < size) {
                iZzE += Dy0.zzE(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return iZzE;
    }

    static int i(int i8, Object obj, InterfaceC3360kA0 interfaceC3360kA0) {
        int i9 = i8 << 3;
        if (!(obj instanceof C4704vz0)) {
            return Dy0.zzD(i9) + Dy0.a((Pz0) obj, interfaceC3360kA0);
        }
        int iZzD = Dy0.zzD(i9);
        int iZza = ((C4704vz0) obj).zza();
        return iZzD + Dy0.zzD(iZza) + iZza;
    }

    static int j(List list) {
        int iZzD;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2307az0) {
            C2307az0 c2307az0 = (C2307az0) list;
            iZzD = 0;
            while (i8 < size) {
                int iZzd = c2307az0.zzd(i8);
                iZzD += Dy0.zzD((iZzd >> 31) ^ (iZzd + iZzd));
                i8++;
            }
        } else {
            iZzD = 0;
            while (i8 < size) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                iZzD += Dy0.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i8++;
            }
        }
        return iZzD;
    }

    static int k(List list) {
        int iZzE;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ez0) {
            Ez0 ez0 = (Ez0) list;
            iZzE = 0;
            while (i8 < size) {
                long jZza = ez0.zza(i8);
                iZzE += Dy0.zzE((jZza >> 63) ^ (jZza + jZza));
                i8++;
            }
        } else {
            iZzE = 0;
            while (i8 < size) {
                long jLongValue = ((Long) list.get(i8)).longValue();
                iZzE += Dy0.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i8++;
            }
        }
        return iZzE;
    }

    static int l(List list) {
        int iZzD;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2307az0) {
            C2307az0 c2307az0 = (C2307az0) list;
            iZzD = 0;
            while (i8 < size) {
                iZzD += Dy0.zzD(c2307az0.zzd(i8));
                i8++;
            }
        } else {
            iZzD = 0;
            while (i8 < size) {
                iZzD += Dy0.zzD(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iZzD;
    }

    static int m(List list) {
        int iZzE;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ez0) {
            Ez0 ez0 = (Ez0) list;
            iZzE = 0;
            while (i8 < size) {
                iZzE += Dy0.zzE(ez0.zza(i8));
                i8++;
            }
        } else {
            iZzE = 0;
            while (i8 < size) {
                iZzE += Dy0.zzE(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return iZzE;
    }

    static Object n(Object obj, int i8, List list, InterfaceC2880fz0 interfaceC2880fz0, Object obj2, BA0 ba0) {
        if (interfaceC2880fz0 == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) list.get(i10);
                int iIntValue = num.intValue();
                if (interfaceC2880fz0.zza(iIntValue)) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    obj2 = o(obj, i8, iIntValue, obj2, ba0);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC2880fz0.zza(iIntValue2)) {
                    obj2 = o(obj, i8, iIntValue2, obj2, ba0);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object o(Object obj, int i8, int i9, Object obj2, BA0 ba0) {
        if (obj2 == null) {
            obj2 = ba0.c(obj);
        }
        ba0.l(obj2, i8, i9);
        return obj2;
    }

    static void p(Jy0 jy0, Object obj, Object obj2) {
        Oy0 oy0B = jy0.b(obj2);
        if (oy0B.f15178a.isEmpty()) {
            return;
        }
        jy0.c(obj).zzj(oy0B);
    }

    static void q(BA0 ba0, Object obj, Object obj2) {
        ba0.o(obj, ba0.e(ba0.d(obj), ba0.d(obj2)));
    }

    public static void zzA(int i8, List list, UA0 ua0, InterfaceC3360kA0 interfaceC3360kA0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Ey0) ua0).zzq(i8, list.get(i9), interfaceC3360kA0);
        }
    }

    public static void zzB(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzs(i8, list, z8);
    }

    public static void zzC(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzu(i8, list, z8);
    }

    public static void zzD(int i8, List list, UA0 ua0, InterfaceC3360kA0 interfaceC3360kA0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Ey0) ua0).zzv(i8, list.get(i9), interfaceC3360kA0);
        }
    }

    public static void zzE(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzy(i8, list, z8);
    }

    public static void zzF(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzA(i8, list, z8);
    }

    public static void zzG(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzC(i8, list, z8);
    }

    public static void zzH(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzE(i8, list, z8);
    }

    public static void zzI(int i8, List list, UA0 ua0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzH(i8, list);
    }

    public static void zzJ(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzJ(i8, list, z8);
    }

    public static void zzK(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzL(i8, list, z8);
    }

    public static BA0 zzm() {
        return f21217b;
    }

    public static BA0 zzn() {
        return f21218c;
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!Zy0.class.isAssignableFrom(cls) && (cls2 = f21216a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzc(i8, list, z8);
    }

    public static void zzu(int i8, List list, UA0 ua0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zze(i8, list);
    }

    public static void zzv(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzg(i8, list, z8);
    }

    public static void zzw(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzj(i8, list, z8);
    }

    public static void zzx(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzl(i8, list, z8);
    }

    public static void zzy(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzn(i8, list, z8);
    }

    public static void zzz(int i8, List list, UA0 ua0, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ua0.zzp(i8, list, z8);
    }
}
