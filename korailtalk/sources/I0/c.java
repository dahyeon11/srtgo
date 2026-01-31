package I0;

import H0.o;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.google.common.util.concurrent.C;

/* loaded from: classes.dex */
public class c implements o {

    /* renamed from: a, reason: collision with root package name */
    private final t f1899a = new t();

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f1900b = androidx.work.impl.utils.futures.c.create();

    public c() {
        setState(o.IN_PROGRESS);
    }

    @Override // H0.o
    public C getResult() {
        return this.f1900b;
    }

    @Override // H0.o
    public LiveData getState() {
        return this.f1899a;
    }

    public void setState(o.b bVar) {
        this.f1899a.postValue(bVar);
        if (bVar instanceof o.b.c) {
            this.f1900b.set((o.b.c) bVar);
        } else if (bVar instanceof o.b.a) {
            this.f1900b.setException(((o.b.a) bVar).getThrowable());
        }
    }
}
