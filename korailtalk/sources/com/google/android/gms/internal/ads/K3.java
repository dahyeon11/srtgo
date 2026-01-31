package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class K3 {

    /* renamed from: a */
    private int f13723a;
    public byte[] zzN;
    public L1 zzT;
    public boolean zzU;
    public K1 zzW;
    public int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public I1 zzi;
    public byte[] zzj;
    public C3114i1 zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = 0;
    public int zzr = -1;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public byte[] zzv = null;
    public int zzw = -1;
    public boolean zzx = false;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzV = true;

    /* renamed from: b */
    private String f13724b = "eng";

    protected K3() {
    }

    private static Pair e(C4099qh0 c4099qh0) throws C1901Sv {
        try {
            c4099qh0.zzL(16);
            long jZzs = c4099qh0.zzs();
            if (jZzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzs == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzs != 826496599) {
                AbstractC2834fc0.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzd = c4099qh0.zzd() + 20;
            byte[] bArrZzM = c4099qh0.zzM();
            while (true) {
                int length = bArrZzM.length;
                if (iZzd >= length - 4) {
                    throw C1901Sv.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i8 = iZzd + 1;
                if (bArrZzM[iZzd] == 0 && bArrZzM[i8] == 0 && bArrZzM[iZzd + 2] == 1 && bArrZzM[iZzd + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzM, iZzd, length)));
                }
                iZzd = i8;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C1901Sv.zza("Error parsing FourCC private data", null);
        }
    }

    private static List f(byte[] bArr) throws C1901Sv {
        int i8;
        int i9;
        try {
            if (bArr[0] != 2) {
                throw C1901Sv.zza("Error parsing vorbis codec private", null);
            }
            int i10 = 0;
            int i11 = 1;
            while (true) {
                int i12 = bArr[i11];
                i11++;
                i8 = i12 & 255;
                if (i8 != 255) {
                    break;
                }
                i10 += 255;
            }
            int i13 = i10 + i8;
            int i14 = 0;
            while (true) {
                int i15 = bArr[i11];
                i11++;
                i9 = i15 & 255;
                if (i9 != 255) {
                    break;
                }
                i14 += 255;
            }
            int i16 = i14 + i9;
            if (bArr[i11] != 1) {
                throw C1901Sv.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, i11, bArr2, 0, i13);
            int i17 = i11 + i13;
            if (bArr[i17] != 3) {
                throw C1901Sv.zza("Error parsing vorbis codec private", null);
            }
            int i18 = i17 + i16;
            if (bArr[i18] != 5) {
                throw C1901Sv.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i18;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i18, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C1901Sv.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean g(C4099qh0 c4099qh0) throws C1901Sv {
        try {
            int iZzk = c4099qh0.zzk();
            if (iZzk == 1) {
                return true;
            }
            if (iZzk == 65534) {
                c4099qh0.zzK(24);
                if (c4099qh0.zzt() == L3.f14153h0.getMostSignificantBits()) {
                    if (c4099qh0.zzt() == L3.f14153h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C1901Sv.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] h(String str) throws C1901Sv {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw C1901Sv.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:378:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x05c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.internal.ads.InterfaceC2769f1 r19, int r20) throws com.google.android.gms.internal.ads.C1901Sv {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.K3.zze(com.google.android.gms.internal.ads.f1, int):void");
    }
}
