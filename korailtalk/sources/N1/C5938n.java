package n1;

import o3.InterfaceC6036d;
import o3.InterfaceC6037e;

/* renamed from: n1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5938n implements InterfaceC6036d {
    @Override // o3.InterfaceC6036d, o3.InterfaceC6034b
    public void encode(Object obj, Object obj2) {
        C5930f c5930f = (C5930f) obj;
        InterfaceC6037e interfaceC6037e = (InterfaceC6037e) obj2;
        if (c5930f.zzc() != null) {
            interfaceC6037e.add("clientType", c5930f.zzc().name());
        }
        if (c5930f.zzb() != null) {
            interfaceC6037e.add("androidClientInfo", c5930f.zzb());
        }
    }
}
