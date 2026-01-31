package d1;

import e1.AbstractC5342c;
import g1.C5534a;
import java.util.List;

/* renamed from: d1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5309d {
    private static List a(AbstractC5342c abstractC5342c, float f8, T0.h hVar, N n8) {
        return u.a(abstractC5342c, hVar, f8, n8, false);
    }

    private static List b(AbstractC5342c abstractC5342c, T0.h hVar, N n8) {
        return u.a(abstractC5342c, hVar, 1.0f, n8, false);
    }

    static Z0.a c(AbstractC5342c abstractC5342c, T0.h hVar) {
        return new Z0.a(b(abstractC5342c, hVar, C5312g.INSTANCE));
    }

    static Z0.j d(AbstractC5342c abstractC5342c, T0.h hVar) {
        return new Z0.j(b(abstractC5342c, hVar, C5314i.INSTANCE));
    }

    static Z0.c e(AbstractC5342c abstractC5342c, T0.h hVar, int i8) {
        return new Z0.c(b(abstractC5342c, hVar, new o(i8)));
    }

    static Z0.d f(AbstractC5342c abstractC5342c, T0.h hVar) {
        return new Z0.d(b(abstractC5342c, hVar, r.INSTANCE));
    }

    static Z0.f g(AbstractC5342c abstractC5342c, T0.h hVar) {
        return new Z0.f(u.a(abstractC5342c, hVar, f1.j.dpScale(), C5303B.INSTANCE, true));
    }

    static Z0.g h(AbstractC5342c abstractC5342c, T0.h hVar) {
        return new Z0.g((List<C5534a>) b(abstractC5342c, hVar, G.INSTANCE));
    }

    static Z0.h i(AbstractC5342c abstractC5342c, T0.h hVar) {
        return new Z0.h(a(abstractC5342c, f1.j.dpScale(), hVar, H.INSTANCE));
    }

    public static Z0.b parseFloat(AbstractC5342c abstractC5342c, T0.h hVar) {
        return parseFloat(abstractC5342c, hVar, true);
    }

    public static Z0.b parseFloat(AbstractC5342c abstractC5342c, T0.h hVar, boolean z8) {
        return new Z0.b(a(abstractC5342c, z8 ? f1.j.dpScale() : 1.0f, hVar, C5317l.INSTANCE));
    }
}
