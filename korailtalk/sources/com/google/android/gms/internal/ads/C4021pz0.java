package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.pz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4021pz0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private Pz0 f21831a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21832b;

    public C4021pz0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f21831a = null;
    }

    static C3907oz0 a() {
        return new C3907oz0("Protocol message tag had invalid wire type.");
    }

    static C4021pz0 b() {
        return new C4021pz0("Protocol message end-group tag did not match expected tag.");
    }

    static C4021pz0 c() {
        return new C4021pz0("Protocol message contained an invalid tag (zero).");
    }

    static C4021pz0 d() {
        return new C4021pz0("Protocol message had invalid UTF-8.");
    }

    static C4021pz0 e() {
        return new C4021pz0("CodedInputStream encountered a malformed varint.");
    }

    static C4021pz0 f() {
        return new C4021pz0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C4021pz0 g() {
        return new C4021pz0("Failed to parse the message.");
    }

    static C4021pz0 h() {
        return new C4021pz0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C4021pz0 i() {
        return new C4021pz0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    final void j() {
        this.f21832b = true;
    }

    final boolean k() {
        return this.f21832b;
    }

    public final C4021pz0 zzh(Pz0 pz0) {
        this.f21831a = pz0;
        return this;
    }

    public C4021pz0(String str) {
        super(str);
        this.f21831a = null;
    }
}
