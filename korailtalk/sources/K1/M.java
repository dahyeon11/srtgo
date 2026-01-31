package K1;

import com.google.android.gms.internal.ads.D8;
import com.google.android.gms.internal.ads.InterfaceC2325b8;
import com.google.android.gms.internal.ads.InterfaceC2439c8;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
final class M extends D8 {

    /* renamed from: o */
    final /* synthetic */ byte[] f2790o;

    /* renamed from: p */
    final /* synthetic */ Map f2791p;

    /* renamed from: q */
    final /* synthetic */ L1.m f2792q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(T t8, int i8, String str, InterfaceC2439c8 interfaceC2439c8, InterfaceC2325b8 interfaceC2325b8, byte[] bArr, Map map, L1.m mVar) {
        super(i8, str, interfaceC2439c8, interfaceC2325b8);
        this.f2790o = bArr;
        this.f2791p = map;
        this.f2792q = mVar;
    }

    @Override // com.google.android.gms.internal.ads.D8, com.google.android.gms.internal.ads.Z7
    protected final /* bridge */ /* synthetic */ void c(Object obj) {
        c((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.D8
    /* renamed from: i */
    public final void c(String str) throws IOException {
        this.f2792q.zzg(str);
        super.c(str);
    }

    @Override // com.google.android.gms.internal.ads.Z7
    public final Map zzl() {
        Map map = this.f2791p;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.Z7
    public final byte[] zzx() {
        byte[] bArr = this.f2790o;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
