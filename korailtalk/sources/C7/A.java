package C7;

import com.kakao.sdk.common.Constants;
import e3.AbstractC5358c;
import io.grpc.internal.U;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes3.dex */
public final class A {

    /* renamed from: j, reason: collision with root package name */
    private static final char[] f426j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    final String f427a;

    /* renamed from: b, reason: collision with root package name */
    private final String f428b;

    /* renamed from: c, reason: collision with root package name */
    private final String f429c;

    /* renamed from: d, reason: collision with root package name */
    final String f430d;

    /* renamed from: e, reason: collision with root package name */
    final int f431e;

    /* renamed from: f, reason: collision with root package name */
    private final List f432f;

    /* renamed from: g, reason: collision with root package name */
    private final List f433g;

    /* renamed from: h, reason: collision with root package name */
    private final String f434h;

    /* renamed from: i, reason: collision with root package name */
    private final String f435i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f436a;

        /* renamed from: d, reason: collision with root package name */
        String f439d;

        /* renamed from: f, reason: collision with root package name */
        final List f441f;

        /* renamed from: g, reason: collision with root package name */
        List f442g;

        /* renamed from: h, reason: collision with root package name */
        String f443h;

        /* renamed from: b, reason: collision with root package name */
        String f437b = "";

        /* renamed from: c, reason: collision with root package name */
        String f438c = "";

