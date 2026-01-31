package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class m extends d {
    public static final int KEY_TYPE = 5;

    /* renamed from: f, reason: collision with root package name */
    private int f8200f = -1;

    /* renamed from: g, reason: collision with root package name */
    private String f8201g = null;

    /* renamed from: h, reason: collision with root package name */
    private int f8202h;

    /* renamed from: i, reason: collision with root package name */
    private String f8203i;

    /* renamed from: j, reason: collision with root package name */
    private String f8204j;

    /* renamed from: k, reason: collision with root package name */
    private int f8205k;

    /* renamed from: l, reason: collision with root package name */
    private int f8206l;

    /* renamed from: m, reason: collision with root package name */
    private View f8207m;

    /* renamed from: n, reason: collision with root package name */
    float f8208n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f8209o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8210p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8211q;

    /* renamed from: r, reason: collision with root package name */
    private float f8212r;

    /* renamed from: s, reason: collision with root package name */
    private Method f8213s;

    /* renamed from: t, reason: collision with root package name */
    private Method f8214t;

    /* renamed from: u, reason: collision with root package name */
    private Method f8215u;

    /* renamed from: v, reason: collision with root package name */
    private float f8216v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f8217w;

    /* renamed from: x, reason: collision with root package name */
    RectF f8218x;

    /* renamed from: y, reason: collision with root package name */
    RectF f8219y;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static SparseIntArray f8220a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8220a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.KeyTrigger_framePosition, 8);
            f8220a.append(androidx.constraintlayout.widget.i.KeyTrigger_onCross, 4);
            f8220a.append(androidx.constraintlayout.widget.i.KeyTrigger_onNegativeCross, 1);
            f8220a.append(androidx.constraintlayout.widget.i.KeyTrigger_onPositiveCross, 2);
            f8220a.append(androidx.constraintlayout.widget.i.KeyTrigger_motionTarget, 7);
            f8220a.append(androidx.constraintlayout.widget.i.KeyTrigger_triggerId, 6);
            f8220a.append(androidx.constraintlayout.widget.i.KeyTrigger_triggerSlack, 5);
            f8220a.append(androidx.constraintlayout.widget.i.KeyTrigger_motion_triggerOnCollision, 9);
            f8220a.append(androidx.constraintlayout.widget.i.KeyTrigger_motion_postLayoutCollision, 10);
            f8220a.append(androidx.constraintlayout.widget.i.KeyTrigger_triggerReceiver, 11);
        }

        public static void read(m mVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArray.getIndex(i8);
                switch (f8220a.get(index)) {
                    case 1:
                        mVar.f8203i = typedArray.getString(index);
                        continue;
                    case 2:
                        mVar.f8204j = typedArray.getString(index);
                        continue;
                    case 4:
                        mVar.f8201g = typedArray.getString(index);
                        continue;
                    case 5:
                        mVar.f8208n = typedArray.getFloat(index, mVar.f8208n);
                        continue;
                    case 6:
                        mVar.f8205k = typedArray.getResourceId(index, mVar.f8205k);
                        continue;
                    case 7:
                        if (r.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, mVar.f8099b);
                            mVar.f8099b = resourceId;
                            if (resourceId == -1) {
                                mVar.f8100c = typedArray.getString(index);
                            } else {
                                continue;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            mVar.f8100c = typedArray.getString(index);
                        } else {
                            mVar.f8099b = typedArray.getResourceId(index, mVar.f8099b);
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, mVar.f8098a);
                        mVar.f8098a = integer;
                        mVar.f8212r = (integer + 0.5f) / 100.0f;
                        continue;
                    case 9:
                        mVar.f8206l = typedArray.getResourceId(index, mVar.f8206l);
                        continue;
                    case 10:
                        mVar.f8217w = typedArray.getBoolean(index, mVar.f8217w);
                        continue;
                    case 11:
                        mVar.f8202h = typedArray.getResourceId(index, mVar.f8202h);
                        break;
                }
                Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8220a.get(index));
            }
        }
    }

    public m() {
        int i8 = d.UNSET;
        this.f8202h = i8;
        this.f8203i = null;
        this.f8204j = null;
        this.f8205k = i8;
        this.f8206l = i8;
        this.f8207m = null;
        this.f8208n = 0.1f;
        this.f8209o = true;
        this.f8210p = true;
        this.f8211q = true;
        this.f8212r = Float.NaN;
        this.f8217w = false;
        this.f8218x = new RectF();
        this.f8219y = new RectF();
        this.f8101d = 5;
        this.f8102e = new HashMap();
    }

    private void q(RectF rectF, View view, boolean z8) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z8) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void addValues(HashMap<String, v> map) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void conditionallyFire(float r11, android.view.View r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.conditionallyFire(float, android.view.View):void");
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void load(Context context, AttributeSet attributeSet) {
        a.read(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.KeyTrigger), context);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void setValue(String str, Object obj) {
    }
}
