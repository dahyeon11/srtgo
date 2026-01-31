package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class q0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f7222b;

    public q0(Context context, Resources resources) {
        super(resources);
        this.f7222b = new WeakReference(context);
    }

    @Override // androidx.appcompat.widget.h0, android.content.res.Resources
    public Drawable getDrawable(int i8) {
        Drawable drawable = super.getDrawable(i8);
        Context context = (Context) this.f7222b.get();
        if (drawable != null && context != null) {
            g0.get().r(context, i8, drawable);
        }
        return drawable;
    }
}
