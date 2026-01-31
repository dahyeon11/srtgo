package d1;

import a1.C0827d;
import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class o implements N {

    /* renamed from: a, reason: collision with root package name */
    private int f30013a;

    public o(int i8) {
        this.f30013a = i8;
    }

    private C0827d a(C0827d c0827d, List list) {
        int i8 = this.f30013a * 4;
        if (list.size() <= i8) {
            return c0827d;
        }
        float[] positions = c0827d.getPositions();
        int[] colors = c0827d.getColors();
        int size = (list.size() - i8) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i9 = 0;
        while (i8 < list.size()) {
            if (i8 % 2 == 0) {
                fArr[i9] = ((Float) list.get(i8)).floatValue();
            } else {
                fArr2[i9] = ((Float) list.get(i8)).floatValue();
                i9++;
            }
            i8++;
        }
        float[] fArrD = d(c0827d.getPositions(), fArr);
        int length = fArrD.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            float f8 = fArrD[i10];
            int iBinarySearch = Arrays.binarySearch(positions, f8);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f8);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i10] = b(f8, fArr2[iBinarySearch2], positions, colors);
            } else {
                iArr[i10] = c(f8, colors[iBinarySearch], fArr, fArr2);
            }
        }
        return new C0827d(fArrD, iArr);
    }

    private int b(float f8, float f9, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f8 == fArr[0]) {
            return iArr[0];
        }
        for (int i8 = 1; i8 < fArr.length; i8++) {
            float f10 = fArr[i8];
            if (f10 >= f8 || i8 == fArr.length - 1) {
                int i9 = i8 - 1;
                float f11 = fArr[i9];
                float f12 = (f8 - f11) / (f10 - f11);
                int i10 = iArr[i8];
                int i11 = iArr[i9];
                return Color.argb((int) (f9 * 255.0f), f1.i.lerp(Color.red(i11), Color.red(i10), f12), f1.i.lerp(Color.green(i11), Color.green(i10), f12), f1.i.lerp(Color.blue(i11), Color.blue(i10), f12));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private int c(float f8, int i8, float[] fArr, float[] fArr2) {
        float fLerp;
        if (fArr2.length < 2 || f8 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i8), Color.green(i8), Color.blue(i8));
        }
        for (int i9 = 1; i9 < fArr.length; i9++) {
            float f9 = fArr[i9];
            if (f9 >= f8 || i9 == fArr.length - 1) {
                if (f9 <= f8) {
                    fLerp = fArr2[i9];
                } else {
                    int i10 = i9 - 1;
                    float f10 = fArr[i10];
                    fLerp = f1.i.lerp(fArr2[i10], fArr2[i9], (f8 - f10) / (f9 - f10));
                }
                return Color.argb((int) (fLerp * 255.0f), Color.red(i8), Color.green(i8), Color.blue(i8));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    protected static float[] d(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f8 = i9 < fArr.length ? fArr[i9] : Float.NaN;
            float f9 = i10 < fArr2.length ? fArr2[i10] : Float.NaN;
            if (Float.isNaN(f9) || f8 < f9) {
                fArr3[i11] = f8;
                i9++;
            } else if (Float.isNaN(f8) || f9 < f8) {
                fArr3[i11] = f9;
                i10++;
            } else {
                fArr3[i11] = f8;
                i9++;
                i10++;
                i8++;
            }
        }
        return i8 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    @Override // d1.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a1.C0827d parse(e1.AbstractC5342c r18, float r19) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.o.parse(e1.c, float):a1.d");
    }
}
