package r3;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface d {
    <T> void subscribe(Class<T> cls, Executor executor, b bVar);

    <T> void subscribe(Class<T> cls, b bVar);

    <T> void unsubscribe(Class<T> cls, b bVar);
}
