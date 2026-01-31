package L6;

import J6.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final L6.a f3082a;

    /* renamed from: b, reason: collision with root package name */
    private final e f3083b;

    /* renamed from: L6.b$b, reason: collision with other inner class name */
    public static class C0054b {

        /* renamed from: a, reason: collision with root package name */
        private L6.a f3084a;

        /* renamed from: b, reason: collision with root package name */
        private e.b f3085b = new e.b();

        public b build() {
            if (this.f3084a != null) {
                return new b(this);
            }
            throw new IllegalStateException("url == null");
        }

        public C0054b header(String str, String str2) {
            this.f3085b.set(str, str2);
            return this;
        }

        public C0054b url(L6.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f3084a = aVar;
            return this;
        }
    }

    public e headers() {
        return this.f3083b;
    }

    public L6.a httpUrl() {
        return this.f3082a;
    }

    public C0054b newBuilder() {
        return new C0054b();
    }

    public String toString() {
        return "Request{url=" + this.f3082a + '}';
    }

    private b(C0054b c0054b) {
        this.f3082a = c0054b.f3084a;
        this.f3083b = c0054b.f3085b.build();
    }
}
