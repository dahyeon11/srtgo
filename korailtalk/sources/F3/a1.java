package f3;

import f3.AbstractC5469j0;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class a1 extends AbstractC5469j0 {

    /* renamed from: i */
    static final AbstractC5469j0 f30856i = new a1(null, new Object[0], 0);

    /* renamed from: f */
    private final transient Object f30857f;

    /* renamed from: g */
    final transient Object[] f30858g;

    /* renamed from: h */
    private final transient int f30859h;

    static class a extends AbstractC5483q0 {

        /* renamed from: c */
        private final transient AbstractC5469j0 f30860c;

        /* renamed from: d */
        private final transient Object[] f30861d;

        /* renamed from: e */
        private final transient int f30862e;

        /* renamed from: f */
        private final transient int f30863f;

        /* renamed from: f3.a1$a$a */
        class C0292a extends AbstractC5465h0 {
            C0292a() {
            }

            @Override // f3.AbstractC5457d0
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f30863f;
            }

            @Override // java.util.List
            public Map.Entry<Object, Object> get(int i8) {
                e3.w.checkElementIndex(i8, a.this.f30863f);
                int i9 = i8 * 2;
                Object obj = a.this.f30861d[a.this.f30862e + i9];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f30861d[i9 + (a.this.f30862e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
        }

        a(AbstractC5469j0 abstractC5469j0, Object[] objArr, int i8, int i9) {
            this.f30860c = abstractC5469j0;
            this.f30861d = objArr;
            this.f30862e = i8;
            this.f30863f = i9;
        }

        @Override // f3.AbstractC5457d0
        int a(Object[] objArr, int i8) {
            return asList().a(objArr, i8);
        }

        @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f30860c.get(key));
        }

        @Override // f3.AbstractC5483q0
        AbstractC5465h0 i() {
            return new C0292a();
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f30863f;
        }

        @Override // f3.AbstractC5483q0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public t1 iterator() {
            return asList().iterator();
        }
    }

    static final class b extends AbstractC5483q0 {

        /* renamed from: c */
        private final transient AbstractC5469j0 f30865c;

        /* renamed from: d */
        private final transient AbstractC5465h0 f30866d;

        b(AbstractC5469j0 abstractC5469j0, AbstractC5465h0 abstractC5465h0) {
            this.f30865c = abstractC5469j0;
            this.f30866d = abstractC5465h0;
        }

        @Override // f3.AbstractC5457d0
        int a(Object[] objArr, int i8) {
            return asList().a(objArr, i8);
        }

        @Override // f3.AbstractC5483q0, f3.AbstractC5457d0
        public AbstractC5465h0 asList() {
            return this.f30866d;
        }

        @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f30865c.get(obj) != null;
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f30865c.size();
        }

        @Override // f3.AbstractC5483q0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public t1 iterator() {
            return asList().iterator();
        }
    }

    static final class c extends AbstractC5465h0 {

        /* renamed from: c */
        private final transient Object[] f30867c;

        /* renamed from: d */
        private final transient int f30868d;

        /* renamed from: e */
        private final transient int f30869e;

        c(Object[] objArr, int i8, int i9) {
            this.f30867c = objArr;
            this.f30868d = i8;
            this.f30869e = i9;
        }

        @Override // java.util.List
        public Object get(int i8) {
            e3.w.checkElementIndex(i8, this.f30869e);
            Object obj = this.f30867c[(i8 * 2) + this.f30868d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f30869e;
        }
    }

    private a1(Object obj, Object[] objArr, int i8) {
        this.f30857f = obj;
        this.f30858g = objArr;
        this.f30859h = i8;
    }

    static a1 g(int i8, Object[] objArr) {
        return h(i8, objArr, null);
    }

    static a1 h(int i8, Object[] objArr, AbstractC5469j0.b bVar) {
        if (i8 == 0) {
            return (a1) f30856i;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC5484r.a(obj, obj2);
            return new a1(null, objArr, 1);
        }
        e3.w.checkPositionIndex(i8, objArr.length >> 1);
        Object objI = i(objArr, i8, AbstractC5483q0.g(i8), 0);
        if (objI instanceof Object[]) {
            Object[] objArr2 = (Object[]) objI;
            AbstractC5469j0.b.a aVar = (AbstractC5469j0.b.a) objArr2[2];
            if (bVar == null) {
                throw aVar.a();
            }
            bVar.f31003e = aVar;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objI = obj3;
            i8 = iIntValue;
        }
        return new a1(objI, objArr, i8);
    }

    private static Object i(Object[] objArr, int i8, int i9, int i10) {
        AbstractC5469j0.b.a aVar = null;
        if (i8 == 1) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i10 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC5484r.a(obj, obj2);
            return null;
        }
        int i11 = i9 - 1;
        int i12 = -1;
        if (i9 <= 128) {
            byte[] bArr = new byte[i9];
            Arrays.fill(bArr, (byte) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i8; i14++) {
                int i15 = (i14 * 2) + i10;
                int i16 = (i13 * 2) + i10;
                Object obj3 = objArr[i15];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC5484r.a(obj3, obj4);
                int iB = AbstractC5453b0.b(obj3.hashCode());
                while (true) {
                    int i17 = iB & i11;
                    int i18 = bArr[i17] & 255;
                    if (i18 == 255) {
                        bArr[i17] = (byte) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj3;
                            objArr[i16 ^ 1] = obj4;
                        }
                        i13++;
                    } else {
                        if (obj3.equals(objArr[i18])) {
                            int i19 = i18 ^ 1;
                            Object obj5 = objArr[i19];
                            Objects.requireNonNull(obj5);
                            aVar = new AbstractC5469j0.b.a(obj3, obj4, obj5);
                            objArr[i19] = obj4;
                            break;
                        }
                        iB = i17 + 1;
                    }
                }
            }
            return i13 == i8 ? bArr : new Object[]{bArr, Integer.valueOf(i13), aVar};
        }
        if (i9 <= 32768) {
            short[] sArr = new short[i9];
            Arrays.fill(sArr, (short) -1);
            int i20 = 0;
            for (int i21 = 0; i21 < i8; i21++) {
                int i22 = (i21 * 2) + i10;
                int i23 = (i20 * 2) + i10;
                Object obj6 = objArr[i22];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC5484r.a(obj6, obj7);
                int iB2 = AbstractC5453b0.b(obj6.hashCode());
                while (true) {
                    int i24 = iB2 & i11;
                    int i25 = sArr[i24] & R6.D.MAX_VALUE;
                    if (i25 == 65535) {
                        sArr[i24] = (short) i23;
                        if (i20 < i21) {
                            objArr[i23] = obj6;
                            objArr[i23 ^ 1] = obj7;
                        }
                        i20++;
                    } else {
                        if (obj6.equals(objArr[i25])) {
                            int i26 = i25 ^ 1;
                            Object obj8 = objArr[i26];
                            Objects.requireNonNull(obj8);
                            aVar = new AbstractC5469j0.b.a(obj6, obj7, obj8);
                            objArr[i26] = obj7;
                            break;
                        }
                        iB2 = i24 + 1;
                    }
                }
            }
            return i20 == i8 ? sArr : new Object[]{sArr, Integer.valueOf(i20), aVar};
        }
        int[] iArr = new int[i9];
        Arrays.fill(iArr, -1);
        int i27 = 0;
        int i28 = 0;
        while (i27 < i8) {
            int i29 = (i27 * 2) + i10;
            int i30 = (i28 * 2) + i10;
            Object obj9 = objArr[i29];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i29 ^ 1];
            Objects.requireNonNull(obj10);
            AbstractC5484r.a(obj9, obj10);
            int iB3 = AbstractC5453b0.b(obj9.hashCode());
            while (true) {
                int i31 = iB3 & i11;
                int i32 = iArr[i31];
                if (i32 == i12) {
                    iArr[i31] = i30;
                    if (i28 < i27) {
                        objArr[i30] = obj9;
                        objArr[i30 ^ 1] = obj10;
                    }
                    i28++;
                } else {
                    if (obj9.equals(objArr[i32])) {
                        int i33 = i32 ^ 1;
                        Object obj11 = objArr[i33];
                        Objects.requireNonNull(obj11);
                        aVar = new AbstractC5469j0.b.a(obj9, obj10, obj11);
                        objArr[i33] = obj10;
                        break;
                    }
                    iB3 = i31 + 1;
                    i12 = -1;
                }
            }
            i27++;
            i12 = -1;
        }
        return i28 == i8 ? iArr : new Object[]{iArr, Integer.valueOf(i28), aVar};
    }

    static Object j(Object[] objArr, int i8, int i9, int i10) {
        Object objI = i(objArr, i8, i9, i10);
        if (objI instanceof Object[]) {
            throw ((AbstractC5469j0.b.a) ((Object[]) objI)[2]).a();
        }
        return objI;
    }

    static Object k(Object obj, Object[] objArr, int i8, int i9, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i8 == 1) {
            Object obj3 = objArr[i9];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = AbstractC5453b0.b(obj2.hashCode());
            while (true) {
                int i10 = iB & length;
                int i11 = bArr[i10] & 255;
                if (i11 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i11])) {
                    return objArr[i11 ^ 1];
                }
                iB = i10 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = AbstractC5453b0.b(obj2.hashCode());
            while (true) {
                int i12 = iB2 & length2;
                int i13 = sArr[i12] & R6.D.MAX_VALUE;
                if (i13 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iB2 = i12 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = AbstractC5453b0.b(obj2.hashCode());
            while (true) {
                int i14 = iB3 & length3;
                int i15 = iArr[i14];
                if (i15 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB3 = i14 + 1;
            }
        }
    }

    @Override // f3.AbstractC5469j0
    AbstractC5483q0 a() {
        return new a(this, this.f30858g, 0, this.f30859h);
    }

    @Override // f3.AbstractC5469j0
    AbstractC5483q0 b() {
        return new b(this, new c(this.f30858g, 0, this.f30859h));
    }

    @Override // f3.AbstractC5469j0
    AbstractC5457d0 c() {
        return new c(this.f30858g, 1, this.f30859h);
    }

    @Override // f3.AbstractC5469j0
    boolean e() {
        return false;
    }

    @Override // f3.AbstractC5469j0, java.util.Map
    public Object get(Object obj) {
        Object objK = k(this.f30857f, this.f30858g, this.f30859h, 0, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // java.util.Map
    public int size() {
        return this.f30859h;
    }
}
