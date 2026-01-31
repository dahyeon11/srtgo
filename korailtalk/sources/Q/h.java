package Q;

import Q.b;
import Q7.X;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class h extends Q.b {

    /* renamed from: f */
    private int f3866f;

    /* renamed from: g */
    private i[] f3867g;

    /* renamed from: h */
    private i[] f3868h;

    /* renamed from: i */
    private int f3869i;

    /* renamed from: j */
    b f3870j;

    /* renamed from: k */
    c f3871k;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(i iVar, i iVar2) {
            return iVar.id - iVar2.id;
        }
    }

    class b implements Comparable {

        /* renamed from: a */
        i f3873a;

        /* renamed from: b */
        h f3874b;

        public b(h hVar) {
            this.f3874b = hVar;
        }

        public void add(i iVar) {
            for (int i8 = 0; i8 < 9; i8++) {
                float[] fArr = this.f3873a.f3880d;
                float f8 = fArr[i8] + iVar.f3880d[i8];
                fArr[i8] = f8;
                if (Math.abs(f8) < 1.0E-4f) {
                    this.f3873a.f3880d[i8] = 0.0f;
                }
            }
        }

        public boolean addToGoal(i iVar, float f8) {
            boolean z8 = true;
            if (!this.f3873a.inGoal) {
                for (int i8 = 0; i8 < 9; i8++) {
                    float f9 = iVar.f3880d[i8];
                    if (f9 != 0.0f) {
                        float f10 = f9 * f8;
                        if (Math.abs(f10) < 1.0E-4f) {
                            f10 = 0.0f;
                        }
                        this.f3873a.f3880d[i8] = f10;
                    } else {
                        this.f3873a.f3880d[i8] = 0.0f;
                    }
                }
                return true;
            }
            for (int i9 = 0; i9 < 9; i9++) {
                float[] fArr = this.f3873a.f3880d;
                float f11 = fArr[i9] + (iVar.f3880d[i9] * f8);
                fArr[i9] = f11;
                if (Math.abs(f11) < 1.0E-4f) {
                    this.f3873a.f3880d[i9] = 0.0f;
                } else {
                    z8 = false;
                }
            }
            if (z8) {
                h.this.q(this.f3873a);
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f3873a.id - ((i) obj).id;
        }

        public void init(i iVar) {
            this.f3873a = iVar;
        }

        public final boolean isNegative() {
            for (int i8 = 8; i8 >= 0; i8--) {
                float f8 = this.f3873a.f3880d[i8];
                if (f8 > 0.0f) {
                    return false;
                }
                if (f8 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i8 = 0; i8 < 9; i8++) {
                if (this.f3873a.f3880d[i8] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isSmallerThan(i iVar) {
            int i8 = 8;
            while (true) {
                if (i8 < 0) {
                    break;
                }
                float f8 = iVar.f3880d[i8];
                float f9 = this.f3873a.f3880d[i8];
                if (f9 == f8) {
                    i8--;
                } else if (f9 < f8) {
                    return true;
                }
            }
            return false;
        }

        public void reset() {
            Arrays.fill(this.f3873a.f3880d, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f3873a != null) {
                for (int i8 = 0; i8 < 9; i8++) {
                    str = str + this.f3873a.f3880d[i8] + X.SPACE;
                }
            }
            return str + "] " + this.f3873a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f3866f = 128;
        this.f3867g = new i[128];
        this.f3868h = new i[128];
        this.f3869i = 0;
        this.f3870j = new b(this);
        this.f3871k = cVar;
    }

    private final void p(i iVar) {
        int i8;
        int i9 = this.f3869i + 1;
        i[] iVarArr = this.f3867g;
        if (i9 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f3867g = iVarArr2;
            this.f3868h = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f3867g;
        int i10 = this.f3869i;
        iVarArr3[i10] = iVar;
        int i11 = i10 + 1;
        this.f3869i = i11;
        if (i11 > 1 && iVarArr3[i10].id > iVar.id) {
            int i12 = 0;
            while (true) {
                i8 = this.f3869i;
                if (i12 >= i8) {
                    break;
                }
                this.f3868h[i12] = this.f3867g[i12];
                i12++;
            }
            Arrays.sort(this.f3868h, 0, i8, new a());
            for (int i13 = 0; i13 < this.f3869i; i13++) {
                this.f3867g[i13] = this.f3868h[i13];
            }
        }
        iVar.inGoal = true;
        iVar.addToRow(this);
    }

    public final void q(i iVar) {
        int i8 = 0;
        while (i8 < this.f3869i) {
            if (this.f3867g[i8] == iVar) {
                while (true) {
                    int i9 = this.f3869i;
                    if (i8 >= i9 - 1) {
                        this.f3869i = i9 - 1;
                        iVar.inGoal = false;
                        return;
                    } else {
                        i[] iVarArr = this.f3867g;
                        int i10 = i8 + 1;
                        iVarArr[i8] = iVarArr[i10];
                        i8 = i10;
                    }
                }
            } else {
                i8++;
            }
        }
    }

    @Override // Q.b, Q.d.a
    public void addError(i iVar) {
        this.f3870j.init(iVar);
        this.f3870j.reset();
        iVar.f3880d[iVar.strength] = 1.0f;
        p(iVar);
    }

    @Override // Q.b, Q.d.a
    public void clear() {
        this.f3869i = 0;
        this.f3840b = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x002e  */
    @Override // Q.b, Q.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Q.i getPivotCandidate(Q.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f3869i
            if (r0 >= r2) goto L32
            Q.i[] r2 = r4.f3867g
            r2 = r2[r0]
            int r3 = r2.id
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            Q.h$b r3 = r4.f3870j
            r3.init(r2)
            if (r1 != r5) goto L22
            Q.h$b r2 = r4.f3870j
            boolean r2 = r2.isNegative()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            Q.h$b r2 = r4.f3870j
            Q.i[] r3 = r4.f3867g
            r3 = r3[r1]
            boolean r2 = r2.isSmallerThan(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            Q.i[] r5 = r4.f3867g
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.h.getPivotCandidate(Q.d, boolean[]):Q.i");
    }

    @Override // Q.b, Q.d.a
    public boolean isEmpty() {
        return this.f3869i == 0;
    }

    @Override // Q.b
    public String toString() {
        String str = " goal -> (" + this.f3840b + ") : ";
        for (int i8 = 0; i8 < this.f3869i; i8++) {
            this.f3870j.init(this.f3867g[i8]);
            str = str + this.f3870j + X.SPACE;
        }
        return str;
    }

    @Override // Q.b, Q.d.a
    public void updateFromRow(d dVar, Q.b bVar, boolean z8) {
        i iVar = bVar.f3839a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.variables;
        int currentSize = aVar.getCurrentSize();
        for (int i8 = 0; i8 < currentSize; i8++) {
            i variable = aVar.getVariable(i8);
            float variableValue = aVar.getVariableValue(i8);
            this.f3870j.init(variable);
            if (this.f3870j.addToGoal(iVar, variableValue)) {
                p(variable);
            }
            this.f3840b += bVar.f3840b * variableValue;
        }
        q(iVar);
    }
}
