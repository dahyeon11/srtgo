package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0985p0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private TypedValue f6787a;

    /* renamed from: b, reason: collision with root package name */
    private TypedValue f6788b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f6789c;

    /* renamed from: d, reason: collision with root package name */
    private TypedValue f6790d;

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f6791e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f6792f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f6793g;

    /* renamed from: h, reason: collision with root package name */
    private a f6794h;

    public interface a {
        void onAttachedFromWindow();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void dispatchFitSystemWindows(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f6791e == null) {
            this.f6791e = new TypedValue();
        }
        return this.f6791e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f6792f == null) {
            this.f6792f = new TypedValue();
        }
        return this.f6792f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f6789c == null) {
            this.f6789c = new TypedValue();
        }
        return this.f6789c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f6790d == null) {
            this.f6790d = new TypedValue();
        }
        return this.f6790d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f6787a == null) {
            this.f6787a = new TypedValue();
        }
        return this.f6787a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f6788b == null) {
            this.f6788b = new TypedValue();
        }
        return this.f6788b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f6794h;
        if (aVar != null) {
            aVar.onAttachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f6794h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f6794h = aVar;
    }

    public void setDecorPadding(int i8, int i9, int i10, int i11) {
        this.f6793g.set(i8, i9, i10, i11);
        if (AbstractC0985p0.isLaidOut(this)) {
            requestLayout();
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f6793g = new Rect();
    }
}
