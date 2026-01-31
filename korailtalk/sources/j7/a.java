package J7;

import P7.n;
import P7.v;
import P7.w;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface a {
    public static final a SYSTEM = new C0049a();

    /* renamed from: J7.a$a, reason: collision with other inner class name */
    class C0049a implements a {
        C0049a() {
        }

        @Override // J7.a
        public v appendingSink(File file) {
            try {
                return n.appendingSink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return n.appendingSink(file);
            }
        }

        @Override // J7.a
        public void delete(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        @Override // J7.a
        public void deleteContents(File file) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }

        @Override // J7.a
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // J7.a
        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // J7.a
        public v sink(File file) {
            try {
                return n.sink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return n.sink(file);
            }
        }

        @Override // J7.a
        public long size(File file) {
            return file.length();
        }

        @Override // J7.a
        public w source(File file) {
            return n.source(file);
        }
    }

    v appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    v sink(File file);

    long size(File file);

    w source(File file);
}
