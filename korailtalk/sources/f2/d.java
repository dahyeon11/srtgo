package F2;

import com.google.android.gms.common.api.Scope;
import com.kakao.sdk.user.Constants;
import g2.C5539a;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a */
    static final C5539a.AbstractC0301a f1131a;
    public static final C5539a.g zaa;
    public static final C5539a.g zab;
    public static final C5539a.AbstractC0301a zac;
    public static final Scope zae;
    public static final Scope zaf;
    public static final C5539a zag;
    public static final C5539a zah;

    static {
        C5539a.g gVar = new C5539a.g();
        zaa = gVar;
        C5539a.g gVar2 = new C5539a.g();
        zab = gVar2;
        b bVar = new b();
        zac = bVar;
        c cVar = new c();
        f1131a = cVar;
        zae = new Scope(Constants.PROFILE);
        zaf = new Scope("email");
        zag = new C5539a("SignIn.API", bVar, gVar);
        zah = new C5539a("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
