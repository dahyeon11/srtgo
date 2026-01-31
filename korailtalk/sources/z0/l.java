package Z0;

import W0.p;
import a1.InterfaceC0826c;
import b1.AbstractC1064b;

/* loaded from: classes.dex */
public class l implements InterfaceC0826c {

    /* renamed from: a */
    private final e f5697a;

    /* renamed from: b */
    private final m f5698b;

    /* renamed from: c */
    private final g f5699c;

    /* renamed from: d */
    private final b f5700d;

    /* renamed from: e */
    private final d f5701e;

    /* renamed from: f */
    private final b f5702f;

    /* renamed from: g */
    private final b f5703g;

    /* renamed from: h */
    private final b f5704h;

    /* renamed from: i */
    private final b f5705i;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public p createAnimation() {
        return new p(this);
    }

    public e getAnchorPoint() {
        return this.f5697a;
    }

    public b getEndOpacity() {
        return this.f5705i;
    }

    public d getOpacity() {
        return this.f5701e;
    }

    public m getPosition() {
        return this.f5698b;
    }

    public b getRotation() {
        return this.f5700d;
    }

    public g getScale() {
        return this.f5699c;
    }

    public b getSkew() {
        return this.f5702f;
    }

    public b getSkewAngle() {
        return this.f5703g;
    }

    public b getStartOpacity() {
        return this.f5704h;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return null;
    }

    public l(e eVar, m mVar, g gVar, b bVar, d dVar, b bVar2, b bVar3, b bVar4, b bVar5) {
        this.f5697a = eVar;
        this.f5698b = mVar;
        this.f5699c = gVar;
        this.f5700d = bVar;
        this.f5701e = dVar;
        this.f5704h = bVar2;
        this.f5705i = bVar3;
        this.f5702f = bVar4;
        this.f5703g = bVar5;
    }
}
