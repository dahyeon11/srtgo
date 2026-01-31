package v0;

import androidx.room.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import z0.InterfaceC6614f;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6423a extends AbstractC6426d {
    public AbstractC6423a(h hVar) {
        super(hVar);
    }

    protected abstract void bind(InterfaceC6614f interfaceC6614f, Object obj);

    public final void insert(Object obj) {
        InterfaceC6614f interfaceC6614fAcquire = acquire();
        try {
            bind(interfaceC6614fAcquire, obj);
            interfaceC6614fAcquire.executeInsert();
        } finally {
            release(interfaceC6614fAcquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        InterfaceC6614f interfaceC6614fAcquire = acquire();
        try {
            bind(interfaceC6614fAcquire, obj);
            return interfaceC6614fAcquire.executeInsert();
        } finally {
            release(interfaceC6614fAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<Object> collection) {
        InterfaceC6614f interfaceC6614fAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            Iterator<Object> it = collection.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                bind(interfaceC6614fAcquire, it.next());
                jArr[i8] = interfaceC6614fAcquire.executeInsert();
                i8++;
            }
            return jArr;
        } finally {
            release(interfaceC6614fAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<Object> collection) {
        InterfaceC6614f interfaceC6614fAcquire = acquire();
        try {
            Long[] lArr = new Long[collection.size()];
            Iterator<Object> it = collection.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                bind(interfaceC6614fAcquire, it.next());
                lArr[i8] = Long.valueOf(interfaceC6614fAcquire.executeInsert());
                i8++;
            }
            return lArr;
        } finally {
            release(interfaceC6614fAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Object[] objArr) {
        InterfaceC6614f interfaceC6614fAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(objArr.length);
            int i8 = 0;
            for (Object obj : objArr) {
                bind(interfaceC6614fAcquire, obj);
                arrayList.add(i8, Long.valueOf(interfaceC6614fAcquire.executeInsert()));
                i8++;
            }
            return arrayList;
        } finally {
            release(interfaceC6614fAcquire);
        }
    }

    public final void insert(Object[] objArr) {
        InterfaceC6614f interfaceC6614fAcquire = acquire();
        try {
            for (Object obj : objArr) {
                bind(interfaceC6614fAcquire, obj);
                interfaceC6614fAcquire.executeInsert();
            }
        } finally {
            release(interfaceC6614fAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] objArr) {
        InterfaceC6614f interfaceC6614fAcquire = acquire();
        try {
            long[] jArr = new long[objArr.length];
            int i8 = 0;
            for (Object obj : objArr) {
                bind(interfaceC6614fAcquire, obj);
                jArr[i8] = interfaceC6614fAcquire.executeInsert();
                i8++;
            }
            return jArr;
        } finally {
            release(interfaceC6614fAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] objArr) {
        InterfaceC6614f interfaceC6614fAcquire = acquire();
        try {
            Long[] lArr = new Long[objArr.length];
            int i8 = 0;
            for (Object obj : objArr) {
                bind(interfaceC6614fAcquire, obj);
                lArr[i8] = Long.valueOf(interfaceC6614fAcquire.executeInsert());
                i8++;
            }
            return lArr;
        } finally {
            release(interfaceC6614fAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<Object> collection) {
        InterfaceC6614f interfaceC6614fAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<Object> it = collection.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                bind(interfaceC6614fAcquire, it.next());
                arrayList.add(i8, Long.valueOf(interfaceC6614fAcquire.executeInsert()));
                i8++;
            }
            return arrayList;
        } finally {
            release(interfaceC6614fAcquire);
        }
    }

    public final void insert(Iterable<Object> iterable) {
        InterfaceC6614f interfaceC6614fAcquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                bind(interfaceC6614fAcquire, it.next());
                interfaceC6614fAcquire.executeInsert();
            }
        } finally {
            release(interfaceC6614fAcquire);
        }
    }
}
