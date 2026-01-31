package X7;

import Q7.C0708l;
import Q7.O;
import Q7.X;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public class c implements CharSequence, Appendable, Serializable, R7.a {

    /* renamed from: a */
    protected char[] f5481a;

    /* renamed from: b */
    protected int f5482b;

    /* renamed from: c */
    private String f5483c;

    /* renamed from: d */
    private String f5484d;

    final class b extends e {
        b() {
        }

        @Override // X7.e
        public String getContent() {
            String content = super.getContent();
            return content == null ? c.this.toString() : content;
        }

        @Override // X7.e
        protected List i(char[] cArr, int i8, int i9) {
            if (cArr != null) {
                return super.i(cArr, i8, i9);
            }
            c cVar = c.this;
            return super.i(cVar.f5481a, 0, cVar.size());
        }
    }

    /* renamed from: X7.c$c */
    final class C0087c extends Writer {
        C0087c() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            c.this.append(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            c.this.append(cArr, i8, i9);
        }

        @Override // java.io.Writer
        public void write(int i8) {
            c.this.append((char) i8);
        }

        @Override // java.io.Writer
        public void write(String str) {
            c.this.append(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i8, int i9) {
            c.this.append(str, i8, i9);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    public c() {
        this(32);
    }

    private void a(int i8, int i9, int i10) {
        char[] cArr = this.f5481a;
        System.arraycopy(cArr, i9, cArr, i8, this.f5482b - i9);
        this.f5482b -= i10;
    }

    private c b(d dVar, String str, int i8, int i9, int i10) {
        if (dVar != null && this.f5482b != 0) {
            int length = X.length(str);
            int i11 = i8;
            while (i11 < i9 && i10 != 0) {
                int iIsMatch = dVar.isMatch(this.f5481a, i11, i8, i9);
                if (iIsMatch > 0) {
                    c(i11, i11 + iIsMatch, iIsMatch, str, length);
                    i9 = (i9 - iIsMatch) + length;
                    i11 = (i11 + length) - 1;
                    if (i10 > 0) {
                        i10--;
                    }
                }
                i11++;
            }
        }
        return this;
    }

    private void c(int i8, int i9, int i10, String str, int i11) {
        int i12 = (this.f5482b - i10) + i11;
        if (i11 != i10) {
            ensureCapacity(i12);
            char[] cArr = this.f5481a;
            System.arraycopy(cArr, i9, cArr, i8 + i11, this.f5482b - i9);
            this.f5482b = i12;
        }
        if (i11 > 0) {
            str.getChars(0, i11, this.f5481a, i8);
        }
    }

    public c appendAll(Iterable<?> iterable) {
        if (iterable != null) {
            iterable.forEach(new X7.b(this));
        }
        return this;
    }

    public c appendFixedWidthPadLeft(int i8, int i9, char c9) {
        return appendFixedWidthPadLeft(String.valueOf(i8), i9, c9);
    }

    public c appendFixedWidthPadRight(int i8, int i9, char c9) {
        return appendFixedWidthPadRight(String.valueOf(i8), i9, c9);
    }

    public c appendNewLine() {
        String str = this.f5483c;
        if (str != null) {
            return append(str);
        }
        append(System.lineSeparator());
        return this;
    }

    public c appendNull() {
        String str = this.f5484d;
        return str == null ? this : append(str);
    }

    public c appendPadding(int i8, char c9) {
        if (i8 >= 0) {
            ensureCapacity(this.f5482b + i8);
            for (int i9 = 0; i9 < i8; i9++) {
                char[] cArr = this.f5481a;
                int i10 = this.f5482b;
                this.f5482b = i10 + 1;
                cArr[i10] = c9;
            }
        }
        return this;
    }

    public c appendSeparator(char c9) {
        if (isNotEmpty()) {
            append(c9);
        }
        return this;
    }

    public void appendTo(Appendable appendable) throws IOException {
        if (appendable instanceof Writer) {
            ((Writer) appendable).write(this.f5481a, 0, this.f5482b);
            return;
        }
        if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(this.f5481a, 0, this.f5482b);
            return;
        }
        if (appendable instanceof StringBuffer) {
            ((StringBuffer) appendable).append(this.f5481a, 0, this.f5482b);
        } else if (appendable instanceof CharBuffer) {
            ((CharBuffer) appendable).put(this.f5481a, 0, this.f5482b);
        } else {
            appendable.append(this);
        }
    }

    public c appendWithSeparators(Iterable<?> iterable, String str) {
        if (iterable != null) {
            String string = Objects.toString(str, "");
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                append(it.next());
                if (it.hasNext()) {
                    append(string);
                }
            }
        }
        return this;
    }

    public c appendln(boolean z8) {
        return append(z8).appendNewLine();
    }

    public Reader asReader() {
        return new a();
    }

    public e asTokenizer() {
        return new b();
    }

    public Writer asWriter() {
        return new C0087c();
    }

    public int capacity() {
        return this.f5481a.length;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i8) {
        if (i8 < 0 || i8 >= length()) {
            throw new StringIndexOutOfBoundsException(i8);
        }
        return this.f5481a[i8];
    }

    public c clear() {
        this.f5482b = 0;
        return this;
    }

    public boolean contains(char c9) {
        char[] cArr = this.f5481a;
        for (int i8 = 0; i8 < this.f5482b; i8++) {
            if (cArr[i8] == c9) {
                return true;
            }
        }
        return false;
    }

    protected void d(int i8) {
        if (i8 < 0 || i8 > this.f5482b) {
            throw new StringIndexOutOfBoundsException(i8);
        }
    }

    public c delete(int i8, int i9) {
        int iE = e(i8, i9);
        int i10 = iE - i8;
        if (i10 > 0) {
            a(i8, iE, i10);
        }
        return this;
    }

    public c deleteAll(char c9) {
        int i8 = 0;
        while (i8 < this.f5482b) {
            if (this.f5481a[i8] == c9) {
                int i9 = i8;
                do {
                    i9++;
                    if (i9 >= this.f5482b) {
                        break;
                    }
                } while (this.f5481a[i9] == c9);
                int i10 = i9 - i8;
                a(i8, i9, i10);
                i8 = i9 - i10;
            }
            i8++;
        }
        return this;
    }

    public c deleteCharAt(int i8) {
        if (i8 < 0 || i8 >= this.f5482b) {
            throw new StringIndexOutOfBoundsException(i8);
        }
        a(i8, i8 + 1, 1);
        return this;
    }

    public c deleteFirst(char c9) {
        int i8 = 0;
        while (true) {
            if (i8 >= this.f5482b) {
                break;
            }
            if (this.f5481a[i8] == c9) {
                a(i8, i8 + 1, 1);
                break;
            }
            i8++;
        }
        return this;
    }

    protected int e(int i8, int i9) {
        if (i8 < 0) {
            throw new StringIndexOutOfBoundsException(i8);
        }
        int i10 = this.f5482b;
        if (i9 > i10) {
            i9 = i10;
        }
        if (i8 <= i9) {
            return i9;
        }
        throw new StringIndexOutOfBoundsException("end < start");
    }

    public boolean endsWith(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        int i8 = this.f5482b;
        if (length > i8) {
            return false;
        }
        int i9 = i8 - length;
        int i10 = 0;
        while (i10 < length) {
            if (this.f5481a[i9] != str.charAt(i10)) {
                return false;
            }
            i10++;
            i9++;
        }
        return true;
    }

    public c ensureCapacity(int i8) {
        char[] cArr = this.f5481a;
        if (i8 > cArr.length) {
            char[] cArr2 = new char[i8 * 2];
            this.f5481a = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.f5482b);
        }
        return this;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && equals((c) obj);
    }

    public boolean equalsIgnoreCase(c cVar) {
        if (this == cVar) {
            return true;
        }
        int i8 = this.f5482b;
        if (i8 != cVar.f5482b) {
            return false;
        }
        char[] cArr = this.f5481a;
        char[] cArr2 = cVar.f5481a;
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            char c9 = cArr[i9];
            char c10 = cArr2[i9];
            if (c9 != c10 && Character.toUpperCase(c9) != Character.toUpperCase(c10)) {
                return false;
            }
        }
        return true;
    }

    public char[] getChars(char[] cArr) {
        int length = length();
        if (cArr == null || cArr.length < length) {
            cArr = new char[length];
        }
        System.arraycopy(this.f5481a, 0, cArr, 0, length);
        return cArr;
    }

    public String getNewLineText() {
        return this.f5483c;
    }

    public String getNullText() {
        return this.f5484d;
    }

    public int hashCode() {
        char[] cArr = this.f5481a;
        int i8 = 0;
        for (int i9 = this.f5482b - 1; i9 >= 0; i9--) {
            i8 = (i8 * 31) + cArr[i9];
        }
        return i8;
    }

    public int indexOf(char c9) {
        return indexOf(c9, 0);
    }

    public c insert(int i8, boolean z8) {
        d(i8);
        if (z8) {
            ensureCapacity(this.f5482b + 4);
            char[] cArr = this.f5481a;
            System.arraycopy(cArr, i8, cArr, i8 + 4, this.f5482b - i8);
            char[] cArr2 = this.f5481a;
            cArr2[i8] = 't';
            cArr2[i8 + 1] = 'r';
            cArr2[i8 + 2] = 'u';
            cArr2[i8 + 3] = 'e';
            this.f5482b += 4;
        } else {
            ensureCapacity(this.f5482b + 5);
            char[] cArr3 = this.f5481a;
            System.arraycopy(cArr3, i8, cArr3, i8 + 5, this.f5482b - i8);
            char[] cArr4 = this.f5481a;
            cArr4[i8] = 'f';
            cArr4[i8 + 1] = 'a';
            cArr4[i8 + 2] = 'l';
            cArr4[i8 + 3] = 's';
            cArr4[i8 + 4] = 'e';
            this.f5482b += 5;
        }
        return this;
    }

    public boolean isEmpty() {
        return this.f5482b == 0;
    }

    public boolean isNotEmpty() {
        return this.f5482b > 0;
    }

    public int lastIndexOf(char c9) {
        return lastIndexOf(c9, this.f5482b - 1);
    }

    public String leftString(int i8) {
        if (i8 <= 0) {
            return "";
        }
        int i9 = this.f5482b;
        return i8 >= i9 ? new String(this.f5481a, 0, i9) : new String(this.f5481a, 0, i8);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f5482b;
    }

    public String midString(int i8, int i9) {
        int i10;
        if (i8 < 0) {
            i8 = 0;
        }
        return (i9 <= 0 || i8 >= (i10 = this.f5482b)) ? "" : i10 <= i8 + i9 ? new String(this.f5481a, i8, i10 - i8) : new String(this.f5481a, i8, i9);
    }

    public c minimizeCapacity() {
        if (this.f5481a.length > length()) {
            char[] cArr = this.f5481a;
            char[] cArr2 = new char[length()];
            this.f5481a = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.f5482b);
        }
        return this;
    }

    public int readFrom(Readable readable) throws IOException {
        int i8 = this.f5482b;
        if (readable instanceof Reader) {
            Reader reader = (Reader) readable;
            ensureCapacity(i8 + 1);
            while (true) {
                char[] cArr = this.f5481a;
                int i9 = this.f5482b;
                int i10 = reader.read(cArr, i9, cArr.length - i9);
                if (i10 == -1) {
                    break;
                }
                int i11 = this.f5482b + i10;
                this.f5482b = i11;
                ensureCapacity(i11 + 1);
            }
        } else if (readable instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) readable;
            int iRemaining = charBuffer.remaining();
            ensureCapacity(this.f5482b + iRemaining);
            charBuffer.get(this.f5481a, this.f5482b, iRemaining);
            this.f5482b += iRemaining;
        } else {
            while (true) {
                ensureCapacity(this.f5482b + 1);
                char[] cArr2 = this.f5481a;
                int i12 = this.f5482b;
                int i13 = readable.read(CharBuffer.wrap(cArr2, i12, cArr2.length - i12));
                if (i13 == -1) {
                    break;
                }
                this.f5482b += i13;
            }
        }
        return this.f5482b - i8;
    }

    public c replace(int i8, int i9, String str) {
        int iE = e(i8, i9);
        c(i8, iE, iE - i8, str, X.length(str));
        return this;
    }

    public c replaceAll(char c9, char c10) {
        if (c9 != c10) {
            for (int i8 = 0; i8 < this.f5482b; i8++) {
                char[] cArr = this.f5481a;
                if (cArr[i8] == c9) {
                    cArr[i8] = c10;
                }
            }
        }
        return this;
    }

    public c replaceFirst(char c9, char c10) {
        if (c9 != c10) {
            int i8 = 0;
            while (true) {
                if (i8 >= this.f5482b) {
                    break;
                }
                char[] cArr = this.f5481a;
                if (cArr[i8] == c9) {
                    cArr[i8] = c10;
                    break;
                }
                i8++;
            }
        }
        return this;
    }

    public c reverse() {
        int i8 = this.f5482b;
        if (i8 == 0) {
            return this;
        }
        int i9 = i8 / 2;
        char[] cArr = this.f5481a;
        int i10 = i8 - 1;
        int i11 = 0;
        while (i11 < i9) {
            char c9 = cArr[i11];
            cArr[i11] = cArr[i10];
            cArr[i10] = c9;
            i11++;
            i10--;
        }
        return this;
    }

    public String rightString(int i8) {
        if (i8 <= 0) {
            return "";
        }
        int i9 = this.f5482b;
        return i8 >= i9 ? new String(this.f5481a, 0, i9) : new String(this.f5481a, i9 - i8, i8);
    }

    public c setCharAt(int i8, char c9) {
        if (i8 < 0 || i8 >= length()) {
            throw new StringIndexOutOfBoundsException(i8);
        }
        this.f5481a[i8] = c9;
        return this;
    }

    public c setLength(int i8) {
        if (i8 < 0) {
            throw new StringIndexOutOfBoundsException(i8);
        }
        int i9 = this.f5482b;
        if (i8 < i9) {
            this.f5482b = i8;
        } else if (i8 > i9) {
            ensureCapacity(i8);
            this.f5482b = i8;
            for (int i10 = this.f5482b; i10 < i8; i10++) {
                this.f5481a[i10] = 0;
            }
        }
        return this;
    }

    public c setNewLineText(String str) {
        this.f5483c = str;
        return this;
    }

    public c setNullText(String str) {
        if (X.isEmpty(str)) {
            str = null;
        }
        this.f5484d = str;
        return this;
    }

    public int size() {
        return this.f5482b;
    }

    public boolean startsWith(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        if (length > this.f5482b) {
            return false;
        }
        for (int i8 = 0; i8 < length; i8++) {
            if (this.f5481a[i8] != str.charAt(i8)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i8, int i9) {
        if (i8 < 0) {
            throw new StringIndexOutOfBoundsException(i8);
        }
        if (i9 > this.f5482b) {
            throw new StringIndexOutOfBoundsException(i9);
        }
        if (i8 <= i9) {
            return substring(i8, i9);
        }
        throw new StringIndexOutOfBoundsException(i9 - i8);
    }

    public String substring(int i8) {
        return substring(i8, this.f5482b);
    }

    public char[] toCharArray() {
        int i8 = this.f5482b;
        if (i8 == 0) {
            return C0708l.EMPTY_CHAR_ARRAY;
        }
        char[] cArr = new char[i8];
        System.arraycopy(this.f5481a, 0, cArr, 0, i8);
        return cArr;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.f5481a, 0, this.f5482b);
    }

    public StringBuffer toStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer(this.f5482b);
        stringBuffer.append(this.f5481a, 0, this.f5482b);
        return stringBuffer;
    }

    public StringBuilder toStringBuilder() {
        StringBuilder sb = new StringBuilder(this.f5482b);
        sb.append(this.f5481a, 0, this.f5482b);
        return sb;
    }

    public c trim() {
        int i8 = this.f5482b;
        if (i8 == 0) {
            return this;
        }
        char[] cArr = this.f5481a;
        int i9 = 0;
        while (i9 < i8 && cArr[i9] <= ' ') {
            i9++;
        }
        while (i9 < i8 && cArr[i8 - 1] <= ' ') {
            i8--;
        }
        int i10 = this.f5482b;
        if (i8 < i10) {
            delete(i8, i10);
        }
        if (i9 > 0) {
            delete(0, i9);
        }
        return this;
    }

    final class a extends Reader {

        /* renamed from: a */
        private int f5485a;

        /* renamed from: b */
        private int f5486b;

        a() {
        }

        @Override // java.io.Reader
        public void mark(int i8) {
            this.f5486b = this.f5485a;
        }

        @Override // java.io.Reader
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.Reader
        public int read() {
            if (!ready()) {
                return -1;
            }
            c cVar = c.this;
            int i8 = this.f5485a;
            this.f5485a = i8 + 1;
            return cVar.charAt(i8);
        }

        @Override // java.io.Reader
        public boolean ready() {
            return this.f5485a < c.this.size();
        }

        @Override // java.io.Reader
        public void reset() {
            this.f5485a = this.f5486b;
        }

        @Override // java.io.Reader
        public long skip(long j8) {
            if (this.f5485a + j8 > c.this.size()) {
                j8 = c.this.size() - this.f5485a;
            }
            if (j8 < 0) {
                return 0L;
            }
            this.f5485a = Math.addExact(this.f5485a, Math.toIntExact(j8));
            return j8;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i8, int i9) {
            int i10;
            if (i8 < 0 || i9 < 0 || i8 > cArr.length || (i10 = i8 + i9) > cArr.length || i10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i9 == 0) {
                return 0;
            }
            if (this.f5485a >= c.this.size()) {
                return -1;
            }
            if (this.f5485a + i9 > c.this.size()) {
                i9 = c.this.size() - this.f5485a;
            }
            c cVar = c.this;
            int i11 = this.f5485a;
            cVar.getChars(i11, i11 + i9, cArr, i8);
            this.f5485a += i9;
            return i9;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public c(int i8) {
        this.f5481a = new char[i8 <= 0 ? 32 : i8];
    }

    public c appendAll(Iterator<?> it) {
        if (it != null) {
            it.forEachRemaining(new X7.b(this));
        }
        return this;
    }

    public c appendFixedWidthPadLeft(Object obj, int i8, char c9) {
        if (i8 > 0) {
            ensureCapacity(this.f5482b + i8);
            String string = O.toString(obj, new X7.a(this));
            if (string == null) {
                string = "";
            }
            int length = string.length();
            if (length >= i8) {
                string.getChars(length - i8, length, this.f5481a, this.f5482b);
            } else {
                int i9 = i8 - length;
                for (int i10 = 0; i10 < i9; i10++) {
                    this.f5481a[this.f5482b + i10] = c9;
                }
                string.getChars(0, length, this.f5481a, this.f5482b + i9);
            }
            this.f5482b += i8;
        }
        return this;
    }

    public c appendFixedWidthPadRight(Object obj, int i8, char c9) {
        if (i8 > 0) {
            ensureCapacity(this.f5482b + i8);
            String string = O.toString(obj, new X7.a(this));
            if (string == null) {
                string = "";
            }
            int length = string.length();
            if (length >= i8) {
                string.getChars(0, i8, this.f5481a, this.f5482b);
            } else {
                int i9 = i8 - length;
                string.getChars(0, length, this.f5481a, this.f5482b);
                for (int i10 = 0; i10 < i9; i10++) {
                    this.f5481a[this.f5482b + length + i10] = c9;
                }
            }
            this.f5482b += i8;
        }
        return this;
    }

    public c appendln(char c9) {
        return append(c9).appendNewLine();
    }

    @Override // R7.a
    public String build() {
        return toString();
    }

    public boolean equals(c cVar) {
        int i8;
        if (this == cVar) {
            return true;
        }
        if (cVar == null || (i8 = this.f5482b) != cVar.f5482b) {
            return false;
        }
        char[] cArr = this.f5481a;
        char[] cArr2 = cVar.f5481a;
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            if (cArr[i9] != cArr2[i9]) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(char c9, int i8) {
        int iMax = Math.max(i8, 0);
        if (iMax >= this.f5482b) {
            return -1;
        }
        char[] cArr = this.f5481a;
        while (iMax < this.f5482b) {
            if (cArr[iMax] == c9) {
                return iMax;
            }
            iMax++;
        }
        return -1;
    }

    public int lastIndexOf(char c9, int i8) {
        int i9 = this.f5482b;
        if (i8 >= i9) {
            i8 = i9 - 1;
        }
        if (i8 < 0) {
            return -1;
        }
        while (i8 >= 0) {
            if (this.f5481a[i8] == c9) {
                return i8;
            }
            i8--;
        }
        return -1;
    }

    public String substring(int i8, int i9) {
        return new String(this.f5481a, i8, e(i8, i9) - i8);
    }

    public <T> c appendAll(T... tArr) {
        if (C0708l.isNotEmpty(tArr)) {
            for (T t8 : tArr) {
                append(t8);
            }
        }
        return this;
    }

    public c appendSeparator(char c9, char c10) {
        if (isNotEmpty()) {
            append(c9);
        } else {
            append(c10);
        }
        return this;
    }

    public c appendln(char[] cArr) {
        return append(cArr).appendNewLine();
    }

    public c(String str) {
        if (str == null) {
            this.f5481a = new char[32];
        } else {
            this.f5481a = new char[str.length() + 32];
            append(str);
        }
    }

    public c append(boolean z8) {
        if (z8) {
            ensureCapacity(this.f5482b + 4);
            char[] cArr = this.f5481a;
            int i8 = this.f5482b;
            int i9 = i8 + 1;
            this.f5482b = i9;
            cArr[i8] = 't';
            int i10 = i8 + 2;
            this.f5482b = i10;
            cArr[i9] = 'r';
            this.f5482b = i8 + 3;
            cArr[i10] = 'u';
        } else {
            ensureCapacity(this.f5482b + 5);
            char[] cArr2 = this.f5481a;
            int i11 = this.f5482b;
            int i12 = i11 + 1;
            this.f5482b = i12;
            cArr2[i11] = 'f';
            int i13 = i11 + 2;
            this.f5482b = i13;
            cArr2[i12] = 'a';
            int i14 = i11 + 3;
            this.f5482b = i14;
            cArr2[i13] = 'l';
            this.f5482b = i11 + 4;
            cArr2[i14] = 's';
        }
        char[] cArr3 = this.f5481a;
        int i15 = this.f5482b;
        this.f5482b = i15 + 1;
        cArr3[i15] = 'e';
        return this;
    }

    public c appendln(char[] cArr, int i8, int i9) {
        return append(cArr, i8, i9).appendNewLine();
    }

    public boolean contains(String str) {
        return indexOf(str, 0) >= 0;
    }

    public c deleteFirst(String str) {
        int iIndexOf;
        int length = X.length(str);
        if (length > 0 && (iIndexOf = indexOf(str, 0)) >= 0) {
            a(iIndexOf, iIndexOf + length, length);
        }
        return this;
    }

    public int lastIndexOf(String str) {
        return lastIndexOf(str, this.f5482b - 1);
    }

    public c replace(d dVar, String str, int i8, int i9, int i10) {
        return b(dVar, str, i8, e(i8, i9), i10);
    }

    public c replaceAll(String str, String str2) {
        int length = X.length(str);
        if (length > 0) {
            int length2 = X.length(str2);
            int iIndexOf = indexOf(str, 0);
            while (iIndexOf >= 0) {
                c(iIndexOf, iIndexOf + length, length, str2, length2);
                iIndexOf = indexOf(str, iIndexOf + length2);
            }
        }
        return this;
    }

    public c replaceFirst(String str, String str2) {
        int iIndexOf;
        int length = X.length(str);
        if (length > 0 && (iIndexOf = indexOf(str, 0)) >= 0) {
            c(iIndexOf, iIndexOf + length, length, str2, X.length(str2));
        }
        return this;
    }

    public c appendln(double d9) {
        return append(d9).appendNewLine();
    }

    public boolean contains(d dVar) {
        return indexOf(dVar, 0) >= 0;
    }

    public void getChars(int i8, int i9, char[] cArr, int i10) {
        if (i8 >= 0) {
            if (i9 < 0 || i9 > length()) {
                throw new StringIndexOutOfBoundsException(i9);
            }
            if (i8 <= i9) {
                System.arraycopy(this.f5481a, i8, cArr, i10, i9 - i8);
                return;
            }
            throw new StringIndexOutOfBoundsException("end < start");
        }
        throw new StringIndexOutOfBoundsException(i8);
    }

    public int lastIndexOf(String str, int i8) {
        return X.lastIndexOf(this, str, i8);
    }

    public char[] toCharArray(int i8, int i9) {
        int iE = e(i8, i9) - i8;
        if (iE == 0) {
            return C0708l.EMPTY_CHAR_ARRAY;
        }
        char[] cArr = new char[iE];
        System.arraycopy(this.f5481a, i8, cArr, 0, iE);
        return cArr;
    }

    public c appendSeparator(char c9, int i8) {
        if (i8 > 0) {
            append(c9);
        }
        return this;
    }

    public c appendln(float f8) {
        return append(f8).appendNewLine();
    }

    public c deleteAll(String str) {
        int length = X.length(str);
        if (length > 0) {
            int iIndexOf = indexOf(str, 0);
            while (iIndexOf >= 0) {
                a(iIndexOf, iIndexOf + length, length);
                iIndexOf = indexOf(str, iIndexOf);
            }
        }
        return this;
    }

    public int lastIndexOf(d dVar) {
        return lastIndexOf(dVar, this.f5482b);
    }

    public c appendSeparator(String str) {
        return appendSeparator(str, (String) null);
    }

    public c appendWithSeparators(Iterator<?> it, String str) {
        if (it != null) {
            String string = Objects.toString(str, "");
            while (it.hasNext()) {
                append(it.next());
                if (it.hasNext()) {
                    append(string);
                }
            }
        }
        return this;
    }

    public c appendln(int i8) {
        return append(i8).appendNewLine();
    }

    public c deleteFirst(d dVar) {
        return replace(dVar, null, 0, this.f5482b, 1);
    }

    public int indexOf(String str) {
        return indexOf(str, 0);
    }

    public int lastIndexOf(d dVar, int i8) {
        int i9 = this.f5482b;
        if (i8 >= i9) {
            i8 = i9 - 1;
        }
        if (dVar != null && i8 >= 0) {
            char[] cArr = this.f5481a;
            int i10 = i8 + 1;
            while (i8 >= 0) {
                if (dVar.isMatch(cArr, i8, 0, i10) > 0) {
                    return i8;
                }
                i8--;
            }
        }
        return -1;
    }

    public c appendSeparator(String str, int i8) {
        if (str != null && i8 > 0) {
            append(str);
        }
        return this;
    }

    public c appendln(long j8) {
        return append(j8).appendNewLine();
    }

    public int indexOf(String str, int i8) {
        return X.indexOf(this, str, i8);
    }

    public c replaceFirst(d dVar, String str) {
        return replace(dVar, str, 0, this.f5482b, 1);
    }

    public c appendSeparator(String str, String str2) {
        if (isEmpty()) {
            str = str2;
        }
        if (str != null) {
            append(str);
        }
        return this;
    }

    public c appendln(Object obj) {
        return append(obj).appendNewLine();
    }

    public int indexOf(d dVar) {
        return indexOf(dVar, 0);
    }

    public c replaceAll(d dVar, String str) {
        return replace(dVar, str, 0, this.f5482b, -1);
    }

    public c appendln(c cVar) {
        return append(cVar).appendNewLine();
    }

    public c deleteAll(d dVar) {
        return replace(dVar, null, 0, this.f5482b, -1);
    }

    public int indexOf(d dVar, int i8) {
        int i9;
        int iMax = Math.max(i8, 0);
        if (dVar != null && iMax < (i9 = this.f5482b)) {
            char[] cArr = this.f5481a;
            for (int i10 = iMax; i10 < i9; i10++) {
                if (dVar.isMatch(cArr, i10, iMax, i9) > 0) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public c appendln(c cVar, int i8, int i9) {
        return append(cVar, i8, i9).appendNewLine();
    }

    public c appendWithSeparators(Object[] objArr, String str) {
        if (objArr != null && objArr.length > 0) {
            String string = Objects.toString(str, "");
            append(objArr[0]);
            for (int i8 = 1; i8 < objArr.length; i8++) {
                append(string);
                append(objArr[i8]);
            }
        }
        return this;
    }

    public c appendln(String str) {
        return append(str).appendNewLine();
    }

    public c appendln(String str, int i8, int i9) {
        return append(str, i8, i9).appendNewLine();
    }

    @Override // java.lang.Appendable
    public c append(char c9) {
        ensureCapacity(length() + 1);
        char[] cArr = this.f5481a;
        int i8 = this.f5482b;
        this.f5482b = i8 + 1;
        cArr[i8] = c9;
        return this;
    }

    public c appendln(String str, Object... objArr) {
        return append(str, objArr).appendNewLine();
    }

    public c appendln(StringBuffer stringBuffer) {
        return append(stringBuffer).appendNewLine();
    }

    public c appendln(StringBuffer stringBuffer, int i8, int i9) {
        return append(stringBuffer, i8, i9).appendNewLine();
    }

    public c append(char[] cArr) {
        if (cArr == null) {
            return appendNull();
        }
        int length = cArr.length;
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            System.arraycopy(cArr, 0, this.f5481a, length2, length);
            this.f5482b += length;
        }
        return this;
    }

    public c appendln(StringBuilder sb) {
        return append(sb).appendNewLine();
    }

    public c insert(int i8, char c9) {
        d(i8);
        ensureCapacity(this.f5482b + 1);
        char[] cArr = this.f5481a;
        System.arraycopy(cArr, i8, cArr, i8 + 1, this.f5482b - i8);
        this.f5481a[i8] = c9;
        this.f5482b++;
        return this;
    }

    public c appendln(StringBuilder sb, int i8, int i9) {
        return append(sb, i8, i9).appendNewLine();
    }

    public c insert(int i8, char[] cArr) {
        d(i8);
        if (cArr == null) {
            return insert(i8, this.f5484d);
        }
        int length = cArr.length;
        if (length > 0) {
            ensureCapacity(this.f5482b + length);
            char[] cArr2 = this.f5481a;
            System.arraycopy(cArr2, i8, cArr2, i8 + length, this.f5482b - i8);
            System.arraycopy(cArr, 0, this.f5481a, i8, length);
            this.f5482b += length;
        }
        return this;
    }

    public c append(char[] cArr, int i8, int i9) {
        if (cArr == null) {
            return appendNull();
        }
        if (i8 >= 0 && i8 <= cArr.length) {
            if (i9 < 0 || i8 + i9 > cArr.length) {
                throw new StringIndexOutOfBoundsException("Invalid length: " + i9);
            }
            if (i9 > 0) {
                int length = length();
                ensureCapacity(length + i9);
                System.arraycopy(cArr, i8, this.f5481a, length, i9);
                this.f5482b += i9;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException("Invalid startIndex: " + i9);
    }

    public c insert(int i8, char[] cArr, int i9, int i10) {
        d(i8);
        if (cArr == null) {
            return insert(i8, this.f5484d);
        }
        if (i9 >= 0 && i9 <= cArr.length) {
            if (i10 < 0 || i9 + i10 > cArr.length) {
                throw new StringIndexOutOfBoundsException("Invalid length: " + i10);
            }
            if (i10 > 0) {
                ensureCapacity(this.f5482b + i10);
                char[] cArr2 = this.f5481a;
                System.arraycopy(cArr2, i8, cArr2, i8 + i10, this.f5482b - i8);
                System.arraycopy(cArr, i9, this.f5481a, i8, i10);
                this.f5482b += i10;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException("Invalid offset: " + i9);
    }

    public c append(CharBuffer charBuffer) {
        if (charBuffer == null) {
            return appendNull();
        }
        if (charBuffer.hasArray()) {
            int iRemaining = charBuffer.remaining();
            int length = length();
            ensureCapacity(length + iRemaining);
            System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position(), this.f5481a, length, iRemaining);
            this.f5482b += iRemaining;
        } else {
            append(charBuffer.toString());
        }
        return this;
    }

    public c insert(int i8, double d9) {
        return insert(i8, String.valueOf(d9));
    }

    public c append(CharBuffer charBuffer, int i8, int i9) {
        if (charBuffer == null) {
            return appendNull();
        }
        if (charBuffer.hasArray()) {
            int iRemaining = charBuffer.remaining();
            if (i8 < 0 || i8 > iRemaining) {
                throw new StringIndexOutOfBoundsException("startIndex must be valid");
            }
            if (i9 >= 0 && i8 + i9 <= iRemaining) {
                int length = length();
                ensureCapacity(length + i9);
                System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i8, this.f5481a, length, i9);
                this.f5482b += i9;
            } else {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
        } else {
            append(charBuffer.toString(), i8, i9);
        }
        return this;
    }

    public c insert(int i8, float f8) {
        return insert(i8, String.valueOf(f8));
    }

    public c insert(int i8, int i9) {
        return insert(i8, String.valueOf(i9));
    }

    public c insert(int i8, long j8) {
        return insert(i8, String.valueOf(j8));
    }

    public c insert(int i8, Object obj) {
        if (obj == null) {
            return insert(i8, this.f5484d);
        }
        return insert(i8, obj.toString());
    }

    public c insert(int i8, String str) {
        int length;
        d(i8);
        if (str == null) {
            str = this.f5484d;
        }
        if (str != null && (length = str.length()) > 0) {
            int i9 = this.f5482b + length;
            ensureCapacity(i9);
            char[] cArr = this.f5481a;
            System.arraycopy(cArr, i8, cArr, i8 + length, this.f5482b - i8);
            this.f5482b = i9;
            str.getChars(0, length, this.f5481a, i8);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public c append(CharSequence charSequence) {
        if (charSequence == null) {
            return appendNull();
        }
        if (charSequence instanceof c) {
            return append((c) charSequence);
        }
        if (charSequence instanceof StringBuilder) {
            return append((StringBuilder) charSequence);
        }
        if (charSequence instanceof StringBuffer) {
            return append((StringBuffer) charSequence);
        }
        if (charSequence instanceof CharBuffer) {
            return append((CharBuffer) charSequence);
        }
        return append(charSequence.toString());
    }

    @Override // java.lang.Appendable
    public c append(CharSequence charSequence, int i8, int i9) {
        if (charSequence == null) {
            return appendNull();
        }
        return append(charSequence.toString(), i8, i9);
    }

    public c append(double d9) {
        return append(String.valueOf(d9));
    }

    public c append(float f8) {
        return append(String.valueOf(f8));
    }

    public c append(int i8) {
        return append(String.valueOf(i8));
    }

    public c append(long j8) {
        return append(String.valueOf(j8));
    }

    public c append(Object obj) {
        if (obj == null) {
            return appendNull();
        }
        if (obj instanceof CharSequence) {
            return append((CharSequence) obj);
        }
        return append(obj.toString());
    }

    public c append(c cVar) {
        if (cVar == null) {
            return appendNull();
        }
        int length = cVar.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            System.arraycopy(cVar.f5481a, 0, this.f5481a, length2, length);
            this.f5482b += length;
        }
        return this;
    }

    public c append(c cVar, int i8, int i9) {
        int i10;
        if (cVar == null) {
            return appendNull();
        }
        if (i8 >= 0 && i8 <= cVar.length()) {
            if (i9 < 0 || (i10 = i8 + i9) > cVar.length()) {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            if (i9 > 0) {
                int length = length();
                ensureCapacity(length + i9);
                cVar.getChars(i8, i10, this.f5481a, length);
                this.f5482b += i9;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public c append(String str) {
        if (str == null) {
            return appendNull();
        }
        int length = str.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            str.getChars(0, length, this.f5481a, length2);
            this.f5482b += length;
        }
        return this;
    }

    public c append(String str, int i8, int i9) {
        int i10;
        if (str == null) {
            return appendNull();
        }
        if (i8 >= 0 && i8 <= str.length()) {
            if (i9 < 0 || (i10 = i8 + i9) > str.length()) {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            if (i9 > 0) {
                int length = length();
                ensureCapacity(length + i9);
                str.getChars(i8, i10, this.f5481a, length);
                this.f5482b += i9;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public c append(String str, Object... objArr) {
        return append(String.format(str, objArr));
    }

    public c append(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return appendNull();
        }
        int length = stringBuffer.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            stringBuffer.getChars(0, length, this.f5481a, length2);
            this.f5482b += length;
        }
        return this;
    }

    public c append(StringBuffer stringBuffer, int i8, int i9) {
        int i10;
        if (stringBuffer == null) {
            return appendNull();
        }
        if (i8 >= 0 && i8 <= stringBuffer.length()) {
            if (i9 < 0 || (i10 = i8 + i9) > stringBuffer.length()) {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            if (i9 > 0) {
                int length = length();
                ensureCapacity(length + i9);
                stringBuffer.getChars(i8, i10, this.f5481a, length);
                this.f5482b += i9;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public c append(StringBuilder sb) {
        if (sb == null) {
            return appendNull();
        }
        int length = sb.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            sb.getChars(0, length, this.f5481a, length2);
            this.f5482b += length;
        }
        return this;
    }

    public c append(StringBuilder sb, int i8, int i9) {
        int i10;
        if (sb == null) {
            return appendNull();
        }
        if (i8 >= 0 && i8 <= sb.length()) {
            if (i9 < 0 || (i10 = i8 + i9) > sb.length()) {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            if (i9 > 0) {
                int length = length();
                ensureCapacity(length + i9);
                sb.getChars(i8, i10, this.f5481a, length);
                this.f5482b += i9;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }
}
