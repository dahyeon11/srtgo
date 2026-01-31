package G3;

import F3.s;
import M3.g;

/* loaded from: classes2.dex */
public final class a extends g {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1476c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1477d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1478e;

    public a(M3.b bVar, s[] sVarArr, boolean z8, int i8, int i9) {
        super(bVar, sVarArr);
        this.f1476c = z8;
        this.f1477d = i8;
        this.f1478e = i9;
    }

    public int getNbDatablocks() {
        return this.f1477d;
    }

    public int getNbLayers() {
        return this.f1478e;
    }

    public boolean isCompact() {
        return this.f1476c;
    }
}
