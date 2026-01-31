package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5251u0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5251u0 f26805a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5251u0 f26806b;

    /* renamed from: com.google.protobuf.u0$b */
    private static final class b extends AbstractC5251u0 {

        /* renamed from: c, reason: collision with root package name */
        private static final Class f26807c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j8) {
            return (List) L1.H(obj, j8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static List g(Object obj, long j8, int i8) {
            C5247s0 c5247s0;
            List listF = f(obj, j8);
            if (listF.isEmpty()) {
                List c5247s02 = listF instanceof InterfaceC5249t0 ? new C5247s0(i8) : ((listF instanceof InterfaceC5195a1) && (listF instanceof AbstractC5227l0.i)) ? ((AbstractC5227l0.i) listF).mutableCopyWithCapacity(i8) : new ArrayList(i8);
                L1.Z(obj, j8, c5247s02);
                return c5247s02;
            }
            if (f26807c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i8);
                arrayList.addAll(listF);
                L1.Z(obj, j8, arrayList);
                c5247s0 = arrayList;
            } else {
                if (!(listF instanceof K1)) {
                    if (!(listF instanceof InterfaceC5195a1) || !(listF instanceof AbstractC5227l0.i)) {
                        return listF;
                    }
                    AbstractC5227l0.i iVar = (AbstractC5227l0.i) listF;
                    if (iVar.isModifiable()) {
                        return listF;
                    }
                    AbstractC5227l0.i iVarMutableCopyWithCapacity = iVar.mutableCopyWithCapacity(listF.size() + i8);
                    L1.Z(obj, j8, iVarMutableCopyWithCapacity);
                    return iVarMutableCopyWithCapacity;
                }
                C5247s0 c5247s03 = new C5247s0(listF.size() + i8);
                c5247s03.addAll((K1) listF);
                L1.Z(obj, j8, c5247s03);
                c5247s0 = c5247s03;
            }
            return c5247s0;
        }

        @Override // com.google.protobuf.AbstractC5251u0
        void c(Object obj, long j8) {
            Object objUnmodifiableList;
            List list = (List) L1.H(obj, j8);
            if (list instanceof InterfaceC5249t0) {
                objUnmodifiableList = ((InterfaceC5249t0) list).getUnmodifiableView();
            } else {
                if (f26807c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC5195a1) && (list instanceof AbstractC5227l0.i)) {
                    AbstractC5227l0.i iVar = (AbstractC5227l0.i) list;
                    if (iVar.isModifiable()) {
                        iVar.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            L1.Z(obj, j8, objUnmodifiableList);
        }

        @Override // com.google.protobuf.AbstractC5251u0
        void d(Object obj, Object obj2, long j8) {
            List listF = f(obj2, j8);
            List listG = g(obj, j8, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            L1.Z(obj, j8, listF);
        }

        @Override // com.google.protobuf.AbstractC5251u0
        List e(Object obj, long j8) {
            return g(obj, j8, 10);
        }
    }

    /* renamed from: com.google.protobuf.u0$c */
    private static final class c extends AbstractC5251u0 {
        private c() {
            super();
        }

        static AbstractC5227l0.i f(Object obj, long j8) {
            return (AbstractC5227l0.i) L1.H(obj, j8);
        }

        @Override // com.google.protobuf.AbstractC5251u0
        void c(Object obj, long j8) {
            f(obj, j8).makeImmutable();
        }

        @Override // com.google.protobuf.AbstractC5251u0
        void d(Object obj, Object obj2, long j8) {
            AbstractC5227l0.i iVarF = f(obj, j8);
            AbstractC5227l0.i iVarF2 = f(obj2, j8);
            int size = iVarF.size();
            int size2 = iVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!iVarF.isModifiable()) {
                    iVarF = iVarF.mutableCopyWithCapacity(size2 + size);
                }
                iVarF.addAll(iVarF2);
            }
            if (size > 0) {
                iVarF2 = iVarF;
            }
            L1.Z(obj, j8, iVarF2);
        }

        @Override // com.google.protobuf.AbstractC5251u0
        List e(Object obj, long j8) {
            AbstractC5227l0.i iVarF = f(obj, j8);
            if (iVarF.isModifiable()) {
                return iVarF;
            }
            int size = iVarF.size();
            AbstractC5227l0.i iVarMutableCopyWithCapacity = iVarF.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            L1.Z(obj, j8, iVarMutableCopyWithCapacity);
            return iVarMutableCopyWithCapacity;
        }
    }

    static {
        f26805a = new b();
        f26806b = new c();
    }

    static AbstractC5251u0 a() {
        return f26805a;
    }

    static AbstractC5251u0 b() {
        return f26806b;
    }

    abstract void c(Object obj, long j8);

    abstract void d(Object obj, Object obj2, long j8);

    abstract List e(Object obj, long j8);

    private AbstractC5251u0() {
    }
}
