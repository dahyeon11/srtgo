package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class Z implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f9145a;

    /* renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f9146b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f9147c;

    private Z(View view, Runnable runnable) {
        this.f9145a = view;
        this.f9146b = view.getViewTreeObserver();
        this.f9147c = runnable;
    }

    public static Z add(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        Z z8 = new Z(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(z8);
        view.addOnAttachStateChangeListener(z8);
        return z8;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        removeListener();
        this.f9147c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f9146b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        removeListener();
    }

    public void removeListener() {
        if (this.f9146b.isAlive()) {
            this.f9146b.removeOnPreDrawListener(this);
        } else {
            this.f9145a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f9145a.removeOnAttachStateChangeListener(this);
    }
}
