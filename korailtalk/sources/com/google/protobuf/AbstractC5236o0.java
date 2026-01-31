package com.google.protobuf;

import java.nio.Buffer;

/* renamed from: com.google.protobuf.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5236o0 {
    static void a(Buffer buffer) {
        buffer.clear();
    }

    static void b(Buffer buffer) {
        buffer.flip();
    }

    static void c(Buffer buffer, int i8) {
        buffer.limit(i8);
    }

    static void d(Buffer buffer) {
        buffer.mark();
    }

    static void e(Buffer buffer, int i8) {
        buffer.position(i8);
    }

    static void f(Buffer buffer) {
        buffer.reset();
    }
}