        /* renamed from: e, reason: collision with root package name */
        int f440e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f441f = arrayList;
            arrayList.add("");
        }

        private a a(String str, boolean z8) {
            int i8 = 0;
            do {
                int iDelimiterOffset = D7.e.delimiterOffset(str, i8, str.length(), "/\\");
                j(str, i8, iDelimiterOffset, iDelimiterOffset < str.length(), z8);
                i8 = iDelimiterOffset + 1;
            } while (i8 <= str.length());
            return this;
        }

        private static String b(String str, int i8, int i9) {
            return D7.e.canonicalizeHost(A.g(str, i8, i9, false));
        }

        private boolean d(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean e(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int g(String str, int i8, int i9) throws NumberFormatException {
            int i10;
            try {
                i10 = Integer.parseInt(A.a(str, i8, i9, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i10 <= 0 || i10 > 65535) {
                return -1;
            }
            return i10;
        }

        private void h() {
            if (!((String) this.f441f.remove(r0.size() - 1)).isEmpty() || this.f441f.isEmpty()) {
                this.f441f.add("");
            } else {
                this.f441f.set(r0.size() - 1, "");
            }
        }

        private static int i(String str, int i8, int i9) {
            while (i8 < i9) {
                char cCharAt = str.charAt(i8);
                if (cCharAt == ':') {
                    return i8;
                }
                if (cCharAt == '[') {
                    do {
                        i8++;
                        if (i8 < i9) {
                        }
                    } while (str.charAt(i8) != ']');
                }
                i8++;
            }
            return i9;
        }

        private void j(String str, int i8, int i9, boolean z8, boolean z9) {
            String strA = A.a(str, i8, i9, " \"<>^`{}|/\\?#", z9, false, false, true, null);
            if (d(strA)) {
                return;
            }
            if (e(strA)) {
                h();
                return;
            }
            if (((String) this.f441f.get(r11.size() - 1)).isEmpty()) {
                this.f441f.set(r11.size() - 1, strA);
            } else {
                this.f441f.add(strA);
            }
            if (z8) {
                this.f441f.add("");
            }
        }

        private void l(String str) {
            for (int size = this.f442g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f442g.get(size))) {
                    this.f442g.remove(size + 1);
                    this.f442g.remove(size);
                    if (this.f442g.isEmpty()) {
                        this.f442g = null;
                        return;
                    }
                }
            }
        }

        private void m(String str, int i8, int i9) {
            if (i8 == i9) {
                return;
            }
            char cCharAt = str.charAt(i8);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f441f.clear();
                this.f441f.add("");
                i8++;
            } else {
                List list = this.f441f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i10 = i8;
                if (i10 >= i9) {
                    return;
                }
                i8 = D7.e.delimiterOffset(str, i10, i9, "/\\");
                boolean z8 = i8 < i9;
                j(str, i10, i8, z8, true);
                if (z8) {
                    i8++;
                }
            }
        }

        private static int n(String str, int i8, int i9) {
            if (i9 - i8 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i8);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i8++;
                    if (i8 >= i9) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i8);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i8;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int o(String str, int i8, int i9) {
            int i10 = 0;
            while (i8 < i9) {
                char cCharAt = str.charAt(i8);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i10++;
                i8++;
            }
            return i10;
        }

        public a addEncodedPathSegment(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            j(str, 0, str.length(), false, true);
            return this;
        }

        public a addEncodedPathSegments(String str) {
            if (str != null) {
                return a(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public a addEncodedQueryParameter(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.f442g == null) {
                this.f442g = new ArrayList();
            }
            this.f442g.add(A.b(str, " \"'<>#&=", true, false, true, true));
            this.f442g.add(str2 != null ? A.b(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public a addPathSegment(String str) {
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            j(str, 0, str.length(), false, false);
            return this;
        }

        public a addPathSegments(String str) {
            if (str != null) {
                return a(str, false);
            }
            throw new NullPointerException("pathSegments == null");
        }

        public a addQueryParameter(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.f442g == null) {
                this.f442g = new ArrayList();
            }
            this.f442g.add(A.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.f442g.add(str2 != null ? A.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        public A build() {
            if (this.f436a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f439d != null) {
                return new A(this);
            }
            throw new IllegalStateException("host == null");
        }

        int c() {
            int i8 = this.f440e;
            return i8 != -1 ? i8 : A.defaultPort(this.f436a);
        }

        public a encodedFragment(String str) {
            this.f443h = str != null ? A.b(str, "", true, false, false, false) : null;
            return this;
        }

        public a encodedPassword(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPassword == null");
            }
            this.f438c = A.b(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public a encodedPath(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            }
            if (str.startsWith("/")) {
                m(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException("unexpected encodedPath: " + str);
        }

        public a encodedQuery(String str) {
            this.f442g = str != null ? A.l(A.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a encodedUsername(String str) {
            if (str == null) {
                throw new NullPointerException("encodedUsername == null");
            }
            this.f437b = A.b(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        a f(A a9, String str) throws NumberFormatException {
            int iDelimiterOffset;
            int i8;
            int iSkipLeadingAsciiWhitespace = D7.e.skipLeadingAsciiWhitespace(str, 0, str.length());
            int iSkipTrailingAsciiWhitespace = D7.e.skipTrailingAsciiWhitespace(str, iSkipLeadingAsciiWhitespace, str.length());
            int iN = n(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace);
            if (iN != -1) {
                if (str.regionMatches(true, iSkipLeadingAsciiWhitespace, "https:", 0, 6)) {
                    this.f436a = Constants.SCHEME;
                    iSkipLeadingAsciiWhitespace += 6;
                } else {
                    if (!str.regionMatches(true, iSkipLeadingAsciiWhitespace, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, iN) + "'");
                    }
                    this.f436a = "http";
                    iSkipLeadingAsciiWhitespace += 5;
                }
            } else {
                if (a9 == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f436a = a9.f427a;
            }
            int iO = o(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace);
            char c9 = '?';
            char c10 = '#';
            if (iO >= 2 || a9 == null || !a9.f427a.equals(this.f436a)) {
                boolean z8 = false;
                boolean z9 = false;
                int i9 = iSkipLeadingAsciiWhitespace + iO;
                while (true) {
                    iDelimiterOffset = D7.e.delimiterOffset(str, i9, iSkipTrailingAsciiWhitespace, "@/\\?#");
                    char cCharAt = iDelimiterOffset != iSkipTrailingAsciiWhitespace ? str.charAt(iDelimiterOffset) : (char) 65535;
                    if (cCharAt == 65535 || cCharAt == c10 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c9) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z8) {
                            i8 = iDelimiterOffset;
                            this.f438c += "%40" + A.a(str, i9, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int iDelimiterOffset2 = D7.e.delimiterOffset(str, i9, iDelimiterOffset, ':');
                            i8 = iDelimiterOffset;
                            String strA = A.a(str, i9, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z9) {
                                strA = this.f437b + "%40" + strA;
                            }
                            this.f437b = strA;
                            if (iDelimiterOffset2 != i8) {
                                this.f438c = A.a(str, iDelimiterOffset2 + 1, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z8 = true;
                            }
                            z9 = true;
                        }
                        i9 = i8 + 1;
                    }
                    c9 = '?';
                    c10 = '#';
                }
                int i10 = i(str, i9, iDelimiterOffset);
                int i11 = i10 + 1;
                if (i11 < iDelimiterOffset) {
                    this.f439d = b(str, i9, i10);
                    int iG = g(str, i11, iDelimiterOffset);
                    this.f440e = iG;
                    if (iG == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i11, iDelimiterOffset) + '\"');
                    }
                } else {
                    this.f439d = b(str, i9, i10);
                    this.f440e = A.defaultPort(this.f436a);
                }
                if (this.f439d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i9, i10) + '\"');
                }
                iSkipLeadingAsciiWhitespace = iDelimiterOffset;
            } else {
                this.f437b = a9.encodedUsername();
                this.f438c = a9.encodedPassword();
                this.f439d = a9.f430d;
                this.f440e = a9.f431e;
                this.f441f.clear();
                this.f441f.addAll(a9.encodedPathSegments());
                if (iSkipLeadingAsciiWhitespace == iSkipTrailingAsciiWhitespace || str.charAt(iSkipLeadingAsciiWhitespace) == '#') {
                    encodedQuery(a9.encodedQuery());
                }
            }
            int iDelimiterOffset3 = D7.e.delimiterOffset(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace, "?#");
            m(str, iSkipLeadingAsciiWhitespace, iDelimiterOffset3);
            if (iDelimiterOffset3 < iSkipTrailingAsciiWhitespace && str.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = D7.e.delimiterOffset(str, iDelimiterOffset3, iSkipTrailingAsciiWhitespace, '#');
                this.f442g = A.l(A.a(str, iDelimiterOffset3 + 1, iDelimiterOffset4, " \"'<>#", true, false, true, true, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < iSkipTrailingAsciiWhitespace && str.charAt(iDelimiterOffset3) == '#') {
                this.f443h = A.a(str, 1 + iDelimiterOffset3, iSkipTrailingAsciiWhitespace, "", true, false, false, false, null);
            }
            return this;
        }

        public a fragment(String str) {
            this.f443h = str != null ? A.b(str, "", false, false, false, false) : null;
            return this;
        }

        public a host(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strB = b(str, 0, str.length());
            if (strB != null) {
                this.f439d = strB;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        a k() {
            int size = this.f441f.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.f441f.set(i8, A.b((String) this.f441f.get(i8), "[]", true, true, false, true));
            }
            List list = this.f442g;
            if (list != null) {
                int size2 = list.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    String str = (String) this.f442g.get(i9);
                    if (str != null) {
                        this.f442g.set(i9, A.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f443h;
            if (str2 != null) {
                this.f443h = A.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a password(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f438c = A.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a port(int i8) {
            if (i8 > 0 && i8 <= 65535) {
                this.f440e = i8;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i8);
        }

        public a query(String str) {
            this.f442g = str != null ? A.l(A.b(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        public a removeAllEncodedQueryParameters(String str) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.f442g == null) {
                return this;
            }
            l(A.b(str, " \"'<>#&=", true, false, true, true));
            return this;
        }

        public a removeAllQueryParameters(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.f442g == null) {
                return this;
            }
            l(A.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            return this;
        }

        public a removePathSegment(int i8) {
            this.f441f.remove(i8);
            if (this.f441f.isEmpty()) {
                this.f441f.add("");
            }
            return this;
        }

        public a scheme(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f436a = "http";
            } else {
                if (!str.equalsIgnoreCase(Constants.SCHEME)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.f436a = Constants.SCHEME;
            }
            return this;
        }

        public a setEncodedPathSegment(int i8, String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            String strA = A.a(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false, false, true, null);
            this.f441f.set(i8, strA);
            if (!d(strA) && !e(strA)) {
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: " + str);
        }

        public a setEncodedQueryParameter(String str, String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public a setPathSegment(int i8, String str) {
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            String strA = A.a(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, false, true, null);
            if (!d(strA) && !e(strA)) {
                this.f441f.set(i8, strA);
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: " + str);
        }

        public a setQueryParameter(String str, String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f436a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f437b.isEmpty() || !this.f438c.isEmpty()) {
                sb.append(this.f437b);
                if (!this.f438c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f438c);
                }
                sb.append('@');
            }
            String str2 = this.f439d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f439d);
                    sb.append(']');
                } else {
                    sb.append(this.f439d);
                }
            }
            if (this.f440e != -1 || this.f436a != null) {
                int iC = c();
                String str3 = this.f436a;
                if (str3 == null || iC != A.defaultPort(str3)) {
                    sb.append(':');
                    sb.append(iC);
                }
            }
            A.f(sb, this.f441f);
            if (this.f442g != null) {
                sb.append('?');
                A.e(sb, this.f442g);
            }
            if (this.f443h != null) {
                sb.append('#');
                sb.append(this.f443h);
            }
            return sb.toString();
        }

        public a username(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f437b = A.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }
    }

    A(a aVar) {
        this.f427a = aVar.f436a;
        this.f428b = h(aVar.f437b, false);
        this.f429c = h(aVar.f438c, false);
        this.f430d = aVar.f439d;
        this.f431e = aVar.c();
        this.f432f = i(aVar.f441f, false);
        List list = aVar.f442g;
        this.f433g = list != null ? i(list, true) : null;
        String str = aVar.f443h;
        this.f434h = str != null ? h(str, false) : null;
        this.f435i = aVar.toString();
    }

    static String a(String str, int i8, int i9, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        int iCharCount = i8;
        while (iCharCount < i9) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || (iCodePointAt >= 128 && z11)) {
                P7.c cVar = new P7.c();
                cVar.writeUtf8(str, i8, iCharCount);
                d(cVar, str, iCharCount, i9, str2, z8, z9, z10, z11, charset);
                return cVar.readUtf8();
            }
            if (str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z8 || (z9 && !k(str, iCharCount, i9)))) || (iCodePointAt == 43 && z10))) {
                P7.c cVar2 = new P7.c();
                cVar2.writeUtf8(str, i8, iCharCount);
                d(cVar2, str, iCharCount, i9, str2, z8, z9, z10, z11, charset);
                return cVar2.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i8, i9);
    }

    static String b(String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11) {
        return a(str, 0, str.length(), str2, z8, z9, z10, z11, null);
    }

    static String c(String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        return a(str, 0, str.length(), str2, z8, z9, z10, z11, charset);
    }

    static void d(P7.c cVar, String str, int i8, int i9, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        P7.c cVar2 = null;
        while (i8 < i9) {
            int iCodePointAt = str.codePointAt(i8);
            if (!z8 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z10) {
                    cVar.writeUtf8(z8 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z11) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z8 || (z9 && !k(str, i8, i9)))))) {
                    if (cVar2 == null) {
                        cVar2 = new P7.c();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        cVar2.writeUtf8CodePoint(iCodePointAt);
                    } else {
                        cVar2.writeString(str, i8, Character.charCount(iCodePointAt) + i8, charset);
                    }
                    while (!cVar2.exhausted()) {
                        byte b9 = cVar2.readByte();
                        cVar.writeByte(37);
                        char[] cArr = f426j;
                        cVar.writeByte((int) cArr[((b9 & 255) >> 4) & 15]);
                        cVar.writeByte((int) cArr[b9 & AbstractC5358c.SI]);
                    }
                } else {
                    cVar.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i8 += Character.charCount(iCodePointAt);
        }
    }

    public static int defaultPort(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals(Constants.SCHEME)) {
            return U.DEFAULT_PORT_SSL;
        }
        return -1;
    }

    static void e(StringBuilder sb, List list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8 += 2) {
            String str = (String) list.get(i8);
            String str2 = (String) list.get(i8 + 1);
            if (i8 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static void f(StringBuilder sb, List list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            sb.append('/');
            sb.append((String) list.get(i8));
        }
    }

    static String g(String str, int i8, int i9, boolean z8) {
        for (int i10 = i8; i10 < i9; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%' || (cCharAt == '+' && z8)) {
                P7.c cVar = new P7.c();
                cVar.writeUtf8(str, i8, i10);
                j(cVar, str, i10, i9, z8);
                return cVar.readUtf8();
            }
        }
        return str.substring(i8, i9);
    }

    public static A get(String str) {
        return new a().f(null, str).build();
    }

    static String h(String str, boolean z8) {
        return g(str, 0, str.length(), z8);
    }

    private List i(List list, boolean z8) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            String str = (String) list.get(i8);
            arrayList.add(str != null ? h(str, z8) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void j(P7.c r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = D7.e.decodeHexDigit(r2)
            char r3 = r6.charAt(r1)
            int r3 = D7.e.decodeHexDigit(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.writeByte(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.writeByte(r1)
            goto L3c
        L39:
            r5.writeUtf8CodePoint(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C7.A.j(P7.c, java.lang.String, int, int, boolean):void");
    }

    static boolean k(String str, int i8, int i9) {
        int i10 = i8 + 2;
        return i10 < i9 && str.charAt(i8) == '%' && D7.e.decodeHexDigit(str.charAt(i8 + 1)) != -1 && D7.e.decodeHexDigit(str.charAt(i10)) != -1;
    }

    static List l(String str) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 <= str.length()) {
            int iIndexOf = str.indexOf(38, i8);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i8);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i8, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i8, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i8 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static A parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String encodedFragment() {
        if (this.f434h == null) {
            return null;
        }
        return this.f435i.substring(this.f435i.indexOf(35) + 1);
    }

    public String encodedPassword() {
        if (this.f429c.isEmpty()) {
            return "";
        }
        return this.f435i.substring(this.f435i.indexOf(58, this.f427a.length() + 3) + 1, this.f435i.indexOf(64));
    }

    public String encodedPath() {
        int iIndexOf = this.f435i.indexOf(47, this.f427a.length() + 3);
        String str = this.f435i;
        return this.f435i.substring(iIndexOf, D7.e.delimiterOffset(str, iIndexOf, str.length(), "?#"));
    }

    public List<String> encodedPathSegments() {
        int iIndexOf = this.f435i.indexOf(47, this.f427a.length() + 3);
        String str = this.f435i;
        int iDelimiterOffset = D7.e.delimiterOffset(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iDelimiterOffset) {
            int i8 = iIndexOf + 1;
            int iDelimiterOffset2 = D7.e.delimiterOffset(this.f435i, i8, iDelimiterOffset, '/');
            arrayList.add(this.f435i.substring(i8, iDelimiterOffset2));
            iIndexOf = iDelimiterOffset2;
        }
        return arrayList;
    }

    public String encodedQuery() {
        if (this.f433g == null) {
            return null;
        }
        int iIndexOf = this.f435i.indexOf(63) + 1;
        String str = this.f435i;
        return this.f435i.substring(iIndexOf, D7.e.delimiterOffset(str, iIndexOf, str.length(), '#'));
    }

    public String encodedUsername() {
        if (this.f428b.isEmpty()) {
            return "";
        }
        int length = this.f427a.length() + 3;
        String str = this.f435i;
        return this.f435i.substring(length, D7.e.delimiterOffset(str, length, str.length(), ":@"));
    }

    public boolean equals(Object obj) {
        return (obj instanceof A) && ((A) obj).f435i.equals(this.f435i);
    }

    public String fragment() {
        return this.f434h;
    }

    public int hashCode() {
        return this.f435i.hashCode();
    }

    public String host() {
        return this.f430d;
    }

    public boolean isHttps() {
        return this.f427a.equals(Constants.SCHEME);
    }

    public a newBuilder() {
        a aVar = new a();
        aVar.f436a = this.f427a;
        aVar.f437b = encodedUsername();
        aVar.f438c = encodedPassword();
        aVar.f439d = this.f430d;
        aVar.f440e = this.f431e != defaultPort(this.f427a) ? this.f431e : -1;
        aVar.f441f.clear();
        aVar.f441f.addAll(encodedPathSegments());
        aVar.encodedQuery(encodedQuery());
        aVar.f443h = encodedFragment();
        return aVar;
    }

    public String password() {
        return this.f429c;
    }

    public List<String> pathSegments() {
        return this.f432f;
    }

    public int pathSize() {
        return this.f432f.size();
    }

    public int port() {
        return this.f431e;
    }

    public String query() {
        if (this.f433g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        e(sb, this.f433g);
        return sb.toString();
    }

    public String queryParameter(String str) {
        List list = this.f433g;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8 += 2) {
            if (str.equals(this.f433g.get(i8))) {
                return (String) this.f433g.get(i8 + 1);
            }
        }
        return null;
    }

    public String queryParameterName(int i8) {
        List list = this.f433g;
        if (list != null) {
            return (String) list.get(i8 * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    public Set<String> queryParameterNames() {
        if (this.f433g == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f433g.size();
        for (int i8 = 0; i8 < size; i8 += 2) {
            linkedHashSet.add((String) this.f433g.get(i8));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public String queryParameterValue(int i8) {
        List list = this.f433g;
        if (list != null) {
            return (String) list.get((i8 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public List<String> queryParameterValues(String str) {
        if (this.f433g == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.f433g.size();
        for (int i8 = 0; i8 < size; i8 += 2) {
            if (str.equals(this.f433g.get(i8))) {
                arrayList.add((String) this.f433g.get(i8 + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int querySize() {
        List list = this.f433g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public String redact() {
        return newBuilder("/...").username("").password("").build().toString();
    }

    public A resolve(String str) {
        a aVarNewBuilder = newBuilder(str);
        if (aVarNewBuilder != null) {
            return aVarNewBuilder.build();
        }
        return null;
    }

    public String scheme() {
        return this.f427a;
    }

    public String toString() {
        return this.f435i;
    }

    public String topPrivateDomain() {
        if (D7.e.verifyAsIpAddress(this.f430d)) {
            return null;
        }
        return PublicSuffixDatabase.get().getEffectiveTldPlusOne(this.f430d);
    }

    public URI uri() {
        String string = newBuilder().k().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e8) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e8);
            }
        }
    }

    public URL url() {
        try {
            return new URL(this.f435i);
        } catch (MalformedURLException e8) {
            throw new RuntimeException(e8);
        }
    }

    public String username() {
        return this.f428b;
    }

    public static A get(URL url) {
        return parse(url.toString());
    }

    public static A get(URI uri) {
        return parse(uri.toString());
    }

    public a newBuilder(String str) {
        try {
            return new a().f(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
