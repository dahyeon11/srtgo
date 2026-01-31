package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
class a implements c {
    a() {
    }

    private d a(b bVar) {
        return (d) bVar.getCardBackground();
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList getBackgroundColor(b bVar) {
        return a(bVar).getColor();
    }

    @Override // androidx.cardview.widget.c
    public float getElevation(b bVar) {
        return bVar.getCardView().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public float getMaxElevation(b bVar) {
        return a(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public float getMinHeight(b bVar) {
        return getRadius(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public float getMinWidth(b bVar) {
        return getRadius(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public float getRadius(b bVar) {
        return a(bVar).getRadius();
    }

    @Override // androidx.cardview.widget.c
    public void initStatic() {
    }

    @Override // androidx.cardview.widget.c
    public void initialize(b bVar, Context context, ColorStateList colorStateList, float f8, float f9, float f10) {
        bVar.setCardBackground(new d(colorStateList, f8));
        View cardView = bVar.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f9);
        setMaxElevation(bVar, f10);
    }

    @Override // androidx.cardview.widget.c
    public void onCompatPaddingChanged(b bVar) {
        setMaxElevation(bVar, getMaxElevation(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void onPreventCornerOverlapChanged(b bVar) {
        setMaxElevation(bVar, getMaxElevation(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void setBackgroundColor(b bVar, ColorStateList colorStateList) {
        a(bVar).setColor(colorStateList);
    }

    @Override // androidx.cardview.widget.c
    public void setElevation(b bVar, float f8) {
        bVar.getCardView().setElevation(f8);
    }

    @Override // androidx.cardview.widget.c
    public void setMaxElevation(b bVar, float f8) {
        a(bVar).d(f8, bVar.getUseCompatPadding(), bVar.getPreventCornerOverlap());
        updatePadding(bVar);
    }

    @Override // androidx.cardview.widget.c
    public void setRadius(b bVar, float f8) {
        a(bVar).e(f8);
    }

    @Override // androidx.cardview.widget.c
    public void updatePadding(b bVar) {
        if (!bVar.getUseCompatPadding()) {
            bVar.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float maxElevation = getMaxElevation(bVar);
        float radius = getRadius(bVar);
        int iCeil = (int) Math.ceil(e.a(maxElevation, radius, bVar.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(e.b(maxElevation, radius, bVar.getPreventCornerOverlap()));
        bVar.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }
}
