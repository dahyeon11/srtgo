package L2;

import J2.d;
import L2.a;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.f;
import com.google.android.material.internal.l;

/* loaded from: classes2.dex */
public abstract class b {
    public static final boolean USE_COMPAT_PARENT = false;

    static class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Toolbar f3057a;

        /* renamed from: b */
        final /* synthetic */ int f3058b;

        /* renamed from: c */
        final /* synthetic */ L2.a f3059c;

        /* renamed from: d */
        final /* synthetic */ FrameLayout f3060d;

        a(Toolbar toolbar, int i8, L2.a aVar, FrameLayout frameLayout) {
            this.f3057a = toolbar;
            this.f3058b = i8;
            this.f3059c = aVar;
            this.f3060d = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuItemView actionMenuItemView = l.getActionMenuItemView(this.f3057a, this.f3058b);
            if (actionMenuItemView != null) {
                L2.a aVar = this.f3059c;
                aVar.setHorizontalOffset(aVar.getHorizontalOffset() + this.f3057a.getResources().getDimensionPixelOffset(d.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
                L2.a aVar2 = this.f3059c;
                aVar2.setVerticalOffset(aVar2.getVerticalOffset() + this.f3057a.getResources().getDimensionPixelOffset(d.mtrl_badge_toolbar_action_menu_item_vertical_offset));
                b.attachBadgeDrawable(this.f3059c, actionMenuItemView, this.f3060d);
            }
        }
    }

    public static void attachBadgeDrawable(L2.a aVar, View view) {
        attachBadgeDrawable(aVar, view, (FrameLayout) null);
    }

    public static SparseArray<L2.a> createBadgeDrawablesFromSavedStates(Context context, f fVar) {
        SparseArray<L2.a> sparseArray = new SparseArray<>(fVar.size());
        for (int i8 = 0; i8 < fVar.size(); i8++) {
            int iKeyAt = fVar.keyAt(i8);
            a.b bVar = (a.b) fVar.valueAt(i8);
            if (bVar == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(iKeyAt, L2.a.c(context, bVar));
        }
        return sparseArray;
    }

    public static f createParcelableBadgeStates(SparseArray<L2.a> sparseArray) {
        f fVar = new f();
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            int iKeyAt = sparseArray.keyAt(i8);
            L2.a aVarValueAt = sparseArray.valueAt(i8);
            if (aVarValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            fVar.put(iKeyAt, aVarValueAt.getSavedState());
        }
        return fVar;
    }

    public static void detachBadgeDrawable(L2.a aVar, View view) {
        if (aVar == null) {
            return;
        }
        if (USE_COMPAT_PARENT || aVar.getCustomBadgeParent() != null) {
            aVar.getCustomBadgeParent().setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void setBadgeDrawableBounds(L2.a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.updateBadgeCoordinates(view, frameLayout);
    }

    public static void updateBadgeBounds(Rect rect, float f8, float f9, float f10, float f11) {
        rect.set((int) (f8 - f10), (int) (f9 - f11), (int) (f8 + f10), (int) (f9 + f11));
    }

    public static void attachBadgeDrawable(L2.a aVar, View view, FrameLayout frameLayout) {
        setBadgeDrawableBounds(aVar, view, frameLayout);
        if (aVar.getCustomBadgeParent() != null) {
            aVar.getCustomBadgeParent().setForeground(aVar);
        } else {
            if (USE_COMPAT_PARENT) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(aVar);
        }
    }

    public static void detachBadgeDrawable(L2.a aVar, Toolbar toolbar, int i8) {
        if (aVar == null) {
            return;
        }
        ActionMenuItemView actionMenuItemView = l.getActionMenuItemView(toolbar, i8);
        if (actionMenuItemView != null) {
            detachBadgeDrawable(aVar, actionMenuItemView);
            return;
        }
        Log.w("BadgeUtils", "Trying to remove badge from a null menuItemView: " + i8);
    }

    public static void attachBadgeDrawable(L2.a aVar, Toolbar toolbar, int i8) {
        attachBadgeDrawable(aVar, toolbar, i8, null);
    }

    public static void attachBadgeDrawable(L2.a aVar, Toolbar toolbar, int i8, FrameLayout frameLayout) {
        toolbar.post(new a(toolbar, i8, aVar, frameLayout));
    }
}
