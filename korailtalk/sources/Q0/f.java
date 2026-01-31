package Q0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import z0.InterfaceC6610b;

/* loaded from: classes.dex */
public class f {
    public static final int INITIAL_ID = 0;
    public static final String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";
    public static final String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";
    public static final String PREFERENCE_FILE_KEY = "androidx.work.util.id";

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f3915a;

    public f(WorkDatabase workDatabase) {
        this.f3915a = workDatabase;
    }

    private int a(String str) {
        this.f3915a.beginTransaction();
        try {
            Long longValue = this.f3915a.preferenceDao().getLongValue(str);
            int i8 = 0;
            int iIntValue = longValue != null ? longValue.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i8 = iIntValue + 1;
            }
            b(str, i8);
            this.f3915a.setTransactionSuccessful();
            this.f3915a.endTransaction();
            return iIntValue;
        } catch (Throwable th) {
            this.f3915a.endTransaction();
            throw th;
        }
    }

    private void b(String str, int i8) {
        this.f3915a.preferenceDao().insertPreference(new P0.d(str, i8));
    }

    public static void migrateLegacyIdGenerator(Context context, InterfaceC6610b interfaceC6610b) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCE_FILE_KEY, 0);
        if (sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY) || sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY)) {
            int i8 = sharedPreferences.getInt(NEXT_JOB_SCHEDULER_ID_KEY, 0);
            int i9 = sharedPreferences.getInt(NEXT_ALARM_MANAGER_ID_KEY, 0);
            interfaceC6610b.beginTransaction();
            try {
                interfaceC6610b.execSQL(androidx.work.impl.a.INSERT_PREFERENCE, new Object[]{NEXT_JOB_SCHEDULER_ID_KEY, Integer.valueOf(i8)});
                interfaceC6610b.execSQL(androidx.work.impl.a.INSERT_PREFERENCE, new Object[]{NEXT_ALARM_MANAGER_ID_KEY, Integer.valueOf(i9)});
                sharedPreferences.edit().clear().apply();
                interfaceC6610b.setTransactionSuccessful();
            } finally {
                interfaceC6610b.endTransaction();
            }
        }
    }

    public int nextAlarmManagerId() {
        int iA;
        synchronized (f.class) {
            iA = a(NEXT_ALARM_MANAGER_ID_KEY);
        }
        return iA;
    }

    public int nextJobSchedulerIdWithRange(int i8, int i9) {
        synchronized (f.class) {
            int iA = a(NEXT_JOB_SCHEDULER_ID_KEY);
            if (iA < i8 || iA > i9) {
                b(NEXT_JOB_SCHEDULER_ID_KEY, i8 + 1);
            } else {
                i8 = iA;
            }
        }
        return i8;
    }
}
