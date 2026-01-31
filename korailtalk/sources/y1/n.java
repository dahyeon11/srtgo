package y1;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends C6521b {

    /* renamed from: e, reason: collision with root package name */
    private final y f37589e;

    public n(int i8, String str, String str2, C6521b c6521b, y yVar) {
        super(i8, str, str2, c6521b);
        this.f37589e = yVar;
    }

    public y getResponseInfo() {
        return this.f37589e;
    }

    @Override // y1.C6521b
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // y1.C6521b
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObjectZzb = super.zzb();
        y responseInfo = getResponseInfo();
        if (responseInfo == null) {
            jSONObjectZzb.put("Response Info", "null");
        } else {
            jSONObjectZzb.put("Response Info", responseInfo.zzd());
        }
        return jSONObjectZzb;
    }
}
