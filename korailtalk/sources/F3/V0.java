package f3;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class V0 {
    static Object[] a(Object[] objArr, int i8, int i9, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i8, i9, objArr2.getClass());
    }

    static Object[] b(Object[] objArr, int i8) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i8);
    }

    static Set c() {
        return C5490u.create();
    }

    static Map d() {
        return C5488t.create();
    }

    static C0 e(C0 c02) {
        return c02.weakKeys();
    }
}
