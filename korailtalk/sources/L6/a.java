package L6;

import P7.c;
import com.kakao.sdk.common.Constants;
import io.grpc.internal.U;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f3074e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    private final String f3075a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3076b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3077c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3078d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        String f3079a;

        /* renamed from: b, reason: collision with root package name */
        String f3080b;

        /* renamed from: c, reason: collision with root package name */
        int f3081c = -1;

        private static String a(String str, int i8, int i9) {
            String strB = a.b(str, i8, i9, false);
            if (!strB.startsWith("[") || !strB.endsWith("]")) {
                return e(strB);
            }
            InetAddress inetAddressD = d(strB, 1, strB.length() - 1);
            if (inetAddressD == null) {
                return null;
            }
            byte[] address = inetAddressD.getAddress();
            if (address.length == 16) {
                return g(address);
            }
            throw new AssertionError();
        }

        private static boolean b(String str) {
            for (int i8 = 0; i8 < str.length(); i8++) {
                char cCharAt = str.charAt(i8);
                if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        private static boolean c(String str, int i8, int i9, byte[] bArr, int i10) {
            int i11 = i10;
            while (i8 < i9) {
                if (i11 == bArr.length) {
                    return false;
                }
                if (i11 != i10) {
                    if (str.charAt(i8) != '.') {
                        return false;
                    }
                    i8++;
                }
                int i12 = i8;
                int i13 = 0;
                while (i12 < i9) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    if ((i13 == 0 && i8 != i12) || (i13 = ((i13 * 10) + cCharAt) - 48) > 255) {
                        return false;
                    }
                    i12++;
                }
                if (i12 - i8 == 0) {
                    return false;
                }
                bArr[i11] = (byte) i13;
                i11++;
                i8 = i12;
            }
            return i11 == i10 + 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
        
            if (r4 == 16) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
        
            if (r5 != (-1)) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
        
            r12 = r4 - r5;
            java.lang.System.arraycopy(r1, r5, r1, 16 - r12, r12);
            java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
        
            return java.net.InetAddress.getByAddress(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
        
            throw new java.lang.AssertionError();
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.net.InetAddress d(java.lang.String r12, int r13, int r14) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = 0
                r3 = -1
                r4 = r2
                r5 = r3
                r6 = r5
            L9:
                r7 = 0
                if (r13 >= r14) goto L79
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r13 + 2
                r9 = 2
                if (r8 > r14) goto L27
                java.lang.String r10 = "::"
                boolean r10 = r12.regionMatches(r13, r10, r2, r9)
                if (r10 == 0) goto L27
                if (r5 == r3) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r14) goto L25
                goto L79
            L25:
                r6 = r8
                goto L4b
            L27:
                if (r4 == 0) goto L34
                java.lang.String r8 = ":"
                r10 = 1
                boolean r8 = r12.regionMatches(r13, r8, r2, r10)
                if (r8 == 0) goto L36
                int r13 = r13 + 1
            L34:
                r6 = r13
                goto L4b
            L36:
                java.lang.String r8 = "."
                boolean r13 = r12.regionMatches(r13, r8, r2, r10)
                if (r13 == 0) goto L4a
                int r13 = r4 + (-2)
                boolean r12 = c(r12, r6, r14, r1, r13)
                if (r12 != 0) goto L47
                return r7
            L47:
                int r4 = r4 + 2
                goto L79
            L4a:
                return r7
            L4b:
                r8 = r2
                r13 = r6
            L4d:
                if (r13 >= r14) goto L60
                char r10 = r12.charAt(r13)
                int r10 = L6.a.a(r10)
                if (r10 != r3) goto L5a
                goto L60
            L5a:
                int r8 = r8 << 4
                int r8 = r8 + r10
                int r13 = r13 + 1
                goto L4d
            L60:
                int r10 = r13 - r6
                if (r10 == 0) goto L78
                r11 = 4
                if (r10 <= r11) goto L68
                goto L78
            L68:
                int r7 = r4 + 1
                int r10 = r8 >>> 8
                r10 = r10 & 255(0xff, float:3.57E-43)
                byte r10 = (byte) r10
                r1[r4] = r10
                int r4 = r4 + r9
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L78:
                return r7
            L79:
                if (r4 == r0) goto L8a
                if (r5 != r3) goto L7e
                return r7
            L7e:
                int r12 = r4 - r5
                int r13 = 16 - r12
                java.lang.System.arraycopy(r1, r5, r1, r13, r12)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r2)
            L8a:
                java.net.InetAddress r12 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L8f
                return r12
            L8f:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: L6.a.b.d(java.lang.String, int, int):java.net.InetAddress");
        }

        private static String e(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (b(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private static String g(byte[] bArr) {
            int i8 = -1;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i10 < bArr.length) {
                int i12 = i10;
                while (i12 < 16 && bArr[i12] == 0 && bArr[i12 + 1] == 0) {
                    i12 += 2;
                }
                int i13 = i12 - i10;
                if (i13 > i11) {
                    i8 = i10;
                    i11 = i13;
                }
                i10 = i12 + 2;
            }
            c cVar = new c();
            while (i9 < bArr.length) {
                if (i9 == i8) {
                    cVar.writeByte(58);
                    i9 += i11;
                    if (i9 == 16) {
                        cVar.writeByte(58);
                    }
                } else {
                    if (i9 > 0) {
                        cVar.writeByte(58);
                    }
                    cVar.writeHexadecimalUnsignedLong(((bArr[i9] & 255) << 8) | (bArr[i9 + 1] & 255));
                    i9 += 2;
                }
            }
            return cVar.readUtf8();
        }

        public a build() {
            if (this.f3079a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f3080b != null) {
                return new a(this);
            }
            throw new IllegalStateException("host == null");
        }

        int f() {
            int i8 = this.f3081c;
            return i8 != -1 ? i8 : a.defaultPort(this.f3079a);
        }

        public b host(String str) {
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String strA = a(str, 0, str.length());
            if (strA != null) {
                this.f3080b = strA;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public b port(int i8) {
            if (i8 > 0 && i8 <= 65535) {
                this.f3081c = i8;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i8);
        }

        public b scheme(String str) {
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f3079a = "http";
            } else {
                if (!str.equalsIgnoreCase(Constants.SCHEME)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.f3079a = Constants.SCHEME;
            }
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3079a);
            sb.append("://");
            if (this.f3080b.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f3080b);
                sb.append(']');
            } else {
                sb.append(this.f3080b);
            }
            int iF = f();
            if (iF != a.defaultPort(this.f3079a)) {
                sb.append(':');
                sb.append(iF);
            }
            return sb.toString();
        }
    }

    static int a(char c9) {
        if (c9 >= '0' && c9 <= '9') {
            return c9 - '0';
        }
        if (c9 >= 'a' && c9 <= 'f') {
            return c9 - 'W';
        }
        if (c9 < 'A' || c9 > 'F') {
            return -1;
        }
        return c9 - '7';
    }

    static String b(String str, int i8, int i9, boolean z8) {
        for (int i10 = i8; i10 < i9; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%' || (cCharAt == '+' && z8)) {
                c cVar = new c();
                cVar.writeUtf8(str, i8, i10);
                c(cVar, str, i10, i9, z8);
                return cVar.readUtf8();
            }
        }
        return str.substring(i8, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void c(P7.c r5, java.lang.String r6, int r7, int r8, boolean r9) {
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
            int r2 = a(r2)
            char r3 = r6.charAt(r1)
            int r3 = a(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: L6.a.c(P7.c, java.lang.String, int, int, boolean):void");
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

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f3078d.equals(this.f3078d);
    }

    public int hashCode() {
        return this.f3078d.hashCode();
    }

    public String host() {
        return this.f3076b;
    }

    public boolean isHttps() {
        return this.f3075a.equals(Constants.SCHEME);
    }

    public b newBuilder() {
        b bVar = new b();
        String str = this.f3075a;
        bVar.f3079a = str;
        bVar.f3080b = this.f3076b;
        bVar.f3081c = this.f3077c != defaultPort(str) ? this.f3077c : -1;
        return bVar;
    }

    public int port() {
        return this.f3077c;
    }

    public String scheme() {
        return this.f3075a;
    }

    public String toString() {
        return this.f3078d;
    }

    private a(b bVar) {
        this.f3075a = bVar.f3079a;
        this.f3076b = bVar.f3080b;
        this.f3077c = bVar.f();
        this.f3078d = bVar.toString();
    }
}
