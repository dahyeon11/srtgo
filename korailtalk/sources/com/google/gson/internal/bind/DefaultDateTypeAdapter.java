package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.j;
import com.google.gson.r;
import com.google.gson.w;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final b f25934a;

    /* renamed from: b, reason: collision with root package name */
    private final List f25935b;

    public static abstract class b {
        public static final b DATE = new a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        private final Class f25936a;

        class a extends b {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
            protected Date b(Date date) {
                return date;
            }
        }

        protected b(Class cls) {
            this.f25936a = cls;
        }

        private w a(DefaultDateTypeAdapter defaultDateTypeAdapter) {
            return TypeAdapters.newFactory(this.f25936a, defaultDateTypeAdapter);
        }

        protected abstract Date b(Date date);

        public final w createAdapterFactory(String str) {
            return a(new DefaultDateTypeAdapter(this, str));
        }

        public final w createDefaultsAdapterFactory() {
            int i8 = 2;
            return a(new DefaultDateTypeAdapter(this, i8, i8));
        }

        public final w createAdapterFactory(int i8) {
            return a(new DefaultDateTypeAdapter(this, i8));
        }

        public final w createAdapterFactory(int i8, int i9) {
            return a(new DefaultDateTypeAdapter(this, i8, i9));
        }
    }

    private Date a(D3.a aVar) throws IOException {
        String strNextString = aVar.nextString();
        synchronized (this.f25935b) {
            try {
                Iterator it = this.f25935b.iterator();
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

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f25935b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.TypeAdapter
    public T read(D3.a aVar) throws IOException {
        if (aVar.peek() == D3.b.NULL) {
            aVar.nextNull();
            return null;
        }
        return (T) this.f25934a.b(a(aVar));
    }

    @Override // com.google.gson.TypeAdapter
    public void write(D3.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.nullValue();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f25935b.get(0);
        synchronized (this.f25935b) {
            str = dateFormat.format(date);
        }
        cVar.value(str);
    }

    private DefaultDateTypeAdapter(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f25935b = arrayList;
        Objects.requireNonNull(bVar);
        this.f25934a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(b bVar, int i8) {
        ArrayList arrayList = new ArrayList();
        this.f25935b = arrayList;
        Objects.requireNonNull(bVar);
        this.f25934a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i8, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i8));
        }
        if (d.isJava9OrLater()) {
            arrayList.add(j.getUSDateFormat(i8));
        }
    }

    private DefaultDateTypeAdapter(b bVar, int i8, int i9) {
        ArrayList arrayList = new ArrayList();
        this.f25935b = arrayList;
        Objects.requireNonNull(bVar);
        this.f25934a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i8, i9, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i8, i9));
        }
        if (d.isJava9OrLater()) {
            arrayList.add(j.getUSDateTimeFormat(i8, i9));
        }
    }
}
