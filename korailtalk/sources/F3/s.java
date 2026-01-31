package F3;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final float f1165a;

    /* renamed from: b, reason: collision with root package name */
    private final float f1166b;

    public s(float f8, float f9) {
        this.f1165a = f8;
        this.f1166b = f9;
    }

    private static float a(s sVar, s sVar2, s sVar3) {
        float f8 = sVar2.f1165a;
        float f9 = sVar2.f1166b;
        return ((sVar3.f1165a - f8) * (sVar.f1166b - f9)) - ((sVar3.f1166b - f9) * (sVar.f1165a - f8));
    }

    public static float distance(s sVar, s sVar2) {
        return N3.a.distance(sVar.f1165a, sVar.f1166b, sVar2.f1165a, sVar2.f1166b);
    }

    public static void orderBestPatterns(s[] sVarArr) {
        s sVar;
        s sVar2;
        s sVar3;
        float fDistance = distance(sVarArr[0], sVarArr[1]);
        float fDistance2 = distance(sVarArr[1], sVarArr[2]);
        float fDistance3 = distance(sVarArr[0], sVarArr[2]);
        if (fDistance2 >= fDistance && fDistance2 >= fDistance3) {
            sVar = sVarArr[0];
            sVar2 = sVarArr[1];
            sVar3 = sVarArr[2];
        } else if (fDistance3 < fDistance2 || fDistance3 < fDistance) {
            sVar = sVarArr[2];
            sVar2 = sVarArr[0];
            sVar3 = sVarArr[1];
        } else {
            sVar = sVarArr[1];
            sVar2 = sVarArr[0];
            sVar3 = sVarArr[2];
        }
        if (a(sVar2, sVar, sVar3) < 0.0f) {
            s sVar4 = sVar3;
            sVar3 = sVar2;
            sVar2 = sVar4;
        }
        sVarArr[0] = sVar2;
        sVarArr[1] = sVar;
        sVarArr[2] = sVar3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f1165a == sVar.f1165a && this.f1166b == sVar.f1166b) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.f1165a;
    }

    public final float getY() {
        return this.f1166b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f1165a) * 31) + Float.floatToIntBits(this.f1166b);
    }

    public final String toString() {
        return "(" + this.f1165a + ',' + this.f1166b + ')';
    }
}
