package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Sh */
/* loaded from: classes2.dex */
public final class C1879Sh extends androidx.browser.customtabs.b {

    /* renamed from: a */
    private final AtomicBoolean f16321a = new AtomicBoolean(false);

    /* renamed from: b */
    private final List f16322b = Arrays.asList(((String) H1.C.zzc().zza(AbstractC4439th.zzjP)).split(","));

    /* renamed from: c */
    private final C2002Vh f16323c;

    /* renamed from: d */
    private final androidx.browser.customtabs.b f16324d;

    C1879Sh(C2002Vh c2002Vh, androidx.browser.customtabs.b bVar) {
        this.f16324d = bVar;
        this.f16323c = c2002Vh;
    }

    @Override // androidx.browser.customtabs.b
    public final void extraCallback(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f16324d;
        if (bVar != null) {
            bVar.extraCallback(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f16324d;
        if (bVar != null) {
            return bVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    public final void onActivityResized(int i8, int i9, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f16324d;
        if (bVar != null) {
            bVar.onActivityResized(i8, i9, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onMessageChannelReady(Bundle bundle) {
        this.f16321a.set(false);
        androidx.browser.customtabs.b bVar = this.f16324d;
        if (bVar != null) {
            bVar.onMessageChannelReady(bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onNavigationEvent(int i8, Bundle bundle) {
        List list;
        this.f16321a.set(false);
        androidx.browser.customtabs.b bVar = this.f16324d;
        if (bVar != null) {
            bVar.onNavigationEvent(i8, bundle);
        }
        this.f16323c.zzi(G1.u.zzB().currentTimeMillis());
        if (this.f16323c == null || (list = this.f16322b) == null || !list.contains(String.valueOf(i8))) {
            return;
        }
        this.f16323c.d();
    }

    @Override // androidx.browser.customtabs.b
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f16321a.set(true);
                this.f16323c.e(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e8) {
            AbstractC0667v0.zzb("Message is not in JSON format: ", e8);
        }
        androidx.browser.customtabs.b bVar = this.f16324d;
        if (bVar != null) {
            bVar.onPostMessage(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onRelationshipValidationResult(int i8, Uri uri, boolean z8, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f16324d;
        if (bVar != null) {
            bVar.onRelationshipValidationResult(i8, uri, z8, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.f16321a.get());
    }
}
