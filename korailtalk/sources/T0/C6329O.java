package t0;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6329O {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f36866a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36867b;

    public C6329O(Uri registrationUri, boolean z8) {
        Intrinsics.checkNotNullParameter(registrationUri, "registrationUri");
        this.f36866a = registrationUri;
        this.f36867b = z8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6329O)) {
            return false;
        }
        C6329O c6329o = (C6329O) obj;
        return Intrinsics.areEqual(this.f36866a, c6329o.f36866a) && this.f36867b == c6329o.f36867b;
    }

    public final boolean getDebugKeyAllowed() {
        return this.f36867b;
    }

    public final Uri getRegistrationUri() {
        return this.f36866a;
    }

    public int hashCode() {
        return (this.f36866a.hashCode() * 31) + Boolean.hashCode(this.f36867b);
    }

    public String toString() {
        return "WebSourceParams { RegistrationUri=" + this.f36866a + ", DebugKeyAllowed=" + this.f36867b + " }";
    }
}
