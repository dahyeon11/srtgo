package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    final O.h f10634a = new O.h();

    /* renamed from: b, reason: collision with root package name */
    final O.e f10635b = new O.e();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        static Z.e f10636d = new Z.f(20);

        /* renamed from: a, reason: collision with root package name */
        int f10637a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.m.c f10638b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.m.c f10639c;

        private a() {
        }

        static void a() {
            while (f10636d.acquire() != null) {
            }
        }

        static a b() {
            a aVar = (a) f10636d.acquire();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f10637a = 0;
            aVar.f10638b = null;
            aVar.f10639c = null;
            f10636d.release(aVar);
        }
    }

    interface b {
        void processAppeared(RecyclerView.E e8, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void processDisappeared(RecyclerView.E e8, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void processPersistent(RecyclerView.E e8, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void unused(RecyclerView.E e8);
    }

    q() {
    }

    private RecyclerView.m.c k(RecyclerView.E e8, int i8) {
        a aVar;
        RecyclerView.m.c cVar;
        int iIndexOfKey = this.f10634a.indexOfKey(e8);
        if (iIndexOfKey >= 0 && (aVar = (a) this.f10634a.valueAt(iIndexOfKey)) != null) {
            int i9 = aVar.f10637a;
            if ((i9 & i8) != 0) {
                int i10 = (~i8) & i9;
                aVar.f10637a = i10;
                if (i8 == 4) {
                    cVar = aVar.f10638b;
                } else {
                    if (i8 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVar.f10639c;
                }
                if ((i10 & 12) == 0) {
                    this.f10634a.removeAt(iIndexOfKey);
                    a.c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.E e8, RecyclerView.m.c cVar) {
        a aVarB = (a) this.f10634a.get(e8);
        if (aVarB == null) {
            aVarB = a.b();
            this.f10634a.put(e8, aVarB);
        }
        aVarB.f10637a |= 2;
        aVarB.f10638b = cVar;
    }

    void b(RecyclerView.E e8) {
        a aVarB = (a) this.f10634a.get(e8);
        if (aVarB == null) {
            aVarB = a.b();
            this.f10634a.put(e8, aVarB);
        }
        aVarB.f10637a |= 1;
    }

    void c(long j8, RecyclerView.E e8) {
        this.f10635b.put(j8, e8);
    }

    void d(RecyclerView.E e8, RecyclerView.m.c cVar) {
        a aVarB = (a) this.f10634a.get(e8);
        if (aVarB == null) {
            aVarB = a.b();
            this.f10634a.put(e8, aVarB);
        }
        aVarB.f10639c = cVar;
        aVarB.f10637a |= 8;
    }

    void e(RecyclerView.E e8, RecyclerView.m.c cVar) {
        a aVarB = (a) this.f10634a.get(e8);
        if (aVarB == null) {
            aVarB = a.b();
            this.f10634a.put(e8, aVarB);
        }
        aVarB.f10638b = cVar;
        aVarB.f10637a |= 4;
    }

    void f() {
        this.f10634a.clear();
        this.f10635b.clear();
    }

    RecyclerView.E g(long j8) {
        return (RecyclerView.E) this.f10635b.get(j8);
    }

    boolean h(RecyclerView.E e8) {
        a aVar = (a) this.f10634a.get(e8);
        return (aVar == null || (aVar.f10637a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.E e8) {
        a aVar = (a) this.f10634a.get(e8);
        return (aVar == null || (aVar.f10637a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    RecyclerView.m.c l(RecyclerView.E e8) {
        return k(e8, 8);
    }

    RecyclerView.m.c m(RecyclerView.E e8) {
        return k(e8, 4);
    }

    void n(b bVar) {
        for (int size = this.f10634a.size() - 1; size >= 0; size--) {
            RecyclerView.E e8 = (RecyclerView.E) this.f10634a.keyAt(size);
            a aVar = (a) this.f10634a.removeAt(size);
            int i8 = aVar.f10637a;
            if ((i8 & 3) == 3) {
                bVar.unused(e8);
            } else if ((i8 & 1) != 0) {
                RecyclerView.m.c cVar = aVar.f10638b;
                if (cVar == null) {
                    bVar.unused(e8);
                } else {
                    bVar.processDisappeared(e8, cVar, aVar.f10639c);
                }
            } else if ((i8 & 14) == 14) {
                bVar.processAppeared(e8, aVar.f10638b, aVar.f10639c);
            } else if ((i8 & 12) == 12) {
                bVar.processPersistent(e8, aVar.f10638b, aVar.f10639c);
            } else if ((i8 & 4) != 0) {
                bVar.processDisappeared(e8, aVar.f10638b, null);
            } else if ((i8 & 8) != 0) {
                bVar.processAppeared(e8, aVar.f10638b, aVar.f10639c);
            }
            a.c(aVar);
        }
    }

    void o(RecyclerView.E e8) {
        a aVar = (a) this.f10634a.get(e8);
        if (aVar == null) {
            return;
        }
        aVar.f10637a &= -2;
    }

    public void onViewDetached(RecyclerView.E e8) {
        o(e8);
    }

    void p(RecyclerView.E e8) {
        int size = this.f10635b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (e8 == this.f10635b.valueAt(size)) {
                this.f10635b.removeAt(size);
                break;
            }
            size--;
        }
        a aVar = (a) this.f10634a.remove(e8);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
