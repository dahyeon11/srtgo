package R;

import R.e;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class g extends l {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;

    /* renamed from: P0, reason: collision with root package name */
    private e[] f4248P0;

    /* renamed from: s0, reason: collision with root package name */
    private int f4250s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    private int f4251t0 = -1;

    /* renamed from: u0, reason: collision with root package name */
    private int f4252u0 = -1;

    /* renamed from: v0, reason: collision with root package name */
    private int f4253v0 = -1;

    /* renamed from: w0, reason: collision with root package name */
    private int f4254w0 = -1;

    /* renamed from: x0, reason: collision with root package name */
    private int f4255x0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    private float f4256y0 = 0.5f;

    /* renamed from: z0, reason: collision with root package name */
    private float f4257z0 = 0.5f;

    /* renamed from: A0, reason: collision with root package name */
    private float f4233A0 = 0.5f;

    /* renamed from: B0, reason: collision with root package name */
    private float f4234B0 = 0.5f;

    /* renamed from: C0, reason: collision with root package name */
    private float f4235C0 = 0.5f;

    /* renamed from: D0, reason: collision with root package name */
    private float f4236D0 = 0.5f;

    /* renamed from: E0, reason: collision with root package name */
    private int f4237E0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    private int f4238F0 = 0;

    /* renamed from: G0, reason: collision with root package name */
    private int f4239G0 = 2;

    /* renamed from: H0, reason: collision with root package name */
    private int f4240H0 = 2;

    /* renamed from: I0, reason: collision with root package name */
    private int f4241I0 = 0;

    /* renamed from: J0, reason: collision with root package name */
    private int f4242J0 = -1;

    /* renamed from: K0, reason: collision with root package name */
    private int f4243K0 = 0;

    /* renamed from: L0, reason: collision with root package name */
    private ArrayList f4244L0 = new ArrayList();

    /* renamed from: M0, reason: collision with root package name */
    private e[] f4245M0 = null;

    /* renamed from: N0, reason: collision with root package name */
    private e[] f4246N0 = null;

    /* renamed from: O0, reason: collision with root package name */
    private int[] f4247O0 = null;

    /* renamed from: Q0, reason: collision with root package name */
    private int f4249Q0 = 0;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        private int f4258a;

        /* renamed from: d, reason: collision with root package name */
        private d f4261d;

        /* renamed from: e, reason: collision with root package name */
        private d f4262e;

        /* renamed from: f, reason: collision with root package name */
        private d f4263f;

        /* renamed from: g, reason: collision with root package name */
        private d f4264g;

        /* renamed from: h, reason: collision with root package name */
        private int f4265h;

        /* renamed from: i, reason: collision with root package name */
        private int f4266i;

        /* renamed from: j, reason: collision with root package name */
        private int f4267j;

        /* renamed from: k, reason: collision with root package name */
        private int f4268k;

        /* renamed from: q, reason: collision with root package name */
        private int f4274q;

        /* renamed from: b, reason: collision with root package name */
        private e f4259b = null;

        /* renamed from: c, reason: collision with root package name */
        int f4260c = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f4269l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f4270m = 0;

        /* renamed from: n, reason: collision with root package name */
        private int f4271n = 0;

        /* renamed from: o, reason: collision with root package name */
        private int f4272o = 0;

        /* renamed from: p, reason: collision with root package name */
        private int f4273p = 0;

        public a(int i8, d dVar, d dVar2, d dVar3, d dVar4, int i9) {
            this.f4265h = 0;
            this.f4266i = 0;
            this.f4267j = 0;
            this.f4268k = 0;
            this.f4274q = 0;
            this.f4258a = i8;
            this.f4261d = dVar;
            this.f4262e = dVar2;
            this.f4263f = dVar3;
            this.f4264g = dVar4;
            this.f4265h = g.this.getPaddingLeft();
            this.f4266i = g.this.getPaddingTop();
            this.f4267j = g.this.getPaddingRight();
            this.f4268k = g.this.getPaddingBottom();
            this.f4274q = i9;
        }

        private void b() {
            this.f4269l = 0;
            this.f4270m = 0;
            this.f4259b = null;
            this.f4260c = 0;
            int i8 = this.f4272o;
            for (int i9 = 0; i9 < i8 && this.f4271n + i9 < g.this.f4249Q0; i9++) {
                e eVar = g.this.f4248P0[this.f4271n + i9];
                if (this.f4258a == 0) {
                    int width = eVar.getWidth();
                    int i10 = g.this.f4237E0;
                    if (eVar.getVisibility() == 8) {
                        i10 = 0;
                    }
                    this.f4269l += width + i10;
                    int iF = g.this.F(eVar, this.f4274q);
                    if (this.f4259b == null || this.f4260c < iF) {
                        this.f4259b = eVar;
                        this.f4260c = iF;
                        this.f4270m = iF;
                    }
                } else {
                    int iG = g.this.G(eVar, this.f4274q);
                    int iF2 = g.this.F(eVar, this.f4274q);
                    int i11 = g.this.f4238F0;
                    if (eVar.getVisibility() == 8) {
                        i11 = 0;
                    }
                    this.f4270m += iF2 + i11;
                    if (this.f4259b == null || this.f4260c < iG) {
                        this.f4259b = eVar;
                        this.f4260c = iG;
                        this.f4269l = iG;
                    }
                }
            }
        }

        public void add(e eVar) {
            if (this.f4258a == 0) {
                int iG = g.this.G(eVar, this.f4274q);
                if (eVar.getHorizontalDimensionBehaviour() == e.b.MATCH_CONSTRAINT) {
                    this.f4273p++;
                    iG = 0;
                }
                this.f4269l += iG + (eVar.getVisibility() != 8 ? g.this.f4237E0 : 0);
                int iF = g.this.F(eVar, this.f4274q);
                if (this.f4259b == null || this.f4260c < iF) {
                    this.f4259b = eVar;
                    this.f4260c = iF;
                    this.f4270m = iF;
                }
            } else {
                int iG2 = g.this.G(eVar, this.f4274q);
                int iF2 = g.this.F(eVar, this.f4274q);
                if (eVar.getVerticalDimensionBehaviour() == e.b.MATCH_CONSTRAINT) {
                    this.f4273p++;
                    iF2 = 0;
                }
                this.f4270m += iF2 + (eVar.getVisibility() != 8 ? g.this.f4238F0 : 0);
                if (this.f4259b == null || this.f4260c < iG2) {
                    this.f4259b = eVar;
                    this.f4260c = iG2;
                    this.f4269l = iG2;
                }
            }
            this.f4272o++;
        }

        public void clear() {
            this.f4260c = 0;
            this.f4259b = null;
            this.f4269l = 0;
            this.f4270m = 0;
            this.f4271n = 0;
            this.f4272o = 0;
            this.f4273p = 0;
        }

        public void createConstraints(boolean z8, int i8, boolean z9) {
            e eVar;
            char c9;
            int i9 = this.f4272o;
            for (int i10 = 0; i10 < i9 && this.f4271n + i10 < g.this.f4249Q0; i10++) {
                e eVar2 = g.this.f4248P0[this.f4271n + i10];
                if (eVar2 != null) {
                    eVar2.resetAnchors();
                }
            }
            if (i9 == 0 || this.f4259b == null) {
                return;
            }
            boolean z10 = z9 && i8 == 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = z8 ? (i9 - 1) - i13 : i13;
                if (this.f4271n + i14 >= g.this.f4249Q0) {
                    break;
                }
                if (g.this.f4248P0[this.f4271n + i14].getVisibility() == 0) {
                    if (i11 == -1) {
                        i11 = i13;
                    }
                    i12 = i13;
                }
            }
            e eVar3 = null;
            if (this.f4258a != 0) {
                e eVar4 = this.f4259b;
                eVar4.setHorizontalChainStyle(g.this.f4250s0);
                int i15 = this.f4265h;
                if (i8 > 0) {
                    i15 += g.this.f4237E0;
                }
                if (z8) {
                    eVar4.mRight.connect(this.f4263f, i15);
                    if (z9) {
                        eVar4.mLeft.connect(this.f4261d, this.f4267j);
                    }
                    if (i8 > 0) {
                        this.f4263f.mOwner.mLeft.connect(eVar4.mRight, 0);
                    }
                } else {
                    eVar4.mLeft.connect(this.f4261d, i15);
                    if (z9) {
                        eVar4.mRight.connect(this.f4263f, this.f4267j);
                    }
                    if (i8 > 0) {
                        this.f4261d.mOwner.mRight.connect(eVar4.mLeft, 0);
                    }
                }
                int i16 = 0;
                while (i16 < i9 && this.f4271n + i16 < g.this.f4249Q0) {
                    e eVar5 = g.this.f4248P0[this.f4271n + i16];
                    if (i16 == 0) {
                        eVar5.connect(eVar5.mTop, this.f4262e, this.f4266i);
                        int i17 = g.this.f4251t0;
                        float f8 = g.this.f4257z0;
                        if (this.f4271n == 0 && g.this.f4253v0 != -1) {
                            i17 = g.this.f4253v0;
                            f8 = g.this.f4234B0;
                        } else if (z9 && g.this.f4255x0 != -1) {
                            i17 = g.this.f4255x0;
                            f8 = g.this.f4236D0;
                        }
                        eVar5.setVerticalChainStyle(i17);
                        eVar5.setVerticalBiasPercent(f8);
                    }
                    if (i16 == i9 - 1) {
                        eVar5.connect(eVar5.mBottom, this.f4264g, this.f4268k);
                    }
                    if (eVar3 != null) {
                        eVar5.mTop.connect(eVar3.mBottom, g.this.f4238F0);
                        if (i16 == i11) {
                            eVar5.mTop.setGoneMargin(this.f4266i);
                        }
                        eVar3.mBottom.connect(eVar5.mTop, 0);
                        if (i16 == i12 + 1) {
                            eVar3.mBottom.setGoneMargin(this.f4268k);
                        }
                    }
                    if (eVar5 != eVar4) {
                        if (z8) {
                            int i18 = g.this.f4239G0;
                            if (i18 == 0) {
                                eVar5.mRight.connect(eVar4.mRight, 0);
                            } else if (i18 == 1) {
                                eVar5.mLeft.connect(eVar4.mLeft, 0);
                            } else if (i18 == 2) {
                                eVar5.mLeft.connect(eVar4.mLeft, 0);
                                eVar5.mRight.connect(eVar4.mRight, 0);
                            }
                        } else {
                            int i19 = g.this.f4239G0;
                            if (i19 == 0) {
                                eVar5.mLeft.connect(eVar4.mLeft, 0);
                            } else if (i19 == 1) {
                                eVar5.mRight.connect(eVar4.mRight, 0);
                            } else if (i19 == 2) {
                                if (z10) {
                                    eVar5.mLeft.connect(this.f4261d, this.f4265h);
                                    eVar5.mRight.connect(this.f4263f, this.f4267j);
                                } else {
                                    eVar5.mLeft.connect(eVar4.mLeft, 0);
                                    eVar5.mRight.connect(eVar4.mRight, 0);
                                }
                            }
                        }
                    }
                    i16++;
                    eVar3 = eVar5;
                }
                return;
            }
            e eVar6 = this.f4259b;
            eVar6.setVerticalChainStyle(g.this.f4251t0);
            int i20 = this.f4266i;
            if (i8 > 0) {
                i20 += g.this.f4238F0;
            }
            eVar6.mTop.connect(this.f4262e, i20);
            if (z9) {
                eVar6.mBottom.connect(this.f4264g, this.f4268k);
            }
            if (i8 > 0) {
                this.f4262e.mOwner.mBottom.connect(eVar6.mTop, 0);
            }
            if (g.this.f4240H0 != 3 || eVar6.hasBaseline()) {
                eVar = eVar6;
            } else {
                for (int i21 = 0; i21 < i9; i21++) {
                    int i22 = z8 ? (i9 - 1) - i21 : i21;
                    if (this.f4271n + i22 >= g.this.f4249Q0) {
                        break;
                    }
                    eVar = g.this.f4248P0[this.f4271n + i22];
                    if (eVar.hasBaseline()) {
                        break;
                    }
                }
                eVar = eVar6;
            }
            int i23 = 0;
            while (i23 < i9) {
                int i24 = z8 ? (i9 - 1) - i23 : i23;
                if (this.f4271n + i24 >= g.this.f4249Q0) {
                    return;
                }
                e eVar7 = g.this.f4248P0[this.f4271n + i24];
                if (i23 == 0) {
                    eVar7.connect(eVar7.mLeft, this.f4261d, this.f4265h);
                }
                if (i24 == 0) {
                    int i25 = g.this.f4250s0;
                    float f9 = g.this.f4256y0;
                    if (this.f4271n == 0 && g.this.f4252u0 != -1) {
                        i25 = g.this.f4252u0;
                        f9 = g.this.f4233A0;
                    } else if (z9 && g.this.f4254w0 != -1) {
                        i25 = g.this.f4254w0;
                        f9 = g.this.f4235C0;
                    }
                    eVar7.setHorizontalChainStyle(i25);
                    eVar7.setHorizontalBiasPercent(f9);
                }
                if (i23 == i9 - 1) {
                    eVar7.connect(eVar7.mRight, this.f4263f, this.f4267j);
                }
                if (eVar3 != null) {
                    eVar7.mLeft.connect(eVar3.mRight, g.this.f4237E0);
                    if (i23 == i11) {
                        eVar7.mLeft.setGoneMargin(this.f4265h);
                    }
                    eVar3.mRight.connect(eVar7.mLeft, 0);
                    if (i23 == i12 + 1) {
                        eVar3.mRight.setGoneMargin(this.f4267j);
                    }
                }
                if (eVar7 != eVar6) {
                    c9 = 3;
                    if (g.this.f4240H0 == 3 && eVar.hasBaseline() && eVar7 != eVar && eVar7.hasBaseline()) {
                        eVar7.mBaseline.connect(eVar.mBaseline, 0);
                    } else {
                        int i26 = g.this.f4240H0;
                        if (i26 == 0) {
                            eVar7.mTop.connect(eVar6.mTop, 0);
                        } else if (i26 == 1) {
                            eVar7.mBottom.connect(eVar6.mBottom, 0);
                        } else if (z10) {
                            eVar7.mTop.connect(this.f4262e, this.f4266i);
                            eVar7.mBottom.connect(this.f4264g, this.f4268k);
                        } else {
                            eVar7.mTop.connect(eVar6.mTop, 0);
                            eVar7.mBottom.connect(eVar6.mBottom, 0);
                        }
                    }
                } else {
                    c9 = 3;
                }
                i23++;
                eVar3 = eVar7;
            }
        }

        public int getHeight() {
            return this.f4258a == 1 ? this.f4270m - g.this.f4238F0 : this.f4270m;
        }

        public int getWidth() {
            return this.f4258a == 0 ? this.f4269l - g.this.f4237E0 : this.f4269l;
        }

        public void measureMatchConstraints(int i8) {
            int i9 = this.f4273p;
            if (i9 == 0) {
                return;
            }
            int i10 = this.f4272o;
            int i11 = i8 / i9;
            for (int i12 = 0; i12 < i10 && this.f4271n + i12 < g.this.f4249Q0; i12++) {
                e eVar = g.this.f4248P0[this.f4271n + i12];
                if (this.f4258a == 0) {
                    if (eVar != null && eVar.getHorizontalDimensionBehaviour() == e.b.MATCH_CONSTRAINT && eVar.mMatchConstraintDefaultWidth == 0) {
                        g.this.h(eVar, e.b.FIXED, i11, eVar.getVerticalDimensionBehaviour(), eVar.getHeight());
                    }
                } else if (eVar != null && eVar.getVerticalDimensionBehaviour() == e.b.MATCH_CONSTRAINT && eVar.mMatchConstraintDefaultHeight == 0) {
                    g.this.h(eVar, eVar.getHorizontalDimensionBehaviour(), eVar.getWidth(), e.b.FIXED, i11);
                }
            }
            b();
        }

        public void setStartIndex(int i8) {
            this.f4271n = i8;
        }

        public void setup(int i8, d dVar, d dVar2, d dVar3, d dVar4, int i9, int i10, int i11, int i12, int i13) {
            this.f4258a = i8;
            this.f4261d = dVar;
            this.f4262e = dVar2;
            this.f4263f = dVar3;
            this.f4264g = dVar4;
            this.f4265h = i9;
            this.f4266i = i10;
            this.f4267j = i11;
            this.f4268k = i12;
            this.f4274q = i13;
        }
    }

    private void E(boolean z8) {
        e eVar;
        if (this.f4247O0 == null || this.f4246N0 == null || this.f4245M0 == null) {
            return;
        }
        for (int i8 = 0; i8 < this.f4249Q0; i8++) {
            this.f4248P0[i8].resetAnchors();
        }
        int[] iArr = this.f4247O0;
        int i9 = iArr[0];
        int i10 = iArr[1];
        e eVar2 = null;
        for (int i11 = 0; i11 < i9; i11++) {
            e eVar3 = this.f4246N0[z8 ? (i9 - i11) - 1 : i11];
            if (eVar3 != null && eVar3.getVisibility() != 8) {
                if (i11 == 0) {
                    eVar3.connect(eVar3.mLeft, this.mLeft, getPaddingLeft());
                    eVar3.setHorizontalChainStyle(this.f4250s0);
                    eVar3.setHorizontalBiasPercent(this.f4256y0);
                }
                if (i11 == i9 - 1) {
                    eVar3.connect(eVar3.mRight, this.mRight, getPaddingRight());
                }
                if (i11 > 0) {
                    eVar3.connect(eVar3.mLeft, eVar2.mRight, this.f4237E0);
                    eVar2.connect(eVar2.mRight, eVar3.mLeft, 0);
                }
                eVar2 = eVar3;
            }
        }
        for (int i12 = 0; i12 < i10; i12++) {
            e eVar4 = this.f4245M0[i12];
            if (eVar4 != null && eVar4.getVisibility() != 8) {
                if (i12 == 0) {
                    eVar4.connect(eVar4.mTop, this.mTop, getPaddingTop());
                    eVar4.setVerticalChainStyle(this.f4251t0);
                    eVar4.setVerticalBiasPercent(this.f4257z0);
                }
                if (i12 == i10 - 1) {
                    eVar4.connect(eVar4.mBottom, this.mBottom, getPaddingBottom());
                }
                if (i12 > 0) {
                    eVar4.connect(eVar4.mTop, eVar2.mBottom, this.f4238F0);
                    eVar2.connect(eVar2.mBottom, eVar4.mTop, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i13 = 0; i13 < i9; i13++) {
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = (i14 * i9) + i13;
                if (this.f4243K0 == 1) {
                    i15 = (i13 * i10) + i14;
                }
                e[] eVarArr = this.f4248P0;
                if (i15 < eVarArr.length && (eVar = eVarArr[i15]) != null && eVar.getVisibility() != 8) {
                    e eVar5 = this.f4246N0[i13];
                    e eVar6 = this.f4245M0[i14];
                    if (eVar != eVar5) {
                        eVar.connect(eVar.mLeft, eVar5.mLeft, 0);
                        eVar.connect(eVar.mRight, eVar5.mRight, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.connect(eVar.mTop, eVar6.mTop, 0);
                        eVar.connect(eVar.mBottom, eVar6.mBottom, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F(e eVar, int i8) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.getVerticalDimensionBehaviour() == e.b.MATCH_CONSTRAINT) {
            int i9 = eVar.mMatchConstraintDefaultHeight;
            if (i9 == 0) {
                return 0;
            }
            if (i9 == 2) {
                int i10 = (int) (eVar.mMatchConstraintPercentHeight * i8);
                if (i10 != eVar.getHeight()) {
                    eVar.setMeasureRequested(true);
                    h(eVar, eVar.getHorizontalDimensionBehaviour(), eVar.getWidth(), e.b.FIXED, i10);
                }
                return i10;
            }
            if (i9 == 1) {
                return eVar.getHeight();
            }
            if (i9 == 3) {
                return (int) ((eVar.getWidth() * eVar.mDimensionRatio) + 0.5f);
            }
        }
        return eVar.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G(e eVar, int i8) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.getHorizontalDimensionBehaviour() == e.b.MATCH_CONSTRAINT) {
            int i9 = eVar.mMatchConstraintDefaultWidth;
            if (i9 == 0) {
                return 0;
            }
            if (i9 == 2) {
                int i10 = (int) (eVar.mMatchConstraintPercentWidth * i8);
                if (i10 != eVar.getWidth()) {
                    eVar.setMeasureRequested(true);
                    h(eVar, e.b.FIXED, i10, eVar.getVerticalDimensionBehaviour(), eVar.getHeight());
                }
                return i10;
            }
            if (i9 == 1) {
                return eVar.getWidth();
            }
            if (i9 == 3) {
                return (int) ((eVar.getHeight() * eVar.mDimensionRatio) + 0.5f);
            }
        }
        return eVar.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void H(R.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R.g.H(R.e[], int, int, int, int[]):void");
    }

    private void I(e[] eVarArr, int i8, int i9, int i10, int[] iArr) {
        int i11;
        int i12;
        int i13;
        d dVar;
        int paddingRight;
        d dVar2;
        int paddingBottom;
        int i14;
        if (i8 == 0) {
            return;
        }
        this.f4244L0.clear();
        a aVar = new a(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
        this.f4244L0.add(aVar);
        if (i9 == 0) {
            i11 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < i8) {
                e eVar = eVarArr[i16];
                int iG = G(eVar, i10);
                if (eVar.getHorizontalDimensionBehaviour() == e.b.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i17 = i11;
                boolean z8 = (i15 == i10 || (this.f4237E0 + i15) + iG > i10) && aVar.f4259b != null;
                if (!z8 && i16 > 0 && (i14 = this.f4242J0) > 0 && i16 % i14 == 0) {
                    z8 = true;
                }
                if (z8) {
                    aVar = new a(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
                    aVar.setStartIndex(i16);
                    this.f4244L0.add(aVar);
                } else {
                    if (i16 > 0) {
                        i15 += this.f4237E0 + iG;
                    }
                    aVar.add(eVar);
                    i16++;
                    i11 = i17;
                }
                i15 = iG;
                aVar.add(eVar);
                i16++;
                i11 = i17;
            }
        } else {
            i11 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i8) {
                e eVar2 = eVarArr[i19];
                int iF = F(eVar2, i10);
                if (eVar2.getVerticalDimensionBehaviour() == e.b.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i20 = i11;
                boolean z9 = (i18 == i10 || (this.f4238F0 + i18) + iF > i10) && aVar.f4259b != null;
                if (!z9 && i19 > 0 && (i12 = this.f4242J0) > 0 && i19 % i12 == 0) {
                    z9 = true;
                }
                if (z9) {
                    aVar = new a(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
                    aVar.setStartIndex(i19);
                    this.f4244L0.add(aVar);
                } else {
                    if (i19 > 0) {
                        i18 += this.f4238F0 + iF;
                    }
                    aVar.add(eVar2);
                    i19++;
                    i11 = i20;
                }
                i18 = iF;
                aVar.add(eVar2);
                i19++;
                i11 = i20;
            }
        }
        int size = this.f4244L0.size();
        d dVar3 = this.mLeft;
        d dVar4 = this.mTop;
        d dVar5 = this.mRight;
        d dVar6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        e.b horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z10 = horizontalDimensionBehaviour == bVar || getVerticalDimensionBehaviour() == bVar;
        if (i11 > 0 && z10) {
            for (int i21 = 0; i21 < size; i21++) {
                a aVar2 = (a) this.f4244L0.get(i21);
                if (i9 == 0) {
                    aVar2.measureMatchConstraints(i10 - aVar2.getWidth());
                } else {
                    aVar2.measureMatchConstraints(i10 - aVar2.getHeight());
                }
            }
        }
        int i22 = paddingTop;
        int i23 = paddingRight2;
        int height = 0;
        int width = 0;
        int i24 = 0;
        int i25 = paddingLeft;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i26 = paddingBottom2;
        while (i24 < size) {
            a aVar3 = (a) this.f4244L0.get(i24);
            if (i9 == 0) {
                if (i24 < size - 1) {
                    dVar2 = ((a) this.f4244L0.get(i24 + 1)).f4259b.mTop;
                    paddingBottom = 0;
                } else {
                    dVar2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                d dVar9 = aVar3.f4259b.mBottom;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i27 = height;
                d dVar12 = dVar7;
                int i28 = width;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i13 = i24;
                aVar3.setup(i9, dVar10, dVar12, dVar13, dVar2, i25, i22, i23, paddingBottom, i10);
                int iMax = Math.max(i28, aVar3.getWidth());
                height = i27 + aVar3.getHeight();
                if (i13 > 0) {
                    height += this.f4238F0;
                }
                dVar8 = dVar11;
                width = iMax;
                i22 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i29 = paddingBottom;
                dVar6 = dVar2;
                i26 = i29;
            } else {
                d dVar15 = dVar8;
                int i30 = height;
                int i31 = width;
                i13 = i24;
                if (i13 < size - 1) {
                    dVar = ((a) this.f4244L0.get(i13 + 1)).f4259b.mLeft;
                    paddingRight = 0;
                } else {
                    dVar = this.mRight;
                    paddingRight = getPaddingRight();
                }
                d dVar16 = aVar3.f4259b.mRight;
                aVar3.setup(i9, dVar15, dVar7, dVar, dVar6, i25, i22, paddingRight, i26, i10);
                width = i31 + aVar3.getWidth();
                int iMax2 = Math.max(i30, aVar3.getHeight());
                if (i13 > 0) {
                    width += this.f4237E0;
                }
                height = iMax2;
                i25 = 0;
                i23 = paddingRight;
                dVar8 = dVar16;
            }
            i24 = i13 + 1;
            dVar5 = dVar;
        }
        iArr[0] = width;
        iArr[1] = height;
    }

    private void J(e[] eVarArr, int i8, int i9, int i10, int[] iArr) {
        a aVar;
        if (i8 == 0) {
            return;
        }
        if (this.f4244L0.size() == 0) {
            aVar = new a(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, i10);
            this.f4244L0.add(aVar);
        } else {
            a aVar2 = (a) this.f4244L0.get(0);
            aVar2.clear();
            aVar = aVar2;
            aVar.setup(i9, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i10);
        }
        for (int i11 = 0; i11 < i8; i11++) {
            aVar.add(eVarArr[i11]);
        }
        iArr[0] = aVar.getWidth();
        iArr[1] = aVar.getHeight();
    }

    @Override // R.e
    public void addToSolver(Q.d dVar, boolean z8) {
        super.addToSolver(dVar, z8);
        boolean zIsRtl = getParent() != null ? ((f) getParent()).isRtl() : false;
        int i8 = this.f4241I0;
        if (i8 != 0) {
            if (i8 == 1) {
                int size = this.f4244L0.size();
                int i9 = 0;
                while (i9 < size) {
                    ((a) this.f4244L0.get(i9)).createConstraints(zIsRtl, i9, i9 == size + (-1));
                    i9++;
                }
            } else if (i8 == 2) {
                E(zIsRtl);
            }
        } else if (this.f4244L0.size() > 0) {
            ((a) this.f4244L0.get(0)).createConstraints(zIsRtl, 0, true);
        }
        j(false);
    }

    @Override // R.j, R.e
    public void copy(e eVar, HashMap<e, e> map) {
        super.copy(eVar, map);
        g gVar = (g) eVar;
        this.f4250s0 = gVar.f4250s0;
        this.f4251t0 = gVar.f4251t0;
        this.f4252u0 = gVar.f4252u0;
        this.f4253v0 = gVar.f4253v0;
        this.f4254w0 = gVar.f4254w0;
        this.f4255x0 = gVar.f4255x0;
        this.f4256y0 = gVar.f4256y0;
        this.f4257z0 = gVar.f4257z0;
        this.f4233A0 = gVar.f4233A0;
        this.f4234B0 = gVar.f4234B0;
        this.f4235C0 = gVar.f4235C0;
        this.f4236D0 = gVar.f4236D0;
        this.f4237E0 = gVar.f4237E0;
        this.f4238F0 = gVar.f4238F0;
        this.f4239G0 = gVar.f4239G0;
        this.f4240H0 = gVar.f4240H0;
        this.f4241I0 = gVar.f4241I0;
        this.f4242J0 = gVar.f4242J0;
        this.f4243K0 = gVar.f4243K0;
    }

    @Override // R.l
    public void measure(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int[] iArr;
        boolean z8;
        if (this.mWidgetsCount > 0 && !i()) {
            setMeasure(0, 0);
            j(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr2 = new int[2];
        int i14 = (i9 - paddingLeft) - paddingRight;
        int i15 = this.f4243K0;
        if (i15 == 1) {
            i14 = (i11 - paddingTop) - paddingBottom;
        }
        int i16 = i14;
        if (i15 == 0) {
            if (this.f4250s0 == -1) {
                this.f4250s0 = 0;
            }
            if (this.f4251t0 == -1) {
                this.f4251t0 = 0;
            }
        } else {
            if (this.f4250s0 == -1) {
                this.f4250s0 = 0;
            }
            if (this.f4251t0 == -1) {
                this.f4251t0 = 0;
            }
        }
        e[] eVarArr = this.mWidgets;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i12 = this.mWidgetsCount;
            if (i17 >= i12) {
                break;
            }
            if (this.mWidgets[i17].getVisibility() == 8) {
                i18++;
            }
            i17++;
        }
        if (i18 > 0) {
            eVarArr = new e[i12 - i18];
            int i19 = 0;
            for (int i20 = 0; i20 < this.mWidgetsCount; i20++) {
                e eVar = this.mWidgets[i20];
                if (eVar.getVisibility() != 8) {
                    eVarArr[i19] = eVar;
                    i19++;
                }
            }
            i13 = i19;
        } else {
            i13 = i12;
        }
        this.f4248P0 = eVarArr;
        this.f4249Q0 = i13;
        int i21 = this.f4241I0;
        if (i21 == 0) {
            iArr = iArr2;
            z8 = true;
            J(eVarArr, i13, this.f4243K0, i16, iArr2);
        } else if (i21 == 1) {
            z8 = true;
            iArr = iArr2;
            I(eVarArr, i13, this.f4243K0, i16, iArr2);
        } else if (i21 != 2) {
            z8 = true;
            iArr = iArr2;
        } else {
            z8 = true;
            iArr = iArr2;
            H(eVarArr, i13, this.f4243K0, i16, iArr2);
        }
        int iMin = iArr[0] + paddingLeft + paddingRight;
        int iMin2 = iArr[z8 ? 1 : 0] + paddingTop + paddingBottom;
        if (i8 == 1073741824) {
            iMin = i9;
        } else if (i8 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i9);
        } else if (i8 != 0) {
            iMin = 0;
        }
        if (i10 == 1073741824) {
            iMin2 = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i11);
        } else if (i10 != 0) {
            iMin2 = 0;
        }
        setMeasure(iMin, iMin2);
        setWidth(iMin);
        setHeight(iMin2);
        if (this.mWidgetsCount <= 0) {
            z8 = false;
        }
        j(z8);
    }

    public void setFirstHorizontalBias(float f8) {
        this.f4233A0 = f8;
    }

    public void setFirstHorizontalStyle(int i8) {
        this.f4252u0 = i8;
    }

    public void setFirstVerticalBias(float f8) {
        this.f4234B0 = f8;
    }

    public void setFirstVerticalStyle(int i8) {
        this.f4253v0 = i8;
    }

    public void setHorizontalAlign(int i8) {
        this.f4239G0 = i8;
    }

    public void setHorizontalBias(float f8) {
        this.f4256y0 = f8;
    }

    public void setHorizontalGap(int i8) {
        this.f4237E0 = i8;
    }

    public void setHorizontalStyle(int i8) {
        this.f4250s0 = i8;
    }

    public void setLastHorizontalBias(float f8) {
        this.f4235C0 = f8;
    }

    public void setLastHorizontalStyle(int i8) {
        this.f4254w0 = i8;
    }

    public void setLastVerticalBias(float f8) {
        this.f4236D0 = f8;
    }

    public void setLastVerticalStyle(int i8) {
        this.f4255x0 = i8;
    }

    public void setMaxElementsWrap(int i8) {
        this.f4242J0 = i8;
    }

    public void setOrientation(int i8) {
        this.f4243K0 = i8;
    }

    public void setVerticalAlign(int i8) {
        this.f4240H0 = i8;
    }

    public void setVerticalBias(float f8) {
        this.f4257z0 = f8;
    }

    public void setVerticalGap(int i8) {
        this.f4238F0 = i8;
    }

    public void setVerticalStyle(int i8) {
        this.f4251t0 = i8;
    }

    public void setWrapMode(int i8) {
        this.f4241I0 = i8;
    }
}
