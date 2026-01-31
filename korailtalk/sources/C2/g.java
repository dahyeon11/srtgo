package c2;

import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;
import g2.AbstractC5547i;
import g2.AbstractC5548j;
import h2.C5596m;
import i2.AbstractC5683p;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import l2.C5888a;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static final C5888a f11456c = new C5888a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    private final String f11457a;

    /* renamed from: b, reason: collision with root package name */
    private final C5596m f11458b = new C5596m((AbstractC5544f) null);

    private g(String str) {
        this.f11457a = AbstractC5683p.checkNotEmpty(str);
    }

    public static AbstractC5547i zzi(String str) {
        if (str == null) {
            return AbstractC5548j.immediateFailedResult(new Status(4), null);
        }
        g gVar = new g(str);
        new Thread(gVar).start();
        return gVar.f11458b;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String strValueOf = String.valueOf(this.f11457a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strValueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(strValueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                f11456c.e("Unable to revoke access!", new Object[0]);
            }
            C5888a c5888a = f11456c;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            c5888a.d(sb.toString(), new Object[0]);
        } catch (IOException e8) {
            C5888a c5888a2 = f11456c;
            String strValueOf2 = String.valueOf(e8.toString());
            c5888a2.e(strValueOf2.length() != 0 ? "IOException when revoking access: ".concat(strValueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e9) {
            C5888a c5888a3 = f11456c;
            String strValueOf3 = String.valueOf(e9.toString());
            c5888a3.e(strValueOf3.length() != 0 ? "Exception when revoking access: ".concat(strValueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f11458b.setResult(status);
    }
}
