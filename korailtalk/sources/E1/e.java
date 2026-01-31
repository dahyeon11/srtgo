package e1;

import P7.f;
import Q7.C0709m;
import Q7.C0712p;
import e1.AbstractC5342c;
import java.io.EOFException;

/* loaded from: classes.dex */
final class e extends AbstractC5342c {

    /* renamed from: n, reason: collision with root package name */
    private static final f f30230n = f.encodeUtf8("'\\");

    /* renamed from: o, reason: collision with root package name */
    private static final f f30231o = f.encodeUtf8("\"\\");

    /* renamed from: p, reason: collision with root package name */
    private static final f f30232p = f.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q, reason: collision with root package name */
    private static final f f30233q = f.encodeUtf8("\n\r");

    /* renamed from: r, reason: collision with root package name */
    private static final f f30234r = f.encodeUtf8("*/");

    /* renamed from: h, reason: collision with root package name */
    private final P7.e f30235h;

    /* renamed from: i, reason: collision with root package name */
    private final P7.c f30236i;

    /* renamed from: j, reason: collision with root package name */
    private int f30237j = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f30238k;

    /* renamed from: l, reason: collision with root package name */
    private int f30239l;

    /* renamed from: m, reason: collision with root package name */
    private String f30240m;

    e(P7.e eVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f30235h = eVar;
        this.f30236i = eVar.buffer();
        b(6);
    }

