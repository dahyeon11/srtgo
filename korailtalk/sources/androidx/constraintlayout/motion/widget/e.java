package androidx.constraintlayout.motion.widget;

import Q7.C0712p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e extends d {
    public static final int KEY_TYPE = 1;

    /* renamed from: f, reason: collision with root package name */
    private String f8103f;

    /* renamed from: g, reason: collision with root package name */
    private int f8104g = -1;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8105h = false;

    /* renamed from: i, reason: collision with root package name */
    private float f8106i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    private float f8107j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    private float f8108k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    private float f8109l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    private float f8110m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    private float f8111n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    private float f8112o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    private float f8113p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    private float f8114q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    private float f8115r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    private float f8116s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    private float f8117t = Float.NaN;

    /* renamed from: u, reason: collision with root package name */
    private float f8118u = Float.NaN;

    /* renamed from: v, reason: collision with root package name */
    private float f8119v = Float.NaN;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SparseIntArray f8120a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8120a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.KeyAttribute_android_alpha, 1);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_android_elevation, 2);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_android_rotation, 4);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_android_rotationX, 5);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_android_rotationY, 6);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_android_transformPivotX, 19);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_android_transformPivotY, 20);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_android_scaleX, 7);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_transitionPathRotate, 8);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_transitionEasing, 9);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_motionTarget, 10);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_framePosition, 12);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_curveFit, 13);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_android_scaleY, 14);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_android_translationX, 15);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_android_translationY, 16);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_android_translationZ, 17);
            f8120a.append(androidx.constraintlayout.widget.i.KeyAttribute_motionProgress, 18);
        }

        public static void read(e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArray.getIndex(i8);
                switch (f8120a.get(index)) {
                    case 1:
                        eVar.f8106i = typedArray.getFloat(index, eVar.f8106i);
                        break;
                    case 2:
                        eVar.f8107j = typedArray.getDimension(index, eVar.f8107j);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8120a.get(index));
                        break;
                    case 4:
                        eVar.f8108k = typedArray.getFloat(index, eVar.f8108k);
                        break;
                    case 5:
                        eVar.f8109l = typedArray.getFloat(index, eVar.f8109l);
                        break;
                    case 6:
                        eVar.f8110m = typedArray.getFloat(index, eVar.f8110m);
                        break;
                    case 7:
                        eVar.f8114q = typedArray.getFloat(index, eVar.f8114q);
                        break;
                    case 8:
                        eVar.f8113p = typedArray.getFloat(index, eVar.f8113p);
                        break;
                    case 9:
                        eVar.f8103f = typedArray.getString(index);
                        break;
                    case 10:
                        if (r.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, eVar.f8099b);
                            eVar.f8099b = resourceId;
                            if (resourceId == -1) {
                                eVar.f8100c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            eVar.f8100c = typedArray.getString(index);
                            break;
                        } else {
                            eVar.f8099b = typedArray.getResourceId(index, eVar.f8099b);
                            break;
                        }
                    case 12:
                        eVar.f8098a = typedArray.getInt(index, eVar.f8098a);
                        break;
                    case 13:
                        eVar.f8104g = typedArray.getInteger(index, eVar.f8104g);
                        break;
                    case 14:
                        eVar.f8115r = typedArray.getFloat(index, eVar.f8115r);
                        break;
                    case 15:
                        eVar.f8116s = typedArray.getDimension(index, eVar.f8116s);
                        break;
                    case 16:
                        eVar.f8117t = typedArray.getDimension(index, eVar.f8117t);
                        break;
                    case 17:
                        eVar.f8118u = typedArray.getDimension(index, eVar.f8118u);
                        break;
                    case 18:
                        eVar.f8119v = typedArray.getFloat(index, eVar.f8119v);
                        break;
                    case 19:
                        eVar.f8111n = typedArray.getDimension(index, eVar.f8111n);
                        break;
                    case 20:
                        eVar.f8112o = typedArray.getDimension(index, eVar.f8112o);
                        break;
                }
            }
        }
    }

    public e() {
        this.f8101d = 1;
        this.f8102e = new HashMap();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.d
    public void addValues(HashMap<String, v> map) {
        for (String str : map.keySet()) {
            v vVar = map.get(str);
            if (!str.startsWith("CUSTOM")) {
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
                        if (Float.isNaN(this.f8109l)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8109l);
                            break;
                        }
                    case 1:
                        if (Float.isNaN(this.f8110m)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8110m);
                            break;
                        }
                    case 2:
                        if (Float.isNaN(this.f8116s)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8116s);
                            break;
                        }
                    case 3:
                        if (Float.isNaN(this.f8117t)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8117t);
                            break;
                        }
                    case 4:
                        if (Float.isNaN(this.f8118u)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8118u);
                            break;
                        }
                    case 5:
                        if (Float.isNaN(this.f8119v)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8119v);
                            break;
                        }
                    case 6:
                        if (Float.isNaN(this.f8114q)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8114q);
                            break;
                        }
                    case 7:
                        if (Float.isNaN(this.f8115r)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8115r);
                            break;
                        }
                    case '\b':
                        if (Float.isNaN(this.f8109l)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8111n);
                            break;
                        }
                    case '\t':
                        if (Float.isNaN(this.f8110m)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8112o);
                            break;
                        }
                    case '\n':
                        if (Float.isNaN(this.f8108k)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8108k);
                            break;
                        }
                    case 11:
                        if (Float.isNaN(this.f8107j)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8107j);
                            break;
                        }
                    case '\f':
                        if (Float.isNaN(this.f8113p)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8113p);
                            break;
                        }
                    case '\r':
                        if (Float.isNaN(this.f8106i)) {
                            break;
                        } else {
                            vVar.setPoint(this.f8098a, this.f8106i);
                            break;
                        }
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("UNKNOWN addValues \"");
                        sb.append(str);
                        sb.append("\"");
                        break;
                }
            } else {
                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f8102e.get(str.substring(7));
                if (aVar != null) {
                    ((v.b) vVar).setPoint(this.f8098a, aVar);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8106i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f8107j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f8108k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f8109l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f8110m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f8111n)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f8112o)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f8116s)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f8117t)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f8118u)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f8113p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8114q)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f8115r)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f8119v)) {
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
        a.read(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.KeyAttribute));
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void setInterpolation(HashMap<String, Integer> map) {
        if (this.f8104g == -1) {
            return;
        }
        if (!Float.isNaN(this.f8106i)) {
            map.put("alpha", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8107j)) {
            map.put("elevation", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8108k)) {
            map.put("rotation", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8109l)) {
            map.put("rotationX", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8110m)) {
            map.put("rotationY", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8111n)) {
            map.put("transformPivotX", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8112o)) {
            map.put("transformPivotY", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8116s)) {
            map.put("translationX", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8117t)) {
            map.put("translationY", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8118u)) {
            map.put("translationZ", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8113p)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8114q)) {
            map.put("scaleX", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8115r)) {
            map.put("scaleY", Integer.valueOf(this.f8104g));
        }
        if (!Float.isNaN(this.f8119v)) {
            map.put(androidx.core.app.r.CATEGORY_PROGRESS, Integer.valueOf(this.f8104g));
        }
        if (this.f8102e.size() > 0) {
            Iterator it = this.f8102e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f8104g));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.d
    public void setValue(String str, Object obj) {
        str.hashCode();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c9 = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c9 = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c9 = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c9 = 5;
                    break;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c9 = 6;
                    break;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c9 = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c9 = '\b';
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
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
            case 1941332754:
                if (str.equals("visibility")) {
                    c9 = 16;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.f8119v = c(obj);
                break;
            case 1:
                this.f8103f = obj.toString();
                break;
            case 2:
                this.f8109l = c(obj);
                break;
            case 3:
                this.f8110m = c(obj);
                break;
            case 4:
                this.f8116s = c(obj);
                break;
            case 5:
                this.f8117t = c(obj);
                break;
            case 6:
                this.f8111n = c(obj);
                break;
            case 7:
                this.f8112o = c(obj);
                break;
            case '\b':
                this.f8114q = c(obj);
                break;
            case '\t':
                this.f8115r = c(obj);
                break;
            case '\n':
                this.f8108k = c(obj);
                break;
            case 11:
                this.f8107j = c(obj);
                break;
            case '\f':
                this.f8113p = c(obj);
                break;
            case '\r':
                this.f8106i = c(obj);
                break;
            case 14:
                this.f8104g = d(obj);
                break;
            case 15:
                this.f8118u = c(obj);
                break;
            case 16:
                this.f8105h = b(obj);
                break;
        }
    }
}
