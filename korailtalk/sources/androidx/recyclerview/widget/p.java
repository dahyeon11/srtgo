package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    final b f10627a;

    /* renamed from: b, reason: collision with root package name */
    a f10628b = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f10629a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f10630b;

        /* renamed from: c, reason: collision with root package name */
        int f10631c;

        /* renamed from: d, reason: collision with root package name */
        int f10632d;

        /* renamed from: e, reason: collision with root package name */
        int f10633e;

        a() {
        }

        void a(int i8) {
            this.f10629a = i8 | this.f10629a;
        }

        boolean b() {
            int i8 = this.f10629a;
            if ((i8 & 7) != 0 && (i8 & c(this.f10632d, this.f10630b)) == 0) {
                return false;
            }
            int i9 = this.f10629a;
            if ((i9 & 112) != 0 && (i9 & (c(this.f10632d, this.f10631c) << 4)) == 0) {
                return false;
            }
            int i10 = this.f10629a;
            if ((i10 & 1792) != 0 && (i10 & (c(this.f10633e, this.f10630b) << 8)) == 0) {
                return false;
            }
            int i11 = this.f10629a;
            return (i11 & 28672) == 0 || (i11 & (c(this.f10633e, this.f10631c) << 12)) != 0;
        }

        int c(int i8, int i9) {
            if (i8 > i9) {
                return 1;
            }
            return i8 == i9 ? 2 : 4;
        }

        void d() {
            this.f10629a = 0;
        }

        void e(int i8, int i9, int i10, int i11) {
            this.f10630b = i8;
            this.f10631c = i9;
            this.f10632d = i10;
            this.f10633e = i11;
        }
    }

    interface b {
        View getChildAt(int i8);

        int getChildEnd(View view);

        int getChildStart(View view);

        int getParentEnd();

        int getParentStart();
    }

    p(b bVar) {
        this.f10627a = bVar;
    }

    View a(int i8, int i9, int i10, int i11) {
        int parentStart = this.f10627a.getParentStart();
        int parentEnd = this.f10627a.getParentEnd();
        int i12 = i9 > i8 ? 1 : -1;
        View view = null;
        while (i8 != i9) {
            View childAt = this.f10627a.getChildAt(i8);
            this.f10628b.e(parentStart, parentEnd, this.f10627a.getChildStart(childAt), this.f10627a.getChildEnd(childAt));
            if (i10 != 0) {
                this.f10628b.d();
                this.f10628b.a(i10);
                if (this.f10628b.b()) {
                    return childAt;
                }
            }
            if (i11 != 0) {
                this.f10628b.d();
                this.f10628b.a(i11);
                if (this.f10628b.b()) {
                    view = childAt;
                }
            }
            i8 += i12;
        }
        return view;
    }

    boolean b(View view, int i8) {
        this.f10628b.e(this.f10627a.getParentStart(), this.f10627a.getParentEnd(), this.f10627a.getChildStart(view), this.f10627a.getChildEnd(view));
        if (i8 == 0) {
            return false;
        }
        this.f10628b.d();
        this.f10628b.a(i8);
        return this.f10628b.b();
    }
}
