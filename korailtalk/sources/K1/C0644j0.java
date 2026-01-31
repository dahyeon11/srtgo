package K1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.AbstractC4439th;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: K1.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f2816a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f2817b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f2818c;

    C0644j0(Context context) {
        this.f2818c = context;
    }

    final synchronized void b(String str) {
        try {
            if (this.f2816a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f2818c) : this.f2818c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC0642i0 sharedPreferencesOnSharedPreferenceChangeListenerC0642i0 = new SharedPreferencesOnSharedPreferenceChangeListenerC0642i0(this, str);
            this.f2816a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC0642i0);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC0642i0);
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void c(C0640h0 c0640h0) {
        this.f2817b.add(c0640h0);
    }

    public final void zzc() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkt)).booleanValue()) {
            G1.u.zzp();
            Map mapZzv = K0.zzv((String) H1.C.zzc().zza(AbstractC4439th.zzky));
            Iterator it = mapZzv.keySet().iterator();
            while (it.hasNext()) {
                b((String) it.next());
            }
            c(new C0640h0(mapZzv));
        }
    }
}
