package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f25704a;

    /* renamed from: b, reason: collision with root package name */
    private final FileLock f25705b;

    private b(FileChannel fileChannel, FileLock fileLock) {
        this.f25704a = fileChannel;
        this.f25705b = fileLock;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.firebase.installations.b a(android.content.Context r4, java.lang.String r5) throws java.io.IOException {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Error -> L28 java.io.IOException -> L2c
            java.io.File r4 = r4.getFilesDir()     // Catch: java.lang.Error -> L28 java.io.IOException -> L2c
            r1.<init>(r4, r5)     // Catch: java.lang.Error -> L28 java.io.IOException -> L2c
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Error -> L28 java.io.IOException -> L2c
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch: java.lang.Error -> L28 java.io.IOException -> L2c
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.lang.Error -> L28 java.io.IOException -> L2c
            java.nio.channels.FileLock r5 = r4.lock()     // Catch: java.lang.Error -> L23 java.io.IOException -> L26
            com.google.firebase.installations.b r1 = new com.google.firebase.installations.b     // Catch: java.lang.Error -> L1f java.io.IOException -> L21
            r1.<init>(r4, r5)     // Catch: java.lang.Error -> L1f java.io.IOException -> L21
            return r1
        L1f:
            r1 = move-exception
            goto L2e
        L21:
            r1 = move-exception
            goto L2e
        L23:
            r1 = move-exception
        L24:
            r5 = r0
            goto L2e
        L26:
            r1 = move-exception
            goto L24
        L28:
            r1 = move-exception
        L29:
            r4 = r0
            r5 = r4
            goto L2e
        L2c:
            r1 = move-exception
            goto L29
        L2e:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L3a
            r5.release()     // Catch: java.io.IOException -> L3a
        L3a:
            if (r4 == 0) goto L3f
            r4.close()     // Catch: java.io.IOException -> L3f
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.b.a(android.content.Context, java.lang.String):com.google.firebase.installations.b");
    }

    void b() throws IOException {
        try {
            this.f25705b.release();
            this.f25704a.close();
        } catch (IOException e8) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e8);
        }
    }
}
