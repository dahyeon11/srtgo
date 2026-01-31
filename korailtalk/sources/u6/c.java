package U6;

import R6.A;
import R6.B;
import R6.D;
import R6.E;
import R6.p;
import R6.v;
import R6.w;
import R6.x;
import R6.y;
import R6.z;
import S6.AbstractC0759c;
import S6.AbstractC0765i;
import S6.J;
import S6.K;
import S6.M;
import S6.l0;
import S6.r;
import f7.InterfaceC5519a;
import h7.f;
import j7.l;
import j7.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c extends U6.b {

    static final class a extends Lambda implements InterfaceC5519a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f5053a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int[] iArr) {
            super(0);
            this.f5053a = iArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<y> invoke() {
            return z.m119iteratorimpl(this.f5053a);
        }
    }

    static final class b extends Lambda implements InterfaceC5519a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long[] f5054a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long[] jArr) {
            super(0);
            this.f5054a = jArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<A> invoke() {
            return B.m30iteratorimpl(this.f5054a);
        }
    }

    /* renamed from: U6.c$c, reason: collision with other inner class name */
    static final class C0081c extends Lambda implements InterfaceC5519a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f5055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0081c(byte[] bArr) {
            super(0);
            this.f5055a = bArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<w> invoke() {
            return x.m94iteratorimpl(this.f5055a);
        }
    }

    static final class d extends Lambda implements InterfaceC5519a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ short[] f5056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(short[] sArr) {
            super(0);
            this.f5056a = sArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<D> invoke() {
            return E.m55iteratorimpl(this.f5056a);
        }
    }

    /* renamed from: contentEquals-FGO6Aew, reason: not valid java name */
    public static boolean m187contentEqualsFGO6Aew(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    /* renamed from: contentEquals-KJPZfPQ, reason: not valid java name */
    public static boolean m188contentEqualsKJPZfPQ(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    /* renamed from: contentEquals-kV0jMPg, reason: not valid java name */
    public static boolean m189contentEqualskV0jMPg(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: contentEquals-lec5QzE, reason: not valid java name */
    public static boolean m190contentEqualslec5QzE(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    /* renamed from: contentHashCode-2csIQuQ, reason: not valid java name */
    public static final int m191contentHashCode2csIQuQ(byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    /* renamed from: contentHashCode-XUkPCBk, reason: not valid java name */
    public static final int m192contentHashCodeXUkPCBk(int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    /* renamed from: contentHashCode-d-6D3K8, reason: not valid java name */
    public static final int m193contentHashCoded6D3K8(short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    /* renamed from: contentHashCode-uLth9ew, reason: not valid java name */
    public static final int m194contentHashCodeuLth9ew(long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    /* renamed from: contentToString-2csIQuQ, reason: not valid java name */
    public static String m195contentToString2csIQuQ(byte[] bArr) {
        String strJoinToString$default;
        return (bArr == null || (strJoinToString$default = r.joinToString$default(x.m83boximpl(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    /* renamed from: contentToString-XUkPCBk, reason: not valid java name */
    public static String m196contentToStringXUkPCBk(int[] iArr) {
        String strJoinToString$default;
        return (iArr == null || (strJoinToString$default = r.joinToString$default(z.m108boximpl(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    /* renamed from: contentToString-d-6D3K8, reason: not valid java name */
    public static String m197contentToStringd6D3K8(short[] sArr) {
        String strJoinToString$default;
        return (sArr == null || (strJoinToString$default = r.joinToString$default(E.m44boximpl(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    /* renamed from: contentToString-uLth9ew, reason: not valid java name */
    public static String m198contentToStringuLth9ew(long[] jArr) {
        String strJoinToString$default;
        return (jArr == null || (strJoinToString$default = r.joinToString$default(B.m19boximpl(jArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : strJoinToString$default;
    }

    /* renamed from: drop-PpDY95g, reason: not valid java name */
    public static final List<w> m199dropPpDY95g(byte[] drop, int i8) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i8 >= 0) {
            return m359takeLastPpDY95g(drop, s.coerceAtLeast(x.m91getSizeimpl(drop) - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: drop-nggk6HY, reason: not valid java name */
    public static final List<D> m200dropnggk6HY(short[] drop, int i8) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i8 >= 0) {
            return m360takeLastnggk6HY(drop, s.coerceAtLeast(E.m52getSizeimpl(drop) - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: drop-qFRl0hI, reason: not valid java name */
    public static final List<y> m201dropqFRl0hI(int[] drop, int i8) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i8 >= 0) {
            return m361takeLastqFRl0hI(drop, s.coerceAtLeast(z.m116getSizeimpl(drop) - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: drop-r7IrZao, reason: not valid java name */
    public static final List<A> m202dropr7IrZao(long[] drop, int i8) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i8 >= 0) {
            return m362takeLastr7IrZao(drop, s.coerceAtLeast(B.m27getSizeimpl(drop) - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: dropLast-PpDY95g, reason: not valid java name */
    public static final List<w> m203dropLastPpDY95g(byte[] dropLast, int i8) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i8 >= 0) {
            return m355takePpDY95g(dropLast, s.coerceAtLeast(x.m91getSizeimpl(dropLast) - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: dropLast-nggk6HY, reason: not valid java name */
    public static final List<D> m204dropLastnggk6HY(short[] dropLast, int i8) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i8 >= 0) {
            return m356takenggk6HY(dropLast, s.coerceAtLeast(E.m52getSizeimpl(dropLast) - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: dropLast-qFRl0hI, reason: not valid java name */
    public static final List<y> m205dropLastqFRl0hI(int[] dropLast, int i8) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i8 >= 0) {
            return m357takeqFRl0hI(dropLast, s.coerceAtLeast(z.m116getSizeimpl(dropLast) - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: dropLast-r7IrZao, reason: not valid java name */
    public static final List<A> m206dropLastr7IrZao(long[] dropLast, int i8) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i8 >= 0) {
            return m358taker7IrZao(dropLast, s.coerceAtLeast(B.m27getSizeimpl(dropLast) - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    /* renamed from: fill-2fe2U9s, reason: not valid java name */
    public static final void m207fill2fe2U9s(int[] fill, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        AbstractC0765i.fill(fill, i8, i9, i10);
    }

    /* renamed from: fill-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ void m208fill2fe2U9s$default(int[] iArr, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = z.m116getSizeimpl(iArr);
        }
        m207fill2fe2U9s(iArr, i8, i9, i10);
    }

    /* renamed from: fill-EtDCXyQ, reason: not valid java name */
    public static final void m209fillEtDCXyQ(short[] fill, short s8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        AbstractC0765i.fill(fill, s8, i8, i9);
    }

    /* renamed from: fill-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ void m210fillEtDCXyQ$default(short[] sArr, short s8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = E.m52getSizeimpl(sArr);
        }
        m209fillEtDCXyQ(sArr, s8, i8, i9);
    }

    /* renamed from: fill-K6DWlUc, reason: not valid java name */
    public static final void m211fillK6DWlUc(long[] fill, long j8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        AbstractC0765i.fill(fill, j8, i8, i9);
    }

    /* renamed from: fill-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ void m212fillK6DWlUc$default(long[] jArr, long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = B.m27getSizeimpl(jArr);
        }
        m211fillK6DWlUc(jArr, j8, i8, i9);
    }

    /* renamed from: fill-WpHrYlw, reason: not valid java name */
    public static final void m213fillWpHrYlw(byte[] fill, byte b9, int i8, int i9) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        AbstractC0765i.fill(fill, b9, i8, i9);
    }

    /* renamed from: fill-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ void m214fillWpHrYlw$default(byte[] bArr, byte b9, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = x.m91getSizeimpl(bArr);
        }
        m213fillWpHrYlw(bArr, b9, i8, i9);
    }

    /* renamed from: firstOrNull--ajY-9A, reason: not valid java name */
    public static final y m215firstOrNullajY9A(int[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (z.m118isEmptyimpl(firstOrNull)) {
            return null;
        }
        return y.m101boximpl(z.m115getpVg5ArA(firstOrNull, 0));
    }

    /* renamed from: firstOrNull-GBYM_sE, reason: not valid java name */
    public static final w m216firstOrNullGBYM_sE(byte[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (x.m93isEmptyimpl(firstOrNull)) {
            return null;
        }
        return w.m76boximpl(x.m90getw2LRezQ(firstOrNull, 0));
    }

    /* renamed from: firstOrNull-QwZRm1k, reason: not valid java name */
    public static final A m217firstOrNullQwZRm1k(long[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (B.m29isEmptyimpl(firstOrNull)) {
            return null;
        }
        return A.m12boximpl(B.m26getsVKNKU(firstOrNull, 0));
    }

    /* renamed from: firstOrNull-rL5Bavg, reason: not valid java name */
    public static final D m218firstOrNullrL5Bavg(short[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (E.m54isEmptyimpl(firstOrNull)) {
            return null;
        }
        return D.m37boximpl(E.m51getMh2AYeg(firstOrNull, 0));
    }

    /* renamed from: getIndices--ajY-9A, reason: not valid java name */
    public static final l m219getIndicesajY9A(int[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return AbstractC0765i.getIndices(indices);
    }

    /* renamed from: getIndices-GBYM_sE, reason: not valid java name */
    public static final l m221getIndicesGBYM_sE(byte[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return AbstractC0765i.getIndices(indices);
    }

    /* renamed from: getIndices-QwZRm1k, reason: not valid java name */
    public static final l m223getIndicesQwZRm1k(long[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return AbstractC0765i.getIndices(indices);
    }

    /* renamed from: getIndices-rL5Bavg, reason: not valid java name */
    public static final l m225getIndicesrL5Bavg(short[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return AbstractC0765i.getIndices(indices);
    }

    /* renamed from: getLastIndex--ajY-9A, reason: not valid java name */
    public static final int m227getLastIndexajY9A(int[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return AbstractC0765i.getLastIndex(lastIndex);
    }

    /* renamed from: getLastIndex-GBYM_sE, reason: not valid java name */
    public static final int m229getLastIndexGBYM_sE(byte[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return AbstractC0765i.getLastIndex(lastIndex);
    }

    /* renamed from: getLastIndex-QwZRm1k, reason: not valid java name */
    public static final int m231getLastIndexQwZRm1k(long[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return AbstractC0765i.getLastIndex(lastIndex);
    }

    /* renamed from: getLastIndex-rL5Bavg, reason: not valid java name */
    public static final int m233getLastIndexrL5Bavg(short[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return AbstractC0765i.getLastIndex(lastIndex);
    }

    /* renamed from: getOrNull-PpDY95g, reason: not valid java name */
    public static final w m235getOrNullPpDY95g(byte[] getOrNull, int i8) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i8 < 0 || i8 > AbstractC0765i.getLastIndex(getOrNull)) {
            return null;
        }
        return w.m76boximpl(x.m90getw2LRezQ(getOrNull, i8));
    }

    /* renamed from: getOrNull-nggk6HY, reason: not valid java name */
    public static final D m236getOrNullnggk6HY(short[] getOrNull, int i8) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i8 < 0 || i8 > AbstractC0765i.getLastIndex(getOrNull)) {
            return null;
        }
        return D.m37boximpl(E.m51getMh2AYeg(getOrNull, i8));
    }

    /* renamed from: getOrNull-qFRl0hI, reason: not valid java name */
    public static final y m237getOrNullqFRl0hI(int[] getOrNull, int i8) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i8 < 0 || i8 > AbstractC0765i.getLastIndex(getOrNull)) {
            return null;
        }
        return y.m101boximpl(z.m115getpVg5ArA(getOrNull, i8));
    }

    /* renamed from: getOrNull-r7IrZao, reason: not valid java name */
    public static final A m238getOrNullr7IrZao(long[] getOrNull, int i8) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i8 < 0 || i8 > AbstractC0765i.getLastIndex(getOrNull)) {
            return null;
        }
        return A.m12boximpl(B.m26getsVKNKU(getOrNull, i8));
    }

    /* renamed from: lastOrNull--ajY-9A, reason: not valid java name */
    public static final y m239lastOrNullajY9A(int[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (z.m118isEmptyimpl(lastOrNull)) {
            return null;
        }
        return y.m101boximpl(z.m115getpVg5ArA(lastOrNull, z.m116getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: lastOrNull-GBYM_sE, reason: not valid java name */
    public static final w m240lastOrNullGBYM_sE(byte[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (x.m93isEmptyimpl(lastOrNull)) {
            return null;
        }
        return w.m76boximpl(x.m90getw2LRezQ(lastOrNull, x.m91getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: lastOrNull-QwZRm1k, reason: not valid java name */
    public static final A m241lastOrNullQwZRm1k(long[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (B.m29isEmptyimpl(lastOrNull)) {
            return null;
        }
        return A.m12boximpl(B.m26getsVKNKU(lastOrNull, B.m27getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: lastOrNull-rL5Bavg, reason: not valid java name */
    public static final D m242lastOrNullrL5Bavg(short[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (E.m54isEmptyimpl(lastOrNull)) {
            return null;
        }
        return D.m37boximpl(E.m51getMh2AYeg(lastOrNull, E.m52getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: maxOrNull--ajY-9A, reason: not valid java name */
    public static final y m243maxOrNullajY9A(int[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (z.m118isEmptyimpl(maxOrNull)) {
            return null;
        }
        int iM115getpVg5ArA = z.m115getpVg5ArA(maxOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            int iM115getpVg5ArA2 = z.m115getpVg5ArA(maxOrNull, it.nextInt());
            if (Integer.compare(iM115getpVg5ArA ^ Integer.MIN_VALUE, iM115getpVg5ArA2 ^ Integer.MIN_VALUE) < 0) {
                iM115getpVg5ArA = iM115getpVg5ArA2;
            }
        }
        return y.m101boximpl(iM115getpVg5ArA);
    }

    /* renamed from: maxOrNull-GBYM_sE, reason: not valid java name */
    public static final w m244maxOrNullGBYM_sE(byte[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (x.m93isEmptyimpl(maxOrNull)) {
            return null;
        }
        byte bM90getw2LRezQ = x.m90getw2LRezQ(maxOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            byte bM90getw2LRezQ2 = x.m90getw2LRezQ(maxOrNull, it.nextInt());
            if (Intrinsics.compare(bM90getw2LRezQ & 255, bM90getw2LRezQ2 & 255) < 0) {
                bM90getw2LRezQ = bM90getw2LRezQ2;
            }
        }
        return w.m76boximpl(bM90getw2LRezQ);
    }

    /* renamed from: maxOrNull-QwZRm1k, reason: not valid java name */
    public static final A m245maxOrNullQwZRm1k(long[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (B.m29isEmptyimpl(maxOrNull)) {
            return null;
        }
        long jM26getsVKNKU = B.m26getsVKNKU(maxOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            long jM26getsVKNKU2 = B.m26getsVKNKU(maxOrNull, it.nextInt());
            if (Long.compare(jM26getsVKNKU ^ Long.MIN_VALUE, jM26getsVKNKU2 ^ Long.MIN_VALUE) < 0) {
                jM26getsVKNKU = jM26getsVKNKU2;
            }
        }
        return A.m12boximpl(jM26getsVKNKU);
    }

    /* renamed from: maxOrNull-rL5Bavg, reason: not valid java name */
    public static final D m246maxOrNullrL5Bavg(short[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (E.m54isEmptyimpl(maxOrNull)) {
            return null;
        }
        short sM51getMh2AYeg = E.m51getMh2AYeg(maxOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            short sM51getMh2AYeg2 = E.m51getMh2AYeg(maxOrNull, it.nextInt());
            if (Intrinsics.compare(sM51getMh2AYeg & D.MAX_VALUE, 65535 & sM51getMh2AYeg2) < 0) {
                sM51getMh2AYeg = sM51getMh2AYeg2;
            }
        }
        return D.m37boximpl(sM51getMh2AYeg);
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final int m248maxOrThrowU(int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (z.m118isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        int iM115getpVg5ArA = z.m115getpVg5ArA(max, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(max)).iterator();
        while (it.hasNext()) {
            int iM115getpVg5ArA2 = z.m115getpVg5ArA(max, it.nextInt());
            if (Integer.compare(iM115getpVg5ArA ^ Integer.MIN_VALUE, iM115getpVg5ArA2 ^ Integer.MIN_VALUE) < 0) {
                iM115getpVg5ArA = iM115getpVg5ArA2;
            }
        }
        return iM115getpVg5ArA;
    }

    /* renamed from: maxWithOrNull-XMRcp5o, reason: not valid java name */
    public static final w m251maxWithOrNullXMRcp5o(byte[] maxWithOrNull, Comparator<? super w> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (x.m93isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        byte bM90getw2LRezQ = x.m90getw2LRezQ(maxWithOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            byte bM90getw2LRezQ2 = x.m90getw2LRezQ(maxWithOrNull, it.nextInt());
            if (comparator.compare(w.m76boximpl(bM90getw2LRezQ), w.m76boximpl(bM90getw2LRezQ2)) < 0) {
                bM90getw2LRezQ = bM90getw2LRezQ2;
            }
        }
        return w.m76boximpl(bM90getw2LRezQ);
    }

    /* renamed from: maxWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final y m252maxWithOrNullYmdZ_VM(int[] maxWithOrNull, Comparator<? super y> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (z.m118isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        int iM115getpVg5ArA = z.m115getpVg5ArA(maxWithOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            int iM115getpVg5ArA2 = z.m115getpVg5ArA(maxWithOrNull, it.nextInt());
            if (comparator.compare(y.m101boximpl(iM115getpVg5ArA), y.m101boximpl(iM115getpVg5ArA2)) < 0) {
                iM115getpVg5ArA = iM115getpVg5ArA2;
            }
        }
        return y.m101boximpl(iM115getpVg5ArA);
    }

    /* renamed from: maxWithOrNull-eOHTfZs, reason: not valid java name */
    public static final D m253maxWithOrNulleOHTfZs(short[] maxWithOrNull, Comparator<? super D> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (E.m54isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        short sM51getMh2AYeg = E.m51getMh2AYeg(maxWithOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            short sM51getMh2AYeg2 = E.m51getMh2AYeg(maxWithOrNull, it.nextInt());
            if (comparator.compare(D.m37boximpl(sM51getMh2AYeg), D.m37boximpl(sM51getMh2AYeg2)) < 0) {
                sM51getMh2AYeg = sM51getMh2AYeg2;
            }
        }
        return D.m37boximpl(sM51getMh2AYeg);
    }

    /* renamed from: maxWithOrNull-zrEWJaI, reason: not valid java name */
    public static final A m254maxWithOrNullzrEWJaI(long[] maxWithOrNull, Comparator<? super A> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (B.m29isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        long jM26getsVKNKU = B.m26getsVKNKU(maxWithOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            long jM26getsVKNKU2 = B.m26getsVKNKU(maxWithOrNull, it.nextInt());
            if (comparator.compare(A.m12boximpl(jM26getsVKNKU), A.m12boximpl(jM26getsVKNKU2)) < 0) {
                jM26getsVKNKU = jM26getsVKNKU2;
            }
        }
        return A.m12boximpl(jM26getsVKNKU);
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final int m256maxWithOrThrowU(int[] maxWith, Comparator<? super y> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (z.m118isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        int iM115getpVg5ArA = z.m115getpVg5ArA(maxWith, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(maxWith)).iterator();
        while (it.hasNext()) {
            int iM115getpVg5ArA2 = z.m115getpVg5ArA(maxWith, it.nextInt());
            if (comparator.compare(y.m101boximpl(iM115getpVg5ArA), y.m101boximpl(iM115getpVg5ArA2)) < 0) {
                iM115getpVg5ArA = iM115getpVg5ArA2;
            }
        }
        return iM115getpVg5ArA;
    }

    /* renamed from: minOrNull--ajY-9A, reason: not valid java name */
    public static final y m259minOrNullajY9A(int[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (z.m118isEmptyimpl(minOrNull)) {
            return null;
        }
        int iM115getpVg5ArA = z.m115getpVg5ArA(minOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            int iM115getpVg5ArA2 = z.m115getpVg5ArA(minOrNull, it.nextInt());
            if (Integer.compare(iM115getpVg5ArA ^ Integer.MIN_VALUE, iM115getpVg5ArA2 ^ Integer.MIN_VALUE) > 0) {
                iM115getpVg5ArA = iM115getpVg5ArA2;
            }
        }
        return y.m101boximpl(iM115getpVg5ArA);
    }

    /* renamed from: minOrNull-GBYM_sE, reason: not valid java name */
    public static final w m260minOrNullGBYM_sE(byte[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (x.m93isEmptyimpl(minOrNull)) {
            return null;
        }
        byte bM90getw2LRezQ = x.m90getw2LRezQ(minOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            byte bM90getw2LRezQ2 = x.m90getw2LRezQ(minOrNull, it.nextInt());
            if (Intrinsics.compare(bM90getw2LRezQ & 255, bM90getw2LRezQ2 & 255) > 0) {
                bM90getw2LRezQ = bM90getw2LRezQ2;
            }
        }
        return w.m76boximpl(bM90getw2LRezQ);
    }

    /* renamed from: minOrNull-QwZRm1k, reason: not valid java name */
    public static final A m261minOrNullQwZRm1k(long[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (B.m29isEmptyimpl(minOrNull)) {
            return null;
        }
        long jM26getsVKNKU = B.m26getsVKNKU(minOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            long jM26getsVKNKU2 = B.m26getsVKNKU(minOrNull, it.nextInt());
            if (Long.compare(jM26getsVKNKU ^ Long.MIN_VALUE, jM26getsVKNKU2 ^ Long.MIN_VALUE) > 0) {
                jM26getsVKNKU = jM26getsVKNKU2;
            }
        }
        return A.m12boximpl(jM26getsVKNKU);
    }

    /* renamed from: minOrNull-rL5Bavg, reason: not valid java name */
    public static final D m262minOrNullrL5Bavg(short[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (E.m54isEmptyimpl(minOrNull)) {
            return null;
        }
        short sM51getMh2AYeg = E.m51getMh2AYeg(minOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            short sM51getMh2AYeg2 = E.m51getMh2AYeg(minOrNull, it.nextInt());
            if (Intrinsics.compare(sM51getMh2AYeg & D.MAX_VALUE, 65535 & sM51getMh2AYeg2) > 0) {
                sM51getMh2AYeg = sM51getMh2AYeg2;
            }
        }
        return D.m37boximpl(sM51getMh2AYeg);
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final int m264minOrThrowU(int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (z.m118isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        int iM115getpVg5ArA = z.m115getpVg5ArA(min, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(min)).iterator();
        while (it.hasNext()) {
            int iM115getpVg5ArA2 = z.m115getpVg5ArA(min, it.nextInt());
            if (Integer.compare(iM115getpVg5ArA ^ Integer.MIN_VALUE, iM115getpVg5ArA2 ^ Integer.MIN_VALUE) > 0) {
                iM115getpVg5ArA = iM115getpVg5ArA2;
            }
        }
        return iM115getpVg5ArA;
    }

    /* renamed from: minWithOrNull-XMRcp5o, reason: not valid java name */
    public static final w m267minWithOrNullXMRcp5o(byte[] minWithOrNull, Comparator<? super w> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (x.m93isEmptyimpl(minWithOrNull)) {
            return null;
        }
        byte bM90getw2LRezQ = x.m90getw2LRezQ(minWithOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            byte bM90getw2LRezQ2 = x.m90getw2LRezQ(minWithOrNull, it.nextInt());
            if (comparator.compare(w.m76boximpl(bM90getw2LRezQ), w.m76boximpl(bM90getw2LRezQ2)) > 0) {
                bM90getw2LRezQ = bM90getw2LRezQ2;
            }
        }
        return w.m76boximpl(bM90getw2LRezQ);
    }

    /* renamed from: minWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final y m268minWithOrNullYmdZ_VM(int[] minWithOrNull, Comparator<? super y> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (z.m118isEmptyimpl(minWithOrNull)) {
            return null;
        }
        int iM115getpVg5ArA = z.m115getpVg5ArA(minWithOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            int iM115getpVg5ArA2 = z.m115getpVg5ArA(minWithOrNull, it.nextInt());
            if (comparator.compare(y.m101boximpl(iM115getpVg5ArA), y.m101boximpl(iM115getpVg5ArA2)) > 0) {
                iM115getpVg5ArA = iM115getpVg5ArA2;
            }
        }
        return y.m101boximpl(iM115getpVg5ArA);
    }

    /* renamed from: minWithOrNull-eOHTfZs, reason: not valid java name */
    public static final D m269minWithOrNulleOHTfZs(short[] minWithOrNull, Comparator<? super D> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (E.m54isEmptyimpl(minWithOrNull)) {
            return null;
        }
        short sM51getMh2AYeg = E.m51getMh2AYeg(minWithOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            short sM51getMh2AYeg2 = E.m51getMh2AYeg(minWithOrNull, it.nextInt());
            if (comparator.compare(D.m37boximpl(sM51getMh2AYeg), D.m37boximpl(sM51getMh2AYeg2)) > 0) {
                sM51getMh2AYeg = sM51getMh2AYeg2;
            }
        }
        return D.m37boximpl(sM51getMh2AYeg);
    }

    /* renamed from: minWithOrNull-zrEWJaI, reason: not valid java name */
    public static final A m270minWithOrNullzrEWJaI(long[] minWithOrNull, Comparator<? super A> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (B.m29isEmptyimpl(minWithOrNull)) {
            return null;
        }
        long jM26getsVKNKU = B.m26getsVKNKU(minWithOrNull, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            long jM26getsVKNKU2 = B.m26getsVKNKU(minWithOrNull, it.nextInt());
            if (comparator.compare(A.m12boximpl(jM26getsVKNKU), A.m12boximpl(jM26getsVKNKU2)) > 0) {
                jM26getsVKNKU = jM26getsVKNKU2;
            }
        }
        return A.m12boximpl(jM26getsVKNKU);
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final int m272minWithOrThrowU(int[] minWith, Comparator<? super y> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (z.m118isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        int iM115getpVg5ArA = z.m115getpVg5ArA(minWith, 0);
        M it = new l(1, AbstractC0765i.getLastIndex(minWith)).iterator();
        while (it.hasNext()) {
            int iM115getpVg5ArA2 = z.m115getpVg5ArA(minWith, it.nextInt());
            if (comparator.compare(y.m101boximpl(iM115getpVg5ArA), y.m101boximpl(iM115getpVg5ArA2)) > 0) {
                iM115getpVg5ArA = iM115getpVg5ArA2;
            }
        }
        return iM115getpVg5ArA;
    }

    /* renamed from: plus-CFIt9YE, reason: not valid java name */
    public static final int[] m275plusCFIt9YE(int[] plus, Collection<y> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM116getSizeimpl = z.m116getSizeimpl(plus);
        int[] iArrCopyOf = Arrays.copyOf(plus, z.m116getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        Iterator<y> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[iM116getSizeimpl] = it.next().m107unboximpl();
            iM116getSizeimpl++;
        }
        return z.m110constructorimpl(iArrCopyOf);
    }

    /* renamed from: plus-kzHmqpY, reason: not valid java name */
    public static final long[] m276pluskzHmqpY(long[] plus, Collection<A> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM27getSizeimpl = B.m27getSizeimpl(plus);
        long[] jArrCopyOf = Arrays.copyOf(plus, B.m27getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        Iterator<A> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[iM27getSizeimpl] = it.next().m18unboximpl();
            iM27getSizeimpl++;
        }
        return B.m21constructorimpl(jArrCopyOf);
    }

    /* renamed from: plus-ojwP5H8, reason: not valid java name */
    public static final short[] m277plusojwP5H8(short[] plus, Collection<D> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM52getSizeimpl = E.m52getSizeimpl(plus);
        short[] sArrCopyOf = Arrays.copyOf(plus, E.m52getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        Iterator<D> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[iM52getSizeimpl] = it.next().m43unboximpl();
            iM52getSizeimpl++;
        }
        return E.m46constructorimpl(sArrCopyOf);
    }

    /* renamed from: plus-xo_DsdI, reason: not valid java name */
    public static final byte[] m278plusxo_DsdI(byte[] plus, Collection<w> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iM91getSizeimpl = x.m91getSizeimpl(plus);
        byte[] bArrCopyOf = Arrays.copyOf(plus, x.m91getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        Iterator<w> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[iM91getSizeimpl] = it.next().m82unboximpl();
            iM91getSizeimpl++;
        }
        return x.m85constructorimpl(bArrCopyOf);
    }

    /* renamed from: random-2D5oskM, reason: not valid java name */
    public static final int m279random2D5oskM(int[] random, f random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (z.m118isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return z.m115getpVg5ArA(random, random2.nextInt(z.m116getSizeimpl(random)));
    }

    /* renamed from: random-JzugnMA, reason: not valid java name */
    public static final long m280randomJzugnMA(long[] random, f random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (B.m29isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return B.m26getsVKNKU(random, random2.nextInt(B.m27getSizeimpl(random)));
    }

    /* renamed from: random-oSF2wD8, reason: not valid java name */
    public static final byte m281randomoSF2wD8(byte[] random, f random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (x.m93isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return x.m90getw2LRezQ(random, random2.nextInt(x.m91getSizeimpl(random)));
    }

    /* renamed from: random-s5X_as8, reason: not valid java name */
    public static final short m282randoms5X_as8(short[] random, f random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (E.m54isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return E.m51getMh2AYeg(random, random2.nextInt(E.m52getSizeimpl(random)));
    }

    /* renamed from: randomOrNull-2D5oskM, reason: not valid java name */
    public static final y m283randomOrNull2D5oskM(int[] randomOrNull, f random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (z.m118isEmptyimpl(randomOrNull)) {
            return null;
        }
        return y.m101boximpl(z.m115getpVg5ArA(randomOrNull, random.nextInt(z.m116getSizeimpl(randomOrNull))));
    }

    /* renamed from: randomOrNull-JzugnMA, reason: not valid java name */
    public static final A m284randomOrNullJzugnMA(long[] randomOrNull, f random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (B.m29isEmptyimpl(randomOrNull)) {
            return null;
        }
        return A.m12boximpl(B.m26getsVKNKU(randomOrNull, random.nextInt(B.m27getSizeimpl(randomOrNull))));
    }

    /* renamed from: randomOrNull-oSF2wD8, reason: not valid java name */
    public static final w m285randomOrNulloSF2wD8(byte[] randomOrNull, f random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (x.m93isEmptyimpl(randomOrNull)) {
            return null;
        }
        return w.m76boximpl(x.m90getw2LRezQ(randomOrNull, random.nextInt(x.m91getSizeimpl(randomOrNull))));
    }

    /* renamed from: randomOrNull-s5X_as8, reason: not valid java name */
    public static final D m286randomOrNulls5X_as8(short[] randomOrNull, f random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (E.m54isEmptyimpl(randomOrNull)) {
            return null;
        }
        return D.m37boximpl(E.m51getMh2AYeg(randomOrNull, random.nextInt(E.m52getSizeimpl(randomOrNull))));
    }

    /* renamed from: reversed--ajY-9A, reason: not valid java name */
    public static final List<y> m287reversedajY9A(int[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (z.m118isEmptyimpl(reversed)) {
            return r.emptyList();
        }
        List<y> mutableList = r.toMutableList((Collection) z.m108boximpl(reversed));
        r.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: reversed-GBYM_sE, reason: not valid java name */
    public static final List<w> m288reversedGBYM_sE(byte[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (x.m93isEmptyimpl(reversed)) {
            return r.emptyList();
        }
        List<w> mutableList = r.toMutableList((Collection) x.m83boximpl(reversed));
        r.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: reversed-QwZRm1k, reason: not valid java name */
    public static final List<A> m289reversedQwZRm1k(long[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (B.m29isEmptyimpl(reversed)) {
            return r.emptyList();
        }
        List<A> mutableList = r.toMutableList((Collection) B.m19boximpl(reversed));
        r.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: reversed-rL5Bavg, reason: not valid java name */
    public static final List<D> m290reversedrL5Bavg(short[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (E.m54isEmptyimpl(reversed)) {
            return r.emptyList();
        }
        List<D> mutableList = r.toMutableList((Collection) E.m44boximpl(reversed));
        r.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: shuffle--ajY-9A, reason: not valid java name */
    public static final void m291shuffleajY9A(int[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m292shuffle2D5oskM(shuffle, f.Default);
    }

    /* renamed from: shuffle-2D5oskM, reason: not valid java name */
    public static final void m292shuffle2D5oskM(int[] shuffle, f random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = AbstractC0765i.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            int iM115getpVg5ArA = z.m115getpVg5ArA(shuffle, lastIndex);
            z.m120setVXSXFK8(shuffle, lastIndex, z.m115getpVg5ArA(shuffle, iNextInt));
            z.m120setVXSXFK8(shuffle, iNextInt, iM115getpVg5ArA);
        }
    }

    /* renamed from: shuffle-GBYM_sE, reason: not valid java name */
    public static final void m293shuffleGBYM_sE(byte[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m296shuffleoSF2wD8(shuffle, f.Default);
    }

    /* renamed from: shuffle-JzugnMA, reason: not valid java name */
    public static final void m294shuffleJzugnMA(long[] shuffle, f random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = AbstractC0765i.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            long jM26getsVKNKU = B.m26getsVKNKU(shuffle, lastIndex);
            B.m31setk8EXiF4(shuffle, lastIndex, B.m26getsVKNKU(shuffle, iNextInt));
            B.m31setk8EXiF4(shuffle, iNextInt, jM26getsVKNKU);
        }
    }

    /* renamed from: shuffle-QwZRm1k, reason: not valid java name */
    public static final void m295shuffleQwZRm1k(long[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m294shuffleJzugnMA(shuffle, f.Default);
    }

    /* renamed from: shuffle-oSF2wD8, reason: not valid java name */
    public static final void m296shuffleoSF2wD8(byte[] shuffle, f random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = AbstractC0765i.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            byte bM90getw2LRezQ = x.m90getw2LRezQ(shuffle, lastIndex);
            x.m95setVurrAj0(shuffle, lastIndex, x.m90getw2LRezQ(shuffle, iNextInt));
            x.m95setVurrAj0(shuffle, iNextInt, bM90getw2LRezQ);
        }
    }

    /* renamed from: shuffle-rL5Bavg, reason: not valid java name */
    public static final void m297shufflerL5Bavg(short[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m298shuffles5X_as8(shuffle, f.Default);
    }

    /* renamed from: shuffle-s5X_as8, reason: not valid java name */
    public static final void m298shuffles5X_as8(short[] shuffle, f random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = AbstractC0765i.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            short sM51getMh2AYeg = E.m51getMh2AYeg(shuffle, lastIndex);
            E.m56set01HTLdE(shuffle, lastIndex, E.m51getMh2AYeg(shuffle, iNextInt));
            E.m56set01HTLdE(shuffle, iNextInt, sM51getMh2AYeg);
        }
    }

    /* renamed from: singleOrNull--ajY-9A, reason: not valid java name */
    public static final y m299singleOrNullajY9A(int[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (z.m116getSizeimpl(singleOrNull) == 1) {
            return y.m101boximpl(z.m115getpVg5ArA(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: singleOrNull-GBYM_sE, reason: not valid java name */
    public static final w m300singleOrNullGBYM_sE(byte[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (x.m91getSizeimpl(singleOrNull) == 1) {
            return w.m76boximpl(x.m90getw2LRezQ(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: singleOrNull-QwZRm1k, reason: not valid java name */
    public static final A m301singleOrNullQwZRm1k(long[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (B.m27getSizeimpl(singleOrNull) == 1) {
            return A.m12boximpl(B.m26getsVKNKU(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: singleOrNull-rL5Bavg, reason: not valid java name */
    public static final D m302singleOrNullrL5Bavg(short[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (E.m52getSizeimpl(singleOrNull) == 1) {
            return D.m37boximpl(E.m51getMh2AYeg(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: slice-F7u83W8, reason: not valid java name */
    public static final List<A> m303sliceF7u83W8(long[] slice, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(A.m12boximpl(B.m26getsVKNKU(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-HwE9HBo, reason: not valid java name */
    public static final List<y> m304sliceHwE9HBo(int[] slice, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(y.m101boximpl(z.m115getpVg5ArA(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-JGPC0-M, reason: not valid java name */
    public static final List<D> m305sliceJGPC0M(short[] slice, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(D.m37boximpl(E.m51getMh2AYeg(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-JQknh5Q, reason: not valid java name */
    public static final List<w> m306sliceJQknh5Q(byte[] slice, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(w.m76boximpl(x.m90getw2LRezQ(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-Q6IL4kU, reason: not valid java name */
    public static final List<D> m307sliceQ6IL4kU(short[] slice, l indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? r.emptyList() : U6.b.m146asListrL5Bavg(E.m46constructorimpl(AbstractC0765i.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static final List<A> m308sliceZRhS8yI(long[] slice, l indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? r.emptyList() : U6.b.m145asListQwZRm1k(B.m21constructorimpl(AbstractC0765i.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: slice-c0bezYM, reason: not valid java name */
    public static final List<w> m309slicec0bezYM(byte[] slice, l indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? r.emptyList() : U6.b.m144asListGBYM_sE(x.m85constructorimpl(AbstractC0765i.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: slice-tAntMlw, reason: not valid java name */
    public static final List<y> m310slicetAntMlw(int[] slice, l indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? r.emptyList() : U6.b.m143asListajY9A(z.m110constructorimpl(AbstractC0765i.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: sliceArray-CFIt9YE, reason: not valid java name */
    public static final int[] m311sliceArrayCFIt9YE(int[] sliceArray, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return z.m110constructorimpl(AbstractC0765i.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-Q6IL4kU, reason: not valid java name */
    public static final short[] m312sliceArrayQ6IL4kU(short[] sliceArray, l indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return E.m46constructorimpl(AbstractC0765i.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-ZRhS8yI, reason: not valid java name */
    public static final long[] m313sliceArrayZRhS8yI(long[] sliceArray, l indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return B.m21constructorimpl(AbstractC0765i.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-c0bezYM, reason: not valid java name */
    public static final byte[] m314sliceArrayc0bezYM(byte[] sliceArray, l indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return x.m85constructorimpl(AbstractC0765i.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-kzHmqpY, reason: not valid java name */
    public static final long[] m315sliceArraykzHmqpY(long[] sliceArray, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return B.m21constructorimpl(AbstractC0765i.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-ojwP5H8, reason: not valid java name */
    public static final short[] m316sliceArrayojwP5H8(short[] sliceArray, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return E.m46constructorimpl(AbstractC0765i.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-tAntMlw, reason: not valid java name */
    public static final int[] m317sliceArraytAntMlw(int[] sliceArray, l indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return z.m110constructorimpl(AbstractC0765i.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-xo_DsdI, reason: not valid java name */
    public static final byte[] m318sliceArrayxo_DsdI(byte[] sliceArray, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return x.m85constructorimpl(AbstractC0765i.sliceArray(sliceArray, indices));
    }

    /* renamed from: sort--ajY-9A, reason: not valid java name */
    public static final void m319sortajY9A(int[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (z.m116getSizeimpl(sort) > 1) {
            l0.m141sortArrayoBK06Vg(sort, 0, z.m116getSizeimpl(sort));
        }
    }

    /* renamed from: sort--nroSd4, reason: not valid java name */
    public static final void m320sortnroSd4(long[] sort, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, B.m27getSizeimpl(sort));
        l0.m138sortArraynroSd4(sort, i8, i9);
    }

    /* renamed from: sort--nroSd4$default, reason: not valid java name */
    public static /* synthetic */ void m321sortnroSd4$default(long[] jArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = B.m27getSizeimpl(jArr);
        }
        m320sortnroSd4(jArr, i8, i9);
    }

    /* renamed from: sort-4UcCI2c, reason: not valid java name */
    public static final void m322sort4UcCI2c(byte[] sort, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, x.m91getSizeimpl(sort));
        l0.m139sortArray4UcCI2c(sort, i8, i9);
    }

    /* renamed from: sort-4UcCI2c$default, reason: not valid java name */
    public static /* synthetic */ void m323sort4UcCI2c$default(byte[] bArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = x.m91getSizeimpl(bArr);
        }
        m322sort4UcCI2c(bArr, i8, i9);
    }

    /* renamed from: sort-Aa5vz7o, reason: not valid java name */
    public static final void m324sortAa5vz7o(short[] sort, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, E.m52getSizeimpl(sort));
        l0.m140sortArrayAa5vz7o(sort, i8, i9);
    }

    /* renamed from: sort-Aa5vz7o$default, reason: not valid java name */
    public static /* synthetic */ void m325sortAa5vz7o$default(short[] sArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = E.m52getSizeimpl(sArr);
        }
        m324sortAa5vz7o(sArr, i8, i9);
    }

    /* renamed from: sort-GBYM_sE, reason: not valid java name */
    public static final void m326sortGBYM_sE(byte[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (x.m91getSizeimpl(sort) > 1) {
            l0.m139sortArray4UcCI2c(sort, 0, x.m91getSizeimpl(sort));
        }
    }

    /* renamed from: sort-QwZRm1k, reason: not valid java name */
    public static final void m327sortQwZRm1k(long[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (B.m27getSizeimpl(sort) > 1) {
            l0.m138sortArraynroSd4(sort, 0, B.m27getSizeimpl(sort));
        }
    }

    /* renamed from: sort-oBK06Vg, reason: not valid java name */
    public static final void m328sortoBK06Vg(int[] sort, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, z.m116getSizeimpl(sort));
        l0.m141sortArrayoBK06Vg(sort, i8, i9);
    }

    /* renamed from: sort-oBK06Vg$default, reason: not valid java name */
    public static /* synthetic */ void m329sortoBK06Vg$default(int[] iArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = z.m116getSizeimpl(iArr);
        }
        m328sortoBK06Vg(iArr, i8, i9);
    }

    /* renamed from: sort-rL5Bavg, reason: not valid java name */
    public static final void m330sortrL5Bavg(short[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (E.m52getSizeimpl(sort) > 1) {
            l0.m140sortArrayAa5vz7o(sort, 0, E.m52getSizeimpl(sort));
        }
    }

    /* renamed from: sortDescending--ajY-9A, reason: not valid java name */
    public static final void m331sortDescendingajY9A(int[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (z.m116getSizeimpl(sortDescending) > 1) {
            m319sortajY9A(sortDescending);
            AbstractC0765i.reverse(sortDescending);
        }
    }

    /* renamed from: sortDescending--nroSd4, reason: not valid java name */
    public static final void m332sortDescendingnroSd4(long[] sortDescending, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m320sortnroSd4(sortDescending, i8, i9);
        AbstractC0765i.reverse(sortDescending, i8, i9);
    }

    /* renamed from: sortDescending-4UcCI2c, reason: not valid java name */
    public static final void m333sortDescending4UcCI2c(byte[] sortDescending, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m322sort4UcCI2c(sortDescending, i8, i9);
        AbstractC0765i.reverse(sortDescending, i8, i9);
    }

    /* renamed from: sortDescending-Aa5vz7o, reason: not valid java name */
    public static final void m334sortDescendingAa5vz7o(short[] sortDescending, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m324sortAa5vz7o(sortDescending, i8, i9);
        AbstractC0765i.reverse(sortDescending, i8, i9);
    }

    /* renamed from: sortDescending-GBYM_sE, reason: not valid java name */
    public static final void m335sortDescendingGBYM_sE(byte[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (x.m91getSizeimpl(sortDescending) > 1) {
            m326sortGBYM_sE(sortDescending);
            AbstractC0765i.reverse(sortDescending);
        }
    }

    /* renamed from: sortDescending-QwZRm1k, reason: not valid java name */
    public static final void m336sortDescendingQwZRm1k(long[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (B.m27getSizeimpl(sortDescending) > 1) {
            m327sortQwZRm1k(sortDescending);
            AbstractC0765i.reverse(sortDescending);
        }
    }

    /* renamed from: sortDescending-oBK06Vg, reason: not valid java name */
    public static final void m337sortDescendingoBK06Vg(int[] sortDescending, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m328sortoBK06Vg(sortDescending, i8, i9);
        AbstractC0765i.reverse(sortDescending, i8, i9);
    }

    /* renamed from: sortDescending-rL5Bavg, reason: not valid java name */
    public static final void m338sortDescendingrL5Bavg(short[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (E.m52getSizeimpl(sortDescending) > 1) {
            m330sortrL5Bavg(sortDescending);
            AbstractC0765i.reverse(sortDescending);
        }
    }

    /* renamed from: sorted--ajY-9A, reason: not valid java name */
    public static final List<y> m339sortedajY9A(int[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        int[] iArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM110constructorimpl = z.m110constructorimpl(iArrCopyOf);
        m319sortajY9A(iArrM110constructorimpl);
        return U6.b.m143asListajY9A(iArrM110constructorimpl);
    }

    /* renamed from: sorted-GBYM_sE, reason: not valid java name */
    public static final List<w> m340sortedGBYM_sE(byte[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        byte[] bArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM85constructorimpl = x.m85constructorimpl(bArrCopyOf);
        m326sortGBYM_sE(bArrM85constructorimpl);
        return U6.b.m144asListGBYM_sE(bArrM85constructorimpl);
    }

    /* renamed from: sorted-QwZRm1k, reason: not valid java name */
    public static final List<A> m341sortedQwZRm1k(long[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        long[] jArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM21constructorimpl = B.m21constructorimpl(jArrCopyOf);
        m327sortQwZRm1k(jArrM21constructorimpl);
        return U6.b.m145asListQwZRm1k(jArrM21constructorimpl);
    }

    /* renamed from: sorted-rL5Bavg, reason: not valid java name */
    public static final List<D> m342sortedrL5Bavg(short[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        short[] sArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM46constructorimpl = E.m46constructorimpl(sArrCopyOf);
        m330sortrL5Bavg(sArrM46constructorimpl);
        return U6.b.m146asListrL5Bavg(sArrM46constructorimpl);
    }

    /* renamed from: sortedArray--ajY-9A, reason: not valid java name */
    public static final int[] m343sortedArrayajY9A(int[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (z.m118isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM110constructorimpl = z.m110constructorimpl(iArrCopyOf);
        m319sortajY9A(iArrM110constructorimpl);
        return iArrM110constructorimpl;
    }

    /* renamed from: sortedArray-GBYM_sE, reason: not valid java name */
    public static final byte[] m344sortedArrayGBYM_sE(byte[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (x.m93isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM85constructorimpl = x.m85constructorimpl(bArrCopyOf);
        m326sortGBYM_sE(bArrM85constructorimpl);
        return bArrM85constructorimpl;
    }

    /* renamed from: sortedArray-QwZRm1k, reason: not valid java name */
    public static final long[] m345sortedArrayQwZRm1k(long[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (B.m29isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM21constructorimpl = B.m21constructorimpl(jArrCopyOf);
        m327sortQwZRm1k(jArrM21constructorimpl);
        return jArrM21constructorimpl;
    }

    /* renamed from: sortedArray-rL5Bavg, reason: not valid java name */
    public static final short[] m346sortedArrayrL5Bavg(short[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (E.m54isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM46constructorimpl = E.m46constructorimpl(sArrCopyOf);
        m330sortrL5Bavg(sArrM46constructorimpl);
        return sArrM46constructorimpl;
    }

    /* renamed from: sortedArrayDescending--ajY-9A, reason: not valid java name */
    public static final int[] m347sortedArrayDescendingajY9A(int[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (z.m118isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM110constructorimpl = z.m110constructorimpl(iArrCopyOf);
        m331sortDescendingajY9A(iArrM110constructorimpl);
        return iArrM110constructorimpl;
    }

    /* renamed from: sortedArrayDescending-GBYM_sE, reason: not valid java name */
    public static final byte[] m348sortedArrayDescendingGBYM_sE(byte[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (x.m93isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM85constructorimpl = x.m85constructorimpl(bArrCopyOf);
        m335sortDescendingGBYM_sE(bArrM85constructorimpl);
        return bArrM85constructorimpl;
    }

    /* renamed from: sortedArrayDescending-QwZRm1k, reason: not valid java name */
    public static final long[] m349sortedArrayDescendingQwZRm1k(long[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (B.m29isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM21constructorimpl = B.m21constructorimpl(jArrCopyOf);
        m336sortDescendingQwZRm1k(jArrM21constructorimpl);
        return jArrM21constructorimpl;
    }

    /* renamed from: sortedArrayDescending-rL5Bavg, reason: not valid java name */
    public static final short[] m350sortedArrayDescendingrL5Bavg(short[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (E.m54isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM46constructorimpl = E.m46constructorimpl(sArrCopyOf);
        m338sortDescendingrL5Bavg(sArrM46constructorimpl);
        return sArrM46constructorimpl;
    }

    /* renamed from: sortedDescending--ajY-9A, reason: not valid java name */
    public static final List<y> m351sortedDescendingajY9A(int[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        int[] iArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM110constructorimpl = z.m110constructorimpl(iArrCopyOf);
        m319sortajY9A(iArrM110constructorimpl);
        return m287reversedajY9A(iArrM110constructorimpl);
    }

    /* renamed from: sortedDescending-GBYM_sE, reason: not valid java name */
    public static final List<w> m352sortedDescendingGBYM_sE(byte[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        byte[] bArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM85constructorimpl = x.m85constructorimpl(bArrCopyOf);
        m326sortGBYM_sE(bArrM85constructorimpl);
        return m288reversedGBYM_sE(bArrM85constructorimpl);
    }

    /* renamed from: sortedDescending-QwZRm1k, reason: not valid java name */
    public static final List<A> m353sortedDescendingQwZRm1k(long[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        long[] jArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM21constructorimpl = B.m21constructorimpl(jArrCopyOf);
        m327sortQwZRm1k(jArrM21constructorimpl);
        return m289reversedQwZRm1k(jArrM21constructorimpl);
    }

    /* renamed from: sortedDescending-rL5Bavg, reason: not valid java name */
    public static final List<D> m354sortedDescendingrL5Bavg(short[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        short[] sArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM46constructorimpl = E.m46constructorimpl(sArrCopyOf);
        m330sortrL5Bavg(sArrM46constructorimpl);
        return m290reversedrL5Bavg(sArrM46constructorimpl);
    }

    public static final int sumOfUByte(w[] wVarArr) {
        Intrinsics.checkNotNullParameter(wVarArr, "<this>");
        int iM102constructorimpl = 0;
        for (w wVar : wVarArr) {
            iM102constructorimpl = y.m102constructorimpl(iM102constructorimpl + y.m102constructorimpl(wVar.m82unboximpl() & 255));
        }
        return iM102constructorimpl;
    }

    public static final int sumOfUInt(y[] yVarArr) {
        Intrinsics.checkNotNullParameter(yVarArr, "<this>");
        int iM102constructorimpl = 0;
        for (y yVar : yVarArr) {
            iM102constructorimpl = y.m102constructorimpl(iM102constructorimpl + yVar.m107unboximpl());
        }
        return iM102constructorimpl;
    }

    public static final long sumOfULong(A[] aArr) {
        Intrinsics.checkNotNullParameter(aArr, "<this>");
        long jM13constructorimpl = 0;
        for (A a9 : aArr) {
            jM13constructorimpl = A.m13constructorimpl(jM13constructorimpl + a9.m18unboximpl());
        }
        return jM13constructorimpl;
    }

    public static final int sumOfUShort(D[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int iM102constructorimpl = 0;
        for (D d9 : dArr) {
            iM102constructorimpl = y.m102constructorimpl(iM102constructorimpl + y.m102constructorimpl(d9.m43unboximpl() & D.MAX_VALUE));
        }
        return iM102constructorimpl;
    }

    /* renamed from: take-PpDY95g, reason: not valid java name */
    public static final List<w> m355takePpDY95g(byte[] take, int i8) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.emptyList();
        }
        if (i8 >= x.m91getSizeimpl(take)) {
            return r.toList(x.m83boximpl(take));
        }
        if (i8 == 1) {
            return r.listOf(w.m76boximpl(x.m90getw2LRezQ(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i8);
        int iM91getSizeimpl = x.m91getSizeimpl(take);
        int i9 = 0;
        for (int i10 = 0; i10 < iM91getSizeimpl; i10++) {
            arrayList.add(w.m76boximpl(x.m90getw2LRezQ(take, i10)));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: take-nggk6HY, reason: not valid java name */
    public static final List<D> m356takenggk6HY(short[] take, int i8) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.emptyList();
        }
        if (i8 >= E.m52getSizeimpl(take)) {
            return r.toList(E.m44boximpl(take));
        }
        if (i8 == 1) {
            return r.listOf(D.m37boximpl(E.m51getMh2AYeg(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i8);
        int iM52getSizeimpl = E.m52getSizeimpl(take);
        int i9 = 0;
        for (int i10 = 0; i10 < iM52getSizeimpl; i10++) {
            arrayList.add(D.m37boximpl(E.m51getMh2AYeg(take, i10)));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: take-qFRl0hI, reason: not valid java name */
    public static final List<y> m357takeqFRl0hI(int[] take, int i8) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.emptyList();
        }
        if (i8 >= z.m116getSizeimpl(take)) {
            return r.toList(z.m108boximpl(take));
        }
        if (i8 == 1) {
            return r.listOf(y.m101boximpl(z.m115getpVg5ArA(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i8);
        int iM116getSizeimpl = z.m116getSizeimpl(take);
        int i9 = 0;
        for (int i10 = 0; i10 < iM116getSizeimpl; i10++) {
            arrayList.add(y.m101boximpl(z.m115getpVg5ArA(take, i10)));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: take-r7IrZao, reason: not valid java name */
    public static final List<A> m358taker7IrZao(long[] take, int i8) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.emptyList();
        }
        if (i8 >= B.m27getSizeimpl(take)) {
            return r.toList(B.m19boximpl(take));
        }
        if (i8 == 1) {
            return r.listOf(A.m12boximpl(B.m26getsVKNKU(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i8);
        int iM27getSizeimpl = B.m27getSizeimpl(take);
        int i9 = 0;
        for (int i10 = 0; i10 < iM27getSizeimpl; i10++) {
            arrayList.add(A.m12boximpl(B.m26getsVKNKU(take, i10)));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: takeLast-PpDY95g, reason: not valid java name */
    public static final List<w> m359takeLastPpDY95g(byte[] takeLast, int i8) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.emptyList();
        }
        int iM91getSizeimpl = x.m91getSizeimpl(takeLast);
        if (i8 >= iM91getSizeimpl) {
            return r.toList(x.m83boximpl(takeLast));
        }
        if (i8 == 1) {
            return r.listOf(w.m76boximpl(x.m90getw2LRezQ(takeLast, iM91getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = iM91getSizeimpl - i8; i9 < iM91getSizeimpl; i9++) {
            arrayList.add(w.m76boximpl(x.m90getw2LRezQ(takeLast, i9)));
        }
        return arrayList;
    }

    /* renamed from: takeLast-nggk6HY, reason: not valid java name */
    public static final List<D> m360takeLastnggk6HY(short[] takeLast, int i8) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.emptyList();
        }
        int iM52getSizeimpl = E.m52getSizeimpl(takeLast);
        if (i8 >= iM52getSizeimpl) {
            return r.toList(E.m44boximpl(takeLast));
        }
        if (i8 == 1) {
            return r.listOf(D.m37boximpl(E.m51getMh2AYeg(takeLast, iM52getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = iM52getSizeimpl - i8; i9 < iM52getSizeimpl; i9++) {
            arrayList.add(D.m37boximpl(E.m51getMh2AYeg(takeLast, i9)));
        }
        return arrayList;
    }

    /* renamed from: takeLast-qFRl0hI, reason: not valid java name */
    public static final List<y> m361takeLastqFRl0hI(int[] takeLast, int i8) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.emptyList();
        }
        int iM116getSizeimpl = z.m116getSizeimpl(takeLast);
        if (i8 >= iM116getSizeimpl) {
            return r.toList(z.m108boximpl(takeLast));
        }
        if (i8 == 1) {
            return r.listOf(y.m101boximpl(z.m115getpVg5ArA(takeLast, iM116getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = iM116getSizeimpl - i8; i9 < iM116getSizeimpl; i9++) {
            arrayList.add(y.m101boximpl(z.m115getpVg5ArA(takeLast, i9)));
        }
        return arrayList;
    }

    /* renamed from: takeLast-r7IrZao, reason: not valid java name */
    public static final List<A> m362takeLastr7IrZao(long[] takeLast, int i8) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.emptyList();
        }
        int iM27getSizeimpl = B.m27getSizeimpl(takeLast);
        if (i8 >= iM27getSizeimpl) {
            return r.toList(B.m19boximpl(takeLast));
        }
        if (i8 == 1) {
            return r.listOf(A.m12boximpl(B.m26getsVKNKU(takeLast, iM27getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = iM27getSizeimpl - i8; i9 < iM27getSizeimpl; i9++) {
            arrayList.add(A.m12boximpl(B.m26getsVKNKU(takeLast, i9)));
        }
        return arrayList;
    }

    /* renamed from: toTypedArray--ajY-9A, reason: not valid java name */
    public static final y[] m363toTypedArrayajY9A(int[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM116getSizeimpl = z.m116getSizeimpl(toTypedArray);
        y[] yVarArr = new y[iM116getSizeimpl];
        for (int i8 = 0; i8 < iM116getSizeimpl; i8++) {
            yVarArr[i8] = y.m101boximpl(z.m115getpVg5ArA(toTypedArray, i8));
        }
        return yVarArr;
    }

    /* renamed from: toTypedArray-GBYM_sE, reason: not valid java name */
    public static final w[] m364toTypedArrayGBYM_sE(byte[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM91getSizeimpl = x.m91getSizeimpl(toTypedArray);
        w[] wVarArr = new w[iM91getSizeimpl];
        for (int i8 = 0; i8 < iM91getSizeimpl; i8++) {
            wVarArr[i8] = w.m76boximpl(x.m90getw2LRezQ(toTypedArray, i8));
        }
        return wVarArr;
    }

    /* renamed from: toTypedArray-QwZRm1k, reason: not valid java name */
    public static final A[] m365toTypedArrayQwZRm1k(long[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM27getSizeimpl = B.m27getSizeimpl(toTypedArray);
        A[] aArr = new A[iM27getSizeimpl];
        for (int i8 = 0; i8 < iM27getSizeimpl; i8++) {
            aArr[i8] = A.m12boximpl(B.m26getsVKNKU(toTypedArray, i8));
        }
        return aArr;
    }

    /* renamed from: toTypedArray-rL5Bavg, reason: not valid java name */
    public static final D[] m366toTypedArrayrL5Bavg(short[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM52getSizeimpl = E.m52getSizeimpl(toTypedArray);
        D[] dArr = new D[iM52getSizeimpl];
        for (int i8 = 0; i8 < iM52getSizeimpl; i8++) {
            dArr[i8] = D.m37boximpl(E.m51getMh2AYeg(toTypedArray, i8));
        }
        return dArr;
    }

    public static final byte[] toUByteArray(w[] wVarArr) {
        Intrinsics.checkNotNullParameter(wVarArr, "<this>");
        int length = wVarArr.length;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr[i8] = wVarArr[i8].m82unboximpl();
        }
        return x.m85constructorimpl(bArr);
    }

    public static final int[] toUIntArray(y[] yVarArr) {
        Intrinsics.checkNotNullParameter(yVarArr, "<this>");
        int length = yVarArr.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = yVarArr[i8].m107unboximpl();
        }
        return z.m110constructorimpl(iArr);
    }

    public static final long[] toULongArray(A[] aArr) {
        Intrinsics.checkNotNullParameter(aArr, "<this>");
        int length = aArr.length;
        long[] jArr = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            jArr[i8] = aArr[i8].m18unboximpl();
        }
        return B.m21constructorimpl(jArr);
    }

    public static final short[] toUShortArray(D[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        short[] sArr = new short[length];
        for (int i8 = 0; i8 < length; i8++) {
            sArr[i8] = dArr[i8].m43unboximpl();
        }
        return E.m46constructorimpl(sArr);
    }

    /* renamed from: withIndex--ajY-9A, reason: not valid java name */
    public static final Iterable<J> m367withIndexajY9A(int[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new K(new a(withIndex));
    }

    /* renamed from: withIndex-GBYM_sE, reason: not valid java name */
    public static final Iterable<J> m368withIndexGBYM_sE(byte[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new K(new C0081c(withIndex));
    }

    /* renamed from: withIndex-QwZRm1k, reason: not valid java name */
    public static final Iterable<J> m369withIndexQwZRm1k(long[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new K(new b(withIndex));
    }

    /* renamed from: withIndex-rL5Bavg, reason: not valid java name */
    public static final Iterable<J> m370withIndexrL5Bavg(short[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new K(new d(withIndex));
    }

    /* renamed from: zip-C-E_24M, reason: not valid java name */
    public static final <R> List<p> m371zipCE_24M(int[] zip, R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(z.m116getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            int iM115getpVg5ArA = z.m115getpVg5ArA(zip, i8);
            arrayList.add(v.to(y.m101boximpl(iM115getpVg5ArA), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-F7u83W8, reason: not valid java name */
    public static final <R> List<p> m372zipF7u83W8(long[] zip, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM27getSizeimpl = B.m27getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(other, 10), iM27getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= iM27getSizeimpl) {
                break;
            }
            arrayList.add(v.to(A.m12boximpl(B.m26getsVKNKU(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-HwE9HBo, reason: not valid java name */
    public static final <R> List<p> m373zipHwE9HBo(int[] zip, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM116getSizeimpl = z.m116getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(other, 10), iM116getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= iM116getSizeimpl) {
                break;
            }
            arrayList.add(v.to(y.m101boximpl(z.m115getpVg5ArA(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-JGPC0-M, reason: not valid java name */
    public static final <R> List<p> m374zipJGPC0M(short[] zip, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM52getSizeimpl = E.m52getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(other, 10), iM52getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= iM52getSizeimpl) {
                break;
            }
            arrayList.add(v.to(D.m37boximpl(E.m51getMh2AYeg(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-JQknh5Q, reason: not valid java name */
    public static final <R> List<p> m375zipJQknh5Q(byte[] zip, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM91getSizeimpl = x.m91getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(other, 10), iM91getSizeimpl));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= iM91getSizeimpl) {
                break;
            }
            arrayList.add(v.to(w.m76boximpl(x.m90getw2LRezQ(zip, i8)), r8));
            i8++;
        }
        return arrayList;
    }

    /* renamed from: zip-ctEhBpI, reason: not valid java name */
    public static final List<p> m376zipctEhBpI(int[] zip, int[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(z.m116getSizeimpl(zip), z.m116getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(v.to(y.m101boximpl(z.m115getpVg5ArA(zip, i8)), y.m101boximpl(z.m115getpVg5ArA(other, i8))));
        }
        return arrayList;
    }

    /* renamed from: zip-f7H3mmw, reason: not valid java name */
    public static final <R> List<p> m377zipf7H3mmw(long[] zip, R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(B.m27getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            long jM26getsVKNKU = B.m26getsVKNKU(zip, i8);
            arrayList.add(v.to(A.m12boximpl(jM26getsVKNKU), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-kdPth3s, reason: not valid java name */
    public static final List<p> m378zipkdPth3s(byte[] zip, byte[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(x.m91getSizeimpl(zip), x.m91getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(v.to(w.m76boximpl(x.m90getw2LRezQ(zip, i8)), w.m76boximpl(x.m90getw2LRezQ(other, i8))));
        }
        return arrayList;
    }

    /* renamed from: zip-mazbYpA, reason: not valid java name */
    public static final List<p> m379zipmazbYpA(short[] zip, short[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(E.m52getSizeimpl(zip), E.m52getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(v.to(D.m37boximpl(E.m51getMh2AYeg(zip, i8)), D.m37boximpl(E.m51getMh2AYeg(other, i8))));
        }
        return arrayList;
    }

    /* renamed from: zip-nl983wc, reason: not valid java name */
    public static final <R> List<p> m380zipnl983wc(byte[] zip, R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(x.m91getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            byte bM90getw2LRezQ = x.m90getw2LRezQ(zip, i8);
            arrayList.add(v.to(w.m76boximpl(bM90getw2LRezQ), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-uaTIQ5s, reason: not valid java name */
    public static final <R> List<p> m381zipuaTIQ5s(short[] zip, R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(E.m52getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            short sM51getMh2AYeg = E.m51getMh2AYeg(zip, i8);
            arrayList.add(v.to(D.m37boximpl(sM51getMh2AYeg), other[i8]));
        }
        return arrayList;
    }

    /* renamed from: zip-us8wMrg, reason: not valid java name */
    public static final List<p> m382zipus8wMrg(long[] zip, long[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(B.m27getSizeimpl(zip), B.m27getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(v.to(A.m12boximpl(B.m26getsVKNKU(zip, i8)), A.m12boximpl(B.m26getsVKNKU(other, i8))));
        }
        return arrayList;
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final long m249maxOrThrowU(long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!B.m29isEmptyimpl(max)) {
            long jM26getsVKNKU = B.m26getsVKNKU(max, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                long jM26getsVKNKU2 = B.m26getsVKNKU(max, it.nextInt());
                if (Long.compare(jM26getsVKNKU ^ Long.MIN_VALUE, jM26getsVKNKU2 ^ Long.MIN_VALUE) < 0) {
                    jM26getsVKNKU = jM26getsVKNKU2;
                }
            }
            return jM26getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final long m257maxWithOrThrowU(long[] maxWith, Comparator<? super A> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!B.m29isEmptyimpl(maxWith)) {
            long jM26getsVKNKU = B.m26getsVKNKU(maxWith, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                long jM26getsVKNKU2 = B.m26getsVKNKU(maxWith, it.nextInt());
                if (comparator.compare(A.m12boximpl(jM26getsVKNKU), A.m12boximpl(jM26getsVKNKU2)) < 0) {
                    jM26getsVKNKU = jM26getsVKNKU2;
                }
            }
            return jM26getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final long m265minOrThrowU(long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!B.m29isEmptyimpl(min)) {
            long jM26getsVKNKU = B.m26getsVKNKU(min, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                long jM26getsVKNKU2 = B.m26getsVKNKU(min, it.nextInt());
                if (Long.compare(jM26getsVKNKU ^ Long.MIN_VALUE, jM26getsVKNKU2 ^ Long.MIN_VALUE) > 0) {
                    jM26getsVKNKU = jM26getsVKNKU2;
                }
            }
            return jM26getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final long m273minWithOrThrowU(long[] minWith, Comparator<? super A> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!B.m29isEmptyimpl(minWith)) {
            long jM26getsVKNKU = B.m26getsVKNKU(minWith, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                long jM26getsVKNKU2 = B.m26getsVKNKU(minWith, it.nextInt());
                if (comparator.compare(A.m12boximpl(jM26getsVKNKU), A.m12boximpl(jM26getsVKNKU2)) > 0) {
                    jM26getsVKNKU = jM26getsVKNKU2;
                }
            }
            return jM26getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final byte m247maxOrThrowU(byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!x.m93isEmptyimpl(max)) {
            byte bM90getw2LRezQ = x.m90getw2LRezQ(max, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                byte bM90getw2LRezQ2 = x.m90getw2LRezQ(max, it.nextInt());
                if (Intrinsics.compare(bM90getw2LRezQ & 255, bM90getw2LRezQ2 & 255) < 0) {
                    bM90getw2LRezQ = bM90getw2LRezQ2;
                }
            }
            return bM90getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final byte m255maxWithOrThrowU(byte[] maxWith, Comparator<? super w> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!x.m93isEmptyimpl(maxWith)) {
            byte bM90getw2LRezQ = x.m90getw2LRezQ(maxWith, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                byte bM90getw2LRezQ2 = x.m90getw2LRezQ(maxWith, it.nextInt());
                if (comparator.compare(w.m76boximpl(bM90getw2LRezQ), w.m76boximpl(bM90getw2LRezQ2)) < 0) {
                    bM90getw2LRezQ = bM90getw2LRezQ2;
                }
            }
            return bM90getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final byte m263minOrThrowU(byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!x.m93isEmptyimpl(min)) {
            byte bM90getw2LRezQ = x.m90getw2LRezQ(min, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                byte bM90getw2LRezQ2 = x.m90getw2LRezQ(min, it.nextInt());
                if (Intrinsics.compare(bM90getw2LRezQ & 255, bM90getw2LRezQ2 & 255) > 0) {
                    bM90getw2LRezQ = bM90getw2LRezQ2;
                }
            }
            return bM90getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final byte m271minWithOrThrowU(byte[] minWith, Comparator<? super w> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!x.m93isEmptyimpl(minWith)) {
            byte bM90getw2LRezQ = x.m90getw2LRezQ(minWith, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                byte bM90getw2LRezQ2 = x.m90getw2LRezQ(minWith, it.nextInt());
                if (comparator.compare(w.m76boximpl(bM90getw2LRezQ), w.m76boximpl(bM90getw2LRezQ2)) > 0) {
                    bM90getw2LRezQ = bM90getw2LRezQ2;
                }
            }
            return bM90getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final short m250maxOrThrowU(short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (!E.m54isEmptyimpl(max)) {
            short sM51getMh2AYeg = E.m51getMh2AYeg(max, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(max)).iterator();
            while (it.hasNext()) {
                short sM51getMh2AYeg2 = E.m51getMh2AYeg(max, it.nextInt());
                if (Intrinsics.compare(sM51getMh2AYeg & D.MAX_VALUE, 65535 & sM51getMh2AYeg2) < 0) {
                    sM51getMh2AYeg = sM51getMh2AYeg2;
                }
            }
            return sM51getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final short m258maxWithOrThrowU(short[] maxWith, Comparator<? super D> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!E.m54isEmptyimpl(maxWith)) {
            short sM51getMh2AYeg = E.m51getMh2AYeg(maxWith, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(maxWith)).iterator();
            while (it.hasNext()) {
                short sM51getMh2AYeg2 = E.m51getMh2AYeg(maxWith, it.nextInt());
                if (comparator.compare(D.m37boximpl(sM51getMh2AYeg), D.m37boximpl(sM51getMh2AYeg2)) < 0) {
                    sM51getMh2AYeg = sM51getMh2AYeg2;
                }
            }
            return sM51getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final short m266minOrThrowU(short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (!E.m54isEmptyimpl(min)) {
            short sM51getMh2AYeg = E.m51getMh2AYeg(min, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(min)).iterator();
            while (it.hasNext()) {
                short sM51getMh2AYeg2 = E.m51getMh2AYeg(min, it.nextInt());
                if (Intrinsics.compare(sM51getMh2AYeg & D.MAX_VALUE, 65535 & sM51getMh2AYeg2) > 0) {
                    sM51getMh2AYeg = sM51getMh2AYeg2;
                }
            }
            return sM51getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final short m274minWithOrThrowU(short[] minWith, Comparator<? super D> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!E.m54isEmptyimpl(minWith)) {
            short sM51getMh2AYeg = E.m51getMh2AYeg(minWith, 0);
            M it = new l(1, AbstractC0765i.getLastIndex(minWith)).iterator();
            while (it.hasNext()) {
                short sM51getMh2AYeg2 = E.m51getMh2AYeg(minWith, it.nextInt());
                if (comparator.compare(D.m37boximpl(sM51getMh2AYeg), D.m37boximpl(sM51getMh2AYeg2)) > 0) {
                    sM51getMh2AYeg = sM51getMh2AYeg2;
                }
            }
            return sM51getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: getIndices--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m220getIndicesajY9A$annotations(int[] iArr) {
    }

    /* renamed from: getIndices-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m222getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    /* renamed from: getIndices-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m224getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    /* renamed from: getIndices-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m226getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    /* renamed from: getLastIndex--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m228getLastIndexajY9A$annotations(int[] iArr) {
    }

    /* renamed from: getLastIndex-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m230getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    /* renamed from: getLastIndex-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m232getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    /* renamed from: getLastIndex-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m234getLastIndexrL5Bavg$annotations(short[] sArr) {
    }
}
