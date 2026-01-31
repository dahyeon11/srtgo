package io.grpc;

import io.grpc.InterfaceC5796o;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: io.grpc.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5801s {

    /* renamed from: b, reason: collision with root package name */
    private static final C5801s f33287b = new C5801s(new InterfaceC5796o.a(), InterfaceC5796o.b.NONE);

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f33288a = new ConcurrentHashMap();

    C5801s(r... rVarArr) {
        for (r rVar : rVarArr) {
            this.f33288a.put(rVar.getMessageEncoding(), rVar);
        }
    }

    public static C5801s getDefaultInstance() {
        return f33287b;
    }

    public static C5801s newEmptyInstance() {
        return new C5801s(new r[0]);
    }

    public r lookupCompressor(String str) {
        return (r) this.f33288a.get(str);
    }

    public void register(r rVar) {
        String messageEncoding = rVar.getMessageEncoding();
        e3.w.checkArgument(!messageEncoding.contains(","), "Comma is currently not allowed in message encoding");
        this.f33288a.put(messageEncoding, rVar);
    }
}
