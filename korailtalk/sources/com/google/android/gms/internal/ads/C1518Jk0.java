package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Jk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1518Jk0 extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f13682j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f13683a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f13684b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f13685c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f13686d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f13687e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f13688f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set f13689g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set f13690h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection f13691i;

    C1518Jk0(int i8) {
        s(8);
    }

    private final int A(int i8, int i9, int i10, int i11) {
        int i12 = i9 - 1;
        Object objD = AbstractC1559Kk0.d(i9);
        if (i11 != 0) {
            AbstractC1559Kk0.e(objD, i10 & i12, i11 + 1);
        }
        Object obj = this.f13683a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i13 = 0; i13 <= i8; i13++) {
            int iC = AbstractC1559Kk0.c(obj, i13);
            while (iC != 0) {
                int i14 = iC - 1;
                int i15 = iArrA[i14];
                int i16 = ((~i8) & i15) | i13;
                int i17 = i16 & i12;
                int iC2 = AbstractC1559Kk0.c(objD, i17);
                AbstractC1559Kk0.e(objD, i17, iC);
                iArrA[i14] = ((~i12) & i16) | (iC2 & i12);
                iC = i15 & i8;
            }
        }
        this.f13683a = objD;
        C(i12);
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(Object obj) {
        if (!u()) {
            int iY = y();
            Object obj2 = this.f13683a;
            Objects.requireNonNull(obj2);
            int iB = AbstractC1559Kk0.b(obj, null, iY, obj2, a(), b(), null);
            if (iB != -1) {
                Object obj3 = c()[iB];
                t(iB, iY);
                this.f13688f--;
                r();
                return obj3;
            }
        }
        return f13682j;
    }

    private final void C(int i8) {
        this.f13687e = ((32 - Integer.numberOfLeadingZeros(i8)) & 31) | (this.f13687e & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] a() {
        int[] iArr = this.f13684b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] b() {
        Object[] objArr = this.f13685c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] c() {
        Object[] objArr = this.f13686d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ Object j(C1518Jk0 c1518Jk0, int i8) {
        return c1518Jk0.b()[i8];
    }

    static /* synthetic */ Object l(C1518Jk0 c1518Jk0) {
        Object obj = c1518Jk0.f13683a;
        Objects.requireNonNull(obj);
        return obj;
    }

    static /* synthetic */ Object m(C1518Jk0 c1518Jk0, int i8) {
        return c1518Jk0.c()[i8];
    }

    static /* synthetic */ void q(C1518Jk0 c1518Jk0, int i8, Object obj) {
        c1518Jk0.c()[i8] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int y() {
        return (1 << (this.f13687e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(Object obj) {
        if (u()) {
            return -1;
        }
        int iB = AbstractC1886Sk0.b(obj);
        int iY = y();
        Object obj2 = this.f13683a;
        Objects.requireNonNull(obj2);
        int iC = AbstractC1559Kk0.c(obj2, iB & iY);
        if (iC != 0) {
            int i8 = ~iY;
            int i9 = iB & i8;
            do {
                int i10 = iC - 1;
                int i11 = a()[i10];
                if ((i11 & i8) == i9 && AbstractC4672vj0.zza(obj, b()[i10])) {
                    return i10;
                }
                iC = i11 & iY;
            } while (iC != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (u()) {
            return;
        }
        r();
        Map mapO = o();
        if (mapO != null) {
            this.f13687e = AbstractC1235Cm0.zzc(size(), 3, s7.x.MAX_CAPACITY_MASK);
            mapO.clear();
            this.f13683a = null;
            this.f13688f = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f13688f, (Object) null);
        Arrays.fill(c(), 0, this.f13688f, (Object) null);
        Object obj = this.f13683a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f13688f, 0);
        this.f13688f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapO = o();
        return mapO != null ? mapO.containsKey(obj) : z(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.containsValue(obj);
        }
        for (int i8 = 0; i8 < this.f13688f; i8++) {
            if (AbstractC4672vj0.zza(obj, c()[i8])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f13690h;
        if (set != null) {
            return set;
        }
        C1272Dk0 c1272Dk0 = new C1272Dk0(this);
        this.f13690h = c1272Dk0;
        return c1272Dk0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.get(obj);
        }
        int iZ = z(obj);
        if (iZ == -1) {
            return null;
        }
        return c()[iZ];
    }

    final int h() {
        return isEmpty() ? -1 : 0;
    }

    final int i(int i8) {
        int i9 = i8 + 1;
        if (i9 < this.f13688f) {
            return i9;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f13689g;
        if (set != null) {
            return set;
        }
        C1395Gk0 c1395Gk0 = new C1395Gk0(this);
        this.f13689g = c1395Gk0;
        return c1395Gk0;
    }

    final Map o() {
        Object obj = this.f13683a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (u()) {
            AbstractC1188Bj0.zzk(u(), "Arrays already allocated");
            int i8 = this.f13687e;
            int iMax = Math.max(i8 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f13683a = AbstractC1559Kk0.d(iMax2);
            C(iMax2 - 1);
            this.f13684b = new int[i8];
            this.f13685c = new Object[i8];
            this.f13686d = new Object[i8];
        }
        Map mapO = o();
        if (mapO != null) {
            return mapO.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i9 = this.f13688f;
        int i10 = i9 + 1;
        int iB = AbstractC1886Sk0.b(obj);
        int iY = y();
        int i11 = iB & iY;
        Object obj3 = this.f13683a;
        Objects.requireNonNull(obj3);
        int iC = AbstractC1559Kk0.c(obj3, i11);
        if (iC != 0) {
            int i12 = ~iY;
            int i13 = iB & i12;
            int i14 = 0;
            while (true) {
                int i15 = iC - 1;
                int i16 = iArrA[i15];
                int i17 = i16 & i12;
                if (i17 == i13 && AbstractC4672vj0.zza(obj, objArrB[i15])) {
                    Object obj4 = objArrC[i15];
                    objArrC[i15] = obj2;
                    return obj4;
                }
                int i18 = i16 & iY;
                i14++;
                if (i18 != 0) {
                    iC = i18;
                } else {
                    if (i14 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(y() + 1, 1.0f);
                        int iH = h();
                        while (iH >= 0) {
                            linkedHashMap.put(b()[iH], c()[iH]);
                            iH = i(iH);
                        }
                        this.f13683a = linkedHashMap;
                        this.f13684b = null;
                        this.f13685c = null;
                        this.f13686d = null;
                        r();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i10 > iY) {
                        iY = A(iY, AbstractC1559Kk0.a(iY), iB, i9);
                    } else {
                        iArrA[i15] = (i10 & iY) | i17;
                    }
                }
            }
        } else if (i10 > iY) {
            iY = A(iY, AbstractC1559Kk0.a(iY), iB, i9);
        } else {
            Object obj5 = this.f13683a;
            Objects.requireNonNull(obj5);
            AbstractC1559Kk0.e(obj5, i11, i10);
        }
        int length = a().length;
        if (i10 > length && (iMin = Math.min(s7.x.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f13684b = Arrays.copyOf(a(), iMin);
            this.f13685c = Arrays.copyOf(b(), iMin);
            this.f13686d = Arrays.copyOf(c(), iMin);
        }
        a()[i9] = (~iY) & iB;
        b()[i9] = obj;
        c()[i9] = obj2;
        this.f13688f = i10;
        r();
        return null;
    }

    final void r() {
        this.f13687e += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.remove(obj);
        }
        Object objB = B(obj);
        if (objB == f13682j) {
            return null;
        }
        return objB;
    }

    final void s(int i8) {
        this.f13687e = AbstractC1235Cm0.zzc(i8, 1, s7.x.MAX_CAPACITY_MASK);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapO = o();
        return mapO != null ? mapO.size() : this.f13688f;
    }

    final void t(int i8, int i9) {
        Object obj = this.f13683a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i10 = size - 1;
        if (i8 >= i10) {
            objArrB[i8] = null;
            objArrC[i8] = null;
            iArrA[i8] = 0;
            return;
        }
        int i11 = i8 + 1;
        Object obj2 = objArrB[i10];
        objArrB[i8] = obj2;
        objArrC[i8] = objArrC[i10];
        objArrB[i10] = null;
        objArrC[i10] = null;
        iArrA[i8] = iArrA[i10];
        iArrA[i10] = 0;
        int iB = AbstractC1886Sk0.b(obj2) & i9;
        int iC = AbstractC1559Kk0.c(obj, iB);
        if (iC == size) {
            AbstractC1559Kk0.e(obj, iB, i11);
            return;
        }
        while (true) {
            int i12 = iC - 1;
            int i13 = iArrA[i12];
            int i14 = i13 & i9;
            if (i14 == size) {
                iArrA[i12] = (i13 & (~i9)) | (i9 & i11);
                return;
            }
            iC = i14;
        }
    }

    final boolean u() {
        return this.f13683a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f13691i;
        if (collection != null) {
            return collection;
        }
        C1477Ik0 c1477Ik0 = new C1477Ik0(this);
        this.f13691i = c1477Ik0;
        return c1477Ik0;
    }
}
