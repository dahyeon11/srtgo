package a1;

import android.graphics.Path;
import b1.AbstractC1064b;

/* loaded from: classes.dex */
public class e implements InterfaceC0826c {

    /* renamed from: a */
    private final g f5764a;

    /* renamed from: b */
    private final Path.FillType f5765b;

    /* renamed from: c */
    private final Z0.c f5766c;

    /* renamed from: d */
    private final Z0.d f5767d;

    /* renamed from: e */
    private final Z0.f f5768e;

    /* renamed from: f */
    private final Z0.f f5769f;

    /* renamed from: g */
    private final String f5770g;

    /* renamed from: h */
    private final Z0.b f5771h;

    /* renamed from: i */
    private final Z0.b f5772i;

    /* renamed from: j */
    private final boolean f5773j;

    public e(String str, g gVar, Path.FillType fillType, Z0.c cVar, Z0.d dVar, Z0.f fVar, Z0.f fVar2, Z0.b bVar, Z0.b bVar2, boolean z8) {
        this.f5764a = gVar;
        this.f5765b = fillType;
        this.f5766c = cVar;
        this.f5767d = dVar;
        this.f5768e = fVar;
        this.f5769f = fVar2;
        this.f5770g = str;
        this.f5771h = bVar;
        this.f5772i = bVar2;
        this.f5773j = z8;
    }

    public Z0.f getEndPoint() {
        return this.f5769f;
    }

    public Path.FillType getFillType() {
        return this.f5765b;
    }

    public Z0.c getGradientColor() {
        return this.f5766c;
    }

    public g getGradientType() {
        return this.f5764a;
    }

    public String getName() {
        return this.f5770g;
    }

    public Z0.d getOpacity() {
        return this.f5767d;
    }

    public Z0.f getStartPoint() {
        return this.f5768e;
    }

    public boolean isHidden() {
        return this.f5773j;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new V0.h(pVar, abstractC1064b, this);
    }
}
