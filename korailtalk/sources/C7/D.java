package C7;

import C7.z;
import e3.AbstractC5358c;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class D extends I {

    /* renamed from: a, reason: collision with root package name */
    private final P7.f f453a;

    /* renamed from: b, reason: collision with root package name */
    private final C f454b;

    /* renamed from: c, reason: collision with root package name */
    private final C f455c;

    /* renamed from: d, reason: collision with root package name */
    private final List f456d;

    /* renamed from: e, reason: collision with root package name */
    private long f457e = -1;
    public static final C MIXED = C.get("multipart/mixed");
    public static final C ALTERNATIVE = C.get("multipart/alternative");
    public static final C DIGEST = C.get("multipart/digest");
    public static final C PARALLEL = C.get("multipart/parallel");
    public static final C FORM = C.get("multipart/form-data");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f450f = {58, 32};

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f451g = {AbstractC5358c.CR, 10};

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f452h = {45, 45};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final P7.f f458a;

        /* renamed from: b, reason: collision with root package name */
        private C f459b;

        /* renamed from: c, reason: collision with root package name */
        private final List f460c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a addFormDataPart(String str, String str2) {
            return addPart(b.createFormData(str, str2));
        }

        public a addPart(I i8) {
            return addPart(b.create(i8));
        }

        public D build() {
            if (this.f460c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new D(this.f458a, this.f459b, this.f460c);
        }

        public a setType(C c9) {
            if (c9 == null) {
                throw new NullPointerException("type == null");
            }
            if (c9.type().equals("multipart")) {
                this.f459b = c9;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + c9);
        }

        public a(String str) {
            this.f459b = D.MIXED;
            this.f460c = new ArrayList();
            this.f458a = P7.f.encodeUtf8(str);
        }

        public a addFormDataPart(String str, String str2, I i8) {
            return addPart(b.createFormData(str, str2, i8));
        }

        public a addPart(z zVar, I i8) {
            return addPart(b.create(zVar, i8));
        }

        public a addPart(b bVar) {
            if (bVar != null) {
                this.f460c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final z f461a;

        /* renamed from: b, reason: collision with root package name */
        final I f462b;

        private b(z zVar, I i8) {
            this.f461a = zVar;
            this.f462b = i8;
        }

        public static b create(I i8) {
            return create(null, i8);
        }

        public static b createFormData(String str, String str2) {
            return createFormData(str, null, I.create((C) null, str2));
        }

        public I body() {
            return this.f462b;
        }

        public z headers() {
            return this.f461a;
        }

        public static b create(z zVar, I i8) {
            if (i8 == null) {
                throw new NullPointerException("body == null");
            }
            if (zVar != null && zVar.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (zVar == null || zVar.get("Content-Length") == null) {
                return new b(zVar, i8);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static b createFormData(String str, String str2, I i8) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            D.a(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                D.a(sb, str2);
            }
            return create(new z.a().addUnsafeNonAscii("Content-Disposition", sb.toString()).build(), i8);
        }
    }

    D(P7.f fVar, C c9, List list) {
        this.f453a = fVar;
        this.f454b = c9;
        this.f455c = C.get(c9 + "; boundary=" + fVar.utf8());
        this.f456d = D7.e.immutableList(list);
    }

    static void a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long b(P7.d dVar, boolean z8) {
        P7.c cVar;
        if (z8) {
            dVar = new P7.c();
            cVar = dVar;
        } else {
            cVar = 0;
        }
        int size = this.f456d.size();
        long j8 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) this.f456d.get(i8);
            z zVar = bVar.f461a;
            I i9 = bVar.f462b;
            dVar.write(f452h);
            dVar.write(this.f453a);
            dVar.write(f451g);
            if (zVar != null) {
                int size2 = zVar.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    dVar.writeUtf8(zVar.name(i10)).write(f450f).writeUtf8(zVar.value(i10)).write(f451g);
                }
            }
            C cContentType = i9.contentType();
            if (cContentType != null) {
                dVar.writeUtf8("Content-Type: ").writeUtf8(cContentType.toString()).write(f451g);
            }
            long jContentLength = i9.contentLength();
            if (jContentLength != -1) {
                dVar.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(f451g);
            } else if (z8) {
                cVar.clear();
                return -1L;
            }
            byte[] bArr = f451g;
            dVar.write(bArr);
            if (z8) {
                j8 += jContentLength;
            } else {
                i9.writeTo(dVar);
            }
            dVar.write(bArr);
        }
        byte[] bArr2 = f452h;
        dVar.write(bArr2);
        dVar.write(this.f453a);
        dVar.write(bArr2);
        dVar.write(f451g);
        if (!z8) {
            return j8;
        }
        long size3 = j8 + cVar.size();
        cVar.clear();
        return size3;
    }

    public String boundary() {
        return this.f453a.utf8();
    }

    @Override // C7.I
    public long contentLength() {
        long j8 = this.f457e;
        if (j8 != -1) {
            return j8;
        }
        long jB = b(null, true);
        this.f457e = jB;
        return jB;
    }

    @Override // C7.I
    public C contentType() {
        return this.f455c;
    }

    public b part(int i8) {
        return (b) this.f456d.get(i8);
    }

    public List<b> parts() {
        return this.f456d;
    }

    public int size() {
        return this.f456d.size();
    }

    public C type() {
        return this.f454b;
    }

    @Override // C7.I
    public void writeTo(P7.d dVar) {
        b(dVar, false);
    }
}
