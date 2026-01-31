package I4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import n4.l;
import r4.C6174a;
import z4.C6630d;
import z4.t;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static a f2054b;

    /* renamed from: a, reason: collision with root package name */
    private Typeface f2055a;

    private Typeface a() {
        return this.f2055a;
    }

    public static a getInstance() {
        if (C6630d.isNull(f2054b)) {
            f2054b = new a();
        }
        return f2054b;
    }

    public static void setFont(Context context, TextView textView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setFont(context, textView, 0);
    }

    public void applyFont(Context context, TextView textView, AttributeSet attributeSet) {
        if (C6630d.isNotNull(a())) {
            boolean z8 = true;
            if (C6630d.isNotNull(attributeSet)) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.CView);
                z8 = typedArrayObtainStyledAttributes.getBoolean(l.CView_isApplyFont, true);
                typedArrayObtainStyledAttributes.recycle();
            }
            if (z8) {
                textView.setTypeface(a());
            }
        }
    }

    public void createTypeface(Context context) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f2055a = Typeface.createFromAsset(context.getAssets(), C6174a.FONT_NAME);
        } catch (RuntimeException e8) {
            t.e(e8.getMessage());
        }
    }

    public static void setFont(Context context, TextView textView, int i8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            textView.setTypeface(Typeface.createFromAsset(context.getAssets(), C6174a.FONT_NAME), i8);
        } catch (RuntimeException e8) {
            t.e(e8.getMessage());
        }
    }

    public static void setFont(Context context, View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), C6174a.FONT_NAME);
            if (C6630d.isNotNull(view) && (view instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    if (childAt instanceof TextView) {
                        ((TextView) childAt).setTypeface(typefaceCreateFromAsset);
                    }
                    setFont(context, childAt);
                }
            }
        } catch (RuntimeException e8) {
            t.e(e8.getMessage());
        }
    }
}
