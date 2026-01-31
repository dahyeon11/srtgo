package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
class a extends b {
    a() {
    }

    private static float e(float f8) {
        return (float) (1.0d - Math.cos((f8 * 3.141592653589793d) / 2.0d));
    }

    private static float f(float f8) {
        return (float) Math.sin((f8 * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.b
    void c(TabLayout tabLayout, View view, View view2, float f8, Drawable drawable) {
        float f9;
        float fE;
        RectF rectFA = b.a(tabLayout, view);
        RectF rectFA2 = b.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            f9 = e(f8);
            fE = f(f8);
        } else {
            f9 = f(f8);
            fE = e(f8);
        }
        drawable.setBounds(K2.a.lerp((int) rectFA.left, (int) rectFA2.left, f9), drawable.getBounds().top, K2.a.lerp((int) rectFA.right, (int) rectFA2.right, fE), drawable.getBounds().bottom);
    }
}
