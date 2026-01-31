package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class WR {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16995a;

    /* renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f16996b;

    /* renamed from: e, reason: collision with root package name */
    private String f16999e = "";

    /* renamed from: c, reason: collision with root package name */
    private final int f16997c = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzjh)).intValue();

    /* renamed from: d, reason: collision with root package name */
    private final int f16998d = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzji)).intValue();

    public WR(Context context) {
        this.f16995a = context;
        this.f16996b = context.getApplicationInfo();
    }

    public final JSONObject zza() throws JSONException {
        String strZzp;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.f16995a;
            String str = this.f16996b.packageName;
            HandlerC1634Mh0 handlerC1634Mh0 = K1.K0.zza;
            jSONObject.put("name", q2.e.packageManager(context).getApplicationLabel(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f16996b.packageName);
        G1.u.zzp();
        Drawable drawable = null;
        try {
            strZzp = K1.K0.zzp(this.f16995a);
        } catch (RemoteException unused2) {
            strZzp = null;
        }
        jSONObject.put("adMobAppId", strZzp);
        if (this.f16999e.isEmpty()) {
            try {
                drawable = (Drawable) q2.e.packageManager(this.f16995a).getApplicationLabelAndIcon(this.f16996b.packageName).second;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f16997c, this.f16998d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f16997c, this.f16998d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f16999e = strEncodeToString;
        }
        if (!this.f16999e.isEmpty()) {
            jSONObject.put("icon", this.f16999e);
            jSONObject.put("iconWidthPx", this.f16997c);
            jSONObject.put("iconHeightPx", this.f16998d);
        }
        return jSONObject;
    }
}
