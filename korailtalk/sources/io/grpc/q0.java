package io.grpc;

import java.util.Arrays;

/* loaded from: classes.dex */
abstract class q0 {

    static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f33280a;

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f33281b;

        a(Object obj, Object obj2, Object obj3, Object obj4) {
            this(new Object[]{obj, obj3}, new Object[]{obj2, obj4});
        }

        private int a(Object obj) {
            int i8 = 0;
            while (true) {
                Object[] objArr = this.f33280a;
                if (i8 >= objArr.length) {
                    return -1;
                }
                if (objArr[i8] == obj) {
                    return i8;
                }
                i8++;
            }
        }

        @Override // io.grpc.q0.d
        public Object get(Object obj, int i8, int i9) {
            int i10 = 0;
            while (true) {
                Object[] objArr = this.f33280a;
                if (i10 >= objArr.length) {
                    return null;
                }
                if (objArr[i10] == obj) {
                    return this.f33281b[i10];
                }
                i10++;
            }
        }

        @Override // io.grpc.q0.d
        public d put(Object obj, Object obj2, int i8, int i9) {
            int iHashCode = this.f33280a[0].hashCode();
            if (iHashCode != i8) {
                return b.a(new c(obj, obj2), i8, this, iHashCode, i9);
            }
            int iA = a(obj);
            if (iA != -1) {
                Object[] objArr = this.f33280a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                Object[] objArrCopyOf2 = Arrays.copyOf(this.f33281b, this.f33280a.length);
                objArrCopyOf[iA] = obj;
                objArrCopyOf2[iA] = obj2;
                return new a(objArrCopyOf, objArrCopyOf2);
            }
            Object[] objArr2 = this.f33280a;
            Object[] objArrCopyOf3 = Arrays.copyOf(objArr2, objArr2.length + 1);
            Object[] objArrCopyOf4 = Arrays.copyOf(this.f33281b, this.f33280a.length + 1);
            Object[] objArr3 = this.f33280a;
            objArrCopyOf3[objArr3.length] = obj;
            objArrCopyOf4[objArr3.length] = obj2;
            return new a(objArrCopyOf3, objArrCopyOf4);
        }

        @Override // io.grpc.q0.d
        public int size() {
            return this.f33281b.length;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CollisionLeaf(");
            for (int i8 = 0; i8 < this.f33281b.length; i8++) {
                sb.append("(key=");
                sb.append(this.f33280a[i8]);
                sb.append(" value=");
                sb.append(this.f33281b[i8]);
                sb.append(") ");
            }
            sb.append(")");
            return sb.toString();
        }

        private a(Object[] objArr, Object[] objArr2) {
            this.f33280a = objArr;
            this.f33281b = objArr2;
        }
    }

    static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        final int f33282a;

        /* renamed from: b, reason: collision with root package name */
        final d[] f33283b;

        /* renamed from: c, reason: collision with root package name */
        private final int f33284c;

        private b(int i8, d[] dVarArr, int i9) {
            this.f33282a = i8;
            this.f33283b = dVarArr;
            this.f33284c = i9;
        }

        static d a(d dVar, int i8, d dVar2, int i9, int i10) {
            int iC = c(i8, i10);
            int iC2 = c(i9, i10);
            if (iC == iC2) {
                d dVarA = a(dVar, i8, dVar2, i9, i10 + 5);
                return new b(iC, new d[]{dVarA}, dVarA.size());
            }
            if (d(i8, i10) > d(i9, i10)) {
                dVar2 = dVar;
                dVar = dVar2;
            }
            return new b(iC | iC2, new d[]{dVar, dVar2}, dVar.size() + dVar2.size());
        }

        private int b(int i8) {
            return Integer.bitCount((i8 - 1) & this.f33282a);
        }

        private static int c(int i8, int i9) {
            return 1 << d(i8, i9);
        }

        private static int d(int i8, int i9) {
            return (i8 >>> i9) & 31;
        }

        @Override // io.grpc.q0.d
        public Object get(Object obj, int i8, int i9) {
            int iC = c(i8, i9);
            if ((this.f33282a & iC) == 0) {
                return null;
            }
            return this.f33283b[b(iC)].get(obj, i8, i9 + 5);
        }

        @Override // io.grpc.q0.d
        public d put(Object obj, Object obj2, int i8, int i9) {
            int iC = c(i8, i9);
            int iB = b(iC);
            int i10 = this.f33282a;
            if ((i10 & iC) != 0) {
                d[] dVarArr = this.f33283b;
                d[] dVarArr2 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length);
                dVarArr2[iB] = this.f33283b[iB].put(obj, obj2, i8, i9 + 5);
                return new b(this.f33282a, dVarArr2, (size() + dVarArr2[iB].size()) - this.f33283b[iB].size());
            }
            int i11 = i10 | iC;
            d[] dVarArr3 = this.f33283b;
            d[] dVarArr4 = new d[dVarArr3.length + 1];
            System.arraycopy(dVarArr3, 0, dVarArr4, 0, iB);
            dVarArr4[iB] = new c(obj, obj2);
            d[] dVarArr5 = this.f33283b;
            System.arraycopy(dVarArr5, iB, dVarArr4, iB + 1, dVarArr5.length - iB);
            return new b(i11, dVarArr4, size() + 1);
        }

        @Override // io.grpc.q0.d
        public int size() {
            return this.f33284c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CompressedIndex(");
            sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.f33282a)));
            for (d dVar : this.f33283b) {
                sb.append(dVar);
                sb.append(Q7.X.SPACE);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final Object f33285a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f33286b;

        public c(Object obj, Object obj2) {
            this.f33285a = obj;
            this.f33286b = obj2;
        }

        @Override // io.grpc.q0.d
        public Object get(Object obj, int i8, int i9) {
            if (this.f33285a == obj) {
                return this.f33286b;
            }
            return null;
        }

        @Override // io.grpc.q0.d
        public d put(Object obj, Object obj2, int i8, int i9) {
            int iHashCode = this.f33285a.hashCode();
            return iHashCode != i8 ? b.a(new c(obj, obj2), i8, this, iHashCode, i9) : this.f33285a == obj ? new c(obj, obj2) : new a(this.f33285a, this.f33286b, obj, obj2);
        }

        @Override // io.grpc.q0.d
        public int size() {
            return 1;
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.f33285a, this.f33286b);
        }
    }

    interface d {
        Object get(Object obj, int i8, int i9);

        d put(Object obj, Object obj2, int i8, int i9);

        int size();
    }

    static Object a(d dVar, Object obj) {
        if (dVar == null) {
            return null;
        }
        return dVar.get(obj, obj.hashCode(), 0);
    }

    static d b(d dVar, Object obj, Object obj2) {
        return dVar == null ? new c(obj, obj2) : dVar.put(obj, obj2, obj.hashCode(), 0);
    }
}
