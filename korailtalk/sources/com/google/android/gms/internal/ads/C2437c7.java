package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.c7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2437c7 implements U6 {

    /* renamed from: a, reason: collision with root package name */
    private final C1755Pg0 f18249a = new C1755Pg0(new byte[5], 5);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f18250b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseIntArray f18251c = new SparseIntArray();

    /* renamed from: d, reason: collision with root package name */
    private final int f18252d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2552d7 f18253e;

    public C2437c7(C2552d7 c2552d7, int i8) {
        this.f18253e = c2552d7;
        this.f18252d = i8;
    }

    @Override // com.google.android.gms.internal.ads.U6
    public final void zza(C4099qh0 c4099qh0) {
        C2132Yk0 c2132Yk0;
        C2132Yk0 c2132Yk02;
        int i8;
        if (c4099qh0.zzm() != 2) {
            return;
        }
        C2132Yk0 c2132Yk03 = (C2132Yk0) this.f18253e.f18518a.get(0);
        if ((c4099qh0.zzm() & 128) != 0) {
            c4099qh0.zzL(1);
            int iZzq = c4099qh0.zzq();
            int i9 = 3;
            c4099qh0.zzL(3);
            c4099qh0.zzF(this.f18249a, 2);
            this.f18249a.zzm(3);
            int i10 = 13;
            this.f18253e.f18534q = this.f18249a.zzd(13);
            c4099qh0.zzF(this.f18249a, 2);
            int i11 = 4;
            this.f18249a.zzm(4);
            int i12 = 12;
            c4099qh0.zzL(this.f18249a.zzd(12));
            this.f18250b.clear();
            this.f18251c.clear();
            int iZzb = c4099qh0.zzb();
            while (iZzb > 0) {
                int i13 = 5;
                c4099qh0.zzF(this.f18249a, 5);
                C1755Pg0 c1755Pg0 = this.f18249a;
                int iZzd = c1755Pg0.zzd(8);
                c1755Pg0.zzm(i9);
                int iZzd2 = this.f18249a.zzd(i10);
                this.f18249a.zzm(i11);
                int iZzd3 = this.f18249a.zzd(i12);
                int iZzd4 = c4099qh0.zzd();
                int i14 = iZzd4 + iZzd3;
                int iZzm = 0;
                String str = null;
                ArrayList arrayList = null;
                int i15 = -1;
                while (c4099qh0.zzd() < i14) {
                    int iZzm2 = c4099qh0.zzm();
                    int iZzd5 = c4099qh0.zzd() + c4099qh0.zzm();
                    if (iZzd5 > i14) {
                        break;
                    }
                    if (iZzm2 == i13) {
                        long jZzu = c4099qh0.zzu();
                        if (jZzu != 1094921523) {
                            if (jZzu != 1161904947) {
                                if (jZzu != 1094921524) {
                                    if (jZzu == 1212503619) {
                                        i8 = 36;
                                        c2132Yk02 = c2132Yk03;
                                        i15 = i8;
                                    }
                                    c2132Yk02 = c2132Yk03;
                                }
                                c2132Yk02 = c2132Yk03;
                                i15 = 172;
                            }
                            c2132Yk02 = c2132Yk03;
                            i15 = 135;
                        }
                        c2132Yk02 = c2132Yk03;
                        i15 = 129;
                    } else if (iZzm2 == 106) {
                        c2132Yk02 = c2132Yk03;
                        i15 = 129;
                    } else if (iZzm2 == 122) {
                        c2132Yk02 = c2132Yk03;
                        i15 = 135;
                    } else {
                        if (iZzm2 == 127) {
                            int iZzm3 = c4099qh0.zzm();
                            if (iZzm3 != 21) {
                                if (iZzm3 == 14) {
                                    i8 = 136;
                                } else {
                                    if (iZzm3 == 33) {
                                        i8 = 139;
                                    }
                                    c2132Yk02 = c2132Yk03;
                                }
                            }
                            c2132Yk02 = c2132Yk03;
                            i15 = 172;
                        } else if (iZzm2 == 123) {
                            i8 = 138;
                        } else if (iZzm2 == 10) {
                            String strTrim = c4099qh0.zzA(i9, AbstractC3647mj0.zzc).trim();
                            iZzm = c4099qh0.zzm();
                            c2132Yk02 = c2132Yk03;
                            str = strTrim;
                        } else if (iZzm2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (c4099qh0.zzd() < iZzd5) {
                                String strTrim2 = c4099qh0.zzA(i9, AbstractC3647mj0.zzc).trim();
                                int iZzm4 = c4099qh0.zzm();
                                C2132Yk0 c2132Yk04 = c2132Yk03;
                                byte[] bArr = new byte[i11];
                                c4099qh0.zzG(bArr, 0, i11);
                                arrayList2.add(new C2666e7(strTrim2, iZzm4, bArr));
                                c2132Yk03 = c2132Yk04;
                                i9 = 3;
                                i11 = 4;
                            }
                            c2132Yk02 = c2132Yk03;
                            arrayList = arrayList2;
                            i15 = 89;
                        } else {
                            c2132Yk02 = c2132Yk03;
                            if (iZzm2 == 111) {
                                i15 = 257;
                            }
                        }
                        c2132Yk02 = c2132Yk03;
                        i15 = i8;
                    }
                    c4099qh0.zzL(iZzd5 - c4099qh0.zzd());
                    c2132Yk03 = c2132Yk02;
                    i9 = 3;
                    i11 = 4;
                    i13 = 5;
                }
                C2132Yk0 c2132Yk05 = c2132Yk03;
                c4099qh0.zzK(i14);
                C2781f7 c2781f7 = new C2781f7(i15, str, iZzm, arrayList, Arrays.copyOfRange(c4099qh0.zzM(), iZzd4, i14));
                if (iZzd == 6 || iZzd == 5) {
                    iZzd = c2781f7.zza;
                }
                iZzb -= iZzd3 + 5;
                if (!this.f18253e.f18524g.get(iZzd2)) {
                    InterfaceC3126i7 interfaceC3126i7Zza = this.f18253e.f18521d.zza(iZzd, c2781f7);
                    this.f18251c.put(iZzd2, iZzd2);
                    this.f18250b.put(iZzd2, interfaceC3126i7Zza);
                }
                c2132Yk03 = c2132Yk05;
                i9 = 3;
                i11 = 4;
                i12 = 12;
                i10 = 13;
            }
            C2132Yk0 c2132Yk06 = c2132Yk03;
            int size = this.f18251c.size();
            int i16 = 0;
            while (i16 < size) {
                SparseIntArray sparseIntArray = this.f18251c;
                C2552d7 c2552d7 = this.f18253e;
                int iKeyAt = sparseIntArray.keyAt(i16);
                int iValueAt = sparseIntArray.valueAt(i16);
                c2552d7.f18524g.put(iKeyAt, true);
                this.f18253e.f18525h.put(iValueAt, true);
                InterfaceC3126i7 interfaceC3126i7 = (InterfaceC3126i7) this.f18250b.valueAt(i16);
                if (interfaceC3126i7 != null) {
                    InterfaceC2769f1 interfaceC2769f1 = this.f18253e.f18528k;
                    C3011h7 c3011h7 = new C3011h7(iZzq, iKeyAt, 8192);
                    c2132Yk0 = c2132Yk06;
                    interfaceC3126i7.zzb(c2132Yk0, interfaceC2769f1, c3011h7);
                    this.f18253e.f18523f.put(iValueAt, interfaceC3126i7);
                } else {
                    c2132Yk0 = c2132Yk06;
                }
                i16++;
                c2132Yk06 = c2132Yk0;
            }
            this.f18253e.f18523f.remove(this.f18252d);
            this.f18253e.f18529l = 0;
            C2552d7 c2552d72 = this.f18253e;
            if (c2552d72.f18529l == 0) {
                c2552d72.f18528k.zzD();
                this.f18253e.f18530m = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.U6
    public final void zzb(C2132Yk0 c2132Yk0, InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
    }
}
