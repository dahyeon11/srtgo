package com.google.android.gms.ads;

import F1.b;
import H1.C0564p1;
import L1.n;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.f;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.C3318jq;
import com.google.android.gms.internal.ads.InterfaceC1939Ts;
import i2.AbstractC5683p;
import y1.r;
import y1.x;
import y1.z;

/* loaded from: classes.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    public static void disableMediationAdapterInitialization(Context context) {
        C0564p1.zzf().zzl(context);
    }

    public static b getInitializationStatus() {
        return C0564p1.zzf().zze();
    }

    public static x getRequestConfiguration() {
        return C0564p1.zzf().zzc();
    }

    public static z getVersion() {
        C0564p1.zzf();
        String[] strArrSplit = TextUtils.split("23.2.0", "\\.");
        if (strArrSplit.length != 3) {
            return new z(0, 0, 0);
        }
        try {
            return new z(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new z(0, 0, 0);
        }
    }

    public static void initialize(Context context) {
        C0564p1.zzf().zzm(context, null, null);
    }

    public static void openAdInspector(Context context, r rVar) {
        C0564p1.zzf().zzp(context, rVar);
    }

    public static void openDebugMenu(Context context, String str) {
        C0564p1.zzf().zzq(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z8) {
        return C0564p1.zzf().zzx(z8);
    }

    public static f registerCustomTabsSession(Context context, c cVar, String str, androidx.browser.customtabs.b bVar) {
        C0564p1.zzf();
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        InterfaceC1939Ts interfaceC1939TsZza = C3318jq.zza(context);
        if (interfaceC1939TsZza == null) {
            n.zzg("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (f) r2.b.unwrap(interfaceC1939TsZza.zze(r2.b.wrap(context), r2.b.wrap(cVar), str, r2.b.wrap(bVar)));
        } catch (RemoteException | IllegalArgumentException e8) {
            n.zzh("Unable to register custom tabs session. Error: ", e8);
            return null;
        }
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        C0564p1.zzf().zzr(cls);
    }

    public static void registerWebView(WebView webView) {
        C0564p1.zzf();
        AbstractC5683p.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            n.zzg("The webview to be registered cannot be null.");
            return;
        }
        InterfaceC1939Ts interfaceC1939TsZza = C3318jq.zza(webView.getContext());
        if (interfaceC1939TsZza == null) {
            n.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            interfaceC1939TsZza.zzj(r2.b.wrap(webView));
        } catch (RemoteException e8) {
            n.zzh("", e8);
        }
    }

    public static void setAppMuted(boolean z8) {
        C0564p1.zzf().zzs(z8);
    }

    public static void setAppVolume(float f8) {
        C0564p1.zzf().zzt(f8);
    }

    private static void setPlugin(String str) {
        C0564p1.zzf().zzu(str);
    }

    public static void setRequestConfiguration(x xVar) {
        C0564p1.zzf().zzv(xVar);
    }

    public static void initialize(Context context, F1.c cVar) {
        C0564p1.zzf().zzm(context, null, cVar);
    }
}
