package P0;

import H0.v;
import H0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p.InterfaceC6046a;

/* loaded from: classes.dex */
public final class r {
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    public long backoffDelayDuration;
    public H0.a backoffPolicy;
    public H0.c constraints;
    public boolean expedited;
    public long flexDuration;
    public String id;
    public long initialDelay;
    public androidx.work.b input;
    public String inputMergerClassName;
    public long intervalDuration;
    public long minimumRetentionDuration;
    public H0.p outOfQuotaPolicy;
    public androidx.work.b output;
    public long periodStartTime;
    public int runAttemptCount;
    public long scheduleRequestedAt;
    public v.a state;
    public String workerClassName;

    /* renamed from: a, reason: collision with root package name */
    private static final String f3642a = H0.l.tagWithPrefix("WorkSpec");
    public static final InterfaceC6046a WORK_INFO_MAPPER = new a();

    class a implements InterfaceC6046a {
        a() {
        }

        @Override // p.InterfaceC6046a
        public List<H0.v> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toWorkInfo());
            }
            return arrayList;
        }
    }

    public static class b {
        public String id;
        public v.a state;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.state != bVar.state) {
                return false;
            }
            return this.id.equals(bVar.id);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }
    }

    public static class c {
        public String id;
        public androidx.work.b output;
        public List<androidx.work.b> progress;
        public int runAttemptCount;
        public v.a state;
        public List<String> tags;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.runAttemptCount != cVar.runAttemptCount) {
                return false;
            }
            String str = this.id;
            if (str == null ? cVar.id != null : !str.equals(cVar.id)) {
                return false;
            }
            if (this.state != cVar.state) {
                return false;
            }
            androidx.work.b bVar = this.output;
            if (bVar == null ? cVar.output != null : !bVar.equals(cVar.output)) {
                return false;
            }
            List<String> list = this.tags;
            if (list == null ? cVar.tags != null : !list.equals(cVar.tags)) {
                return false;
            }
            List<androidx.work.b> list2 = this.progress;
            List<androidx.work.b> list3 = cVar.progress;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            v.a aVar = this.state;
            int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            androidx.work.b bVar = this.output;
            int iHashCode3 = (((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.runAttemptCount) * 31;
            List<String> list = this.tags;
            int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.b> list2 = this.progress;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }

        public H0.v toWorkInfo() {
            List<androidx.work.b> list = this.progress;
            return new H0.v(UUID.fromString(this.id), this.state, this.output, this.tags, (list == null || list.isEmpty()) ? androidx.work.b.EMPTY : this.progress.get(0), this.runAttemptCount);
        }
    }

    public r(String str, String str2) {
        this.state = v.a.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.EMPTY;
        this.input = bVar;
        this.output = bVar;
        this.constraints = H0.c.NONE;
        this.backoffPolicy = H0.a.EXPONENTIAL;
        this.backoffDelayDuration = y.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.scheduleRequestedAt = -1L;
        this.outOfQuotaPolicy = H0.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.id = str;
        this.workerClassName = str2;
    }

    public long calculateNextRunTime() {
        if (isBackedOff()) {
            return this.periodStartTime + Math.min(y.MAX_BACKOFF_MILLIS, this.backoffPolicy == H0.a.LINEAR ? this.backoffDelayDuration * this.runAttemptCount : (long) Math.scalb(this.backoffDelayDuration, this.runAttemptCount - 1));
        }
        if (!isPeriodic()) {
            long jCurrentTimeMillis = this.periodStartTime;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.initialDelay;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j8 = this.periodStartTime;
        long j9 = j8 == 0 ? jCurrentTimeMillis2 + this.initialDelay : j8;
        long j10 = this.flexDuration;
        long j11 = this.intervalDuration;
        if (j10 != j11) {
            return j9 + j11 + (j8 == 0 ? j10 * (-1) : 0L);
        }
        return j9 + (j8 != 0 ? j11 : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.initialDelay != rVar.initialDelay || this.intervalDuration != rVar.intervalDuration || this.flexDuration != rVar.flexDuration || this.runAttemptCount != rVar.runAttemptCount || this.backoffDelayDuration != rVar.backoffDelayDuration || this.periodStartTime != rVar.periodStartTime || this.minimumRetentionDuration != rVar.minimumRetentionDuration || this.scheduleRequestedAt != rVar.scheduleRequestedAt || this.expedited != rVar.expedited || !this.id.equals(rVar.id) || this.state != rVar.state || !this.workerClassName.equals(rVar.workerClassName)) {
            return false;
        }
        String str = this.inputMergerClassName;
        if (str == null ? rVar.inputMergerClassName == null : str.equals(rVar.inputMergerClassName)) {
            return this.input.equals(rVar.input) && this.output.equals(rVar.output) && this.constraints.equals(rVar.constraints) && this.backoffPolicy == rVar.backoffPolicy && this.outOfQuotaPolicy == rVar.outOfQuotaPolicy;
        }
        return false;
    }

    public boolean hasConstraints() {
        return !H0.c.NONE.equals(this.constraints);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        String str = this.inputMergerClassName;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31;
        long j8 = this.initialDelay;
        int i8 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.intervalDuration;
        int i9 = (i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.flexDuration;
        int iHashCode3 = (((((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode()) * 31;
        long j11 = this.backoffDelayDuration;
        int i10 = (iHashCode3 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.periodStartTime;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.minimumRetentionDuration;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.scheduleRequestedAt;
        return ((((i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.expedited ? 1 : 0)) * 31) + this.outOfQuotaPolicy.hashCode();
    }

    public boolean isBackedOff() {
        return this.state == v.a.ENQUEUED && this.runAttemptCount > 0;
    }

    public boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public void setBackoffDelayDuration(long j8) {
        if (j8 > y.MAX_BACKOFF_MILLIS) {
            H0.l.get().warning(f3642a, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j8 = 18000000;
        }
        if (j8 < y.MIN_BACKOFF_MILLIS) {
            H0.l.get().warning(f3642a, "Backoff delay duration less than minimum value", new Throwable[0]);
            j8 = 10000;
        }
        this.backoffDelayDuration = j8;
    }

    public void setPeriodic(long j8) {
        if (j8 < H0.q.MIN_PERIODIC_INTERVAL_MILLIS) {
            H0.l.get().warning(f3642a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(H0.q.MIN_PERIODIC_INTERVAL_MILLIS)), new Throwable[0]);
            j8 = 900000;
        }
        setPeriodic(j8, j8);
    }

    public String toString() {
        return "{WorkSpec: " + this.id + "}";
    }

    public void setPeriodic(long j8, long j9) {
        if (j8 < H0.q.MIN_PERIODIC_INTERVAL_MILLIS) {
            H0.l.get().warning(f3642a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(H0.q.MIN_PERIODIC_INTERVAL_MILLIS)), new Throwable[0]);
            j8 = 900000;
        }
        if (j9 < H0.q.MIN_PERIODIC_FLEX_MILLIS) {
            H0.l.get().warning(f3642a, String.format("Flex duration lesser than minimum allowed value; Changed to %s", Long.valueOf(H0.q.MIN_PERIODIC_FLEX_MILLIS)), new Throwable[0]);
            j9 = 300000;
        }
        if (j9 > j8) {
            H0.l.get().warning(f3642a, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j8)), new Throwable[0]);
            j9 = j8;
        }
        this.intervalDuration = j8;
        this.flexDuration = j9;
    }

    public r(r rVar) {
        this.state = v.a.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.EMPTY;
        this.input = bVar;
        this.output = bVar;
        this.constraints = H0.c.NONE;
        this.backoffPolicy = H0.a.EXPONENTIAL;
        this.backoffDelayDuration = y.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.scheduleRequestedAt = -1L;
        this.outOfQuotaPolicy = H0.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.id = rVar.id;
        this.workerClassName = rVar.workerClassName;
        this.state = rVar.state;
        this.inputMergerClassName = rVar.inputMergerClassName;
        this.input = new androidx.work.b(rVar.input);
        this.output = new androidx.work.b(rVar.output);
        this.initialDelay = rVar.initialDelay;
        this.intervalDuration = rVar.intervalDuration;
        this.flexDuration = rVar.flexDuration;
        this.constraints = new H0.c(rVar.constraints);
        this.runAttemptCount = rVar.runAttemptCount;
        this.backoffPolicy = rVar.backoffPolicy;
        this.backoffDelayDuration = rVar.backoffDelayDuration;
        this.periodStartTime = rVar.periodStartTime;
        this.minimumRetentionDuration = rVar.minimumRetentionDuration;
        this.scheduleRequestedAt = rVar.scheduleRequestedAt;
        this.expedited = rVar.expedited;
        this.outOfQuotaPolicy = rVar.outOfQuotaPolicy;
    }
}
