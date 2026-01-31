package K1;

import H1.C0591z;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3415kh0;
import com.google.android.gms.internal.ads.AbstractC3529lh0;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C2010Vl;
import com.google.android.gms.internal.ads.C2210a8;
import com.google.android.gms.internal.ads.C2898g8;
import com.google.android.gms.internal.ads.C3469l8;
import com.google.android.gms.internal.ads.C3583m8;
import com.google.android.gms.internal.ads.C4494u8;
import com.google.android.gms.internal.ads.C5064z8;
import com.google.android.gms.internal.ads.V7;
import com.google.android.gms.internal.ads.Z7;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class A extends C3583m8 {

    /* renamed from: d */
    private final Context f2731d;

    private A(Context context, C3469l8 c3469l8) {
        super(c3469l8);
        this.f2731d = context;
    }

    public static C2210a8 zzb(Context context) {
        C2210a8 c2210a8 = new C2210a8(new C4494u8(new File(AbstractC3529lh0.zza(AbstractC3415kh0.zza(), context.getCacheDir(), "admob_volley")), 20971520), new A(context, new C5064z8(null, null)), 4);
        c2210a8.zzd();
        return c2210a8;
    }

    @Override // com.google.android.gms.internal.ads.C3583m8, com.google.android.gms.internal.ads.R7
    public final V7 zza(Z7 z72) throws C2898g8 {
        if (z72.zza() == 0) {
            if (Pattern.matches((String) H1.C.zzc().zza(AbstractC4439th.zzex), z72.zzk())) {
                Context context = this.f2731d;
                C0591z.zzb();
                if (L1.g.zzt(context, 13400000)) {
                    V7 v7Zza = new C2010Vl(this.f2731d).zza(z72);
                    if (v7Zza != null) {
                        AbstractC0667v0.zza("Got gmscore asset response: ".concat(String.valueOf(z72.zzk())));
                        return v7Zza;
                    }
                    AbstractC0667v0.zza("Failed to get gmscore asset response: ".concat(String.valueOf(z72.zzk())));
                }
            }
        }
        return super.zza(z72);
    }
}
