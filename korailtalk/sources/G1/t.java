package G1;

import H1.C0545j0;
import H1.C0591z;
import H1.G;
import H1.InterfaceC0521b0;
import H1.InterfaceC0533f0;
import H1.InterfaceC0554m0;
import H1.J;
import H1.L0;
import H1.M;
import H1.R1;
import H1.S0;
import H1.V0;
import H1.W;
import H1.Y1;
import H1.Z0;
import H1.d2;
import H1.j2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC2501ci;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.C2487cb;
import com.google.android.gms.internal.ads.C2602db;
import com.google.android.gms.internal.ads.InterfaceC1756Ph;
import com.google.android.gms.internal.ads.InterfaceC1871Sd;
import com.google.android.gms.internal.ads.InterfaceC2403bq;
import com.google.android.gms.internal.ads.InterfaceC2746eq;
import com.google.android.gms.internal.ads.InterfaceC4801wr;
import i2.AbstractC5683p;
import java.util.Map;
import java.util.concurrent.Future;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class t extends W {

    /* renamed from: a, reason: collision with root package name */
    private final L1.a f1423a;

    /* renamed from: b, reason: collision with root package name */
    private final d2 f1424b;

    /* renamed from: c, reason: collision with root package name */
    private final Future f1425c = AbstractC4805wt.zza.zzb(new p(this));

    /* renamed from: d, reason: collision with root package name */
    private final Context f1426d;

    /* renamed from: e, reason: collision with root package name */
    private final s f1427e;

    /* renamed from: f, reason: collision with root package name */
    private WebView f1428f;

    /* renamed from: g, reason: collision with root package name */
    private J f1429g;

    /* renamed from: h, reason: collision with root package name */
    private C2487cb f1430h;

    /* renamed from: i, reason: collision with root package name */
    private AsyncTask f1431i;

    public t(Context context, d2 d2Var, String str, L1.a aVar) {
        this.f1426d = context;
        this.f1423a = aVar;
        this.f1424b = d2Var;
        this.f1428f = new WebView(context);
        this.f1427e = new s(context, str);
        b(0);
        this.f1428f.setVerticalScrollBarEnabled(false);
        this.f1428f.getSettings().setJavaScriptEnabled(true);
        this.f1428f.setWebViewClient(new n(this));
        this.f1428f.setOnTouchListener(new o(this));
    }

    static /* bridge */ /* synthetic */ String h(t tVar, String str) {
        if (tVar.f1430h == null) {
            return str;
        }
        Uri uriZza = Uri.parse(str);
        try {
            uriZza = tVar.f1430h.zza(uriZza, tVar.f1426d, null, null);
        } catch (C2602db e8) {
            L1.n.zzk("Unable to process ad data", e8);
        }
        return uriZza.toString();
    }

    static /* bridge */ /* synthetic */ void k(t tVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        tVar.f1426d.startActivity(intent);
    }

    final void b(int i8) {
        if (this.f1428f == null) {
            return;
        }
        this.f1428f.setLayoutParams(new ViewGroup.LayoutParams(-1, i8));
    }

    @Override // H1.W, H1.X
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzB() {
        AbstractC5683p.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // H1.W, H1.X
    public final void zzC(G g8) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzD(J j8) {
        this.f1429g = j8;
    }

    @Override // H1.W, H1.X
    public final void zzE(InterfaceC0521b0 interfaceC0521b0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzF(d2 d2Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // H1.W, H1.X
    public final void zzG(InterfaceC0533f0 interfaceC0533f0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzH(InterfaceC1871Sd interfaceC1871Sd) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzI(j2 j2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzK(Z0 z02) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzL(boolean z8) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzM(InterfaceC2403bq interfaceC2403bq) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzO(InterfaceC1756Ph interfaceC1756Ph) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzQ(InterfaceC2746eq interfaceC2746eq, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzS(InterfaceC4801wr interfaceC4801wr) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzU(R1 r12) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final boolean zzY() {
        return false;
    }

    @Override // H1.W, H1.X
    public final boolean zzZ() {
        return false;
    }

    @Override // H1.W, H1.X
    public final boolean zzaa() {
        return false;
    }

    @Override // H1.W, H1.X
    public final boolean zzab(Y1 y12) {
        AbstractC5683p.checkNotNull(this.f1428f, "This Search Ad has already been torn down");
        this.f1427e.zzf(y12, this.f1423a);
        this.f1431i = new r(this, null).execute(new Void[0]);
        return true;
    }

    @Override // H1.W, H1.X
    public final void zzac(C0545j0 c0545j0) {
        throw new IllegalStateException("Unused method");
    }

    final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C0591z.zzb();
            return L1.g.zzy(this.f1426d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // H1.W, H1.X
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // H1.W, H1.X
    public final d2 zzg() {
        return this.f1424b;
    }

    @Override // H1.W, H1.X
    public final J zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // H1.W, H1.X
    public final InterfaceC0533f0 zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // H1.W, H1.X
    public final S0 zzk() {
        return null;
    }

    @Override // H1.W, H1.X
    public final V0 zzl() {
        return null;
    }

    @Override // H1.W, H1.X
    public final InterfaceC6172a zzn() {
        AbstractC5683p.checkMainThread("getAdFrame must be called on the main UI thread.");
        return r2.b.wrap(this.f1428f);
    }

    final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(r4.g.SECURE_PROTOCOL).appendEncodedPath((String) AbstractC2501ci.zzd.zze());
        builder.appendQueryParameter("query", this.f1427e.zzd());
        builder.appendQueryParameter("pubId", this.f1427e.zzc());
        builder.appendQueryParameter("mappver", this.f1427e.zza());
        Map mapZze = this.f1427e.zze();
        for (String str : mapZze.keySet()) {
            builder.appendQueryParameter(str, (String) mapZze.get(str));
        }
        Uri uriBuild = builder.build();
        C2487cb c2487cb = this.f1430h;
        if (c2487cb != null) {
            try {
                uriBuild = c2487cb.zzb(uriBuild, this.f1426d);
            } catch (C2602db e8) {
                L1.n.zzk("Unable to process ad data", e8);
            }
        }
        return zzq() + "#" + uriBuild.getEncodedQuery();
    }

    final String zzq() {
        String strZzb = this.f1427e.zzb();
        if (true == TextUtils.isEmpty(strZzb)) {
            strZzb = "www.google.com";
        }
        return r4.g.SECURE_PROTOCOL + strZzb + ((String) AbstractC2501ci.zzd.zze());
    }

    @Override // H1.W, H1.X
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // H1.W, H1.X
    public final String zzs() {
        return null;
    }

    @Override // H1.W, H1.X
    public final String zzt() {
        return null;
    }

    @Override // H1.W, H1.X
    public final void zzx() {
        AbstractC5683p.checkMainThread("destroy must be called on the main UI thread.");
        this.f1431i.cancel(true);
        this.f1425c.cancel(false);
        this.f1428f.destroy();
        this.f1428f = null;
    }

    @Override // H1.W, H1.X
    public final void zzz() {
        AbstractC5683p.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // H1.W, H1.X
    public final void zzJ(InterfaceC0554m0 interfaceC0554m0) {
    }

    @Override // H1.W, H1.X
    public final void zzN(boolean z8) {
    }

    @Override // H1.W, H1.X
    public final void zzP(L0 l02) {
    }

    @Override // H1.W, H1.X
    public final void zzW(InterfaceC6172a interfaceC6172a) {
    }

    @Override // H1.W, H1.X
    public final void zzy(Y1 y12, M m8) {
    }
}
