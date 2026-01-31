package u1;

import java.io.Closeable;

/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6407c extends Closeable {
    int cleanUp();

    long getNextCallTime(o1.l lVar);

    boolean hasPendingEventsFor(o1.l lVar);

    Iterable<o1.l> loadActiveContexts();

    Iterable<AbstractC6412h> loadBatch(o1.l lVar);

    AbstractC6412h persist(o1.l lVar, o1.h hVar);

    void recordFailure(Iterable<AbstractC6412h> iterable);

    void recordNextCallTime(o1.l lVar, long j8);

    void recordSuccess(Iterable<AbstractC6412h> iterable);
}
