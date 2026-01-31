package g2;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.common.api.Status;

/* renamed from: g2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5550l extends C5540b {
    public C5550l(Status status) {
        super(status);
    }

    public PendingIntent getResolution() {
        return getStatus().getResolution();
    }

    public void startResolutionForResult(Activity activity, int i8) throws IntentSender.SendIntentException {
        getStatus().startResolutionForResult(activity, i8);
    }
}
