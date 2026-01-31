package Z1;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import g2.AbstractC5544f;
import g2.AbstractC5547i;

/* loaded from: classes.dex */
public interface b {
    public static final int ACTIVITY_RESULT_ADD_ACCOUNT = 1000;
    public static final int ACTIVITY_RESULT_NO_HINTS_AVAILABLE = 1002;
    public static final int ACTIVITY_RESULT_OTHER_ACCOUNT = 1001;
    public static final int CREDENTIAL_PICKER_REQUEST_CODE = 2000;

    AbstractC5547i delete(AbstractC5544f abstractC5544f, Credential credential);

    AbstractC5547i disableAutoSignIn(AbstractC5544f abstractC5544f);

    PendingIntent getHintPickerIntent(AbstractC5544f abstractC5544f, HintRequest hintRequest);

    AbstractC5547i request(AbstractC5544f abstractC5544f, com.google.android.gms.auth.api.credentials.a aVar);

    AbstractC5547i save(AbstractC5544f abstractC5544f, Credential credential);
}
