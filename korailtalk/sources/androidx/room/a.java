package androidx.room;

import android.content.Context;
import androidx.room.h;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import z0.InterfaceC6611c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final Set f10646a;
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final List<h.b> callbacks;
    public final Context context;
    public final String copyFromAssetPath;
    public final File copyFromFile;
    public final h.c journalMode;
    public final h.d migrationContainer;
    public final boolean multiInstanceInvalidation;
    public final String name;
    public final Executor queryExecutor;
    public final boolean requireMigration;
    public final InterfaceC6611c.InterfaceC0437c sqliteOpenHelperFactory;
    public final Executor transactionExecutor;

    @Deprecated
    public a(Context context, String str, InterfaceC6611c.InterfaceC0437c interfaceC0437c, h.d dVar, List<h.b> list, boolean z8, h.c cVar, Executor executor, boolean z9, Set<Integer> set) {
        this(context, str, interfaceC0437c, dVar, list, z8, cVar, executor, executor, false, z9, false, set, null, null);
    }

    public boolean isMigrationRequired(int i8, int i9) {
        if ((i8 > i9 && this.allowDestructiveMigrationOnDowngrade) || !this.requireMigration) {
            return false;
        }
        Set set = this.f10646a;
        return set == null || !set.contains(Integer.valueOf(i8));
    }

    @Deprecated
    public boolean isMigrationRequiredFrom(int i8) {
        return isMigrationRequired(i8, i8 + 1);
    }

    @Deprecated
    public a(Context context, String str, InterfaceC6611c.InterfaceC0437c interfaceC0437c, h.d dVar, List<h.b> list, boolean z8, h.c cVar, Executor executor, Executor executor2, boolean z9, boolean z10, boolean z11, Set<Integer> set) {
        this(context, str, interfaceC0437c, dVar, list, z8, cVar, executor, executor2, z9, z10, z11, set, null, null);
    }

    public a(Context context, String str, InterfaceC6611c.InterfaceC0437c interfaceC0437c, h.d dVar, List<h.b> list, boolean z8, h.c cVar, Executor executor, Executor executor2, boolean z9, boolean z10, boolean z11, Set<Integer> set, String str2, File file) {
        this.sqliteOpenHelperFactory = interfaceC0437c;
        this.context = context;
        this.name = str;
        this.migrationContainer = dVar;
        this.callbacks = list;
        this.allowMainThreadQueries = z8;
        this.journalMode = cVar;
        this.queryExecutor = executor;
        this.transactionExecutor = executor2;
        this.multiInstanceInvalidation = z9;
        this.requireMigration = z10;
        this.allowDestructiveMigrationOnDowngrade = z11;
        this.f10646a = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
    }
}
