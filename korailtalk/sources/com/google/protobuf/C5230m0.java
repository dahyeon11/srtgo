package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5230m0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private K0 f26576a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f26577b;

    /* renamed from: com.google.protobuf.m0$a */
    public static class a extends C5230m0 {
        public a(String str) {
            super(str);
        }
    }

    public C5230m0(String str) {
        super(str);
        this.f26576a = null;
    }

    static C5230m0 a() {
        return new C5230m0("Protocol message end-group tag did not match expected tag.");
    }

    static C5230m0 b() {
        return new C5230m0("Protocol message contained an invalid tag (zero).");
    }

    static C5230m0 c() {
        return new C5230m0("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C5230m0 e() {
        return new C5230m0("CodedInputStream encountered a malformed varint.");
    }

    static C5230m0 f() {
        return new C5230m0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C5230m0 g() {
        return new C5230m0("Failed to parse the message.");
    }

    static C5230m0 h() {
        return new C5230m0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static C5230m0 j() {
        return new C5230m0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C5230m0 k() {
        return new C5230m0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public K0 getUnfinishedMessage() {
        return this.f26576a;
    }

    void i() {
        this.f26577b = true;
    }

    public C5230m0 setUnfinishedMessage(K0 k02) {
        this.f26576a = k02;
        return this;
    }

    public IOException unwrapIOException() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public C5230m0(Exception exc) {
        super(exc.getMessage(), exc);
        this.f26576a = null;
    }

    public C5230m0(String str, Exception exc) {
        super(str, exc);
        this.f26576a = null;
    }

    public C5230m0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f26576a = null;
    }

    public C5230m0(String str, IOException iOException) {
        super(str, iOException);
        this.f26576a = null;
    }
}
