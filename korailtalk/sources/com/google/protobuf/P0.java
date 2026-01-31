package com.google.protobuf;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.A0;
import com.google.protobuf.AbstractC5217i;
import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.P1;
import com.google.protobuf.R1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class P0 implements InterfaceC5219i1 {

    /* renamed from: r */
    private static final int[] f26245r = new int[0];

    /* renamed from: s */
    private static final Unsafe f26246s = L1.J();

    /* renamed from: a */
    private final int[] f26247a;

    /* renamed from: b */
    private final Object[] f26248b;

    /* renamed from: c */
    private final int f26249c;

    /* renamed from: d */
    private final int f26250d;

    /* renamed from: e */
    private final K0 f26251e;

    /* renamed from: f */
    private final boolean f26252f;

    /* renamed from: g */
    private final boolean f26253g;

    /* renamed from: h */
    private final boolean f26254h;

    /* renamed from: i */
    private final boolean f26255i;

    /* renamed from: j */
    private final int[] f26256j;

    /* renamed from: k */
    private final int f26257k;

    /* renamed from: l */
    private final int f26258l;

    /* renamed from: m */
    private final S0 f26259m;

    /* renamed from: n */
    private final AbstractC5251u0 f26260n;

    /* renamed from: o */
    private final F1 f26261o;

    /* renamed from: p */
    private final N f26262p;

    /* renamed from: q */
    private final D0 f26263q;

    private P0(int[] iArr, Object[] objArr, int i8, int i9, K0 k02, boolean z8, boolean z9, int[] iArr2, int i10, int i11, S0 s02, AbstractC5251u0 abstractC5251u0, F1 f12, N n8, D0 d02) {
        this.f26247a = iArr;
        this.f26248b = objArr;
        this.f26249c = i8;
        this.f26250d = i9;
        this.f26253g = k02 instanceof AbstractC5206e0;
        this.f26254h = z8;
        this.f26252f = n8 != null && n8.d(k02);
        this.f26255i = z9;
        this.f26256j = iArr2;
        this.f26257k = i10;
        this.f26258l = i11;
        this.f26259m = s02;
        this.f26260n = abstractC5251u0;
        this.f26261o = f12;
        this.f26262p = n8;
        this.f26251e = k02;
        this.f26263q = d02;
    }

    private static boolean A(int i8) {
        return (i8 & 268435456) != 0;
    }

    private static List B(Object obj, long j8) {
        return (List) L1.H(obj, j8);
    }

    private static long C(Object obj, long j8) {
        return L1.F(obj, j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:289:0x0094, code lost:
    
        r0 = r18.f26257k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0099, code lost:
    
        if (r0 >= r18.f26258l) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x009b, code lost:
    
        r4 = g(r21, r18.f26256j[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x00b1, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x00b2, code lost:
    
        if (r4 == null) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x00b4, code lost:
    
        r7.o(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x00b7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:419:0x064f A[Catch: all -> 0x0675, TRY_LEAVE, TryCatch #6 {all -> 0x0675, blocks: (B:417:0x0649, B:419:0x064f, B:431:0x0679, B:432:0x067e), top: B:459:0x0649 }] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x06b5 A[LOOP:4: B:445:0x06b1->B:447:0x06b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x06ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void D(com.google.protobuf.F1 r19, com.google.protobuf.N r20, java.lang.Object r21, com.google.protobuf.InterfaceC5210f1 r22, com.google.protobuf.M r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.P0.D(com.google.protobuf.F1, com.google.protobuf.N, java.lang.Object, com.google.protobuf.f1, com.google.protobuf.M):void");
    }

    private final void E(Object obj, int i8, Object obj2, M m8, InterfaceC5210f1 interfaceC5210f1) {
        long jN = N(m0(i8));
        Object objH = L1.H(obj, jN);
        if (objH == null) {
            objH = this.f26263q.newMapField(obj2);
            L1.Z(obj, jN, objH);
        } else if (this.f26263q.isImmutable(objH)) {
            Object objNewMapField = this.f26263q.newMapField(obj2);
            this.f26263q.mergeFrom(objNewMapField, objH);
            L1.Z(obj, jN, objNewMapField);
            objH = objNewMapField;
        }
        interfaceC5210f1.readMap(this.f26263q.forMutableMapData(objH), this.f26263q.forMapMetadata(obj2), m8);
    }

    private void F(Object obj, Object obj2, int i8) {
        if (s(obj2, i8)) {
            long jN = N(m0(i8));
            Unsafe unsafe = f26246s;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + M(i8) + " is present but null: " + obj2);
            }
            InterfaceC5219i1 interfaceC5219i1L = l(i8);
            if (!s(obj, i8)) {
                if (x(object)) {
                    Object objNewInstance = interfaceC5219i1L.newInstance();
                    interfaceC5219i1L.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jN, objNewInstance);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                f0(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!x(object2)) {
                Object objNewInstance2 = interfaceC5219i1L.newInstance();
                interfaceC5219i1L.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jN, objNewInstance2);
                object2 = objNewInstance2;
            }
            interfaceC5219i1L.mergeFrom(object2, object);
        }
    }

    private void G(Object obj, Object obj2, int i8) {
        int iM = M(i8);
        if (z(obj2, iM, i8)) {
            long jN = N(m0(i8));
            Unsafe unsafe = f26246s;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + M(i8) + " is present but null: " + obj2);
            }
            InterfaceC5219i1 interfaceC5219i1L = l(i8);
            if (!z(obj, iM, i8)) {
                if (x(object)) {
                    Object objNewInstance = interfaceC5219i1L.newInstance();
                    interfaceC5219i1L.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jN, objNewInstance);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                g0(obj, iM, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!x(object2)) {
                Object objNewInstance2 = interfaceC5219i1L.newInstance();
                interfaceC5219i1L.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jN, objNewInstance2);
                object2 = objNewInstance2;
            }
            interfaceC5219i1L.mergeFrom(object2, object);
        }
    }

    private void H(Object obj, Object obj2, int i8) {
        int iM0 = m0(i8);
        long jN = N(iM0);
        int iM = M(i8);
        switch (l0(iM0)) {
            case 0:
                if (s(obj2, i8)) {
                    L1.V(obj, jN, L1.B(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 1:
                if (s(obj2, i8)) {
                    L1.W(obj, jN, L1.C(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 2:
                if (s(obj2, i8)) {
                    L1.Y(obj, jN, L1.F(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 3:
                if (s(obj2, i8)) {
                    L1.Y(obj, jN, L1.F(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 4:
                if (s(obj2, i8)) {
                    L1.X(obj, jN, L1.D(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 5:
                if (s(obj2, i8)) {
                    L1.Y(obj, jN, L1.F(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 6:
                if (s(obj2, i8)) {
                    L1.X(obj, jN, L1.D(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 7:
                if (s(obj2, i8)) {
                    L1.O(obj, jN, L1.u(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 8:
                if (s(obj2, i8)) {
                    L1.Z(obj, jN, L1.H(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 9:
                F(obj, obj2, i8);
                break;
            case 10:
                if (s(obj2, i8)) {
                    L1.Z(obj, jN, L1.H(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 11:
                if (s(obj2, i8)) {
                    L1.X(obj, jN, L1.D(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 12:
                if (s(obj2, i8)) {
                    L1.X(obj, jN, L1.D(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 13:
                if (s(obj2, i8)) {
                    L1.X(obj, jN, L1.D(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 14:
                if (s(obj2, i8)) {
                    L1.Y(obj, jN, L1.F(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 15:
                if (s(obj2, i8)) {
                    L1.X(obj, jN, L1.D(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 16:
                if (s(obj2, i8)) {
                    L1.Y(obj, jN, L1.F(obj2, jN));
                    f0(obj, i8);
                    break;
                }
                break;
            case 17:
                F(obj, obj2, i8);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
            case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                this.f26260n.d(obj, obj2, jN);
                break;
            case 50:
                AbstractC5225k1.G(this.f26263q, obj, obj2, jN);
                break;
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
            case 52:
            case 53:
            case 54:
            case s4.z.PUSH_TYPE_DEPARTURE /* 55 */:
            case 56:
            case 57:
            case 58:
            case 59:
                if (z(obj2, iM, i8)) {
                    L1.Z(obj, jN, L1.H(obj2, jN));
                    g0(obj, iM, i8);
                    break;
                }
                break;
            case s7.x.FROZEN_SHIFT /* 60 */:
                G(obj, obj2, i8);
                break;
            case s7.x.CLOSED_SHIFT /* 61 */:
            case 62:
            case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
            case 64:
            case 65:
            case 66:
            case 67:
                if (z(obj2, iM, i8)) {
                    L1.Z(obj, jN, L1.H(obj2, jN));
                    g0(obj, iM, i8);
                    break;
                }
                break;
            case 68:
                G(obj, obj2, i8);
                break;
        }
    }

    private Object I(Object obj, int i8) {
        InterfaceC5219i1 interfaceC5219i1L = l(i8);
        long jN = N(m0(i8));
        if (!s(obj, i8)) {
            return interfaceC5219i1L.newInstance();
        }
        Object object = f26246s.getObject(obj, jN);
        if (x(object)) {
            return object;
        }
        Object objNewInstance = interfaceC5219i1L.newInstance();
        if (object != null) {
            interfaceC5219i1L.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private Object J(Object obj, int i8, int i9) {
        InterfaceC5219i1 interfaceC5219i1L = l(i9);
        if (!z(obj, i8, i9)) {
            return interfaceC5219i1L.newInstance();
        }
        Object object = f26246s.getObject(obj, N(m0(i9)));
        if (x(object)) {
            return object;
        }
        Object objNewInstance = interfaceC5219i1L.newInstance();
        if (object != null) {
            interfaceC5219i1L.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    static P0 K(Class cls, I0 i02, S0 s02, AbstractC5251u0 abstractC5251u0, F1 f12, N n8, D0 d02) {
        return L((s1) i02, s02, abstractC5251u0, f12, n8, d02);
    }

    static P0 L(s1 s1Var, S0 s02, AbstractC5251u0 abstractC5251u0, F1 f12, N n8, D0 d02) {
        int fieldNumber;
        int fieldNumber2;
        int i8;
        boolean z8 = s1Var.getSyntax() == EnumC5198b1.PROTO3;
        S[] fields = s1Var.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i9 = 0;
        int i10 = 0;
        for (S s8 : fields) {
            if (s8.getType() == X.MAP) {
                i9++;
            } else if (s8.getType().id() >= 18 && s8.getType().id() <= 49) {
                i10++;
            }
        }
        int[] iArr2 = i9 > 0 ? new int[i9] : null;
        int[] iArr3 = i10 > 0 ? new int[i10] : null;
        int[] checkInitialized = s1Var.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = f26245r;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i11 < fields.length) {
            S s9 = fields[i11];
            int fieldNumber3 = s9.getFieldNumber();
            i0(s9, iArr, i12, objArr);
            if (i13 < checkInitialized.length && checkInitialized[i13] == fieldNumber3) {
                checkInitialized[i13] = i12;
                i13++;
            }
            if (s9.getType() == X.MAP) {
                iArr2[i14] = i12;
                i14++;
            } else {
                if (s9.getType().id() >= 18 && s9.getType().id() <= 49) {
                    i8 = i12;
                    iArr3[i15] = (int) L1.N(s9.getField());
                    i15++;
                }
                i11++;
                i12 = i8 + 3;
            }
            i8 = i12;
            i11++;
            i12 = i8 + 3;
        }
        if (iArr2 == null) {
            iArr2 = f26245r;
        }
        if (iArr3 == null) {
            iArr3 = f26245r;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new P0(iArr, objArr, fieldNumber, fieldNumber2, s1Var.getDefaultInstance(), z8, true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, s02, abstractC5251u0, f12, n8, d02);
    }

    private int M(int i8) {
        return this.f26247a[i8];
    }

    private static long N(int i8) {
        return i8 & 1048575;
    }

    private static boolean O(Object obj, long j8) {
        return ((Boolean) L1.H(obj, j8)).booleanValue();
    }

    private static double P(Object obj, long j8) {
        return ((Double) L1.H(obj, j8)).doubleValue();
    }

    private static float Q(Object obj, long j8) {
        return ((Float) L1.H(obj, j8)).floatValue();
    }

    private static int R(Object obj, long j8) {
        return ((Integer) L1.H(obj, j8)).intValue();
    }

    private static long S(Object obj, long j8) {
        return ((Long) L1.H(obj, j8)).longValue();
    }

    private int T(Object obj, byte[] bArr, int i8, int i9, int i10, long j8, AbstractC5217i.a aVar) {
        Unsafe unsafe = f26246s;
        Object objK = k(i10);
        Object object = unsafe.getObject(obj, j8);
        if (this.f26263q.isImmutable(object)) {
            Object objNewMapField = this.f26263q.newMapField(objK);
            this.f26263q.mergeFrom(objNewMapField, object);
            unsafe.putObject(obj, j8, objNewMapField);
            object = objNewMapField;
        }
        return d(bArr, i8, i9, this.f26263q.forMapMetadata(objK), this.f26263q.forMutableMapData(object), aVar);
    }

    private int U(Object obj, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j8, int i15, AbstractC5217i.a aVar) {
        Unsafe unsafe = f26246s;
        long j9 = this.f26247a[i15 + 2] & 1048575;
        switch (i14) {
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
                if (i12 == 1) {
                    unsafe.putObject(obj, j8, Double.valueOf(AbstractC5217i.d(bArr, i8)));
                    int i16 = i8 + 8;
                    unsafe.putInt(obj, j9, i11);
                    return i16;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj, j8, Float.valueOf(AbstractC5217i.j(bArr, i8)));
                    int i17 = i8 + 4;
                    unsafe.putInt(obj, j9, i11);
                    return i17;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    AbstractC5217i.J(bArr, i8, aVar);
                    throw null;
                }
                break;
            case s4.z.PUSH_TYPE_DEPARTURE /* 55 */:
            case 62:
                if (i12 == 0) {
                    AbstractC5217i.G(bArr, i8, aVar);
                    throw null;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj, j8, Long.valueOf(AbstractC5217i.h(bArr, i8)));
                    int i18 = i8 + 8;
                    unsafe.putInt(obj, j9, i11);
                    return i18;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj, j8, Integer.valueOf(AbstractC5217i.f(bArr, i8)));
                    int i19 = i8 + 4;
                    unsafe.putInt(obj, j9, i11);
                    return i19;
                }
                break;
            case 58:
                if (i12 == 0) {
                    AbstractC5217i.J(bArr, i8, aVar);
                    throw null;
                }
                break;
            case 59:
                if (i12 == 2) {
                    AbstractC5217i.G(bArr, i8, aVar);
                    throw null;
                }
                break;
            case s7.x.FROZEN_SHIFT /* 60 */:
                if (i12 == 2) {
                    Object objJ = J(obj, i11, i15);
                    int iM = AbstractC5217i.M(objJ, l(i15), bArr, i8, i9, aVar);
                    k0(obj, i11, i15, objJ);
                    return iM;
                }
                break;
            case s7.x.CLOSED_SHIFT /* 61 */:
                if (i12 == 2) {
                    AbstractC5217i.b(bArr, i8, aVar);
                    throw null;
                }
                break;
            case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
                if (i12 == 0) {
                    AbstractC5217i.G(bArr, i8, aVar);
                    throw null;
                }
                break;
            case 66:
                if (i12 == 0) {
                    AbstractC5217i.G(bArr, i8, aVar);
                    throw null;
                }
                break;
            case 67:
                if (i12 == 0) {
                    AbstractC5217i.J(bArr, i8, aVar);
                    throw null;
                }
                break;
            case 68:
                if (i12 == 3) {
                    Object objJ2 = J(obj, i11, i15);
                    int iL = AbstractC5217i.L(objJ2, l(i15), bArr, i8, i9, (i10 & (-8)) | 4, aVar);
                    k0(obj, i11, i15, objJ2);
                    return iL;
                }
                break;
        }
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x01cf, code lost:
    
        if (r6 != r4) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x01d1, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r8 = r18;
        r0 = r19;
        r1 = r20;
        r5 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x01e9, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0216, code lost:
    
        if (r6 != r15) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0235, code lost:
    
        if (r6 != r15) goto L273;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int W(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.protobuf.AbstractC5217i.a r34) throws com.google.protobuf.C5230m0 {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.P0.W(java.lang.Object, byte[], int, int, com.google.protobuf.i$a):int");
    }

    private int X(Object obj, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, long j8, int i14, long j9, AbstractC5217i.a aVar) {
        int iH;
        Unsafe unsafe = f26246s;
        AbstractC5227l0.i iVarMutableCopyWithCapacity = (AbstractC5227l0.i) unsafe.getObject(obj, j9);
        if (!iVarMutableCopyWithCapacity.isModifiable()) {
            int size = iVarMutableCopyWithCapacity.size();
            iVarMutableCopyWithCapacity = iVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j9, iVarMutableCopyWithCapacity);
        }
        switch (i14) {
            case 18:
            case 35:
                if (i12 == 2) {
                    return AbstractC5217i.q(bArr, i8, iVarMutableCopyWithCapacity, aVar);
                }
                if (i12 == 1) {
                    return AbstractC5217i.e(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case 19:
            case 36:
                if (i12 == 2) {
                    return AbstractC5217i.t(bArr, i8, iVarMutableCopyWithCapacity, aVar);
                }
                if (i12 == 5) {
                    return AbstractC5217i.k(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i12 == 2) {
                    return AbstractC5217i.x(bArr, i8, iVarMutableCopyWithCapacity, aVar);
                }
                if (i12 == 0) {
                    return AbstractC5217i.K(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case 22:
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
            case 39:
            case 43:
                if (i12 == 2) {
                    return AbstractC5217i.w(bArr, i8, iVarMutableCopyWithCapacity, aVar);
                }
                if (i12 == 0) {
                    return AbstractC5217i.H(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i12 == 2) {
                    return AbstractC5217i.s(bArr, i8, iVarMutableCopyWithCapacity, aVar);
                }
                if (i12 == 1) {
                    return AbstractC5217i.i(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i12 == 2) {
                    return AbstractC5217i.r(bArr, i8, iVarMutableCopyWithCapacity, aVar);
                }
                if (i12 == 5) {
                    return AbstractC5217i.g(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case 25:
            case 42:
                if (i12 == 2) {
                    return AbstractC5217i.p(bArr, i8, iVarMutableCopyWithCapacity, aVar);
                }
                if (i12 == 0) {
                    return AbstractC5217i.a(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case 26:
                if (i12 == 2) {
                    return (j8 & 536870912) == 0 ? AbstractC5217i.B(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar) : AbstractC5217i.C(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case 27:
                if (i12 == 2) {
                    return AbstractC5217i.o(l(i13), i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case 28:
                if (i12 == 2) {
                    return AbstractC5217i.c(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case 30:
            case 44:
                if (i12 == 2) {
                    iH = AbstractC5217i.w(bArr, i8, iVarMutableCopyWithCapacity, aVar);
                } else if (i12 == 0) {
                    iH = AbstractC5217i.H(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                AbstractC5225k1.A(obj, i11, iVarMutableCopyWithCapacity, j(i13), null, this.f26261o);
                return iH;
            case 33:
            case 47:
                if (i12 == 2) {
                    return AbstractC5217i.u(bArr, i8, iVarMutableCopyWithCapacity, aVar);
                }
                if (i12 == 0) {
                    return AbstractC5217i.y(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case 34:
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                if (i12 == 2) {
                    return AbstractC5217i.v(bArr, i8, iVarMutableCopyWithCapacity, aVar);
                }
                if (i12 == 0) {
                    return AbstractC5217i.z(i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
            case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                if (i12 == 3) {
                    return AbstractC5217i.m(l(i13), i10, bArr, i8, i9, iVarMutableCopyWithCapacity, aVar);
                }
                break;
        }
        return i8;
    }

    private int Y(int i8) {
        if (i8 < this.f26249c || i8 > this.f26250d) {
            return -1;
        }
        return h0(i8, 0);
    }

    private int Z(int i8, int i9) {
        if (i8 < this.f26249c || i8 > this.f26250d) {
            return -1;
        }
        return h0(i8, i9);
    }

    private boolean a(Object obj, Object obj2, int i8) {
        return s(obj, i8) == s(obj2, i8);
    }

    private int a0(int i8) {
        return this.f26247a[i8 + 2];
    }

    private static boolean b(Object obj, long j8) {
        return L1.u(obj, j8);
    }

    private void b0(Object obj, long j8, InterfaceC5210f1 interfaceC5210f1, InterfaceC5219i1 interfaceC5219i1, M m8) {
        interfaceC5210f1.readGroupList(this.f26260n.e(obj, j8), interfaceC5219i1, m8);
    }

    private static void c(Object obj) {
        if (x(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private void c0(Object obj, int i8, InterfaceC5210f1 interfaceC5210f1, InterfaceC5219i1 interfaceC5219i1, M m8) {
        interfaceC5210f1.readMessageList(this.f26260n.e(obj, N(i8)), interfaceC5219i1, m8);
    }

    private int d(byte[] bArr, int i8, int i9, A0.b bVar, Map map, AbstractC5217i.a aVar) {
        AbstractC5217i.G(bArr, i8, aVar);
        throw null;
    }

    private void d0(Object obj, int i8, InterfaceC5210f1 interfaceC5210f1) {
        if (r(i8)) {
            L1.Z(obj, N(i8), interfaceC5210f1.readStringRequireUtf8());
        } else if (this.f26253g) {
            L1.Z(obj, N(i8), interfaceC5210f1.readString());
        } else {
            L1.Z(obj, N(i8), interfaceC5210f1.readBytes());
        }
    }

    private static double e(Object obj, long j8) {
        return L1.B(obj, j8);
    }

    private void e0(Object obj, int i8, InterfaceC5210f1 interfaceC5210f1) {
        if (r(i8)) {
            interfaceC5210f1.readStringListRequireUtf8(this.f26260n.e(obj, N(i8)));
        } else {
            interfaceC5210f1.readStringList(this.f26260n.e(obj, N(i8)));
        }
    }

    private boolean f(Object obj, Object obj2, int i8) {
        int iM0 = m0(i8);
        long jN = N(iM0);
        switch (l0(iM0)) {
            case 0:
                if (a(obj, obj2, i8) && Double.doubleToLongBits(L1.B(obj, jN)) == Double.doubleToLongBits(L1.B(obj2, jN))) {
                    break;
                }
                break;
            case 1:
                if (a(obj, obj2, i8) && Float.floatToIntBits(L1.C(obj, jN)) == Float.floatToIntBits(L1.C(obj2, jN))) {
                    break;
                }
                break;
            case 2:
                if (a(obj, obj2, i8) && L1.F(obj, jN) == L1.F(obj2, jN)) {
                    break;
                }
                break;
            case 3:
                if (a(obj, obj2, i8) && L1.F(obj, jN) == L1.F(obj2, jN)) {
                    break;
                }
                break;
            case 4:
                if (a(obj, obj2, i8) && L1.D(obj, jN) == L1.D(obj2, jN)) {
                    break;
                }
                break;
            case 5:
                if (a(obj, obj2, i8) && L1.F(obj, jN) == L1.F(obj2, jN)) {
                    break;
                }
                break;
            case 6:
                if (a(obj, obj2, i8) && L1.D(obj, jN) == L1.D(obj2, jN)) {
                    break;
                }
                break;
            case 7:
                if (a(obj, obj2, i8) && L1.u(obj, jN) == L1.u(obj2, jN)) {
                    break;
                }
                break;
            case 8:
                if (a(obj, obj2, i8) && AbstractC5225k1.I(L1.H(obj, jN), L1.H(obj2, jN))) {
                    break;
                }
                break;
            case 9:
                if (a(obj, obj2, i8) && AbstractC5225k1.I(L1.H(obj, jN), L1.H(obj2, jN))) {
                    break;
                }
                break;
            case 10:
                if (a(obj, obj2, i8) && AbstractC5225k1.I(L1.H(obj, jN), L1.H(obj2, jN))) {
                    break;
                }
                break;
            case 11:
                if (a(obj, obj2, i8) && L1.D(obj, jN) == L1.D(obj2, jN)) {
                    break;
                }
                break;
            case 12:
                if (a(obj, obj2, i8) && L1.D(obj, jN) == L1.D(obj2, jN)) {
                    break;
                }
                break;
            case 13:
                if (a(obj, obj2, i8) && L1.D(obj, jN) == L1.D(obj2, jN)) {
                    break;
                }
                break;
            case 14:
                if (a(obj, obj2, i8) && L1.F(obj, jN) == L1.F(obj2, jN)) {
                    break;
                }
                break;
            case 15:
                if (a(obj, obj2, i8) && L1.D(obj, jN) == L1.D(obj2, jN)) {
                    break;
                }
                break;
            case 16:
                if (a(obj, obj2, i8) && L1.F(obj, jN) == L1.F(obj2, jN)) {
                    break;
                }
                break;
            case 17:
                if (a(obj, obj2, i8) && AbstractC5225k1.I(L1.H(obj, jN), L1.H(obj2, jN))) {
                    break;
                }
                break;
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
            case 52:
            case 53:
            case 54:
            case s4.z.PUSH_TYPE_DEPARTURE /* 55 */:
            case 56:
            case 57:
            case 58:
            case 59:
            case s7.x.FROZEN_SHIFT /* 60 */:
            case s7.x.CLOSED_SHIFT /* 61 */:
            case 62:
            case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (y(obj, obj2, i8) && AbstractC5225k1.I(L1.H(obj, jN), L1.H(obj2, jN))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void f0(Object obj, int i8) {
        int iA0 = a0(i8);
        long j8 = 1048575 & iA0;
        if (j8 == 1048575) {
            return;
        }
        L1.X(obj, j8, (1 << (iA0 >>> 20)) | L1.D(obj, j8));
    }

    private Object g(Object obj, int i8, Object obj2, F1 f12, Object obj3) {
        AbstractC5227l0.e eVarJ;
        int iM = M(i8);
        Object objH = L1.H(obj, N(m0(i8)));
        return (objH == null || (eVarJ = j(i8)) == null) ? obj2 : h(i8, iM, this.f26263q.forMutableMapData(objH), eVarJ, obj2, f12, obj3);
    }

    private void g0(Object obj, int i8, int i9) {
        L1.X(obj, a0(i9) & 1048575, i8);
    }

    private Object h(int i8, int i9, Map map, AbstractC5227l0.e eVar, Object obj, F1 f12, Object obj2) {
        A0.b bVarForMapMetadata = this.f26263q.forMapMetadata(k(i8));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!eVar.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = f12.f(obj2);
                }
                AbstractC5235o.h hVarJ = AbstractC5235o.j(A0.a(bVarForMapMetadata, entry.getKey(), entry.getValue()));
                try {
                    A0.e(hVarJ.getCodedOutput(), bVarForMapMetadata, entry.getKey(), entry.getValue());
                    f12.d(obj, i9, hVarJ.build());
                    it.remove();
                } catch (IOException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
        return obj;
    }

    private int h0(int i8, int i9) {
        int length = (this.f26247a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int iM = M(i11);
            if (i8 == iM) {
                return i11;
            }
            if (i8 < iM) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    private static float i(Object obj, long j8) {
        return L1.C(obj, j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i0(com.google.protobuf.S r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.Y0 r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.protobuf.X r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.protobuf.L1.N(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.protobuf.L1.N(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            com.google.protobuf.X r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.protobuf.L1.N(r2)
            int r3 = (int) r2
            int r2 = r0.id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r4 = com.google.protobuf.L1.N(r0)
            int r0 = (int) r4
        L51:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6c
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L63
            r0 = r1
            r4 = r0
            goto L6c
        L63:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = com.google.protobuf.L1.N(r0)
            goto L22
        L6c:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L86
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L86:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbe
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Laf
            int r10 = r10 + 1
            r11[r10] = r9
            goto Ldb
        Laf:
            com.google.protobuf.l0$e r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            com.google.protobuf.l0$e r8 = r8.getEnumVerifier()
            r11[r10] = r8
            goto Ldb
        Lbe:
            if (r9 == 0) goto Lc9
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            goto Ldb
        Lc9:
            com.google.protobuf.l0$e r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.l0$e r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.P0.i0(com.google.protobuf.S, int[], int, java.lang.Object[]):void");
    }

    private AbstractC5227l0.e j(int i8) {
        return (AbstractC5227l0.e) this.f26248b[((i8 / 3) * 2) + 1];
    }

    private void j0(Object obj, int i8, Object obj2) {
        f26246s.putObject(obj, N(m0(i8)), obj2);
        f0(obj, i8);
    }

    private Object k(int i8) {
        return this.f26248b[(i8 / 3) * 2];
    }

    private void k0(Object obj, int i8, int i9, Object obj2) {
        f26246s.putObject(obj, N(m0(i9)), obj2);
        g0(obj, i8, i9);
    }

    private InterfaceC5219i1 l(int i8) {
        int i9 = (i8 / 3) * 2;
        InterfaceC5219i1 interfaceC5219i1 = (InterfaceC5219i1) this.f26248b[i9];
        if (interfaceC5219i1 != null) {
            return interfaceC5219i1;
        }
        InterfaceC5219i1 interfaceC5219i1SchemaFor = C5201c1.getInstance().schemaFor((Class) this.f26248b[i9 + 1]);
        this.f26248b[i9] = interfaceC5219i1SchemaFor;
        return interfaceC5219i1SchemaFor;
    }

    private static int l0(int i8) {
        return (i8 & 267386880) >>> 20;
    }

    static H1 m(Object obj) {
        AbstractC5206e0 abstractC5206e0 = (AbstractC5206e0) obj;
        H1 h12 = abstractC5206e0.f26409b;
        if (h12 != H1.getDefaultInstance()) {
            return h12;
        }
        H1 h1G = H1.g();
        abstractC5206e0.f26409b = h1G;
        return h1G;
    }

    private int m0(int i8) {
        return this.f26247a[i8 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int n(Object obj) {
        int i8;
        int i9;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeSFixed32Size;
        boolean z8;
        int iF;
        int i10;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = f26246s;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < this.f26247a.length) {
            int iM0 = m0(i13);
            int iM = M(i13);
            int iL0 = l0(iM0);
            if (iL0 <= 17) {
                i8 = this.f26247a[i13 + 2];
                int i16 = i8 & i11;
                i9 = 1 << (i8 >>> 20);
                if (i16 != i12) {
                    i15 = unsafe.getInt(obj, i16);
                    i12 = i16;
                }
            } else {
                i8 = (!this.f26255i || iL0 < X.DOUBLE_LIST_PACKED.id() || iL0 > X.SINT64_LIST_PACKED.id()) ? 0 : this.f26247a[i13 + 2] & i11;
                i9 = 0;
            }
            long jN = N(iM0);
            switch (iL0) {
                case 0:
                    if ((i15 & i9) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC5248t.computeDoubleSize(iM, 0.0d);
                        i14 += iComputeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i15 & i9) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC5248t.computeFloatSize(iM, 0.0f);
                        i14 += iComputeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i15 & i9) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC5248t.computeInt64Size(iM, unsafe.getLong(obj, jN));
                        i14 += iComputeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i15 & i9) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC5248t.computeUInt64Size(iM, unsafe.getLong(obj, jN));
                        i14 += iComputeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i15 & i9) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC5248t.computeInt32Size(iM, unsafe.getInt(obj, jN));
                        i14 += iComputeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i15 & i9) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC5248t.computeFixed64Size(iM, 0L);
                        i14 += iComputeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i15 & i9) != 0) {
                        iComputeDoubleSize = AbstractC5248t.computeFixed32Size(iM, 0);
                        i14 += iComputeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i15 & i9) != 0) {
                        iComputeBoolSize = AbstractC5248t.computeBoolSize(iM, true);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if ((i15 & i9) != 0) {
                        Object object = unsafe.getObject(obj, jN);
                        iComputeBoolSize = object instanceof AbstractC5235o ? AbstractC5248t.computeBytesSize(iM, (AbstractC5235o) object) : AbstractC5248t.computeStringSize(iM, (String) object);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 9:
                    if ((i15 & i9) != 0) {
                        iComputeBoolSize = AbstractC5225k1.o(iM, unsafe.getObject(obj, jN), l(i13));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if ((i15 & i9) != 0) {
                        iComputeBoolSize = AbstractC5248t.computeBytesSize(iM, (AbstractC5235o) unsafe.getObject(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if ((i15 & i9) != 0) {
                        iComputeBoolSize = AbstractC5248t.computeUInt32Size(iM, unsafe.getInt(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if ((i15 & i9) != 0) {
                        iComputeBoolSize = AbstractC5248t.computeEnumSize(iM, unsafe.getInt(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if ((i15 & i9) != 0) {
                        iComputeSFixed32Size = AbstractC5248t.computeSFixed32Size(iM, 0);
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i15 & i9) != 0) {
                        iComputeBoolSize = AbstractC5248t.computeSFixed64Size(iM, 0L);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if ((i15 & i9) != 0) {
                        iComputeBoolSize = AbstractC5248t.computeSInt32Size(iM, unsafe.getInt(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if ((i15 & i9) != 0) {
                        iComputeBoolSize = AbstractC5248t.computeSInt64Size(iM, unsafe.getLong(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if ((i15 & i9) != 0) {
                        iComputeBoolSize = AbstractC5248t.b(iM, (K0) unsafe.getObject(obj, jN), l(i13));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = AbstractC5225k1.h(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iComputeBoolSize;
                    break;
                case 19:
                    z8 = false;
                    iF = AbstractC5225k1.f(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 20:
                    z8 = false;
                    iF = AbstractC5225k1.m(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 21:
                    z8 = false;
                    iF = AbstractC5225k1.x(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 22:
                    z8 = false;
                    iF = AbstractC5225k1.k(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 23:
                    z8 = false;
                    iF = AbstractC5225k1.h(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 24:
                    z8 = false;
                    iF = AbstractC5225k1.f(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 25:
                    z8 = false;
                    iF = AbstractC5225k1.a(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 26:
                    iComputeBoolSize = AbstractC5225k1.u(iM, (List) unsafe.getObject(obj, jN));
                    i14 += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = AbstractC5225k1.p(iM, (List) unsafe.getObject(obj, jN), l(i13));
                    i14 += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = AbstractC5225k1.c(iM, (List) unsafe.getObject(obj, jN));
                    i14 += iComputeBoolSize;
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    iComputeBoolSize = AbstractC5225k1.v(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iComputeBoolSize;
                    break;
                case 30:
                    z8 = false;
                    iF = AbstractC5225k1.d(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 31:
                    z8 = false;
                    iF = AbstractC5225k1.f(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 32:
                    z8 = false;
                    iF = AbstractC5225k1.h(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 33:
                    z8 = false;
                    iF = AbstractC5225k1.q(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 34:
                    z8 = false;
                    iF = AbstractC5225k1.s(iM, (List) unsafe.getObject(obj, jN), false);
                    i14 += iF;
                    break;
                case 35:
                    i10 = AbstractC5225k1.i((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 36:
                    i10 = AbstractC5225k1.g((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 37:
                    i10 = AbstractC5225k1.n((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 38:
                    i10 = AbstractC5225k1.y((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 39:
                    i10 = AbstractC5225k1.l((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 40:
                    i10 = AbstractC5225k1.i((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 41:
                    i10 = AbstractC5225k1.g((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 42:
                    i10 = AbstractC5225k1.b((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 43:
                    i10 = AbstractC5225k1.w((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 44:
                    i10 = AbstractC5225k1.e((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 45:
                    i10 = AbstractC5225k1.g((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 46:
                    i10 = AbstractC5225k1.i((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 47:
                    i10 = AbstractC5225k1.r((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    i10 = AbstractC5225k1.t((List) unsafe.getObject(obj, jN));
                    if (i10 > 0) {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i8, i10);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i10);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i10;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iComputeBoolSize = AbstractC5225k1.j(iM, (List) unsafe.getObject(obj, jN), l(i13));
                    i14 += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.f26263q.getSerializedSize(iM, unsafe.getObject(obj, jN), k(i13));
                    i14 += iComputeBoolSize;
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeDoubleSize(iM, 0.0d);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeFloatSize(iM, 0.0f);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeInt64Size(iM, S(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeUInt64Size(iM, S(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case s4.z.PUSH_TYPE_DEPARTURE /* 55 */:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeInt32Size(iM, R(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeFixed64Size(iM, 0L);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (z(obj, iM, i13)) {
                        iComputeSFixed32Size = AbstractC5248t.computeFixed32Size(iM, 0);
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeBoolSize(iM, true);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (z(obj, iM, i13)) {
                        Object object2 = unsafe.getObject(obj, jN);
                        iComputeBoolSize = object2 instanceof AbstractC5235o ? AbstractC5248t.computeBytesSize(iM, (AbstractC5235o) object2) : AbstractC5248t.computeStringSize(iM, (String) object2);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case s7.x.FROZEN_SHIFT /* 60 */:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5225k1.o(iM, unsafe.getObject(obj, jN), l(i13));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case s7.x.CLOSED_SHIFT /* 61 */:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeBytesSize(iM, (AbstractC5235o) unsafe.getObject(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeUInt32Size(iM, R(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeEnumSize(iM, R(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (z(obj, iM, i13)) {
                        iComputeSFixed32Size = AbstractC5248t.computeSFixed32Size(iM, 0);
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeSFixed64Size(iM, 0L);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeSInt32Size(iM, R(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.computeSInt64Size(iM, S(obj, jN));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (z(obj, iM, i13)) {
                        iComputeBoolSize = AbstractC5248t.b(iM, (K0) unsafe.getObject(obj, jN), l(i13));
                        i14 += iComputeBoolSize;
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        int iP = i14 + p(this.f26261o, obj);
        return this.f26252f ? iP + this.f26262p.getExtensions(obj).getSerializedSize() : iP;
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n0(java.lang.Object r18, com.google.protobuf.R1 r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.P0.n0(java.lang.Object, com.google.protobuf.R1):void");
    }

    private int o(Object obj) {
        int iComputeDoubleSize;
        int i8;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = f26246s;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f26247a.length; i10 += 3) {
            int iM0 = m0(i10);
            int iL0 = l0(iM0);
            int iM = M(i10);
            long jN = N(iM0);
            int i11 = (iL0 < X.DOUBLE_LIST_PACKED.id() || iL0 > X.SINT64_LIST_PACKED.id()) ? 0 : this.f26247a[i10 + 2] & 1048575;
            switch (iL0) {
                case 0:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeDoubleSize(iM, 0.0d);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeFloatSize(iM, 0.0f);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeInt64Size(iM, L1.F(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeUInt64Size(iM, L1.F(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeInt32Size(iM, L1.D(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeFixed64Size(iM, 0L);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeFixed32Size(iM, 0);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeBoolSize(iM, true);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (s(obj, i10)) {
                        Object objH = L1.H(obj, jN);
                        iComputeDoubleSize = objH instanceof AbstractC5235o ? AbstractC5248t.computeBytesSize(iM, (AbstractC5235o) objH) : AbstractC5248t.computeStringSize(iM, (String) objH);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5225k1.o(iM, L1.H(obj, jN), l(i10));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeBytesSize(iM, (AbstractC5235o) L1.H(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeUInt32Size(iM, L1.D(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeEnumSize(iM, L1.D(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeSFixed32Size(iM, 0);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeSFixed64Size(iM, 0L);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeSInt32Size(iM, L1.D(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeSInt64Size(iM, L1.F(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (s(obj, i10)) {
                        iComputeDoubleSize = AbstractC5248t.b(iM, (K0) L1.H(obj, jN), l(i10));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iComputeDoubleSize = AbstractC5225k1.h(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = AbstractC5225k1.f(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = AbstractC5225k1.m(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = AbstractC5225k1.x(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = AbstractC5225k1.k(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = AbstractC5225k1.h(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = AbstractC5225k1.f(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = AbstractC5225k1.a(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = AbstractC5225k1.u(iM, B(obj, jN));
                    i9 += iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = AbstractC5225k1.p(iM, B(obj, jN), l(i10));
                    i9 += iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = AbstractC5225k1.c(iM, B(obj, jN));
                    i9 += iComputeDoubleSize;
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    iComputeDoubleSize = AbstractC5225k1.v(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = AbstractC5225k1.d(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = AbstractC5225k1.f(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = AbstractC5225k1.h(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = AbstractC5225k1.q(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = AbstractC5225k1.s(iM, B(obj, jN), false);
                    i9 += iComputeDoubleSize;
                    break;
                case 35:
                    i8 = AbstractC5225k1.i((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 36:
                    i8 = AbstractC5225k1.g((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 37:
                    i8 = AbstractC5225k1.n((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 38:
                    i8 = AbstractC5225k1.y((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 39:
                    i8 = AbstractC5225k1.l((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 40:
                    i8 = AbstractC5225k1.i((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 41:
                    i8 = AbstractC5225k1.g((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 42:
                    i8 = AbstractC5225k1.b((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 43:
                    i8 = AbstractC5225k1.w((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 44:
                    i8 = AbstractC5225k1.e((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 45:
                    i8 = AbstractC5225k1.g((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 46:
                    i8 = AbstractC5225k1.i((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case 47:
                    i8 = AbstractC5225k1.r((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    i8 = AbstractC5225k1.t((List) unsafe.getObject(obj, jN));
                    if (i8 <= 0) {
                        break;
                    } else {
                        if (this.f26255i) {
                            unsafe.putInt(obj, i11, i8);
                        }
                        iComputeTagSize = AbstractC5248t.computeTagSize(iM);
                        iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(i8);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i8;
                        i9 += iComputeDoubleSize;
                        break;
                    }
                case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iComputeDoubleSize = AbstractC5225k1.j(iM, B(obj, jN), l(i10));
                    i9 += iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = this.f26263q.getSerializedSize(iM, L1.H(obj, jN), k(i10));
                    i9 += iComputeDoubleSize;
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeDoubleSize(iM, 0.0d);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeFloatSize(iM, 0.0f);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeInt64Size(iM, S(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeUInt64Size(iM, S(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case s4.z.PUSH_TYPE_DEPARTURE /* 55 */:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeInt32Size(iM, R(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeFixed64Size(iM, 0L);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeFixed32Size(iM, 0);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeBoolSize(iM, true);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (z(obj, iM, i10)) {
                        Object objH2 = L1.H(obj, jN);
                        iComputeDoubleSize = objH2 instanceof AbstractC5235o ? AbstractC5248t.computeBytesSize(iM, (AbstractC5235o) objH2) : AbstractC5248t.computeStringSize(iM, (String) objH2);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case s7.x.FROZEN_SHIFT /* 60 */:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5225k1.o(iM, L1.H(obj, jN), l(i10));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case s7.x.CLOSED_SHIFT /* 61 */:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeBytesSize(iM, (AbstractC5235o) L1.H(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeUInt32Size(iM, R(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeEnumSize(iM, R(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeSFixed32Size(iM, 0);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeSFixed64Size(iM, 0L);
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeSInt32Size(iM, R(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.computeSInt64Size(iM, S(obj, jN));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z(obj, iM, i10)) {
                        iComputeDoubleSize = AbstractC5248t.b(iM, (K0) L1.H(obj, jN), l(i10));
                        i9 += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i9 + p(this.f26261o, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:297:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void o0(java.lang.Object r13, com.google.protobuf.R1 r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.P0.o0(java.lang.Object, com.google.protobuf.R1):void");
    }

    private int p(F1 f12, Object obj) {
        return f12.h(f12.g(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:296:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void p0(java.lang.Object r11, com.google.protobuf.R1 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.P0.p0(java.lang.Object, com.google.protobuf.R1):void");
    }

    private static int q(Object obj, long j8) {
        return L1.D(obj, j8);
    }

    private void q0(R1 r12, int i8, Object obj, int i9) {
        if (obj != null) {
            r12.writeMap(i8, this.f26263q.forMapMetadata(k(i9)), this.f26263q.forMapData(obj));
        }
    }

    private static boolean r(int i8) {
        return (i8 & 536870912) != 0;
    }

    private void r0(int i8, Object obj, R1 r12) {
        if (obj instanceof String) {
            r12.writeString(i8, (String) obj);
        } else {
            r12.writeBytes(i8, (AbstractC5235o) obj);
        }
    }

    private boolean s(Object obj, int i8) {
        int iA0 = a0(i8);
        long j8 = 1048575 & iA0;
        if (j8 != 1048575) {
            return (L1.D(obj, j8) & (1 << (iA0 >>> 20))) != 0;
        }
        int iM0 = m0(i8);
        long jN = N(iM0);
        switch (l0(iM0)) {
            case 0:
                return Double.doubleToRawLongBits(L1.B(obj, jN)) != 0;
            case 1:
                return Float.floatToRawIntBits(L1.C(obj, jN)) != 0;
            case 2:
                return L1.F(obj, jN) != 0;
            case 3:
                return L1.F(obj, jN) != 0;
            case 4:
                return L1.D(obj, jN) != 0;
            case 5:
                return L1.F(obj, jN) != 0;
            case 6:
                return L1.D(obj, jN) != 0;
            case 7:
                return L1.u(obj, jN);
            case 8:
                Object objH = L1.H(obj, jN);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof AbstractC5235o) {
                    return !AbstractC5235o.EMPTY.equals(objH);
                }
                throw new IllegalArgumentException();
            case 9:
                return L1.H(obj, jN) != null;
            case 10:
                return !AbstractC5235o.EMPTY.equals(L1.H(obj, jN));
            case 11:
                return L1.D(obj, jN) != 0;
            case 12:
                return L1.D(obj, jN) != 0;
            case 13:
                return L1.D(obj, jN) != 0;
            case 14:
                return L1.F(obj, jN) != 0;
            case 15:
                return L1.D(obj, jN) != 0;
            case 16:
                return L1.F(obj, jN) != 0;
            case 17:
                return L1.H(obj, jN) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void s0(F1 f12, Object obj, R1 r12) {
        f12.t(f12.g(obj), r12);
    }

    private boolean t(Object obj, int i8, int i9, int i10, int i11) {
        return i9 == 1048575 ? s(obj, i8) : (i10 & i11) != 0;
    }

    private static boolean u(Object obj, int i8, InterfaceC5219i1 interfaceC5219i1) {
        return interfaceC5219i1.isInitialized(L1.H(obj, N(i8)));
    }

    private boolean v(Object obj, int i8, int i9) {
        List list = (List) L1.H(obj, N(i8));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC5219i1 interfaceC5219i1L = l(i9);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!interfaceC5219i1L.isInitialized(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private boolean w(Object obj, int i8, int i9) {
        Map<?, ?> mapForMapData = this.f26263q.forMapData(L1.H(obj, N(i8)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.f26263q.forMapMetadata(k(i9)).valueType.getJavaType() != P1.c.MESSAGE) {
            return true;
        }
        InterfaceC5219i1 interfaceC5219i1SchemaFor = null;
        for (Object obj2 : mapForMapData.values()) {
            if (interfaceC5219i1SchemaFor == null) {
                interfaceC5219i1SchemaFor = C5201c1.getInstance().schemaFor((Class) obj2.getClass());
            }
            if (!interfaceC5219i1SchemaFor.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean x(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC5206e0) {
            return ((AbstractC5206e0) obj).q();
        }
        return true;
    }

    private boolean y(Object obj, Object obj2, int i8) {
        long jA0 = a0(i8) & 1048575;
        return L1.D(obj, jA0) == L1.D(obj2, jA0);
    }

    private boolean z(Object obj, int i8, int i9) {
        return L1.D(obj, (long) (a0(i9) & 1048575)) == i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:348:0x036e, code lost:
    
        if (r5 == r0) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0370, code lost:
    
        r10 = r30;
        r27.putInt(r10, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0379, code lost:
    
        r10 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x037b, code lost:
    
        r11 = r8.f26257k;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0382, code lost:
    
        if (r11 >= r8.f26258l) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0384, code lost:
    
        r3 = (com.google.protobuf.H1) g(r30, r8.f26256j[r11], r3, r8.f26261o, r30);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x039a, code lost:
    
        if (r3 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x039c, code lost:
    
        r8.f26261o.o(r10, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03a1, code lost:
    
        if (r7 != 0) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03a5, code lost:
    
        if (r9 != r33) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x03ac, code lost:
    
        throw com.google.protobuf.C5230m0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03af, code lost:
    
        if (r9 > r33) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x03b1, code lost:
    
        if (r6 != r7) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03b3, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03b8, code lost:
    
        throw com.google.protobuf.C5230m0.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    int V(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.protobuf.AbstractC5217i.a r35) throws com.google.protobuf.C5230m0 {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.P0.V(java.lang.Object, byte[], int, int, int, com.google.protobuf.i$a):int");
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public boolean equals(Object obj, Object obj2) {
        int length = this.f26247a.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            if (!f(obj, obj2, i8)) {
                return false;
            }
        }
        if (!this.f26261o.g(obj).equals(this.f26261o.g(obj2))) {
            return false;
        }
        if (this.f26252f) {
            return this.f26262p.getExtensions(obj).equals(this.f26262p.getExtensions(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public int getSerializedSize(Object obj) {
        return this.f26254h ? o(obj) : n(obj);
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public int hashCode(Object obj) {
        int i8;
        int iHashLong;
        int length = this.f26247a.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iM0 = m0(i10);
            int iM = M(i10);
            long jN = N(iM0);
            int iHashCode = 37;
            switch (l0(iM0)) {
                case 0:
                    i8 = i9 * 53;
                    iHashLong = AbstractC5227l0.hashLong(Double.doubleToLongBits(L1.B(obj, jN)));
                    i9 = i8 + iHashLong;
                    break;
                case 1:
                    i8 = i9 * 53;
                    iHashLong = Float.floatToIntBits(L1.C(obj, jN));
                    i9 = i8 + iHashLong;
                    break;
                case 2:
                    i8 = i9 * 53;
                    iHashLong = AbstractC5227l0.hashLong(L1.F(obj, jN));
                    i9 = i8 + iHashLong;
                    break;
                case 3:
                    i8 = i9 * 53;
                    iHashLong = AbstractC5227l0.hashLong(L1.F(obj, jN));
                    i9 = i8 + iHashLong;
                    break;
                case 4:
                    i8 = i9 * 53;
                    iHashLong = L1.D(obj, jN);
                    i9 = i8 + iHashLong;
                    break;
                case 5:
                    i8 = i9 * 53;
                    iHashLong = AbstractC5227l0.hashLong(L1.F(obj, jN));
                    i9 = i8 + iHashLong;
                    break;
                case 6:
                    i8 = i9 * 53;
                    iHashLong = L1.D(obj, jN);
                    i9 = i8 + iHashLong;
                    break;
                case 7:
                    i8 = i9 * 53;
                    iHashLong = AbstractC5227l0.hashBoolean(L1.u(obj, jN));
                    i9 = i8 + iHashLong;
                    break;
                case 8:
                    i8 = i9 * 53;
                    iHashLong = ((String) L1.H(obj, jN)).hashCode();
                    i9 = i8 + iHashLong;
                    break;
                case 9:
                    Object objH = L1.H(obj, jN);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 10:
                    i8 = i9 * 53;
                    iHashLong = L1.H(obj, jN).hashCode();
                    i9 = i8 + iHashLong;
                    break;
                case 11:
                    i8 = i9 * 53;
                    iHashLong = L1.D(obj, jN);
                    i9 = i8 + iHashLong;
                    break;
                case 12:
                    i8 = i9 * 53;
                    iHashLong = L1.D(obj, jN);
                    i9 = i8 + iHashLong;
                    break;
                case 13:
                    i8 = i9 * 53;
                    iHashLong = L1.D(obj, jN);
                    i9 = i8 + iHashLong;
                    break;
                case 14:
                    i8 = i9 * 53;
                    iHashLong = AbstractC5227l0.hashLong(L1.F(obj, jN));
                    i9 = i8 + iHashLong;
                    break;
                case 15:
                    i8 = i9 * 53;
                    iHashLong = L1.D(obj, jN);
                    i9 = i8 + iHashLong;
                    break;
                case 16:
                    i8 = i9 * 53;
                    iHashLong = AbstractC5227l0.hashLong(L1.F(obj, jN));
                    i9 = i8 + iHashLong;
                    break;
                case 17:
                    Object objH2 = L1.H(obj, jN);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i8 = i9 * 53;
                    iHashLong = L1.H(obj, jN).hashCode();
                    i9 = i8 + iHashLong;
                    break;
                case 50:
                    i8 = i9 * 53;
                    iHashLong = L1.H(obj, jN).hashCode();
                    i9 = i8 + iHashLong;
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = AbstractC5227l0.hashLong(Double.doubleToLongBits(P(obj, jN)));
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = Float.floatToIntBits(Q(obj, jN));
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = AbstractC5227l0.hashLong(S(obj, jN));
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = AbstractC5227l0.hashLong(S(obj, jN));
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case s4.z.PUSH_TYPE_DEPARTURE /* 55 */:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = R(obj, jN);
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = AbstractC5227l0.hashLong(S(obj, jN));
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = R(obj, jN);
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = AbstractC5227l0.hashBoolean(O(obj, jN));
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = ((String) L1.H(obj, jN)).hashCode();
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case s7.x.FROZEN_SHIFT /* 60 */:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = L1.H(obj, jN).hashCode();
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case s7.x.CLOSED_SHIFT /* 61 */:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = L1.H(obj, jN).hashCode();
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = R(obj, jN);
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = R(obj, jN);
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = R(obj, jN);
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = AbstractC5227l0.hashLong(S(obj, jN));
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = R(obj, jN);
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = AbstractC5227l0.hashLong(S(obj, jN));
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z(obj, iM, i10)) {
                        i8 = i9 * 53;
                        iHashLong = L1.H(obj, jN).hashCode();
                        i9 = i8 + iHashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i9 * 53) + this.f26261o.g(obj).hashCode();
        return this.f26252f ? (iHashCode2 * 53) + this.f26262p.getExtensions(obj).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0089  */
    @Override // com.google.protobuf.InterfaceC5219i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isInitialized(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = r8
            r1 = r9
            r10 = r1
        Lb:
            int r2 = r6.f26257k
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.f26256j
            r11 = r2[r10]
            int r12 = r6.M(r11)
            int r13 = r6.m0(r11)
            int[] r2 = r6.f26247a
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L37
            if (r4 == r8) goto L33
            sun.misc.Unsafe r0 = com.google.protobuf.P0.f26246s
            long r1 = (long) r4
            int r1 = r0.getInt(r7, r1)
        L33:
            r16 = r1
            r15 = r4
            goto L3a
        L37:
            r15 = r0
            r16 = r1
        L3a:
            boolean r0 = A(r13)
            if (r0 == 0) goto L50
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.t(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L50
            return r9
        L50:
            int r0 = l0(r13)
            r1 = 9
            if (r0 == r1) goto L90
            r1 = 17
            if (r0 == r1) goto L90
            r1 = 27
            if (r0 == r1) goto L89
            r1 = 60
            if (r0 == r1) goto L78
            r1 = 68
            if (r0 == r1) goto L78
            r1 = 49
            if (r0 == r1) goto L89
            r1 = 50
            if (r0 == r1) goto L71
            goto Laa
        L71:
            boolean r0 = r6.w(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L78:
            boolean r0 = r6.z(r7, r12, r11)
            if (r0 == 0) goto Laa
            com.google.protobuf.i1 r0 = r6.l(r11)
            boolean r0 = u(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        L89:
            boolean r0 = r6.v(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L90:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.t(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Laa
            com.google.protobuf.i1 r0 = r6.l(r11)
            boolean r0 = u(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.f26252f
            if (r0 == 0) goto Lc2
            com.google.protobuf.N r0 = r6.f26262p
            com.google.protobuf.W r0 = r0.getExtensions(r7)
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.P0.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0069  */
    @Override // com.google.protobuf.InterfaceC5219i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void makeImmutable(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = x(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.protobuf.AbstractC5206e0
            if (r0 == 0) goto L17
            r0 = r8
            com.google.protobuf.e0 r0 = (com.google.protobuf.AbstractC5206e0) r0
            r0.f()
            r0.e()
            r0.s()
        L17:
            int[] r0 = r7.f26247a
            int r0 = r0.length
            r1 = 0
        L1b:
            if (r1 >= r0) goto L7f
            int r2 = r7.m0(r1)
            long r3 = N(r2)
            int r2 = l0(r2)
            r5 = 9
            if (r2 == r5) goto L69
            r5 = 60
            if (r2 == r5) goto L51
            r5 = 68
            if (r2 == r5) goto L51
            switch(r2) {
                case 17: goto L69;
                case 18: goto L4b;
                case 19: goto L4b;
                case 20: goto L4b;
                case 21: goto L4b;
                case 22: goto L4b;
                case 23: goto L4b;
                case 24: goto L4b;
                case 25: goto L4b;
                case 26: goto L4b;
                case 27: goto L4b;
                case 28: goto L4b;
                case 29: goto L4b;
                case 30: goto L4b;
                case 31: goto L4b;
                case 32: goto L4b;
                case 33: goto L4b;
                case 34: goto L4b;
                case 35: goto L4b;
                case 36: goto L4b;
                case 37: goto L4b;
                case 38: goto L4b;
                case 39: goto L4b;
                case 40: goto L4b;
                case 41: goto L4b;
                case 42: goto L4b;
                case 43: goto L4b;
                case 44: goto L4b;
                case 45: goto L4b;
                case 46: goto L4b;
                case 47: goto L4b;
                case 48: goto L4b;
                case 49: goto L4b;
                case 50: goto L39;
                default: goto L38;
            }
        L38:
            goto L7c
        L39:
            sun.misc.Unsafe r2 = com.google.protobuf.P0.f26246s
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7c
            com.google.protobuf.D0 r6 = r7.f26263q
            java.lang.Object r5 = r6.toImmutable(r5)
            r2.putObject(r8, r3, r5)
            goto L7c
        L4b:
            com.google.protobuf.u0 r2 = r7.f26260n
            r2.c(r8, r3)
            goto L7c
        L51:
            int r2 = r7.M(r1)
            boolean r2 = r7.z(r8, r2, r1)
            if (r2 == 0) goto L7c
            com.google.protobuf.i1 r2 = r7.l(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.P0.f26246s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
            goto L7c
        L69:
            boolean r2 = r7.s(r8, r1)
            if (r2 == 0) goto L7c
            com.google.protobuf.i1 r2 = r7.l(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.P0.f26246s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
        L7c:
            int r1 = r1 + 3
            goto L1b
        L7f:
            com.google.protobuf.F1 r0 = r7.f26261o
            r0.j(r8)
            boolean r0 = r7.f26252f
            if (r0 == 0) goto L8d
            com.google.protobuf.N r0 = r7.f26262p
            r0.e(r8)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.P0.makeImmutable(java.lang.Object):void");
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public void mergeFrom(Object obj, Object obj2) {
        c(obj);
        obj2.getClass();
        for (int i8 = 0; i8 < this.f26247a.length; i8 += 3) {
            H(obj, obj2, i8);
        }
        AbstractC5225k1.H(this.f26261o, obj, obj2);
        if (this.f26252f) {
            AbstractC5225k1.F(this.f26262p, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public Object newInstance() {
        return this.f26259m.newInstance(this.f26251e);
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public void writeTo(Object obj, R1 r12) {
        if (r12.fieldOrder() == R1.a.DESCENDING) {
            p0(obj, r12);
        } else if (this.f26254h) {
            o0(obj, r12);
        } else {
            n0(obj, r12);
        }
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public void mergeFrom(Object obj, InterfaceC5210f1 interfaceC5210f1, M m8) throws Throwable {
        m8.getClass();
        c(obj);
        D(this.f26261o, this.f26262p, obj, interfaceC5210f1, m8);
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public void mergeFrom(Object obj, byte[] bArr, int i8, int i9, AbstractC5217i.a aVar) throws C5230m0 {
        if (this.f26254h) {
            W(obj, bArr, i8, i9, aVar);
        } else {
            V(obj, bArr, i8, i9, 0, aVar);
        }
    }
}
