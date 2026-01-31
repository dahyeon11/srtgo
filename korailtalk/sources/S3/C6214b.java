package s3;

import android.content.Context;
import n3.e;
import n3.f;
import n3.o;
import s3.InterfaceC6215c;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6214b implements InterfaceC6215c {

    /* renamed from: a, reason: collision with root package name */
    private C6216d f36160a;

    private C6214b(Context context) {
        this.f36160a = C6216d.a(context);
    }

    static /* synthetic */ InterfaceC6215c a(f fVar) {
        return new C6214b((Context) fVar.get(Context.class));
    }

    public static e component() {
        return e.builder(InterfaceC6215c.class).add(o.required(Context.class)).factory(C6213a.f36159a).build();
    }

    @Override // s3.InterfaceC6215c
    public InterfaceC6215c.a getHeartBeatCode(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zC = this.f36160a.c(str, jCurrentTimeMillis);
        boolean zB = this.f36160a.b(jCurrentTimeMillis);
        return (zC && zB) ? InterfaceC6215c.a.COMBINED : zB ? InterfaceC6215c.a.GLOBAL : zC ? InterfaceC6215c.a.SDK : InterfaceC6215c.a.NONE;
    }
}
