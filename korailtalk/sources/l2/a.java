package L2;

import J2.d;
import J2.f;
import J2.j;
import J2.k;
import J2.l;
import X2.c;
import a3.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0985p0;
import com.google.android.material.internal.i;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class a extends Drawable implements i.b {
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;

    /* renamed from: q, reason: collision with root package name */
    private static final int f3024q = k.Widget_MaterialComponents_Badge;

    /* renamed from: r, reason: collision with root package name */
    private static final int f3025r = J2.b.badgeStyle;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f3026a;

    /* renamed from: b, reason: collision with root package name */
    private final g f3027b;

    /* renamed from: c, reason: collision with root package name */
    private final i f3028c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f3029d;

    /* renamed from: e, reason: collision with root package name */
    private final float f3030e;

    /* renamed from: f, reason: collision with root package name */
    private final float f3031f;

    /* renamed from: g, reason: collision with root package name */
    private final float f3032g;

    /* renamed from: h, reason: collision with root package name */
    private final b f3033h;

    /* renamed from: i, reason: collision with root package name */
    private float f3034i;

    /* renamed from: j, reason: collision with root package name */
    private float f3035j;

    /* renamed from: k, reason: collision with root package name */
    private int f3036k;

    /* renamed from: l, reason: collision with root package name */
    private float f3037l;

    /* renamed from: m, reason: collision with root package name */
    private float f3038m;

    /* renamed from: n, reason: collision with root package name */
    private float f3039n;

    /* renamed from: o, reason: collision with root package name */
    private WeakReference f3040o;

    /* renamed from: p, reason: collision with root package name */
    private WeakReference f3041p;

    /* renamed from: L2.a$a, reason: collision with other inner class name */
    class RunnableC0051a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f3042a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f3043b;

        RunnableC0051a(View view, FrameLayout frameLayout) {
            this.f3042a = view;
            this.f3043b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            a.this.updateBadgeCoordinates(this.f3042a, this.f3043b);
        }
    }

    private a(Context context) throws Resources.NotFoundException {
        this.f3026a = new WeakReference(context);
        com.google.android.material.internal.k.checkMaterialTheme(context);
        Resources resources = context.getResources();
        this.f3029d = new Rect();
        this.f3027b = new g();
        this.f3030e = resources.getDimensionPixelSize(d.mtrl_badge_radius);
        this.f3032g = resources.getDimensionPixelSize(d.mtrl_badge_long_text_horizontal_padding);
        this.f3031f = resources.getDimensionPixelSize(d.mtrl_badge_with_text_radius);
        i iVar = new i(this);
        this.f3028c = iVar;
        iVar.getTextPaint().setTextAlign(Paint.Align.CENTER);
        this.f3033h = new b(context);
        j(k.TextAppearance_MaterialComponents_Badge);
    }

    private void a(Context context, Rect rect, View view) throws Resources.NotFoundException {
        int i8 = this.f3033h.f3053i;
        if (i8 == 8388691 || i8 == 8388693) {
            this.f3035j = rect.bottom - this.f3033h.f3056l;
        } else {
            this.f3035j = rect.top + this.f3033h.f3056l;
        }
        if (getNumber() <= 9) {
            float f8 = !hasNumber() ? this.f3030e : this.f3031f;
            this.f3037l = f8;
            this.f3039n = f8;
            this.f3038m = f8;
        } else {
            float f9 = this.f3031f;
            this.f3037l = f9;
            this.f3039n = f9;
            this.f3038m = (this.f3028c.getTextWidth(e()) / 2.0f) + this.f3032g;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(hasNumber() ? d.mtrl_badge_text_horizontal_edge_offset : d.mtrl_badge_horizontal_edge_offset);
        int i9 = this.f3033h.f3053i;
        if (i9 == 8388659 || i9 == 8388691) {
            this.f3034i = AbstractC0985p0.getLayoutDirection(view) == 0 ? (rect.left - this.f3038m) + dimensionPixelSize + this.f3033h.f3055k : ((rect.right + this.f3038m) - dimensionPixelSize) - this.f3033h.f3055k;
        } else {
            this.f3034i = AbstractC0985p0.getLayoutDirection(view) == 0 ? ((rect.right + this.f3038m) - dimensionPixelSize) - this.f3033h.f3055k : (rect.left - this.f3038m) + dimensionPixelSize + this.f3033h.f3055k;
        }
    }

    private static a b(Context context, AttributeSet attributeSet, int i8, int i9) throws Resources.NotFoundException {
        a aVar = new a(context);
        aVar.f(context, attributeSet, i8, i9);
        return aVar;
    }

    static a c(Context context, b bVar) throws Resources.NotFoundException {
        a aVar = new a(context);
        aVar.h(bVar);
        return aVar;
    }

    public static a create(Context context) {
        return b(context, null, f3025r, f3024q);
    }

    public static a createFromResource(Context context, int i8) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet drawableXml = S2.a.parseDrawableXml(context, i8, "badge");
        int styleAttribute = drawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = f3024q;
        }
        return b(context, drawableXml, f3025r, styleAttribute);
    }

    private void d(Canvas canvas) {
        Rect rect = new Rect();
        String strE = e();
        this.f3028c.getTextPaint().getTextBounds(strE, 0, strE.length(), rect);
        canvas.drawText(strE, this.f3034i, this.f3035j + (rect.height() / 2), this.f3028c.getTextPaint());
    }

    private String e() {
        if (getNumber() <= this.f3036k) {
            return NumberFormat.getInstance().format(getNumber());
        }
        Context context = (Context) this.f3026a.get();
        return context == null ? "" : context.getString(j.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.f3036k), "+");
    }

    private void f(Context context, AttributeSet attributeSet, int i8, int i9) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.k.obtainStyledAttributes(context, attributeSet, l.Badge, i8, i9, new int[0]);
        setMaxCharacterCount(typedArrayObtainStyledAttributes.getInt(l.Badge_maxCharacterCount, 4));
        if (typedArrayObtainStyledAttributes.hasValue(l.Badge_number)) {
            setNumber(typedArrayObtainStyledAttributes.getInt(l.Badge_number, 0));
        }
        setBackgroundColor(g(context, typedArrayObtainStyledAttributes, l.Badge_backgroundColor));
        if (typedArrayObtainStyledAttributes.hasValue(l.Badge_badgeTextColor)) {
            setBadgeTextColor(g(context, typedArrayObtainStyledAttributes, l.Badge_badgeTextColor));
        }
        setBadgeGravity(typedArrayObtainStyledAttributes.getInt(l.Badge_badgeGravity, TOP_END));
        setHorizontalOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.Badge_horizontalOffset, 0));
        setVerticalOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.Badge_verticalOffset, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    private static int g(Context context, TypedArray typedArray, int i8) {
        return c.getColorStateList(context, typedArray, i8).getDefaultColor();
    }

    private void h(b bVar) throws Resources.NotFoundException {
        setMaxCharacterCount(bVar.f3049e);
        if (bVar.f3048d != -1) {
            setNumber(bVar.f3048d);
        }
        setBackgroundColor(bVar.f3045a);
        setBadgeTextColor(bVar.f3046b);
        setBadgeGravity(bVar.f3053i);
        setHorizontalOffset(bVar.f3055k);
        setVerticalOffset(bVar.f3056l);
        setVisible(bVar.f3054j);
    }

    private void i(X2.d dVar) throws Resources.NotFoundException {
        Context context;
        if (this.f3028c.getTextAppearance() == dVar || (context = (Context) this.f3026a.get()) == null) {
            return;
        }
        this.f3028c.setTextAppearance(dVar, context);
        m();
    }

    private void j(int i8) throws Resources.NotFoundException {
        Context context = (Context) this.f3026a.get();
        if (context == null) {
            return;
        }
        i(new X2.d(context, i8));
    }

    private void k(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != f.mtrl_anchor_parent) {
            WeakReference weakReference = this.f3041p;
            if (weakReference == null || weakReference.get() != viewGroup) {
                l(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(f.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.f3041p = new WeakReference(frameLayout);
                frameLayout.post(new RunnableC0051a(view, frameLayout));
            }
        }
    }

    private static void l(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void m() throws Resources.NotFoundException {
        Context context = (Context) this.f3026a.get();
        WeakReference weakReference = this.f3040o;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f3029d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f3041p;
        ViewGroup viewGroup = weakReference2 != null ? (FrameLayout) weakReference2.get() : null;
        if (viewGroup != null || L2.b.USE_COMPAT_PARENT) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        a(context, rect2, view);
        L2.b.updateBadgeBounds(this.f3029d, this.f3034i, this.f3035j, this.f3038m, this.f3039n);
        this.f3027b.setCornerSize(this.f3037l);
        if (rect.equals(this.f3029d)) {
            return;
        }
        this.f3027b.setBounds(this.f3029d);
    }

    private void n() {
        this.f3036k = ((int) Math.pow(10.0d, getMaxCharacterCount() - 1.0d)) - 1;
    }

    public void clearNumber() {
        this.f3033h.f3048d = -1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f3027b.draw(canvas);
        if (hasNumber()) {
            d(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3033h.f3047c;
    }

    public int getBackgroundColor() {
        return this.f3027b.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.f3033h.f3053i;
    }

    public int getBadgeTextColor() {
        return this.f3028c.getTextPaint().getColor();
    }

    public CharSequence getContentDescription() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!hasNumber()) {
            return this.f3033h.f3050f;
        }
        if (this.f3033h.f3051g <= 0 || (context = (Context) this.f3026a.get()) == null) {
            return null;
        }
        return getNumber() <= this.f3036k ? context.getResources().getQuantityString(this.f3033h.f3051g, getNumber(), Integer.valueOf(getNumber())) : context.getString(this.f3033h.f3052h, Integer.valueOf(this.f3036k));
    }

    public FrameLayout getCustomBadgeParent() {
        WeakReference weakReference = this.f3041p;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.f3033h.f3055k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3029d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3029d.width();
    }

    public int getMaxCharacterCount() {
        return this.f3033h.f3049e;
    }

    public int getNumber() {
        if (hasNumber()) {
            return this.f3033h.f3048d;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public b getSavedState() {
        return this.f3033h;
    }

    public int getVerticalOffset() {
        return this.f3033h.f3056l;
    }

    public boolean hasNumber() {
        return this.f3033h.f3048d != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.i.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.i.b
    public void onTextSizeChange() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f3033h.f3047c = i8;
        this.f3028c.getTextPaint().setAlpha(i8);
        invalidateSelf();
    }

    public void setBackgroundColor(int i8) {
        this.f3033h.f3045a = i8;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i8);
        if (this.f3027b.getFillColor() != colorStateListValueOf) {
            this.f3027b.setFillColor(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public void setBadgeGravity(int i8) throws Resources.NotFoundException {
        if (this.f3033h.f3053i != i8) {
            this.f3033h.f3053i = i8;
            WeakReference weakReference = this.f3040o;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = (View) this.f3040o.get();
            WeakReference weakReference2 = this.f3041p;
            updateBadgeCoordinates(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
        }
    }

    public void setBadgeTextColor(int i8) {
        this.f3033h.f3046b = i8;
        if (this.f3028c.getTextPaint().getColor() != i8) {
            this.f3028c.getTextPaint().setColor(i8);
            invalidateSelf();
        }
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i8) {
        this.f3033h.f3052h = i8;
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.f3033h.f3050f = charSequence;
    }

    public void setContentDescriptionQuantityStringsResource(int i8) {
        this.f3033h.f3051g = i8;
    }

    public void setHorizontalOffset(int i8) {
        this.f3033h.f3055k = i8;
        m();
    }

    public void setMaxCharacterCount(int i8) throws Resources.NotFoundException {
        if (this.f3033h.f3049e != i8) {
            this.f3033h.f3049e = i8;
            n();
            this.f3028c.setTextWidthDirty(true);
            m();
            invalidateSelf();
        }
    }

    public void setNumber(int i8) throws Resources.NotFoundException {
        int iMax = Math.max(0, i8);
        if (this.f3033h.f3048d != iMax) {
            this.f3033h.f3048d = iMax;
            this.f3028c.setTextWidthDirty(true);
            m();
            invalidateSelf();
        }
    }

    public void setVerticalOffset(int i8) {
        this.f3033h.f3056l = i8;
        m();
    }

    public void setVisible(boolean z8) {
        setVisible(z8, false);
        this.f3033h.f3054j = z8;
        if (!L2.b.USE_COMPAT_PARENT || getCustomBadgeParent() == null || z8) {
            return;
        }
        ((ViewGroup) getCustomBadgeParent().getParent()).invalidate();
    }

    @Deprecated
    public void updateBadgeCoordinates(View view, ViewGroup viewGroup) throws Resources.NotFoundException {
        if (!(viewGroup instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        updateBadgeCoordinates(view, (FrameLayout) viewGroup);
    }

    public void updateBadgeCoordinates(View view) throws Resources.NotFoundException {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    public void updateBadgeCoordinates(View view, FrameLayout frameLayout) throws Resources.NotFoundException {
        this.f3040o = new WeakReference(view);
        boolean z8 = L2.b.USE_COMPAT_PARENT;
        if (z8 && frameLayout == null) {
            k(view);
        } else {
            this.f3041p = new WeakReference(frameLayout);
        }
        if (!z8) {
            l(view);
        }
        m();
        invalidateSelf();
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C0052a();

        /* renamed from: a, reason: collision with root package name */
        private int f3045a;

        /* renamed from: b, reason: collision with root package name */
        private int f3046b;

        /* renamed from: c, reason: collision with root package name */
        private int f3047c;

        /* renamed from: d, reason: collision with root package name */
        private int f3048d;

        /* renamed from: e, reason: collision with root package name */
        private int f3049e;

        /* renamed from: f, reason: collision with root package name */
        private CharSequence f3050f;

        /* renamed from: g, reason: collision with root package name */
        private int f3051g;

        /* renamed from: h, reason: collision with root package name */
        private int f3052h;

        /* renamed from: i, reason: collision with root package name */
        private int f3053i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f3054j;

        /* renamed from: k, reason: collision with root package name */
        private int f3055k;

        /* renamed from: l, reason: collision with root package name */
        private int f3056l;

        /* renamed from: L2.a$b$a, reason: collision with other inner class name */
        static class C0052a implements Parcelable.Creator {
            C0052a() {
            }

            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(Context context) {
            this.f3047c = 255;
            this.f3048d = -1;
            this.f3046b = new X2.d(context, k.TextAppearance_MaterialComponents_Badge).textColor.getDefaultColor();
            this.f3050f = context.getString(j.mtrl_badge_numberless_content_description);
            this.f3051g = J2.i.mtrl_badge_content_description;
            this.f3052h = j.mtrl_exceed_max_badge_number_content_description;
            this.f3054j = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f3045a);
            parcel.writeInt(this.f3046b);
            parcel.writeInt(this.f3047c);
            parcel.writeInt(this.f3048d);
            parcel.writeInt(this.f3049e);
            parcel.writeString(this.f3050f.toString());
            parcel.writeInt(this.f3051g);
            parcel.writeInt(this.f3053i);
            parcel.writeInt(this.f3055k);
            parcel.writeInt(this.f3056l);
            parcel.writeInt(this.f3054j ? 1 : 0);
        }

        protected b(Parcel parcel) {
            this.f3047c = 255;
            this.f3048d = -1;
            this.f3045a = parcel.readInt();
            this.f3046b = parcel.readInt();
            this.f3047c = parcel.readInt();
            this.f3048d = parcel.readInt();
            this.f3049e = parcel.readInt();
            this.f3050f = parcel.readString();
            this.f3051g = parcel.readInt();
            this.f3053i = parcel.readInt();
            this.f3055k = parcel.readInt();
            this.f3056l = parcel.readInt();
            this.f3054j = parcel.readInt() != 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
