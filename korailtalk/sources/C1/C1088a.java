package c1;

import Q7.X;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1088a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f11440a;

    public C1088a(HttpURLConnection httpURLConnection) {
        this.f11440a = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // c1.d
    public InputStream bodyByteStream() {
        return this.f11440a.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11440a.disconnect();
    }

    @Override // c1.d
    public String contentType() {
        return this.f11440a.getContentType();
    }

    @Override // c1.d
    public String error() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f11440a.getURL() + ". Failed with " + this.f11440a.getResponseCode() + X.LF + a(this.f11440a);
        } catch (IOException e8) {
            f1.f.warning("get error failed ", e8);
            return e8.getMessage();
        }
    }

    @Override // c1.d
    public boolean isSuccessful() {
        try {
            return this.f11440a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
