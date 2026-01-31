package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.kakao.sdk.template.Constants;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ul */
/* loaded from: classes2.dex */
public final class C4561ul implements InterfaceC2278al {

    /* renamed from: a */
    private final Context f23101a;

    public C4561ul(Context context) {
        this.f23101a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        AbstractC0667v0.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey(Constants.TITLE)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(Constants.TITLE));
        }
        try {
            G1.u.zzp();
            K1.K0.zzT(this.f23101a, intent);
        } catch (RuntimeException e8) {
            L1.n.zzk("Failed to open Share Sheet", e8);
            G1.u.zzo().zzw(e8, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
