package com.google.android.gms.internal.ads;

import H1.C0527d0;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class UY implements InterfaceC3171iX {
    private static Bundle b(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    protected abstract com.google.common.util.concurrent.C a(C1825Ra0 c1825Ra0, Bundle bundle, C4654va0 c4654va0, C1457Ia0 c1457Ia0);

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        String strOptString = c4654va0.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        C1825Ra0 c1825Ra0 = c1457Ia0.zza.zza;
        C1743Pa0 c1743Pa0 = new C1743Pa0();
        c1743Pa0.zzq(c1825Ra0);
        c1743Pa0.zzt(strOptString);
        Bundle bundleB = b(c1825Ra0.zzd.zzm);
        Bundle bundleB2 = b(bundleB.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleB2.putInt("gw", 1);
        String strOptString2 = c4654va0.zzw.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleB2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = c4654va0.zzw.optString("adJson", null);
        if (strOptString3 != null) {
            bundleB2.putString("_ad", strOptString3);
        }
        bundleB2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = c4654va0.zzE.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = c4654va0.zzE.optString(next, null);
            if (next != null) {
                bundleB2.putString(next, strOptString4);
            }
        }
        bundleB.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleB2);
        H1.Y1 y12 = c1825Ra0.zzd;
        Bundle bundle = y12.zzn;
        List list = y12.zzo;
        String str = y12.zzp;
        String str2 = y12.zzq;
        int i8 = y12.zzd;
        boolean z8 = y12.zzr;
        List list2 = y12.zze;
        C0527d0 c0527d0 = y12.zzs;
        boolean z9 = y12.zzf;
        int i9 = y12.zzt;
        int i10 = y12.zzg;
        String str3 = y12.zzu;
        boolean z10 = y12.zzh;
        List list3 = y12.zzv;
        String str4 = y12.zzi;
        int i11 = y12.zzw;
        H1.O1 o12 = y12.zzj;
        String str5 = y12.zzx;
        c1743Pa0.zzH(new H1.Y1(y12.zza, y12.zzb, bundleB2, i8, list2, z9, i10, z10, str4, o12, y12.zzk, y12.zzl, bundleB, bundle, list, str, str2, z8, c0527d0, i9, str3, list3, i11, str5, y12.zzy, y12.zzz));
        C1825Ra0 c1825Ra0ZzJ = c1743Pa0.zzJ();
        Bundle bundle2 = new Bundle();
        C4996ya0 c4996ya0 = c1457Ia0.zzb.zzb;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(c4996ya0.zza));
        bundle3.putInt("refresh_interval", c4996ya0.zzc);
        bundle3.putString("gws_query_id", c4996ya0.zzb);
        bundle2.putBundle("parent_common_config", bundle3);
        C1825Ra0 c1825Ra02 = c1457Ia0.zza.zza;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", c1825Ra02.zzf);
        bundle4.putString("allocation_id", c4654va0.zzx);
        bundle4.putString("ad_source_name", c4654va0.zzG);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(c4654va0.zzc));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(c4654va0.zzd));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(c4654va0.zzq));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(c4654va0.zzn));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(c4654va0.zzh));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(c4654va0.zzi));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(c4654va0.zzj));
        bundle4.putString("transaction_id", c4654va0.zzk);
        bundle4.putString("valid_from_timestamp", c4654va0.zzl);
        bundle4.putBoolean("is_closable_area_disabled", c4654va0.zzQ);
        bundle4.putString("recursive_server_response_data", c4654va0.zzap);
        if (c4654va0.zzm != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", c4654va0.zzm.zzb);
            bundle5.putString("rb_type", c4654va0.zzm.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return a(c1825Ra0ZzJ, bundle2, c4654va0, c1457Ia0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        return !TextUtils.isEmpty(c4654va0.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }
}
