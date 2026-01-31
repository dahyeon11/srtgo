package org.tensorflow.lite;

import java.nio.ByteBuffer;
import org.tensorflow.lite.h;

/* loaded from: classes3.dex */
final class NativeInterpreterWrapperExperimental extends NativeInterpreterWrapper {
    NativeInterpreterWrapperExperimental(String str, h.a aVar) {
        super(str, aVar);
    }

    private static native void resetVariableTensors(long j8, long j9);

    void q() {
        resetVariableTensors(this.f34501b, this.f34500a);
    }

    NativeInterpreterWrapperExperimental(ByteBuffer byteBuffer, h.a aVar) {
        super(byteBuffer, aVar);
    }
}
