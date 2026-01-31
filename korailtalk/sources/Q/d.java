package Q;

import Q.i;
import Q7.X;
import R.d;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;

    /* renamed from: o, reason: collision with root package name */
    private static int f3848o = 1000;
    public static e sMetrics;

    /* renamed from: c, reason: collision with root package name */
    private a f3851c;

    /* renamed from: f, reason: collision with root package name */
    Q.b[] f3854f;

    /* renamed from: k, reason: collision with root package name */
    final c f3859k;

    /* renamed from: n, reason: collision with root package name */
    private a f3862n;
    public boolean hasSimpleDefinition = false;

    /* renamed from: a, reason: collision with root package name */
    int f3849a = 0;

    /* renamed from: b, reason: collision with root package name */
    private HashMap f3850b = null;

    /* renamed from: d, reason: collision with root package name */
    private int f3852d = 32;

    /* renamed from: e, reason: collision with root package name */
    private int f3853e = 32;
    public boolean graphOptimizer = false;
    public boolean newgraphOptimizer = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean[] f3855g = new boolean[32];

    /* renamed from: h, reason: collision with root package name */
    int f3856h = 1;

    /* renamed from: i, reason: collision with root package name */
    int f3857i = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f3858j = 32;

    /* renamed from: l, reason: collision with root package name */
    private i[] f3860l = new i[f3848o];

    /* renamed from: m, reason: collision with root package name */
    private int f3861m = 0;

    interface a {
        void addError(i iVar);

        void clear();

        i getKey();

        i getPivotCandidate(d dVar, boolean[] zArr);

        void initFromRow(a aVar);

        boolean isEmpty();

        void updateFromFinalVariable(d dVar, i iVar, boolean z8);

        void updateFromRow(d dVar, Q.b bVar, boolean z8);

        void updateFromSystem(d dVar);
    }

    class b extends Q.b {
        public b(c cVar) {
            this.variables = new j(this, cVar);
        }
    }

    public d() {
        this.f3854f = null;
        this.f3854f = new Q.b[32];
        j();
        c cVar = new c();
        this.f3859k = cVar;
        this.f3851c = new h(cVar);
        if (OPTIMIZED_ENGINE) {
            this.f3862n = new b(cVar);
        } else {
            this.f3862n = new Q.b(cVar);
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f3859k.f3846c.acquire();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.setType(aVar, str);
        } else {
            iVar.reset();
            iVar.setType(aVar, str);
        }
        int i8 = this.f3861m;
        int i9 = f3848o;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            f3848o = i10;
            this.f3860l = (i[]) Arrays.copyOf(this.f3860l, i10);
        }
        i[] iVarArr = this.f3860l;
        int i11 = this.f3861m;
        this.f3861m = i11 + 1;
        iVarArr[i11] = iVar;
        return iVar;
    }

    private final void b(Q.b bVar) {
        int i8;
        if (SIMPLIFY_SYNONYMS && bVar.f3843e) {
            bVar.f3839a.setFinalValue(this, bVar.f3840b);
        } else {
            Q.b[] bVarArr = this.f3854f;
            int i9 = this.f3857i;
            bVarArr[i9] = bVar;
            i iVar = bVar.f3839a;
            iVar.f3878b = i9;
            this.f3857i = i9 + 1;
            iVar.updateReferencesWithNewDefinition(this, bVar);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i10 = 0;
            while (i10 < this.f3857i) {
                if (this.f3854f[i10] == null) {
                    System.out.println("WTF");
                }
                Q.b bVar2 = this.f3854f[i10];
                if (bVar2 != null && bVar2.f3843e) {
                    bVar2.f3839a.setFinalValue(this, bVar2.f3840b);
                    if (OPTIMIZED_ENGINE) {
                        this.f3859k.f3844a.release(bVar2);
                    } else {
                        this.f3859k.f3845b.release(bVar2);
                    }
                    this.f3854f[i10] = null;
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (true) {
                        i8 = this.f3857i;
                        if (i11 >= i8) {
                            break;
                        }
                        Q.b[] bVarArr2 = this.f3854f;
                        int i13 = i11 - 1;
                        Q.b bVar3 = bVarArr2[i11];
                        bVarArr2[i13] = bVar3;
                        i iVar2 = bVar3.f3839a;
                        if (iVar2.f3878b == i11) {
                            iVar2.f3878b = i13;
                        }
                        i12 = i11;
                        i11++;
                    }
                    if (i12 < i8) {
                        this.f3854f[i12] = null;
                    }
                    this.f3857i = i8 - 1;
                    i10--;
                }
                i10++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    public static Q.b createRowDimensionPercent(d dVar, i iVar, i iVar2, float f8) {
        return dVar.createRow().f(iVar, iVar2, f8);
    }

    private void d() {
        for (int i8 = 0; i8 < this.f3857i; i8++) {
            Q.b bVar = this.f3854f[i8];
            bVar.f3839a.computedValue = bVar.f3840b;
        }
    }

    private void e() {
        System.out.println("Display Rows (" + this.f3857i + "x" + this.f3856h + ")\n");
    }

    private int f(a aVar) {
        for (int i8 = 0; i8 < this.f3857i; i8++) {
            Q.b bVar = this.f3854f[i8];
            if (bVar.f3839a.f3881e != i.a.UNRESTRICTED && bVar.f3840b < 0.0f) {
                boolean z8 = false;
                int i9 = 0;
                while (!z8) {
                    e eVar = sMetrics;
                    if (eVar != null) {
                        eVar.bfs++;
                    }
                    i9++;
                    float f8 = Float.MAX_VALUE;
                    int i10 = 0;
                    int i11 = -1;
                    int i12 = -1;
                    int i13 = 0;
                    while (true) {
                        if (i10 >= this.f3857i) {
                            break;
                        }
                        Q.b bVar2 = this.f3854f[i10];
                        if (bVar2.f3839a.f3881e != i.a.UNRESTRICTED && !bVar2.f3843e && bVar2.f3840b < 0.0f) {
                            int i14 = 9;
                            if (SKIP_COLUMNS) {
                                int currentSize = bVar2.variables.getCurrentSize();
                                int i15 = 0;
                                while (i15 < currentSize) {
                                    i variable = bVar2.variables.getVariable(i15);
                                    float f9 = bVar2.variables.get(variable);
                                    if (f9 > 0.0f) {
                                        int i16 = 0;
                                        while (i16 < i14) {
                                            float f10 = variable.f3879c[i16] / f9;
                                            if ((f10 < f8 && i16 == i13) || i16 > i13) {
                                                i13 = i16;
                                                i12 = variable.id;
                                                i11 = i10;
                                                f8 = f10;
                                            }
                                            i16++;
                                            i14 = 9;
                                        }
                                    }
                                    i15++;
                                    i14 = 9;
                                }
                            } else {
                                for (int i17 = 1; i17 < this.f3856h; i17++) {
                                    i iVar = this.f3859k.f3847d[i17];
                                    float f11 = bVar2.variables.get(iVar);
                                    if (f11 > 0.0f) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f12 = iVar.f3879c[i18] / f11;
                                            if ((f12 < f8 && i18 == i13) || i18 > i13) {
                                                i13 = i18;
                                                i11 = i10;
                                                i12 = i17;
                                                f8 = f12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i10++;
                    }
                    if (i11 != -1) {
                        Q.b bVar3 = this.f3854f[i11];
                        bVar3.f3839a.f3878b = -1;
                        e eVar2 = sMetrics;
                        if (eVar2 != null) {
                            eVar2.pivots++;
                        }
                        bVar3.l(this.f3859k.f3847d[i12]);
                        i iVar2 = bVar3.f3839a;
                        iVar2.f3878b = i11;
                        iVar2.updateReferencesWithNewDefinition(this, bVar3);
                    } else {
                        z8 = true;
                    }
                    if (i9 > this.f3856h / 2) {
                        z8 = true;
                    }
                }
                return i9;
            }
        }
        return 0;
    }

    private void g() {
        int i8 = this.f3852d * 2;
        this.f3852d = i8;
        this.f3854f = (Q.b[]) Arrays.copyOf(this.f3854f, i8);
        c cVar = this.f3859k;
        cVar.f3847d = (i[]) Arrays.copyOf(cVar.f3847d, this.f3852d);
        int i9 = this.f3852d;
        this.f3855g = new boolean[i9];
        this.f3853e = i9;
        this.f3858j = i9;
        e eVar = sMetrics;
        if (eVar != null) {
            eVar.tableSizeIncrease++;
            eVar.maxTableSize = Math.max(eVar.maxTableSize, i9);
            e eVar2 = sMetrics;
            eVar2.lastTableSize = eVar2.maxTableSize;
        }
    }

    public static e getMetrics() {
        return sMetrics;
    }

    private final int i(a aVar, boolean z8) {
        e eVar = sMetrics;
        if (eVar != null) {
            eVar.optimize++;
        }
        for (int i8 = 0; i8 < this.f3856h; i8++) {
            this.f3855g[i8] = false;
        }
        boolean z9 = false;
        int i9 = 0;
        while (!z9) {
            e eVar2 = sMetrics;
            if (eVar2 != null) {
                eVar2.iterations++;
            }
            i9++;
            if (i9 >= this.f3856h * 2) {
                return i9;
            }
            if (aVar.getKey() != null) {
                this.f3855g[aVar.getKey().id] = true;
            }
            i pivotCandidate = aVar.getPivotCandidate(this, this.f3855g);
            if (pivotCandidate != null) {
                boolean[] zArr = this.f3855g;
                int i10 = pivotCandidate.id;
                if (zArr[i10]) {
                    return i9;
                }
                zArr[i10] = true;
            }
            if (pivotCandidate != null) {
                float f8 = Float.MAX_VALUE;
                int i11 = -1;
                for (int i12 = 0; i12 < this.f3857i; i12++) {
                    Q.b bVar = this.f3854f[i12];
                    if (bVar.f3839a.f3881e != i.a.UNRESTRICTED && !bVar.f3843e && bVar.i(pivotCandidate)) {
                        float f9 = bVar.variables.get(pivotCandidate);
                        if (f9 < 0.0f) {
                            float f10 = (-bVar.f3840b) / f9;
                            if (f10 < f8) {
                                i11 = i12;
                                f8 = f10;
                            }
                        }
                    }
                }
                if (i11 > -1) {
                    Q.b bVar2 = this.f3854f[i11];
                    bVar2.f3839a.f3878b = -1;
                    e eVar3 = sMetrics;
                    if (eVar3 != null) {
                        eVar3.pivots++;
                    }
                    bVar2.l(pivotCandidate);
                    i iVar = bVar2.f3839a;
                    iVar.f3878b = i11;
                    iVar.updateReferencesWithNewDefinition(this, bVar2);
                }
            } else {
                z9 = true;
            }
        }
        return i9;
    }

    private void j() {
        int i8 = 0;
        if (OPTIMIZED_ENGINE) {
            while (i8 < this.f3857i) {
                Q.b bVar = this.f3854f[i8];
                if (bVar != null) {
                    this.f3859k.f3844a.release(bVar);
                }
                this.f3854f[i8] = null;
                i8++;
            }
            return;
        }
        while (i8 < this.f3857i) {
            Q.b bVar2 = this.f3854f[i8];
            if (bVar2 != null) {
                this.f3859k.f3845b.release(bVar2);
            }
            this.f3854f[i8] = null;
            i8++;
        }
    }

    public void addCenterPoint(R.e eVar, R.e eVar2, float f8, int i8) {
        d.b bVar = d.b.LEFT;
        i iVarCreateObjectVariable = createObjectVariable(eVar.getAnchor(bVar));
        d.b bVar2 = d.b.TOP;
        i iVarCreateObjectVariable2 = createObjectVariable(eVar.getAnchor(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i iVarCreateObjectVariable3 = createObjectVariable(eVar.getAnchor(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i iVarCreateObjectVariable4 = createObjectVariable(eVar.getAnchor(bVar4));
        i iVarCreateObjectVariable5 = createObjectVariable(eVar2.getAnchor(bVar));
        i iVarCreateObjectVariable6 = createObjectVariable(eVar2.getAnchor(bVar2));
        i iVarCreateObjectVariable7 = createObjectVariable(eVar2.getAnchor(bVar3));
        i iVarCreateObjectVariable8 = createObjectVariable(eVar2.getAnchor(bVar4));
        Q.b bVarCreateRow = createRow();
        double d9 = f8;
        double d10 = i8;
        bVarCreateRow.createRowWithAngle(iVarCreateObjectVariable2, iVarCreateObjectVariable4, iVarCreateObjectVariable6, iVarCreateObjectVariable8, (float) (Math.sin(d9) * d10));
        addConstraint(bVarCreateRow);
        Q.b bVarCreateRow2 = createRow();
        bVarCreateRow2.createRowWithAngle(iVarCreateObjectVariable, iVarCreateObjectVariable3, iVarCreateObjectVariable5, iVarCreateObjectVariable7, (float) (Math.cos(d9) * d10));
        addConstraint(bVarCreateRow2);
    }

    public void addCentering(i iVar, i iVar2, int i8, float f8, i iVar3, i iVar4, int i9, int i10) {
        Q.b bVarCreateRow = createRow();
        bVarCreateRow.d(iVar, iVar2, i8, f8, iVar3, iVar4, i9);
        if (i10 != 8) {
            bVarCreateRow.addError(this, i10);
        }
        addConstraint(bVarCreateRow);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addConstraint(Q.b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            Q.e r0 = Q.d.sMetrics
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.constraints
            long r3 = r3 + r1
            r0.constraints = r3
            boolean r3 = r8.f3843e
            if (r3 == 0) goto L17
            long r3 = r0.simpleconstraints
            long r3 = r3 + r1
            r0.simpleconstraints = r3
        L17:
            int r0 = r7.f3857i
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f3858j
            if (r0 >= r4) goto L26
            int r0 = r7.f3856h
            int r0 = r0 + r3
            int r4 = r7.f3853e
            if (r0 < r4) goto L29
        L26:
            r7.g()
        L29:
            boolean r0 = r8.f3843e
            r4 = 0
            if (r0 != 0) goto La1
            r8.updateFromSystem(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L38
            return
        L38:
            r8.g()
            boolean r0 = r8.b(r7)
            if (r0 == 0) goto L98
            Q.i r0 = r7.createExtraVariable()
            r8.f3839a = r0
            int r5 = r7.f3857i
            r7.b(r8)
            int r6 = r7.f3857i
            int r5 = r5 + r3
            if (r6 != r5) goto L98
            Q.d$a r4 = r7.f3862n
            r4.initFromRow(r8)
            Q.d$a r4 = r7.f3862n
            r7.i(r4, r3)
            int r4 = r0.f3878b
            r5 = -1
            if (r4 != r5) goto L99
            Q.i r4 = r8.f3839a
            if (r4 != r0) goto L76
            Q.i r0 = r8.pickPivot(r0)
            if (r0 == 0) goto L76
            Q.e r4 = Q.d.sMetrics
            if (r4 == 0) goto L73
            long r5 = r4.pivots
            long r5 = r5 + r1
            r4.pivots = r5
        L73:
            r8.l(r0)
        L76:
            boolean r0 = r8.f3843e
            if (r0 != 0) goto L7f
            Q.i r0 = r8.f3839a
            r0.updateReferencesWithNewDefinition(r7, r8)
        L7f:
            boolean r0 = Q.d.OPTIMIZED_ENGINE
            if (r0 == 0) goto L8b
            Q.c r0 = r7.f3859k
            Q.f r0 = r0.f3844a
            r0.release(r8)
            goto L92
        L8b:
            Q.c r0 = r7.f3859k
            Q.f r0 = r0.f3845b
            r0.release(r8)
        L92:
            int r0 = r7.f3857i
            int r0 = r0 - r3
            r7.f3857i = r0
            goto L99
        L98:
            r3 = r4
        L99:
            boolean r0 = r8.h()
            if (r0 != 0) goto La0
            return
        La0:
            r4 = r3
        La1:
            if (r4 != 0) goto La6
            r7.b(r8)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.d.addConstraint(Q.b):void");
    }

    public Q.b addEquality(i iVar, i iVar2, int i8, int i9) {
        if (USE_BASIC_SYNONYMS && i9 == 8 && iVar2.isFinalValue && iVar.f3878b == -1) {
            iVar.setFinalValue(this, iVar2.computedValue + i8);
            return null;
        }
        Q.b bVarCreateRow = createRow();
        bVarCreateRow.createRowEquals(iVar, iVar2, i8);
        if (i9 != 8) {
            bVarCreateRow.addError(this, i9);
        }
        addConstraint(bVarCreateRow);
        return bVarCreateRow;
    }

    public void addGreaterBarrier(i iVar, i iVar2, int i8, boolean z8) {
        Q.b bVarCreateRow = createRow();
        i iVarCreateSlackVariable = createSlackVariable();
        iVarCreateSlackVariable.strength = 0;
        bVarCreateRow.createRowGreaterThan(iVar, iVar2, iVarCreateSlackVariable, i8);
        addConstraint(bVarCreateRow);
    }

    public void addGreaterThan(i iVar, i iVar2, int i8, int i9) {
        Q.b bVarCreateRow = createRow();
        i iVarCreateSlackVariable = createSlackVariable();
        iVarCreateSlackVariable.strength = 0;
        bVarCreateRow.createRowGreaterThan(iVar, iVar2, iVarCreateSlackVariable, i8);
        if (i9 != 8) {
            c(bVarCreateRow, (int) (bVarCreateRow.variables.get(iVarCreateSlackVariable) * (-1.0f)), i9);
        }
        addConstraint(bVarCreateRow);
    }

    public void addLowerBarrier(i iVar, i iVar2, int i8, boolean z8) {
        Q.b bVarCreateRow = createRow();
        i iVarCreateSlackVariable = createSlackVariable();
        iVarCreateSlackVariable.strength = 0;
        bVarCreateRow.createRowLowerThan(iVar, iVar2, iVarCreateSlackVariable, i8);
        addConstraint(bVarCreateRow);
    }

    public void addLowerThan(i iVar, i iVar2, int i8, int i9) {
        Q.b bVarCreateRow = createRow();
        i iVarCreateSlackVariable = createSlackVariable();
        iVarCreateSlackVariable.strength = 0;
        bVarCreateRow.createRowLowerThan(iVar, iVar2, iVarCreateSlackVariable, i8);
        if (i9 != 8) {
            c(bVarCreateRow, (int) (bVarCreateRow.variables.get(iVarCreateSlackVariable) * (-1.0f)), i9);
        }
        addConstraint(bVarCreateRow);
    }

    public void addRatio(i iVar, i iVar2, i iVar3, i iVar4, float f8, int i8) {
        Q.b bVarCreateRow = createRow();
        bVarCreateRow.createRowDimensionRatio(iVar, iVar2, iVar3, iVar4, f8);
        if (i8 != 8) {
            bVarCreateRow.addError(this, i8);
        }
        addConstraint(bVarCreateRow);
    }

    public void addSynonym(i iVar, i iVar2, int i8) {
        if (iVar.f3878b != -1 || i8 != 0) {
            addEquality(iVar, iVar2, i8, 8);
            return;
        }
        if (iVar2.f3884h) {
            iVar2 = this.f3859k.f3847d[iVar2.f3885i];
        }
        if (iVar.f3884h) {
            i iVar3 = this.f3859k.f3847d[iVar.f3885i];
        } else {
            iVar.setSynonym(this, iVar2, 0.0f);
        }
    }

    void c(Q.b bVar, int i8, int i9) {
        bVar.a(createErrorVariable(i9, null), i8);
    }

    public i createErrorVariable(int i8, String str) {
        e eVar = sMetrics;
        if (eVar != null) {
            eVar.errors++;
        }
        if (this.f3856h + 1 >= this.f3853e) {
            g();
        }
        i iVarA = a(i.a.ERROR, str);
        int i9 = this.f3849a + 1;
        this.f3849a = i9;
        this.f3856h++;
        iVarA.id = i9;
        iVarA.strength = i8;
        this.f3859k.f3847d[i9] = iVarA;
        this.f3851c.addError(iVarA);
        return iVarA;
    }

    public i createExtraVariable() {
        e eVar = sMetrics;
        if (eVar != null) {
            eVar.extravariables++;
        }
        if (this.f3856h + 1 >= this.f3853e) {
            g();
        }
        i iVarA = a(i.a.SLACK, null);
        int i8 = this.f3849a + 1;
        this.f3849a = i8;
        this.f3856h++;
        iVarA.id = i8;
        this.f3859k.f3847d[i8] = iVarA;
        return iVarA;
    }

    public i createObjectVariable(Object obj) {
        i solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f3856h + 1 >= this.f3853e) {
            g();
        }
        if (obj instanceof R.d) {
            R.d dVar = (R.d) obj;
            solverVariable = dVar.getSolverVariable();
            if (solverVariable == null) {
                dVar.resetSolverVariable(this.f3859k);
                solverVariable = dVar.getSolverVariable();
            }
            int i8 = solverVariable.id;
            if (i8 == -1 || i8 > this.f3849a || this.f3859k.f3847d[i8] == null) {
                if (i8 != -1) {
                    solverVariable.reset();
                }
                int i9 = this.f3849a + 1;
                this.f3849a = i9;
                this.f3856h++;
                solverVariable.id = i9;
                solverVariable.f3881e = i.a.UNRESTRICTED;
                this.f3859k.f3847d[i9] = solverVariable;
            }
        }
        return solverVariable;
    }

    public Q.b createRow() {
        Q.b bVar;
        if (OPTIMIZED_ENGINE) {
            bVar = (Q.b) this.f3859k.f3844a.acquire();
            if (bVar == null) {
                bVar = new b(this.f3859k);
                OPTIMIZED_ARRAY_ROW_CREATION++;
            } else {
                bVar.reset();
            }
        } else {
            bVar = (Q.b) this.f3859k.f3845b.acquire();
            if (bVar == null) {
                bVar = new Q.b(this.f3859k);
                ARRAY_ROW_CREATION++;
            } else {
                bVar.reset();
            }
        }
        i.a();
        return bVar;
    }

    public i createSlackVariable() {
        e eVar = sMetrics;
        if (eVar != null) {
            eVar.slackvariables++;
        }
        if (this.f3856h + 1 >= this.f3853e) {
            g();
        }
        i iVarA = a(i.a.SLACK, null);
        int i8 = this.f3849a + 1;
        this.f3849a = i8;
        this.f3856h++;
        iVarA.id = i8;
        this.f3859k.f3847d[i8] = iVarA;
        return iVarA;
    }

    public void displayReadableRows() {
        e();
        String str = " num vars " + this.f3849a + X.LF;
        for (int i8 = 0; i8 < this.f3849a + 1; i8++) {
            i iVar = this.f3859k.f3847d[i8];
            if (iVar != null && iVar.isFinalValue) {
                str = str + " $[" + i8 + "] => " + iVar + " = " + iVar.computedValue + X.LF;
            }
        }
        String str2 = str + X.LF;
        for (int i9 = 0; i9 < this.f3849a + 1; i9++) {
            i[] iVarArr = this.f3859k.f3847d;
            i iVar2 = iVarArr[i9];
            if (iVar2 != null && iVar2.f3884h) {
                str2 = str2 + " ~[" + i9 + "] => " + iVar2 + " = " + iVarArr[iVar2.f3885i] + " + " + iVar2.f3886j + X.LF;
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i10 = 0; i10 < this.f3857i; i10++) {
            str3 = (str3 + this.f3854f[i10].n()) + "\n #  ";
        }
        if (this.f3851c != null) {
            str3 = str3 + "Goal: " + this.f3851c + X.LF;
        }
        System.out.println(str3);
    }

    public void displayVariablesReadableRows() {
        e();
        String str = "";
        for (int i8 = 0; i8 < this.f3857i; i8++) {
            if (this.f3854f[i8].f3839a.f3881e == i.a.UNRESTRICTED) {
                str = (str + this.f3854f[i8].n()) + X.LF;
            }
        }
        System.out.println(str + this.f3851c + X.LF);
    }

    public void fillMetrics(e eVar) {
        sMetrics = eVar;
    }

    public c getCache() {
        return this.f3859k;
    }

    public int getMemoryUsed() {
        int iM = 0;
        for (int i8 = 0; i8 < this.f3857i; i8++) {
            Q.b bVar = this.f3854f[i8];
            if (bVar != null) {
                iM += bVar.m();
            }
        }
        return iM;
    }

    public int getNumEquations() {
        return this.f3857i;
    }

    public int getNumVariables() {
        return this.f3849a;
    }

    public int getObjectVariableValue(Object obj) {
        i solverVariable = ((R.d) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    void h(a aVar) {
        e eVar = sMetrics;
        if (eVar != null) {
            eVar.minimizeGoal++;
            eVar.maxVariables = Math.max(eVar.maxVariables, this.f3856h);
            e eVar2 = sMetrics;
            eVar2.maxRows = Math.max(eVar2.maxRows, this.f3857i);
        }
        f(aVar);
        i(aVar, false);
        d();
    }

    public void minimize() {
        e eVar = sMetrics;
        if (eVar != null) {
            eVar.minimize++;
        }
        if (this.f3851c.isEmpty()) {
            d();
            return;
        }
        if (!this.graphOptimizer && !this.newgraphOptimizer) {
            h(this.f3851c);
            return;
        }
        e eVar2 = sMetrics;
        if (eVar2 != null) {
            eVar2.graphOptimizer++;
        }
        for (int i8 = 0; i8 < this.f3857i; i8++) {
            if (!this.f3854f[i8].f3843e) {
                h(this.f3851c);
                return;
            }
        }
        e eVar3 = sMetrics;
        if (eVar3 != null) {
            eVar3.fullySolved++;
        }
        d();
    }

    public void removeRow(Q.b bVar) {
        i iVar;
        int i8;
        if (!bVar.f3843e || (iVar = bVar.f3839a) == null) {
            return;
        }
        int i9 = iVar.f3878b;
        if (i9 != -1) {
            while (true) {
                i8 = this.f3857i;
                if (i9 >= i8 - 1) {
                    break;
                }
                Q.b[] bVarArr = this.f3854f;
                int i10 = i9 + 1;
                Q.b bVar2 = bVarArr[i10];
                i iVar2 = bVar2.f3839a;
                if (iVar2.f3878b == i10) {
                    iVar2.f3878b = i9;
                }
                bVarArr[i9] = bVar2;
                i9 = i10;
            }
            this.f3857i = i8 - 1;
        }
        i iVar3 = bVar.f3839a;
        if (!iVar3.isFinalValue) {
            iVar3.setFinalValue(this, bVar.f3840b);
        }
        if (OPTIMIZED_ENGINE) {
            this.f3859k.f3844a.release(bVar);
        } else {
            this.f3859k.f3845b.release(bVar);
        }
    }

    public void reset() {
        c cVar;
        int i8 = 0;
        while (true) {
            cVar = this.f3859k;
            i[] iVarArr = cVar.f3847d;
            if (i8 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i8];
            if (iVar != null) {
                iVar.reset();
            }
            i8++;
        }
        cVar.f3846c.releaseAll(this.f3860l, this.f3861m);
        this.f3861m = 0;
        Arrays.fill(this.f3859k.f3847d, (Object) null);
        HashMap map = this.f3850b;
        if (map != null) {
            map.clear();
        }
        this.f3849a = 0;
        this.f3851c.clear();
        this.f3856h = 1;
        for (int i9 = 0; i9 < this.f3857i; i9++) {
            Q.b bVar = this.f3854f[i9];
            if (bVar != null) {
                bVar.f3841c = false;
            }
        }
        j();
        this.f3857i = 0;
        if (OPTIMIZED_ENGINE) {
            this.f3862n = new b(this.f3859k);
        } else {
            this.f3862n = new Q.b(this.f3859k);
        }
    }

    public void addEquality(i iVar, int i8) {
        if (USE_BASIC_SYNONYMS && iVar.f3878b == -1) {
            float f8 = i8;
            iVar.setFinalValue(this, f8);
            for (int i9 = 0; i9 < this.f3849a + 1; i9++) {
                i iVar2 = this.f3859k.f3847d[i9];
                if (iVar2 != null && iVar2.f3884h && iVar2.f3885i == iVar.id) {
                    iVar2.setFinalValue(this, iVar2.f3886j + f8);
                }
            }
            return;
        }
        int i10 = iVar.f3878b;
        if (i10 != -1) {
            Q.b bVar = this.f3854f[i10];
            if (bVar.f3843e) {
                bVar.f3840b = i8;
                return;
            }
            if (bVar.variables.getCurrentSize() == 0) {
                bVar.f3843e = true;
                bVar.f3840b = i8;
                return;
            } else {
                Q.b bVarCreateRow = createRow();
                bVarCreateRow.createRowEquals(iVar, i8);
                addConstraint(bVarCreateRow);
                return;
            }
        }
        Q.b bVarCreateRow2 = createRow();
        bVarCreateRow2.e(iVar, i8);
        addConstraint(bVarCreateRow2);
    }
}
