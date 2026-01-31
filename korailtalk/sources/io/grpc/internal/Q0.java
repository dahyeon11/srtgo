package io.grpc.internal;

import java.io.InputStream;

/* loaded from: classes.dex */
public interface Q0 {

    public interface a {
        InputStream next();
    }

    void messagesAvailable(a aVar);

    void onReady();
}
