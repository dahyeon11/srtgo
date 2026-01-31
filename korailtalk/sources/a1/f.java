package a1;

import a1.r;
import b1.AbstractC1064b;
import java.util.List;

/* loaded from: classes.dex */
public class f implements InterfaceC0826c {

    /* renamed from: a */
    private final String f5774a;

    /* renamed from: b */
    private final g f5775b;

    /* renamed from: c */
    private final Z0.c f5776c;

    /* renamed from: d */
    private final Z0.d f5777d;

    /* renamed from: e */
    private final Z0.f f5778e;

    /* renamed from: f */
    private final Z0.f f5779f;

    /* renamed from: g */
    private final Z0.b f5780g;

    /* renamed from: h */
    private final r.b f5781h;

    /* renamed from: i */
    private final r.c f5782i;

    /* renamed from: j */
    private final float f5783j;

    /* renamed from: k */
    private final List f5784k;

    /* renamed from: l */
    private final Z0.b f5785l;

    /* renamed from: m */
    private final boolean f5786m;

    public f(String str, g gVar, Z0.c cVar, Z0.d dVar, Z0.f fVar, Z0.f fVar2, Z0.b bVar, r.b bVar2, r.c cVar2, float f8, List<Z0.b> list, Z0.b bVar3, boolean z8) {
        this.f5774a = str;
        this.f5775b = gVar;
        this.f5776c = cVar;
        this.f5777d = dVar;
        this.f5778e = fVar;
        this.f5779f = fVar2;
        this.f5780g = bVar;
        this.f5781h = bVar2;
        this.f5782i = cVar2;
        this.f5783j = f8;
        this.f5784k = list;
        this.f5785l = bVar3;
        this.f5786m = z8;
    }

    public r.b getCapType() {
        return this.f5781h;
    }

    public Z0.b getDashOffset() {
        return this.f5785l;
    }

    public Z0.f getEndPoint() {
        return this.f5779f;
    }

    public Z0.c getGradientColor() {
        return this.f5776c;
    }

    public g getGradientType() {
        return this.f5775b;
    }

    public r.c getJoinType() {
        return this.f5782i;
    }

    public List<Z0.b> getLineDashPattern() {
        return this.f5784k;
    }

    public float getMiterLimit() {
        return this.f5783j;
    }

    public String getName() {
        return this.f5774a;
    }

    public Z0.d getOpacity() {
        return this.f5777d;
    }

    public Z0.f getStartPoint() {
        return this.f5778e;
    }

    public Z0.b getWidth() {
        return this.f5780g;
    }

    public boolean isHidden() {
        return this.f5786m;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new V0.i(pVar, abstractC1064b, this);
    }
}
