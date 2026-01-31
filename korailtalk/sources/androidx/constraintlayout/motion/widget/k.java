package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* loaded from: classes.dex */
abstract class k extends d {

    /* renamed from: f, reason: collision with root package name */
    int f8181f = d.UNSET;

    k() {
    }

    @Override // androidx.constraintlayout.motion.widget.d
    void getAttributeNames(HashSet hashSet) {
    }

    public abstract boolean intersects(int i8, int i9, RectF rectF, RectF rectF2, float f8, float f9);

    abstract void positionAttributes(View view, RectF rectF, RectF rectF2, float f8, float f9, String[] strArr, float[] fArr);
}
