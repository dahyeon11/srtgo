package f3;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class w1 extends T0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final w1 f31189a = new w1();

    private w1() {
    }

    @Override // f3.T0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
