package retrofit2;

import C7.A;
import C7.C;
import C7.D;
import C7.H;
import C7.I;
import C7.v;
import C7.z;
import e3.AbstractC5358c;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class u {

    /* renamed from: l, reason: collision with root package name */
    private static final char[] f36055l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f36056m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    private final String f36057a;

    /* renamed from: b, reason: collision with root package name */
    private final C7.A f36058b;

    /* renamed from: c, reason: collision with root package name */
    private String f36059c;

    /* renamed from: d, reason: collision with root package name */
    private A.a f36060d;

    /* renamed from: e, reason: collision with root package name */
    private final H.a f36061e = new H.a();

    /* renamed from: f, reason: collision with root package name */
    private final z.a f36062f;

    /* renamed from: g, reason: collision with root package name */
    private C f36063g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f36064h;

    /* renamed from: i, reason: collision with root package name */
    private D.a f36065i;

    /* renamed from: j, reason: collision with root package name */
    private v.a f36066j;

    /* renamed from: k, reason: collision with root package name */
    private I f36067k;

    private static class a extends I {

        /* renamed from: a, reason: collision with root package name */
        private final I f36068a;

        /* renamed from: b, reason: collision with root package name */
        private final C f36069b;

        a(I i8, C c9) {
            this.f36068a = i8;
            this.f36069b = c9;
        }

        @Override // C7.I
        public long contentLength() {
            return this.f36068a.contentLength();
        }

        @Override // C7.I
        public C contentType() {
            return this.f36069b;
        }

        @Override // C7.I
        public void writeTo(P7.d dVar) {
            this.f36068a.writeTo(dVar);
        }
    }

    u(String str, C7.A a9, String str2, C7.z zVar, C c9, boolean z8, boolean z9, boolean z10) {
        this.f36057a = str;
        this.f36058b = a9;
        this.f36059c = str2;
        this.f36063g = c9;
        this.f36064h = z8;
        if (zVar != null) {
            this.f36062f = zVar.newBuilder();
        } else {
            this.f36062f = new z.a();
        }
        if (z9) {
            this.f36066j = new v.a();
        } else if (z10) {
            D.a aVar = new D.a();
            this.f36065i = aVar;
            aVar.setType(D.FORM);
        }
    }

    private static String i(String str, boolean z8) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z8 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                P7.c cVar = new P7.c();
                cVar.writeUtf8(str, 0, iCharCount);
                j(cVar, str, iCharCount, length, z8);
                return cVar.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    private static void j(P7.c cVar, String str, int i8, int i9, boolean z8) {
        P7.c cVar2 = null;
        while (i8 < i9) {
            int iCodePointAt = str.codePointAt(i8);
            if (!z8 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z8 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (cVar2 == null) {
                        cVar2 = new P7.c();
                    }
                    cVar2.writeUtf8CodePoint(iCodePointAt);
                    while (!cVar2.exhausted()) {
                        byte b9 = cVar2.readByte();
                        cVar.writeByte(37);
                        char[] cArr = f36055l;
                        cVar.writeByte((int) cArr[((b9 & 255) >> 4) & 15]);
                        cVar.writeByte((int) cArr[b9 & AbstractC5358c.SI]);
                    }
                } else {
                    cVar.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i8 += Character.charCount(iCodePointAt);
        }
    }

    void a(String str, String str2, boolean z8) {
        if (z8) {
            this.f36066j.addEncoded(str, str2);
        } else {
            this.f36066j.add(str, str2);
        }
    }

    void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f36062f.add(str, str2);
            return;
        }
        try {
            this.f36063g = C.get(str2);
        } catch (IllegalArgumentException e8) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e8);
        }
    }

    void c(C7.z zVar) {
        this.f36062f.addAll(zVar);
    }

    void d(C7.z zVar, I i8) {
        this.f36065i.addPart(zVar, i8);
    }

    void e(D.b bVar) {
        this.f36065i.addPart(bVar);
    }

    void f(String str, String str2, boolean z8) {
        if (this.f36059c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z8);
        String strReplace = this.f36059c.replace("{" + str + "}", strI);
        if (!f36056m.matcher(strReplace).matches()) {
            this.f36059c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void g(String str, String str2, boolean z8) {
        String str3 = this.f36059c;
        if (str3 != null) {
            A.a aVarNewBuilder = this.f36058b.newBuilder(str3);
            this.f36060d = aVarNewBuilder;
            if (aVarNewBuilder == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f36058b + ", Relative: " + this.f36059c);
            }
            this.f36059c = null;
        }
        if (z8) {
            this.f36060d.addEncodedQueryParameter(str, str2);
        } else {
            this.f36060d.addQueryParameter(str, str2);
        }
    }

    void h(Class cls, Object obj) {
        this.f36061e.tag(cls, obj);
    }

    H.a k() {
        C7.A aResolve;
        A.a aVar = this.f36060d;
        if (aVar != null) {
            aResolve = aVar.build();
        } else {
            aResolve = this.f36058b.resolve(this.f36059c);
            if (aResolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f36058b + ", Relative: " + this.f36059c);
            }
        }
        I aVar2 = this.f36067k;
        if (aVar2 == null) {
            v.a aVar3 = this.f36066j;
            if (aVar3 != null) {
                aVar2 = aVar3.build();
            } else {
                D.a aVar4 = this.f36065i;
                if (aVar4 != null) {
                    aVar2 = aVar4.build();
                } else if (this.f36064h) {
                    aVar2 = I.create((C) null, new byte[0]);
                }
            }
        }
        C c9 = this.f36063g;
        if (c9 != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, c9);
            } else {
                this.f36062f.add("Content-Type", c9.toString());
            }
        }
        return this.f36061e.url(aResolve).headers(this.f36062f.build()).method(this.f36057a, aVar2);
    }

    void l(I i8) {
        this.f36067k = i8;
    }

    void m(Object obj) {
        this.f36059c = obj.toString();
    }
}
