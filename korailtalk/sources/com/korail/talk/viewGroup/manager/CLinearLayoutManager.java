package com.korail.talk.viewGroup.manager;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public class CLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: I, reason: collision with root package name */
    private boolean f29596I;

    public CLinearLayoutManager(Context context, int i8, boolean z8) {
        super(context, i8, z8);
        this.f29596I = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.f29596I && super.canScrollVertically();
    }

    public void setScrollEnabled(boolean z8) {
        this.f29596I = z8;
    }
}
