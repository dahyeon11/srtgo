package q3;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import o3.C6035c;
import o3.InterfaceC6033a;
import o3.InterfaceC6036d;
import o3.f;
import o3.g;
import p3.InterfaceC6052a;
import p3.InterfaceC6053b;

/* renamed from: q3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6108c implements InterfaceC6053b {

    /* renamed from: c, reason: collision with root package name */
    private static final f f34922c = C6106a.f34920a;

    /* renamed from: d, reason: collision with root package name */
    private static final f f34923d = C6107b.f34921a;

    /* renamed from: e, reason: collision with root package name */
    private static final b f34924e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f34925a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f34926b = new HashMap();

    /* renamed from: q3.c$b */
    private static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f34928a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f34928a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o3.f, o3.InterfaceC6034b
        public void encode(Date date, g gVar) {
            gVar.add(f34928a.format(date));
        }
    }

    public C6108c() {
        registerEncoder(String.class, f34922c);
        registerEncoder(Boolean.class, f34923d);
        registerEncoder(Date.class, (f) f34924e);
    }

    static /* synthetic */ void d(Boolean bool, g gVar) {
        gVar.add(bool.booleanValue());
    }

    public InterfaceC6033a build() {
        return new a();
    }

    public C6108c configureWith(InterfaceC6052a interfaceC6052a) {
        interfaceC6052a.a(this);
        return this;
    }

    @Override // p3.InterfaceC6053b
    public <T> C6108c registerEncoder(Class<T> cls, InterfaceC6036d interfaceC6036d) {
        if (!this.f34925a.containsKey(cls)) {
            this.f34925a.put(cls, interfaceC6036d);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }

    /* renamed from: q3.c$a */
    class a implements InterfaceC6033a {
        a() {
        }

        @Override // o3.InterfaceC6033a
        public void encode(Object obj, Writer writer) throws IOException, C6035c {
            C6109d c6109d = new C6109d(writer, C6108c.this.f34925a, C6108c.this.f34926b);
            c6109d.a(obj);
            c6109d.b();
        }

        @Override // o3.InterfaceC6033a
        public String encode(Object obj) throws C6035c {
            StringWriter stringWriter = new StringWriter();
            try {
                encode(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    @Override // p3.InterfaceC6053b
    public <T> C6108c registerEncoder(Class<T> cls, f fVar) {
        if (!this.f34926b.containsKey(cls)) {
            this.f34926b.put(cls, fVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }
}
