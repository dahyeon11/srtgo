package R1;

import H1.C0591z;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.AbstractC1483In0;
import com.google.android.gms.internal.ads.C2519cr;
import com.google.android.gms.internal.ads.C4304sT;
import com.google.android.gms.internal.ads.InterfaceC3997pn0;
import com.google.android.gms.internal.ads.ZT;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* renamed from: R1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744x implements InterfaceC3997pn0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4421a;

    /* renamed from: b, reason: collision with root package name */
    private final C4304sT f4422b;

    public C0744x(Executor executor, C4304sT c4304sT) {
        this.f4421a = executor;
        this.f4422b = c4304sT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.C zza(Object obj) {
        final C2519cr c2519cr = (C2519cr) obj;
        return AbstractC1483In0.zzn(this.f4422b.zzc(c2519cr), new InterfaceC3997pn0() { // from class: R1.w
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj2) {
                ZT zt = (ZT) obj2;
                C0746z c0746z = new C0746z(new JsonReader(new InputStreamReader(zt.zzb())), zt.zza());
                try {
                    c0746z.zzb = C0591z.zzb().zzi(c2519cr.zza).toString();
                } catch (JSONException unused) {
                    c0746z.zzb = "{}";
                }
                return AbstractC1483In0.zzh(c0746z);
            }
        }, this.f4421a);
    }
}
