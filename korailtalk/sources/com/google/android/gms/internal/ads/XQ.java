package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class XQ {

    /* renamed from: a, reason: collision with root package name */
    private final o2.f f17245a;

    public XQ(o2.f fVar) {
        this.f17245a = fVar;
    }

    public final void zza(List list, String str, String str2, Object... objArr) throws IOException {
        if (((Boolean) AbstractC4327si.zza.zze()).booleanValue()) {
            long jCurrentTimeMillis = this.f17245a.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name(androidx.core.app.r.CATEGORY_EVENT).value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    Object obj = objArr[i8];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e8) {
                L1.n.zzh("unable to log", e8);
            }
            L1.n.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
