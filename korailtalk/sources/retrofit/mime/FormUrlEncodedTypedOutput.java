package retrofit.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

/* loaded from: classes3.dex */
public final class FormUrlEncodedTypedOutput implements TypedOutput {
    final ByteArrayOutputStream content = new ByteArrayOutputStream();

    public void addField(String str, String str2) throws IOException {
        if (str == null) {
            throw new NullPointerException("name");
        }
        if (str2 == null) {
            throw new NullPointerException("value");
        }
        if (this.content.size() > 0) {
            this.content.write(38);
        }
        try {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            String strEncode2 = URLEncoder.encode(str2, "UTF-8");
            this.content.write(strEncode.getBytes("UTF-8"));
            this.content.write(61);
            this.content.write(strEncode2.getBytes("UTF-8"));
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // retrofit.mime.TypedOutput
    public String fileName() {
        return null;
    }

    @Override // retrofit.mime.TypedOutput
    public long length() {
        return this.content.size();
    }

    @Override // retrofit.mime.TypedOutput
    public String mimeType() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    @Override // retrofit.mime.TypedOutput
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content.toByteArray());
    }
}
