package n1;

import o3.InterfaceC6036d;
import o3.InterfaceC6037e;

/* renamed from: n1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5941q implements InterfaceC6036d {
    @Override // o3.InterfaceC6036d, o3.InterfaceC6034b
    public void encode(Object obj, Object obj2) {
        C5931g c5931g = (C5931g) obj;
        InterfaceC6037e interfaceC6037e = (InterfaceC6037e) obj2;
        interfaceC6037e.add("eventTimeMs", c5931g.zza()).add("eventUptimeMs", c5931g.zzb()).add("timezoneOffsetSeconds", c5931g.zzc());
        if (c5931g.zzf() != null) {
            interfaceC6037e.add("sourceExtension", c5931g.zzf());
        }
        if (c5931g.zzg() != null) {
            interfaceC6037e.add("sourceExtensionJsonProto3", c5931g.zzg());
        }
        if (c5931g.zzd() != Integer.MIN_VALUE) {
            interfaceC6037e.add("eventCode", c5931g.zzd());
        }
        if (c5931g.zze() != null) {
            interfaceC6037e.add("networkConnectionInfo", c5931g.zze());
        }
    }
}
