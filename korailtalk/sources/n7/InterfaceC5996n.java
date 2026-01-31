package n7;

/* renamed from: n7.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5996n extends W6.d {
    boolean cancel(Throwable th);

    void completeResume(Object obj);

    @Override // W6.d
    /* synthetic */ W6.g getContext();

    void initCancellability();

    void invokeOnCancellation(f7.l lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    void resume(Object obj, f7.l lVar);

    void resumeUndispatched(I i8, Object obj);

    void resumeUndispatchedWithException(I i8, Throwable th);

    @Override // W6.d
    /* synthetic */ void resumeWith(Object obj);

    Object tryResume(Object obj, Object obj2);

    Object tryResume(Object obj, Object obj2, f7.l lVar);

    Object tryResumeWithException(Throwable th);
}
