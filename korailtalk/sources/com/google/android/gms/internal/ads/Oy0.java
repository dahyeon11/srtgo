package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class Oy0 {

    /* renamed from: d */
    private static final Oy0 f15177d = new Oy0(true);

    /* renamed from: a */
    final AbstractC4955yA0 f15178a = new C3816oA0(16);

    /* renamed from: b */
    private boolean f15179b;

    /* renamed from: c */
    private boolean f15180c;

    private Oy0() {
    }

    static int a(SA0 sa0, int i8, Object obj) {
        int iZzD = Dy0.zzD(i8 << 3);
        if (sa0 == SA0.zzj) {
            byte[] bArr = AbstractC3793nz0.zzd;
            if (((Pz0) obj) instanceof Rx0) {
                throw null;
            }
            iZzD += iZzD;
        }
        return iZzD + b(sa0, obj);
    }

    static int b(SA0 sa0, Object obj) {
        int iZzd;
        int iZzD;
        SA0 sa02 = SA0.zza;
        TA0 ta0 = TA0.INT;
        switch (sa0.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i8 = Dy0.zzf;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i9 = Dy0.zzf;
                return 4;
            case 2:
                return Dy0.zzE(((Long) obj).longValue());
            case 3:
                return Dy0.zzE(((Long) obj).longValue());
            case 4:
                return Dy0.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i10 = Dy0.zzf;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i11 = Dy0.zzf;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i12 = Dy0.zzf;
                return 1;
            case 8:
                if (!(obj instanceof AbstractC3677my0)) {
                    return Dy0.zzC((String) obj);
                }
                int i13 = Dy0.zzf;
                iZzd = ((AbstractC3677my0) obj).zzd();
                iZzD = Dy0.zzD(iZzd);
                break;
            case 9:
                int i14 = Dy0.zzf;
                return ((Pz0) obj).zzaY();
            case 10:
                return Dy0.zzz((Pz0) obj);
            case 11:
                if (!(obj instanceof AbstractC3677my0)) {
                    int i15 = Dy0.zzf;
                    iZzd = ((byte[]) obj).length;
                    iZzD = Dy0.zzD(iZzd);
                    break;
                } else {
                    int i16 = Dy0.zzf;
                    iZzd = ((AbstractC3677my0) obj).zzd();
                    iZzD = Dy0.zzD(iZzd);
                    break;
                }
            case 12:
                return Dy0.zzD(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC2650dz0 ? Dy0.zzE(((InterfaceC2650dz0) obj).zza()) : Dy0.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i17 = Dy0.zzf;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i18 = Dy0.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return Dy0.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return Dy0.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzD + iZzd;
    }

    private static Object c(Object obj) {
        if (obj instanceof Uz0) {
            return ((Uz0) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void d(Map.Entry entry) {
        Pz0 pz0Zzbr;
        Ny0 ny0 = (Ny0) entry.getKey();
        Object value = entry.getValue();
        if (ny0.zzg()) {
            Object objZzf = zzf(ny0);
            if (objZzf == null) {
                objZzf = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZzf).add(c(it.next()));
            }
            this.f15178a.put(ny0, objZzf);
            return;
        }
        if (ny0.zze() != TA0.MESSAGE) {
            this.f15178a.put(ny0, c(value));
            return;
        }
        Object objZzf2 = zzf(ny0);
        if (objZzf2 == null) {
            this.f15178a.put(ny0, c(value));
            return;
        }
        if (objZzf2 instanceof Uz0) {
            pz0Zzbr = ny0.zzc((Uz0) objZzf2, (Uz0) value);
        } else {
            Oz0 oz0ZzcZ = ((Pz0) objZzf2).zzcZ();
            ny0.zzb(oz0ZzcZ, (Pz0) value);
            pz0Zzbr = oz0ZzcZ.zzbr();
        }
        this.f15178a.put(ny0, pz0Zzbr);
    }

    private static boolean e(Map.Entry entry) {
        Ny0 ny0 = (Ny0) entry.getKey();
        if (ny0.zze() != TA0.MESSAGE) {
            return true;
        }
        if (!ny0.zzg()) {
            return f(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!f(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean f(Object obj) {
        if (obj instanceof Qz0) {
            return ((Qz0) obj).zzbw();
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int g(Map.Entry entry) {
        Ny0 ny0 = (Ny0) entry.getKey();
        Object value = entry.getValue();
        if (ny0.zze() != TA0.MESSAGE || ny0.zzg() || ny0.zzf()) {
            return zzc(ny0, value);
        }
        int iZza = ((Ny0) entry.getKey()).zza();
        int iZzD = Dy0.zzD(8);
        return iZzD + iZzD + Dy0.zzD(16) + Dy0.zzD(iZza) + Dy0.zzD(24) + Dy0.zzz((Pz0) value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void h(com.google.android.gms.internal.ads.Ny0 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.SA0 r0 = r2.zzd()
            byte[] r1 = com.google.android.gms.internal.ads.AbstractC3793nz0.zzd
            r3.getClass()
            com.google.android.gms.internal.ads.SA0 r1 = com.google.android.gms.internal.ads.SA0.zza
            com.google.android.gms.internal.ads.TA0 r1 = com.google.android.gms.internal.ads.TA0.INT
            com.google.android.gms.internal.ads.TA0 r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L44
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.Pz0
            if (r0 == 0) goto L44
            goto L43
        L1e:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L43
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.InterfaceC2650dz0
            if (r0 == 0) goto L44
            goto L43
        L27:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.AbstractC3677my0
            if (r0 != 0) goto L43
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L44
            goto L43
        L30:
            boolean r0 = r3 instanceof java.lang.String
            goto L41
        L33:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r0 = r3 instanceof java.lang.Double
            goto L41
        L39:
            boolean r0 = r3 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r0 = r3 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r0 = r3 instanceof java.lang.Integer
        L41:
            if (r0 == 0) goto L44
        L43:
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.ads.SA0 r2 = r2.zzd()
            com.google.android.gms.internal.ads.TA0 r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Oy0.h(com.google.android.gms.internal.ads.Ny0, java.lang.Object):void");
    }

    public static int zzc(Ny0 ny0, Object obj) {
        SA0 sa0Zzd = ny0.zzd();
        int iZza = ny0.zza();
        if (!ny0.zzg()) {
            return a(sa0Zzd, iZza, obj);
        }
        List list = (List) obj;
        int iA = 0;
        if (!ny0.zzf()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iA += a(sa0Zzd, iZza, it.next());
            }
            return iA;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iA += b(sa0Zzd, it2.next());
        }
        return Dy0.zzD(iZza << 3) + iA + Dy0.zzD(iA);
    }

    public static Oy0 zze() {
        return f15177d;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Oy0 oy0 = new Oy0();
        for (int i8 = 0; i8 < this.f15178a.zzb(); i8++) {
            Map.Entry entryZzg = this.f15178a.zzg(i8);
            oy0.zzk((Ny0) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.f15178a.zzc()) {
            oy0.zzk((Ny0) entry.getKey(), entry.getValue());
        }
        oy0.f15180c = this.f15180c;
        return oy0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Oy0) {
            return this.f15178a.equals(((Oy0) obj).f15178a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15178a.hashCode();
    }

    public final int zzd() {
        int iG = 0;
        for (int i8 = 0; i8 < this.f15178a.zzb(); i8++) {
            iG += g(this.f15178a.zzg(i8));
        }
        Iterator it = this.f15178a.zzc().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public final Object zzf(Ny0 ny0) {
        return this.f15178a.get(ny0);
    }

    public final Iterator zzg() {
        return this.f15180c ? new C4476tz0(this.f15178a.entrySet().iterator()) : this.f15178a.entrySet().iterator();
    }

    public final void zzh(Ny0 ny0, Object obj) {
        List arrayList;
        if (!((Wy0) ny0).f17086d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        h(ny0, obj);
        Object objZzf = zzf(ny0);
        if (objZzf == null) {
            arrayList = new ArrayList();
            this.f15178a.put(ny0, arrayList);
        } else {
            arrayList = (List) objZzf;
        }
        arrayList.add(obj);
    }

    public final void zzi() {
        if (this.f15179b) {
            return;
        }
        for (int i8 = 0; i8 < this.f15178a.zzb(); i8++) {
            Map.Entry entryZzg = this.f15178a.zzg(i8);
            if (entryZzg.getValue() instanceof Zy0) {
                ((Zy0) entryZzg.getValue()).w();
            }
        }
        this.f15178a.zza();
        this.f15179b = true;
    }

    public final void zzj(Oy0 oy0) {
        for (int i8 = 0; i8 < oy0.f15178a.zzb(); i8++) {
            d(oy0.f15178a.zzg(i8));
        }
        Iterator it = oy0.f15178a.zzc().iterator();
        while (it.hasNext()) {
            d((Map.Entry) it.next());
        }
    }

    public final void zzk(Ny0 ny0, Object obj) {
        if (!ny0.zzg()) {
            h(ny0, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                h(ny0, arrayList.get(i8));
            }
            obj = arrayList;
        }
        this.f15178a.put(ny0, obj);
    }

    public final boolean zzl() {
        for (int i8 = 0; i8 < this.f15178a.zzb(); i8++) {
            if (!e(this.f15178a.zzg(i8))) {
                return false;
            }
        }
        Iterator it = this.f15178a.zzc().iterator();
        while (it.hasNext()) {
            if (!e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private Oy0(boolean z8) {
        zzi();
        zzi();
    }
}
