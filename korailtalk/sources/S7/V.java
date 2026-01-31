package s7;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
final class V extends AbstractC6249j {
    public static final V INSTANCE = new V();

    /* renamed from: a, reason: collision with root package name */
    private static final ReentrantReadWriteLock f36337a = new ReentrantReadWriteLock();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f36338b = new WeakHashMap();

    private V() {
    }

    @Override // s7.AbstractC6249j
    public f7.l get(Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = f36337a;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            f7.l lVar = (f7.l) f36338b.get(cls);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i8 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i9 = 0; i9 < readHoldCount; i9++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap weakHashMap = f36338b;
                f7.l lVar2 = (f7.l) weakHashMap.get(cls);
                if (lVar2 != null) {
                    return lVar2;
                }
                f7.l lVarA = AbstractC6254o.a(cls);
                weakHashMap.put(cls, lVarA);
                while (i8 < readHoldCount) {
                    lock2.lock();
                    i8++;
                }
                writeLock.unlock();
                return lVarA;
            } finally {
                while (i8 < readHoldCount) {
                    lock2.lock();
                    i8++;
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
