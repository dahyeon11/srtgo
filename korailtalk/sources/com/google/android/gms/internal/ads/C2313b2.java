package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b2 */
/* loaded from: classes2.dex */
final class C2313b2 implements T1 {

    /* renamed from: a */
    private final int f18077a;
    public final AbstractC2394bl0 zza;

    private C2313b2(int i8, AbstractC2394bl0 abstractC2394bl0) {
        this.f18077a = i8;
        this.zza = abstractC2394bl0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C2313b2 zzc(int i8, C4099qh0 c4099qh0) {
        T1 c2427c2;
        String str;
        C2091Xk0 c2091Xk0 = new C2091Xk0();
        int iZze = c4099qh0.zze();
        int i9 = -2;
        while (c4099qh0.zzb() > 8) {
            int iZzi = c4099qh0.zzi();
            int iZzd = c4099qh0.zzd() + c4099qh0.zzi();
            c4099qh0.zzJ(iZzd);
            if (iZzi != 1414744396) {
                C2427c2 c2427c22 = null;
                switch (iZzi) {
                    case 1718776947:
                        if (i9 == 2) {
                            c4099qh0.zzL(4);
                            int iZzi2 = c4099qh0.zzi();
                            int iZzi3 = c4099qh0.zzi();
                            c4099qh0.zzL(4);
                            int iZzi4 = c4099qh0.zzi();
                            switch (iZzi4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                AbstractC2834fc0.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + iZzi4);
                            } else {
                                O4 o42 = new O4();
                                o42.zzac(iZzi2);
                                o42.zzI(iZzi3);
                                o42.zzX(str);
                                c2427c22 = new C2427c2(o42.zzad());
                            }
                        } else if (i9 == 1) {
                            int iZzk = c4099qh0.zzk();
                            String str2 = iZzk != 1 ? iZzk != 85 ? iZzk != 255 ? iZzk != 8192 ? iZzk != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int iZzk2 = c4099qh0.zzk();
                                int iZzi5 = c4099qh0.zzi();
                                c4099qh0.zzL(6);
                                int iZzl = AbstractC2281am0.zzl(c4099qh0.zzq());
                                int iZzk3 = c4099qh0.zzk();
                                byte[] bArr = new byte[iZzk3];
                                c4099qh0.zzG(bArr, 0, iZzk3);
                                O4 o43 = new O4();
                                o43.zzX(str2);
                                o43.zzy(iZzk2);
                                o43.zzY(iZzi5);
                                if ("audio/raw".equals(str2) && iZzl != 0) {
                                    o43.zzR(iZzl);
                                }
                                if ("audio/mp4a-latm".equals(str2) && iZzk3 > 0) {
                                    o43.zzL(AbstractC2394bl0.zzn(bArr));
                                }
                                c2427c2 = new C2427c2(o43.zzad());
                                break;
                            } else {
                                AbstractC2834fc0.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + iZzk);
                            }
                        } else {
                            AbstractC2834fc0.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(AbstractC2281am0.zzC(i9)));
                        }
                        c2427c2 = c2427c22;
                        break;
                    case 1751742049:
                        c2427c2 = Y1.zzb(c4099qh0);
                        break;
                    case 1752331379:
                        c2427c2 = Z1.zzb(c4099qh0);
                        break;
                    case 1852994675:
                        c2427c2 = C2542d2.zzb(c4099qh0);
                        break;
                    default:
                        c2427c2 = c2427c22;
                        break;
                }
            } else {
                c2427c2 = zzc(c4099qh0.zzi(), c4099qh0);
            }
            if (c2427c2 != null) {
                if (c2427c2.zza() == 1752331379) {
                    int i10 = ((Z1) c2427c2).zza;
                    if (i10 == 1935960438) {
                        i9 = 2;
                    } else if (i10 == 1935963489) {
                        i9 = 1;
                    } else if (i10 != 1937012852) {
                        AbstractC2834fc0.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i10))));
                        i9 = -1;
                    } else {
                        i9 = 3;
                    }
                }
                c2091Xk0.zzf(c2427c2);
            }
            c4099qh0.zzK(iZzd);
            c4099qh0.zzJ(iZze);
        }
        return new C2313b2(i8, c2091Xk0.zzi());
    }

    @Override // com.google.android.gms.internal.ads.T1
    public final int zza() {
        return this.f18077a;
    }

    public final T1 zzb(Class cls) {
        AbstractC2394bl0 abstractC2394bl0 = this.zza;
        int size = abstractC2394bl0.size();
        int i8 = 0;
        while (i8 < size) {
            T1 t12 = (T1) abstractC2394bl0.get(i8);
            i8++;
            if (t12.getClass() == cls) {
                return t12;
            }
        }
        return null;
    }
}
