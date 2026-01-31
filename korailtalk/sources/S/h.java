package S;

import R.d;
import R.e;
import S.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static b.a f4566a = new b.a();

    private static boolean a(R.e eVar) {
        e.b horizontalDimensionBehaviour = eVar.getHorizontalDimensionBehaviour();
        e.b verticalDimensionBehaviour = eVar.getVerticalDimensionBehaviour();
        R.f fVar = eVar.getParent() != null ? (R.f) eVar.getParent() : null;
        if (fVar != null) {
            fVar.getHorizontalDimensionBehaviour();
            e.b bVar = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.getVerticalDimensionBehaviour();
            e.b bVar2 = e.b.FIXED;
        }
        e.b bVar3 = e.b.FIXED;
        boolean z8 = horizontalDimensionBehaviour == bVar3 || horizontalDimensionBehaviour == e.b.WRAP_CONTENT || (horizontalDimensionBehaviour == e.b.MATCH_CONSTRAINT && eVar.mMatchConstraintDefaultWidth == 0 && eVar.mDimensionRatio == 0.0f && eVar.hasDanglingDimension(0)) || eVar.isResolvedHorizontally();
        boolean z9 = verticalDimensionBehaviour == bVar3 || verticalDimensionBehaviour == e.b.WRAP_CONTENT || (verticalDimensionBehaviour == e.b.MATCH_CONSTRAINT && eVar.mMatchConstraintDefaultHeight == 0 && eVar.mDimensionRatio == 0.0f && eVar.hasDanglingDimension(1)) || eVar.isResolvedVertically();
        if (eVar.mDimensionRatio <= 0.0f || !(z8 || z9)) {
            return z8 && z9;
        }
        return true;
    }

    private static void b(R.e eVar, b.InterfaceC0072b interfaceC0072b, boolean z8) {
        R.d dVar;
        R.d dVar2;
        R.d dVar3;
        R.d dVar4;
        R.d dVar5;
        if (!(eVar instanceof R.f) && eVar.isMeasureRequested() && a(eVar)) {
            R.f.measure(eVar, interfaceC0072b, new b.a(), b.a.SELF_DIMENSIONS);
        }
        R.d anchor = eVar.getAnchor(d.b.LEFT);
        R.d anchor2 = eVar.getAnchor(d.b.RIGHT);
        int finalValue = anchor.getFinalValue();
        int finalValue2 = anchor2.getFinalValue();
        if (anchor.getDependents() != null && anchor.hasFinalValue()) {
            Iterator<R.d> it = anchor.getDependents().iterator();
            while (it.hasNext()) {
                R.d next = it.next();
                R.e eVar2 = next.mOwner;
                boolean zA = a(eVar2);
                if (eVar2.isMeasureRequested() && zA) {
                    R.f.measure(eVar2, interfaceC0072b, new b.a(), b.a.SELF_DIMENSIONS);
                }
                e.b horizontalDimensionBehaviour = eVar2.getHorizontalDimensionBehaviour();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour != bVar || zA) {
                    if (!eVar2.isMeasureRequested()) {
                        R.d dVar6 = eVar2.mLeft;
                        if (next == dVar6 && eVar2.mRight.mTarget == null) {
                            int margin = dVar6.getMargin() + finalValue;
                            eVar2.setFinalHorizontal(margin, eVar2.getWidth() + margin);
                            b(eVar2, interfaceC0072b, z8);
                        } else {
                            R.d dVar7 = eVar2.mRight;
                            if (next == dVar7 && dVar6.mTarget == null) {
                                int margin2 = finalValue - dVar7.getMargin();
                                eVar2.setFinalHorizontal(margin2 - eVar2.getWidth(), margin2);
                                b(eVar2, interfaceC0072b, z8);
                            } else if (next == dVar6 && (dVar3 = dVar7.mTarget) != null && dVar3.hasFinalValue() && !eVar2.isInHorizontalChain()) {
                                d(interfaceC0072b, eVar2, z8);
                            }
                        }
                    }
                } else if (eVar2.getHorizontalDimensionBehaviour() == bVar && eVar2.mMatchConstraintMaxWidth >= 0 && eVar2.mMatchConstraintMinWidth >= 0 && (eVar2.getVisibility() == 8 || (eVar2.mMatchConstraintDefaultWidth == 0 && eVar2.getDimensionRatio() == 0.0f))) {
                    if (!eVar2.isInHorizontalChain() && !eVar2.isInVirtualLayout() && ((next == eVar2.mLeft && (dVar5 = eVar2.mRight.mTarget) != null && dVar5.hasFinalValue()) || (next == eVar2.mRight && (dVar4 = eVar2.mLeft.mTarget) != null && dVar4.hasFinalValue()))) {
                        if (!eVar2.isInHorizontalChain()) {
                            e(eVar, interfaceC0072b, eVar2, z8);
                        }
                    }
                }
            }
        }
        if ((eVar instanceof R.h) || anchor2.getDependents() == null || !anchor2.hasFinalValue()) {
            return;
        }
        Iterator<R.d> it2 = anchor2.getDependents().iterator();
        while (it2.hasNext()) {
            R.d next2 = it2.next();
            R.e eVar3 = next2.mOwner;
            boolean zA2 = a(eVar3);
            if (eVar3.isMeasureRequested() && zA2) {
                R.f.measure(eVar3, interfaceC0072b, new b.a(), b.a.SELF_DIMENSIONS);
            }
            boolean z9 = (next2 == eVar3.mLeft && (dVar2 = eVar3.mRight.mTarget) != null && dVar2.hasFinalValue()) || (next2 == eVar3.mRight && (dVar = eVar3.mLeft.mTarget) != null && dVar.hasFinalValue());
            e.b horizontalDimensionBehaviour2 = eVar3.getHorizontalDimensionBehaviour();
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour2 != bVar2 || zA2) {
                if (!eVar3.isMeasureRequested()) {
                    R.d dVar8 = eVar3.mLeft;
                    if (next2 == dVar8 && eVar3.mRight.mTarget == null) {
                        int margin3 = dVar8.getMargin() + finalValue2;
                        eVar3.setFinalHorizontal(margin3, eVar3.getWidth() + margin3);
                        b(eVar3, interfaceC0072b, z8);
                    } else {
                        R.d dVar9 = eVar3.mRight;
                        if (next2 == dVar9 && dVar8.mTarget == null) {
                            int margin4 = finalValue2 - dVar9.getMargin();
                            eVar3.setFinalHorizontal(margin4 - eVar3.getWidth(), margin4);
                            b(eVar3, interfaceC0072b, z8);
                        } else if (z9 && !eVar3.isInHorizontalChain()) {
                            d(interfaceC0072b, eVar3, z8);
                        }
                    }
                }
            } else if (eVar3.getHorizontalDimensionBehaviour() == bVar2 && eVar3.mMatchConstraintMaxWidth >= 0 && eVar3.mMatchConstraintMinWidth >= 0 && (eVar3.getVisibility() == 8 || (eVar3.mMatchConstraintDefaultWidth == 0 && eVar3.getDimensionRatio() == 0.0f))) {
                if (!eVar3.isInHorizontalChain() && !eVar3.isInVirtualLayout() && z9 && !eVar3.isInHorizontalChain()) {
                    e(eVar, interfaceC0072b, eVar3, z8);
                }
            }
        }
    }

    private static void c(R.a aVar, b.InterfaceC0072b interfaceC0072b, int i8, boolean z8) {
        if (aVar.allSolved()) {
            if (i8 == 0) {
                b(aVar, interfaceC0072b, z8);
            } else {
                h(aVar, interfaceC0072b);
            }
        }
    }

    private static void d(b.InterfaceC0072b interfaceC0072b, R.e eVar, boolean z8) {
        float horizontalBiasPercent = eVar.getHorizontalBiasPercent();
        int finalValue = eVar.mLeft.mTarget.getFinalValue();
        int finalValue2 = eVar.mRight.mTarget.getFinalValue();
        int margin = eVar.mLeft.getMargin() + finalValue;
        int margin2 = finalValue2 - eVar.mRight.getMargin();
        if (finalValue == finalValue2) {
            horizontalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int width = eVar.getWidth();
        int i8 = (finalValue2 - finalValue) - width;
        if (finalValue > finalValue2) {
            i8 = (finalValue - finalValue2) - width;
        }
        int i9 = ((int) ((horizontalBiasPercent * i8) + 0.5f)) + finalValue;
        int i10 = i9 + width;
        if (finalValue > finalValue2) {
            i10 = i9 - width;
        }
        eVar.setFinalHorizontal(i9, i10);
        b(eVar, interfaceC0072b, z8);
    }

    private static void e(R.e eVar, b.InterfaceC0072b interfaceC0072b, R.e eVar2, boolean z8) {
        float horizontalBiasPercent = eVar2.getHorizontalBiasPercent();
        int finalValue = eVar2.mLeft.mTarget.getFinalValue() + eVar2.mLeft.getMargin();
        int finalValue2 = eVar2.mRight.mTarget.getFinalValue() - eVar2.mRight.getMargin();
        if (finalValue2 >= finalValue) {
            int width = eVar2.getWidth();
            if (eVar2.getVisibility() != 8) {
                int i8 = eVar2.mMatchConstraintDefaultWidth;
                if (i8 == 2) {
                    width = (int) (eVar2.getHorizontalBiasPercent() * 0.5f * (eVar instanceof R.f ? eVar.getWidth() : eVar.getParent().getWidth()));
                } else if (i8 == 0) {
                    width = finalValue2 - finalValue;
                }
                width = Math.max(eVar2.mMatchConstraintMinWidth, width);
                int i9 = eVar2.mMatchConstraintMaxWidth;
                if (i9 > 0) {
                    width = Math.min(i9, width);
                }
            }
            int i10 = finalValue + ((int) ((horizontalBiasPercent * ((finalValue2 - finalValue) - width)) + 0.5f));
            eVar2.setFinalHorizontal(i10, width + i10);
            b(eVar2, interfaceC0072b, z8);
        }
    }

    private static void f(b.InterfaceC0072b interfaceC0072b, R.e eVar) {
        float verticalBiasPercent = eVar.getVerticalBiasPercent();
        int finalValue = eVar.mTop.mTarget.getFinalValue();
        int finalValue2 = eVar.mBottom.mTarget.getFinalValue();
        int margin = eVar.mTop.getMargin() + finalValue;
        int margin2 = finalValue2 - eVar.mBottom.getMargin();
        if (finalValue == finalValue2) {
            verticalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int height = eVar.getHeight();
        int i8 = (finalValue2 - finalValue) - height;
        if (finalValue > finalValue2) {
            i8 = (finalValue - finalValue2) - height;
        }
        int i9 = (int) ((verticalBiasPercent * i8) + 0.5f);
        int i10 = finalValue + i9;
        int i11 = i10 + height;
        if (finalValue > finalValue2) {
            i10 = finalValue - i9;
            i11 = i10 - height;
        }
        eVar.setFinalVertical(i10, i11);
        h(eVar, interfaceC0072b);
    }

    private static void g(R.e eVar, b.InterfaceC0072b interfaceC0072b, R.e eVar2) {
        float verticalBiasPercent = eVar2.getVerticalBiasPercent();
        int finalValue = eVar2.mTop.mTarget.getFinalValue() + eVar2.mTop.getMargin();
        int finalValue2 = eVar2.mBottom.mTarget.getFinalValue() - eVar2.mBottom.getMargin();
        if (finalValue2 >= finalValue) {
            int height = eVar2.getHeight();
            if (eVar2.getVisibility() != 8) {
                int i8 = eVar2.mMatchConstraintDefaultHeight;
                if (i8 == 2) {
                    height = (int) (verticalBiasPercent * 0.5f * (eVar instanceof R.f ? eVar.getHeight() : eVar.getParent().getHeight()));
                } else if (i8 == 0) {
                    height = finalValue2 - finalValue;
                }
                height = Math.max(eVar2.mMatchConstraintMinHeight, height);
                int i9 = eVar2.mMatchConstraintMaxHeight;
                if (i9 > 0) {
                    height = Math.min(i9, height);
                }
            }
            int i10 = finalValue + ((int) ((verticalBiasPercent * ((finalValue2 - finalValue) - height)) + 0.5f));
            eVar2.setFinalVertical(i10, height + i10);
            h(eVar2, interfaceC0072b);
        }
    }

    private static void h(R.e eVar, b.InterfaceC0072b interfaceC0072b) {
        R.d dVar;
        R.d dVar2;
        R.d dVar3;
        R.d dVar4;
        R.d dVar5;
        if (!(eVar instanceof R.f) && eVar.isMeasureRequested() && a(eVar)) {
            R.f.measure(eVar, interfaceC0072b, new b.a(), b.a.SELF_DIMENSIONS);
        }
        R.d anchor = eVar.getAnchor(d.b.TOP);
        R.d anchor2 = eVar.getAnchor(d.b.BOTTOM);
        int finalValue = anchor.getFinalValue();
        int finalValue2 = anchor2.getFinalValue();
        if (anchor.getDependents() != null && anchor.hasFinalValue()) {
            Iterator<R.d> it = anchor.getDependents().iterator();
            while (it.hasNext()) {
                R.d next = it.next();
                R.e eVar2 = next.mOwner;
                boolean zA = a(eVar2);
                if (eVar2.isMeasureRequested() && zA) {
                    R.f.measure(eVar2, interfaceC0072b, new b.a(), b.a.SELF_DIMENSIONS);
                }
                e.b verticalDimensionBehaviour = eVar2.getVerticalDimensionBehaviour();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (verticalDimensionBehaviour != bVar || zA) {
                    if (!eVar2.isMeasureRequested()) {
                        R.d dVar6 = eVar2.mTop;
                        if (next == dVar6 && eVar2.mBottom.mTarget == null) {
                            int margin = dVar6.getMargin() + finalValue;
                            eVar2.setFinalVertical(margin, eVar2.getHeight() + margin);
                            h(eVar2, interfaceC0072b);
                        } else {
                            R.d dVar7 = eVar2.mBottom;
                            if (next == dVar7 && dVar7.mTarget == null) {
                                int margin2 = finalValue - dVar7.getMargin();
                                eVar2.setFinalVertical(margin2 - eVar2.getHeight(), margin2);
                                h(eVar2, interfaceC0072b);
                            } else if (next == dVar6 && (dVar3 = dVar7.mTarget) != null && dVar3.hasFinalValue()) {
                                f(interfaceC0072b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.getVerticalDimensionBehaviour() == bVar && eVar2.mMatchConstraintMaxHeight >= 0 && eVar2.mMatchConstraintMinHeight >= 0 && (eVar2.getVisibility() == 8 || (eVar2.mMatchConstraintDefaultHeight == 0 && eVar2.getDimensionRatio() == 0.0f))) {
                    if (!eVar2.isInVerticalChain() && !eVar2.isInVirtualLayout() && ((next == eVar2.mTop && (dVar5 = eVar2.mBottom.mTarget) != null && dVar5.hasFinalValue()) || (next == eVar2.mBottom && (dVar4 = eVar2.mTop.mTarget) != null && dVar4.hasFinalValue()))) {
                        if (!eVar2.isInVerticalChain()) {
                            g(eVar, interfaceC0072b, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof R.h) {
            return;
        }
        if (anchor2.getDependents() != null && anchor2.hasFinalValue()) {
            Iterator<R.d> it2 = anchor2.getDependents().iterator();
            while (it2.hasNext()) {
                R.d next2 = it2.next();
                R.e eVar3 = next2.mOwner;
                boolean zA2 = a(eVar3);
                if (eVar3.isMeasureRequested() && zA2) {
                    R.f.measure(eVar3, interfaceC0072b, new b.a(), b.a.SELF_DIMENSIONS);
                }
                boolean z8 = (next2 == eVar3.mTop && (dVar2 = eVar3.mBottom.mTarget) != null && dVar2.hasFinalValue()) || (next2 == eVar3.mBottom && (dVar = eVar3.mTop.mTarget) != null && dVar.hasFinalValue());
                e.b verticalDimensionBehaviour2 = eVar3.getVerticalDimensionBehaviour();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (verticalDimensionBehaviour2 != bVar2 || zA2) {
                    if (!eVar3.isMeasureRequested()) {
                        R.d dVar8 = eVar3.mTop;
                        if (next2 == dVar8 && eVar3.mBottom.mTarget == null) {
                            int margin3 = dVar8.getMargin() + finalValue2;
                            eVar3.setFinalVertical(margin3, eVar3.getHeight() + margin3);
                            h(eVar3, interfaceC0072b);
                        } else {
                            R.d dVar9 = eVar3.mBottom;
                            if (next2 == dVar9 && dVar8.mTarget == null) {
                                int margin4 = finalValue2 - dVar9.getMargin();
                                eVar3.setFinalVertical(margin4 - eVar3.getHeight(), margin4);
                                h(eVar3, interfaceC0072b);
                            } else if (z8 && !eVar3.isInVerticalChain()) {
                                f(interfaceC0072b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.getVerticalDimensionBehaviour() == bVar2 && eVar3.mMatchConstraintMaxHeight >= 0 && eVar3.mMatchConstraintMinHeight >= 0 && (eVar3.getVisibility() == 8 || (eVar3.mMatchConstraintDefaultHeight == 0 && eVar3.getDimensionRatio() == 0.0f))) {
                    if (!eVar3.isInVerticalChain() && !eVar3.isInVirtualLayout() && z8 && !eVar3.isInVerticalChain()) {
                        g(eVar, interfaceC0072b, eVar3);
                    }
                }
            }
        }
        R.d anchor3 = eVar.getAnchor(d.b.BASELINE);
        if (anchor3.getDependents() == null || !anchor3.hasFinalValue()) {
            return;
        }
        int finalValue3 = anchor3.getFinalValue();
        Iterator<R.d> it3 = anchor3.getDependents().iterator();
        while (it3.hasNext()) {
            R.d next3 = it3.next();
            R.e eVar4 = next3.mOwner;
            boolean zA3 = a(eVar4);
            if (eVar4.isMeasureRequested() && zA3) {
                R.f.measure(eVar4, interfaceC0072b, new b.a(), b.a.SELF_DIMENSIONS);
            }
            if (eVar4.getVerticalDimensionBehaviour() != e.b.MATCH_CONSTRAINT || zA3) {
                if (!eVar4.isMeasureRequested() && next3 == eVar4.mBaseline) {
                    eVar4.setFinalBaseline(finalValue3);
                    h(eVar4, interfaceC0072b);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean solveChain(R.f r18, Q.d r19, int r20, int r21, R.c r22, boolean r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S.h.solveChain(R.f, Q.d, int, int, R.c, boolean, boolean, boolean):boolean");
    }

    public static void solvingPass(R.f fVar, b.InterfaceC0072b interfaceC0072b) {
        e.b horizontalDimensionBehaviour = fVar.getHorizontalDimensionBehaviour();
        e.b verticalDimensionBehaviour = fVar.getVerticalDimensionBehaviour();
        fVar.resetFinalResolution();
        ArrayList<R.e> children = fVar.getChildren();
        int size = children.size();
        for (int i8 = 0; i8 < size; i8++) {
            children.get(i8).resetFinalResolution();
        }
        boolean zIsRtl = fVar.isRtl();
        if (horizontalDimensionBehaviour == e.b.FIXED) {
            fVar.setFinalHorizontal(0, fVar.getWidth());
        } else {
            fVar.setFinalLeft(0);
        }
        boolean z8 = false;
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            R.e eVar = children.get(i9);
            if (eVar instanceof R.h) {
                R.h hVar = (R.h) eVar;
                if (hVar.getOrientation() == 1) {
                    if (hVar.getRelativeBegin() != -1) {
                        hVar.setFinalValue(hVar.getRelativeBegin());
                    } else if (hVar.getRelativeEnd() != -1 && fVar.isResolvedHorizontally()) {
                        hVar.setFinalValue(fVar.getWidth() - hVar.getRelativeEnd());
                    } else if (fVar.isResolvedHorizontally()) {
                        hVar.setFinalValue((int) ((hVar.getRelativePercent() * fVar.getWidth()) + 0.5f));
                    }
                    z8 = true;
                }
            } else if ((eVar instanceof R.a) && ((R.a) eVar).getOrientation() == 0) {
                z9 = true;
            }
        }
        if (z8) {
            for (int i10 = 0; i10 < size; i10++) {
                R.e eVar2 = children.get(i10);
                if (eVar2 instanceof R.h) {
                    R.h hVar2 = (R.h) eVar2;
                    if (hVar2.getOrientation() == 1) {
                        b(hVar2, interfaceC0072b, zIsRtl);
                    }
                }
            }
        }
        b(fVar, interfaceC0072b, zIsRtl);
        if (z9) {
            for (int i11 = 0; i11 < size; i11++) {
                R.e eVar3 = children.get(i11);
                if (eVar3 instanceof R.a) {
                    R.a aVar = (R.a) eVar3;
                    if (aVar.getOrientation() == 0) {
                        c(aVar, interfaceC0072b, 0, zIsRtl);
                    }
                }
            }
        }
        if (verticalDimensionBehaviour == e.b.FIXED) {
            fVar.setFinalVertical(0, fVar.getHeight());
        } else {
            fVar.setFinalTop(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            R.e eVar4 = children.get(i12);
            if (eVar4 instanceof R.h) {
                R.h hVar3 = (R.h) eVar4;
                if (hVar3.getOrientation() == 0) {
                    if (hVar3.getRelativeBegin() != -1) {
                        hVar3.setFinalValue(hVar3.getRelativeBegin());
                    } else if (hVar3.getRelativeEnd() != -1 && fVar.isResolvedVertically()) {
                        hVar3.setFinalValue(fVar.getHeight() - hVar3.getRelativeEnd());
                    } else if (fVar.isResolvedVertically()) {
                        hVar3.setFinalValue((int) ((hVar3.getRelativePercent() * fVar.getHeight()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar4 instanceof R.a) && ((R.a) eVar4).getOrientation() == 1) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i13 = 0; i13 < size; i13++) {
                R.e eVar5 = children.get(i13);
                if (eVar5 instanceof R.h) {
                    R.h hVar4 = (R.h) eVar5;
                    if (hVar4.getOrientation() == 0) {
                        h(hVar4, interfaceC0072b);
                    }
                }
            }
        }
        h(fVar, interfaceC0072b);
        if (z11) {
            for (int i14 = 0; i14 < size; i14++) {
                R.e eVar6 = children.get(i14);
                if (eVar6 instanceof R.a) {
                    R.a aVar2 = (R.a) eVar6;
                    if (aVar2.getOrientation() == 1) {
                        c(aVar2, interfaceC0072b, 1, zIsRtl);
                    }
                }
            }
        }
        for (int i15 = 0; i15 < size; i15++) {
            R.e eVar7 = children.get(i15);
            if (eVar7.isMeasureRequested() && a(eVar7)) {
                R.f.measure(eVar7, interfaceC0072b, f4566a, b.a.SELF_DIMENSIONS);
                b(eVar7, interfaceC0072b, zIsRtl);
                h(eVar7, interfaceC0072b);
            }
        }
    }
}
