package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f10126a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f10127b;

    /* renamed from: c, reason: collision with root package name */
    private final h.c f10128c;

    /* renamed from: e, reason: collision with root package name */
    private final File f10130e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10131f;

    /* renamed from: g, reason: collision with root package name */
    private final String f10132g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10133h;

    /* renamed from: j, reason: collision with root package name */
    private d[] f10135j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f10136k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10134i = false;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f10129d = d();

    public c(AssetManager assetManager, Executor executor, h.c cVar, String str, String str2, String str3, File file) {
        this.f10126a = assetManager;
        this.f10127b = executor;
        this.f10128c = cVar;
        this.f10131f = str;
        this.f10132g = str2;
        this.f10133h = str3;
        this.f10130e = file;
    }

    private c b(d[] dVarArr, byte[] bArr) throws IOException {
        InputStream inputStreamG;
        try {
            inputStreamG = g(this.f10126a, this.f10133h);
        } catch (FileNotFoundException e8) {
            this.f10128c.onResultReceived(9, e8);
        } catch (IOException e9) {
            this.f10128c.onResultReceived(7, e9);
        } catch (IllegalStateException e10) {
            this.f10135j = null;
            this.f10128c.onResultReceived(8, e10);
        }
        if (inputStreamG == null) {
            if (inputStreamG != null) {
                inputStreamG.close();
            }
            return null;
        }
        try {
            this.f10135j = n.q(inputStreamG, n.o(inputStreamG, n.f10159b), bArr, dVarArr);
            inputStreamG.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.f10134i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 > 34) {
            return null;
        }
        switch (i8) {
        }
        return null;
    }

    private InputStream e(AssetManager assetManager) {
        try {
            return g(assetManager, this.f10132g);
        } catch (FileNotFoundException e8) {
            this.f10128c.onResultReceived(6, e8);
            return null;
        } catch (IOException e9) {
            this.f10128c.onResultReceived(7, e9);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(int i8, Object obj) {
        this.f10128c.onResultReceived(i8, obj);
    }

    private InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e8) {
            String message = e8.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f10128c.onDiagnosticReceived(5, null);
            }
            return null;
        }
    }

    private d[] h(InputStream inputStream) throws IOException {
        try {
            try {
                try {
                    try {
                        d[] dVarArrW = n.w(inputStream, n.o(inputStream, n.f10158a), this.f10131f);
                        try {
                            inputStream.close();
                            return dVarArrW;
                        } catch (IOException e8) {
                            this.f10128c.onResultReceived(7, e8);
                            return dVarArrW;
                        }
                    } catch (IOException e9) {
                        this.f10128c.onResultReceived(7, e9);
                        inputStream.close();
                        return null;
                    }
                } catch (IllegalStateException e10) {
                    this.f10128c.onResultReceived(8, e10);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e11) {
                this.f10128c.onResultReceived(7, e11);
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e12) {
                this.f10128c.onResultReceived(7, e12);
            }
            throw th;
        }
    }

    private static boolean i() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 > 34) {
            return false;
        }
        if (i8 != 24 && i8 != 25) {
            switch (i8) {
            }
            return false;
        }
        return true;
    }

    private void j(final int i8, final Object obj) {
        this.f10127b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f10123a.f(i8, obj);
            }
        });
    }

    public boolean deviceAllowsProfileInstallerAotWrites() throws IOException {
        if (this.f10129d == null) {
            j(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f10130e.exists()) {
            try {
                this.f10130e.createNewFile();
            } catch (IOException unused) {
                j(4, null);
                return false;
            }
        } else if (!this.f10130e.canWrite()) {
            j(4, null);
            return false;
        }
        this.f10134i = true;
        return true;
    }

    public c read() {
        c cVarB;
        c();
        if (this.f10129d == null) {
            return this;
        }
        InputStream inputStreamE = e(this.f10126a);
        if (inputStreamE != null) {
            this.f10135j = h(inputStreamE);
        }
        d[] dVarArr = this.f10135j;
        return (dVarArr == null || !i() || (cVarB = b(dVarArr, this.f10129d)) == null) ? this : cVarB;
    }

    public c transcodeIfNeeded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f10135j;
        byte[] bArr = this.f10129d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e8) {
                this.f10128c.onResultReceived(7, e8);
            } catch (IllegalStateException e9) {
                this.f10128c.onResultReceived(8, e9);
            }
            try {
                n.E(byteArrayOutputStream, bArr);
                if (!n.B(byteArrayOutputStream, bArr, dVarArr)) {
                    this.f10128c.onResultReceived(5, null);
                    this.f10135j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f10136k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f10135j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    public boolean write() {
        byte[] bArr = this.f10136k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f10130e);
                    try {
                        e.l(byteArrayInputStream, fileOutputStream);
                        j(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e8) {
                j(6, e8);
                return false;
            } catch (IOException e9) {
                j(7, e9);
                return false;
            }
        } finally {
            this.f10136k = null;
            this.f10135j = null;
        }
    }
}
