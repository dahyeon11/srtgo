package retrofit.mime;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface TypedOutput {
    String fileName();

    long length();

    String mimeType();

    void writeTo(OutputStream outputStream);
}
