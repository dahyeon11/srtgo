package N0;

import H0.l;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    private static final String f3156f = l.tagWithPrefix("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    protected final R0.a f3157a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f3158b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3159c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Set f3160d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    Object f3161e;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f3162a;

        a(List list) {
            this.f3162a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3162a.iterator();
            while (it.hasNext()) {
                ((L0.a) it.next()).onConstraintChanged(d.this.f3161e);
            }
        }
    }

    d(Context context, R0.a aVar) {
        this.f3158b = context.getApplicationContext();
        this.f3157a = aVar;
    }

    public void addListener(L0.a aVar) {
        synchronized (this.f3159c) {
            try {
                if (this.f3160d.add(aVar)) {
                    if (this.f3160d.size() == 1) {
                        this.f3161e = getInitialState();
                        l.get().debug(f3156f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f3161e), new Throwable[0]);
                        startTracking();
                    }
                    aVar.onConstraintChanged(this.f3161e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Object getInitialState();

    public void removeListener(L0.a aVar) {
        synchronized (this.f3159c) {
            try {
                if (this.f3160d.remove(aVar) && this.f3160d.isEmpty()) {
                    stopTracking();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setState(Object obj) {
        synchronized (this.f3159c) {
            try {
                Object obj2 = this.f3161e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f3161e = obj;
                    this.f3157a.getMainThreadExecutor().execute(new a(new ArrayList(this.f3160d)));
                }
            } finally {
            }
        }
    }

    public abstract void startTracking();

    public abstract void stopTracking();
}
