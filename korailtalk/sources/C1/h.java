package c1;

import T0.t;
import T0.z;
import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private final g f11443a;

    /* renamed from: b */
    private final f f11444b;

    public h(g gVar, f fVar) {
        this.f11443a = gVar;
        this.f11444b = fVar;
    }

    private T0.h a(String str, String str2) {
        Pair pairA;
        if (str2 == null || (pairA = this.f11443a.a(str)) == null) {
            return null;
        }
        c cVar = (c) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        z zVarFromZipStreamSync = cVar == c.ZIP ? t.fromZipStreamSync(new ZipInputStream(inputStream), str) : t.fromJsonInputStreamSync(inputStream, str);
        if (zVarFromZipStreamSync.getValue() != null) {
            return (T0.h) zVarFromZipStreamSync.getValue();
        }
        return null;
    }

    private z b(String str, String str2) throws IOException {
        f1.f.debug("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d dVarFetchSync = this.f11444b.fetchSync(str);
                if (!dVarFetchSync.isSuccessful()) {
                    z zVar = new z((Throwable) new IllegalArgumentException(dVarFetchSync.error()));
                    try {
                        dVarFetchSync.close();
                    } catch (IOException e8) {
                        f1.f.warning("LottieFetchResult close failed ", e8);
                    }
                    return zVar;
                }
                z zVarC = c(str, dVarFetchSync.bodyByteStream(), dVarFetchSync.contentType(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(zVarC.getValue() != null);
                f1.f.debug(sb.toString());
                try {
                    dVarFetchSync.close();
                } catch (IOException e9) {
                    f1.f.warning("LottieFetchResult close failed ", e9);
                }
                return zVarC;
            } catch (Exception e10) {
                z zVar2 = new z((Throwable) e10);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e11) {
                        f1.f.warning("LottieFetchResult close failed ", e11);
                    }
                }
                return zVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e12) {
                    f1.f.warning("LottieFetchResult close failed ", e12);
                }
            }
            throw th;
        }
    }

    private z c(String str, InputStream inputStream, String str2, String str3) {
        c cVar;
        z zVarE;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            f1.f.debug("Handling zip response.");
            cVar = c.ZIP;
            zVarE = e(str, inputStream, str3);
        } else {
            f1.f.debug("Received json response.");
            cVar = c.JSON;
            zVarE = d(str, inputStream, str3);
        }
        if (str3 != null && zVarE.getValue() != null) {
            this.f11443a.e(str, cVar);
        }
        return zVarE;
    }

    private z d(String str, InputStream inputStream, String str2) {
        return str2 == null ? t.fromJsonInputStreamSync(inputStream, null) : t.fromJsonInputStreamSync(new FileInputStream(this.f11443a.f(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    private z e(String str, InputStream inputStream, String str2) {
        return str2 == null ? t.fromZipStreamSync(new ZipInputStream(inputStream), null) : t.fromZipStreamSync(new ZipInputStream(new FileInputStream(this.f11443a.f(str, inputStream, c.ZIP))), str);
    }

    public z fetchSync(String str, String str2) {
        T0.h hVarA = a(str, str2);
        if (hVarA != null) {
            return new z(hVarA);
        }
        f1.f.debug("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }
}
