package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements androidx.appcompat.view.menu.l {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.view.menu.l
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.l
    public void initialize(androidx.appcompat.view.menu.e eVar) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
