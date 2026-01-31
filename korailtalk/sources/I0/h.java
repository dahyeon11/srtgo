package I0;

import H0.l;
import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1927a = l.tagWithPrefix("WrkDbPathHelper");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f1928b = {"-journal", "-shm", "-wal"};

    private static File a(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static File getDatabasePath(Context context) {
        return a(context, "androidx.work.workdb");
    }

    public static File getDefaultDatabasePath(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    public static String getWorkDatabaseName() {
        return "androidx.work.workdb";
    }

    public static void migrateDatabase(Context context) {
        if (getDefaultDatabasePath(context).exists()) {
            l.get().debug(f1927a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> mapMigrationPaths = migrationPaths(context);
            for (File file : mapMigrationPaths.keySet()) {
                File file2 = mapMigrationPaths.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        l.get().warning(f1927a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    l.get().debug(f1927a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    public static Map<File, File> migrationPaths(Context context) {
        HashMap map = new HashMap();
        File defaultDatabasePath = getDefaultDatabasePath(context);
        File databasePath = getDatabasePath(context);
        map.put(defaultDatabasePath, databasePath);
        for (String str : f1928b) {
            map.put(new File(defaultDatabasePath.getPath() + str), new File(databasePath.getPath() + str));
        }
        return map;
    }
}
