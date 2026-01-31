package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class f0 extends c0 implements d0 {

    /* renamed from: J, reason: collision with root package name */
    private static Method f7106J;

    /* renamed from: I, reason: collision with root package name */
    private d0 f7107I;

    public static class a extends X {

        /* renamed from: o, reason: collision with root package name */
        final int f7108o;

        /* renamed from: p, reason: collision with root package name */
        final int f7109p;

        /* renamed from: q, reason: collision with root package name */
        private d0 f7110q;

        /* renamed from: r, reason: collision with root package name */
        private MenuItem f7111r;

        public a(Context context, boolean z8) {
            super(context, z8);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f7108o = 21;
                this.f7109p = 22;
            } else {
                this.f7108o = 22;
                this.f7109p = 21;
            }
        }

        public void clearSelection() {
            setSelection(-1);
        }

        @Override // androidx.appcompat.widget.X, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.X, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.X, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.X, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.X
        public /* bridge */ /* synthetic */ int lookForSelectablePosition(int i8, boolean z8) {
            return super.lookForSelectablePosition(i8, z8);
        }

        @Override // androidx.appcompat.widget.X
        public /* bridge */ /* synthetic */ int measureHeightOfChildrenCompat(int i8, int i9, int i10, int i11, int i12) {
            return super.measureHeightOfChildrenCompat(i8, i9, i10, i11, i12);
        }

        @Override // androidx.appcompat.widget.X
        public /* bridge */ /* synthetic */ boolean onForwardedEvent(MotionEvent motionEvent, int i8) {
            return super.onForwardedEvent(motionEvent, i8);
        }

        @Override // androidx.appcompat.widget.X, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i8;
            if (this.f7110q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.h item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i8 = iPointToPosition - headersCount) < 0 || i8 >= dVar.getCount()) ? null : dVar.getItem(i8);
                MenuItem menuItem = this.f7111r;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e adapterMenu = dVar.getAdapterMenu();
                    if (menuItem != null) {
                        this.f7110q.onItemHoverExit(adapterMenu, menuItem);
                    }
                    this.f7111r = item;
                    if (item != null) {
                        this.f7110q.onItemHoverEnter(adapterMenu, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i8, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i8 == this.f7108o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i8 != this.f7109p) {
                return super.onKeyDown(i8, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).getAdapterMenu().close(false);
            return true;
        }

        @Override // androidx.appcompat.widget.X, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(d0 d0Var) {
            this.f7110q = d0Var;
        }

        @Override // androidx.appcompat.widget.X, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f7106J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public f0(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }

    @Override // androidx.appcompat.widget.c0
    X b(Context context, boolean z8) {
        a aVar = new a(context, z8);
        aVar.setHoverListener(this);
        return aVar;
    }

    @Override // androidx.appcompat.widget.d0
    public void onItemHoverEnter(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        d0 d0Var = this.f7107I;
        if (d0Var != null) {
            d0Var.onItemHoverEnter(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void onItemHoverExit(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        d0 d0Var = this.f7107I;
        if (d0Var != null) {
            d0Var.onItemHoverExit(eVar, menuItem);
        }
    }

    public void setEnterTransition(Object obj) {
        this.f7060F.setEnterTransition((Transition) obj);
    }

    public void setExitTransition(Object obj) {
        this.f7060F.setExitTransition((Transition) obj);
    }

    public void setHoverListener(d0 d0Var) {
        this.f7107I = d0Var;
    }

    public void setTouchModal(boolean z8) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f7060F.setTouchModal(z8);
            return;
        }
        Method method = f7106J;
        if (method != null) {
            try {
                method.invoke(this.f7060F, Boolean.valueOf(z8));
            } catch (Exception unused) {
            }
        }
    }
}
