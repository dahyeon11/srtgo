package a1;

import b1.AbstractC1064b;

/* loaded from: classes.dex */
public class q implements InterfaceC0826c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5834a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5835b;

    /* renamed from: c, reason: collision with root package name */
    private final Z0.h f5836c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5837d;

    public q(String str, int i8, Z0.h hVar, boolean z8) {
        this.f5834a = str;
        this.f5835b = i8;
        this.f5836c = hVar;
        this.f5837d = z8;
    }

    public String getName() {
        return this.f5834a;
    }

    public Z0.h getShapePath() {
        return this.f5836c;
    }

    public boolean isHidden() {
        return this.f5837d;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new V0.r(pVar, abstractC1064b, this);
    }

    public String toString() {
        return "ShapePath{name=" + this.f5834a + ", index=" + this.f5835b + '}';
    }
}
