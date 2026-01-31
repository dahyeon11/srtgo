package T6;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Object[] objArr, int i8, int i9, List list) {
        if (i9 != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!Intrinsics.areEqual(objArr[i8 + i10], list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final <E> E[] arrayOfUninitializedElements(int i8) {
        if (i8 >= 0) {
            return (E[]) new Object[i8];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(Object[] objArr, int i8, int i9) {
        int iHashCode = 1;
        for (int i10 = 0; i10 < i9; i10++) {
            Object obj = objArr[i8 + i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(Object[] objArr, int i8, int i9, Collection collection) {
        StringBuilder sb = new StringBuilder((i9 * 3) + 2);
        sb.append("[");
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i8 + i10];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final <T> T[] copyOfUninitializedElements(T[] tArr, int i8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i8);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void resetAt(E[] eArr, int i8) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        eArr[i8] = null;
    }

    public static final <E> void resetRange(E[] eArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        while (i8 < i9) {
            resetAt(eArr, i8);
            i8++;
        }
    }
}
