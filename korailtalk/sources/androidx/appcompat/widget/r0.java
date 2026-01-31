package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;
import i.AbstractC5638a;

/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7226a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f7227b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f7228c;

    private r0(Context context, TypedArray typedArray) {
        this.f7226a = context;
        this.f7227b = typedArray;
    }

    public static r0 obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        return new r0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public boolean getBoolean(int i8, boolean z8) {
        return this.f7227b.getBoolean(i8, z8);
    }

    public int getChangingConfigurations() {
        return this.f7227b.getChangingConfigurations();
    }

    public int getColor(int i8, int i9) {
        return this.f7227b.getColor(i8, i9);
    }

    public ColorStateList getColorStateList(int i8) {
        int resourceId;
        ColorStateList colorStateList;
        return (!this.f7227b.hasValue(i8) || (resourceId = this.f7227b.getResourceId(i8, 0)) == 0 || (colorStateList = AbstractC5638a.getColorStateList(this.f7226a, resourceId)) == null) ? this.f7227b.getColorStateList(i8) : colorStateList;
    }

    public float getDimension(int i8, float f8) {
        return this.f7227b.getDimension(i8, f8);
    }

    public int getDimensionPixelOffset(int i8, int i9) {
        return this.f7227b.getDimensionPixelOffset(i8, i9);
    }

    public int getDimensionPixelSize(int i8, int i9) {
        return this.f7227b.getDimensionPixelSize(i8, i9);
    }

    public Drawable getDrawable(int i8) {
        int resourceId;
        return (!this.f7227b.hasValue(i8) || (resourceId = this.f7227b.getResourceId(i8, 0)) == 0) ? this.f7227b.getDrawable(i8) : AbstractC5638a.getDrawable(this.f7226a, resourceId);
    }

    public Drawable getDrawableIfKnown(int i8) {
        int resourceId;
        if (!this.f7227b.hasValue(i8) || (resourceId = this.f7227b.getResourceId(i8, 0)) == 0) {
            return null;
        }
        return C0850j.get().b(this.f7226a, resourceId, true);
    }

    public float getFloat(int i8, float f8) {
        return this.f7227b.getFloat(i8, f8);
    }

    public Typeface getFont(int i8, int i9, h.f fVar) {
        int resourceId = this.f7227b.getResourceId(i8, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f7228c == null) {
            this.f7228c = new TypedValue();
        }
        return androidx.core.content.res.h.getFont(this.f7226a, resourceId, this.f7228c, i9, fVar);
    }

    public float getFraction(int i8, int i9, int i10, float f8) {
        return this.f7227b.getFraction(i8, i9, i10, f8);
    }

    public int getIndex(int i8) {
        return this.f7227b.getIndex(i8);
    }

    public int getIndexCount() {
        return this.f7227b.getIndexCount();
    }

    public int getInt(int i8, int i9) {
        return this.f7227b.getInt(i8, i9);
    }

    public int getInteger(int i8, int i9) {
        return this.f7227b.getInteger(i8, i9);
    }

    public int getLayoutDimension(int i8, String str) {
        return this.f7227b.getLayoutDimension(i8, str);
    }

    public String getNonResourceString(int i8) {
        return this.f7227b.getNonResourceString(i8);
    }

    public String getPositionDescription() {
        return this.f7227b.getPositionDescription();
    }

    public int getResourceId(int i8, int i9) {
        return this.f7227b.getResourceId(i8, i9);
    }

    public Resources getResources() {
        return this.f7227b.getResources();
    }

    public String getString(int i8) {
        return this.f7227b.getString(i8);
    }

    public CharSequence getText(int i8) {
        return this.f7227b.getText(i8);
    }

    public CharSequence[] getTextArray(int i8) {
        return this.f7227b.getTextArray(i8);
    }

    public int getType(int i8) {
        return this.f7227b.getType(i8);
    }

    public boolean getValue(int i8, TypedValue typedValue) {
        return this.f7227b.getValue(i8, typedValue);
    }

    public TypedArray getWrappedTypeArray() {
        return this.f7227b;
    }

    public boolean hasValue(int i8) {
        return this.f7227b.hasValue(i8);
    }

    public int length() {
        return this.f7227b.length();
    }

    public TypedValue peekValue(int i8) {
        return this.f7227b.peekValue(i8);
    }

    public void recycle() {
        this.f7227b.recycle();
    }

    public static r0 obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9) {
        return new r0(context, context.obtainStyledAttributes(attributeSet, iArr, i8, i9));
    }

    public int getLayoutDimension(int i8, int i9) {
        return this.f7227b.getLayoutDimension(i8, i9);
    }

    public static r0 obtainStyledAttributes(Context context, int i8, int[] iArr) {
        return new r0(context, context.obtainStyledAttributes(i8, iArr));
    }
}
