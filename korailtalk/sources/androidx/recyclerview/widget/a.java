package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class a implements i.a {

    /* renamed from: a, reason: collision with root package name */
    private Z.e f10489a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f10490b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f10491c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0161a f10492d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f10493e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f10494f;

    /* renamed from: g, reason: collision with root package name */
    final i f10495g;

    /* renamed from: h, reason: collision with root package name */
    private int f10496h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0161a {
        RecyclerView.E findViewHolder(int i8);

        void markViewHoldersUpdated(int i8, int i9, Object obj);

        void offsetPositionsForAdd(int i8, int i9);

        void offsetPositionsForMove(int i8, int i9);

        void offsetPositionsForRemovingInvisible(int i8, int i9);

        void offsetPositionsForRemovingLaidOutOrNewView(int i8, int i9);

        void onDispatchFirstPass(b bVar);

        void onDispatchSecondPass(b bVar);
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        int f10497a;

        /* renamed from: b, reason: collision with root package name */
        int f10498b;

        /* renamed from: c, reason: collision with root package name */
        Object f10499c;

        /* renamed from: d, reason: collision with root package name */
        int f10500d;

        b(int i8, int i9, int i10, Object obj) {
            this.f10497a = i8;
            this.f10498b = i9;
            this.f10500d = i10;
            this.f10499c = obj;
        }

        String a() {
            int i8 = this.f10497a;
            return i8 != 1 ? i8 != 2 ? i8 != 4 ? i8 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i8 = this.f10497a;
            if (i8 != bVar.f10497a) {
                return false;
            }
            if (i8 == 8 && Math.abs(this.f10500d - this.f10498b) == 1 && this.f10500d == bVar.f10498b && this.f10498b == bVar.f10500d) {
                return true;
            }
            if (this.f10500d != bVar.f10500d || this.f10498b != bVar.f10498b) {
                return false;
            }
            Object obj2 = this.f10499c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f10499c)) {
                    return false;
                }
            } else if (bVar.f10499c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f10497a * 31) + this.f10498b) * 31) + this.f10500d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f10498b + "c:" + this.f10500d + ",p:" + this.f10499c + "]";
        }
    }

    a(InterfaceC0161a interfaceC0161a) {
        this(interfaceC0161a, false);
    }

    private void a(b bVar) {
        s(bVar);
    }

    private void b(b bVar) {
        s(bVar);
    }

    private void c(b bVar) {
        boolean z8;
        char c9;
        int i8 = bVar.f10498b;
        int i9 = bVar.f10500d + i8;
        char c10 = 65535;
        int i10 = i8;
        int i11 = 0;
        while (i10 < i9) {
            if (this.f10492d.findViewHolder(i10) != null || e(i10)) {
                if (c10 == 0) {
                    h(obtainUpdateOp(2, i8, i11, null));
                    z8 = true;
                } else {
                    z8 = false;
                }
                c9 = 1;
            } else {
                if (c10 == 1) {
                    s(obtainUpdateOp(2, i8, i11, null));
                    z8 = true;
                } else {
                    z8 = false;
                }
                c9 = 0;
            }
            if (z8) {
                i10 -= i11;
                i9 -= i11;
                i11 = 1;
            } else {
                i11++;
            }
            i10++;
            c10 = c9;
        }
        if (i11 != bVar.f10500d) {
            recycleUpdateOp(bVar);
            bVar = obtainUpdateOp(2, i8, i11, null);
        }
        if (c10 == 0) {
            h(bVar);
        } else {
            s(bVar);
        }
    }

    private void d(b bVar) {
        int i8 = bVar.f10498b;
        int i9 = bVar.f10500d + i8;
        int i10 = 0;
        boolean z8 = -1;
        int i11 = i8;
        while (i8 < i9) {
            if (this.f10492d.findViewHolder(i8) != null || e(i8)) {
                if (!z8) {
                    h(obtainUpdateOp(4, i11, i10, bVar.f10499c));
                    i11 = i8;
                    i10 = 0;
                }
                z8 = true;
            } else {
                if (z8) {
                    s(obtainUpdateOp(4, i11, i10, bVar.f10499c));
                    i11 = i8;
                    i10 = 0;
                }
                z8 = false;
            }
            i10++;
            i8++;
        }
        if (i10 != bVar.f10500d) {
            Object obj = bVar.f10499c;
            recycleUpdateOp(bVar);
            bVar = obtainUpdateOp(4, i11, i10, obj);
        }
        if (z8) {
            s(bVar);
        } else {
            h(bVar);
        }
    }

    private boolean e(int i8) {
        int size = this.f10491c.size();
        for (int i9 = 0; i9 < size; i9++) {
            b bVar = (b) this.f10491c.get(i9);
            int i10 = bVar.f10497a;
            if (i10 == 8) {
                if (k(bVar.f10500d, i9 + 1) == i8) {
                    return true;
                }
            } else if (i10 == 1) {
                int i11 = bVar.f10498b;
                int i12 = bVar.f10500d + i11;
                while (i11 < i12) {
                    if (k(i11, i9 + 1) == i8) {
                        return true;
                    }
                    i11++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void h(b bVar) {
        int i8;
        int i9 = bVar.f10497a;
        if (i9 == 1 || i9 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iW = w(bVar.f10498b, i9);
        int i10 = bVar.f10498b;
        int i11 = bVar.f10497a;
        if (i11 == 2) {
            i8 = 0;
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i8 = 1;
        }
        int i12 = 1;
        for (int i13 = 1; i13 < bVar.f10500d; i13++) {
            int iW2 = w(bVar.f10498b + (i8 * i13), bVar.f10497a);
            int i14 = bVar.f10497a;
            if (i14 == 2 ? iW2 != iW : !(i14 == 4 && iW2 == iW + 1)) {
                b bVarObtainUpdateOp = obtainUpdateOp(i14, iW, i12, bVar.f10499c);
                i(bVarObtainUpdateOp, i10);
                recycleUpdateOp(bVarObtainUpdateOp);
                if (bVar.f10497a == 4) {
                    i10 += i12;
                }
                i12 = 1;
                iW = iW2;
            } else {
                i12++;
            }
        }
        Object obj = bVar.f10499c;
        recycleUpdateOp(bVar);
        if (i12 > 0) {
            b bVarObtainUpdateOp2 = obtainUpdateOp(bVar.f10497a, iW, i12, obj);
            i(bVarObtainUpdateOp2, i10);
            recycleUpdateOp(bVarObtainUpdateOp2);
        }
    }

    private void s(b bVar) {
        this.f10491c.add(bVar);
        int i8 = bVar.f10497a;
        if (i8 == 1) {
            this.f10492d.offsetPositionsForAdd(bVar.f10498b, bVar.f10500d);
            return;
        }
        if (i8 == 2) {
            this.f10492d.offsetPositionsForRemovingLaidOutOrNewView(bVar.f10498b, bVar.f10500d);
            return;
        }
        if (i8 == 4) {
            this.f10492d.markViewHoldersUpdated(bVar.f10498b, bVar.f10500d, bVar.f10499c);
        } else {
            if (i8 == 8) {
                this.f10492d.offsetPositionsForMove(bVar.f10498b, bVar.f10500d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int w(int i8, int i9) {
        int i10;
        int i11;
        for (int size = this.f10491c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f10491c.get(size);
            int i12 = bVar.f10497a;
            if (i12 == 8) {
                int i13 = bVar.f10498b;
                int i14 = bVar.f10500d;
                if (i13 < i14) {
                    i11 = i13;
                    i10 = i14;
                } else {
                    i10 = i13;
                    i11 = i14;
                }
                if (i8 < i11 || i8 > i10) {
                    if (i8 < i13) {
                        if (i9 == 1) {
                            bVar.f10498b = i13 + 1;
                            bVar.f10500d = i14 + 1;
                        } else if (i9 == 2) {
                            bVar.f10498b = i13 - 1;
                            bVar.f10500d = i14 - 1;
                        }
                    }
                } else if (i11 == i13) {
                    if (i9 == 1) {
                        bVar.f10500d = i14 + 1;
                    } else if (i9 == 2) {
                        bVar.f10500d = i14 - 1;
                    }
                    i8++;
                } else {
                    if (i9 == 1) {
                        bVar.f10498b = i13 + 1;
                    } else if (i9 == 2) {
                        bVar.f10498b = i13 - 1;
                    }
                    i8--;
                }
            } else {
                int i15 = bVar.f10498b;
                if (i15 <= i8) {
                    if (i12 == 1) {
                        i8 -= bVar.f10500d;
                    } else if (i12 == 2) {
                        i8 += bVar.f10500d;
                    }
                } else if (i9 == 1) {
                    bVar.f10498b = i15 + 1;
                } else if (i9 == 2) {
                    bVar.f10498b = i15 - 1;
                }
            }
        }
        for (int size2 = this.f10491c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f10491c.get(size2);
            if (bVar2.f10497a == 8) {
                int i16 = bVar2.f10500d;
                if (i16 == bVar2.f10498b || i16 < 0) {
                    this.f10491c.remove(size2);
                    recycleUpdateOp(bVar2);
                }
            } else if (bVar2.f10500d <= 0) {
                this.f10491c.remove(size2);
                recycleUpdateOp(bVar2);
            }
        }
        return i8;
    }

    public int applyPendingUpdatesToPosition(int i8) {
        int size = this.f10490b.size();
        for (int i9 = 0; i9 < size; i9++) {
            b bVar = (b) this.f10490b.get(i9);
            int i10 = bVar.f10497a;
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = bVar.f10498b;
                    if (i11 <= i8) {
                        int i12 = bVar.f10500d;
                        if (i11 + i12 > i8) {
                            return -1;
                        }
                        i8 -= i12;
                    } else {
                        continue;
                    }
                } else if (i10 == 8) {
                    int i13 = bVar.f10498b;
                    if (i13 == i8) {
                        i8 = bVar.f10500d;
                    } else {
                        if (i13 < i8) {
                            i8--;
                        }
                        if (bVar.f10500d <= i8) {
                            i8++;
                        }
                    }
                }
            } else if (bVar.f10498b <= i8) {
                i8 += bVar.f10500d;
            }
        }
        return i8;
    }

    void f() {
        int size = this.f10491c.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f10492d.onDispatchSecondPass((b) this.f10491c.get(i8));
        }
        u(this.f10491c);
        this.f10496h = 0;
    }

    void g() {
        f();
        int size = this.f10490b.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) this.f10490b.get(i8);
            int i9 = bVar.f10497a;
            if (i9 == 1) {
                this.f10492d.onDispatchSecondPass(bVar);
                this.f10492d.offsetPositionsForAdd(bVar.f10498b, bVar.f10500d);
            } else if (i9 == 2) {
                this.f10492d.onDispatchSecondPass(bVar);
                this.f10492d.offsetPositionsForRemovingInvisible(bVar.f10498b, bVar.f10500d);
            } else if (i9 == 4) {
                this.f10492d.onDispatchSecondPass(bVar);
                this.f10492d.markViewHoldersUpdated(bVar.f10498b, bVar.f10500d, bVar.f10499c);
            } else if (i9 == 8) {
                this.f10492d.onDispatchSecondPass(bVar);
                this.f10492d.offsetPositionsForMove(bVar.f10498b, bVar.f10500d);
            }
            Runnable runnable = this.f10493e;
            if (runnable != null) {
                runnable.run();
            }
        }
        u(this.f10490b);
        this.f10496h = 0;
    }

    void i(b bVar, int i8) {
        this.f10492d.onDispatchFirstPass(bVar);
        int i9 = bVar.f10497a;
        if (i9 == 2) {
            this.f10492d.offsetPositionsForRemovingInvisible(i8, bVar.f10500d);
        } else {
            if (i9 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f10492d.markViewHoldersUpdated(i8, bVar.f10500d, bVar.f10499c);
        }
    }

    int j(int i8) {
        return k(i8, 0);
    }

    int k(int i8, int i9) {
        int size = this.f10491c.size();
        while (i9 < size) {
            b bVar = (b) this.f10491c.get(i9);
            int i10 = bVar.f10497a;
            if (i10 == 8) {
                int i11 = bVar.f10498b;
                if (i11 == i8) {
                    i8 = bVar.f10500d;
                } else {
                    if (i11 < i8) {
                        i8--;
                    }
                    if (bVar.f10500d <= i8) {
                        i8++;
                    }
                }
            } else {
                int i12 = bVar.f10498b;
                if (i12 > i8) {
                    continue;
                } else if (i10 == 2) {
                    int i13 = bVar.f10500d;
                    if (i8 < i12 + i13) {
                        return -1;
                    }
                    i8 -= i13;
                } else if (i10 == 1) {
                    i8 += bVar.f10500d;
                }
            }
            i9++;
        }
        return i8;
    }

    boolean l(int i8) {
        return (i8 & this.f10496h) != 0;
    }

    boolean m() {
        return this.f10490b.size() > 0;
    }

    boolean n() {
        return (this.f10491c.isEmpty() || this.f10490b.isEmpty()) ? false : true;
    }

    boolean o(int i8, int i9, Object obj) {
        if (i9 < 1) {
            return false;
        }
        this.f10490b.add(obtainUpdateOp(4, i8, i9, obj));
        this.f10496h |= 4;
        return this.f10490b.size() == 1;
    }

    @Override // androidx.recyclerview.widget.i.a
    public b obtainUpdateOp(int i8, int i9, int i10, Object obj) {
        b bVar = (b) this.f10489a.acquire();
        if (bVar == null) {
            return new b(i8, i9, i10, obj);
        }
        bVar.f10497a = i8;
        bVar.f10498b = i9;
        bVar.f10500d = i10;
        bVar.f10499c = obj;
        return bVar;
    }

    boolean p(int i8, int i9) {
        if (i9 < 1) {
            return false;
        }
        this.f10490b.add(obtainUpdateOp(1, i8, i9, null));
        this.f10496h |= 1;
        return this.f10490b.size() == 1;
    }

    boolean q(int i8, int i9, int i10) {
        if (i8 == i9) {
            return false;
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f10490b.add(obtainUpdateOp(8, i8, i9, null));
        this.f10496h |= 8;
        return this.f10490b.size() == 1;
    }

    boolean r(int i8, int i9) {
        if (i9 < 1) {
            return false;
        }
        this.f10490b.add(obtainUpdateOp(2, i8, i9, null));
        this.f10496h |= 2;
        return this.f10490b.size() == 1;
    }

    @Override // androidx.recyclerview.widget.i.a
    public void recycleUpdateOp(b bVar) {
        if (this.f10494f) {
            return;
        }
        bVar.f10499c = null;
        this.f10489a.release(bVar);
    }

    void t() {
        this.f10495g.b(this.f10490b);
        int size = this.f10490b.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) this.f10490b.get(i8);
            int i9 = bVar.f10497a;
            if (i9 == 1) {
                a(bVar);
            } else if (i9 == 2) {
                c(bVar);
            } else if (i9 == 4) {
                d(bVar);
            } else if (i9 == 8) {
                b(bVar);
            }
            Runnable runnable = this.f10493e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f10490b.clear();
    }

    void u(List list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            recycleUpdateOp((b) list.get(i8));
        }
        list.clear();
    }

    void v() {
        u(this.f10490b);
        u(this.f10491c);
        this.f10496h = 0;
    }

    a(InterfaceC0161a interfaceC0161a, boolean z8) {
        this.f10489a = new Z.f(30);
        this.f10490b = new ArrayList();
        this.f10491c = new ArrayList();
        this.f10496h = 0;
        this.f10492d = interfaceC0161a;
        this.f10494f = z8;
        this.f10495g = new i(this);
    }
}
