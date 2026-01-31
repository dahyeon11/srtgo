package Y2;

import a3.g;
import a3.k;
import a3.o;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class a extends Drawable implements o, androidx.core.graphics.drawable.b {

    /* renamed from: a, reason: collision with root package name */
    private b f5594a;

    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        g f5595a;

        /* renamed from: b, reason: collision with root package name */
        boolean f5596b;

        public b(g gVar) {
            this.f5595a = gVar;
            this.f5596b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public a newDrawable() {
            return new a(new b(this));
        }

        public b(b bVar) {
            this.f5595a = (g) bVar.f5595a.getConstantState().newDrawable();
            this.f5596b = bVar.f5596b;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f5594a;
        if (bVar.f5596b) {
            bVar.f5595a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5594a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5594a.f5595a.getOpacity();
    }

    @Override // a3.o
    public k getShapeAppearanceModel() {
        return this.f5594a.f5595a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5594a.f5595a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f5594a.f5595a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zShouldDrawRippleCompat = Y2.b.shouldDrawRippleCompat(iArr);
        b bVar = this.f5594a;
        if (bVar.f5596b == zShouldDrawRippleCompat) {
            return zOnStateChange;
        }
        bVar.f5596b = zShouldDrawRippleCompat;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f5594a.f5595a.setAlpha(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5594a.f5595a.setColorFilter(colorFilter);
    }

    @Override // a3.o
    public void setShapeAppearanceModel(k kVar) {
        this.f5594a.f5595a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i8) {
        this.f5594a.f5595a.setTint(i8);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f5594a.f5595a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f5594a.f5595a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    @Override // android.graphics.drawable.Drawable
    public a mutate() {
        this.f5594a = new b(this.f5594a);
        return this;
    }

    private a(b bVar) {
        this.f5594a = bVar;
    }
}
