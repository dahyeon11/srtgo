package retrofit.mime;

import java.io.InputStream;

/* loaded from: classes3.dex */
public interface TypedInput {
    InputStream in();

    long length();

    String mimeType();
}
