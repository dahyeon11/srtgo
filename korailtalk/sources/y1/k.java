package y1;

import H1.C0534f1;
import H1.h2;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final h2 f37586a;

    /* renamed from: b, reason: collision with root package name */
    private final C6521b f37587b;

    private k(h2 h2Var) {
        this.f37586a = h2Var;
        C0534f1 c0534f1 = h2Var.zzc;
        this.f37587b = c0534f1 == null ? null : c0534f1.zza();
    }

    public static k zza(h2 h2Var) {
        if (h2Var != null) {
            return new k(h2Var);
        }
        return null;
    }

    public C6521b getAdError() {
        return this.f37587b;
    }

    public String getAdSourceId() {
        return this.f37586a.zzf;
    }

    public String getAdSourceInstanceId() {
        return this.f37586a.zzh;
    }

    public String getAdSourceInstanceName() {
        return this.f37586a.zzg;
    }

    public String getAdSourceName() {
        return this.f37586a.zze;
    }

    public String getAdapterClassName() {
        return this.f37586a.zza;
    }

    public Bundle getCredentials() {
        return this.f37586a.zzd;
    }

    public long getLatencyMillis() {
        return this.f37586a.zzb;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f37586a.zza);
        jSONObject.put("Latency", this.f37586a.zzb);
        String adSourceName = getAdSourceName();
        if (adSourceName == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", adSourceName);
        }
        String adSourceId = getAdSourceId();
        if (adSourceId == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", adSourceId);
        }
        String adSourceInstanceName = getAdSourceInstanceName();
        if (adSourceInstanceName == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", adSourceInstanceName);
        }
        String adSourceInstanceId = getAdSourceInstanceId();
        if (adSourceInstanceId == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", adSourceInstanceId);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f37586a.zzd.keySet()) {
            jSONObject2.put(str, this.f37586a.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        C6521b c6521b = this.f37587b;
        if (c6521b == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", c6521b.zzb());
        }
        return jSONObject;
    }
}
