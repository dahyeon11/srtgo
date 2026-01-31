package a1;

/* renamed from: a1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0827d {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f5762a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f5763b;

    public C0827d(float[] fArr, int[] iArr) {
        this.f5762a = fArr;
        this.f5763b = iArr;
    }

    public int[] getColors() {
        return this.f5763b;
    }

    public float[] getPositions() {
        return this.f5762a;
    }

    public int getSize() {
        return this.f5763b.length;
    }

    public void lerp(C0827d c0827d, C0827d c0827d2, float f8) {
        if (c0827d.f5763b.length == c0827d2.f5763b.length) {
            for (int i8 = 0; i8 < c0827d.f5763b.length; i8++) {
                this.f5762a[i8] = f1.i.lerp(c0827d.f5762a[i8], c0827d2.f5762a[i8], f8);
                this.f5763b[i8] = f1.d.evaluate(f8, c0827d.f5763b[i8], c0827d2.f5763b[i8]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c0827d.f5763b.length + " vs " + c0827d2.f5763b.length + ")");
    }
}
