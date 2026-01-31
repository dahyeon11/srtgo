package g4;

import F3.s;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31349a;

    i(boolean z8) {
        this.f31349a = z8;
    }

    public void applyMirroredCorrection(s[] sVarArr) {
        if (!this.f31349a || sVarArr == null || sVarArr.length < 3) {
            return;
        }
        s sVar = sVarArr[0];
        sVarArr[0] = sVarArr[2];
        sVarArr[2] = sVar;
    }

    public boolean isMirrored() {
        return this.f31349a;
    }
}
