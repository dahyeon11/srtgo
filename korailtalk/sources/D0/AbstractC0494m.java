package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.view.AbstractC0985p0;
import com.kakao.sdk.user.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* renamed from: D0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0494m implements Cloneable {

    /* renamed from: H, reason: collision with root package name */
    private static final int[] f823H = {2, 1, 3, 4};

    /* renamed from: I, reason: collision with root package name */
    private static final AbstractC0488g f824I = new a();

    /* renamed from: J, reason: collision with root package name */
    private static ThreadLocal f825J = new ThreadLocal();
    public static final int MATCH_ID = 3;
    public static final int MATCH_INSTANCE = 1;
    public static final int MATCH_ITEM_ID = 4;
    public static final int MATCH_NAME = 2;

    /* renamed from: D, reason: collision with root package name */
    AbstractC0497p f829D;

    /* renamed from: E, reason: collision with root package name */
    private f f830E;

    /* renamed from: F, reason: collision with root package name */
    private O.a f831F;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList f852t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f853u;

    /* renamed from: a, reason: collision with root package name */
    private String f833a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    private long f834b = -1;

    /* renamed from: c, reason: collision with root package name */
    long f835c = -1;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f836d = null;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f837e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    ArrayList f838f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f839g = null;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f840h = null;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f841i = null;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f842j = null;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f843k = null;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f844l = null;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f845m = null;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f846n = null;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList f847o = null;

    /* renamed from: p, reason: collision with root package name */
    private u f848p = new u();

    /* renamed from: q, reason: collision with root package name */
    private u f849q = new u();

    /* renamed from: r, reason: collision with root package name */
    C0498q f850r = null;

    /* renamed from: s, reason: collision with root package name */
    private int[] f851s = f823H;

    /* renamed from: v, reason: collision with root package name */
    private ViewGroup f854v = null;

    /* renamed from: w, reason: collision with root package name */
    boolean f855w = false;

    /* renamed from: x, reason: collision with root package name */
    ArrayList f856x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    private int f857y = 0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f858z = false;

    /* renamed from: A, reason: collision with root package name */
    private boolean f826A = false;

    /* renamed from: B, reason: collision with root package name */
    private ArrayList f827B = null;

    /* renamed from: C, reason: collision with root package name */
    private ArrayList f828C = new ArrayList();

    /* renamed from: G, reason: collision with root package name */
    private AbstractC0488g f832G = f824I;

    /* renamed from: D0.m$a */
    static class a extends AbstractC0488g {
        a() {
        }

        @Override // D0.AbstractC0488g
        public Path getPath(float f8, float f9, float f10, float f11) {
            Path path = new Path();
            path.moveTo(f8, f9);
            path.lineTo(f10, f11);
            return path;
        }
    }

    /* renamed from: D0.m$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O.a f859a;

        b(O.a aVar) {
            this.f859a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f859a.remove(animator);
            AbstractC0494m.this.f856x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC0494m.this.f856x.add(animator);
        }
    }

    /* renamed from: D0.m$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0494m.this.j();
            animator.removeListener(this);
        }
    }

    /* renamed from: D0.m$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f862a;

        /* renamed from: b, reason: collision with root package name */
        String f863b;

        /* renamed from: c, reason: collision with root package name */
        t f864c;

        /* renamed from: d, reason: collision with root package name */
        S f865d;

        /* renamed from: e, reason: collision with root package name */
        AbstractC0494m f866e;

        d(View view, String str, AbstractC0494m abstractC0494m, S s8, t tVar) {
            this.f862a = view;
            this.f863b = str;
            this.f864c = tVar;
            this.f865d = s8;
            this.f866e = abstractC0494m;
        }
    }

    /* renamed from: D0.m$e */
    private static class e {
        static ArrayList a(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        static ArrayList b(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* renamed from: D0.m$f */
    public static abstract class f {
        public abstract Rect onGetEpicenter(AbstractC0494m abstractC0494m);
    }

    /* renamed from: D0.m$g */
    public interface g {
        void onTransitionCancel(AbstractC0494m abstractC0494m);

        void onTransitionEnd(AbstractC0494m abstractC0494m);

        void onTransitionPause(AbstractC0494m abstractC0494m);

        void onTransitionResume(AbstractC0494m abstractC0494m);

        void onTransitionStart(AbstractC0494m abstractC0494m);
    }

    public AbstractC0494m() {
    }

    private void B(Animator animator, O.a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            d(animator);
        }
    }

    private void a(O.a aVar, O.a aVar2) {
        for (int i8 = 0; i8 < aVar.size(); i8++) {
            t tVar = (t) aVar.valueAt(i8);
            if (s(tVar.view)) {
                this.f852t.add(tVar);
                this.f853u.add(null);
            }
        }
        for (int i9 = 0; i9 < aVar2.size(); i9++) {
            t tVar2 = (t) aVar2.valueAt(i9);
            if (s(tVar2.view)) {
                this.f853u.add(tVar2);
                this.f852t.add(null);
            }
        }
    }

    private static void b(u uVar, View view, t tVar) {
        uVar.f888a.put(view, tVar);
        int id = view.getId();
        if (id >= 0) {
            if (uVar.f889b.indexOfKey(id) >= 0) {
                uVar.f889b.put(id, null);
            } else {
                uVar.f889b.put(id, view);
            }
        }
        String transitionName = AbstractC0985p0.getTransitionName(view);
        if (transitionName != null) {
            if (uVar.f891d.containsKey(transitionName)) {
                uVar.f891d.put(transitionName, null);
            } else {
                uVar.f891d.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (uVar.f890c.indexOfKey(itemIdAtPosition) < 0) {
                    AbstractC0985p0.setHasTransientState(view, true);
                    uVar.f890c.put(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) uVar.f890c.get(itemIdAtPosition);
                if (view2 != null) {
                    AbstractC0985p0.setHasTransientState(view2, false);
                    uVar.f890c.put(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean c(int[] iArr, int i8) {
        int i9 = iArr[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            if (iArr[i10] == i9) {
                return true;
            }
        }
        return false;
    }

    private void e(View view, boolean z8) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f841i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f842j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f843k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        if (((Class) this.f843k.get(i8)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    t tVar = new t(view);
                    if (z8) {
                        captureStartValues(tVar);
                    } else {
                        captureEndValues(tVar);
                    }
                    tVar.f887a.add(this);
                    f(tVar);
                    if (z8) {
                        b(this.f848p, view, tVar);
                    } else {
                        b(this.f849q, view, tVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f845m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f846n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f847o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i9 = 0; i9 < size2; i9++) {
                                    if (((Class) this.f847o.get(i9)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                                e(viewGroup.getChildAt(i10), z8);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList k(ArrayList arrayList, int i8, boolean z8) {
        return i8 > 0 ? z8 ? e.a(arrayList, Integer.valueOf(i8)) : e.b(arrayList, Integer.valueOf(i8)) : arrayList;
    }

    private static ArrayList l(ArrayList arrayList, Object obj, boolean z8) {
        return obj != null ? z8 ? e.a(arrayList, obj) : e.b(arrayList, obj) : arrayList;
    }

    private ArrayList m(ArrayList arrayList, Class cls, boolean z8) {
        return cls != null ? z8 ? e.a(arrayList, cls) : e.b(arrayList, cls) : arrayList;
    }

    private ArrayList n(ArrayList arrayList, View view, boolean z8) {
        return view != null ? z8 ? e.a(arrayList, view) : e.b(arrayList, view) : arrayList;
    }

    private static O.a q() {
        O.a aVar = (O.a) f825J.get();
        if (aVar != null) {
            return aVar;
        }
        O.a aVar2 = new O.a();
        f825J.set(aVar2);
        return aVar2;
    }

    private static boolean r(int i8) {
        return i8 >= 1 && i8 <= 4;
    }

    private static boolean t(t tVar, t tVar2, String str) {
        Object obj = tVar.values.get(str);
        Object obj2 = tVar2.values.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void u(O.a aVar, O.a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) sparseArray.valueAt(i8);
            if (view2 != null && s(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i8))) != null && s(view)) {
                t tVar = (t) aVar.get(view2);
                t tVar2 = (t) aVar2.get(view);
                if (tVar != null && tVar2 != null) {
                    this.f852t.add(tVar);
                    this.f853u.add(tVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void v(O.a aVar, O.a aVar2) {
        t tVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.keyAt(size);
            if (view != null && s(view) && (tVar = (t) aVar2.remove(view)) != null && s(tVar.view)) {
                this.f852t.add((t) aVar.removeAt(size));
                this.f853u.add(tVar);
            }
        }
    }

    private void w(O.a aVar, O.a aVar2, O.e eVar, O.e eVar2) {
        View view;
        int size = eVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) eVar.valueAt(i8);
            if (view2 != null && s(view2) && (view = (View) eVar2.get(eVar.keyAt(i8))) != null && s(view)) {
                t tVar = (t) aVar.get(view2);
                t tVar2 = (t) aVar2.get(view);
                if (tVar != null && tVar2 != null) {
                    this.f852t.add(tVar);
                    this.f853u.add(tVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void x(O.a aVar, O.a aVar2, O.a aVar3, O.a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) aVar3.valueAt(i8);
            if (view2 != null && s(view2) && (view = (View) aVar4.get(aVar3.keyAt(i8))) != null && s(view)) {
                t tVar = (t) aVar.get(view2);
                t tVar2 = (t) aVar2.get(view);
                if (tVar != null && tVar2 != null) {
                    this.f852t.add(tVar);
                    this.f853u.add(tVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void y(u uVar, u uVar2) {
        O.a aVar = new O.a(uVar.f888a);
        O.a aVar2 = new O.a(uVar2.f888a);
        int i8 = 0;
        while (true) {
            int[] iArr = this.f851s;
            if (i8 >= iArr.length) {
                a(aVar, aVar2);
                return;
            }
            int i9 = iArr[i8];
            if (i9 == 1) {
                v(aVar, aVar2);
            } else if (i9 == 2) {
                x(aVar, aVar2, uVar.f891d, uVar2.f891d);
            } else if (i9 == 3) {
                u(aVar, aVar2, uVar.f889b, uVar2.f889b);
            } else if (i9 == 4) {
                w(aVar, aVar2, uVar.f890c, uVar2.f890c);
            }
            i8++;
        }
    }

    private static int[] z(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i8 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if (Constants.ID.equalsIgnoreCase(strTrim)) {
                iArr[i8] = 3;
            } else if ("instance".equalsIgnoreCase(strTrim)) {
                iArr[i8] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i8] = 2;
            } else if ("itemId".equalsIgnoreCase(strTrim)) {
                iArr[i8] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i8);
                i8--;
                iArr = iArr2;
            }
            i8++;
        }
        return iArr;
    }

    void A(ViewGroup viewGroup) {
        d dVar;
        this.f852t = new ArrayList();
        this.f853u = new ArrayList();
        y(this.f848p, this.f849q);
        O.a aVarQ = q();
        int size = aVarQ.size();
        S sD = B.d(viewGroup);
        for (int i8 = size - 1; i8 >= 0; i8--) {
            Animator animator = (Animator) aVarQ.keyAt(i8);
            if (animator != null && (dVar = (d) aVarQ.get(animator)) != null && dVar.f862a != null && sD.equals(dVar.f865d)) {
                t tVar = dVar.f864c;
                View view = dVar.f862a;
                t transitionValues = getTransitionValues(view, true);
                t tVarP = p(view, true);
                if (transitionValues == null && tVarP == null) {
                    tVarP = (t) this.f849q.f888a.get(view);
                }
                if ((transitionValues != null || tVarP != null) && dVar.f866e.isTransitionRequired(tVar, tVarP)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        aVarQ.remove(animator);
                    }
                }
            }
        }
        i(viewGroup, this.f848p, this.f849q, this.f852t, this.f853u);
        C();
    }

    protected void C() {
        F();
        O.a aVarQ = q();
        Iterator it = this.f828C.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (aVarQ.containsKey(animator)) {
                F();
                B(animator, aVarQ);
            }
        }
        this.f828C.clear();
        j();
    }

    void D(boolean z8) {
        this.f855w = z8;
    }

    AbstractC0494m E(ViewGroup viewGroup) {
        this.f854v = viewGroup;
        return this;
    }

    protected void F() {
        if (this.f857y == 0) {
            ArrayList arrayList = this.f827B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f827B.clone();
                int size = arrayList2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((g) arrayList2.get(i8)).onTransitionStart(this);
                }
            }
            this.f826A = false;
        }
        this.f857y++;
    }

    String G(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f835c != -1) {
            str2 = str2 + "dur(" + this.f835c + ") ";
        }
        if (this.f834b != -1) {
            str2 = str2 + "dly(" + this.f834b + ") ";
        }
        if (this.f836d != null) {
            str2 = str2 + "interp(" + this.f836d + ") ";
        }
        if (this.f837e.size() <= 0 && this.f838f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f837e.size() > 0) {
            for (int i8 = 0; i8 < this.f837e.size(); i8++) {
                if (i8 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f837e.get(i8);
            }
        }
        if (this.f838f.size() > 0) {
            for (int i9 = 0; i9 < this.f838f.size(); i9++) {
                if (i9 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f838f.get(i9);
            }
        }
        return str3 + ")";
    }

    public AbstractC0494m addListener(g gVar) {
        if (this.f827B == null) {
            this.f827B = new ArrayList();
        }
        this.f827B.add(gVar);
        return this;
    }

    public AbstractC0494m addTarget(View view) {
        this.f838f.add(view);
        return this;
    }

    protected void cancel() {
        for (int size = this.f856x.size() - 1; size >= 0; size--) {
            ((Animator) this.f856x.get(size)).cancel();
        }
        ArrayList arrayList = this.f827B;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f827B.clone();
        int size2 = arrayList2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((g) arrayList2.get(i8)).onTransitionCancel(this);
        }
    }

    public abstract void captureEndValues(t tVar);

    public abstract void captureStartValues(t tVar);

    public Animator createAnimator(ViewGroup viewGroup, t tVar, t tVar2) {
        return null;
    }

    protected void d(Animator animator) {
        if (animator == null) {
            j();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new c());
        animator.start();
    }

    public AbstractC0494m excludeChildren(View view, boolean z8) {
        this.f846n = n(this.f846n, view, z8);
        return this;
    }

    public AbstractC0494m excludeTarget(View view, boolean z8) {
        this.f842j = n(this.f842j, view, z8);
        return this;
    }

    void f(t tVar) {
        String[] propagationProperties;
        if (this.f829D == null || tVar.values.isEmpty() || (propagationProperties = this.f829D.getPropagationProperties()) == null) {
            return;
        }
        for (String str : propagationProperties) {
            if (!tVar.values.containsKey(str)) {
                this.f829D.captureValues(tVar);
                return;
            }
        }
    }

    void g(ViewGroup viewGroup, boolean z8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        O.a aVar;
        h(z8);
        if ((this.f837e.size() > 0 || this.f838f.size() > 0) && (((arrayList = this.f839g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f840h) == null || arrayList2.isEmpty()))) {
            for (int i8 = 0; i8 < this.f837e.size(); i8++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f837e.get(i8)).intValue());
                if (viewFindViewById != null) {
                    t tVar = new t(viewFindViewById);
                    if (z8) {
                        captureStartValues(tVar);
                    } else {
                        captureEndValues(tVar);
                    }
                    tVar.f887a.add(this);
                    f(tVar);
                    if (z8) {
                        b(this.f848p, viewFindViewById, tVar);
                    } else {
                        b(this.f849q, viewFindViewById, tVar);
                    }
                }
            }
            for (int i9 = 0; i9 < this.f838f.size(); i9++) {
                View view = (View) this.f838f.get(i9);
                t tVar2 = new t(view);
                if (z8) {
                    captureStartValues(tVar2);
                } else {
                    captureEndValues(tVar2);
                }
                tVar2.f887a.add(this);
                f(tVar2);
                if (z8) {
                    b(this.f848p, view, tVar2);
                } else {
                    b(this.f849q, view, tVar2);
                }
            }
        } else {
            e(viewGroup, z8);
        }
        if (z8 || (aVar = this.f831F) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList3.add(this.f848p.f891d.remove((String) this.f831F.keyAt(i10)));
        }
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = (View) arrayList3.get(i11);
            if (view2 != null) {
                this.f848p.f891d.put((String) this.f831F.valueAt(i11), view2);
            }
        }
    }

    public long getDuration() {
        return this.f835c;
    }

    public Rect getEpicenter() {
        f fVar = this.f830E;
        if (fVar == null) {
            return null;
        }
        return fVar.onGetEpicenter(this);
    }

    public f getEpicenterCallback() {
        return this.f830E;
    }

    public TimeInterpolator getInterpolator() {
        return this.f836d;
    }

    public String getName() {
        return this.f833a;
    }

    public AbstractC0488g getPathMotion() {
        return this.f832G;
    }

    public AbstractC0497p getPropagation() {
        return this.f829D;
    }

    public long getStartDelay() {
        return this.f834b;
    }

    public List<Integer> getTargetIds() {
        return this.f837e;
    }

    public List<String> getTargetNames() {
        return this.f839g;
    }

    public List<Class<?>> getTargetTypes() {
        return this.f840h;
    }

    public List<View> getTargets() {
        return this.f838f;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public t getTransitionValues(View view, boolean z8) {
        C0498q c0498q = this.f850r;
        if (c0498q != null) {
            return c0498q.getTransitionValues(view, z8);
        }
        return (t) (z8 ? this.f848p : this.f849q).f888a.get(view);
    }

    void h(boolean z8) {
        if (z8) {
            this.f848p.f888a.clear();
            this.f848p.f889b.clear();
            this.f848p.f890c.clear();
        } else {
            this.f849q.f888a.clear();
            this.f849q.f889b.clear();
            this.f849q.f890c.clear();
        }
    }

    protected void i(ViewGroup viewGroup, u uVar, u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorCreateAnimator;
        int i8;
        View view;
        Animator animator;
        t tVar;
        Animator animator2;
        t tVar2;
        O.a aVarQ = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i9 = 0;
        while (i9 < size) {
            t tVar3 = (t) arrayList.get(i9);
            t tVar4 = (t) arrayList2.get(i9);
            if (tVar3 != null && !tVar3.f887a.contains(this)) {
                tVar3 = null;
            }
            if (tVar4 != null && !tVar4.f887a.contains(this)) {
                tVar4 = null;
            }
            if (!(tVar3 == null && tVar4 == null) && ((tVar3 == null || tVar4 == null || isTransitionRequired(tVar3, tVar4)) && (animatorCreateAnimator = createAnimator(viewGroup, tVar3, tVar4)) != null)) {
                if (tVar4 != null) {
                    view = tVar4.view;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        tVar2 = new t(view);
                        i8 = size;
                        t tVar5 = (t) uVar2.f888a.get(view);
                        if (tVar5 != null) {
                            int i10 = 0;
                            while (i10 < transitionProperties.length) {
                                Map<String, Object> map = tVar2.values;
                                String str = transitionProperties[i10];
                                map.put(str, tVar5.values.get(str));
                                i10++;
                                transitionProperties = transitionProperties;
                            }
                        }
                        int size2 = aVarQ.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size2) {
                                animator2 = animatorCreateAnimator;
                                break;
                            }
                            d dVar = (d) aVarQ.get((Animator) aVarQ.keyAt(i11));
                            if (dVar.f864c != null && dVar.f862a == view && dVar.f863b.equals(getName()) && dVar.f864c.equals(tVar2)) {
                                animator2 = null;
                                break;
                            }
                            i11++;
                        }
                    } else {
                        i8 = size;
                        animator2 = animatorCreateAnimator;
                        tVar2 = null;
                    }
                    animator = animator2;
                    tVar = tVar2;
                } else {
                    i8 = size;
                    view = tVar3.view;
                    animator = animatorCreateAnimator;
                    tVar = null;
                }
                if (animator != null) {
                    AbstractC0497p abstractC0497p = this.f829D;
                    if (abstractC0497p != null) {
                        long startDelay = abstractC0497p.getStartDelay(viewGroup, this, tVar3, tVar4);
                        sparseIntArray.put(this.f828C.size(), (int) startDelay);
                        jMin = Math.min(startDelay, jMin);
                    }
                    aVarQ.put(animator, new d(view, getName(), this, B.d(viewGroup), tVar));
                    this.f828C.add(animator);
                    jMin = jMin;
                }
            } else {
                i8 = size;
            }
            i9++;
            size = i8;
        }
        if (sparseIntArray.size() != 0) {
            for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                Animator animator3 = (Animator) this.f828C.get(sparseIntArray.keyAt(i12));
                animator3.setStartDelay((sparseIntArray.valueAt(i12) - jMin) + animator3.getStartDelay());
            }
        }
    }

    public boolean isTransitionRequired(t tVar, t tVar2) {
        if (tVar == null || tVar2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties == null) {
            Iterator<String> it = tVar.values.keySet().iterator();
            while (it.hasNext()) {
                if (t(tVar, tVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : transitionProperties) {
            if (!t(tVar, tVar2, str)) {
            }
        }
        return false;
        return true;
    }

    protected void j() {
        int i8 = this.f857y - 1;
        this.f857y = i8;
        if (i8 == 0) {
            ArrayList arrayList = this.f827B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f827B.clone();
                int size = arrayList2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((g) arrayList2.get(i9)).onTransitionEnd(this);
                }
            }
            for (int i10 = 0; i10 < this.f848p.f890c.size(); i10++) {
                View view = (View) this.f848p.f890c.valueAt(i10);
                if (view != null) {
                    AbstractC0985p0.setHasTransientState(view, false);
                }
            }
            for (int i11 = 0; i11 < this.f849q.f890c.size(); i11++) {
                View view2 = (View) this.f849q.f890c.valueAt(i11);
                if (view2 != null) {
                    AbstractC0985p0.setHasTransientState(view2, false);
                }
            }
            this.f826A = true;
        }
    }

    void o(ViewGroup viewGroup) {
        O.a aVarQ = q();
        int size = aVarQ.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        S sD = B.d(viewGroup);
        O.a aVar = new O.a(aVarQ);
        aVarQ.clear();
        for (int i8 = size - 1; i8 >= 0; i8--) {
            d dVar = (d) aVar.valueAt(i8);
            if (dVar.f862a != null && sD != null && sD.equals(dVar.f865d)) {
                ((Animator) aVar.keyAt(i8)).end();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f853u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f852t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (D0.t) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    D0.t p(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            D0.q r0 = r5.f850r
            if (r0 == 0) goto L9
            D0.t r6 = r0.p(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f852t
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f853u
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            D0.t r4 = (D0.t) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.view
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f853u
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f852t
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            D0.t r1 = (D0.t) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.AbstractC0494m.p(android.view.View, boolean):D0.t");
    }

    public void pause(View view) {
        if (this.f826A) {
            return;
        }
        O.a aVarQ = q();
        int size = aVarQ.size();
        S sD = B.d(view);
        for (int i8 = size - 1; i8 >= 0; i8--) {
            d dVar = (d) aVarQ.valueAt(i8);
            if (dVar.f862a != null && sD.equals(dVar.f865d)) {
                AbstractC0482a.b((Animator) aVarQ.keyAt(i8));
            }
        }
        ArrayList arrayList = this.f827B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f827B.clone();
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                ((g) arrayList2.get(i9)).onTransitionPause(this);
            }
        }
        this.f858z = true;
    }

    public AbstractC0494m removeListener(g gVar) {
        ArrayList arrayList = this.f827B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(gVar);
        if (this.f827B.size() == 0) {
            this.f827B = null;
        }
        return this;
    }

    public AbstractC0494m removeTarget(View view) {
        this.f838f.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.f858z) {
            if (!this.f826A) {
                O.a aVarQ = q();
                int size = aVarQ.size();
                S sD = B.d(view);
                for (int i8 = size - 1; i8 >= 0; i8--) {
                    d dVar = (d) aVarQ.valueAt(i8);
                    if (dVar.f862a != null && sD.equals(dVar.f865d)) {
                        AbstractC0482a.c((Animator) aVarQ.keyAt(i8));
                    }
                }
                ArrayList arrayList = this.f827B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f827B.clone();
                    int size2 = arrayList2.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        ((g) arrayList2.get(i9)).onTransitionResume(this);
                    }
                }
            }
            this.f858z = false;
        }
    }

    boolean s(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f841i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f842j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f843k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (((Class) this.f843k.get(i8)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f844l != null && AbstractC0985p0.getTransitionName(view) != null && this.f844l.contains(AbstractC0985p0.getTransitionName(view))) {
            return false;
        }
        if ((this.f837e.size() == 0 && this.f838f.size() == 0 && (((arrayList = this.f840h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f839g) == null || arrayList2.isEmpty()))) || this.f837e.contains(Integer.valueOf(id)) || this.f838f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f839g;
        if (arrayList6 != null && arrayList6.contains(AbstractC0985p0.getTransitionName(view))) {
            return true;
        }
        if (this.f840h != null) {
            for (int i9 = 0; i9 < this.f840h.size(); i9++) {
                if (((Class) this.f840h.get(i9)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public AbstractC0494m setDuration(long j8) {
        this.f835c = j8;
        return this;
    }

    public void setEpicenterCallback(f fVar) {
        this.f830E = fVar;
    }

    public AbstractC0494m setInterpolator(TimeInterpolator timeInterpolator) {
        this.f836d = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f851s = f823H;
            return;
        }
        for (int i8 = 0; i8 < iArr.length; i8++) {
            if (!r(iArr[i8])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (c(iArr, i8)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f851s = (int[]) iArr.clone();
    }

    public void setPathMotion(AbstractC0488g abstractC0488g) {
        if (abstractC0488g == null) {
            this.f832G = f824I;
        } else {
            this.f832G = abstractC0488g;
        }
    }

    public void setPropagation(AbstractC0497p abstractC0497p) {
        this.f829D = abstractC0497p;
    }

    public AbstractC0494m setStartDelay(long j8) {
        this.f834b = j8;
        return this;
    }

    public String toString() {
        return G("");
    }

    public AbstractC0494m addTarget(int i8) {
        if (i8 != 0) {
            this.f837e.add(Integer.valueOf(i8));
        }
        return this;
    }

    @Override // 
    /* renamed from: clone */
    public AbstractC0494m mo6clone() {
        try {
            AbstractC0494m abstractC0494m = (AbstractC0494m) super.clone();
            abstractC0494m.f828C = new ArrayList();
            abstractC0494m.f848p = new u();
            abstractC0494m.f849q = new u();
            abstractC0494m.f852t = null;
            abstractC0494m.f853u = null;
            return abstractC0494m;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public AbstractC0494m excludeChildren(int i8, boolean z8) {
        this.f845m = k(this.f845m, i8, z8);
        return this;
    }

    public AbstractC0494m excludeTarget(int i8, boolean z8) {
        this.f841i = k(this.f841i, i8, z8);
        return this;
    }

    public AbstractC0494m removeTarget(int i8) {
        if (i8 != 0) {
            this.f837e.remove(Integer.valueOf(i8));
        }
        return this;
    }

    public AbstractC0494m addTarget(String str) {
        if (this.f839g == null) {
            this.f839g = new ArrayList();
        }
        this.f839g.add(str);
        return this;
    }

    public AbstractC0494m excludeChildren(Class<?> cls, boolean z8) {
        this.f847o = m(this.f847o, cls, z8);
        return this;
    }

    public AbstractC0494m excludeTarget(String str, boolean z8) {
        this.f844l = l(this.f844l, str, z8);
        return this;
    }

    public AbstractC0494m removeTarget(String str) {
        ArrayList arrayList = this.f839g;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public AbstractC0494m excludeTarget(Class<?> cls, boolean z8) {
        this.f843k = m(this.f843k, cls, z8);
        return this;
    }

    public AbstractC0494m removeTarget(Class<?> cls) {
        ArrayList arrayList = this.f840h;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public AbstractC0494m addTarget(Class<?> cls) {
        if (this.f840h == null) {
            this.f840h = new ArrayList();
        }
        this.f840h.add(cls);
        return this;
    }

    public AbstractC0494m(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0493l.f814c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long namedInt = androidx.core.content.res.k.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (namedInt >= 0) {
            setDuration(namedInt);
        }
        long namedInt2 = androidx.core.content.res.k.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (namedInt2 > 0) {
            setStartDelay(namedInt2);
        }
        int namedResourceId = androidx.core.content.res.k.getNamedResourceId(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, namedResourceId));
        }
        String namedString = androidx.core.content.res.k.getNamedString(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (namedString != null) {
            setMatchOrder(z(namedString));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
