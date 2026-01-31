package androidx.work.impl;

import A0.c;
import P0.e;
import P0.j;
import P0.m;
import P0.p;
import P0.s;
import P0.v;
import android.content.Context;
import androidx.room.g;
import androidx.room.h;
import androidx.work.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import z0.InterfaceC6610b;
import z0.InterfaceC6611c;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends h {

    /* renamed from: l */
    private static final long f11137l = TimeUnit.DAYS.toMillis(1);

    class a implements InterfaceC6611c.InterfaceC0437c {

        /* renamed from: a */
        final /* synthetic */ Context f11138a;

        a(Context context) {
            this.f11138a = context;
        }

        @Override // z0.InterfaceC6611c.InterfaceC0437c
        public InterfaceC6611c create(InterfaceC6611c.b bVar) {
            InterfaceC6611c.b.a aVarBuilder = InterfaceC6611c.b.builder(this.f11138a);
            aVarBuilder.name(bVar.name).callback(bVar.callback).noBackupDirectory(true);
            return new c().create(aVarBuilder.build());
        }
    }

    class b extends h.b {
        b() {
        }

        @Override // androidx.room.h.b
        public void onOpen(InterfaceC6610b interfaceC6610b) {
            super.onOpen(interfaceC6610b);
            interfaceC6610b.beginTransaction();
            try {
                interfaceC6610b.execSQL(WorkDatabase.h());
                interfaceC6610b.setTransactionSuccessful();
            } finally {
                interfaceC6610b.endTransaction();
            }
        }
    }

    public static WorkDatabase create(Context context, Executor executor, boolean z8) {
        h.a aVarDatabaseBuilder;
        if (z8) {
            aVarDatabaseBuilder = g.inMemoryDatabaseBuilder(context, WorkDatabase.class).allowMainThreadQueries();
        } else {
            aVarDatabaseBuilder = g.databaseBuilder(context, WorkDatabase.class, I0.h.getWorkDatabaseName());
            aVarDatabaseBuilder.openHelperFactory(new a(context));
        }
        return (WorkDatabase) aVarDatabaseBuilder.setQueryExecutor(executor).addCallback(f()).addMigrations(androidx.work.impl.a.MIGRATION_1_2).addMigrations(new a.h(context, 2, 3)).addMigrations(androidx.work.impl.a.MIGRATION_3_4).addMigrations(androidx.work.impl.a.MIGRATION_4_5).addMigrations(new a.h(context, 5, 6)).addMigrations(androidx.work.impl.a.MIGRATION_6_7).addMigrations(androidx.work.impl.a.MIGRATION_7_8).addMigrations(androidx.work.impl.a.MIGRATION_8_9).addMigrations(new a.i(context)).addMigrations(new a.h(context, 10, 11)).addMigrations(androidx.work.impl.a.MIGRATION_11_12).fallbackToDestructiveMigration().build();
    }

    static h.b f() {
        return new b();
    }

    static long g() {
        return System.currentTimeMillis() - f11137l;
    }

    static String h() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + g() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract P0.b dependencyDao();

    public abstract e preferenceDao();

    public abstract P0.g rawWorkInfoDao();

    public abstract j systemIdInfoDao();

    public abstract m workNameDao();

    public abstract p workProgressDao();

    public abstract s workSpecDao();

    public abstract v workTagDao();
}
