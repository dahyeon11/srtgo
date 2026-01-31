package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5160zz0 extends Dz0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f24225c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ C5160zz0(AbstractC5046yz0 abstractC5046yz0) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List f(Object obj, long j8, int i8) {
        C4818wz0 c4818wz0;
        List list = (List) MA0.p(obj, j8);
        if (list.isEmpty()) {
            List c4818wz02 = list instanceof InterfaceC4932xz0 ? new C4818wz0(i8) : ((list instanceof Yz0) && (list instanceof InterfaceC3679mz0)) ? ((InterfaceC3679mz0) list).zzf(i8) : new ArrayList(i8);
            MA0.D(obj, j8, c4818wz02);
            return c4818wz02;
        }
        if (f24225c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i8);
            arrayList.addAll(list);
            MA0.D(obj, j8, arrayList);
            c4818wz0 = arrayList;
        } else {
            if (!(list instanceof GA0)) {
                if (!(list instanceof Yz0) || !(list instanceof InterfaceC3679mz0)) {
                    return list;
                }
                InterfaceC3679mz0 interfaceC3679mz0 = (InterfaceC3679mz0) list;
                if (interfaceC3679mz0.zzc()) {
                    return list;
                }
                InterfaceC3679mz0 interfaceC3679mz0Zzf = interfaceC3679mz0.zzf(list.size() + i8);
                MA0.D(obj, j8, interfaceC3679mz0Zzf);
                return interfaceC3679mz0Zzf;
            }
            C4818wz0 c4818wz03 = new C4818wz0(list.size() + i8);
            c4818wz03.addAll(c4818wz03.size(), (GA0) list);
            MA0.D(obj, j8, c4818wz03);
            c4818wz0 = c4818wz03;
        }
        return c4818wz0;
    }

    @Override // com.google.android.gms.internal.ads.Dz0
    final List a(Object obj, long j8) {
        return f(obj, j8, 10);
    }

    @Override // com.google.android.gms.internal.ads.Dz0
    final void b(Object obj, long j8) {
        Object objUnmodifiableList;
        List list = (List) MA0.p(obj, j8);
        if (list instanceof InterfaceC4932xz0) {
            objUnmodifiableList = ((InterfaceC4932xz0) list).zzd();
        } else {
            if (f24225c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof Yz0) && (list instanceof InterfaceC3679mz0)) {
                InterfaceC3679mz0 interfaceC3679mz0 = (InterfaceC3679mz0) list;
                if (interfaceC3679mz0.zzc()) {
                    interfaceC3679mz0.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        MA0.D(obj, j8, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.Dz0
    final void c(Object obj, Object obj2, long j8) {
        List list = (List) MA0.p(obj2, j8);
        List listF = f(obj, j8, list.size());
        int size = listF.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listF.addAll(list);
        }
        if (size > 0) {
            list = listF;
        }
        MA0.D(obj, j8, list);
    }
}
