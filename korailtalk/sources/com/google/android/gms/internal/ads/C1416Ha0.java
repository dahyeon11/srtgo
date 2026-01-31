package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ha0 */
/* loaded from: classes2.dex */
public final class C1416Ha0 {
    public final List zza;
    public final C4996ya0 zzb;
    public final List zzc;
    public final C2519cr zzd;

    C1416Ha0(JsonReader jsonReader, C2519cr c2519cr) throws IOException {
        Bundle bundle;
        this.zzd = c2519cr;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue() && c2519cr != null && (bundle = c2519cr.zzm) != null) {
            bundle.putLong(EnumC4415tQ.SERVER_RESPONSE_PARSE_START.zza(), G1.u.zzB().currentTimeMillis());
        }
        List listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        C4996ya0 c4996ya0 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        listEmptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            listEmptyList.add(new C4654va0(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        c4996ya0 = new C4996ya0(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzi = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzi = K1.Z.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new C1375Ga0(strNextString, jSONObjectZzi));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = listEmptyList;
        this.zzb = c4996ya0 == null ? new C4996ya0(new JsonReader(new StringReader("{}"))) : c4996ya0;
    }

    public static C1416Ha0 zza(Reader reader, C2519cr c2519cr) {
        try {
            try {
                return new C1416Ha0(new JsonReader(reader), c2519cr);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e8) {
                throw new C5110za0("unable to parse ServerResponse", e8);
            }
        } finally {
            o2.l.closeQuietly(reader);
        }
    }
}
