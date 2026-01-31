package n7;

import W6.g;

/* loaded from: classes3.dex */
public interface J extends g.b {
    public static final a Key = a.f34305a;

    public static final class a implements g.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f34305a = new a();

        private a() {
        }
    }

    @Override // W6.g.b, W6.g
    /* synthetic */ Object fold(Object obj, f7.p pVar);

    @Override // W6.g.b, W6.g
    /* synthetic */ g.b get(g.c cVar);

    @Override // W6.g.b
    /* synthetic */ g.c getKey();

    void handleException(W6.g gVar, Throwable th);

    @Override // W6.g.b, W6.g
    /* synthetic */ W6.g minusKey(g.c cVar);

    @Override // W6.g.b, W6.g
    /* synthetic */ W6.g plus(W6.g gVar);
}
