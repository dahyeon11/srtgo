package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class Q5 {

    /* renamed from: a */
    private int f15727a;
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final String zzb;
    public final String zzc;
    public final List zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final String zzk;
    public final C1735Ot zzl;
    public final String zzm;
    public final String zzn;
    public final int zzo;
    public final List zzp;
    public final C3114i1 zzq;
    public final long zzr;
    public final int zzs;
    public final int zzt;
    public final float zzu;
    public final int zzv;
    public final float zzw;
    public final byte[] zzx;
    public final int zzy;
    public final C3724nL0 zzz;

    /* renamed from: b */
    private static final Q5 f15702b = new Q5(new O4());

    /* renamed from: c */
    private static final String f15703c = Integer.toString(0, 36);

    /* renamed from: d */
    private static final String f15704d = Integer.toString(1, 36);

    /* renamed from: e */
    private static final String f15705e = Integer.toString(2, 36);

    /* renamed from: f */
    private static final String f15706f = Integer.toString(3, 36);

    /* renamed from: g */
    private static final String f15707g = Integer.toString(4, 36);

    /* renamed from: h */
    private static final String f15708h = Integer.toString(5, 36);

    /* renamed from: i */
    private static final String f15709i = Integer.toString(6, 36);

    /* renamed from: j */
    private static final String f15710j = Integer.toString(7, 36);

    /* renamed from: k */
    private static final String f15711k = Integer.toString(8, 36);

    /* renamed from: l */
    private static final String f15712l = Integer.toString(9, 36);

    /* renamed from: m */
    private static final String f15713m = Integer.toString(10, 36);

    /* renamed from: n */
    private static final String f15714n = Integer.toString(11, 36);

    /* renamed from: o */
    private static final String f15715o = Integer.toString(12, 36);

    /* renamed from: p */
    private static final String f15716p = Integer.toString(13, 36);

    /* renamed from: q */
    private static final String f15717q = Integer.toString(14, 36);

    /* renamed from: r */
    private static final String f15718r = Integer.toString(15, 36);

    /* renamed from: s */
    private static final String f15719s = Integer.toString(16, 36);

    /* renamed from: t */
    private static final String f15720t = Integer.toString(17, 36);

    /* renamed from: u */
    private static final String f15721u = Integer.toString(18, 36);

    /* renamed from: v */
    private static final String f15722v = Integer.toString(19, 36);

    /* renamed from: w */
    private static final String f15723w = Integer.toString(20, 36);

    /* renamed from: x */
    private static final String f15724x = Integer.toString(21, 36);

    /* renamed from: y */
    private static final String f15725y = Integer.toString(22, 36);

    /* renamed from: z */
    private static final String f15726z = Integer.toString(23, 36);

    /* renamed from: A */
    private static final String f15693A = Integer.toString(24, 36);

    /* renamed from: B */
    private static final String f15694B = Integer.toString(25, 36);

    /* renamed from: C */
    private static final String f15695C = Integer.toString(26, 36);

    /* renamed from: D */
    private static final String f15696D = Integer.toString(27, 36);

    /* renamed from: E */
    private static final String f15697E = Integer.toString(28, 36);

    /* renamed from: F */
    private static final String f15698F = Integer.toString(29, 36);

    /* renamed from: G */
    private static final String f15699G = Integer.toString(30, 36);

    /* renamed from: H */
    private static final String f15700H = Integer.toString(31, 36);

    /* renamed from: I */
    private static final String f15701I = Integer.toString(32, 36);

    @Deprecated
    public static final RG0 zza = new RG0() { // from class: com.google.android.gms.internal.ads.m3
    };

    /* synthetic */ Q5(O4 o42, AbstractC3919p5 abstractC3919p5) {
        this(o42);
    }

    public final boolean equals(Object obj) {
        int i8;
        if (this == obj) {
            return true;
        }
        if (obj != null && Q5.class == obj.getClass()) {
            Q5 q52 = (Q5) obj;
            int i9 = this.f15727a;
            if ((i9 == 0 || (i8 = q52.f15727a) == 0 || i9 == i8) && this.zzf == q52.zzf && this.zzg == q52.zzg && this.zzh == q52.zzh && this.zzi == q52.zzi && this.zzo == q52.zzo && this.zzr == q52.zzr && this.zzs == q52.zzs && this.zzt == q52.zzt && this.zzv == q52.zzv && this.zzy == q52.zzy && this.zzA == q52.zzA && this.zzB == q52.zzB && this.zzC == q52.zzC && this.zzD == q52.zzD && this.zzE == q52.zzE && this.zzF == q52.zzF && this.zzH == q52.zzH && Float.compare(this.zzu, q52.zzu) == 0 && Float.compare(this.zzw, q52.zzw) == 0 && AbstractC2281am0.zzG(this.zzb, q52.zzb) && AbstractC2281am0.zzG(this.zzc, q52.zzc) && this.zzd.equals(q52.zzd) && AbstractC2281am0.zzG(this.zzk, q52.zzk) && AbstractC2281am0.zzG(this.zzm, q52.zzm) && AbstractC2281am0.zzG(this.zzn, q52.zzn) && AbstractC2281am0.zzG(this.zze, q52.zze) && Arrays.equals(this.zzx, q52.zzx) && AbstractC2281am0.zzG(this.zzl, q52.zzl) && AbstractC2281am0.zzG(this.zzz, q52.zzz) && AbstractC2281am0.zzG(this.zzq, q52.zzq) && zzd(q52)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f15727a;
        if (i8 != 0) {
            return i8;
        }
        String str = this.zzb;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzc;
        int iHashCode2 = ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.zzd.hashCode();
        String str3 = this.zze;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31;
        String str4 = this.zzk;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C1735Ot c1735Ot = this.zzl;
        int iHashCode5 = (iHashCode4 + (c1735Ot == null ? 0 : c1735Ot.hashCode())) * 31;
        String str5 = this.zzm;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iHashCode7 = ((((((((((((((((((((((((((((((((((iHashCode6 + (this.zzn != null ? r2.hashCode() : 0)) * 31) + this.zzo) * 31) + ((int) this.zzr)) * 31) + this.zzs) * 31) + this.zzt) * 31) + Float.floatToIntBits(this.zzu)) * 31) + this.zzv) * 31) + Float.floatToIntBits(this.zzw)) * 31) + this.zzy) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) - 1) * 31) - 1) * 31) + this.zzH;
        this.f15727a = iHashCode7;
        return iHashCode7;
    }

    public final String toString() {
        return "Format(" + this.zzb + ", " + this.zzc + ", " + this.zzm + ", " + this.zzn + ", " + this.zzk + ", " + this.zzj + ", " + this.zze + ", [" + this.zzs + ", " + this.zzt + ", " + this.zzu + ", " + String.valueOf(this.zzz) + "], [" + this.zzA + ", " + this.zzB + "])";
    }

    public final int zza() {
        int i8;
        int i9 = this.zzs;
        if (i9 == -1 || (i8 = this.zzt) == -1) {
            return -1;
        }
        return i9 * i8;
    }

    public final O4 zzb() {
        return new O4(this, null);
    }

    public final Q5 zzc(int i8) {
        O4 o42 = new O4(this, null);
        o42.zzC(i8);
        return new Q5(o42);
    }

    public final boolean zzd(Q5 q52) {
        if (this.zzp.size() != q52.zzp.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.zzp.size(); i8++) {
            if (!Arrays.equals((byte[]) this.zzp.get(i8), (byte[]) q52.zzp.get(i8))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    Q5(final O4 o42) throws MissingResourceException {
        String str;
        this.zzb = o42.f14997a;
        String strZzD = AbstractC2281am0.zzD(o42.f15000d);
        this.zze = strZzD;
        if (o42.f14999c.isEmpty() && o42.f14998b != null) {
            this.zzd = AbstractC2394bl0.zzn(new C4380t8(strZzD, o42.f14998b));
            this.zzc = o42.f14998b;
        } else if (o42.f14999c.isEmpty() || o42.f14998b != null) {
            F10.zzf((o42.f14999c.isEmpty() && o42.f14998b == null) || o42.f14999c.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.N3
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    RG0 rg0 = Q5.zza;
                    return ((C4380t8) obj).zzb.equals(o42.f14998b);
                }
            }));
            this.zzd = o42.f14999c;
            this.zzc = o42.f14998b;
        } else {
            this.zzd = o42.f14999c;
            List list = o42.f14999c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C4380t8) list.get(0)).zzb;
                    break;
                }
                C4380t8 c4380t8 = (C4380t8) it.next();
                if (TextUtils.equals(c4380t8.zza, strZzD)) {
                    str = c4380t8.zzb;
                    break;
                }
            }
            this.zzc = str;
        }
        this.zzf = o42.f15001e;
        this.zzg = o42.f15002f;
        int i8 = o42.f15003g;
        this.zzh = i8;
        int i9 = o42.f15004h;
        this.zzi = i9;
        this.zzj = i9 != -1 ? i9 : i8;
        this.zzk = o42.f15005i;
        this.zzl = o42.f15006j;
        this.zzm = o42.f15007k;
        this.zzn = o42.f15008l;
        this.zzo = o42.f15009m;
        this.zzp = o42.f15010n == null ? Collections.emptyList() : o42.f15010n;
        C3114i1 c3114i1 = o42.f15011o;
        this.zzq = c3114i1;
        this.zzr = o42.f15012p;
        this.zzs = o42.f15013q;
        this.zzt = o42.f15014r;
        this.zzu = o42.f15015s;
        this.zzv = o42.f15016t == -1 ? 0 : o42.f15016t;
        this.zzw = o42.f15017u == -1.0f ? 1.0f : o42.f15017u;
        this.zzx = o42.f15018v;
        this.zzy = o42.f15019w;
        this.zzz = o42.f15020x;
        this.zzA = o42.f15021y;
        this.zzB = o42.f15022z;
        this.zzC = o42.f14991A;
        this.zzD = o42.f14992B == -1 ? 0 : o42.f14992B;
        this.zzE = o42.f14993C != -1 ? o42.f14993C : 0;
        this.zzF = o42.f14994D;
        this.zzG = o42.f14995E;
        if (o42.f14996F != 0 || c3114i1 == null) {
            this.zzH = o42.f14996F;
        } else {
            this.zzH = 1;
        }
    }
}
