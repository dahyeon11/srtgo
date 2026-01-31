package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.kakao.sdk.common.Constants;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class YV extends ZV {

    /* renamed from: h */
    private static final SparseArray f17381h;

    /* renamed from: c */
    private final Context f17382c;

    /* renamed from: d */
    private final C2453cF f17383d;

    /* renamed from: e */
    private final TelephonyManager f17384e;

    /* renamed from: f */
    private final PV f17385f;

    /* renamed from: g */
    private EnumC1631Mg f17386g;

    static {
        SparseArray sparseArray = new SparseArray();
        f17381h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), EnumC2160Ze.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        EnumC2160Ze enumC2160Ze = EnumC2160Ze.CONNECTING;
        sparseArray.put(iOrdinal, enumC2160Ze);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC2160Ze);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC2160Ze);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), EnumC2160Ze.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        EnumC2160Ze enumC2160Ze2 = EnumC2160Ze.DISCONNECTED;
        sparseArray.put(iOrdinal2, enumC2160Ze2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC2160Ze2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), enumC2160Ze2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), enumC2160Ze2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), enumC2160Ze2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), EnumC2160Ze.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC2160Ze);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC2160Ze);
    }

    YV(Context context, C2453cF c2453cF, PV pv, LV lv, InterfaceC0671x0 interfaceC0671x0) {
        super(lv, interfaceC0671x0);
        this.f17382c = context;
        this.f17383d = c2453cF;
        this.f17385f = pv;
        this.f17384e = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ C1791Qe b(YV yv, Bundle bundle) {
        EnumC1627Me enumC1627Me;
        C1587Le c1587LeZza = C1791Qe.zza();
        int i8 = bundle.getInt("cnt", -2);
        int i9 = bundle.getInt("gnt", 0);
        if (i8 == -1) {
            yv.f17386g = EnumC1631Mg.ENUM_TRUE;
        } else {
            yv.f17386g = EnumC1631Mg.ENUM_FALSE;
            if (i8 == 0) {
                c1587LeZza.zzd(EnumC1709Oe.CELL);
            } else if (i8 != 1) {
                c1587LeZza.zzd(EnumC1709Oe.NETWORKTYPE_UNSPECIFIED);
            } else {
                c1587LeZza.zzd(EnumC1709Oe.WIFI);
            }
            switch (i9) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    enumC1627Me = EnumC1627Me.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    enumC1627Me = EnumC1627Me.THREE_G;
                    break;
                case 13:
                    enumC1627Me = EnumC1627Me.LTE;
                    break;
                default:
                    enumC1627Me = EnumC1627Me.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            c1587LeZza.zzc(enumC1627Me);
        }
        return (C1791Qe) c1587LeZza.zzbr();
    }

    static /* bridge */ /* synthetic */ EnumC2160Ze c(YV yv, Bundle bundle) {
        return (EnumC2160Ze) f17381h.get(AbstractC2947gb0.zza(AbstractC2947gb0.zza(bundle, Constants.DEVICE), "network").getInt("active_network_state", -1), EnumC2160Ze.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] e(YV yv, boolean z8, ArrayList arrayList, C1791Qe c1791Qe, EnumC2160Ze enumC2160Ze) {
        C2037We c2037WeZzn = C1996Ve.zzn();
        c2037WeZzn.zzn(arrayList);
        c2037WeZzn.zzD(f(Settings.Global.getInt(yv.f17382c.getContentResolver(), "airplane_mode_on", 0) != 0));
        c2037WeZzn.zzE(G1.u.zzq().zzg(yv.f17382c, yv.f17384e));
        c2037WeZzn.zzM(yv.f17385f.zze());
        c2037WeZzn.zzL(yv.f17385f.zzb());
        c2037WeZzn.zzG(yv.f17385f.zza());
        c2037WeZzn.zzH(enumC2160Ze);
        c2037WeZzn.zzJ(c1791Qe);
        c2037WeZzn.zzK(yv.f17386g);
        c2037WeZzn.zzN(f(z8));
        c2037WeZzn.zzP(yv.f17385f.zzd());
        c2037WeZzn.zzO(G1.u.zzB().currentTimeMillis());
        c2037WeZzn.zzQ(f(Settings.Global.getInt(yv.f17382c.getContentResolver(), "wifi_on", 0) != 0));
        return ((C1996Ve) c2037WeZzn.zzbr()).zzaV();
    }

    private static final EnumC1631Mg f(boolean z8) {
        return z8 ? EnumC1631Mg.ENUM_TRUE : EnumC1631Mg.ENUM_FALSE;
    }

    public final void zzd(boolean z8) {
        AbstractC1483In0.zzr(this.f17383d.zzb(new Bundle()), new XV(this, z8), AbstractC4805wt.zzf);
    }
}
