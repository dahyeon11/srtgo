package h4;

import F3.h;
import F3.m;
import F3.s;
import F3.t;
import M3.g;
import M3.i;
import M3.k;
import g4.j;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final M3.b f31559a;

    /* renamed from: b, reason: collision with root package name */
    private t f31560b;

    public c(M3.b bVar) {
        this.f31559a = bVar;
    }

    private float b(s sVar, s sVar2) {
        float fI = i((int) sVar.getX(), (int) sVar.getY(), (int) sVar2.getX(), (int) sVar2.getY());
        float fI2 = i((int) sVar2.getX(), (int) sVar2.getY(), (int) sVar.getX(), (int) sVar.getY());
        return Float.isNaN(fI) ? fI2 / 7.0f : Float.isNaN(fI2) ? fI / 7.0f : (fI + fI2) / 14.0f;
    }

    private static int c(s sVar, s sVar2, s sVar3, float f8) throws m {
        int iRound = (N3.a.round(s.distance(sVar, sVar2) / f8) + N3.a.round(s.distance(sVar, sVar3) / f8)) / 2;
        int i8 = iRound + 7;
        int i9 = i8 & 3;
        if (i9 == 0) {
            return iRound + 8;
        }
        if (i9 == 2) {
            return iRound + 6;
        }
        if (i9 != 3) {
            return i8;
        }
        throw m.getNotFoundInstance();
    }

    private static k d(s sVar, s sVar2, s sVar3, s sVar4, int i8) {
        float x8;
        float y8;
        float f8;
        float f9 = i8 - 3.5f;
        if (sVar4 != null) {
            x8 = sVar4.getX();
            y8 = sVar4.getY();
            f8 = f9 - 3.0f;
        } else {
            x8 = (sVar2.getX() - sVar.getX()) + sVar3.getX();
            y8 = (sVar2.getY() - sVar.getY()) + sVar3.getY();
            f8 = f9;
        }
        return k.quadrilateralToQuadrilateral(3.5f, 3.5f, f9, 3.5f, f8, f8, 3.5f, f9, sVar.getX(), sVar.getY(), sVar2.getX(), sVar2.getY(), x8, y8, sVar3.getX(), sVar3.getY());
    }

    private static M3.b g(M3.b bVar, k kVar, int i8) {
        return i.getInstance().sampleGrid(bVar, i8, i8, kVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r15 != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        return N3.a.distance(r19, r6, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float h(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            int r0 = r21 - r19
            int r0 = java.lang.Math.abs(r0)
            int r1 = r20 - r18
            int r1 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 <= r1) goto L11
            r0 = r3
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1d
            r4 = r18
            r1 = r19
            r6 = r20
            r5 = r21
            goto L25
        L1d:
            r1 = r18
            r4 = r19
            r5 = r20
            r6 = r21
        L25:
            int r7 = r5 - r1
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6 - r4
            int r8 = java.lang.Math.abs(r8)
            int r9 = -r7
            r10 = 2
            int r9 = r9 / r10
            r11 = -1
            if (r1 >= r5) goto L39
            r12 = r3
            goto L3a
        L39:
            r12 = r11
        L3a:
            if (r4 >= r6) goto L3d
            r11 = r3
        L3d:
            int r5 = r5 + r12
            r13 = r1
            r14 = r4
            r15 = 0
        L41:
            if (r13 == r5) goto L82
            if (r0 == 0) goto L47
            r2 = r14
            goto L48
        L47:
            r2 = r13
        L48:
            if (r0 == 0) goto L4c
            r10 = r13
            goto L4d
        L4c:
            r10 = r14
        L4d:
            if (r15 != r3) goto L57
            r16 = r0
            r0 = r3
            r19 = r5
            r3 = r17
            goto L5e
        L57:
            r3 = r17
            r16 = r0
            r19 = r5
            r0 = 0
        L5e:
            M3.b r5 = r3.f31559a
            boolean r2 = r5.get(r2, r10)
            if (r0 != r2) goto L70
            r0 = 2
            if (r15 != r0) goto L6e
            float r0 = N3.a.distance(r13, r14, r1, r4)
            return r0
        L6e:
            int r15 = r15 + 1
        L70:
            int r9 = r9 + r8
            if (r9 <= 0) goto L7a
            if (r14 == r6) goto L78
            int r14 = r14 + r11
            int r9 = r9 - r7
            goto L7a
        L78:
            r0 = 2
            goto L87
        L7a:
            int r13 = r13 + r12
            r5 = r19
            r0 = r16
            r3 = 1
            r10 = 2
            goto L41
        L82:
            r3 = r17
            r19 = r5
            r0 = r10
        L87:
            if (r15 != r0) goto L90
            r5 = r19
            float r0 = N3.a.distance(r5, r6, r1, r4)
            return r0
        L90:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.c.h(int, int, int, int):float");
    }

    private float i(int i8, int i9, int i10, int i11) {
        float width;
        float height;
        float fH = h(i8, i9, i10, i11);
        int width2 = i8 - (i10 - i8);
        int height2 = 0;
        if (width2 < 0) {
            width = i8 / (i8 - width2);
            width2 = 0;
        } else if (width2 >= this.f31559a.getWidth()) {
            width = ((this.f31559a.getWidth() - 1) - i8) / (width2 - i8);
            width2 = this.f31559a.getWidth() - 1;
        } else {
            width = 1.0f;
        }
        float f8 = i9;
        int i12 = (int) (f8 - ((i11 - i9) * width));
        if (i12 < 0) {
            height = f8 / (i9 - i12);
        } else if (i12 >= this.f31559a.getHeight()) {
            height = ((this.f31559a.getHeight() - 1) - i9) / (i12 - i9);
            height2 = this.f31559a.getHeight() - 1;
        } else {
            height2 = i12;
            height = 1.0f;
        }
        return (fH + h(i8, i9, (int) (i8 + ((width2 - i8) * height)), height2)) - 1.0f;
    }

    protected final float a(s sVar, s sVar2, s sVar3) {
        return (b(sVar, sVar2) + b(sVar, sVar3)) / 2.0f;
    }

    public g detect() {
        return detect(null);
    }

    protected final C5610a e(float f8, int i8, int i9, float f9) throws m {
        int i10 = (int) (f9 * f8);
        int iMax = Math.max(0, i8 - i10);
        int iMin = Math.min(this.f31559a.getWidth() - 1, i8 + i10) - iMax;
        float f10 = 3.0f * f8;
        if (iMin < f10) {
            throw m.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i9 - i10);
        int iMin2 = Math.min(this.f31559a.getHeight() - 1, i9 + i10) - iMax2;
        if (iMin2 >= f10) {
            return new b(this.f31559a, iMax, iMax2, iMin, iMin2, f8, this.f31560b).c();
        }
        throw m.getNotFoundInstance();
    }

    protected final g f(f fVar) throws h, m {
        C5610a c5610aE;
        d topLeft = fVar.getTopLeft();
        d topRight = fVar.getTopRight();
        d bottomLeft = fVar.getBottomLeft();
        float fA = a(topLeft, topRight, bottomLeft);
        if (fA < 1.0f) {
            throw m.getNotFoundInstance();
        }
        int iC = c(topLeft, topRight, bottomLeft, fA);
        j provisionalVersionForDimension = j.getProvisionalVersionForDimension(iC);
        int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion() - 7;
        if (provisionalVersionForDimension.getAlignmentPatternCenters().length > 0) {
            float x8 = (topRight.getX() - topLeft.getX()) + bottomLeft.getX();
            float y8 = (topRight.getY() - topLeft.getY()) + bottomLeft.getY();
            float f8 = 1.0f - (3.0f / dimensionForVersion);
            int x9 = (int) (topLeft.getX() + ((x8 - topLeft.getX()) * f8));
            int y9 = (int) (topLeft.getY() + (f8 * (y8 - topLeft.getY())));
            for (int i8 = 4; i8 <= 16; i8 <<= 1) {
                try {
                    c5610aE = e(fA, x9, y9, i8);
                    break;
                } catch (m unused) {
                }
            }
            c5610aE = null;
        } else {
            c5610aE = null;
        }
        return new g(g(this.f31559a, d(topLeft, topRight, bottomLeft, c5610aE, iC), iC), c5610aE == null ? new s[]{bottomLeft, topLeft, topRight} : new s[]{bottomLeft, topLeft, topRight, c5610aE});
    }

    public final g detect(Map<F3.e, ?> map) {
        t tVar = map == null ? null : (t) map.get(F3.e.NEED_RESULT_POINT_CALLBACK);
        this.f31560b = tVar;
        return f(new e(this.f31559a, tVar).e(map));
    }
}
