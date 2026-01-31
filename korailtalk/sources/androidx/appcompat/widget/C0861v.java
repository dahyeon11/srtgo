package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import h.AbstractC5563a;

/* renamed from: androidx.appcompat.widget.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0861v extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    private final C0862w f7254a;

    public C0861v(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f7254a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f7254a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f7254a.g(canvas);
    }

    public C0861v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5563a.seekBarStyle);
    }

    public C0861v(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        n0.checkAppCompatTheme(this, getContext());
        C0862w c0862w = new C0862w(this);
        this.f7254a = c0862w;
        c0862w.c(attributeSet, i8);
    }
}