    private void e() throws C5341b {
        if (!this.f30225e) {
            throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int f() throws EOFException, C5341b {
        int[] iArr = this.f30222b;
        int i8 = this.f30221a;
        int i9 = iArr[i8 - 1];
        if (i9 == 1) {
            iArr[i8 - 1] = 2;
        } else if (i9 == 2) {
            int i10 = i(true);
            this.f30236i.readByte();
            if (i10 != 44) {
                if (i10 != 59) {
                    if (i10 != 93) {
                        throw d("Unterminated array");
                    }
                    this.f30237j = 4;
                    return 4;
                }
                e();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8 - 1] = 4;
                if (i9 == 5) {
                    int i11 = i(true);
                    this.f30236i.readByte();
                    if (i11 != 44) {
                        if (i11 != 59) {
                            if (i11 != 125) {
                                throw d("Unterminated object");
                            }
                            this.f30237j = 2;
                            return 2;
                        }
                        e();
                    }
                }
                int i12 = i(true);
                if (i12 == 34) {
                    this.f30236i.readByte();
                    this.f30237j = 13;
                    return 13;
                }
                if (i12 == 39) {
                    this.f30236i.readByte();
                    e();
                    this.f30237j = 12;
                    return 12;
                }
                if (i12 != 125) {
                    e();
                    if (!h((char) i12)) {
                        throw d("Expected name");
                    }
                    this.f30237j = 14;
                    return 14;
                }
                if (i9 == 5) {
                    throw d("Expected name");
                }
                this.f30236i.readByte();
                this.f30237j = 2;
                return 2;
            }
            if (i9 == 4) {
                iArr[i8 - 1] = 5;
                int i13 = i(true);
                this.f30236i.readByte();
                if (i13 != 58) {
                    if (i13 != 61) {
                        throw d("Expected ':'");
                    }
                    e();
                    if (this.f30235h.request(1L) && this.f30236i.getByte(0L) == 62) {
                        this.f30236i.readByte();
                    }
                }
            } else if (i9 == 6) {
                iArr[i8 - 1] = 7;
            } else if (i9 == 7) {
                if (i(false) == -1) {
                    this.f30237j = 18;
                    return 18;
                }
                e();
            } else if (i9 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int i14 = i(true);
        if (i14 == 34) {
            this.f30236i.readByte();
            this.f30237j = 9;
            return 9;
        }
        if (i14 == 39) {
            e();
            this.f30236i.readByte();
            this.f30237j = 8;
            return 8;
        }
        if (i14 != 44 && i14 != 59) {
            if (i14 == 91) {
                this.f30236i.readByte();
                this.f30237j = 3;
                return 3;
            }
            if (i14 != 93) {
                if (i14 == 123) {
                    this.f30236i.readByte();
                    this.f30237j = 1;
                    return 1;
                }
                int iL = l();
                if (iL != 0) {
                    return iL;
                }
                int iM = m();
                if (iM != 0) {
                    return iM;
                }
                if (!h(this.f30236i.getByte(0L))) {
                    throw d("Expected value");
                }
                e();
                this.f30237j = 10;
                return 10;
            }
            if (i9 == 1) {
                this.f30236i.readByte();
                this.f30237j = 4;
                return 4;
            }
        }
        if (i9 != 1 && i9 != 2) {
            throw d("Unexpected value");
        }
        e();
        this.f30237j = 7;
        return 7;
    }

    private int g(String str, AbstractC5342c.a aVar) {
        int length = aVar.f30227a.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(aVar.f30227a[i8])) {
                this.f30237j = 0;
                this.f30223c[this.f30221a - 1] = str;
                return i8;
            }
        }
        return -1;
    }

    private boolean h(int i8) throws C5341b {
        if (i8 == 9 || i8 == 10 || i8 == 12 || i8 == 13 || i8 == 32) {
            return false;
        }
        if (i8 != 35) {
            if (i8 == 44) {
                return false;
            }
            if (i8 != 47 && i8 != 61) {
                if (i8 == 123 || i8 == 125 || i8 == 58) {
                    return false;
                }
                if (i8 != 59) {
                    switch (i8) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f30236i.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.f30235h.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        e();
        r3 = r6.f30236i.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6.f30236i.readByte();
        r6.f30236i.readByte();
        q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r6.f30236i.readByte();
        r6.f30236i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (p() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw d("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        e();
        q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int i(boolean r7) throws java.io.EOFException, e1.C5341b {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            P7.e r2 = r6.f30235h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L80
            P7.c r2 = r6.f30236i
            long r4 = (long) r1
            byte r2 = r2.getByte(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            P7.c r3 = r6.f30236i
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            P7.e r3 = r6.f30235h
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.e()
            P7.c r3 = r6.f30236i
            r4 = 1
            byte r3 = r3.getByte(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            P7.c r1 = r6.f30236i
            r1.readByte()
            P7.c r1 = r6.f30236i
            r1.readByte()
            r6.q()
            goto L1
        L5a:
            P7.c r1 = r6.f30236i
            r1.readByte()
            P7.c r1 = r6.f30236i
            r1.readByte()
            boolean r1 = r6.p()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            e1.b r7 = r6.d(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.e()
            r6.q()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.e.i(boolean):int");
    }

    private String j(f fVar) throws C5341b {
        StringBuilder sb = null;
        while (true) {
            long jIndexOfElement = this.f30235h.indexOfElement(fVar);
            if (jIndexOfElement == -1) {
                throw d("Unterminated string");
            }
            if (this.f30236i.getByte(jIndexOfElement) != 92) {
                if (sb == null) {
                    String utf8 = this.f30236i.readUtf8(jIndexOfElement);
                    this.f30236i.readByte();
                    return utf8;
                }
                sb.append(this.f30236i.readUtf8(jIndexOfElement));
                this.f30236i.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f30236i.readUtf8(jIndexOfElement));
            this.f30236i.readByte();
            sb.append(n());
        }
    }

    private String k() {
        long jIndexOfElement = this.f30235h.indexOfElement(f30232p);
        return jIndexOfElement != -1 ? this.f30236i.readUtf8(jIndexOfElement) : this.f30236i.readUtf8();
    }

    private int l() throws EOFException {
        String str;
        String str2;
        int i8;
        byte b9 = this.f30236i.getByte(0L);
        if (b9 == 116 || b9 == 84) {
            str = C0709m.TRUE;
            str2 = "TRUE";
            i8 = 5;
        } else if (b9 == 102 || b9 == 70) {
            str = C0709m.FALSE;
            str2 = "FALSE";
            i8 = 6;
        } else {
            if (b9 != 110 && b9 != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i8 = 7;
        }
        int length = str.length();
        int i9 = 1;
        while (i9 < length) {
            int i10 = i9 + 1;
            if (!this.f30235h.request(i10)) {
                return 0;
            }
            byte b10 = this.f30236i.getByte(i9);
            if (b10 != str.charAt(i9) && b10 != str2.charAt(i9)) {
                return 0;
            }
            i9 = i10;
        }
        if (this.f30235h.request(length + 1) && h(this.f30236i.getByte(length))) {
            return 0;
        }
        this.f30236i.skip(length);
        this.f30237j = i8;
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        if (h(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        r16.f30238k = r8;
        r16.f30236i.skip(r5);
        r16.f30237j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
    
        r16.f30239l = r5;
        r16.f30237j = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.e.m():int");
    }

    private char n() throws EOFException, C5341b {
        int i8;
        if (!this.f30235h.request(1L)) {
            throw d("Unterminated escape sequence");
        }
        byte b9 = this.f30236i.readByte();
        if (b9 == 10 || b9 == 34 || b9 == 39 || b9 == 47 || b9 == 92) {
            return (char) b9;
        }
        if (b9 == 98) {
            return '\b';
        }
        if (b9 == 102) {
            return '\f';
        }
        if (b9 == 110) {
            return '\n';
        }
        if (b9 == 114) {
            return C0712p.CR;
        }
        if (b9 == 116) {
            return '\t';
        }
        if (b9 != 117) {
            if (this.f30225e) {
                return (char) b9;
            }
            throw d("Invalid escape sequence: \\" + ((char) b9));
        }
        if (!this.f30235h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c9 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            byte b10 = this.f30236i.getByte(i9);
            char c10 = (char) (c9 << 4);
            if (b10 >= 48 && b10 <= 57) {
                i8 = b10 - 48;
            } else if (b10 >= 97 && b10 <= 102) {
                i8 = b10 - 87;
            } else {
                if (b10 < 65 || b10 > 70) {
                    throw d("\\u" + this.f30236i.readUtf8(4L));
                }
                i8 = b10 - 55;
            }
            c9 = (char) (c10 + i8);
        }
        this.f30236i.skip(4L);
        return c9;
    }

    private void o(f fVar) throws EOFException, C5341b {
        while (true) {
            long jIndexOfElement = this.f30235h.indexOfElement(fVar);
            if (jIndexOfElement == -1) {
                throw d("Unterminated string");
            }
            if (this.f30236i.getByte(jIndexOfElement) != 92) {
                this.f30236i.skip(jIndexOfElement + 1);
                return;
            } else {
                this.f30236i.skip(jIndexOfElement + 1);
                n();
            }
        }
    }

    private boolean p() throws EOFException {
        long jIndexOf = this.f30235h.indexOf(f30234r);
        boolean z8 = jIndexOf != -1;
        P7.c cVar = this.f30236i;
        cVar.skip(z8 ? jIndexOf + r1.size() : cVar.size());
        return z8;
    }

    private void q() throws EOFException {
        long jIndexOfElement = this.f30235h.indexOfElement(f30233q);
        P7.c cVar = this.f30236i;
        cVar.skip(jIndexOfElement != -1 ? jIndexOfElement + 1 : cVar.size());
    }

    private void r() throws EOFException {
        long jIndexOfElement = this.f30235h.indexOfElement(f30232p);
        P7.c cVar = this.f30236i;
        if (jIndexOfElement == -1) {
            jIndexOfElement = cVar.size();
        }
        cVar.skip(jIndexOfElement);
    }

    @Override // e1.AbstractC5342c
    public void beginArray() throws EOFException, C5341b {
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 3) {
            b(1);
            this.f30224d[this.f30221a - 1] = 0;
            this.f30237j = 0;
        } else {
            throw new C5340a("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // e1.AbstractC5342c
    public void beginObject() throws EOFException, C5341b {
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 1) {
            b(3);
            this.f30237j = 0;
            return;
        }
        throw new C5340a("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30237j = 0;
        this.f30222b[0] = 8;
        this.f30221a = 1;
        this.f30236i.clear();
        this.f30235h.close();
    }

    @Override // e1.AbstractC5342c
    public void endArray() throws EOFException, C5341b {
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 4) {
            throw new C5340a("Expected END_ARRAY but was " + peek() + " at path " + getPath());
        }
        int i8 = this.f30221a;
        this.f30221a = i8 - 1;
        int[] iArr = this.f30224d;
        int i9 = i8 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f30237j = 0;
    }

    @Override // e1.AbstractC5342c
    public void endObject() throws EOFException, C5341b {
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 2) {
            throw new C5340a("Expected END_OBJECT but was " + peek() + " at path " + getPath());
        }
        int i8 = this.f30221a;
        int i9 = i8 - 1;
        this.f30221a = i9;
        this.f30223c[i9] = null;
        int[] iArr = this.f30224d;
        int i10 = i8 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f30237j = 0;
    }

    @Override // e1.AbstractC5342c
    public boolean hasNext() throws EOFException, C5341b {
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        return (iF == 2 || iF == 4 || iF == 18) ? false : true;
    }

    @Override // e1.AbstractC5342c
    public boolean nextBoolean() throws EOFException, C5341b {
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 5) {
            this.f30237j = 0;
            int[] iArr = this.f30224d;
            int i8 = this.f30221a - 1;
            iArr[i8] = iArr[i8] + 1;
            return true;
        }
        if (iF == 6) {
            this.f30237j = 0;
            int[] iArr2 = this.f30224d;
            int i9 = this.f30221a - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return false;
        }
        throw new C5340a("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // e1.AbstractC5342c
    public double nextDouble() throws NumberFormatException, EOFException, C5341b {
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 16) {
            this.f30237j = 0;
            int[] iArr = this.f30224d;
            int i8 = this.f30221a - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f30238k;
        }
        if (iF == 17) {
            this.f30240m = this.f30236i.readUtf8(this.f30239l);
        } else if (iF == 9) {
            this.f30240m = j(f30231o);
        } else if (iF == 8) {
            this.f30240m = j(f30230n);
        } else if (iF == 10) {
            this.f30240m = k();
        } else if (iF != 11) {
            throw new C5340a("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.f30237j = 11;
        try {
            double d9 = Double.parseDouble(this.f30240m);
            if (this.f30225e || !(Double.isNaN(d9) || Double.isInfinite(d9))) {
                this.f30240m = null;
                this.f30237j = 0;
                int[] iArr2 = this.f30224d;
                int i9 = this.f30221a - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return d9;
            }
            throw new C5341b("JSON forbids NaN and infinities: " + d9 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new C5340a("Expected a double but was " + this.f30240m + " at path " + getPath());
        }
    }

    @Override // e1.AbstractC5342c
    public int nextInt() throws NumberFormatException, EOFException, C5341b {
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 16) {
            long j8 = this.f30238k;
            int i8 = (int) j8;
            if (j8 == i8) {
                this.f30237j = 0;
                int[] iArr = this.f30224d;
                int i9 = this.f30221a - 1;
                iArr[i9] = iArr[i9] + 1;
                return i8;
            }
            throw new C5340a("Expected an int but was " + this.f30238k + " at path " + getPath());
        }
        if (iF == 17) {
            this.f30240m = this.f30236i.readUtf8(this.f30239l);
        } else if (iF == 9 || iF == 8) {
            String strJ = iF == 9 ? j(f30231o) : j(f30230n);
            this.f30240m = strJ;
            try {
                int i10 = Integer.parseInt(strJ);
                this.f30237j = 0;
                int[] iArr2 = this.f30224d;
                int i11 = this.f30221a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return i10;
            } catch (NumberFormatException unused) {
            }
        } else if (iF != 11) {
            throw new C5340a("Expected an int but was " + peek() + " at path " + getPath());
        }
        this.f30237j = 11;
        try {
            double d9 = Double.parseDouble(this.f30240m);
            int i12 = (int) d9;
            if (i12 == d9) {
                this.f30240m = null;
                this.f30237j = 0;
                int[] iArr3 = this.f30224d;
                int i13 = this.f30221a - 1;
                iArr3[i13] = iArr3[i13] + 1;
                return i12;
            }
            throw new C5340a("Expected an int but was " + this.f30240m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new C5340a("Expected an int but was " + this.f30240m + " at path " + getPath());
        }
    }

    @Override // e1.AbstractC5342c
    public String nextName() throws EOFException, C5341b {
        String strJ;
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 14) {
            strJ = k();
        } else if (iF == 13) {
            strJ = j(f30231o);
        } else if (iF == 12) {
            strJ = j(f30230n);
        } else {
            if (iF != 15) {
                throw new C5340a("Expected a name but was " + peek() + " at path " + getPath());
            }
            strJ = this.f30240m;
        }
        this.f30237j = 0;
        this.f30223c[this.f30221a - 1] = strJ;
        return strJ;
    }

    @Override // e1.AbstractC5342c
    public String nextString() throws EOFException, C5341b {
        String utf8;
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 10) {
            utf8 = k();
        } else if (iF == 9) {
            utf8 = j(f30231o);
        } else if (iF == 8) {
            utf8 = j(f30230n);
        } else if (iF == 11) {
            utf8 = this.f30240m;
            this.f30240m = null;
        } else if (iF == 16) {
            utf8 = Long.toString(this.f30238k);
        } else {
            if (iF != 17) {
                throw new C5340a("Expected a string but was " + peek() + " at path " + getPath());
            }
            utf8 = this.f30236i.readUtf8(this.f30239l);
        }
        this.f30237j = 0;
        int[] iArr = this.f30224d;
        int i8 = this.f30221a - 1;
        iArr[i8] = iArr[i8] + 1;
        return utf8;
    }

    @Override // e1.AbstractC5342c
    public AbstractC5342c.b peek() throws EOFException, C5341b {
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        switch (iF) {
            case 1:
                return AbstractC5342c.b.BEGIN_OBJECT;
            case 2:
                return AbstractC5342c.b.END_OBJECT;
            case 3:
                return AbstractC5342c.b.BEGIN_ARRAY;
            case 4:
                return AbstractC5342c.b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC5342c.b.BOOLEAN;
            case 7:
                return AbstractC5342c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC5342c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC5342c.b.NAME;
            case 16:
            case 17:
                return AbstractC5342c.b.NUMBER;
            case 18:
                return AbstractC5342c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // e1.AbstractC5342c
    public int selectName(AbstractC5342c.a aVar) throws EOFException, C5341b {
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        if (iF < 12 || iF > 15) {
            return -1;
        }
        if (iF == 15) {
            return g(this.f30240m, aVar);
        }
        int iSelect = this.f30235h.select(aVar.f30228b);
        if (iSelect != -1) {
            this.f30237j = 0;
            this.f30223c[this.f30221a - 1] = aVar.f30227a[iSelect];
            return iSelect;
        }
        String str = this.f30223c[this.f30221a - 1];
        String strNextName = nextName();
        int iG = g(strNextName, aVar);
        if (iG == -1) {
            this.f30237j = 15;
            this.f30240m = strNextName;
            this.f30223c[this.f30221a - 1] = str;
        }
        return iG;
    }

    @Override // e1.AbstractC5342c
    public void skipName() throws EOFException, C5341b {
        if (this.f30226f) {
            throw new C5340a("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int iF = this.f30237j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 14) {
            r();
        } else if (iF == 13) {
            o(f30231o);
        } else if (iF == 12) {
            o(f30230n);
        } else if (iF != 15) {
            throw new C5340a("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.f30237j = 0;
        this.f30223c[this.f30221a - 1] = "null";
    }

    @Override // e1.AbstractC5342c
    public void skipValue() throws EOFException, C5341b {
        if (this.f30226f) {
            throw new C5340a("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int i8 = 0;
        do {
            int iF = this.f30237j;
            if (iF == 0) {
                iF = f();
            }
            if (iF == 3) {
                b(1);
            } else if (iF == 1) {
                b(3);
            } else {
                if (iF == 4) {
                    i8--;
                    if (i8 < 0) {
                        throw new C5340a("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.f30221a--;
                } else if (iF == 2) {
                    i8--;
                    if (i8 < 0) {
                        throw new C5340a("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.f30221a--;
                } else if (iF == 14 || iF == 10) {
                    r();
                } else if (iF == 9 || iF == 13) {
                    o(f30231o);
                } else if (iF == 8 || iF == 12) {
                    o(f30230n);
                } else if (iF == 17) {
                    this.f30236i.skip(this.f30239l);
                } else if (iF == 18) {
                    throw new C5340a("Expected a value but was " + peek() + " at path " + getPath());
                }
                this.f30237j = 0;
            }
            i8++;
            this.f30237j = 0;
        } while (i8 != 0);
        int[] iArr = this.f30224d;
        int i9 = this.f30221a;
        int i10 = i9 - 1;
        iArr[i10] = iArr[i10] + 1;
        this.f30223c[i9 - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.f30235h + ")";
    }
}
