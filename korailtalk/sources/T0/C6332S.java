package t0;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6332S {

    /* renamed from: a, reason: collision with root package name */
    private final List f36876a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f36877b;

    public C6332S(List<C6331Q> webTriggerParams, Uri destination) {
        Intrinsics.checkNotNullParameter(webTriggerParams, "webTriggerParams");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f36876a = webTriggerParams;
        this.f36877b = destination;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6332S)) {
            return false;
        }
        C6332S c6332s = (C6332S) obj;
        return Intrinsics.areEqual(this.f36876a, c6332s.f36876a) && Intrinsics.areEqual(this.f36877b, c6332s.f36877b);
    }

    public final Uri getDestination() {
        return this.f36877b;
    }

    public final List<C6331Q> getWebTriggerParams() {
        return this.f36876a;
    }

    public int hashCode() {
        return (this.f36876a.hashCode() * 31) + this.f36877b.hashCode();
    }

    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.f36876a + ", Destination=" + this.f36877b;
    }
}
