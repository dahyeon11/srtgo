package h3;

import e3.AbstractC5358c;
import e3.C5352B;
import e3.w;
import f3.A0;
import f3.AbstractC5452b;
import f3.AbstractC5465h0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class k {

    private final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        final Charset f31512a;

        a(Charset charset) {
            this.f31512a = (Charset) w.checkNotNull(charset);
        }

        @Override // h3.g
        public k asCharSource(Charset charset) {
            return charset.equals(this.f31512a) ? k.this : super.asCharSource(charset);
        }

        @Override // h3.g
        public InputStream openStream() {
            return new u(k.this.openStream(), this.f31512a, 8192);
        }

        public String toString() {
            return k.this.toString() + ".asByteSource(" + this.f31512a + ")";
        }
    }

    private static class b extends k {

        /* renamed from: b, reason: collision with root package name */
        private static final C5352B f31514b = C5352B.onPattern("\r\n|\n|\r");

        /* renamed from: a, reason: collision with root package name */
        protected final CharSequence f31515a;

        class a extends AbstractC5452b {

            /* renamed from: c, reason: collision with root package name */
            Iterator f31516c;

            a() {
                this.f31516c = b.f31514b.split(b.this.f31515a).iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // f3.AbstractC5452b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public String computeNext() {
                if (this.f31516c.hasNext()) {
                    String str = (String) this.f31516c.next();
                    if (this.f31516c.hasNext() || !str.isEmpty()) {
                        return str;
                    }
                }
                return (String) a();
            }
        }

        protected b(CharSequence charSequence) {
            this.f31515a = (CharSequence) w.checkNotNull(charSequence);
        }

        private Iterator c() {
            return new a();
        }

        @Override // h3.k
        public boolean isEmpty() {
            return this.f31515a.length() == 0;
        }

        @Override // h3.k
        public long length() {
            return this.f31515a.length();
        }

        @Override // h3.k
        public e3.s lengthIfKnown() {
            return e3.s.of(Long.valueOf(this.f31515a.length()));
        }

        @Override // h3.k
        public Reader openStream() {
            return new i(this.f31515a);
        }

        @Override // h3.k
        public String read() {
            return this.f31515a.toString();
        }

        @Override // h3.k
        public String readFirstLine() {
            Iterator itC = c();
            if (itC.hasNext()) {
                return (String) itC.next();
            }
            return null;
        }

        @Override // h3.k
        public AbstractC5465h0 readLines() {
            return AbstractC5465h0.copyOf(c());
        }

        public String toString() {
            return "CharSource.wrap(" + AbstractC5358c.truncate(this.f31515a, 30, "...") + ")";
        }

        @Override // h3.k
        public <T> T readLines(q qVar) {
            Iterator itC = c();
            while (itC.hasNext() && qVar.a((String) itC.next())) {
            }
            return (T) qVar.getResult();
        }
    }

    private static final class c extends k {

        /* renamed from: a, reason: collision with root package name */
        private final Iterable f31518a;

        c(Iterable iterable) {
            this.f31518a = (Iterable) w.checkNotNull(iterable);
        }

        @Override // h3.k
        public boolean isEmpty() {
            Iterator it = this.f31518a.iterator();
            while (it.hasNext()) {
                if (!((k) it.next()).isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // h3.k
        public long length() {
            Iterator it = this.f31518a.iterator();
            long length = 0;
            while (it.hasNext()) {
                length += ((k) it.next()).length();
            }
            return length;
        }

        @Override // h3.k
        public e3.s lengthIfKnown() {
            Iterator it = this.f31518a.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                e3.s sVarLengthIfKnown = ((k) it.next()).lengthIfKnown();
                if (!sVarLengthIfKnown.isPresent()) {
                    return e3.s.absent();
                }
                jLongValue += ((Long) sVarLengthIfKnown.get()).longValue();
            }
            return e3.s.of(Long.valueOf(jLongValue));
        }

        @Override // h3.k
        public Reader openStream() {
            return new t(this.f31518a.iterator());
        }

        public String toString() {
            return "CharSource.concat(" + this.f31518a + ")";
        }
    }

    private static final class d extends e {

        /* renamed from: c, reason: collision with root package name */
        private static final d f31519c = new d();

        private d() {
            super("");
        }

        @Override // h3.k.b
        public String toString() {
            return "CharSource.empty()";
        }
    }

    protected k() {
    }

    private long a(Reader reader) throws IOException {
        long j8 = 0;
        while (true) {
            long jSkip = reader.skip(Long.MAX_VALUE);
            if (jSkip == 0) {
                return j8;
            }
            j8 += jSkip;
        }
    }

    public static k concat(Iterable<? extends k> iterable) {
        return new c(iterable);
    }

    public static k empty() {
        return d.f31519c;
    }

    public static k wrap(CharSequence charSequence) {
        return charSequence instanceof String ? new e((String) charSequence) : new b(charSequence);
    }

    public g asByteSource(Charset charset) {
        return new a(charset);
    }

    public long copyTo(Appendable appendable) {
        w.checkNotNull(appendable);
        try {
            return l.copy((Reader) n.create().register(openStream()), appendable);
        } finally {
        }
    }

    public boolean isEmpty() {
        e3.s sVarLengthIfKnown = lengthIfKnown();
        if (sVarLengthIfKnown.isPresent()) {
            return ((Long) sVarLengthIfKnown.get()).longValue() == 0;
        }
        n nVarCreate = n.create();
        try {
            return ((Reader) nVarCreate.register(openStream())).read() == -1;
        } catch (Throwable th) {
            try {
                throw nVarCreate.rethrow(th);
            } finally {
                nVarCreate.close();
            }
        }
    }

    public long length() {
        e3.s sVarLengthIfKnown = lengthIfKnown();
        if (sVarLengthIfKnown.isPresent()) {
            return ((Long) sVarLengthIfKnown.get()).longValue();
        }
        try {
            return a((Reader) n.create().register(openStream()));
        } finally {
        }
    }

    public e3.s lengthIfKnown() {
        return e3.s.absent();
    }

    public BufferedReader openBufferedStream() {
        Reader readerOpenStream = openStream();
        return readerOpenStream instanceof BufferedReader ? (BufferedReader) readerOpenStream : new BufferedReader(readerOpenStream);
    }

    public abstract Reader openStream();

    public String read() {
        try {
            return l.toString((Reader) n.create().register(openStream()));
        } finally {
        }
    }

    public String readFirstLine() {
        try {
            return ((BufferedReader) n.create().register(openBufferedStream())).readLine();
        } finally {
        }
    }

    public AbstractC5465h0 readLines() {
        try {
            BufferedReader bufferedReader = (BufferedReader) n.create().register(openBufferedStream());
            ArrayList arrayListNewArrayList = A0.newArrayList();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return AbstractC5465h0.copyOf((Collection) arrayListNewArrayList);
                }
                arrayListNewArrayList.add(line);
            }
        } finally {
        }
    }

    private static class e extends b {
        protected e(String str) {
            super(str);
        }

        @Override // h3.k
        public long copyTo(Appendable appendable) throws IOException {
            appendable.append(this.f31515a);
            return this.f31515a.length();
        }

        @Override // h3.k.b, h3.k
        public Reader openStream() {
            return new StringReader((String) this.f31515a);
        }

        @Override // h3.k
        public long copyTo(j jVar) {
            w.checkNotNull(jVar);
            try {
                ((Writer) n.create().register(jVar.openStream())).write((String) this.f31515a);
                return this.f31515a.length();
            } finally {
            }
        }
    }

    public static k concat(Iterator<? extends k> it) {
        return concat(AbstractC5465h0.copyOf(it));
    }

    public static k concat(k... kVarArr) {
        return concat(AbstractC5465h0.copyOf(kVarArr));
    }

    public long copyTo(j jVar) {
        w.checkNotNull(jVar);
        n nVarCreate = n.create();
        try {
            return l.copy((Reader) nVarCreate.register(openStream()), (Writer) nVarCreate.register(jVar.openStream()));
        } finally {
        }
    }

    public <T> T readLines(q qVar) {
        w.checkNotNull(qVar);
        try {
            return (T) l.readLines((Reader) n.create().register(openStream()), qVar);
        } finally {
        }
    }
}
