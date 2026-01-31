package X2;

import J2.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.core.content.res.h;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f5424a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5425b = false;

    /* renamed from: c, reason: collision with root package name */
    private Typeface f5426c;
    public final String fontFamily;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    public final ColorStateList textColor;
    public final ColorStateList textColorHint;
    public final ColorStateList textColorLink;
    public float textSize;
    public final int textStyle;
    public final int typeface;

    class a extends h.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f5427a;

        a(f fVar) {
            this.f5427a = fVar;
        }

        @Override // androidx.core.content.res.h.f
        /* renamed from: onFontRetrievalFailed */
        public void c(int i8) {
            d.this.f5425b = true;
            this.f5427a.onFontRetrievalFailed(i8);
        }

        @Override // androidx.core.content.res.h.f
        /* renamed from: onFontRetrieved */
        public void d(Typeface typeface) {
            d dVar = d.this;
            dVar.f5426c = Typeface.create(typeface, dVar.textStyle);
            d.this.f5425b = true;
            this.f5427a.onFontRetrieved(d.this.f5426c, false);
        }
    }

    class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextPaint f5429a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f5430b;

        b(TextPaint textPaint, f fVar) {
            this.f5429a = textPaint;
            this.f5430b = fVar;
        }

        @Override // X2.f
        public void onFontRetrievalFailed(int i8) {
            this.f5430b.onFontRetrievalFailed(i8);
        }

        @Override // X2.f
        public void onFontRetrieved(Typeface typeface, boolean z8) {
            d.this.updateTextPaintMeasureState(this.f5429a, typeface);
            this.f5430b.onFontRetrieved(typeface, z8);
        }
    }

    public d(Context context, int i8) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i8, l.TextAppearance);
        this.textSize = typedArrayObtainStyledAttributes.getDimension(l.TextAppearance_android_textSize, 0.0f);
        this.textColor = c.getColorStateList(context, typedArrayObtainStyledAttributes, l.TextAppearance_android_textColor);
        this.textColorHint = c.getColorStateList(context, typedArrayObtainStyledAttributes, l.TextAppearance_android_textColorHint);
        this.textColorLink = c.getColorStateList(context, typedArrayObtainStyledAttributes, l.TextAppearance_android_textColorLink);
        this.textStyle = typedArrayObtainStyledAttributes.getInt(l.TextAppearance_android_textStyle, 0);
        this.typeface = typedArrayObtainStyledAttributes.getInt(l.TextAppearance_android_typeface, 1);
        int iA = c.a(typedArrayObtainStyledAttributes, l.TextAppearance_fontFamily, l.TextAppearance_android_fontFamily);
        this.f5424a = typedArrayObtainStyledAttributes.getResourceId(iA, 0);
        this.fontFamily = typedArrayObtainStyledAttributes.getString(iA);
        this.textAllCaps = typedArrayObtainStyledAttributes.getBoolean(l.TextAppearance_textAllCaps, false);
        this.shadowColor = c.getColorStateList(context, typedArrayObtainStyledAttributes, l.TextAppearance_android_shadowColor);
        this.shadowDx = typedArrayObtainStyledAttributes.getFloat(l.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = typedArrayObtainStyledAttributes.getFloat(l.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = typedArrayObtainStyledAttributes.getFloat(l.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i8, l.MaterialTextAppearance);
        this.hasLetterSpacing = typedArrayObtainStyledAttributes2.hasValue(l.MaterialTextAppearance_android_letterSpacing);
        this.letterSpacing = typedArrayObtainStyledAttributes2.getFloat(l.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f5426c == null && (str = this.fontFamily) != null) {
            this.f5426c = Typeface.create(str, this.textStyle);
        }
        if (this.f5426c == null) {
            int i8 = this.typeface;
            if (i8 == 1) {
                this.f5426c = Typeface.SANS_SERIF;
            } else if (i8 == 2) {
                this.f5426c = Typeface.SERIF;
            } else if (i8 != 3) {
                this.f5426c = Typeface.DEFAULT;
            } else {
                this.f5426c = Typeface.MONOSPACE;
            }
            this.f5426c = Typeface.create(this.f5426c, this.textStyle);
        }
    }

    private boolean e(Context context) {
        return e.shouldLoadFontSynchronously();
    }

    public Typeface getFallbackFont() {
        d();
        return this.f5426c;
    }

    public Typeface getFont(Context context) {
        if (this.f5425b) {
            return this.f5426c;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = h.getFont(context, this.f5424a);
                this.f5426c = font;
                if (font != null) {
                    this.f5426c = Typeface.create(font, this.textStyle);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.fontFamily);
            }
        }
        d();
        this.f5425b = true;
        return this.f5426c;
    }

    public void getFontAsync(Context context, f fVar) {
        if (e(context)) {
            getFont(context);
        } else {
            d();
        }
        int i8 = this.f5424a;
        if (i8 == 0) {
            this.f5425b = true;
        }
        if (this.f5425b) {
            fVar.onFontRetrieved(this.f5426c, true);
            return;
        }
        try {
            h.getFont(context, i8, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f5425b = true;
            fVar.onFontRetrievalFailed(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.fontFamily);
            this.f5425b = true;
            fVar.onFontRetrievalFailed(-3);
        }
    }

    public void updateDrawState(Context context, TextPaint textPaint, f fVar) {
        updateMeasureState(context, textPaint, fVar);
        ColorStateList colorStateList = this.textColor;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f8 = this.shadowRadius;
        float f9 = this.shadowDx;
        float f10 = this.shadowDy;
        ColorStateList colorStateList2 = this.shadowColor;
        textPaint.setShadowLayer(f8, f9, f10, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void updateMeasureState(Context context, TextPaint textPaint, f fVar) {
        if (e(context)) {
            updateTextPaintMeasureState(textPaint, getFont(context));
        } else {
            getFontAsync(context, textPaint, fVar);
        }
    }

    public void updateTextPaintMeasureState(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i8 = (~typeface.getStyle()) & this.textStyle;
        textPaint.setFakeBoldText((i8 & 1) != 0);
        textPaint.setTextSkewX((i8 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.textSize);
        if (this.hasLetterSpacing) {
            textPaint.setLetterSpacing(this.letterSpacing);
        }
    }

    public void getFontAsync(Context context, TextPaint textPaint, f fVar) {
        updateTextPaintMeasureState(textPaint, getFallbackFont());
        getFontAsync(context, new b(textPaint, fVar));
    }
}
