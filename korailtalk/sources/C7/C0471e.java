package C7;

import java.util.concurrent.TimeUnit;

/* renamed from: C7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0471e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f639a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f640b;

    /* renamed from: c, reason: collision with root package name */
    private final int f641c;

    /* renamed from: d, reason: collision with root package name */
    private final int f642d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f643e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f644f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f645g;

    /* renamed from: h, reason: collision with root package name */
    private final int f646h;

    /* renamed from: i, reason: collision with root package name */
    private final int f647i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f648j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f649k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f650l;

    /* renamed from: m, reason: collision with root package name */
    String f651m;
    public static final C0471e FORCE_NETWORK = new a().noCache().build();
    public static final C0471e FORCE_CACHE = new a().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* renamed from: C7.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f652a;

        /* renamed from: b, reason: collision with root package name */
        boolean f653b;

        /* renamed from: c, reason: collision with root package name */
        int f654c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f655d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f656e = -1;

        /* renamed from: f, reason: collision with root package name */
        boolean f657f;

        /* renamed from: g, reason: collision with root package name */
        boolean f658g;

        /* renamed from: h, reason: collision with root package name */
        boolean f659h;

        public C0471e build() {
            return new C0471e(this);
        }

        public a immutable() {
            this.f659h = true;
            return this;
        }

        public a maxAge(int i8, TimeUnit timeUnit) {
            if (i8 >= 0) {
                long seconds = timeUnit.toSeconds(i8);
                this.f654c = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxAge < 0: " + i8);
        }

        public a maxStale(int i8, TimeUnit timeUnit) {
            if (i8 >= 0) {
                long seconds = timeUnit.toSeconds(i8);
                this.f655d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i8);
        }

        public a minFresh(int i8, TimeUnit timeUnit) {
            if (i8 >= 0) {
                long seconds = timeUnit.toSeconds(i8);
                this.f656e = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("minFresh < 0: " + i8);
        }

        public a noCache() {
            this.f652a = true;
            return this;
        }

        public a noStore() {
            this.f653b = true;
            return this;
        }

        public a noTransform() {
            this.f658g = true;
            return this;
        }

        public a onlyIfCached() {
            this.f657f = true;
            return this;
        }
    }

    private C0471e(boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, boolean z15, String str) {
        this.f639a = z8;
        this.f640b = z9;
        this.f641c = i8;
        this.f642d = i9;
        this.f643e = z10;
        this.f644f = z11;
        this.f645g = z12;
        this.f646h = i10;
        this.f647i = i11;
        this.f648j = z13;
        this.f649k = z14;
        this.f650l = z15;
        this.f651m = str;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.f639a) {
            sb.append("no-cache, ");
        }
        if (this.f640b) {
            sb.append("no-store, ");
        }
        if (this.f641c != -1) {
            sb.append("max-age=");
            sb.append(this.f641c);
            sb.append(", ");
        }
        if (this.f642d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f642d);
            sb.append(", ");
        }
        if (this.f643e) {
            sb.append("private, ");
        }
        if (this.f644f) {
            sb.append("public, ");
        }
        if (this.f645g) {
            sb.append("must-revalidate, ");
        }
        if (this.f646h != -1) {
            sb.append("max-stale=");
            sb.append(this.f646h);
            sb.append(", ");
        }
        if (this.f647i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f647i);
            sb.append(", ");
        }
        if (this.f648j) {
            sb.append("only-if-cached, ");
        }
        if (this.f649k) {
            sb.append("no-transform, ");
        }
        if (this.f650l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static C7.C0471e parse(C7.z r22) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C7.C0471e.parse(C7.z):C7.e");
    }

    public boolean immutable() {
        return this.f650l;
    }

    public boolean isPrivate() {
        return this.f643e;
    }

    public boolean isPublic() {
        return this.f644f;
    }

    public int maxAgeSeconds() {
        return this.f641c;
    }

    public int maxStaleSeconds() {
        return this.f646h;
    }

    public int minFreshSeconds() {
        return this.f647i;
    }

    public boolean mustRevalidate() {
        return this.f645g;
    }

    public boolean noCache() {
        return this.f639a;
    }

    public boolean noStore() {
        return this.f640b;
    }

    public boolean noTransform() {
        return this.f649k;
    }

    public boolean onlyIfCached() {
        return this.f648j;
    }

    public int sMaxAgeSeconds() {
        return this.f642d;
    }

    public String toString() {
        String str = this.f651m;
        if (str != null) {
            return str;
        }
        String strA = a();
        this.f651m = strA;
        return strA;
    }

    C0471e(a aVar) {
        this.f639a = aVar.f652a;
        this.f640b = aVar.f653b;
        this.f641c = aVar.f654c;
        this.f642d = -1;
        this.f643e = false;
        this.f644f = false;
        this.f645g = false;
        this.f646h = aVar.f655d;
        this.f647i = aVar.f656e;
        this.f648j = aVar.f657f;
        this.f649k = aVar.f658g;
        this.f650l = aVar.f659h;
    }
}
