package J6;

import Q7.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f2647a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f2648a = new ArrayList(20);

        private void c(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i8 = 0; i8 < length; i8++) {
                char cCharAt = str.charAt(i8);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i8), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i9 = 0; i9 < length2; i9++) {
                char cCharAt2 = str2.charAt(i9);
                if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i9), str2));
                }
            }
        }

        b b(String str, String str2) {
            this.f2648a.add(str);
            this.f2648a.add(str2.trim());
            return this;
        }

        public e build() {
            return new e(this);
        }

        public b removeAll(String str) {
            int i8 = 0;
            while (i8 < this.f2648a.size()) {
                if (str.equalsIgnoreCase((String) this.f2648a.get(i8))) {
                    this.f2648a.remove(i8);
                    this.f2648a.remove(i8);
                    i8 -= 2;
                }
                i8 += 2;
            }
            return this;
        }

        public b set(String str, String str2) {
            c(str, str2);
            removeAll(str);
            b(str, str2);
            return this;
        }
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public String get(String str) {
        return a(this.f2647a, str);
    }

    public String name(int i8) {
        int i9 = i8 * 2;
        if (i9 < 0) {
            return null;
        }
        String[] strArr = this.f2647a;
        if (i9 >= strArr.length) {
            return null;
        }
        return strArr[i9];
    }

    public b newBuilder() {
        b bVar = new b();
        Collections.addAll(bVar.f2648a, this.f2647a);
        return bVar;
    }

    public int size() {
        return this.f2647a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            sb.append(name(i8));
            sb.append(": ");
            sb.append(value(i8));
            sb.append(X.LF);
        }
        return sb.toString();
    }

    public String value(int i8) {
        int i9 = (i8 * 2) + 1;
        if (i9 < 0) {
            return null;
        }
        String[] strArr = this.f2647a;
        if (i9 >= strArr.length) {
            return null;
        }
        return strArr[i9];
    }

    private e(b bVar) {
        this.f2647a = (String[]) bVar.f2648a.toArray(new String[bVar.f2648a.size()]);
    }
}
