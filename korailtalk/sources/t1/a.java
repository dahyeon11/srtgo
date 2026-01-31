package T1;

import H1.C;
import H1.C0525c1;
import H1.C0572s1;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.AbstractC3872oi;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C3318jq;
import i2.AbstractC5683p;
import y1.C6527h;
import y1.EnumC6522c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final C0572s1 f4849a;

    public a(C0572s1 c0572s1) {
        this.f4849a = c0572s1;
    }

    private static void a(final Context context, final EnumC6522c enumC6522c, final C6527h c6527h, final String str, final b bVar) {
        AbstractC4439th.zza(context);
        if (((Boolean) AbstractC3872oi.zzk.zze()).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzlg)).booleanValue()) {
                L1.c.zzb.execute(new Runnable() { // from class: T1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6527h c6527h2 = c6527h;
                        C0525c1 c0525c1Zza = c6527h2 == null ? null : c6527h2.zza();
                        new C3318jq(context, enumC6522c, c0525c1Zza, str).zzb(bVar);
                    }
                });
                return;
            }
        }
        new C3318jq(context, enumC6522c, c6527h == null ? null : c6527h.zza(), str).zzb(bVar);
    }

    public static void generate(Context context, EnumC6522c enumC6522c, C6527h c6527h, b bVar) {
        a(context, enumC6522c, c6527h, null, bVar);
    }

    public String getQuery() {
        return this.f4849a.zzb();
    }

    public Bundle getQueryBundle() {
        return this.f4849a.zza();
    }

    public String getRequestId() {
        return this.f4849a.zzc();
    }

    public static void generate(Context context, EnumC6522c enumC6522c, C6527h c6527h, String str, b bVar) {
        AbstractC5683p.checkNotNull(str, "AdUnitId cannot be null.");
        a(context, enumC6522c, c6527h, str, bVar);
    }
}
