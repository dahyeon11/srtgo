package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class n extends RecyclerView.m {

    /* renamed from: g, reason: collision with root package name */
    boolean f10620g = true;

    public abstract boolean animateAdd(RecyclerView.E e8);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateAppearance(RecyclerView.E e8, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i8;
        int i9;
        return (cVar == null || ((i8 = cVar.left) == (i9 = cVar2.left) && cVar.top == cVar2.top)) ? animateAdd(e8) : animateMove(e8, i8, cVar.top, i9, cVar2.top);
    }

    public abstract boolean animateChange(RecyclerView.E e8, RecyclerView.E e9, int i8, int i9, int i10, int i11);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateChange(RecyclerView.E e8, RecyclerView.E e9, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i8;
        int i9;
        int i10 = cVar.left;
        int i11 = cVar.top;
        if (e9.C()) {
            int i12 = cVar.left;
            i9 = cVar.top;
            i8 = i12;
        } else {
            i8 = cVar2.left;
            i9 = cVar2.top;
        }
        return animateChange(e8, e9, i10, i11, i8, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateDisappearance(RecyclerView.E e8, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i8 = cVar.left;
        int i9 = cVar.top;
        View view = e8.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.left;
        int top = cVar2 == null ? view.getTop() : cVar2.top;
        if (e8.p() || (i8 == left && i9 == top)) {
            return animateRemove(e8);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(e8, i8, i9, left, top);
    }

    public abstract boolean animateMove(RecyclerView.E e8, int i8, int i9, int i10, int i11);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animatePersistence(RecyclerView.E e8, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i8 = cVar.left;
        int i9 = cVar2.left;
        if (i8 != i9 || cVar.top != cVar2.top) {
            return animateMove(e8, i8, cVar.top, i9, cVar2.top);
        }
        dispatchMoveFinished(e8);
        return false;
    }

    public abstract boolean animateRemove(RecyclerView.E e8);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canReuseUpdatedViewHolder(RecyclerView.E e8) {
        return !this.f10620g || e8.o();
    }

    public final void dispatchAddFinished(RecyclerView.E e8) {
        onAddFinished(e8);
        dispatchAnimationFinished(e8);
    }

    public final void dispatchAddStarting(RecyclerView.E e8) {
        onAddStarting(e8);
    }

    public final void dispatchChangeFinished(RecyclerView.E e8, boolean z8) {
        onChangeFinished(e8, z8);
        dispatchAnimationFinished(e8);
    }

    public final void dispatchChangeStarting(RecyclerView.E e8, boolean z8) {
        onChangeStarting(e8, z8);
    }

    public final void dispatchMoveFinished(RecyclerView.E e8) {
        onMoveFinished(e8);
        dispatchAnimationFinished(e8);
    }

    public final void dispatchMoveStarting(RecyclerView.E e8) {
        onMoveStarting(e8);
    }

    public final void dispatchRemoveFinished(RecyclerView.E e8) {
        onRemoveFinished(e8);
        dispatchAnimationFinished(e8);
    }

    public final void dispatchRemoveStarting(RecyclerView.E e8) {
        onRemoveStarting(e8);
    }

    public boolean getSupportsChangeAnimations() {
        return this.f10620g;
    }

    public void onAddFinished(RecyclerView.E e8) {
    }

    public void onAddStarting(RecyclerView.E e8) {
    }

    public void onChangeFinished(RecyclerView.E e8, boolean z8) {
    }

    public void onChangeStarting(RecyclerView.E e8, boolean z8) {
    }

    public void onMoveFinished(RecyclerView.E e8) {
    }

    public void onMoveStarting(RecyclerView.E e8) {
    }

    public void onRemoveFinished(RecyclerView.E e8) {
    }

    public void onRemoveStarting(RecyclerView.E e8) {
    }

    public void setSupportsChangeAnimations(boolean z8) {
        this.f10620g = z8;
    }
}
