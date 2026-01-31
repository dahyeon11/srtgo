package h3;

import e3.AbstractC5358c;
import e3.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f31445a = new h("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b, reason: collision with root package name */
    private static final b f31446b = new h("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c, reason: collision with root package name */
    private static final b f31447c = new k("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d, reason: collision with root package name */
    private static final b f31448d = new k("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e, reason: collision with root package name */
    private static final b f31449e = new g("base16()", "0123456789ABCDEF");

    class a extends h3.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h3.j f31450a;

        a(h3.j jVar) {
            this.f31450a = jVar;
        }

        @Override // h3.f
        public OutputStream openStream() {
            return b.this.encodingStream(this.f31450a.openStream());
        }
    }

    /* renamed from: h3.b$b, reason: collision with other inner class name */
    class C0309b extends h3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h3.k f31452a;

        C0309b(h3.k kVar) {
            this.f31452a = kVar;
        }

        @Override // h3.g
        public InputStream openStream() {
            return b.this.decodingStream(this.f31452a.openStream());
        }
    }

    class e extends Writer {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Appendable f31460a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Writer f31461b;

        e(Appendable appendable, Writer writer) {
            this.f31460a = appendable;
            this.f31461b = writer;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f31461b.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            this.f31461b.flush();
        }

        @Override // java.io.Writer
        public void write(int i8) throws IOException {
            this.f31460a.append((char) i8);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final String f31462a;

        /* renamed from: b, reason: collision with root package name */
        private final char[] f31463b;

        /* renamed from: c, reason: collision with root package name */
        final int f31464c;

        /* renamed from: d, reason: collision with root package name */
        final int f31465d;

        /* renamed from: e, reason: collision with root package name */
        final int f31466e;

        /* renamed from: f, reason: collision with root package name */
        final int f31467f;

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f31468g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean[] f31469h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f31470i;

        f(String str, char[] cArr) {
            this(str, cArr, c(cArr), false);
        }

        private static byte[] c(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i8 = 0; i8 < cArr.length; i8++) {
                char c9 = cArr[i8];
                boolean z8 = true;
                w.checkArgument(c9 < 128, "Non-ASCII character: %s", c9);
                if (bArr[c9] != -1) {
                    z8 = false;
                }
                w.checkArgument(z8, "Duplicate character: %s", c9);
                bArr[c9] = (byte) i8;
            }
            return bArr;
        }

        private boolean f() {
            for (char c9 : this.f31463b) {
                if (AbstractC5358c.isLowerCase(c9)) {
                    return true;
                }
            }
            return false;
        }

        private boolean g() {
            for (char c9 : this.f31463b) {
                if (AbstractC5358c.isUpperCase(c9)) {
                    return true;
                }
            }
            return false;
        }

        boolean b(char c9) {
            return c9 <= 127 && this.f31468g[c9] != -1;
        }

        int d(char c9) throws i {
            if (c9 > 127) {
                throw new i("Unrecognized character: 0x" + Integer.toHexString(c9));
            }
            byte b9 = this.f31468g[c9];
            if (b9 != -1) {
                return b9;
            }
            if (c9 <= ' ' || c9 == 127) {
                throw new i("Unrecognized character: 0x" + Integer.toHexString(c9));
            }
            throw new i("Unrecognized character: " + c9);
        }

        char e(int i8) {
            return this.f31463b[i8];
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f31470i == fVar.f31470i && Arrays.equals(this.f31463b, fVar.f31463b);
        }

        f h() {
            if (this.f31470i) {
                return this;
            }
            byte[] bArr = this.f31468g;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i8 = 65;
            while (true) {
                if (i8 > 90) {
                    return new f(this.f31462a + ".ignoreCase()", this.f31463b, bArrCopyOf, true);
                }
                int i9 = i8 | 32;
                byte[] bArr2 = this.f31468g;
                byte b9 = bArr2[i8];
                byte b10 = bArr2[i9];
                if (b9 == -1) {
                    bArrCopyOf[i8] = b10;
                } else {
                    w.checkState(b10 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i8, (char) i9);
                    bArrCopyOf[i9] = b9;
                }
                i8++;
            }
        }

        public int hashCode() {
            return Arrays.hashCode(this.f31463b) + (this.f31470i ? 1231 : 1237);
        }

        boolean i(int i8) {
            return this.f31469h[i8 % this.f31466e];
        }

        f j() {
            if (!g()) {
                return this;
            }
            w.checkState(!f(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f31463b.length];
            int i8 = 0;
            while (true) {
                char[] cArr2 = this.f31463b;
                if (i8 >= cArr2.length) {
                    break;
                }
                cArr[i8] = AbstractC5358c.toLowerCase(cArr2[i8]);
                i8++;
            }
            f fVar = new f(this.f31462a + ".lowerCase()", cArr);
            return this.f31470i ? fVar.h() : fVar;
        }

        f k() {
            if (!f()) {
                return this;
            }
            w.checkState(!g(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f31463b.length];
            int i8 = 0;
            while (true) {
                char[] cArr2 = this.f31463b;
                if (i8 >= cArr2.length) {
                    break;
                }
                cArr[i8] = AbstractC5358c.toUpperCase(cArr2[i8]);
                i8++;
            }
            f fVar = new f(this.f31462a + ".upperCase()", cArr);
            return this.f31470i ? fVar.h() : fVar;
        }

        public boolean matches(char c9) {
            byte[] bArr = this.f31468g;
            return c9 < bArr.length && bArr[c9] != -1;
        }

        public String toString() {
            return this.f31462a;
        }

        private f(String str, char[] cArr, byte[] bArr, boolean z8) {
            this.f31462a = (String) w.checkNotNull(str);
            this.f31463b = (char[]) w.checkNotNull(cArr);
            try {
                int iLog2 = i3.b.log2(cArr.length, RoundingMode.UNNECESSARY);
                this.f31465d = iLog2;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iLog2);
                int i8 = 1 << (3 - iNumberOfTrailingZeros);
                this.f31466e = i8;
                this.f31467f = iLog2 >> iNumberOfTrailingZeros;
                this.f31464c = cArr.length - 1;
                this.f31468g = bArr;
                boolean[] zArr = new boolean[i8];
                for (int i9 = 0; i9 < this.f31467f; i9++) {
                    zArr[i3.b.divide(i9 * 8, this.f31465d, RoundingMode.CEILING)] = true;
                }
                this.f31469h = zArr;
                this.f31470i = z8;
            } catch (ArithmeticException e8) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e8);
            }
        }
    }

    static final class g extends k {

        /* renamed from: k, reason: collision with root package name */
        final char[] f31471k;

        g(String str, String str2) {
            this(new f(str, str2.toCharArray()));
        }

        @Override // h3.b.k, h3.b
        int b(byte[] bArr, CharSequence charSequence) throws i {
            w.checkNotNull(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new i("Invalid input length " + charSequence.length());
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < charSequence.length()) {
                bArr[i9] = (byte) ((this.f31475f.d(charSequence.charAt(i8)) << 4) | this.f31475f.d(charSequence.charAt(i8 + 1)));
                i8 += 2;
                i9++;
            }
            return i9;
        }

        @Override // h3.b.k, h3.b
        void c(Appendable appendable, byte[] bArr, int i8, int i9) throws IOException {
            w.checkNotNull(appendable);
            w.checkPositionIndexes(i8, i8 + i9, bArr.length);
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = bArr[i8 + i10] & 255;
                appendable.append(this.f31471k[i11]);
                appendable.append(this.f31471k[i11 | 256]);
            }
        }

        @Override // h3.b.k
        b l(f fVar, Character ch) {
            return new g(fVar);
        }

        private g(f fVar) {
            super(fVar, null);
            this.f31471k = new char[512];
            w.checkArgument(fVar.f31463b.length == 16);
            for (int i8 = 0; i8 < 256; i8++) {
                this.f31471k[i8] = fVar.e(i8 >>> 4);
                this.f31471k[i8 | 256] = fVar.e(i8 & 15);
            }
        }
    }

    static final class h extends k {
        h(String str, String str2, Character ch) {
            this(new f(str, str2.toCharArray()), ch);
        }

        @Override // h3.b.k, h3.b
        int b(byte[] bArr, CharSequence charSequence) throws i {
            w.checkNotNull(bArr);
            CharSequence charSequenceJ = j(charSequence);
            if (!this.f31475f.i(charSequenceJ.length())) {
                throw new i("Invalid input length " + charSequenceJ.length());
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < charSequenceJ.length()) {
                int i10 = i8 + 2;
                int iD = (this.f31475f.d(charSequenceJ.charAt(i8)) << 18) | (this.f31475f.d(charSequenceJ.charAt(i8 + 1)) << 12);
                int i11 = i9 + 1;
                bArr[i9] = (byte) (iD >>> 16);
                if (i10 < charSequenceJ.length()) {
                    int i12 = i8 + 3;
                    int iD2 = iD | (this.f31475f.d(charSequenceJ.charAt(i10)) << 6);
                    int i13 = i9 + 2;
                    bArr[i11] = (byte) ((iD2 >>> 8) & 255);
                    if (i12 < charSequenceJ.length()) {
                        i8 += 4;
                        i9 += 3;
                        bArr[i13] = (byte) ((iD2 | this.f31475f.d(charSequenceJ.charAt(i12))) & 255);
                    } else {
                        i9 = i13;
                        i8 = i12;
                    }
                } else {
                    i9 = i11;
                    i8 = i10;
                }
            }
            return i9;
        }

        @Override // h3.b.k, h3.b
        void c(Appendable appendable, byte[] bArr, int i8, int i9) throws IOException {
            w.checkNotNull(appendable);
            int i10 = i8 + i9;
            w.checkPositionIndexes(i8, i10, bArr.length);
            while (i9 >= 3) {
                int i11 = i8 + 2;
                int i12 = ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8] & 255) << 16);
                i8 += 3;
                int i13 = i12 | (bArr[i11] & 255);
                appendable.append(this.f31475f.e(i13 >>> 18));
                appendable.append(this.f31475f.e((i13 >>> 12) & 63));
                appendable.append(this.f31475f.e((i13 >>> 6) & 63));
                appendable.append(this.f31475f.e(i13 & 63));
                i9 -= 3;
            }
            if (i8 < i10) {
                k(appendable, bArr, i8, i10 - i8);
            }
        }

        @Override // h3.b.k
        b l(f fVar, Character ch) {
            return new h(fVar, ch);
        }

        private h(f fVar, Character ch) {
            super(fVar, ch);
            w.checkArgument(fVar.f31463b.length == 64);
        }
    }

    public static final class i extends IOException {
        i(String str) {
            super(str);
        }
    }

    static final class j extends b {

        /* renamed from: f, reason: collision with root package name */
        private final b f31472f;

        /* renamed from: g, reason: collision with root package name */
        private final String f31473g;

        /* renamed from: h, reason: collision with root package name */
        private final int f31474h;

        j(b bVar, String str, int i8) {
            this.f31472f = (b) w.checkNotNull(bVar);
            this.f31473g = (String) w.checkNotNull(str);
            this.f31474h = i8;
            w.checkArgument(i8 > 0, "Cannot add a separator after every %s chars", i8);
        }

        @Override // h3.b
        int b(byte[] bArr, CharSequence charSequence) {
            StringBuilder sb = new StringBuilder(charSequence.length());
            for (int i8 = 0; i8 < charSequence.length(); i8++) {
                char cCharAt = charSequence.charAt(i8);
                if (this.f31473g.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.f31472f.b(bArr, sb);
        }

        @Override // h3.b
        void c(Appendable appendable, byte[] bArr, int i8, int i9) {
            this.f31472f.c(b.h(appendable, this.f31473g, this.f31474h), bArr, i8, i9);
        }

        @Override // h3.b
        public boolean canDecode(CharSequence charSequence) {
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < charSequence.length(); i8++) {
                char cCharAt = charSequence.charAt(i8);
                if (this.f31473g.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.f31472f.canDecode(sb);
        }

        @Override // h3.b
        public InputStream decodingStream(Reader reader) {
            return this.f31472f.decodingStream(b.e(reader, this.f31473g));
        }

        @Override // h3.b
        public OutputStream encodingStream(Writer writer) {
            return this.f31472f.encodingStream(b.i(writer, this.f31473g, this.f31474h));
        }

        @Override // h3.b
        int f(int i8) {
            return this.f31472f.f(i8);
        }

        @Override // h3.b
        int g(int i8) {
            int iG = this.f31472f.g(i8);
            return iG + (this.f31473g.length() * i3.b.divide(Math.max(0, iG - 1), this.f31474h, RoundingMode.FLOOR));
        }

        @Override // h3.b
        public b ignoreCase() {
            return this.f31472f.ignoreCase().withSeparator(this.f31473g, this.f31474h);
        }

        @Override // h3.b
        CharSequence j(CharSequence charSequence) {
            return this.f31472f.j(charSequence);
        }

        @Override // h3.b
        public b lowerCase() {
            return this.f31472f.lowerCase().withSeparator(this.f31473g, this.f31474h);
        }

        @Override // h3.b
        public b omitPadding() {
            return this.f31472f.omitPadding().withSeparator(this.f31473g, this.f31474h);
        }

        public String toString() {
            return this.f31472f + ".withSeparator(\"" + this.f31473g + "\", " + this.f31474h + ")";
        }

        @Override // h3.b
        public b upperCase() {
            return this.f31472f.upperCase().withSeparator(this.f31473g, this.f31474h);
        }

        @Override // h3.b
        public b withPadChar(char c9) {
            return this.f31472f.withPadChar(c9).withSeparator(this.f31473g, this.f31474h);
        }

        @Override // h3.b
        public b withSeparator(String str, int i8) {
            throw new UnsupportedOperationException("Already have a separator");
        }
    }

    static class k extends b {

        /* renamed from: f, reason: collision with root package name */
        final f f31475f;

        /* renamed from: g, reason: collision with root package name */
        final Character f31476g;

        /* renamed from: h, reason: collision with root package name */
        private volatile b f31477h;

        /* renamed from: i, reason: collision with root package name */
        private volatile b f31478i;

        /* renamed from: j, reason: collision with root package name */
        private volatile b f31479j;

        class a extends OutputStream {

            /* renamed from: a, reason: collision with root package name */
            int f31480a = 0;

            /* renamed from: b, reason: collision with root package name */
            int f31481b = 0;

            /* renamed from: c, reason: collision with root package name */
            int f31482c = 0;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Writer f31483d;

            a(Writer writer) {
                this.f31483d = writer;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                int i8 = this.f31481b;
                if (i8 > 0) {
                    int i9 = this.f31480a;
                    f fVar = k.this.f31475f;
                    this.f31483d.write(fVar.e((i9 << (fVar.f31465d - i8)) & fVar.f31464c));
                    this.f31482c++;
                    if (k.this.f31476g != null) {
                        while (true) {
                            int i10 = this.f31482c;
                            k kVar = k.this;
                            if (i10 % kVar.f31475f.f31466e == 0) {
                                break;
                            }
                            this.f31483d.write(kVar.f31476g.charValue());
                            this.f31482c++;
                        }
                    }
                }
                this.f31483d.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                this.f31483d.flush();
            }

            @Override // java.io.OutputStream
            public void write(int i8) throws IOException {
                this.f31480a = (i8 & 255) | (this.f31480a << 8);
                this.f31481b += 8;
                while (true) {
                    int i9 = this.f31481b;
                    f fVar = k.this.f31475f;
                    int i10 = fVar.f31465d;
                    if (i9 < i10) {
                        return;
                    }
                    this.f31483d.write(fVar.e((this.f31480a >> (i9 - i10)) & fVar.f31464c));
                    this.f31482c++;
                    this.f31481b -= k.this.f31475f.f31465d;
                }
            }
        }

        k(String str, String str2, Character ch) {
            this(new f(str, str2.toCharArray()), ch);
        }

        @Override // h3.b
        int b(byte[] bArr, CharSequence charSequence) throws i {
            f fVar;
            w.checkNotNull(bArr);
            CharSequence charSequenceJ = j(charSequence);
            if (!this.f31475f.i(charSequenceJ.length())) {
                throw new i("Invalid input length " + charSequenceJ.length());
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < charSequenceJ.length()) {
                long jD = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    fVar = this.f31475f;
                    if (i10 >= fVar.f31466e) {
                        break;
                    }
                    jD <<= fVar.f31465d;
                    if (i8 + i10 < charSequenceJ.length()) {
                        jD |= this.f31475f.d(charSequenceJ.charAt(i11 + i8));
                        i11++;
                    }
                    i10++;
                }
                int i12 = fVar.f31467f;
                int i13 = (i12 * 8) - (i11 * fVar.f31465d);
                int i14 = (i12 - 1) * 8;
                while (i14 >= i13) {
                    bArr[i9] = (byte) ((jD >>> i14) & 255);
                    i14 -= 8;
                    i9++;
                }
                i8 += this.f31475f.f31466e;
            }
            return i9;
        }

        @Override // h3.b
        void c(Appendable appendable, byte[] bArr, int i8, int i9) throws IOException {
            w.checkNotNull(appendable);
            w.checkPositionIndexes(i8, i8 + i9, bArr.length);
            int i10 = 0;
            while (i10 < i9) {
                k(appendable, bArr, i8 + i10, Math.min(this.f31475f.f31467f, i9 - i10));
                i10 += this.f31475f.f31467f;
            }
        }

        @Override // h3.b
        public boolean canDecode(CharSequence charSequence) {
            w.checkNotNull(charSequence);
            CharSequence charSequenceJ = j(charSequence);
            if (!this.f31475f.i(charSequenceJ.length())) {
                return false;
            }
            for (int i8 = 0; i8 < charSequenceJ.length(); i8++) {
                if (!this.f31475f.b(charSequenceJ.charAt(i8))) {
                    return false;
                }
            }
            return true;
        }

        @Override // h3.b
        public InputStream decodingStream(Reader reader) {
            w.checkNotNull(reader);
            return new C0310b(reader);
        }

        @Override // h3.b
        public OutputStream encodingStream(Writer writer) {
            w.checkNotNull(writer);
            return new a(writer);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f31475f.equals(kVar.f31475f) && Objects.equals(this.f31476g, kVar.f31476g);
        }

        @Override // h3.b
        int f(int i8) {
            return (int) (((this.f31475f.f31465d * i8) + 7) / 8);
        }

        @Override // h3.b
        int g(int i8) {
            f fVar = this.f31475f;
            return fVar.f31466e * i3.b.divide(i8, fVar.f31467f, RoundingMode.CEILING);
        }

        public int hashCode() {
            return this.f31475f.hashCode() ^ Objects.hashCode(this.f31476g);
        }

        @Override // h3.b
        public b ignoreCase() {
            b bVarL = this.f31479j;
            if (bVarL == null) {
                f fVarH = this.f31475f.h();
                bVarL = fVarH == this.f31475f ? this : l(fVarH, this.f31476g);
                this.f31479j = bVarL;
            }
            return bVarL;
        }

        @Override // h3.b
        CharSequence j(CharSequence charSequence) {
            w.checkNotNull(charSequence);
            Character ch = this.f31476g;
            if (ch == null) {
                return charSequence;
            }
            char cCharValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        void k(Appendable appendable, byte[] bArr, int i8, int i9) throws IOException {
            w.checkNotNull(appendable);
            w.checkPositionIndexes(i8, i8 + i9, bArr.length);
            int i10 = 0;
            w.checkArgument(i9 <= this.f31475f.f31467f);
            long j8 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                j8 = (j8 | (bArr[i8 + i11] & 255)) << 8;
            }
            int i12 = ((i9 + 1) * 8) - this.f31475f.f31465d;
            while (i10 < i9 * 8) {
                f fVar = this.f31475f;
                appendable.append(fVar.e(((int) (j8 >>> (i12 - i10))) & fVar.f31464c));
                i10 += this.f31475f.f31465d;
            }
            if (this.f31476g != null) {
                while (i10 < this.f31475f.f31467f * 8) {
                    appendable.append(this.f31476g.charValue());
                    i10 += this.f31475f.f31465d;
                }
            }
        }

        b l(f fVar, Character ch) {
            return new k(fVar, ch);
        }

        @Override // h3.b
        public b lowerCase() {
            b bVarL = this.f31478i;
            if (bVarL == null) {
                f fVarJ = this.f31475f.j();
                bVarL = fVarJ == this.f31475f ? this : l(fVarJ, this.f31476g);
                this.f31478i = bVarL;
            }
            return bVarL;
        }

        @Override // h3.b
        public b omitPadding() {
            return this.f31476g == null ? this : l(this.f31475f, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f31475f);
            if (8 % this.f31475f.f31465d != 0) {
                if (this.f31476g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f31476g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        @Override // h3.b
        public b upperCase() {
            b bVarL = this.f31477h;
            if (bVarL == null) {
                f fVarK = this.f31475f.k();
                bVarL = fVarK == this.f31475f ? this : l(fVarK, this.f31476g);
                this.f31477h = bVarL;
            }
            return bVarL;
        }

        @Override // h3.b
        public b withPadChar(char c9) {
            Character ch;
            return (8 % this.f31475f.f31465d == 0 || ((ch = this.f31476g) != null && ch.charValue() == c9)) ? this : l(this.f31475f, Character.valueOf(c9));
        }

        @Override // h3.b
        public b withSeparator(String str, int i8) {
            for (int i9 = 0; i9 < str.length(); i9++) {
                w.checkArgument(!this.f31475f.matches(str.charAt(i9)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch = this.f31476g;
            if (ch != null) {
                w.checkArgument(str.indexOf(ch.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new j(this, str, i8);
        }

        k(f fVar, Character ch) {
            this.f31475f = (f) w.checkNotNull(fVar);
            w.checkArgument(ch == null || !fVar.matches(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f31476g = ch;
        }

        /* renamed from: h3.b$k$b, reason: collision with other inner class name */
        class C0310b extends InputStream {

            /* renamed from: a, reason: collision with root package name */
            int f31485a = 0;

            /* renamed from: b, reason: collision with root package name */
            int f31486b = 0;

            /* renamed from: c, reason: collision with root package name */
            int f31487c = 0;

            /* renamed from: d, reason: collision with root package name */
            boolean f31488d = false;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Reader f31489e;

            C0310b(Reader reader) {
                this.f31489e = reader;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f31489e.close();
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
            
                throw new h3.b.i("Padding cannot start at index " + r4.f31487c);
             */
            @Override // java.io.InputStream
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int read() throws java.io.IOException {
                /*
                    r4 = this;
                L0:
                    java.io.Reader r0 = r4.f31489e
                    int r0 = r0.read()
                    r1 = -1
                    if (r0 != r1) goto L34
                    boolean r0 = r4.f31488d
                    if (r0 != 0) goto L33
                    h3.b$k r0 = h3.b.k.this
                    h3.b$f r0 = r0.f31475f
                    int r2 = r4.f31487c
                    boolean r0 = r0.i(r2)
                    if (r0 == 0) goto L1a
                    goto L33
                L1a:
                    h3.b$i r0 = new h3.b$i
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Invalid input length "
                    r1.append(r2)
                    int r2 = r4.f31487c
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L33:
                    return r1
                L34:
                    int r1 = r4.f31487c
                    r2 = 1
                    int r1 = r1 + r2
                    r4.f31487c = r1
                    char r0 = (char) r0
                    h3.b$k r1 = h3.b.k.this
                    java.lang.Character r1 = r1.f31476g
                    if (r1 == 0) goto L78
                    char r1 = r1.charValue()
                    if (r1 != r0) goto L78
                    boolean r0 = r4.f31488d
                    if (r0 != 0) goto L75
                    int r0 = r4.f31487c
                    if (r0 == r2) goto L5c
                    h3.b$k r1 = h3.b.k.this
                    h3.b$f r1 = r1.f31475f
                    int r0 = r0 + (-1)
                    boolean r0 = r1.i(r0)
                    if (r0 == 0) goto L5c
                    goto L75
                L5c:
                    h3.b$i r0 = new h3.b$i
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Padding cannot start at index "
                    r1.append(r2)
                    int r2 = r4.f31487c
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L75:
                    r4.f31488d = r2
                    goto L0
                L78:
                    boolean r1 = r4.f31488d
                    if (r1 != 0) goto La4
                    int r1 = r4.f31485a
                    h3.b$k r2 = h3.b.k.this
                    h3.b$f r2 = r2.f31475f
                    int r3 = r2.f31465d
                    int r1 = r1 << r3
                    r4.f31485a = r1
                    int r0 = r2.d(r0)
                    r0 = r0 | r1
                    r4.f31485a = r0
                    int r1 = r4.f31486b
                    h3.b$k r2 = h3.b.k.this
                    h3.b$f r2 = r2.f31475f
                    int r2 = r2.f31465d
                    int r1 = r1 + r2
                    r4.f31486b = r1
                    r2 = 8
                    if (r1 < r2) goto L0
                    int r1 = r1 - r2
                    r4.f31486b = r1
                    int r0 = r0 >> r1
                    r0 = r0 & 255(0xff, float:3.57E-43)
                    return r0
                La4:
                    h3.b$i r1 = new h3.b$i
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Expected padding character but found '"
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = "' at index "
                    r2.append(r0)
                    int r0 = r4.f31487c
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: h3.b.k.C0310b.read():int");
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i8, int i9) throws IOException {
                int i10 = i9 + i8;
                w.checkPositionIndexes(i8, i10, bArr.length);
                int i11 = i8;
                while (i11 < i10) {
                    int i12 = read();
                    if (i12 == -1) {
                        int i13 = i11 - i8;
                        if (i13 == 0) {
                            return -1;
                        }
                        return i13;
                    }
                    bArr[i11] = (byte) i12;
                    i11++;
                }
                return i11 - i8;
            }
        }
    }

    b() {
    }

    public static b base16() {
        return f31449e;
    }

    public static b base32() {
        return f31447c;
    }

    public static b base32Hex() {
        return f31448d;
    }

    public static b base64() {
        return f31445a;
    }

    public static b base64Url() {
        return f31446b;
    }

    private static byte[] d(byte[] bArr, int i8) {
        if (i8 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        return bArr2;
    }

    static Reader e(Reader reader, String str) {
        w.checkNotNull(reader);
        w.checkNotNull(str);
        return new c(reader, str);
    }

    static Appendable h(Appendable appendable, String str, int i8) {
        w.checkNotNull(appendable);
        w.checkNotNull(str);
        w.checkArgument(i8 > 0);
        return new d(i8, appendable, str);
    }

    static Writer i(Writer writer, String str, int i8) {
        return new e(h(writer, str, i8), writer);
    }

    final byte[] a(CharSequence charSequence) {
        CharSequence charSequenceJ = j(charSequence);
        byte[] bArr = new byte[f(charSequenceJ.length())];
        return d(bArr, b(bArr, charSequenceJ));
    }

    abstract int b(byte[] bArr, CharSequence charSequence);

    abstract void c(Appendable appendable, byte[] bArr, int i8, int i9);

    public abstract boolean canDecode(CharSequence charSequence);

    public final byte[] decode(CharSequence charSequence) {
        try {
            return a(charSequence);
        } catch (i e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public final h3.g decodingSource(h3.k kVar) {
        w.checkNotNull(kVar);
        return new C0309b(kVar);
    }

    public abstract InputStream decodingStream(Reader reader);

    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public final h3.f encodingSink(h3.j jVar) {
        w.checkNotNull(jVar);
        return new a(jVar);
    }

    public abstract OutputStream encodingStream(Writer writer);

    abstract int f(int i8);

    abstract int g(int i8);

    public abstract b ignoreCase();

    abstract CharSequence j(CharSequence charSequence);

    public abstract b lowerCase();

    public abstract b omitPadding();

    public abstract b upperCase();

    public abstract b withPadChar(char c9);

    public abstract b withSeparator(String str, int i8);

    class c extends Reader {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Reader f31454a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31455b;

        c(Reader reader, String str) {
            this.f31454a = reader;
            this.f31455b = str;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f31454a.close();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int i8;
            do {
                i8 = this.f31454a.read();
                if (i8 == -1) {
                    break;
                }
            } while (this.f31455b.indexOf((char) i8) >= 0);
            return i8;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i8, int i9) {
            throw new UnsupportedOperationException();
        }
    }

    public final String encode(byte[] bArr, int i8, int i9) {
        w.checkPositionIndexes(i8, i8 + i9, bArr.length);
        StringBuilder sb = new StringBuilder(g(i9));
        try {
            c(sb, bArr, i8, i9);
            return sb.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    class d implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        int f31456a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31457b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Appendable f31458c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f31459d;

        d(int i8, Appendable appendable, String str) {
            this.f31457b = i8;
            this.f31458c = appendable;
            this.f31459d = str;
            this.f31456a = i8;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c9) throws IOException {
            if (this.f31456a == 0) {
                this.f31458c.append(this.f31459d);
                this.f31456a = this.f31457b;
            }
            this.f31458c.append(c9);
            this.f31456a--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i8, int i9) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            throw new UnsupportedOperationException();
        }
    }
}
