package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4384tA implements InterfaceC2069Wz {

    /* renamed from: a, reason: collision with root package name */
    private final CookieManager f22791a;

    public C4384tA(Context context) {
        this.f22791a = G1.u.zzq().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069Wz
    public final void zza(Map map) {
        if (this.f22791a == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f22791a.setCookie((String) H1.C.zzc().zza(AbstractC4439th.zzaO), str);
            return;
        }
        String str2 = (String) H1.C.zzc().zza(AbstractC4439th.zzaO);
        String cookie = this.f22791a.getCookie(str2);
        if (cookie != null) {
            List listZzf = C1720Oj0.zzc(AbstractC3533lj0.zzc(';')).zzf(cookie);
            for (int i8 = 0; i8 < listZzf.size(); i8++) {
                CookieManager cookieManager = this.f22791a;
                Iterator it = C1720Oj0.zzc(AbstractC3533lj0.zzc('=')).zzd((String) listZzf.get(i8)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) H1.C.zzc().zza(AbstractC4439th.zzay))));
            }
        }
    }
}
