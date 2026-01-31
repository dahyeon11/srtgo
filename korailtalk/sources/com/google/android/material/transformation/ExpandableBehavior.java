package com.google.android.material.transformation;

import U2.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0985p0;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private int f25443a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f25444a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25445b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f25446c;

        a(View view, int i8, b bVar) {
            this.f25444a = view;
            this.f25445b = i8;
            this.f25446c = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f25444a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f25443a == this.f25445b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b bVar = this.f25446c;
                expandableBehavior.d((View) bVar, this.f25444a, bVar.isExpanded(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f25443a = 0;
    }

    private boolean b(boolean z8) {
        if (!z8) {
            return this.f25443a == 1;
        }
        int i8 = this.f25443a;
        return i8 == 0 || i8 == 2;
    }

    public static <T extends ExpandableBehavior> T from(View view, Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c behavior = ((CoordinatorLayout.f) layoutParams).getBehavior();
        if (behavior instanceof ExpandableBehavior) {
            return cls.cast(behavior);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected b c(CoordinatorLayout coordinatorLayout, View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = dependencies.get(i8);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (b) view2;
            }
        }
        return null;
    }

    protected abstract boolean d(View view, View view2, boolean z8, boolean z9);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = (b) view2;
        if (!b(bVar.isExpanded())) {
            return false;
        }
        this.f25443a = bVar.isExpanded() ? 1 : 2;
        return d((View) bVar, view, bVar.isExpanded(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i8) {
        b bVarC;
        if (AbstractC0985p0.isLaidOut(view) || (bVarC = c(coordinatorLayout, view)) == null || !b(bVarC.isExpanded())) {
            return false;
        }
        int i9 = bVarC.isExpanded() ? 1 : 2;
        this.f25443a = i9;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i9, bVarC));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25443a = 0;
    }
}
