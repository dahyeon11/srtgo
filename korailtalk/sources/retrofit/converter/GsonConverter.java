package retrofit.converter;

import com.google.gson.Gson;
import com.google.gson.m;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import retrofit.mime.MimeUtil;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

/* loaded from: classes3.dex */
public class GsonConverter implements Converter {
    private String encoding;
    private final Gson gson;

    private static class JsonTypedOutput implements TypedOutput {
        private final byte[] jsonBytes;
        private final String mimeType;

        JsonTypedOutput(byte[] bArr, String str) {
            this.jsonBytes = bArr;
            this.mimeType = "application/json; charset=" + str;
        }

        @Override // retrofit.mime.TypedOutput
        public String fileName() {
            return null;
        }

        @Override // retrofit.mime.TypedOutput
        public long length() {
            return this.jsonBytes.length;
        }

        @Override // retrofit.mime.TypedOutput
        public String mimeType() {
            return this.mimeType;
        }

        @Override // retrofit.mime.TypedOutput
        public void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(this.jsonBytes);
        }
    }

    public GsonConverter(Gson gson) {
        this(gson, "UTF-8");
    }

    @Override // retrofit.converter.Converter
    public Object fromBody(TypedInput typedInput, Type type) throws Throwable {
        InputStreamReader inputStreamReader = null;
        try {
            try {
                InputStreamReader inputStreamReader2 = new InputStreamReader(typedInput.in(), typedInput.mimeType() != null ? MimeUtil.parseCharset(typedInput.mimeType()) : "UTF-8");
                try {
                    Object objFromJson = this.gson.fromJson(inputStreamReader2, type);
                    try {
                        inputStreamReader2.close();
                    } catch (IOException unused) {
                    }
                    return objFromJson;
                } catch (m e8) {
                    e = e8;
                    throw new ConversionException(e);
                } catch (IOException e9) {
                    e = e9;
                    throw new ConversionException(e);
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader = inputStreamReader2;
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (m e10) {
                e = e10;
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // retrofit.converter.Converter
    public TypedOutput toBody(Object obj) {
        try {
            return new JsonTypedOutput(this.gson.toJson(obj).getBytes(this.encoding), this.encoding);
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }

    public GsonConverter(Gson gson, String str) {
        this.gson = gson;
        this.encoding = str;
    }
}
