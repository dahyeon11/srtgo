package io.grpc;

import io.grpc.I0;
import java.util.List;

/* loaded from: classes.dex */
public abstract class W {

    public interface a extends I0.b {
    }

    public static <T> Iterable<T> getCandidatesViaHardCoded(Class<T> cls, Iterable<Class<?>> iterable) {
        return I0.b(cls, iterable);
    }

    public static <T> Iterable<T> getCandidatesViaServiceLoader(Class<T> cls, ClassLoader classLoader) {
        return I0.getCandidatesViaServiceLoader(cls, classLoader);
    }

    public static boolean isAndroid(ClassLoader classLoader) {
        return I0.c(classLoader);
    }

    public static <T> T load(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, a aVar) {
        return (T) I0.load(cls, iterable, classLoader, aVar);
    }

    public static <T> List<T> loadAll(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, a aVar) {
        return I0.loadAll(cls, iterable, classLoader, aVar);
    }
}
