package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.Ad, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1134Ad {

    /* renamed from: a, reason: collision with root package name */
    private final int f12200a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4887xd f12201b = new C1216Cd();

    public C1134Ad(int i8) {
        this.f12200a = i8;
    }

    public final String zza(ArrayList arrayList) throws IOException {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            sb.append(((String) arrayList.get(i8)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split(Q7.X.LF);
        if (strArrSplit.length == 0) {
            return "";
        }
        C5115zd c5115zd = new C5115zd();
        PriorityQueue priorityQueue = new PriorityQueue(this.f12200a, new C5001yd(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = AbstractC1175Bd.zzb(str, false);
            if (strArrZzb.length != 0) {
                AbstractC1298Ed.zzc(strArrZzb, this.f12200a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                c5115zd.f24190b.write(this.f12201b.zzb(((C1257Dd) it.next()).f12697b));
            } catch (IOException e8) {
                L1.n.zzh("Error while writing hash to byteStream", e8);
            }
        }
        return c5115zd.toString();
    }
}
