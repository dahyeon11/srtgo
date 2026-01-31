package Q0;

import H0.v;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.C;
import java.util.UUID;

/* loaded from: classes.dex */
public class u implements H0.r {

    /* renamed from: c, reason: collision with root package name */
    static final String f3974c = H0.l.tagWithPrefix("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    final WorkDatabase f3975a;

    /* renamed from: b, reason: collision with root package name */
    final R0.a f3976b;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f3977a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.b f3978b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f3979c;

        a(UUID uuid, androidx.work.b bVar, androidx.work.impl.utils.futures.c cVar) {
            this.f3977a = uuid;
            this.f3978b = bVar;
            this.f3979c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            P0.r workSpec;
            String string = this.f3977a.toString();
            H0.l lVar = H0.l.get();
            String str = u.f3974c;
            lVar.debug(str, String.format("Updating progress for %s (%s)", this.f3977a, this.f3978b), new Throwable[0]);
            u.this.f3975a.beginTransaction();
            try {
                workSpec = u.this.f3975a.workSpecDao().getWorkSpec(string);
            } finally {
                try {
                } finally {
                }
            }
            if (workSpec == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (workSpec.state == v.a.RUNNING) {
                u.this.f3975a.workProgressDao().insert(new P0.o(string, this.f3978b));
            } else {
                H0.l.get().warning(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
            }
            this.f3979c.set(null);
            u.this.f3975a.setTransactionSuccessful();
        }
    }

    public u(WorkDatabase workDatabase, R0.a aVar) {
        this.f3975a = workDatabase;
        this.f3976b = aVar;
    }

    @Override // H0.r
    public C updateProgress(Context context, UUID uuid, androidx.work.b bVar) {
        androidx.work.impl.utils.futures.c cVarCreate = androidx.work.impl.utils.futures.c.create();
        this.f3976b.executeOnBackgroundThread(new a(uuid, bVar, cVarCreate));
        return cVarCreate;
    }
}
