package androidx.work.impl;

import android.content.Context;
import w0.AbstractC6457a;
import z0.InterfaceC6610b;

/* loaded from: classes.dex */
public abstract class a {
    public static final String INSERT_PREFERENCE = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
    public static final int VERSION_1 = 1;
    public static final int VERSION_10 = 10;
    public static final int VERSION_11 = 11;
    public static final int VERSION_12 = 12;
    public static final int VERSION_2 = 2;
    public static final int VERSION_3 = 3;
    public static final int VERSION_4 = 4;
    public static final int VERSION_5 = 5;
    public static final int VERSION_6 = 6;
    public static final int VERSION_7 = 7;
    public static final int VERSION_8 = 8;
    public static final int VERSION_9 = 9;
    public static AbstractC6457a MIGRATION_1_2 = new C0179a(1, 2);
    public static AbstractC6457a MIGRATION_3_4 = new b(3, 4);
    public static AbstractC6457a MIGRATION_4_5 = new c(4, 5);
    public static AbstractC6457a MIGRATION_6_7 = new d(6, 7);
    public static AbstractC6457a MIGRATION_7_8 = new e(7, 8);
    public static AbstractC6457a MIGRATION_8_9 = new f(8, 9);
    public static AbstractC6457a MIGRATION_11_12 = new g(11, 12);

    /* renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    class C0179a extends AbstractC6457a {
        C0179a(int i8, int i9) {
            super(i8, i9);
        }

        @Override // w0.AbstractC6457a
        public void migrate(InterfaceC6610b interfaceC6610b) {
            interfaceC6610b.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC6610b.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            interfaceC6610b.execSQL("DROP TABLE IF EXISTS alarmInfo");
            interfaceC6610b.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    class b extends AbstractC6457a {
        b(int i8, int i9) {
            super(i8, i9);
        }

        @Override // w0.AbstractC6457a
        public void migrate(InterfaceC6610b interfaceC6610b) {
            interfaceC6610b.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    class c extends AbstractC6457a {
        c(int i8, int i9) {
            super(i8, i9);
        }

        @Override // w0.AbstractC6457a
        public void migrate(InterfaceC6610b interfaceC6610b) {
            interfaceC6610b.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            interfaceC6610b.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    class d extends AbstractC6457a {
        d(int i8, int i9) {
            super(i8, i9);
        }

        @Override // w0.AbstractC6457a
        public void migrate(InterfaceC6610b interfaceC6610b) {
            interfaceC6610b.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    class e extends AbstractC6457a {
        e(int i8, int i9) {
            super(i8, i9);
        }

        @Override // w0.AbstractC6457a
        public void migrate(InterfaceC6610b interfaceC6610b) {
            interfaceC6610b.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    class f extends AbstractC6457a {
        f(int i8, int i9) {
            super(i8, i9);
        }

        @Override // w0.AbstractC6457a
        public void migrate(InterfaceC6610b interfaceC6610b) {
            interfaceC6610b.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    class g extends AbstractC6457a {
        g(int i8, int i9) {
            super(i8, i9);
        }

        @Override // w0.AbstractC6457a
        public void migrate(InterfaceC6610b interfaceC6610b) {
            interfaceC6610b.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class h extends AbstractC6457a {

        /* renamed from: a, reason: collision with root package name */
        final Context f11148a;

        public h(Context context, int i8, int i9) {
            super(i8, i9);
            this.f11148a = context;
        }

        @Override // w0.AbstractC6457a
        public void migrate(InterfaceC6610b interfaceC6610b) {
            if (this.endVersion >= 10) {
                interfaceC6610b.execSQL(a.INSERT_PREFERENCE, new Object[]{Q0.i.KEY_RESCHEDULE_NEEDED, 1});
            } else {
                this.f11148a.getSharedPreferences(Q0.i.PREFERENCES_FILE_NAME, 0).edit().putBoolean(Q0.i.KEY_RESCHEDULE_NEEDED, true).apply();
            }
        }
    }

    public static class i extends AbstractC6457a {

        /* renamed from: a, reason: collision with root package name */
        final Context f11149a;

        public i(Context context) {
            super(9, 10);
            this.f11149a = context;
        }

        @Override // w0.AbstractC6457a
        public void migrate(InterfaceC6610b interfaceC6610b) {
            interfaceC6610b.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Q0.i.migrateLegacyPreferences(this.f11149a, interfaceC6610b);
            Q0.f.migrateLegacyIdGenerator(this.f11149a, interfaceC6610b);
        }
    }
}
