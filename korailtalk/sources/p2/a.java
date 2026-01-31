package P2;

import O2.c;
import O2.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class a extends com.google.android.material.card.a implements d {

    /* renamed from: r, reason: collision with root package name */
    private final c f3683r;

    public a(Context context) {
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
        this.f3683r.buildCircularRevealCache();
    }

    @Override // O2.d
    public void destroyCircularRevealCache() {
        this.f3683r.destroyCircularRevealCache();
    }

    @Override // android.view.View, O2.d
    public void draw(Canvas canvas) {
        c cVar = this.f3683r;
        if (cVar != null) {
            cVar.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // O2.d
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f3683r.getCircularRevealOverlayDrawable();
    }

    @Override // O2.d
    public int getCircularRevealScrimColor() {
        return this.f3683r.getCircularRevealScrimColor();
    }

    @Override // O2.d
    public d.e getRevealInfo() {
        return this.f3683r.getRevealInfo();
    }

    @Override // android.view.View, O2.d
    public boolean isOpaque() {
        c cVar = this.f3683r;
        return cVar != null ? cVar.isOpaque() : super.isOpaque();
    }

    @Override // O2.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f3683r.setCircularRevealOverlayDrawable(drawable);
    }

    @Override // O2.d
    public void setCircularRevealScrimColor(int i8) {
        this.f3683r.setCircularRevealScrimColor(i8);
    }

    @Override // O2.d
    public void setRevealInfo(d.e eVar) {
        this.f3683r.setRevealInfo(eVar);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3683r = new c(this);
    }
}
