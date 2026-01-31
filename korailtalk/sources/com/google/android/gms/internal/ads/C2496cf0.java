package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2496cf0 implements InterfaceC2161Ze0 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f18338a = new int[2];

    @Override // com.google.android.gms.internal.ads.InterfaceC2161Ze0
    public final JSONObject zza(View view) {
        if (view == null) {
            return AbstractC3297jf0.zza(0, 0, 0, 0);
        }
        int[] iArr = this.f18338a;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.f18338a;
        return AbstractC3297jf0.zza(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161Ze0
    public final void zzb(View view, JSONObject jSONObject, InterfaceC2120Ye0 interfaceC2120Ye0, boolean z8, boolean z9) {
        int i8;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z8) {
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    interfaceC2120Ye0.zza(viewGroup.getChildAt(i9), this, jSONObject, z9);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i11));
                int size2 = arrayList3.size();
                int i12 = 0;
                while (true) {
                    i8 = i11 + 1;
                    if (i12 < size2) {
                        interfaceC2120Ye0.zza((View) arrayList3.get(i12), this, jSONObject, z9);
                        i12++;
                    }
                }
                i11 = i8;
            }
        }
    }
}
