package t1;

import H0.y;
import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import t1.C6360b;
import w1.InterfaceC6458a;

/* loaded from: classes.dex */
public abstract class d {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC6458a f36895a;

        /* renamed from: b, reason: collision with root package name */
        private Map f36896b = new HashMap();

        public a addConfig(m1.d dVar, b bVar) {
            this.f36896b.put(dVar, bVar);
            return this;
        }

        public d build() {
            if (this.f36895a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f36896b.keySet().size() < m1.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f36896b;
            this.f36896b = new HashMap();
            return d.a(this.f36895a, map);
        }

        public a setClock(InterfaceC6458a interfaceC6458a) {
            this.f36895a = interfaceC6458a;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b build();

            public abstract a setDelta(long j8);

            public abstract a setFlags(Set<c> set);

            public abstract a setMaxAllowedDelay(long j8);
        }

        public static a builder() {
            return new C6360b.C0423b().setFlags(Collections.emptySet());
        }

        abstract long a();

        abstract Set b();

        abstract long c();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    static d a(InterfaceC6458a interfaceC6458a, Map map) {
        return new C6359a(interfaceC6458a, map);
    }

    public static a builder() {
        return new a();
    }

    private static Set d(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void e(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public static d getDefault(InterfaceC6458a interfaceC6458a) {
        return builder().addConfig(m1.d.DEFAULT, b.builder().setDelta(y.DEFAULT_BACKOFF_DELAY_MILLIS).setMaxAllowedDelay(86400000L).build()).addConfig(m1.d.HIGHEST, b.builder().setDelta(1000L).setMaxAllowedDelay(86400000L).build()).addConfig(m1.d.VERY_LOW, b.builder().setDelta(86400000L).setMaxAllowedDelay(86400000L).setFlags(d(c.NETWORK_UNMETERED, c.DEVICE_IDLE)).build()).setClock(interfaceC6458a).build();
    }

    abstract InterfaceC6458a b();

    abstract Map c();

    public JobInfo.Builder configureJob(JobInfo.Builder builder, m1.d dVar, long j8, int i8) {
        builder.setMinimumLatency(getScheduleDelay(dVar, j8, i8));
        e(builder, ((b) c().get(dVar)).b());
        return builder;
    }

    public Set<c> getFlags(m1.d dVar) {
        return ((b) c().get(dVar)).b();
    }

    public long getScheduleDelay(m1.d dVar, long j8, int i8) {
        long time = j8 - b().getTime();
        b bVar = (b) c().get(dVar);
        return Math.min(Math.max(((long) Math.pow(2.0d, i8 - 1)) * bVar.a(), time), bVar.c());
    }
}
