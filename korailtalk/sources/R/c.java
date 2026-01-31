package R;

import R.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f4126a;

    /* renamed from: b, reason: collision with root package name */
    protected e f4127b;

    /* renamed from: c, reason: collision with root package name */
    protected e f4128c;

    /* renamed from: d, reason: collision with root package name */
    protected e f4129d;

    /* renamed from: e, reason: collision with root package name */
    protected e f4130e;

    /* renamed from: f, reason: collision with root package name */
    protected e f4131f;

    /* renamed from: g, reason: collision with root package name */
    protected e f4132g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList f4133h;

    /* renamed from: i, reason: collision with root package name */
    protected int f4134i;

    /* renamed from: j, reason: collision with root package name */
    protected int f4135j;

    /* renamed from: k, reason: collision with root package name */
    protected float f4136k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f4137l;

    /* renamed from: m, reason: collision with root package name */
    int f4138m;

    /* renamed from: n, reason: collision with root package name */
    int f4139n;

    /* renamed from: o, reason: collision with root package name */
    boolean f4140o;

    /* renamed from: p, reason: collision with root package name */
    private int f4141p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4142q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f4143r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f4144s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f4145t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f4146u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f4147v;

    public c(e eVar, int i8, boolean z8) {
        this.f4126a = eVar;
        this.f4141p = i8;
        this.f4142q = z8;
    }

    private void a() {
        int i8 = this.f4141p * 2;
        e eVar = this.f4126a;
        this.f4140o = true;
        e eVar2 = eVar;
        boolean z8 = false;
        while (!z8) {
            this.f4134i++;
            e[] eVarArr = eVar.f4186c0;
            int i9 = this.f4141p;
            e eVar3 = null;
            eVarArr[i9] = null;
            eVar.f4184b0[i9] = null;
            if (eVar.getVisibility() != 8) {
                this.f4137l++;
                e.b dimensionBehaviour = eVar.getDimensionBehaviour(this.f4141p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (dimensionBehaviour != bVar) {
                    this.f4138m += eVar.getLength(this.f4141p);
                }
                int margin = this.f4138m + eVar.mListAnchors[i8].getMargin();
                this.f4138m = margin;
                int i10 = i8 + 1;
                this.f4138m = margin + eVar.mListAnchors[i10].getMargin();
                int margin2 = this.f4139n + eVar.mListAnchors[i8].getMargin();
                this.f4139n = margin2;
                this.f4139n = margin2 + eVar.mListAnchors[i10].getMargin();
                if (this.f4127b == null) {
                    this.f4127b = eVar;
                }
                this.f4129d = eVar;
                e.b[] bVarArr = eVar.mListDimensionBehaviors;
                int i11 = this.f4141p;
                if (bVarArr[i11] == bVar) {
                    int i12 = eVar.mResolvedMatchConstraintDefault[i11];
                    if (i12 == 0 || i12 == 3 || i12 == 2) {
                        this.f4135j++;
                        float f8 = eVar.mWeight[i11];
                        if (f8 > 0.0f) {
                            this.f4136k += f8;
                        }
                        if (b(eVar, i11)) {
                            if (f8 < 0.0f) {
                                this.f4143r = true;
                            } else {
                                this.f4144s = true;
                            }
                            if (this.f4133h == null) {
                                this.f4133h = new ArrayList();
                            }
                            this.f4133h.add(eVar);
                        }
                        if (this.f4131f == null) {
                            this.f4131f = eVar;
                        }
                        e eVar4 = this.f4132g;
                        if (eVar4 != null) {
                            eVar4.f4184b0[this.f4141p] = eVar;
                        }
                        this.f4132g = eVar;
                    }
                    if (this.f4141p == 0) {
                        if (eVar.mMatchConstraintDefaultWidth != 0 || eVar.mMatchConstraintMinWidth != 0 || eVar.mMatchConstraintMaxWidth != 0) {
                            this.f4140o = false;
                        }
                    } else if (eVar.mMatchConstraintDefaultHeight != 0 || eVar.mMatchConstraintMinHeight != 0 || eVar.mMatchConstraintMaxHeight != 0) {
                        this.f4140o = false;
                    }
                    if (eVar.mDimensionRatio != 0.0f) {
                        this.f4140o = false;
                        this.f4146u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f4186c0[this.f4141p] = eVar;
            }
            d dVar = eVar.mListAnchors[i8 + 1].mTarget;
            if (dVar != null) {
                e eVar5 = dVar.mOwner;
                d dVar2 = eVar5.mListAnchors[i8].mTarget;
                if (dVar2 != null && dVar2.mOwner == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z8 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f4127b;
        if (eVar6 != null) {
            this.f4138m -= eVar6.mListAnchors[i8].getMargin();
        }
        e eVar7 = this.f4129d;
        if (eVar7 != null) {
            this.f4138m -= eVar7.mListAnchors[i8 + 1].getMargin();
        }
        this.f4128c = eVar;
        if (this.f4141p == 0 && this.f4142q) {
            this.f4130e = eVar;
        } else {
            this.f4130e = this.f4126a;
        }
        this.f4145t = this.f4144s && this.f4143r;
    }

    private static boolean b(e eVar, int i8) {
        int i9;
        return eVar.getVisibility() != 8 && eVar.mListDimensionBehaviors[i8] == e.b.MATCH_CONSTRAINT && ((i9 = eVar.mResolvedMatchConstraintDefault[i8]) == 0 || i9 == 3);
    }

    public void define() {
        if (!this.f4147v) {
            a();
        }
        this.f4147v = true;
    }

    public e getFirst() {
        return this.f4126a;
    }

    public e getFirstMatchConstraintWidget() {
        return this.f4131f;
    }

    public e getFirstVisibleWidget() {
        return this.f4127b;
    }

    public e getHead() {
        return this.f4130e;
    }

    public e getLast() {
        return this.f4128c;
    }

    public e getLastMatchConstraintWidget() {
        return this.f4132g;
    }

    public e getLastVisibleWidget() {
        return this.f4129d;
    }

    public float getTotalWeight() {
        return this.f4136k;
    }
}
