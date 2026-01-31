package z;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface t0 {

    public interface a {
        void onError(Throwable th);

        void onNewData(Object obj);
    }

    void addObserver(Executor executor, a aVar);

    com.google.common.util.concurrent.C fetchData();

    void removeObserver(a aVar);
}
