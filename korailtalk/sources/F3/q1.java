package f3;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class q1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f31077a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparator f31078b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f31079c;

    /* renamed from: d, reason: collision with root package name */
    private int f31080d;

    /* renamed from: e, reason: collision with root package name */
    private Object f31081e;

    private q1(Comparator comparator, int i8) {
        this.f31078b = (Comparator) e3.w.checkNotNull(comparator, "comparator");
        this.f31077a = i8;
        e3.w.checkArgument(i8 >= 0, "k (%s) must be >= 0", i8);
        e3.w.checkArgument(i8 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i8);
        this.f31079c = new Object[i3.b.checkedMultiply(i8, 2)];
        this.f31080d = 0;
        this.f31081e = null;
    }

    private int a(int i8, int i9, int i10) {
        Object objA = N0.a(this.f31079c[i10]);
        Object[] objArr = this.f31079c;
        objArr[i10] = objArr[i9];
        int i11 = i8;
        while (i8 < i9) {
            if (this.f31078b.compare(N0.a(this.f31079c[i8]), objA) < 0) {
                b(i11, i8);
                i11++;
            }
            i8++;
        }
        Object[] objArr2 = this.f31079c;
        objArr2[i9] = objArr2[i11];
        objArr2[i11] = objA;
        return i11;
    }

    private void b(int i8, int i9) {
        Object[] objArr = this.f31079c;
        Object obj = objArr[i8];
        objArr[i8] = objArr[i9];
        objArr[i9] = obj;
    }

    private void c() {
        int i8 = (this.f31077a * 2) - 1;
        int iLog2 = i3.b.log2(i8, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (iMax >= i8) {
                break;
            }
            int iA = a(iMax, i8, ((iMax + i8) + 1) >>> 1);
            int i11 = this.f31077a;
            if (iA <= i11) {
                if (iA >= i11) {
                    break;
                }
                iMax = Math.max(iA, iMax + 1);
                i10 = iA;
            } else {
                i8 = iA - 1;
            }
            i9++;
            if (i9 >= iLog2) {
                Arrays.sort(this.f31079c, iMax, i8 + 1, this.f31078b);
                break;
            }
        }
        this.f31080d = this.f31077a;
        this.f31081e = N0.a(this.f31079c[i10]);
        while (true) {
            i10++;
            if (i10 >= this.f31077a) {
                return;
            }
            if (this.f31078b.compare(N0.a(this.f31079c[i10]), N0.a(this.f31081e)) > 0) {
                this.f31081e = this.f31079c[i10];
            }
        }
    }

    public static <T extends Comparable<? super T>> q1 greatest(int i8) {
        return greatest(i8, T0.natural());
    }

    public static <T extends Comparable<? super T>> q1 least(int i8) {
        return least(i8, T0.natural());
    }

    public void offer(Object obj) {
        int i8 = this.f31077a;
        if (i8 == 0) {
            return;
        }
        int i9 = this.f31080d;
        if (i9 == 0) {
            this.f31079c[0] = obj;
            this.f31081e = obj;
            this.f31080d = 1;
            return;
        }
        if (i9 < i8) {
            Object[] objArr = this.f31079c;
            this.f31080d = i9 + 1;
            objArr[i9] = obj;
            if (this.f31078b.compare(obj, N0.a(this.f31081e)) > 0) {
                this.f31081e = obj;
                return;
            }
            return;
        }
        if (this.f31078b.compare(obj, N0.a(this.f31081e)) < 0) {
            Object[] objArr2 = this.f31079c;
            int i10 = this.f31080d;
            int i11 = i10 + 1;
            this.f31080d = i11;
            objArr2[i10] = obj;
            if (i11 == this.f31077a * 2) {
                c();
            }
        }
    }

    public void offerAll(Iterable<Object> iterable) {
        offerAll(iterable.iterator());
    }

    public List<Object> topK() {
        Object[] objArr = this.f31079c;
        Arrays.sort(objArr, 0, this.f31080d, this.f31078b);
        int i8 = this.f31080d;
        int i9 = this.f31077a;
        if (i8 > i9) {
            Object[] objArr2 = this.f31079c;
            Arrays.fill(objArr2, i9, objArr2.length, (Object) null);
            int i10 = this.f31077a;
            this.f31080d = i10;
            this.f31081e = this.f31079c[i10 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, this.f31080d)));
    }

    public static <T> q1 greatest(int i8, Comparator<? super T> comparator) {
        return new q1(T0.from(comparator).reverse(), i8);
    }

    public static <T> q1 least(int i8, Comparator<? super T> comparator) {
        return new q1(comparator, i8);
    }

    public void offerAll(Iterator<Object> it) {
        while (it.hasNext()) {
            offer(it.next());
        }
    }
}
