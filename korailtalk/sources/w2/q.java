package w2;

import Y1.a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import i2.AbstractC5683p;
import j2.AbstractC5818e;

/* loaded from: classes2.dex */
public abstract class q {
    public static PendingIntent zzc(Context context, a.C0091a c0091a, HintRequest hintRequest, String str) {
        AbstractC5683p.checkNotNull(context, "context must not be null");
        AbstractC5683p.checkNotNull(hintRequest, "request must not be null");
        String strZzd = c0091a == null ? null : c0091a.zzd();
        String strZzw = TextUtils.isEmpty(str) ? b.zzw() : (String) AbstractC5683p.checkNotNull(str);
        Intent intentPutExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", strZzd);
        intentPutExtra.putExtra("logSessionId", strZzw);
        AbstractC5818e.serializeToIntentExtra(hintRequest, intentPutExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE, intentPutExtra, 134217728);
    }
}
