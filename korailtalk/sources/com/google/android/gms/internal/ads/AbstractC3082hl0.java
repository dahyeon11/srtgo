package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.hl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3082hl0 {
    private static void a(List list, InterfaceC1229Cj0 interfaceC1229Cj0, int i8, int i9) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i9) {
                break;
            } else if (interfaceC1229Cj0.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i9--;
            if (i9 < i8) {
                return;
            } else {
                list.remove(i9);
            }
        }
    }

    private static boolean b(List list, InterfaceC1229Cj0 interfaceC1229Cj0) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < list.size()) {
            Object obj = list.get(i8);
            if (!interfaceC1229Cj0.zza(obj)) {
                if (i8 > i9) {
                    try {
                        list.set(i9, obj);
                    } catch (IllegalArgumentException unused) {
                        a(list, interfaceC1229Cj0, i9, i8);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        a(list, interfaceC1229Cj0, i9, i8);
                        return true;
                    }
                }
                i9++;
            }
            i8++;
        }
        list.subList(i9, list.size()).clear();
        return i8 != i9;
    }

    public static Object zza(Iterable iterable, Object obj) {
        C2093Xl0 c2093Xl0 = new C2093Xl0((C2134Yl0) iterable);
        return c2093Xl0.hasNext() ? c2093Xl0.next() : obj;
    }

    public static boolean zzb(Iterable iterable, InterfaceC1229Cj0 interfaceC1229Cj0) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            interfaceC1229Cj0.getClass();
            return b((List) iterable, interfaceC1229Cj0);
        }
        Iterator it = iterable.iterator();
        interfaceC1229Cj0.getClass();
        boolean z8 = false;
        while (it.hasNext()) {
            if (interfaceC1229Cj0.zza(it.next())) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }
}
