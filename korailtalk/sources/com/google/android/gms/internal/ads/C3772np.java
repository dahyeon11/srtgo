package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.kakao.sdk.template.Constants;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.np, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3772np extends C4797wp {

    /* renamed from: c, reason: collision with root package name */
    private final Map f21349c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f21350d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21351e;

    /* renamed from: f, reason: collision with root package name */
    private final long f21352f;

    /* renamed from: g, reason: collision with root package name */
    private final long f21353g;

    /* renamed from: h, reason: collision with root package name */
    private final String f21354h;

    /* renamed from: i, reason: collision with root package name */
    private final String f21355i;

    public C3772np(InterfaceC2065Wv interfaceC2065Wv, Map map) {
        super(interfaceC2065Wv, "createCalendarEvent");
        this.f21349c = map;
        this.f21350d = interfaceC2065Wv.zzi();
        this.f21351e = d(Constants.DESCRIPTION);
        this.f21354h = d("summary");
        this.f21352f = c("start_ticks");
        this.f21353g = c("end_ticks");
        this.f21355i = d(Constants.TYPE_LOCATION);
    }

    private final long c(String str) {
        String str2 = (String) this.f21349c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String d(String str) {
        return TextUtils.isEmpty((CharSequence) this.f21349c.get(str)) ? "" : (String) this.f21349c.get(str);
    }

    final Intent b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(Constants.TITLE, this.f21351e);
        data.putExtra("eventLocation", this.f21355i);
        data.putExtra(Constants.DESCRIPTION, this.f21354h);
        long j8 = this.f21352f;
        if (j8 > -1) {
            data.putExtra("beginTime", j8);
        }
        long j9 = this.f21353g;
        if (j9 > -1) {
            data.putExtra("endTime", j9);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() throws JSONException {
        if (this.f21350d == null) {
            zzh("Activity context is not available.");
            return;
        }
        G1.u.zzp();
        if (!new C2270ah(this.f21350d).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        G1.u.zzp();
        AlertDialog.Builder builderZzK = K1.K0.zzK(this.f21350d);
        Resources resourcesZze = G1.u.zzo().zze();
        builderZzK.setTitle(resourcesZze != null ? resourcesZze.getString(E1.d.f962s5) : "Create calendar event");
        builderZzK.setMessage(resourcesZze != null ? resourcesZze.getString(E1.d.f963s6) : "Allow Ad to create a calendar event?");
        builderZzK.setPositiveButton(resourcesZze != null ? resourcesZze.getString(E1.d.f960s3) : "Accept", new DialogInterfaceOnClickListenerC3430kp(this));
        builderZzK.setNegativeButton(resourcesZze != null ? resourcesZze.getString(E1.d.f961s4) : "Decline", new DialogInterfaceOnClickListenerC3544lp(this));
        builderZzK.create().show();
    }
}
