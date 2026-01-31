package J1;

import K1.AbstractC0667v0;
import K1.K0;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC4439th;

/* renamed from: J1.a */
/* loaded from: classes.dex */
public final class C0618a {
    private static final boolean a(Context context, Uri uri, InterfaceC0619b interfaceC0619b, F f8) {
        int iZzm;
        try {
            iZzm = G1.u.zzp().zzm(context, uri);
            if (interfaceC0619b != null) {
                interfaceC0619b.zzg();
            }
        } catch (ActivityNotFoundException e8) {
            L1.n.zzj(e8.getMessage());
            iZzm = 6;
        }
        if (f8 != null) {
            f8.zzb(iZzm);
        }
        return iZzm == 5;
    }

    public static final boolean zza(Context context, Intent intent, InterfaceC0619b interfaceC0619b, F f8, boolean z8) {
        if (z8) {
            return a(context, intent.getData(), interfaceC0619b, f8);
        }
        try {
            AbstractC0667v0.zza("Launching an intent: " + intent.toURI());
            G1.u.zzp();
            K0.zzT(context, intent);
            if (interfaceC0619b != null) {
                interfaceC0619b.zzg();
            }
            if (f8 != null) {
                f8.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e8) {
            L1.n.zzj(e8.getMessage());
            if (f8 != null) {
                f8.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, j jVar, InterfaceC0619b interfaceC0619b, F f8) throws NumberFormatException {
        int i8 = 0;
        if (jVar == null) {
            L1.n.zzj("No intent data for launcher overlay.");
            return false;
        }
        AbstractC4439th.zza(context);
        Intent intent = jVar.zzh;
        if (intent != null) {
            return zza(context, intent, interfaceC0619b, f8, jVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(jVar.zzb)) {
            L1.n.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(jVar.zzc)) {
            intent2.setData(Uri.parse(jVar.zzb));
        } else {
            String str = jVar.zzb;
            intent2.setDataAndType(Uri.parse(str), jVar.zzc);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(jVar.zzd)) {
            intent2.setPackage(jVar.zzd);
        }
        if (!TextUtils.isEmpty(jVar.zze)) {
            String[] strArrSplit = jVar.zze.split("/", 2);
            if (strArrSplit.length < 2) {
                L1.n.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(jVar.zze)));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str2 = jVar.zzf;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i8 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                L1.n.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i8);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeA)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzez)).booleanValue()) {
                G1.u.zzp();
                K0.zzo(context, intent2);
            }
        }
        return zza(context, intent2, interfaceC0619b, f8, jVar.zzj);
    }
}
