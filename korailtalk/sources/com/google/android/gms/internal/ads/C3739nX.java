package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.nX, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3739nX {

    /* renamed from: c, reason: collision with root package name */
    private final String f21292c;

    /* renamed from: d, reason: collision with root package name */
    private C4996ya0 f21293d = null;

    /* renamed from: e, reason: collision with root package name */
    private C4654va0 f21294e = null;

    /* renamed from: f, reason: collision with root package name */
    private H1.h2 f21295f = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f21291b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final List f21290a = Collections.synchronizedList(new ArrayList());

    public C3739nX(String str) {
        this.f21292c = str;
    }

    private static String a(C4654va0 c4654va0) {
        return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdA)).booleanValue() ? c4654va0.zzaq : c4654va0.zzx;
    }

    private final synchronized void b(C4654va0 c4654va0, int i8) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.f21291b;
        String strA = a(c4654va0);
        if (map.containsKey(strA)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = c4654va0.zzw.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, c4654va0.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgX)).booleanValue()) {
            str = c4654va0.zzG;
            str2 = c4654va0.zzH;
            str3 = c4654va0.zzI;
            str4 = c4654va0.zzJ;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        H1.h2 h2Var = new H1.h2(c4654va0.zzF, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.f21290a.add(i8, h2Var);
        } catch (IndexOutOfBoundsException e8) {
            G1.u.zzo().zzw(e8, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.f21291b.put(strA, h2Var);
    }

    private final void c(C4654va0 c4654va0, long j8, C0534f1 c0534f1, boolean z8) {
        Map map = this.f21291b;
        String strA = a(c4654va0);
        if (map.containsKey(strA)) {
            if (this.f21294e == null) {
                this.f21294e = c4654va0;
            }
            H1.h2 h2Var = (H1.h2) this.f21291b.get(strA);
            h2Var.zzb = j8;
            h2Var.zzc = c0534f1;
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgY)).booleanValue() && z8) {
                this.f21295f = h2Var;
            }
        }
    }

    public final H1.h2 zza() {
        return this.f21295f;
    }

    public final BinderC4280sF zzb() {
        return new BinderC4280sF(this.f21294e, "", this, this.f21293d, this.f21292c);
    }

    public final List zzc() {
        return this.f21290a;
    }

    public final void zzd(C4654va0 c4654va0) {
        b(c4654va0, this.f21290a.size());
    }

    public final void zze(C4654va0 c4654va0) {
        int iIndexOf = this.f21290a.indexOf(this.f21291b.get(a(c4654va0)));
        if (iIndexOf < 0 || iIndexOf >= this.f21291b.size()) {
            iIndexOf = this.f21290a.indexOf(this.f21295f);
        }
        if (iIndexOf < 0 || iIndexOf >= this.f21291b.size()) {
            return;
        }
        this.f21295f = (H1.h2) this.f21290a.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f21290a.size()) {
                return;
            }
            H1.h2 h2Var = (H1.h2) this.f21290a.get(iIndexOf);
            h2Var.zzb = 0L;
            h2Var.zzc = null;
        }
    }

    public final void zzf(C4654va0 c4654va0, long j8, C0534f1 c0534f1) {
        c(c4654va0, j8, c0534f1, false);
    }

    public final void zzg(C4654va0 c4654va0, long j8, C0534f1 c0534f1) {
        c(c4654va0, j8, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.f21291b.containsKey(str)) {
            int iIndexOf = this.f21290a.indexOf((H1.h2) this.f21291b.get(str));
            try {
                this.f21290a.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e8) {
                G1.u.zzo().zzw(e8, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.f21291b.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b((C4654va0) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzi(C4996ya0 c4996ya0) {
        this.f21293d = c4996ya0;
    }
}
