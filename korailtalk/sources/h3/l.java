package h3;

import e3.w;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l {

    private static final class a extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private static final a f31520a = new a();

        private a() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int i8) {
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            w.checkNotNull(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            w.checkPositionIndexes(i8, i9 + i8, cArr.length);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer
        public void write(String str) {
            w.checkNotNull(str);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i8, int i9) {
            w.checkPositionIndexes(i8, i9, charSequence == null ? 4 : charSequence.length());
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i8, int i9) {
            w.checkPositionIndexes(i8, i9 + i8, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c9) {
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    static long a(Reader reader, StringBuilder sb) throws IOException {
        w.checkNotNull(reader);
        w.checkNotNull(sb);
        char[] cArr = new char[2048];
        long j8 = 0;
        while (true) {
            int i8 = reader.read(cArr);
            if (i8 == -1) {
                return j8;
            }
            sb.append(cArr, 0, i8);
            j8 += i8;
        }
    }

    public static Writer asWriter(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C5609a(appendable);
    }

    static long b(Reader reader, Writer writer) throws IOException {
        w.checkNotNull(reader);
        w.checkNotNull(writer);
        char[] cArr = new char[2048];
        long j8 = 0;
        while (true) {
            int i8 = reader.read(cArr);
            if (i8 == -1) {
                return j8;
            }
            writer.write(cArr, 0, i8);
            j8 += i8;
        }
    }

    static CharBuffer c() {
        return CharBuffer.allocate(2048);
    }

    public static long copy(Readable readable, Appendable appendable) throws IOException {
        if (readable instanceof Reader) {
            return appendable instanceof StringBuilder ? a((Reader) readable, (StringBuilder) appendable) : b((Reader) readable, asWriter(appendable));
        }
        w.checkNotNull(readable);
        w.checkNotNull(appendable);
        CharBuffer charBufferC = c();
        long jRemaining = 0;
        while (readable.read(charBufferC) != -1) {
            o.b(charBufferC);
            appendable.append(charBufferC);
            jRemaining += charBufferC.remaining();
            o.a(charBufferC);
        }
        return jRemaining;
    }

    private static StringBuilder d(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (readable instanceof Reader) {
            a((Reader) readable, sb);
        } else {
            copy(readable, sb);
        }
        return sb;
    }

    public static long exhaust(Readable readable) {
        CharBuffer charBufferC = c();
        long j8 = 0;
        while (true) {
            long j9 = readable.read(charBufferC);
            if (j9 == -1) {
                return j8;
            }
            j8 += j9;
            o.a(charBufferC);
        }
    }

    public static Writer nullWriter() {
        return a.f31520a;
    }

    public static List<String> readLines(Readable readable) throws IOException {
        ArrayList arrayList = new ArrayList();
        r rVar = new r(readable);
        while (true) {
            String line = rVar.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    public static void skipFully(Reader reader, long j8) throws IOException {
        w.checkNotNull(reader);
        while (j8 > 0) {
            long jSkip = reader.skip(j8);
            if (jSkip == 0) {
                throw new EOFException();
            }
            j8 -= jSkip;
        }
    }

    public static String toString(Readable readable) {
        return d(readable).toString();
    }

    public static <T> T readLines(Readable readable, q qVar) throws IOException {
        String line;
        w.checkNotNull(readable);
        w.checkNotNull(qVar);
        r rVar = new r(readable);
        do {
            line = rVar.readLine();
            if (line == null) {
                break;
            }
        } while (qVar.a(line));
        return (T) qVar.getResult();
    }
}
