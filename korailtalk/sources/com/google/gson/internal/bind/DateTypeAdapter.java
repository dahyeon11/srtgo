package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.j;
import com.google.gson.r;
import com.google.gson.w;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTypeAdapter extends TypeAdapter {
    public static final w FACTORY = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List f25933a;

    class a implements w {
        a() {
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    }

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f25933a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.isJava9OrLater()) {
            arrayList.add(j.getUSDateTimeFormat(2, 2));
        }
    }

    private Date a(D3.a aVar) throws IOException {
        String strNextString = aVar.nextString();
        synchronized (this.f25933a) {
            try {
                Iterator it = this.f25933a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strNextString);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return A3.a.parse(strNextString, new ParsePosition(0));
                } catch (ParseException e8) {
                    throw new r("Failed parsing '" + strNextString + "' as Date; at path " + aVar.getPreviousPath(), e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public Date read(D3.a aVar) throws IOException {
        if (aVar.peek() != D3.b.NULL) {
            return a(aVar);
        }
        aVar.nextNull();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(D3.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.nullValue();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f25933a.get(0);
        synchronized (this.f25933a) {
            str = dateFormat.format(date);
        }
        cVar.value(str);
    }
}
