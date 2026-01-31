package D3;

import Q7.C;
import Q7.C0709m;
import Q7.C0712p;
import com.google.gson.internal.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Reader f910a;

    /* renamed from: i, reason: collision with root package name */
    private long f918i;

    /* renamed from: j, reason: collision with root package name */
    private int f919j;

    /* renamed from: k, reason: collision with root package name */
    private String f920k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f921l;

    /* renamed from: n, reason: collision with root package name */
    private String[] f923n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f924o;

    /* renamed from: b, reason: collision with root package name */
    private boolean f911b = false;

    /* renamed from: c, reason: collision with root package name */
    private final char[] f912c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    private int f913d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f914e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f915f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f916g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f917h = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f922m = 1;

    /* renamed from: D3.a$a, reason: collision with other inner class name */
    class C0019a extends e {
        C0019a() {
        }

        @Override // com.google.gson.internal.e
        public void promoteNameToValue(a aVar) throws IOException {
            if (aVar instanceof com.google.gson.internal.bind.b) {
                ((com.google.gson.internal.bind.b) aVar).promoteNameToValue();
                return;
            }
            int iC = aVar.f917h;
            if (iC == 0) {
                iC = aVar.c();
            }
            if (iC == 13) {
                aVar.f917h = 9;
                return;
            }
            if (iC == 12) {
                aVar.f917h = 8;
                return;
            }
            if (iC == 14) {
                aVar.f917h = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + aVar.peek() + aVar.g());
        }
    }

    static {
        e.INSTANCE = new C0019a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f921l = iArr;
        iArr[0] = 6;
        this.f923n = new String[32];
        this.f924o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f910a = reader;
    }

    private void a() throws IOException {
        if (!this.f911b) {
            throw s("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void b() throws IOException {
        h(true);
        int i8 = this.f913d;
        this.f913d = i8 - 1;
        if (i8 + 4 <= this.f914e || d(5)) {
            int i9 = this.f913d;
            char[] cArr = this.f912c;
            if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
                this.f913d = i9 + 5;
            }
        }
    }

    private boolean d(int i8) throws IOException {
        int i9;
        int i10;
        char[] cArr = this.f912c;
        int i11 = this.f916g;
        int i12 = this.f913d;
        this.f916g = i11 - i12;
        int i13 = this.f914e;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f914e = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f914e = 0;
        }
        this.f913d = 0;
        do {
            Reader reader = this.f910a;
            int i15 = this.f914e;
            int i16 = reader.read(cArr, i15, cArr.length - i15);
            if (i16 == -1) {
                return false;
            }
            i9 = this.f914e + i16;
            this.f914e = i9;
            if (this.f915f == 0 && (i10 = this.f916g) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.f913d++;
                this.f916g = i10 + 1;
                i8++;
            }
        } while (i9 < i8);
        return true;
    }

    private String e(boolean z8) {
        StringBuilder sb = new StringBuilder();
        sb.append(C.INNER_CLASS_SEPARATOR_CHAR);
        int i8 = 0;
        while (true) {
            int i9 = this.f922m;
            if (i8 >= i9) {
                return sb.toString();
            }
            int i10 = this.f921l[i8];
            if (i10 == 1 || i10 == 2) {
                int i11 = this.f924o[i8];
                if (z8 && i11 > 0 && i8 == i9 - 1) {
                    i11--;
                }
                sb.append('[');
                sb.append(i11);
                sb.append(']');
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                sb.append(C.PACKAGE_SEPARATOR_CHAR);
                String str = this.f923n[i8];
                if (str != null) {
                    sb.append(str);
                }
            }
            i8++;
        }
    }

    private boolean f(char c9) throws IOException {
        if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
            return false;
        }
        if (c9 != '#') {
            if (c9 == ',') {
                return false;
            }
            if (c9 != '/' && c9 != '=') {
                if (c9 == '{' || c9 == '}' || c9 == ':') {
                    return false;
                }
                if (c9 != ';') {
                    switch (c9) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        a();
        return false;
    }

    private int h(boolean z8) throws IOException {
        char[] cArr = this.f912c;
        int i8 = this.f913d;
        int i9 = this.f914e;
        while (true) {
            if (i8 == i9) {
                this.f913d = i8;
                if (!d(1)) {
                    if (!z8) {
                        return -1;
                    }
                    throw new EOFException("End of input" + g());
                }
                i8 = this.f913d;
                i9 = this.f914e;
            }
            int i10 = i8 + 1;
            char c9 = cArr[i8];
            if (c9 == '\n') {
                this.f915f++;
                this.f916g = i10;
            } else if (c9 != ' ' && c9 != '\r' && c9 != '\t') {
                if (c9 == '/') {
                    this.f913d = i10;
                    if (i10 == i9) {
                        this.f913d = i8;
                        boolean zD = d(2);
                        this.f913d++;
                        if (!zD) {
                            return c9;
                        }
                    }
                    a();
                    int i11 = this.f913d;
                    char c10 = cArr[i11];
                    if (c10 == '*') {
                        this.f913d = i11 + 1;
                        if (!p("*/")) {
                            throw s("Unterminated comment");
                        }
                        i8 = this.f913d + 2;
                        i9 = this.f914e;
                    } else {
                        if (c10 != '/') {
                            return c9;
                        }
                        this.f913d = i11 + 1;
                        q();
                        i8 = this.f913d;
                        i9 = this.f914e;
                    }
                } else {
                    if (c9 != '#') {
                        this.f913d = i10;
                        return c9;
                    }
                    this.f913d = i10;
                    a();
                    q();
                    i8 = this.f913d;
                    i9 = this.f914e;
                }
            }
            i8 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f913d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String i(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f912c
            r1 = 0
        L3:
            int r2 = r9.f913d
            int r3 = r9.f914e
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f913d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4d
            r9.f913d = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L3e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L3e:
            r1.append(r0, r3, r2)
            char r2 = r9.n()
            r1.append(r2)
            int r2 = r9.f913d
            int r3 = r9.f914e
            goto L7
        L4d:
            r5 = 10
            if (r2 != r5) goto L58
            int r2 = r9.f915f
            int r2 = r2 + r6
            r9.f915f = r2
            r9.f916g = r7
        L58:
            r2 = r7
            goto L9
        L5a:
            if (r1 != 0) goto L6a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f913d = r2
            boolean r2 = r9.d(r6)
            if (r2 == 0) goto L78
            goto L3
        L78:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.s(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.a.i(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        a();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String j() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f913d
            int r4 = r3 + r2
            int r5 = r6.f914e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f912c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.a()
            goto L5c
        L4e:
            char[] r3 = r6.f912c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.d(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f912c
            int r4 = r6.f913d
            r0.append(r3, r4, r2)
            int r3 = r6.f913d
            int r3 = r3 + r2
            r6.f913d = r3
            r2 = 1
            boolean r2 = r6.d(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f912c
            int r3 = r6.f913d
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f912c
            int r3 = r6.f913d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f913d
            int r2 = r2 + r1
            r6.f913d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.a.j():java.lang.String");
    }

    private int k() {
        String str;
        String str2;
        int i8;
        char c9 = this.f912c[this.f913d];
        if (c9 == 't' || c9 == 'T') {
            str = C0709m.TRUE;
            str2 = "TRUE";
            i8 = 5;
        } else if (c9 == 'f' || c9 == 'F') {
            str = C0709m.FALSE;
            str2 = "FALSE";
            i8 = 6;
        } else {
            if (c9 != 'n' && c9 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i8 = 7;
        }
        int length = str.length();
        for (int i9 = 1; i9 < length; i9++) {
            if (this.f913d + i9 >= this.f914e && !d(i9 + 1)) {
                return 0;
            }
            char c10 = this.f912c[this.f913d + i9];
            if (c10 != str.charAt(i9) && c10 != str2.charAt(i9)) {
                return 0;
            }
        }
        if ((this.f913d + length < this.f914e || d(length + 1)) && f(this.f912c[this.f913d + length])) {
            return 0;
        }
        this.f913d += length;
        this.f917h = i8;
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        if (f(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
    
        if (r13 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
    
        r18.f918i = r11;
        r18.f913d += r8;
        r18.f917h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b7, code lost:
    
        if (r9 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ba, code lost:
    
        if (r9 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
    
        if (r9 != 7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
    
        r18.f919j = r8;
        r18.f917h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int l() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.a.l():int");
    }

    private void m(int i8) {
        int i9 = this.f922m;
        int[] iArr = this.f921l;
        if (i9 == iArr.length) {
            int i10 = i9 * 2;
            this.f921l = Arrays.copyOf(iArr, i10);
            this.f924o = Arrays.copyOf(this.f924o, i10);
            this.f923n = (String[]) Arrays.copyOf(this.f923n, i10);
        }
        int[] iArr2 = this.f921l;
        int i11 = this.f922m;
        this.f922m = i11 + 1;
        iArr2[i11] = i8;
    }

    private char n() throws IOException {
        int i8;
        if (this.f913d == this.f914e && !d(1)) {
            throw s("Unterminated escape sequence");
        }
        char[] cArr = this.f912c;
        int i9 = this.f913d;
        int i10 = i9 + 1;
        this.f913d = i10;
        char c9 = cArr[i9];
        if (c9 == '\n') {
            this.f915f++;
            this.f916g = i10;
        } else if (c9 != '\"' && c9 != '\'' && c9 != '/' && c9 != '\\') {
            if (c9 == 'b') {
                return '\b';
            }
            if (c9 == 'f') {
                return '\f';
            }
            if (c9 == 'n') {
                return '\n';
            }
            if (c9 == 'r') {
                return C0712p.CR;
            }
            if (c9 == 't') {
                return '\t';
            }
            if (c9 != 'u') {
                throw s("Invalid escape sequence");
            }
            if (i9 + 5 > this.f914e && !d(4)) {
                throw s("Unterminated escape sequence");
            }
            int i11 = this.f913d;
            int i12 = i11 + 4;
            char c10 = 0;
            while (i11 < i12) {
                char c11 = this.f912c[i11];
                char c12 = (char) (c10 << 4);
                if (c11 >= '0' && c11 <= '9') {
                    i8 = c11 - '0';
                } else if (c11 >= 'a' && c11 <= 'f') {
                    i8 = c11 - 'W';
                } else {
                    if (c11 < 'A' || c11 > 'F') {
                        throw new NumberFormatException("\\u" + new String(this.f912c, this.f913d, 4));
                    }
                    i8 = c11 - '7';
                }
                c10 = (char) (c12 + i8);
                i11++;
            }
            this.f913d += 4;
            return c10;
        }
        return c9;
    }

    private void o(char c9) throws IOException {
        char[] cArr = this.f912c;
        do {
            int i8 = this.f913d;
            int i9 = this.f914e;
            while (i8 < i9) {
                int i10 = i8 + 1;
                char c10 = cArr[i8];
                if (c10 == c9) {
                    this.f913d = i10;
                    return;
                }
                if (c10 == '\\') {
                    this.f913d = i10;
                    n();
                    i8 = this.f913d;
                    i9 = this.f914e;
                } else {
                    if (c10 == '\n') {
                        this.f915f++;
                        this.f916g = i10;
                    }
                    i8 = i10;
                }
            }
            this.f913d = i8;
        } while (d(1));
        throw s("Unterminated string");
    }

    private boolean p(String str) {
        int length = str.length();
        while (true) {
            if (this.f913d + length > this.f914e && !d(length)) {
                return false;
            }
            char[] cArr = this.f912c;
            int i8 = this.f913d;
            if (cArr[i8] != '\n') {
                for (int i9 = 0; i9 < length; i9++) {
                    if (this.f912c[this.f913d + i9] != str.charAt(i9)) {
                        break;
                    }
                }
                return true;
            }
            this.f915f++;
            this.f916g = i8 + 1;
            this.f913d++;
        }
    }

    private void q() {
        char c9;
        do {
            if (this.f913d >= this.f914e && !d(1)) {
                return;
            }
            char[] cArr = this.f912c;
            int i8 = this.f913d;
            int i9 = i8 + 1;
            this.f913d = i9;
            c9 = cArr[i8];
            if (c9 == '\n') {
                this.f915f++;
                this.f916g = i9;
                return;
            }
        } while (c9 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f913d
            int r2 = r1 + r0
            int r3 = r4.f914e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f912c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.a()
        L4b:
            int r1 = r4.f913d
            int r1 = r1 + r0
            r4.f913d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f913d = r1
            r0 = 1
            boolean r0 = r4.d(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.a.r():void");
    }

    private IOException s(String str) throws d {
        throw new d(str + g());
    }

    public void beginArray() throws IOException {
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 3) {
            m(1);
            this.f924o[this.f922m - 1] = 0;
            this.f917h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + g());
        }
    }

    public void beginObject() throws IOException {
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 1) {
            m(3);
            this.f917h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + g());
        }
    }

    int c() throws IOException {
        int iH;
        int[] iArr = this.f921l;
        int i8 = this.f922m;
        int i9 = iArr[i8 - 1];
        if (i9 == 1) {
            iArr[i8 - 1] = 2;
        } else if (i9 == 2) {
            int iH2 = h(true);
            if (iH2 != 44) {
                if (iH2 != 59) {
                    if (iH2 != 93) {
                        throw s("Unterminated array");
                    }
                    this.f917h = 4;
                    return 4;
                }
                a();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8 - 1] = 4;
                if (i9 == 5 && (iH = h(true)) != 44) {
                    if (iH != 59) {
                        if (iH != 125) {
                            throw s("Unterminated object");
                        }
                        this.f917h = 2;
                        return 2;
                    }
                    a();
                }
                int iH3 = h(true);
                if (iH3 == 34) {
                    this.f917h = 13;
                    return 13;
                }
                if (iH3 == 39) {
                    a();
                    this.f917h = 12;
                    return 12;
                }
                if (iH3 == 125) {
                    if (i9 == 5) {
                        throw s("Expected name");
                    }
                    this.f917h = 2;
                    return 2;
                }
                a();
                this.f913d--;
                if (!f((char) iH3)) {
                    throw s("Expected name");
                }
                this.f917h = 14;
                return 14;
            }
            if (i9 == 4) {
                iArr[i8 - 1] = 5;
                int iH4 = h(true);
                if (iH4 != 58) {
                    if (iH4 != 61) {
                        throw s("Expected ':'");
                    }
                    a();
                    if (this.f913d < this.f914e || d(1)) {
                        char[] cArr = this.f912c;
                        int i10 = this.f913d;
                        if (cArr[i10] == '>') {
                            this.f913d = i10 + 1;
                        }
                    }
                }
            } else if (i9 == 6) {
                if (this.f911b) {
                    b();
                }
                this.f921l[this.f922m - 1] = 7;
            } else if (i9 == 7) {
                if (h(false) == -1) {
                    this.f917h = 17;
                    return 17;
                }
                a();
                this.f913d--;
            } else if (i9 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iH5 = h(true);
        if (iH5 == 34) {
            this.f917h = 9;
            return 9;
        }
        if (iH5 == 39) {
            a();
            this.f917h = 8;
            return 8;
        }
        if (iH5 != 44 && iH5 != 59) {
            if (iH5 == 91) {
                this.f917h = 3;
                return 3;
            }
            if (iH5 != 93) {
                if (iH5 == 123) {
                    this.f917h = 1;
                    return 1;
                }
                this.f913d--;
                int iK = k();
                if (iK != 0) {
                    return iK;
                }
                int iL = l();
                if (iL != 0) {
                    return iL;
                }
                if (!f(this.f912c[this.f913d])) {
                    throw s("Expected value");
                }
                a();
                this.f917h = 10;
                return 10;
            }
            if (i9 == 1) {
                this.f917h = 4;
                return 4;
            }
        }
        if (i9 != 1 && i9 != 2) {
            throw s("Unexpected value");
        }
        a();
        this.f913d--;
        this.f917h = 7;
        return 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f917h = 0;
        this.f921l[0] = 8;
        this.f922m = 1;
        this.f910a.close();
    }

    public void endArray() throws IOException {
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + g());
        }
        int i8 = this.f922m;
        this.f922m = i8 - 1;
        int[] iArr = this.f924o;
        int i9 = i8 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f917h = 0;
    }

    public void endObject() throws IOException {
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + g());
        }
        int i8 = this.f922m;
        int i9 = i8 - 1;
        this.f922m = i9;
        this.f923n[i9] = null;
        int[] iArr = this.f924o;
        int i10 = i8 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f917h = 0;
    }

    String g() {
        return " at line " + (this.f915f + 1) + " column " + ((this.f913d - this.f916g) + 1) + " path " + getPath();
    }

    public String getPath() {
        return e(false);
    }

    public String getPreviousPath() {
        return e(true);
    }

    public boolean hasNext() throws IOException {
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        return (iC == 2 || iC == 4 || iC == 17) ? false : true;
    }

    public final boolean isLenient() {
        return this.f911b;
    }

    public boolean nextBoolean() throws IOException {
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 5) {
            this.f917h = 0;
            int[] iArr = this.f924o;
            int i8 = this.f922m - 1;
            iArr[i8] = iArr[i8] + 1;
            return true;
        }
        if (iC == 6) {
            this.f917h = 0;
            int[] iArr2 = this.f924o;
            int i9 = this.f922m - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + g());
    }

    public double nextDouble() throws IOException, NumberFormatException {
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            this.f917h = 0;
            int[] iArr = this.f924o;
            int i8 = this.f922m - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f918i;
        }
        if (iC == 16) {
            this.f920k = new String(this.f912c, this.f913d, this.f919j);
            this.f913d += this.f919j;
        } else if (iC == 8 || iC == 9) {
            this.f920k = i(iC == 8 ? '\'' : '\"');
        } else if (iC == 10) {
            this.f920k = j();
        } else if (iC != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + g());
        }
        this.f917h = 11;
        double d9 = Double.parseDouble(this.f920k);
        if (!this.f911b && (Double.isNaN(d9) || Double.isInfinite(d9))) {
            throw new d("JSON forbids NaN and infinities: " + d9 + g());
        }
        this.f920k = null;
        this.f917h = 0;
        int[] iArr2 = this.f924o;
        int i9 = this.f922m - 1;
        iArr2[i9] = iArr2[i9] + 1;
        return d9;
    }

    public int nextInt() throws IOException, NumberFormatException {
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            long j8 = this.f918i;
            int i8 = (int) j8;
            if (j8 == i8) {
                this.f917h = 0;
                int[] iArr = this.f924o;
                int i9 = this.f922m - 1;
                iArr[i9] = iArr[i9] + 1;
                return i8;
            }
            throw new NumberFormatException("Expected an int but was " + this.f918i + g());
        }
        if (iC == 16) {
            this.f920k = new String(this.f912c, this.f913d, this.f919j);
            this.f913d += this.f919j;
        } else {
            if (iC != 8 && iC != 9 && iC != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + g());
            }
            if (iC == 10) {
                this.f920k = j();
            } else {
                this.f920k = i(iC == 8 ? '\'' : '\"');
            }
            try {
                int i10 = Integer.parseInt(this.f920k);
                this.f917h = 0;
                int[] iArr2 = this.f924o;
                int i11 = this.f922m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return i10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f917h = 11;
        double d9 = Double.parseDouble(this.f920k);
        int i12 = (int) d9;
        if (i12 != d9) {
            throw new NumberFormatException("Expected an int but was " + this.f920k + g());
        }
        this.f920k = null;
        this.f917h = 0;
        int[] iArr3 = this.f924o;
        int i13 = this.f922m - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return i12;
    }

    public long nextLong() throws IOException, NumberFormatException {
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            this.f917h = 0;
            int[] iArr = this.f924o;
            int i8 = this.f922m - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f918i;
        }
        if (iC == 16) {
            this.f920k = new String(this.f912c, this.f913d, this.f919j);
            this.f913d += this.f919j;
        } else {
            if (iC != 8 && iC != 9 && iC != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + g());
            }
            if (iC == 10) {
                this.f920k = j();
            } else {
                this.f920k = i(iC == 8 ? '\'' : '\"');
            }
            try {
                long j8 = Long.parseLong(this.f920k);
                this.f917h = 0;
                int[] iArr2 = this.f924o;
                int i9 = this.f922m - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return j8;
            } catch (NumberFormatException unused) {
            }
        }
        this.f917h = 11;
        double d9 = Double.parseDouble(this.f920k);
        long j9 = (long) d9;
        if (j9 != d9) {
            throw new NumberFormatException("Expected a long but was " + this.f920k + g());
        }
        this.f920k = null;
        this.f917h = 0;
        int[] iArr3 = this.f924o;
        int i10 = this.f922m - 1;
        iArr3[i10] = iArr3[i10] + 1;
        return j9;
    }

    public String nextName() throws IOException {
        String strI;
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 14) {
            strI = j();
        } else if (iC == 12) {
            strI = i('\'');
        } else {
            if (iC != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + g());
            }
            strI = i('\"');
        }
        this.f917h = 0;
        this.f923n[this.f922m - 1] = strI;
        return strI;
    }

    public void nextNull() throws IOException {
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 7) {
            this.f917h = 0;
            int[] iArr = this.f924o;
            int i8 = this.f922m - 1;
            iArr[i8] = iArr[i8] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + g());
    }

    public String nextString() throws IOException {
        String str;
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 10) {
            str = j();
        } else if (iC == 8) {
            str = i('\'');
        } else if (iC == 9) {
            str = i('\"');
        } else if (iC == 11) {
            str = this.f920k;
            this.f920k = null;
        } else if (iC == 15) {
            str = Long.toString(this.f918i);
        } else {
            if (iC != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + g());
            }
            str = new String(this.f912c, this.f913d, this.f919j);
            this.f913d += this.f919j;
        }
        this.f917h = 0;
        int[] iArr = this.f924o;
        int i8 = this.f922m - 1;
        iArr[i8] = iArr[i8] + 1;
        return str;
    }

    public b peek() throws IOException {
        int iC = this.f917h;
        if (iC == 0) {
            iC = c();
        }
        switch (iC) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void setLenient(boolean z8) {
        this.f911b = z8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() throws IOException {
        int i8 = 0;
        do {
            int iC = this.f917h;
            if (iC == 0) {
                iC = c();
            }
            switch (iC) {
                case 1:
                    m(3);
                    i8++;
                    this.f917h = 0;
                    break;
                case 2:
                    if (i8 == 0) {
                        this.f923n[this.f922m - 1] = null;
                    }
                    this.f922m--;
                    i8--;
                    this.f917h = 0;
                    break;
                case 3:
                    m(1);
                    i8++;
                    this.f917h = 0;
                    break;
                case 4:
                    this.f922m--;
                    i8--;
                    this.f917h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f917h = 0;
                    break;
                case 8:
                    o('\'');
                    this.f917h = 0;
                    break;
                case 9:
                    o('\"');
                    this.f917h = 0;
                    break;
                case 10:
                    r();
                    this.f917h = 0;
                    break;
                case 12:
                    o('\'');
                    if (i8 == 0) {
                        this.f923n[this.f922m - 1] = "<skipped>";
                    }
                    this.f917h = 0;
                    break;
                case 13:
                    o('\"');
                    if (i8 == 0) {
                        this.f923n[this.f922m - 1] = "<skipped>";
                    }
                    this.f917h = 0;
                    break;
                case 14:
                    r();
                    if (i8 == 0) {
                        this.f923n[this.f922m - 1] = "<skipped>";
                    }
                    this.f917h = 0;
                    break;
                case 16:
                    this.f913d += this.f919j;
                    this.f917h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i8 > 0);
        int[] iArr = this.f924o;
        int i9 = this.f922m - 1;
        iArr[i9] = iArr[i9] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + g();
    }
}
