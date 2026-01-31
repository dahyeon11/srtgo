package K1;

import com.google.android.gms.internal.ads.AbstractC4608v8;
import com.google.android.gms.internal.ads.C1203Bt;
import com.google.android.gms.internal.ads.C2554d8;
import com.google.android.gms.internal.ads.V7;
import com.google.android.gms.internal.ads.Z7;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class S extends Z7 {

    /* renamed from: m */
    private final C1203Bt f2794m;

    /* renamed from: n */
    private final L1.m f2795n;

    public S(String str, Map map, C1203Bt c1203Bt) throws IOException {
        super(0, str, new Q(c1203Bt));
        this.f2794m = c1203Bt;
        L1.m mVar = new L1.m(null);
        this.f2795n = mVar;
        mVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.Z7
    protected final C2554d8 a(V7 v72) {
        return C2554d8.zzb(v72, AbstractC4608v8.zzb(v72));
    }

    @Override // com.google.android.gms.internal.ads.Z7
    protected final /* bridge */ /* synthetic */ void c(Object obj) throws IOException {
        V7 v72 = (V7) obj;
        this.f2795n.zzf(v72.zzc, v72.zza);
        byte[] bArr = v72.zzb;
        if (L1.m.zzk() && bArr != null) {
            this.f2795n.zzh(bArr);
        }
        this.f2794m.zzc(v72);
    }
}
