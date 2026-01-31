package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class k {
    private static ColorStateList a(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static int getAttr(Context context, int i8, int i9) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i8, typedValue, true);
        return typedValue.resourceId != 0 ? i8 : i9;
    }

    public static boolean getBoolean(TypedArray typedArray, int i8, int i9, boolean z8) {
        return typedArray.getBoolean(i8, typedArray.getBoolean(i9, z8));
    }

    public static Drawable getDrawable(TypedArray typedArray, int i8, int i9) {
        Drawable drawable = typedArray.getDrawable(i8);
        return drawable == null ? typedArray.getDrawable(i9) : drawable;
    }

    public static int getInt(TypedArray typedArray, int i8, int i9, int i10) {
        return typedArray.getInt(i8, typedArray.getInt(i9, i10));
    }

    public static boolean getNamedBoolean(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, boolean z8) {
        return !hasAttribute(xmlPullParser, str) ? z8 : typedArray.getBoolean(i8, z8);
    }

    public static int getNamedColor(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, int i9) {
        return !hasAttribute(xmlPullParser, str) ? i9 : typedArray.getColor(i8, i9);
    }

    public static ColorStateList getNamedColorStateList(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i8) {
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i8, typedValue);
        int i9 = typedValue.type;
        if (i9 != 2) {
            return (i9 < 28 || i9 > 31) ? c.inflate(typedArray.getResources(), typedArray.getResourceId(i8, 0), theme) : a(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i8 + ": " + typedValue);
    }

    public static d getNamedComplexColor(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i8, int i9) {
        if (hasAttribute(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i8, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return d.b(typedValue.data);
            }
            d dVarInflate = d.inflate(typedArray.getResources(), typedArray.getResourceId(i8, 0), theme);
            if (dVarInflate != null) {
                return dVarInflate;
            }
        }
        return d.b(i9);
    }

    public static float getNamedFloat(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, float f8) {
        return !hasAttribute(xmlPullParser, str) ? f8 : typedArray.getFloat(i8, f8);
    }

    public static int getNamedInt(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, int i9) {
        return !hasAttribute(xmlPullParser, str) ? i9 : typedArray.getInt(i8, i9);
    }

    public static int getNamedResourceId(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, int i9) {
        return !hasAttribute(xmlPullParser, str) ? i9 : typedArray.getResourceId(i8, i9);
    }

    public static String getNamedString(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.getString(i8);
        }
        return null;
    }

    public static int getResourceId(TypedArray typedArray, int i8, int i9, int i10) {
        return typedArray.getResourceId(i8, typedArray.getResourceId(i9, i10));
    }

    public static String getString(TypedArray typedArray, int i8, int i9) {
        String string = typedArray.getString(i8);
        return string == null ? typedArray.getString(i9) : string;
    }

    public static CharSequence getText(TypedArray typedArray, int i8, int i9) {
        CharSequence text = typedArray.getText(i8);
        return text == null ? typedArray.getText(i9) : text;
    }

    public static CharSequence[] getTextArray(TypedArray typedArray, int i8, int i9) {
        CharSequence[] textArray = typedArray.getTextArray(i8);
        return textArray == null ? typedArray.getTextArray(i9) : textArray;
    }

    public static boolean hasAttribute(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue peekNamedValue(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.peekValue(i8);
        }
        return null;
    }
}
