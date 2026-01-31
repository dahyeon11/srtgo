package com.google.android.gms.common.api.internal;

import f2.C5392b;
import g2.C5539a;
import i2.AbstractC5670c;
import i2.C5652K;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1124w extends B {

    /* renamed from: b, reason: collision with root package name */
    private final Map f12105b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C f12106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1124w(C c9, Map<C5539a.f, C1121t> map) {
        super(c9, null);
        this.f12106c = c9;
        this.f12105b = map;
    }

    @Override // com.google.android.gms.common.api.internal.B
    public final void zaa() {
        C5652K c5652k = new C5652K(this.f12106c.f11875d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C5539a.f fVar : this.f12105b.keySet()) {
            if (!fVar.requiresGooglePlayServices() || ((C1121t) this.f12105b.get(fVar)).f12095c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int iZab = -1;
        int i8 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i8 < size) {
                iZab = c5652k.zab(this.f12106c.f11874c, (C5539a.f) arrayList.get(i8));
                i8++;
                if (iZab != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i8 < size2) {
                iZab = c5652k.zab(this.f12106c.f11874c, (C5539a.f) arrayList2.get(i8));
                i8++;
                if (iZab == 0) {
                    break;
                }
            }
        }
        if (iZab != 0) {
            C5392b c5392b = new C5392b(iZab, null);
            C c9 = this.f12106c;
            c9.f11872a.f(new C1122u(this, c9, c5392b));
            return;
        }
        C c10 = this.f12106c;
        if (c10.f11884m && c10.f11882k != null) {
            c10.f11882k.zab();
        }
        for (C5539a.f fVar2 : this.f12105b.keySet()) {
            AbstractC5670c.InterfaceC0311c interfaceC0311c = (AbstractC5670c.InterfaceC0311c) this.f12105b.get(fVar2);
            if (!fVar2.requiresGooglePlayServices() || c5652k.zab(this.f12106c.f11874c, fVar2) == 0) {
                fVar2.connect(interfaceC0311c);
            } else {
                C c11 = this.f12106c;
                c11.f11872a.f(new C1123v(this, c11, interfaceC0311c));
            }
        }
    }
}
