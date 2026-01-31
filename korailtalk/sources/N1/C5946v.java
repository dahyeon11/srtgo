package n1;

import o3.InterfaceC6036d;
import o3.InterfaceC6037e;

/* renamed from: n1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5946v implements InterfaceC6036d {
    @Override // o3.InterfaceC6036d, o3.InterfaceC6034b
    public void encode(Object obj, Object obj2) {
        C5934j c5934j = (C5934j) obj;
        InterfaceC6037e interfaceC6037e = (InterfaceC6037e) obj2;
        if (c5934j.zzb() != null) {
            interfaceC6037e.add("mobileSubtype", c5934j.zzb().name());
        }
        if (c5934j.zzc() != null) {
            interfaceC6037e.add("networkType", c5934j.zzc().name());
        }
    }
}
