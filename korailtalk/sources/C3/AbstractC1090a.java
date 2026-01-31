package c3;

import J2.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import l.C5878d;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1090a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f11471a = {R.attr.theme, b.theme};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f11472b = {b.materialThemeOverlay};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11471a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i8, int i9) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11472b, i8, i9);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context wrap(Context context, AttributeSet attributeSet, int i8, int i9) {
        int iB = b(context, attributeSet, i8, i9);
        boolean z8 = (context instanceof C5878d) && ((C5878d) context).getThemeResId() == iB;
        if (iB == 0 || z8) {
            return context;
        }
        C5878d c5878d = new C5878d(context, iB);
        int iA = a(context, attributeSet);
        if (iA != 0) {
            c5878d.getTheme().applyStyle(iA, true);
        }
        return c5878d;
    }
}
