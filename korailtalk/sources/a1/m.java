package a1;

import b1.AbstractC1064b;

/* loaded from: classes.dex */
public class m implements InterfaceC0826c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5820a;

    /* renamed from: b, reason: collision with root package name */
    private final Z0.m f5821b;

    public m(String str, Z0.m mVar) {
        this.f5820a = str;
        this.f5821b = mVar;
    }

    public Z0.m getCornerRadius() {
        return this.f5821b;
    }

    public String getName() {
        return this.f5820a;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new V0.q(pVar, abstractC1064b, this);
    }
}
