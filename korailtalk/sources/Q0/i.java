package Q0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.I;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkDatabase;
import p.InterfaceC6046a;
import z0.InterfaceC6610b;

/* loaded from: classes.dex */
public class i {
    public static final String KEY_LAST_CANCEL_ALL_TIME_MS = "last_cancel_all_time_ms";
    public static final String KEY_RESCHEDULE_NEEDED = "reschedule_needed";
    public static final String PREFERENCES_FILE_NAME = "androidx.work.util.preferences";

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f3924a;

    class a implements InterfaceC6046a {
        a() {
        }

        @Override // p.InterfaceC6046a
        public Long apply(Long l8) {
            return Long.valueOf(l8 != null ? l8.longValue() : 0L);
        }
    }

    public i(WorkDatabase workDatabase) {
        this.f3924a = workDatabase;
    }

    public static void migrateLegacyPreferences(Context context, InterfaceC6610b interfaceC6610b) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        if (sharedPreferences.contains(KEY_RESCHEDULE_NEEDED) || sharedPreferences.contains(KEY_LAST_CANCEL_ALL_TIME_MS)) {
            long j8 = sharedPreferences.getLong(KEY_LAST_CANCEL_ALL_TIME_MS, 0L);
            long j9 = sharedPreferences.getBoolean(KEY_RESCHEDULE_NEEDED, false) ? 1L : 0L;
            interfaceC6610b.beginTransaction();
            try {
                interfaceC6610b.execSQL(androidx.work.impl.a.INSERT_PREFERENCE, new Object[]{KEY_LAST_CANCEL_ALL_TIME_MS, Long.valueOf(j8)});
                interfaceC6610b.execSQL(androidx.work.impl.a.INSERT_PREFERENCE, new Object[]{KEY_RESCHEDULE_NEEDED, Long.valueOf(j9)});
                sharedPreferences.edit().clear().apply();
                interfaceC6610b.setTransactionSuccessful();
            } finally {
                interfaceC6610b.endTransaction();
            }
        }
    }

    public long getLastCancelAllTimeMillis() {
        Long longValue = this.f3924a.preferenceDao().getLongValue(KEY_LAST_CANCEL_ALL_TIME_MS);
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public LiveData getLastCancelAllTimeMillisLiveData() {
        return I.map(this.f3924a.preferenceDao().getObservableLongValue(KEY_LAST_CANCEL_ALL_TIME_MS), new a());
    }

    public boolean getNeedsReschedule() {
        Long longValue = this.f3924a.preferenceDao().getLongValue(KEY_RESCHEDULE_NEEDED);
        return longValue != null && longValue.longValue() == 1;
    }

    public void setLastCancelAllTimeMillis(long j8) {
        this.f3924a.preferenceDao().insertPreference(new P0.d(KEY_LAST_CANCEL_ALL_TIME_MS, j8));
    }

    public void setNeedsReschedule(boolean z8) {
        this.f3924a.preferenceDao().insertPreference(new P0.d(KEY_RESCHEDULE_NEEDED, z8));
    }
}
