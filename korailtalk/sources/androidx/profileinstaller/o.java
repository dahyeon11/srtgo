package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.C;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.e f10160a = androidx.concurrent.futures.e.create();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f10161b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static c f10162c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f10163a;

        /* renamed from: b, reason: collision with root package name */
        final int f10164b;

        /* renamed from: c, reason: collision with root package name */
        final long f10165c;

        /* renamed from: d, reason: collision with root package name */
        final long f10166d;

        b(int i8, int i9, long j8, long j9) {
            this.f10163a = i8;
            this.f10164b = i9;
            this.f10165c = j8;
            this.f10166d = j9;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f10163a);
                dataOutputStream.writeInt(this.f10164b);
                dataOutputStream.writeLong(this.f10165c);
                dataOutputStream.writeLong(this.f10166d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10164b == bVar.f10164b && this.f10165c == bVar.f10165c && this.f10163a == bVar.f10163a && this.f10166d == bVar.f10166d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f10164b), Long.valueOf(this.f10165c), Integer.valueOf(this.f10163a), Long.valueOf(this.f10166d));
        }
    }

    public static class c {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;
        public static final int RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE = 196608;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;

        /* renamed from: a, reason: collision with root package name */
        final int f10167a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f10168b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f10169c;

        c(int i8, boolean z8, boolean z9) {
            this.f10167a = i8;
            this.f10169c = z9;
            this.f10168b = z8;
        }

        public int getProfileInstallResultCode() {
            return this.f10167a;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.f10169c;
        }

        public boolean isCompiledWithProfile() {
            return this.f10168b;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i8, boolean z8, boolean z9) {
        c cVar = new c(i8, z8, z9);
        f10162c = cVar;
        f10160a.set(cVar);
        return f10162c;
    }

    static c c(Context context, boolean z8) {
        b bVarA;
        int i8;
        c cVar;
        if (!z8 && (cVar = f10162c) != null) {
            return cVar;
        }
        synchronized (f10161b) {
            if (!z8) {
                try {
                    c cVar2 = f10162c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i9 = Build.VERSION.SDK_INT;
            int i10 = 0;
            if (i9 >= 28 && i9 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z9 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z10 = file2.exists() && length2 > 0;
                try {
                    long jA = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused) {
                            return b(131072, z9, z10);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA != null && bVarA.f10165c == jA && (i8 = bVarA.f10164b) != 2) {
                        i10 = i8;
                    } else if (z9) {
                        i10 = 1;
                    } else if (z10) {
                        i10 = 2;
                    }
                    if (z8 && z10 && i10 != 1) {
                        i10 = 2;
                    }
                    if (bVarA != null && bVarA.f10164b == 2 && i10 == 1 && length < bVarA.f10166d) {
                        i10 = 3;
                    }
                    b bVar = new b(1, i10, jA, length2);
                    if (bVarA == null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i10 = c.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        }
                    }
                    return b(i10, z9, z10);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return b(65536, z9, z10);
                }
            }
            return b(262144, false, false);
        }
    }

    public static C getCompilationStatusAsync() {
        return f10160a;
    }

    public static c writeProfileVerification(Context context) {
        return c(context, false);
    }
}
