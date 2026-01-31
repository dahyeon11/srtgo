package a1;

import b1.AbstractC1064b;

/* renamed from: a1.b */
/* loaded from: classes.dex */
public class C0825b implements InterfaceC0826c {

    /* renamed from: a */
    private final String f5757a;

    /* renamed from: b */
    private final Z0.m f5758b;

    /* renamed from: c */
    private final Z0.f f5759c;

    /* renamed from: d */
    private final boolean f5760d;

    /* renamed from: e */
    private final boolean f5761e;

    public C0825b(String str, Z0.m mVar, Z0.f fVar, boolean z8, boolean z9) {
        this.f5757a = str;
        this.f5758b = mVar;
        this.f5759c = fVar;
        this.f5760d = z8;
        this.f5761e = z9;
    }

    public String getName() {
        return this.f5757a;
    }

    public Z0.m getPosition() {
        return this.f5758b;
    }

    public Z0.f getSize() {
        return this.f5759c;
    }

    public boolean isHidden() {
        return this.f5761e;
    }

    public boolean isReversed() {
        return this.f5760d;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new V0.f(pVar, abstractC1064b, this);
    }
}
