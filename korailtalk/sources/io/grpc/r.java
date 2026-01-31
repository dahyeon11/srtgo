package io.grpc;

import java.io.OutputStream;

/* loaded from: classes.dex */
public interface r {
    OutputStream compress(OutputStream outputStream);

    String getMessageEncoding();
}
