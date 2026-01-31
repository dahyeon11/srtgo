package io.grpc;

import e3.p;
import io.grpc.AbstractC5794n;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.e */
/* loaded from: classes.dex */
public final class C5721e {
    public static final C5721e DEFAULT;

    /* renamed from: a */
    private final C5806x f32099a;

    /* renamed from: b */
    private final Executor f32100b;

    /* renamed from: c */
    private final String f32101c;

    /* renamed from: d */
    private final AbstractC5719d f32102d;

    /* renamed from: e */
    private final String f32103e;

    /* renamed from: f */
    private final Object[][] f32104f;

    /* renamed from: g */
    private final List f32105g;

    /* renamed from: h */
    private final Boolean f32106h;

    /* renamed from: i */
    private final Integer f32107i;

    /* renamed from: j */
    private final Integer f32108j;

    /* renamed from: io.grpc.e$b */
    static class b {

        /* renamed from: a */
        C5806x f32109a;

        /* renamed from: b */
        Executor f32110b;

        /* renamed from: c */
        String f32111c;

        /* renamed from: d */
        AbstractC5719d f32112d;

        /* renamed from: e */
        String f32113e;

        /* renamed from: f */
        Object[][] f32114f;

        /* renamed from: g */
        List f32115g;

        /* renamed from: h */
        Boolean f32116h;

        /* renamed from: i */
        Integer f32117i;

        /* renamed from: j */
        Integer f32118j;

        b() {
        }

        public C5721e b() {
            return new C5721e(this);
        }
    }

    /* renamed from: io.grpc.e$c */
    public static final class c {

        /* renamed from: a */
        private final String f32119a;

        /* renamed from: b */
        private final Object f32120b;

        private c(String str, Object obj) {
            this.f32119a = str;
            this.f32120b = obj;
        }

        public static <T> c create(String str) {
            e3.w.checkNotNull(str, "debugString");
            return new c(str, null);
        }

        public static <T> c createWithDefault(String str, T t8) {
            e3.w.checkNotNull(str, "debugString");
            return new c(str, t8);
        }

        @Deprecated
        public static <T> c of(String str, T t8) {
            e3.w.checkNotNull(str, "debugString");
            return new c(str, t8);
        }

        public Object getDefault() {
            return this.f32120b;
        }

        public String toString() {
            return this.f32119a;
        }
    }

    static {
        b bVar = new b();
        bVar.f32114f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        bVar.f32115g = Collections.emptyList();
        DEFAULT = bVar.b();
    }

    /* synthetic */ C5721e(b bVar, a aVar) {
        this(bVar);
    }

    private static b a(C5721e c5721e) {
        b bVar = new b();
        bVar.f32109a = c5721e.f32099a;
        bVar.f32110b = c5721e.f32100b;
        bVar.f32111c = c5721e.f32101c;
        bVar.f32112d = c5721e.f32102d;
        bVar.f32113e = c5721e.f32103e;
        bVar.f32114f = c5721e.f32104f;
        bVar.f32115g = c5721e.f32105g;
        bVar.f32116h = c5721e.f32106h;
        bVar.f32117i = c5721e.f32107i;
        bVar.f32118j = c5721e.f32108j;
        return bVar;
    }

    public String getAuthority() {
        return this.f32101c;
    }

    public String getCompressor() {
        return this.f32103e;
    }

    public AbstractC5719d getCredentials() {
        return this.f32102d;
    }

    public C5806x getDeadline() {
        return this.f32099a;
    }

    public Executor getExecutor() {
        return this.f32100b;
    }

    public Integer getMaxInboundMessageSize() {
        return this.f32107i;
    }

    public Integer getMaxOutboundMessageSize() {
        return this.f32108j;
    }

    public <T> T getOption(c cVar) {
        e3.w.checkNotNull(cVar, "key");
        int i8 = 0;
        while (true) {
            Object[][] objArr = this.f32104f;
            if (i8 >= objArr.length) {
                return (T) cVar.f32120b;
            }
            if (cVar.equals(objArr[i8][0])) {
                return (T) this.f32104f[i8][1];
            }
            i8++;
        }
    }

    public List<AbstractC5794n.a> getStreamTracerFactories() {
        return this.f32105g;
    }

