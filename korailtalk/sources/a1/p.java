package a1;

import b1.AbstractC1064b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class p implements InterfaceC0826c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5831a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5832b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5833c;

    public p(String str, List<InterfaceC0826c> list, boolean z8) {
        this.f5831a = str;
        this.f5832b = list;
        this.f5833c = z8;
    }

    public List<InterfaceC0826c> getItems() {
        return this.f5832b;
    }

    public String getName() {
        return this.f5831a;
    }

    public boolean isHidden() {
        return this.f5833c;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new V0.d(pVar, abstractC1064b, this);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f5831a + "' Shapes: " + Arrays.toString(this.f5832b.toArray()) + '}';
    }
}
