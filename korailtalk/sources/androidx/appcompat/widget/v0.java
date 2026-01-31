package androidx.appcompat.widget;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.AbstractC0993t0;

/* loaded from: classes.dex */
class v0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    private static v0 f7255j;

    /* renamed from: k, reason: collision with root package name */
    private static v0 f7256k;

    /* renamed from: a, reason: collision with root package name */
    private final View f7257a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f7258b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7259c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f7260d = new a();

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f7261e = new b();

    /* renamed from: f, reason: collision with root package name */
    private int f7262f;

    /* renamed from: g, reason: collision with root package name */
    private int f7263g;

    /* renamed from: h, reason: collision with root package name */
    private w0 f7264h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7265i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            v0.this.f(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v0.this.c();
        }
    }

    private v0(View view, CharSequence charSequence) {
        this.f7257a = view;
        this.f7258b = charSequence;
        this.f7259c = AbstractC0993t0.getScaledHoverSlop(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f7257a.removeCallbacks(this.f7260d);
    }

    private void b() {
        this.f7262f = Integer.MAX_VALUE;
        this.f7263g = Integer.MAX_VALUE;
    }

    private void d() {
        this.f7257a.postDelayed(this.f7260d, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(v0 v0Var) {
        v0 v0Var2 = f7255j;
        if (v0Var2 != null) {
            v0Var2.a();
        }
        f7255j = v0Var;
        if (v0Var != null) {
            v0Var.d();
        }
    }

    private boolean g(MotionEvent motionEvent) {
        int x8 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        if (Math.abs(x8 - this.f7262f) <= this.f7259c && Math.abs(y8 - this.f7263g) <= this.f7259c) {
            return false;
        }
        this.f7262f = x8;
        this.f7263g = y8;
        return true;
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        v0 v0Var = f7255j;
        if (v0Var != null && v0Var.f7257a == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new v0(view, charSequence);
            return;
        }
        v0 v0Var2 = f7256k;
        if (v0Var2 != null && v0Var2.f7257a == view) {
            v0Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    void c() {
        if (f7256k == this) {
            f7256k = null;
            w0 w0Var = this.f7264h;
            if (w0Var != null) {
                w0Var.c();
                this.f7264h = null;
                b();
                this.f7257a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f7255j == this) {
            e(null);
        }
        this.f7257a.removeCallbacks(this.f7261e);
    }

    void f(boolean z8) throws Resources.NotFoundException {
        long longPressTimeout;
        long j8;
        long j9;
        if (AbstractC0985p0.isAttachedToWindow(this.f7257a)) {
            e(null);
            v0 v0Var = f7256k;
            if (v0Var != null) {
                v0Var.c();
            }
            f7256k = this;
            this.f7265i = z8;
            w0 w0Var = new w0(this.f7257a.getContext());
            this.f7264h = w0Var;
            w0Var.e(this.f7257a, this.f7262f, this.f7263g, this.f7265i, this.f7258b);
            this.f7257a.addOnAttachStateChangeListener(this);
            if (this.f7265i) {
                j9 = 2500;
            } else {
                if ((AbstractC0985p0.getWindowSystemUiVisibility(this.f7257a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j8 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j8 = 15000;
                }
                j9 = j8 - longPressTimeout;
            }
            this.f7257a.removeCallbacks(this.f7261e);
            this.f7257a.postDelayed(this.f7261e, j9);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f7264h != null && this.f7265i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f7257a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f7257a.isEnabled() && this.f7264h == null && g(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f7262f = view.getWidth() / 2;
        this.f7263g = view.getHeight() / 2;
        f(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
