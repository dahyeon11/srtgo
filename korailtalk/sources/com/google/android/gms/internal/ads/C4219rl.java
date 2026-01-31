package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.text.TextUtils;
import com.kakao.sdk.user.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4219rl implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final Object f22511a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f22512b = new HashMap();

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(Constants.ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : Q7.X.LF.concat(String.valueOf(str4));
        synchronized (this.f22511a) {
            try {
                InterfaceC4106ql interfaceC4106ql = (InterfaceC4106ql) this.f22512b.remove(str);
                if (interfaceC4106ql == null) {
                    L1.n.zzj("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    interfaceC4106ql.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    interfaceC4106ql.zzb(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (AbstractC0667v0.zzc()) {
                        AbstractC0667v0.zza("Result GMSG: " + jSONObject.toString(2));
                    }
                    interfaceC4106ql.zzb(jSONObject);
                } catch (JSONException e8) {
                    interfaceC4106ql.zza(e8.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.common.util.concurrent.C zzb(InterfaceC1439Hm interfaceC1439Hm, String str, JSONObject jSONObject) throws JSONException {
        C1203Bt c1203Bt = new C1203Bt();
        G1.u.zzp();
        String string = UUID.randomUUID().toString();
        zzc(string, new C3992pl(this, c1203Bt));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Constants.ID, string);
            jSONObject2.put("args", jSONObject);
            interfaceC1439Hm.zzl(str, jSONObject2);
        } catch (Exception e8) {
            c1203Bt.zzd(e8);
        }
        return c1203Bt;
    }

    public final void zzc(String str, InterfaceC4106ql interfaceC4106ql) {
        synchronized (this.f22511a) {
            this.f22512b.put(str, interfaceC4106ql);
        }
    }
}
