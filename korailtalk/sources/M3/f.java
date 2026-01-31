package M3;

import F3.m;

/* loaded from: classes2.dex */
public final class f extends i {
    @Override // M3.i
    public b sampleGrid(b bVar, int i8, int i9, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        return sampleGrid(bVar, i8, i9, k.quadrilateralToQuadrilateral(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23));
    }

    @Override // M3.i
    public b sampleGrid(b bVar, int i8, int i9, k kVar) throws m {
        if (i8 > 0 && i9 > 0) {
            b bVar2 = new b(i8, i9);
            int i10 = i8 * 2;
            float[] fArr = new float[i10];
            for (int i11 = 0; i11 < i9; i11++) {
                float f8 = i11 + 0.5f;
                for (int i12 = 0; i12 < i10; i12 += 2) {
                    fArr[i12] = (i12 / 2) + 0.5f;
                    fArr[i12 + 1] = f8;
                }
                kVar.transformPoints(fArr);
                i.a(bVar, fArr);
                for (int i13 = 0; i13 < i10; i13 += 2) {
                    try {
                        if (bVar.get((int) fArr[i13], (int) fArr[i13 + 1])) {
                            bVar2.set(i13 / 2, i11);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw m.getNotFoundInstance();
                    }
                }
            }
            return bVar2;
        }
        throw m.getNotFoundInstance();
    }
}
