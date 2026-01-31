package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import v0.AbstractC6424b;
import w0.AbstractC6457a;
import z0.C6609a;
import z0.InterfaceC6610b;
import z0.InterfaceC6611c;

/* loaded from: classes.dex */
public class i extends InterfaceC6611c.a {

    /* renamed from: a, reason: collision with root package name */
    private androidx.room.a f10728a;

    /* renamed from: b, reason: collision with root package name */
    private final a f10729b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10730c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10731d;

    public static class b {
        public final String expectedFoundMsg;
        public final boolean isValid;

        public b(boolean z8, String str) {
            this.isValid = z8;
            this.expectedFoundMsg = str;
        }
    }

    public i(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.version);
        this.f10728a = aVar;
        this.f10729b = aVar2;
        this.f10730c = str;
        this.f10731d = str2;
    }

    private void b(InterfaceC6610b interfaceC6610b) {
        if (!e(interfaceC6610b)) {
            b bVarB = this.f10729b.b(interfaceC6610b);
            if (bVarB.isValid) {
                this.f10729b.onPostMigrate(interfaceC6610b);
                f(interfaceC6610b);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarB.expectedFoundMsg);
            }
        }
        Cursor cursorQuery = interfaceC6610b.query(new C6609a(AbstractC6424b.READ_QUERY));
        try {
            String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
            cursorQuery.close();
            if (!this.f10730c.equals(string) && !this.f10731d.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    private void c(InterfaceC6610b interfaceC6610b) {
        interfaceC6610b.execSQL(AbstractC6424b.CREATE_QUERY);
    }

    private static boolean d(InterfaceC6610b interfaceC6610b) {
        Cursor cursorQuery = interfaceC6610b.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z8 = false;
            if (cursorQuery.moveToFirst()) {
                if (cursorQuery.getInt(0) == 0) {
                    z8 = true;
                }
            }
            return z8;
        } finally {
            cursorQuery.close();
        }
    }

    private static boolean e(InterfaceC6610b interfaceC6610b) {
        Cursor cursorQuery = interfaceC6610b.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z8 = false;
            if (cursorQuery.moveToFirst()) {
                if (cursorQuery.getInt(0) != 0) {
                    z8 = true;
                }
            }
            return z8;
        } finally {
            cursorQuery.close();
        }
    }

    private void f(InterfaceC6610b interfaceC6610b) {
        c(interfaceC6610b);
        interfaceC6610b.execSQL(AbstractC6424b.createInsertQuery(this.f10730c));
    }

    @Override // z0.InterfaceC6611c.a
    public void onConfigure(InterfaceC6610b interfaceC6610b) {
        super.onConfigure(interfaceC6610b);
    }

    @Override // z0.InterfaceC6611c.a
    public void onCreate(InterfaceC6610b interfaceC6610b) {
        boolean zD = d(interfaceC6610b);
        this.f10729b.createAllTables(interfaceC6610b);
        if (!zD) {
            b bVarB = this.f10729b.b(interfaceC6610b);
            if (!bVarB.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarB.expectedFoundMsg);
            }
        }
        f(interfaceC6610b);
        this.f10729b.a(interfaceC6610b);
    }

    @Override // z0.InterfaceC6611c.a
    public void onDowngrade(InterfaceC6610b interfaceC6610b, int i8, int i9) {
        onUpgrade(interfaceC6610b, i8, i9);
    }

    @Override // z0.InterfaceC6611c.a
    public void onOpen(InterfaceC6610b interfaceC6610b) {
        super.onOpen(interfaceC6610b);
        b(interfaceC6610b);
        this.f10729b.onOpen(interfaceC6610b);
        this.f10728a = null;
    }

    @Override // z0.InterfaceC6611c.a
    public void onUpgrade(InterfaceC6610b interfaceC6610b, int i8, int i9) {
        List<AbstractC6457a> listFindMigrationPath;
        androidx.room.a aVar = this.f10728a;
        if (aVar == null || (listFindMigrationPath = aVar.migrationContainer.findMigrationPath(i8, i9)) == null) {
            androidx.room.a aVar2 = this.f10728a;
            if (aVar2 != null && !aVar2.isMigrationRequired(i8, i9)) {
                this.f10729b.dropAllTables(interfaceC6610b);
                this.f10729b.createAllTables(interfaceC6610b);
                return;
            }
            throw new IllegalStateException("A migration from " + i8 + " to " + i9 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f10729b.onPreMigrate(interfaceC6610b);
        Iterator<AbstractC6457a> it = listFindMigrationPath.iterator();
        while (it.hasNext()) {
            it.next().migrate(interfaceC6610b);
        }
        b bVarB = this.f10729b.b(interfaceC6610b);
        if (bVarB.isValid) {
            this.f10729b.onPostMigrate(interfaceC6610b);
            f(interfaceC6610b);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + bVarB.expectedFoundMsg);
        }
    }

    public i(androidx.room.a aVar, a aVar2, String str) {
        this(aVar, aVar2, "", str);
    }

    public static abstract class a {
        public final int version;

        public a(int i8) {
            this.version = i8;
        }

        protected abstract void a(InterfaceC6610b interfaceC6610b);

        protected b b(InterfaceC6610b interfaceC6610b) {
            c(interfaceC6610b);
            return new b(true, null);
        }

        protected void c(InterfaceC6610b interfaceC6610b) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        protected abstract void createAllTables(InterfaceC6610b interfaceC6610b);

        protected abstract void dropAllTables(InterfaceC6610b interfaceC6610b);

        protected abstract void onOpen(InterfaceC6610b interfaceC6610b);

        protected void onPostMigrate(InterfaceC6610b interfaceC6610b) {
        }

        protected void onPreMigrate(InterfaceC6610b interfaceC6610b) {
        }
    }
}
