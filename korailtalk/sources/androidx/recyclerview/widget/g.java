package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class g {

    /* renamed from: b, reason: collision with root package name */
    int f10593b;

    /* renamed from: c, reason: collision with root package name */
    int f10594c;

    /* renamed from: d, reason: collision with root package name */
    int f10595d;

    /* renamed from: e, reason: collision with root package name */
    int f10596e;

    /* renamed from: h, reason: collision with root package name */
    boolean f10599h;

    /* renamed from: i, reason: collision with root package name */
    boolean f10600i;

    /* renamed from: a, reason: collision with root package name */
    boolean f10592a = true;

    /* renamed from: f, reason: collision with root package name */
    int f10597f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f10598g = 0;

    g() {
    }

    boolean a(RecyclerView.B b9) {
        int i8 = this.f10594c;
        return i8 >= 0 && i8 < b9.getItemCount();
    }

    View b(RecyclerView.w wVar) {
        View viewForPosition = wVar.getViewForPosition(this.f10594c);
        this.f10594c += this.f10595d;
        return viewForPosition;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f10593b + ", mCurrentPosition=" + this.f10594c + ", mItemDirection=" + this.f10595d + ", mLayoutDirection=" + this.f10596e + ", mStartLine=" + this.f10597f + ", mEndLine=" + this.f10598g + '}';
    }
}
