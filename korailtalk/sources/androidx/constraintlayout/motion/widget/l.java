package androidx.constraintlayout.motion.widget;

import Q7.C0712p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class l extends d {
    public static final int KEY_TYPE = 3;

    /* renamed from: f, reason: collision with root package name */
    private String f8182f;

    /* renamed from: g, reason: collision with root package name */
    private int f8183g = -1;

    /* renamed from: h, reason: collision with root package name */
    private float f8184h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    private float f8185i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    private float f8186j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    private float f8187k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    private float f8188l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    private float f8189m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    private float f8190n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    private float f8191o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    private float f8192p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    private float f8193q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    private float f8194r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    private float f8195s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    private int f8196t = 0;

    /* renamed from: u, reason: collision with root package name */
    private float f8197u = Float.NaN;

    /* renamed from: v, reason: collision with root package name */
    private float f8198v = 0.0f;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SparseIntArray f8199a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8199a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.KeyTimeCycle_android_alpha, 1);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_android_elevation, 2);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_android_rotation, 4);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_android_rotationX, 5);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_android_rotationY, 6);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_android_scaleX, 7);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_transitionPathRotate, 8);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_transitionEasing, 9);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_motionTarget, 10);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_framePosition, 12);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_curveFit, 13);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_android_scaleY, 14);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_android_translationX, 15);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_android_translationY, 16);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_android_translationZ, 17);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_motionProgress, 18);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_wavePeriod, 20);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_waveOffset, 21);
            f8199a.append(androidx.constraintlayout.widget.i.KeyTimeCycle_waveShape, 19);
        }

        public static void read(l lVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArray.getIndex(i8);
                switch (f8199a.get(index)) {
                    case 1:
                        lVar.f8184h = typedArray.getFloat(index, lVar.f8184h);
                        break;
                    case 2:
                        lVar.f8185i = typedArray.getDimension(index, lVar.f8185i);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8199a.get(index));
                        break;
                    case 4:
                        lVar.f8186j = typedArray.getFloat(index, lVar.f8186j);
                        break;
                    case 5:
                        lVar.f8187k = typedArray.getFloat(index, lVar.f8187k);
                        break;
                    case 6:
                        lVar.f8188l = typedArray.getFloat(index, lVar.f8188l);
                        break;
                    case 7:
                        lVar.f8190n = typedArray.getFloat(index, lVar.f8190n);
                        break;
                    case 8:
                        lVar.f8189m = typedArray.getFloat(index, lVar.f8189m);
                        break;
                    case 9:
                        lVar.f8182f = typedArray.getString(index);
                        break;
                    case 10:
                        if (r.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, lVar.f8099b);
                            lVar.f8099b = resourceId;
                            if (resourceId == -1) {
                                lVar.f8100c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            lVar.f8100c = typedArray.getString(index);
                            break;
                        } else {
                            lVar.f8099b = typedArray.getResourceId(index, lVar.f8099b);
                            break;
                        }
                    case 12:
                        lVar.f8098a = typedArray.getInt(index, lVar.f8098a);
                        break;
                    case 13:
                        lVar.f8183g = typedArray.getInteger(index, lVar.f8183g);
                        break;
                    case 14:
                        lVar.f8191o = typedArray.getFloat(index, lVar.f8191o);
                        break;
                    case 15:
                        lVar.f8192p = typedArray.getDimension(index, lVar.f8192p);
                        break;
                    case 16:
                        lVar.f8193q = typedArray.getDimension(index, lVar.f8193q);
                        break;
                    case 17:
                        lVar.f8194r = typedArray.getDimension(index, lVar.f8194r);
                        break;
                    case 18:
                        lVar.f8195s = typedArray.getFloat(index, lVar.f8195s);
                        break;
                    case 19:
                        lVar.f8196t = typedArray.getInt(index, lVar.f8196t);
                        break;
                    case 20:
                        lVar.f8197u = typedArray.getFloat(index, lVar.f8197u);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            lVar.f8198v = typedArray.getDimension(index, lVar.f8198v);
                            break;
                        } else {
                            lVar.f8198v = typedArray.getFloat(index, lVar.f8198v);
                            break;
                        }
                }
            }
        }
    }

    public l() {
        this.f8101d = 3;
        this.f8102e = new HashMap();
    }

    public void addTimeValues(HashMap<String, w> map) {
        for (String str : map.keySet()) {
            w wVar = map.get(str);
            if (!str.startsWith("CUSTOM")) {
                switch (str) {
                    case "rotationX":
                        if (Float.isNaN(this.f8187k)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8187k, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    case "rotationY":
                        if (Float.isNaN(this.f8188l)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8188l, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    case "translationX":
                        if (Float.isNaN(this.f8192p)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8192p, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    case "translationY":
                        if (Float.isNaN(this.f8193q)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8193q, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    case "translationZ":
                        if (Float.isNaN(this.f8194r)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8194r, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    case "progress":
                        if (Float.isNaN(this.f8195s)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8195s, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    case "scaleX":
                        if (Float.isNaN(this.f8190n)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8190n, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    case "scaleY":
                        if (Float.isNaN(this.f8191o)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8191o, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    case "rotation":
                        if (Float.isNaN(this.f8186j)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8186j, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    case "elevation":
                        if (Float.isNaN(this.f8185i)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8185i, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    case "transitionPathRotate":
                        if (Float.isNaN(this.f8189m)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8189m, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    case "alpha":
                        if (Float.isNaN(this.f8184h)) {
                            break;
                        } else {
                            wVar.setPoint(this.f8098a, this.f8184h, this.f8197u, this.f8196t, this.f8198v);
                            break;
                        }
                    default:
                        Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                        break;
                }
            } else {
                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f8102e.get(str.substring(7));
                if (aVar != null) {
                    ((w.b) wVar).setPoint(this.f8098a, aVar, this.f8197u, this.f8196t, this.f8198v);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void addValues(HashMap<String, v> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8184h)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f8185i)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f8186j)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f8187k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f8188l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f8192p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f8193q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f8194r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f8189m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8190n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f8191o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f8195s)) {
            hashSet.add(androidx.core.app.r.CATEGORY_PROGRESS);
        }
        if (this.f8102e.size() > 0) {
            Iterator it = this.f8102e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void load(Context context, AttributeSet attributeSet) {
        a.read(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.KeyTimeCycle));
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void setInterpolation(HashMap<String, Integer> map) {
        if (this.f8183g == -1) {
            return;
        }
        if (!Float.isNaN(this.f8184h)) {
            map.put("alpha", Integer.valueOf(this.f8183g));
        }
        if (!Float.isNaN(this.f8185i)) {
            map.put("elevation", Integer.valueOf(this.f8183g));
        }
        if (!Float.isNaN(this.f8186j)) {
            map.put("rotation", Integer.valueOf(this.f8183g));
        }
        if (!Float.isNaN(this.f8187k)) {
            map.put("rotationX", Integer.valueOf(this.f8183g));
        }
        if (!Float.isNaN(this.f8188l)) {
            map.put("rotationY", Integer.valueOf(this.f8183g));
        }
        if (!Float.isNaN(this.f8192p)) {
            map.put("translationX", Integer.valueOf(this.f8183g));
        }
        if (!Float.isNaN(this.f8193q)) {
            map.put("translationY", Integer.valueOf(this.f8183g));
        }
        if (!Float.isNaN(this.f8194r)) {
            map.put("translationZ", Integer.valueOf(this.f8183g));
        }
        if (!Float.isNaN(this.f8189m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f8183g));
        }
        if (!Float.isNaN(this.f8190n)) {
            map.put("scaleX", Integer.valueOf(this.f8183g));
        }
        if (!Float.isNaN(this.f8190n)) {
            map.put("scaleY", Integer.valueOf(this.f8183g));
        }
        if (!Float.isNaN(this.f8195s)) {
            map.put(androidx.core.app.r.CATEGORY_PROGRESS, Integer.valueOf(this.f8183g));
        }
        if (this.f8102e.size() > 0) {
            Iterator it = this.f8102e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f8183g));
            }
        }
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
            case 579057826:
                if (str.equals("curveFit")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    c9 = C0712p.CR;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.f8182f = obj.toString();
                break;
            case 1:
                this.f8187k = c(obj);
                break;
            case 2:
                this.f8188l = c(obj);
                break;
            case 3:
                this.f8192p = c(obj);
                break;
            case 4:
                this.f8193q = c(obj);
                break;
            case 5:
                this.f8195s = c(obj);
                break;
            case 6:
                this.f8190n = c(obj);
                break;
            case 7:
                this.f8191o = c(obj);
                break;
            case '\b':
                this.f8186j = c(obj);
                break;
            case '\t':
                this.f8185i = c(obj);
                break;
            case '\n':
                this.f8189m = c(obj);
                break;
            case 11:
                this.f8184h = c(obj);
                break;
            case '\f':
                this.f8183g = d(obj);
                break;
            case '\r':
                this.f8194r = c(obj);
                break;
        }
    }
}
