package androidx.work.impl.background.systemalarm;

import H0.l;
import P0.r;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements I0.b {

    /* renamed from: d */
    private static final String f11161d = l.tagWithPrefix("CommandHandler");

    /* renamed from: a */
    private final Context f11162a;

    /* renamed from: b */
    private final Map f11163b = new HashMap();

    /* renamed from: c */
    private final Object f11164c = new Object();

    b(Context context) {
        this.f11162a = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent c(Context context, String str, boolean z8) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z8);
        return intent;
    }

    static Intent d(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent e(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void f(Intent intent, int i8, e eVar) {
        l.get().debug(f11161d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f11162a, i8, eVar).a();
    }

    private void g(Intent intent, int i8, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f11164c) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                l lVar = l.get();
                String str = f11161d;
                lVar.debug(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.f11163b.containsKey(string)) {
                    l.get().debug(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    d dVar = new d(this.f11162a, i8, string, eVar);
                    this.f11163b.put(string, dVar);
                    dVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void h(Intent intent, int i8) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z8 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        l.get().debug(f11161d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i8)), new Throwable[0]);
        onExecuted(string, z8);
    }

    private void i(Intent intent, int i8, e eVar) {
        l.get().debug(f11161d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i8)), new Throwable[0]);
        eVar.e().rescheduleEligibleWork();
    }

    private void j(Intent intent, int i8, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        l lVar = l.get();
        String str = f11161d;
        lVar.debug(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabase = eVar.e().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            r workSpec = workDatabase.workSpecDao().getWorkSpec(string);
            if (workSpec == null) {
                l.get().warning(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (workSpec.state.isFinished()) {
                l.get().warning(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jCalculateNextRunTime = workSpec.calculateNextRunTime();
            if (workSpec.hasConstraints()) {
                l.get().debug(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jCalculateNextRunTime)), new Throwable[0]);
                a.setAlarm(this.f11162a, eVar.e(), string, jCalculateNextRunTime);
                eVar.i(new e.b(eVar, a(this.f11162a), i8));
            } else {
                l.get().debug(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jCalculateNextRunTime)), new Throwable[0]);
                a.setAlarm(this.f11162a, eVar.e(), string, jCalculateNextRunTime);
            }
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
        }
    }

    private void k(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        l.get().debug(f11161d, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.e().stopWork(string);
        a.cancelAlarm(this.f11162a, eVar.e(), string);
        eVar.onExecuted(string, false);
    }

    private static boolean l(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    boolean m() {
        boolean z8;
        synchronized (this.f11164c) {
            z8 = !this.f11163b.isEmpty();
        }
        return z8;
    }

    void n(Intent intent, int i8, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            f(intent, i8, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            i(intent, i8, eVar);
            return;
        }
        if (!l(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            l.get().error(f11161d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            j(intent, i8, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            g(intent, i8, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            k(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            h(intent, i8);
        } else {
            l.get().warning(f11161d, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }

    @Override // I0.b
    public void onExecuted(String str, boolean z8) {
        synchronized (this.f11164c) {
            try {
                I0.b bVar = (I0.b) this.f11163b.remove(str);
                if (bVar != null) {
                    bVar.onExecuted(str, z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
