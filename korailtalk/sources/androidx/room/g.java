package androidx.room;

import Q7.C;
import android.content.Context;
import androidx.room.h;

/* loaded from: classes.dex */
public class g {
    public static final String MASTER_TABLE_NAME = "room_master_table";

    @Deprecated
    public g() {
    }

    static Object a(Class cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace(C.PACKAGE_SEPARATOR_CHAR, '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    public static <T extends h> h.a databaseBuilder(Context context, Class<T> cls, String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new h.a(context, cls, str);
    }

    public static <T extends h> h.a inMemoryDatabaseBuilder(Context context, Class<T> cls) {
        return new h.a(context, cls, null);
    }
}
