package androidx.room;

import java.io.File;
import z0.InterfaceC6611c;

/* loaded from: classes.dex */
class l implements InterfaceC6611c.InterfaceC0437c {

    /* renamed from: a, reason: collision with root package name */
    private final String f10752a;

    /* renamed from: b, reason: collision with root package name */
    private final File f10753b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6611c.InterfaceC0437c f10754c;

    l(String str, File file, InterfaceC6611c.InterfaceC0437c interfaceC0437c) {
        this.f10752a = str;
        this.f10753b = file;
        this.f10754c = interfaceC0437c;
    }

    @Override // z0.InterfaceC6611c.InterfaceC0437c
    public InterfaceC6611c create(InterfaceC6611c.b bVar) {
        return new k(bVar.context, this.f10752a, this.f10753b, bVar.callback.version, this.f10754c.create(bVar));
    }
}
