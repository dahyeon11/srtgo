package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xV, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4876xV {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static C4876xV zza(Reader reader) throws IOException {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap map = new HashMap();
                String strNextString = "";
                jsonReader.beginObject();
                long jNextLong = -1;
                int iNextInt = 0;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if ("response".equals(strNextName)) {
                        iNextInt = jsonReader.nextInt();
                    } else if ("body".equals(strNextName)) {
                        strNextString = jsonReader.nextString();
                    } else if ("latency".equals(strNextName)) {
                        jNextLong = jsonReader.nextLong();
                    } else if ("headers".equals(strNextName)) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), K1.Z.zzd(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                C4876xV c4876xV = new C4876xV();
                c4876xV.zza = iNextInt;
                if (strNextString != null) {
                    c4876xV.zzc = strNextString;
                }
                c4876xV.zzd = jNextLong;
                c4876xV.zzb = map;
                o2.l.closeQuietly(reader);
                return c4876xV;
            } catch (IOException e8) {
                e = e8;
                throw new C5110za0("Unable to parse Response", e);
            } catch (AssertionError e9) {
                e = e9;
                throw new C5110za0("Unable to parse Response", e);
            } catch (IllegalStateException e10) {
                e = e10;
                throw new C5110za0("Unable to parse Response", e);
            } catch (NumberFormatException e11) {
                e = e11;
                throw new C5110za0("Unable to parse Response", e);
            }
        } catch (Throwable th) {
            o2.l.closeQuietly(reader);
            throw th;
        }
    }
}
