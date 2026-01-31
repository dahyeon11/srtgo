package androidx.constraintlayout.widget;

import R.d;
import R.e;
import R.l;
import S.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0985p0;
import e0.C5339a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static final int DESIGN_INFO_ID = 0;
    public static final String VERSION = "ConstraintLayout-2.0.4";

    /* renamed from: a, reason: collision with root package name */
    SparseArray f8506a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f8507b;

    /* renamed from: c, reason: collision with root package name */
    protected R.f f8508c;

    /* renamed from: d, reason: collision with root package name */
    private int f8509d;

    /* renamed from: e, reason: collision with root package name */
    private int f8510e;

    /* renamed from: f, reason: collision with root package name */
    private int f8511f;

    /* renamed from: g, reason: collision with root package name */
    private int f8512g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f8513h;

    /* renamed from: i, reason: collision with root package name */
    private int f8514i;

    /* renamed from: j, reason: collision with root package name */
    private d f8515j;

    /* renamed from: k, reason: collision with root package name */
    protected androidx.constraintlayout.widget.c f8516k;

    /* renamed from: l, reason: collision with root package name */
    private int f8517l;

    /* renamed from: m, reason: collision with root package name */
    private HashMap f8518m;

    /* renamed from: n, reason: collision with root package name */
    private int f8519n;

    /* renamed from: o, reason: collision with root package name */
    private int f8520o;

    /* renamed from: p, reason: collision with root package name */
    int f8521p;

    /* renamed from: q, reason: collision with root package name */
    int f8522q;

    /* renamed from: r, reason: collision with root package name */
    int f8523r;

    /* renamed from: s, reason: collision with root package name */
    int f8524s;

    /* renamed from: t, reason: collision with root package name */
    private SparseArray f8525t;

    /* renamed from: u, reason: collision with root package name */
    private f f8526u;

    /* renamed from: v, reason: collision with root package name */
    private Q.e f8527v;

    /* renamed from: w, reason: collision with root package name */
    c f8528w;

    /* renamed from: x, reason: collision with root package name */
    private int f8529x;

    /* renamed from: y, reason: collision with root package name */
    private int f8530y;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8531a;

        static {
            int[] iArr = new int[e.b.values().length];
            f8531a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8531a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8531a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8531a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements b.InterfaceC0072b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f8552a;

        /* renamed from: b, reason: collision with root package name */
        int f8553b;

        /* renamed from: c, reason: collision with root package name */
        int f8554c;

        /* renamed from: d, reason: collision with root package name */
        int f8555d;

        /* renamed from: e, reason: collision with root package name */
        int f8556e;

        /* renamed from: f, reason: collision with root package name */
        int f8557f;

        /* renamed from: g, reason: collision with root package name */
        int f8558g;

        public c(ConstraintLayout constraintLayout) {
            this.f8552a = constraintLayout;
        }

        private boolean a(int i8, int i9, int i10) {
            if (i8 == i9) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i8);
            View.MeasureSpec.getSize(i8);
            int mode2 = View.MeasureSpec.getMode(i9);
            int size = View.MeasureSpec.getSize(i9);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i10 == size;
            }
            return false;
        }

        public void captureLayoutInfos(int i8, int i9, int i10, int i11, int i12, int i13) {
            this.f8553b = i10;
            this.f8554c = i11;
            this.f8555d = i12;
            this.f8556e = i13;
            this.f8557f = i8;
            this.f8558g = i9;
        }

        @Override // S.b.InterfaceC0072b
        public final void didMeasures() {
            int childCount = this.f8552a.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = this.f8552a.getChildAt(i8);
                if (childAt instanceof g) {
                    ((g) childAt).updatePostMeasure(this.f8552a);
                }
            }
            int size = this.f8552a.f8507b.size();
            if (size > 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    ((androidx.constraintlayout.widget.b) this.f8552a.f8507b.get(i9)).updatePostMeasure(this.f8552a);
                }
            }
        }

        @Override // S.b.InterfaceC0072b
        public final void measure(R.e eVar, b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i8;
            int measuredHeight;
            int i9;
            if (eVar == null) {
                return;
            }
            if (eVar.getVisibility() == 8 && !eVar.isInPlaceholder()) {
                aVar.measuredWidth = 0;
                aVar.measuredHeight = 0;
                aVar.measuredBaseline = 0;
                return;
            }
            if (eVar.getParent() == null) {
                return;
            }
            e.b bVar = aVar.horizontalBehavior;
            e.b bVar2 = aVar.verticalBehavior;
            int i10 = aVar.horizontalDimension;
            int i11 = aVar.verticalDimension;
            int i12 = this.f8553b + this.f8554c;
            int i13 = this.f8555d;
            View view = (View) eVar.getCompanionWidget();
            int[] iArr = a.f8531a;
            int i14 = iArr[bVar.ordinal()];
            if (i14 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else if (i14 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8557f, i13, -2);
            } else if (i14 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8557f, i13 + eVar.getHorizontalMargin(), -1);
            } else if (i14 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8557f, i13, -2);
                boolean z8 = eVar.mMatchConstraintDefaultWidth == 1;
                int i15 = aVar.measureStrategy;
                if (i15 == b.a.TRY_GIVEN_DIMENSIONS || i15 == b.a.USE_GIVEN_DIMENSIONS) {
                    boolean z9 = view.getMeasuredHeight() == eVar.getHeight();
                    if (aVar.measureStrategy == b.a.USE_GIVEN_DIMENSIONS || !z8 || ((z8 && z9) || (view instanceof g) || eVar.isResolvedHorizontally())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.getWidth(), 1073741824);
                    }
                }
            }
            int i16 = iArr[bVar2.ordinal()];
            if (i16 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i16 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8558g, i12, -2);
            } else if (i16 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8558g, i12 + eVar.getVerticalMargin(), -1);
            } else if (i16 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8558g, i12, -2);
                boolean z10 = eVar.mMatchConstraintDefaultHeight == 1;
                int i17 = aVar.measureStrategy;
                if (i17 == b.a.TRY_GIVEN_DIMENSIONS || i17 == b.a.USE_GIVEN_DIMENSIONS) {
                    boolean z11 = view.getMeasuredWidth() == eVar.getWidth();
                    if (aVar.measureStrategy == b.a.USE_GIVEN_DIMENSIONS || !z10 || ((z10 && z11) || (view instanceof g) || eVar.isResolvedVertically())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.getHeight(), 1073741824);
                    }
                }
            }
            R.f fVar = (R.f) eVar.getParent();
            if (fVar != null && R.k.enabled(ConstraintLayout.this.f8514i, 256) && view.getMeasuredWidth() == eVar.getWidth() && view.getMeasuredWidth() < fVar.getWidth() && view.getMeasuredHeight() == eVar.getHeight() && view.getMeasuredHeight() < fVar.getHeight() && view.getBaseline() == eVar.getBaselineDistance() && !eVar.isMeasureRequested() && a(eVar.getLastHorizontalMeasureSpec(), iMakeMeasureSpec, eVar.getWidth()) && a(eVar.getLastVerticalMeasureSpec(), iMakeMeasureSpec2, eVar.getHeight())) {
                aVar.measuredWidth = eVar.getWidth();
                aVar.measuredHeight = eVar.getHeight();
                aVar.measuredBaseline = eVar.getBaselineDistance();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z12 = bVar == bVar3;
            boolean z13 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z14 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z15 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z16 = z12 && eVar.mDimensionRatio > 0.0f;
            boolean z17 = z13 && eVar.mDimensionRatio > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i18 = aVar.measureStrategy;
            if (i18 != b.a.TRY_GIVEN_DIMENSIONS && i18 != b.a.USE_GIVEN_DIMENSIONS && z12 && eVar.mMatchConstraintDefaultWidth == 0 && z13 && eVar.mMatchConstraintDefaultHeight == 0) {
                i9 = -1;
                measuredHeight = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof k) && (eVar instanceof l)) {
                    ((k) view).onMeasure((l) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.setLastMeasureSpec(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i19 = eVar.mMatchConstraintMinWidth;
                iMax = i19 > 0 ? Math.max(i19, measuredWidth) : measuredWidth;
                int i20 = eVar.mMatchConstraintMaxWidth;
                if (i20 > 0) {
                    iMax = Math.min(i20, iMax);
                }
                int i21 = eVar.mMatchConstraintMinHeight;
                if (i21 > 0) {
                    measuredHeight = Math.max(i21, measuredHeight2);
                    i8 = iMakeMeasureSpec;
                } else {
                    i8 = iMakeMeasureSpec;
                    measuredHeight = measuredHeight2;
                }
                int i22 = eVar.mMatchConstraintMaxHeight;
                if (i22 > 0) {
                    measuredHeight = Math.min(i22, measuredHeight);
                }
                if (!R.k.enabled(ConstraintLayout.this.f8514i, 1)) {
                    if (z16 && z14) {
                        iMax = (int) ((measuredHeight * eVar.mDimensionRatio) + 0.5f);
                    } else if (z17 && z15) {
                        measuredHeight = (int) ((iMax / eVar.mDimensionRatio) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                    int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i8;
                    if (measuredHeight2 != measuredHeight) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    eVar.setLastMeasureSpec(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i9 = -1;
            }
            boolean z18 = baseline != i9;
            aVar.measuredNeedsSolverPass = (iMax == aVar.horizontalDimension && measuredHeight == aVar.verticalDimension) ? false : true;
            if (bVar5.f8536e) {
                z18 = true;
            }
            if (z18 && baseline != -1 && eVar.getBaselineDistance() != baseline) {
                aVar.measuredNeedsSolverPass = true;
            }
            aVar.measuredWidth = iMax;
            aVar.measuredHeight = measuredHeight;
            aVar.measuredHasBaseline = z18;
            aVar.measuredBaseline = baseline;
        }
    }

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException {
        super(context);
        this.f8506a = new SparseArray();
        this.f8507b = new ArrayList(4);
        this.f8508c = new R.f();
        this.f8509d = 0;
        this.f8510e = 0;
        this.f8511f = Integer.MAX_VALUE;
        this.f8512g = Integer.MAX_VALUE;
        this.f8513h = true;
        this.f8514i = R.k.OPTIMIZATION_STANDARD;
        this.f8515j = null;
        this.f8516k = null;
        this.f8517l = -1;
        this.f8518m = new HashMap();
        this.f8519n = -1;
        this.f8520o = -1;
        this.f8521p = -1;
        this.f8522q = -1;
        this.f8523r = 0;
        this.f8524s = 0;
        this.f8525t = new SparseArray();
        this.f8528w = new c(this);
        this.f8529x = 0;
        this.f8530y = 0;
        f(null, 0, 0);
    }

    private final R.e e(int i8) {
        if (i8 == 0) {
            return this.f8508c;
        }
        View viewFindViewById = (View) this.f8506a.get(i8);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i8)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f8508c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f8551t;
    }

    private void f(AttributeSet attributeSet, int i8, int i9) throws XmlPullParserException, IOException {
        this.f8508c.setCompanionWidget(this);
        this.f8508c.setMeasurer(this.f8528w);
        this.f8506a.put(getId(), this);
        this.f8515j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.ConstraintLayout_Layout, i8, i9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.ConstraintLayout_Layout_android_minWidth) {
                    this.f8509d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8509d);
                } else if (index == i.ConstraintLayout_Layout_android_minHeight) {
                    this.f8510e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8510e);
                } else if (index == i.ConstraintLayout_Layout_android_maxWidth) {
                    this.f8511f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8511f);
                } else if (index == i.ConstraintLayout_Layout_android_maxHeight) {
                    this.f8512g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8512g);
                } else if (index == i.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f8514i = typedArrayObtainStyledAttributes.getInt(index, this.f8514i);
                } else if (index == i.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            i(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f8516k = null;
                        }
                    }
                } else if (index == i.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f8515j = dVar;
                        dVar.load(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f8515j = null;
                    }
                    this.f8517l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8508c.setOptimizationLevel(this.f8514i);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private void h() {
        this.f8513h = true;
        this.f8519n = -1;
        this.f8520o = -1;
        this.f8521p = -1;
        this.f8522q = -1;
        this.f8523r = 0;
        this.f8524s = 0;
    }

    private void l() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            R.e viewWidget = getViewWidget(getChildAt(i8));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (zIsInEditMode) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    e(childAt.getId()).setDebugName(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f8517l != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = getChildAt(i10);
                if (childAt2.getId() == this.f8517l && (childAt2 instanceof e)) {
                    this.f8515j = ((e) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.f8515j;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f8508c.removeAllChildren();
        int size = this.f8507b.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((androidx.constraintlayout.widget.b) this.f8507b.get(i11)).updatePreLayout(this);
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt3 = getChildAt(i12);
            if (childAt3 instanceof g) {
                ((g) childAt3).updatePreLayout(this);
            }
        }
        this.f8525t.clear();
        this.f8525t.put(0, this.f8508c);
        this.f8525t.put(getId(), this.f8508c);
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt4 = getChildAt(i13);
            this.f8525t.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt5 = getChildAt(i14);
            R.e viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f8508c.add(viewWidget2);
                c(zIsInEditMode, childAt5, viewWidget2, bVar, this.f8525t);
            }
        }
    }

    private boolean n() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        int childCount = getChildCount();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            if (getChildAt(i8).isLayoutRequested()) {
                z8 = true;
                break;
            }
            i8++;
        }
        if (z8) {
            l();
        }
        return z8;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
    }

    protected void c(boolean z8, View view, R.e eVar, b bVar, SparseArray sparseArray) throws NumberFormatException {
        float f8;
        R.e eVar2;
        R.e eVar3;
        R.e eVar4;
        R.e eVar5;
        int i8;
        bVar.validate();
        bVar.helped = false;
        eVar.setVisibility(view.getVisibility());
        if (bVar.f8539h) {
            eVar.setInPlaceholder(true);
            eVar.setVisibility(8);
        }
        eVar.setCompanionWidget(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).resolveRtl(eVar, this.f8508c.isRtl());
        }
        if (bVar.f8537f) {
            R.h hVar = (R.h) eVar;
            int i9 = bVar.f8548q;
            int i10 = bVar.f8549r;
            float f9 = bVar.f8550s;
            if (f9 != -1.0f) {
                hVar.setGuidePercent(f9);
                return;
            } else if (i9 != -1) {
                hVar.setGuideBegin(i9);
                return;
            } else {
                if (i10 != -1) {
                    hVar.setGuideEnd(i10);
                    return;
                }
                return;
            }
        }
        int i11 = bVar.f8541j;
        int i12 = bVar.f8542k;
        int i13 = bVar.f8543l;
        int i14 = bVar.f8544m;
        int i15 = bVar.f8545n;
        int i16 = bVar.f8546o;
        float f10 = bVar.f8547p;
        int i17 = bVar.circleConstraint;
        if (i17 != -1) {
            R.e eVar6 = (R.e) sparseArray.get(i17);
            if (eVar6 != null) {
                eVar.connectCircularConstraint(eVar6, bVar.circleAngle, bVar.circleRadius);
            }
        } else {
            if (i11 != -1) {
                R.e eVar7 = (R.e) sparseArray.get(i11);
                if (eVar7 != null) {
                    d.b bVar2 = d.b.LEFT;
                    f8 = f10;
                    eVar.immediateConnect(bVar2, eVar7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i15);
                } else {
                    f8 = f10;
                }
            } else {
                f8 = f10;
                if (i12 != -1 && (eVar2 = (R.e) sparseArray.get(i12)) != null) {
                    eVar.immediateConnect(d.b.LEFT, eVar2, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i15);
                }
            }
            if (i13 != -1) {
                R.e eVar8 = (R.e) sparseArray.get(i13);
                if (eVar8 != null) {
                    eVar.immediateConnect(d.b.RIGHT, eVar8, d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i16);
                }
            } else if (i14 != -1 && (eVar3 = (R.e) sparseArray.get(i14)) != null) {
                d.b bVar3 = d.b.RIGHT;
                eVar.immediateConnect(bVar3, eVar3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i16);
            }
            int i18 = bVar.topToTop;
            if (i18 != -1) {
                R.e eVar9 = (R.e) sparseArray.get(i18);
                if (eVar9 != null) {
                    d.b bVar4 = d.b.TOP;
                    eVar.immediateConnect(bVar4, eVar9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.goneTopMargin);
                }
            } else {
                int i19 = bVar.topToBottom;
                if (i19 != -1 && (eVar4 = (R.e) sparseArray.get(i19)) != null) {
                    eVar.immediateConnect(d.b.TOP, eVar4, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.goneTopMargin);
                }
            }
            int i20 = bVar.bottomToTop;
            if (i20 != -1) {
                R.e eVar10 = (R.e) sparseArray.get(i20);
                if (eVar10 != null) {
                    eVar.immediateConnect(d.b.BOTTOM, eVar10, d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.goneBottomMargin);
                }
            } else {
                int i21 = bVar.bottomToBottom;
                if (i21 != -1 && (eVar5 = (R.e) sparseArray.get(i21)) != null) {
                    d.b bVar5 = d.b.BOTTOM;
                    eVar.immediateConnect(bVar5, eVar5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.goneBottomMargin);
                }
            }
            int i22 = bVar.baselineToBaseline;
            if (i22 != -1) {
                View view2 = (View) this.f8506a.get(i22);
                R.e eVar11 = (R.e) sparseArray.get(bVar.baselineToBaseline);
                if (eVar11 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                    b bVar6 = (b) view2.getLayoutParams();
                    bVar.f8536e = true;
                    bVar6.f8536e = true;
                    d.b bVar7 = d.b.BASELINE;
                    eVar.getAnchor(bVar7).connect(eVar11.getAnchor(bVar7), 0, -1, true);
                    eVar.setHasBaseline(true);
                    bVar6.f8551t.setHasBaseline(true);
                    eVar.getAnchor(d.b.TOP).reset();
                    eVar.getAnchor(d.b.BOTTOM).reset();
                }
            }
            float f11 = f8;
            if (f11 >= 0.0f) {
                eVar.setHorizontalBiasPercent(f11);
            }
            float f12 = bVar.verticalBias;
            if (f12 >= 0.0f) {
                eVar.setVerticalBiasPercent(f12);
            }
        }
        if (z8 && ((i8 = bVar.editorAbsoluteX) != -1 || bVar.editorAbsoluteY != -1)) {
            eVar.setOrigin(i8, bVar.editorAbsoluteY);
        }
        if (bVar.f8534c) {
            eVar.setHorizontalDimensionBehaviour(e.b.FIXED);
            eVar.setWidth(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.setHorizontalDimensionBehaviour(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.constrainedWidth) {
                eVar.setHorizontalDimensionBehaviour(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.setHorizontalDimensionBehaviour(e.b.MATCH_PARENT);
            }
            eVar.getAnchor(d.b.LEFT).mMargin = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.getAnchor(d.b.RIGHT).mMargin = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.setHorizontalDimensionBehaviour(e.b.MATCH_CONSTRAINT);
            eVar.setWidth(0);
        }
        if (bVar.f8535d) {
            eVar.setVerticalDimensionBehaviour(e.b.FIXED);
            eVar.setHeight(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.setVerticalDimensionBehaviour(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.constrainedHeight) {
                eVar.setVerticalDimensionBehaviour(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.setVerticalDimensionBehaviour(e.b.MATCH_PARENT);
            }
            eVar.getAnchor(d.b.TOP).mMargin = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.getAnchor(d.b.BOTTOM).mMargin = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.setVerticalDimensionBehaviour(e.b.MATCH_CONSTRAINT);
            eVar.setHeight(0);
        }
        eVar.setDimensionRatio(bVar.dimensionRatio);
        eVar.setHorizontalWeight(bVar.horizontalWeight);
        eVar.setVerticalWeight(bVar.verticalWeight);
        eVar.setHorizontalChainStyle(bVar.horizontalChainStyle);
        eVar.setVerticalChainStyle(bVar.verticalChainStyle);
        eVar.setHorizontalMatchStyle(bVar.matchConstraintDefaultWidth, bVar.matchConstraintMinWidth, bVar.matchConstraintMaxWidth, bVar.matchConstraintPercentWidth);
        eVar.setVerticalMatchStyle(bVar.matchConstraintDefaultHeight, bVar.matchConstraintMinHeight, bVar.matchConstraintMaxHeight, bVar.matchConstraintPercentHeight);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f8507b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                ((androidx.constraintlayout.widget.b) this.f8507b.get(i8)).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i10 = Integer.parseInt(strArrSplit[0]);
                        int i11 = Integer.parseInt(strArrSplit[1]);
                        int i12 = Integer.parseInt(strArrSplit[2]);
                        int i13 = (int) ((i10 / 1080.0f) * width);
                        int i14 = (int) ((i11 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(W.a.CATEGORY_MASK);
                        float f8 = i13;
                        float f9 = i14;
                        float f10 = i13 + ((int) ((i12 / 1080.0f) * width));
                        canvas.drawLine(f8, f9, f10, f9, paint);
                        float f11 = i14 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f10, f9, f10, f11, paint);
                        canvas.drawLine(f10, f11, f8, f11, paint);
                        canvas.drawLine(f8, f11, f8, f9, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f8, f9, f10, f11, paint);
                        canvas.drawLine(f8, f11, f10, f9, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(Q.e eVar) {
        this.f8527v = eVar;
        this.f8508c.fillMetrics(eVar);
    }

    @Override // android.view.View
    public void forceLayout() {
        h();
        super.forceLayout();
    }

    protected boolean g() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public Object getDesignInformation(int i8, Object obj) {
        if (i8 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f8518m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f8518m.get(str);
    }

    public int getMaxHeight() {
        return this.f8512g;
    }

    public int getMaxWidth() {
        return this.f8511f;
    }

    public int getMinHeight() {
        return this.f8510e;
    }

    public int getMinWidth() {
        return this.f8509d;
    }

    public int getOptimizationLevel() {
        return this.f8508c.getOptimizationLevel();
    }

    public View getViewById(int i8) {
        return (View) this.f8506a.get(i8);
    }

    public final R.e getViewWidget(View view) {
        if (view == this) {
            return this.f8508c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f8551t;
    }

    protected void i(int i8) {
        this.f8516k = new androidx.constraintlayout.widget.c(getContext(), this, i8);
    }

    protected void j(int i8, int i9, int i10, int i11, boolean z8, boolean z9) {
        c cVar = this.f8528w;
        int i12 = cVar.f8556e;
        int iResolveSizeAndState = View.resolveSizeAndState(i10 + cVar.f8555d, i8, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i11 + i12, i9, 0);
        int i13 = iResolveSizeAndState & AbstractC0985p0.MEASURED_SIZE_MASK;
        int i14 = iResolveSizeAndState2 & AbstractC0985p0.MEASURED_SIZE_MASK;
        int iMin = Math.min(this.f8511f, i13);
        int iMin2 = Math.min(this.f8512g, i14);
        if (z8) {
            iMin |= 16777216;
        }
        if (z9) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f8519n = iMin;
        this.f8520o = iMin2;
    }

    protected void k(R.f fVar, int i8, int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i11 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f8528w.captureLayoutInfos(i9, i10, iMax, iMax2, paddingWidth, i11);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? g() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i12 = size - paddingWidth;
        int i13 = size2 - i11;
        m(fVar, mode, i12, mode2, i13);
        fVar.measure(i8, mode, i12, mode2, i13, this.f8519n, this.f8520o, iMax5, iMax);
    }

    public void loadLayoutDescription(int i8) {
        if (i8 == 0) {
            this.f8516k = null;
            return;
        }
        try {
            this.f8516k = new androidx.constraintlayout.widget.c(getContext(), this, i8);
        } catch (Resources.NotFoundException unused) {
            this.f8516k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
  0x003e: PHI (r2v4 R.e$b) = (r2v3 R.e$b), (r2v0 R.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m(R.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f8528w
            int r1 = r0.f8556e
            int r0 = r0.f8555d
            R.e$b r2 = R.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L38
        L1a:
            int r9 = r7.f8511f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            R.e$b r9 = R.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f8509d
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            R.e$b r9 = R.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f8509d
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r6
            goto L5d
        L40:
            int r11 = r7.f8512g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            R.e$b r2 = R.e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f8510e
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            R.e$b r2 = R.e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f8510e
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.getWidth()
            if (r10 != r11) goto L69
            int r11 = r8.getHeight()
            if (r12 == r11) goto L6c
        L69:
            r8.invalidateMeasures()
        L6c:
            r8.setX(r6)
            r8.setY(r6)
            int r11 = r7.f8511f
            int r11 = r11 - r0
            r8.setMaxWidth(r11)
            int r11 = r7.f8512g
            int r11 = r11 - r1
            r8.setMaxHeight(r11)
            r8.setMinWidth(r6)
            r8.setMinHeight(r6)
            r8.setHorizontalDimensionBehaviour(r9)
            r8.setWidth(r10)
            r8.setVerticalDimensionBehaviour(r2)
            r8.setHeight(r12)
            int r9 = r7.f8509d
            int r9 = r9 - r0
            r8.setMinWidth(r9)
            int r9 = r7.f8510e
            int r9 = r9 - r1
            r8.setMinHeight(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m(R.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            b bVar = (b) childAt.getLayoutParams();
            R.e eVar = bVar.f8551t;
            if ((childAt.getVisibility() != 8 || bVar.f8537f || bVar.f8538g || bVar.f8540i || zIsInEditMode) && !bVar.f8539h) {
                int x8 = eVar.getX();
                int y8 = eVar.getY();
                int width = eVar.getWidth() + x8;
                int height = eVar.getHeight() + y8;
                childAt.layout(x8, y8, width, height);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(x8, y8, width, height);
                }
            }
        }
        int size = this.f8507b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.constraintlayout.widget.b) this.f8507b.get(i13)).updatePostLayout(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (!this.f8513h) {
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                if (getChildAt(i10).isLayoutRequested()) {
                    this.f8513h = true;
                    break;
                }
                i10++;
            }
        }
        if (!this.f8513h) {
            int i11 = this.f8529x;
            if (i11 == i8 && this.f8530y == i9) {
                j(i8, i9, this.f8508c.getWidth(), this.f8508c.getHeight(), this.f8508c.isWidthMeasuredTooSmall(), this.f8508c.isHeightMeasuredTooSmall());
                return;
            }
            if (i11 == i8 && View.MeasureSpec.getMode(i8) == 1073741824 && View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f8530y) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i9) >= this.f8508c.getHeight()) {
                this.f8529x = i8;
                this.f8530y = i9;
                j(i8, i9, this.f8508c.getWidth(), this.f8508c.getHeight(), this.f8508c.isWidthMeasuredTooSmall(), this.f8508c.isHeightMeasuredTooSmall());
                return;
            }
        }
        this.f8529x = i8;
        this.f8530y = i9;
        this.f8508c.setRtl(g());
        if (this.f8513h) {
            this.f8513h = false;
            if (n()) {
                this.f8508c.updateHierarchy();
            }
        }
        k(this.f8508c, this.f8514i, i8, i9);
        j(i8, i9, this.f8508c.getWidth(), this.f8508c.getHeight(), this.f8508c.isWidthMeasuredTooSmall(), this.f8508c.isHeightMeasuredTooSmall());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        R.e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof R.h)) {
            b bVar = (b) view.getLayoutParams();
            R.h hVar = new R.h();
            bVar.f8551t = hVar;
            bVar.f8537f = true;
            hVar.setOrientation(bVar.orientation);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.validateParams();
            ((b) view.getLayoutParams()).f8538g = true;
            if (!this.f8507b.contains(bVar2)) {
                this.f8507b.add(bVar2);
            }
        }
        this.f8506a.put(view.getId(), view);
        this.f8513h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f8506a.remove(view.getId());
        this.f8508c.remove(getViewWidget(view));
        this.f8507b.remove(view);
        this.f8513h = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        h();
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.f8515j = dVar;
    }

    public void setDesignInformation(int i8, Object obj, Object obj2) {
        if (i8 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f8518m == null) {
                this.f8518m = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f8518m.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int i8) {
        this.f8506a.remove(getId());
        super.setId(i8);
        this.f8506a.put(getId(), this);
    }

    public void setMaxHeight(int i8) {
        if (i8 == this.f8512g) {
            return;
        }
        this.f8512g = i8;
        requestLayout();
    }

    public void setMaxWidth(int i8) {
        if (i8 == this.f8511f) {
            return;
        }
        this.f8511f = i8;
        requestLayout();
    }

    public void setMinHeight(int i8) {
        if (i8 == this.f8510e) {
            return;
        }
        this.f8510e = i8;
        requestLayout();
    }

    public void setMinWidth(int i8) {
        if (i8 == this.f8509d) {
            return;
        }
        this.f8509d = i8;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        this.f8526u = fVar;
        androidx.constraintlayout.widget.c cVar = this.f8516k;
        if (cVar != null) {
            cVar.setOnConstraintsChanged(fVar);
        }
    }

    public void setOptimizationLevel(int i8) {
        this.f8514i = i8;
        this.f8508c.setOptimizationLevel(i8);
    }

    public void setState(int i8, int i9, int i10) {
        androidx.constraintlayout.widget.c cVar = this.f8516k;
        if (cVar != null) {
            cVar.updateConstraints(i8, i9, i10);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.f8506a = new SparseArray();
        this.f8507b = new ArrayList(4);
        this.f8508c = new R.f();
        this.f8509d = 0;
        this.f8510e = 0;
        this.f8511f = Integer.MAX_VALUE;
        this.f8512g = Integer.MAX_VALUE;
        this.f8513h = true;
        this.f8514i = R.k.OPTIMIZATION_STANDARD;
        this.f8515j = null;
        this.f8516k = null;
        this.f8517l = -1;
        this.f8518m = new HashMap();
        this.f8519n = -1;
        this.f8520o = -1;
        this.f8521p = -1;
        this.f8522q = -1;
        this.f8523r = 0;
        this.f8524s = 0;
        this.f8525t = new SparseArray();
        this.f8528w = new c(this);
        this.f8529x = 0;
        this.f8530y = 0;
        f(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i8) throws XmlPullParserException, IOException {
        super(context, attributeSet, i8);
        this.f8506a = new SparseArray();
        this.f8507b = new ArrayList(4);
        this.f8508c = new R.f();
        this.f8509d = 0;
        this.f8510e = 0;
        this.f8511f = Integer.MAX_VALUE;
        this.f8512g = Integer.MAX_VALUE;
        this.f8513h = true;
        this.f8514i = R.k.OPTIMIZATION_STANDARD;
        this.f8515j = null;
        this.f8516k = null;
        this.f8517l = -1;
        this.f8518m = new HashMap();
        this.f8519n = -1;
        this.f8520o = -1;
        this.f8521p = -1;
        this.f8522q = -1;
        this.f8523r = 0;
        this.f8524s = 0;
        this.f8525t = new SparseArray();
        this.f8528w = new c(this);
        this.f8529x = 0;
        this.f8530y = 0;
        f(attributeSet, i8, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i8, int i9) throws XmlPullParserException, IOException {
        super(context, attributeSet, i8, i9);
        this.f8506a = new SparseArray();
        this.f8507b = new ArrayList(4);
        this.f8508c = new R.f();
        this.f8509d = 0;
        this.f8510e = 0;
        this.f8511f = Integer.MAX_VALUE;
        this.f8512g = Integer.MAX_VALUE;
        this.f8513h = true;
        this.f8514i = R.k.OPTIMIZATION_STANDARD;
        this.f8515j = null;
        this.f8516k = null;
        this.f8517l = -1;
        this.f8518m = new HashMap();
        this.f8519n = -1;
        this.f8520o = -1;
        this.f8521p = -1;
        this.f8522q = -1;
        this.f8523r = 0;
        this.f8524s = 0;
        this.f8525t = new SparseArray();
        this.f8528w = new c(this);
        this.f8529x = 0;
        this.f8530y = 0;
        f(attributeSet, i8, i9);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int END = 7;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;

        /* renamed from: a, reason: collision with root package name */
        float f8532a;

        /* renamed from: b, reason: collision with root package name */
        int f8533b;
        public int baselineToBaseline;
        public int bottomToBottom;
        public int bottomToTop;

        /* renamed from: c, reason: collision with root package name */
        boolean f8534c;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String constraintTag;

        /* renamed from: d, reason: collision with root package name */
        boolean f8535d;
        public String dimensionRatio;

        /* renamed from: e, reason: collision with root package name */
        boolean f8536e;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;

        /* renamed from: f, reason: collision with root package name */
        boolean f8537f;

        /* renamed from: g, reason: collision with root package name */
        boolean f8538g;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;

        /* renamed from: h, reason: collision with root package name */
        boolean f8539h;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        public float horizontalWeight;

        /* renamed from: i, reason: collision with root package name */
        boolean f8540i;

        /* renamed from: j, reason: collision with root package name */
        int f8541j;

        /* renamed from: k, reason: collision with root package name */
        int f8542k;

        /* renamed from: l, reason: collision with root package name */
        int f8543l;
        public int leftToLeft;
        public int leftToRight;

        /* renamed from: m, reason: collision with root package name */
        int f8544m;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;

        /* renamed from: n, reason: collision with root package name */
        int f8545n;

        /* renamed from: o, reason: collision with root package name */
        int f8546o;
        public int orientation;

        /* renamed from: p, reason: collision with root package name */
        float f8547p;

        /* renamed from: q, reason: collision with root package name */
        int f8548q;

        /* renamed from: r, reason: collision with root package name */
        int f8549r;
        public int rightToLeft;
        public int rightToRight;

        /* renamed from: s, reason: collision with root package name */
        float f8550s;
        public int startToEnd;
        public int startToStart;

        /* renamed from: t, reason: collision with root package name */
        R.e f8551t;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        public float verticalWeight;

        private static class a {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TAG = 51;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int UNUSED = 0;
            public static final SparseIntArray map;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                map = sparseIntArray;
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(i.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(i.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.f8532a = 0.0f;
            this.f8533b = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.f8534c = true;
            this.f8535d = true;
            this.f8536e = false;
            this.f8537f = false;
            this.f8538g = false;
            this.f8539h = false;
            this.f8540i = false;
            this.f8541j = -1;
            this.f8542k = -1;
            this.f8543l = -1;
            this.f8544m = -1;
            this.f8545n = -1;
            this.f8546o = -1;
            this.f8547p = 0.5f;
            this.f8551t = new R.e();
            this.helped = false;
            this.guideBegin = bVar.guideBegin;
            this.guideEnd = bVar.guideEnd;
            this.guidePercent = bVar.guidePercent;
            this.leftToLeft = bVar.leftToLeft;
            this.leftToRight = bVar.leftToRight;
            this.rightToLeft = bVar.rightToLeft;
            this.rightToRight = bVar.rightToRight;
            this.topToTop = bVar.topToTop;
            this.topToBottom = bVar.topToBottom;
            this.bottomToTop = bVar.bottomToTop;
            this.bottomToBottom = bVar.bottomToBottom;
            this.baselineToBaseline = bVar.baselineToBaseline;
            this.circleConstraint = bVar.circleConstraint;
            this.circleRadius = bVar.circleRadius;
            this.circleAngle = bVar.circleAngle;
            this.startToEnd = bVar.startToEnd;
            this.startToStart = bVar.startToStart;
            this.endToStart = bVar.endToStart;
            this.endToEnd = bVar.endToEnd;
            this.goneLeftMargin = bVar.goneLeftMargin;
            this.goneTopMargin = bVar.goneTopMargin;
            this.goneRightMargin = bVar.goneRightMargin;
            this.goneBottomMargin = bVar.goneBottomMargin;
            this.goneStartMargin = bVar.goneStartMargin;
            this.goneEndMargin = bVar.goneEndMargin;
            this.horizontalBias = bVar.horizontalBias;
            this.verticalBias = bVar.verticalBias;
            this.dimensionRatio = bVar.dimensionRatio;
            this.f8532a = bVar.f8532a;
            this.f8533b = bVar.f8533b;
            this.horizontalWeight = bVar.horizontalWeight;
            this.verticalWeight = bVar.verticalWeight;
            this.horizontalChainStyle = bVar.horizontalChainStyle;
            this.verticalChainStyle = bVar.verticalChainStyle;
            this.constrainedWidth = bVar.constrainedWidth;
            this.constrainedHeight = bVar.constrainedHeight;
            this.matchConstraintDefaultWidth = bVar.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = bVar.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = bVar.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = bVar.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = bVar.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = bVar.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = bVar.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = bVar.matchConstraintPercentHeight;
            this.editorAbsoluteX = bVar.editorAbsoluteX;
            this.editorAbsoluteY = bVar.editorAbsoluteY;
            this.orientation = bVar.orientation;
            this.f8534c = bVar.f8534c;
            this.f8535d = bVar.f8535d;
            this.f8536e = bVar.f8536e;
            this.f8537f = bVar.f8537f;
            this.f8541j = bVar.f8541j;
            this.f8542k = bVar.f8542k;
            this.f8543l = bVar.f8543l;
            this.f8544m = bVar.f8544m;
            this.f8545n = bVar.f8545n;
            this.f8546o = bVar.f8546o;
            this.f8547p = bVar.f8547p;
            this.constraintTag = bVar.constraintTag;
            this.f8551t = bVar.f8551t;
        }

        public String getConstraintTag() {
            return this.constraintTag;
        }

        public R.e getConstraintWidget() {
            return this.f8551t;
        }

        public void reset() {
            R.e eVar = this.f8551t;
            if (eVar != null) {
                eVar.reset();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public void setWidgetDebugName(String str) {
            this.f8551t.setDebugName(str);
        }

        public void validate() {
            this.f8537f = false;
            this.f8534c = true;
            this.f8535d = true;
            int i8 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i8 == -2 && this.constrainedWidth) {
                this.f8534c = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            int i9 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i9 == -2 && this.constrainedHeight) {
                this.f8535d = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (i8 == 0 || i8 == -1) {
                this.f8534c = false;
                if (i8 == 0 && this.matchConstraintDefaultWidth == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (i9 == 0 || i9 == -1) {
                this.f8535d = false;
                if (i9 == 0 && this.matchConstraintDefaultHeight == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent == -1.0f && this.guideBegin == -1 && this.guideEnd == -1) {
                return;
            }
            this.f8537f = true;
            this.f8534c = true;
            this.f8535d = true;
            if (!(this.f8551t instanceof R.h)) {
                this.f8551t = new R.h();
            }
            ((R.h) this.f8551t).setOrientation(this.orientation);
        }

        public b(Context context, AttributeSet attributeSet) throws NumberFormatException {
            int i8;
            super(context, attributeSet);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.f8532a = 0.0f;
            this.f8533b = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.f8534c = true;
            this.f8535d = true;
            this.f8536e = false;
            this.f8537f = false;
            this.f8538g = false;
            this.f8539h = false;
            this.f8540i = false;
            this.f8541j = -1;
            this.f8542k = -1;
            this.f8543l = -1;
            this.f8544m = -1;
            this.f8545n = -1;
            this.f8546o = -1;
            this.f8547p = 0.5f;
            this.f8551t = new R.e();
            this.helped = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                int i10 = a.map.get(index);
                switch (i10) {
                    case 1:
                        this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        this.circleConstraint = resourceId;
                        if (resourceId == -1) {
                            this.circleConstraint = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        float f8 = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        this.circleAngle = f8;
                        if (f8 < 0.0f) {
                            this.circleAngle = (360.0f - f8) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        this.leftToLeft = resourceId2;
                        if (resourceId2 == -1) {
                            this.leftToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToRight);
                        this.leftToRight = resourceId3;
                        if (resourceId3 == -1) {
                            this.leftToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        this.rightToLeft = resourceId4;
                        if (resourceId4 == -1) {
                            this.rightToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToRight);
                        this.rightToRight = resourceId5;
                        if (resourceId5 == -1) {
                            this.rightToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToTop);
                        this.topToTop = resourceId6;
                        if (resourceId6 == -1) {
                            this.topToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToBottom);
                        this.topToBottom = resourceId7;
                        if (resourceId7 == -1) {
                            this.topToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        this.bottomToTop = resourceId8;
                        if (resourceId8 == -1) {
                            this.bottomToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        this.bottomToBottom = resourceId9;
                        if (resourceId9 == -1) {
                            this.bottomToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        this.baselineToBaseline = resourceId10;
                        if (resourceId10 == -1) {
                            this.baselineToBaseline = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToEnd);
                        this.startToEnd = resourceId11;
                        if (resourceId11 == -1) {
                            this.startToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToStart);
                        this.startToStart = resourceId12;
                        if (resourceId12 == -1) {
                            this.startToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToStart);
                        this.endToStart = resourceId13;
                        if (resourceId13 == -1) {
                            this.endToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToEnd);
                        this.endToEnd = resourceId14;
                        if (resourceId14 == -1) {
                            this.endToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                        this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        int i11 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultWidth = i11;
                        if (i11 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultHeight = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.matchConstraintMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                                this.matchConstraintMinWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                                this.matchConstraintMaxWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.matchConstraintPercentWidth = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        this.matchConstraintDefaultWidth = 2;
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                                this.matchConstraintMinHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                                this.matchConstraintMaxHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.matchConstraintPercentHeight = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        this.matchConstraintDefaultHeight = 2;
                        break;
                    default:
                        switch (i10) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.dimensionRatio = string;
                                this.f8532a = Float.NaN;
                                this.f8533b = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.dimensionRatio.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i8 = 0;
                                    } else {
                                        String strSubstring = this.dimensionRatio.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase(C5339a.LONGITUDE_WEST)) {
                                            this.f8533b = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f8533b = 1;
                                        }
                                        i8 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.dimensionRatio.indexOf(58);
                                    if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                                        String strSubstring2 = this.dimensionRatio.substring(i8, iIndexOf2);
                                        String strSubstring3 = this.dimensionRatio.substring(iIndexOf2 + 1);
                                        if (strSubstring2.length() <= 0 || strSubstring3.length() <= 0) {
                                            break;
                                        } else {
                                            try {
                                                float f9 = Float.parseFloat(strSubstring2);
                                                float f10 = Float.parseFloat(strSubstring3);
                                                if (f9 <= 0.0f || f10 <= 0.0f) {
                                                    break;
                                                } else if (this.f8533b == 1) {
                                                    this.f8532a = Math.abs(f10 / f9);
                                                    break;
                                                } else {
                                                    this.f8532a = Math.abs(f9 / f10);
                                                    break;
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String strSubstring4 = this.dimensionRatio.substring(i8);
                                        if (strSubstring4.length() > 0) {
                                            this.f8532a = Float.parseFloat(strSubstring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                            case a.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                this.constraintTag = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            validate();
        }

        public b(int i8, int i9) {
            super(i8, i9);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.f8532a = 0.0f;
            this.f8533b = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.f8534c = true;
            this.f8535d = true;
            this.f8536e = false;
            this.f8537f = false;
            this.f8538g = false;
            this.f8539h = false;
            this.f8540i = false;
            this.f8541j = -1;
            this.f8542k = -1;
            this.f8543l = -1;
            this.f8544m = -1;
            this.f8545n = -1;
            this.f8546o = -1;
            this.f8547p = 0.5f;
            this.f8551t = new R.e();
            this.helped = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.f8532a = 0.0f;
            this.f8533b = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.f8534c = true;
            this.f8535d = true;
            this.f8536e = false;
            this.f8537f = false;
            this.f8538g = false;
            this.f8539h = false;
            this.f8540i = false;
            this.f8541j = -1;
            this.f8542k = -1;
            this.f8543l = -1;
            this.f8544m = -1;
            this.f8545n = -1;
            this.f8546o = -1;
            this.f8547p = 0.5f;
            this.f8551t = new R.e();
            this.helped = false;
        }
    }
}
