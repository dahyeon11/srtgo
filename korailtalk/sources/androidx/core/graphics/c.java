package androidx.core.graphics;

import a4.AbstractC0834a;
import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class c {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f8981a;

        /* renamed from: b, reason: collision with root package name */
        boolean f8982b;

        a() {
        }
    }

    private static void a(ArrayList arrayList, char c9, float[] fArr) {
        arrayList.add(new b(c9, fArr));
    }

    static float[] b(float[] fArr, int i8, int i9) {
        if (i8 > i9) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i8 < 0 || i8 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i10 = i9 - i8;
        int iMin = Math.min(i10, length - i8);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, i8, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(java.lang.String r8, int r9, androidx.core.graphics.c.a r10) {
        /*
            r0 = 0
            r10.f8982b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.f8982b = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.f8982b = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.f8981a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.c.c(java.lang.String, int, androidx.core.graphics.c$a):void");
    }

    public static boolean canMorph(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < bVarArr.length; i8++) {
            if (bVarArr[i8].f8983a != bVarArr2[i8].f8983a || bVarArr[i8].f8984b.length != bVarArr2[i8].f8984b.length) {
                return false;
            }
        }
        return true;
    }

    public static b[] createNodesFromPathData(String str) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 1;
        while (i9 < str.length()) {
            int iE = e(str, i9);
            String strTrim = str.substring(i8, iE).trim();
            if (!strTrim.isEmpty()) {
                a(arrayList, strTrim.charAt(0), d(strTrim));
            }
            i8 = iE;
            i9 = iE + 1;
        }
        if (i9 - i8 == 1 && i8 < str.length()) {
            a(arrayList, str.charAt(i8), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        try {
            b.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e8) {
            throw new RuntimeException("Error in parsing " + str, e8);
        }
    }

    private static float[] d(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i8 = 1;
            int i9 = 0;
            while (i8 < length) {
                c(str, i8, aVar);
                int i10 = aVar.f8981a;
                if (i8 < i10) {
                    fArr[i9] = Float.parseFloat(str.substring(i8, i10));
                    i9++;
                }
                i8 = aVar.f8982b ? i10 : i10 + 1;
            }
            return b(fArr, 0, i9);
        } catch (NumberFormatException e8) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e8);
        }
    }

    public static b[] deepCopyNodes(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i8 = 0; i8 < bVarArr.length; i8++) {
            bVarArr2[i8] = new b(bVarArr[i8]);
        }
        return bVarArr2;
    }

    private static int e(String str, int i8) {
        while (i8 < str.length()) {
            char cCharAt = str.charAt(i8);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i8;
            }
            i8++;
        }
        return i8;
    }

    public static void interpolatePathDataNodes(b[] bVarArr, float f8, b[] bVarArr2, b[] bVarArr3) {
        if (!interpolatePathDataNodes(bVarArr, bVarArr2, bVarArr3, f8)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    public static void nodesToPath(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c9 = 'm';
        for (b bVar : bVarArr) {
            b.e(path, fArr, c9, bVar.f8983a, bVar.f8984b);
            c9 = bVar.f8983a;
        }
    }

    public static void updateNodes(b[] bVarArr, b[] bVarArr2) {
        for (int i8 = 0; i8 < bVarArr2.length; i8++) {
            bVarArr[i8].f8983a = bVarArr2[i8].f8983a;
            for (int i9 = 0; i9 < bVarArr2[i8].f8984b.length; i9++) {
                bVarArr[i8].f8984b[i9] = bVarArr2[i8].f8984b[i9];
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private char f8983a;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f8984b;

        b(char c9, float[] fArr) {
            this.f8983a = c9;
            this.f8984b = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void e(Path path, float[] fArr, char c9, char c10, float[] fArr2) {
            int i8;
            int i9;
            int i10;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            char c11 = c10;
            boolean z8 = false;
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr[2];
            float f19 = fArr[3];
            float f20 = fArr[4];
            float f21 = fArr[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i8 = 7;
                    i9 = i8;
                    break;
                case 'C':
                case 'c':
                    i8 = 6;
                    i9 = i8;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i9 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                case androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                case 't':
                default:
                    i9 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i9 = 4;
                    break;
                case AbstractC0834a.MAX_ROWS_IN_BARCODE /* 90 */:
                case 'z':
                    path.close();
                    path.moveTo(f20, f21);
                    f16 = f20;
                    f18 = f16;
                    f17 = f21;
                    f19 = f17;
                    i9 = 2;
                    break;
            }
            float f22 = f16;
            float f23 = f17;
            float f24 = f20;
            float f25 = f21;
            int i11 = 0;
            char c12 = c9;
            while (i11 < fArr2.length) {
                if (c11 != 'A') {
                    if (c11 == 'C') {
                        i10 = i11;
                        int i12 = i10 + 2;
                        int i13 = i10 + 3;
                        int i14 = i10 + 4;
                        int i15 = i10 + 5;
                        path.cubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i12], fArr2[i13], fArr2[i14], fArr2[i15]);
                        f22 = fArr2[i14];
                        float f26 = fArr2[i15];
                        float f27 = fArr2[i12];
                        float f28 = fArr2[i13];
                        f23 = f26;
                        f19 = f28;
                        f18 = f27;
                    } else if (c11 == 'H') {
                        i10 = i11;
                        path.lineTo(fArr2[i10], f23);
                        f22 = fArr2[i10];
                    } else if (c11 == 'Q') {
                        i10 = i11;
                        int i16 = i10 + 1;
                        int i17 = i10 + 2;
                        int i18 = i10 + 3;
                        path.quadTo(fArr2[i10], fArr2[i16], fArr2[i17], fArr2[i18]);
                        float f29 = fArr2[i10];
                        float f30 = fArr2[i16];
                        f22 = fArr2[i17];
                        f23 = fArr2[i18];
                        f18 = f29;
                        f19 = f30;
                    } else if (c11 == 'V') {
                        i10 = i11;
                        path.lineTo(f22, fArr2[i10]);
                        f23 = fArr2[i10];
                    } else if (c11 != 'a') {
                        if (c11 != 'c') {
                            if (c11 == 'h') {
                                path.rLineTo(fArr2[i11], 0.0f);
                                f22 += fArr2[i11];
                            } else if (c11 != 'q') {
                                if (c11 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i11]);
                                    f11 = fArr2[i11];
                                } else if (c11 == 'L') {
                                    int i19 = i11 + 1;
                                    path.lineTo(fArr2[i11], fArr2[i19]);
                                    f22 = fArr2[i11];
                                    f23 = fArr2[i19];
                                } else if (c11 == 'M') {
                                    f22 = fArr2[i11];
                                    f23 = fArr2[i11 + 1];
                                    if (i11 > 0) {
                                        path.lineTo(f22, f23);
                                    } else {
                                        path.moveTo(f22, f23);
                                        i10 = i11;
                                        f25 = f23;
                                        f24 = f22;
                                    }
                                } else if (c11 == 'S') {
                                    if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                        f22 = (f22 * 2.0f) - f18;
                                        f23 = (f23 * 2.0f) - f19;
                                    }
                                    float f31 = f23;
                                    float f32 = f22;
                                    int i20 = i11 + 1;
                                    int i21 = i11 + 2;
                                    int i22 = i11 + 3;
                                    path.cubicTo(f32, f31, fArr2[i11], fArr2[i20], fArr2[i21], fArr2[i22]);
                                    f8 = fArr2[i11];
                                    f9 = fArr2[i20];
                                    f22 = fArr2[i21];
                                    f23 = fArr2[i22];
                                    f18 = f8;
                                    f19 = f9;
                                } else if (c11 == 'T') {
                                    if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                        f22 = (f22 * 2.0f) - f18;
                                        f23 = (f23 * 2.0f) - f19;
                                    }
                                    int i23 = i11 + 1;
                                    path.quadTo(f22, f23, fArr2[i11], fArr2[i23]);
                                    i10 = i11;
                                    f19 = f23;
                                    f18 = f22;
                                    f22 = fArr2[i11];
                                    f23 = fArr2[i23];
                                } else if (c11 == 'l') {
                                    int i24 = i11 + 1;
                                    path.rLineTo(fArr2[i11], fArr2[i24]);
                                    f22 += fArr2[i11];
                                    f11 = fArr2[i24];
                                } else if (c11 == 'm') {
                                    float f33 = fArr2[i11];
                                    f22 += f33;
                                    float f34 = fArr2[i11 + 1];
                                    f23 += f34;
                                    if (i11 > 0) {
                                        path.rLineTo(f33, f34);
                                    } else {
                                        path.rMoveTo(f33, f34);
                                        i10 = i11;
                                        f25 = f23;
                                        f24 = f22;
                                    }
                                } else if (c11 == 's') {
                                    if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                        float f35 = f22 - f18;
                                        f12 = f23 - f19;
                                        f13 = f35;
                                    } else {
                                        f13 = 0.0f;
                                        f12 = 0.0f;
                                    }
                                    int i25 = i11 + 1;
                                    int i26 = i11 + 2;
                                    int i27 = i11 + 3;
                                    path.rCubicTo(f13, f12, fArr2[i11], fArr2[i25], fArr2[i26], fArr2[i27]);
                                    f8 = fArr2[i11] + f22;
                                    f9 = fArr2[i25] + f23;
                                    f22 += fArr2[i26];
                                    f10 = fArr2[i27];
                                } else if (c11 == 't') {
                                    if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                        f14 = f22 - f18;
                                        f15 = f23 - f19;
                                    } else {
                                        f15 = 0.0f;
                                        f14 = 0.0f;
                                    }
                                    int i28 = i11 + 1;
                                    path.rQuadTo(f14, f15, fArr2[i11], fArr2[i28]);
                                    float f36 = f14 + f22;
                                    float f37 = f15 + f23;
                                    f22 += fArr2[i11];
                                    f23 += fArr2[i28];
                                    f19 = f37;
                                    f18 = f36;
                                }
                                f23 += f11;
                            } else {
                                int i29 = i11 + 1;
                                int i30 = i11 + 2;
                                int i31 = i11 + 3;
                                path.rQuadTo(fArr2[i11], fArr2[i29], fArr2[i30], fArr2[i31]);
                                f8 = fArr2[i11] + f22;
                                f9 = fArr2[i29] + f23;
                                f22 += fArr2[i30];
                                f10 = fArr2[i31];
                            }
                            i10 = i11;
                        } else {
                            int i32 = i11 + 2;
                            int i33 = i11 + 3;
                            int i34 = i11 + 4;
                            int i35 = i11 + 5;
                            path.rCubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i32], fArr2[i33], fArr2[i34], fArr2[i35]);
                            f8 = fArr2[i32] + f22;
                            f9 = fArr2[i33] + f23;
                            f22 += fArr2[i34];
                            f10 = fArr2[i35];
                        }
                        f23 += f10;
                        f18 = f8;
                        f19 = f9;
                        i10 = i11;
                    } else {
                        int i36 = i11 + 5;
                        int i37 = i11 + 6;
                        i10 = i11;
                        g(path, f22, f23, fArr2[i36] + f22, fArr2[i37] + f23, fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                        f22 += fArr2[i36];
                        f23 += fArr2[i37];
                    }
                    i11 = i10 + i9;
                    c12 = c10;
                    c11 = c12;
                    z8 = false;
                } else {
                    i10 = i11;
                    int i38 = i10 + 5;
                    int i39 = i10 + 6;
                    g(path, f22, f23, fArr2[i38], fArr2[i39], fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f, fArr2[i10 + 4] != 0.0f);
                    f22 = fArr2[i38];
                    f23 = fArr2[i39];
                }
                f19 = f23;
                f18 = f22;
                i11 = i10 + i9;
                c12 = c10;
                c11 = c12;
                z8 = false;
            }
            fArr[z8 ? 1 : 0] = f22;
            fArr[1] = f23;
            fArr[2] = f18;
            fArr[3] = f19;
            fArr[4] = f24;
            fArr[5] = f25;
        }

        private static void f(Path path, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
            double d18 = d11;
            int iCeil = (int) Math.ceil(Math.abs((d17 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d15);
            double dSin = Math.sin(d15);
            double dCos2 = Math.cos(d16);
            double dSin2 = Math.sin(d16);
            double d19 = -d18;
            double d20 = d19 * dCos;
            double d21 = d12 * dSin;
            double d22 = (d20 * dSin2) - (d21 * dCos2);
            double d23 = d19 * dSin;
            double d24 = d12 * dCos;
            double d25 = (dSin2 * d23) + (dCos2 * d24);
            double d26 = d17 / iCeil;
            double d27 = d25;
            double d28 = d22;
            int i8 = 0;
            double d29 = d13;
            double d30 = d14;
            double d31 = d16;
            while (i8 < iCeil) {
                double d32 = d31 + d26;
                double dSin3 = Math.sin(d32);
                double dCos3 = Math.cos(d32);
                double d33 = (d9 + ((d18 * dCos) * dCos3)) - (d21 * dSin3);
                double d34 = d10 + (d18 * dSin * dCos3) + (d24 * dSin3);
                double d35 = (d20 * dSin3) - (d21 * dCos3);
                double d36 = (dSin3 * d23) + (dCos3 * d24);
                double d37 = d32 - d31;
                double dTan = Math.tan(d37 / 2.0d);
                double dSin4 = (Math.sin(d37) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d38 = d29 + (d28 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d38, (float) (d30 + (d27 * dSin4)), (float) (d33 - (dSin4 * d35)), (float) (d34 - (dSin4 * d36)), (float) d33, (float) d34);
                i8++;
                d26 = d26;
                dSin = dSin;
                d29 = d33;
                d23 = d23;
                dCos = dCos;
                d31 = d32;
                d27 = d36;
                d28 = d35;
                iCeil = iCeil;
                d30 = d34;
                d18 = d11;
            }
        }

        private static void g(Path path, float f8, float f9, float f10, float f11, float f12, float f13, float f14, boolean z8, boolean z9) {
            double d9;
            double d10;
            double radians = Math.toRadians(f14);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d11 = f8;
            double d12 = d11 * dCos;
            double d13 = f9;
            double d14 = f12;
            double d15 = (d12 + (d13 * dSin)) / d14;
            double d16 = ((-f8) * dSin) + (d13 * dCos);
            double d17 = f13;
            double d18 = d16 / d17;
            double d19 = f11;
            double d20 = ((f10 * dCos) + (d19 * dSin)) / d14;
            double d21 = (((-f10) * dSin) + (d19 * dCos)) / d17;
            double d22 = d15 - d20;
            double d23 = d18 - d21;
            double d24 = (d15 + d20) / 2.0d;
            double d25 = (d18 + d21) / 2.0d;
            double d26 = (d22 * d22) + (d23 * d23);
            if (d26 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d27 = (1.0d / d26) - 0.25d;
            if (d27 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d26);
                float fSqrt = (float) (Math.sqrt(d26) / 1.99999d);
                g(path, f8, f9, f10, f11, f12 * fSqrt, f13 * fSqrt, f14, z8, z9);
                return;
            }
            double dSqrt = Math.sqrt(d27);
            double d28 = d22 * dSqrt;
            double d29 = dSqrt * d23;
            if (z8 == z9) {
                d9 = d24 - d29;
                d10 = d25 + d28;
            } else {
                d9 = d24 + d29;
                d10 = d25 - d28;
            }
            double dAtan2 = Math.atan2(d18 - d10, d15 - d9);
            double dAtan22 = Math.atan2(d21 - d10, d20 - d9) - dAtan2;
            if (z9 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d30 = d9 * d14;
            double d31 = d10 * d17;
            f(path, (d30 * dCos) - (d31 * dSin), (d30 * dSin) + (d31 * dCos), d14, d17, d11, d13, radians, dAtan2, dAtan22);
        }

        @Deprecated
        public static void nodesToPath(b[] bVarArr, Path path) {
            c.nodesToPath(bVarArr, path);
        }

        public float[] getParams() {
            return this.f8984b;
        }

        public char getType() {
            return this.f8983a;
        }

        public void interpolatePathDataNode(b bVar, b bVar2, float f8) {
            this.f8983a = bVar.f8983a;
            int i8 = 0;
            while (true) {
                float[] fArr = bVar.f8984b;
                if (i8 >= fArr.length) {
                    return;
                }
                this.f8984b[i8] = (fArr[i8] * (1.0f - f8)) + (bVar2.f8984b[i8] * f8);
                i8++;
            }
        }

        b(b bVar) {
            this.f8983a = bVar.f8983a;
            float[] fArr = bVar.f8984b;
            this.f8984b = c.b(fArr, 0, fArr.length);
        }
    }

    @Deprecated
    public static boolean interpolatePathDataNodes(b[] bVarArr, b[] bVarArr2, b[] bVarArr3, float f8) {
        if (bVarArr.length == bVarArr2.length && bVarArr2.length == bVarArr3.length) {
            if (!canMorph(bVarArr2, bVarArr3)) {
                return false;
            }
            for (int i8 = 0; i8 < bVarArr.length; i8++) {
                bVarArr[i8].interpolatePathDataNode(bVarArr2[i8], bVarArr3[i8], f8);
            }
            return true;
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }
}
