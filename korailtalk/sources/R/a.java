package R;

import R.d;
import R.e;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends j {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;

    /* renamed from: f0, reason: collision with root package name */
    private int f4122f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f4123g0 = true;

    /* renamed from: h0, reason: collision with root package name */
    private int f4124h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    boolean f4125i0 = false;

    public a() {
    }

    @Override // R.e
    public void addToSolver(Q.d dVar, boolean z8) {
        d[] dVarArr;
        boolean z9;
        int i8;
        int i9;
        int i10;
        d[] dVarArr2 = this.mListAnchors;
        dVarArr2[0] = this.mLeft;
        dVarArr2[2] = this.mTop;
        dVarArr2[1] = this.mRight;
        dVarArr2[3] = this.mBottom;
        int i11 = 0;
        while (true) {
            dVarArr = this.mListAnchors;
            if (i11 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i11];
            dVar2.f4152e = dVar.createObjectVariable(dVar2);
            i11++;
        }
        int i12 = this.f4122f0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i12];
        if (!this.f4125i0) {
            allSolved();
        }
        if (this.f4125i0) {
            this.f4125i0 = false;
            int i13 = this.f4122f0;
            if (i13 == 0 || i13 == 1) {
                dVar.addEquality(this.mLeft.f4152e, this.f4208w);
                dVar.addEquality(this.mRight.f4152e, this.f4208w);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    dVar.addEquality(this.mTop.f4152e, this.f4209x);
                    dVar.addEquality(this.mBottom.f4152e, this.f4209x);
                    return;
                }
                return;
            }
        }
        for (int i14 = 0; i14 < this.mWidgetsCount; i14++) {
            e eVar = this.mWidgets[i14];
            if ((this.f4123g0 || eVar.allowedInBarrier()) && ((((i9 = this.f4122f0) == 0 || i9 == 1) && eVar.getHorizontalDimensionBehaviour() == e.b.MATCH_CONSTRAINT && eVar.mLeft.mTarget != null && eVar.mRight.mTarget != null) || (((i10 = this.f4122f0) == 2 || i10 == 3) && eVar.getVerticalDimensionBehaviour() == e.b.MATCH_CONSTRAINT && eVar.mTop.mTarget != null && eVar.mBottom.mTarget != null))) {
                z9 = true;
                break;
            }
        }
        z9 = false;
        boolean z10 = this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents();
        boolean z11 = this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents();
        int i15 = !(!z9 && (((i8 = this.f4122f0) == 0 && z10) || ((i8 == 2 && z11) || ((i8 == 1 && z10) || (i8 == 3 && z11))))) ? 4 : 5;
        for (int i16 = 0; i16 < this.mWidgetsCount; i16++) {
            e eVar2 = this.mWidgets[i16];
            if (this.f4123g0 || eVar2.allowedInBarrier()) {
                Q.i iVarCreateObjectVariable = dVar.createObjectVariable(eVar2.mListAnchors[this.f4122f0]);
                d[] dVarArr3 = eVar2.mListAnchors;
                int i17 = this.f4122f0;
                d dVar4 = dVarArr3[i17];
                dVar4.f4152e = iVarCreateObjectVariable;
                d dVar5 = dVar4.mTarget;
                int i18 = (dVar5 == null || dVar5.mOwner != this) ? 0 : dVar4.mMargin;
                if (i17 == 0 || i17 == 2) {
                    dVar.addLowerBarrier(dVar3.f4152e, iVarCreateObjectVariable, this.f4124h0 - i18, z9);
                } else {
                    dVar.addGreaterBarrier(dVar3.f4152e, iVarCreateObjectVariable, this.f4124h0 + i18, z9);
                }
                dVar.addEquality(dVar3.f4152e, iVarCreateObjectVariable, this.f4124h0 + i18, i15);
            }
        }
        int i19 = this.f4122f0;
        if (i19 == 0) {
            dVar.addEquality(this.mRight.f4152e, this.mLeft.f4152e, 0, 8);
            dVar.addEquality(this.mLeft.f4152e, this.mParent.mRight.f4152e, 0, 4);
            dVar.addEquality(this.mLeft.f4152e, this.mParent.mLeft.f4152e, 0, 0);
            return;
        }
        if (i19 == 1) {
            dVar.addEquality(this.mLeft.f4152e, this.mRight.f4152e, 0, 8);
            dVar.addEquality(this.mLeft.f4152e, this.mParent.mLeft.f4152e, 0, 4);
            dVar.addEquality(this.mLeft.f4152e, this.mParent.mRight.f4152e, 0, 0);
        } else if (i19 == 2) {
            dVar.addEquality(this.mBottom.f4152e, this.mTop.f4152e, 0, 8);
            dVar.addEquality(this.mTop.f4152e, this.mParent.mBottom.f4152e, 0, 4);
            dVar.addEquality(this.mTop.f4152e, this.mParent.mTop.f4152e, 0, 0);
        } else if (i19 == 3) {
            dVar.addEquality(this.mTop.f4152e, this.mBottom.f4152e, 0, 8);
            dVar.addEquality(this.mTop.f4152e, this.mParent.mTop.f4152e, 0, 4);
            dVar.addEquality(this.mTop.f4152e, this.mParent.mBottom.f4152e, 0, 0);
        }
    }

    public boolean allSolved() {
        int i8;
        int i9;
        int i10;
        boolean z8 = true;
        int i11 = 0;
        while (true) {
            i8 = this.mWidgetsCount;
            if (i11 >= i8) {
                break;
            }
            e eVar = this.mWidgets[i11];
            if ((this.f4123g0 || eVar.allowedInBarrier()) && ((((i9 = this.f4122f0) == 0 || i9 == 1) && !eVar.isResolvedHorizontally()) || (((i10 = this.f4122f0) == 2 || i10 == 3) && !eVar.isResolvedVertically()))) {
                z8 = false;
            }
            i11++;
        }
        if (!z8 || i8 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z9 = false;
        for (int i12 = 0; i12 < this.mWidgetsCount; i12++) {
            e eVar2 = this.mWidgets[i12];
            if (this.f4123g0 || eVar2.allowedInBarrier()) {
                if (!z9) {
                    int i13 = this.f4122f0;
                    if (i13 == 0) {
                        iMax = eVar2.getAnchor(d.b.LEFT).getFinalValue();
                    } else if (i13 == 1) {
                        iMax = eVar2.getAnchor(d.b.RIGHT).getFinalValue();
                    } else if (i13 == 2) {
                        iMax = eVar2.getAnchor(d.b.TOP).getFinalValue();
                    } else if (i13 == 3) {
                        iMax = eVar2.getAnchor(d.b.BOTTOM).getFinalValue();
                    }
                    z9 = true;
                }
                int i14 = this.f4122f0;
                if (i14 == 0) {
                    iMax = Math.min(iMax, eVar2.getAnchor(d.b.LEFT).getFinalValue());
                } else if (i14 == 1) {
                    iMax = Math.max(iMax, eVar2.getAnchor(d.b.RIGHT).getFinalValue());
                } else if (i14 == 2) {
                    iMax = Math.min(iMax, eVar2.getAnchor(d.b.TOP).getFinalValue());
                } else if (i14 == 3) {
                    iMax = Math.max(iMax, eVar2.getAnchor(d.b.BOTTOM).getFinalValue());
                }
            }
        }
        int i15 = iMax + this.f4124h0;
        int i16 = this.f4122f0;
        if (i16 == 0 || i16 == 1) {
            setFinalHorizontal(i15, i15);
        } else {
            setFinalVertical(i15, i15);
        }
        this.f4125i0 = true;
        return true;
    }

    @Override // R.e
    public boolean allowedInBarrier() {
        return true;
    }

    public boolean allowsGoneWidget() {
        return this.f4123g0;
    }

    @Override // R.j, R.e
    public void copy(e eVar, HashMap<e, e> map) {
        super.copy(eVar, map);
        a aVar = (a) eVar;
        this.f4122f0 = aVar.f4122f0;
        this.f4123g0 = aVar.f4123g0;
        this.f4124h0 = aVar.f4124h0;
    }

    public int getBarrierType() {
        return this.f4122f0;
    }

    public int getMargin() {
        return this.f4124h0;
    }

    public int getOrientation() {
        int i8 = this.f4122f0;
        if (i8 == 0 || i8 == 1) {
            return 0;
        }
        return (i8 == 2 || i8 == 3) ? 1 : -1;
    }

    protected void h() {
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            e eVar = this.mWidgets[i8];
            int i9 = this.f4122f0;
            if (i9 == 0 || i9 == 1) {
                eVar.g(0, true);
            } else if (i9 == 2 || i9 == 3) {
                eVar.g(1, true);
            }
        }
    }

    @Override // R.e
    public boolean isResolvedHorizontally() {
        return this.f4125i0;
    }

    @Override // R.e
    public boolean isResolvedVertically() {
        return this.f4125i0;
    }

    public void setAllowsGoneWidget(boolean z8) {
        this.f4123g0 = z8;
    }

    public void setBarrierType(int i8) {
        this.f4122f0 = i8;
    }

    public void setMargin(int i8) {
        this.f4124h0 = i8;
    }

    @Override // R.e
    public String toString() {
        String str = "[Barrier] " + getDebugName() + " {";
        for (int i8 = 0; i8 < this.mWidgetsCount; i8++) {
            e eVar = this.mWidgets[i8];
            if (i8 > 0) {
                str = str + ", ";
            }
            str = str + eVar.getDebugName();
        }
        return str + "}";
    }

    public a(String str) {
        setDebugName(str);
    }
}
