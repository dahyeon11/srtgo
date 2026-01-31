package a1;

import android.graphics.Path;
import b1.AbstractC1064b;

/* loaded from: classes.dex */
public class o implements InterfaceC0826c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5825a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f5826b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5827c;

    /* renamed from: d, reason: collision with root package name */
    private final Z0.a f5828d;

    /* renamed from: e, reason: collision with root package name */
    private final Z0.d f5829e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5830f;

    public o(String str, boolean z8, Path.FillType fillType, Z0.a aVar, Z0.d dVar, boolean z9) {
        this.f5827c = str;
        this.f5825a = z8;
        this.f5826b = fillType;
        this.f5828d = aVar;
        this.f5829e = dVar;
        this.f5830f = z9;
    }

    public Z0.a getColor() {
        return this.f5828d;
    }

    public Path.FillType getFillType() {
        return this.f5826b;
    }

    public String getName() {
        return this.f5827c;
    }

    public Z0.d getOpacity() {
        return this.f5829e;
    }

    public boolean isHidden() {
        return this.f5830f;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new V0.g(pVar, abstractC1064b, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f5825a + '}';
    }
}
