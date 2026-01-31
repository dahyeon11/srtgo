package com.google.gson.internal.sql;

import D3.b;
import D3.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.w;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
final class SqlDateTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    static final w f26078b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f26079a;

    class a implements w {
        a() {
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter(aVar2);
            }
            return null;
        }
    }

    /* synthetic */ SqlDateTypeAdapter(a aVar) {
        this();
    }

    private SqlDateTypeAdapter() {
        this.f26079a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.TypeAdapter
    public Date read(D3.a aVar) throws IOException {
        java.util.Date date;
        if (aVar.peek() == b.NULL) {
            aVar.nextNull();
            return null;
        }
        String strNextString = aVar.nextString();
        try {
            synchronized (this) {
                date = this.f26079a.parse(strNextString);
            }
            return new Date(date.getTime());
        } catch (ParseException e8) {
            throw new r("Failed parsing '" + strNextString + "' as SQL Date; at path " + aVar.getPreviousPath(), e8);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.nullValue();
            return;
        }
        synchronized (this) {
            str = this.f26079a.format((java.util.Date) date);
        }
        cVar.value(str);
    }
}
