package com.google.android.material.internal;

import X2.a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.text.y;
import androidx.core.view.A;
import androidx.core.view.AbstractC0985p0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b0, reason: collision with root package name */
    private static final boolean f24931b0 = false;

    /* renamed from: c0, reason: collision with root package name */
    private static final Paint f24932c0 = null;

    /* renamed from: A, reason: collision with root package name */
    private boolean f24933A;

    /* renamed from: B, reason: collision with root package name */
    private Bitmap f24934B;

    /* renamed from: C, reason: collision with root package name */
    private Paint f24935C;

    /* renamed from: D, reason: collision with root package name */
    private float f24936D;

    /* renamed from: E, reason: collision with root package name */
    private float f24937E;

    /* renamed from: F, reason: collision with root package name */
    private int[] f24938F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f24939G;

    /* renamed from: H, reason: collision with root package name */
    private final TextPaint f24940H;

    /* renamed from: I, reason: collision with root package name */
    private final TextPaint f24941I;

    /* renamed from: J, reason: collision with root package name */
    private TimeInterpolator f24942J;

    /* renamed from: K, reason: collision with root package name */
    private TimeInterpolator f24943K;

    /* renamed from: L, reason: collision with root package name */
    private float f24944L;

    /* renamed from: M, reason: collision with root package name */
    private float f24945M;

    /* renamed from: N, reason: collision with root package name */
    private float f24946N;

    /* renamed from: O, reason: collision with root package name */
    private ColorStateList f24947O;

    /* renamed from: P, reason: collision with root package name */
    private float f24948P;

    /* renamed from: Q, reason: collision with root package name */
    private float f24949Q;

    /* renamed from: R, reason: collision with root package name */
    private float f24950R;

    /* renamed from: S, reason: collision with root package name */
    private ColorStateList f24951S;

    /* renamed from: T, reason: collision with root package name */
    private float f24952T;

    /* renamed from: U, reason: collision with root package name */
    private float f24953U;

    /* renamed from: V, reason: collision with root package name */
    private StaticLayout f24954V;

    /* renamed from: W, reason: collision with root package name */
    private float f24955W;

    /* renamed from: X, reason: collision with root package name */
    private float f24956X;

    /* renamed from: Y, reason: collision with root package name */
    private float f24957Y;

    /* renamed from: Z, reason: collision with root package name */
    private CharSequence f24958Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f24959a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24961b;

    /* renamed from: c, reason: collision with root package name */
    private float f24962c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f24963d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f24964e;

    /* renamed from: f, reason: collision with root package name */
    private final RectF f24965f;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f24970k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f24971l;

    /* renamed from: m, reason: collision with root package name */
    private float f24972m;

    /* renamed from: n, reason: collision with root package name */
    private float f24973n;

    /* renamed from: o, reason: collision with root package name */
    private float f24974o;

    /* renamed from: p, reason: collision with root package name */
    private float f24975p;

    /* renamed from: q, reason: collision with root package name */
    private float f24976q;

    /* renamed from: r, reason: collision with root package name */
    private float f24977r;

    /* renamed from: s, reason: collision with root package name */
    private Typeface f24978s;

    /* renamed from: t, reason: collision with root package name */
    private Typeface f24979t;

    /* renamed from: u, reason: collision with root package name */
    private Typeface f24980u;

    /* renamed from: v, reason: collision with root package name */
    private X2.a f24981v;

    /* renamed from: w, reason: collision with root package name */
    private X2.a f24982w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f24983x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f24984y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f24985z;

    /* renamed from: g, reason: collision with root package name */
    private int f24966g = 16;

    /* renamed from: h, reason: collision with root package name */
    private int f24967h = 16;

    /* renamed from: i, reason: collision with root package name */
    private float f24968i = 15.0f;

    /* renamed from: j, reason: collision with root package name */
    private float f24969j = 15.0f;

    /* renamed from: a0, reason: collision with root package name */
    private int f24960a0 = 1;

    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0201a implements a.InterfaceC0085a {
        C0201a() {
        }

        @Override // X2.a.InterfaceC0085a
        public void apply(Typeface typeface) {
            a.this.setCollapsedTypeface(typeface);
        }
    }

    class b implements a.InterfaceC0085a {
        b() {
        }

        @Override // X2.a.InterfaceC0085a
        public void apply(Typeface typeface) {
            a.this.setExpandedTypeface(typeface);
        }
    }

    public a(View view) {
        this.f24959a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f24940H = textPaint;
        this.f24941I = new TextPaint(textPaint);
        this.f24964e = new Rect();
        this.f24963d = new Rect();
        this.f24965f = new RectF();
    }

    private void A(float f8) {
        f(f8);
        boolean z8 = f24931b0 && this.f24936D != 1.0f;
        this.f24933A = z8;
        if (z8) {
            j();
        }
        AbstractC0985p0.postInvalidateOnAnimation(this.f24959a);
    }

    private boolean B() {
        return (this.f24960a0 <= 1 || this.f24985z || this.f24933A) ? false : true;
    }

    private static int a(int i8, int i9, float f8) {
        float f9 = 1.0f - f8;
        return Color.argb((int) ((Color.alpha(i8) * f9) + (Color.alpha(i9) * f8)), (int) ((Color.red(i8) * f9) + (Color.red(i9) * f8)), (int) ((Color.green(i8) * f9) + (Color.green(i9) * f8)), (int) ((Color.blue(i8) * f9) + (Color.blue(i9) * f8)));
    }

    private void b() {
        StaticLayout staticLayout;
        float f8 = this.f24937E;
        f(this.f24969j);
        CharSequence charSequence = this.f24984y;
        if (charSequence != null && (staticLayout = this.f24954V) != null) {
            this.f24958Z = TextUtils.ellipsize(charSequence, this.f24940H, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f24958Z;
        float fMeasureText = charSequence2 != null ? this.f24940H.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = A.getAbsoluteGravity(this.f24967h, this.f24985z ? 1 : 0);
        int i8 = absoluteGravity & 112;
        if (i8 == 48) {
            this.f24973n = this.f24964e.top;
        } else if (i8 != 80) {
            this.f24973n = this.f24964e.centerY() - ((this.f24940H.descent() - this.f24940H.ascent()) / 2.0f);
        } else {
            this.f24973n = this.f24964e.bottom + this.f24940H.ascent();
        }
        int i9 = absoluteGravity & A.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i9 == 1) {
            this.f24975p = this.f24964e.centerX() - (fMeasureText / 2.0f);
        } else if (i9 != 5) {
            this.f24975p = this.f24964e.left;
        } else {
            this.f24975p = this.f24964e.right - fMeasureText;
        }
        f(this.f24968i);
        float height = this.f24954V != null ? r1.getHeight() : 0.0f;
        CharSequence charSequence3 = this.f24984y;
        float fMeasureText2 = charSequence3 != null ? this.f24940H.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout2 = this.f24954V;
        if (staticLayout2 != null && this.f24960a0 > 1 && !this.f24985z) {
            fMeasureText2 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f24954V;
        this.f24957Y = staticLayout3 != null ? staticLayout3.getLineLeft(0) : 0.0f;
        int absoluteGravity2 = A.getAbsoluteGravity(this.f24966g, this.f24985z ? 1 : 0);
        int i10 = absoluteGravity2 & 112;
        if (i10 == 48) {
            this.f24972m = this.f24963d.top;
        } else if (i10 != 80) {
            this.f24972m = this.f24963d.centerY() - (height / 2.0f);
        } else {
            this.f24972m = (this.f24963d.bottom - height) + this.f24940H.descent();
        }
        int i11 = absoluteGravity2 & A.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i11 == 1) {
            this.f24974o = this.f24963d.centerX() - (fMeasureText2 / 2.0f);
        } else if (i11 != 5) {
            this.f24974o = this.f24963d.left;
        } else {
            this.f24974o = this.f24963d.right - fMeasureText2;
        }
        g();
        A(f8);
    }

    private void c() {
        e(this.f24962c);
    }

    private boolean d(CharSequence charSequence) {
        return (s() ? y.FIRSTSTRONG_RTL : y.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    private void e(float f8) {
        q(f8);
        this.f24976q = t(this.f24974o, this.f24975p, f8, this.f24942J);
        this.f24977r = t(this.f24972m, this.f24973n, f8, this.f24942J);
        A(t(this.f24968i, this.f24969j, f8, this.f24943K));
        TimeInterpolator timeInterpolator = K2.a.FAST_OUT_SLOW_IN_INTERPOLATOR;
        w(1.0f - t(0.0f, 1.0f, 1.0f - f8, timeInterpolator));
        y(t(1.0f, 0.0f, f8, timeInterpolator));
        if (this.f24971l != this.f24970k) {
            this.f24940H.setColor(a(n(), getCurrentCollapsedTextColor(), f8));
        } else {
            this.f24940H.setColor(getCurrentCollapsedTextColor());
        }
        float f9 = this.f24952T;
        float f10 = this.f24953U;
        if (f9 != f10) {
            this.f24940H.setLetterSpacing(t(f10, f9, f8, timeInterpolator));
        } else {
            this.f24940H.setLetterSpacing(f9);
        }
        this.f24940H.setShadowLayer(t(this.f24948P, this.f24944L, f8, null), t(this.f24949Q, this.f24945M, f8, null), t(this.f24950R, this.f24946N, f8, null), a(m(this.f24951S), m(this.f24947O), f8));
        AbstractC0985p0.postInvalidateOnAnimation(this.f24959a);
    }

    private void f(float f8) {
        boolean z8;
        float f9;
        boolean z9;
        if (this.f24983x == null) {
            return;
        }
        float fWidth = this.f24964e.width();
        float fWidth2 = this.f24963d.width();
        if (r(f8, this.f24969j)) {
            f9 = this.f24969j;
            this.f24936D = 1.0f;
            Typeface typeface = this.f24980u;
            Typeface typeface2 = this.f24978s;
            if (typeface != typeface2) {
                this.f24980u = typeface2;
                z9 = true;
            } else {
                z9 = false;
            }
        } else {
            float f10 = this.f24968i;
            Typeface typeface3 = this.f24980u;
            Typeface typeface4 = this.f24979t;
            if (typeface3 != typeface4) {
                this.f24980u = typeface4;
                z8 = true;
            } else {
                z8 = false;
            }
            if (r(f8, f10)) {
                this.f24936D = 1.0f;
            } else {
                this.f24936D = f8 / this.f24968i;
            }
            float f11 = this.f24969j / this.f24968i;
            fWidth = fWidth2 * f11 > fWidth ? Math.min(fWidth / f11, fWidth2) : fWidth2;
            f9 = f10;
            z9 = z8;
        }
        if (fWidth > 0.0f) {
            z9 = this.f24937E != f9 || this.f24939G || z9;
            this.f24937E = f9;
            this.f24939G = false;
        }
        if (this.f24984y == null || z9) {
            this.f24940H.setTextSize(this.f24937E);
            this.f24940H.setTypeface(this.f24980u);
            this.f24940H.setLinearText(this.f24936D != 1.0f);
            this.f24985z = d(this.f24983x);
            StaticLayout staticLayoutH = h(B() ? this.f24960a0 : 1, fWidth, this.f24985z);
            this.f24954V = staticLayoutH;
            this.f24984y = staticLayoutH.getText();
        }
    }

    private void g() {
        Bitmap bitmap = this.f24934B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f24934B = null;
        }
    }

    private StaticLayout h(int i8, float f8, boolean z8) {
        return (StaticLayout) Z.h.checkNotNull(h.obtain(this.f24983x, this.f24940H, (int) f8).setEllipsize(TextUtils.TruncateAt.END).setIsRtl(z8).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setMaxLines(i8).build());
    }

    private void i(Canvas canvas, float f8, float f9) {
        int alpha = this.f24940H.getAlpha();
        canvas.translate(f8, f9);
        float f10 = alpha;
        this.f24940H.setAlpha((int) (this.f24956X * f10));
        this.f24954V.draw(canvas);
        this.f24940H.setAlpha((int) (this.f24955W * f10));
        int lineBaseline = this.f24954V.getLineBaseline(0);
        CharSequence charSequence = this.f24958Z;
        float f11 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, this.f24940H);
        String strTrim = this.f24958Z.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f24940H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f24954V.getLineEnd(0), str.length()), 0.0f, f11, (Paint) this.f24940H);
    }

    private void j() {
        if (this.f24934B != null || this.f24963d.isEmpty() || TextUtils.isEmpty(this.f24984y)) {
            return;
        }
        e(0.0f);
        int width = this.f24954V.getWidth();
        int height = this.f24954V.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f24934B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f24954V.draw(new Canvas(this.f24934B));
        if (this.f24935C == null) {
            this.f24935C = new Paint(3);
        }
    }

    private float k(int i8, int i9) {
        return (i9 == 17 || (i9 & 7) == 1) ? (i8 / 2.0f) - (calculateCollapsedTextWidth() / 2.0f) : ((i9 & A.END) == 8388613 || (i9 & 5) == 5) ? this.f24985z ? this.f24964e.left : this.f24964e.right - calculateCollapsedTextWidth() : this.f24985z ? this.f24964e.right - calculateCollapsedTextWidth() : this.f24964e.left;
    }

    private float l(RectF rectF, int i8, int i9) {
        return (i9 == 17 || (i9 & 7) == 1) ? (i8 / 2.0f) + (calculateCollapsedTextWidth() / 2.0f) : ((i9 & A.END) == 8388613 || (i9 & 5) == 5) ? this.f24985z ? rectF.left + calculateCollapsedTextWidth() : this.f24964e.right : this.f24985z ? this.f24964e.right : rectF.left + calculateCollapsedTextWidth();
    }

    private int m(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f24938F;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int n() {
        return m(this.f24970k);
    }

    private void o(TextPaint textPaint) {
        textPaint.setTextSize(this.f24969j);
        textPaint.setTypeface(this.f24978s);
        textPaint.setLetterSpacing(this.f24952T);
    }

    private void p(TextPaint textPaint) {
        textPaint.setTextSize(this.f24968i);
        textPaint.setTypeface(this.f24979t);
        textPaint.setLetterSpacing(this.f24953U);
    }

    private void q(float f8) {
        this.f24965f.left = t(this.f24963d.left, this.f24964e.left, f8, this.f24942J);
        this.f24965f.top = t(this.f24972m, this.f24973n, f8, this.f24942J);
        this.f24965f.right = t(this.f24963d.right, this.f24964e.right, f8, this.f24942J);
        this.f24965f.bottom = t(this.f24963d.bottom, this.f24964e.bottom, f8, this.f24942J);
    }

    private static boolean r(float f8, float f9) {
        return Math.abs(f8 - f9) < 0.001f;
    }

    private boolean s() {
        return AbstractC0985p0.getLayoutDirection(this.f24959a) == 1;
    }

    private static float t(float f8, float f9, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        return K2.a.lerp(f8, f9, f10);
    }

    private static boolean v(Rect rect, int i8, int i9, int i10, int i11) {
        return rect.left == i8 && rect.top == i9 && rect.right == i10 && rect.bottom == i11;
    }

    private void w(float f8) {
        this.f24955W = f8;
        AbstractC0985p0.postInvalidateOnAnimation(this.f24959a);
    }

    private boolean x(Typeface typeface) {
        X2.a aVar = this.f24982w;
        if (aVar != null) {
            aVar.cancel();
        }
        if (this.f24978s == typeface) {
            return false;
        }
        this.f24978s = typeface;
        return true;
    }

    private void y(float f8) {
        this.f24956X = f8;
        AbstractC0985p0.postInvalidateOnAnimation(this.f24959a);
    }

    private boolean z(Typeface typeface) {
        X2.a aVar = this.f24981v;
        if (aVar != null) {
            aVar.cancel();
        }
        if (this.f24979t == typeface) {
            return false;
        }
        this.f24979t = typeface;
        return true;
    }

    public float calculateCollapsedTextWidth() {
        if (this.f24983x == null) {
            return 0.0f;
        }
        o(this.f24941I);
        TextPaint textPaint = this.f24941I;
        CharSequence charSequence = this.f24983x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f24984y == null || !this.f24961b) {
            return;
        }
        boolean z8 = false;
        float lineLeft = (this.f24976q + this.f24954V.getLineLeft(0)) - (this.f24957Y * 2.0f);
        this.f24940H.setTextSize(this.f24937E);
        float f8 = this.f24976q;
        float f9 = this.f24977r;
        if (this.f24933A && this.f24934B != null) {
            z8 = true;
        }
        float f10 = this.f24936D;
        if (f10 != 1.0f) {
            canvas.scale(f10, f10, f8, f9);
        }
        if (z8) {
            canvas.drawBitmap(this.f24934B, f8, f9, this.f24935C);
            canvas.restoreToCount(iSave);
            return;
        }
        if (B()) {
            i(canvas, lineLeft, f9);
        } else {
            canvas.translate(f8, f9);
            this.f24954V.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public void getCollapsedTextActualBounds(RectF rectF, int i8, int i9) {
        this.f24985z = d(this.f24983x);
        rectF.left = k(i8, i9);
        rectF.top = this.f24964e.top;
        rectF.right = l(rectF, i8, i9);
        rectF.bottom = this.f24964e.top + getCollapsedTextHeight();
    }

    public ColorStateList getCollapsedTextColor() {
        return this.f24971l;
    }

    public int getCollapsedTextGravity() {
        return this.f24967h;
    }

    public float getCollapsedTextHeight() {
        o(this.f24941I);
        return -this.f24941I.ascent();
    }

    public float getCollapsedTextSize() {
        return this.f24969j;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.f24978s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCurrentCollapsedTextColor() {
        return m(this.f24971l);
    }

    public ColorStateList getExpandedTextColor() {
        return this.f24970k;
    }

    public int getExpandedTextGravity() {
        return this.f24966g;
    }

    public float getExpandedTextHeight() {
        p(this.f24941I);
        return -this.f24941I.ascent();
    }

    public float getExpandedTextSize() {
        return this.f24968i;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.f24979t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float getExpansionFraction() {
        return this.f24962c;
    }

    public int getMaxLines() {
        return this.f24960a0;
    }

    public CharSequence getText() {
        return this.f24983x;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f24971l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f24970k) != null && colorStateList.isStateful());
    }

    public void recalculate() {
        if (this.f24959a.getHeight() <= 0 || this.f24959a.getWidth() <= 0) {
            return;
        }
        b();
        c();
    }

    public void setCollapsedBounds(int i8, int i9, int i10, int i11) {
        if (v(this.f24964e, i8, i9, i10, i11)) {
            return;
        }
        this.f24964e.set(i8, i9, i10, i11);
        this.f24939G = true;
        u();
    }

    public void setCollapsedTextAppearance(int i8) {
        X2.d dVar = new X2.d(this.f24959a.getContext(), i8);
        ColorStateList colorStateList = dVar.textColor;
        if (colorStateList != null) {
            this.f24971l = colorStateList;
        }
        float f8 = dVar.textSize;
        if (f8 != 0.0f) {
            this.f24969j = f8;
        }
        ColorStateList colorStateList2 = dVar.shadowColor;
        if (colorStateList2 != null) {
            this.f24947O = colorStateList2;
        }
        this.f24945M = dVar.shadowDx;
        this.f24946N = dVar.shadowDy;
        this.f24944L = dVar.shadowRadius;
        this.f24952T = dVar.letterSpacing;
        X2.a aVar = this.f24982w;
        if (aVar != null) {
            aVar.cancel();
        }
        this.f24982w = new X2.a(new C0201a(), dVar.getFallbackFont());
        dVar.getFontAsync(this.f24959a.getContext(), this.f24982w);
        recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.f24971l != colorStateList) {
            this.f24971l = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedTextGravity(int i8) {
        if (this.f24967h != i8) {
            this.f24967h = i8;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f8) {
        if (this.f24969j != f8) {
            this.f24969j = f8;
            recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (x(typeface)) {
            recalculate();
        }
    }

    public void setExpandedBounds(int i8, int i9, int i10, int i11) {
        if (v(this.f24963d, i8, i9, i10, i11)) {
            return;
        }
        this.f24963d.set(i8, i9, i10, i11);
        this.f24939G = true;
        u();
    }

    public void setExpandedTextAppearance(int i8) {
        X2.d dVar = new X2.d(this.f24959a.getContext(), i8);
        ColorStateList colorStateList = dVar.textColor;
        if (colorStateList != null) {
            this.f24970k = colorStateList;
        }
        float f8 = dVar.textSize;
        if (f8 != 0.0f) {
            this.f24968i = f8;
        }
        ColorStateList colorStateList2 = dVar.shadowColor;
        if (colorStateList2 != null) {
            this.f24951S = colorStateList2;
        }
        this.f24949Q = dVar.shadowDx;
        this.f24950R = dVar.shadowDy;
        this.f24948P = dVar.shadowRadius;
        this.f24953U = dVar.letterSpacing;
        X2.a aVar = this.f24981v;
        if (aVar != null) {
            aVar.cancel();
        }
        this.f24981v = new X2.a(new b(), dVar.getFallbackFont());
        dVar.getFontAsync(this.f24959a.getContext(), this.f24981v);
        recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.f24970k != colorStateList) {
            this.f24970k = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextGravity(int i8) {
        if (this.f24966g != i8) {
            this.f24966g = i8;
            recalculate();
        }
    }

    public void setExpandedTextSize(float f8) {
        if (this.f24968i != f8) {
            this.f24968i = f8;
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (z(typeface)) {
            recalculate();
        }
    }

    public void setExpansionFraction(float f8) {
        float fClamp = X.a.clamp(f8, 0.0f, 1.0f);
        if (fClamp != this.f24962c) {
            this.f24962c = fClamp;
            c();
        }
    }

    public void setMaxLines(int i8) {
        if (i8 != this.f24960a0) {
            this.f24960a0 = i8;
            g();
            recalculate();
        }
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f24942J = timeInterpolator;
        recalculate();
    }

    public final boolean setState(int[] iArr) {
        this.f24938F = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f24983x, charSequence)) {
            this.f24983x = charSequence;
            this.f24984y = null;
            g();
            recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.f24943K = timeInterpolator;
        recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        boolean zX = x(typeface);
        boolean z8 = z(typeface);
        if (zX || z8) {
            recalculate();
        }
    }

    void u() {
        this.f24961b = this.f24964e.width() > 0 && this.f24964e.height() > 0 && this.f24963d.width() > 0 && this.f24963d.height() > 0;
    }

    public void setCollapsedBounds(Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setExpandedBounds(Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }
}
