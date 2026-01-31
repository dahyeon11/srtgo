package G0;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {
    public static final int BITNESS_DEFAULT = 0;

    /* renamed from: a, reason: collision with root package name */
    private final List f1357a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1358b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1359c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1360d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1361e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1362f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1363g;

    /* renamed from: h, reason: collision with root package name */
    private int f1364h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1365i;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f1366a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1367b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1368c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private String f1369a;

            /* renamed from: b, reason: collision with root package name */
            private String f1370b;

            /* renamed from: c, reason: collision with root package name */
            private String f1371c;

            public a() {
            }

            public b build() {
                String str;
                String str2;
                String str3 = this.f1369a;
                if (str3 == null || str3.trim().isEmpty() || (str = this.f1370b) == null || str.trim().isEmpty() || (str2 = this.f1371c) == null || str2.trim().isEmpty()) {
                    throw new IllegalStateException("Brand name, major version and full version should not be null or blank.");
                }
                return new b(this.f1369a, this.f1370b, this.f1371c);
            }

            public a setBrand(String str) {
                if (str.trim().isEmpty()) {
                    throw new IllegalArgumentException("Brand should not be blank.");
                }
                this.f1369a = str;
                return this;
            }

            public a setFullVersion(String str) {
                if (str.trim().isEmpty()) {
                    throw new IllegalArgumentException("FullVersion should not be blank.");
                }
                this.f1371c = str;
                return this;
            }

            public a setMajorVersion(String str) {
                if (str.trim().isEmpty()) {
                    throw new IllegalArgumentException("MajorVersion should not be blank.");
                }
                this.f1370b = str;
                return this;
            }

            public a(b bVar) {
                this.f1369a = bVar.getBrand();
                this.f1370b = bVar.getMajorVersion();
                this.f1371c = bVar.getFullVersion();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f1366a, bVar.f1366a) && Objects.equals(this.f1367b, bVar.f1367b) && Objects.equals(this.f1368c, bVar.f1368c);
        }

        public String getBrand() {
            return this.f1366a;
        }

        public String getFullVersion() {
            return this.f1368c;
        }

        public String getMajorVersion() {
            return this.f1367b;
        }

        public int hashCode() {
            return Objects.hash(this.f1366a, this.f1367b, this.f1368c);
        }

        public String toString() {
            return this.f1366a + "," + this.f1367b + "," + this.f1368c;
        }

        private b(String str, String str2, String str3) {
            this.f1366a = str;
            this.f1367b = str2;
            this.f1368c = str3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1363g == eVar.f1363g && this.f1364h == eVar.f1364h && this.f1365i == eVar.f1365i && Objects.equals(this.f1357a, eVar.f1357a) && Objects.equals(this.f1358b, eVar.f1358b) && Objects.equals(this.f1359c, eVar.f1359c) && Objects.equals(this.f1360d, eVar.f1360d) && Objects.equals(this.f1361e, eVar.f1361e) && Objects.equals(this.f1362f, eVar.f1362f);
    }

    public String getArchitecture() {
        return this.f1361e;
    }

    public int getBitness() {
        return this.f1364h;
    }

    public List<b> getBrandVersionList() {
        return this.f1357a;
    }

    public String getFullVersion() {
        return this.f1358b;
    }

    public String getModel() {
        return this.f1362f;
    }

    public String getPlatform() {
        return this.f1359c;
    }

    public String getPlatformVersion() {
        return this.f1360d;
    }

    public int hashCode() {
        return Objects.hash(this.f1357a, this.f1358b, this.f1359c, this.f1360d, this.f1361e, this.f1362f, Boolean.valueOf(this.f1363g), Integer.valueOf(this.f1364h), Boolean.valueOf(this.f1365i));
    }

    public boolean isMobile() {
        return this.f1363g;
    }

    public boolean isWow64() {
        return this.f1365i;
    }

    private e(List list, String str, String str2, String str3, String str4, String str5, boolean z8, int i8, boolean z9) {
        this.f1357a = list;
        this.f1358b = str;
        this.f1359c = str2;
        this.f1360d = str3;
        this.f1361e = str4;
        this.f1362f = str5;
        this.f1363g = z8;
        this.f1364h = i8;
        this.f1365i = z9;
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private List f1372a;

        /* renamed from: b, reason: collision with root package name */
        private String f1373b;

        /* renamed from: c, reason: collision with root package name */
        private String f1374c;

        /* renamed from: d, reason: collision with root package name */
        private String f1375d;

        /* renamed from: e, reason: collision with root package name */
        private String f1376e;

        /* renamed from: f, reason: collision with root package name */
        private String f1377f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1378g;

        /* renamed from: h, reason: collision with root package name */
        private int f1379h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f1380i;

        public c() {
            this.f1372a = new ArrayList();
            this.f1378g = true;
            this.f1379h = 0;
            this.f1380i = false;
        }

        public e build() {
            return new e(this.f1372a, this.f1373b, this.f1374c, this.f1375d, this.f1376e, this.f1377f, this.f1378g, this.f1379h, this.f1380i);
        }

        public c setArchitecture(String str) {
            this.f1376e = str;
            return this;
        }

        public c setBitness(int i8) {
            this.f1379h = i8;
            return this;
        }

        public c setBrandVersionList(List<b> list) {
            this.f1372a = list;
            return this;
        }

        public c setFullVersion(String str) {
            if (str == null) {
                this.f1373b = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                throw new IllegalArgumentException("Full version should not be blank.");
            }
            this.f1373b = str;
            return this;
        }

        public c setMobile(boolean z8) {
            this.f1378g = z8;
            return this;
        }

        public c setModel(String str) {
            this.f1377f = str;
            return this;
        }

        public c setPlatform(String str) {
            if (str == null) {
                this.f1374c = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                throw new IllegalArgumentException("Platform should not be blank.");
            }
            this.f1374c = str;
            return this;
        }

        public c setPlatformVersion(String str) {
            this.f1375d = str;
            return this;
        }

        public c setWow64(boolean z8) {
            this.f1380i = z8;
            return this;
        }

        public c(e eVar) {
            this.f1372a = new ArrayList();
            this.f1378g = true;
            this.f1379h = 0;
            this.f1380i = false;
            this.f1372a = eVar.getBrandVersionList();
            this.f1373b = eVar.getFullVersion();
            this.f1374c = eVar.getPlatform();
            this.f1375d = eVar.getPlatformVersion();
            this.f1376e = eVar.getArchitecture();
            this.f1377f = eVar.getModel();
            this.f1378g = eVar.isMobile();
            this.f1379h = eVar.getBitness();
            this.f1380i = eVar.isWow64();
        }
    }
}