    public boolean isWaitForReady() {
        return Boolean.TRUE.equals(this.f32106h);
    }

    public String toString() {
        p.b bVarAdd = e3.p.toStringHelper(this).add("deadline", this.f32099a).add("authority", this.f32101c).add("callCredentials", this.f32102d);
        Executor executor = this.f32100b;
        return bVarAdd.add("executor", executor != null ? executor.getClass() : null).add("compressorName", this.f32103e).add("customOptions", Arrays.deepToString(this.f32104f)).add("waitForReady", isWaitForReady()).add("maxInboundMessageSize", this.f32107i).add("maxOutboundMessageSize", this.f32108j).add("streamTracerFactories", this.f32105g).toString();
    }

    public C5721e withAuthority(String str) {
        b bVarA = a(this);
        bVarA.f32111c = str;
        return bVarA.b();
    }

    public C5721e withCallCredentials(AbstractC5719d abstractC5719d) {
        b bVarA = a(this);
        bVarA.f32112d = abstractC5719d;
        return bVarA.b();
    }

    public C5721e withCompression(String str) {
        b bVarA = a(this);
        bVarA.f32113e = str;
        return bVarA.b();
    }

    public C5721e withDeadline(C5806x c5806x) {
        b bVarA = a(this);
        bVarA.f32109a = c5806x;
        return bVarA.b();
    }

    public C5721e withDeadlineAfter(long j8, TimeUnit timeUnit) {
        return withDeadline(C5806x.after(j8, timeUnit));
    }

    public C5721e withExecutor(Executor executor) {
        b bVarA = a(this);
        bVarA.f32110b = executor;
        return bVarA.b();
    }

    public C5721e withMaxInboundMessageSize(int i8) {
        e3.w.checkArgument(i8 >= 0, "invalid maxsize %s", i8);
        b bVarA = a(this);
        bVarA.f32117i = Integer.valueOf(i8);
        return bVarA.b();
    }

    public C5721e withMaxOutboundMessageSize(int i8) {
        e3.w.checkArgument(i8 >= 0, "invalid maxsize %s", i8);
        b bVarA = a(this);
        bVarA.f32118j = Integer.valueOf(i8);
        return bVarA.b();
    }

    public <T> C5721e withOption(c cVar, T t8) {
        e3.w.checkNotNull(cVar, "key");
        e3.w.checkNotNull(t8, "value");
        b bVarA = a(this);
        int i8 = 0;
        while (true) {
            Object[][] objArr = this.f32104f;
            if (i8 >= objArr.length) {
                i8 = -1;
                break;
            }
            if (cVar.equals(objArr[i8][0])) {
                break;
            }
            i8++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f32104f.length + (i8 == -1 ? 1 : 0), 2);
        bVarA.f32114f = objArr2;
        Object[][] objArr3 = this.f32104f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i8 == -1) {
            bVarA.f32114f[this.f32104f.length] = new Object[]{cVar, t8};
        } else {
            bVarA.f32114f[i8] = new Object[]{cVar, t8};
        }
        return bVarA.b();
    }

    public C5721e withStreamTracerFactory(AbstractC5794n.a aVar) {
        ArrayList arrayList = new ArrayList(this.f32105g.size() + 1);
        arrayList.addAll(this.f32105g);
        arrayList.add(aVar);
        b bVarA = a(this);
        bVarA.f32115g = Collections.unmodifiableList(arrayList);
        return bVarA.b();
    }

    public C5721e withWaitForReady() {
        b bVarA = a(this);
        bVarA.f32116h = Boolean.TRUE;
        return bVarA.b();
    }

    public C5721e withoutWaitForReady() {
        b bVarA = a(this);
        bVarA.f32116h = Boolean.FALSE;
        return bVarA.b();
    }

    private C5721e(b bVar) {
        this.f32099a = bVar.f32109a;
        this.f32100b = bVar.f32110b;
        this.f32101c = bVar.f32111c;
        this.f32102d = bVar.f32112d;
        this.f32103e = bVar.f32113e;
        this.f32104f = bVar.f32114f;
        this.f32105g = bVar.f32115g;
        this.f32106h = bVar.f32116h;
        this.f32107i = bVar.f32117i;
        this.f32108j = bVar.f32118j;
    }
}
