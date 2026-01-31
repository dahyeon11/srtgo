package R1;

import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC4669vi;
import com.google.android.gms.internal.ads.C2272ai;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class H extends T1.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4302a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0722a f4303b;

    H(C0722a c0722a, String str) {
        this.f4302a = str;
        this.f4303b = c0722a;
    }

    @Override // T1.b
    public final void onFailure(String str) {
        long jLongValue;
        L1.n.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        Locale locale = Locale.getDefault();
        String str2 = this.f4302a;
        C2272ai c2272ai = AbstractC4669vi.zza;
        if (((Boolean) c2272ai.zze()).booleanValue()) {
            jLongValue = ((Long) H1.C.zzc().zza(AbstractC4439th.zzjR)).longValue();
        } else {
            jLongValue = 0;
        }
        final String str3 = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'error': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", str2, str, Long.valueOf(jLongValue));
        if (!((Boolean) c2272ai.zze()).booleanValue()) {
            this.f4303b.f4341b.evaluateJavascript(str3, null);
            return;
        }
        try {
            this.f4303b.f4347h.execute(new Runnable() { // from class: R1.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f4303b.f4341b.evaluateJavascript(str3, null);
                }
            });
        } catch (RuntimeException e8) {
            G1.u.zzo().zzv(e8, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
        }
    }

    @Override // T1.b
    public final void onSuccess(T1.a aVar) throws JSONException {
        final String str;
        long jLongValue;
        String query = aVar.getQuery();
        long jLongValue2 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f4302a);
            jSONObject.put("signal", query);
            if (((Boolean) AbstractC4669vi.zza.zze()).booleanValue()) {
                jLongValue = ((Long) H1.C.zzc().zza(AbstractC4439th.zzjR)).longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject.put("sdk_ttl_ms", jLongValue);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String str2 = this.f4302a;
            Locale locale = Locale.getDefault();
            String query2 = aVar.getQuery();
            if (((Boolean) AbstractC4669vi.zza.zze()).booleanValue()) {
                jLongValue2 = ((Long) H1.C.zzc().zza(AbstractC4439th.zzjR)).longValue();
            }
            str = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'signal': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", str2, query2, Long.valueOf(jLongValue2));
        }
        if (!((Boolean) AbstractC4669vi.zza.zze()).booleanValue()) {
            this.f4303b.f4341b.evaluateJavascript(str, null);
            return;
        }
        try {
            this.f4303b.f4347h.execute(new Runnable() { // from class: R1.G
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f4303b.f4341b.evaluateJavascript(str, null);
                }
            });
        } catch (RuntimeException e8) {
            G1.u.zzo().zzv(e8, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
        }
    }
}
