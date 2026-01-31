package X2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.r0;
import i.AbstractC5638a;

/* loaded from: classes2.dex */
public abstract class c {
    static int a(TypedArray typedArray, int i8, int i9) {
        return typedArray.hasValue(i8) ? i8 : i9;
    }

    public static ColorStateList getColorStateList(Context context, TypedArray typedArray, int i8) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i8) || (resourceId = typedArray.getResourceId(i8, 0)) == 0 || (colorStateList = AbstractC5638a.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i8) : colorStateList;
    }

    public static int getDimensionPixelSize(Context context, TypedArray typedArray, int i8, int i9) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i8, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i8, i9);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i9);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable getDrawable(Context context, TypedArray typedArray, int i8) {
        int resourceId;
        Drawable drawable;
        return (!typedArray.hasValue(i8) || (resourceId = typedArray.getResourceId(i8, 0)) == 0 || (drawable = AbstractC5638a.getDrawable(context, resourceId)) == null) ? typedArray.getDrawable(i8) : drawable;
    }

    public static d getTextAppearance(Context context, TypedArray typedArray, int i8) {
        int resourceId;
        if (!typedArray.hasValue(i8) || (resourceId = typedArray.getResourceId(i8, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean isFontScaleAtLeast1_3(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean isFontScaleAtLeast2_0(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static ColorStateList getColorStateList(Context context, r0 r0Var, int i8) {
        int resourceId;
        ColorStateList colorStateList;
        return (!r0Var.hasValue(i8) || (resourceId = r0Var.getResourceId(i8, 0)) == 0 || (colorStateList = AbstractC5638a.getColorStateList(context, resourceId)) == null) ? r0Var.getColorStateList(i8) : colorStateList;
    }
}
