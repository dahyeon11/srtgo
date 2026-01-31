package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.AbstractC0985p0;
import h.AbstractC5572j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class K {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f6823l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f6824m = new ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    private static ConcurrentHashMap f6825n = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private int f6826a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6827b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f6828c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f6829d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f6830e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f6831f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f6832g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f6833h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f6834i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f6835j;

    /* renamed from: k, reason: collision with root package name */
    private final c f6836k;

    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.K.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) K.n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.K.a, androidx.appcompat.widget.K.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.K.c
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class c {
        c() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) K.n(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    K(TextView textView) {
        this.f6834i = textView;
        this.f6835j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6836k = new b();
        } else {
            this.f6836k = new a();
        }
    }

    private void A(float f8, float f9, float f10) {
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f8 + "px) is less or equal to (0px)");
        }
        if (f9 <= f8) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f9 + "px) is less or equal to minimum auto-size text size (" + f8 + "px)");
        }
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
        }
        this.f6826a = 1;
        this.f6829d = f8;
        this.f6830e = f9;
        this.f6828c = f10;
        this.f6832g = false;
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (i8 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i8)) < 0) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr2[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f6826a = 0;
        this.f6829d = -1.0f;
        this.f6830e = -1.0f;
        this.f6828c = -1.0f;
        this.f6831f = new int[0];
        this.f6827b = false;
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i8, int i9) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f6833h, i8);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.f6834i.getLineSpacingExtra(), this.f6834i.getLineSpacingMultiplier()).setIncludePad(this.f6834i.getIncludeFontPadding()).setBreakStrategy(this.f6834i.getBreakStrategy()).setHyphenationFrequency(this.f6834i.getHyphenationFrequency());
        if (i9 == -1) {
            i9 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i9);
        try {
            this.f6836k.a(builderObtain, this.f6834i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }

    private int f(RectF rectF) {
        int length = this.f6831f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i8 = 1;
        int i9 = length - 1;
        int i10 = 0;
        while (i8 <= i9) {
            int i11 = (i8 + i9) / 2;
            if (y(this.f6831f[i11], rectF)) {
                int i12 = i11 + 1;
                i10 = i8;
                i8 = i12;
            } else {
                i10 = i11 - 1;
                i9 = i10;
            }
        }
        return this.f6831f[i10];
    }

    private static Method l(String str) throws SecurityException {
        try {
            Method declaredMethod = (Method) f6824m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f6824m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e8);
            return null;
        }
    }

    static Object n(Object obj, String str, Object obj2) {
        try {
            return l(str).invoke(obj, null);
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e8);
            return obj2;
        }
    }

    private void t(float f8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f8 != this.f6834i.getPaint().getTextSize()) {
            this.f6834i.getPaint().setTextSize(f8);
            boolean zIsInLayout = this.f6834i.isInLayout();
            if (this.f6834i.getLayout() != null) {
                this.f6827b = false;
                try {
                    Method methodL = l("nullLayouts");
                    if (methodL != null) {
                        methodL.invoke(this.f6834i, null);
                    }
                } catch (Exception e8) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e8);
                }
                if (zIsInLayout) {
                    this.f6834i.forceLayout();
                } else {
                    this.f6834i.requestLayout();
                }
                this.f6834i.invalidate();
            }
        }
    }

    private boolean v() {
        if (z() && this.f6826a == 1) {
            if (!this.f6832g || this.f6831f.length == 0) {
                int iFloor = ((int) Math.floor((this.f6830e - this.f6829d) / this.f6828c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i8 = 0; i8 < iFloor; i8++) {
                    iArr[i8] = Math.round(this.f6829d + (i8 * this.f6828c));
                }
                this.f6831f = b(iArr);
            }
            this.f6827b = true;
        } else {
            this.f6827b = false;
        }
        return this.f6827b;
    }

    private void w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i8 = 0; i8 < length; i8++) {
                iArr[i8] = typedArray.getDimensionPixelSize(i8, -1);
            }
            this.f6831f = b(iArr);
            x();
        }
    }

    private boolean x() {
        boolean z8 = this.f6831f.length > 0;
        this.f6832g = z8;
        if (z8) {
            this.f6826a = 1;
            this.f6829d = r0[0];
            this.f6830e = r0[r1 - 1];
            this.f6828c = -1.0f;
        }
        return z8;
    }

    private boolean y(int i8, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f6834i.getText();
        TransformationMethod transformationMethod = this.f6834i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f6834i)) != null) {
            text = transformation;
        }
        int maxLines = this.f6834i.getMaxLines();
        m(i8);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) n(this.f6834i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean z() {
        return !(this.f6834i instanceof C0851k);
    }

    void a() {
        if (o()) {
            if (this.f6827b) {
                if (this.f6834i.getMeasuredHeight() <= 0 || this.f6834i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f6836k.b(this.f6834i) ? 1048576 : (this.f6834i.getMeasuredWidth() - this.f6834i.getTotalPaddingLeft()) - this.f6834i.getTotalPaddingRight();
                int height = (this.f6834i.getHeight() - this.f6834i.getCompoundPaddingBottom()) - this.f6834i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f6823l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float f8 = f(rectF);
                        if (f8 != this.f6834i.getTextSize()) {
                            u(0, f8);
                        }
                    } finally {
                    }
                }
            }
            this.f6827b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i8, int i9) {
        return e(charSequence, alignment, i8, i9);
    }

    int g() {
        return Math.round(this.f6830e);
    }

    int h() {
        return Math.round(this.f6829d);
    }

    int i() {
        return Math.round(this.f6828c);
    }

    int[] j() {
        return this.f6831f;
    }

    int k() {
        return this.f6826a;
    }

    void m(int i8) {
        TextPaint textPaint = this.f6833h;
        if (textPaint == null) {
            this.f6833h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f6833h.set(this.f6834i.getPaint());
        this.f6833h.setTextSize(i8);
    }

    boolean o() {
        return z() && this.f6826a != 0;
    }

    void p(AttributeSet attributeSet, int i8) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f6835j.obtainStyledAttributes(attributeSet, AbstractC5572j.AppCompatTextView, i8, 0);
        TextView textView = this.f6834i;
        AbstractC0985p0.saveAttributeDataForStyleable(textView, textView.getContext(), AbstractC5572j.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes, i8, 0);
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTextView_autoSizeTextType)) {
            this.f6826a = typedArrayObtainStyledAttributes.getInt(AbstractC5572j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(AbstractC5572j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(AbstractC5572j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(AbstractC5572j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            w(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z()) {
            this.f6826a = 0;
            return;
        }
        if (this.f6826a == 1) {
            if (!this.f6832g) {
                DisplayMetrics displayMetrics = this.f6835j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                A(dimension2, dimension3, dimension);
            }
            v();
        }
    }

    void q(int i8, int i9, int i10, int i11) {
        if (z()) {
            DisplayMetrics displayMetrics = this.f6835j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(i11, i8, displayMetrics), TypedValue.applyDimension(i11, i9, displayMetrics), TypedValue.applyDimension(i11, i10, displayMetrics));
            if (v()) {
                a();
            }
        }
    }

    void r(int[] iArr, int i8) {
        if (z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i8 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f6835j.getResources().getDisplayMetrics();
                    for (int i9 = 0; i9 < length; i9++) {
                        iArrCopyOf[i9] = Math.round(TypedValue.applyDimension(i8, iArr[i9], displayMetrics));
                    }
                }
                this.f6831f = b(iArrCopyOf);
                if (!x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f6832g = false;
            }
            if (v()) {
                a();
            }
        }
    }

    void s(int i8) {
        if (z()) {
            if (i8 == 0) {
                c();
                return;
            }
            if (i8 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i8);
            }
            DisplayMetrics displayMetrics = this.f6835j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (v()) {
                a();
            }
        }
    }

    void u(int i8, float f8) {
        Context context = this.f6835j;
        t(TypedValue.applyDimension(i8, f8, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
