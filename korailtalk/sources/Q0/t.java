package Q0;

import H0.v;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.C;
import java.util.UUID;

/* loaded from: classes.dex */
public class t implements H0.h {

    /* renamed from: d, reason: collision with root package name */
    private static final String f3965d = H0.l.tagWithPrefix("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    private final R0.a f3966a;

    /* renamed from: b, reason: collision with root package name */
    final O0.a f3967b;

    /* renamed from: c, reason: collision with root package name */
    final P0.s f3968c;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f3969a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UUID f3970b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H0.g f3971c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f3972d;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, H0.g gVar, Context context) {
            this.f3969a = cVar;
            this.f3970b = uuid;
            this.f3971c = gVar;
            this.f3972d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f3969a.isCancelled()) {
                    String string = this.f3970b.toString();
                    v.a state = t.this.f3968c.getState(string);
                    if (state == null || state.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    t.this.f3967b.startForeground(string, this.f3971c);
                    this.f3972d.startService(androidx.work.impl.foreground.a.createNotifyIntent(this.f3972d, string, this.f3971c));
                }
                this.f3969a.set(null);
            } catch (Throwable th) {
                this.f3969a.setException(th);
            }
        }
    }

    public t(WorkDatabase workDatabase, O0.a aVar, R0.a aVar2) {
        this.f3967b = aVar;
        this.f3966a = aVar2;
        this.f3968c = workDatabase.workSpecDao();
    }

    @Override // H0.h
    public C setForegroundAsync(Context context, UUID uuid, H0.g gVar) {
        androidx.work.impl.utils.futures.c cVarCreate = androidx.work.impl.utils.futures.c.create();
        this.f3966a.executeOnBackgroundThread(new a(cVarCreate, uuid, gVar, context));
        return cVarCreate;
    }
}
