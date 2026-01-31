package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4447tl implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4333sl f22913a;

    public C4447tl(InterfaceC4333sl interfaceC4333sl) {
        this.f22913a = interfaceC4333sl;
    }

    public static void zzb(InterfaceC2065Wv interfaceC2065Wv, InterfaceC4333sl interfaceC4333sl) {
        interfaceC2065Wv.zzag("/reward", new C4447tl(interfaceC4333sl));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) throws NumberFormatException {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f22913a.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f22913a.zzb();
                    return;
                }
                return;
            }
        }
        C1242Cr c1242Cr = null;
        try {
            int i8 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                c1242Cr = new C1242Cr(str2, i8);
            }
        } catch (NumberFormatException e8) {
            L1.n.zzk("Unable to parse reward amount.", e8);
        }
        this.f22913a.zza(c1242Cr);
    }
}
