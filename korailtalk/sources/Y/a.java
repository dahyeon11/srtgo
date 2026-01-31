package Y;

import Y.f;
import Y.g;
import android.graphics.Typeface;
import android.os.Handler;

/* loaded from: classes.dex */
class a {

    /* renamed from: a */
    private final g.c f5513a;

    /* renamed from: b */
    private final Handler f5514b;

    /* renamed from: Y.a$a */
    class RunnableC0089a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ g.c f5515a;

        /* renamed from: b */
        final /* synthetic */ Typeface f5516b;

        RunnableC0089a(g.c cVar, Typeface typeface) {
            this.f5515a = cVar;
            this.f5516b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5515a.onTypefaceRetrieved(this.f5516b);
        }
    }

    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ g.c f5518a;

        /* renamed from: b */
        final /* synthetic */ int f5519b;

        b(g.c cVar, int i8) {
            this.f5518a = cVar;
            this.f5519b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5518a.onTypefaceRequestFailed(this.f5519b);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f5513a = cVar;
        this.f5514b = handler;
    }

    private void a(int i8) {
        this.f5514b.post(new b(this.f5513a, i8));
    }

    private void c(Typeface typeface) {
        this.f5514b.post(new RunnableC0089a(this.f5513a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f5543a);
        } else {
            a(eVar.f5544b);
        }
    }

    a(g.c cVar) {
        this.f5513a = cVar;
        this.f5514b = Y.b.a();
    }
}
