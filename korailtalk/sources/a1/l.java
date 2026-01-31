package a1;

import b1.AbstractC1064b;

/* loaded from: classes.dex */
public class l implements InterfaceC0826c {

    /* renamed from: a */
    private final String f5815a;

    /* renamed from: b */
    private final Z0.b f5816b;

    /* renamed from: c */
    private final Z0.b f5817c;

    /* renamed from: d */
    private final Z0.l f5818d;

    /* renamed from: e */
    private final boolean f5819e;

    public l(String str, Z0.b bVar, Z0.b bVar2, Z0.l lVar, boolean z8) {
        this.f5815a = str;
        this.f5816b = bVar;
        this.f5817c = bVar2;
        this.f5818d = lVar;
        this.f5819e = z8;
    }

    public Z0.b getCopies() {
        return this.f5816b;
    }

    public String getName() {
        return this.f5815a;
    }

    public Z0.b getOffset() {
        return this.f5817c;
    }

    public Z0.l getTransform() {
        return this.f5818d;
    }

    public boolean isHidden() {
        return this.f5819e;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new V0.p(pVar, abstractC1064b, this);
    }
}
