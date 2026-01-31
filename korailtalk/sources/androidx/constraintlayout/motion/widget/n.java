package androidx.constraintlayout.motion.widget;

import Q7.C0712p;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.v;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
class n implements Comparable {

    /* renamed from: B, reason: collision with root package name */
    static String[] f8221B = {"position", "x", "y", "width", "height", "pathRotate"};
    public static final boolean DEBUG = false;
    public static final String TAG = "MotionPaths";

    /* renamed from: c, reason: collision with root package name */
    int f8225c;

    /* renamed from: o, reason: collision with root package name */
    private P.c f8237o;

    /* renamed from: q, reason: collision with root package name */
    private float f8239q;

    /* renamed from: r, reason: collision with root package name */
    private float f8240r;

    /* renamed from: s, reason: collision with root package name */
    private float f8241s;

    /* renamed from: t, reason: collision with root package name */
    private float f8242t;

    /* renamed from: u, reason: collision with root package name */
    private float f8243u;

    /* renamed from: a, reason: collision with root package name */
    private float f8223a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    int f8224b = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8226d = false;

    /* renamed from: e, reason: collision with root package name */
    private float f8227e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private float f8228f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private float f8229g = 0.0f;
    public float rotationY = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f8230h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f8231i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private float f8232j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    private float f8233k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    private float f8234l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f8235m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f8236n = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    private int f8238p = 0;

    /* renamed from: v, reason: collision with root package name */
    private float f8244v = Float.NaN;

    /* renamed from: w, reason: collision with root package name */
    private float f8245w = Float.NaN;

    /* renamed from: x, reason: collision with root package name */
    LinkedHashMap f8246x = new LinkedHashMap();

    /* renamed from: y, reason: collision with root package name */
    int f8247y = 0;

    /* renamed from: z, reason: collision with root package name */
    double[] f8248z = new double[18];

    /* renamed from: A, reason: collision with root package name */
    double[] f8222A = new double[18];

