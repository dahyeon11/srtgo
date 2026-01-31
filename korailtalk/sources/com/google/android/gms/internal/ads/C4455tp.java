package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.tp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4455tp extends C4797wp {

    /* renamed from: c, reason: collision with root package name */
    private final Map f22934c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f22935d;

    public C4455tp(InterfaceC2065Wv interfaceC2065Wv, Map map) {
        super(interfaceC2065Wv, "storePicture");
        this.f22934c = map;
        this.f22935d = interfaceC2065Wv.zzi();
    }

    public final void zzb() throws JSONException {
        if (this.f22935d == null) {
            zzh("Activity context is not available");
            return;
        }
        G1.u.zzp();
        if (!new C2270ah(this.f22935d).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f22934c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzh("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzh("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        G1.u.zzp();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZze = G1.u.zzo().zze();
        G1.u.zzp();
        AlertDialog.Builder builderZzK = K1.K0.zzK(this.f22935d);
        builderZzK.setTitle(resourcesZze != null ? resourcesZze.getString(E1.d.f958s1) : "Save image");
        builderZzK.setMessage(resourcesZze != null ? resourcesZze.getString(E1.d.f959s2) : "Allow Ad to store image in Picture gallery?");
        builderZzK.setPositiveButton(resourcesZze != null ? resourcesZze.getString(E1.d.f960s3) : "Accept", new DialogInterfaceOnClickListenerC4227rp(this, str, lastPathSegment));
        builderZzK.setNegativeButton(resourcesZze != null ? resourcesZze.getString(E1.d.f961s4) : "Decline", new DialogInterfaceOnClickListenerC4341sp(this));
        builderZzK.create().show();
    }
}
