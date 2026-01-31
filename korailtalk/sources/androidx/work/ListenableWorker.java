package androidx.work;

import H0.g;
import H0.z;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.c;
import com.google.common.util.concurrent.C;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: a */
    private Context f11090a;

    /* renamed from: b */
    private WorkerParameters f11091b;

    /* renamed from: c */
    private volatile boolean f11092c;

    /* renamed from: d */
    private boolean f11093d;

    /* renamed from: e */
    private boolean f11094e;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C0177a extends a {

            /* renamed from: a */
            private final androidx.work.b f11095a;

            public C0177a() {
                this(androidx.work.b.EMPTY);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0177a.class != obj.getClass()) {
                    return false;
                }
                return this.f11095a.equals(((C0177a) obj).f11095a);
            }

            @Override // androidx.work.ListenableWorker.a
            public androidx.work.b getOutputData() {
                return this.f11095a;
            }

            public int hashCode() {
                return (C0177a.class.getName().hashCode() * 31) + this.f11095a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f11095a + '}';
            }

            public C0177a(androidx.work.b bVar) {
                this.f11095a = bVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            @Override // androidx.work.ListenableWorker.a
            public androidx.work.b getOutputData() {
                return androidx.work.b.EMPTY;
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a */
            private final androidx.work.b f11096a;

            public c() {
                this(androidx.work.b.EMPTY);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f11096a.equals(((c) obj).f11096a);
            }

            @Override // androidx.work.ListenableWorker.a
            public androidx.work.b getOutputData() {
                return this.f11096a;
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f11096a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f11096a + '}';
            }

            public c(androidx.work.b bVar) {
                this.f11096a = bVar;
            }
        }

        a() {
        }

        public static a failure() {
            return new C0177a();
        }

        public static a retry() {
            return new b();
        }

        public static a success() {
            return new c();
        }

        public abstract androidx.work.b getOutputData();

        public static a failure(androidx.work.b bVar) {
            return new C0177a(bVar);
        }

        public static a success(androidx.work.b bVar) {
            return new c(bVar);
        }
    }

    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f11090a = context;
        this.f11091b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f11090a;
    }

    public Executor getBackgroundExecutor() {
        return this.f11091b.getBackgroundExecutor();
    }

    public C getForegroundInfoAsync() {
        c cVarCreate = c.create();
        cVarCreate.setException(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVarCreate;
    }

    public final UUID getId() {
        return this.f11091b.getId();
    }

    public final b getInputData() {
        return this.f11091b.getInputData();
    }

    public final Network getNetwork() {
        return this.f11091b.getNetwork();
    }

    public final int getRunAttemptCount() {
        return this.f11091b.getRunAttemptCount();
    }

    public final Set<String> getTags() {
        return this.f11091b.getTags();
    }

    public R0.a getTaskExecutor() {
        return this.f11091b.getTaskExecutor();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f11091b.getTriggeredContentAuthorities();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f11091b.getTriggeredContentUris();
    }

    public z getWorkerFactory() {
        return this.f11091b.getWorkerFactory();
    }

    public boolean isRunInForeground() {
        return this.f11094e;
    }

    public final boolean isStopped() {
        return this.f11092c;
    }

    public final boolean isUsed() {
        return this.f11093d;
    }

    public void onStopped() {
    }

    public final C setForegroundAsync(g gVar) {
        this.f11094e = true;
        return this.f11091b.getForegroundUpdater().setForegroundAsync(getApplicationContext(), getId(), gVar);
    }

    public C setProgressAsync(b bVar) {
        return this.f11091b.getProgressUpdater().updateProgress(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z8) {
        this.f11094e = z8;
    }

    public final void setUsed() {
        this.f11093d = true;
    }

    public abstract C startWork();

    public final void stop() {
        this.f11092c = true;
        onStopped();
    }
}
