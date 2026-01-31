package X7;

import Q7.C0697a;
import Q7.C0708l;
import Q7.X;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final d f5490a = new a(',');

    /* renamed from: b, reason: collision with root package name */
    private static final d f5491b = new a('\t');

    /* renamed from: c, reason: collision with root package name */
    private static final d f5492c = new a(' ');

    /* renamed from: d, reason: collision with root package name */
    private static final d f5493d = new b(" \t\n\r\f".toCharArray());

    /* renamed from: e, reason: collision with root package name */
    private static final d f5494e = new e();

    /* renamed from: f, reason: collision with root package name */
    private static final d f5495f = new a('\'');

    /* renamed from: g, reason: collision with root package name */
    private static final d f5496g = new a('\"');

    /* renamed from: h, reason: collision with root package name */
    private static final d f5497h = new b("'\"".toCharArray());

    /* renamed from: i, reason: collision with root package name */
    private static final d f5498i = new c();

    static final class a extends d {

        /* renamed from: j, reason: collision with root package name */
        private final char f5499j;

        a(char c9) {
            this.f5499j = c9;
        }

        @Override // X7.d
        public int isMatch(char[] cArr, int i8, int i9, int i10) {
            return this.f5499j == cArr[i8] ? 1 : 0;
        }
    }

    static final class b extends d {

        /* renamed from: j, reason: collision with root package name */
        private final char[] f5500j;

        b(char[] cArr) {
            this.f5500j = C0697a.sort((char[]) cArr.clone());
        }

        @Override // X7.d
        public int isMatch(char[] cArr, int i8, int i9, int i10) {
            return Arrays.binarySearch(this.f5500j, cArr[i8]) >= 0 ? 1 : 0;
        }
    }

    static final class c extends d {
        c() {
        }

        @Override // X7.d
        public int isMatch(char[] cArr, int i8, int i9, int i10) {
            return 0;
        }
    }

    /* renamed from: X7.d$d, reason: collision with other inner class name */
    static final class C0088d extends d {

        /* renamed from: j, reason: collision with root package name */
        private final char[] f5501j;

        C0088d(String str) {
            this.f5501j = str.toCharArray();
        }

        @Override // X7.d
        public int isMatch(char[] cArr, int i8, int i9, int i10) {
            int length = this.f5501j.length;
            if (i8 + length > i10) {
                return 0;
            }
            int i11 = 0;
            while (true) {
                char[] cArr2 = this.f5501j;
                if (i11 >= cArr2.length) {
                    return length;
                }
                if (cArr2[i11] != cArr[i8]) {
                    return 0;
                }
                i11++;
                i8++;
            }
        }

        public String toString() {
            return super.toString() + ' ' + Arrays.toString(this.f5501j);
        }
    }

    static final class e extends d {
        e() {
        }

        @Override // X7.d
        public int isMatch(char[] cArr, int i8, int i9, int i10) {
            return cArr[i8] <= ' ' ? 1 : 0;
        }
    }

    protected d() {
    }

    public static d charMatcher(char c9) {
        return new a(c9);
    }

    public static d charSetMatcher(char... cArr) {
        return C0708l.isEmpty(cArr) ? f5498i : cArr.length == 1 ? new a(cArr[0]) : new b(cArr);
    }

    public static d commaMatcher() {
        return f5490a;
    }

    public static d doubleQuoteMatcher() {
        return f5496g;
    }

    public static d noneMatcher() {
        return f5498i;
    }

    public static d quoteMatcher() {
        return f5497h;
    }

    public static d singleQuoteMatcher() {
        return f5495f;
    }

    public static d spaceMatcher() {
        return f5492c;
    }

    public static d splitMatcher() {
        return f5493d;
    }

    public static d stringMatcher(String str) {
        return X.isEmpty(str) ? f5498i : new C0088d(str);
    }

    public static d tabMatcher() {
        return f5491b;
    }

    public static d trimMatcher() {
        return f5494e;
    }

    public int isMatch(char[] cArr, int i8) {
        return isMatch(cArr, i8, 0, cArr.length);
    }

    public abstract int isMatch(char[] cArr, int i8, int i9, int i10);

    public static d charSetMatcher(String str) {
        if (X.isEmpty(str)) {
            return f5498i;
        }
        if (str.length() == 1) {
            return new a(str.charAt(0));
        }
        return new b(str.toCharArray());
    }
}
