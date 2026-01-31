package com.google.gson.internal.sql;

import D3.b;
import D3.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.w;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    static final w f26080b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f26081a;

    class a implements w {
        a() {
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(aVar2);
            }
            return null;
        }
    }

    /* synthetic */ SqlTimeTypeAdapter(a aVar) {
        this();
    }

    private SqlTimeTypeAdapter() {
        this.f26081a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.TypeAdapter
    public Time read(D3.a aVar) throws IOException {
        Time time;
        if (aVar.peek() == b.NULL) {
            aVar.nextNull();
            return null;
        }
        String strNextString = aVar.nextString();
        try {
            synchronized (this) {
                time = new Time(this.f26081a.parse(strNextString).getTime());
            }
            return time;
        } catch (ParseException e8) {
            throw new r("Failed parsing '" + strNextString + "' as SQL Time; at path " + aVar.getPreviousPath(), e8);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.nullValue();
            return;
        }
        synchronized (this) {
            str = this.f26081a.format((Date) time);
        }
        cVar.value(str);
    }
}
