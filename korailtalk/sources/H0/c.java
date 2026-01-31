package H0;

import android.net.Uri;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {
    public static final c NONE = new a().build();

    /* renamed from: a, reason: collision with root package name */
    private m f1567a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1568b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1569c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1570d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1571e;

    /* renamed from: f, reason: collision with root package name */
    private long f1572f;

    /* renamed from: g, reason: collision with root package name */
    private long f1573g;

    /* renamed from: h, reason: collision with root package name */
    private d f1574h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f1575a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1576b;

        /* renamed from: c, reason: collision with root package name */
        m f1577c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1578d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1579e;

        /* renamed from: f, reason: collision with root package name */
        long f1580f;

        /* renamed from: g, reason: collision with root package name */
        long f1581g;

        /* renamed from: h, reason: collision with root package name */
        d f1582h;

        public a() {
            this.f1575a = false;
            this.f1576b = false;
            this.f1577c = m.NOT_REQUIRED;
            this.f1578d = false;
            this.f1579e = false;
            this.f1580f = -1L;
            this.f1581g = -1L;
            this.f1582h = new d();
        }

        public a addContentUriTrigger(Uri uri, boolean z8) {
            this.f1582h.add(uri, z8);
            return this;
        }

        public c build() {
            return new c(this);
        }

        public a setRequiredNetworkType(m mVar) {
            this.f1577c = mVar;
            return this;
        }

        public a setRequiresBatteryNotLow(boolean z8) {
            this.f1578d = z8;
            return this;
        }

        public a setRequiresCharging(boolean z8) {
            this.f1575a = z8;
            return this;
        }

        public a setRequiresDeviceIdle(boolean z8) {
            this.f1576b = z8;
            return this;
        }

        public a setRequiresStorageNotLow(boolean z8) {
            this.f1579e = z8;
            return this;
        }

        public a setTriggerContentMaxDelay(long j8, TimeUnit timeUnit) {
            this.f1581g = timeUnit.toMillis(j8);
            return this;
        }

        public a setTriggerContentUpdateDelay(long j8, TimeUnit timeUnit) {
            this.f1580f = timeUnit.toMillis(j8);
            return this;
        }

        public a setTriggerContentMaxDelay(Duration duration) {
            this.f1581g = duration.toMillis();
            return this;
        }

        public a setTriggerContentUpdateDelay(Duration duration) {
            this.f1580f = duration.toMillis();
            return this;
        }

        public a(c cVar) {
            this.f1575a = false;
            this.f1576b = false;
            this.f1577c = m.NOT_REQUIRED;
            this.f1578d = false;
            this.f1579e = false;
            this.f1580f = -1L;
            this.f1581g = -1L;
            this.f1582h = new d();
            this.f1575a = cVar.requiresCharging();
            this.f1576b = cVar.requiresDeviceIdle();
            this.f1577c = cVar.getRequiredNetworkType();
            this.f1578d = cVar.requiresBatteryNotLow();
            this.f1579e = cVar.requiresStorageNotLow();
            this.f1580f = cVar.getTriggerContentUpdateDelay();
            this.f1581g = cVar.getTriggerMaxContentDelay();
            this.f1582h = cVar.getContentUriTriggers();
        }
    }

    public c() {
        this.f1567a = m.NOT_REQUIRED;
        this.f1572f = -1L;
        this.f1573g = -1L;
        this.f1574h = new d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1568b == cVar.f1568b && this.f1569c == cVar.f1569c && this.f1570d == cVar.f1570d && this.f1571e == cVar.f1571e && this.f1572f == cVar.f1572f && this.f1573g == cVar.f1573g && this.f1567a == cVar.f1567a) {
            return this.f1574h.equals(cVar.f1574h);
        }
        return false;
    }

    public d getContentUriTriggers() {
        return this.f1574h;
    }

    public m getRequiredNetworkType() {
        return this.f1567a;
    }

    public long getTriggerContentUpdateDelay() {
        return this.f1572f;
    }

    public long getTriggerMaxContentDelay() {
        return this.f1573g;
    }

    public boolean hasContentUriTriggers() {
        return this.f1574h.size() > 0;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f1567a.hashCode() * 31) + (this.f1568b ? 1 : 0)) * 31) + (this.f1569c ? 1 : 0)) * 31) + (this.f1570d ? 1 : 0)) * 31) + (this.f1571e ? 1 : 0)) * 31;
        long j8 = this.f1572f;
        int i8 = (iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f1573g;
        return ((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.f1574h.hashCode();
    }

    public boolean requiresBatteryNotLow() {
        return this.f1570d;
    }

    public boolean requiresCharging() {
        return this.f1568b;
    }

    public boolean requiresDeviceIdle() {
        return this.f1569c;
    }

    public boolean requiresStorageNotLow() {
        return this.f1571e;
    }

    public void setContentUriTriggers(d dVar) {
        this.f1574h = dVar;
    }

    public void setRequiredNetworkType(m mVar) {
        this.f1567a = mVar;
    }

    public void setRequiresBatteryNotLow(boolean z8) {
        this.f1570d = z8;
    }

    public void setRequiresCharging(boolean z8) {
        this.f1568b = z8;
    }

    public void setRequiresDeviceIdle(boolean z8) {
        this.f1569c = z8;
    }

    public void setRequiresStorageNotLow(boolean z8) {
        this.f1571e = z8;
    }

    public void setTriggerContentUpdateDelay(long j8) {
        this.f1572f = j8;
    }

    public void setTriggerMaxContentDelay(long j8) {
        this.f1573g = j8;
    }

    c(a aVar) {
        this.f1567a = m.NOT_REQUIRED;
        this.f1572f = -1L;
        this.f1573g = -1L;
        this.f1574h = new d();
        this.f1568b = aVar.f1575a;
        this.f1569c = aVar.f1576b;
        this.f1567a = aVar.f1577c;
        this.f1570d = aVar.f1578d;
        this.f1571e = aVar.f1579e;
        this.f1574h = aVar.f1582h;
        this.f1572f = aVar.f1580f;
        this.f1573g = aVar.f1581g;
    }

    public c(c cVar) {
        this.f1567a = m.NOT_REQUIRED;
        this.f1572f = -1L;
        this.f1573g = -1L;
        this.f1574h = new d();
        this.f1568b = cVar.f1568b;
        this.f1569c = cVar.f1569c;
        this.f1567a = cVar.f1567a;
        this.f1570d = cVar.f1570d;
        this.f1571e = cVar.f1571e;
        this.f1574h = cVar.f1574h;
    }
}
