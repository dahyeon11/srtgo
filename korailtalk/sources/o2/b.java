package O2;

import O2.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class b extends FrameLayout implements d {

    /* renamed from: a, reason: collision with root package name */
    private final c f3400a;

    public b(Context context) {
        this(context, null);
    }

    @Override // O2.d, O2.c.a
    public void actualDraw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // O2.d, O2.c.a
    public boolean actualIsOpaque() {
        return super.isOpaque();
    }

    @Override // O2.d
    public void buildCircularRevealCache() {
        this.f3400a.buildCircularRevealCache();
    }

    @Override // O2.d
    public void destroyCircularRevealCache() {
        this.f3400a.destroyCircularRevealCache();
    }

    @Override // android.view.View, O2.d
    public void draw(Canvas canvas) {
        c cVar = this.f3400a;
        if (cVar != null) {
            cVar.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // O2.d
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f3400a.getCircularRevealOverlayDrawable();
    }

    @Override // O2.d
    public int getCircularRevealScrimColor() {
        return this.f3400a.getCircularRevealScrimColor();
    }

    @Override // O2.d
    public d.e getRevealInfo() {
        return this.f3400a.getRevealInfo();
    }

    @Override // android.view.View, O2.d
    public boolean isOpaque() {
        c cVar = this.f3400a;
        return cVar != null ? cVar.isOpaque() : super.isOpaque();
    }

    @Override // O2.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f3400a.setCircularRevealOverlayDrawable(drawable);
    }

    @Override // O2.d
    public void setCircularRevealScrimColor(int i8) {
        this.f3400a.setCircularRevealScrimColor(i8);
    }

    @Override // O2.d
    public void setRevealInfo(d.e eVar) {
        this.f3400a.setRevealInfo(eVar);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3400a = new c(this);
    }
}
