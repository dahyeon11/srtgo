package Q;

import Q.d;
import Q.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: a, reason: collision with root package name */
    i f3839a = null;

    /* renamed from: b, reason: collision with root package name */
    float f3840b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f3841c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f3842d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    boolean f3843e = false;
    public a variables;

    public interface a {
        void add(i iVar, float f8, boolean z8);

        void clear();

        boolean contains(i iVar);

        void display();

        void divideByAmount(float f8);

        float get(i iVar);

        int getCurrentSize();

        i getVariable(int i8);

        float getVariableValue(int i8);

        int indexOf(i iVar);

        void invert();

        void put(i iVar, float f8);

        float remove(i iVar, boolean z8);

        int sizeInBytes();

        float use(b bVar, boolean z8);
    }

    public b() {
    }

    private boolean j(i iVar, d dVar) {
        return iVar.usageInRowCount <= 1;
    }

    private i k(boolean[] zArr, i iVar) {
        i.a aVar;
        int currentSize = this.variables.getCurrentSize();
        i iVar2 = null;
        float f8 = 0.0f;
        for (int i8 = 0; i8 < currentSize; i8++) {
            float variableValue = this.variables.getVariableValue(i8);
            if (variableValue < 0.0f) {
                i variable = this.variables.getVariable(i8);
                if ((zArr == null || !zArr[variable.id]) && variable != iVar && (((aVar = variable.f3881e) == i.a.SLACK || aVar == i.a.ERROR) && variableValue < f8)) {
                    f8 = variableValue;
                    iVar2 = variable;
                }
            }
        }
        return iVar2;
    }

    b a(i iVar, int i8) {
        this.variables.put(iVar, i8);
        return this;
    }

    public b addError(d dVar, int i8) {
        this.variables.put(dVar.createErrorVariable(i8, "ep"), 1.0f);
        this.variables.put(dVar.createErrorVariable(i8, "em"), -1.0f);
        return this;
    }

    boolean b(d dVar) {
        boolean z8;
        i iVarC = c(dVar);
        if (iVarC == null) {
            z8 = true;
        } else {
            l(iVarC);
            z8 = false;
        }
        if (this.variables.getCurrentSize() == 0) {
            this.f3843e = true;
        }
        return z8;
    }

    i c(d dVar) {
        int currentSize = this.variables.getCurrentSize();
        i iVar = null;
        float f8 = 0.0f;
        float f9 = 0.0f;
        boolean z8 = false;
        boolean z9 = false;
        i iVar2 = null;
        for (int i8 = 0; i8 < currentSize; i8++) {
            float variableValue = this.variables.getVariableValue(i8);
            i variable = this.variables.getVariable(i8);
            if (variable.f3881e == i.a.UNRESTRICTED) {
                if (iVar == null || f8 > variableValue) {
                    boolean zJ = j(variable, dVar);
                    z8 = zJ;
                    f8 = variableValue;
                    iVar = variable;
                } else if (!z8 && j(variable, dVar)) {
                    f8 = variableValue;
                    iVar = variable;
                    z8 = true;
                }
            } else if (iVar == null && variableValue < 0.0f) {
                if (iVar2 == null || f9 > variableValue) {
                    boolean zJ2 = j(variable, dVar);
                    z9 = zJ2;
                    f9 = variableValue;
                    iVar2 = variable;
                } else if (!z9 && j(variable, dVar)) {
                    f9 = variableValue;
                    iVar2 = variable;
                    z9 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // Q.d.a
    public void clear() {
        this.variables.clear();
        this.f3839a = null;
        this.f3840b = 0.0f;
    }

    public b createRowDimensionRatio(i iVar, i iVar2, i iVar3, i iVar4, float f8) {
        this.variables.put(iVar, -1.0f);
        this.variables.put(iVar2, 1.0f);
        this.variables.put(iVar3, f8);
        this.variables.put(iVar4, -f8);
        return this;
    }

    public b createRowEqualDimension(float f8, float f9, float f10, i iVar, int i8, i iVar2, int i9, i iVar3, int i10, i iVar4, int i11) {
        if (f9 == 0.0f || f8 == f10) {
            this.f3840b = ((-i8) - i9) + i10 + i11;
            this.variables.put(iVar, 1.0f);
            this.variables.put(iVar2, -1.0f);
            this.variables.put(iVar4, 1.0f);
            this.variables.put(iVar3, -1.0f);
        } else {
            float f11 = (f8 / f9) / (f10 / f9);
            this.f3840b = ((-i8) - i9) + (i10 * f11) + (i11 * f11);
            this.variables.put(iVar, 1.0f);
            this.variables.put(iVar2, -1.0f);
            this.variables.put(iVar4, f11);
            this.variables.put(iVar3, -f11);
        }
        return this;
    }

    public b createRowEqualMatchDimensions(float f8, float f9, float f10, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f3840b = 0.0f;
        if (f9 == 0.0f || f8 == f10) {
            this.variables.put(iVar, 1.0f);
            this.variables.put(iVar2, -1.0f);
            this.variables.put(iVar4, 1.0f);
            this.variables.put(iVar3, -1.0f);
        } else if (f8 == 0.0f) {
            this.variables.put(iVar, 1.0f);
            this.variables.put(iVar2, -1.0f);
        } else if (f10 == 0.0f) {
            this.variables.put(iVar3, 1.0f);
            this.variables.put(iVar4, -1.0f);
        } else {
            float f11 = (f8 / f9) / (f10 / f9);
            this.variables.put(iVar, 1.0f);
            this.variables.put(iVar2, -1.0f);
            this.variables.put(iVar4, f11);
            this.variables.put(iVar3, -f11);
        }
        return this;
    }

    public b createRowEquals(i iVar, int i8) {
        if (i8 < 0) {
            this.f3840b = i8 * (-1);
            this.variables.put(iVar, 1.0f);
        } else {
            this.f3840b = i8;
            this.variables.put(iVar, -1.0f);
        }
        return this;
    }

    public b createRowGreaterThan(i iVar, i iVar2, i iVar3, int i8) {
        boolean z8 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z8 = true;
            }
            this.f3840b = i8;
        }
        if (z8) {
            this.variables.put(iVar, 1.0f);
            this.variables.put(iVar2, -1.0f);
            this.variables.put(iVar3, -1.0f);
        } else {
            this.variables.put(iVar, -1.0f);
            this.variables.put(iVar2, 1.0f);
            this.variables.put(iVar3, 1.0f);
        }
        return this;
    }

    public b createRowLowerThan(i iVar, i iVar2, i iVar3, int i8) {
        boolean z8 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z8 = true;
            }
            this.f3840b = i8;
        }
        if (z8) {
            this.variables.put(iVar, 1.0f);
            this.variables.put(iVar2, -1.0f);
            this.variables.put(iVar3, 1.0f);
        } else {
            this.variables.put(iVar, -1.0f);
            this.variables.put(iVar2, 1.0f);
            this.variables.put(iVar3, -1.0f);
        }
        return this;
    }

    public b createRowWithAngle(i iVar, i iVar2, i iVar3, i iVar4, float f8) {
        this.variables.put(iVar3, 0.5f);
        this.variables.put(iVar4, 0.5f);
        this.variables.put(iVar, -0.5f);
        this.variables.put(iVar2, -0.5f);
        this.f3840b = -f8;
        return this;
    }

    b d(i iVar, i iVar2, int i8, float f8, i iVar3, i iVar4, int i9) {
        if (iVar2 == iVar3) {
            this.variables.put(iVar, 1.0f);
            this.variables.put(iVar4, 1.0f);
            this.variables.put(iVar2, -2.0f);
            return this;
        }
        if (f8 == 0.5f) {
            this.variables.put(iVar, 1.0f);
            this.variables.put(iVar2, -1.0f);
            this.variables.put(iVar3, -1.0f);
            this.variables.put(iVar4, 1.0f);
            if (i8 > 0 || i9 > 0) {
                this.f3840b = (-i8) + i9;
            }
        } else if (f8 <= 0.0f) {
            this.variables.put(iVar, -1.0f);
            this.variables.put(iVar2, 1.0f);
            this.f3840b = i8;
        } else if (f8 >= 1.0f) {
            this.variables.put(iVar4, -1.0f);
            this.variables.put(iVar3, 1.0f);
            this.f3840b = -i9;
        } else {
            float f9 = 1.0f - f8;
            this.variables.put(iVar, f9 * 1.0f);
            this.variables.put(iVar2, f9 * (-1.0f));
            this.variables.put(iVar3, (-1.0f) * f8);
            this.variables.put(iVar4, 1.0f * f8);
            if (i8 > 0 || i9 > 0) {
                this.f3840b = ((-i8) * f9) + (i9 * f8);
            }
        }
        return this;
    }

    b e(i iVar, int i8) {
        this.f3839a = iVar;
        float f8 = i8;
        iVar.computedValue = f8;
        this.f3840b = f8;
        this.f3843e = true;
        return this;
    }

    b f(i iVar, i iVar2, float f8) {
        this.variables.put(iVar, -1.0f);
        this.variables.put(iVar2, f8);
        return this;
    }

    void g() {
        float f8 = this.f3840b;
        if (f8 < 0.0f) {
            this.f3840b = f8 * (-1.0f);
            this.variables.invert();
        }
    }

    @Override // Q.d.a
    public i getKey() {
        return this.f3839a;
    }

    @Override // Q.d.a
    public i getPivotCandidate(d dVar, boolean[] zArr) {
        return k(zArr, null);
    }

    boolean h() {
        i iVar = this.f3839a;
        return iVar != null && (iVar.f3881e == i.a.UNRESTRICTED || this.f3840b >= 0.0f);
    }

    boolean i(i iVar) {
        return this.variables.contains(iVar);
    }

    @Override // Q.d.a
    public void initFromRow(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f3839a = null;
            this.variables.clear();
            for (int i8 = 0; i8 < bVar.variables.getCurrentSize(); i8++) {
                this.variables.add(bVar.variables.getVariable(i8), bVar.variables.getVariableValue(i8), true);
            }
        }
    }

    @Override // Q.d.a
    public boolean isEmpty() {
        return this.f3839a == null && this.f3840b == 0.0f && this.variables.getCurrentSize() == 0;
    }

    void l(i iVar) {
        i iVar2 = this.f3839a;
        if (iVar2 != null) {
            this.variables.put(iVar2, -1.0f);
            this.f3839a.f3878b = -1;
            this.f3839a = null;
        }
        float fRemove = this.variables.remove(iVar, true) * (-1.0f);
        this.f3839a = iVar;
        if (fRemove == 1.0f) {
            return;
        }
        this.f3840b /= fRemove;
        this.variables.divideByAmount(fRemove);
    }

    int m() {
        return (this.f3839a != null ? 4 : 0) + 8 + this.variables.sizeInBytes();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String n() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.b.n():java.lang.String");
    }

    public i pickPivot(i iVar) {
        return k(null, iVar);
    }

    public void reset() {
        this.f3839a = null;
        this.variables.clear();
        this.f3840b = 0.0f;
        this.f3843e = false;
    }

    public String toString() {
        return n();
    }

    @Override // Q.d.a
    public void updateFromFinalVariable(d dVar, i iVar, boolean z8) {
        if (iVar.isFinalValue) {
            this.f3840b += iVar.computedValue * this.variables.get(iVar);
            this.variables.remove(iVar, z8);
            if (z8) {
                iVar.removeFromRow(this);
            }
            if (d.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
                this.f3843e = true;
                dVar.hasSimpleDefinition = true;
            }
        }
    }

    @Override // Q.d.a
    public void updateFromRow(d dVar, b bVar, boolean z8) {
        this.f3840b += bVar.f3840b * this.variables.use(bVar, z8);
        if (z8) {
            bVar.f3839a.removeFromRow(this);
        }
        if (d.SIMPLIFY_SYNONYMS && this.f3839a != null && this.variables.getCurrentSize() == 0) {
            this.f3843e = true;
            dVar.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(d dVar, i iVar, boolean z8) {
        if (iVar.f3884h) {
            float f8 = this.variables.get(iVar);
            this.f3840b += iVar.f3886j * f8;
            this.variables.remove(iVar, z8);
            if (z8) {
                iVar.removeFromRow(this);
            }
            this.variables.add(dVar.f3859k.f3847d[iVar.f3885i], f8, z8);
            if (d.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
                this.f3843e = true;
                dVar.hasSimpleDefinition = true;
            }
        }
    }

    @Override // Q.d.a
    public void updateFromSystem(d dVar) {
        if (dVar.f3854f.length == 0) {
            return;
        }
        boolean z8 = false;
        while (!z8) {
            int currentSize = this.variables.getCurrentSize();
            for (int i8 = 0; i8 < currentSize; i8++) {
                i variable = this.variables.getVariable(i8);
                if (variable.f3878b != -1 || variable.isFinalValue || variable.f3884h) {
                    this.f3842d.add(variable);
                }
            }
            int size = this.f3842d.size();
            if (size > 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    i iVar = (i) this.f3842d.get(i9);
                    if (iVar.isFinalValue) {
                        updateFromFinalVariable(dVar, iVar, true);
                    } else if (iVar.f3884h) {
                        updateFromSynonymVariable(dVar, iVar, true);
                    } else {
                        updateFromRow(dVar, dVar.f3854f[iVar.f3878b], true);
                    }
                }
                this.f3842d.clear();
            } else {
                z8 = true;
            }
        }
        if (d.SIMPLIFY_SYNONYMS && this.f3839a != null && this.variables.getCurrentSize() == 0) {
            this.f3843e = true;
            dVar.hasSimpleDefinition = true;
        }
    }

    @Override // Q.d.a
    public void addError(i iVar) {
        int i8 = iVar.strength;
        float f8 = 1.0f;
        if (i8 != 1) {
            if (i8 == 2) {
                f8 = 1000.0f;
            } else if (i8 == 3) {
                f8 = 1000000.0f;
            } else if (i8 == 4) {
                f8 = 1.0E9f;
            } else if (i8 == 5) {
                f8 = 1.0E12f;
            }
        }
        this.variables.put(iVar, f8);
    }

    public b createRowEquals(i iVar, i iVar2, int i8) {
        boolean z8 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z8 = true;
            }
            this.f3840b = i8;
        }
        if (!z8) {
            this.variables.put(iVar, -1.0f);
            this.variables.put(iVar2, 1.0f);
        } else {
            this.variables.put(iVar, 1.0f);
            this.variables.put(iVar2, -1.0f);
        }
        return this;
    }

    public b(c cVar) {
        this.variables = new Q.a(this, cVar);
    }

    public b createRowGreaterThan(i iVar, int i8, i iVar2) {
        this.f3840b = i8;
        this.variables.put(iVar, -1.0f);
        return this;
    }
}
