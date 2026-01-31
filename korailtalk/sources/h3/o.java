package h3;

import java.nio.Buffer;

/* loaded from: classes2.dex */
abstract class o {
    static void a(Buffer buffer) {
        buffer.clear();
    }

    static void b(Buffer buffer) {
        buffer.flip();
    }

    static void c(Buffer buffer, int i8) {
        buffer.limit(i8);
    }

    static void d(Buffer buffer, int i8) {
        buffer.position(i8);
    }
}
