package i2;

import I2.AbstractC0608l;
import I2.C0609m;
import g2.AbstractC5547i;
import g2.C5551m;

/* renamed from: i2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5682o {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC5658Q f31836a = new C5654M();

    /* renamed from: i2.o$a */
    public interface a {
        Object convert(g2.n nVar);
    }

    public static <R extends g2.n, T extends C5551m> AbstractC0608l toResponseTask(AbstractC5547i abstractC5547i, T t8) {
        return toTask(abstractC5547i, new C5656O(t8));
    }

    public static <R extends g2.n, T> AbstractC0608l toTask(AbstractC5547i abstractC5547i, a aVar) {
        InterfaceC5658Q interfaceC5658Q = f31836a;
        C0609m c0609m = new C0609m();
        abstractC5547i.addStatusListener(new C5655N(abstractC5547i, c0609m, aVar, interfaceC5658Q));
        return c0609m.getTask();
    }

    public static <R extends g2.n> AbstractC0608l toVoidTask(AbstractC5547i abstractC5547i) {
        return toTask(abstractC5547i, new C5657P());
    }
}
