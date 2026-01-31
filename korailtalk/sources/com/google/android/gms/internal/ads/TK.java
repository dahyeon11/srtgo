package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class TK implements InterfaceC2335bD {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16437a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f16438b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f16439c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f16440d;

    /* renamed from: e, reason: collision with root package name */
    private final C2696eM f16441e;

    TK(Map map, Map map2, Map map3, XD0 xd0, C2696eM c2696eM) {
        this.f16437a = map;
        this.f16438b = map2;
        this.f16439c = map3;
        this.f16440d = xd0;
        this.f16441e = c2696eM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2335bD
    public final InterfaceC3171iX zza(int i8, String str) {
        InterfaceC3171iX interfaceC3171iXZza;
        InterfaceC3171iX interfaceC3171iX = (InterfaceC3171iX) this.f16437a.get(str);
        if (interfaceC3171iX != null) {
            return interfaceC3171iX;
        }
        if (i8 != 1) {
            if (i8 != 4) {
                return null;
            }
            InterfaceC4993yY interfaceC4993yY = (InterfaceC4993yY) this.f16439c.get(str);
            if (interfaceC4993yY != null) {
                return new C3283jX(interfaceC4993yY, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.dD
                    @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
                    public final Object apply(Object obj) {
                        return new C2908gD((List) obj);
                    }
                });
            }
            interfaceC3171iXZza = (InterfaceC3171iX) this.f16438b.get(str);
            if (interfaceC3171iXZza == null) {
                return null;
            }
        } else if (this.f16441e.zze() == null || (interfaceC3171iXZza = ((InterfaceC2335bD) this.f16440d.zzb()).zza(i8, str)) == null) {
            return null;
        }
        return new C3283jX(interfaceC3171iXZza, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.eD
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return new C2908gD((YC) obj);
            }
        });
    }
}
