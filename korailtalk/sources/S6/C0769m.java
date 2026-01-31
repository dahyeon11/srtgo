package S6;

import f7.InterfaceC5519a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: S6.m */
/* loaded from: classes3.dex */
public class C0769m extends C0768l {

    /* renamed from: S6.m$A */
    static final class A extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ boolean[] f4736a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(boolean[] zArr) {
            super(0);
            this.f4736a = zArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<Boolean> invoke() {
            return ArrayIteratorsKt.iterator(this.f4736a);
        }
    }

    /* renamed from: S6.m$B */
    static final class B extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ char[] f4737a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(char[] cArr) {
            super(0);
            this.f4737a = cArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<Character> invoke() {
            return ArrayIteratorsKt.iterator(this.f4737a);
        }
    }

    /* renamed from: S6.m$a */
    public static final class C0770a implements Iterable, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ Object[] f4738a;

        public C0770a(Object[] objArr) {
            this.f4738a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return ArrayIteratorKt.iterator(this.f4738a);
        }
    }

    /* renamed from: S6.m$b */
    public static final class C0771b implements Iterable, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ byte[] f4739a;

        public C0771b(byte[] bArr) {
            this.f4739a = bArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Byte> iterator() {
            return ArrayIteratorsKt.iterator(this.f4739a);
        }
    }

    /* renamed from: S6.m$c */
    public static final class c implements Iterable, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ short[] f4740a;

        public c(short[] sArr) {
            this.f4740a = sArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Short> iterator() {
            return ArrayIteratorsKt.iterator(this.f4740a);
        }
    }

    /* renamed from: S6.m$d */
    public static final class d implements Iterable, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ int[] f4741a;

        public d(int[] iArr) {
            this.f4741a = iArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Integer> iterator() {
            return ArrayIteratorsKt.iterator(this.f4741a);
        }
    }

    /* renamed from: S6.m$e */
    public static final class e implements Iterable, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ long[] f4742a;

        public e(long[] jArr) {
            this.f4742a = jArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Long> iterator() {
            return ArrayIteratorsKt.iterator(this.f4742a);
        }
    }

    /* renamed from: S6.m$f */
    public static final class f implements Iterable, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ float[] f4743a;

        public f(float[] fArr) {
            this.f4743a = fArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Float> iterator() {
            return ArrayIteratorsKt.iterator(this.f4743a);
        }
    }

    /* renamed from: S6.m$g */
    public static final class g implements Iterable, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ double[] f4744a;

        public g(double[] dArr) {
            this.f4744a = dArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Double> iterator() {
            return ArrayIteratorsKt.iterator(this.f4744a);
        }
    }

    /* renamed from: S6.m$h */
    public static final class h implements Iterable, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ boolean[] f4745a;

        public h(boolean[] zArr) {
            this.f4745a = zArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Boolean> iterator() {
            return ArrayIteratorsKt.iterator(this.f4745a);
        }
    }

    /* renamed from: S6.m$i */
    public static final class i implements Iterable, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ char[] f4746a;

        public i(char[] cArr) {
            this.f4746a = cArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return ArrayIteratorsKt.iterator(this.f4746a);
        }
    }

    /* renamed from: S6.m$j */
    public static final class j implements k7.m {

        /* renamed from: a */
        final /* synthetic */ Object[] f4747a;

        public j(Object[] objArr) {
            this.f4747a = objArr;
        }

        @Override // k7.m
        public Iterator<T> iterator() {
            return ArrayIteratorKt.iterator(this.f4747a);
        }
    }

    /* renamed from: S6.m$k */
    public static final class k implements k7.m {

        /* renamed from: a */
        final /* synthetic */ byte[] f4748a;

        public k(byte[] bArr) {
            this.f4748a = bArr;
        }

        @Override // k7.m
        public Iterator<Byte> iterator() {
            return ArrayIteratorsKt.iterator(this.f4748a);
        }
    }

    /* renamed from: S6.m$l */
    public static final class l implements k7.m {

        /* renamed from: a */
        final /* synthetic */ short[] f4749a;

        public l(short[] sArr) {
            this.f4749a = sArr;
        }

        @Override // k7.m
        public Iterator<Short> iterator() {
            return ArrayIteratorsKt.iterator(this.f4749a);
        }
    }

    /* renamed from: S6.m$m */
    public static final class C0075m implements k7.m {

        /* renamed from: a */
        final /* synthetic */ int[] f4750a;

        public C0075m(int[] iArr) {
            this.f4750a = iArr;
        }

        @Override // k7.m
        public Iterator<Integer> iterator() {
            return ArrayIteratorsKt.iterator(this.f4750a);
        }
    }

    /* renamed from: S6.m$n */
    public static final class n implements k7.m {

        /* renamed from: a */
        final /* synthetic */ long[] f4751a;

        public n(long[] jArr) {
            this.f4751a = jArr;
        }

        @Override // k7.m
        public Iterator<Long> iterator() {
            return ArrayIteratorsKt.iterator(this.f4751a);
        }
    }

    /* renamed from: S6.m$o */
    public static final class o implements k7.m {

        /* renamed from: a */
        final /* synthetic */ float[] f4752a;

        public o(float[] fArr) {
            this.f4752a = fArr;
        }

        @Override // k7.m
        public Iterator<Float> iterator() {
            return ArrayIteratorsKt.iterator(this.f4752a);
        }
    }

    /* renamed from: S6.m$p */
    public static final class p implements k7.m {

        /* renamed from: a */
        final /* synthetic */ double[] f4753a;

        public p(double[] dArr) {
            this.f4753a = dArr;
        }

        @Override // k7.m
        public Iterator<Double> iterator() {
            return ArrayIteratorsKt.iterator(this.f4753a);
        }
    }

    /* renamed from: S6.m$q */
    public static final class q implements k7.m {

        /* renamed from: a */
        final /* synthetic */ boolean[] f4754a;

        public q(boolean[] zArr) {
            this.f4754a = zArr;
        }

        @Override // k7.m
        public Iterator<Boolean> iterator() {
            return ArrayIteratorsKt.iterator(this.f4754a);
        }
    }

    /* renamed from: S6.m$r */
    public static final class r implements k7.m {

        /* renamed from: a */
        final /* synthetic */ char[] f4755a;

        public r(char[] cArr) {
            this.f4755a = cArr;
        }

        @Override // k7.m
        public Iterator<Character> iterator() {
            return ArrayIteratorsKt.iterator(this.f4755a);
        }
    }

    /* renamed from: S6.m$s */
    public static final class s implements I {

        /* renamed from: a */
        final /* synthetic */ Object[] f4756a;

        /* renamed from: b */
        final /* synthetic */ f7.l f4757b;

        public s(T[] tArr, f7.l lVar) {
            this.f4756a = tArr;
            this.f4757b = lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [K, java.lang.Object] */
        @Override // S6.I
        public K keyOf(T t8) {
            return this.f4757b.invoke(t8);
        }

        @Override // S6.I
        public Iterator<T> sourceIterator() {
            return ArrayIteratorKt.iterator(this.f4756a);
        }
    }

    /* renamed from: S6.m$t */
    static final class t extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ Object[] f4758a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Object[] objArr) {
            super(0);
            this.f4758a = objArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<T> invoke() {
            return ArrayIteratorKt.iterator(this.f4758a);
        }
    }

    /* renamed from: S6.m$u */
    static final class u extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ byte[] f4759a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(byte[] bArr) {
            super(0);
            this.f4759a = bArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<Byte> invoke() {
            return ArrayIteratorsKt.iterator(this.f4759a);
        }
    }

    /* renamed from: S6.m$v */
    static final class v extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ short[] f4760a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(short[] sArr) {
            super(0);
            this.f4760a = sArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<Short> invoke() {
            return ArrayIteratorsKt.iterator(this.f4760a);
        }
    }

    /* renamed from: S6.m$w */
    static final class w extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ int[] f4761a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int[] iArr) {
            super(0);
            this.f4761a = iArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<Integer> invoke() {
            return ArrayIteratorsKt.iterator(this.f4761a);
        }
    }

    /* renamed from: S6.m$x */
    static final class x extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ long[] f4762a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(long[] jArr) {
            super(0);
            this.f4762a = jArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<Long> invoke() {
            return ArrayIteratorsKt.iterator(this.f4762a);
        }
    }

    /* renamed from: S6.m$y */
    static final class y extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ float[] f4763a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(float[] fArr) {
            super(0);
            this.f4763a = fArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<Float> invoke() {
            return ArrayIteratorsKt.iterator(this.f4763a);
        }
    }

    /* renamed from: S6.m$z */
    static final class z extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ double[] f4764a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(double[] dArr) {
            super(0);
            this.f4764a = dArr;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<Double> invoke() {
            return ArrayIteratorsKt.iterator(this.f4764a);
        }
    }

    public static final <T> boolean all(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t8 : tArr) {
            if (!((Boolean) predicate.invoke(t8)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    public static <T> Iterable<T> asIterable(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? S6.r.emptyList() : new C0770a(tArr);
    }

    public static <T> k7.m asSequence(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? k7.p.emptySequence() : new j(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associate(T[] tArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(tArr.length), 16));
        for (T t8 : tArr) {
            R6.p pVar = (R6.p) transform.invoke(t8);
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K> Map<K, T> associateBy(T[] tArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(tArr.length), 16));
        for (T t8 : tArr) {
            linkedHashMap.put(keySelector.invoke(t8), t8);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(T[] tArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t8 : tArr) {
            destination.put(keySelector.invoke(t8), t8);
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(T[] tArr, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t8 : tArr) {
            R6.p pVar = (R6.p) transform.invoke(t8);
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateWith(K[] kArr, f7.l valueSelector) {
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(kArr.length), 16));
        for (K k8 : kArr) {
            linkedHashMap.put(k8, valueSelector.invoke(k8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(K[] kArr, M destination, f7.l valueSelector) {
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k8 : kArr) {
            destination.put(k8, valueSelector.invoke(k8));
        }
        return destination;
    }

    public static final double average(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        double d9 = 0.0d;
        int i8 = 0;
        for (byte b9 : bArr) {
            d9 += b9;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d9 / i8;
    }

    public static final double averageOfByte(Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        double dByteValue = 0.0d;
        int i8 = 0;
        for (Byte b9 : bArr) {
            dByteValue += b9.byteValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dByteValue / i8;
    }

    public static final double averageOfDouble(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double dDoubleValue = 0.0d;
        int i8 = 0;
        for (Double d9 : dArr) {
            dDoubleValue += d9.doubleValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / i8;
    }

    public static final double averageOfFloat(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        double dFloatValue = 0.0d;
        int i8 = 0;
        for (Float f8 : fArr) {
            dFloatValue += f8.floatValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dFloatValue / i8;
    }

    public static final double averageOfInt(Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        double dIntValue = 0.0d;
        int i8 = 0;
        for (Integer num : numArr) {
            dIntValue += num.intValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dIntValue / i8;
    }

    public static final double averageOfLong(Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        double dLongValue = 0.0d;
        int i8 = 0;
        for (Long l8 : lArr) {
            dLongValue += l8.longValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dLongValue / i8;
    }

    public static final double averageOfShort(Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        double dShortValue = 0.0d;
        int i8 = 0;
        for (Short sh : shArr) {
            dShortValue += sh.shortValue();
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dShortValue / i8;
    }

    public static <T> boolean contains(T[] tArr, T t8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return indexOf(tArr, t8) >= 0;
    }

    public static final <T> int count(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (T t8 : tArr) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final <T> List<T> distinct(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return S6.r.toList(toMutableSet(tArr));
    }

    public static final <T, K> List<T> distinctBy(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t8 : tArr) {
            if (hashSet.add(selector.invoke(t8))) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static <T> List<T> drop(T[] tArr, int i8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i8 >= 0) {
            return takeLast(tArr, j7.s.coerceAtLeast(tArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final <T> List<T> dropLast(T[] tArr, int i8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i8 >= 0) {
            return take(tArr, j7.s.coerceAtLeast(tArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final <T> List<T> dropLastWhile(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(tArr[lastIndex])).booleanValue()) {
                return take(tArr, lastIndex + 1);
            }
        }
        return S6.r.emptyList();
    }

    public static final <T> List<T> dropWhile(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        for (T t8 : tArr) {
            if (z8) {
                arrayList.add(t8);
            } else if (!((Boolean) predicate.invoke(t8)).booleanValue()) {
                arrayList.add(t8);
                z8 = true;
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filter(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t8 : tArr) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterIndexed(T[] tArr, f7.p predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            T t8 = tArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), t8)).booleanValue()) {
                arrayList.add(t8);
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(T[] tArr, C destination, f7.p predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            T t8 = tArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), t8)).booleanValue()) {
                destination.add(t8);
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Object[] objArr, C destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T> List<T> filterNot(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t8 : tArr) {
            if (!((Boolean) predicate.invoke(t8)).booleanValue()) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static <T> List<T> filterNotNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (List) filterNotNullTo(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(T[] tArr, C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t8 : tArr) {
            if (t8 != null) {
                destination.add(t8);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(T[] tArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t8 : tArr) {
            if (!((Boolean) predicate.invoke(t8)).booleanValue()) {
                destination.add(t8);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(T[] tArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t8 : tArr) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                destination.add(t8);
            }
        }
        return destination;
    }

    public static final <T> T first(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T firstOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final <T, R> List<R> flatMap(T[] tArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t8 : tArr) {
            S6.r.addAll(arrayList, (Iterable) transform.invoke(t8));
        }
        return arrayList;
    }

    public static final <T, R> List<R> flatMapSequence(T[] tArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t8 : tArr) {
            S6.r.addAll(arrayList, (k7.m) transform.invoke(t8));
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(T[] tArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t8 : tArr) {
            S6.r.addAll(destination, (k7.m) transform.invoke(t8));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(T[] tArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t8 : tArr) {
            S6.r.addAll(destination, (Iterable) transform.invoke(t8));
        }
        return destination;
    }

    public static final <T, R> R fold(T[] tArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (T t8 : tArr) {
            r8 = (R) operation.invoke(r8, t8);
        }
        return r8;
    }

    public static final <T, R> R foldIndexed(T[] tArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, tArr[i8]);
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <T, R> R foldRight(T[] tArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(tArr[lastIndex], r8);
        }
        return r8;
    }

    public static final <T, R> R foldRightIndexed(T[] tArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), tArr[lastIndex], r8);
        }
        return r8;
    }

    public static final <T> void forEach(T[] tArr, f7.l action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (T t8 : tArr) {
            action.invoke(t8);
        }
    }

    public static final <T> void forEachIndexed(T[] tArr, f7.p action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), tArr[i8]);
            i8++;
            i9++;
        }
    }

    public static final <T> j7.l getIndices(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new j7.l(0, getLastIndex(tArr));
    }

    public static final <T> int getLastIndex(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T getOrNull(T[] tArr, int i8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(tArr)) {
            return null;
        }
        return tArr[i8];
    }

    public static final <T, K> Map<K, List<T>> groupBy(T[] tArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t8 : tArr) {
            Object objInvoke = keySelector.invoke(t8);
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(t8);
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(T[] tArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t8 : tArr) {
            Object objInvoke = keySelector.invoke(t8);
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(t8);
        }
        return destination;
    }

    public static final <T, K> I groupingBy(T[] tArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new s(tArr, keySelector);
    }

    public static final <T> int indexOf(T[] tArr, T t8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i8 = 0;
        if (t8 == null) {
            int length = tArr.length;
            while (i8 < length) {
                if (tArr[i8] == null) {
                    return i8;
                }
                i8++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i8 < length2) {
            if (Intrinsics.areEqual(t8, tArr[i8])) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(tArr[i8])).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final <T> int indexOfLast(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(tArr[length])).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final <T> Set<T> intersect(T[] tArr, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        C0782y.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T, A extends Appendable> A joinTo(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (T t8 : tArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            l7.r.appendElement(buffer, t8, lVar);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String joinToString(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(tArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(objArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final <T> T last(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[getLastIndex(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> int lastIndexOf(T[] tArr, T t8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (t8 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i8 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i9 = length2 - 1;
                    if (Intrinsics.areEqual(t8, tArr[length2])) {
                        return length2;
                    }
                    if (i9 < 0) {
                        break;
                    }
                    length2 = i9;
                }
            }
        }
        return -1;
    }

    public static final <T> T lastOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static final <T, R> List<R> map(T[] tArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t8 : tArr) {
            arrayList.add(transform.invoke(t8));
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexed(T[] tArr, f7.p transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), tArr[i8]));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexedNotNull(T[] tArr, f7.p transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = i9 + 1;
            Object objInvoke = transform.invoke(Integer.valueOf(i9), tArr[i8]);
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(T[] tArr, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = i9 + 1;
            Object objInvoke = transform.invoke(Integer.valueOf(i9), tArr[i8]);
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(T[] tArr, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), tArr[i8]));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <T, R> List<R> mapNotNull(T[] tArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t8 : tArr) {
            Object objInvoke = transform.invoke(t8);
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(T[] tArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t8 : tArr) {
            Object objInvoke = transform.invoke(t8);
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(T[] tArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t8 : tArr) {
            destination.add(transform.invoke(t8));
        }
        return destination;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrNull(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t8 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t8;
        }
        Comparable comparable = (Comparable) selector.invoke(t8);
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            T t9 = tArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(t9);
            if (comparable.compareTo(comparable2) < 0) {
                t8 = t9;
                comparable = comparable2;
            }
        }
        return t8;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t8 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t8;
        }
        Comparable comparable = (Comparable) selector.invoke(t8);
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            T t9 = tArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(t9);
            if (comparable.compareTo(comparable2) < 0) {
                t8 = t9;
                comparable = comparable2;
            }
        }
        return t8;
    }

    public static final Double maxOrNull(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        M it = new j7.l(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double maxOrThrow(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        M it = new j7.l(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return dDoubleValue;
    }

    public static final <T> T maxWithOrNull(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t8 = tArr[0];
        M it = new j7.l(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t9 = tArr[it.nextInt()];
            if (comparator.compare(t8, t9) < 0) {
                t8 = t9;
            }
        }
        return t8;
    }

    public static final <T> T maxWithOrThrow(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t8 = tArr[0];
        M it = new j7.l(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t9 = tArr[it.nextInt()];
            if (comparator.compare(t8, t9) < 0) {
                t8 = t9;
            }
        }
        return t8;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrNull(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t8 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t8;
        }
        Comparable comparable = (Comparable) selector.invoke(t8);
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            T t9 = tArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(t9);
            if (comparable.compareTo(comparable2) > 0) {
                t8 = t9;
                comparable = comparable2;
            }
        }
        return t8;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrThrow(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t8 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t8;
        }
        Comparable comparable = (Comparable) selector.invoke(t8);
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            T t9 = tArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(t9);
            if (comparable.compareTo(comparable2) > 0) {
                t8 = t9;
                comparable = comparable2;
            }
        }
        return t8;
    }

    public static final Double minOrNull(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        M it = new j7.l(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double minOrThrow(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        M it = new j7.l(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, dArr[it.nextInt()].doubleValue());
        }
        return dDoubleValue;
    }

    public static final <T> T minWithOrNull(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t8 = tArr[0];
        M it = new j7.l(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t9 = tArr[it.nextInt()];
            if (comparator.compare(t8, t9) > 0) {
                t8 = t9;
            }
        }
        return t8;
    }

    public static final <T> T minWithOrThrow(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t8 = tArr[0];
        M it = new j7.l(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t9 = tArr[it.nextInt()];
            if (comparator.compare(t8, t9) > 0) {
                t8 = t9;
            }
        }
        return t8;
    }

    public static final <T> boolean none(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    public static final <T> R6.p partition(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t8 : tArr) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                arrayList.add(t8);
            } else {
                arrayList2.add(t8);
            }
        }
        return new R6.p(arrayList, arrayList2);
    }

    public static final <T> T random(T[] tArr, h7.f random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (tArr.length != 0) {
            return tArr[random.nextInt(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T randomOrNull(T[] tArr, h7.f random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.nextInt(tArr.length)];
    }

    public static final <S, T extends S> S reduce(T[] tArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s8 = (S) tArr[0];
        M it = new j7.l(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            s8 = (S) operation.invoke(s8, tArr[it.nextInt()]);
        }
        return s8;
    }

    public static final <S, T extends S> S reduceIndexed(T[] tArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s8 = (S) tArr[0];
        M it = new j7.l(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            s8 = (S) operation.invoke(Integer.valueOf(iNextInt), s8, tArr[iNextInt]);
        }
        return s8;
    }

    public static final <S, T extends S> S reduceIndexedOrNull(T[] tArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s8 = (S) tArr[0];
        M it = new j7.l(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            s8 = (S) operation.invoke(Integer.valueOf(iNextInt), s8, tArr[iNextInt]);
        }
        return s8;
    }

    public static final <S, T extends S> S reduceOrNull(T[] tArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s8 = (S) tArr[0];
        M it = new j7.l(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            s8 = (S) operation.invoke(s8, tArr[it.nextInt()]);
        }
        return s8;
    }

    public static final <S, T extends S> S reduceRight(T[] tArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s8 = (S) tArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            s8 = (S) operation.invoke(tArr[i8], s8);
        }
        return s8;
    }

    public static final <S, T extends S> S reduceRightIndexed(T[] tArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s8 = (S) tArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            s8 = (S) operation.invoke(Integer.valueOf(i8), tArr[i8], s8);
        }
        return s8;
    }

    public static final <S, T extends S> S reduceRightIndexedOrNull(T[] tArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S s8 = (S) tArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            s8 = (S) operation.invoke(Integer.valueOf(i8), tArr[i8], s8);
        }
        return s8;
    }

    public static final <S, T extends S> S reduceRightOrNull(T[] tArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S s8 = (S) tArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            s8 = (S) operation.invoke(tArr[i8], s8);
        }
        return s8;
    }

    public static final <T> T[] requireNoNulls(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        for (T t8 : tArr) {
            if (t8 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + Q7.C.PACKAGE_SEPARATOR_CHAR);
            }
        }
        return tArr;
    }

    public static final <T> void reverse(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(tArr);
        M it = new j7.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            T t8 = tArr[iNextInt];
            tArr[iNextInt] = tArr[lastIndex];
            tArr[lastIndex] = t8;
            lastIndex--;
        }
    }

    public static final <T> List<T> reversed(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return S6.r.emptyList();
        }
        List<T> mutableList = toMutableList(tArr);
        S6.r.reverse(mutableList);
        return mutableList;
    }

    public static final <T> T[] reversedArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) C0766j.arrayOfNulls(tArr, tArr.length);
        int lastIndex = getLastIndex(tArr);
        M it = new j7.l(0, lastIndex).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            tArr2[lastIndex - iNextInt] = tArr[iNextInt];
        }
        return tArr2;
    }

    public static final <T, R> List<R> runningFold(T[] tArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return S6.r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r8);
        for (T t8 : tArr) {
            r8 = (R) operation.invoke(r8, t8);
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <T, R> List<R> runningFoldIndexed(T[] tArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return S6.r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r8);
        int length = tArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, tArr[i8]);
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduce(T[] tArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return S6.r.emptyList();
        }
        T t8 = tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(t8);
        int length = tArr.length;
        int i8 = 1;
        Object obj = t8;
        while (i8 < length) {
            Object objInvoke = operation.invoke(obj, tArr[i8]);
            arrayList.add(objInvoke);
            i8++;
            obj = objInvoke;
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduceIndexed(T[] tArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return S6.r.emptyList();
        }
        T t8 = tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(t8);
        int length = tArr.length;
        int i8 = 1;
        Object obj = t8;
        while (i8 < length) {
            Object objInvoke = operation.invoke(Integer.valueOf(i8), obj, tArr[i8]);
            arrayList.add(objInvoke);
            i8++;
            obj = objInvoke;
        }
        return arrayList;
    }

    public static final <T, R> List<R> scan(T[] tArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return S6.r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r8);
        for (T t8 : tArr) {
            r8 = (R) operation.invoke(r8, t8);
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <T, R> List<R> scanIndexed(T[] tArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return S6.r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r8);
        int length = tArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, tArr[i8]);
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <T> void shuffle(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        shuffle(tArr, h7.f.Default);
    }

    public static final <T> T single(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T singleOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> List<T> slice(T[] tArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? S6.r.emptyList() : AbstractC0765i.asList(AbstractC0765i.copyOfRange(tArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final <T> T[] sliceArray(T[] tArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        T[] tArr2 = (T[]) C0766j.arrayOfNulls(tArr, indices.size());
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            tArr2[i8] = tArr[it.next().intValue()];
            i8++;
        }
        return tArr2;
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            C0768l.sortWith(tArr, new V6.g(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            C0768l.sortWith(tArr, new V6.h(selector));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        C0768l.sortWith(tArr, V6.a.reverseOrder());
    }

    public static final <T extends Comparable<? super T>> List<T> sorted(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return AbstractC0765i.asList(sortedArray(tArr));
    }

    public static final <T extends Comparable<? super T>> T[] sortedArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        C0768l.sort(tArr2);
        return tArr2;
    }

    public static final <T extends Comparable<? super T>> T[] sortedArrayDescending(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        C0768l.sortWith(tArr2, V6.a.reverseOrder());
        return tArr2;
    }

    public static final <T> T[] sortedArrayWith(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        C0768l.sortWith(tArr2, comparator);
        return tArr2;
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(tArr, new V6.g(selector));
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(tArr, new V6.h(selector));
    }

    public static final <T extends Comparable<? super T>> List<T> sortedDescending(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return sortedWith(tArr, V6.a.reverseOrder());
    }

    public static final <T> List<T> sortedWith(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return AbstractC0765i.asList(sortedArrayWith(tArr, comparator));
    }

    public static final <T> Set<T> subtract(T[] tArr, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        C0782y.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sum(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i8 = 0;
        for (byte b9 : bArr) {
            i8 += b9;
        }
        return i8;
    }

    public static final <T> int sumBy(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (T t8 : tArr) {
            iIntValue += ((Number) selector.invoke(t8)).intValue();
        }
        return iIntValue;
    }

    public static final <T> double sumByDouble(T[] tArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (T t8 : tArr) {
            dDoubleValue += ((Number) selector.invoke(t8)).doubleValue();
        }
        return dDoubleValue;
    }

    public static final int sumOfByte(Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int iByteValue = 0;
        for (Byte b9 : bArr) {
            iByteValue += b9.byteValue();
        }
        return iByteValue;
    }

    public static final double sumOfDouble(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double dDoubleValue = 0.0d;
        for (Double d9 : dArr) {
            dDoubleValue += d9.doubleValue();
        }
        return dDoubleValue;
    }

    public static final float sumOfFloat(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float fFloatValue = 0.0f;
        for (Float f8 : fArr) {
            fFloatValue += f8.floatValue();
        }
        return fFloatValue;
    }

    public static final int sumOfInt(Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        int iIntValue = 0;
        for (Integer num : numArr) {
            iIntValue += num.intValue();
        }
        return iIntValue;
    }

    public static final long sumOfLong(Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        long jLongValue = 0;
        for (Long l8 : lArr) {
            jLongValue += l8.longValue();
        }
        return jLongValue;
    }

    public static final int sumOfShort(Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        int iShortValue = 0;
        for (Short sh : shArr) {
            iShortValue += sh.shortValue();
        }
        return iShortValue;
    }

    public static final <T> List<T> take(T[] tArr, int i8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        if (i8 >= tArr.length) {
            return AbstractC0765i.toList(tArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (T t8 : tArr) {
            arrayList.add(t8);
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final <T> List<T> takeLast(T[] tArr, int i8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        int length = tArr.length;
        if (i8 >= length) {
            return AbstractC0765i.toList(tArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(tArr[i9]);
        }
        return arrayList;
    }

    public static final <T> List<T> takeLastWhile(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(tArr[lastIndex])).booleanValue()) {
                return AbstractC0765i.drop(tArr, lastIndex + 1);
            }
        }
        return AbstractC0765i.toList(tArr);
    }

    public static final <T> List<T> takeWhile(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t8 : tArr) {
            if (!((Boolean) predicate.invoke(t8)).booleanValue()) {
                break;
            }
            arrayList.add(t8);
        }
        return arrayList;
    }

    public static final boolean[] toBooleanArray(Boolean[] boolArr) {
        Intrinsics.checkNotNullParameter(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            zArr[i8] = boolArr[i8].booleanValue();
        }
        return zArr;
    }

    public static final byte[] toByteArray(Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr2[i8] = bArr[i8].byteValue();
        }
        return bArr2;
    }

    public static final char[] toCharArray(Character[] chArr) {
        Intrinsics.checkNotNullParameter(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            cArr[i8] = chArr[i8].charValue();
        }
        return cArr;
    }

    public static final <T, C extends Collection<? super T>> C toCollection(T[] tArr, C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t8 : tArr) {
            destination.add(t8);
        }
        return destination;
    }

    public static final double[] toDoubleArray(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i8 = 0; i8 < length; i8++) {
            dArr2[i8] = dArr[i8].doubleValue();
        }
        return dArr2;
    }

    public static final float[] toFloatArray(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i8 = 0; i8 < length; i8++) {
            fArr2[i8] = fArr[i8].floatValue();
        }
        return fArr2;
    }

    public static final <T> HashSet<T> toHashSet(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (HashSet) toCollection(tArr, new HashSet(Q.mapCapacity(tArr.length)));
    }

    public static final int[] toIntArray(Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = numArr[i8].intValue();
        }
        return iArr;
    }

    public static <T> List<T> toList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? toMutableList(tArr) : S6.r.listOf(tArr[0]) : S6.r.emptyList();
    }

    public static final long[] toLongArray(Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            jArr[i8] = lArr[i8].longValue();
        }
        return jArr;
    }

    public static final <T> List<T> toMutableList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(C0777t.asCollection(tArr));
    }

    public static final <T> Set<T> toMutableSet(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (Set) toCollection(tArr, new LinkedHashSet(Q.mapCapacity(tArr.length)));
    }

    public static final <T> Set<T> toSet(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) toCollection(tArr, new LinkedHashSet(Q.mapCapacity(tArr.length))) : d0.setOf(tArr[0]) : d0.emptySet();
    }

    public static final short[] toShortArray(Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i8 = 0; i8 < length; i8++) {
            sArr[i8] = shArr[i8].shortValue();
        }
        return sArr;
    }

    public static final <T> Set<T> union(T[] tArr, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        S6.r.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> Iterable<J> withIndex(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new K(new t(tArr));
    }

    public static final <T, R, V> List<V> zip(T[] tArr, R[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(tArr[i8], other[i8]));
        }
        return arrayList;
    }

    public static final boolean all(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b9 : bArr) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final double average(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        double d9 = 0.0d;
        int i8 = 0;
        for (short s8 : sArr) {
            d9 += s8;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d9 / i8;
    }

    public static boolean contains(byte[] bArr, byte b9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return AbstractC0765i.indexOf(bArr, b9) >= 0;
    }

    public static final int count(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Byte> distinct(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return S6.r.toList(toMutableSet(bArr));
    }

    public static final <C extends Collection<? super Byte>> C filterNotTo(byte[] bArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b9 : bArr) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                destination.add(Byte.valueOf(b9));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Byte>> C filterTo(byte[] bArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                destination.add(Byte.valueOf(b9));
            }
        }
        return destination;
    }

    public static final Byte firstOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    public static final <R> R fold(byte[] bArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (byte b9 : bArr) {
            r8 = (R) operation.invoke(r8, Byte.valueOf(b9));
        }
        return r8;
    }

    public static final <R> R foldIndexed(byte[] bArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, Byte.valueOf(bArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final void forEach(byte[] bArr, f7.l action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (byte b9 : bArr) {
            action.invoke(Byte.valueOf(b9));
        }
    }

    public static final void forEachIndexed(byte[] bArr, f7.p action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Byte.valueOf(bArr[i8]));
            i8++;
            i9++;
        }
    }

    public static j7.l getIndices(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new j7.l(0, AbstractC0765i.getLastIndex(bArr));
    }

    public static int getLastIndex(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length - 1;
    }

    public static final Byte getOrNull(byte[] bArr, int i8) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i8 < 0 || i8 > AbstractC0765i.getLastIndex(bArr)) {
            return null;
        }
        return Byte.valueOf(bArr[i8]);
    }

    public static final String joinToString(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(bArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(bArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final Byte lastOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    public static final boolean none(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    public static final void shuffle(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        shuffle(bArr, (h7.f) h7.f.Default);
    }

    public static final Byte singleOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final void sortDescending(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            C0768l.sort(bArr);
            AbstractC0765i.reverse(bArr);
        }
    }

    public static final List<Byte> sorted(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Byte[] typedArray = C0768l.toTypedArray(bArr);
        C0768l.sort(typedArray);
        return AbstractC0765i.asList(typedArray);
    }

    public static final <R extends Comparable<? super R>> List<Byte> sortedBy(byte[] bArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new V6.g(selector));
    }

    public static final <R extends Comparable<? super R>> List<Byte> sortedByDescending(byte[] bArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new V6.h(selector));
    }

    public static final List<Byte> sortedDescending(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        C0768l.sort(bArrCopyOf);
        return reversed(bArrCopyOf);
    }

    public static final List<Byte> sortedWith(byte[] bArr, Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Byte[] typedArray = C0768l.toTypedArray(bArr);
        C0768l.sortWith(typedArray, comparator);
        return AbstractC0765i.asList(typedArray);
    }

    public static final int sum(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int i8 = 0;
        for (short s8 : sArr) {
            i8 += s8;
        }
        return i8;
    }

    public static final HashSet<Byte> toHashSet(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (HashSet) toCollection(bArr, new HashSet(Q.mapCapacity(bArr.length)));
    }

    public static final List<Byte> toMutableList(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b9 : bArr) {
            arrayList.add(Byte.valueOf(b9));
        }
        return arrayList;
    }

    public static final Set<Byte> toMutableSet(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (Set) toCollection(bArr, new LinkedHashSet(Q.mapCapacity(bArr.length)));
    }

    public static final Iterable<J> withIndex(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new K(new u(bArr));
    }

    public static final boolean all(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s8 : sArr) {
            if (!((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    public static final Iterable<Byte> asIterable(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0 ? S6.r.emptyList() : new C0771b(bArr);
    }

    public static final k7.m asSequence(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0 ? k7.p.emptySequence() : new k(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Byte>> M associateByTo(byte[] bArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (byte b9 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b9)), Byte.valueOf(b9));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(byte[] bArr, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b9 : bArr) {
            R6.p pVar = (R6.p) transform.invoke(Byte.valueOf(b9));
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    public static final double average(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        double d9 = 0.0d;
        int i8 = 0;
        for (int i9 : iArr) {
            d9 += i9;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d9 / i8;
    }

    public static boolean contains(short[] sArr, short s8) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return AbstractC0765i.indexOf(sArr, s8) >= 0;
    }

    public static final int count(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (short s8 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Short> distinct(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return S6.r.toList(toMutableSet(sArr));
    }

    public static final List<Byte> drop(byte[] bArr, int i8) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i8 >= 0) {
            return takeLast(bArr, j7.s.coerceAtLeast(bArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Byte> dropLast(byte[] bArr, int i8) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i8 >= 0) {
            return take(bArr, j7.s.coerceAtLeast(bArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Byte> filter(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                arrayList.add(Byte.valueOf(b9));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Byte>> C filterIndexedTo(byte[] bArr, C destination, f7.p predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            byte b9 = bArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Byte.valueOf(b9))).booleanValue()) {
                destination.add(Byte.valueOf(b9));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Byte> filterNot(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b9 : bArr) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                arrayList.add(Byte.valueOf(b9));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Short>> C filterNotTo(short[] sArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s8 : sArr) {
            if (!((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                destination.add(Short.valueOf(s8));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Short>> C filterTo(short[] sArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s8 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                destination.add(Short.valueOf(s8));
            }
        }
        return destination;
    }

    public static final Short firstOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    public static final <R> R fold(short[] sArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (short s8 : sArr) {
            r8 = (R) operation.invoke(r8, Short.valueOf(s8));
        }
        return r8;
    }

    public static final <R> R foldIndexed(short[] sArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, Short.valueOf(sArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <R> R foldRight(byte[] bArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = AbstractC0765i.getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Byte.valueOf(bArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(byte[] bArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = AbstractC0765i.getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Byte.valueOf(bArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final void forEach(short[] sArr, f7.l action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (short s8 : sArr) {
            action.invoke(Short.valueOf(s8));
        }
    }

    public static final void forEachIndexed(short[] sArr, f7.p action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Short.valueOf(sArr[i8]));
            i8++;
            i9++;
        }
    }

    public static j7.l getIndices(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new j7.l(0, AbstractC0765i.getLastIndex(sArr));
    }

    public static int getLastIndex(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length - 1;
    }

    public static final Short getOrNull(short[] sArr, int i8) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i8 < 0 || i8 > AbstractC0765i.getLastIndex(sArr)) {
            return null;
        }
        return Short.valueOf(sArr[i8]);
    }

    public static final int indexOfFirst(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Byte.valueOf(bArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Byte.valueOf(bArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Byte> intersect(byte[] bArr, Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        C0782y.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final String joinToString(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(sArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(sArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final Short lastOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(byte[] bArr, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Byte.valueOf(bArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(byte[] bArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b9 : bArr) {
            destination.add(transform.invoke(Byte.valueOf(b9)));
        }
        return destination;
    }

    public static final boolean none(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    public static final Byte randomOrNull(byte[] bArr, h7.f random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.nextInt(bArr.length)]);
    }

    public static final void shuffle(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        shuffle(sArr, (h7.f) h7.f.Default);
    }

    public static final Short singleOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    public static final List<Byte> slice(byte[] bArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? S6.r.emptyList() : C0768l.asList(AbstractC0765i.copyOfRange(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final List<Short> sorted(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Short[] typedArray = C0768l.toTypedArray(sArr);
        C0768l.sort(typedArray);
        return AbstractC0765i.asList(typedArray);
    }

    public static final byte[] sortedArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        C0768l.sort(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final byte[] sortedArrayDescending(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        sortDescending(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final <R extends Comparable<? super R>> List<Short> sortedBy(short[] sArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new V6.g(selector));
    }

    public static final <R extends Comparable<? super R>> List<Short> sortedByDescending(short[] sArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new V6.h(selector));
    }

    public static final List<Short> sortedDescending(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        C0768l.sort(sArrCopyOf);
        return reversed(sArrCopyOf);
    }

    public static final List<Short> sortedWith(short[] sArr, Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Short[] typedArray = C0768l.toTypedArray(sArr);
        C0768l.sortWith(typedArray, comparator);
        return AbstractC0765i.asList(typedArray);
    }

    public static final Set<Byte> subtract(byte[] bArr, Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        C0782y.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sum(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        return i8;
    }

    public static final int sumBy(byte[] bArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (byte b9 : bArr) {
            iIntValue += ((Number) selector.invoke(Byte.valueOf(b9))).intValue();
        }
        return iIntValue;
    }

    public static final double sumByDouble(byte[] bArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b9 : bArr) {
            dDoubleValue += ((Number) selector.invoke(Byte.valueOf(b9))).doubleValue();
        }
        return dDoubleValue;
    }

    public static final <C extends Collection<? super Byte>> C toCollection(byte[] bArr, C destination) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (byte b9 : bArr) {
            destination.add(Byte.valueOf(b9));
        }
        return destination;
    }

    public static final HashSet<Short> toHashSet(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (HashSet) toCollection(sArr, new HashSet(Q.mapCapacity(sArr.length)));
    }

    public static final Set<Short> toMutableSet(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (Set) toCollection(sArr, new LinkedHashSet(Q.mapCapacity(sArr.length)));
    }

    public static final Set<Byte> union(byte[] bArr, Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        S6.r.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Iterable<J> withIndex(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new K(new v(sArr));
    }

    public static final boolean all(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    public static final double average(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        double d9 = 0.0d;
        int i8 = 0;
        for (long j8 : jArr) {
            d9 += j8;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d9 / i8;
    }

    public static boolean contains(int[] iArr, int i8) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return AbstractC0765i.indexOf(iArr, i8) >= 0;
    }

    public static final int count(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (int i9 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i9))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Integer> distinct(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return S6.r.toList(toMutableSet(iArr));
    }

    public static final List<Byte> filterIndexed(byte[] bArr, f7.p predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            byte b9 = bArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Byte.valueOf(b9))).booleanValue()) {
                arrayList.add(Byte.valueOf(b9));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Integer>> C filterNotTo(int[] iArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                destination.add(Integer.valueOf(i8));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Integer>> C filterTo(int[] iArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                destination.add(Integer.valueOf(i8));
            }
        }
        return destination;
    }

    public static final byte first(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Integer firstOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(byte[] bArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b9 : bArr) {
            S6.r.addAll(destination, (Iterable) transform.invoke(Byte.valueOf(b9)));
        }
        return destination;
    }

    public static final <R> R fold(int[] iArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i8 : iArr) {
            r8 = (R) operation.invoke(r8, Integer.valueOf(i8));
        }
        return r8;
    }

    public static final <R> R foldIndexed(int[] iArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, Integer.valueOf(iArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final void forEach(int[] iArr, f7.l action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i8 : iArr) {
            action.invoke(Integer.valueOf(i8));
        }
    }

    public static final void forEachIndexed(int[] iArr, f7.p action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i8]));
            i8++;
            i9++;
        }
    }

    public static j7.l getIndices(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new j7.l(0, AbstractC0765i.getLastIndex(iArr));
    }

    public static int getLastIndex(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final Integer getOrNull(int[] iArr, int i8) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i8 < 0 || i8 > AbstractC0765i.getLastIndex(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i8]);
    }

    public static final String joinToString(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(iArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(iArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final byte last(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[AbstractC0765i.getLastIndex(bArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Integer lastOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    public static final <R> List<R> map(byte[] bArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b9 : bArr) {
            arrayList.add(transform.invoke(Byte.valueOf(b9)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(byte[] bArr, f7.p transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Byte.valueOf(bArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final boolean none(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0;
    }

    public static final byte random(byte[] bArr, h7.f random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (bArr.length != 0) {
            return bArr[random.nextInt(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Byte reduceRightIndexedOrNull(byte[] bArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bByteValue = bArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            bByteValue = ((Number) operation.invoke(Integer.valueOf(i8), Byte.valueOf(bArr[i8]), Byte.valueOf(bByteValue))).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    public static final Byte reduceRightOrNull(byte[] bArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bByteValue = bArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            bByteValue = ((Number) operation.invoke(Byte.valueOf(bArr[i8]), Byte.valueOf(bByteValue))).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    public static final List<Byte> reversed(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return S6.r.emptyList();
        }
        List<Byte> mutableList = toMutableList(bArr);
        S6.r.reverse(mutableList);
        return mutableList;
    }

    public static final void shuffle(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        shuffle(iArr, (h7.f) h7.f.Default);
    }

    public static final Integer singleOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    public static byte[] sliceArray(byte[] bArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        byte[] bArr2 = new byte[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            bArr2[i8] = bArr[it.next().intValue()];
            i8++;
        }
        return bArr2;
    }

    public static final List<Integer> sorted(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Integer[] typedArray = C0768l.toTypedArray(iArr);
        C0768l.sort(typedArray);
        return AbstractC0765i.asList(typedArray);
    }

    public static final <R extends Comparable<? super R>> List<Integer> sortedBy(int[] iArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new V6.g(selector));
    }

    public static final <R extends Comparable<? super R>> List<Integer> sortedByDescending(int[] iArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new V6.h(selector));
    }

    public static final List<Integer> sortedDescending(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        C0768l.sort(iArrCopyOf);
        return reversed(iArrCopyOf);
    }

    public static final List<Integer> sortedWith(int[] iArr, Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Integer[] typedArray = C0768l.toTypedArray(iArr);
        C0768l.sortWith(typedArray, comparator);
        return AbstractC0765i.asList(typedArray);
    }

    public static final long sum(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long j8 = 0;
        for (long j9 : jArr) {
            j8 += j9;
        }
        return j8;
    }

    public static final HashSet<Integer> toHashSet(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (HashSet) toCollection(iArr, new HashSet(Q.mapCapacity(iArr.length)));
    }

    public static final List<Short> toMutableList(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s8 : sArr) {
            arrayList.add(Short.valueOf(s8));
        }
        return arrayList;
    }

    public static final Set<Integer> toMutableSet(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (Set) toCollection(iArr, new LinkedHashSet(Q.mapCapacity(iArr.length)));
    }

    public static final Iterable<J> withIndex(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new K(new w(iArr));
    }

    public static final <R, V> List<V> zip(byte[] bArr, R[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final boolean all(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    public static final Iterable<Short> asIterable(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0 ? S6.r.emptyList() : new c(sArr);
    }

    public static final k7.m asSequence(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0 ? k7.p.emptySequence() : new l(sArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(byte[] bArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(bArr.length), 16));
        for (byte b9 : bArr) {
            R6.p pVar = (R6.p) transform.invoke(Byte.valueOf(b9));
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Byte> associateBy(byte[] bArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(bArr.length), 16));
        for (byte b9 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b9)), Byte.valueOf(b9));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Short>> M associateByTo(short[] sArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (short s8 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s8)), Short.valueOf(s8));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(short[] sArr, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s8 : sArr) {
            R6.p pVar = (R6.p) transform.invoke(Short.valueOf(s8));
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    public static final double average(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        double d9 = 0.0d;
        int i8 = 0;
        for (float f8 : fArr) {
            d9 += f8;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d9 / i8;
    }

    public static boolean contains(long[] jArr, long j8) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return AbstractC0765i.indexOf(jArr, j8) >= 0;
    }

    public static final int count(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Long> distinct(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return S6.r.toList(toMutableSet(jArr));
    }

    public static final List<Short> drop(short[] sArr, int i8) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i8 >= 0) {
            return takeLast(sArr, j7.s.coerceAtLeast(sArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Short> dropLast(short[] sArr, int i8) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i8 >= 0) {
            return take(sArr, j7.s.coerceAtLeast(sArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Byte> dropLastWhile(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = AbstractC0765i.getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(bArr[lastIndex]))).booleanValue()) {
                return take(bArr, lastIndex + 1);
            }
        }
        return S6.r.emptyList();
    }

    public static final List<Short> filter(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s8 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                arrayList.add(Short.valueOf(s8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Short>> C filterIndexedTo(short[] sArr, C destination, f7.p predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            short s8 = sArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Short.valueOf(s8))).booleanValue()) {
                destination.add(Short.valueOf(s8));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Short> filterNot(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s8 : sArr) {
            if (!((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                arrayList.add(Short.valueOf(s8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Long>> C filterNotTo(long[] jArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                destination.add(Long.valueOf(j8));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Long>> C filterTo(long[] jArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                destination.add(Long.valueOf(j8));
            }
        }
        return destination;
    }

    public static final Long firstOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    public static final <R> List<R> flatMap(byte[] bArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b9 : bArr) {
            S6.r.addAll(arrayList, (Iterable) transform.invoke(Byte.valueOf(b9)));
        }
        return arrayList;
    }

    public static final <R> R fold(long[] jArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (long j8 : jArr) {
            r8 = (R) operation.invoke(r8, Long.valueOf(j8));
        }
        return r8;
    }

    public static final <R> R foldIndexed(long[] jArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, Long.valueOf(jArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <R> R foldRight(short[] sArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = AbstractC0765i.getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Short.valueOf(sArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(short[] sArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = AbstractC0765i.getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Short.valueOf(sArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final void forEach(long[] jArr, f7.l action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (long j8 : jArr) {
            action.invoke(Long.valueOf(j8));
        }
    }

    public static final void forEachIndexed(long[] jArr, f7.p action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Long.valueOf(jArr[i8]));
            i8++;
            i9++;
        }
    }

    public static j7.l getIndices(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new j7.l(0, AbstractC0765i.getLastIndex(jArr));
    }

    public static int getLastIndex(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length - 1;
    }

    public static final Long getOrNull(long[] jArr, int i8) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i8 < 0 || i8 > AbstractC0765i.getLastIndex(jArr)) {
            return null;
        }
        return Long.valueOf(jArr[i8]);
    }

    public static int indexOf(byte[] bArr, byte b9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (b9 == bArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Short.valueOf(sArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Short.valueOf(sArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Short> intersect(short[] sArr, Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        C0782y.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final String joinToString(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(jArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(jArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static int lastIndexOf(byte[] bArr, byte b9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (b9 == bArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Long lastOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(short[] sArr, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Short.valueOf(sArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(short[] sArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s8 : sArr) {
            destination.add(transform.invoke(Short.valueOf(s8)));
        }
        return destination;
    }

    public static final boolean none(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    public static final Short randomOrNull(short[] sArr, h7.f random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.nextInt(sArr.length)]);
    }

    public static final Byte reduceIndexedOrNull(byte[] bArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bByteValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Byte.valueOf(bByteValue), Byte.valueOf(bArr[iNextInt]))).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    public static final Byte reduceOrNull(byte[] bArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            bByteValue = ((Number) operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[it.nextInt()]))).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    public static final byte reduceRight(byte[] bArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte bByteValue = bArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                bByteValue = ((Number) operation.invoke(Byte.valueOf(bArr[i8]), Byte.valueOf(bByteValue))).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte reduceRightIndexed(byte[] bArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte bByteValue = bArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                bByteValue = ((Number) operation.invoke(Integer.valueOf(i8), Byte.valueOf(bArr[i8]), Byte.valueOf(bByteValue))).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void shuffle(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        shuffle(jArr, (h7.f) h7.f.Default);
    }

    public static final byte single(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return bArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final Long singleOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    public static final List<Short> slice(short[] sArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? S6.r.emptyList() : C0768l.asList(AbstractC0765i.copyOfRange(sArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            C0768l.sort(sArr);
            AbstractC0765i.reverse(sArr);
        }
    }

    public static final List<Long> sorted(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Long[] typedArray = C0768l.toTypedArray(jArr);
        C0768l.sort(typedArray);
        return AbstractC0765i.asList(typedArray);
    }

    public static final short[] sortedArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        C0768l.sort(sArrCopyOf);
        return sArrCopyOf;
    }

    public static final short[] sortedArrayDescending(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        sortDescending(sArrCopyOf);
        return sArrCopyOf;
    }

    public static final <R extends Comparable<? super R>> List<Long> sortedBy(long[] jArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new V6.g(selector));
    }

    public static final <R extends Comparable<? super R>> List<Long> sortedByDescending(long[] jArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new V6.h(selector));
    }

    public static final List<Long> sortedDescending(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        C0768l.sort(jArrCopyOf);
        return reversed(jArrCopyOf);
    }

    public static final List<Long> sortedWith(long[] jArr, Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Long[] typedArray = C0768l.toTypedArray(jArr);
        C0768l.sortWith(typedArray, comparator);
        return AbstractC0765i.asList(typedArray);
    }

    public static final Set<Short> subtract(short[] sArr, Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        C0782y.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final float sum(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float f8 = 0.0f;
        for (float f9 : fArr) {
            f8 += f9;
        }
        return f8;
    }

    public static final int sumBy(short[] sArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (short s8 : sArr) {
            iIntValue += ((Number) selector.invoke(Short.valueOf(s8))).intValue();
        }
        return iIntValue;
    }

    public static final double sumByDouble(short[] sArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s8 : sArr) {
            dDoubleValue += ((Number) selector.invoke(Short.valueOf(s8))).doubleValue();
        }
        return dDoubleValue;
    }

    public static final List<Byte> takeLastWhile(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = AbstractC0765i.getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(bArr[lastIndex]))).booleanValue()) {
                return drop(bArr, lastIndex + 1);
            }
        }
        return toList(bArr);
    }

    public static final List<Byte> takeWhile(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b9 : bArr) {
            if (!((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b9));
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Short>> C toCollection(short[] sArr, C destination) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (short s8 : sArr) {
            destination.add(Short.valueOf(s8));
        }
        return destination;
    }

    public static final HashSet<Long> toHashSet(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (HashSet) toCollection(jArr, new HashSet(Q.mapCapacity(jArr.length)));
    }

    public static final List<Byte> toList(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return S6.r.emptyList();
        }
        if (length != 1) {
            return toMutableList(bArr);
        }
        return S6.r.listOf(Byte.valueOf(bArr[0]));
    }

    public static final Set<Long> toMutableSet(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (Set) toCollection(jArr, new LinkedHashSet(Q.mapCapacity(jArr.length)));
    }

    public static final Set<Byte> toSet(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return d0.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(bArr, new LinkedHashSet(Q.mapCapacity(bArr.length)));
        }
        return d0.setOf(Byte.valueOf(bArr[0]));
    }

    public static final Set<Short> union(short[] sArr, Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        S6.r.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Iterable<J> withIndex(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new K(new x(jArr));
    }

    public static final boolean all(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    public static final double average(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d9 = 0.0d;
        int i8 = 0;
        for (double d10 : dArr) {
            d9 += d10;
            i8++;
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return d9 / i8;
    }

    public static final boolean contains(boolean[] zArr, boolean z8) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return indexOf(zArr, z8) >= 0;
    }

    public static final int count(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Float> distinct(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return S6.r.toList(toMutableSet(fArr));
    }

    public static final List<Byte> dropWhile(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        for (byte b9 : bArr) {
            if (z8) {
                arrayList.add(Byte.valueOf(b9));
            } else if (!((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                arrayList.add(Byte.valueOf(b9));
                z8 = true;
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Float>> C filterNotTo(float[] fArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                destination.add(Float.valueOf(f8));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Float>> C filterTo(float[] fArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                destination.add(Float.valueOf(f8));
            }
        }
        return destination;
    }

    public static final Float firstOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final <R> R fold(float[] fArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (float f8 : fArr) {
            r8 = (R) operation.invoke(r8, Float.valueOf(f8));
        }
        return r8;
    }

    public static final <R> R foldIndexed(float[] fArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, Float.valueOf(fArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final void forEach(float[] fArr, f7.l action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (float f8 : fArr) {
            action.invoke(Float.valueOf(f8));
        }
    }

    public static final void forEachIndexed(float[] fArr, f7.p action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Float.valueOf(fArr[i8]));
            i8++;
            i9++;
        }
    }

    public static final j7.l getIndices(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new j7.l(0, getLastIndex(fArr));
    }

    public static final int getLastIndex(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length - 1;
    }

    public static final Float getOrNull(float[] fArr, int i8) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(fArr)) {
            return null;
        }
        return Float.valueOf(fArr[i8]);
    }

    public static final String joinToString(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(fArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(fArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final Float lastOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static final Byte maxWithOrNull(byte[] bArr, Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b9 = bArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b10 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b9), Byte.valueOf(b10)) < 0) {
                b9 = b10;
            }
        }
        return Byte.valueOf(b9);
    }

    public static final Byte minWithOrNull(byte[] bArr, Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b9 = bArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b10 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b9), Byte.valueOf(b10)) > 0) {
                b9 = b10;
            }
        }
        return Byte.valueOf(b9);
    }

    public static final boolean none(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    public static final byte reduce(byte[] bArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length != 0) {
            byte bByteValue = bArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                bByteValue = ((Number) operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[it.nextInt()]))).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte reduceIndexed(byte[] bArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length != 0) {
            byte bByteValue = bArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                int iNextInt = it.nextInt();
                bByteValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Byte.valueOf(bByteValue), Byte.valueOf(bArr[iNextInt]))).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte[] reversedArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int lastIndex = AbstractC0765i.getLastIndex(bArr);
        M it = new j7.l(0, lastIndex).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            bArr2[lastIndex - iNextInt] = bArr[iNextInt];
        }
        return bArr2;
    }

    public static final void shuffle(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        shuffle(fArr, (h7.f) h7.f.Default);
    }

    public static final Float singleOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    public static final List<Float> sorted(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Float[] typedArray = C0768l.toTypedArray(fArr);
        C0768l.sort(typedArray);
        return AbstractC0765i.asList(typedArray);
    }

    public static final <R extends Comparable<? super R>> List<Float> sortedBy(float[] fArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new V6.g(selector));
    }

    public static final <R extends Comparable<? super R>> List<Float> sortedByDescending(float[] fArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new V6.h(selector));
    }

    public static final List<Float> sortedDescending(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        C0768l.sort(fArrCopyOf);
        return reversed(fArrCopyOf);
    }

    public static final List<Float> sortedWith(float[] fArr, Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Float[] typedArray = C0768l.toTypedArray(fArr);
        C0768l.sortWith(typedArray, comparator);
        return AbstractC0765i.asList(typedArray);
    }

    public static final double sum(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d9 = 0.0d;
        for (double d10 : dArr) {
            d9 += d10;
        }
        return d9;
    }

    public static final HashSet<Float> toHashSet(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (HashSet) toCollection(fArr, new HashSet(Q.mapCapacity(fArr.length)));
    }

    public static final List<Integer> toMutableList(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i8 : iArr) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static final Set<Float> toMutableSet(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (Set) toCollection(fArr, new LinkedHashSet(Q.mapCapacity(fArr.length)));
    }

    public static final Iterable<J> withIndex(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new K(new y(fArr));
    }

    public static final boolean all(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d9 : dArr) {
            if (!((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    public static final Iterable<Integer> asIterable(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0 ? S6.r.emptyList() : new d(iArr);
    }

    public static final k7.m asSequence(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0 ? k7.p.emptySequence() : new C0075m(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Integer>> M associateByTo(int[] iArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i8 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i8)), Integer.valueOf(i8));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(int[] iArr, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i8 : iArr) {
            R6.p pVar = (R6.p) transform.invoke(Integer.valueOf(i8));
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    public static boolean contains(char[] cArr, char c9) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return indexOf(cArr, c9) >= 0;
    }

    public static final int count(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Double> distinct(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return S6.r.toList(toMutableSet(dArr));
    }

    public static final <K> List<Byte> distinctBy(byte[] bArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b9 : bArr) {
            if (hashSet.add(selector.invoke(Byte.valueOf(b9)))) {
                arrayList.add(Byte.valueOf(b9));
            }
        }
        return arrayList;
    }

    public static final List<Integer> drop(int[] iArr, int i8) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i8 >= 0) {
            return takeLast(iArr, j7.s.coerceAtLeast(iArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Integer> dropLast(int[] iArr, int i8) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i8 >= 0) {
            return take(iArr, j7.s.coerceAtLeast(iArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Integer> filter(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        return arrayList;
    }

    public static final List<Short> filterIndexed(short[] sArr, f7.p predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            short s8 = sArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Short.valueOf(s8))).booleanValue()) {
                arrayList.add(Short.valueOf(s8));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Integer>> C filterIndexedTo(int[] iArr, C destination, f7.p predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            int i11 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Integer.valueOf(i10))).booleanValue()) {
                destination.add(Integer.valueOf(i10));
            }
            i8++;
            i9 = i11;
        }
        return destination;
    }

    public static final List<Integer> filterNot(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Double>> C filterNotTo(double[] dArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d9 : dArr) {
            if (!((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                destination.add(Double.valueOf(d9));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Double>> C filterTo(double[] dArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                destination.add(Double.valueOf(d9));
            }
        }
        return destination;
    }

    public static final short first(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Double firstOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(short[] sArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s8 : sArr) {
            S6.r.addAll(destination, (Iterable) transform.invoke(Short.valueOf(s8)));
        }
        return destination;
    }

    public static final <R> R fold(double[] dArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (double d9 : dArr) {
            r8 = (R) operation.invoke(r8, Double.valueOf(d9));
        }
        return r8;
    }

    public static final <R> R foldIndexed(double[] dArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, Double.valueOf(dArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <R> R foldRight(int[] iArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = AbstractC0765i.getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(iArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(int[] iArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = AbstractC0765i.getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Integer.valueOf(iArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final void forEach(double[] dArr, f7.l action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (double d9 : dArr) {
            action.invoke(Double.valueOf(d9));
        }
    }

    public static final void forEachIndexed(double[] dArr, f7.p action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Double.valueOf(dArr[i8]));
            i8++;
            i9++;
        }
    }

    public static final j7.l getIndices(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new j7.l(0, getLastIndex(dArr));
    }

    public static final int getLastIndex(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length - 1;
    }

    public static final Double getOrNull(double[] dArr, int i8) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(dArr)) {
            return null;
        }
        return Double.valueOf(dArr[i8]);
    }

    public static int indexOf(short[] sArr, short s8) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (s8 == sArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Integer.valueOf(iArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Integer> intersect(int[] iArr, Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        C0782y.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final <A extends Appendable> A joinTo(byte[] bArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (byte b9 : bArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Byte.valueOf(b9)));
            } else {
                buffer.append(String.valueOf((int) b9));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String joinToString(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(dArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(dArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final short last(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[AbstractC0765i.getLastIndex(sArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int lastIndexOf(short[] sArr, short s8) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (s8 == sArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Double lastOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    public static final <R> List<R> map(short[] sArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s8 : sArr) {
            arrayList.add(transform.invoke(Short.valueOf(s8)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(short[] sArr, f7.p transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Short.valueOf(sArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(int[] iArr, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(int[] iArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i8 : iArr) {
            destination.add(transform.invoke(Integer.valueOf(i8)));
        }
        return destination;
    }

    public static final Float maxOrNull(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        M it = new j7.l(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final float maxOrThrow(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0].floatValue();
            M it = new j7.l(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, fArr[it.nextInt()].floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    public static final byte maxWithOrThrow(byte[] bArr, Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length != 0) {
            byte b9 = bArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                byte b10 = bArr[it.nextInt()];
                if (comparator.compare(Byte.valueOf(b9), Byte.valueOf(b10)) < 0) {
                    b9 = b10;
                }
            }
            return b9;
        }
        throw new NoSuchElementException();
    }

    public static final Float minOrNull(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        M it = new j7.l(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final float minOrThrow(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0].floatValue();
            M it = new j7.l(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, fArr[it.nextInt()].floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    public static final byte minWithOrThrow(byte[] bArr, Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length != 0) {
            byte b9 = bArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                byte b10 = bArr[it.nextInt()];
                if (comparator.compare(Byte.valueOf(b9), Byte.valueOf(b10)) > 0) {
                    b9 = b10;
                }
            }
            return b9;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    public static final short random(short[] sArr, h7.f random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (sArr.length != 0) {
            return sArr[random.nextInt(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Integer randomOrNull(int[] iArr, h7.f random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.nextInt(iArr.length)]);
    }

    public static void reverse(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = AbstractC0765i.getLastIndex(bArr);
        M it = new j7.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            byte b9 = bArr[iNextInt];
            bArr[iNextInt] = bArr[lastIndex];
            bArr[lastIndex] = b9;
            lastIndex--;
        }
    }

    public static final List<Short> reversed(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return S6.r.emptyList();
        }
        List<Short> mutableList = toMutableList(sArr);
        S6.r.reverse(mutableList);
        return mutableList;
    }

    public static final void shuffle(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        shuffle(dArr, h7.f.Default);
    }

    public static final Double singleOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    public static final List<Integer> slice(int[] iArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? S6.r.emptyList() : C0768l.asList(AbstractC0765i.copyOfRange(iArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static short[] sliceArray(short[] sArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        short[] sArr2 = new short[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            sArr2[i8] = sArr[it.next().intValue()];
            i8++;
        }
        return sArr2;
    }

    public static final List<Double> sorted(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Double[] typedArray = C0768l.toTypedArray(dArr);
        C0768l.sort(typedArray);
        return AbstractC0765i.asList(typedArray);
    }

    public static final int[] sortedArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        C0768l.sort(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final int[] sortedArrayDescending(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        sortDescending(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final <R extends Comparable<? super R>> List<Double> sortedBy(double[] dArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new V6.g(selector));
    }

    public static final <R extends Comparable<? super R>> List<Double> sortedByDescending(double[] dArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new V6.h(selector));
    }

    public static final List<Double> sortedDescending(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        C0768l.sort(dArrCopyOf);
        return reversed(dArrCopyOf);
    }

    public static final List<Double> sortedWith(double[] dArr, Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Double[] typedArray = C0768l.toTypedArray(dArr);
        C0768l.sortWith(typedArray, comparator);
        return AbstractC0765i.asList(typedArray);
    }

    public static final Set<Integer> subtract(int[] iArr, Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        C0782y.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(int[] iArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i8 : iArr) {
            iIntValue += ((Number) selector.invoke(Integer.valueOf(i8))).intValue();
        }
        return iIntValue;
    }

    public static final double sumByDouble(int[] iArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i8 : iArr) {
            dDoubleValue += ((Number) selector.invoke(Integer.valueOf(i8))).doubleValue();
        }
        return dDoubleValue;
    }

    public static final <C extends Collection<? super Integer>> C toCollection(int[] iArr, C destination) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i8 : iArr) {
            destination.add(Integer.valueOf(i8));
        }
        return destination;
    }

    public static final HashSet<Double> toHashSet(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (HashSet) toCollection(dArr, new HashSet(Q.mapCapacity(dArr.length)));
    }

    public static final Set<Double> toMutableSet(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (Set) toCollection(dArr, new LinkedHashSet(Q.mapCapacity(dArr.length)));
    }

    public static final Set<Integer> union(int[] iArr, Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        S6.r.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Iterable<J> withIndex(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new K(new z(dArr));
    }

    public static final <R, V> List<V> zip(short[] sArr, R[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final boolean all(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z8 : zArr) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    public static final /* synthetic */ boolean contains(float[] fArr, float f8) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        for (float f9 : fArr) {
            if (f9 == f8) {
                return true;
            }
        }
        return false;
    }

    public static final int count(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (boolean z8 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Boolean> distinct(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return S6.r.toList(toMutableSet(zArr));
    }

    public static final <C extends Collection<? super Boolean>> C filterNotTo(boolean[] zArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z8 : zArr) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                destination.add(Boolean.valueOf(z8));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Boolean>> C filterTo(boolean[] zArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z8 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                destination.add(Boolean.valueOf(z8));
            }
        }
        return destination;
    }

    public static final Boolean firstOrNull(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    public static final <R> R fold(boolean[] zArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (boolean z8 : zArr) {
            r8 = (R) operation.invoke(r8, Boolean.valueOf(z8));
        }
        return r8;
    }

    public static final <R> R foldIndexed(boolean[] zArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, Boolean.valueOf(zArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final void forEach(boolean[] zArr, f7.l action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (boolean z8 : zArr) {
            action.invoke(Boolean.valueOf(z8));
        }
    }

    public static final void forEachIndexed(boolean[] zArr, f7.p action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Boolean.valueOf(zArr[i8]));
            i8++;
            i9++;
        }
    }

    public static final j7.l getIndices(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new j7.l(0, getLastIndex(zArr));
    }

    public static final int getLastIndex(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length - 1;
    }

    public static final Boolean getOrNull(boolean[] zArr, int i8) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(zArr)) {
            return null;
        }
        return Boolean.valueOf(zArr[i8]);
    }

    public static final <K, M extends Map<? super K, List<Byte>>> M groupByTo(byte[] bArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (byte b9 : bArr) {
            Object objInvoke = keySelector.invoke(Byte.valueOf(b9));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b9));
        }
        return destination;
    }

    public static final String joinToString(boolean[] zArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(zArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(zArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final Boolean lastOrNull(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    public static final boolean none(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    public static final R6.p partition(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                arrayList.add(Byte.valueOf(b9));
            } else {
                arrayList2.add(Byte.valueOf(b9));
            }
        }
        return new R6.p(arrayList, arrayList2);
    }

    public static final Short reduceRightIndexedOrNull(short[] sArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sShortValue = sArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            sShortValue = ((Number) operation.invoke(Integer.valueOf(i8), Short.valueOf(sArr[i8]), Short.valueOf(sShortValue))).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    public static final Short reduceRightOrNull(short[] sArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sShortValue = sArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            sShortValue = ((Number) operation.invoke(Short.valueOf(sArr[i8]), Short.valueOf(sShortValue))).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    public static final void shuffle(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        shuffle(zArr, h7.f.Default);
    }

    public static final Boolean singleOrNull(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    public static final void sortDescending(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            C0768l.sort(iArr);
            AbstractC0765i.reverse(iArr);
        }
    }

    public static final List<Character> sorted(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] typedArray = C0768l.toTypedArray(cArr);
        C0768l.sort(typedArray);
        return AbstractC0765i.asList(typedArray);
    }

    public static final <R extends Comparable<? super R>> List<Boolean> sortedBy(boolean[] zArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new V6.g(selector));
    }

    public static final <R extends Comparable<? super R>> List<Boolean> sortedByDescending(boolean[] zArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new V6.h(selector));
    }

    public static final List<Character> sortedDescending(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        C0768l.sort(cArrCopyOf);
        return reversed(cArrCopyOf);
    }

    public static final List<Boolean> sortedWith(boolean[] zArr, Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Boolean[] typedArray = C0768l.toTypedArray(zArr);
        C0768l.sortWith(typedArray, comparator);
        return AbstractC0765i.asList(typedArray);
    }

    public static final List<Byte> take(byte[] bArr, int i8) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        if (i8 >= bArr.length) {
            return toList(bArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (byte b9 : bArr) {
            arrayList.add(Byte.valueOf(b9));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Byte> takeLast(byte[] bArr, int i8) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        int length = bArr.length;
        if (i8 >= length) {
            return toList(bArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Byte.valueOf(bArr[i9]));
        }
        return arrayList;
    }

    public static final HashSet<Boolean> toHashSet(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (HashSet) toCollection(zArr, new HashSet(Q.mapCapacity(zArr.length)));
    }

    public static final List<Long> toMutableList(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j8 : jArr) {
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    public static final Set<Boolean> toMutableSet(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (Set) toCollection(zArr, new LinkedHashSet(Q.mapCapacity(zArr.length)));
    }

    public static final Iterable<J> withIndex(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new K(new A(zArr));
    }

    public static final boolean all(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c9 : cArr) {
            if (!((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    public static final Iterable<Long> asIterable(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0 ? S6.r.emptyList() : new e(jArr);
    }

    public static final k7.m asSequence(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0 ? k7.p.emptySequence() : new n(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(short[] sArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(sArr.length), 16));
        for (short s8 : sArr) {
            R6.p pVar = (R6.p) transform.invoke(Short.valueOf(s8));
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Short> associateBy(short[] sArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(sArr.length), 16));
        for (short s8 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s8)), Short.valueOf(s8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Long>> M associateByTo(long[] jArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (long j8 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j8)), Long.valueOf(j8));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(long[] jArr, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j8 : jArr) {
            R6.p pVar = (R6.p) transform.invoke(Long.valueOf(j8));
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    public static final /* synthetic */ boolean contains(double[] dArr, double d9) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        for (double d10 : dArr) {
            if (d10 == d9) {
                return true;
            }
        }
        return false;
    }

    public static final int count(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (char c9 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final List<Character> distinct(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return S6.r.toList(toMutableSet(cArr));
    }

    public static final List<Long> drop(long[] jArr, int i8) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i8 >= 0) {
            return takeLast(jArr, j7.s.coerceAtLeast(jArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Long> dropLast(long[] jArr, int i8) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i8 >= 0) {
            return take(jArr, j7.s.coerceAtLeast(jArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Short> dropLastWhile(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = AbstractC0765i.getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Short.valueOf(sArr[lastIndex]))).booleanValue()) {
                return take(sArr, lastIndex + 1);
            }
        }
        return S6.r.emptyList();
    }

    public static final List<Long> filter(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                arrayList.add(Long.valueOf(j8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Long>> C filterIndexedTo(long[] jArr, C destination, f7.p predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            long j8 = jArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Long.valueOf(j8))).booleanValue()) {
                destination.add(Long.valueOf(j8));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Long> filterNot(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j8 : jArr) {
            if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                arrayList.add(Long.valueOf(j8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Character>> C filterNotTo(char[] cArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c9 : cArr) {
            if (!((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                destination.add(Character.valueOf(c9));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Character>> C filterTo(char[] cArr, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c9 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                destination.add(Character.valueOf(c9));
            }
        }
        return destination;
    }

    public static final Character firstOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    public static final <R> List<R> flatMap(short[] sArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s8 : sArr) {
            S6.r.addAll(arrayList, (Iterable) transform.invoke(Short.valueOf(s8)));
        }
        return arrayList;
    }

    public static final <R> R fold(char[] cArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (char c9 : cArr) {
            r8 = (R) operation.invoke(r8, Character.valueOf(c9));
        }
        return r8;
    }

    public static final <R> R foldIndexed(char[] cArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, Character.valueOf(cArr[i8]));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <R> R foldRight(long[] jArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = AbstractC0765i.getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Long.valueOf(jArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(long[] jArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = AbstractC0765i.getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Long.valueOf(jArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final void forEach(char[] cArr, f7.l action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (char c9 : cArr) {
            action.invoke(Character.valueOf(c9));
        }
    }

    public static final void forEachIndexed(char[] cArr, f7.p action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            action.invoke(Integer.valueOf(i9), Character.valueOf(cArr[i8]));
            i8++;
            i9++;
        }
    }

    public static final j7.l getIndices(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new j7.l(0, getLastIndex(cArr));
    }

    public static final int getLastIndex(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length - 1;
    }

    public static final Character getOrNull(char[] cArr, int i8) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i8 < 0 || i8 > getLastIndex(cArr)) {
            return null;
        }
        return Character.valueOf(cArr[i8]);
    }

    public static final <K> Map<K, List<Byte>> groupBy(byte[] bArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b9 : bArr) {
            Object objInvoke = keySelector.invoke(Byte.valueOf(b9));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b9));
        }
        return linkedHashMap;
    }

    public static int indexOf(int[] iArr, int i8) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (i8 == iArr[i9]) {
                return i9;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Long.valueOf(jArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Long> intersect(long[] jArr, Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        C0782y.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final String joinToString(char[] cArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(cArr, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(cArr, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static int lastIndexOf(int[] iArr, int i8) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i9 = length - 1;
                if (i8 == iArr[length]) {
                    return length;
                }
                if (i9 < 0) {
                    break;
                }
                length = i9;
            }
        }
        return -1;
    }

    public static final Character lastOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(long[] jArr, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Long.valueOf(jArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(long[] jArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j8 : jArr) {
            destination.add(transform.invoke(Long.valueOf(j8)));
        }
        return destination;
    }

    public static final <R extends Comparable<? super R>> Byte maxByOrNull(byte[] bArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b9 = bArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b9);
        }
        Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            byte b10 = bArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b10));
            if (comparable.compareTo(comparable2) < 0) {
                b9 = b10;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b9);
    }

    public static final <R extends Comparable<? super R>> Byte minByOrNull(byte[] bArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b9 = bArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b9);
        }
        Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            byte b10 = bArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b10));
            if (comparable.compareTo(comparable2) > 0) {
                b9 = b10;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b9);
    }

    public static final boolean none(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    public static final Long randomOrNull(long[] jArr, h7.f random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.nextInt(jArr.length)]);
    }

    public static final short reduceRight(short[] sArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(sArr);
        if (lastIndex >= 0) {
            short sShortValue = sArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                sShortValue = ((Number) operation.invoke(Short.valueOf(sArr[i8]), Short.valueOf(sShortValue))).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short reduceRightIndexed(short[] sArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(sArr);
        if (lastIndex >= 0) {
            short sShortValue = sArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                sShortValue = ((Number) operation.invoke(Integer.valueOf(i8), Short.valueOf(sArr[i8]), Short.valueOf(sShortValue))).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void shuffle(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        shuffle(cArr, (h7.f) h7.f.Default);
    }

    public static final short single(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return sArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final Character singleOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    public static final List<Long> slice(long[] jArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? S6.r.emptyList() : C0768l.asList(AbstractC0765i.copyOfRange(jArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final long[] sortedArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        C0768l.sort(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final long[] sortedArrayDescending(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        sortDescending(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final <R extends Comparable<? super R>> List<Character> sortedBy(char[] cArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new V6.g(selector));
    }

    public static final <R extends Comparable<? super R>> List<Character> sortedByDescending(char[] cArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new V6.h(selector));
    }

    public static final List<Character> sortedWith(char[] cArr, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Character[] typedArray = C0768l.toTypedArray(cArr);
        C0768l.sortWith(typedArray, comparator);
        return AbstractC0765i.asList(typedArray);
    }

    public static final Set<Long> subtract(long[] jArr, Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        C0782y.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(long[] jArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (long j8 : jArr) {
            iIntValue += ((Number) selector.invoke(Long.valueOf(j8))).intValue();
        }
        return iIntValue;
    }

    public static final double sumByDouble(long[] jArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j8 : jArr) {
            dDoubleValue += ((Number) selector.invoke(Long.valueOf(j8))).doubleValue();
        }
        return dDoubleValue;
    }

    public static final List<Short> takeLastWhile(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = AbstractC0765i.getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Short.valueOf(sArr[lastIndex]))).booleanValue()) {
                return drop(sArr, lastIndex + 1);
            }
        }
        return toList(sArr);
    }

    public static final List<Short> takeWhile(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s8 : sArr) {
            if (!((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s8));
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Long>> C toCollection(long[] jArr, C destination) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (long j8 : jArr) {
            destination.add(Long.valueOf(j8));
        }
        return destination;
    }

    public static final HashSet<Character> toHashSet(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (HashSet) toCollection(cArr, new HashSet(Q.mapCapacity(j7.s.coerceAtMost(cArr.length, 128))));
    }

    public static final List<Short> toList(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return S6.r.emptyList();
        }
        if (length != 1) {
            return toMutableList(sArr);
        }
        return S6.r.listOf(Short.valueOf(sArr[0]));
    }

    public static final Set<Character> toMutableSet(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (Set) toCollection(cArr, new LinkedHashSet(Q.mapCapacity(j7.s.coerceAtMost(cArr.length, 128))));
    }

    public static final Set<Short> toSet(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return d0.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(sArr, new LinkedHashSet(Q.mapCapacity(sArr.length)));
        }
        return d0.setOf(Short.valueOf(sArr[0]));
    }

    public static final Set<Long> union(long[] jArr, Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        S6.r.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Iterable<J> withIndex(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new K(new B(cArr));
    }

    public static final <T> boolean any(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t8 : tArr) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final List<Integer> filterIndexed(int[] iArr, f7.p predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            int i11 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Integer.valueOf(i10))).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
            i8++;
            i9 = i11;
        }
        return arrayList;
    }

    public static final int first(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T firstOrNull(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t8 : tArr) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        return null;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(int[] iArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i8 : iArr) {
            S6.r.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i8)));
        }
        return destination;
    }

    public static final int last(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[AbstractC0765i.getLastIndex(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T lastOrNull(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            T t8 = tArr[length];
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return t8;
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(int[] iArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i8 : iArr) {
            arrayList.add(transform.invoke(Integer.valueOf(i8)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(int[] iArr, f7.p transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R extends Comparable<? super R>> byte maxByOrThrow(byte[] bArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            byte b9 = bArr[0];
            int lastIndex = AbstractC0765i.getLastIndex(bArr);
            if (lastIndex == 0) {
                return b9;
            }
            Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b9));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte b10 = bArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b10));
                if (comparable.compareTo(comparable2) < 0) {
                    b9 = b10;
                    comparable = comparable2;
                }
            }
            return b9;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> byte minByOrThrow(byte[] bArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            byte b9 = bArr[0];
            int lastIndex = AbstractC0765i.getLastIndex(bArr);
            if (lastIndex == 0) {
                return b9;
            }
            Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b9));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte b10 = bArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b10));
                if (comparable.compareTo(comparable2) > 0) {
                    b9 = b10;
                    comparable = comparable2;
                }
            }
            return b9;
        }
        throw new NoSuchElementException();
    }

    public static final <T> boolean none(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t8 : tArr) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final int random(int[] iArr, h7.f random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (iArr.length != 0) {
            return iArr[random.nextInt(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Short reduceIndexedOrNull(short[] sArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sShortValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Short.valueOf(sShortValue), Short.valueOf(sArr[iNextInt]))).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    public static final Short reduceOrNull(short[] sArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            sShortValue = ((Number) operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[it.nextInt()]))).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    public static final List<Integer> reversed(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return S6.r.emptyList();
        }
        List<Integer> mutableList = toMutableList(iArr);
        S6.r.reverse(mutableList);
        return mutableList;
    }

    public static final <T> void shuffle(T[] tArr, h7.f random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(tArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            T t8 = tArr[lastIndex];
            tArr[lastIndex] = tArr[iNextInt];
            tArr[iNextInt] = t8;
        }
    }

    public static final <T> T singleOrNull(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t8 = null;
        boolean z8 = false;
        for (T t9 : tArr) {
            if (((Boolean) predicate.invoke(t9)).booleanValue()) {
                if (z8) {
                    return null;
                }
                z8 = true;
                t8 = t9;
            }
        }
        if (z8) {
            return t8;
        }
        return null;
    }

    public static int[] sliceArray(int[] iArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int[] iArr2 = new int[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr2[i8] = iArr[it.next().intValue()];
            i8++;
        }
        return iArr2;
    }

    public static final List<Float> toMutableList(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f8 : fArr) {
            arrayList.add(Float.valueOf(f8));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(int[] iArr, R[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final boolean any(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Iterable<Float> asIterable(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0 ? S6.r.emptyList() : new f(fArr);
    }

    public static final k7.m asSequence(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0 ? k7.p.emptySequence() : new o(fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Float>> M associateByTo(float[] fArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (float f8 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f8)), Float.valueOf(f8));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(float[] fArr, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f8 : fArr) {
            R6.p pVar = (R6.p) transform.invoke(Float.valueOf(f8));
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    public static final List<Float> drop(float[] fArr, int i8) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i8 >= 0) {
            return takeLast(fArr, j7.s.coerceAtLeast(fArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Float> dropLast(float[] fArr, int i8) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i8 >= 0) {
            return take(fArr, j7.s.coerceAtLeast(fArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Short> dropWhile(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        for (short s8 : sArr) {
            if (z8) {
                arrayList.add(Short.valueOf(s8));
            } else if (!((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                arrayList.add(Short.valueOf(s8));
                z8 = true;
            }
        }
        return arrayList;
    }

    public static final List<Float> filter(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                arrayList.add(Float.valueOf(f8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Float>> C filterIndexedTo(float[] fArr, C destination, f7.p predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            float f8 = fArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Float.valueOf(f8))).booleanValue()) {
                destination.add(Float.valueOf(f8));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Float> filterNot(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                arrayList.add(Float.valueOf(f8));
            }
        }
        return arrayList;
    }

    public static final Byte firstOrNull(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                return Byte.valueOf(b9);
            }
        }
        return null;
    }

    public static final <R> R foldRight(float[] fArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Float.valueOf(fArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(float[] fArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Float.valueOf(fArr[lastIndex]), r8);
        }
        return r8;
    }

    public static int indexOf(long[] jArr, long j8) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (j8 == jArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Float.valueOf(fArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Float> intersect(float[] fArr, Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        C0782y.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static int lastIndexOf(long[] jArr, long j8) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (j8 == jArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(float[] fArr, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Float.valueOf(fArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(float[] fArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f8 : fArr) {
            destination.add(transform.invoke(Float.valueOf(f8)));
        }
        return destination;
    }

    public static final boolean none(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Float randomOrNull(float[] fArr, h7.f random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.nextInt(fArr.length)]);
    }

    public static final short reduce(short[] sArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length != 0) {
            short sShortValue = sArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                sShortValue = ((Number) operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[it.nextInt()]))).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short reduceIndexed(short[] sArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length != 0) {
            short sShortValue = sArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                int iNextInt = it.nextInt();
                sShortValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Short.valueOf(sShortValue), Short.valueOf(sArr[iNextInt]))).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short[] reversedArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int lastIndex = AbstractC0765i.getLastIndex(sArr);
        M it = new j7.l(0, lastIndex).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            sArr2[lastIndex - iNextInt] = sArr[iNextInt];
        }
        return sArr2;
    }

    public static final List<Float> slice(float[] fArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? S6.r.emptyList() : C0768l.asList(C0768l.copyOfRange(fArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            C0768l.sort(jArr);
            AbstractC0765i.reverse(jArr);
        }
    }

    public static final float[] sortedArray(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        C0768l.sort(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final float[] sortedArrayDescending(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        sortDescending(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final Set<Float> subtract(float[] fArr, Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        C0782y.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(float[] fArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (float f8 : fArr) {
            iIntValue += ((Number) selector.invoke(Float.valueOf(f8))).intValue();
        }
        return iIntValue;
    }

    public static final double sumByDouble(float[] fArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (float f8 : fArr) {
            dDoubleValue += ((Number) selector.invoke(Float.valueOf(f8))).doubleValue();
        }
        return dDoubleValue;
    }

    public static final <C extends Collection<? super Float>> C toCollection(float[] fArr, C destination) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (float f8 : fArr) {
            destination.add(Float.valueOf(f8));
        }
        return destination;
    }

    public static final Set<Float> union(float[] fArr, Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        S6.r.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s8 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Short firstOrNull(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s8 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                return Short.valueOf(s8);
            }
        }
        return null;
    }

    public static final Short maxWithOrNull(short[] sArr, Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s8 = sArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s9 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s8), Short.valueOf(s9)) < 0) {
                s8 = s9;
            }
        }
        return Short.valueOf(s8);
    }

    public static final Short minWithOrNull(short[] sArr, Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s8 = sArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s9 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s8), Short.valueOf(s9)) > 0) {
                s8 = s9;
            }
        }
        return Short.valueOf(s8);
    }

    public static final boolean none(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s8 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Integer reduceRightIndexedOrNull(int[] iArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iIntValue = iArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            iIntValue = ((Number) operation.invoke(Integer.valueOf(i8), Integer.valueOf(iArr[i8]), Integer.valueOf(iIntValue))).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Integer reduceRightOrNull(int[] iArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iIntValue = iArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            iIntValue = ((Number) operation.invoke(Integer.valueOf(iArr[i8]), Integer.valueOf(iIntValue))).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Byte singleOrNull(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Byte bValueOf = null;
        boolean z8 = false;
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                if (z8) {
                    return null;
                }
                bValueOf = Byte.valueOf(b9);
                z8 = true;
            }
        }
        if (z8) {
            return bValueOf;
        }
        return null;
    }

    public static final List<Double> toMutableList(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d9 : dArr) {
            arrayList.add(Double.valueOf(d9));
        }
        return arrayList;
    }

    public static final boolean any(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Iterable<Double> asIterable(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0 ? S6.r.emptyList() : new g(dArr);
    }

    public static final k7.m asSequence(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0 ? k7.p.emptySequence() : new p(dArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(int[] iArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(iArr.length), 16));
        for (int i8 : iArr) {
            R6.p pVar = (R6.p) transform.invoke(Integer.valueOf(i8));
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Integer> associateBy(int[] iArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(iArr.length), 16));
        for (int i8 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i8)), Integer.valueOf(i8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Double>> M associateByTo(double[] dArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (double d9 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d9)), Double.valueOf(d9));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(double[] dArr, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d9 : dArr) {
            R6.p pVar = (R6.p) transform.invoke(Double.valueOf(d9));
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    public static final <K> List<Short> distinctBy(short[] sArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s8 : sArr) {
            if (hashSet.add(selector.invoke(Short.valueOf(s8)))) {
                arrayList.add(Short.valueOf(s8));
            }
        }
        return arrayList;
    }

    public static final List<Double> drop(double[] dArr, int i8) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i8 >= 0) {
            return takeLast(dArr, j7.s.coerceAtLeast(dArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Double> dropLast(double[] dArr, int i8) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i8 >= 0) {
            return take(dArr, j7.s.coerceAtLeast(dArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Integer> dropLastWhile(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = AbstractC0765i.getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(iArr[lastIndex]))).booleanValue()) {
                return take(iArr, lastIndex + 1);
            }
        }
        return S6.r.emptyList();
    }

    public static final List<Double> filter(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                arrayList.add(Double.valueOf(d9));
            }
        }
        return arrayList;
    }

    public static final List<Long> filterIndexed(long[] jArr, f7.p predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            long j8 = jArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Long.valueOf(j8))).booleanValue()) {
                arrayList.add(Long.valueOf(j8));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Double>> C filterIndexedTo(double[] dArr, C destination, f7.p predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            double d9 = dArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Double.valueOf(d9))).booleanValue()) {
                destination.add(Double.valueOf(d9));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Double> filterNot(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d9 : dArr) {
            if (!((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                arrayList.add(Double.valueOf(d9));
            }
        }
        return arrayList;
    }

    public static final long first(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Integer firstOrNull(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                return Integer.valueOf(i8);
            }
        }
        return null;
    }

    public static final <R> List<R> flatMap(int[] iArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            S6.r.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i8)));
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(long[] jArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j8 : jArr) {
            S6.r.addAll(destination, (Iterable) transform.invoke(Long.valueOf(j8)));
        }
        return destination;
    }

    public static final <R> R foldRight(double[] dArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Double.valueOf(dArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(double[] dArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Double.valueOf(dArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final /* synthetic */ int indexOf(float[] fArr, float f8) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (f8 == fArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Double.valueOf(dArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Double.valueOf(dArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Double> intersect(double[] dArr, Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        C0782y.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final long last(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[AbstractC0765i.getLastIndex(jArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final /* synthetic */ int lastIndexOf(float[] fArr, float f8) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (f8 == fArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Byte lastOrNull(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            byte b9 = bArr[length];
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                return Byte.valueOf(b9);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(long[] jArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j8 : jArr) {
            arrayList.add(transform.invoke(Long.valueOf(j8)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(long[] jArr, f7.p transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Long.valueOf(jArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(double[] dArr, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Double.valueOf(dArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(double[] dArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d9 : dArr) {
            destination.add(transform.invoke(Double.valueOf(d9)));
        }
        return destination;
    }

    public static final <T extends Comparable<? super T>> T maxOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t8 = tArr[0];
        M it = new j7.l(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t9 = tArr[it.nextInt()];
            if (t8.compareTo(t9) < 0) {
                t8 = t9;
            }
        }
        return t8;
    }

    public static final <T extends Comparable<? super T>> T maxOrThrow(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            T t8 = tArr[0];
            M it = new j7.l(1, getLastIndex(tArr)).iterator();
            while (it.hasNext()) {
                T t9 = tArr[it.nextInt()];
                if (t8.compareTo(t9) < 0) {
                    t8 = t9;
                }
            }
            return t8;
        }
        throw new NoSuchElementException();
    }

    public static final short maxWithOrThrow(short[] sArr, Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length != 0) {
            short s8 = sArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                short s9 = sArr[it.nextInt()];
                if (comparator.compare(Short.valueOf(s8), Short.valueOf(s9)) < 0) {
                    s8 = s9;
                }
            }
            return s8;
        }
        throw new NoSuchElementException();
    }

    public static final <T extends Comparable<? super T>> T minOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t8 = tArr[0];
        M it = new j7.l(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t9 = tArr[it.nextInt()];
            if (t8.compareTo(t9) > 0) {
                t8 = t9;
            }
        }
        return t8;
    }

    public static final <T extends Comparable<? super T>> T minOrThrow(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            T t8 = tArr[0];
            M it = new j7.l(1, getLastIndex(tArr)).iterator();
            while (it.hasNext()) {
                T t9 = tArr[it.nextInt()];
                if (t8.compareTo(t9) > 0) {
                    t8 = t9;
                }
            }
            return t8;
        }
        throw new NoSuchElementException();
    }

    public static final short minWithOrThrow(short[] sArr, Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length != 0) {
            short s8 = sArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                short s9 = sArr[it.nextInt()];
                if (comparator.compare(Short.valueOf(s8), Short.valueOf(s9)) > 0) {
                    s8 = s9;
                }
            }
            return s8;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final long random(long[] jArr, h7.f random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (jArr.length != 0) {
            return jArr[random.nextInt(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Double randomOrNull(double[] dArr, h7.f random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.nextInt(dArr.length)]);
    }

    public static final int reduceRight(int[] iArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(iArr);
        if (lastIndex >= 0) {
            int iIntValue = iArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                iIntValue = ((Number) operation.invoke(Integer.valueOf(iArr[i8]), Integer.valueOf(iIntValue))).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int reduceRightIndexed(int[] iArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(iArr);
        if (lastIndex >= 0) {
            int iIntValue = iArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                iIntValue = ((Number) operation.invoke(Integer.valueOf(i8), Integer.valueOf(iArr[i8]), Integer.valueOf(iIntValue))).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static void reverse(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = AbstractC0765i.getLastIndex(sArr);
        M it = new j7.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            short s8 = sArr[iNextInt];
            sArr[iNextInt] = sArr[lastIndex];
            sArr[lastIndex] = s8;
            lastIndex--;
        }
    }

    public static final List<Long> reversed(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return S6.r.emptyList();
        }
        List<Long> mutableList = toMutableList(jArr);
        S6.r.reverse(mutableList);
        return mutableList;
    }

    public static final int single(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final List<Double> slice(double[] dArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? S6.r.emptyList() : C0768l.asList(C0768l.copyOfRange(dArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static long[] sliceArray(long[] jArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        long[] jArr2 = new long[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            jArr2[i8] = jArr[it.next().intValue()];
            i8++;
        }
        return jArr2;
    }

    public static final double[] sortedArray(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        C0768l.sort(dArrCopyOf);
        return dArrCopyOf;
    }

    public static final double[] sortedArrayDescending(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        sortDescending(dArrCopyOf);
        return dArrCopyOf;
    }

    public static final Set<Double> subtract(double[] dArr, Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        C0782y.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(double[] dArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (double d9 : dArr) {
            iIntValue += ((Number) selector.invoke(Double.valueOf(d9))).intValue();
        }
        return iIntValue;
    }

    public static final double sumByDouble(double[] dArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (double d9 : dArr) {
            dDoubleValue += ((Number) selector.invoke(Double.valueOf(d9))).doubleValue();
        }
        return dDoubleValue;
    }

    public static final List<Integer> takeLastWhile(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = AbstractC0765i.getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(iArr[lastIndex]))).booleanValue()) {
                return drop(iArr, lastIndex + 1);
            }
        }
        return toList(iArr);
    }

    public static final List<Integer> takeWhile(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (!((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Double>> C toCollection(double[] dArr, C destination) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (double d9 : dArr) {
            destination.add(Double.valueOf(d9));
        }
        return destination;
    }

    public static final List<Integer> toList(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return S6.r.emptyList();
        }
        if (length != 1) {
            return toMutableList(iArr);
        }
        return S6.r.listOf(Integer.valueOf(iArr[0]));
    }

    public static final Set<Integer> toSet(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return d0.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(iArr, new LinkedHashSet(Q.mapCapacity(iArr.length)));
        }
        return d0.setOf(Integer.valueOf(iArr[0]));
    }

    public static final Set<Double> union(double[] dArr, Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        S6.r.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final <R, V> List<V> zip(long[] jArr, R[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final boolean any(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Long firstOrNull(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return Long.valueOf(j8);
            }
        }
        return null;
    }

    public static final <A extends Appendable> A joinTo(short[] sArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (short s8 : sArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Short.valueOf(s8)));
            } else {
                buffer.append(String.valueOf((int) s8));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean none(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void sortDescending(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            C0768l.sort(fArr);
            reverse(fArr);
        }
    }

    public static final List<Boolean> toMutableList(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z8 : zArr) {
            arrayList.add(Boolean.valueOf(z8));
        }
        return arrayList;
    }

    public static final boolean any(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Iterable<Boolean> asIterable(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0 ? S6.r.emptyList() : new h(zArr);
    }

    public static final k7.m asSequence(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0 ? k7.p.emptySequence() : new q(zArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Boolean>> M associateByTo(boolean[] zArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z8 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z8)), Boolean.valueOf(z8));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(boolean[] zArr, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z8 : zArr) {
            R6.p pVar = (R6.p) transform.invoke(Boolean.valueOf(z8));
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    public static final List<Boolean> drop(boolean[] zArr, int i8) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i8 >= 0) {
            return takeLast(zArr, j7.s.coerceAtLeast(zArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Boolean> dropLast(boolean[] zArr, int i8) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i8 >= 0) {
            return take(zArr, j7.s.coerceAtLeast(zArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Boolean> filter(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z8 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                arrayList.add(Boolean.valueOf(z8));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Boolean>> C filterIndexedTo(boolean[] zArr, C destination, f7.p predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            boolean z8 = zArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Boolean.valueOf(z8))).booleanValue()) {
                destination.add(Boolean.valueOf(z8));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Boolean> filterNot(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z8 : zArr) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                arrayList.add(Boolean.valueOf(z8));
            }
        }
        return arrayList;
    }

    public static final Float firstOrNull(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return Float.valueOf(f8);
            }
        }
        return null;
    }

    public static final <R> R foldRight(boolean[] zArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Boolean.valueOf(zArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(boolean[] zArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Boolean.valueOf(zArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <K, M extends Map<? super K, List<Short>>> M groupByTo(short[] sArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (short s8 : sArr) {
            Object objInvoke = keySelector.invoke(Short.valueOf(s8));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s8));
        }
        return destination;
    }

    public static final /* synthetic */ int indexOf(double[] dArr, double d9) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (d9 == dArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(zArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Boolean.valueOf(zArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Boolean> intersect(boolean[] zArr, Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        C0782y.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final /* synthetic */ int lastIndexOf(double[] dArr, double d9) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (d9 == dArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(boolean[] zArr, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Boolean.valueOf(zArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(boolean[] zArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z8 : zArr) {
            destination.add(transform.invoke(Boolean.valueOf(z8)));
        }
        return destination;
    }

    public static final boolean none(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final R6.p partition(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s8 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                arrayList.add(Short.valueOf(s8));
            } else {
                arrayList2.add(Short.valueOf(s8));
            }
        }
        return new R6.p(arrayList, arrayList2);
    }

    public static final Boolean randomOrNull(boolean[] zArr, h7.f random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.nextInt(zArr.length)]);
    }

    public static final Integer reduceIndexedOrNull(int[] iArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iIntValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Integer.valueOf(iIntValue), Integer.valueOf(iArr[iNextInt]))).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Integer reduceOrNull(int[] iArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            iIntValue = ((Number) operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[it.nextInt()]))).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final void shuffle(byte[] bArr, h7.f random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = AbstractC0765i.getLastIndex(bArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            byte b9 = bArr[lastIndex];
            bArr[lastIndex] = bArr[iNextInt];
            bArr[iNextInt] = b9;
        }
    }

    public static final Short singleOrNull(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Short shValueOf = null;
        boolean z8 = false;
        for (short s8 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                if (z8) {
                    return null;
                }
                shValueOf = Short.valueOf(s8);
                z8 = true;
            }
        }
        if (z8) {
            return shValueOf;
        }
        return null;
    }

    public static final List<Boolean> slice(boolean[] zArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? S6.r.emptyList() : C0768l.asList(C0768l.copyOfRange(zArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final char[] sortedArray(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        C0768l.sort(cArrCopyOf);
        return cArrCopyOf;
    }

    public static final char[] sortedArrayDescending(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        sortDescending(cArrCopyOf);
        return cArrCopyOf;
    }

    public static final Set<Boolean> subtract(boolean[] zArr, Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        C0782y.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(boolean[] zArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (boolean z8 : zArr) {
            iIntValue += ((Number) selector.invoke(Boolean.valueOf(z8))).intValue();
        }
        return iIntValue;
    }

    public static final double sumByDouble(boolean[] zArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z8 : zArr) {
            dDoubleValue += ((Number) selector.invoke(Boolean.valueOf(z8))).doubleValue();
        }
        return dDoubleValue;
    }

    public static final List<Short> take(short[] sArr, int i8) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        if (i8 >= sArr.length) {
            return toList(sArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (short s8 : sArr) {
            arrayList.add(Short.valueOf(s8));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Short> takeLast(short[] sArr, int i8) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        int length = sArr.length;
        if (i8 >= length) {
            return toList(sArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Short.valueOf(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Short.valueOf(sArr[i9]));
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Boolean>> C toCollection(boolean[] zArr, C destination) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (boolean z8 : zArr) {
            destination.add(Boolean.valueOf(z8));
        }
        return destination;
    }

    public static final Set<Boolean> union(boolean[] zArr, Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        S6.r.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final List<Integer> dropWhile(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        for (int i8 : iArr) {
            if (z8) {
                arrayList.add(Integer.valueOf(i8));
            } else if (!((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                arrayList.add(Integer.valueOf(i8));
                z8 = true;
            }
        }
        return arrayList;
    }

    public static final List<Float> filterIndexed(float[] fArr, f7.p predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            float f8 = fArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Float.valueOf(f8))).booleanValue()) {
                arrayList.add(Float.valueOf(f8));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final float first(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Double firstOrNull(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                return Double.valueOf(d9);
            }
        }
        return null;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(float[] fArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f8 : fArr) {
            S6.r.addAll(destination, (Iterable) transform.invoke(Float.valueOf(f8)));
        }
        return destination;
    }

    public static final float last(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[getLastIndex(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Short lastOrNull(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            short s8 = sArr[length];
            if (((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                return Short.valueOf(s8);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(float[] fArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f8 : fArr) {
            arrayList.add(transform.invoke(Float.valueOf(f8)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(float[] fArr, f7.p transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Float.valueOf(fArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final boolean none(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final float random(float[] fArr, h7.f random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (fArr.length != 0) {
            return fArr[random.nextInt(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int reduce(int[] iArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length != 0) {
            int iIntValue = iArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                iIntValue = ((Number) operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[it.nextInt()]))).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int reduceIndexed(int[] iArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length != 0) {
            int iIntValue = iArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                int iNextInt = it.nextInt();
                iIntValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Integer.valueOf(iIntValue), Integer.valueOf(iArr[iNextInt]))).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final Long reduceRightIndexedOrNull(long[] jArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jLongValue = jArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            jLongValue = ((Number) operation.invoke(Integer.valueOf(i8), Long.valueOf(jArr[i8]), Long.valueOf(jLongValue))).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public static final Long reduceRightOrNull(long[] jArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jLongValue = jArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            jLongValue = ((Number) operation.invoke(Long.valueOf(jArr[i8]), Long.valueOf(jLongValue))).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public static final List<Float> reversed(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return S6.r.emptyList();
        }
        List<Float> mutableList = toMutableList(fArr);
        S6.r.reverse(mutableList);
        return mutableList;
    }

    public static final int[] reversedArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int lastIndex = AbstractC0765i.getLastIndex(iArr);
        M it = new j7.l(0, lastIndex).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            iArr2[lastIndex - iNextInt] = iArr[iNextInt];
        }
        return iArr2;
    }

    public static final float[] sliceArray(float[] fArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        float[] fArr2 = new float[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            fArr2[i8] = fArr[it.next().intValue()];
            i8++;
        }
        return fArr2;
    }

    public static final List<Character> toMutableList(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c9 : cArr) {
            arrayList.add(Character.valueOf(c9));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(float[] fArr, R[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final boolean any(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z8 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Iterable<Character> asIterable(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0 ? S6.r.emptyList() : new i(cArr);
    }

    public static final k7.m asSequence(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0 ? k7.p.emptySequence() : new r(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(long[] jArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(jArr.length), 16));
        for (long j8 : jArr) {
            R6.p pVar = (R6.p) transform.invoke(Long.valueOf(j8));
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Long> associateBy(long[] jArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(jArr.length), 16));
        for (long j8 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j8)), Long.valueOf(j8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(char[] cArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (char c9 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c9)), Character.valueOf(c9));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(char[] cArr, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c9 : cArr) {
            R6.p pVar = (R6.p) transform.invoke(Character.valueOf(c9));
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    public static final List<Character> drop(char[] cArr, int i8) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i8 >= 0) {
            return takeLast(cArr, j7.s.coerceAtLeast(cArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Character> dropLast(char[] cArr, int i8) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i8 >= 0) {
            return take(cArr, j7.s.coerceAtLeast(cArr.length - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final List<Long> dropLastWhile(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = AbstractC0765i.getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Long.valueOf(jArr[lastIndex]))).booleanValue()) {
                return take(jArr, lastIndex + 1);
            }
        }
        return S6.r.emptyList();
    }

    public static final List<Character> filter(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c9 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                arrayList.add(Character.valueOf(c9));
            }
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Character>> C filterIndexedTo(char[] cArr, C destination, f7.p predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            char c9 = cArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Character.valueOf(c9))).booleanValue()) {
                destination.add(Character.valueOf(c9));
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final List<Character> filterNot(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c9 : cArr) {
            if (!((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                arrayList.add(Character.valueOf(c9));
            }
        }
        return arrayList;
    }

    public static final Boolean firstOrNull(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z8 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                return Boolean.valueOf(z8);
            }
        }
        return null;
    }

    public static final <R> List<R> flatMap(long[] jArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j8 : jArr) {
            S6.r.addAll(arrayList, (Iterable) transform.invoke(Long.valueOf(j8)));
        }
        return arrayList;
    }

    public static final <R> R foldRight(char[] cArr, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Character.valueOf(cArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(char[] cArr, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(cArr[lastIndex]), r8);
        }
        return r8;
    }

    public static final <K> Map<K, List<Short>> groupBy(short[] sArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s8 : sArr) {
            Object objInvoke = keySelector.invoke(Short.valueOf(s8));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s8));
        }
        return linkedHashMap;
    }

    public static final int indexOf(boolean[] zArr, boolean z8) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (z8 == zArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Character.valueOf(cArr[i8]))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Character.valueOf(cArr[length]))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Set<Character> intersect(char[] cArr, Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        C0782y.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final int lastIndexOf(boolean[] zArr, boolean z8) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (z8 == zArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(char[] cArr, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            destination.add(transform.invoke(Integer.valueOf(i9), Character.valueOf(cArr[i8])));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(char[] cArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c9 : cArr) {
            destination.add(transform.invoke(Character.valueOf(c9)));
        }
        return destination;
    }

    public static final boolean none(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z8 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Character randomOrNull(char[] cArr, h7.f random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.nextInt(cArr.length)]);
    }

    public static final long reduceRight(long[] jArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(jArr);
        if (lastIndex >= 0) {
            long jLongValue = jArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                jLongValue = ((Number) operation.invoke(Long.valueOf(jArr[i8]), Long.valueOf(jLongValue))).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long reduceRightIndexed(long[] jArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = AbstractC0765i.getLastIndex(jArr);
        if (lastIndex >= 0) {
            long jLongValue = jArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                jLongValue = ((Number) operation.invoke(Integer.valueOf(i8), Long.valueOf(jArr[i8]), Long.valueOf(jLongValue))).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long single(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return jArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final List<Character> slice(char[] cArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? S6.r.emptyList() : C0768l.asList(C0768l.copyOfRange(cArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            C0768l.sort(dArr);
            reverse(dArr);
        }
    }

    public static final Set<Character> subtract(char[] cArr, Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        C0782y.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sumBy(char[] cArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (char c9 : cArr) {
            iIntValue += ((Number) selector.invoke(Character.valueOf(c9))).intValue();
        }
        return iIntValue;
    }

    public static final double sumByDouble(char[] cArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (char c9 : cArr) {
            dDoubleValue += ((Number) selector.invoke(Character.valueOf(c9))).doubleValue();
        }
        return dDoubleValue;
    }

    public static final List<Long> takeLastWhile(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = AbstractC0765i.getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Long.valueOf(jArr[lastIndex]))).booleanValue()) {
                return drop(jArr, lastIndex + 1);
            }
        }
        return toList(jArr);
    }

    public static final List<Long> takeWhile(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j8 : jArr) {
            if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Character>> C toCollection(char[] cArr, C destination) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (char c9 : cArr) {
            destination.add(Character.valueOf(c9));
        }
        return destination;
    }

    public static final List<Long> toList(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return S6.r.emptyList();
        }
        if (length != 1) {
            return toMutableList(jArr);
        }
        return S6.r.listOf(Long.valueOf(jArr[0]));
    }

    public static final Set<Long> toSet(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return d0.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(jArr, new LinkedHashSet(Q.mapCapacity(jArr.length)));
        }
        return d0.setOf(Long.valueOf(jArr[0]));
    }

    public static final Set<Character> union(char[] cArr, Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        S6.r.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c9 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Character firstOrNull(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c9 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                return Character.valueOf(c9);
            }
        }
        return null;
    }

    public static final Byte maxOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b9 = bArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b10 = bArr[it.nextInt()];
            if (b9 < b10) {
                b9 = b10;
            }
        }
        return Byte.valueOf(b9);
    }

    public static final Integer maxWithOrNull(int[] iArr, Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i8), Integer.valueOf(i9)) < 0) {
                i8 = i9;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final Byte minOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b9 = bArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b10 = bArr[it.nextInt()];
            if (b9 > b10) {
                b9 = b10;
            }
        }
        return Byte.valueOf(b9);
    }

    public static final Integer minWithOrNull(int[] iArr, Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i8), Integer.valueOf(i9)) > 0) {
                i8 = i9;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final boolean none(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c9 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Integer singleOrNull(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Integer numValueOf = null;
        boolean z8 = false;
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                if (z8) {
                    return null;
                }
                numValueOf = Integer.valueOf(i8);
                z8 = true;
            }
        }
        if (z8) {
            return numValueOf;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(T[] tArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t8 : tArr) {
            destination.put(keySelector.invoke(t8), valueTransform.invoke(t8));
        }
        return destination;
    }

    public static final <K> List<Integer> distinctBy(int[] iArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (hashSet.add(selector.invoke(Integer.valueOf(i8)))) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        return arrayList;
    }

    public static final List<Double> filterIndexed(double[] dArr, f7.p predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            double d9 = dArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Double.valueOf(d9))).booleanValue()) {
                arrayList.add(Double.valueOf(d9));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final double first(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(double[] dArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d9 : dArr) {
            S6.r.addAll(destination, (Iterable) transform.invoke(Double.valueOf(d9)));
        }
        return destination;
    }

    public static final int indexOf(char[] cArr, char c9) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (c9 == cArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final double last(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[getLastIndex(dArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int lastIndexOf(char[] cArr, char c9) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (c9 == cArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static final Integer lastOrNull(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            int i9 = iArr[length];
            if (((Boolean) predicate.invoke(Integer.valueOf(i9))).booleanValue()) {
                return Integer.valueOf(i9);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(double[] dArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d9 : dArr) {
            arrayList.add(transform.invoke(Double.valueOf(d9)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(double[] dArr, f7.p transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Double.valueOf(dArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R extends Comparable<? super R>> Short maxByOrNull(short[] sArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s8 = sArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s8);
        }
        Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            short s9 = sArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s9));
            if (comparable.compareTo(comparable2) < 0) {
                s8 = s9;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s8);
    }

    public static final <R extends Comparable<? super R>> short maxByOrThrow(short[] sArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            short s8 = sArr[0];
            int lastIndex = AbstractC0765i.getLastIndex(sArr);
            if (lastIndex == 0) {
                return s8;
            }
            Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s8));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                short s9 = sArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s9));
                if (comparable.compareTo(comparable2) < 0) {
                    s8 = s9;
                    comparable = comparable2;
                }
            }
            return s8;
        }
        throw new NoSuchElementException();
    }

    public static final byte maxOrThrow(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            byte b9 = bArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                byte b10 = bArr[it.nextInt()];
                if (b9 < b10) {
                    b9 = b10;
                }
            }
            return b9;
        }
        throw new NoSuchElementException();
    }

    public static final int maxWithOrThrow(int[] iArr, Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                if (comparator.compare(Integer.valueOf(i8), Integer.valueOf(i9)) < 0) {
                    i8 = i9;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> Short minByOrNull(short[] sArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s8 = sArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s8);
        }
        Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            short s9 = sArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s9));
            if (comparable.compareTo(comparable2) > 0) {
                s8 = s9;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s8);
    }

    public static final <R extends Comparable<? super R>> short minByOrThrow(short[] sArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            short s8 = sArr[0];
            int lastIndex = AbstractC0765i.getLastIndex(sArr);
            if (lastIndex == 0) {
                return s8;
            }
            Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s8));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                short s9 = sArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s9));
                if (comparable.compareTo(comparable2) > 0) {
                    s8 = s9;
                    comparable = comparable2;
                }
            }
            return s8;
        }
        throw new NoSuchElementException();
    }

    public static final byte minOrThrow(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            byte b9 = bArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(bArr)).iterator();
            while (it.hasNext()) {
                byte b10 = bArr[it.nextInt()];
                if (b9 > b10) {
                    b9 = b10;
                }
            }
            return b9;
        }
        throw new NoSuchElementException();
    }

    public static final int minWithOrThrow(int[] iArr, Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                if (comparator.compare(Integer.valueOf(i8), Integer.valueOf(i9)) > 0) {
                    i8 = i9;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final double random(double[] dArr, h7.f random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (dArr.length != 0) {
            return dArr[random.nextInt(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static void reverse(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = AbstractC0765i.getLastIndex(iArr);
        M it = new j7.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            int i8 = iArr[iNextInt];
            iArr[iNextInt] = iArr[lastIndex];
            iArr[lastIndex] = i8;
            lastIndex--;
        }
    }

    public static final List<Double> reversed(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return S6.r.emptyList();
        }
        List<Double> mutableList = toMutableList(dArr);
        S6.r.reverse(mutableList);
        return mutableList;
    }

    public static final <T> List<T> slice(T[] tArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = S6.r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return S6.r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    public static final double[] sliceArray(double[] dArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        double[] dArr2 = new double[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            dArr2[i8] = dArr[it.next().intValue()];
            i8++;
        }
        return dArr2;
    }

    public static final <R, V> List<V> zip(double[] dArr, R[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final Long reduceIndexedOrNull(long[] jArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jLongValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Long.valueOf(jLongValue), Long.valueOf(jArr[iNextInt]))).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public static final Long reduceOrNull(long[] jArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            jLongValue = ((Number) operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[it.nextInt()]))).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public static final Float reduceRightIndexedOrNull(float[] fArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float fFloatValue = fArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            fFloatValue = ((Number) operation.invoke(Integer.valueOf(i8), Float.valueOf(fArr[i8]), Float.valueOf(fFloatValue))).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Float reduceRightOrNull(float[] fArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float fFloatValue = fArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            fFloatValue = ((Number) operation.invoke(Float.valueOf(fArr[i8]), Float.valueOf(fFloatValue))).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    public static final void shuffle(short[] sArr, h7.f random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = AbstractC0765i.getLastIndex(sArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            short s8 = sArr[lastIndex];
            sArr[lastIndex] = sArr[iNextInt];
            sArr[iNextInt] = s8;
        }
    }

    public static final void sortDescending(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            C0768l.sort(cArr);
            reverse(cArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(float[] fArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(fArr.length), 16));
        for (float f8 : fArr) {
            R6.p pVar = (R6.p) transform.invoke(Float.valueOf(f8));
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Float> associateBy(float[] fArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(fArr.length), 16));
        for (float f8 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f8)), Float.valueOf(f8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(byte[] bArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b9 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b9)), valueTransform.invoke(Byte.valueOf(b9)));
        }
        return destination;
    }

    public static final List<Float> dropLastWhile(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Float.valueOf(fArr[lastIndex]))).booleanValue()) {
                return take(fArr, lastIndex + 1);
            }
        }
        return S6.r.emptyList();
    }

    public static final List<Long> dropWhile(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        for (long j8 : jArr) {
            if (z8) {
                arrayList.add(Long.valueOf(j8));
            } else if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                arrayList.add(Long.valueOf(j8));
                z8 = true;
            }
        }
        return arrayList;
    }

    public static final <R> List<R> flatMap(float[] fArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            S6.r.addAll(arrayList, (Iterable) transform.invoke(Float.valueOf(f8)));
        }
        return arrayList;
    }

    public static final <A extends Appendable> A joinTo(int[] iArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (int i10 : iArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Integer.valueOf(i10)));
            } else {
                buffer.append(String.valueOf(i10));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final long reduce(long[] jArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length != 0) {
            long jLongValue = jArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                jLongValue = ((Number) operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[it.nextInt()]))).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long reduceIndexed(long[] jArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length != 0) {
            long jLongValue = jArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                int iNextInt = it.nextInt();
                jLongValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Long.valueOf(jLongValue), Long.valueOf(jArr[iNextInt]))).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRight(float[] fArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float fFloatValue = fArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                fFloatValue = ((Number) operation.invoke(Float.valueOf(fArr[i8]), Float.valueOf(fFloatValue))).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRightIndexed(float[] fArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float fFloatValue = fArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                fFloatValue = ((Number) operation.invoke(Integer.valueOf(i8), Float.valueOf(fArr[i8]), Float.valueOf(fFloatValue))).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long[] reversedArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int lastIndex = AbstractC0765i.getLastIndex(jArr);
        M it = new j7.l(0, lastIndex).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jArr2[lastIndex - iNextInt] = jArr[iNextInt];
        }
        return jArr2;
    }

    public static final float single(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return fArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final Long singleOrNull(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Long lValueOf = null;
        boolean z8 = false;
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                if (z8) {
                    return null;
                }
                lValueOf = Long.valueOf(j8);
                z8 = true;
            }
        }
        if (z8) {
            return lValueOf;
        }
        return null;
    }

    public static final List<Float> takeLastWhile(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Float.valueOf(fArr[lastIndex]))).booleanValue()) {
                return drop(fArr, lastIndex + 1);
            }
        }
        return toList(fArr);
    }

    public static final List<Float> takeWhile(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f8));
        }
        return arrayList;
    }

    public static final List<Float> toList(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return S6.r.emptyList();
        }
        if (length != 1) {
            return toMutableList(fArr);
        }
        return S6.r.listOf(Float.valueOf(fArr[0]));
    }

    public static final Set<Float> toSet(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return d0.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(fArr, new LinkedHashSet(Q.mapCapacity(fArr.length)));
        }
        return d0.setOf(Float.valueOf(fArr[0]));
    }

    public static final List<Boolean> filterIndexed(boolean[] zArr, f7.p predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            boolean z8 = zArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Boolean.valueOf(z8))).booleanValue()) {
                arrayList.add(Boolean.valueOf(z8));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final boolean first(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(boolean[] zArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z8 : zArr) {
            S6.r.addAll(destination, (Iterable) transform.invoke(Boolean.valueOf(z8)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, List<Integer>>> M groupByTo(int[] iArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i8 : iArr) {
            Object objInvoke = keySelector.invoke(Integer.valueOf(i8));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i8));
        }
        return destination;
    }

    public static final boolean last(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[getLastIndex(zArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Long lastOrNull(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            long j8 = jArr[length];
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return Long.valueOf(j8);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(boolean[] zArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z8 : zArr) {
            arrayList.add(transform.invoke(Boolean.valueOf(z8)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(boolean[] zArr, f7.p transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Boolean.valueOf(zArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final R6.p partition(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                arrayList.add(Integer.valueOf(i8));
            } else {
                arrayList2.add(Integer.valueOf(i8));
            }
        }
        return new R6.p(arrayList, arrayList2);
    }

    public static final boolean random(boolean[] zArr, h7.f random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (zArr.length != 0) {
            return zArr[random.nextInt(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final List<Boolean> reversed(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return S6.r.emptyList();
        }
        List<Boolean> mutableList = toMutableList(zArr);
        S6.r.reverse(mutableList);
        return mutableList;
    }

    public static final boolean[] sliceArray(boolean[] zArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        boolean[] zArr2 = new boolean[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            zArr2[i8] = zArr[it.next().intValue()];
            i8++;
        }
        return zArr2;
    }

    public static final List<Integer> take(int[] iArr, int i8) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        if (i8 >= iArr.length) {
            return toList(iArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Integer> takeLast(int[] iArr, int i8) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        int length = iArr.length;
        if (i8 >= length) {
            return toList(iArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Integer.valueOf(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Integer.valueOf(iArr[i9]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(boolean[] zArr, R[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i8]), other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(short[] sArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s8 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s8)), valueTransform.invoke(Short.valueOf(s8)));
        }
        return destination;
    }

    public static final Short maxOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s8 = sArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s9 = sArr[it.nextInt()];
            if (s8 < s9) {
                s8 = s9;
            }
        }
        return Short.valueOf(s8);
    }

    public static final Short minOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s8 = sArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s9 = sArr[it.nextInt()];
            if (s8 > s9) {
                s8 = s9;
            }
        }
        return Short.valueOf(s8);
    }

    public static final <T extends Comparable<? super T>> void sortDescending(T[] tArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        C0768l.sortWith(tArr, V6.a.reverseOrder(), i8, i9);
    }

    public static final short maxOrThrow(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            short s8 = sArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                short s9 = sArr[it.nextInt()];
                if (s8 < s9) {
                    s8 = s9;
                }
            }
            return s8;
        }
        throw new NoSuchElementException();
    }

    public static final Long maxWithOrNull(long[] jArr, Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j8), Long.valueOf(j9)) < 0) {
                j8 = j9;
            }
        }
        return Long.valueOf(j8);
    }

    public static final short minOrThrow(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            short s8 = sArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(sArr)).iterator();
            while (it.hasNext()) {
                short s9 = sArr[it.nextInt()];
                if (s8 > s9) {
                    s8 = s9;
                }
            }
            return s8;
        }
        throw new NoSuchElementException();
    }

    public static final Long minWithOrNull(long[] jArr, Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j8), Long.valueOf(j9)) > 0) {
                j8 = j9;
            }
        }
        return Long.valueOf(j8);
    }

    public static final Double reduceRightIndexedOrNull(double[] dArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            dDoubleValue = ((Number) operation.invoke(Integer.valueOf(i8), Double.valueOf(dArr[i8]), Double.valueOf(dDoubleValue))).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final Double reduceRightOrNull(double[] dArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            dDoubleValue = ((Number) operation.invoke(Double.valueOf(dArr[i8]), Double.valueOf(dDoubleValue))).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final Float singleOrNull(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Float fValueOf = null;
        boolean z8 = false;
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                if (z8) {
                    return null;
                }
                fValueOf = Float.valueOf(f8);
                z8 = true;
            }
        }
        if (z8) {
            return fValueOf;
        }
        return null;
    }

    public static final List<Byte> slice(byte[] bArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = S6.r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return S6.r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final void sortDescending(byte[] bArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C0768l.sort(bArr, i8, i9);
        AbstractC0765i.reverse(bArr, i8, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(double[] dArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(dArr.length), 16));
        for (double d9 : dArr) {
            R6.p pVar = (R6.p) transform.invoke(Double.valueOf(d9));
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Double> associateBy(double[] dArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(dArr.length), 16));
        for (double d9 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d9)), Double.valueOf(d9));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(int[] iArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i8 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i8)), valueTransform.invoke(Integer.valueOf(i8)));
        }
        return destination;
    }

    public static final <K> List<Long> distinctBy(long[] jArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j8 : jArr) {
            if (hashSet.add(selector.invoke(Long.valueOf(j8)))) {
                arrayList.add(Long.valueOf(j8));
            }
        }
        return arrayList;
    }

    public static final List<Double> dropLastWhile(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Double.valueOf(dArr[lastIndex]))).booleanValue()) {
                return take(dArr, lastIndex + 1);
            }
        }
        return S6.r.emptyList();
    }

    public static final List<Character> filterIndexed(char[] cArr, f7.p predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            char c9 = cArr[i8];
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Character.valueOf(c9))).booleanValue()) {
                arrayList.add(Character.valueOf(c9));
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final char first(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <R> List<R> flatMap(double[] dArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d9 : dArr) {
            S6.r.addAll(arrayList, (Iterable) transform.invoke(Double.valueOf(d9)));
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(char[] cArr, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c9 : cArr) {
            S6.r.addAll(destination, (Iterable) transform.invoke(Character.valueOf(c9)));
        }
        return destination;
    }

    public static final <K> Map<K, List<Integer>> groupBy(int[] iArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 : iArr) {
            Object objInvoke = keySelector.invoke(Integer.valueOf(i8));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i8));
        }
        return linkedHashMap;
    }

    public static final char last(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[getLastIndex(cArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Float lastOrNull(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            float f8 = fArr[length];
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return Float.valueOf(f8);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R> List<R> map(char[] cArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c9 : cArr) {
            arrayList.add(transform.invoke(Character.valueOf(c9)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(char[] cArr, f7.p transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Character.valueOf(cArr[i8])));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final long maxWithOrThrow(long[] jArr, Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                if (comparator.compare(Long.valueOf(j8), Long.valueOf(j9)) < 0) {
                    j8 = j9;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    public static final long minWithOrThrow(long[] jArr, Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                if (comparator.compare(Long.valueOf(j8), Long.valueOf(j9)) > 0) {
                    j8 = j9;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    public static final char random(char[] cArr, h7.f random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (cArr.length != 0) {
            return cArr[random.nextInt(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Float reduceIndexedOrNull(float[] fArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        M it = new j7.l(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            fFloatValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Float.valueOf(fFloatValue), Float.valueOf(fArr[iNextInt]))).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Float reduceOrNull(float[] fArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        M it = new j7.l(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            fFloatValue = ((Number) operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[it.nextInt()]))).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    public static final double reduceRight(double[] dArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double dDoubleValue = dArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                dDoubleValue = ((Number) operation.invoke(Double.valueOf(dArr[i8]), Double.valueOf(dDoubleValue))).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double reduceRightIndexed(double[] dArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double dDoubleValue = dArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                dDoubleValue = ((Number) operation.invoke(Integer.valueOf(i8), Double.valueOf(dArr[i8]), Double.valueOf(dDoubleValue))).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static void reverse(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = AbstractC0765i.getLastIndex(jArr);
        M it = new j7.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            long j8 = jArr[iNextInt];
            jArr[iNextInt] = jArr[lastIndex];
            jArr[lastIndex] = j8;
            lastIndex--;
        }
    }

    public static final List<Character> reversed(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return S6.r.emptyList();
        }
        List<Character> mutableList = toMutableList(cArr);
        S6.r.reverse(mutableList);
        return mutableList;
    }

    public static final void shuffle(int[] iArr, h7.f random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = AbstractC0765i.getLastIndex(iArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            int i8 = iArr[lastIndex];
            iArr[lastIndex] = iArr[iNextInt];
            iArr[iNextInt] = i8;
        }
    }

    public static final double single(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return dArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final char[] sliceArray(char[] cArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        char[] cArr2 = new char[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            cArr2[i8] = cArr[it.next().intValue()];
            i8++;
        }
        return cArr2;
    }

    public static final List<Double> takeLastWhile(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Double.valueOf(dArr[lastIndex]))).booleanValue()) {
                return drop(dArr, lastIndex + 1);
            }
        }
        return toList(dArr);
    }

    public static final List<Double> takeWhile(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d9 : dArr) {
            if (!((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d9));
        }
        return arrayList;
    }

    public static final List<Double> toList(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return S6.r.emptyList();
        }
        if (length != 1) {
            return toMutableList(dArr);
        }
        return S6.r.listOf(Double.valueOf(dArr[0]));
    }

    public static final Set<Double> toSet(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return d0.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(dArr, new LinkedHashSet(Q.mapCapacity(dArr.length)));
        }
        return d0.setOf(Double.valueOf(dArr[0]));
    }

    public static final <R, V> List<V> zip(char[] cArr, R[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i8]), other[i8]));
        }
        return arrayList;
    }

    public static final List<Float> dropWhile(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        for (float f8 : fArr) {
            if (z8) {
                arrayList.add(Float.valueOf(f8));
            } else if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                arrayList.add(Float.valueOf(f8));
                z8 = true;
            }
        }
        return arrayList;
    }

    public static final float reduce(float[] fArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0];
            M it = new j7.l(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                fFloatValue = ((Number) operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[it.nextInt()]))).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceIndexed(float[] fArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0];
            M it = new j7.l(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                int iNextInt = it.nextInt();
                fFloatValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Float.valueOf(fFloatValue), Float.valueOf(fArr[iNextInt]))).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float[] reversedArray(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int lastIndex = getLastIndex(fArr);
        M it = new j7.l(0, lastIndex).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            fArr2[lastIndex - iNextInt] = fArr[iNextInt];
        }
        return fArr2;
    }

    public static final void sortDescending(short[] sArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        C0768l.sort(sArr, i8, i9);
        AbstractC0765i.reverse(sArr, i8, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(long[] jArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j8 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j8)), valueTransform.invoke(Long.valueOf(j8)));
        }
        return destination;
    }

    public static final Double singleOrNull(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Double dValueOf = null;
        boolean z8 = false;
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                if (z8) {
                    return null;
                }
                dValueOf = Double.valueOf(d9);
                z8 = true;
            }
        }
        if (z8) {
            return dValueOf;
        }
        return null;
    }

    public static final <T> T first(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t8 : tArr) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <A extends Appendable> A joinTo(long[] jArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (long j8 : jArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Long.valueOf(j8)));
            } else {
                buffer.append(String.valueOf(j8));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> T last(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                T t8 = tArr[length];
                if (!((Boolean) predicate.invoke(t8)).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return t8;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Double lastOrNull(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            double d9 = dArr[length];
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                return Double.valueOf(d9);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final <R extends Comparable<? super R>> int maxByOrThrow(int[] iArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            int lastIndex = AbstractC0765i.getLastIndex(iArr);
            if (lastIndex == 0) {
                return i8;
            }
            Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
                if (comparable.compareTo(comparable2) < 0) {
                    i8 = i9;
                    comparable = comparable2;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final Integer maxOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            if (i8 < i9) {
                i8 = i9;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final <R extends Comparable<? super R>> int minByOrThrow(int[] iArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            int lastIndex = AbstractC0765i.getLastIndex(iArr);
            if (lastIndex == 0) {
                return i8;
            }
            Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
                if (comparable.compareTo(comparable2) > 0) {
                    i8 = i9;
                    comparable = comparable2;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final Integer minOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            if (i8 > i9) {
                i8 = i9;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final Boolean reduceRightIndexedOrNull(boolean[] zArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            zBooleanValue = ((Boolean) operation.invoke(Integer.valueOf(i8), Boolean.valueOf(zArr[i8]), Boolean.valueOf(zBooleanValue))).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Boolean reduceRightOrNull(boolean[] zArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            zBooleanValue = ((Boolean) operation.invoke(Boolean.valueOf(zArr[i8]), Boolean.valueOf(zBooleanValue))).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final <T> T[] sliceArray(T[] tArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? (T[]) AbstractC0765i.copyOfRange(tArr, 0, 0) : (T[]) AbstractC0765i.copyOfRange(tArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final void sortDescending(int[] iArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        C0768l.sort(iArr, i8, i9);
        AbstractC0765i.reverse(iArr, i8, i9);
    }

    public static final <T, R, V> List<V> zip(T[] tArr, Iterable<? extends R> other, f7.p transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(tArr[i8], r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(boolean[] zArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(zArr.length), 16));
        for (boolean z8 : zArr) {
            R6.p pVar = (R6.p) transform.invoke(Boolean.valueOf(z8));
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Boolean> associateBy(boolean[] zArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(zArr.length), 16));
        for (boolean z8 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z8)), Boolean.valueOf(z8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(float[] fArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f8 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f8)), valueTransform.invoke(Float.valueOf(f8)));
        }
        return destination;
    }

    public static final List<Boolean> dropLastWhile(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(zArr[lastIndex]))).booleanValue()) {
                return take(zArr, lastIndex + 1);
            }
        }
        return S6.r.emptyList();
    }

    public static final <R> List<R> flatMap(boolean[] zArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z8 : zArr) {
            S6.r.addAll(arrayList, (Iterable) transform.invoke(Boolean.valueOf(z8)));
        }
        return arrayList;
    }

    public static final <K, M extends Map<? super K, List<Long>>> M groupByTo(long[] jArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (long j8 : jArr) {
            Object objInvoke = keySelector.invoke(Long.valueOf(j8));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j8));
        }
        return destination;
    }

    public static final <R extends Comparable<? super R>> Integer maxByOrNull(int[] iArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i8);
        }
        Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
            if (comparable.compareTo(comparable2) < 0) {
                i8 = i9;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final int maxOrThrow(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                if (i8 < i9) {
                    i8 = i9;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> Integer minByOrNull(int[] iArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i8 = iArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i8);
        }
        Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            int i9 = iArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i9));
            if (comparable.compareTo(comparable2) > 0) {
                i8 = i9;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i8);
    }

    public static final int minOrThrow(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            int i8 = iArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                int i9 = iArr[it.nextInt()];
                if (i8 > i9) {
                    i8 = i9;
                }
            }
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static final R6.p partition(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                arrayList.add(Long.valueOf(j8));
            } else {
                arrayList2.add(Long.valueOf(j8));
            }
        }
        return new R6.p(arrayList, arrayList2);
    }

    public static final boolean reduceRight(boolean[] zArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean zBooleanValue = zArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                zBooleanValue = ((Boolean) operation.invoke(Boolean.valueOf(zArr[i8]), Boolean.valueOf(zBooleanValue))).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean reduceRightIndexed(boolean[] zArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean zBooleanValue = zArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                zBooleanValue = ((Boolean) operation.invoke(Integer.valueOf(i8), Boolean.valueOf(zArr[i8]), Boolean.valueOf(zBooleanValue))).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean single(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return zArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final List<Short> slice(short[] sArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = S6.r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return S6.r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final List<Long> take(long[] jArr, int i8) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        if (i8 >= jArr.length) {
            return toList(jArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (long j8 : jArr) {
            arrayList.add(Long.valueOf(j8));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Long> takeLast(long[] jArr, int i8) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        int length = jArr.length;
        if (i8 >= length) {
            return toList(jArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Long.valueOf(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Long.valueOf(jArr[i9]));
        }
        return arrayList;
    }

    public static final List<Boolean> takeLastWhile(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(zArr[lastIndex]))).booleanValue()) {
                return drop(zArr, lastIndex + 1);
            }
        }
        return toList(zArr);
    }

    public static final List<Boolean> takeWhile(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z8 : zArr) {
            if (!((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z8));
        }
        return arrayList;
    }

    public static final List<Boolean> toList(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return S6.r.emptyList();
        }
        if (length != 1) {
            return toMutableList(zArr);
        }
        return S6.r.listOf(Boolean.valueOf(zArr[0]));
    }

    public static final Set<Boolean> toSet(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return d0.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(zArr, new LinkedHashSet(Q.mapCapacity(zArr.length)));
        }
        return d0.setOf(Boolean.valueOf(zArr[0]));
    }

    public static final byte first(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                return b9;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Float maxWithOrNull(float[] fArr, Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        M it = new j7.l(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f8), Float.valueOf(f9)) < 0) {
                f8 = f9;
            }
        }
        return Float.valueOf(f8);
    }

    public static final Float minWithOrNull(float[] fArr, Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        M it = new j7.l(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f8), Float.valueOf(f9)) > 0) {
                f8 = f9;
            }
        }
        return Float.valueOf(f8);
    }

    public static final Double reduceIndexedOrNull(double[] dArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        M it = new j7.l(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            dDoubleValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Double.valueOf(dDoubleValue), Double.valueOf(dArr[iNextInt]))).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final Double reduceOrNull(double[] dArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        M it = new j7.l(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            dDoubleValue = ((Number) operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[it.nextInt()]))).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final void shuffle(long[] jArr, h7.f random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = AbstractC0765i.getLastIndex(jArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            long j8 = jArr[lastIndex];
            jArr[lastIndex] = jArr[iNextInt];
            jArr[iNextInt] = j8;
        }
    }

    public static final Boolean singleOrNull(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Boolean boolValueOf = null;
        boolean z8 = false;
        for (boolean z9 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z9))).booleanValue()) {
                if (z8) {
                    return null;
                }
                boolValueOf = Boolean.valueOf(z9);
                z8 = true;
            }
        }
        if (z8) {
            return boolValueOf;
        }
        return null;
    }

    public static byte[] sliceArray(byte[] bArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new byte[0] : AbstractC0765i.copyOfRange(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final void sortDescending(long[] jArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        C0768l.sort(jArr, i8, i9);
        AbstractC0765i.reverse(jArr, i8, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(double[] dArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d9 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d9)), valueTransform.invoke(Double.valueOf(d9)));
        }
        return destination;
    }

    public static final <K> List<Float> distinctBy(float[] fArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f8 : fArr) {
            if (hashSet.add(selector.invoke(Float.valueOf(f8)))) {
                arrayList.add(Float.valueOf(f8));
            }
        }
        return arrayList;
    }

    public static final List<Double> dropWhile(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        for (double d9 : dArr) {
            if (z8) {
                arrayList.add(Double.valueOf(d9));
            } else if (!((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                arrayList.add(Double.valueOf(d9));
                z8 = true;
            }
        }
        return arrayList;
    }

    public static final Boolean lastOrNull(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            boolean z8 = zArr[length];
            if (((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                return Boolean.valueOf(z8);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final float maxWithOrThrow(float[] fArr, Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            M it = new j7.l(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                float f9 = fArr[it.nextInt()];
                if (comparator.compare(Float.valueOf(f8), Float.valueOf(f9)) < 0) {
                    f8 = f9;
                }
            }
            return f8;
        }
        throw new NoSuchElementException();
    }

    public static final float minWithOrThrow(float[] fArr, Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            M it = new j7.l(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                float f9 = fArr[it.nextInt()];
                if (comparator.compare(Float.valueOf(f8), Float.valueOf(f9)) > 0) {
                    f8 = f9;
                }
            }
            return f8;
        }
        throw new NoSuchElementException();
    }

    public static final double reduce(double[] dArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length != 0) {
            double dDoubleValue = dArr[0];
            M it = new j7.l(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                dDoubleValue = ((Number) operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[it.nextInt()]))).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double reduceIndexed(double[] dArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length != 0) {
            double dDoubleValue = dArr[0];
            M it = new j7.l(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                int iNextInt = it.nextInt();
                dDoubleValue = ((Number) operation.invoke(Integer.valueOf(iNextInt), Double.valueOf(dDoubleValue), Double.valueOf(dArr[iNextInt]))).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(fArr);
        M it = new j7.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            float f8 = fArr[iNextInt];
            fArr[iNextInt] = fArr[lastIndex];
            fArr[lastIndex] = f8;
            lastIndex--;
        }
    }

    public static final double[] reversedArray(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int lastIndex = getLastIndex(dArr);
        M it = new j7.l(0, lastIndex).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            dArr2[lastIndex - iNextInt] = dArr[iNextInt];
        }
        return dArr2;
    }

    public static final short first(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s8 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                return s8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final byte last(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                byte b9 = bArr[length];
                if (!((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return b9;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Character reduceRightIndexedOrNull(char[] cArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char cCharValue = cArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            cCharValue = ((Character) operation.invoke(Integer.valueOf(i8), Character.valueOf(cArr[i8]), Character.valueOf(cCharValue))).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    public static final Character reduceRightOrNull(char[] cArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char cCharValue = cArr[lastIndex];
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            cCharValue = ((Character) operation.invoke(Character.valueOf(cArr[i8]), Character.valueOf(cCharValue))).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    public static short[] sliceArray(short[] sArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new short[0] : AbstractC0765i.copyOfRange(sArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final void sortDescending(float[] fArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        C0768l.sort(fArr, i8, i9);
        reverse(fArr, i8, i9);
    }

    public static final <R, V> List<V> zip(byte[] bArr, Iterable<? extends R> other, f7.p transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(char[] cArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(cArr.length), 16));
        for (char c9 : cArr) {
            R6.p pVar = (R6.p) transform.invoke(Character.valueOf(c9));
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Character> associateBy(char[] cArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(cArr.length), 16));
        for (char c9 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c9)), Character.valueOf(c9));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(boolean[] zArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z8 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z8)), valueTransform.invoke(Boolean.valueOf(z8)));
        }
        return destination;
    }

    public static final List<Character> dropLastWhile(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(cArr[lastIndex]))).booleanValue()) {
                return take(cArr, lastIndex + 1);
            }
        }
        return S6.r.emptyList();
    }

    public static final <R> List<R> flatMap(char[] cArr, f7.l transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c9 : cArr) {
            S6.r.addAll(arrayList, (Iterable) transform.invoke(Character.valueOf(c9)));
        }
        return arrayList;
    }

    public static final <K> Map<K, List<Long>> groupBy(long[] jArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j8 : jArr) {
            Object objInvoke = keySelector.invoke(Long.valueOf(j8));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j8));
        }
        return linkedHashMap;
    }

    public static final Long maxOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            if (j8 < j9) {
                j8 = j9;
            }
        }
        return Long.valueOf(j8);
    }

    public static final Long minOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            if (j8 > j9) {
                j8 = j9;
            }
        }
        return Long.valueOf(j8);
    }

    public static final char reduceRight(char[] cArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char cCharValue = cArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                cCharValue = ((Character) operation.invoke(Character.valueOf(cArr[i8]), Character.valueOf(cCharValue))).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceRightIndexed(char[] cArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char cCharValue = cArr[lastIndex];
            for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
                cCharValue = ((Character) operation.invoke(Integer.valueOf(i8), Character.valueOf(cArr[i8]), Character.valueOf(cCharValue))).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static char single(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final Character singleOrNull(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z8 = false;
        for (char c9 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                if (z8) {
                    return null;
                }
                chValueOf = Character.valueOf(c9);
                z8 = true;
            }
        }
        if (z8) {
            return chValueOf;
        }
        return null;
    }

    public static final List<Character> takeLastWhile(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(cArr[lastIndex]))).booleanValue()) {
                return drop(cArr, lastIndex + 1);
            }
        }
        return toList(cArr);
    }

    public static final List<Character> takeWhile(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c9 : cArr) {
            if (!((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c9));
        }
        return arrayList;
    }

    public static final List<Character> toList(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return S6.r.emptyList();
        }
        if (length != 1) {
            return toMutableList(cArr);
        }
        return S6.r.listOf(Character.valueOf(cArr[0]));
    }

    public static final Set<Character> toSet(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return d0.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(cArr, new LinkedHashSet(Q.mapCapacity(j7.s.coerceAtMost(cArr.length, 128))));
        }
        return d0.setOf(Character.valueOf(cArr[0]));
    }

    public static final int first(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                return i8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Character lastOrNull(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            char c9 = cArr[length];
            if (((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                return Character.valueOf(c9);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final long maxOrThrow(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                if (j8 < j9) {
                    j8 = j9;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    public static final long minOrThrow(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            M it = new j7.l(1, AbstractC0765i.getLastIndex(jArr)).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                if (j8 > j9) {
                    j8 = j9;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    public static final List<Integer> slice(int[] iArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = S6.r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return S6.r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static int[] sliceArray(int[] iArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new int[0] : AbstractC0765i.copyOfRange(iArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final void sortDescending(double[] dArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        C0768l.sort(dArr, i8, i9);
        reverse(dArr, i8, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(char[] cArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c9 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c9)), valueTransform.invoke(Character.valueOf(c9)));
        }
        return destination;
    }

    public static final <A extends Appendable> A joinTo(float[] fArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (float f8 : fArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Float.valueOf(f8)));
            } else {
                buffer.append(String.valueOf(f8));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Boolean reduceIndexedOrNull(boolean[] zArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        M it = new j7.l(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            zBooleanValue = ((Boolean) operation.invoke(Integer.valueOf(iNextInt), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[iNextInt]))).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Boolean reduceOrNull(boolean[] zArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        M it = new j7.l(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            zBooleanValue = ((Boolean) operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[it.nextInt()]))).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final void shuffle(float[] fArr, h7.f random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(fArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            float f8 = fArr[lastIndex];
            fArr[lastIndex] = fArr[iNextInt];
            fArr[iNextInt] = f8;
        }
    }

    public static final List<Boolean> dropWhile(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        for (boolean z9 : zArr) {
            if (z8) {
                arrayList.add(Boolean.valueOf(z9));
            } else if (!((Boolean) predicate.invoke(Boolean.valueOf(z9))).booleanValue()) {
                arrayList.add(Boolean.valueOf(z9));
                z8 = true;
            }
        }
        return arrayList;
    }

    public static final long first(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return j8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <K, M extends Map<? super K, List<Float>>> M groupByTo(float[] fArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (float f8 : fArr) {
            Object objInvoke = keySelector.invoke(Float.valueOf(f8));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f8));
        }
        return destination;
    }

    public static final short last(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                short s8 = sArr[length];
                if (!((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return s8;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Double maxWithOrNull(double[] dArr, Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d9 = dArr[0];
        M it = new j7.l(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            double d10 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d9), Double.valueOf(d10)) < 0) {
                d9 = d10;
            }
        }
        return Double.valueOf(d9);
    }

    public static final Double minWithOrNull(double[] dArr, Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d9 = dArr[0];
        M it = new j7.l(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            double d10 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d9), Double.valueOf(d10)) > 0) {
                d9 = d10;
            }
        }
        return Double.valueOf(d9);
    }

    public static final R6.p partition(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                arrayList.add(Float.valueOf(f8));
            } else {
                arrayList2.add(Float.valueOf(f8));
            }
        }
        return new R6.p(arrayList, arrayList2);
    }

    public static final boolean reduce(boolean[] zArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length != 0) {
            boolean zBooleanValue = zArr[0];
            M it = new j7.l(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                zBooleanValue = ((Boolean) operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[it.nextInt()]))).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean reduceIndexed(boolean[] zArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length != 0) {
            boolean zBooleanValue = zArr[0];
            M it = new j7.l(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                int iNextInt = it.nextInt();
                zBooleanValue = ((Boolean) operation.invoke(Integer.valueOf(iNextInt), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[iNextInt]))).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean[] reversedArray(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int lastIndex = getLastIndex(zArr);
        M it = new j7.l(0, lastIndex).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            zArr2[lastIndex - iNextInt] = zArr[iNextInt];
        }
        return zArr2;
    }

    public static long[] sliceArray(long[] jArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new long[0] : AbstractC0765i.copyOfRange(jArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final void sortDescending(char[] cArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        C0768l.sort(cArr, i8, i9);
        reverse(cArr, i8, i9);
    }

    public static final List<Float> take(float[] fArr, int i8) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        if (i8 >= fArr.length) {
            return toList(fArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (float f8 : fArr) {
            arrayList.add(Float.valueOf(f8));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Float> takeLast(float[] fArr, int i8) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        int length = fArr.length;
        if (i8 >= length) {
            return toList(fArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Float.valueOf(fArr[i9]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(short[] sArr, Iterable<? extends R> other, f7.p transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Short.valueOf(sArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associateBy(T[] tArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(tArr.length), 16));
        for (T t8 : tArr) {
            linkedHashMap.put(keySelector.invoke(t8), valueTransform.invoke(t8));
        }
        return linkedHashMap;
    }

    public static final <K> List<Double> distinctBy(double[] dArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d9 : dArr) {
            if (hashSet.add(selector.invoke(Double.valueOf(d9)))) {
                arrayList.add(Double.valueOf(d9));
            }
        }
        return arrayList;
    }

    public static final <R extends Comparable<? super R>> long maxByOrThrow(long[] jArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            int lastIndex = AbstractC0765i.getLastIndex(jArr);
            if (lastIndex == 0) {
                return j8;
            }
            Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
                if (comparable.compareTo(comparable2) < 0) {
                    j8 = j9;
                    comparable = comparable2;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    public static final double maxWithOrThrow(double[] dArr, Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length != 0) {
            double d9 = dArr[0];
            M it = new j7.l(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                double d10 = dArr[it.nextInt()];
                if (comparator.compare(Double.valueOf(d9), Double.valueOf(d10)) < 0) {
                    d9 = d10;
                }
            }
            return d9;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> long minByOrThrow(long[] jArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            long j8 = jArr[0];
            int lastIndex = AbstractC0765i.getLastIndex(jArr);
            if (lastIndex == 0) {
                return j8;
            }
            Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                long j9 = jArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
                if (comparable.compareTo(comparable2) > 0) {
                    j8 = j9;
                    comparable = comparable2;
                }
            }
            return j8;
        }
        throw new NoSuchElementException();
    }

    public static final double minWithOrThrow(double[] dArr, Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length != 0) {
            double d9 = dArr[0];
            M it = new j7.l(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                double d10 = dArr[it.nextInt()];
                if (comparator.compare(Double.valueOf(d9), Double.valueOf(d10)) > 0) {
                    d9 = d10;
                }
            }
            return d9;
        }
        throw new NoSuchElementException();
    }

    public static final void reverse(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(dArr);
        M it = new j7.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            double d9 = dArr[iNextInt];
            dArr[iNextInt] = dArr[lastIndex];
            dArr[lastIndex] = d9;
            lastIndex--;
        }
    }

    public static final <T> T single(T[] tArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t8 = null;
        boolean z8 = false;
        for (T t9 : tArr) {
            if (((Boolean) predicate.invoke(t9)).booleanValue()) {
                if (z8) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z8 = true;
                t8 = t9;
            }
        }
        if (z8) {
            return t8;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float first(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                return f8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Float maxOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        M it = new j7.l(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            fMax = Math.max(fMax, fArr[it.nextInt()]);
        }
        return Float.valueOf(fMax);
    }

    public static final Float minOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        M it = new j7.l(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            fMin = Math.min(fMin, fArr[it.nextInt()]);
        }
        return Float.valueOf(fMin);
    }

    public static final float[] sliceArray(float[] fArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new float[0] : C0768l.copyOfRange(fArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final <R extends Comparable<? super R>> Long maxByOrNull(long[] jArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j8);
        }
        Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
            if (comparable.compareTo(comparable2) < 0) {
                j8 = j9;
                comparable = comparable2;
            }
        }
        return Long.valueOf(j8);
    }

    public static final float maxOrThrow(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fMax = fArr[0];
            M it = new j7.l(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                fMax = Math.max(fMax, fArr[it.nextInt()]);
            }
            return fMax;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> Long minByOrNull(long[] jArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j8 = jArr[0];
        int lastIndex = AbstractC0765i.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j8);
        }
        Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            long j9 = jArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j9));
            if (comparable.compareTo(comparable2) > 0) {
                j8 = j9;
                comparable = comparable2;
            }
        }
        return Long.valueOf(j8);
    }

    public static final float minOrThrow(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fMin = fArr[0];
            M it = new j7.l(1, getLastIndex(fArr)).iterator();
            while (it.hasNext()) {
                fMin = Math.min(fMin, fArr[it.nextInt()]);
            }
            return fMin;
        }
        throw new NoSuchElementException();
    }

    public static final List<Long> slice(long[] jArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = S6.r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return S6.r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final double first(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                return d9;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int last(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                int i9 = iArr[length];
                if (!((Boolean) predicate.invoke(Integer.valueOf(i9))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return i9;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Character reduceIndexedOrNull(char[] cArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        M it = new j7.l(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cCharValue = ((Character) operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharValue), Character.valueOf(cArr[iNextInt]))).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    public static final Character reduceOrNull(char[] cArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        M it = new j7.l(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            cCharValue = ((Character) operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[it.nextInt()]))).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    public static final void shuffle(double[] dArr, h7.f random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(dArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            double d9 = dArr[lastIndex];
            dArr[lastIndex] = dArr[iNextInt];
            dArr[iNextInt] = d9;
        }
    }

    public static final double[] sliceArray(double[] dArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new double[0] : C0768l.copyOfRange(dArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final <R, V> List<V> zip(int[] iArr, Iterable<? extends R> other, f7.p transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(byte[] bArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(bArr.length), 16));
        for (byte b9 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b9)), valueTransform.invoke(Byte.valueOf(b9)));
        }
        return linkedHashMap;
    }

    public static final List<Character> dropWhile(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        for (char c9 : cArr) {
            if (z8) {
                arrayList.add(Character.valueOf(c9));
            } else if (!((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                arrayList.add(Character.valueOf(c9));
                z8 = true;
            }
        }
        return arrayList;
    }

    public static final <K> Map<K, List<Float>> groupBy(float[] fArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f8 : fArr) {
            Object objInvoke = keySelector.invoke(Float.valueOf(f8));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f8));
        }
        return linkedHashMap;
    }

    public static final char reduce(char[] cArr, f7.p operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length != 0) {
            char cCharValue = cArr[0];
            M it = new j7.l(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                cCharValue = ((Character) operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[it.nextInt()]))).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceIndexed(char[] cArr, f7.q operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length != 0) {
            char cCharValue = cArr[0];
            M it = new j7.l(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                int iNextInt = it.nextInt();
                cCharValue = ((Character) operation.invoke(Integer.valueOf(iNextInt), Character.valueOf(cCharValue), Character.valueOf(cArr[iNextInt]))).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char[] reversedArray(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int lastIndex = getLastIndex(cArr);
        M it = new j7.l(0, lastIndex).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            cArr2[lastIndex - iNextInt] = cArr[iNextInt];
        }
        return cArr2;
    }

    public static final byte single(byte[] bArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Byte bValueOf = null;
        boolean z8 = false;
        for (byte b9 : bArr) {
            if (((Boolean) predicate.invoke(Byte.valueOf(b9))).booleanValue()) {
                if (!z8) {
                    bValueOf = Byte.valueOf(b9);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z8) {
            Intrinsics.checkNotNull(bValueOf, "null cannot be cast to non-null type kotlin.Byte");
            return bValueOf.byteValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean first(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z8 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                return z8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <A extends Appendable> A joinTo(double[] dArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (double d9 : dArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Double.valueOf(d9)));
            } else {
                buffer.append(String.valueOf(d9));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Boolean maxWithOrNull(boolean[] zArr, Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z8 = zArr[0];
        M it = new j7.l(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            boolean z9 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z8), Boolean.valueOf(z9)) < 0) {
                z8 = z9;
            }
        }
        return Boolean.valueOf(z8);
    }

    public static final Boolean minWithOrNull(boolean[] zArr, Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z8 = zArr[0];
        M it = new j7.l(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            boolean z9 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z8), Boolean.valueOf(z9)) > 0) {
                z8 = z9;
            }
        }
        return Boolean.valueOf(z8);
    }

    public static final boolean[] sliceArray(boolean[] zArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new boolean[0] : C0768l.copyOfRange(zArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final <K> List<Boolean> distinctBy(boolean[] zArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z8 : zArr) {
            if (hashSet.add(selector.invoke(Boolean.valueOf(z8)))) {
                arrayList.add(Boolean.valueOf(z8));
            }
        }
        return arrayList;
    }

    public static final <K, M extends Map<? super K, List<Double>>> M groupByTo(double[] dArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (double d9 : dArr) {
            Object objInvoke = keySelector.invoke(Double.valueOf(d9));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d9));
        }
        return destination;
    }

    public static final boolean maxWithOrThrow(boolean[] zArr, Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z8 = zArr[0];
            M it = new j7.l(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                boolean z9 = zArr[it.nextInt()];
                if (comparator.compare(Boolean.valueOf(z8), Boolean.valueOf(z9)) < 0) {
                    z8 = z9;
                }
            }
            return z8;
        }
        throw new NoSuchElementException();
    }

    public static final boolean minWithOrThrow(boolean[] zArr, Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z8 = zArr[0];
            M it = new j7.l(1, getLastIndex(zArr)).iterator();
            while (it.hasNext()) {
                boolean z9 = zArr[it.nextInt()];
                if (comparator.compare(Boolean.valueOf(z8), Boolean.valueOf(z9)) > 0) {
                    z8 = z9;
                }
            }
            return z8;
        }
        throw new NoSuchElementException();
    }

    public static final R6.p partition(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                arrayList.add(Double.valueOf(d9));
            } else {
                arrayList2.add(Double.valueOf(d9));
            }
        }
        return new R6.p(arrayList, arrayList2);
    }

    public static final void reverse(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(zArr);
        M it = new j7.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            boolean z8 = zArr[iNextInt];
            zArr[iNextInt] = zArr[lastIndex];
            zArr[lastIndex] = z8;
            lastIndex--;
        }
    }

    public static final List<Double> take(double[] dArr, int i8) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        if (i8 >= dArr.length) {
            return toList(dArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (double d9 : dArr) {
            arrayList.add(Double.valueOf(d9));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Double> takeLast(double[] dArr, int i8) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        int length = dArr.length;
        if (i8 >= length) {
            return toList(dArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Double.valueOf(dArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Double.valueOf(dArr[i9]));
        }
        return arrayList;
    }

    public static final char first(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c9 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                return c9;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long last(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                long j8 = jArr[length];
                if (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return j8;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Double maxOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMax = dArr[0];
        M it = new j7.l(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            dMax = Math.max(dMax, dArr[it.nextInt()]);
        }
        return Double.valueOf(dMax);
    }

    public static final Double minOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMin = dArr[0];
        M it = new j7.l(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            dMin = Math.min(dMin, dArr[it.nextInt()]);
        }
        return Double.valueOf(dMin);
    }

    public static final List<Float> slice(float[] fArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = S6.r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return S6.r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final char[] sliceArray(char[] cArr, j7.l indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new char[0] : C0768l.copyOfRange(cArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static final <R, V> List<V> zip(long[] jArr, Iterable<? extends R> other, f7.p transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Long.valueOf(jArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(short[] sArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(sArr.length), 16));
        for (short s8 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s8)), valueTransform.invoke(Short.valueOf(s8)));
        }
        return linkedHashMap;
    }

    public static final double maxOrThrow(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            double dMax = dArr[0];
            M it = new j7.l(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                dMax = Math.max(dMax, dArr[it.nextInt()]);
            }
            return dMax;
        }
        throw new NoSuchElementException();
    }

    public static final double minOrThrow(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            double dMin = dArr[0];
            M it = new j7.l(1, getLastIndex(dArr)).iterator();
            while (it.hasNext()) {
                dMin = Math.min(dMin, dArr[it.nextInt()]);
            }
            return dMin;
        }
        throw new NoSuchElementException();
    }

    public static final void shuffle(boolean[] zArr, h7.f random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(zArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            boolean z8 = zArr[lastIndex];
            zArr[lastIndex] = zArr[iNextInt];
            zArr[iNextInt] = z8;
        }
    }

    public static final <R extends Comparable<? super R>> float maxByOrThrow(float[] fArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (lastIndex == 0) {
                return f8;
            }
            Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                float f9 = fArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
                if (comparable.compareTo(comparable2) < 0) {
                    f8 = f9;
                    comparable = comparable2;
                }
            }
            return f8;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> float minByOrThrow(float[] fArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            float f8 = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (lastIndex == 0) {
                return f8;
            }
            Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                float f9 = fArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
                if (comparable.compareTo(comparable2) > 0) {
                    f8 = f9;
                    comparable = comparable2;
                }
            }
            return f8;
        }
        throw new NoSuchElementException();
    }

    public static final short single(short[] sArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Short shValueOf = null;
        boolean z8 = false;
        for (short s8 : sArr) {
            if (((Boolean) predicate.invoke(Short.valueOf(s8))).booleanValue()) {
                if (!z8) {
                    shValueOf = Short.valueOf(s8);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z8) {
            Intrinsics.checkNotNull(shValueOf, "null cannot be cast to non-null type kotlin.Short");
            return shValueOf.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float last(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                float f8 = fArr[length];
                if (!((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return f8;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Character maxWithOrNull(char[] cArr, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c9 = cArr[0];
        M it = new j7.l(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c10 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c9), Character.valueOf(c10)) < 0) {
                c9 = c10;
            }
        }
        return Character.valueOf(c9);
    }

    public static final Character minWithOrNull(char[] cArr, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c9 = cArr[0];
        M it = new j7.l(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c10 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c9), Character.valueOf(c10)) > 0) {
                c9 = c10;
            }
        }
        return Character.valueOf(c9);
    }

    public static final <R, V> List<V> zip(float[] fArr, Iterable<? extends R> other, f7.p transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Float.valueOf(fArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(int[] iArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(iArr.length), 16));
        for (int i8 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i8)), valueTransform.invoke(Integer.valueOf(i8)));
        }
        return linkedHashMap;
    }

    public static final <K> List<Character> distinctBy(char[] cArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c9 : cArr) {
            if (hashSet.add(selector.invoke(Character.valueOf(c9)))) {
                arrayList.add(Character.valueOf(c9));
            }
        }
        return arrayList;
    }

    public static final <K> Map<K, List<Double>> groupBy(double[] dArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d9 : dArr) {
            Object objInvoke = keySelector.invoke(Double.valueOf(d9));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d9));
        }
        return linkedHashMap;
    }

    public static final <A extends Appendable> A joinTo(boolean[] zArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (boolean z8 : zArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Boolean.valueOf(z8)));
            } else {
                buffer.append(String.valueOf(z8));
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <R extends Comparable<? super R>> Float maxByOrNull(float[] fArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f8);
        }
        Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
            if (comparable.compareTo(comparable2) < 0) {
                f8 = f9;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f8);
    }

    public static final char maxWithOrThrow(char[] cArr, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length != 0) {
            char c9 = cArr[0];
            M it = new j7.l(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                char c10 = cArr[it.nextInt()];
                if (comparator.compare(Character.valueOf(c9), Character.valueOf(c10)) < 0) {
                    c9 = c10;
                }
            }
            return c9;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> Float minByOrNull(float[] fArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f8 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f8);
        }
        Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            float f9 = fArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f9));
            if (comparable.compareTo(comparable2) > 0) {
                f8 = f9;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f8);
    }

    public static final char minWithOrThrow(char[] cArr, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length != 0) {
            char c9 = cArr[0];
            M it = new j7.l(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                char c10 = cArr[it.nextInt()];
                if (comparator.compare(Character.valueOf(c9), Character.valueOf(c10)) > 0) {
                    c9 = c10;
                }
            }
            return c9;
        }
        throw new NoSuchElementException();
    }

    public static final void reverse(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(cArr);
        M it = new j7.l(0, length).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            char c9 = cArr[iNextInt];
            cArr[iNextInt] = cArr[lastIndex];
            cArr[lastIndex] = c9;
            lastIndex--;
        }
    }

    public static final List<Double> slice(double[] dArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = S6.r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return S6.r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final <K, M extends Map<? super K, List<Boolean>>> M groupByTo(boolean[] zArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z8 : zArr) {
            Object objInvoke = keySelector.invoke(Boolean.valueOf(z8));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z8));
        }
        return destination;
    }

    public static final Character maxOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c9 = cArr[0];
        M it = new j7.l(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c10 = cArr[it.nextInt()];
            if (Intrinsics.compare((int) c9, (int) c10) < 0) {
                c9 = c10;
            }
        }
        return Character.valueOf(c9);
    }

    public static final Character minOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c9 = cArr[0];
        M it = new j7.l(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c10 = cArr[it.nextInt()];
            if (Intrinsics.compare((int) c9, (int) c10) > 0) {
                c9 = c10;
            }
        }
        return Character.valueOf(c9);
    }

    public static final R6.p partition(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z8 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                arrayList.add(Boolean.valueOf(z8));
            } else {
                arrayList2.add(Boolean.valueOf(z8));
            }
        }
        return new R6.p(arrayList, arrayList2);
    }

    public static final void shuffle(char[] cArr, h7.f random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(cArr); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            char c9 = cArr[lastIndex];
            cArr[lastIndex] = cArr[iNextInt];
            cArr[iNextInt] = c9;
        }
    }

    public static final List<Boolean> take(boolean[] zArr, int i8) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        if (i8 >= zArr.length) {
            return toList(zArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (boolean z8 : zArr) {
            arrayList.add(Boolean.valueOf(z8));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Boolean> takeLast(boolean[] zArr, int i8) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        int length = zArr.length;
        if (i8 >= length) {
            return toList(zArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Boolean.valueOf(zArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Boolean.valueOf(zArr[i9]));
        }
        return arrayList;
    }

    public static final char maxOrThrow(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            char c9 = cArr[0];
            M it = new j7.l(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                char c10 = cArr[it.nextInt()];
                if (Intrinsics.compare((int) c9, (int) c10) < 0) {
                    c9 = c10;
                }
            }
            return c9;
        }
        throw new NoSuchElementException();
    }

    public static final char minOrThrow(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            char c9 = cArr[0];
            M it = new j7.l(1, getLastIndex(cArr)).iterator();
            while (it.hasNext()) {
                char c10 = cArr[it.nextInt()];
                if (Intrinsics.compare((int) c9, (int) c10) > 0) {
                    c9 = c10;
                }
            }
            return c9;
        }
        throw new NoSuchElementException();
    }

    public static final double last(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                double d9 = dArr[length];
                if (!((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return d9;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <R, V> List<V> zip(double[] dArr, Iterable<? extends R> other, f7.p transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Double.valueOf(dArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(long[] jArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(jArr.length), 16));
        for (long j8 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j8)), valueTransform.invoke(Long.valueOf(j8)));
        }
        return linkedHashMap;
    }

    public static final int single(int[] iArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Integer numValueOf = null;
        boolean z8 = false;
        for (int i8 : iArr) {
            if (((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue()) {
                if (!z8) {
                    numValueOf = Integer.valueOf(i8);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z8) {
            Intrinsics.checkNotNull(numValueOf, "null cannot be cast to non-null type kotlin.Int");
            return numValueOf.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final List<Boolean> slice(boolean[] zArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = S6.r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return S6.r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final <R extends Comparable<? super R>> double maxByOrThrow(double[] dArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            double d9 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex == 0) {
                return d9;
            }
            Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d9));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                double d10 = dArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d10));
                if (comparable.compareTo(comparable2) < 0) {
                    d9 = d10;
                    comparable = comparable2;
                }
            }
            return d9;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> double minByOrThrow(double[] dArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            double d9 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex == 0) {
                return d9;
            }
            Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d9));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                double d10 = dArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d10));
                if (comparable.compareTo(comparable2) > 0) {
                    d9 = d10;
                    comparable = comparable2;
                }
            }
            return d9;
        }
        throw new NoSuchElementException();
    }

    public static final <T> void reverse(T[] tArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, tArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            T t8 = tArr[i8];
            tArr[i8] = tArr[i11];
            tArr[i11] = t8;
            i11--;
            i8++;
        }
    }

    public static final <A extends Appendable> A joinTo(char[] cArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (char c9 : cArr) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Character.valueOf(c9)));
            } else {
                buffer.append(c9);
            }
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean last(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                boolean z8 = zArr[length];
                if (!((Boolean) predicate.invoke(Boolean.valueOf(z8))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return z8;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <R, V> List<V> zip(boolean[] zArr, Iterable<? extends R> other, f7.p transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(float[] fArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(fArr.length), 16));
        for (float f8 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f8)), valueTransform.invoke(Float.valueOf(f8)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, List<Boolean>> groupBy(boolean[] zArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z8 : zArr) {
            Object objInvoke = keySelector.invoke(Boolean.valueOf(z8));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z8));
        }
        return linkedHashMap;
    }

    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(char[] cArr, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (char c9 : cArr) {
            Object objInvoke = keySelector.invoke(Character.valueOf(c9));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c9));
        }
        return destination;
    }

    public static final R6.p partition(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c9 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                arrayList.add(Character.valueOf(c9));
            } else {
                arrayList2.add(Character.valueOf(c9));
            }
        }
        return new R6.p(arrayList, arrayList2);
    }

    public static final List<Character> take(char[] cArr, int i8) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        if (i8 >= cArr.length) {
            return toList(cArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i8);
        int i9 = 0;
        for (char c9 : cArr) {
            arrayList.add(Character.valueOf(c9));
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Character> takeLast(char[] cArr, int i8) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return S6.r.emptyList();
        }
        int length = cArr.length;
        if (i8 >= length) {
            return toList(cArr);
        }
        if (i8 == 1) {
            return S6.r.listOf(Character.valueOf(cArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = length - i8; i9 < length; i9++) {
            arrayList.add(Character.valueOf(cArr[i9]));
        }
        return arrayList;
    }

    public static final <R extends Comparable<? super R>> Double maxByOrNull(double[] dArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d9 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d9);
        }
        Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            double d10 = dArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d10));
            if (comparable.compareTo(comparable2) < 0) {
                d9 = d10;
                comparable = comparable2;
            }
        }
        return Double.valueOf(d9);
    }

    public static final <R extends Comparable<? super R>> Double minByOrNull(double[] dArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d9 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d9);
        }
        Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            double d10 = dArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d10));
            if (comparable.compareTo(comparable2) > 0) {
                d9 = d10;
                comparable = comparable2;
            }
        }
        return Double.valueOf(d9);
    }

    public static final long single(long[] jArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Long lValueOf = null;
        boolean z8 = false;
        for (long j8 : jArr) {
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                if (!z8) {
                    lValueOf = Long.valueOf(j8);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z8) {
            Intrinsics.checkNotNull(lValueOf, "null cannot be cast to non-null type kotlin.Long");
            return lValueOf.longValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final List<Character> slice(char[] cArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = S6.r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return S6.r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final char last(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                char c9 = cArr[length];
                if (!((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return c9;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static void reverse(byte[] bArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, bArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            byte b9 = bArr[i8];
            bArr[i8] = bArr[i11];
            bArr[i11] = b9;
            i11--;
            i8++;
        }
    }

    public static final <R, V> List<V> zip(char[] cArr, Iterable<? extends R> other, f7.p transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Character.valueOf(cArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(double[] dArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(dArr.length), 16));
        for (double d9 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d9)), valueTransform.invoke(Double.valueOf(d9)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(T[] tArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t8 : tArr) {
            Object objInvoke = keySelector.invoke(t8);
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(t8));
        }
        return destination;
    }

    public static final <R extends Comparable<? super R>> boolean maxByOrThrow(boolean[] zArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            boolean z8 = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (lastIndex == 0) {
                return z8;
            }
            Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z8));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                boolean z9 = zArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z9));
                if (comparable.compareTo(comparable2) < 0) {
                    z8 = z9;
                    comparable = comparable2;
                }
            }
            return z8;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> boolean minByOrThrow(boolean[] zArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            boolean z8 = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (lastIndex == 0) {
                return z8;
            }
            Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z8));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                boolean z9 = zArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z9));
                if (comparable.compareTo(comparable2) > 0) {
                    z8 = z9;
                    comparable = comparable2;
                }
            }
            return z8;
        }
        throw new NoSuchElementException();
    }

    public static final <V> List<V> zip(byte[] bArr, byte[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i8]), Byte.valueOf(other[i8])));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(boolean[] zArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(zArr.length), 16));
        for (boolean z8 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z8)), valueTransform.invoke(Boolean.valueOf(z8)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, List<Character>> groupBy(char[] cArr, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c9 : cArr) {
            Object objInvoke = keySelector.invoke(Character.valueOf(c9));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c9));
        }
        return linkedHashMap;
    }

    public static void reverse(short[] sArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, sArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            short s8 = sArr[i8];
            sArr[i8] = sArr[i11];
            sArr[i11] = s8;
            i11--;
            i8++;
        }
    }

    public static final float single(float[] fArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Float fValueOf = null;
        boolean z8 = false;
        for (float f8 : fArr) {
            if (((Boolean) predicate.invoke(Float.valueOf(f8))).booleanValue()) {
                if (!z8) {
                    fValueOf = Float.valueOf(f8);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z8) {
            Intrinsics.checkNotNull(fValueOf, "null cannot be cast to non-null type kotlin.Float");
            return fValueOf.floatValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <V> List<V> zip(short[] sArr, short[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i8]), Short.valueOf(other[i8])));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(char[] cArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(cArr.length), 16));
        for (char c9 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c9)), valueTransform.invoke(Character.valueOf(c9)));
        }
        return linkedHashMap;
    }

    public static final <R extends Comparable<? super R>> Boolean maxByOrNull(boolean[] zArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z8 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z8);
        }
        Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            boolean z9 = zArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z9));
            if (comparable.compareTo(comparable2) < 0) {
                z8 = z9;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z8);
    }

    public static final <R extends Comparable<? super R>> Boolean minByOrNull(boolean[] zArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z8 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z8);
        }
        Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z8));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            boolean z9 = zArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z9));
            if (comparable.compareTo(comparable2) > 0) {
                z8 = z9;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z8);
    }

    public static void reverse(int[] iArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, iArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            int i12 = iArr[i8];
            iArr[i8] = iArr[i11];
            iArr[i11] = i12;
            i11--;
            i8++;
        }
    }

    public static final <V> List<V> zip(int[] iArr, int[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i8]), Integer.valueOf(other[i8])));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(byte[] bArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b9 : bArr) {
            Object objInvoke = keySelector.invoke(Byte.valueOf(b9));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Byte.valueOf(b9)));
        }
        return destination;
    }

    public static final double single(double[] dArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Double dValueOf = null;
        boolean z8 = false;
        for (double d9 : dArr) {
            if (((Boolean) predicate.invoke(Double.valueOf(d9))).booleanValue()) {
                if (!z8) {
                    dValueOf = Double.valueOf(d9);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z8) {
            Intrinsics.checkNotNull(dValueOf, "null cannot be cast to non-null type kotlin.Double");
            return dValueOf.doubleValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, List<V>> groupBy(T[] tArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t8 : tArr) {
            Object objInvoke = keySelector.invoke(t8);
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(t8));
        }
        return linkedHashMap;
    }

    public static final <R extends Comparable<? super R>> char maxByOrThrow(char[] cArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            char c9 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (lastIndex == 0) {
                return c9;
            }
            Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c9));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                char c10 = cArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c10));
                if (comparable.compareTo(comparable2) < 0) {
                    c9 = c10;
                    comparable = comparable2;
                }
            }
            return c9;
        }
        throw new NoSuchElementException();
    }

    public static final <R extends Comparable<? super R>> char minByOrThrow(char[] cArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            char c9 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (lastIndex == 0) {
                return c9;
            }
            Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c9));
            M it = new j7.l(1, lastIndex).iterator();
            while (it.hasNext()) {
                char c10 = cArr[it.nextInt()];
                Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c10));
                if (comparable.compareTo(comparable2) > 0) {
                    c9 = c10;
                    comparable = comparable2;
                }
            }
            return c9;
        }
        throw new NoSuchElementException();
    }

    public static final <V> List<V> zip(long[] jArr, long[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i8]), Long.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static void reverse(long[] jArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, jArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            long j8 = jArr[i8];
            jArr[i8] = jArr[i11];
            jArr[i11] = j8;
            i11--;
            i8++;
        }
    }

    public static final <V> List<V> zip(float[] fArr, float[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i8]), Float.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final boolean single(boolean[] zArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Boolean boolValueOf = null;
        boolean z8 = false;
        for (boolean z9 : zArr) {
            if (((Boolean) predicate.invoke(Boolean.valueOf(z9))).booleanValue()) {
                if (!z8) {
                    boolValueOf = Boolean.valueOf(z9);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z8) {
            Intrinsics.checkNotNull(boolValueOf, "null cannot be cast to non-null type kotlin.Boolean");
            return boolValueOf.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(short[] sArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s8 : sArr) {
            Object objInvoke = keySelector.invoke(Short.valueOf(s8));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Short.valueOf(s8)));
        }
        return destination;
    }

    public static final <R extends Comparable<? super R>> Character maxByOrNull(char[] cArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c9 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c9);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            char c10 = cArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c10));
            if (comparable.compareTo(comparable2) < 0) {
                c9 = c10;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c9);
    }

    public static final <R extends Comparable<? super R>> Character minByOrNull(char[] cArr, f7.l selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c9 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c9);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c9));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            char c10 = cArr[it.nextInt()];
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c10));
            if (comparable.compareTo(comparable2) > 0) {
                c9 = c10;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c9);
    }

    public static final <V> List<V> zip(double[] dArr, double[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i8]), Double.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final void reverse(float[] fArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, fArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            float f8 = fArr[i8];
            fArr[i8] = fArr[i11];
            fArr[i11] = f8;
            i11--;
            i8++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(byte[] bArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b9 : bArr) {
            Object objInvoke = keySelector.invoke(Byte.valueOf(b9));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Byte.valueOf(b9)));
        }
        return linkedHashMap;
    }

    public static final <V> List<V> zip(boolean[] zArr, boolean[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i8]), Boolean.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final char single(char[] cArr, f7.l predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z8 = false;
        for (char c9 : cArr) {
            if (((Boolean) predicate.invoke(Character.valueOf(c9))).booleanValue()) {
                if (!z8) {
                    chValueOf = Character.valueOf(c9);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z8) {
            Intrinsics.checkNotNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
            return chValueOf.charValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(int[] iArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i8 : iArr) {
            Object objInvoke = keySelector.invoke(Integer.valueOf(i8));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Integer.valueOf(i8)));
        }
        return destination;
    }

    public static final void reverse(double[] dArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, dArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            double d9 = dArr[i8];
            dArr[i8] = dArr[i11];
            dArr[i11] = d9;
            i11--;
            i8++;
        }
    }

    public static final <V> List<V> zip(char[] cArr, char[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i8]), Character.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final <T, R> List<R6.p> zip(T[] tArr, R[] other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(R6.v.to(tArr[i8], other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(short[] sArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s8 : sArr) {
            Object objInvoke = keySelector.invoke(Short.valueOf(s8));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Short.valueOf(s8)));
        }
        return linkedHashMap;
    }

    public static final void reverse(boolean[] zArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, zArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            boolean z8 = zArr[i8];
            zArr[i8] = zArr[i11];
            zArr[i11] = z8;
            i11--;
            i8++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(long[] jArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j8 : jArr) {
            Object objInvoke = keySelector.invoke(Long.valueOf(j8));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Long.valueOf(j8)));
        }
        return destination;
    }

    public static final <R> List<R6.p> zip(byte[] bArr, R[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            byte b9 = bArr[i8];
            arrayList.add(R6.v.to(Byte.valueOf(b9), other[i8]));
        }
        return arrayList;
    }

    public static final void reverse(char[] cArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, cArr.length);
        int i10 = (i8 + i9) / 2;
        if (i8 == i10) {
            return;
        }
        int i11 = i9 - 1;
        while (i8 < i10) {
            char c9 = cArr[i8];
            cArr[i8] = cArr[i11];
            cArr[i11] = c9;
            i11--;
            i8++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(int[] iArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 : iArr) {
            Object objInvoke = keySelector.invoke(Integer.valueOf(i8));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Integer.valueOf(i8)));
        }
        return linkedHashMap;
    }

    public static final <R> List<R6.p> zip(short[] sArr, R[] other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            short s8 = sArr[i8];
            arrayList.add(R6.v.to(Short.valueOf(s8), other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(float[] fArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f8 : fArr) {
            Object objInvoke = keySelector.invoke(Float.valueOf(f8));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Float.valueOf(f8)));
        }
        return destination;
    }

    public static final <R> List<R6.p> zip(int[] iArr, R[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            int i9 = iArr[i8];
            arrayList.add(R6.v.to(Integer.valueOf(i9), other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(long[] jArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j8 : jArr) {
            Object objInvoke = keySelector.invoke(Long.valueOf(j8));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Long.valueOf(j8)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(double[] dArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d9 : dArr) {
            Object objInvoke = keySelector.invoke(Double.valueOf(d9));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Double.valueOf(d9)));
        }
        return destination;
    }

    public static final <R> List<R6.p> zip(long[] jArr, R[] other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            long j8 = jArr[i8];
            arrayList.add(R6.v.to(Long.valueOf(j8), other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(float[] fArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f8 : fArr) {
            Object objInvoke = keySelector.invoke(Float.valueOf(f8));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Float.valueOf(f8)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(boolean[] zArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z8 : zArr) {
            Object objInvoke = keySelector.invoke(Boolean.valueOf(z8));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Boolean.valueOf(z8)));
        }
        return destination;
    }

    public static final <R> List<R6.p> zip(float[] fArr, R[] other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            float f8 = fArr[i8];
            arrayList.add(R6.v.to(Float.valueOf(f8), other[i8]));
        }
        return arrayList;
    }

    public static final <R> List<R6.p> zip(double[] dArr, R[] other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            double d9 = dArr[i8];
            arrayList.add(R6.v.to(Double.valueOf(d9), other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(char[] cArr, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c9 : cArr) {
            Object objInvoke = keySelector.invoke(Character.valueOf(c9));
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Character.valueOf(c9)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(double[] dArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d9 : dArr) {
            Object objInvoke = keySelector.invoke(Double.valueOf(d9));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Double.valueOf(d9)));
        }
        return linkedHashMap;
    }

    public static final <R> List<R6.p> zip(boolean[] zArr, R[] other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            boolean z8 = zArr[i8];
            arrayList.add(R6.v.to(Boolean.valueOf(z8), other[i8]));
        }
        return arrayList;
    }

    public static final <R> List<R6.p> zip(char[] cArr, R[] other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            char c9 = cArr[i8];
            arrayList.add(R6.v.to(Character.valueOf(c9), other[i8]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(boolean[] zArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z8 : zArr) {
            Object objInvoke = keySelector.invoke(Boolean.valueOf(z8));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Boolean.valueOf(z8)));
        }
        return linkedHashMap;
    }

    public static final <T, R> List<R6.p> zip(T[] tArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(R6.v.to(tArr[i8], r8));
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(char[] cArr, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c9 : cArr) {
            Object objInvoke = keySelector.invoke(Character.valueOf(c9));
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Character.valueOf(c9)));
        }
        return linkedHashMap;
    }

    public static final <R> List<R6.p> zip(byte[] bArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(R6.v.to(Byte.valueOf(bArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final <R> List<R6.p> zip(short[] sArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(R6.v.to(Short.valueOf(sArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final <R> List<R6.p> zip(int[] iArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(R6.v.to(Integer.valueOf(iArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final <R> List<R6.p> zip(long[] jArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(R6.v.to(Long.valueOf(jArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final <R> List<R6.p> zip(float[] fArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(R6.v.to(Float.valueOf(fArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final <R> List<R6.p> zip(double[] dArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(R6.v.to(Double.valueOf(dArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final <R> List<R6.p> zip(boolean[] zArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(R6.v.to(Boolean.valueOf(zArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final <R> List<R6.p> zip(char[] cArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(S6.r.collectionSizeOrDefault(other, 10), length));
        int i8 = 0;
        for (R r8 : other) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(R6.v.to(Character.valueOf(cArr[i8]), r8));
            i8++;
        }
        return arrayList;
    }

    public static final List<R6.p> zip(byte[] bArr, byte[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(R6.v.to(Byte.valueOf(bArr[i8]), Byte.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<R6.p> zip(short[] sArr, short[] other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(R6.v.to(Short.valueOf(sArr[i8]), Short.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<R6.p> zip(int[] iArr, int[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(R6.v.to(Integer.valueOf(iArr[i8]), Integer.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<R6.p> zip(long[] jArr, long[] other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(R6.v.to(Long.valueOf(jArr[i8]), Long.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<R6.p> zip(float[] fArr, float[] other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(R6.v.to(Float.valueOf(fArr[i8]), Float.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<R6.p> zip(double[] dArr, double[] other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(R6.v.to(Double.valueOf(dArr[i8]), Double.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<R6.p> zip(boolean[] zArr, boolean[] other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(R6.v.to(Boolean.valueOf(zArr[i8]), Boolean.valueOf(other[i8])));
        }
        return arrayList;
    }

    public static final List<R6.p> zip(char[] cArr, char[] other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i8 = 0; i8 < iMin; i8++) {
            arrayList.add(R6.v.to(Character.valueOf(cArr[i8]), Character.valueOf(other[i8])));
        }
        return arrayList;
    }
}
