package io.grpc;

import io.grpc.C5713a;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class C {
    public static final C5713a.c ATTR_AUTHORITY_OVERRIDE = C5713a.c.create("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a, reason: collision with root package name */
    private final List f31945a;

    /* renamed from: b, reason: collision with root package name */
    private final C5713a f31946b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31947c;

    public C(List<SocketAddress> list) {
        this(list, C5713a.EMPTY);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        if (this.f31945a.size() != c9.f31945a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.f31945a.size(); i8++) {
            if (!((SocketAddress) this.f31945a.get(i8)).equals(c9.f31945a.get(i8))) {
                return false;
            }
        }
        return this.f31946b.equals(c9.f31946b);
    }

    public List<SocketAddress> getAddresses() {
        return this.f31945a;
    }

    public C5713a getAttributes() {
        return this.f31946b;
    }

    public int hashCode() {
        return this.f31947c;
    }

    public String toString() {
        return "[" + this.f31945a + "/" + this.f31946b + "]";
    }

    public C(List<SocketAddress> list, C5713a c5713a) {
        e3.w.checkArgument(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f31945a = listUnmodifiableList;
        this.f31946b = (C5713a) e3.w.checkNotNull(c5713a, "attrs");
        this.f31947c = listUnmodifiableList.hashCode();
    }

    public C(SocketAddress socketAddress) {
        this(socketAddress, C5713a.EMPTY);
    }

    public C(SocketAddress socketAddress, C5713a c5713a) {
        this((List<SocketAddress>) Collections.singletonList(socketAddress), c5713a);
    }
}