    private boolean a(float f8, float f9) {
        return (Float.isNaN(f8) || Float.isNaN(f9)) ? Float.isNaN(f8) != Float.isNaN(f9) : Math.abs(f8 - f9) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addValues(HashMap<String, v> map, int i8) {
        for (String str : map.keySet()) {
            v vVar = map.get(str);
            str.hashCode();
            char c9 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals(androidx.core.app.r.CATEGORY_PROGRESS)) {
                        c9 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c9 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c9 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c9 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c9 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c9 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c9 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c9 = C0712p.CR;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    vVar.setPoint(i8, Float.isNaN(this.f8229g) ? 0.0f : this.f8229g);
                    break;
                case 1:
                    vVar.setPoint(i8, Float.isNaN(this.rotationY) ? 0.0f : this.rotationY);
                    break;
                case 2:
                    vVar.setPoint(i8, Float.isNaN(this.f8234l) ? 0.0f : this.f8234l);
                    break;
                case 3:
                    vVar.setPoint(i8, Float.isNaN(this.f8235m) ? 0.0f : this.f8235m);
                    break;
                case 4:
                    vVar.setPoint(i8, Float.isNaN(this.f8236n) ? 0.0f : this.f8236n);
                    break;
                case 5:
                    vVar.setPoint(i8, Float.isNaN(this.f8245w) ? 0.0f : this.f8245w);
                    break;
                case 6:
                    vVar.setPoint(i8, Float.isNaN(this.f8230h) ? 1.0f : this.f8230h);
                    break;
                case 7:
                    vVar.setPoint(i8, Float.isNaN(this.f8231i) ? 1.0f : this.f8231i);
                    break;
                case '\b':
                    vVar.setPoint(i8, Float.isNaN(this.f8232j) ? 0.0f : this.f8232j);
                    break;
                case '\t':
                    vVar.setPoint(i8, Float.isNaN(this.f8233k) ? 0.0f : this.f8233k);
                    break;
                case '\n':
                    vVar.setPoint(i8, Float.isNaN(this.f8228f) ? 0.0f : this.f8228f);
                    break;
                case 11:
                    vVar.setPoint(i8, Float.isNaN(this.f8227e) ? 0.0f : this.f8227e);
                    break;
                case '\f':
                    vVar.setPoint(i8, Float.isNaN(this.f8244v) ? 0.0f : this.f8244v);
                    break;
                case '\r':
                    vVar.setPoint(i8, Float.isNaN(this.f8223a) ? 1.0f : this.f8223a);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f8246x.containsKey(str2)) {
                            androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f8246x.get(str2);
                            if (vVar instanceof v.b) {
                                ((v.b) vVar).setPoint(i8, aVar);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " splineSet not a CustomSet frame = " + i8 + ", value" + aVar.getValueToInterpolate() + vVar);
                                break;
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN customName " + str2);
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void applyParameters(View view) {
        this.f8225c = view.getVisibility();
        this.f8223a = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f8226d = false;
        this.f8227e = view.getElevation();
        this.f8228f = view.getRotation();
        this.f8229g = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.f8230h = view.getScaleX();
        this.f8231i = view.getScaleY();
        this.f8232j = view.getPivotX();
        this.f8233k = view.getPivotY();
        this.f8234l = view.getTranslationX();
        this.f8235m = view.getTranslationY();
        this.f8236n = view.getTranslationZ();
    }

    void b(n nVar, HashSet hashSet) {
        if (a(this.f8223a, nVar.f8223a)) {
            hashSet.add("alpha");
        }
        if (a(this.f8227e, nVar.f8227e)) {
            hashSet.add("elevation");
        }
        int i8 = this.f8225c;
        int i9 = nVar.f8225c;
        if (i8 != i9 && this.f8224b == 0 && (i8 == 0 || i9 == 0)) {
            hashSet.add("alpha");
        }
        if (a(this.f8228f, nVar.f8228f)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f8244v) || !Float.isNaN(nVar.f8244v)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8245w) || !Float.isNaN(nVar.f8245w)) {
            hashSet.add(androidx.core.app.r.CATEGORY_PROGRESS);
        }
        if (a(this.f8229g, nVar.f8229g)) {
            hashSet.add("rotationX");
        }
        if (a(this.rotationY, nVar.rotationY)) {
            hashSet.add("rotationY");
        }
        if (a(this.f8232j, nVar.f8232j)) {
            hashSet.add("transformPivotX");
        }
        if (a(this.f8233k, nVar.f8233k)) {
            hashSet.add("transformPivotY");
        }
        if (a(this.f8230h, nVar.f8230h)) {
            hashSet.add("scaleX");
        }
        if (a(this.f8231i, nVar.f8231i)) {
            hashSet.add("scaleY");
        }
        if (a(this.f8234l, nVar.f8234l)) {
            hashSet.add("translationX");
        }
        if (a(this.f8235m, nVar.f8235m)) {
            hashSet.add("translationY");
        }
        if (a(this.f8236n, nVar.f8236n)) {
            hashSet.add("translationZ");
        }
    }

    void c(float f8, float f9, float f10, float f11) {
        this.f8240r = f8;
        this.f8241s = f9;
        this.f8242t = f10;
        this.f8243u = f11;
    }

    public void setState(View view) {
        c(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        applyParameters(view);
    }

    @Override // java.lang.Comparable
    public int compareTo(n nVar) {
        return Float.compare(this.f8239q, nVar.f8239q);
    }

    public void setState(R.e eVar, androidx.constraintlayout.widget.d dVar, int i8) {
        c(eVar.getX(), eVar.getY(), eVar.getWidth(), eVar.getHeight());
        applyParameters(dVar.getParameters(i8));
    }

    public void applyParameters(d.a aVar) {
        d.C0126d c0126d = aVar.propertySet;
        int i8 = c0126d.mVisibilityMode;
        this.f8224b = i8;
        int i9 = c0126d.visibility;
        this.f8225c = i9;
        this.f8223a = (i9 == 0 || i8 != 0) ? c0126d.alpha : 0.0f;
        d.e eVar = aVar.transform;
        this.f8226d = eVar.applyElevation;
        this.f8227e = eVar.elevation;
        this.f8228f = eVar.rotation;
        this.f8229g = eVar.rotationX;
        this.rotationY = eVar.rotationY;
        this.f8230h = eVar.scaleX;
        this.f8231i = eVar.scaleY;
        this.f8232j = eVar.transformPivotX;
        this.f8233k = eVar.transformPivotY;
        this.f8234l = eVar.translationX;
        this.f8235m = eVar.translationY;
        this.f8236n = eVar.translationZ;
        this.f8237o = P.c.getInterpolator(aVar.motion.mTransitionEasing);
        d.c cVar = aVar.motion;
        this.f8244v = cVar.mPathRotate;
        this.f8238p = cVar.mDrawPath;
        this.f8245w = aVar.propertySet.mProgress;
        for (String str : aVar.mCustomConstraints.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.mCustomConstraints.get(str);
            if (aVar2.getType() != a.b.STRING_TYPE) {
                this.f8246x.put(str, aVar2);
            }
        }
    }
}
