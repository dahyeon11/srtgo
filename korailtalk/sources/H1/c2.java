package H1;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class c2 {
    public static final c2 zza = new c2();

    protected c2() {
    }

    public final Y1 zza(Context context, C0525c1 c0525c1) {
        Context context2;
        List listUnmodifiableList;
        String strZzr;
        String strZzk = c0525c1.zzk();
        Set setZzp = c0525c1.zzp();
        if (setZzp.isEmpty()) {
            context2 = context;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(setZzp));
            context2 = context;
        }
        boolean zZzr = c0525c1.zzr(context2);
        Bundle bundleZzf = c0525c1.zzf(AdMobAdapter.class);
        String strZzl = c0525c1.zzl();
        c0525c1.zzi();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            C0591z.zzb();
            strZzr = L1.g.zzr(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strZzr = null;
        }
        boolean zZzq = c0525c1.zzq();
        y1.x xVarZzc = C0564p1.zzf().zzc();
        return new Y1(8, -1L, bundleZzf, -1, listUnmodifiableList, zZzr, Math.max(c0525c1.zzb(), xVarZzc.getTagForChildDirectedTreatment()), false, strZzl, null, null, strZzk, c0525c1.zzg(), c0525c1.zze(), Collections.unmodifiableList(new ArrayList(c0525c1.zzo())), c0525c1.zzm(), strZzr, zZzq, null, xVarZzc.getTagForUnderAgeOfConsent(), (String) Collections.max(Arrays.asList(null, xVarZzc.getMaxAdContentRating()), new Comparator() { // from class: H1.b2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = y1.x.zza;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), c0525c1.zzn(), c0525c1.zza(), c0525c1.zzj(), xVarZzc.getPublisherPrivacyPersonalizationState().getValue(), c0525c1.zzc());
    }
}
