package v7;

import f7.p;

/* renamed from: v7.c */
/* loaded from: classes3.dex */
public interface InterfaceC6454c {

    /* renamed from: v7.c$a */
    public static final class a {
        public static <R, P, Q> void invoke(InterfaceC6454c interfaceC6454c, h hVar, p pVar) {
            interfaceC6454c.invoke(hVar, null, pVar);
        }

        public static <R> void onTimeout(InterfaceC6454c interfaceC6454c, long j8, f7.l lVar) {
            AbstractC6453b.onTimeout(interfaceC6454c, j8, lVar);
        }
    }

    void invoke(d dVar, f7.l lVar);

    <Q> void invoke(f fVar, p pVar);

    <P, Q> void invoke(h hVar, p pVar);

    <P, Q> void invoke(h hVar, P p8, p pVar);

    void onTimeout(long j8, f7.l lVar);
}
