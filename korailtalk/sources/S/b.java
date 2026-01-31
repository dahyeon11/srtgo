package S;

import R.d;
import R.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {
    public static final int AT_MOST = Integer.MIN_VALUE;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;

    /* renamed from: a */
    private final ArrayList f4544a = new ArrayList();

    /* renamed from: b */
    private a f4545b = new a();

    /* renamed from: c */
    private R.f f4546c;

    public static class a {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public e.b horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public e.b verticalBehavior;
        public int verticalDimension;
    }

    /* renamed from: S.b$b */
    public interface InterfaceC0072b {
        void didMeasures();

        void measure(R.e eVar, a aVar);
    }

    public b(R.f fVar) {
        this.f4546c = fVar;
    }

    private boolean a(InterfaceC0072b interfaceC0072b, R.e eVar, int i8) {
        this.f4545b.horizontalBehavior = eVar.getHorizontalDimensionBehaviour();
        this.f4545b.verticalBehavior = eVar.getVerticalDimensionBehaviour();
        this.f4545b.horizontalDimension = eVar.getWidth();
        this.f4545b.verticalDimension = eVar.getHeight();
        a aVar = this.f4545b;
        aVar.measuredNeedsSolverPass = false;
        aVar.measureStrategy = i8;
        e.b bVar = aVar.horizontalBehavior;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z8 = bVar == bVar2;
        boolean z9 = aVar.verticalBehavior == bVar2;
        boolean z10 = z8 && eVar.mDimensionRatio > 0.0f;
        boolean z11 = z9 && eVar.mDimensionRatio > 0.0f;
        if (z10 && eVar.mResolvedMatchConstraintDefault[0] == 4) {
            aVar.horizontalBehavior = e.b.FIXED;
        }
        if (z11 && eVar.mResolvedMatchConstraintDefault[1] == 4) {
            aVar.verticalBehavior = e.b.FIXED;
        }
        interfaceC0072b.measure(eVar, aVar);
        eVar.setWidth(this.f4545b.measuredWidth);
        eVar.setHeight(this.f4545b.measuredHeight);
        eVar.setHasBaseline(this.f4545b.measuredHasBaseline);
        eVar.setBaselineDistance(this.f4545b.measuredBaseline);
        a aVar2 = this.f4545b;
        aVar2.measureStrategy = a.SELF_DIMENSIONS;
        return aVar2.measuredNeedsSolverPass;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0098 A[PHI: r10
  0x0098: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:105:0x0062, B:107:0x0068, B:109:0x006c, B:127:0x0095, B:125:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(R.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<R.e> r0 = r13.mChildren
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.optimizeFor(r1)
            S.b$b r2 = r13.getMeasurer()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<R.e> r5 = r13.mChildren
            java.lang.Object r5 = r5.get(r4)
            R.e r5 = (R.e) r5
            boolean r6 = r5 instanceof R.h
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof R.a
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.isInVirtualLayout()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            S.l r6 = r5.horizontalRun
            if (r6 == 0) goto L48
            S.n r7 = r5.verticalRun
            if (r7 == 0) goto L48
            S.g r6 = r6.f4594d
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            S.g r6 = r7.f4594d
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            goto Lac
        L48:
            R.e$b r6 = r5.getDimensionBehaviour(r3)
            r7 = 1
            R.e$b r8 = r5.getDimensionBehaviour(r7)
            R.e$b r9 = R.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultWidth
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultHeight
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.optimizeFor(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof R.l
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.mMatchConstraintDefaultWidth
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.mMatchConstraintDefaultHeight
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L8c
            r10 = r7
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.mDimensionRatio
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = S.b.a.SELF_DIMENSIONS
            r12.a(r2, r5, r6)
            Q.e r5 = r13.mMetrics
            if (r5 == 0) goto Lac
            long r6 = r5.measuredWidgets
            r8 = 1
            long r6 = r6 + r8
            r5.measuredWidgets = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.didMeasures()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S.b.b(R.f):void");
    }

    private void c(R.f fVar, String str, int i8, int i9) {
        int minWidth = fVar.getMinWidth();
        int minHeight = fVar.getMinHeight();
        fVar.setMinWidth(0);
        fVar.setMinHeight(0);
        fVar.setWidth(i8);
        fVar.setHeight(i9);
        fVar.setMinWidth(minWidth);
        fVar.setMinHeight(minHeight);
        this.f4546c.layout();
    }

    public long solverMeasure(R.f fVar, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean zDirectMeasureWithOrientation;
        int i17;
        int i18;
        boolean z8;
        boolean z9;
        boolean z10;
        int i19;
        InterfaceC0072b interfaceC0072b;
        int i20;
        int i21;
        int i22;
        boolean z11;
        Q.e eVar;
        InterfaceC0072b measurer = fVar.getMeasurer();
        int size = fVar.mChildren.size();
        int width = fVar.getWidth();
        int height = fVar.getHeight();
        boolean zEnabled = R.k.enabled(i8, 128);
        boolean z12 = zEnabled || R.k.enabled(i8, 64);
        if (z12) {
            for (int i23 = 0; i23 < size; i23++) {
                R.e eVar2 = fVar.mChildren.get(i23);
                e.b horizontalDimensionBehaviour = eVar2.getHorizontalDimensionBehaviour();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z13 = (horizontalDimensionBehaviour == bVar) && (eVar2.getVerticalDimensionBehaviour() == bVar) && eVar2.getDimensionRatio() > 0.0f;
                if ((eVar2.isInHorizontalChain() && z13) || ((eVar2.isInVerticalChain() && z13) || (eVar2 instanceof R.l) || eVar2.isInHorizontalChain() || eVar2.isInVerticalChain())) {
                    z12 = false;
                    break;
                }
            }
        }
        if (z12 && (eVar = Q.d.sMetrics) != null) {
            eVar.measures++;
        }
        boolean z14 = z12 & ((i11 == 1073741824 && i13 == 1073741824) || zEnabled);
        int i24 = 2;
        if (z14) {
            int iMin = Math.min(fVar.getMaxWidth(), i12);
            int iMin2 = Math.min(fVar.getMaxHeight(), i14);
            if (i11 == 1073741824 && fVar.getWidth() != iMin) {
                fVar.setWidth(iMin);
                fVar.invalidateGraph();
            }
            if (i13 == 1073741824 && fVar.getHeight() != iMin2) {
                fVar.setHeight(iMin2);
                fVar.invalidateGraph();
            }
            if (i11 == 1073741824 && i13 == 1073741824) {
                zDirectMeasureWithOrientation = fVar.directMeasure(zEnabled);
                i17 = 2;
            } else {
                boolean zDirectMeasureSetup = fVar.directMeasureSetup(zEnabled);
                if (i11 == 1073741824) {
                    zDirectMeasureSetup &= fVar.directMeasureWithOrientation(zEnabled, 0);
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                if (i13 == 1073741824) {
                    zDirectMeasureWithOrientation = fVar.directMeasureWithOrientation(zEnabled, 1) & zDirectMeasureSetup;
                    i17++;
                } else {
                    zDirectMeasureWithOrientation = zDirectMeasureSetup;
                }
            }
            if (zDirectMeasureWithOrientation) {
                fVar.updateFromRuns(i11 == 1073741824, i13 == 1073741824);
            }
        } else {
            zDirectMeasureWithOrientation = false;
            i17 = 0;
        }
        if (zDirectMeasureWithOrientation && i17 == 2) {
            return 0L;
        }
        int optimizationLevel = fVar.getOptimizationLevel();
        if (size > 0) {
            b(fVar);
        }
        updateHierarchy(fVar);
        int size2 = this.f4544a.size();
        if (size > 0) {
            c(fVar, "First pass", width, height);
        }
        if (size2 > 0) {
            e.b horizontalDimensionBehaviour2 = fVar.getHorizontalDimensionBehaviour();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z15 = horizontalDimensionBehaviour2 == bVar2;
            boolean z16 = fVar.getVerticalDimensionBehaviour() == bVar2;
            int iMax = Math.max(fVar.getWidth(), this.f4546c.getMinWidth());
            int iMax2 = Math.max(fVar.getHeight(), this.f4546c.getMinHeight());
            int i25 = 0;
            boolean zNeedSolverPass = false;
            while (i25 < size2) {
                R.e eVar3 = (R.e) this.f4544a.get(i25);
                if (eVar3 instanceof R.l) {
                    int width2 = eVar3.getWidth();
                    i20 = optimizationLevel;
                    int height2 = eVar3.getHeight();
                    i21 = width;
                    boolean zA = a(measurer, eVar3, a.TRY_GIVEN_DIMENSIONS) | zNeedSolverPass;
                    Q.e eVar4 = fVar.mMetrics;
                    i22 = height;
                    if (eVar4 != null) {
                        eVar4.measuredMatchWidgets++;
                    }
                    int width3 = eVar3.getWidth();
                    int height3 = eVar3.getHeight();
                    if (width3 != width2) {
                        eVar3.setWidth(width3);
                        if (z15 && eVar3.getRight() > iMax) {
                            iMax = Math.max(iMax, eVar3.getRight() + eVar3.getAnchor(d.b.RIGHT).getMargin());
                        }
                        z11 = true;
                    } else {
                        z11 = zA;
                    }
                    if (height3 != height2) {
                        eVar3.setHeight(height3);
                        if (z16 && eVar3.getBottom() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar3.getBottom() + eVar3.getAnchor(d.b.BOTTOM).getMargin());
                        }
                        z11 = true;
                    }
                    zNeedSolverPass = z11 | ((R.l) eVar3).needSolverPass();
                } else {
                    i20 = optimizationLevel;
                    i21 = width;
                    i22 = height;
                }
                i25++;
                optimizationLevel = i20;
                width = i21;
                height = i22;
                i24 = 2;
            }
            int i26 = optimizationLevel;
            int i27 = width;
            int i28 = height;
            int i29 = i24;
            int i30 = 0;
            while (i30 < i29) {
                int i31 = 0;
                while (i31 < size2) {
                    R.e eVar5 = (R.e) this.f4544a.get(i31);
                    if (((eVar5 instanceof R.i) && !(eVar5 instanceof R.l)) || (eVar5 instanceof R.h) || eVar5.getVisibility() == 8 || ((z14 && eVar5.horizontalRun.f4594d.resolved && eVar5.verticalRun.f4594d.resolved) || (eVar5 instanceof R.l))) {
                        z10 = z14;
                        i19 = size2;
                        interfaceC0072b = measurer;
                    } else {
                        int width4 = eVar5.getWidth();
                        int height4 = eVar5.getHeight();
                        int baselineDistance = eVar5.getBaselineDistance();
                        int i32 = a.TRY_GIVEN_DIMENSIONS;
                        z10 = z14;
                        if (i30 == 1) {
                            i32 = a.USE_GIVEN_DIMENSIONS;
                        }
                        boolean zA2 = a(measurer, eVar5, i32) | zNeedSolverPass;
                        Q.e eVar6 = fVar.mMetrics;
                        i19 = size2;
                        interfaceC0072b = measurer;
                        if (eVar6 != null) {
                            eVar6.measuredMatchWidgets++;
                        }
                        int width5 = eVar5.getWidth();
                        int height5 = eVar5.getHeight();
                        if (width5 != width4) {
                            eVar5.setWidth(width5);
                            if (z15 && eVar5.getRight() > iMax) {
                                iMax = Math.max(iMax, eVar5.getRight() + eVar5.getAnchor(d.b.RIGHT).getMargin());
                            }
                            zA2 = true;
                        }
                        if (height5 != height4) {
                            eVar5.setHeight(height5);
                            if (z16 && eVar5.getBottom() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar5.getBottom() + eVar5.getAnchor(d.b.BOTTOM).getMargin());
                            }
                            zA2 = true;
                        }
                        zNeedSolverPass = (!eVar5.hasBaseline() || baselineDistance == eVar5.getBaselineDistance()) ? zA2 : true;
                    }
                    i31++;
                    size2 = i19;
                    measurer = interfaceC0072b;
                    z14 = z10;
                }
                boolean z17 = z14;
                int i33 = size2;
                InterfaceC0072b interfaceC0072b2 = measurer;
                if (!zNeedSolverPass) {
                    break;
                }
                c(fVar, "intermediate pass", i27, i28);
                i30++;
                measurer = interfaceC0072b2;
                z14 = z17;
                i29 = 2;
                zNeedSolverPass = false;
                size2 = i33;
            }
            if (zNeedSolverPass) {
                c(fVar, "2nd pass", i27, i28);
                if (fVar.getWidth() < iMax) {
                    fVar.setWidth(iMax);
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (fVar.getHeight() < iMax2) {
                    fVar.setHeight(iMax2);
                    z9 = true;
                } else {
                    z9 = z8;
                }
                if (z9) {
                    c(fVar, "3rd pass", i27, i28);
                }
            }
            i18 = i26;
        } else {
            i18 = optimizationLevel;
        }
        fVar.setOptimizationLevel(i18);
        return 0L;
    }

    public void updateHierarchy(R.f fVar) {
        this.f4544a.clear();
        int size = fVar.mChildren.size();
        for (int i8 = 0; i8 < size; i8++) {
            R.e eVar = fVar.mChildren.get(i8);
            e.b horizontalDimensionBehaviour = eVar.getHorizontalDimensionBehaviour();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == bVar || eVar.getVerticalDimensionBehaviour() == bVar) {
                this.f4544a.add(eVar);
            }
        }
        fVar.invalidateGraph();
    }
}
