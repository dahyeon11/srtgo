package com.kakao.sdk.common.json;

import D3.a;
import D3.b;
import D3.c;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.Date;

/* loaded from: classes.dex */
public final class KakaoIntDateTypeAdapter extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    public Date read(a aVar) throws IOException {
        if ((aVar == null ? null : aVar.peek()) == b.NULL) {
            aVar.nextNull();
            return null;
        }
        if ((aVar == null ? null : aVar.peek()) == b.NUMBER) {
            return new Date(aVar.nextLong() * 1000);
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Date date) throws IOException {
        if (date == null) {
            if (cVar == null) {
                return;
            }
            cVar.nullValue();
        } else {
            if (cVar == null) {
                return;
            }
            cVar.value(date.getTime() / 1000);
        }
    }
}
