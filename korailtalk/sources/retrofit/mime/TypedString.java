package retrofit.mime;

import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public class TypedString extends TypedByteArray {
    public TypedString(String str) {
        super("text/plain; charset=UTF-8", convertToBytes(str));
    }

    private static byte[] convertToBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException(e8);
        }
    }
}
