package v3;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import e3.AbstractC5358c;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f37238c = {"*", FirebaseMessaging.INSTANCE_ID_SCOPE, "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f37239a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37240b;

    public b(l3.c cVar) {
        this.f37239a = cVar.getApplicationContext().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f37240b = b(cVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(l3.c cVar) {
        String gcmSenderId = cVar.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = cVar.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & AbstractC5358c.SI) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e8) {
            Log.w("ContentValues", "Invalid key stored " + e8);
            return null;
        }
    }

    private String f() {
        String string;
        synchronized (this.f37239a) {
            string = this.f37239a.getString("|S|id", null);
        }
        return string;
    }

    private String g() {
        synchronized (this.f37239a) {
            try {
                String string = this.f37239a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String readIid() {
        synchronized (this.f37239a) {
            try {
                String strF = f();
                if (strF != null) {
                    return strF;
                }
                return g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String readToken() {
        synchronized (this.f37239a) {
            try {
                for (String str : f37238c) {
                    String string = this.f37239a.getString(a(this.f37240b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(SharedPreferences sharedPreferences, String str) {
        this.f37239a = sharedPreferences;
        this.f37240b = str;
    }
}
