package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.w;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes2.dex */
public abstract class a {
    public static final DefaultDateTypeAdapter.b DATE_DATE_TYPE;
    public static final w DATE_FACTORY;
    public static final boolean SUPPORTS_SQL_TYPES;
    public static final DefaultDateTypeAdapter.b TIMESTAMP_DATE_TYPE;
    public static final w TIMESTAMP_FACTORY;
    public static final w TIME_FACTORY;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C0215a extends DefaultDateTypeAdapter.b {
        C0215a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Date b(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    class b extends DefaultDateTypeAdapter.b {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Timestamp b(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z8;
        try {
            Class.forName("java.sql.Date");
            z8 = true;
        } catch (ClassNotFoundException unused) {
            z8 = false;
        }
        SUPPORTS_SQL_TYPES = z8;
        if (z8) {
            DATE_DATE_TYPE = new C0215a(Date.class);
            TIMESTAMP_DATE_TYPE = new b(Timestamp.class);
            DATE_FACTORY = SqlDateTypeAdapter.f26078b;
            TIME_FACTORY = SqlTimeTypeAdapter.f26080b;
            TIMESTAMP_FACTORY = SqlTimestampTypeAdapter.f26082b;
            return;
        }
        DATE_DATE_TYPE = null;
        TIMESTAMP_DATE_TYPE = null;
        DATE_FACTORY = null;
        TIME_FACTORY = null;
        TIMESTAMP_FACTORY = null;
    }
}
