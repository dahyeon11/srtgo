package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2382bf0 implements InterfaceC2161Ze0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2161Ze0 f18166a;

    public C2382bf0(InterfaceC2161Ze0 interfaceC2161Ze0) {
        this.f18166a = interfaceC2161Ze0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161Ze0
    public final JSONObject zza(View view) throws JSONException {
        JSONObject jSONObjectZza = AbstractC3297jf0.zza(0, 0, 0, 0);
        int iZzb = AbstractC3753nf0.zzb();
        int i8 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZza.put("noOutputDevice", i8 == 0);
        } catch (JSONException e8) {
            AbstractC3411kf0.zza("Error with setting output device status", e8);
        }
        return jSONObjectZza;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161Ze0
    public final void zzb(View view, JSONObject jSONObject, InterfaceC2120Ye0 interfaceC2120Ye0, boolean z8, boolean z9) {
        ArrayList arrayList = new ArrayList();
        C1751Pe0 c1751Pe0Zza = C1751Pe0.zza();
        if (c1751Pe0Zza != null) {
            Collection collectionZzb = c1751Pe0Zza.zzb();
            int size = collectionZzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzb.iterator();
            while (it.hasNext()) {
                View viewZzf = ((C4890xe0) it.next()).zzf();
                if (viewZzf != null && viewZzf.isAttachedToWindow() && viewZzf.isShown()) {
                    View view2 = viewZzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z10 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i8 = size2 - 1;
                                    if (((View) arrayList.get(i8)).getZ() <= z10) {
                                        break;
                                    } else {
                                        size2 = i8;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            interfaceC2120Ye0.zza((View) arrayList.get(i9), this.f18166a, jSONObject, z9);
        }
    }
}
