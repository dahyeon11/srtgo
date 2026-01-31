package androidx.constraintlayout.motion.widget;

import Q7.C0712p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends d {
    public static final int KEY_TYPE = 4;

    /* renamed from: f, reason: collision with root package name */
    private String f8122f = null;

    /* renamed from: g, reason: collision with root package name */
    private int f8123g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f8124h = -1;

    /* renamed from: i, reason: collision with root package name */
    private float f8125i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    private float f8126j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    private float f8127k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    private int f8128l = -1;

    /* renamed from: m, reason: collision with root package name */
    private float f8129m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    private float f8130n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    private float f8131o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    private float f8132p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    private float f8133q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    private float f8134r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    private float f8135s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    private float f8136t = Float.NaN;

    /* renamed from: u, reason: collision with root package name */
    private float f8137u = Float.NaN;

    /* renamed from: v, reason: collision with root package name */
    private float f8138v = Float.NaN;

    /* renamed from: w, reason: collision with root package name */
    private float f8139w = Float.NaN;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SparseIntArray f8140a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8140a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.KeyCycle_motionTarget, 1);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_framePosition, 2);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_transitionEasing, 3);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_curveFit, 4);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_waveShape, 5);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_wavePeriod, 6);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_waveOffset, 7);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_waveVariesBy, 8);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_android_alpha, 9);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_android_elevation, 10);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_android_rotation, 11);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_android_rotationX, 12);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_android_rotationY, 13);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_transitionPathRotate, 14);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_android_scaleX, 15);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_android_scaleY, 16);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_android_translationX, 17);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_android_translationY, 18);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_android_translationZ, 19);
            f8140a.append(androidx.constraintlayout.widget.i.KeyCycle_motionProgress, 20);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(g gVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArray.getIndex(i8);
                switch (f8140a.get(index)) {
                    case 1:
                        if (r.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, gVar.f8099b);
                            gVar.f8099b = resourceId;
                            if (resourceId == -1) {
                                gVar.f8100c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            gVar.f8100c = typedArray.getString(index);
                            break;
                        } else {
                            gVar.f8099b = typedArray.getResourceId(index, gVar.f8099b);
                            break;
                        }
                    case 2:
                        gVar.f8098a = typedArray.getInt(index, gVar.f8098a);
                        break;
                    case 3:
                        gVar.f8122f = typedArray.getString(index);
                        break;
                    case 4:
                        gVar.f8123g = typedArray.getInteger(index, gVar.f8123g);
                        break;
                    case 5:
                        gVar.f8124h = typedArray.getInt(index, gVar.f8124h);
                        break;
                    case 6:
                        gVar.f8125i = typedArray.getFloat(index, gVar.f8125i);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            gVar.f8126j = typedArray.getDimension(index, gVar.f8126j);
                            break;
                        } else {
                            gVar.f8126j = typedArray.getFloat(index, gVar.f8126j);
                            break;
                        }
                    case 8:
                        gVar.f8128l = typedArray.getInt(index, gVar.f8128l);
                        break;
                    case 9:
                        gVar.f8129m = typedArray.getFloat(index, gVar.f8129m);
                        break;
                    case 10:
                        gVar.f8130n = typedArray.getDimension(index, gVar.f8130n);
                        break;
                    case 11:
                        gVar.f8131o = typedArray.getFloat(index, gVar.f8131o);
                        break;
                    case 12:
                        gVar.f8133q = typedArray.getFloat(index, gVar.f8133q);
                        break;
                    case 13:
                        gVar.f8134r = typedArray.getFloat(index, gVar.f8134r);
                        break;
                    case 14:
                        gVar.f8132p = typedArray.getFloat(index, gVar.f8132p);
                        break;
                    case 15:
                        gVar.f8135s = typedArray.getFloat(index, gVar.f8135s);
                        break;
                    case 16:
                        gVar.f8136t = typedArray.getFloat(index, gVar.f8136t);
                        break;
                    case 17:
                        gVar.f8137u = typedArray.getDimension(index, gVar.f8137u);
                        break;
                    case 18:
                        gVar.f8138v = typedArray.getDimension(index, gVar.f8138v);
                        break;
                    case 19:
                        gVar.f8139w = typedArray.getDimension(index, gVar.f8139w);
                        break;
                    case 20:
                        gVar.f8127k = typedArray.getFloat(index, gVar.f8127k);
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8140a.get(index));
                        break;
                }
            }
        }
    }

    public g() {
        this.f8101d = 4;
        this.f8102e = new HashMap();
    }

    public void addCycleValues(HashMap<String, h> map) {
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f8102e.get(str.substring(7));
                if (aVar != null && aVar.getType() == a.b.FLOAT_TYPE) {
                    map.get(str).setPoint(this.f8098a, this.f8124h, this.f8128l, this.f8125i, this.f8126j, aVar.getValueToInterpolate(), aVar);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value)) {
                    map.get(str).setPoint(this.f8098a, this.f8124h, this.f8128l, this.f8125i, this.f8126j, value);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void addValues(HashMap<String, v> map) {
        v vVar;
        b.logStack("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            vVar = map.get(str);
            str.hashCode();
            switch (str) {
                case "rotationX":
                    vVar.setPoint(this.f8098a, this.f8133q);
                    break;
                case "rotationY":
                    vVar.setPoint(this.f8098a, this.f8134r);
                    break;
                case "translationX":
                    vVar.setPoint(this.f8098a, this.f8137u);
                    break;
                case "translationY":
                    vVar.setPoint(this.f8098a, this.f8138v);
                    break;
                case "translationZ":
                    vVar.setPoint(this.f8098a, this.f8139w);
                    break;
                case "progress":
                    vVar.setPoint(this.f8098a, this.f8127k);
                    break;
                case "scaleX":
                    vVar.setPoint(this.f8098a, this.f8135s);
                    break;
                case "scaleY":
                    vVar.setPoint(this.f8098a, this.f8136t);
                    break;
                case "rotation":
                    vVar.setPoint(this.f8098a, this.f8131o);
                    break;
                case "elevation":
                    vVar.setPoint(this.f8098a, this.f8130n);
                    break;
                case "transitionPathRotate":
                    vVar.setPoint(this.f8098a, this.f8132p);
                    break;
                case "alpha":
                    vVar.setPoint(this.f8098a, this.f8129m);
                    break;
                case "waveOffset":
                    vVar.setPoint(this.f8098a, this.f8126j);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("WARNING KeyCycle UNKNOWN  ");
                    sb.append(str);
                    break;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8129m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f8130n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f8131o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f8133q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f8134r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f8135s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f8136t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f8132p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8137u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f8138v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f8139w)) {
            hashSet.add("translationZ");
        }
        if (this.f8102e.size() > 0) {
            Iterator it = this.f8102e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    public float getValue(String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return this.f8133q;
            case "rotationY":
                return this.f8134r;
            case "translationX":
                return this.f8137u;
            case "translationY":
                return this.f8138v;
            case "translationZ":
                return this.f8139w;
            case "progress":
                return this.f8127k;
            case "scaleX":
                return this.f8135s;
            case "scaleY":
                return this.f8136t;
            case "rotation":
                return this.f8131o;
            case "elevation":
                return this.f8130n;
            case "transitionPathRotate":
                return this.f8132p;
            case "alpha":
                return this.f8129m;
            case "waveOffset":
                return this.f8126j;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("WARNING! KeyCycle UNKNOWN  ");
                sb.append(str);
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void load(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.KeyCycle));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.d
    public void setValue(String str, Object obj) {
        str.hashCode();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c9 = 2;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c9 = 3;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
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
            case -40300674:
                if (str.equals("rotation")) {
                    c9 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c9 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c9 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c9 = 11;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 184161818:
                if (str.equals("wavePeriod")) {
                    c9 = C0712p.CR;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c9 = 14;
                    break;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    c9 = 15;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.f8122f = obj.toString();
                break;
            case 1:
                this.f8133q = c(obj);
                break;
            case 2:
                this.f8134r = c(obj);
                break;
            case 3:
                this.f8137u = c(obj);
                break;
            case 4:
                this.f8138v = c(obj);
                break;
            case 5:
                this.f8127k = c(obj);
                break;
            case 6:
                this.f8135s = c(obj);
                break;
            case 7:
                this.f8136t = c(obj);
                break;
            case '\b':
                this.f8131o = c(obj);
                break;
            case '\t':
                this.f8130n = c(obj);
                break;
            case '\n':
                this.f8132p = c(obj);
                break;
            case 11:
                this.f8129m = c(obj);
                break;
            case '\f':
                this.f8126j = c(obj);
                break;
            case '\r':
                this.f8125i = c(obj);
                break;
            case 14:
                this.f8123g = d(obj);
                break;
            case 15:
                this.f8139w = c(obj);
                break;
        }
    }
}
