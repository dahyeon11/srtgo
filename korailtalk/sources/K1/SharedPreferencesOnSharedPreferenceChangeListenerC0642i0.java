package K1;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* renamed from: K1.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC0642i0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f2814a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0644j0 f2815b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC0642i0(C0644j0 c0644j0, String str) {
        this.f2815b = c0644j0;
        this.f2814a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f2815b) {
            try {
                for (C0640h0 c0640h0 : this.f2815b.f2817b) {
                    String str2 = this.f2814a;
                    Map map = c0640h0.zza;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        G1.u.zzo().zzi().zzJ(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
