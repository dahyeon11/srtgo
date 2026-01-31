package H0;

import H0.v;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class y {
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    public static final long MIN_BACKOFF_MILLIS = 10000;

    /* renamed from: a, reason: collision with root package name */
    private UUID f1605a;

    /* renamed from: b, reason: collision with root package name */
    private P0.r f1606b;

    /* renamed from: c, reason: collision with root package name */
    private Set f1607c;

    protected y(UUID uuid, P0.r rVar, Set set) {
        this.f1605a = uuid;
        this.f1606b = rVar;
        this.f1607c = set;
    }

    public UUID getId() {
        return this.f1605a;
    }

    public String getStringId() {
        return this.f1605a.toString();
    }

    public Set<String> getTags() {
        return this.f1607c;
    }

    public P0.r getWorkSpec() {
        return this.f1606b;
    }

    public static abstract class a {

        /* renamed from: c, reason: collision with root package name */
        P0.r f1610c;

        /* renamed from: e, reason: collision with root package name */
        Class f1612e;

        /* renamed from: a, reason: collision with root package name */
        boolean f1608a = false;

        /* renamed from: d, reason: collision with root package name */
        Set f1611d = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        UUID f1609b = UUID.randomUUID();

        a(Class cls) {
            this.f1612e = cls;
            this.f1610c = new P0.r(this.f1609b.toString(), cls.getName());
            addTag(cls.getName());
        }

        abstract y a();

        public final a addTag(String str) {
            this.f1611d.add(str);
            return b();
        }

        abstract a b();

        public final y build() {
            y yVarA = a();
            c cVar = this.f1610c.constraints;
            boolean z8 = cVar.hasContentUriTriggers() || cVar.requiresBatteryNotLow() || cVar.requiresCharging() || cVar.requiresDeviceIdle();
            P0.r rVar = this.f1610c;
            if (rVar.expedited) {
                if (z8) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (rVar.initialDelay > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f1609b = UUID.randomUUID();
            P0.r rVar2 = new P0.r(this.f1610c);
            this.f1610c = rVar2;
            rVar2.id = this.f1609b.toString();
            return yVarA;
        }

        public final a keepResultsForAtLeast(long j8, TimeUnit timeUnit) {
            this.f1610c.minimumRetentionDuration = timeUnit.toMillis(j8);
            return b();
        }

        public final a setBackoffCriteria(H0.a aVar, long j8, TimeUnit timeUnit) {
            this.f1608a = true;
            P0.r rVar = this.f1610c;
            rVar.backoffPolicy = aVar;
            rVar.setBackoffDelayDuration(timeUnit.toMillis(j8));
            return b();
        }

        public final a setConstraints(c cVar) {
            this.f1610c.constraints = cVar;
            return b();
        }

        public a setExpedited(p pVar) {
            P0.r rVar = this.f1610c;
            rVar.expedited = true;
            rVar.outOfQuotaPolicy = pVar;
            return b();
        }

        public a setInitialDelay(long j8, TimeUnit timeUnit) {
            this.f1610c.initialDelay = timeUnit.toMillis(j8);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f1610c.initialDelay) {
                return b();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final a setInitialRunAttemptCount(int i8) {
            this.f1610c.runAttemptCount = i8;
            return b();
        }

        public final a setInitialState(v.a aVar) {
            this.f1610c.state = aVar;
            return b();
        }

        public final a setInputData(androidx.work.b bVar) {
            this.f1610c.input = bVar;
            return b();
        }

        public final a setPeriodStartTime(long j8, TimeUnit timeUnit) {
            this.f1610c.periodStartTime = timeUnit.toMillis(j8);
            return b();
        }

        public final a setScheduleRequestedAt(long j8, TimeUnit timeUnit) {
            this.f1610c.scheduleRequestedAt = timeUnit.toMillis(j8);
            return b();
        }

        public final a keepResultsForAtLeast(Duration duration) {
            this.f1610c.minimumRetentionDuration = duration.toMillis();
            return b();
        }

        public final a setBackoffCriteria(H0.a aVar, Duration duration) {
            this.f1608a = true;
            P0.r rVar = this.f1610c;
            rVar.backoffPolicy = aVar;
            rVar.setBackoffDelayDuration(duration.toMillis());
            return b();
        }

        public a setInitialDelay(Duration duration) {
            this.f1610c.initialDelay = duration.toMillis();
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f1610c.initialDelay) {
                return b();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }
}
