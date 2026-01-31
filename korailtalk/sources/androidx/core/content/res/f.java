package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
abstract class f {
    private static a a(a aVar, int i8, int i9, boolean z8, int i10) {
        return aVar != null ? aVar : z8 ? new a(i8, i10, i9) : new a(i8, i9);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayObtainAttributes = k.obtainAttributes(resources, theme, attributeSet, U.h.GradientColor);
        float namedFloat = k.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "startX", U.h.GradientColor_android_startX, 0.0f);
        float namedFloat2 = k.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "startY", U.h.GradientColor_android_startY, 0.0f);
        float namedFloat3 = k.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "endX", U.h.GradientColor_android_endX, 0.0f);
        float namedFloat4 = k.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "endY", U.h.GradientColor_android_endY, 0.0f);
        float namedFloat5 = k.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "centerX", U.h.GradientColor_android_centerX, 0.0f);
        float namedFloat6 = k.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "centerY", U.h.GradientColor_android_centerY, 0.0f);
        int namedInt = k.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "type", U.h.GradientColor_android_type, 0);
        int namedColor = k.getNamedColor(typedArrayObtainAttributes, xmlPullParser, "startColor", U.h.GradientColor_android_startColor, 0);
        boolean zHasAttribute = k.hasAttribute(xmlPullParser, "centerColor");
        int namedColor2 = k.getNamedColor(typedArrayObtainAttributes, xmlPullParser, "centerColor", U.h.GradientColor_android_centerColor, 0);
        int namedColor3 = k.getNamedColor(typedArrayObtainAttributes, xmlPullParser, "endColor", U.h.GradientColor_android_endColor, 0);
        int namedInt2 = k.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "tileMode", U.h.GradientColor_android_tileMode, 0);
        float namedFloat7 = k.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "gradientRadius", U.h.GradientColor_android_gradientRadius, 0.0f);
        typedArrayObtainAttributes.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), namedColor, namedColor3, zHasAttribute, namedColor2);
        if (namedInt != 1) {
            return namedInt != 2 ? new LinearGradient(namedFloat, namedFloat2, namedFloat3, namedFloat4, aVarA.f8952a, aVarA.f8953b, d(namedInt2)) : new SweepGradient(namedFloat5, namedFloat6, aVarA.f8952a, aVarA.f8953b);
        }
        if (namedFloat7 > 0.0f) {
            return new RadialGradient(namedFloat5, namedFloat6, namedFloat7, aVarA.f8952a, aVarA.f8953b, d(namedInt2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new androidx.core.content.res.f.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = U.h.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.res.k.obtainAttributes(r8, r11, r10, r3)
            int r5 = U.h.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = U.h.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = U.h.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = U.h.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            androidx.core.content.res.f$a r8 = new androidx.core.content.res.f$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i8) {
        return i8 != 1 ? i8 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f8952a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f8953b;

        a(List list, List list2) {
            int size = list.size();
            this.f8952a = new int[size];
            this.f8953b = new float[size];
            for (int i8 = 0; i8 < size; i8++) {
                this.f8952a[i8] = ((Integer) list.get(i8)).intValue();
                this.f8953b[i8] = ((Float) list2.get(i8)).floatValue();
            }
        }

        a(int i8, int i9) {
            this.f8952a = new int[]{i8, i9};
            this.f8953b = new float[]{0.0f, 1.0f};
        }

        a(int i8, int i9, int i10) {
            this.f8952a = new int[]{i8, i9, i10};
            this.f8953b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
