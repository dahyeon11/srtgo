package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.o;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
class b {
    b() {
    }

    static RectF a(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.isTabIndicatorFullWidth() || !(view instanceof TabLayout.i)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.i) view, 24);
    }

    static RectF b(TabLayout.i iVar, int i8) {
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int iDpToPx = (int) o.dpToPx(iVar.getContext(), i8);
        if (contentWidth < iDpToPx) {
            contentWidth = iDpToPx;
        }
        int left = (iVar.getLeft() + iVar.getRight()) / 2;
        int top = (iVar.getTop() + iVar.getBottom()) / 2;
        int i9 = contentWidth / 2;
        return new RectF(left - i9, top - (contentHeight / 2), i9 + left, top + (left / 2));
    }

    void c(TabLayout tabLayout, View view, View view2, float f8, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(K2.a.lerp((int) rectFA.left, (int) rectFA2.left, f8), drawable.getBounds().top, K2.a.lerp((int) rectFA.right, (int) rectFA2.right, f8), drawable.getBounds().bottom);
    }

    void d(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
    }
}
