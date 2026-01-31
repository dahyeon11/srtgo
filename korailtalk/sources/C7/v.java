package C7;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class v extends I {

    /* renamed from: c */
    private static final C f704c = C.get("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final List f705a;

    /* renamed from: b */
    private final List f706b;

    public static final class a {

        /* renamed from: a */
        private final List f707a;

        /* renamed from: b */
        private final List f708b;

        /* renamed from: c */
        private final Charset f709c;

        public a() {
            this(null);
        }

        public a add(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f707a.add(A.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f709c));
            this.f708b.add(A.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f709c));
            return this;
        }

        public a addEncoded(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f707a.add(A.c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f709c));
            this.f708b.add(A.c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f709c));
            return this;
        }

        public v build() {
            return new v(this.f707a, this.f708b);
        }

        public a(Charset charset) {
            this.f707a = new ArrayList();
            this.f708b = new ArrayList();
            this.f709c = charset;
        }
    }

    v(List list, List list2) {
        this.f705a = D7.e.immutableList(list);
        this.f706b = D7.e.immutableList(list2);
    }

    private long a(P7.d dVar, boolean z8) {
        P7.c cVar = z8 ? new P7.c() : dVar.buffer();
        int size = this.f705a.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (i8 > 0) {
                cVar.writeByte(38);
            }
            cVar.writeUtf8((String) this.f705a.get(i8));
            cVar.writeByte(61);
            cVar.writeUtf8((String) this.f706b.get(i8));
        }
        if (!z8) {
            return 0L;
        }
        long size2 = cVar.size();
        cVar.clear();
        return size2;
    }

    @Override // C7.I
    public long contentLength() {
        return a(null, true);
    }

    @Override // C7.I
    public C contentType() {
        return f704c;
    }

    public String encodedName(int i8) {
        return (String) this.f705a.get(i8);
    }

    public String encodedValue(int i8) {
        return (String) this.f706b.get(i8);
    }

    public String name(int i8) {
        return A.h(encodedName(i8), true);
    }

    public int size() {
        return this.f705a.size();
    }

    public String value(int i8) {
        return A.h(encodedValue(i8), true);
    }

    @Override // C7.I
    public void writeTo(P7.d dVar) {
        a(dVar, false);
    }
}
