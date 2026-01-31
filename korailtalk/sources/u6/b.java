package U6;

import R6.A;
import R6.B;
import R6.D;
import R6.E;
import R6.J;
import R6.w;
import R6.x;
import R6.y;
import R6.z;
import S6.AbstractC0759c;
import S6.AbstractC0765i;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class b {

    public static final class a extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ int[] f5049a;

        a(int[] iArr) {
            this.f5049a = iArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof y) {
                return m171containsWZ4Q5Ns(((y) obj).m107unboximpl());
            }
            return false;
        }

        /* renamed from: contains-WZ4Q5Ns */
        public boolean m171containsWZ4Q5Ns(int i8) {
            return z.m111containsWZ4Q5Ns(this.f5049a, i8);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i8) {
            return y.m101boximpl(m172getpVg5ArA(i8));
        }

        /* renamed from: get-pVg5ArA */
        public int m172getpVg5ArA(int i8) {
            return z.m115getpVg5ArA(this.f5049a, i8);
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return z.m116getSizeimpl(this.f5049a);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof y) {
                return m173indexOfWZ4Q5Ns(((y) obj).m107unboximpl());
            }
            return -1;
        }

        /* renamed from: indexOf-WZ4Q5Ns */
        public int m173indexOfWZ4Q5Ns(int i8) {
            return AbstractC0765i.indexOf(this.f5049a, i8);
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return z.m118isEmptyimpl(this.f5049a);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof y) {
                return m174lastIndexOfWZ4Q5Ns(((y) obj).m107unboximpl());
            }
            return -1;
        }

        /* renamed from: lastIndexOf-WZ4Q5Ns */
        public int m174lastIndexOfWZ4Q5Ns(int i8) {
            return AbstractC0765i.lastIndexOf(this.f5049a, i8);
        }
    }

    /* renamed from: U6.b$b */
    public static final class C0080b extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ long[] f5050a;

        C0080b(long[] jArr) {
            this.f5050a = jArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof A) {
                return m175containsVKZWuLQ(((A) obj).m18unboximpl());
            }
            return false;
        }

        /* renamed from: contains-VKZWuLQ */
        public boolean m175containsVKZWuLQ(long j8) {
            return B.m22containsVKZWuLQ(this.f5050a, j8);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i8) {
            return A.m12boximpl(m176getsVKNKU(i8));
        }

        /* renamed from: get-s-VKNKU */
        public long m176getsVKNKU(int i8) {
            return B.m26getsVKNKU(this.f5050a, i8);
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return B.m27getSizeimpl(this.f5050a);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof A) {
                return m177indexOfVKZWuLQ(((A) obj).m18unboximpl());
            }
            return -1;
        }

        /* renamed from: indexOf-VKZWuLQ */
        public int m177indexOfVKZWuLQ(long j8) {
            return AbstractC0765i.indexOf(this.f5050a, j8);
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return B.m29isEmptyimpl(this.f5050a);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof A) {
                return m178lastIndexOfVKZWuLQ(((A) obj).m18unboximpl());
            }
            return -1;
        }

        /* renamed from: lastIndexOf-VKZWuLQ */
        public int m178lastIndexOfVKZWuLQ(long j8) {
            return AbstractC0765i.lastIndexOf(this.f5050a, j8);
        }
    }

    public static final class c extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ byte[] f5051a;

        c(byte[] bArr) {
            this.f5051a = bArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof w) {
                return m179contains7apg3OU(((w) obj).m82unboximpl());
            }
            return false;
        }

        /* renamed from: contains-7apg3OU */
        public boolean m179contains7apg3OU(byte b9) {
            return x.m86contains7apg3OU(this.f5051a, b9);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i8) {
            return w.m76boximpl(m180getw2LRezQ(i8));
        }

        /* renamed from: get-w2LRezQ */
        public byte m180getw2LRezQ(int i8) {
            return x.m90getw2LRezQ(this.f5051a, i8);
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return x.m91getSizeimpl(this.f5051a);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof w) {
                return m181indexOf7apg3OU(((w) obj).m82unboximpl());
            }
            return -1;
        }

        /* renamed from: indexOf-7apg3OU */
        public int m181indexOf7apg3OU(byte b9) {
            return AbstractC0765i.indexOf(this.f5051a, b9);
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return x.m93isEmptyimpl(this.f5051a);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof w) {
                return m182lastIndexOf7apg3OU(((w) obj).m82unboximpl());
            }
            return -1;
        }

        /* renamed from: lastIndexOf-7apg3OU */
        public int m182lastIndexOf7apg3OU(byte b9) {
            return AbstractC0765i.lastIndexOf(this.f5051a, b9);
        }
    }

    public static final class d extends AbstractC0759c implements RandomAccess {

        /* renamed from: a */
        final /* synthetic */ short[] f5052a;

        d(short[] sArr) {
            this.f5052a = sArr;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof D) {
                return m183containsxj2QHRw(((D) obj).m43unboximpl());
            }
            return false;
        }

        /* renamed from: contains-xj2QHRw */
        public boolean m183containsxj2QHRw(short s8) {
            return E.m47containsxj2QHRw(this.f5052a, s8);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i8) {
            return D.m37boximpl(m184getMh2AYeg(i8));
        }

        /* renamed from: get-Mh2AYeg */
        public short m184getMh2AYeg(int i8) {
            return E.m51getMh2AYeg(this.f5052a, i8);
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return E.m52getSizeimpl(this.f5052a);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof D) {
                return m185indexOfxj2QHRw(((D) obj).m43unboximpl());
            }
            return -1;
        }

        /* renamed from: indexOf-xj2QHRw */
        public int m185indexOfxj2QHRw(short s8) {
            return AbstractC0765i.indexOf(this.f5052a, s8);
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return E.m54isEmptyimpl(this.f5052a);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof D) {
                return m186lastIndexOfxj2QHRw(((D) obj).m43unboximpl());
            }
            return -1;
        }

        /* renamed from: lastIndexOf-xj2QHRw */
        public int m186lastIndexOfxj2QHRw(short s8) {
            return AbstractC0765i.lastIndexOf(this.f5052a, s8);
        }
    }

    /* renamed from: asList--ajY-9A */
    public static final List<y> m143asListajY9A(int[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new a(asList);
    }

    /* renamed from: asList-GBYM_sE */
    public static final List<w> m144asListGBYM_sE(byte[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new c(asList);
    }

    /* renamed from: asList-QwZRm1k */
    public static final List<A> m145asListQwZRm1k(long[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new C0080b(asList);
    }

    /* renamed from: asList-rL5Bavg */
    public static final List<D> m146asListrL5Bavg(short[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new d(asList);
    }

    /* renamed from: binarySearch-2fe2U9s */
    public static final int m147binarySearch2fe2U9s(int[] binarySearch, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i9, i10, z.m116getSizeimpl(binarySearch));
        int i11 = i10 - 1;
        while (i9 <= i11) {
            int i12 = (i9 + i11) >>> 1;
            int iUintCompare = J.uintCompare(binarySearch[i12], i8);
            if (iUintCompare < 0) {
                i9 = i12 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i9 + 1);
    }

    /* renamed from: binarySearch-2fe2U9s$default */
    public static /* synthetic */ int m148binarySearch2fe2U9s$default(int[] iArr, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = z.m116getSizeimpl(iArr);
        }
        return m147binarySearch2fe2U9s(iArr, i8, i9, i10);
    }

    /* renamed from: binarySearch-EtDCXyQ */
    public static final int m149binarySearchEtDCXyQ(short[] binarySearch, short s8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, E.m52getSizeimpl(binarySearch));
        int i10 = s8 & D.MAX_VALUE;
        int i11 = i9 - 1;
        while (i8 <= i11) {
            int i12 = (i8 + i11) >>> 1;
            int iUintCompare = J.uintCompare(binarySearch[i12], i10);
            if (iUintCompare < 0) {
                i8 = i12 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i8 + 1);
    }

    /* renamed from: binarySearch-EtDCXyQ$default */
    public static /* synthetic */ int m150binarySearchEtDCXyQ$default(short[] sArr, short s8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = E.m52getSizeimpl(sArr);
        }
        return m149binarySearchEtDCXyQ(sArr, s8, i8, i9);
    }

    /* renamed from: binarySearch-K6DWlUc */
    public static final int m151binarySearchK6DWlUc(long[] binarySearch, long j8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, B.m27getSizeimpl(binarySearch));
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int iUlongCompare = J.ulongCompare(binarySearch[i11], j8);
            if (iUlongCompare < 0) {
                i8 = i11 + 1;
            } else {
                if (iUlongCompare <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i8 + 1);
    }

    /* renamed from: binarySearch-K6DWlUc$default */
    public static /* synthetic */ int m152binarySearchK6DWlUc$default(long[] jArr, long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = B.m27getSizeimpl(jArr);
        }
        return m151binarySearchK6DWlUc(jArr, j8, i8, i9);
    }

    /* renamed from: binarySearch-WpHrYlw */
    public static final int m153binarySearchWpHrYlw(byte[] binarySearch, byte b9, int i8, int i9) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, x.m91getSizeimpl(binarySearch));
        int i10 = b9 & 255;
        int i11 = i9 - 1;
        while (i8 <= i11) {
            int i12 = (i8 + i11) >>> 1;
            int iUintCompare = J.uintCompare(binarySearch[i12], i10);
            if (iUintCompare < 0) {
                i8 = i12 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i8 + 1);
    }

    /* renamed from: binarySearch-WpHrYlw$default */
    public static /* synthetic */ int m154binarySearchWpHrYlw$default(byte[] bArr, byte b9, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = x.m91getSizeimpl(bArr);
        }
        return m153binarySearchWpHrYlw(bArr, b9, i8, i9);
    }

    /* renamed from: max--ajY-9A */
    public static final /* synthetic */ y m155maxajY9A(int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return U6.c.m243maxOrNullajY9A(max);
    }

    /* renamed from: max-GBYM_sE */
    public static final /* synthetic */ w m156maxGBYM_sE(byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return U6.c.m244maxOrNullGBYM_sE(max);
    }

    /* renamed from: max-QwZRm1k */
    public static final /* synthetic */ A m157maxQwZRm1k(long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return U6.c.m245maxOrNullQwZRm1k(max);
    }

    /* renamed from: max-rL5Bavg */
    public static final /* synthetic */ D m158maxrL5Bavg(short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return U6.c.m246maxOrNullrL5Bavg(max);
    }

    /* renamed from: maxWith-XMRcp5o */
    public static final /* synthetic */ w m159maxWithXMRcp5o(byte[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return U6.c.m251maxWithOrNullXMRcp5o(maxWith, comparator);
    }

    /* renamed from: maxWith-YmdZ_VM */
    public static final /* synthetic */ y m160maxWithYmdZ_VM(int[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return U6.c.m252maxWithOrNullYmdZ_VM(maxWith, comparator);
    }

    /* renamed from: maxWith-eOHTfZs */
    public static final /* synthetic */ D m161maxWitheOHTfZs(short[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return U6.c.m253maxWithOrNulleOHTfZs(maxWith, comparator);
    }

    /* renamed from: maxWith-zrEWJaI */
    public static final /* synthetic */ A m162maxWithzrEWJaI(long[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return U6.c.m254maxWithOrNullzrEWJaI(maxWith, comparator);
    }

    /* renamed from: min--ajY-9A */
    public static final /* synthetic */ y m163minajY9A(int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return U6.c.m259minOrNullajY9A(min);
    }

    /* renamed from: min-GBYM_sE */
    public static final /* synthetic */ w m164minGBYM_sE(byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return U6.c.m260minOrNullGBYM_sE(min);
    }

    /* renamed from: min-QwZRm1k */
    public static final /* synthetic */ A m165minQwZRm1k(long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return U6.c.m261minOrNullQwZRm1k(min);
    }

    /* renamed from: min-rL5Bavg */
    public static final /* synthetic */ D m166minrL5Bavg(short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return U6.c.m262minOrNullrL5Bavg(min);
    }

    /* renamed from: minWith-XMRcp5o */
    public static final /* synthetic */ w m167minWithXMRcp5o(byte[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return U6.c.m267minWithOrNullXMRcp5o(minWith, comparator);
    }

    /* renamed from: minWith-YmdZ_VM */
    public static final /* synthetic */ y m168minWithYmdZ_VM(int[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return U6.c.m268minWithOrNullYmdZ_VM(minWith, comparator);
    }

    /* renamed from: minWith-eOHTfZs */
    public static final /* synthetic */ D m169minWitheOHTfZs(short[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return U6.c.m269minWithOrNulleOHTfZs(minWith, comparator);
    }

    /* renamed from: minWith-zrEWJaI */
    public static final /* synthetic */ A m170minWithzrEWJaI(long[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return U6.c.m270minWithOrNullzrEWJaI(minWith, comparator);
    }
}
