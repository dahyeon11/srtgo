package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rh */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC4211rh implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g */
    private Context f22505g;

    /* renamed from: a */
    private final Object f22499a = new Object();

    /* renamed from: b */
    private final ConditionVariable f22500b = new ConditionVariable();

    /* renamed from: c */
    private volatile boolean f22501c = false;

    /* renamed from: d */
    volatile boolean f22502d = false;

    /* renamed from: e */
    private SharedPreferences f22503e = null;

    /* renamed from: f */
    private Bundle f22504f = new Bundle();

    /* renamed from: h */
    private JSONObject f22506h = new JSONObject();

    /* renamed from: i */
    private boolean f22507i = false;

    /* renamed from: j */
    private boolean f22508j = false;

    private final void c(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.f22506h = new JSONObject((String) AbstractC4667vh.zza(new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.oh
                @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    final /* synthetic */ Object a(AbstractC3414kh abstractC3414kh) {
        return abstractC3414kh.zzc(this.f22503e);
    }

    final boolean b() {
        return this.f22507i;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            c(sharedPreferences);
        }
    }

    public final Object zza(final AbstractC3414kh abstractC3414kh) {
        if (!this.f22500b.block(5000L)) {
            synchronized (this.f22499a) {
                try {
                    if (!this.f22502d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f22501c || this.f22503e == null || this.f22508j) {
            synchronized (this.f22499a) {
                if (this.f22501c && this.f22503e != null && !this.f22508j) {
                }
                return abstractC3414kh.zzm();
            }
        }
        if (abstractC3414kh.zze() != 2) {
            return (abstractC3414kh.zze() == 1 && this.f22506h.has(abstractC3414kh.zzn())) ? abstractC3414kh.zza(this.f22506h) : AbstractC4667vh.zza(new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.ph
                @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
                public final Object zza() {
                    return this.zza.a(abstractC3414kh);
                }
            });
        }
        Bundle bundle = this.f22504f;
        return bundle == null ? abstractC3414kh.zzm() : abstractC3414kh.zzb(bundle);
    }

    public final Object zzb(AbstractC3414kh abstractC3414kh) {
        return (this.f22501c || this.f22502d) ? zza(abstractC3414kh) : abstractC3414kh.zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0120 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #2 {all -> 0x000e, blocks: (B:98:0x0008, B:100:0x000c, B:104:0x0011, B:106:0x0016, B:107:0x0018, B:109:0x002a, B:110:0x002e, B:111:0x0030, B:133:0x009e, B:134:0x00a5, B:143:0x00d4, B:144:0x00db, B:158:0x0120, B:159:0x0127, B:167:0x014e, B:168:0x0155, B:170:0x0157, B:171:0x015e, B:113:0x0045, B:116:0x004f, B:122:0x005c, B:125:0x0067, B:126:0x006f, B:128:0x0075, B:130:0x0085, B:132:0x009a, B:136:0x00a7, B:138:0x00ab, B:140:0x00bb, B:142:0x00d0, B:146:0x00dd, B:156:0x011c, B:161:0x0129, B:163:0x0140, B:165:0x0144, B:166:0x0147, B:149:0x00ee, B:151:0x00fc, B:153:0x0104, B:154:0x010f), top: B:179:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0129 A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {all -> 0x0057, blocks: (B:113:0x0045, B:116:0x004f, B:122:0x005c, B:125:0x0067, B:126:0x006f, B:128:0x0075, B:130:0x0085, B:132:0x009a, B:136:0x00a7, B:138:0x00ab, B:140:0x00bb, B:142:0x00d0, B:146:0x00dd, B:156:0x011c, B:161:0x0129, B:163:0x0140, B:165:0x0144, B:166:0x0147, B:149:0x00ee, B:151:0x00fc, B:153:0x0104, B:154:0x010f), top: B:176:0x0045, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC4211rh.zzd(android.content.Context):void");
    }

    public final boolean zze() {
        return this.f22508j;
    }
}
