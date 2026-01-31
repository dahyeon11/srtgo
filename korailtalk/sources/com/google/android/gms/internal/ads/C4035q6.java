package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.q6 */
/* loaded from: classes2.dex */
public final class C4035q6 implements InterfaceC2896g7 {

    /* renamed from: a */
    private final List f21856a;

    public C4035q6(int i8, List list) {
        this.f21856a = list;
    }

    private final W6 a(C2781f7 c2781f7) {
        return new W6(c(c2781f7));
    }

    private final C3353k7 b(C2781f7 c2781f7) {
        return new C3353k7(c(c2781f7));
    }

    private final List c(C2781f7 c2781f7) {
        String str;
        int i8;
        List listSingletonList;
        C4099qh0 c4099qh0 = new C4099qh0(c2781f7.zze);
        List arrayList = this.f21856a;
        while (c4099qh0.zzb() > 0) {
            int iZzm = c4099qh0.zzm();
            int iZzd = c4099qh0.zzd() + c4099qh0.zzm();
            if (iZzm == 134) {
                arrayList = new ArrayList();
                int iZzm2 = c4099qh0.zzm() & 31;
                for (int i9 = 0; i9 < iZzm2; i9++) {
                    String strZzA = c4099qh0.zzA(3, AbstractC3647mj0.zzc);
                    int iZzm3 = c4099qh0.zzm();
                    boolean z8 = (iZzm3 & 128) != 0;
                    if (z8) {
                        i8 = iZzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i8 = 1;
                    }
                    byte bZzm = (byte) c4099qh0.zzm();
                    c4099qh0.zzL(1);
                    if (z8) {
                        int i10 = bZzm & 64;
                        int i11 = I20.zza;
                        listSingletonList = Collections.singletonList(i10 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    O4 o42 = new O4();
                    o42.zzX(str);
                    o42.zzO(strZzA);
                    o42.zzw(i8);
                    o42.zzL(listSingletonList);
                    arrayList.add(o42.zzad());
                }
            }
            c4099qh0.zzK(iZzd);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2896g7
    public final InterfaceC3126i7 zza(int i8, C2781f7 c2781f7) {
        if (i8 != 2) {
            if (i8 == 3 || i8 == 4) {
                return new L6(new I6(c2781f7.zzb, c2781f7.zza()));
            }
            if (i8 == 21) {
                return new L6(new G6());
            }
            if (i8 == 27) {
                return new L6(new D6(a(c2781f7), false, false));
            }
            if (i8 == 36) {
                return new L6(new F6(a(c2781f7)));
            }
            if (i8 == 89) {
                return new L6(new C4376t6(c2781f7.zzd));
            }
            if (i8 == 172) {
                return new L6(new C3579m6(c2781f7.zzb, c2781f7.zza()));
            }
            if (i8 == 257) {
                return new V6(new K6("application/vnd.dvb.ait"));
            }
            if (i8 != 128) {
                if (i8 != 129) {
                    if (i8 != 138) {
                        if (i8 == 139) {
                            return new L6(new C4262s6(c2781f7.zzb, c2781f7.zza(), 5408));
                        }
                        switch (i8) {
                            case 15:
                                return new L6(new C3921p6(false, c2781f7.zzb, c2781f7.zza()));
                            case 16:
                                return new L6(new C5060z6(b(c2781f7)));
                            case 17:
                                return new L6(new H6(c2781f7.zzb, c2781f7.zza()));
                            default:
                                switch (i8) {
                                    case 134:
                                        return new V6(new K6("application/x-scte35"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new L6(new C4262s6(c2781f7.zzb, c2781f7.zza(), 4096));
                }
                return new L6(new C3237j6(c2781f7.zzb, c2781f7.zza()));
            }
        }
        return new L6(new C4718w6(b(c2781f7)));
    }

    public C4035q6() {
        this(0);
    }

    public C4035q6(int i8) {
        this.f21856a = AbstractC2394bl0.zzm();
    }
}
