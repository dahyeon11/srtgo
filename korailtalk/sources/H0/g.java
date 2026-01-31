package H0;

import android.app.Notification;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f1588a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1589b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f1590c;

    public g(int i8, Notification notification) {
        this(i8, notification, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f1588a == gVar.f1588a && this.f1589b == gVar.f1589b) {
            return this.f1590c.equals(gVar.f1590c);
        }
        return false;
    }

    public int getForegroundServiceType() {
        return this.f1589b;
    }

    public Notification getNotification() {
        return this.f1590c;
    }

    public int getNotificationId() {
        return this.f1588a;
    }

    public int hashCode() {
        return (((this.f1588a * 31) + this.f1589b) * 31) + this.f1590c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f1588a + ", mForegroundServiceType=" + this.f1589b + ", mNotification=" + this.f1590c + '}';
    }

    public g(int i8, Notification notification, int i9) {
        this.f1588a = i8;
        this.f1590c = notification;
        this.f1589b = i9;
    }
}
