package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ya0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4996ya0 {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final C4882xa0 zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final JSONObject zzn;
    public final JSONObject zzo;
    public final String zzp;
    public final int zzq;

    C4996ya0(JsonReader jsonReader) throws JSONException, IOException {
        List listEmptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        int iNextInt2 = 0;
        C4882xa0 c4882xa0 = null;
        long jNextLong = 0;
        int iMax = 1;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextString5;
            if ("nofill_urls".equals(strNextName)) {
                listEmptyList = K1.Z.zzd(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                JSONObject jSONObject3 = jSONObject2;
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzir)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    c4882xa0 = new C4882xa0(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkt)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString5 = jsonReader.nextString();
                        jSONObject2 = jSONObject3;
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgZ)).booleanValue()) {
                            try {
                                Bundle bundleZza = K1.Z.zza(K1.Z.zzi(jsonReader));
                                if (bundleZza != null) {
                                    bundle = bundleZza;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjn)).booleanValue()) {
                            strNextString3 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(strNextName)) {
                        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjn)).booleanValue()) {
                            strNextString2 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        AbstractC3414kh abstractC3414kh = AbstractC4439th.zzjo;
                        if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                            strNextString4 = jsonReader.nextString();
                        } else if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                            jSONObject = K1.Z.zzi(jsonReader);
                        } else if (Objects.equals(strNextName, "max_parallel_renderers")) {
                            iMax = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjv)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = K1.Z.zzi(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                }
                strNextString5 = str;
                jSONObject2 = jSONObject3;
            }
            strNextString5 = str;
        }
        jsonReader.endObject();
        this.zza = listEmptyList;
        this.zzc = iNextInt2;
        this.zzb = strNextString;
        this.zzd = strNextString6;
        this.zze = iNextInt;
        this.zzf = jNextLong;
        this.zzi = c4882xa0;
        this.zzg = zNextBoolean;
        this.zzh = strNextString7;
        this.zzj = bundle;
        this.zzk = strNextString2;
        this.zzl = strNextString3;
        this.zzm = strNextString4;
        this.zzn = jSONObject;
        this.zzo = jSONObject2;
        this.zzp = strNextString5;
        C2272ai c2272ai = AbstractC4555ui.zza;
        this.zzq = ((Long) c2272ai.zze()).longValue() > 0 ? ((Long) c2272ai.zze()).intValue() : iMax;
    }
}
