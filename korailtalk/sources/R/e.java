package R;

import Q7.X;
import R.d;
import S.n;
import S.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int UNKNOWN = -1;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;

    /* renamed from: A */
    protected int f4155A;

    /* renamed from: B */
    protected int f4156B;

    /* renamed from: C */
    int f4157C;

    /* renamed from: D */
    protected int f4158D;

    /* renamed from: E */
    protected int f4159E;

    /* renamed from: F */
    float f4160F;

    /* renamed from: G */
    float f4161G;

    /* renamed from: H */
    private Object f4162H;

    /* renamed from: I */
    private int f4163I;

    /* renamed from: J */
    private int f4164J;

    /* renamed from: K */
    private String f4165K;

    /* renamed from: L */
    private String f4166L;

    /* renamed from: M */
    int f4167M;

    /* renamed from: N */
    int f4168N;

    /* renamed from: O */
    int f4169O;

    /* renamed from: P */
    int f4170P;

    /* renamed from: Q */
    boolean f4171Q;

    /* renamed from: R */
    boolean f4172R;

    /* renamed from: S */
    boolean f4173S;

    /* renamed from: T */
    boolean f4174T;

    /* renamed from: U */
    boolean f4175U;

    /* renamed from: V */
    boolean f4176V;

    /* renamed from: W */
    boolean f4177W;

    /* renamed from: X */
    int f4178X;

    /* renamed from: Y */
    int f4179Y;

    /* renamed from: Z */
    boolean f4180Z;

    /* renamed from: a */
    boolean f4181a;

    /* renamed from: a0 */
    boolean f4182a0;

    /* renamed from: b */
    private boolean f4183b;

    /* renamed from: b0 */
    protected e[] f4184b0;

    /* renamed from: c */
    private boolean f4185c;

    /* renamed from: c0 */
    protected e[] f4186c0;

    /* renamed from: d */
    private boolean f4187d;

    /* renamed from: d0 */
    e f4188d0;

    /* renamed from: e */
    private boolean f4189e;

    /* renamed from: e0 */
    e f4190e0;

    /* renamed from: f */
    private boolean f4191f;

    /* renamed from: g */
    int f4192g;

    /* renamed from: h */
    float f4193h;
    public S.c horizontalChainRun;
    public int horizontalGroup;
    public S.l horizontalRun;

    /* renamed from: i */
    private int[] f4194i;
    public boolean[] isTerminalWidget;

    /* renamed from: j */
    private float f4195j;

    /* renamed from: k */
    private boolean f4196k;

    /* renamed from: l */
    private boolean f4197l;

    /* renamed from: m */
    private boolean f4198m;
    public d mBaseline;
    public d mBottom;
    public d mCenter;
    public float mDimensionRatio;
    public int mHorizontalResolution;
    public boolean mIsHeightWrapContent;
    public boolean mIsWidthWrapContent;
    public d mLeft;
    public d[] mListAnchors;
    public b[] mListDimensionBehaviors;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    public e mParent;
    public int[] mResolvedMatchConstraintDefault;
    public d mRight;
    public d mTop;
    public int mVerticalResolution;
    public float[] mWeight;
    public boolean measured;

    /* renamed from: n */
    private int f4199n;

    /* renamed from: o */
    private int f4200o;

    /* renamed from: p */
    d f4201p;

    /* renamed from: q */
    d f4202q;

    /* renamed from: r */
    protected ArrayList f4203r;
    public p[] run;

    /* renamed from: s */
    private boolean[] f4204s;

    /* renamed from: t */
    int f4205t;

    /* renamed from: u */
    int f4206u;

    /* renamed from: v */
    protected int f4207v;
    public S.c verticalChainRun;
    public int verticalGroup;
    public n verticalRun;

    /* renamed from: w */
    protected int f4208w;

    /* renamed from: x */
    protected int f4209x;

    /* renamed from: y */
    int f4210y;

    /* renamed from: z */
    int f4211z;

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4212a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4213b;

        static {
            int[] iArr = new int[b.values().length];
            f4213b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4213b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4213b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4213b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f4212a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4212a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4212a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4212a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4212a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4212a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4212a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4212a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4212a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        this.measured = false;
        this.run = new p[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.f4181a = false;
        this.f4183b = true;
        this.f4185c = false;
        this.f4187d = true;
        this.f4189e = false;
        this.f4191f = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.f4192g = -1;
        this.f4193h = 1.0f;
        this.f4194i = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f4195j = 0.0f;
        this.f4196k = false;
        this.f4198m = false;
        this.f4199n = 0;
        this.f4200o = 0;
        this.mLeft = new d(this, d.b.LEFT);
        this.mTop = new d(this, d.b.TOP);
        this.mRight = new d(this, d.b.RIGHT);
        this.mBottom = new d(this, d.b.BOTTOM);
        this.mBaseline = new d(this, d.b.BASELINE);
        this.f4201p = new d(this, d.b.CENTER_X);
        this.f4202q = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.mCenter = dVar;
        this.mListAnchors = new d[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, dVar};
        this.f4203r = new ArrayList();
        this.f4204s = new boolean[2];
        b bVar = b.FIXED;
        this.mListDimensionBehaviors = new b[]{bVar, bVar};
        this.mParent = null;
        this.f4205t = 0;
        this.f4206u = 0;
        this.mDimensionRatio = 0.0f;
        this.f4207v = -1;
        this.f4208w = 0;
        this.f4209x = 0;
        this.f4210y = 0;
        this.f4211z = 0;
        this.f4155A = 0;
        this.f4156B = 0;
        this.f4157C = 0;
        float f8 = DEFAULT_BIAS;
        this.f4160F = f8;
        this.f4161G = f8;
        this.f4163I = 0;
        this.f4164J = 0;
        this.f4165K = null;
        this.f4166L = null;
        this.f4177W = false;
        this.f4178X = 0;
        this.f4179Y = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.f4184b0 = new e[]{null, null};
        this.f4186c0 = new e[]{null, null};
        this.f4188d0 = null;
        this.f4190e0 = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        a();
    }

    private void a() {
        this.f4203r.add(this.mLeft);
        this.f4203r.add(this.mTop);
        this.f4203r.add(this.mRight);
        this.f4203r.add(this.mBottom);
        this.f4203r.add(this.f4201p);
        this.f4203r.add(this.f4202q);
        this.f4203r.add(this.mCenter);
        this.f4203r.add(this.mBaseline);
    }

    /* JADX WARN: Removed duplicated region for block: B:386:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x04e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:698:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:710:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(Q.d r32, boolean r33, boolean r34, boolean r35, boolean r36, Q.i r37, Q.i r38, R.e.b r39, boolean r40, R.d r41, R.d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R.e.c(Q.d, boolean, boolean, boolean, boolean, Q.i, Q.i, R.e$b, boolean, R.d, R.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private boolean f(int i8) {
        d dVar;
        d dVar2;
        int i9 = i8 * 2;
        d[] dVarArr = this.mListAnchors;
        d dVar3 = dVarArr[i9];
        d dVar4 = dVar3.mTarget;
        return (dVar4 == null || dVar4.mTarget == dVar3 || (dVar2 = (dVar = dVarArr[i9 + 1]).mTarget) == null || dVar2.mTarget != dVar) ? false : true;
    }

    public void addChildrenToSolverByDependency(f fVar, Q.d dVar, HashSet<e> hashSet, int i8, boolean z8) {
        if (z8) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            addToSolver(dVar, fVar.optimizeFor(64));
        }
        if (i8 == 0) {
            HashSet<d> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                Iterator<d> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(fVar, dVar, hashSet, i8, true);
                }
            }
            HashSet<d> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                Iterator<d> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(fVar, dVar, hashSet, i8, true);
                }
                return;
            }
            return;
        }
        HashSet<d> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            Iterator<d> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(fVar, dVar, hashSet, i8, true);
            }
        }
        HashSet<d> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            Iterator<d> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(fVar, dVar, hashSet, i8, true);
            }
        }
        HashSet<d> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            Iterator<d> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(fVar, dVar, hashSet, i8, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:403:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x05c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addToSolver(Q.d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R.e.addToSolver(Q.d, boolean):void");
    }

    public boolean allowedInBarrier() {
        return this.f4164J != 8;
    }

    boolean b() {
        return (this instanceof l) || (this instanceof h);
    }

    public void connect(d dVar, d dVar2, int i8) {
        if (dVar.getOwner() == this) {
            connect(dVar.getType(), dVar2.getOwner(), dVar2.getType(), i8);
        }
    }

    public void connectCircularConstraint(e eVar, float f8, int i8) {
        d.b bVar = d.b.CENTER;
        immediateConnect(bVar, eVar, bVar, i8, 0);
        this.f4195j = f8;
    }

    public void copy(e eVar, HashMap<e, e> map) {
        this.mHorizontalResolution = eVar.mHorizontalResolution;
        this.mVerticalResolution = eVar.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = eVar.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = eVar.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = eVar.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = eVar.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = eVar.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = eVar.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = eVar.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = eVar.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = eVar.mIsWidthWrapContent;
        this.mIsHeightWrapContent = eVar.mIsHeightWrapContent;
        this.f4192g = eVar.f4192g;
        this.f4193h = eVar.f4193h;
        int[] iArr3 = eVar.f4194i;
        this.f4194i = Arrays.copyOf(iArr3, iArr3.length);
        this.f4195j = eVar.f4195j;
        this.f4196k = eVar.f4196k;
        this.f4197l = eVar.f4197l;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.f4201p.reset();
        this.f4202q.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (b[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : map.get(eVar.mParent);
        this.f4205t = eVar.f4205t;
        this.f4206u = eVar.f4206u;
        this.mDimensionRatio = eVar.mDimensionRatio;
        this.f4207v = eVar.f4207v;
        this.f4208w = eVar.f4208w;
        this.f4209x = eVar.f4209x;
        this.f4210y = eVar.f4210y;
        this.f4211z = eVar.f4211z;
        this.f4155A = eVar.f4155A;
        this.f4156B = eVar.f4156B;
        this.f4157C = eVar.f4157C;
        this.f4158D = eVar.f4158D;
        this.f4159E = eVar.f4159E;
        this.f4160F = eVar.f4160F;
        this.f4161G = eVar.f4161G;
        this.f4162H = eVar.f4162H;
        this.f4163I = eVar.f4163I;
        this.f4164J = eVar.f4164J;
        this.f4165K = eVar.f4165K;
        this.f4166L = eVar.f4166L;
        this.f4167M = eVar.f4167M;
        this.f4168N = eVar.f4168N;
        this.f4169O = eVar.f4169O;
        this.f4170P = eVar.f4170P;
        this.f4171Q = eVar.f4171Q;
        this.f4172R = eVar.f4172R;
        this.f4173S = eVar.f4173S;
        this.f4174T = eVar.f4174T;
        this.f4175U = eVar.f4175U;
        this.f4176V = eVar.f4176V;
        this.f4178X = eVar.f4178X;
        this.f4179Y = eVar.f4179Y;
        this.f4180Z = eVar.f4180Z;
        this.f4182a0 = eVar.f4182a0;
        float[] fArr = this.mWeight;
        float[] fArr2 = eVar.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        e[] eVarArr = this.f4184b0;
        e[] eVarArr2 = eVar.f4184b0;
        eVarArr[0] = eVarArr2[0];
        eVarArr[1] = eVarArr2[1];
        e[] eVarArr3 = this.f4186c0;
        e[] eVarArr4 = eVar.f4186c0;
        eVarArr3[0] = eVarArr4[0];
        eVarArr3[1] = eVarArr4[1];
        e eVar2 = eVar.f4188d0;
        this.f4188d0 = eVar2 == null ? null : map.get(eVar2);
        e eVar3 = eVar.f4190e0;
        this.f4190e0 = eVar3 != null ? map.get(eVar3) : null;
    }

    public void createObjectVariables(Q.d dVar) {
        dVar.createObjectVariable(this.mLeft);
        dVar.createObjectVariable(this.mTop);
        dVar.createObjectVariable(this.mRight);
        dVar.createObjectVariable(this.mBottom);
        if (this.f4157C > 0) {
            dVar.createObjectVariable(this.mBaseline);
        }
    }

    protected int d() {
        return this.f4208w + this.f4155A;
    }

    protected int e() {
        return this.f4209x + this.f4156B;
    }

    public void ensureMeasureRequested() {
        this.f4183b = true;
    }

    public void ensureWidgetRuns() {
        if (this.horizontalRun == null) {
            this.horizontalRun = new S.l(this);
        }
        if (this.verticalRun == null) {
            this.verticalRun = new n(this);
        }
    }

    protected void g(int i8, boolean z8) {
        this.f4204s[i8] = z8;
    }

    public d getAnchor(d.b bVar) {
        switch (a.f4212a[bVar.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.f4201p;
            case 8:
                return this.f4202q;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public ArrayList<d> getAnchors() {
        return this.f4203r;
    }

    public int getBaselineDistance() {
        return this.f4157C;
    }

    public float getBiasPercent(int i8) {
        if (i8 == 0) {
            return this.f4160F;
        }
        if (i8 == 1) {
            return this.f4161G;
        }
        return -1.0f;
    }

    public int getBottom() {
        return getY() + this.f4206u;
    }

    public Object getCompanionWidget() {
        return this.f4162H;
    }

    public int getContainerItemSkip() {
        return this.f4163I;
    }

    public String getDebugName() {
        return this.f4165K;
    }

    public b getDimensionBehaviour(int i8) {
        if (i8 == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i8 == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.f4207v;
    }

    public boolean getHasBaseline() {
        return this.f4196k;
    }

    public int getHeight() {
        if (this.f4164J == 8) {
            return 0;
        }
        return this.f4206u;
    }

    public float getHorizontalBiasPercent() {
        return this.f4160F;
    }

    public e getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        e eVar = this;
        e eVar2 = null;
        while (eVar2 == null && eVar != null) {
            d anchor = eVar.getAnchor(d.b.LEFT);
            d target = anchor == null ? null : anchor.getTarget();
            e owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return eVar;
            }
            d target2 = owner == null ? null : owner.getAnchor(d.b.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == eVar) {
                eVar = owner;
            } else {
                eVar2 = eVar;
            }
        }
        return eVar2;
    }

    public int getHorizontalChainStyle() {
        return this.f4178X;
    }

    public b getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        d dVar = this.mLeft;
        int i8 = dVar != null ? dVar.mMargin : 0;
        d dVar2 = this.mRight;
        return dVar2 != null ? i8 + dVar2.mMargin : i8;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.f4199n;
    }

    public int getLastVerticalMeasureSpec() {
        return this.f4200o;
    }

    public int getLeft() {
        return getX();
    }

    public int getLength(int i8) {
        if (i8 == 0) {
            return getWidth();
        }
        if (i8 == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMaxHeight() {
        return this.f4194i[1];
    }

    public int getMaxWidth() {
        return this.f4194i[0];
    }

    public int getMinHeight() {
        return this.f4159E;
    }

    public int getMinWidth() {
        return this.f4158D;
    }

    public e getNextChainMember(int i8) {
        d dVar;
        d dVar2;
        if (i8 != 0) {
            if (i8 == 1 && (dVar2 = (dVar = this.mBottom).mTarget) != null && dVar2.mTarget == dVar) {
                return dVar2.mOwner;
            }
            return null;
        }
        d dVar3 = this.mRight;
        d dVar4 = dVar3.mTarget;
        if (dVar4 == null || dVar4.mTarget != dVar3) {
            return null;
        }
        return dVar4.mOwner;
    }

    public int getOptimizerWrapHeight() {
        int iMax;
        int i8 = this.f4206u;
        if (this.mListDimensionBehaviors[1] != b.MATCH_CONSTRAINT) {
            return i8;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            iMax = Math.max(this.mMatchConstraintMinHeight, i8);
        } else {
            iMax = this.mMatchConstraintMinHeight;
            if (iMax > 0) {
                this.f4206u = iMax;
            } else {
                iMax = 0;
            }
        }
        int i9 = this.mMatchConstraintMaxHeight;
        return (i9 <= 0 || i9 >= iMax) ? iMax : i9;
    }

    public int getOptimizerWrapWidth() {
        int iMax;
        int i8 = this.f4205t;
        if (this.mListDimensionBehaviors[0] != b.MATCH_CONSTRAINT) {
            return i8;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            iMax = Math.max(this.mMatchConstraintMinWidth, i8);
        } else {
            iMax = this.mMatchConstraintMinWidth;
            if (iMax > 0) {
                this.f4205t = iMax;
            } else {
                iMax = 0;
            }
        }
        int i9 = this.mMatchConstraintMaxWidth;
        return (i9 <= 0 || i9 >= iMax) ? iMax : i9;
    }

    public e getParent() {
        return this.mParent;
    }

    public e getPreviousChainMember(int i8) {
        d dVar;
        d dVar2;
        if (i8 != 0) {
            if (i8 == 1 && (dVar2 = (dVar = this.mTop).mTarget) != null && dVar2.mTarget == dVar) {
                return dVar2.mOwner;
            }
            return null;
        }
        d dVar3 = this.mLeft;
        d dVar4 = dVar3.mTarget;
        if (dVar4 == null || dVar4.mTarget != dVar3) {
            return null;
        }
        return dVar4.mOwner;
    }

    public int getRight() {
        return getX() + this.f4205t;
    }

    public p getRun(int i8) {
        if (i8 == 0) {
            return this.horizontalRun;
        }
        if (i8 == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public int getTop() {
        return getY();
    }

    public String getType() {
        return this.f4166L;
    }

    public float getVerticalBiasPercent() {
        return this.f4161G;
    }

    public e getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        e eVar = this;
        e eVar2 = null;
        while (eVar2 == null && eVar != null) {
            d anchor = eVar.getAnchor(d.b.TOP);
            d target = anchor == null ? null : anchor.getTarget();
            e owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return eVar;
            }
            d target2 = owner == null ? null : owner.getAnchor(d.b.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == eVar) {
                eVar = owner;
            } else {
                eVar2 = eVar;
            }
        }
        return eVar2;
    }

    public int getVerticalChainStyle() {
        return this.f4179Y;
    }

    public b getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int i8 = this.mLeft != null ? this.mTop.mMargin : 0;
        return this.mRight != null ? i8 + this.mBottom.mMargin : i8;
    }

    public int getVisibility() {
        return this.f4164J;
    }

    public int getWidth() {
        if (this.f4164J == 8) {
            return 0;
        }
        return this.f4205t;
    }

    public int getX() {
        e eVar = this.mParent;
        return (eVar == null || !(eVar instanceof f)) ? this.f4208w : ((f) eVar).f4219j0 + this.f4208w;
    }

    public int getY() {
        e eVar = this.mParent;
        return (eVar == null || !(eVar instanceof f)) ? this.f4209x : ((f) eVar).f4220k0 + this.f4209x;
    }

    public boolean hasBaseline() {
        return this.f4196k;
    }

    public boolean hasDanglingDimension(int i8) {
        if (i8 == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        return ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0)) + (this.mBaseline.mTarget != null ? 1 : 0) < 2;
    }

    public boolean hasDependencies() {
        int size = this.f4203r.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((d) this.f4203r.get(i8)).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public void immediateConnect(d.b bVar, e eVar, d.b bVar2, int i8, int i9) {
        getAnchor(bVar).connect(eVar.getAnchor(bVar2), i8, i9, true);
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isInHorizontalChain() {
        d dVar = this.mLeft;
        d dVar2 = dVar.mTarget;
        if (dVar2 != null && dVar2.mTarget == dVar) {
            return true;
        }
        d dVar3 = this.mRight;
        d dVar4 = dVar3.mTarget;
        return dVar4 != null && dVar4.mTarget == dVar3;
    }

    public boolean isInPlaceholder() {
        return this.f4197l;
    }

    public boolean isInVerticalChain() {
        d dVar = this.mTop;
        d dVar2 = dVar.mTarget;
        if (dVar2 != null && dVar2.mTarget == dVar) {
            return true;
        }
        d dVar3 = this.mBottom;
        d dVar4 = dVar3.mTarget;
        return dVar4 != null && dVar4.mTarget == dVar3;
    }

    public boolean isInVirtualLayout() {
        return this.f4198m;
    }

    public boolean isMeasureRequested() {
        return this.f4183b && this.f4164J != 8;
    }

    public boolean isResolvedHorizontally() {
        return this.f4189e || (this.mLeft.hasFinalValue() && this.mRight.hasFinalValue());
    }

    public boolean isResolvedVertically() {
        return this.f4191f || (this.mTop.hasFinalValue() && this.mBottom.hasFinalValue());
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == b.MATCH_CONSTRAINT;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == b.MATCH_CONSTRAINT;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public boolean oppositeDimensionDependsOn(int i8) {
        char c9 = i8 == 0 ? (char) 1 : (char) 0;
        b[] bVarArr = this.mListDimensionBehaviors;
        b bVar = bVarArr[i8];
        b bVar2 = bVarArr[c9];
        b bVar3 = b.MATCH_CONSTRAINT;
        return bVar == bVar3 && bVar2 == bVar3;
    }

    public boolean oppositeDimensionsTied() {
        b[] bVarArr = this.mListDimensionBehaviors;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.f4201p.reset();
        this.f4202q.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.f4195j = 0.0f;
        this.f4205t = 0;
        this.f4206u = 0;
        this.mDimensionRatio = 0.0f;
        this.f4207v = -1;
        this.f4208w = 0;
        this.f4209x = 0;
        this.f4155A = 0;
        this.f4156B = 0;
        this.f4157C = 0;
        this.f4158D = 0;
        this.f4159E = 0;
        float f8 = DEFAULT_BIAS;
        this.f4160F = f8;
        this.f4161G = f8;
        b[] bVarArr = this.mListDimensionBehaviors;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f4162H = null;
        this.f4163I = 0;
        this.f4164J = 0;
        this.f4166L = null;
        this.f4175U = false;
        this.f4176V = false;
        this.f4178X = 0;
        this.f4179Y = 0;
        this.f4180Z = false;
        this.f4182a0 = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.f4194i;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.f4181a = false;
        this.f4192g = -1;
        this.f4193h = 1.0f;
        this.f4177W = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.f4198m = false;
        boolean[] zArr2 = this.f4204s;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4183b = true;
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(d dVar) {
        if (getParent() != null && (getParent() instanceof f) && ((f) getParent()).handlesInternalConstraints()) {
            return;
        }
        d anchor = getAnchor(d.b.LEFT);
        d anchor2 = getAnchor(d.b.RIGHT);
        d anchor3 = getAnchor(d.b.TOP);
        d anchor4 = getAnchor(d.b.BOTTOM);
        d anchor5 = getAnchor(d.b.CENTER);
        d anchor6 = getAnchor(d.b.CENTER_X);
        d anchor7 = getAnchor(d.b.CENTER_Y);
        if (dVar == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.f4160F = 0.5f;
            this.f4161G = 0.5f;
        } else if (dVar == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.f4160F = 0.5f;
        } else if (dVar == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.f4161G = 0.5f;
        } else if (dVar == anchor || dVar == anchor2) {
            if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor5.reset();
            }
        } else if ((dVar == anchor3 || dVar == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
            anchor5.reset();
        }
        dVar.reset();
    }

    public void resetAnchors() {
        e parent = getParent();
        if (parent != null && (parent instanceof f) && ((f) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.f4203r.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((d) this.f4203r.get(i8)).reset();
        }
    }

    public void resetFinalResolution() {
        this.f4189e = false;
        this.f4191f = false;
        int size = this.f4203r.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((d) this.f4203r.get(i8)).resetFinalResolution();
        }
    }

    public void resetSolverVariables(Q.c cVar) {
        this.mLeft.resetSolverVariable(cVar);
        this.mTop.resetSolverVariable(cVar);
        this.mRight.resetSolverVariable(cVar);
        this.mBottom.resetSolverVariable(cVar);
        this.mBaseline.resetSolverVariable(cVar);
        this.mCenter.resetSolverVariable(cVar);
        this.f4201p.resetSolverVariable(cVar);
        this.f4202q.resetSolverVariable(cVar);
    }

    public void setBaselineDistance(int i8) {
        this.f4157C = i8;
        this.f4196k = i8 > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.f4162H = obj;
    }

    public void setContainerItemSkip(int i8) {
        if (i8 >= 0) {
            this.f4163I = i8;
        } else {
            this.f4163I = 0;
        }
    }

    public void setDebugName(String str) {
        this.f4165K = str;
    }

    public void setDebugSolverName(Q.d dVar, String str) {
        this.f4165K = str;
        Q.i iVarCreateObjectVariable = dVar.createObjectVariable(this.mLeft);
        Q.i iVarCreateObjectVariable2 = dVar.createObjectVariable(this.mTop);
        Q.i iVarCreateObjectVariable3 = dVar.createObjectVariable(this.mRight);
        Q.i iVarCreateObjectVariable4 = dVar.createObjectVariable(this.mBottom);
        iVarCreateObjectVariable.setName(str + ".left");
        iVarCreateObjectVariable2.setName(str + ".top");
        iVarCreateObjectVariable3.setName(str + ".right");
        iVarCreateObjectVariable4.setName(str + ".bottom");
        dVar.createObjectVariable(this.mBaseline).setName(str + ".baseline");
    }

    public void setDimension(int i8, int i9) {
        this.f4205t = i8;
        int i10 = this.f4158D;
        if (i8 < i10) {
            this.f4205t = i10;
        }
        this.f4206u = i9;
        int i11 = this.f4159E;
        if (i9 < i11) {
            this.f4206u = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0086 A[PHI: r0
  0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:96:0x0086, B:86:0x007f, B:74:0x0051, B:76:0x0057, B:78:0x0063, B:80:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0086 -> B:90:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDimensionRatio(java.lang.String r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L90
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L90
        Lb:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L39
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L39
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            r3 = r4
            goto L36
        L35:
            r3 = r5
        L36:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L39:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L77
            int r1 = r1 - r4
            if (r2 >= r1) goto L77
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L86
            int r2 = r9.length()
            if (r2 <= 0) goto L86
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            if (r5 != r4) goto L71
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L71:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L77:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L86:
            r9 = r0
        L87:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8f
            r8.mDimensionRatio = r9
            r8.f4207v = r5
        L8f:
            return
        L90:
            r8.mDimensionRatio = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R.e.setDimensionRatio(java.lang.String):void");
    }

    public void setFinalBaseline(int i8) {
        if (this.f4196k) {
            int i9 = i8 - this.f4157C;
            int i10 = this.f4206u + i9;
            this.f4209x = i9;
            this.mTop.setFinalValue(i9);
            this.mBottom.setFinalValue(i10);
            this.mBaseline.setFinalValue(i8);
            this.f4191f = true;
        }
    }

    public void setFinalFrame(int i8, int i9, int i10, int i11, int i12, int i13) {
        setFrame(i8, i9, i10, i11);
        setBaselineDistance(i12);
        if (i13 == 0) {
            this.f4189e = true;
            this.f4191f = false;
        } else if (i13 == 1) {
            this.f4189e = false;
            this.f4191f = true;
        } else if (i13 == 2) {
            this.f4189e = true;
            this.f4191f = true;
        } else {
            this.f4189e = false;
            this.f4191f = false;
        }
    }

    public void setFinalHorizontal(int i8, int i9) {
        this.mLeft.setFinalValue(i8);
        this.mRight.setFinalValue(i9);
        this.f4208w = i8;
        this.f4205t = i9 - i8;
        this.f4189e = true;
    }

    public void setFinalLeft(int i8) {
        this.mLeft.setFinalValue(i8);
        this.f4208w = i8;
    }

    public void setFinalTop(int i8) {
        this.mTop.setFinalValue(i8);
        this.f4209x = i8;
    }

    public void setFinalVertical(int i8, int i9) {
        this.mTop.setFinalValue(i8);
        this.mBottom.setFinalValue(i9);
        this.f4209x = i8;
        this.f4206u = i9 - i8;
        if (this.f4196k) {
            this.mBaseline.setFinalValue(i8 + this.f4157C);
        }
        this.f4191f = true;
    }

    public void setFrame(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14 = i10 - i8;
        int i15 = i11 - i9;
        this.f4208w = i8;
        this.f4209x = i9;
        if (this.f4164J == 8) {
            this.f4205t = 0;
            this.f4206u = 0;
            return;
        }
        b[] bVarArr = this.mListDimensionBehaviors;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i14 < (i13 = this.f4205t)) {
            i14 = i13;
        }
        if (bVarArr[1] == bVar2 && i15 < (i12 = this.f4206u)) {
            i15 = i12;
        }
        this.f4205t = i14;
        this.f4206u = i15;
        int i16 = this.f4159E;
        if (i15 < i16) {
            this.f4206u = i16;
        }
        int i17 = this.f4158D;
        if (i14 < i17) {
            this.f4205t = i17;
        }
    }

    public void setGoneMargin(d.b bVar, int i8) {
        int i9 = a.f4212a[bVar.ordinal()];
        if (i9 == 1) {
            this.mLeft.f4151d = i8;
            return;
        }
        if (i9 == 2) {
            this.mTop.f4151d = i8;
        } else if (i9 == 3) {
            this.mRight.f4151d = i8;
        } else {
            if (i9 != 4) {
                return;
            }
            this.mBottom.f4151d = i8;
        }
    }

    public void setHasBaseline(boolean z8) {
        this.f4196k = z8;
    }

    public void setHeight(int i8) {
        this.f4206u = i8;
        int i9 = this.f4159E;
        if (i8 < i9) {
            this.f4206u = i9;
        }
    }

    public void setHeightWrapContent(boolean z8) {
        this.mIsHeightWrapContent = z8;
    }

    public void setHorizontalBiasPercent(float f8) {
        this.f4160F = f8;
    }

    public void setHorizontalChainStyle(int i8) {
        this.f4178X = i8;
    }

    public void setHorizontalDimension(int i8, int i9) {
        this.f4208w = i8;
        int i10 = i9 - i8;
        this.f4205t = i10;
        int i11 = this.f4158D;
        if (i10 < i11) {
            this.f4205t = i11;
        }
    }

    public void setHorizontalDimensionBehaviour(b bVar) {
        this.mListDimensionBehaviors[0] = bVar;
    }

    public void setHorizontalMatchStyle(int i8, int i9, int i10, float f8) {
        this.mMatchConstraintDefaultWidth = i8;
        this.mMatchConstraintMinWidth = i9;
        if (i10 == Integer.MAX_VALUE) {
            i10 = 0;
        }
        this.mMatchConstraintMaxWidth = i10;
        this.mMatchConstraintPercentWidth = f8;
        if (f8 <= 0.0f || f8 >= 1.0f || i8 != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setHorizontalWeight(float f8) {
        this.mWeight[0] = f8;
    }

    public void setInPlaceholder(boolean z8) {
        this.f4197l = z8;
    }

    public void setInVirtualLayout(boolean z8) {
        this.f4198m = z8;
    }

    public void setLastMeasureSpec(int i8, int i9) {
        this.f4199n = i8;
        this.f4200o = i9;
        setMeasureRequested(false);
    }

    public void setLength(int i8, int i9) {
        if (i9 == 0) {
            setWidth(i8);
        } else if (i9 == 1) {
            setHeight(i8);
        }
    }

    public void setMaxHeight(int i8) {
        this.f4194i[1] = i8;
    }

    public void setMaxWidth(int i8) {
        this.f4194i[0] = i8;
    }

    public void setMeasureRequested(boolean z8) {
        this.f4183b = z8;
    }

    public void setMinHeight(int i8) {
        if (i8 < 0) {
            this.f4159E = 0;
        } else {
            this.f4159E = i8;
        }
    }

    public void setMinWidth(int i8) {
        if (i8 < 0) {
            this.f4158D = 0;
        } else {
            this.f4158D = i8;
        }
    }

    public void setOffset(int i8, int i9) {
        this.f4155A = i8;
        this.f4156B = i9;
    }

    public void setOrigin(int i8, int i9) {
        this.f4208w = i8;
        this.f4209x = i9;
    }

    public void setParent(e eVar) {
        this.mParent = eVar;
    }

    public void setType(String str) {
        this.f4166L = str;
    }

    public void setVerticalBiasPercent(float f8) {
        this.f4161G = f8;
    }

    public void setVerticalChainStyle(int i8) {
        this.f4179Y = i8;
    }

    public void setVerticalDimension(int i8, int i9) {
        this.f4209x = i8;
        int i10 = i9 - i8;
        this.f4206u = i10;
        int i11 = this.f4159E;
        if (i10 < i11) {
            this.f4206u = i11;
        }
    }

    public void setVerticalDimensionBehaviour(b bVar) {
        this.mListDimensionBehaviors[1] = bVar;
    }

    public void setVerticalMatchStyle(int i8, int i9, int i10, float f8) {
        this.mMatchConstraintDefaultHeight = i8;
        this.mMatchConstraintMinHeight = i9;
        if (i10 == Integer.MAX_VALUE) {
            i10 = 0;
        }
        this.mMatchConstraintMaxHeight = i10;
        this.mMatchConstraintPercentHeight = f8;
        if (f8 <= 0.0f || f8 >= 1.0f || i8 != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    public void setVerticalWeight(float f8) {
        this.mWeight[1] = f8;
    }

    public void setVisibility(int i8) {
        this.f4164J = i8;
    }

    public void setWidth(int i8) {
        this.f4205t = i8;
        int i9 = this.f4158D;
        if (i8 < i9) {
            this.f4205t = i9;
        }
    }

    public void setWidthWrapContent(boolean z8) {
        this.mIsWidthWrapContent = z8;
    }

    public void setX(int i8) {
        this.f4208w = i8;
    }

    public void setY(int i8) {
        this.f4209x = i8;
    }

    public void setupDimensionRatio(boolean z8, boolean z9, boolean z10, boolean z11) {
        if (this.f4192g == -1) {
            if (z10 && !z11) {
                this.f4192g = 0;
            } else if (!z10 && z11) {
                this.f4192g = 1;
                if (this.f4207v == -1) {
                    this.f4193h = 1.0f / this.f4193h;
                }
            }
        }
        if (this.f4192g == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.f4192g = 1;
        } else if (this.f4192g == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.f4192g = 0;
        }
        if (this.f4192g == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.f4192g = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.f4193h = 1.0f / this.f4193h;
                this.f4192g = 1;
            }
        }
        if (this.f4192g == -1) {
            int i8 = this.mMatchConstraintMinWidth;
            if (i8 > 0 && this.mMatchConstraintMinHeight == 0) {
                this.f4192g = 0;
            } else {
                if (i8 != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.f4193h = 1.0f / this.f4193h;
                this.f4192g = 1;
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f4166L != null) {
            str = "type: " + this.f4166L + X.SPACE;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f4165K != null) {
            str2 = "id: " + this.f4165K + X.SPACE;
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f4208w);
        sb.append(", ");
        sb.append(this.f4209x);
        sb.append(") - (");
        sb.append(this.f4205t);
        sb.append(" x ");
        sb.append(this.f4206u);
        sb.append(")");
        return sb.toString();
    }

    public void updateFromRuns(boolean z8, boolean z9) {
        int i8;
        int i9;
        boolean zIsResolved = z8 & this.horizontalRun.isResolved();
        boolean zIsResolved2 = z9 & this.verticalRun.isResolved();
        S.l lVar = this.horizontalRun;
        int i10 = lVar.start.value;
        n nVar = this.verticalRun;
        int i11 = nVar.start.value;
        int i12 = lVar.end.value;
        int i13 = nVar.end.value;
        int i14 = i13 - i11;
        if (i12 - i10 < 0 || i14 < 0 || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE) {
            i12 = 0;
            i10 = 0;
            i13 = 0;
            i11 = 0;
        }
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        if (zIsResolved) {
            this.f4208w = i10;
        }
        if (zIsResolved2) {
            this.f4209x = i11;
        }
        if (this.f4164J == 8) {
            this.f4205t = 0;
            this.f4206u = 0;
            return;
        }
        if (zIsResolved) {
            if (this.mListDimensionBehaviors[0] == b.FIXED && i15 < (i9 = this.f4205t)) {
                i15 = i9;
            }
            this.f4205t = i15;
            int i17 = this.f4158D;
            if (i15 < i17) {
                this.f4205t = i17;
            }
        }
        if (zIsResolved2) {
            if (this.mListDimensionBehaviors[1] == b.FIXED && i16 < (i8 = this.f4206u)) {
                i16 = i8;
            }
            this.f4206u = i16;
            int i18 = this.f4159E;
            if (i16 < i18) {
                this.f4206u = i18;
            }
        }
    }

    public void updateFromSolver(Q.d dVar, boolean z8) {
        n nVar;
        S.l lVar;
        int objectVariableValue = dVar.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = dVar.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = dVar.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = dVar.getObjectVariableValue(this.mBottom);
        if (z8 && (lVar = this.horizontalRun) != null) {
            S.f fVar = lVar.start;
            if (fVar.resolved) {
                S.f fVar2 = lVar.end;
                if (fVar2.resolved) {
                    objectVariableValue = fVar.value;
                    objectVariableValue3 = fVar2.value;
                }
            }
        }
        if (z8 && (nVar = this.verticalRun) != null) {
            S.f fVar3 = nVar.start;
            if (fVar3.resolved) {
                S.f fVar4 = nVar.end;
                if (fVar4.resolved) {
                    objectVariableValue2 = fVar3.value;
                    objectVariableValue4 = fVar4.value;
                }
            }
        }
        int i8 = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i8 < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void connect(d.b bVar, e eVar, d.b bVar2) {
        connect(bVar, eVar, bVar2, 0);
    }

    public void connect(d.b bVar, e eVar, d.b bVar2, int i8) {
        d.b bVar3;
        d.b bVar4;
        boolean z8;
        d.b bVar5 = d.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 == bVar5) {
                d.b bVar6 = d.b.LEFT;
                d anchor = getAnchor(bVar6);
                d.b bVar7 = d.b.RIGHT;
                d anchor2 = getAnchor(bVar7);
                d.b bVar8 = d.b.TOP;
                d anchor3 = getAnchor(bVar8);
                d.b bVar9 = d.b.BOTTOM;
                d anchor4 = getAnchor(bVar9);
                boolean z9 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(bVar6, eVar, bVar6, 0);
                    connect(bVar7, eVar, bVar7, 0);
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(bVar8, eVar, bVar8, 0);
                    connect(bVar9, eVar, bVar9, 0);
                } else {
                    z9 = false;
                }
                if (z8 && z9) {
                    getAnchor(bVar5).connect(eVar.getAnchor(bVar5), 0);
                    return;
                }
                if (z8) {
                    d.b bVar10 = d.b.CENTER_X;
                    getAnchor(bVar10).connect(eVar.getAnchor(bVar10), 0);
                    return;
                } else {
                    if (z9) {
                        d.b bVar11 = d.b.CENTER_Y;
                        getAnchor(bVar11).connect(eVar.getAnchor(bVar11), 0);
                        return;
                    }
                    return;
                }
            }
            d.b bVar12 = d.b.LEFT;
            if (bVar2 != bVar12 && bVar2 != d.b.RIGHT) {
                d.b bVar13 = d.b.TOP;
                if (bVar2 == bVar13 || bVar2 == d.b.BOTTOM) {
                    connect(bVar13, eVar, bVar2, 0);
                    connect(d.b.BOTTOM, eVar, bVar2, 0);
                    getAnchor(bVar5).connect(eVar.getAnchor(bVar2), 0);
                    return;
                }
                return;
            }
            connect(bVar12, eVar, bVar2, 0);
            connect(d.b.RIGHT, eVar, bVar2, 0);
            getAnchor(bVar5).connect(eVar.getAnchor(bVar2), 0);
            return;
        }
        d.b bVar14 = d.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = d.b.LEFT) || bVar2 == d.b.RIGHT)) {
            d anchor5 = getAnchor(bVar4);
            d anchor6 = eVar.getAnchor(bVar2);
            d anchor7 = getAnchor(d.b.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(bVar14).connect(anchor6, 0);
            return;
        }
        d.b bVar15 = d.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = d.b.TOP) || bVar2 == d.b.BOTTOM)) {
            d anchor8 = eVar.getAnchor(bVar2);
            getAnchor(bVar3).connect(anchor8, 0);
            getAnchor(d.b.BOTTOM).connect(anchor8, 0);
            getAnchor(bVar15).connect(anchor8, 0);
            return;
        }
        if (bVar == bVar14 && bVar2 == bVar14) {
            d.b bVar16 = d.b.LEFT;
            getAnchor(bVar16).connect(eVar.getAnchor(bVar16), 0);
            d.b bVar17 = d.b.RIGHT;
            getAnchor(bVar17).connect(eVar.getAnchor(bVar17), 0);
            getAnchor(bVar14).connect(eVar.getAnchor(bVar2), 0);
            return;
        }
        if (bVar == bVar15 && bVar2 == bVar15) {
            d.b bVar18 = d.b.TOP;
            getAnchor(bVar18).connect(eVar.getAnchor(bVar18), 0);
            d.b bVar19 = d.b.BOTTOM;
            getAnchor(bVar19).connect(eVar.getAnchor(bVar19), 0);
            getAnchor(bVar15).connect(eVar.getAnchor(bVar2), 0);
            return;
        }
        d anchor9 = getAnchor(bVar);
        d anchor10 = eVar.getAnchor(bVar2);
        if (anchor9.isValidConnection(anchor10)) {
            d.b bVar20 = d.b.BASELINE;
            if (bVar == bVar20) {
                d anchor11 = getAnchor(d.b.TOP);
                d anchor12 = getAnchor(d.b.BOTTOM);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
                i8 = 0;
            } else if (bVar != d.b.TOP && bVar != d.b.BOTTOM) {
                if (bVar == d.b.LEFT || bVar == d.b.RIGHT) {
                    d anchor13 = getAnchor(bVar5);
                    if (anchor13.getTarget() != anchor10) {
                        anchor13.reset();
                    }
                    d opposite = getAnchor(bVar).getOpposite();
                    d anchor14 = getAnchor(bVar14);
                    if (anchor14.isConnected()) {
                        opposite.reset();
                        anchor14.reset();
                    }
                }
            } else {
                d anchor15 = getAnchor(bVar20);
                if (anchor15 != null) {
                    anchor15.reset();
                }
                d anchor16 = getAnchor(bVar5);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                d opposite2 = getAnchor(bVar).getOpposite();
                d anchor17 = getAnchor(bVar15);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i8);
        }
    }

    public void setFrame(int i8, int i9, int i10) {
        if (i10 == 0) {
            setHorizontalDimension(i8, i9);
        } else if (i10 == 1) {
            setVerticalDimension(i8, i9);
        }
    }

    public void setDimensionRatio(float f8, int i8) {
        this.mDimensionRatio = f8;
        this.f4207v = i8;
    }

    public e(String str) {
        this.measured = false;
        this.run = new p[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.f4181a = false;
        this.f4183b = true;
        this.f4185c = false;
        this.f4187d = true;
        this.f4189e = false;
        this.f4191f = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.f4192g = -1;
        this.f4193h = 1.0f;
        this.f4194i = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f4195j = 0.0f;
        this.f4196k = false;
        this.f4198m = false;
        this.f4199n = 0;
        this.f4200o = 0;
        this.mLeft = new d(this, d.b.LEFT);
        this.mTop = new d(this, d.b.TOP);
        this.mRight = new d(this, d.b.RIGHT);
        this.mBottom = new d(this, d.b.BOTTOM);
        this.mBaseline = new d(this, d.b.BASELINE);
        this.f4201p = new d(this, d.b.CENTER_X);
        this.f4202q = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.mCenter = dVar;
        this.mListAnchors = new d[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, dVar};
        this.f4203r = new ArrayList();
        this.f4204s = new boolean[2];
        b bVar = b.FIXED;
        this.mListDimensionBehaviors = new b[]{bVar, bVar};
        this.mParent = null;
        this.f4205t = 0;
        this.f4206u = 0;
        this.mDimensionRatio = 0.0f;
        this.f4207v = -1;
        this.f4208w = 0;
        this.f4209x = 0;
        this.f4210y = 0;
        this.f4211z = 0;
        this.f4155A = 0;
        this.f4156B = 0;
        this.f4157C = 0;
        float f8 = DEFAULT_BIAS;
        this.f4160F = f8;
        this.f4161G = f8;
        this.f4163I = 0;
        this.f4164J = 0;
        this.f4165K = null;
        this.f4166L = null;
        this.f4177W = false;
        this.f4178X = 0;
        this.f4179Y = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.f4184b0 = new e[]{null, null};
        this.f4186c0 = new e[]{null, null};
        this.f4188d0 = null;
        this.f4190e0 = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        a();
        setDebugName(str);
    }

    public e(int i8, int i9, int i10, int i11) {
        this.measured = false;
        this.run = new p[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.f4181a = false;
        this.f4183b = true;
        this.f4185c = false;
        this.f4187d = true;
        this.f4189e = false;
        this.f4191f = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.f4192g = -1;
        this.f4193h = 1.0f;
        this.f4194i = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f4195j = 0.0f;
        this.f4196k = false;
        this.f4198m = false;
        this.f4199n = 0;
        this.f4200o = 0;
        this.mLeft = new d(this, d.b.LEFT);
        this.mTop = new d(this, d.b.TOP);
        this.mRight = new d(this, d.b.RIGHT);
        this.mBottom = new d(this, d.b.BOTTOM);
        this.mBaseline = new d(this, d.b.BASELINE);
        this.f4201p = new d(this, d.b.CENTER_X);
        this.f4202q = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.mCenter = dVar;
        this.mListAnchors = new d[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, dVar};
        this.f4203r = new ArrayList();
        this.f4204s = new boolean[2];
        b bVar = b.FIXED;
        this.mListDimensionBehaviors = new b[]{bVar, bVar};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.f4207v = -1;
        this.f4210y = 0;
        this.f4211z = 0;
        this.f4155A = 0;
        this.f4156B = 0;
        this.f4157C = 0;
        float f8 = DEFAULT_BIAS;
        this.f4160F = f8;
        this.f4161G = f8;
        this.f4163I = 0;
        this.f4164J = 0;
        this.f4165K = null;
        this.f4166L = null;
        this.f4177W = false;
        this.f4178X = 0;
        this.f4179Y = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.f4184b0 = new e[]{null, null};
        this.f4186c0 = new e[]{null, null};
        this.f4188d0 = null;
        this.f4190e0 = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.f4208w = i8;
        this.f4209x = i9;
        this.f4205t = i10;
        this.f4206u = i11;
        a();
    }

    public e(String str, int i8, int i9, int i10, int i11) {
        this(i8, i9, i10, i11);
        setDebugName(str);
    }

    public e(int i8, int i9) {
        this(0, 0, i8, i9);
    }

    public e(String str, int i8, int i9) {
        this(i8, i9);
        setDebugName(str);
    }
}
