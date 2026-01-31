package x0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6481a {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f37492e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final File f37493a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f37494b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37495c;

    /* renamed from: d, reason: collision with root package name */
    private FileChannel f37496d;

    public C6481a(String str, File file, boolean z8) {
        File file2 = new File(file, str + ".lck");
        this.f37493a = file2;
        this.f37494b = a(file2.getAbsolutePath());
        this.f37495c = z8;
    }

    private static Lock a(String str) {
        Lock reentrantLock;
        Map map = f37492e;
        synchronized (map) {
            try {
                reentrantLock = (Lock) map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return reentrantLock;
    }

    public void lock() throws IOException {
        this.f37494b.lock();
        if (this.f37495c) {
            try {
                FileChannel channel = new FileOutputStream(this.f37493a).getChannel();
                this.f37496d = channel;
                channel.lock();
            } catch (IOException e8) {
                throw new IllegalStateException("Unable to grab copy lock.", e8);
            }
        }
    }

    public void unlock() throws IOException {
        FileChannel fileChannel = this.f37496d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f37494b.unlock();
    }
}
