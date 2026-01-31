package p7;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: p7.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC6072j {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i8, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
            if (atomicReferenceArray.get(i8) != obj) {
                return false;
            }
        }
        return true;
    }
}
