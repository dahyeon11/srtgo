package u2;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import I2.C0609m;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1110h;
import f2.C5398h;
import g2.AbstractC5543e;
import g2.C5539a;
import g2.C5540b;
import h2.InterfaceC5593j;

/* loaded from: classes2.dex */
public final class p extends AbstractC5543e implements X1.b {

    /* renamed from: m, reason: collision with root package name */
    private static final C5539a.g f37112m;

    /* renamed from: n, reason: collision with root package name */
    private static final C5539a.AbstractC0301a f37113n;

    /* renamed from: o, reason: collision with root package name */
    private static final C5539a f37114o;

    /* renamed from: k, reason: collision with root package name */
    private final Context f37115k;

    /* renamed from: l, reason: collision with root package name */
    private final C5398h f37116l;

    static {
        C5539a.g gVar = new C5539a.g();
        f37112m = gVar;
        n nVar = new n();
        f37113n = nVar;
        f37114o = new C5539a("AppSet.API", nVar, gVar);
    }

    p(Context context, C5398h c5398h) {
        super(context, f37114o, C5539a.d.NO_OPTIONS, AbstractC5543e.a.DEFAULT_SETTINGS);
        this.f37115k = context;
        this.f37116l = c5398h;
    }

    @Override // X1.b
    public final AbstractC0608l getAppSetIdInfo() {
        return this.f37116l.isGooglePlayServicesAvailable(this.f37115k, 212800000) == 0 ? doRead(AbstractC1110h.builder().setFeatures(X1.h.zza).run(new InterfaceC5593j() { // from class: u2.m
            @Override // h2.InterfaceC5593j
            public final void accept(Object obj, Object obj2) {
                ((g) ((d) obj).getService()).zzc(new X1.d(null, null), new o(this.zza, (C0609m) obj2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(27601).build()) : AbstractC0611o.forException(new C5540b(new Status(17)));
    }
}
