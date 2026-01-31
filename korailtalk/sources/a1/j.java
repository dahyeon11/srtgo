package a1;

import b1.AbstractC1064b;

/* loaded from: classes.dex */
public class j implements InterfaceC0826c {

    /* renamed from: a */
    private final String f5797a;

    /* renamed from: b */
    private final a f5798b;

    /* renamed from: c */
    private final Z0.b f5799c;

    /* renamed from: d */
    private final Z0.m f5800d;

    /* renamed from: e */
    private final Z0.b f5801e;

    /* renamed from: f */
    private final Z0.b f5802f;

    /* renamed from: g */
    private final Z0.b f5803g;

    /* renamed from: h */
    private final Z0.b f5804h;

    /* renamed from: i */
    private final Z0.b f5805i;

    /* renamed from: j */
    private final boolean f5806j;

    /* renamed from: k */
    private final boolean f5807k;

    public enum a {
        STAR(1),
        POLYGON(2);


        /* renamed from: a */
        private final int f5809a;

        a(int i8) {
            this.f5809a = i8;
        }

        public static a forValue(int i8) {
            for (a aVar : values()) {
                if (aVar.f5809a == i8) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public j(String str, a aVar, Z0.b bVar, Z0.m mVar, Z0.b bVar2, Z0.b bVar3, Z0.b bVar4, Z0.b bVar5, Z0.b bVar6, boolean z8, boolean z9) {
        this.f5797a = str;
        this.f5798b = aVar;
        this.f5799c = bVar;
        this.f5800d = mVar;
        this.f5801e = bVar2;
        this.f5802f = bVar3;
        this.f5803g = bVar4;
        this.f5804h = bVar5;
        this.f5805i = bVar6;
        this.f5806j = z8;
        this.f5807k = z9;
    }

    public Z0.b getInnerRadius() {
        return this.f5802f;
    }

    public Z0.b getInnerRoundedness() {
        return this.f5804h;
    }

    public String getName() {
        return this.f5797a;
    }

    public Z0.b getOuterRadius() {
        return this.f5803g;
    }

    public Z0.b getOuterRoundedness() {
        return this.f5805i;
    }

    public Z0.b getPoints() {
        return this.f5799c;
    }

    public Z0.m getPosition() {
        return this.f5800d;
    }

    public Z0.b getRotation() {
        return this.f5801e;
    }

    public a getType() {
        return this.f5798b;
    }

    public boolean isHidden() {
        return this.f5806j;
    }

    public boolean isReversed() {
        return this.f5807k;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        return new V0.n(pVar, abstractC1064b, this);
    }
}
