package com.kakao.sdk.common.json;

import D3.a;
import D3.b;
import D3.c;
import R6.G;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class KakaoDateTypeAdapter extends TypeAdapter {
    private final SimpleDateFormat format;

    public KakaoDateTypeAdapter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        G g8 = G.INSTANCE;
        this.format = simpleDateFormat;
    }

    public final SimpleDateFormat getFormat() {
        return this.format;
    }

    @Override // com.google.gson.TypeAdapter
    public Date read(a aVar) throws IOException {
        if ((aVar == null ? null : aVar.peek()) == b.NULL) {
            aVar.nextNull();
            return null;
        }
        if ((aVar == null ? null : aVar.peek()) == b.STRING) {
            return this.format.parse(aVar.nextString());
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
            cVar.value(this.format.format(date));
        }
    }
}
