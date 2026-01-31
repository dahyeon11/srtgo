package io.grpc;

import io.grpc.InterfaceC5796o;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: io.grpc.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5808z {

    /* renamed from: c, reason: collision with root package name */
    static final e3.o f33390c = e3.o.on(',');

    /* renamed from: d, reason: collision with root package name */
    private static final C5808z f33391d = emptyInstance().with(new InterfaceC5796o.a(), true).with(InterfaceC5796o.b.NONE, false);

    /* renamed from: a, reason: collision with root package name */
    private final Map f33392a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f33393b;

    /* renamed from: io.grpc.z$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5807y f33394a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f33395b;

        a(InterfaceC5807y interfaceC5807y, boolean z8) {
            this.f33394a = (InterfaceC5807y) e3.w.checkNotNull(interfaceC5807y, "decompressor");
            this.f33395b = z8;
        }
    }

    private C5808z(InterfaceC5807y interfaceC5807y, boolean z8, C5808z c5808z) {
        String messageEncoding = interfaceC5807y.getMessageEncoding();
        e3.w.checkArgument(!messageEncoding.contains(","), "Comma is currently not allowed in message encoding");
        int size = c5808z.f33392a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c5808z.f33392a.containsKey(interfaceC5807y.getMessageEncoding()) ? size : size + 1);
        for (a aVar : c5808z.f33392a.values()) {
            String messageEncoding2 = aVar.f33394a.getMessageEncoding();
            if (!messageEncoding2.equals(messageEncoding)) {
                linkedHashMap.put(messageEncoding2, new a(aVar.f33394a, aVar.f33395b));
            }
        }
        linkedHashMap.put(messageEncoding, new a(interfaceC5807y, z8));
        this.f33392a = Collections.unmodifiableMap(linkedHashMap);
        this.f33393b = f33390c.join(getAdvertisedMessageEncodings()).getBytes(Charset.forName("US-ASCII"));
    }

    public static C5808z emptyInstance() {
        return new C5808z();
    }

    public static C5808z getDefaultInstance() {
        return f33391d;
    }

    byte[] a() {
        return this.f33393b;
    }

    public Set<String> getAdvertisedMessageEncodings() {
        HashSet hashSet = new HashSet(this.f33392a.size());
        for (Map.Entry entry : this.f33392a.entrySet()) {
            if (((a) entry.getValue()).f33395b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public Set<String> getKnownMessageEncodings() {
        return this.f33392a.keySet();
    }

    public InterfaceC5807y lookupDecompressor(String str) {
        a aVar = (a) this.f33392a.get(str);
        if (aVar != null) {
            return aVar.f33394a;
        }
        return null;
    }

    public C5808z with(InterfaceC5807y interfaceC5807y, boolean z8) {
        return new C5808z(interfaceC5807y, z8, this);
    }

    private C5808z() {
        this.f33392a = new LinkedHashMap(0);
        this.f33393b = new byte[0];
    }
}
