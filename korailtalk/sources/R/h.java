package R;

import R.d;
import R.e;
import java.util.HashMap;

/* loaded from: classes.dex */
public class h extends e {
    public static final int HORIZONTAL = 0;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNWON = -1;
    public static final int VERTICAL = 1;

    /* renamed from: f0 */
    protected float f4276f0 = -1.0f;

    /* renamed from: g0 */
    protected int f4277g0 = -1;

    /* renamed from: h0 */
    protected int f4278h0 = -1;

    /* renamed from: i0 */
    private d f4279i0 = this.mTop;

    /* renamed from: j0 */
    private int f4280j0 = 0;

    /* renamed from: k0 */
    private int f4281k0 = 0;

    /* renamed from: l0 */
    private boolean f4282l0;

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4283a;

        static {
            int[] iArr = new int[d.b.values().length];
            f4283a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4283a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4283a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4283a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4283a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4283a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4283a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4283a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4283a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f4203r.clear();
        this.f4203r.add(this.f4279i0);
        int length = this.mListAnchors.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.mListAnchors[i8] = this.f4279i0;
        }
    }

    @Override // R.e
    public void addToSolver(Q.d dVar, boolean z8) {
        f fVar = (f) getParent();
        if (fVar == null) {
            return;
        }
        d anchor = fVar.getAnchor(d.b.LEFT);
        d anchor2 = fVar.getAnchor(d.b.RIGHT);
        e eVar = this.mParent;
        boolean z9 = eVar != null && eVar.mListDimensionBehaviors[0] == e.b.WRAP_CONTENT;
        if (this.f4280j0 == 0) {
            anchor = fVar.getAnchor(d.b.TOP);
            anchor2 = fVar.getAnchor(d.b.BOTTOM);
            e eVar2 = this.mParent;
            z9 = eVar2 != null && eVar2.mListDimensionBehaviors[1] == e.b.WRAP_CONTENT;
        }
        if (this.f4282l0 && this.f4279i0.hasFinalValue()) {
            Q.i iVarCreateObjectVariable = dVar.createObjectVariable(this.f4279i0);
            dVar.addEquality(iVarCreateObjectVariable, this.f4279i0.getFinalValue());
            if (this.f4277g0 != -1) {
                if (z9) {
                    dVar.addGreaterThan(dVar.createObjectVariable(anchor2), iVarCreateObjectVariable, 0, 5);
                }
            } else if (this.f4278h0 != -1 && z9) {
                Q.i iVarCreateObjectVariable2 = dVar.createObjectVariable(anchor2);
                dVar.addGreaterThan(iVarCreateObjectVariable, dVar.createObjectVariable(anchor), 0, 5);
                dVar.addGreaterThan(iVarCreateObjectVariable2, iVarCreateObjectVariable, 0, 5);
            }
            this.f4282l0 = false;
            return;
        }
        if (this.f4277g0 != -1) {
            Q.i iVarCreateObjectVariable3 = dVar.createObjectVariable(this.f4279i0);
            dVar.addEquality(iVarCreateObjectVariable3, dVar.createObjectVariable(anchor), this.f4277g0, 8);
            if (z9) {
                dVar.addGreaterThan(dVar.createObjectVariable(anchor2), iVarCreateObjectVariable3, 0, 5);
                return;
            }
            return;
        }
        if (this.f4278h0 == -1) {
            if (this.f4276f0 != -1.0f) {
                dVar.addConstraint(Q.d.createRowDimensionPercent(dVar, dVar.createObjectVariable(this.f4279i0), dVar.createObjectVariable(anchor2), this.f4276f0));
                return;
            }
            return;
        }
        Q.i iVarCreateObjectVariable4 = dVar.createObjectVariable(this.f4279i0);
        Q.i iVarCreateObjectVariable5 = dVar.createObjectVariable(anchor2);
        dVar.addEquality(iVarCreateObjectVariable4, iVarCreateObjectVariable5, -this.f4278h0, 8);
        if (z9) {
            dVar.addGreaterThan(iVarCreateObjectVariable4, dVar.createObjectVariable(anchor), 0, 5);
            dVar.addGreaterThan(iVarCreateObjectVariable5, iVarCreateObjectVariable4, 0, 5);
        }
    }

    @Override // R.e
    public boolean allowedInBarrier() {
        return true;
    }

    @Override // R.e
    public void copy(e eVar, HashMap<e, e> map) {
        super.copy(eVar, map);
        h hVar = (h) eVar;
        this.f4276f0 = hVar.f4276f0;
        this.f4277g0 = hVar.f4277g0;
        this.f4278h0 = hVar.f4278h0;
        setOrientation(hVar.f4280j0);
    }

    public void cyclePosition() {
        if (this.f4277g0 != -1) {
            j();
        } else if (this.f4276f0 != -1.0f) {
            i();
        } else if (this.f4278h0 != -1) {
            h();
        }
    }

    public d getAnchor() {
        return this.f4279i0;
    }

    public int getOrientation() {
        return this.f4280j0;
    }

    public int getRelativeBegin() {
        return this.f4277g0;
    }

    public int getRelativeBehaviour() {
        if (this.f4276f0 != -1.0f) {
            return 0;
        }
        if (this.f4277g0 != -1) {
            return 1;
        }
        return this.f4278h0 != -1 ? 2 : -1;
    }

    public int getRelativeEnd() {
        return this.f4278h0;
    }

    public float getRelativePercent() {
        return this.f4276f0;
    }

    @Override // R.e
    public String getType() {
        return "Guideline";
    }

    void h() {
        int x8 = getX();
        if (this.f4280j0 == 0) {
            x8 = getY();
        }
        setGuideBegin(x8);
    }

    void i() {
        int width = getParent().getWidth() - getX();
        if (this.f4280j0 == 0) {
            width = getParent().getHeight() - getY();
        }
        setGuideEnd(width);
    }

    public boolean isPercent() {
        return this.f4276f0 != -1.0f && this.f4277g0 == -1 && this.f4278h0 == -1;
    }

    @Override // R.e
    public boolean isResolvedHorizontally() {
        return this.f4282l0;
    }

    @Override // R.e
    public boolean isResolvedVertically() {
        return this.f4282l0;
    }

    void j() {
        float x8 = getX() / getParent().getWidth();
        if (this.f4280j0 == 0) {
            x8 = getY() / getParent().getHeight();
        }
        setGuidePercent(x8);
    }

    public void setFinalValue(int i8) {
        this.f4279i0.setFinalValue(i8);
        this.f4282l0 = true;
    }

    public void setGuideBegin(int i8) {
        if (i8 > -1) {
            this.f4276f0 = -1.0f;
            this.f4277g0 = i8;
            this.f4278h0 = -1;
        }
    }

    public void setGuideEnd(int i8) {
        if (i8 > -1) {
            this.f4276f0 = -1.0f;
            this.f4277g0 = -1;
            this.f4278h0 = i8;
        }
    }

    public void setGuidePercent(int i8) {
        setGuidePercent(i8 / 100.0f);
    }

    public void setMinimumPosition(int i8) {
        this.f4281k0 = i8;
    }

    public void setOrientation(int i8) {
        if (this.f4280j0 == i8) {
            return;
        }
        this.f4280j0 = i8;
        this.f4203r.clear();
        if (this.f4280j0 == 1) {
            this.f4279i0 = this.mLeft;
        } else {
            this.f4279i0 = this.mTop;
        }
        this.f4203r.add(this.f4279i0);
        int length = this.mListAnchors.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.mListAnchors[i9] = this.f4279i0;
        }
    }

    @Override // R.e
    public void updateFromSolver(Q.d dVar, boolean z8) {
        if (getParent() == null) {
            return;
        }
        int objectVariableValue = dVar.getObjectVariableValue(this.f4279i0);
        if (this.f4280j0 == 1) {
            setX(objectVariableValue);
            setY(0);
            setHeight(getParent().getHeight());
            setWidth(0);
            return;
        }
        setX(0);
        setY(objectVariableValue);
        setWidth(getParent().getWidth());
        setHeight(0);
    }

    @Override // R.e
    public d getAnchor(d.b bVar) {
        switch (a.f4283a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f4280j0 == 1) {
                    return this.f4279i0;
                }
                break;
            case 3:
            case 4:
                if (this.f4280j0 == 0) {
                    return this.f4279i0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }

    public void setGuidePercent(float f8) {
        if (f8 > -1.0f) {
            this.f4276f0 = f8;
            this.f4277g0 = -1;
            this.f4278h0 = -1;
        }
    }
}
