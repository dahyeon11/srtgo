package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.view.AbstractC0985p0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f8937a = new ThreadLocal();

    private static TypedValue a() {
        ThreadLocal threadLocal = f8937a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        Resources resources2 = resources;
        int i8 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrAppend = new int[20];
        int i9 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i8 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayE = e(resources2, theme, attributeSet, U.h.ColorStateListItem);
                int resourceId = typedArrayE.getResourceId(U.h.ColorStateListItem_android_color, -1);
                if (resourceId == -1 || c(resources2, resourceId)) {
                    color = typedArrayE.getColor(U.h.ColorStateListItem_android_color, -65281);
                } else {
                    try {
                        color = createFromXml(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayE.getColor(U.h.ColorStateListItem_android_color, -65281);
                    }
                }
                float f8 = 1.0f;
                if (typedArrayE.hasValue(U.h.ColorStateListItem_android_alpha)) {
                    f8 = typedArrayE.getFloat(U.h.ColorStateListItem_android_alpha, 1.0f);
                } else if (typedArrayE.hasValue(U.h.ColorStateListItem_alpha)) {
                    f8 = typedArrayE.getFloat(U.h.ColorStateListItem_alpha, 1.0f);
                }
                float f9 = (Build.VERSION.SDK_INT < 31 || !typedArrayE.hasValue(U.h.ColorStateListItem_android_lStar)) ? typedArrayE.getFloat(U.h.ColorStateListItem_lStar, -1.0f) : typedArrayE.getFloat(U.h.ColorStateListItem_android_lStar, -1.0f);
                typedArrayE.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != U.a.alpha && attributeNameResource != U.a.lStar) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i10);
                iArrAppend = g.append(iArrAppend, i9, d(color, f8, f9));
                iArr = (int[][]) g.append(iArr, i9, iArrTrimStateSet);
                i9++;
            }
            i8 = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i9];
        int[][] iArr4 = new int[i9][];
        System.arraycopy(iArrAppend, 0, iArr3, 0, i9);
        System.arraycopy(iArr, 0, iArr4, 0, i9);
        return new ColorStateList(iArr4, iArr3);
    }

    private static boolean c(Resources resources, int i8) throws Resources.NotFoundException {
        TypedValue typedValueA = a();
        resources.getValue(i8, typedValueA, true);
        int i9 = typedValueA.type;
        return i9 >= 28 && i9 <= 31;
    }

    public static ColorStateList createFromXml(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return createFromXmlInner(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return b(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static int d(int i8, float f8, float f9) {
        boolean z8 = f9 >= 0.0f && f9 <= 100.0f;
        if (f8 == 1.0f && !z8) {
            return i8;
        }
        int iClamp = X.a.clamp((int) ((Color.alpha(i8) * f8) + 0.5f), 0, 255);
        if (z8) {
            a aVarC = a.c(i8);
            i8 = a.toColor(aVarC.j(), aVarC.i(), f9);
        }
        return (i8 & AbstractC0985p0.MEASURED_SIZE_MASK) | (iClamp << 24);
    }

    private static TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static ColorStateList inflate(Resources resources, int i8, Resources.Theme theme) {
        try {
            return createFromXml(resources, resources.getXml(i8), theme);
        } catch (Exception e8) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e8);
            return null;
        }
    }
}
