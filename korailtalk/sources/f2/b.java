package F2;

import android.content.Context;
import android.os.Looper;
import g2.AbstractC5544f;
import g2.C5539a;
import i2.C5671d;

/* loaded from: classes2.dex */
final class b extends C5539a.AbstractC0301a {
    b() {
    }

    @Override // g2.C5539a.AbstractC0301a
    public final /* bridge */ /* synthetic */ C5539a.f buildClient(Context context, Looper looper, C5671d c5671d, Object obj, AbstractC5544f.b bVar, AbstractC5544f.c cVar) {
        return new G2.a(context, looper, true, c5671d, G2.a.createBundleFromClientSettings(c5671d), bVar, cVar);
    }
}
