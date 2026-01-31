package com.kakao.sdk.common.json;

import D3.a;
import D3.b;
import D3.c;
import com.google.gson.TypeAdapter;
import com.kakao.sdk.common.util.Utility;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class MapToQueryAdapter extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    public Map<String, String> read(a aVar) throws IOException {
        if ((aVar == null ? null : aVar.peek()) != b.NULL) {
            return Utility.INSTANCE.parseQuery(aVar != null ? aVar.nextString() : null);
        }
        aVar.nextNull();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Map<String, String> map) throws IOException {
        if (map == null) {
            if (cVar == null) {
                return;
            }
            cVar.nullValue();
        } else {
            String strBuildQuery = Utility.INSTANCE.buildQuery(map);
            if (cVar == null) {
                return;
            }
            cVar.value(strBuildQuery);
        }
    }
}
