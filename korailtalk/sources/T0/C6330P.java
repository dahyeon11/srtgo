package t0;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6330P {

    /* renamed from: a, reason: collision with root package name */
    private final List f36868a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f36869b;

    /* renamed from: c, reason: collision with root package name */
    private final InputEvent f36870c;

    /* renamed from: d, reason: collision with root package name */
    private final Uri f36871d;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f36872e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f36873f;

    public C6330P(List<C6329O> webSourceParams, Uri topOriginUri, InputEvent inputEvent, Uri uri, Uri uri2, Uri uri3) {
        Intrinsics.checkNotNullParameter(webSourceParams, "webSourceParams");
        Intrinsics.checkNotNullParameter(topOriginUri, "topOriginUri");
        this.f36868a = webSourceParams;
        this.f36869b = topOriginUri;
        this.f36870c = inputEvent;
        this.f36871d = uri;
        this.f36872e = uri2;
        this.f36873f = uri3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6330P)) {
            return false;
        }
        C6330P c6330p = (C6330P) obj;
        return Intrinsics.areEqual(this.f36868a, c6330p.f36868a) && Intrinsics.areEqual(this.f36872e, c6330p.f36872e) && Intrinsics.areEqual(this.f36871d, c6330p.f36871d) && Intrinsics.areEqual(this.f36869b, c6330p.f36869b) && Intrinsics.areEqual(this.f36870c, c6330p.f36870c) && Intrinsics.areEqual(this.f36873f, c6330p.f36873f);
    }

    public final Uri getAppDestination() {
        return this.f36871d;
    }

    public final InputEvent getInputEvent() {
        return this.f36870c;
    }

    public final Uri getTopOriginUri() {
        return this.f36869b;
    }

    public final Uri getVerifiedDestination() {
        return this.f36873f;
    }

    public final Uri getWebDestination() {
        return this.f36872e;
    }

    public final List<C6329O> getWebSourceParams() {
        return this.f36868a;
    }

    public int hashCode() {
        int iHashCode = (this.f36868a.hashCode() * 31) + this.f36869b.hashCode();
        InputEvent inputEvent = this.f36870c;
        if (inputEvent != null) {
            iHashCode = (iHashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.f36871d;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f36872e;
        if (uri2 != null) {
            iHashCode = (iHashCode * 31) + uri2.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + this.f36869b.hashCode();
        InputEvent inputEvent2 = this.f36870c;
        if (inputEvent2 != null) {
            iHashCode2 = (iHashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.f36873f;
        return uri3 != null ? (iHashCode2 * 31) + uri3.hashCode() : iHashCode2;
    }

    public String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.f36868a + "], TopOriginUri=" + this.f36869b + ", InputEvent=" + this.f36870c + ", AppDestination=" + this.f36871d + ", WebDestination=" + this.f36872e + ", VerifiedDestination=" + this.f36873f) + " }";
    }

    public /* synthetic */ C6330P(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, uri, (i8 & 4) != 0 ? null : inputEvent, (i8 & 8) != 0 ? null : uri2, (i8 & 16) != 0 ? null : uri3, (i8 & 32) != 0 ? null : uri4);
    }
}
