package n1;

import com.kakao.sdk.common.Constants;
import n4.C5950a;
import o3.InterfaceC6036d;
import o3.InterfaceC6037e;

/* renamed from: n1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5927c implements InterfaceC6036d {
    @Override // o3.InterfaceC6036d, o3.InterfaceC6034b
    public void encode(Object obj, Object obj2) {
        C5928d c5928d = (C5928d) obj;
        InterfaceC6037e interfaceC6037e = (InterfaceC6037e) obj2;
        if (c5928d.zzi() != Integer.MIN_VALUE) {
            interfaceC6037e.add("sdkVersion", c5928d.zzi());
        }
        if (c5928d.zzf() != null) {
            interfaceC6037e.add("model", c5928d.zzf());
        }
        if (c5928d.zzd() != null) {
            interfaceC6037e.add("hardware", c5928d.zzd());
        }
        if (c5928d.zzb() != null) {
            interfaceC6037e.add(Constants.DEVICE, c5928d.zzb());
        }
        if (c5928d.zzh() != null) {
            interfaceC6037e.add(C5950a.FLAVOR, c5928d.zzh());
        }
        if (c5928d.zzg() != null) {
            interfaceC6037e.add("osBuild", c5928d.zzg());
        }
        if (c5928d.zze() != null) {
            interfaceC6037e.add("manufacturer", c5928d.zze());
        }
        if (c5928d.zzc() != null) {
            interfaceC6037e.add("fingerprint", c5928d.zzc());
        }
    }
}
