package C7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: C7.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0481o {

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f683j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f684k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f685l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f686m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    private final String f687a;

    /* renamed from: b, reason: collision with root package name */
    private final String f688b;

    /* renamed from: c, reason: collision with root package name */
    private final long f689c;

    /* renamed from: d, reason: collision with root package name */
    private final String f690d;

    /* renamed from: e, reason: collision with root package name */
    private final String f691e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f692f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f693g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f694h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f695i;

    private C0481o(String str, String str2, long j8, String str3, String str4, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f687a = str;
        this.f688b = str2;
        this.f689c = j8;
        this.f690d = str3;
        this.f691e = str4;
        this.f692f = z8;
        this.f693g = z9;
        this.f695i = z10;
        this.f694h = z11;
    }

    private static int a(String str, int i8, int i9, boolean z8) {
        while (i8 < i9) {
            char cCharAt = str.charAt(i8);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z8)) {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    private static boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !D7.e.verifyAsIpAddress(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[PHI: r0
  0x00c1: PHI (r0v16 long) = (r0v2 long), (r0v6 long) binds: [B:41:0x00bf, B:52:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static C7.C0481o c(long r23, C7.A r25, java.lang.String r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C7.C0481o.c(long, C7.A, java.lang.String):C7.o");
    }

    private static String d(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String strCanonicalizeHost = D7.e.canonicalizeHost(str);
        if (strCanonicalizeHost != null) {
            return strCanonicalizeHost;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long e(java.lang.String r12, int r13, int r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C7.C0481o.e(java.lang.String, int, int):long");
    }

    private static long f(String str) throws NumberFormatException {
        try {
            long j8 = Long.parseLong(str);
            if (j8 <= 0) {
                return Long.MIN_VALUE;
            }
            return j8;
        } catch (NumberFormatException e8) {
            if (str.matches("-?\\d+")) {
                return str.startsWith(g5.e.STATE_NAME_NONE) ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e8;
        }
    }

    private static boolean g(A a9, String str) {
        String strEncodedPath = a9.encodedPath();
        if (strEncodedPath.equals(str)) {
            return true;
        }
        if (strEncodedPath.startsWith(str)) {
            return str.endsWith("/") || strEncodedPath.charAt(str.length()) == '/';
        }
        return false;
    }

    public static C0481o parse(A a9, String str) {
        return c(System.currentTimeMillis(), a9, str);
    }

    public static List<C0481o> parseAll(A a9, z zVar) {
        List<String> listValues = zVar.values("Set-Cookie");
        int size = listValues.size();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            C0481o c0481o = parse(a9, listValues.get(i8));
            if (c0481o != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0481o);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String domain() {
        return this.f690d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0481o)) {
            return false;
        }
        C0481o c0481o = (C0481o) obj;
        return c0481o.f687a.equals(this.f687a) && c0481o.f688b.equals(this.f688b) && c0481o.f690d.equals(this.f690d) && c0481o.f691e.equals(this.f691e) && c0481o.f689c == this.f689c && c0481o.f692f == this.f692f && c0481o.f693g == this.f693g && c0481o.f694h == this.f694h && c0481o.f695i == this.f695i;
    }

    public long expiresAt() {
        return this.f689c;
    }

    String h(boolean z8) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f687a);
        sb.append('=');
        sb.append(this.f688b);
        if (this.f694h) {
            if (this.f689c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(G7.d.format(new Date(this.f689c)));
            }
        }
        if (!this.f695i) {
            sb.append("; domain=");
            if (z8) {
                sb.append(".");
            }
            sb.append(this.f690d);
        }
        sb.append("; path=");
        sb.append(this.f691e);
        if (this.f692f) {
            sb.append("; secure");
        }
        if (this.f693g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public int hashCode() {
        int iHashCode = (((((((527 + this.f687a.hashCode()) * 31) + this.f688b.hashCode()) * 31) + this.f690d.hashCode()) * 31) + this.f691e.hashCode()) * 31;
        long j8 = this.f689c;
        return ((((((((iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (!this.f692f ? 1 : 0)) * 31) + (!this.f693g ? 1 : 0)) * 31) + (!this.f694h ? 1 : 0)) * 31) + (!this.f695i ? 1 : 0);
    }

    public boolean hostOnly() {
        return this.f695i;
    }

    public boolean httpOnly() {
        return this.f693g;
    }

    public boolean matches(A a9) {
        if ((this.f695i ? a9.host().equals(this.f690d) : b(a9.host(), this.f690d)) && g(a9, this.f691e)) {
            return !this.f692f || a9.isHttps();
        }
        return false;
    }

    public String name() {
        return this.f687a;
    }

    public String path() {
        return this.f691e;
    }

    public boolean persistent() {
        return this.f694h;
    }

    public boolean secure() {
        return this.f692f;
    }

    public String toString() {
        return h(false);
    }

    public String value() {
        return this.f688b;
    }
}
