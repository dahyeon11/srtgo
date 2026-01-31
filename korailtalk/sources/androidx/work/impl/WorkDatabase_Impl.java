package androidx.work.impl;

import P0.b;
import P0.c;
import P0.e;
import P0.f;
import P0.g;
import P0.h;
import P0.j;
import P0.k;
import P0.m;
import P0.n;
import P0.p;
import P0.q;
import P0.s;
import P0.t;
import P0.v;
import P0.w;
import ai.maum.m2u.cdk.MapIf;
import androidx.core.app.r;
import androidx.room.h;
import androidx.room.i;
import com.kakao.sdk.user.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import v0.AbstractC6424b;
import x0.g;
import z0.InterfaceC6610b;
import z0.InterfaceC6611c;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m, reason: collision with root package name */
    private volatile s f11139m;

    /* renamed from: n, reason: collision with root package name */
    private volatile b f11140n;

    /* renamed from: o, reason: collision with root package name */
    private volatile v f11141o;

    /* renamed from: p, reason: collision with root package name */
    private volatile j f11142p;

    /* renamed from: q, reason: collision with root package name */
    private volatile m f11143q;

    /* renamed from: r, reason: collision with root package name */
    private volatile p f11144r;

    /* renamed from: s, reason: collision with root package name */
    private volatile e f11145s;

    /* renamed from: t, reason: collision with root package name */
    private volatile g f11146t;

    @Override // androidx.room.h
    protected androidx.room.e a() {
        return new androidx.room.e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.h
    protected InterfaceC6611c b(androidx.room.a aVar) {
        return aVar.sqliteOpenHelperFactory.create(InterfaceC6611c.b.builder(aVar.context).name(aVar.name).callback(new i(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).build());
    }

    @Override // androidx.room.h
    public void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC6610b writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.execSQL("DELETE FROM `Dependency`");
            writableDatabase.execSQL("DELETE FROM `WorkSpec`");
            writableDatabase.execSQL("DELETE FROM `WorkTag`");
            writableDatabase.execSQL("DELETE FROM `SystemIdInfo`");
            writableDatabase.execSQL("DELETE FROM `WorkName`");
            writableDatabase.execSQL("DELETE FROM `WorkProgress`");
            writableDatabase.execSQL("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public b dependencyDao() {
        b bVar;
        if (this.f11140n != null) {
            return this.f11140n;
        }
        synchronized (this) {
            try {
                if (this.f11140n == null) {
                    this.f11140n = new c(this);
                }
                bVar = this.f11140n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e preferenceDao() {
        e eVar;
        if (this.f11145s != null) {
            return this.f11145s;
        }
        synchronized (this) {
            try {
                if (this.f11145s == null) {
                    this.f11145s = new f(this);
                }
                eVar = this.f11145s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public g rawWorkInfoDao() {
        g gVar;
        if (this.f11146t != null) {
            return this.f11146t;
        }
        synchronized (this) {
            try {
                if (this.f11146t == null) {
                    this.f11146t = new h(this);
                }
                gVar = this.f11146t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public j systemIdInfoDao() {
        j jVar;
        if (this.f11142p != null) {
            return this.f11142p;
        }
        synchronized (this) {
            try {
                if (this.f11142p == null) {
                    this.f11142p = new k(this);
                }
                jVar = this.f11142p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public m workNameDao() {
        m mVar;
        if (this.f11143q != null) {
            return this.f11143q;
        }
        synchronized (this) {
            try {
                if (this.f11143q == null) {
                    this.f11143q = new n(this);
                }
                mVar = this.f11143q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public p workProgressDao() {
        p pVar;
        if (this.f11144r != null) {
            return this.f11144r;
        }
        synchronized (this) {
            try {
                if (this.f11144r == null) {
                    this.f11144r = new q(this);
                }
                pVar = this.f11144r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public s workSpecDao() {
        s sVar;
        if (this.f11139m != null) {
            return this.f11139m;
        }
        synchronized (this) {
            try {
                if (this.f11139m == null) {
                    this.f11139m = new t(this);
                }
                sVar = this.f11139m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public v workTagDao() {
        v vVar;
        if (this.f11141o != null) {
            return this.f11141o;
        }
        synchronized (this) {
            try {
                if (this.f11141o == null) {
                    this.f11141o = new w(this);
                }
                vVar = this.f11141o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    class a extends i.a {
        a(int i8) {
            super(i8);
        }

        @Override // androidx.room.i.a
        protected void a(InterfaceC6610b interfaceC6610b) {
            if (((androidx.room.h) WorkDatabase_Impl.this).f10705h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f10705h.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((h.b) ((androidx.room.h) WorkDatabase_Impl.this).f10705h.get(i8)).onCreate(interfaceC6610b);
                }
            }
        }

        @Override // androidx.room.i.a
        protected i.b b(InterfaceC6610b interfaceC6610b) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new g.a("work_spec_id", MapIf.E_TEXT, true, 1, null, 1));
            map.put("prerequisite_id", new g.a("prerequisite_id", MapIf.E_TEXT, true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Constants.ID)));
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(Constants.ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new g.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new g.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            x0.g gVar = new x0.g("Dependency", map, hashSet, hashSet2);
            x0.g gVar2 = x0.g.read(interfaceC6610b, "Dependency");
            if (!gVar.equals(gVar2)) {
                return new i.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar + "\n Found:\n" + gVar2);
            }
            HashMap map2 = new HashMap(25);
            map2.put(Constants.ID, new g.a(Constants.ID, MapIf.E_TEXT, true, 1, null, 1));
            map2.put("state", new g.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new g.a("worker_class_name", MapIf.E_TEXT, true, 0, null, 1));
            map2.put("input_merger_class_name", new g.a("input_merger_class_name", MapIf.E_TEXT, false, 0, null, 1));
            map2.put("input", new g.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new g.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new g.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new g.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new g.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new g.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new g.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new g.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new g.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new g.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new g.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new g.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new g.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new g.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new g.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new g.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new g.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new g.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new g.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new g.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new g.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new g.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new g.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            x0.g gVar3 = new x0.g("WorkSpec", map2, hashSet3, hashSet4);
            x0.g gVar4 = x0.g.read(interfaceC6610b, "WorkSpec");
            if (!gVar3.equals(gVar4)) {
                return new i.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar3 + "\n Found:\n" + gVar4);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new g.a("tag", MapIf.E_TEXT, true, 1, null, 1));
            map3.put("work_spec_id", new g.a("work_spec_id", MapIf.E_TEXT, true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Constants.ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new g.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            x0.g gVar5 = new x0.g("WorkTag", map3, hashSet5, hashSet6);
            x0.g gVar6 = x0.g.read(interfaceC6610b, "WorkTag");
            if (!gVar5.equals(gVar6)) {
                return new i.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar5 + "\n Found:\n" + gVar6);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new g.a("work_spec_id", MapIf.E_TEXT, true, 1, null, 1));
            map4.put("system_id", new g.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Constants.ID)));
            x0.g gVar7 = new x0.g("SystemIdInfo", map4, hashSet7, new HashSet(0));
            x0.g gVar8 = x0.g.read(interfaceC6610b, "SystemIdInfo");
            if (!gVar7.equals(gVar8)) {
                return new i.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar7 + "\n Found:\n" + gVar8);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new g.a("name", MapIf.E_TEXT, true, 1, null, 1));
            map5.put("work_spec_id", new g.a("work_spec_id", MapIf.E_TEXT, true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Constants.ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new g.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            x0.g gVar9 = new x0.g("WorkName", map5, hashSet8, hashSet9);
            x0.g gVar10 = x0.g.read(interfaceC6610b, "WorkName");
            if (!gVar9.equals(gVar10)) {
                return new i.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar9 + "\n Found:\n" + gVar10);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new g.a("work_spec_id", MapIf.E_TEXT, true, 1, null, 1));
            map6.put(r.CATEGORY_PROGRESS, new g.a(r.CATEGORY_PROGRESS, "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Constants.ID)));
            x0.g gVar11 = new x0.g("WorkProgress", map6, hashSet10, new HashSet(0));
            x0.g gVar12 = x0.g.read(interfaceC6610b, "WorkProgress");
            if (!gVar11.equals(gVar12)) {
                return new i.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar11 + "\n Found:\n" + gVar12);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new g.a("key", MapIf.E_TEXT, true, 1, null, 1));
            map7.put("long_value", new g.a("long_value", "INTEGER", false, 0, null, 1));
            x0.g gVar13 = new x0.g("Preference", map7, new HashSet(0), new HashSet(0));
            x0.g gVar14 = x0.g.read(interfaceC6610b, "Preference");
            if (gVar13.equals(gVar14)) {
                return new i.b(true, null);
            }
            return new i.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar13 + "\n Found:\n" + gVar14);
        }

        @Override // androidx.room.i.a
        public void createAllTables(InterfaceC6610b interfaceC6610b) {
            interfaceC6610b.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC6610b.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            interfaceC6610b.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            interfaceC6610b.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            interfaceC6610b.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            interfaceC6610b.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            interfaceC6610b.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC6610b.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            interfaceC6610b.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC6610b.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC6610b.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            interfaceC6610b.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC6610b.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            interfaceC6610b.execSQL(AbstractC6424b.CREATE_QUERY);
            interfaceC6610b.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.i.a
        public void dropAllTables(InterfaceC6610b interfaceC6610b) {
            interfaceC6610b.execSQL("DROP TABLE IF EXISTS `Dependency`");
            interfaceC6610b.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            interfaceC6610b.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            interfaceC6610b.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            interfaceC6610b.execSQL("DROP TABLE IF EXISTS `WorkName`");
            interfaceC6610b.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            interfaceC6610b.execSQL("DROP TABLE IF EXISTS `Preference`");
            if (((androidx.room.h) WorkDatabase_Impl.this).f10705h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f10705h.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((h.b) ((androidx.room.h) WorkDatabase_Impl.this).f10705h.get(i8)).onDestructiveMigration(interfaceC6610b);
                }
            }
        }

        @Override // androidx.room.i.a
        public void onOpen(InterfaceC6610b interfaceC6610b) {
            ((androidx.room.h) WorkDatabase_Impl.this).f10698a = interfaceC6610b;
            interfaceC6610b.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.d(interfaceC6610b);
            if (((androidx.room.h) WorkDatabase_Impl.this).f10705h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f10705h.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((h.b) ((androidx.room.h) WorkDatabase_Impl.this).f10705h.get(i8)).onOpen(interfaceC6610b);
                }
            }
        }

        @Override // androidx.room.i.a
        public void onPreMigrate(InterfaceC6610b interfaceC6610b) {
            x0.c.dropFtsSyncTriggers(interfaceC6610b);
        }

        @Override // androidx.room.i.a
        public void onPostMigrate(InterfaceC6610b interfaceC6610b) {
        }
    }
}
