package o1;

import android.content.Context;
import o1.r;
import s1.C6210d;
import u1.C6399B;
import u1.C6404G;
import u1.C6410f;
import u1.C6411g;
import u1.InterfaceC6407c;
import w1.C6460c;

/* renamed from: o1.d */
/* loaded from: classes.dex */
final class C6027d extends r {

    /* renamed from: a */
    private Q6.a f34409a;

    /* renamed from: b */
    private Q6.a f34410b;

    /* renamed from: c */
    private Q6.a f34411c;

    /* renamed from: d */
    private Q6.a f34412d;

    /* renamed from: e */
    private Q6.a f34413e;

    /* renamed from: f */
    private Q6.a f34414f;

    /* renamed from: g */
    private Q6.a f34415g;

    /* renamed from: h */
    private Q6.a f34416h;

    /* renamed from: i */
    private Q6.a f34417i;

    /* renamed from: j */
    private Q6.a f34418j;

    /* renamed from: k */
    private Q6.a f34419k;

    /* renamed from: l */
    private Q6.a f34420l;

    /* renamed from: o1.d$b */
    private static final class b implements r.a {

        /* renamed from: a */
        private Context f34421a;

        private b() {
        }

        @Override // o1.r.a
        public r build() {
            H6.e.checkBuilderRequirement(this.f34421a, Context.class);
            return new C6027d(this.f34421a);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o1.r.a
        public b setApplicationContext(Context context) {
            this.f34421a = (Context) H6.e.checkNotNull(context);
            return this;
        }
    }

    /* synthetic */ C6027d(Context context, a aVar) {
        this(context);
    }

    public static r.a builder() {
        return new b();
    }

    private void c(Context context) {
        this.f34409a = H6.a.provider(j.create());
        H6.b bVarCreate = H6.c.create(context);
        this.f34410b = bVarCreate;
        p1.j jVarCreate = p1.j.create(bVarCreate, C6460c.create(), w1.d.create());
        this.f34411c = jVarCreate;
        this.f34412d = H6.a.provider(p1.l.create(this.f34410b, jVarCreate));
        this.f34413e = C6404G.create(this.f34410b, C6410f.create());
        this.f34414f = H6.a.provider(C6399B.create(C6460c.create(), w1.d.create(), C6411g.create(), this.f34413e));
        s1.g gVarCreate = s1.g.create(C6460c.create());
        this.f34415g = gVarCreate;
        s1.i iVarCreate = s1.i.create(this.f34410b, this.f34414f, gVarCreate, w1.d.create());
        this.f34416h = iVarCreate;
        Q6.a aVar = this.f34409a;
        Q6.a aVar2 = this.f34412d;
        Q6.a aVar3 = this.f34414f;
        this.f34417i = C6210d.create(aVar, aVar2, iVarCreate, aVar3, aVar3);
        Q6.a aVar4 = this.f34410b;
        Q6.a aVar5 = this.f34412d;
        Q6.a aVar6 = this.f34414f;
        this.f34418j = t1.k.create(aVar4, aVar5, aVar6, this.f34416h, this.f34409a, aVar6, C6460c.create());
        Q6.a aVar7 = this.f34409a;
        Q6.a aVar8 = this.f34414f;
        this.f34419k = t1.o.create(aVar7, aVar8, this.f34416h, aVar8);
        this.f34420l = H6.a.provider(s.create(C6460c.create(), w1.d.create(), this.f34417i, this.f34418j, this.f34419k));
    }

    @Override // o1.r
    InterfaceC6407c a() {
        return (InterfaceC6407c) this.f34414f.get();
    }

    @Override // o1.r
    q b() {
        return (q) this.f34420l.get();
    }

    private C6027d(Context context) {
        c(context);
    }
}
