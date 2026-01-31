package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import h.AbstractC5563a;

/* renamed from: androidx.appcompat.widget.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0858s extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    private final C0857q f7229a;

    public C0858s(Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        Bitmap bitmapB = this.f7229a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i8, 0), getMeasuredHeight());
        }
    }

    public C0858s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.ratingBarStyle);
    }

    public C0858s(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        n0.checkAppCompatTheme(this, getContext());
        C0857q c0857q = new C0857q(this);
        this.f7229a = c0857q;
        c0857q.c(attributeSet, i8);
    }
}
