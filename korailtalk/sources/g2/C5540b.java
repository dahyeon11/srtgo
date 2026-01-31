package g2;

import com.google.android.gms.common.api.Status;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5540b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected final Status f31280a;

    public C5540b(Status status) {
        super(status.getStatusCode() + ": " + (status.getStatusMessage() != null ? status.getStatusMessage() : ""));
        this.f31280a = status;
    }

    public Status getStatus() {
        return this.f31280a;
    }

    public int getStatusCode() {
        return this.f31280a.getStatusCode();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.f31280a.getStatusMessage();
    }
}
