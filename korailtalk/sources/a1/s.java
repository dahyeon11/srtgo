package a1;

import V0.u;
import b1.AbstractC1064b;

/* loaded from: classes.dex */
public class s implements InterfaceC0826c {

    /* renamed from: a */
    private final String f5852a;

    /* renamed from: b */
    private final a f5853b;

    /* renamed from: c */
    private final Z0.b f5854c;

    /* renamed from: d */
    private final Z0.b f5855d;

    /* renamed from: e */
    private final Z0.b f5856e;

    /* renamed from: f */
    private final boolean f5857f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i8) {
            if (i8 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i8 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i8);
        }
    }

    public s(String str, a aVar, Z0.b bVar, Z0.b bVar2, Z0.b bVar3, boolean z8) {
        this.f5852a = str;
        this.f5853b = aVar;
        this.f5854c = bVar;
        this.f5855d = bVar2;
        this.f5856e = bVar3;
        this.f5857f = z8;
    }

    public Z0.b getEnd() {
        return this.f5855d;
    }

    public String getName() {
        return this.f5852a;
    }

    public Z0.b getOffset() {
        return this.f5856e;
    }

    public Z0.b getStart() {
        return this.f5854c;
    }

    public a getType() {
        return this.f5853b;
    }

    public boolean isHidden() {
        return this.f5857f;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new u(abstractC1064b, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.f5854c + ", end: " + this.f5855d + ", offset: " + this.f5856e + "}";
    }
}
