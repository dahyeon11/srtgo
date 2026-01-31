package z0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6611c extends Closeable {

    /* renamed from: z0.c$b */
    public static class b {
        public final a callback;
        public final Context context;
        public final String name;
        public final boolean useNoBackupDirectory;

        /* renamed from: z0.c$b$a */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            Context f37853a;

            /* renamed from: b, reason: collision with root package name */
            String f37854b;

            /* renamed from: c, reason: collision with root package name */
            a f37855c;

            /* renamed from: d, reason: collision with root package name */
            boolean f37856d;

            a(Context context) {
                this.f37853a = context;
            }

            public b build() {
                if (this.f37855c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f37853a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f37856d && TextUtils.isEmpty(this.f37854b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f37853a, this.f37854b, this.f37855c, this.f37856d);
            }

            public a callback(a aVar) {
                this.f37855c = aVar;
                return this;
            }

            public a name(String str) {
                this.f37854b = str;
                return this;
            }

            public a noBackupDirectory(boolean z8) {
                this.f37856d = z8;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z8) {
            this.context = context;
            this.name = str;
            this.callback = aVar;
            this.useNoBackupDirectory = z8;
        }

        public static a builder(Context context) {
            return new a(context);
        }
    }

    /* renamed from: z0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0437c {
        InterfaceC6611c create(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    InterfaceC6610b getReadableDatabase();

    InterfaceC6610b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z8);

    /* renamed from: z0.c$a */
    public static abstract class a {
        public final int version;

        public a(int i8) {
            this.version = i8;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e8) {
                Log.w("SupportSQLite", "delete failed: ", e8);
            }
        }

        public void onCorruption(InterfaceC6610b interfaceC6610b) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + interfaceC6610b.getPath());
            if (!interfaceC6610b.isOpen()) {
                a(interfaceC6610b.getPath());
                return;
            }
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = interfaceC6610b.getAttachedDbs();
                } finally {
                    if (attachedDbs != null) {
                        Iterator<Pair<String, String>> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            a((String) it.next().second);
                        }
                    } else {
                        a(interfaceC6610b.getPath());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                interfaceC6610b.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void onCreate(InterfaceC6610b interfaceC6610b);

        public void onDowngrade(InterfaceC6610b interfaceC6610b, int i8, int i9) {
            throw new SQLiteException("Can't downgrade database from version " + i8 + " to " + i9);
        }

        public abstract void onUpgrade(InterfaceC6610b interfaceC6610b, int i8, int i9);

        public void onConfigure(InterfaceC6610b interfaceC6610b) {
        }

        public void onOpen(InterfaceC6610b interfaceC6610b) {
        }
    }
}
