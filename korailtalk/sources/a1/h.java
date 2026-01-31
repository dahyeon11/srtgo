package a1;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final a f5788a;

    /* renamed from: b, reason: collision with root package name */
    private final Z0.h f5789b;

    /* renamed from: c, reason: collision with root package name */
    private final Z0.d f5790c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5791d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public h(a aVar, Z0.h hVar, Z0.d dVar, boolean z8) {
        this.f5788a = aVar;
        this.f5789b = hVar;
        this.f5790c = dVar;
        this.f5791d = z8;
    }

    public a getMaskMode() {
        return this.f5788a;
    }

    public Z0.h getMaskPath() {
        return this.f5789b;
    }

    public Z0.d getOpacity() {
        return this.f5790c;
    }

    public boolean isInverted() {
        return this.f5791d;
    }
}
