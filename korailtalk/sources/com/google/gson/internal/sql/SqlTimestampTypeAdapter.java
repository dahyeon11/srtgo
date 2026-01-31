package com.google.gson.internal.sql;

import D3.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.w;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    static final w f26082b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final TypeAdapter f26083a;

    class a implements w {
        a() {
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.getAdapter(Date.class), aVar2);
            }
            return null;
        }
    }

    /* synthetic */ SqlTimestampTypeAdapter(TypeAdapter typeAdapter, a aVar) {
        this(typeAdapter);
    }

    private SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f26083a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public Timestamp read(D3.a aVar) {
        Date date = (Date) this.f26083a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Timestamp timestamp) {
        this.f26083a.write(cVar, timestamp);
    }
}
