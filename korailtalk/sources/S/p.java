package S;

import R.d;
import R.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a */
    R.e f4591a;

    /* renamed from: b */
    m f4592b;

    /* renamed from: c */
    protected e.b f4593c;
    public int matchConstraintsType;

    /* renamed from: d */
    g f4594d = new g(this);
    public int orientation = 0;

    /* renamed from: e */
    boolean f4595e = false;
    public f start = new f(this);
    public f end = new f(this);

    /* renamed from: f */
    protected b f4596f = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4597a;

        static {
            int[] iArr = new int[d.b.values().length];
            f4597a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4597a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4597a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4597a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4597a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(R.e eVar) {
        this.f4591a = eVar;
    }

    private void h(int i8, int i9) {
        int i10 = this.matchConstraintsType;
        if (i10 == 0) {
            this.f4594d.resolve(e(i9, i8));
            return;
        }
        if (i10 == 1) {
            this.f4594d.resolve(Math.min(e(this.f4594d.wrapValue, i8), i9));
            return;
        }
        if (i10 == 2) {
            R.e parent = this.f4591a.getParent();
            if (parent != null) {
                if ((i8 == 0 ? parent.horizontalRun : parent.verticalRun).f4594d.resolved) {
                    R.e eVar = this.f4591a;
                    this.f4594d.resolve(e((int) ((r9.value * (i8 == 0 ? eVar.mMatchConstraintPercentWidth : eVar.mMatchConstraintPercentHeight)) + 0.5f), i8));
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 3) {
            return;
        }
        R.e eVar2 = this.f4591a;
        p pVar = eVar2.horizontalRun;
        e.b bVar = pVar.f4593c;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.matchConstraintsType == 3) {
            n nVar = eVar2.verticalRun;
            if (nVar.f4593c == bVar2 && nVar.matchConstraintsType == 3) {
                return;
            }
        }
        if (i8 == 0) {
            pVar = eVar2.verticalRun;
        }
        if (pVar.f4594d.resolved) {
            float dimensionRatio = eVar2.getDimensionRatio();
            this.f4594d.resolve(i8 == 1 ? (int) ((pVar.f4594d.value / dimensionRatio) + 0.5f) : (int) ((dimensionRatio * pVar.f4594d.value) + 0.5f));
        }
    }

    protected final void a(f fVar, f fVar2, int i8) {
        fVar.f4564g.add(fVar2);
        fVar.f4560c = i8;
        fVar2.f4563f.add(fVar);
    }

    abstract void applyToWidget();

    protected final void b(f fVar, f fVar2, int i8, g gVar) {
        fVar.f4564g.add(fVar2);
        fVar.f4564g.add(this.f4594d);
        fVar.f4561d = i8;
        fVar.f4562e = gVar;
        fVar2.f4563f.add(fVar);
        gVar.f4563f.add(fVar);
    }

    abstract void c();

    abstract void d();

    protected final int e(int i8, int i9) {
        int iMax;
        if (i9 == 0) {
            R.e eVar = this.f4591a;
            int i10 = eVar.mMatchConstraintMaxWidth;
            iMax = Math.max(eVar.mMatchConstraintMinWidth, i8);
            if (i10 > 0) {
                iMax = Math.min(i10, i8);
            }
            if (iMax == i8) {
                return i8;
            }
        } else {
            R.e eVar2 = this.f4591a;
            int i11 = eVar2.mMatchConstraintMaxHeight;
            iMax = Math.max(eVar2.mMatchConstraintMinHeight, i8);
            if (i11 > 0) {
                iMax = Math.min(i11, i8);
            }
            if (iMax == i8) {
                return i8;
            }
        }
        return iMax;
    }

    protected final f f(R.d dVar) {
        R.d dVar2 = dVar.mTarget;
        if (dVar2 == null) {
            return null;
        }
        R.e eVar = dVar2.mOwner;
        int i8 = a.f4597a[dVar2.mType.ordinal()];
        if (i8 == 1) {
            return eVar.horizontalRun.start;
        }
        if (i8 == 2) {
            return eVar.horizontalRun.end;
        }
        if (i8 == 3) {
            return eVar.verticalRun.start;
        }
        if (i8 == 4) {
            return eVar.verticalRun.baseline;
        }
        if (i8 != 5) {
            return null;
        }
        return eVar.verticalRun.end;
    }

    protected final f g(R.d dVar, int i8) {
        R.d dVar2 = dVar.mTarget;
        if (dVar2 == null) {
            return null;
        }
        R.e eVar = dVar2.mOwner;
        p pVar = i8 == 0 ? eVar.horizontalRun : eVar.verticalRun;
        int i9 = a.f4597a[dVar2.mType.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 5) {
                        return null;
                    }
                }
            }
            return pVar.end;
        }
        return pVar.start;
    }

    public long getWrapDimension() {
        if (this.f4594d.resolved) {
            return r0.value;
        }
        return 0L;
    }

    abstract boolean i();

    public boolean isCenterConnection() {
        int size = this.start.f4564g.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            if (((f) this.start.f4564g.get(i9)).f4558a != this) {
                i8++;
            }
        }
        int size2 = this.end.f4564g.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (((f) this.end.f4564g.get(i10)).f4558a != this) {
                i8++;
            }
        }
        return i8 >= 2;
    }

    public boolean isDimensionResolved() {
        return this.f4594d.resolved;
    }

    public boolean isResolved() {
        return this.f4595e;
    }

    protected void j(d dVar, R.d dVar2, R.d dVar3, int i8) {
        f fVarF = f(dVar2);
        f fVarF2 = f(dVar3);
        if (fVarF.resolved && fVarF2.resolved) {
            int margin = fVarF.value + dVar2.getMargin();
            int margin2 = fVarF2.value - dVar3.getMargin();
            int i9 = margin2 - margin;
            if (!this.f4594d.resolved && this.f4593c == e.b.MATCH_CONSTRAINT) {
                h(i8, i9);
            }
            g gVar = this.f4594d;
            if (gVar.resolved) {
                if (gVar.value == i9) {
                    this.start.resolve(margin);
                    this.end.resolve(margin2);
                    return;
                }
                R.e eVar = this.f4591a;
                float horizontalBiasPercent = i8 == 0 ? eVar.getHorizontalBiasPercent() : eVar.getVerticalBiasPercent();
                if (fVarF == fVarF2) {
                    margin = fVarF.value;
                    margin2 = fVarF2.value;
                    horizontalBiasPercent = 0.5f;
                }
                this.start.resolve((int) (margin + 0.5f + (((margin2 - margin) - this.f4594d.value) * horizontalBiasPercent)));
                this.end.resolve(this.start.value + this.f4594d.value);
            }
        }
    }

    public long wrapSize(int i8) {
        int i9;
        g gVar = this.f4594d;
        if (!gVar.resolved) {
            return 0L;
        }
        long j8 = gVar.value;
        if (isCenterConnection()) {
            i9 = this.start.f4560c - this.end.f4560c;
        } else {
            if (i8 != 0) {
                return j8 - this.end.f4560c;
            }
            i9 = this.start.f4560c;
        }
        return j8 + i9;
    }

    protected void k(d dVar) {
    }

    protected void l(d dVar) {
    }

    @Override // S.d
    public void update(d dVar) {
    }
}
