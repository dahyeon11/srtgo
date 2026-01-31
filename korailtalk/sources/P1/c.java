package p1;

import android.content.Context;
import w1.InterfaceC6458a;

/* loaded from: classes.dex */
final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34572a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6458a f34573b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6458a f34574c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34575d;

    c(Context context, InterfaceC6458a interfaceC6458a, InterfaceC6458a interfaceC6458a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f34572a = context;
        if (interfaceC6458a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f34573b = interfaceC6458a;
        if (interfaceC6458a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f34574c = interfaceC6458a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f34575d = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f34572a.equals(hVar.getApplicationContext()) && this.f34573b.equals(hVar.getWallClock()) && this.f34574c.equals(hVar.getMonotonicClock()) && this.f34575d.equals(hVar.getBackendName());
    }

    @Override // p1.h
    public Context getApplicationContext() {
        return this.f34572a;
    }

    @Override // p1.h
    public String getBackendName() {
        return this.f34575d;
    }

    @Override // p1.h
    public InterfaceC6458a getMonotonicClock() {
        return this.f34574c;
    }

    @Override // p1.h
    public InterfaceC6458a getWallClock() {
        return this.f34573b;
    }

    public int hashCode() {
        return ((((((this.f34572a.hashCode() ^ 1000003) * 1000003) ^ this.f34573b.hashCode()) * 1000003) ^ this.f34574c.hashCode()) * 1000003) ^ this.f34575d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f34572a + ", wallClock=" + this.f34573b + ", monotonicClock=" + this.f34574c + ", backendName=" + this.f34575d + "}";
    }
}
