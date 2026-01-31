package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import org.tensorflow.lite.f;
import org.tensorflow.lite.nnapi.a;

/* loaded from: classes3.dex */
public interface g {
    f create(File file, f.a aVar);

    f create(ByteBuffer byteBuffer, f.a aVar);

    a.b createNnApiDelegateImpl(a.C0362a c0362a);

    String runtimeVersion();

    String schemaVersion();
}
