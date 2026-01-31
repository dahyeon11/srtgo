package i2;

import android.os.Bundle;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: i2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5681n {

    /* renamed from: i2.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f31834a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f31835b;

        /* synthetic */ a(Object obj, e0 e0Var) {
            AbstractC5683p.checkNotNull(obj);
            this.f31835b = obj;
            this.f31834a = new ArrayList();
        }

        public a add(String str, Object obj) {
            AbstractC5683p.checkNotNull(str);
            this.f31834a.add(str + SimpleComparison.EQUAL_TO_OPERATION + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f31835b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f31834a.size();
            for (int i8 = 0; i8 < size; i8++) {
                sb.append((String) this.f31834a.get(i8));
                if (i8 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean checkBundlesEquality(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!equal(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a toStringHelper(Object obj) {
        return new a(obj, null);
    }
}
