package h2;

import I2.AbstractC0608l;
import I2.C0609m;
import f2.C5392b;
import g2.C5541c;
import g2.InterfaceC5545g;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: d, reason: collision with root package name */
    private int f31403d;

    /* renamed from: b, reason: collision with root package name */
    private final O.a f31401b = new O.a();

    /* renamed from: c, reason: collision with root package name */
    private final C0609m f31402c = new C0609m();

    /* renamed from: e, reason: collision with root package name */
    private boolean f31404e = false;

    /* renamed from: a, reason: collision with root package name */
    private final O.a f31400a = new O.a();

    public Q(Iterable<? extends InterfaceC5545g> iterable) {
        Iterator<? extends InterfaceC5545g> it = iterable.iterator();
        while (it.hasNext()) {
            this.f31400a.put(it.next().getApiKey(), null);
        }
        this.f31403d = this.f31400a.keySet().size();
    }

    public final AbstractC0608l zaa() {
        return this.f31402c.getTask();
    }

    public final Set<C5585b> zab() {
        return this.f31400a.keySet();
    }

    public final void zac(C5585b c5585b, C5392b c5392b, String str) {
        this.f31400a.put(c5585b, c5392b);
        this.f31401b.put(c5585b, str);
        this.f31403d--;
        if (!c5392b.isSuccess()) {
            this.f31404e = true;
        }
        if (this.f31403d == 0) {
            if (!this.f31404e) {
                this.f31402c.setResult(this.f31401b);
            } else {
                this.f31402c.setException(new C5541c(this.f31400a));
            }
        }
    }
}
