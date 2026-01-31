package J6;

import javax.security.auth.x500.X500Principal;
import s7.x;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f2640a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2641b;

    /* renamed from: c, reason: collision with root package name */
    private int f2642c;

    /* renamed from: d, reason: collision with root package name */
    private int f2643d;

    /* renamed from: e, reason: collision with root package name */
    private int f2644e;

    /* renamed from: f, reason: collision with root package name */
    private int f2645f;

    /* renamed from: g, reason: collision with root package name */
    private char[] f2646g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f2640a = name;
        this.f2641b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r2 = r8.f2643d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        return new java.lang.String(r1, r2, r8.f2644e - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a() {
        /*
            r8 = this;
            int r0 = r8.f2642c
            r8.f2643d = r0
            r8.f2644e = r0
        L6:
            int r0 = r8.f2642c
            int r1 = r8.f2641b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f2646g
            int r2 = r8.f2643d
            int r3 = r8.f2644e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f2646g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.f2644e
            int r4 = r3 + 1
            r8.f2644e = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.f2642c = r0
            goto L6
        L3e:
            int r0 = r8.f2644e
            int r2 = r0 + 1
            r8.f2644e = r2
            char r2 = r8.c()
            r1[r0] = r2
            int r0 = r8.f2642c
            int r0 = r0 + 1
            r8.f2642c = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f2643d
            int r3 = r8.f2644e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.f2644e
            r8.f2645f = r2
            int r0 = r0 + 1
            r8.f2642c = r0
            int r0 = r2 + 1
            r8.f2644e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.f2642c
            int r1 = r8.f2641b
            if (r0 >= r1) goto L83
            char[] r2 = r8.f2646g
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.f2644e
            int r7 = r1 + 1
            r8.f2644e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f2642c = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.f2646g
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f2646g
            int r2 = r8.f2643d
            int r3 = r8.f2645f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J6.d.a():java.lang.String");
    }

    private int b(int i8) {
        int i9;
        int i10;
        int i11 = i8 + 1;
        if (i11 >= this.f2641b) {
            throw new IllegalStateException("Malformed DN: " + this.f2640a);
        }
        char[] cArr = this.f2646g;
        char c9 = cArr[i8];
        if (c9 >= '0' && c9 <= '9') {
            i9 = c9 - '0';
        } else if (c9 >= 'a' && c9 <= 'f') {
            i9 = c9 - 'W';
        } else {
            if (c9 < 'A' || c9 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f2640a);
            }
            i9 = c9 - '7';
        }
        char c10 = cArr[i11];
        if (c10 >= '0' && c10 <= '9') {
            i10 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i10 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f2640a);
            }
            i10 = c10 - '7';
        }
        return (i9 << 4) + i10;
    }

    private char c() {
        int i8 = this.f2642c + 1;
        this.f2642c = i8;
        if (i8 == this.f2641b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f2640a);
        }
        char c9 = this.f2646g[i8];
        if (c9 == ' ' || c9 == '%' || c9 == '\\' || c9 == '_' || c9 == '\"' || c9 == '#') {
            return c9;
        }
        switch (c9) {
            case '*':
            case '+':
            case ',':
                return c9;
            default:
                switch (c9) {
                    case ';':
                    case x.FROZEN_SHIFT /* 60 */:
                    case x.CLOSED_SHIFT /* 61 */:
                    case '>':
                        return c9;
                    default:
                        return d();
                }
        }
    }

    private char d() {
        int i8;
        int i9;
        int iB = b(this.f2642c);
        this.f2642c++;
        if (iB < 128) {
            return (char) iB;
        }
        if (iB < 192 || iB > 247) {
            return '?';
        }
        if (iB <= 223) {
            i8 = iB & 31;
            i9 = 1;
        } else if (iB <= 239) {
            i8 = iB & 15;
            i9 = 2;
        } else {
            i8 = iB & 7;
            i9 = 3;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.f2642c;
            int i12 = i11 + 1;
            this.f2642c = i12;
            if (i12 == this.f2641b || this.f2646g[i12] != '\\') {
                return '?';
            }
            int i13 = i11 + 2;
            this.f2642c = i13;
            int iB2 = b(i13);
            this.f2642c++;
            if ((iB2 & 192) != 128) {
                return '?';
            }
            i8 = (i8 << 6) + (iB2 & 63);
        }
        return (char) i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        r6.f2644e = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String e() {
        /*
            r6 = this;
            int r0 = r6.f2642c
            int r1 = r0 + 4
            int r2 = r6.f2641b
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L98
            r6.f2643d = r0
            int r0 = r0 + 1
            r6.f2642c = r0
        L10:
            int r0 = r6.f2642c
            int r1 = r6.f2641b
            if (r0 == r1) goto L54
            char[] r1 = r6.f2646g
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L54
            r4 = 44
            if (r2 == r4) goto L54
            r4 = 59
            if (r2 != r4) goto L27
            goto L54
        L27:
            r4 = 32
            if (r2 != r4) goto L42
            r6.f2644e = r0
            int r0 = r0 + 1
            r6.f2642c = r0
        L31:
            int r0 = r6.f2642c
            int r1 = r6.f2641b
            if (r0 >= r1) goto L56
            char[] r1 = r6.f2646g
            char r1 = r1[r0]
            if (r1 != r4) goto L56
            int r0 = r0 + 1
            r6.f2642c = r0
            goto L31
        L42:
            r4 = 65
            if (r2 < r4) goto L4f
            r4 = 70
            if (r2 > r4) goto L4f
            int r2 = r2 + 32
            char r2 = (char) r2
            r1[r0] = r2
        L4f:
            int r0 = r0 + 1
            r6.f2642c = r0
            goto L10
        L54:
            r6.f2644e = r0
        L56:
            int r0 = r6.f2644e
            int r1 = r6.f2643d
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L81
            r2 = r0 & 1
            if (r2 == 0) goto L81
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            int r1 = r1 + 1
            r4 = 0
        L69:
            if (r4 >= r2) goto L77
            int r5 = r6.b(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L69
        L77:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f2646g
            int r3 = r6.f2643d
            r1.<init>(r2, r3, r0)
            return r1
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f2640a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L98:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f2640a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J6.d.e():java.lang.String");
    }

    private String f() {
        int i8;
        int i9;
        int i10;
        int i11;
        char c9;
        int i12;
        int i13;
        char c10;
        char c11;
        while (true) {
            i8 = this.f2642c;
            i9 = this.f2641b;
            if (i8 >= i9 || this.f2646g[i8] != ' ') {
                break;
            }
            this.f2642c = i8 + 1;
        }
        if (i8 == i9) {
            return null;
        }
        this.f2643d = i8;
        this.f2642c = i8 + 1;
        while (true) {
            i10 = this.f2642c;
            i11 = this.f2641b;
            if (i10 >= i11 || (c11 = this.f2646g[i10]) == '=' || c11 == ' ') {
                break;
            }
            this.f2642c = i10 + 1;
        }
        if (i10 >= i11) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f2640a);
        }
        this.f2644e = i10;
        if (this.f2646g[i10] == ' ') {
            while (true) {
                i12 = this.f2642c;
                i13 = this.f2641b;
                if (i12 >= i13 || (c10 = this.f2646g[i12]) == '=' || c10 != ' ') {
                    break;
                }
                this.f2642c = i12 + 1;
            }
            if (this.f2646g[i12] != '=' || i12 == i13) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f2640a);
            }
        }
        this.f2642c++;
        while (true) {
            int i14 = this.f2642c;
            if (i14 >= this.f2641b || this.f2646g[i14] != ' ') {
                break;
            }
            this.f2642c = i14 + 1;
        }
        int i15 = this.f2644e;
        int i16 = this.f2643d;
        if (i15 - i16 > 4) {
            char[] cArr = this.f2646g;
            if (cArr[i16 + 3] == '.' && (((c9 = cArr[i16]) == 'O' || c9 == 'o') && ((cArr[i16 + 1] == 'I' || cArr[i16 + 1] == 'i') && (cArr[i16 + 2] == 'D' || cArr[i16 + 2] == 'd')))) {
                this.f2643d = i16 + 4;
            }
        }
        char[] cArr2 = this.f2646g;
        int i17 = this.f2643d;
        return new String(cArr2, i17, i15 - i17);
    }

    private String g() {
        int i8 = this.f2642c + 1;
        this.f2642c = i8;
        this.f2643d = i8;
        this.f2644e = i8;
        while (true) {
            int i9 = this.f2642c;
            if (i9 == this.f2641b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f2640a);
            }
            char[] cArr = this.f2646g;
            char c9 = cArr[i9];
            if (c9 == '\"') {
                this.f2642c = i9 + 1;
                while (true) {
                    int i10 = this.f2642c;
                    if (i10 >= this.f2641b || this.f2646g[i10] != ' ') {
                        break;
                    }
                    this.f2642c = i10 + 1;
                }
                char[] cArr2 = this.f2646g;
                int i11 = this.f2643d;
                return new String(cArr2, i11, this.f2644e - i11);
            }
            if (c9 == '\\') {
                cArr[this.f2644e] = c();
            } else {
                cArr[this.f2644e] = c9;
            }
            this.f2642c++;
            this.f2644e++;
        }
    }

    public String findMostSpecific(String str) {
        this.f2642c = 0;
        this.f2643d = 0;
        this.f2644e = 0;
        this.f2645f = 0;
        this.f2646g = this.f2640a.toCharArray();
        String strF = f();
        if (strF == null) {
            return null;
        }
        do {
            int i8 = this.f2642c;
            if (i8 == this.f2641b) {
                return null;
            }
            char c9 = this.f2646g[i8];
            String strA = c9 != '\"' ? c9 != '#' ? (c9 == '+' || c9 == ',' || c9 == ';') ? "" : a() : e() : g();
            if (str.equalsIgnoreCase(strF)) {
                return strA;
            }
            int i9 = this.f2642c;
            if (i9 >= this.f2641b) {
                return null;
            }
            char c10 = this.f2646g[i9];
            if (c10 != ',' && c10 != ';' && c10 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f2640a);
            }
            this.f2642c = i9 + 1;
            strF = f();
        } while (strF != null);
        throw new IllegalStateException("Malformed DN: " + this.f2640a);
    }
}
