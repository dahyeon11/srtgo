package k2;

import I2.AbstractC0608l;
import I2.C0609m;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC1110h;
import g2.AbstractC5543e;
import g2.C5539a;
import h2.InterfaceC5593j;
import i2.C5687t;
import i2.C5690w;
import i2.InterfaceC5689v;
import x2.AbstractC6487d;

/* loaded from: classes.dex */
public final class p extends AbstractC5543e implements InterfaceC5689v {

    /* renamed from: k, reason: collision with root package name */
    private static final C5539a.g f33563k;

    /* renamed from: l, reason: collision with root package name */
    private static final C5539a.AbstractC0301a f33564l;

    /* renamed from: m, reason: collision with root package name */
    private static final C5539a f33565m;
    public static final /* synthetic */ int zab = 0;

    static {
        C5539a.g gVar = new C5539a.g();
        f33563k = gVar;
        o oVar = new o();
        f33564l = oVar;
        f33565m = new C5539a("ClientTelemetry.API", oVar, gVar);
    }

    public p(Context context, C5690w c5690w) {
        super(context, f33565m, c5690w, AbstractC5543e.a.DEFAULT_SETTINGS);
    }

    @Override // i2.InterfaceC5689v
    public final AbstractC0608l log(final C5687t c5687t) {
        AbstractC1110h.a aVarBuilder = AbstractC1110h.builder();
        aVarBuilder.setFeatures(AbstractC6487d.zaa);
        aVarBuilder.setAutoResolveMissingFeatures(false);
        aVarBuilder.run(new InterfaceC5593j() { // from class: k2.n
            @Override // h2.InterfaceC5593j
            public final void accept(Object obj, Object obj2) {
                C5687t c5687t2 = c5687t;
                int i8 = p.zab;
                ((C5855j) ((q) obj).getService()).zae(c5687t2);
                ((C0609m) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(aVarBuilder.build());
    }
}
