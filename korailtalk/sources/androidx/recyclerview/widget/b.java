package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC0162b f10501a;

    /* renamed from: b, reason: collision with root package name */
    final a f10502b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List f10503c = new ArrayList();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f10504a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f10505b;

        a() {
        }

        private void c() {
            if (this.f10505b == null) {
                this.f10505b = new a();
            }
        }

        void a(int i8) {
            if (i8 < 64) {
                this.f10504a &= ~(1 << i8);
                return;
            }
            a aVar = this.f10505b;
            if (aVar != null) {
                aVar.a(i8 - 64);
            }
        }

        int b(int i8) {
            a aVar = this.f10505b;
            return aVar == null ? i8 >= 64 ? Long.bitCount(this.f10504a) : Long.bitCount(this.f10504a & ((1 << i8) - 1)) : i8 < 64 ? Long.bitCount(this.f10504a & ((1 << i8) - 1)) : aVar.b(i8 - 64) + Long.bitCount(this.f10504a);
        }

        boolean d(int i8) {
            if (i8 < 64) {
                return (this.f10504a & (1 << i8)) != 0;
            }
            c();
            return this.f10505b.d(i8 - 64);
        }

        void e(int i8, boolean z8) {
            if (i8 >= 64) {
                c();
                this.f10505b.e(i8 - 64, z8);
                return;
            }
            long j8 = this.f10504a;
            boolean z9 = (Long.MIN_VALUE & j8) != 0;
            long j9 = (1 << i8) - 1;
            this.f10504a = ((j8 & (~j9)) << 1) | (j8 & j9);
            if (z8) {
                h(i8);
            } else {
                a(i8);
            }
            if (z9 || this.f10505b != null) {
                c();
                this.f10505b.e(0, z9);
            }
        }

        boolean f(int i8) {
            if (i8 >= 64) {
                c();
                return this.f10505b.f(i8 - 64);
            }
            long j8 = 1 << i8;
            long j9 = this.f10504a;
            boolean z8 = (j9 & j8) != 0;
            long j10 = j9 & (~j8);
            this.f10504a = j10;
            long j11 = j8 - 1;
            this.f10504a = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
            a aVar = this.f10505b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f10505b.f(0);
            }
            return z8;
        }

        void g() {
            this.f10504a = 0L;
            a aVar = this.f10505b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i8) {
            if (i8 < 64) {
                this.f10504a |= 1 << i8;
            } else {
                c();
                this.f10505b.h(i8 - 64);
            }
        }

        public String toString() {
            if (this.f10505b == null) {
                return Long.toBinaryString(this.f10504a);
            }
            return this.f10505b.toString() + "xx" + Long.toBinaryString(this.f10504a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0162b {
        void addView(View view, int i8);

        void attachViewToParent(View view, int i8, ViewGroup.LayoutParams layoutParams);

        void detachViewFromParent(int i8);

        View getChildAt(int i8);

        int getChildCount();

        RecyclerView.E getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int i8);
    }

    b(InterfaceC0162b interfaceC0162b) {
        this.f10501a = interfaceC0162b;
    }

    private int h(int i8) {
        if (i8 < 0) {
            return -1;
        }
        int childCount = this.f10501a.getChildCount();
        int i9 = i8;
        while (i9 < childCount) {
            int iB = i8 - (i9 - this.f10502b.b(i9));
            if (iB == 0) {
                while (this.f10502b.d(i9)) {
                    i9++;
                }
                return i9;
            }
            i9 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f10503c.add(view);
        this.f10501a.onEnteredHiddenState(view);
    }

    private boolean t(View view) {
        if (!this.f10503c.remove(view)) {
            return false;
        }
        this.f10501a.onLeftHiddenState(view);
        return true;
    }

    void a(View view, int i8, boolean z8) {
        int childCount = i8 < 0 ? this.f10501a.getChildCount() : h(i8);
        this.f10502b.e(childCount, z8);
        if (z8) {
            l(view);
        }
        this.f10501a.addView(view, childCount);
    }

    void b(View view, boolean z8) {
        a(view, -1, z8);
    }

    void c(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z8) {
        int childCount = i8 < 0 ? this.f10501a.getChildCount() : h(i8);
        this.f10502b.e(childCount, z8);
        if (z8) {
            l(view);
        }
        this.f10501a.attachViewToParent(view, childCount, layoutParams);
    }

    void d(int i8) {
        int iH = h(i8);
        this.f10502b.f(iH);
        this.f10501a.detachViewFromParent(iH);
    }

    View e(int i8) {
        int size = this.f10503c.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) this.f10503c.get(i9);
            RecyclerView.E childViewHolder = this.f10501a.getChildViewHolder(view);
            if (childViewHolder.getLayoutPosition() == i8 && !childViewHolder.o() && !childViewHolder.p()) {
                return view;
            }
        }
        return null;
    }

    View f(int i8) {
        return this.f10501a.getChildAt(h(i8));
    }

    int g() {
        return this.f10501a.getChildCount() - this.f10503c.size();
    }

    View i(int i8) {
        return this.f10501a.getChildAt(i8);
    }

    int j() {
        return this.f10501a.getChildCount();
    }

    void k(View view) {
        int iIndexOfChild = this.f10501a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f10502b.h(iIndexOfChild);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iIndexOfChild = this.f10501a.indexOfChild(view);
        if (iIndexOfChild == -1 || this.f10502b.d(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - this.f10502b.b(iIndexOfChild);
    }

    boolean n(View view) {
        return this.f10503c.contains(view);
    }

    void o() {
        this.f10502b.g();
        for (int size = this.f10503c.size() - 1; size >= 0; size--) {
            this.f10501a.onLeftHiddenState((View) this.f10503c.get(size));
            this.f10503c.remove(size);
        }
        this.f10501a.removeAllViews();
    }

    void p(View view) {
        int iIndexOfChild = this.f10501a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            return;
        }
        if (this.f10502b.f(iIndexOfChild)) {
            t(view);
        }
        this.f10501a.removeViewAt(iIndexOfChild);
    }

    void q(int i8) {
        int iH = h(i8);
        View childAt = this.f10501a.getChildAt(iH);
        if (childAt == null) {
            return;
        }
        if (this.f10502b.f(iH)) {
            t(childAt);
        }
        this.f10501a.removeViewAt(iH);
    }

    boolean r(View view) {
        int iIndexOfChild = this.f10501a.indexOfChild(view);
        if (iIndexOfChild == -1) {
            t(view);
            return true;
        }
        if (!this.f10502b.d(iIndexOfChild)) {
            return false;
        }
        this.f10502b.f(iIndexOfChild);
        t(view);
        this.f10501a.removeViewAt(iIndexOfChild);
        return true;
    }

    void s(View view) {
        int iIndexOfChild = this.f10501a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f10502b.d(iIndexOfChild)) {
            this.f10502b.a(iIndexOfChild);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f10502b.toString() + ", hidden list:" + this.f10503c.size();
    }
}
