package g2;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: g2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5547i {

    /* renamed from: g2.i$a */
    public interface a {
        void onComplete(Status status);
    }

    public void addStatusListener(a aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract n await();

    public abstract n await(long j8, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(o oVar);

    public abstract void setResultCallback(o oVar, long j8, TimeUnit timeUnit);

    public <S extends n> r then(q qVar) {
        throw new UnsupportedOperationException();
    }
}
