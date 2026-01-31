package c1;

import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public interface d extends Closeable {
    InputStream bodyByteStream();

    String contentType();

    String error();

    boolean isSuccessful();
}
