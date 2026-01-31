package b1;

import Q7.X;
import Z0.j;
import Z0.k;
import Z0.l;
import a1.C0824a;
import a1.InterfaceC0826c;
import d1.C5315j;
import g1.C5534a;
import java.util.List;
import java.util.Locale;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1067e {

    /* renamed from: a, reason: collision with root package name */
    private final List f11337a;

    /* renamed from: b, reason: collision with root package name */
    private final T0.h f11338b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11339c;

    /* renamed from: d, reason: collision with root package name */
    private final long f11340d;

    /* renamed from: e, reason: collision with root package name */
    private final a f11341e;

    /* renamed from: f, reason: collision with root package name */
    private final long f11342f;

    /* renamed from: g, reason: collision with root package name */
    private final String f11343g;

    /* renamed from: h, reason: collision with root package name */
    private final List f11344h;

    /* renamed from: i, reason: collision with root package name */
    private final l f11345i;

    /* renamed from: j, reason: collision with root package name */
    private final int f11346j;

    /* renamed from: k, reason: collision with root package name */
    private final int f11347k;

    /* renamed from: l, reason: collision with root package name */
    private final int f11348l;

    /* renamed from: m, reason: collision with root package name */
    private final float f11349m;

    /* renamed from: n, reason: collision with root package name */
    private final float f11350n;

    /* renamed from: o, reason: collision with root package name */
    private final int f11351o;

    /* renamed from: p, reason: collision with root package name */
    private final int f11352p;

    /* renamed from: q, reason: collision with root package name */
    private final j f11353q;

    /* renamed from: r, reason: collision with root package name */
    private final k f11354r;

    /* renamed from: s, reason: collision with root package name */
    private final Z0.b f11355s;

    /* renamed from: t, reason: collision with root package name */
    private final List f11356t;

    /* renamed from: u, reason: collision with root package name */
    private final b f11357u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f11358v;

    /* renamed from: w, reason: collision with root package name */
    private final C0824a f11359w;

    /* renamed from: x, reason: collision with root package name */
    private final C5315j f11360x;

    /* renamed from: b1.e$a */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* renamed from: b1.e$b */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public C1067e(List<InterfaceC0826c> list, T0.h hVar, String str, long j8, a aVar, long j9, String str2, List<a1.h> list2, l lVar, int i8, int i9, int i10, float f8, float f9, int i11, int i12, j jVar, k kVar, List<C5534a> list3, b bVar, Z0.b bVar2, boolean z8, C0824a c0824a, C5315j c5315j) {
        this.f11337a = list;
        this.f11338b = hVar;
        this.f11339c = str;
        this.f11340d = j8;
        this.f11341e = aVar;
        this.f11342f = j9;
        this.f11343g = str2;
        this.f11344h = list2;
        this.f11345i = lVar;
        this.f11346j = i8;
        this.f11347k = i9;
        this.f11348l = i10;
        this.f11349m = f8;
        this.f11350n = f9;
        this.f11351o = i11;
        this.f11352p = i12;
        this.f11353q = jVar;
        this.f11354r = kVar;
        this.f11356t = list3;
        this.f11357u = bVar;
        this.f11355s = bVar2;
        this.f11358v = z8;
        this.f11359w = c0824a;
        this.f11360x = c5315j;
    }

    T0.h a() {
        return this.f11338b;
    }

    List b() {
        return this.f11356t;
    }

    List c() {
        return this.f11344h;
    }

    b d() {
        return this.f11357u;
    }

    String e() {
        return this.f11339c;
    }

    long f() {
        return this.f11342f;
    }

    int g() {
        return this.f11352p;
    }

    public C0824a getBlurEffect() {
        return this.f11359w;
    }

    public C5315j getDropShadowEffect() {
        return this.f11360x;
    }

    public long getId() {
        return this.f11340d;
    }

    public a getLayerType() {
        return this.f11341e;
    }

    int h() {
        return this.f11351o;
    }

    String i() {
        return this.f11343g;
    }

    public boolean isHidden() {
        return this.f11358v;
    }

    List j() {
        return this.f11337a;
    }

    int k() {
        return this.f11348l;
    }

    int l() {
        return this.f11347k;
    }

    int m() {
        return this.f11346j;
    }

    float n() {
        return this.f11350n / this.f11338b.getDurationFrames();
    }

    j o() {
        return this.f11353q;
    }

    k p() {
        return this.f11354r;
    }

    Z0.b q() {
        return this.f11355s;
    }

    float r() {
        return this.f11349m;
    }

    l s() {
        return this.f11345i;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(e());
        sb.append(X.LF);
        C1067e c1067eLayerModelForId = this.f11338b.layerModelForId(f());
        if (c1067eLayerModelForId != null) {
            sb.append("\t\tParents: ");
            sb.append(c1067eLayerModelForId.e());
            C1067e c1067eLayerModelForId2 = this.f11338b.layerModelForId(c1067eLayerModelForId.f());
            while (c1067eLayerModelForId2 != null) {
                sb.append("->");
                sb.append(c1067eLayerModelForId2.e());
                c1067eLayerModelForId2 = this.f11338b.layerModelForId(c1067eLayerModelForId2.f());
            }
            sb.append(str);
            sb.append(X.LF);
        }
        if (!c().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(c().size());
            sb.append(X.LF);
        }
        if (m() != 0 && l() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(m()), Integer.valueOf(l()), Integer.valueOf(k())));
        }
        if (!this.f11337a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.f11337a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append(X.LF);
            }
        }
        return sb.toString();
    }
}
