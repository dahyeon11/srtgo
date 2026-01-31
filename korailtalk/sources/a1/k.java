package a1;

import b1.AbstractC1064b;

/* loaded from: classes.dex */
public class k implements InterfaceC0826c {

    /* renamed from: a */
    private final String f5810a;

    /* renamed from: b */
    private final Z0.m f5811b;

    /* renamed from: c */
    private final Z0.m f5812c;

    /* renamed from: d */
    private final Z0.b f5813d;

    /* renamed from: e */
    private final boolean f5814e;

    public k(String str, Z0.m mVar, Z0.m mVar2, Z0.b bVar, boolean z8) {
        this.f5810a = str;
        this.f5811b = mVar;
        this.f5812c = mVar2;
        this.f5813d = bVar;
        this.f5814e = z8;
    }

    public Z0.b getCornerRadius() {
        return this.f5813d;
    }

    public String getName() {
        return this.f5810a;
    }

    public Z0.m getPosition() {
        return this.f5811b;
    }

    public Z0.m getSize() {
        return this.f5812c;
    }

    public boolean isHidden() {
        return this.f5814e;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new V0.o(pVar, abstractC1064b, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.f5811b + ", size=" + this.f5812c + '}';
    }
}
