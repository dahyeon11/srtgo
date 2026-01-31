package i2;

import com.google.android.gms.common.api.Status;
import g2.C5540b;
import g2.C5550l;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5669b {
    public static C5540b fromStatus(Status status) {
        return status.hasResolution() ? new C5550l(status) : new C5540b(status);
    }
}
