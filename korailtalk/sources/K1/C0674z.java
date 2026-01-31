package K1;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C3734nS;
import com.google.android.gms.internal.ads.EnumC3506lS;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: K1.z */
/* loaded from: classes.dex */
public final class C0674z {

    /* renamed from: a */
    private final Object f2856a = new Object();

    /* renamed from: b */
    private String f2857b = "";

    /* renamed from: c */
    private String f2858c = "";

    /* renamed from: d */
    private boolean f2859d = false;

    /* renamed from: e */
    private boolean f2860e = false;

    /* renamed from: f */
    protected String f2861f = "";

    /* renamed from: g */
    private C3734nS f2862g;

    protected static final String c(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", G1.u.zzp().zzc(context, str2));
        com.google.common.util.concurrent.C cZzb = new T(context).zzb(0, str, map, null);
        try {
            return (String) cZzb.get(((Integer) H1.C.zzc().zza(AbstractC4439th.zzeL)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            L1.n.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e8);
            cZzb.cancel(true);
            return null;
        } catch (TimeoutException e9) {
            L1.n.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e9);
            cZzb.cancel(true);
            return null;
        } catch (Exception e10) {
            L1.n.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0066 A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:36:0x000b, B:38:0x0013, B:39:0x0018, B:44:0x0032, B:46:0x003a, B:48:0x004f, B:51:0x0061, B:43:0x002b, B:52:0x0066, B:53:0x0068), top: B:60:0x000b, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.net.Uri d(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.Object r0 = r4.f2856a
            monitor-enter(r0)
            java.lang.String r1 = r4.f2857b     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L66
            G1.u.zzp()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            r3 = 1
            byte[] r1 = o2.l.readInputStreamFully(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            goto L32
        L29:
            r5 = move-exception
            goto L7d
        L2b:
            java.lang.String r1 = "Error reading from internal storage."
            L1.n.zze(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = ""
        L32:
            r4.f2857b = r2     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L66
            G1.u.zzp()     // Catch: java.lang.Throwable -> L29
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            r4.f2857b = r1     // Catch: java.lang.Throwable -> L29
            G1.u.zzp()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r4.f2857b     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            r5.write(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            r5.close()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            goto L66
        L60:
            r5 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            L1.n.zzh(r1, r5)     // Catch: java.lang.Throwable -> L29
        L66:
            java.lang.String r5 = r4.f2857b     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "linkedDeviceId"
            r6.appendQueryParameter(r0, r5)
            java.lang.String r5 = "adSlotPath"
            r6.appendQueryParameter(r5, r7)
            java.lang.String r5 = "afmaVersion"
            r6.appendQueryParameter(r5, r8)
            android.net.Uri r5 = r6.build()
            return r5
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.C0674z.d(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    protected final void a(Context context, String str, boolean z8, boolean z9) {
        if (context instanceof Activity) {
            K0.zza.post(new RunnableC0672y(this, context, str, z8, z9));
        } else {
            L1.n.zzi("Can not create dialog without Activity Context");
        }
    }

    final boolean b(Context context, String str, String str2) {
        String strC = c(context, d(context, (String) H1.C.zzc().zza(AbstractC4439th.zzeI), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strC)) {
            L1.n.zze("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strC.trim());
            String strOptString = jSONObject.optString("gct");
            this.f2861f = jSONObject.optString(androidx.core.app.r.CATEGORY_STATUS);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjj)).booleanValue()) {
                boolean z8 = "0".equals(this.f2861f) || "2".equals(this.f2861f);
                zzf(z8);
                InterfaceC0671x0 interfaceC0671x0Zzi = G1.u.zzo().zzi();
                if (!z8) {
                    str = "";
                }
                interfaceC0671x0Zzi.zzB(str);
            }
            synchronized (this.f2856a) {
                this.f2858c = strOptString;
            }
            return true;
        } catch (JSONException e8) {
            L1.n.zzk("Fail to get in app preview response json.", e8);
            return false;
        }
    }

    public final C3734nS zza() {
        return this.f2862g;
    }

    public final String zzb() {
        String str;
        synchronized (this.f2856a) {
            str = this.f2858c;
        }
        return str;
    }

    public final void zzc(Context context) {
        C3734nS c3734nS;
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjj)).booleanValue() || (c3734nS = this.f2862g) == null) {
            return;
        }
        c3734nS.zzh(new BinderC0668w(this, context), EnumC3506lS.DEBUG_MENU);
    }

    public final void zzd(Context context, String str, String str2) {
        G1.u.zzp();
        K0.zzU(context, d(context, (String) H1.C.zzc().zza(AbstractC4439th.zzeH), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = d(context, (String) H1.C.zzc().zza(AbstractC4439th.zzeK), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        G1.u.zzp();
        K0.zzL(context, str, builderBuildUpon.build().toString());
    }

    public final void zzf(boolean z8) {
        synchronized (this.f2856a) {
            try {
                this.f2860e = z8;
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjj)).booleanValue()) {
                    G1.u.zzo().zzi().zzC(z8);
                    C3734nS c3734nS = this.f2862g;
                    if (c3734nS != null) {
                        c3734nS.zzl(z8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(C3734nS c3734nS) {
        this.f2862g = c3734nS;
    }

    public final void zzh(boolean z8) {
        synchronized (this.f2856a) {
            this.f2859d = z8;
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String strC = c(context, d(context, (String) H1.C.zzc().zza(AbstractC4439th.zzeJ), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strC)) {
            L1.n.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strC.trim()).optString("debug_mode"));
            zzf(zEquals);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjj)).booleanValue()) {
                InterfaceC0671x0 interfaceC0671x0Zzi = G1.u.zzo().zzi();
                if (true != zEquals) {
                    str = "";
                }
                interfaceC0671x0Zzi.zzB(str);
            }
            return zEquals;
        } catch (JSONException e8) {
            L1.n.zzk("Fail to get debug mode response json.", e8);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z8;
        synchronized (this.f2856a) {
            z8 = this.f2860e;
        }
        return z8;
    }

    public final boolean zzm() {
        boolean z8;
        synchronized (this.f2856a) {
            z8 = this.f2859d;
        }
        return z8;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        L1.n.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
