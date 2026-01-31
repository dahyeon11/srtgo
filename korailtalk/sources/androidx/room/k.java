package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import x0.C6481a;
import z0.InterfaceC6610b;
import z0.InterfaceC6611c;

/* loaded from: classes.dex */
class k implements InterfaceC6611c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10745a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10746b;

    /* renamed from: c, reason: collision with root package name */
    private final File f10747c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10748d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6611c f10749e;

    /* renamed from: f, reason: collision with root package name */
    private a f10750f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10751g;

    k(Context context, String str, File file, int i8, InterfaceC6611c interfaceC6611c) {
        this.f10745a = context;
        this.f10746b = str;
        this.f10747c = file;
        this.f10748d = i8;
        this.f10749e = interfaceC6611c;
    }

    private void a(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f10746b != null) {
            channel = Channels.newChannel(this.f10745a.getAssets().open(this.f10746b));
        } else {
            if (this.f10747c == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f10747c).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f10745a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        x0.d.copy(channel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private void c() throws IOException {
        String databaseName = getDatabaseName();
        File databasePath = this.f10745a.getDatabasePath(databaseName);
        a aVar = this.f10750f;
        C6481a c6481a = new C6481a(databaseName, this.f10745a.getFilesDir(), aVar == null || aVar.multiInstanceInvalidation);
        try {
            c6481a.lock();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    c6481a.unlock();
                    return;
                } catch (IOException e8) {
                    throw new RuntimeException("Unable to copy database file.", e8);
                }
            }
            if (this.f10750f == null) {
                c6481a.unlock();
                return;
            }
            try {
                int version = x0.c.readVersion(databasePath);
                int i8 = this.f10748d;
                if (version == i8) {
                    c6481a.unlock();
                    return;
                }
                if (this.f10750f.isMigrationRequired(version, i8)) {
                    c6481a.unlock();
                    return;
                }
                if (this.f10745a.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath);
                    } catch (IOException e9) {
                        Log.w("ROOM", "Unable to copy database file.", e9);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c6481a.unlock();
                return;
            } catch (IOException e10) {
                Log.w("ROOM", "Unable to read database version.", e10);
                c6481a.unlock();
                return;
            }
        } catch (Throwable th) {
            c6481a.unlock();
            throw th;
        }
        c6481a.unlock();
        throw th;
    }

    void b(a aVar) {
        this.f10750f = aVar;
    }

    @Override // z0.InterfaceC6611c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f10749e.close();
        this.f10751g = false;
    }

    @Override // z0.InterfaceC6611c
    public String getDatabaseName() {
        return this.f10749e.getDatabaseName();
    }

    @Override // z0.InterfaceC6611c
    public synchronized InterfaceC6610b getReadableDatabase() {
        try {
            if (!this.f10751g) {
                c();
                this.f10751g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10749e.getReadableDatabase();
    }

    @Override // z0.InterfaceC6611c
    public synchronized InterfaceC6610b getWritableDatabase() {
        try {
            if (!this.f10751g) {
                c();
                this.f10751g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10749e.getWritableDatabase();
    }

    @Override // z0.InterfaceC6611c
    public void setWriteAheadLoggingEnabled(boolean z8) {
        this.f10749e.setWriteAheadLoggingEnabled(z8);
    }
}
