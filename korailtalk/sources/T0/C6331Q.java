package t0;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6331Q {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f36874a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36875b;

    public C6331Q(Uri registrationUri, boolean z8) {
        Intrinsics.checkNotNullParameter(registrationUri, "registrationUri");
        this.f36874a = registrationUri;
        this.f36875b = z8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6331Q)) {
            return false;
        }
        C6331Q c6331q = (C6331Q) obj;
        return Intrinsics.areEqual(this.f36874a, c6331q.f36874a) && this.f36875b == c6331q.f36875b;
    }

    public final boolean getDebugKeyAllowed() {
        return this.f36875b;
    }

    public final Uri getRegistrationUri() {
        return this.f36874a;
    }

    public int hashCode() {
        return (this.f36874a.hashCode() * 31) + Boolean.hashCode(this.f36875b);
    }

    public String toString() {
        return "WebTriggerParams { RegistrationUri=" + this.f36874a + ", DebugKeyAllowed=" + this.f36875b + " }";
    }
}
