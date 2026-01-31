package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C0949d0;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.core.view.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949d0 {

    /* renamed from: a, reason: collision with root package name */
    private final c f9181a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.d0$a */
    static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final View f9182a;

        a(View view) {
            this.f9182a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // androidx.core.view.C0949d0.c
        void a() {
            View view = this.f9182a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f9182a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.C0949d0.c
        void b() {
            final View viewFindViewById = this.f9182a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f9182a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C0949d0.a.d(viewFindViewById);
                }
            });
        }
    }

    /* renamed from: androidx.core.view.d0$c */
    private static class c {
        c() {
        }

        abstract void a();

        abstract void b();
    }

    public C0949d0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9181a = new b(view);
        } else {
            this.f9181a = new a(view);
        }
    }

    public void hide() {
        this.f9181a.a();
    }

    public void show() {
        this.f9181a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.d0$b */
    static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private View f9183b;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsetsController f9184c;

        b(View view) {
            super(view);
            this.f9183b = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i8) {
            atomicBoolean.set((i8 & 8) != 0);
        }

        @Override // androidx.core.view.C0949d0.a, androidx.core.view.C0949d0.c
        void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f9184c;
            if (windowInsetsController == null) {
                View view2 = this.f9183b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.k0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i8) {
                    C0949d0.b.f(atomicBoolean, windowInsetsController2, i8);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f9183b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f9183b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.C0949d0.a, androidx.core.view.C0949d0.c
        void b() {
            View view = this.f9183b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f9184c;
            if (windowInsetsController == null) {
                View view2 = this.f9183b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            } else {
                super.b();
            }
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f9184c = windowInsetsController;
        }
    }

    C0949d0(WindowInsetsController windowInsetsController) {
        this.f9181a = new b(windowInsetsController);
    }
}
