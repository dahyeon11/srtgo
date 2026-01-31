package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.r;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.kakao.sdk.user.Constants;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class t {
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    public static final String TAG = "MotionScene";
    public static final int UNSET = -1;

    /* renamed from: a, reason: collision with root package name */
    private final r f8409a;

    /* renamed from: n, reason: collision with root package name */
    private MotionEvent f8422n;

    /* renamed from: q, reason: collision with root package name */
    private r.f f8425q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8426r;

    /* renamed from: s, reason: collision with root package name */
    float f8427s;

    /* renamed from: t, reason: collision with root package name */
    float f8428t;

    /* renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.widget.j f8410b = null;

    /* renamed from: c, reason: collision with root package name */
    b f8411c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8412d = false;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f8413e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private b f8414f = null;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f8415g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private SparseArray f8416h = new SparseArray();

    /* renamed from: i, reason: collision with root package name */
    private HashMap f8417i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private SparseIntArray f8418j = new SparseIntArray();

    /* renamed from: k, reason: collision with root package name */
    private boolean f8419k = false;

    /* renamed from: l, reason: collision with root package name */
    private int f8420l = 400;

    /* renamed from: m, reason: collision with root package name */
    private int f8421m = 0;

    /* renamed from: o, reason: collision with root package name */
    private boolean f8423o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8424p = false;

    class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P.c f8429a;

        a(P.c cVar) {
            this.f8429a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return (float) this.f8429a.get(f8);
        }
    }

    public t(r rVar) {
        this.f8409a = rVar;
    }

    private void A(int i8) {
        int i9 = this.f8418j.get(i8);
        if (i9 > 0) {
            A(this.f8418j.get(i8));
            androidx.constraintlayout.widget.d dVar = (androidx.constraintlayout.widget.d) this.f8416h.get(i8);
            androidx.constraintlayout.widget.d dVar2 = (androidx.constraintlayout.widget.d) this.f8416h.get(i9);
            if (dVar2 != null) {
                dVar.readFallback(dVar2);
                this.f8418j.put(i8, -1);
            } else {
                Log.e(TAG, "ERROR! invalid deriveConstraintsFrom: @id/" + androidx.constraintlayout.motion.widget.b.getName(this.f8409a.getContext(), i9));
            }
        }
    }

    private int i(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), Constants.ID, context.getPackageName());
            if (this.f8419k) {
                System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e(TAG, "error in parsing id");
        return identifier;
    }

    private int j(b bVar) {
        int i8 = bVar.f8431a;
        if (i8 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i9 = 0; i9 < this.f8413e.size(); i9++) {
            if (((b) this.f8413e.get(i9)).f8431a == i8) {
                return i9;
            }
        }
        return -1;
    }

    private int p(int i8) {
        int iStateGetConstraintID;
        androidx.constraintlayout.widget.j jVar = this.f8410b;
        return (jVar == null || (iStateGetConstraintID = jVar.stateGetConstraintID(i8, -1, -1)) == -1) ? i8 : iStateGetConstraintID;
    }

    private boolean r(int i8) {
        int i9 = this.f8418j.get(i8);
        int size = this.f8418j.size();
        while (i9 > 0) {
            if (i9 == i8) {
                return true;
            }
            int i10 = size - 1;
            if (size < 0) {
                return true;
            }
            i9 = this.f8418j.get(i9);
            size = i10;
        }
        return false;
    }

    public static String stripID(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    private boolean t() {
        return this.f8425q != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void u(android.content.Context r9, int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.t.u(android.content.Context, int):void");
    }

    private void v(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.setForceId(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (this.f8419k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            if (attributeName.equals("deriveConstraintsFrom")) {
                i9 = i(context, attributeValue);
            } else if (attributeName.equals(Constants.ID)) {
                i8 = i(context, attributeValue);
                this.f8417i.put(stripID(attributeValue), Integer.valueOf(i8));
            }
        }
        if (i8 != -1) {
            if (this.f8409a.f8317V != 0) {
                dVar.setValidateOnParse(true);
            }
            dVar.load(context, xmlPullParser);
            if (i9 != -1) {
                this.f8418j.put(i8, i9);
            }
            this.f8416h.put(i8, dVar);
        }
    }

    private void w(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i8);
            if (index == androidx.constraintlayout.widget.i.MotionScene_defaultDuration) {
                this.f8420l = typedArrayObtainStyledAttributes.getInt(index, this.f8420l);
            } else if (index == androidx.constraintlayout.widget.i.MotionScene_layoutDuringTransition) {
                this.f8421m = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    void B(r rVar) {
        for (int i8 = 0; i8 < this.f8416h.size(); i8++) {
            int iKeyAt = this.f8416h.keyAt(i8);
            if (r(iKeyAt)) {
                Log.e(TAG, "Cannot be derived from yourself");
                return;
            }
            A(iKeyAt);
        }
        for (int i9 = 0; i9 < this.f8416h.size(); i9++) {
            ((androidx.constraintlayout.widget.d) this.f8416h.valueAt(i9)).readFallback(rVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void C(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.j r0 = r6.f8410b
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.stateGetConstraintID(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.j r2 = r6.f8410b
            int r2 = r2.stateGetConstraintID(r8, r1, r1)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r8
            goto L1a
        L18:
            r0 = r7
            goto L16
        L1a:
            java.util.ArrayList r3 = r6.f8413e
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.t$b r4 = (androidx.constraintlayout.motion.widget.t.b) r4
            int r5 = androidx.constraintlayout.motion.widget.t.b.a(r4)
            if (r5 != r2) goto L38
            int r5 = androidx.constraintlayout.motion.widget.t.b.c(r4)
            if (r5 == r0) goto L44
        L38:
            int r5 = androidx.constraintlayout.motion.widget.t.b.a(r4)
            if (r5 != r8) goto L20
            int r5 = androidx.constraintlayout.motion.widget.t.b.c(r4)
            if (r5 != r7) goto L20
        L44:
            r6.f8411c = r4
            if (r4 == 0) goto L59
            androidx.constraintlayout.motion.widget.x r7 = androidx.constraintlayout.motion.widget.t.b.m(r4)
            if (r7 == 0) goto L59
            androidx.constraintlayout.motion.widget.t$b r7 = r6.f8411c
            androidx.constraintlayout.motion.widget.x r7 = androidx.constraintlayout.motion.widget.t.b.m(r7)
            boolean r8 = r6.f8426r
            r7.setRTL(r8)
        L59:
            return
        L5a:
            androidx.constraintlayout.motion.widget.t$b r7 = r6.f8414f
            java.util.ArrayList r3 = r6.f8415g
            java.util.Iterator r3 = r3.iterator()
        L62:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.t$b r4 = (androidx.constraintlayout.motion.widget.t.b) r4
            int r5 = androidx.constraintlayout.motion.widget.t.b.a(r4)
            if (r5 != r8) goto L62
            r7 = r4
            goto L62
        L76:
            androidx.constraintlayout.motion.widget.t$b r8 = new androidx.constraintlayout.motion.widget.t$b
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.t.b.d(r8, r0)
            androidx.constraintlayout.motion.widget.t.b.b(r8, r2)
            if (r0 == r1) goto L88
            java.util.ArrayList r7 = r6.f8413e
            r7.add(r8)
        L88:
            r6.f8411c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.t.C(int, int):void");
    }

    void D() {
        b bVar = this.f8411c;
        if (bVar == null || bVar.f8442l == null) {
            return;
        }
        this.f8411c.f8442l.o();
    }

    boolean E() {
        Iterator it = this.f8413e.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f8442l != null) {
                return true;
            }
        }
        b bVar = this.f8411c;
        return (bVar == null || bVar.f8442l == null) ? false : true;
    }

    public void addOnClickListeners(r rVar, int i8) {
        Iterator it = this.f8413e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f8443m.size() > 0) {
                Iterator it2 = bVar.f8443m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).removeOnClickListeners(rVar);
                }
            }
        }
        Iterator it3 = this.f8415g.iterator();
        while (it3.hasNext()) {
            b bVar2 = (b) it3.next();
            if (bVar2.f8443m.size() > 0) {
                Iterator it4 = bVar2.f8443m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).removeOnClickListeners(rVar);
                }
            }
        }
        Iterator it5 = this.f8413e.iterator();
        while (it5.hasNext()) {
            b bVar3 = (b) it5.next();
            if (bVar3.f8443m.size() > 0) {
                Iterator it6 = bVar3.f8443m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).addOnClickListeners(rVar, i8, bVar3);
                }
            }
        }
        Iterator it7 = this.f8415g.iterator();
        while (it7.hasNext()) {
            b bVar4 = (b) it7.next();
            if (bVar4.f8443m.size() > 0) {
                Iterator it8 = bVar4.f8443m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).addOnClickListeners(rVar, i8, bVar4);
                }
            }
        }
    }

    public void addTransition(b bVar) {
        int iJ = j(bVar);
        if (iJ == -1) {
            this.f8413e.add(bVar);
        } else {
            this.f8413e.set(iJ, bVar);
        }
    }

    public b bestTransitionFor(int i8, float f8, float f9, MotionEvent motionEvent) {
        if (i8 == -1) {
            return this.f8411c;
        }
        List<b> transitionsWithState = getTransitionsWithState(i8);
        RectF rectF = new RectF();
        float f10 = 0.0f;
        b bVar = null;
        for (b bVar2 : transitionsWithState) {
            if (!bVar2.f8445o && bVar2.f8442l != null) {
                bVar2.f8442l.setRTL(this.f8426r);
                RectF rectFH = bVar2.f8442l.h(this.f8409a, rectF);
                if (rectFH == null || motionEvent == null || rectFH.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFH2 = bVar2.f8442l.h(this.f8409a, rectF);
                    if (rectFH2 == null || motionEvent == null || rectFH2.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fA = bVar2.f8442l.a(f8, f9) * (bVar2.f8433c == i8 ? -1.0f : 1.1f);
                        if (fA > f10) {
                            bVar = bVar2;
                            f10 = fA;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public void disableAutoTransition(boolean z8) {
        this.f8412d = z8;
    }

    boolean e(r rVar, int i8) throws NumberFormatException {
        if (t() || this.f8412d) {
            return false;
        }
        Iterator it = this.f8413e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f8444n != 0 && this.f8411c != bVar) {
                if (i8 == bVar.f8434d && (bVar.f8444n == 4 || bVar.f8444n == 2)) {
                    r.j jVar = r.j.FINISHED;
                    rVar.setState(jVar);
                    rVar.setTransition(bVar);
                    if (bVar.f8444n == 4) {
                        rVar.transitionToEnd();
                        rVar.setState(r.j.SETUP);
                        rVar.setState(r.j.MOVING);
                    } else {
                        rVar.setProgress(1.0f);
                        rVar.P(true);
                        rVar.setState(r.j.SETUP);
                        rVar.setState(r.j.MOVING);
                        rVar.setState(jVar);
                        rVar.Z();
                    }
                    return true;
                }
                if (i8 == bVar.f8433c && (bVar.f8444n == 3 || bVar.f8444n == 1)) {
                    r.j jVar2 = r.j.FINISHED;
                    rVar.setState(jVar2);
                    rVar.setTransition(bVar);
                    if (bVar.f8444n == 3) {
                        rVar.transitionToStart();
                        rVar.setState(r.j.SETUP);
                        rVar.setState(r.j.MOVING);
                    } else {
                        rVar.setProgress(0.0f);
                        rVar.P(true);
                        rVar.setState(r.j.SETUP);
                        rVar.setState(r.j.MOVING);
                        rVar.setState(jVar2);
                        rVar.Z();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    androidx.constraintlayout.widget.d f(int i8) {
        return g(i8, -1, -1);
    }

    androidx.constraintlayout.widget.d g(int i8, int i9, int i10) {
        int iStateGetConstraintID;
        if (this.f8419k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i8);
            printStream.println("size " + this.f8416h.size());
        }
        androidx.constraintlayout.widget.j jVar = this.f8410b;
        if (jVar != null && (iStateGetConstraintID = jVar.stateGetConstraintID(i8, i9, i10)) != -1) {
            i8 = iStateGetConstraintID;
        }
        if (this.f8416h.get(i8) != null) {
            return (androidx.constraintlayout.widget.d) this.f8416h.get(i8);
        }
        Log.e(TAG, "Warning could not find ConstraintSet id/" + androidx.constraintlayout.motion.widget.b.getName(this.f8409a.getContext(), i8) + " In MotionScene");
        SparseArray sparseArray = this.f8416h;
        return (androidx.constraintlayout.widget.d) sparseArray.get(sparseArray.keyAt(0));
    }

    public int gatPathMotionArc() {
        b bVar = this.f8411c;
        if (bVar != null) {
            return bVar.f8446p;
        }
        return -1;
    }

    public androidx.constraintlayout.widget.d getConstraintSet(Context context, String str) throws Resources.NotFoundException {
        if (this.f8419k) {
            PrintStream printStream = System.out;
            printStream.println("id " + str);
            printStream.println("size " + this.f8416h.size());
        }
        for (int i8 = 0; i8 < this.f8416h.size(); i8++) {
            int iKeyAt = this.f8416h.keyAt(i8);
            String resourceName = context.getResources().getResourceName(iKeyAt);
            if (this.f8419k) {
                System.out.println("Id for <" + i8 + "> is <" + resourceName + "> looking for <" + str + SimpleComparison.GREATER_THAN_OPERATION);
            }
            if (str.equals(resourceName)) {
                return (androidx.constraintlayout.widget.d) this.f8416h.get(iKeyAt);
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        int size = this.f8416h.size();
        int[] iArr = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr[i8] = this.f8416h.keyAt(i8);
        }
        return iArr;
    }

    public ArrayList<b> getDefinedTransitions() {
        return this.f8413e;
    }

    public int getDuration() {
        b bVar = this.f8411c;
        return bVar != null ? bVar.f8438h : this.f8420l;
    }

    public Interpolator getInterpolator() {
        int i8 = this.f8411c.f8435e;
        if (i8 == -2) {
            return AnimationUtils.loadInterpolator(this.f8409a.getContext(), this.f8411c.f8437g);
        }
        if (i8 == -1) {
            return new a(P.c.getInterpolator(this.f8411c.f8436f));
        }
        if (i8 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i8 == 1) {
            return new AccelerateInterpolator();
        }
        if (i8 == 2) {
            return new DecelerateInterpolator();
        }
        if (i8 == 4) {
            return new AnticipateInterpolator();
        }
        if (i8 != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    public void getKeyFrames(o oVar) {
        b bVar = this.f8411c;
        if (bVar != null) {
            Iterator it = bVar.f8441k.iterator();
            while (it.hasNext()) {
                ((i) it.next()).addFrames(oVar);
            }
        } else {
            b bVar2 = this.f8414f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.f8441k.iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).addFrames(oVar);
                }
            }
        }
    }

    public float getPathPercent(View view, int i8) {
        return 0.0f;
    }

    public float getStaggered() {
        b bVar = this.f8411c;
        if (bVar != null) {
            return bVar.f8439i;
        }
        return 0.0f;
    }

    public b getTransitionById(int i8) {
        Iterator it = this.f8413e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f8431a == i8) {
                return bVar;
            }
        }
        return null;
    }

    public List<b> getTransitionsWithState(int i8) {
        int iP = p(i8);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8413e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f8434d == iP || bVar.f8433c == iP) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    int h() {
        b bVar = this.f8411c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f8433c;
    }

    d k(Context context, int i8, int i9, int i10) {
        b bVar = this.f8411c;
        if (bVar == null) {
            return null;
        }
        Iterator it = bVar.f8441k.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            for (Integer num : iVar.getKeys()) {
                if (i9 == num.intValue()) {
                    Iterator<d> it2 = iVar.getKeyFramesForView(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        d next = it2.next();
                        if (next.f8098a == i10 && next.f8101d == i8) {
                            return next;
                        }
                    }
                }
            }
        }
        return null;
    }

    float l() {
        b bVar = this.f8411c;
        if (bVar == null || bVar.f8442l == null) {
            return 0.0f;
        }
        return this.f8411c.f8442l.e();
    }

    public int lookUpConstraintId(String str) {
        return ((Integer) this.f8417i.get(str)).intValue();
    }

    public String lookUpConstraintName(int i8) {
        for (Map.Entry entry : this.f8417i.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i8) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    float m() {
        b bVar = this.f8411c;
        if (bVar == null || bVar.f8442l == null) {
            return 0.0f;
        }
        return this.f8411c.f8442l.getMaxVelocity();
    }

    boolean n() {
        b bVar = this.f8411c;
        if (bVar == null || bVar.f8442l == null) {
            return false;
        }
        return this.f8411c.f8442l.f();
    }

    float o(float f8, float f9) {
        b bVar = this.f8411c;
        if (bVar == null || bVar.f8442l == null) {
            return 0.0f;
        }
        return this.f8411c.f8442l.g(f8, f9);
    }

    int q() {
        b bVar = this.f8411c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f8434d;
    }

    public void removeTransition(b bVar) {
        int iJ = j(bVar);
        if (iJ != -1) {
            this.f8413e.remove(iJ);
        }
    }

    boolean s(View view, int i8) {
        b bVar = this.f8411c;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.f8441k.iterator();
        while (it.hasNext()) {
            Iterator<d> it2 = ((i) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f8098a == i8) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setConstraintSet(int i8, androidx.constraintlayout.widget.d dVar) {
        this.f8416h.put(i8, dVar);
    }

    public void setDuration(int i8) {
        b bVar = this.f8411c;
        if (bVar != null) {
            bVar.setDuration(i8);
        } else {
            this.f8420l = i8;
        }
    }

    public void setKeyframe(View view, int i8, String str, Object obj) {
        b bVar = this.f8411c;
        if (bVar == null) {
            return;
        }
        Iterator it = bVar.f8441k.iterator();
        while (it.hasNext()) {
            Iterator<d> it2 = ((i) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f8098a == i8) {
                    if (obj != null) {
                    }
                    str.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public void setRtl(boolean z8) {
        this.f8426r = z8;
        b bVar = this.f8411c;
        if (bVar == null || bVar.f8442l == null) {
            return;
        }
        this.f8411c.f8442l.setRTL(this.f8426r);
    }

    public void setTransition(b bVar) {
        this.f8411c = bVar;
        if (bVar == null || bVar.f8442l == null) {
            return;
        }
        this.f8411c.f8442l.setRTL(this.f8426r);
    }

    public boolean validateLayout(r rVar) {
        return rVar == this.f8409a && rVar.f8344z == this;
    }

    void x(float f8, float f9) {
        b bVar = this.f8411c;
        if (bVar == null || bVar.f8442l == null) {
            return;
        }
        this.f8411c.f8442l.k(f8, f9);
    }

    void y(float f8, float f9) {
        b bVar = this.f8411c;
        if (bVar == null || bVar.f8442l == null) {
            return;
        }
        this.f8411c.f8442l.l(f8, f9);
    }

    void z(MotionEvent motionEvent, int i8, r rVar) {
        r.f fVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f8425q == null) {
            this.f8425q = this.f8409a.Y();
        }
        this.f8425q.addMovement(motionEvent);
        if (i8 != -1) {
            int action = motionEvent.getAction();
            boolean z8 = false;
            if (action == 0) {
                this.f8427s = motionEvent.getRawX();
                this.f8428t = motionEvent.getRawY();
                this.f8422n = motionEvent;
                this.f8423o = false;
                if (this.f8411c.f8442l != null) {
                    RectF rectFD = this.f8411c.f8442l.d(this.f8409a, rectF);
                    if (rectFD != null && !rectFD.contains(this.f8422n.getX(), this.f8422n.getY())) {
                        this.f8422n = null;
                        this.f8423o = true;
                        return;
                    }
                    RectF rectFH = this.f8411c.f8442l.h(this.f8409a, rectF);
                    if (rectFH == null || rectFH.contains(this.f8422n.getX(), this.f8422n.getY())) {
                        this.f8424p = false;
                    } else {
                        this.f8424p = true;
                    }
                    this.f8411c.f8442l.m(this.f8427s, this.f8428t);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f8423o) {
                float rawY = motionEvent.getRawY() - this.f8428t;
                float rawX = motionEvent.getRawX() - this.f8427s;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f8422n) == null) {
                    return;
                }
                b bVarBestTransitionFor = bestTransitionFor(i8, rawX, rawY, motionEvent2);
                if (bVarBestTransitionFor != null) {
                    rVar.setTransition(bVarBestTransitionFor);
                    RectF rectFH2 = this.f8411c.f8442l.h(this.f8409a, rectF);
                    if (rectFH2 != null && !rectFH2.contains(this.f8422n.getX(), this.f8422n.getY())) {
                        z8 = true;
                    }
                    this.f8424p = z8;
                    this.f8411c.f8442l.n(this.f8427s, this.f8428t);
                }
            }
        }
        if (this.f8423o) {
            return;
        }
        b bVar = this.f8411c;
        if (bVar != null && bVar.f8442l != null && !this.f8424p) {
            this.f8411c.f8442l.j(motionEvent, this.f8425q, i8, this);
        }
        this.f8427s = motionEvent.getRawX();
        this.f8428t = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (fVar = this.f8425q) == null) {
            return;
        }
        fVar.recycle();
        this.f8425q = null;
        int i9 = rVar.f8287D;
        if (i9 != -1) {
            e(rVar, i9);
        }
    }

    t(Context context, r rVar, int i8) throws XmlPullParserException, Resources.NotFoundException, IOException {
        this.f8409a = rVar;
        u(context, i8);
        this.f8416h.put(androidx.constraintlayout.widget.h.motion_base, new androidx.constraintlayout.widget.d());
        this.f8417i.put("motion_base", Integer.valueOf(androidx.constraintlayout.widget.h.motion_base));
    }

    public static class b {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;

        /* renamed from: a, reason: collision with root package name */
        private int f8431a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8432b;

        /* renamed from: c, reason: collision with root package name */
        private int f8433c;

        /* renamed from: d, reason: collision with root package name */
        private int f8434d;

        /* renamed from: e, reason: collision with root package name */
        private int f8435e;

        /* renamed from: f, reason: collision with root package name */
        private String f8436f;

        /* renamed from: g, reason: collision with root package name */
        private int f8437g;

        /* renamed from: h, reason: collision with root package name */
        private int f8438h;

        /* renamed from: i, reason: collision with root package name */
        private float f8439i;

        /* renamed from: j, reason: collision with root package name */
        private final t f8440j;

        /* renamed from: k, reason: collision with root package name */
        private ArrayList f8441k;

        /* renamed from: l, reason: collision with root package name */
        private x f8442l;

        /* renamed from: m, reason: collision with root package name */
        private ArrayList f8443m;

        /* renamed from: n, reason: collision with root package name */
        private int f8444n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f8445o;

        /* renamed from: p, reason: collision with root package name */
        private int f8446p;

        /* renamed from: q, reason: collision with root package name */
        private int f8447q;

        /* renamed from: r, reason: collision with root package name */
        private int f8448r;

        static class a implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;

            /* renamed from: a, reason: collision with root package name */
            private final b f8449a;

            /* renamed from: b, reason: collision with root package name */
            int f8450b;

            /* renamed from: c, reason: collision with root package name */
            int f8451c;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f8450b = -1;
                this.f8451c = 17;
                this.f8449a = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i8 = 0; i8 < indexCount; i8++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i8);
                    if (index == androidx.constraintlayout.widget.i.OnClick_targetId) {
                        this.f8450b = typedArrayObtainStyledAttributes.getResourceId(index, this.f8450b);
                    } else if (index == androidx.constraintlayout.widget.i.OnClick_clickAction) {
                        this.f8451c = typedArrayObtainStyledAttributes.getInt(index, this.f8451c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            boolean a(b bVar, r rVar) {
                b bVar2 = this.f8449a;
                if (bVar2 == bVar) {
                    return true;
                }
                int i8 = bVar2.f8433c;
                int i9 = this.f8449a.f8434d;
                if (i9 == -1) {
                    return rVar.f8287D != i8;
                }
                int i10 = rVar.f8287D;
                return i10 == i9 || i10 == i8;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            public void addOnClickListeners(r rVar, int i8, b bVar) {
                int i9 = this.f8450b;
                r rVarFindViewById = rVar;
                if (i9 != -1) {
                    rVarFindViewById = rVar.findViewById(i9);
                }
                if (rVarFindViewById == null) {
                    Log.e(t.TAG, "OnClick could not find id " + this.f8450b);
                    return;
                }
                int i10 = bVar.f8434d;
                int i11 = bVar.f8433c;
                if (i10 == -1) {
                    rVarFindViewById.setOnClickListener(this);
                    return;
                }
                int i12 = this.f8451c;
                boolean z8 = false;
                boolean z9 = ((i12 & 1) != 0 && i8 == i10) | ((i12 & 1) != 0 && i8 == i10) | ((i12 & 256) != 0 && i8 == i10) | ((i12 & 16) != 0 && i8 == i11);
                if ((i12 & 4096) != 0 && i8 == i11) {
                    z8 = true;
                }
                if (z9 || z8) {
                    rVarFindViewById.setOnClickListener(this);
                }
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws NumberFormatException {
                r rVar = this.f8449a.f8440j.f8409a;
                if (rVar.isInteractionEnabled()) {
                    if (this.f8449a.f8434d == -1) {
                        int currentState = rVar.getCurrentState();
                        if (currentState == -1) {
                            rVar.transitionToState(this.f8449a.f8433c);
                            return;
                        }
                        b bVar = new b(this.f8449a.f8440j, this.f8449a);
                        bVar.f8434d = currentState;
                        bVar.f8433c = this.f8449a.f8433c;
                        rVar.setTransition(bVar);
                        rVar.transitionToEnd();
                        return;
                    }
                    b bVar2 = this.f8449a.f8440j.f8411c;
                    int i8 = this.f8451c;
                    boolean z8 = false;
                    boolean z9 = ((i8 & 1) == 0 && (i8 & 256) == 0) ? false : true;
                    boolean z10 = ((i8 & 16) == 0 && (i8 & 4096) == 0) ? false : true;
                    if (z9 && z10) {
                        b bVar3 = this.f8449a.f8440j.f8411c;
                        b bVar4 = this.f8449a;
                        if (bVar3 != bVar4) {
                            rVar.setTransition(bVar4);
                        }
                        if (rVar.getCurrentState() != rVar.getEndState() && rVar.getProgress() <= 0.5f) {
                            z10 = false;
                            z8 = z9;
                        }
                    } else {
                        z8 = z9;
                    }
                    if (a(bVar2, rVar)) {
                        if (z8 && (this.f8451c & 1) != 0) {
                            rVar.setTransition(this.f8449a);
                            rVar.transitionToEnd();
                            return;
                        }
                        if (z10 && (this.f8451c & 16) != 0) {
                            rVar.setTransition(this.f8449a);
                            rVar.transitionToStart();
                        } else if (z8 && (this.f8451c & 256) != 0) {
                            rVar.setTransition(this.f8449a);
                            rVar.setProgress(1.0f);
                        } else {
                            if (!z10 || (this.f8451c & 4096) == 0) {
                                return;
                            }
                            rVar.setTransition(this.f8449a);
                            rVar.setProgress(0.0f);
                        }
                    }
                }
            }

            public void removeOnClickListeners(r rVar) {
                int i8 = this.f8450b;
                if (i8 == -1) {
                    return;
                }
                View viewFindViewById = rVar.findViewById(i8);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e(t.TAG, " (*)  could not find id " + this.f8450b);
            }
        }

        b(t tVar, b bVar) {
            this.f8431a = -1;
            this.f8432b = false;
            this.f8433c = -1;
            this.f8434d = -1;
            this.f8435e = 0;
            this.f8436f = null;
            this.f8437g = -1;
            this.f8438h = 400;
            this.f8439i = 0.0f;
            this.f8441k = new ArrayList();
            this.f8442l = null;
            this.f8443m = new ArrayList();
            this.f8444n = 0;
            this.f8445o = false;
            this.f8446p = -1;
            this.f8447q = 0;
            this.f8448r = 0;
            this.f8440j = tVar;
            if (bVar != null) {
                this.f8446p = bVar.f8446p;
                this.f8435e = bVar.f8435e;
                this.f8436f = bVar.f8436f;
                this.f8437g = bVar.f8437g;
                this.f8438h = bVar.f8438h;
                this.f8441k = bVar.f8441k;
                this.f8439i = bVar.f8439i;
                this.f8447q = bVar.f8447q;
            }
        }

        private void t(t tVar, Context context, TypedArray typedArray) throws XmlPullParserException, Resources.NotFoundException, IOException {
            int indexCount = typedArray.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArray.getIndex(i8);
                if (index == androidx.constraintlayout.widget.i.Transition_constraintSetEnd) {
                    this.f8433c = typedArray.getResourceId(index, this.f8433c);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f8433c))) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.load(context, this.f8433c);
                        tVar.f8416h.append(this.f8433c, dVar);
                    }
                } else if (index == androidx.constraintlayout.widget.i.Transition_constraintSetStart) {
                    this.f8434d = typedArray.getResourceId(index, this.f8434d);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f8434d))) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.load(context, this.f8434d);
                        tVar.f8416h.append(this.f8434d, dVar2);
                    }
                } else if (index == androidx.constraintlayout.widget.i.Transition_motionInterpolator) {
                    int i9 = typedArray.peekValue(index).type;
                    if (i9 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f8437g = resourceId;
                        if (resourceId != -1) {
                            this.f8435e = -2;
                        }
                    } else if (i9 == 3) {
                        String string = typedArray.getString(index);
                        this.f8436f = string;
                        if (string.indexOf("/") > 0) {
                            this.f8437g = typedArray.getResourceId(index, -1);
                            this.f8435e = -2;
                        } else {
                            this.f8435e = -1;
                        }
                    } else {
                        this.f8435e = typedArray.getInteger(index, this.f8435e);
                    }
                } else if (index == androidx.constraintlayout.widget.i.Transition_duration) {
                    this.f8438h = typedArray.getInt(index, this.f8438h);
                } else if (index == androidx.constraintlayout.widget.i.Transition_staggered) {
                    this.f8439i = typedArray.getFloat(index, this.f8439i);
                } else if (index == androidx.constraintlayout.widget.i.Transition_autoTransition) {
                    this.f8444n = typedArray.getInteger(index, this.f8444n);
                } else if (index == androidx.constraintlayout.widget.i.Transition_android_id) {
                    this.f8431a = typedArray.getResourceId(index, this.f8431a);
                } else if (index == androidx.constraintlayout.widget.i.Transition_transitionDisable) {
                    this.f8445o = typedArray.getBoolean(index, this.f8445o);
                } else if (index == androidx.constraintlayout.widget.i.Transition_pathMotionArc) {
                    this.f8446p = typedArray.getInteger(index, -1);
                } else if (index == androidx.constraintlayout.widget.i.Transition_layoutDuringTransition) {
                    this.f8447q = typedArray.getInteger(index, 0);
                } else if (index == androidx.constraintlayout.widget.i.Transition_transitionFlags) {
                    this.f8448r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f8434d == -1) {
                this.f8432b = true;
            }
        }

        private void u(t tVar, Context context, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.Transition);
            t(tVar, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void addOnClick(Context context, XmlPullParser xmlPullParser) {
            this.f8443m.add(new a(context, this, xmlPullParser));
        }

        public String debugString(Context context) {
            String resourceEntryName = this.f8434d == -1 ? "null" : context.getResources().getResourceEntryName(this.f8434d);
            if (this.f8433c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f8433c);
        }

        public int getAutoTransition() {
            return this.f8444n;
        }

        public int getDuration() {
            return this.f8438h;
        }

        public int getEndConstraintSetId() {
            return this.f8433c;
        }

        public int getId() {
            return this.f8431a;
        }

        public List<i> getKeyFrameList() {
            return this.f8441k;
        }

        public int getLayoutDuringTransition() {
            return this.f8447q;
        }

        public List<a> getOnClickList() {
            return this.f8443m;
        }

        public int getPathMotionArc() {
            return this.f8446p;
        }

        public float getStagger() {
            return this.f8439i;
        }

        public int getStartConstraintSetId() {
            return this.f8434d;
        }

        public x getTouchResponse() {
            return this.f8442l;
        }

        public boolean isEnabled() {
            return !this.f8445o;
        }

        public boolean isTransitionFlag(int i8) {
            return (i8 & this.f8448r) != 0;
        }

        public void setAutoTransition(int i8) {
            this.f8444n = i8;
        }

        public void setDuration(int i8) {
            this.f8438h = i8;
        }

        public void setEnable(boolean z8) {
            this.f8445o = !z8;
        }

        public void setPathMotionArc(int i8) {
            this.f8446p = i8;
        }

        public void setStagger(float f8) {
            this.f8439i = f8;
        }

        public b(int i8, t tVar, int i9, int i10) {
            this.f8431a = -1;
            this.f8432b = false;
            this.f8433c = -1;
            this.f8434d = -1;
            this.f8435e = 0;
            this.f8436f = null;
            this.f8437g = -1;
            this.f8438h = 400;
            this.f8439i = 0.0f;
            this.f8441k = new ArrayList();
            this.f8442l = null;
            this.f8443m = new ArrayList();
            this.f8444n = 0;
            this.f8445o = false;
            this.f8446p = -1;
            this.f8447q = 0;
            this.f8448r = 0;
            this.f8431a = i8;
            this.f8440j = tVar;
            this.f8434d = i9;
            this.f8433c = i10;
            this.f8438h = tVar.f8420l;
            this.f8447q = tVar.f8421m;
        }

        b(t tVar, Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, Resources.NotFoundException, IOException {
            this.f8431a = -1;
            this.f8432b = false;
            this.f8433c = -1;
            this.f8434d = -1;
            this.f8435e = 0;
            this.f8436f = null;
            this.f8437g = -1;
            this.f8438h = 400;
            this.f8439i = 0.0f;
            this.f8441k = new ArrayList();
            this.f8442l = null;
            this.f8443m = new ArrayList();
            this.f8444n = 0;
            this.f8445o = false;
            this.f8446p = -1;
            this.f8447q = 0;
            this.f8448r = 0;
            this.f8438h = tVar.f8420l;
            this.f8447q = tVar.f8421m;
            this.f8440j = tVar;
            u(tVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
