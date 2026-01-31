package v3;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final File f37241a;

    /* renamed from: b, reason: collision with root package name */
    private final l3.c f37242b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(l3.c cVar) {
        this.f37241a = new File(cVar.getApplicationContext().getFilesDir(), "PersistedInstallation." + cVar.getPersistenceKey() + ".json");
        this.f37242b = cVar;
    }

    private JSONObject a() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f37241a);
            while (true) {
                try {
                    int i8 = fileInputStream.read(bArr, 0, 16384);
                    if (i8 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i8);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused2) {
            return new JSONObject();
        }
    }

    public void clearForTesting() {
        this.f37241a.delete();
    }

    public d insertOrUpdatePersistedInstallationEntry(d dVar) throws JSONException, IOException {
        File fileCreateTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.getFirebaseInstallationId());
            jSONObject.put("Status", dVar.getRegistrationStatus().ordinal());
            jSONObject.put("AuthToken", dVar.getAuthToken());
            jSONObject.put("RefreshToken", dVar.getRefreshToken());
            jSONObject.put("TokenCreationEpochInSecs", dVar.getTokenCreationEpochInSecs());
            jSONObject.put("ExpiresInSecs", dVar.getExpiresInSecs());
            jSONObject.put("FisError", dVar.getFisError());
            fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f37242b.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (fileCreateTempFile.renameTo(this.f37241a)) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public d readPersistedInstallationEntryValue() throws IOException {
        JSONObject jSONObjectA = a();
        String strOptString = jSONObjectA.optString("Fid", null);
        int iOptInt = jSONObjectA.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectA.optString("AuthToken", null);
        String strOptString3 = jSONObjectA.optString("RefreshToken", null);
        long jOptLong = jSONObjectA.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectA.optLong("ExpiresInSecs", 0L);
        return d.builder().setFirebaseInstallationId(strOptString).setRegistrationStatus(a.values()[iOptInt]).setAuthToken(strOptString2).setRefreshToken(strOptString3).setTokenCreationEpochInSecs(jOptLong).setExpiresInSecs(jOptLong2).setFisError(jSONObjectA.optString("FisError", null)).build();
    }
}
