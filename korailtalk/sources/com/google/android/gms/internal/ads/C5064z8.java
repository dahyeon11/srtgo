package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.z8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5064z8 extends C3469l8 {
    public C5064z8() {
        throw null;
    }

    static List a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new Q7((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public C5064z8(InterfaceC4950y8 interfaceC4950y8, SSLSocketFactory sSLSocketFactory) {
    }
}
