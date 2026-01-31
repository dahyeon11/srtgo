package androidx.gridlayout.widget;

import Q7.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.AbstractC0995u0;
import com.j256.ormlite.stmt.query.SimpleComparison;
import g0.AbstractC5532a;
import g0.AbstractC5533b;
import i0.C5639a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class GridLayout extends ViewGroup {
    public static final int ALIGN_BOUNDS = 0;
    public static final int ALIGN_MARGINS = 1;
    public static final i BASELINE;
    public static final i BOTTOM;
    public static final i CENTER;
    public static final i END;
    public static final i FILL;
    public static final int HORIZONTAL = 0;
    public static final i LEFT;
    public static final i RIGHT;
    public static final i START;
    public static final i TOP;
    public static final int UNDEFINED = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;

    /* renamed from: i, reason: collision with root package name */
    static final Printer f9870i = new LogPrinter(3, GridLayout.class.getName());

    /* renamed from: j, reason: collision with root package name */
    static final Printer f9871j = new a();

    /* renamed from: k, reason: collision with root package name */
    private static final int f9872k = AbstractC5533b.GridLayout_orientation;

    /* renamed from: l, reason: collision with root package name */
    private static final int f9873l = AbstractC5533b.GridLayout_rowCount;

    /* renamed from: m, reason: collision with root package name */
    private static final int f9874m = AbstractC5533b.GridLayout_columnCount;

    /* renamed from: n, reason: collision with root package name */
    private static final int f9875n = AbstractC5533b.GridLayout_useDefaultMargins;

    /* renamed from: o, reason: collision with root package name */
    private static final int f9876o = AbstractC5533b.GridLayout_alignmentMode;

    /* renamed from: p, reason: collision with root package name */
    private static final int f9877p = AbstractC5533b.GridLayout_rowOrderPreserved;

    /* renamed from: q, reason: collision with root package name */
    private static final int f9878q = AbstractC5533b.GridLayout_columnOrderPreserved;

    /* renamed from: r, reason: collision with root package name */
    static final i f9879r = new b();

    /* renamed from: s, reason: collision with root package name */
    private static final i f9880s;

    /* renamed from: t, reason: collision with root package name */
    private static final i f9881t;

    /* renamed from: a, reason: collision with root package name */
    final l f9882a;

    /* renamed from: b, reason: collision with root package name */
    final l f9883b;

    /* renamed from: c, reason: collision with root package name */
    int f9884c;

    /* renamed from: d, reason: collision with root package name */
    boolean f9885d;

    /* renamed from: e, reason: collision with root package name */
    int f9886e;

    /* renamed from: f, reason: collision with root package name */
    int f9887f;

    /* renamed from: g, reason: collision with root package name */
    int f9888g;

    /* renamed from: h, reason: collision with root package name */
    Printer f9889h;

    static class a implements Printer {
        a() {
        }

        @Override // android.util.Printer
        public void println(String str) {
        }
    }

    static class b extends i {
        b() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String a() {
            return "UNDEFINED";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int b(View view, int i8) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int getAlignmentValue(View view, int i8, int i9) {
            return Integer.MIN_VALUE;
        }
    }

    static class c extends i {
        c() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String a() {
            return "LEADING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int b(View view, int i8) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int getAlignmentValue(View view, int i8, int i9) {
            return 0;
        }
    }

    static class d extends i {
        d() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String a() {
            return "TRAILING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int b(View view, int i8) {
            return i8;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int getAlignmentValue(View view, int i8, int i9) {
            return i8;
        }
    }

    static class e extends i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f9890a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f9891b;

        e(i iVar, i iVar2) {
            this.f9890a = iVar;
            this.f9891b = iVar2;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String a() {
            return "SWITCHING[L:" + this.f9890a.a() + ", R:" + this.f9891b.a() + "]";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int b(View view, int i8) {
            return (AbstractC0985p0.getLayoutDirection(view) == 1 ? this.f9891b : this.f9890a).b(view, i8);
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int getAlignmentValue(View view, int i8, int i9) {
            return (AbstractC0985p0.getLayoutDirection(view) == 1 ? this.f9891b : this.f9890a).getAlignmentValue(view, i8, i9);
        }
    }

    static class f extends i {
        f() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String a() {
            return "CENTER";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int b(View view, int i8) {
            return i8 >> 1;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int getAlignmentValue(View view, int i8, int i9) {
            return i8 >> 1;
        }
    }

    static class g extends i {

        class a extends m {

            /* renamed from: a, reason: collision with root package name */
            private int f9892a;

            a() {
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected int a(GridLayout gridLayout, View view, i iVar, int i8, boolean z8) {
                return Math.max(0, super.a(gridLayout, view, iVar, i8, z8));
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected void b(int i8, int i9) {
                super.b(i8, i9);
                this.f9892a = Math.max(this.f9892a, i8 + i9);
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected void d() {
                super.d();
                this.f9892a = Integer.MIN_VALUE;
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected int e(boolean z8) {
                return Math.max(super.e(z8), this.f9892a);
            }
        }

        g() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String a() {
            return "BASELINE";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int b(View view, int i8) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int getAlignmentValue(View view, int i8, int i9) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            if (baseline == -1) {
                return Integer.MIN_VALUE;
            }
            return baseline;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public m getBounds() {
            return new a();
        }
    }

    static class h extends i {
        h() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String a() {
            return "FILL";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int b(View view, int i8) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int getAlignmentValue(View view, int i8, int i9) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int getSizeInCell(View view, int i8, int i9) {
            return i9;
        }
    }

    public static abstract class i {
        i() {
        }

        abstract String a();

        abstract int b(View view, int i8);

        abstract int getAlignmentValue(View view, int i8, int i9);

        m getBounds() {
            return new m();
        }

        int getSizeInCell(View view, int i8, int i9) {
            return i8;
        }

        public String toString() {
            return "Alignment:" + a();
        }
    }

    static final class j {
        public final n span;
        public boolean valid = true;
        public final p value;

        public j(n nVar, p pVar) {
            this.span = nVar;
            this.value = pVar;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.span);
            sb.append(X.SPACE);
            sb.append(!this.valid ? "+>" : "->");
            sb.append(X.SPACE);
            sb.append(this.value);
            return sb.toString();
        }
    }

    static final class k extends ArrayList {

        /* renamed from: a, reason: collision with root package name */
        private final Class f9894a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f9895b;

        private k(Class cls, Class cls2) {
            this.f9894a = cls;
            this.f9895b = cls2;
        }

        public static <K, V> k of(Class<K> cls, Class<V> cls2) {
            return new k(cls, cls2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public q pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f9894a, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.f9895b, size);
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = ((Pair) get(i8)).first;
                objArr2[i8] = ((Pair) get(i8)).second;
            }
            return new q(objArr, objArr2);
        }

        public void put(Object obj, Object obj2) {
            add(Pair.create(obj, obj2));
        }
    }

    final class l {
        public j[] arcs;

        /* renamed from: b, reason: collision with root package name */
        q f9897b;

        /* renamed from: c, reason: collision with root package name */
        q f9898c;

        /* renamed from: d, reason: collision with root package name */
        q f9899d;
        public int[] deltas;
        public boolean hasWeights;
        public final boolean horizontal;
        public int[] leadingMargins;
        public int[] locations;
        public int[] trailingMargins;
        public int definedCount = Integer.MIN_VALUE;

        /* renamed from: a, reason: collision with root package name */
        private int f9896a = Integer.MIN_VALUE;
        public boolean groupBoundsValid = false;
        public boolean forwardLinksValid = false;
        public boolean backwardLinksValid = false;
        public boolean leadingMarginsValid = false;
        public boolean trailingMarginsValid = false;
        public boolean arcsValid = false;
        public boolean locationsValid = false;
        public boolean hasWeightsValid = false;

        /* renamed from: e, reason: collision with root package name */
        boolean f9900e = true;

        /* renamed from: f, reason: collision with root package name */
        private p f9901f = new p(0);

        /* renamed from: g, reason: collision with root package name */
        private p f9902g = new p(-100000);

        class a {

            /* renamed from: a, reason: collision with root package name */
            j[] f9904a;

            /* renamed from: b, reason: collision with root package name */
            int f9905b;

            /* renamed from: c, reason: collision with root package name */
            j[][] f9906c;

            /* renamed from: d, reason: collision with root package name */
            int[] f9907d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ j[] f9908e;

            a(j[] jVarArr) {
                this.f9908e = jVarArr;
                this.f9904a = new j[jVarArr.length];
                this.f9905b = r0.length - 1;
                this.f9906c = l.this.r(jVarArr);
                this.f9907d = new int[l.this.getCount() + 1];
            }

            j[] a() {
                int length = this.f9906c.length;
                for (int i8 = 0; i8 < length; i8++) {
                    b(i8);
                }
                return this.f9904a;
            }

            void b(int i8) {
                int[] iArr = this.f9907d;
                if (iArr[i8] != 0) {
                    return;
                }
                iArr[i8] = 1;
                for (j jVar : this.f9906c[i8]) {
                    b(jVar.span.max);
                    j[] jVarArr = this.f9904a;
                    int i9 = this.f9905b;
                    this.f9905b = i9 - 1;
                    jVarArr[i9] = jVar;
                }
                this.f9907d[i8] = 2;
            }
        }

        l(boolean z8) {
            this.horizontal = z8;
        }

        private int A(int[] iArr) {
            return iArr[getCount()];
        }

        private boolean B(int[] iArr) {
            return C(getArcs(), iArr);
        }

        private boolean C(j[] jVarArr, int[] iArr) {
            return D(jVarArr, iArr, true);
        }

        private boolean D(j[] jVarArr, int[] iArr, boolean z8) {
            String str = this.horizontal ? "horizontal" : "vertical";
            int count = getCount() + 1;
            boolean[] zArr = null;
            for (int i8 = 0; i8 < jVarArr.length; i8++) {
                v(iArr);
                for (int i9 = 0; i9 < count; i9++) {
                    boolean zX = false;
                    for (j jVar : jVarArr) {
                        zX |= x(iArr, jVar);
                    }
                    if (!zX) {
                        if (zArr != null) {
                            w(str, jVarArr, zArr);
                        }
                        return true;
                    }
                }
                if (!z8) {
                    return false;
                }
                boolean[] zArr2 = new boolean[jVarArr.length];
                for (int i10 = 0; i10 < count; i10++) {
                    int length = jVarArr.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        zArr2[i11] = zArr2[i11] | x(iArr, jVarArr[i11]);
                    }
                }
                if (i8 == 0) {
                    zArr = zArr2;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= jVarArr.length) {
                        break;
                    }
                    if (zArr2[i12]) {
                        j jVar2 = jVarArr[i12];
                        n nVar = jVar2.span;
                        if (nVar.min >= nVar.max) {
                            jVar2.valid = false;
                            break;
                        }
                    }
                    i12++;
                }
            }
            return true;
        }

        private void E(int[] iArr) {
            Arrays.fill(getDeltas(), 0);
            B(iArr);
            boolean z8 = true;
            int childCount = (this.f9901f.value * GridLayout.this.getChildCount()) + 1;
            if (childCount < 2) {
                return;
            }
            float fD = d();
            int i8 = -1;
            int i9 = 0;
            while (i9 < childCount) {
                int i10 = (int) ((i9 + childCount) / 2);
                invalidateValues();
                z(i10, fD);
                boolean zD = D(getArcs(), iArr, false);
                if (zD) {
                    i9 = i10 + 1;
                    i8 = i10;
                } else {
                    childCount = i10;
                }
                z8 = zD;
            }
            if (i8 <= 0 || z8) {
                return;
            }
            invalidateValues();
            z(i8, fD);
            B(iArr);
        }

        private j[] F(List list) {
            return G((j[]) list.toArray(new j[list.size()]));
        }

        private j[] G(j[] jVarArr) {
            return new a(jVarArr).a();
        }

        private void a(List list, q qVar) {
            int i8 = 0;
            while (true) {
                Object[] objArr = qVar.keys;
                if (i8 >= ((n[]) objArr).length) {
                    return;
                }
                u(list, ((n[]) objArr)[i8], ((p[]) qVar.values)[i8], false);
                i8++;
            }
        }

        private String b(List list) {
            StringBuilder sb;
            String str = this.horizontal ? "x" : "y";
            StringBuilder sb2 = new StringBuilder();
            Iterator it = list.iterator();
            boolean z8 = true;
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (z8) {
                    z8 = false;
                } else {
                    sb2.append(", ");
                }
                n nVar = jVar.span;
                int i8 = nVar.min;
                int i9 = nVar.max;
                int i10 = jVar.value.value;
                if (i8 < i9) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i9);
                    sb.append(g5.e.STATE_NAME_NONE);
                    sb.append(str);
                    sb.append(i8);
                    sb.append(SimpleComparison.GREATER_THAN_EQUAL_TO_OPERATION);
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i8);
                    sb.append(g5.e.STATE_NAME_NONE);
                    sb.append(str);
                    sb.append(i9);
                    sb.append(SimpleComparison.LESS_THAN_EQUAL_TO_OPERATION);
                    i10 = -i10;
                }
                sb.append(i10);
                sb2.append(sb.toString());
            }
            return sb2.toString();
        }

        private int c() {
            int childCount = GridLayout.this.getChildCount();
            int iMax = -1;
            for (int i8 = 0; i8 < childCount; i8++) {
                o oVarP = GridLayout.this.p(GridLayout.this.getChildAt(i8));
                n nVar = (this.horizontal ? oVarP.columnSpec : oVarP.rowSpec).f9926b;
                iMax = Math.max(Math.max(Math.max(iMax, nVar.min), nVar.max), nVar.b());
            }
            if (iMax == -1) {
                return Integer.MIN_VALUE;
            }
            return iMax;
        }

        private float d() {
            int childCount = GridLayout.this.getChildCount();
            float f8 = 0.0f;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = GridLayout.this.getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    o oVarP = GridLayout.this.p(childAt);
                    f8 += (this.horizontal ? oVarP.columnSpec : oVarP.rowSpec).f9928d;
                }
            }
            return f8;
        }

        private void e() {
            o();
            n();
        }

        private void f() {
            for (m mVar : (m[]) this.f9897b.values) {
                mVar.d();
            }
            int childCount = GridLayout.this.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = GridLayout.this.getChildAt(i8);
                o oVarP = GridLayout.this.p(childAt);
                boolean z8 = this.horizontal;
                r rVar = z8 ? oVarP.columnSpec : oVarP.rowSpec;
                ((m) this.f9897b.getValue(i8)).c(GridLayout.this, childAt, rVar, this, GridLayout.this.t(childAt, z8) + (rVar.f9928d == 0.0f ? 0 : getDeltas()[i8]));
            }
        }

        private boolean g() {
            int childCount = GridLayout.this.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = GridLayout.this.getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    o oVarP = GridLayout.this.p(childAt);
                    if ((this.horizontal ? oVarP.columnSpec : oVarP.rowSpec).f9928d != 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private void h(q qVar, boolean z8) {
            for (p pVar : (p[]) qVar.values) {
                pVar.reset();
            }
            m[] mVarArr = (m[]) getGroupBounds().values;
            for (int i8 = 0; i8 < mVarArr.length; i8++) {
                int iE = mVarArr[i8].e(z8);
                p pVar2 = (p) qVar.getValue(i8);
                int i9 = pVar2.value;
                if (!z8) {
                    iE = -iE;
                }
                pVar2.value = Math.max(i9, iE);
            }
        }

        private void i(int[] iArr) {
            if (s()) {
                E(iArr);
            } else {
                B(iArr);
            }
            if (this.f9900e) {
                return;
            }
            int i8 = iArr[0];
            int length = iArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                iArr[i9] = iArr[i9] - i8;
            }
        }

        private void j(boolean z8) {
            int[] iArr = z8 ? this.leadingMargins : this.trailingMargins;
            int childCount = GridLayout.this.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = GridLayout.this.getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    o oVarP = GridLayout.this.p(childAt);
                    boolean z9 = this.horizontal;
                    n nVar = (z9 ? oVarP.columnSpec : oVarP.rowSpec).f9926b;
                    int i9 = z8 ? nVar.min : nVar.max;
                    iArr[i9] = Math.max(iArr[i9], GridLayout.this.r(childAt, z9, z8));
                }
            }
        }

        private j[] k() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a(arrayList, o());
            a(arrayList2, n());
            if (this.f9900e) {
                int i8 = 0;
                while (i8 < getCount()) {
                    int i9 = i8 + 1;
                    t(arrayList, new n(i8, i9), new p(0));
                    i8 = i9;
                }
            }
            int count = getCount();
            u(arrayList, new n(0, count), this.f9901f, false);
            u(arrayList2, new n(count, 0), this.f9902g, false);
            return (j[]) GridLayout.b(F(arrayList), F(arrayList2));
        }

        private q l() {
            k kVarOf = k.of(r.class, m.class);
            int childCount = GridLayout.this.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                o oVarP = GridLayout.this.p(GridLayout.this.getChildAt(i8));
                boolean z8 = this.horizontal;
                r rVar = z8 ? oVarP.columnSpec : oVarP.rowSpec;
                kVarOf.put(rVar, rVar.getAbsoluteAlignment(z8).getBounds());
            }
            return kVarOf.pack();
        }

        private q m(boolean z8) {
            k kVarOf = k.of(n.class, p.class);
            r[] rVarArr = (r[]) getGroupBounds().keys;
            int length = rVarArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                kVarOf.put(z8 ? rVarArr[i8].f9926b : rVarArr[i8].f9926b.a(), new p());
            }
            return kVarOf.pack();
        }

        private q n() {
            if (this.f9899d == null) {
                this.f9899d = m(false);
            }
            if (!this.backwardLinksValid) {
                h(this.f9899d, false);
                this.backwardLinksValid = true;
            }
            return this.f9899d;
        }

        private q o() {
            if (this.f9898c == null) {
                this.f9898c = m(true);
            }
            if (!this.forwardLinksValid) {
                h(this.f9898c, true);
                this.forwardLinksValid = true;
            }
            return this.f9898c;
        }

        private int p() {
            if (this.f9896a == Integer.MIN_VALUE) {
                this.f9896a = Math.max(0, c());
            }
            return this.f9896a;
        }

        private int q(int i8, int i9) {
            y(i8, i9);
            return A(getLocations());
        }

        private boolean s() {
            if (!this.hasWeightsValid) {
                this.hasWeights = g();
                this.hasWeightsValid = true;
            }
            return this.hasWeights;
        }

        private void t(List list, n nVar, p pVar) {
            u(list, nVar, pVar, true);
        }

        private void u(List list, n nVar, p pVar, boolean z8) {
            if (nVar.b() == 0) {
                return;
            }
            if (z8) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).span.equals(nVar)) {
                        return;
                    }
                }
            }
            list.add(new j(nVar, pVar));
        }

        private void v(int[] iArr) {
            Arrays.fill(iArr, 0);
        }

        private void w(String str, j[] jVarArr, boolean[] zArr) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i8 = 0; i8 < jVarArr.length; i8++) {
                j jVar = jVarArr[i8];
                if (zArr[i8]) {
                    arrayList.add(jVar);
                }
                if (!jVar.valid) {
                    arrayList2.add(jVar);
                }
            }
            GridLayout.this.f9889h.println(str + " constraints: " + b(arrayList) + " are inconsistent; permanently removing: " + b(arrayList2) + ". ");
        }

        private boolean x(int[] iArr, j jVar) {
            if (!jVar.valid) {
                return false;
            }
            n nVar = jVar.span;
            int i8 = nVar.min;
            int i9 = nVar.max;
            int i10 = iArr[i8] + jVar.value.value;
            if (i10 <= iArr[i9]) {
                return false;
            }
            iArr[i9] = i10;
            return true;
        }

        private void y(int i8, int i9) {
            this.f9901f.value = i8;
            this.f9902g.value = -i9;
            this.locationsValid = false;
        }

        private void z(int i8, float f8) {
            Arrays.fill(this.deltas, 0);
            int childCount = GridLayout.this.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = GridLayout.this.getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    o oVarP = GridLayout.this.p(childAt);
                    float f9 = (this.horizontal ? oVarP.columnSpec : oVarP.rowSpec).f9928d;
                    if (f9 != 0.0f) {
                        int iRound = Math.round((i8 * f9) / f8);
                        this.deltas[i9] = iRound;
                        i8 -= iRound;
                        f8 -= f9;
                    }
                }
            }
        }

        public j[] getArcs() {
            if (this.arcs == null) {
                this.arcs = k();
            }
            if (!this.arcsValid) {
                e();
                this.arcsValid = true;
            }
            return this.arcs;
        }

        public int getCount() {
            return Math.max(this.definedCount, p());
        }

        public int[] getDeltas() {
            if (this.deltas == null) {
                this.deltas = new int[GridLayout.this.getChildCount()];
            }
            return this.deltas;
        }

        public q getGroupBounds() {
            if (this.f9897b == null) {
                this.f9897b = l();
            }
            if (!this.groupBoundsValid) {
                f();
                this.groupBoundsValid = true;
            }
            return this.f9897b;
        }

        public int[] getLeadingMargins() {
            if (this.leadingMargins == null) {
                this.leadingMargins = new int[getCount() + 1];
            }
            if (!this.leadingMarginsValid) {
                j(true);
                this.leadingMarginsValid = true;
            }
            return this.leadingMargins;
        }

        public int[] getLocations() {
            if (this.locations == null) {
                this.locations = new int[getCount() + 1];
            }
            if (!this.locationsValid) {
                i(this.locations);
                this.locationsValid = true;
            }
            return this.locations;
        }

        public int getMeasure(int i8) {
            int mode = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            if (mode == Integer.MIN_VALUE) {
                return q(0, size);
            }
            if (mode == 0) {
                return q(0, 100000);
            }
            if (mode != 1073741824) {
                return 0;
            }
            return q(size, size);
        }

        public int[] getTrailingMargins() {
            if (this.trailingMargins == null) {
                this.trailingMargins = new int[getCount() + 1];
            }
            if (!this.trailingMarginsValid) {
                j(false);
                this.trailingMarginsValid = true;
            }
            return this.trailingMargins;
        }

        public void invalidateStructure() {
            this.f9896a = Integer.MIN_VALUE;
            this.f9897b = null;
            this.f9898c = null;
            this.f9899d = null;
            this.leadingMargins = null;
            this.trailingMargins = null;
            this.arcs = null;
            this.locations = null;
            this.deltas = null;
            this.hasWeightsValid = false;
            invalidateValues();
        }

        public void invalidateValues() {
            this.groupBoundsValid = false;
            this.forwardLinksValid = false;
            this.backwardLinksValid = false;
            this.leadingMarginsValid = false;
            this.trailingMarginsValid = false;
            this.arcsValid = false;
            this.locationsValid = false;
        }

        public boolean isOrderPreserved() {
            return this.f9900e;
        }

        public void layout(int i8) {
            y(i8, i8);
            getLocations();
        }

        j[][] r(j[] jVarArr) {
            int count = getCount() + 1;
            j[][] jVarArr2 = new j[count][];
            int[] iArr = new int[count];
            for (j jVar : jVarArr) {
                int i8 = jVar.span.min;
                iArr[i8] = iArr[i8] + 1;
            }
            for (int i9 = 0; i9 < count; i9++) {
                jVarArr2[i9] = new j[iArr[i9]];
            }
            Arrays.fill(iArr, 0);
            for (j jVar2 : jVarArr) {
                int i10 = jVar2.span.min;
                j[] jVarArr3 = jVarArr2[i10];
                int i11 = iArr[i10];
                iArr[i10] = i11 + 1;
                jVarArr3[i11] = jVar2;
            }
            return jVarArr2;
        }

        public void setCount(int i8) {
            if (i8 != Integer.MIN_VALUE && i8 < p()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.horizontal ? "column" : "row");
                sb.append("Count must be greater than or equal to the maximum of all grid indices ");
                sb.append("(and spans) defined in the LayoutParams of each child");
                GridLayout.v(sb.toString());
            }
            this.definedCount = i8;
        }

        public void setOrderPreserved(boolean z8) {
            this.f9900e = z8;
            invalidateStructure();
        }
    }

    static class m {
        public int after;
        public int before;
        public int flexibility;

        m() {
            d();
        }

        protected int a(GridLayout gridLayout, View view, i iVar, int i8, boolean z8) {
            return this.before - iVar.getAlignmentValue(view, i8, AbstractC0995u0.getLayoutMode(gridLayout));
        }

        protected void b(int i8, int i9) {
            this.before = Math.max(this.before, i8);
            this.after = Math.max(this.after, i9);
        }

        protected final void c(GridLayout gridLayout, View view, r rVar, l lVar, int i8) {
            this.flexibility &= rVar.c();
            int alignmentValue = rVar.getAbsoluteAlignment(lVar.horizontal).getAlignmentValue(view, i8, AbstractC0995u0.getLayoutMode(gridLayout));
            b(alignmentValue, i8 - alignmentValue);
        }

        protected void d() {
            this.before = Integer.MIN_VALUE;
            this.after = Integer.MIN_VALUE;
            this.flexibility = 2;
        }

        protected int e(boolean z8) {
            if (z8 || !GridLayout.c(this.flexibility)) {
                return this.before + this.after;
            }
            return 100000;
        }

        public String toString() {
            return "Bounds{before=" + this.before + ", after=" + this.after + '}';
        }
    }

    static final class n {
        public final int max;
        public final int min;

        public n(int i8, int i9) {
            this.min = i8;
            this.max = i9;
        }

        n a() {
            return new n(this.max, this.min);
        }

        int b() {
            return this.max - this.min;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            n nVar = (n) obj;
            return this.max == nVar.max && this.min == nVar.min;
        }

        public int hashCode() {
            return (this.min * 31) + this.max;
        }

        public String toString() {
            return "[" + this.min + ", " + this.max + "]";
        }
    }

    static final class q {
        public final int[] index;
        public final Object[] keys;
        public final Object[] values;

        q(Object[] objArr, Object[] objArr2) {
            int[] iArrB = b(objArr);
            this.index = iArrB;
            this.keys = a(objArr, iArrB);
            this.values = a(objArr2, iArrB);
        }

        private static Object[] a(Object[] objArr, int[] iArr) {
            int length = objArr.length;
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), GridLayout.z(iArr, -1) + 1);
            for (int i8 = 0; i8 < length; i8++) {
                objArr2[iArr[i8]] = objArr[i8];
            }
            return objArr2;
        }

        private static int[] b(Object[] objArr) {
            int length = objArr.length;
            int[] iArr = new int[length];
            HashMap map = new HashMap();
            for (int i8 = 0; i8 < length; i8++) {
                Object obj = objArr[i8];
                Integer numValueOf = (Integer) map.get(obj);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(map.size());
                    map.put(obj, numValueOf);
                }
                iArr[i8] = numValueOf.intValue();
            }
            return iArr;
        }

        public Object getValue(int i8) {
            return this.values[this.index[i8]];
        }
    }

    static {
        c cVar = new c();
        f9880s = cVar;
        d dVar = new d();
        f9881t = dVar;
        TOP = cVar;
        BOTTOM = dVar;
        START = cVar;
        END = dVar;
        LEFT = h(cVar, dVar);
        RIGHT = h(dVar, cVar);
        CENTER = new f();
        BASELINE = new g();
        FILL = new h();
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f9882a = new l(true);
        this.f9883b = new l(false);
        this.f9884c = 0;
        this.f9885d = false;
        this.f9886e = 1;
        this.f9888g = 0;
        this.f9889h = f9870i;
        this.f9887f = context.getResources().getDimensionPixelOffset(AbstractC5532a.default_gap);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5533b.GridLayout);
        try {
            setRowCount(typedArrayObtainStyledAttributes.getInt(f9873l, Integer.MIN_VALUE));
            setColumnCount(typedArrayObtainStyledAttributes.getInt(f9874m, Integer.MIN_VALUE));
            setOrientation(typedArrayObtainStyledAttributes.getInt(f9872k, 0));
            setUseDefaultMargins(typedArrayObtainStyledAttributes.getBoolean(f9875n, false));
            setAlignmentMode(typedArrayObtainStyledAttributes.getInt(f9876o, 1));
            setRowOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f9877p, true));
            setColumnOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f9878q, true));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void A(View view, int i8, int i9, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i8, u(view, true), i10), ViewGroup.getChildMeasureSpec(i9, u(view, false), i11));
    }

    private void B(int i8, int i9, boolean z8) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                o oVarP = p(childAt);
                if (z8) {
                    A(childAt, i8, i9, ((ViewGroup.MarginLayoutParams) oVarP).width, ((ViewGroup.MarginLayoutParams) oVarP).height);
                } else {
                    boolean z9 = this.f9884c == 0;
                    r rVar = z9 ? oVarP.columnSpec : oVarP.rowSpec;
                    if (rVar.getAbsoluteAlignment(z9) == FILL) {
                        n nVar = rVar.f9926b;
                        int[] locations = (z9 ? this.f9882a : this.f9883b).getLocations();
                        int iU = (locations[nVar.max] - locations[nVar.min]) - u(childAt, z9);
                        if (z9) {
                            A(childAt, i8, i9, iU, ((ViewGroup.MarginLayoutParams) oVarP).height);
                        } else {
                            A(childAt, i8, i9, ((ViewGroup.MarginLayoutParams) oVarP).width, iU);
                        }
                    }
                }
            }
        }
    }

    private static void C(int[] iArr, int i8, int i9, int i10) {
        int length = iArr.length;
        Arrays.fill(iArr, Math.min(i8, length), Math.min(i9, length), i10);
    }

    private static void D(o oVar, int i8, int i9, int i10, int i11) {
        oVar.d(new n(i8, i9 + i8));
        oVar.c(new n(i10, i11 + i10));
    }

    private void E() {
        boolean z8 = this.f9884c == 0;
        int i8 = (z8 ? this.f9882a : this.f9883b).definedCount;
        if (i8 == Integer.MIN_VALUE) {
            i8 = 0;
        }
        int[] iArr = new int[i8];
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            o oVar = (o) getChildAt(i11).getLayoutParams();
            r rVar = z8 ? oVar.rowSpec : oVar.columnSpec;
            n nVar = rVar.f9926b;
            boolean z9 = rVar.f9925a;
            int iB = nVar.b();
            if (z9) {
                i9 = nVar.min;
            }
            r rVar2 = z8 ? oVar.columnSpec : oVar.rowSpec;
            n nVar2 = rVar2.f9926b;
            boolean z10 = rVar2.f9925a;
            int iE = e(nVar2, z10, i8);
            if (z10) {
                i10 = nVar2.min;
            }
            if (i8 != 0) {
                if (!z9 || !z10) {
                    while (true) {
                        int i12 = i10 + iE;
                        if (i(iArr, i9, i10, i12)) {
                            break;
                        }
                        if (z10) {
                            i9++;
                        } else if (i12 <= i8) {
                            i10++;
                        } else {
                            i9++;
                            i10 = 0;
                        }
                    }
                }
                C(iArr, i10, i10 + iE, i9 + iB);
            }
            if (z8) {
                D(oVar, i9, iB, i10, iE);
            } else {
                D(oVar, i10, iE, i9, iB);
            }
            i10 += iE;
        }
    }

    static int a(int i8, int i9) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9 + i8), View.MeasureSpec.getMode(i8));
    }

    static Object[] b(Object[] objArr, Object[] objArr2) {
        Object[] objArr3 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + objArr2.length);
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        return objArr3;
    }

    static boolean c(int i8) {
        return (i8 & 2) != 0;
    }

    private void d(o oVar, boolean z8) {
        String str = z8 ? "column" : "row";
        n nVar = (z8 ? oVar.columnSpec : oVar.rowSpec).f9926b;
        int i8 = nVar.min;
        if (i8 != Integer.MIN_VALUE && i8 < 0) {
            v(str + " indices must be positive");
        }
        int i9 = (z8 ? this.f9882a : this.f9883b).definedCount;
        if (i9 != Integer.MIN_VALUE) {
            if (nVar.max > i9) {
                v(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (nVar.b() > i9) {
                v(str + " span mustn't exceed the " + str + " count");
            }
        }
    }

    private static int e(n nVar, boolean z8, int i8) {
        int iB = nVar.b();
        if (i8 == 0) {
            return iB;
        }
        return Math.min(iB, i8 - (z8 ? Math.min(nVar.min, i8) : 0));
    }

    private int f() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                iHashCode = (iHashCode * 31) + ((o) childAt.getLayoutParams()).hashCode();
            }
        }
        return iHashCode;
    }

    private void g() {
        int i8 = this.f9888g;
        if (i8 == 0) {
            E();
            this.f9888g = f();
        } else if (i8 != f()) {
            this.f9889h.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            w();
            g();
        }
    }

    private static i h(i iVar, i iVar2) {
        return new e(iVar, iVar2);
    }

    private static boolean i(int[] iArr, int i8, int i9, int i10) {
        if (i10 > iArr.length) {
            return false;
        }
        while (i9 < i10) {
            if (iArr[i9] > i8) {
                return false;
            }
            i9++;
        }
        return true;
    }

    static i l(int i8, boolean z8) {
        int i9 = (i8 & (z8 ? 7 : 112)) >> (z8 ? 0 : 4);
        return i9 != 1 ? i9 != 3 ? i9 != 5 ? i9 != 7 ? i9 != 8388611 ? i9 != 8388613 ? f9879r : END : START : FILL : z8 ? RIGHT : BOTTOM : z8 ? LEFT : TOP : CENTER;
    }

    private int m(View view, o oVar, boolean z8, boolean z9) {
        boolean z10 = false;
        if (!this.f9885d) {
            return 0;
        }
        r rVar = z8 ? oVar.columnSpec : oVar.rowSpec;
        l lVar = z8 ? this.f9882a : this.f9883b;
        n nVar = rVar.f9926b;
        if (!((z8 && y()) ? !z9 : z9) ? nVar.max == lVar.getCount() : nVar.min == 0) {
            z10 = true;
        }
        return o(view, z10, z8, z9);
    }

    private int n(View view, boolean z8, boolean z9) {
        if (view.getClass() == C5639a.class || view.getClass() == Space.class) {
            return 0;
        }
        return this.f9887f / 2;
    }

    private int o(View view, boolean z8, boolean z9, boolean z10) {
        return n(view, z9, z10);
    }

    private int q(View view, boolean z8, boolean z9) {
        if (this.f9886e == 1) {
            return r(view, z8, z9);
        }
        l lVar = z8 ? this.f9882a : this.f9883b;
        int[] leadingMargins = z9 ? lVar.getLeadingMargins() : lVar.getTrailingMargins();
        o oVarP = p(view);
        n nVar = (z8 ? oVarP.columnSpec : oVarP.rowSpec).f9926b;
        return leadingMargins[z9 ? nVar.min : nVar.max];
    }

    private int s(View view, boolean z8) {
        return z8 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    public static r spec(int i8, int i9, i iVar, float f8) {
        return new r(i8 != Integer.MIN_VALUE, i8, i9, iVar, f8);
    }

    private int u(View view, boolean z8) {
        return q(view, z8, true) + q(view, z8, false);
    }

    static void v(String str) {
        throw new IllegalArgumentException(str + ". ");
    }

    private void w() {
        this.f9888g = 0;
        l lVar = this.f9882a;
        if (lVar != null) {
            lVar.invalidateStructure();
        }
        l lVar2 = this.f9883b;
        if (lVar2 != null) {
            lVar2.invalidateStructure();
        }
        x();
    }

    private void x() {
        l lVar = this.f9882a;
        if (lVar == null || this.f9883b == null) {
            return;
        }
        lVar.invalidateValues();
        this.f9883b.invalidateValues();
    }

    private boolean y() {
        return AbstractC0985p0.getLayoutDirection(this) == 1;
    }

    static int z(int[] iArr, int i8) {
        for (int i9 : iArr) {
            i8 = Math.max(i8, i9);
        }
        return i8;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof o)) {
            return false;
        }
        o oVar = (o) layoutParams;
        d(oVar, true);
        d(oVar, false);
        return true;
    }

    public int getAlignmentMode() {
        return this.f9886e;
    }

    public int getColumnCount() {
        return this.f9882a.getCount();
    }

    public int getOrientation() {
        return this.f9884c;
    }

    public Printer getPrinter() {
        return this.f9889h;
    }

    public int getRowCount() {
        return this.f9883b.getCount();
    }

    public boolean getUseDefaultMargins() {
        return this.f9885d;
    }

    public boolean isColumnOrderPreserved() {
        return this.f9882a.isOrderPreserved();
    }

    public boolean isRowOrderPreserved() {
        return this.f9883b.isOrderPreserved();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public o generateDefaultLayoutParams() {
        return new o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o ? new o((o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o((ViewGroup.MarginLayoutParams) layoutParams) : new o(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int[] iArr;
        GridLayout gridLayout = this;
        g();
        int i12 = i10 - i8;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        gridLayout.f9882a.layout((i12 - paddingLeft) - paddingRight);
        gridLayout.f9883b.layout(((i11 - i9) - paddingTop) - paddingBottom);
        int[] locations = gridLayout.f9882a.getLocations();
        int[] locations2 = gridLayout.f9883b.getLocations();
        int childCount = getChildCount();
        boolean z9 = false;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = gridLayout.getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                iArr = locations;
            } else {
                o oVarP = gridLayout.p(childAt);
                r rVar = oVarP.columnSpec;
                r rVar2 = oVarP.rowSpec;
                n nVar = rVar.f9926b;
                n nVar2 = rVar2.f9926b;
                int i14 = locations[nVar.min];
                int i15 = locations2[nVar2.min];
                int i16 = locations[nVar.max] - i14;
                int i17 = locations2[nVar2.max] - i15;
                int iS = gridLayout.s(childAt, true);
                int iS2 = gridLayout.s(childAt, z9);
                i absoluteAlignment = rVar.getAbsoluteAlignment(true);
                i absoluteAlignment2 = rVar2.getAbsoluteAlignment(z9);
                m mVar = (m) gridLayout.f9882a.getGroupBounds().getValue(i13);
                m mVar2 = (m) gridLayout.f9883b.getGroupBounds().getValue(i13);
                iArr = locations;
                int iB = absoluteAlignment.b(childAt, i16 - mVar.e(true));
                int iB2 = absoluteAlignment2.b(childAt, i17 - mVar2.e(true));
                int iQ = gridLayout.q(childAt, true, true);
                int iQ2 = gridLayout.q(childAt, false, true);
                int iQ3 = gridLayout.q(childAt, true, false);
                int i18 = iQ + iQ3;
                int iQ4 = iQ2 + gridLayout.q(childAt, false, false);
                int iA = mVar.a(this, childAt, absoluteAlignment, iS + i18, true);
                int iA2 = mVar2.a(this, childAt, absoluteAlignment2, iS2 + iQ4, false);
                int sizeInCell = absoluteAlignment.getSizeInCell(childAt, iS, i16 - i18);
                int sizeInCell2 = absoluteAlignment2.getSizeInCell(childAt, iS2, i17 - iQ4);
                int i19 = i14 + iB + iA;
                int i20 = !y() ? paddingLeft + iQ + i19 : (((i12 - sizeInCell) - paddingRight) - iQ3) - i19;
                int i21 = paddingTop + i15 + iB2 + iA2 + iQ2;
                if (sizeInCell != childAt.getMeasuredWidth() || sizeInCell2 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(sizeInCell, 1073741824), View.MeasureSpec.makeMeasureSpec(sizeInCell2, 1073741824));
                }
                childAt.layout(i20, i21, sizeInCell + i20, sizeInCell2 + i21);
            }
            i13++;
            z9 = false;
            gridLayout = this;
            locations = iArr;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int measure;
        int measure2;
        g();
        x();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iA = a(i8, -paddingLeft);
        int iA2 = a(i9, -paddingTop);
        B(iA, iA2, true);
        if (this.f9884c == 0) {
            measure = this.f9882a.getMeasure(iA);
            B(iA, iA2, false);
            measure2 = this.f9883b.getMeasure(iA2);
        } else {
            int measure3 = this.f9883b.getMeasure(iA2);
            B(iA, iA2, false);
            measure = this.f9882a.getMeasure(iA);
            measure2 = measure3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(measure + paddingLeft, getSuggestedMinimumWidth()), i8, 0), View.resolveSizeAndState(Math.max(measure2 + paddingTop, getSuggestedMinimumHeight()), i9, 0));
    }

    final o p(View view) {
        return (o) view.getLayoutParams();
    }

    int r(View view, boolean z8, boolean z9) {
        o oVarP = p(view);
        int i8 = z8 ? z9 ? ((ViewGroup.MarginLayoutParams) oVarP).leftMargin : ((ViewGroup.MarginLayoutParams) oVarP).rightMargin : z9 ? ((ViewGroup.MarginLayoutParams) oVarP).topMargin : ((ViewGroup.MarginLayoutParams) oVarP).bottomMargin;
        return i8 == Integer.MIN_VALUE ? m(view, oVarP, z8, z9) : i8;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        w();
    }

    public void setAlignmentMode(int i8) {
        this.f9886e = i8;
        requestLayout();
    }

    public void setColumnCount(int i8) {
        this.f9882a.setCount(i8);
        w();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z8) {
        this.f9882a.setOrderPreserved(z8);
        w();
        requestLayout();
    }

    public void setOrientation(int i8) {
        if (this.f9884c != i8) {
            this.f9884c = i8;
            w();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = f9871j;
        }
        this.f9889h = printer;
    }

    public void setRowCount(int i8) {
        this.f9883b.setCount(i8);
        w();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z8) {
        this.f9883b.setOrderPreserved(z8);
        w();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z8) {
        this.f9885d = z8;
        requestLayout();
    }

    final int t(View view, boolean z8) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return s(view, z8) + u(view, z8);
    }

    static final class p {
        public int value;

        public p() {
            reset();
        }

        public void reset() {
            this.value = Integer.MIN_VALUE;
        }

        public String toString() {
            return Integer.toString(this.value);
        }

        public p(int i8) {
            this.value = i8;
        }
    }

    public static r spec(int i8, i iVar, float f8) {
        return spec(i8, 1, iVar, f8);
    }

    public static r spec(int i8, int i9, float f8) {
        return spec(i8, i9, f9879r, f8);
    }

    @Override // android.view.ViewGroup
    public o generateLayoutParams(AttributeSet attributeSet) {
        return new o(getContext(), attributeSet);
    }

    public static r spec(int i8, float f8) {
        return spec(i8, 1, f8);
    }

    public static class r {

        /* renamed from: e, reason: collision with root package name */
        static final r f9924e = GridLayout.spec(Integer.MIN_VALUE);

        /* renamed from: a, reason: collision with root package name */
        final boolean f9925a;

        /* renamed from: b, reason: collision with root package name */
        final n f9926b;

        /* renamed from: c, reason: collision with root package name */
        final i f9927c;

        /* renamed from: d, reason: collision with root package name */
        final float f9928d;

        private r(boolean z8, n nVar, i iVar, float f8) {
            this.f9925a = z8;
            this.f9926b = nVar;
            this.f9927c = iVar;
            this.f9928d = f8;
        }

        final r a(i iVar) {
            return new r(this.f9925a, this.f9926b, iVar, this.f9928d);
        }

        final r b(n nVar) {
            return new r(this.f9925a, nVar, this.f9927c, this.f9928d);
        }

        final int c() {
            return (this.f9927c == GridLayout.f9879r && this.f9928d == 0.0f) ? 0 : 2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            r rVar = (r) obj;
            return this.f9927c.equals(rVar.f9927c) && this.f9926b.equals(rVar.f9926b);
        }

        public i getAbsoluteAlignment(boolean z8) {
            i iVar = this.f9927c;
            return iVar != GridLayout.f9879r ? iVar : this.f9928d == 0.0f ? z8 ? GridLayout.START : GridLayout.BASELINE : GridLayout.FILL;
        }

        public int hashCode() {
            return (this.f9926b.hashCode() * 31) + this.f9927c.hashCode();
        }

        r(boolean z8, int i8, int i9, i iVar, float f8) {
            this(z8, new n(i8, i9 + i8), iVar, f8);
        }
    }

    public static r spec(int i8, int i9, i iVar) {
        return spec(i8, i9, iVar, 0.0f);
    }

    public static class o extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        private static final n f9910a;

        /* renamed from: b, reason: collision with root package name */
        private static final int f9911b;

        /* renamed from: c, reason: collision with root package name */
        private static final int f9912c;

        /* renamed from: d, reason: collision with root package name */
        private static final int f9913d;

        /* renamed from: e, reason: collision with root package name */
        private static final int f9914e;

        /* renamed from: f, reason: collision with root package name */
        private static final int f9915f;

        /* renamed from: g, reason: collision with root package name */
        private static final int f9916g;

        /* renamed from: h, reason: collision with root package name */
        private static final int f9917h;

        /* renamed from: i, reason: collision with root package name */
        private static final int f9918i;

        /* renamed from: j, reason: collision with root package name */
        private static final int f9919j;

        /* renamed from: k, reason: collision with root package name */
        private static final int f9920k;

        /* renamed from: l, reason: collision with root package name */
        private static final int f9921l;

        /* renamed from: m, reason: collision with root package name */
        private static final int f9922m;

        /* renamed from: n, reason: collision with root package name */
        private static final int f9923n;
        public r columnSpec;
        public r rowSpec;

        static {
            n nVar = new n(Integer.MIN_VALUE, -2147483647);
            f9910a = nVar;
            f9911b = nVar.b();
            f9912c = AbstractC5533b.GridLayout_Layout_android_layout_margin;
            f9913d = AbstractC5533b.GridLayout_Layout_android_layout_marginLeft;
            f9914e = AbstractC5533b.GridLayout_Layout_android_layout_marginTop;
            f9915f = AbstractC5533b.GridLayout_Layout_android_layout_marginRight;
            f9916g = AbstractC5533b.GridLayout_Layout_android_layout_marginBottom;
            f9917h = AbstractC5533b.GridLayout_Layout_layout_column;
            f9918i = AbstractC5533b.GridLayout_Layout_layout_columnSpan;
            f9919j = AbstractC5533b.GridLayout_Layout_layout_columnWeight;
            f9920k = AbstractC5533b.GridLayout_Layout_layout_row;
            f9921l = AbstractC5533b.GridLayout_Layout_layout_rowSpan;
            f9922m = AbstractC5533b.GridLayout_Layout_layout_rowWeight;
            f9923n = AbstractC5533b.GridLayout_Layout_layout_gravity;
        }

        private o(int i8, int i9, int i10, int i11, int i12, int i13, r rVar, r rVar2) {
            super(i8, i9);
            r rVar3 = r.f9924e;
            this.rowSpec = rVar3;
            this.columnSpec = rVar3;
            setMargins(i10, i11, i12, i13);
            this.rowSpec = rVar;
            this.columnSpec = rVar2;
        }

        private void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5533b.GridLayout_Layout);
            try {
                int i8 = typedArrayObtainStyledAttributes.getInt(f9923n, 0);
                int i9 = typedArrayObtainStyledAttributes.getInt(f9917h, Integer.MIN_VALUE);
                int i10 = f9918i;
                int i11 = f9911b;
                this.columnSpec = GridLayout.spec(i9, typedArrayObtainStyledAttributes.getInt(i10, i11), GridLayout.l(i8, true), typedArrayObtainStyledAttributes.getFloat(f9919j, 0.0f));
                this.rowSpec = GridLayout.spec(typedArrayObtainStyledAttributes.getInt(f9920k, Integer.MIN_VALUE), typedArrayObtainStyledAttributes.getInt(f9921l, i11), GridLayout.l(i8, false), typedArrayObtainStyledAttributes.getFloat(f9922m, 0.0f));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        private void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5533b.GridLayout_Layout);
            try {
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(f9912c, Integer.MIN_VALUE);
                ((ViewGroup.MarginLayoutParams) this).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f9913d, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f9914e, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f9915f, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f9916g, dimensionPixelSize);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        final void c(n nVar) {
            this.columnSpec = this.columnSpec.b(nVar);
        }

        final void d(n nVar) {
            this.rowSpec = this.rowSpec.b(nVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            o oVar = (o) obj;
            return this.columnSpec.equals(oVar.columnSpec) && this.rowSpec.equals(oVar.rowSpec);
        }

        public int hashCode() {
            return (this.rowSpec.hashCode() * 31) + this.columnSpec.hashCode();
        }

        @Override // android.view.ViewGroup.LayoutParams
        protected void setBaseAttributes(TypedArray typedArray, int i8, int i9) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i8, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i9, -2);
        }

        public void setGravity(int i8) {
            this.rowSpec = this.rowSpec.a(GridLayout.l(i8, false));
            this.columnSpec = this.columnSpec.a(GridLayout.l(i8, true));
        }

        public o(r rVar, r rVar2) {
            this(-2, -2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, rVar, rVar2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public o() {
            r rVar = r.f9924e;
            this(rVar, rVar);
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            r rVar = r.f9924e;
            this.rowSpec = rVar;
            this.columnSpec = rVar;
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            r rVar = r.f9924e;
            this.rowSpec = rVar;
            this.columnSpec = rVar;
        }

        public o(o oVar) {
            super((ViewGroup.MarginLayoutParams) oVar);
            r rVar = r.f9924e;
            this.rowSpec = rVar;
            this.columnSpec = rVar;
            this.rowSpec = oVar.rowSpec;
            this.columnSpec = oVar.columnSpec;
        }

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            r rVar = r.f9924e;
            this.rowSpec = rVar;
            this.columnSpec = rVar;
            b(context, attributeSet);
            a(context, attributeSet);
        }
    }

    public static r spec(int i8, i iVar) {
        return spec(i8, 1, iVar);
    }

    public static r spec(int i8, int i9) {
        return spec(i8, i9, f9879r);
    }

    public static r spec(int i8) {
        return spec(i8, 1);
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context) {
        this(context, null);
    }
}
