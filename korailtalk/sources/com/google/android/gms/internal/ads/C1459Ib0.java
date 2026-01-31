package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.Ib0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1459Ib0 implements InterfaceC1418Hb0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f13477a;

    /* renamed from: b, reason: collision with root package name */
    private final C1704Ob0 f13478b;

    /* renamed from: c, reason: collision with root package name */
    private final C1541Kb0 f13479c = new C1541Kb0();

    public C1459Ib0(C1704Ob0 c1704Ob0) {
        this.f13477a = new ConcurrentHashMap(c1704Ob0.zzd);
        this.f13478b = c1704Ob0;
    }

    private final void a() {
        Parcelable.Creator<C1704Ob0> creator = C1704Ob0.CREATOR;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgB)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13478b.zzb);
            sb.append(" PoolCollection");
            sb.append(this.f13479c.zzb());
            int i8 = 0;
            for (Map.Entry entry : this.f13477a.entrySet()) {
                i8++;
                sb.append(i8);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((InterfaceC1827Rb0) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i9 = 0; i9 < ((C1377Gb0) entry.getValue()).zzb(); i9++) {
                    sb.append("[O]");
                }
                for (int iZzb = ((C1377Gb0) entry.getValue()).zzb(); iZzb < this.f13478b.zzd; iZzb++) {
                    sb.append("[ ]");
                }
                sb.append(Q7.X.LF);
                sb.append(((C1377Gb0) entry.getValue()).zzg());
                sb.append(Q7.X.LF);
            }
            while (i8 < this.f13478b.zzc) {
                i8++;
                sb.append(i8);
                sb.append(".\n");
            }
            L1.n.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1418Hb0
    public final C1704Ob0 zza() {
        return this.f13478b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1418Hb0
    public final synchronized C1786Qb0 zzb(InterfaceC1827Rb0 interfaceC1827Rb0) {
        C1786Qb0 c1786Qb0Zze;
        try {
            C1377Gb0 c1377Gb0 = (C1377Gb0) this.f13477a.get(interfaceC1827Rb0);
            if (c1377Gb0 != null) {
                c1786Qb0Zze = c1377Gb0.zze();
                if (c1786Qb0Zze == null) {
                    this.f13479c.zze();
                }
                C2719ec0 c2719ec0Zzf = c1377Gb0.zzf();
                if (c1786Qb0Zze != null) {
                    C1589Lf c1589LfZzd = C1957Uf.zzd();
                    C1466If c1466IfZza = C1507Jf.zza();
                    c1466IfZza.zzf(EnumC1629Mf.IN_MEMORY);
                    C1711Of c1711OfZzc = C1752Pf.zzc();
                    c1711OfZzc.zzd(c2719ec0Zzf.zza);
                    c1711OfZzc.zze(c2719ec0Zzf.zzb);
                    c1466IfZza.zzg(c1711OfZzc);
                    c1589LfZzd.zzd(c1466IfZza);
                    c1786Qb0Zze.zza.zzb().zzc().zzi((C1957Uf) c1589LfZzd.zzbr());
                }
                a();
            } else {
                this.f13479c.zzf();
                a();
                c1786Qb0Zze = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1786Qb0Zze;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1418Hb0
    @Deprecated
    public final InterfaceC1827Rb0 zzc(H1.Y1 y12, String str, H1.j2 j2Var) {
        return new C1868Sb0(y12, str, new C2978gr(this.f13478b.zza).zza().zzk, this.f13478b.zzf, j2Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1418Hb0
    public final synchronized boolean zzd(InterfaceC1827Rb0 interfaceC1827Rb0, C1786Qb0 c1786Qb0) {
        boolean zZzh;
        try {
            C1377Gb0 c1377Gb0 = (C1377Gb0) this.f13477a.get(interfaceC1827Rb0);
            c1786Qb0.zzd = G1.u.zzB().currentTimeMillis();
            if (c1377Gb0 == null) {
                C1704Ob0 c1704Ob0 = this.f13478b;
                C1377Gb0 c1377Gb02 = new C1377Gb0(c1704Ob0.zzd, c1704Ob0.zze * 1000);
                if (this.f13477a.size() == this.f13478b.zzc) {
                    int i8 = this.f13478b.zzg;
                    int i9 = i8 - 1;
                    InterfaceC1827Rb0 interfaceC1827Rb02 = null;
                    if (i8 == 0) {
                        throw null;
                    }
                    long jZzc = Long.MAX_VALUE;
                    if (i9 == 0) {
                        for (Map.Entry entry : this.f13477a.entrySet()) {
                            if (((C1377Gb0) entry.getValue()).zzc() < jZzc) {
                                jZzc = ((C1377Gb0) entry.getValue()).zzc();
                                interfaceC1827Rb02 = (InterfaceC1827Rb0) entry.getKey();
                            }
                        }
                        if (interfaceC1827Rb02 != null) {
                            this.f13477a.remove(interfaceC1827Rb02);
                        }
                    } else if (i9 == 1) {
                        for (Map.Entry entry2 : this.f13477a.entrySet()) {
                            if (((C1377Gb0) entry2.getValue()).zzd() < jZzc) {
                                jZzc = ((C1377Gb0) entry2.getValue()).zzd();
                                interfaceC1827Rb02 = (InterfaceC1827Rb0) entry2.getKey();
                            }
                        }
                        if (interfaceC1827Rb02 != null) {
                            this.f13477a.remove(interfaceC1827Rb02);
                        }
                    } else if (i9 == 2) {
                        int iZza = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.f13477a.entrySet()) {
                            if (((C1377Gb0) entry3.getValue()).zza() < iZza) {
                                iZza = ((C1377Gb0) entry3.getValue()).zza();
                                interfaceC1827Rb02 = (InterfaceC1827Rb0) entry3.getKey();
                            }
                        }
                        if (interfaceC1827Rb02 != null) {
                            this.f13477a.remove(interfaceC1827Rb02);
                        }
                    }
                    this.f13479c.zzg();
                }
                this.f13477a.put(interfaceC1827Rb0, c1377Gb02);
                this.f13479c.zzd();
                c1377Gb0 = c1377Gb02;
            }
            zZzh = c1377Gb0.zzh(c1786Qb0);
            this.f13479c.zzc();
            C1500Jb0 c1500Jb0Zza = this.f13479c.zza();
            C2719ec0 c2719ec0Zzf = c1377Gb0.zzf();
            C1589Lf c1589LfZzd = C1957Uf.zzd();
            C1466If c1466IfZza = C1507Jf.zza();
            c1466IfZza.zzf(EnumC1629Mf.IN_MEMORY);
            C1834Rf c1834RfZzc = C1875Sf.zzc();
            c1834RfZzc.zze(c1500Jb0Zza.zza);
            c1834RfZzc.zzf(c1500Jb0Zza.zzb);
            c1834RfZzc.zzg(c2719ec0Zzf.zzb);
            c1466IfZza.zzi(c1834RfZzc);
            c1589LfZzd.zzd(c1466IfZza);
            c1786Qb0.zza.zzb().zzc().zzj((C1957Uf) c1589LfZzd.zzbr());
            a();
        } catch (Throwable th) {
            throw th;
        }
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1418Hb0
    public final synchronized boolean zze(InterfaceC1827Rb0 interfaceC1827Rb0) {
        C1377Gb0 c1377Gb0 = (C1377Gb0) this.f13477a.get(interfaceC1827Rb0);
        if (c1377Gb0 == null) {
            return true;
        }
        return c1377Gb0.zzb() < this.f13478b.zzd;
    }
}
