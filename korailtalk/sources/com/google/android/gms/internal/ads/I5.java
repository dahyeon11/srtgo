package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
final class I5 {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f13399a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f13400b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f13401c;

    /* renamed from: d, reason: collision with root package name */
    private List f13402d;
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final O5 zzf;
    public final String zzg;
    public final String zzh;
    public final I5 zzi;

    private I5(String str, String str2, long j8, long j9, O5 o52, String[] strArr, String str3, String str4, I5 i52) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = o52;
        this.f13399a = strArr;
        this.zzc = str2 != null;
        this.zzd = j8;
        this.zze = j9;
        str3.getClass();
        this.zzg = str3;
        this.zzi = i52;
        this.f13400b = new HashMap();
        this.f13401c = new HashMap();
    }

    private static SpannableStringBuilder a(String str, Map map) {
        if (!map.containsKey(str)) {
            C4649vW c4649vW = new C4649vW();
            c4649vW.zzl(new SpannableStringBuilder());
            map.put(str, c4649vW);
        }
        CharSequence charSequenceZzq = ((C4649vW) map.get(str)).zzq();
        charSequenceZzq.getClass();
        return (SpannableStringBuilder) charSequenceZzq;
    }

    private final void b(TreeSet treeSet, boolean z8) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z8 || zEquals || (zEquals2 && this.zzh != null)) {
            long j8 = this.zzd;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
            long j9 = this.zze;
            if (j9 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j9));
            }
        }
        if (this.f13402d != null) {
            for (int i8 = 0; i8 < this.f13402d.size(); i8++) {
                I5 i52 = (I5) this.f13402d.get(i8);
                boolean z9 = true;
                if (!z8 && !zEquals) {
                    z9 = false;
                }
                i52.b(treeSet, z9);
            }
        }
    }

    private final void c(long j8, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j8) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i8 = 0; i8 < zza(); i8++) {
            zzd(i8).c(j8, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.I5.d(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    private final void e(long j8, boolean z8, String str, Map map) {
        this.f13400b.clear();
        this.f13401c.clear();
        if ("metadata".equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (this.zzc && z8) {
            SpannableStringBuilder spannableStringBuilderA = a(str, map);
            String str2 = this.zzb;
            str2.getClass();
            spannableStringBuilderA.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.zza) && z8) {
            a(str, map).append('\n');
            return;
        }
        if (zzg(j8)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map2 = this.f13400b;
                String str3 = (String) entry.getKey();
                CharSequence charSequenceZzq = ((C4649vW) entry.getValue()).zzq();
                charSequenceZzq.getClass();
                map2.put(str3, Integer.valueOf(charSequenceZzq.length()));
            }
            boolean zEquals = "p".equals(this.zza);
            for (int i8 = 0; i8 < zza(); i8++) {
                zzd(i8).e(j8, z8 || zEquals, str, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderA2 = a(str, map);
                int length = spannableStringBuilderA2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderA2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderA2.charAt(length) != '\n') {
                    spannableStringBuilderA2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                HashMap map3 = this.f13401c;
                String str4 = (String) entry2.getKey();
                CharSequence charSequenceZzq2 = ((C4649vW) entry2.getValue()).zzq();
                charSequenceZzq2.getClass();
                map3.put(str4, Integer.valueOf(charSequenceZzq2.length()));
            }
        }
    }

    public static I5 zzb(String str, long j8, long j9, O5 o52, String[] strArr, String str2, String str3, I5 i52) {
        return new I5(str, null, j8, j9, o52, strArr, str2, str3, i52);
    }

    public static I5 zzc(String str) {
        return new I5(null, str.replaceAll("\r\n", Q7.X.LF).replaceAll(" *\n *", Q7.X.LF).replaceAll(Q7.X.LF, Q7.X.SPACE).replaceAll("[ \t\\x0B\f\r]+", Q7.X.SPACE), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public final int zza() {
        List list = this.f13402d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final I5 zzd(int i8) {
        List list = this.f13402d;
        if (list != null) {
            return (I5) list.get(i8);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j8, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        c(j8, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        e(j8, false, this.zzg, treeMap);
        d(j8, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Pair pair = (Pair) arrayList.get(i8);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                M5 m52 = (M5) map2.get(pair.first);
                m52.getClass();
                C4649vW c4649vW = new C4649vW();
                c4649vW.zzc(bitmapDecodeByteArray);
                c4649vW.zzh(m52.zzb);
                c4649vW.zzi(0);
                c4649vW.zze(m52.zzc, 0);
                c4649vW.zzf(m52.zze);
                c4649vW.zzk(m52.zzf);
                c4649vW.zzd(m52.zzg);
                c4649vW.zzo(m52.zzj);
                arrayList2.add(c4649vW.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            M5 m53 = (M5) map2.get(entry.getKey());
            m53.getClass();
            C4649vW c4649vW2 = (C4649vW) entry.getValue();
            CharSequence charSequenceZzq = c4649vW2.zzq();
            charSequenceZzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzq;
            for (G5 g52 : (G5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), G5.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(g52), spannableStringBuilder.getSpanEnd(g52), (CharSequence) "");
            }
            int i9 = 0;
            while (i9 < spannableStringBuilder.length()) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    int i11 = i10;
                    while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                        i11++;
                    }
                    int i12 = i11 - i10;
                    if (i12 > 0) {
                        spannableStringBuilder.delete(i9, i12 + i9);
                    }
                }
                i9 = i10;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i13 = 0;
            while (i13 < spannableStringBuilder.length() - 1) {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i13) == '\n' && spannableStringBuilder.charAt(i14) == ' ') {
                    spannableStringBuilder.delete(i14, i13 + 2);
                }
                i13 = i14;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ' && spannableStringBuilder.charAt(i16) == '\n') {
                    spannableStringBuilder.delete(i15, i16);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c4649vW2.zze(m53.zzc, m53.zzd);
            c4649vW2.zzf(m53.zze);
            c4649vW2.zzh(m53.zzb);
            c4649vW2.zzk(m53.zzf);
            c4649vW2.zzn(m53.zzi, m53.zzh);
            c4649vW2.zzo(m53.zzj);
            arrayList2.add(c4649vW2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(I5 i52) {
        if (this.f13402d == null) {
            this.f13402d = new ArrayList();
        }
        this.f13402d.add(i52);
    }

    public final boolean zzg(long j8) {
        long j9 = this.zzd;
        if (j9 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j9 = -9223372036854775807L;
        }
        if (j9 <= j8 && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j9 != -9223372036854775807L || j8 >= this.zze) {
            return j9 <= j8 && j8 < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i8 = 0;
        b(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i8] = ((Long) it.next()).longValue();
            i8++;
        }
        return jArr;
    }
}
