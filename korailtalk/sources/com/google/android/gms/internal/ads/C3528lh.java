package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lh */
/* loaded from: classes2.dex */
public final class C3528lh {

    /* renamed from: a */
    private final List f20727a = new ArrayList();

    /* renamed from: b */
    private final List f20728b = new ArrayList();

    /* renamed from: c */
    private final List f20729c = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f20728b.iterator();
        while (it.hasNext()) {
            String str = (String) H1.C.zzc().zza((AbstractC3414kh) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(AbstractC4553uh.a());
        return arrayList;
    }

    public final List zzb() {
        List listZza = zza();
        Iterator it = this.f20729c.iterator();
        while (it.hasNext()) {
            String str = (String) H1.C.zzc().zza((AbstractC3414kh) it.next());
            if (!TextUtils.isEmpty(str)) {
                listZza.add(str);
            }
        }
        listZza.addAll(AbstractC4553uh.b());
        return listZza;
    }

    public final void zzc(AbstractC3414kh abstractC3414kh) {
        this.f20728b.add(abstractC3414kh);
    }

    public final void zzd(AbstractC3414kh abstractC3414kh) {
        this.f20727a.add(abstractC3414kh);
    }

    public final void zze(SharedPreferences.Editor editor, int i8, JSONObject jSONObject) {
        for (AbstractC3414kh abstractC3414kh : this.f20727a) {
            if (abstractC3414kh.zze() == 1) {
                abstractC3414kh.zzd(editor, abstractC3414kh.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            L1.n.zzg("Flag Json is null.");
        }
    }
}
