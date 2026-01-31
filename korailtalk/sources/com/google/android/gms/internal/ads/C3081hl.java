package com.google.android.gms.internal.ads;

import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.hl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3081hl implements InterfaceC2278al {

    /* renamed from: d, reason: collision with root package name */
    static final Map f19839d = o2.g.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a, reason: collision with root package name */
    private final G1.b f19840a;

    /* renamed from: b, reason: collision with root package name */
    private final C4114qp f19841b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4911xp f19842c;

    public C3081hl(G1.b bVar, C4114qp c4114qp, InterfaceC4911xp interfaceC4911xp) {
        this.f19840a = bVar;
        this.f19841b = c4114qp;
        this.f19842c = interfaceC4911xp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws JSONException {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        int iIntValue = ((Integer) f19839d.get((String) map.get(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A))).intValue();
        int i8 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                if (!this.f19840a.zzc()) {
                    this.f19840a.zzb(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.f19841b.zzb(map);
                    return;
                }
                if (iIntValue == 3) {
                    new C4455tp(interfaceC2065Wv, map).zzb();
                    return;
                }
                if (iIntValue == 4) {
                    new C3772np(interfaceC2065Wv, map).zzc();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f19841b.zza(true);
                        return;
                    } else if (iIntValue != 7) {
                        L1.n.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f19842c.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z8 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (interfaceC2065Wv == null) {
            L1.n.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i8 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i8 = z8 ? -1 : 14;
        }
        interfaceC2065Wv.zzau(i8);
    }
}
