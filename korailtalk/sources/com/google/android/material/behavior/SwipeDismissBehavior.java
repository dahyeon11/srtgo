package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.accessibility.H;
import androidx.core.view.accessibility.O;
import d0.C5301c;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;

    /* renamed from: a, reason: collision with root package name */
    C5301c f24335a;

    /* renamed from: b, reason: collision with root package name */
    c f24336b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24337c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24339e;

    /* renamed from: d, reason: collision with root package name */
    private float f24338d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    int f24340f = 2;

    /* renamed from: g, reason: collision with root package name */
    float f24341g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    float f24342h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    float f24343i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    private final C5301c.AbstractC0272c f24344j = new a();

    class a extends C5301c.AbstractC0272c {

        /* renamed from: a, reason: collision with root package name */
        private int f24345a;

        /* renamed from: b, reason: collision with root package name */
        private int f24346b = -1;

        a() {
        }

        private boolean a(View view, float f8) {
            if (f8 == 0.0f) {
                return Math.abs(view.getLeft() - this.f24345a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f24341g);
            }
            boolean z8 = AbstractC0985p0.getLayoutDirection(view) == 1;
            int i8 = SwipeDismissBehavior.this.f24340f;
            if (i8 == 2) {
                return true;
            }
            if (i8 == 0) {
                if (z8) {
                    if (f8 >= 0.0f) {
                        return false;
                    }
                } else if (f8 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i8 != 1) {
                return false;
            }
            if (z8) {
                if (f8 <= 0.0f) {
                    return false;
                }
            } else if (f8 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // d0.C5301c.AbstractC0272c
        public int clampViewPositionHorizontal(View view, int i8, int i9) {
            int width;
            int width2;
            int width3;
            boolean z8 = AbstractC0985p0.getLayoutDirection(view) == 1;
            int i10 = SwipeDismissBehavior.this.f24340f;
            if (i10 == 0) {
                if (z8) {
                    width = this.f24345a - view.getWidth();
                    width2 = this.f24345a;
                } else {
                    width = this.f24345a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i10 != 1) {
                width = this.f24345a - view.getWidth();
                width2 = view.getWidth() + this.f24345a;
            } else if (z8) {
                width = this.f24345a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f24345a - view.getWidth();
                width2 = this.f24345a;
            }
            return SwipeDismissBehavior.b(width, i8, width2);
        }

        @Override // d0.C5301c.AbstractC0272c
        public int clampViewPositionVertical(View view, int i8, int i9) {
            return view.getTop();
        }

        @Override // d0.C5301c.AbstractC0272c
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onViewCaptured(View view, int i8) {
            this.f24346b = i8;
            this.f24345a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onViewDragStateChanged(int i8) {
            c cVar = SwipeDismissBehavior.this.f24336b;
            if (cVar != null) {
                cVar.onDragStateChanged(i8);
            }
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onViewPositionChanged(View view, int i8, int i9, int i10, int i11) {
            float width = this.f24345a + (view.getWidth() * SwipeDismissBehavior.this.f24342h);
            float width2 = this.f24345a + (view.getWidth() * SwipeDismissBehavior.this.f24343i);
            float f8 = i8;
            if (f8 <= width) {
                view.setAlpha(1.0f);
            } else if (f8 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - SwipeDismissBehavior.d(width, width2, f8), 1.0f));
            }
        }

        @Override // d0.C5301c.AbstractC0272c
        public void onViewReleased(View view, float f8, float f9) {
            int i8;
            boolean z8;
            c cVar;
            this.f24346b = -1;
            int width = view.getWidth();
            if (a(view, f8)) {
                int left = view.getLeft();
                int i9 = this.f24345a;
                i8 = left < i9 ? i9 - width : i9 + width;
                z8 = true;
            } else {
                i8 = this.f24345a;
                z8 = false;
            }
            if (SwipeDismissBehavior.this.f24335a.settleCapturedViewAt(i8, view.getTop())) {
                AbstractC0985p0.postOnAnimation(view, new d(view, z8));
            } else {
                if (!z8 || (cVar = SwipeDismissBehavior.this.f24336b) == null) {
                    return;
                }
                cVar.onDismiss(view);
            }
        }

        @Override // d0.C5301c.AbstractC0272c
        public boolean tryCaptureView(View view, int i8) {
            int i9 = this.f24346b;
            return (i9 == -1 || i9 == i8) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    }

    class b implements O {
        b() {
        }

        @Override // androidx.core.view.accessibility.O
        public boolean perform(View view, O.a aVar) {
            if (!SwipeDismissBehavior.this.canSwipeDismissView(view)) {
                return false;
            }
            boolean z8 = AbstractC0985p0.getLayoutDirection(view) == 1;
            int i8 = SwipeDismissBehavior.this.f24340f;
            AbstractC0985p0.offsetLeftAndRight(view, (!(i8 == 0 && z8) && (i8 != 1 || z8)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f24336b;
            if (cVar != null) {
                cVar.onDismiss(view);
            }
            return true;
        }
    }

    public interface c {
        void onDismiss(View view);

        void onDragStateChanged(int i8);
    }

    private class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final View f24349a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f24350b;

        d(View view, boolean z8) {
            this.f24349a = view;
            this.f24350b = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            C5301c c5301c = SwipeDismissBehavior.this.f24335a;
            if (c5301c != null && c5301c.continueSettling(true)) {
                AbstractC0985p0.postOnAnimation(this.f24349a, this);
            } else {
                if (!this.f24350b || (cVar = SwipeDismissBehavior.this.f24336b) == null) {
                    return;
                }
                cVar.onDismiss(this.f24349a);
            }
        }
    }

    static float a(float f8, float f9, float f10) {
        return Math.min(Math.max(f8, f9), f10);
    }

    static int b(int i8, int i9, int i10) {
        return Math.min(Math.max(i8, i9), i10);
    }

    private void c(ViewGroup viewGroup) {
        if (this.f24335a == null) {
            this.f24335a = this.f24339e ? C5301c.create(viewGroup, this.f24338d, this.f24344j) : C5301c.create(viewGroup, this.f24344j);
        }
    }

    static float d(float f8, float f9, float f10) {
        return (f10 - f8) / (f9 - f8);
    }

    private void e(View view) {
        AbstractC0985p0.removeAccessibilityAction(view, 1048576);
        if (canSwipeDismissView(view)) {
            AbstractC0985p0.replaceAccessibilityAction(view, H.a.ACTION_DISMISS, null, new b());
        }
    }

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    public int getDragState() {
        C5301c c5301c = this.f24335a;
        if (c5301c != null) {
            return c5301c.getViewDragState();
        }
        return 0;
    }

    public c getListener() {
        return this.f24336b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.f24337c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v8, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f24337c = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f24337c = false;
        }
        if (!zIsPointInChildBounds) {
            return false;
        }
        c(coordinatorLayout);
        return this.f24335a.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v8, int i8) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v8, i8);
        if (AbstractC0985p0.getImportantForAccessibility(v8) == 0) {
            AbstractC0985p0.setImportantForAccessibility(v8, 1);
            e(v8);
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        C5301c c5301c = this.f24335a;
        if (c5301c == null) {
            return false;
        }
        c5301c.processTouchEvent(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f8) {
        this.f24341g = a(0.0f, f8, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f8) {
        this.f24343i = a(0.0f, f8, 1.0f);
    }

    public void setListener(c cVar) {
        this.f24336b = cVar;
    }

    public void setSensitivity(float f8) {
        this.f24338d = f8;
        this.f24339e = true;
    }

    public void setStartAlphaSwipeDistance(float f8) {
        this.f24342h = a(0.0f, f8, 1.0f);
    }

    public void setSwipeDirection(int i8) {
        this.f24340f = i8;
    }
}
