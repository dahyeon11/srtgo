package y1;

import H1.C0591z;
import H1.S0;
import H1.h2;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final S0 f37602a;

    /* renamed from: b, reason: collision with root package name */
    private final List f37603b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private k f37604c;

    private y(S0 s02) {
        this.f37602a = s02;
        if (s02 != null) {
            try {
                List listZzj = s02.zzj();
                if (listZzj != null) {
                    Iterator it = listZzj.iterator();
                    while (it.hasNext()) {
                        k kVarZza = k.zza((h2) it.next());
                        if (kVarZza != null) {
                            this.f37603b.add(kVarZza);
                        }
                    }
                }
            } catch (RemoteException e8) {
                L1.n.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e8);
            }
        }
        S0 s03 = this.f37602a;
        if (s03 == null) {
            return;
        }
        try {
            h2 h2VarZzf = s03.zzf();
            if (h2VarZzf != null) {
                this.f37604c = k.zza(h2VarZzf);
            }
        } catch (RemoteException e9) {
            L1.n.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e9);
        }
    }

    public static y zza(S0 s02) {
        if (s02 != null) {
            return new y(s02);
        }
        return null;
    }

    public static y zzb(S0 s02) {
        return new y(s02);
    }

    public List<k> getAdapterResponses() {
        return this.f37603b;
    }

    public k getLoadedAdapterResponseInfo() {
        return this.f37604c;
    }

    public String getMediationAdapterClassName() {
        try {
            S0 s02 = this.f37602a;
            if (s02 != null) {
                return s02.zzg();
            }
            return null;
        } catch (RemoteException e8) {
            L1.n.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e8);
            return null;
        }
    }

    public Bundle getResponseExtras() {
        try {
            S0 s02 = this.f37602a;
            if (s02 != null) {
                return s02.zze();
            }
        } catch (RemoteException e8) {
            L1.n.zzh("Could not forward getResponseExtras to ResponseInfo.", e8);
        }
        return new Bundle();
    }

    public String getResponseId() {
        try {
            S0 s02 = this.f37602a;
            if (s02 != null) {
                return s02.zzi();
            }
            return null;
        } catch (RemoteException e8) {
            L1.n.zzh("Could not forward getResponseId to ResponseInfo.", e8);
            return null;
        }
    }

    public String toString() {
        try {
            return zzd().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final S0 zzc() {
        return this.f37602a;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f37603b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((k) it.next()).zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        k kVar = this.f37604c;
        if (kVar != null) {
            jSONObject.put("Loaded Adapter Response", kVar.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", C0591z.zzb().zzi(responseExtras));
        }
        return jSONObject;
    }
}
