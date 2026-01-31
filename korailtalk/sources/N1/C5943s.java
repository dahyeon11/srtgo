package n1;

import o3.C6035c;
import o3.InterfaceC6036d;
import o3.InterfaceC6037e;

/* renamed from: n1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5943s implements InterfaceC6036d {
    @Override // o3.InterfaceC6036d, o3.InterfaceC6034b
    public void encode(Object obj, Object obj2) throws C6035c {
        C5932h c5932h = (C5932h) obj;
        InterfaceC6037e interfaceC6037e = (InterfaceC6037e) obj2;
        interfaceC6037e.add("requestTimeMs", c5932h.zzf()).add("requestUptimeMs", c5932h.zzg());
        if (c5932h.zzb() != null) {
            interfaceC6037e.add("clientInfo", c5932h.zzb());
        }
        if (c5932h.zze() != null) {
            interfaceC6037e.add("logSourceName", c5932h.zze());
        } else {
            if (c5932h.zzd() == Integer.MIN_VALUE) {
                throw new C6035c("Log request must have either LogSourceName or LogSource");
            }
            interfaceC6037e.add("logSource", c5932h.zzd());
        }
        if (c5932h.zzc().isEmpty()) {
            return;
        }
        interfaceC6037e.add("logEvent", c5932h.zzc());
    }
}
