package f3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: f3.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5496x extends T0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator[] f31190a;

    C5496x(Comparator comparator, Comparator comparator2) {
        this.f31190a = new Comparator[]{comparator, comparator2};
    }

    @Override // f3.T0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i8 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f31190a;
            if (i8 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i8].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i8++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5496x) {
            return Arrays.equals(this.f31190a, ((C5496x) obj).f31190a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f31190a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f31190a) + ")";
    }

    C5496x(Iterable iterable) {
        this.f31190a = (Comparator[]) AbstractC5493v0.g(iterable, new Comparator[0]);
    }
}
