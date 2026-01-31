package o0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
final class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final File f34372a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34373b;

    /* renamed from: c, reason: collision with root package name */
    private final File f34374c;

    /* renamed from: d, reason: collision with root package name */
    private final RandomAccessFile f34375d;

    /* renamed from: e, reason: collision with root package name */
    private final FileChannel f34376e;

    /* renamed from: f, reason: collision with root package name */
    private final FileLock f34377f;

    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    private static class b extends File {
        public long crc;

        public b(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    c(File file, File file2) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor(");
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(file2.getPath());
        sb.append(")");
        this.f34372a = file;
        this.f34374c = file2;
        this.f34373b = f(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f34375d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f34376e = channel;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Blocking on lock ");
                sb2.append(file3.getPath());
                this.f34377f = channel.lock();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file3.getPath());
                sb3.append(" locked");
            } catch (IOException e8) {
                e = e8;
                b(this.f34376e);
                throw e;
            } catch (Error e9) {
                e = e9;
                b(this.f34376e);
                throw e;
            } catch (RuntimeException e10) {
                e = e10;
                b(this.f34376e);
                throw e;
            }
        } catch (IOException e11) {
            e = e11;
            b(this.f34375d);
            throw e;
        } catch (Error e12) {
            e = e12;
            b(this.f34375d);
            throw e;
        } catch (RuntimeException e13) {
            e = e13;
            b(this.f34375d);
            throw e;
        }
    }

    private void a() {
        File[] fileArrListFiles = this.f34374c.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f34374c.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to delete old file ");
            sb.append(file.getPath());
            sb.append(" of size ");
            sb.append(file.length());
            if (file.delete()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Deleted old file ");
                sb2.append(file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static void b(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e8) {
            Log.w("MultiDex", "Failed to close resource", e8);
        }
    }

    private static void c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        StringBuilder sb = new StringBuilder();
        sb.append("Extracting ");
        sb.append(fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i8 = inputStream.read(bArr); i8 != -1; i8 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i8);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Renaming to ");
                sb2.append(file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    b(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            b(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    private static SharedPreferences d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    private static long e(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long f(File file) throws IOException {
        long jC = d.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    private static boolean g(Context context, File file, long j8, String str) {
        SharedPreferences sharedPreferencesD = d(context);
        if (sharedPreferencesD.getLong(str + "timestamp", -1L) == e(file)) {
            if (sharedPreferencesD.getLong(str + "crc", -1L) == j8) {
                return false;
            }
        }
        return true;
    }

    private List i(Context context, String str) throws IOException {
        String str2 = this.f34372a.getName() + ".classes";
        SharedPreferences sharedPreferencesD = d(context);
        int i8 = sharedPreferencesD.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i8 + (-1));
        int i9 = 2;
        while (i9 <= i8) {
            b bVar = new b(this.f34374c, str2 + i9 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.crc = f(bVar);
            long j8 = sharedPreferencesD.getLong(str + "dex.crc." + i9, -1L);
            long j9 = sharedPreferencesD.getLong(str + "dex.time." + i9, -1L);
            long jLastModified = bVar.lastModified();
            if (j9 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesD;
                if (j8 == bVar.crc) {
                    arrayList.add(bVar);
                    i9++;
                    sharedPreferencesD = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j9 + ", modification time: " + jLastModified + ", expected crc: " + j8 + ", file crc: " + bVar.crc);
        }
        return arrayList;
    }

    private List j() throws IOException {
        boolean z8;
        String str = this.f34372a.getName() + ".classes";
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f34372a);
        try {
            int i8 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                b bVar = new b(this.f34374c, str + i8 + ".zip");
                arrayList.add(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("Extraction is needed for file ");
                sb.append(bVar);
                int i9 = 0;
                boolean z9 = false;
                while (i9 < 3 && !z9) {
                    int i10 = i9 + 1;
                    c(zipFile, entry, bVar, str);
                    try {
                        bVar.crc = f(bVar);
                        z8 = true;
                    } catch (IOException e8) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e8);
                        z8 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z8 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(bVar.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(bVar.length());
                    sb2.append(" - crc: ");
                    sb2.append(bVar.crc);
                    if (!z8) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z9 = z8;
                    i9 = i10;
                }
                if (!z9) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i8 + ")");
                }
                i8++;
                entry = zipFile.getEntry("classes" + i8 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e9) {
                Log.w("MultiDex", "Failed to close resource", e9);
            }
            return arrayList;
        } finally {
        }
    }

    private static void k(Context context, String str, long j8, long j9, List list) {
        SharedPreferences.Editor editorEdit = d(context).edit();
        editorEdit.putLong(str + "timestamp", j8);
        editorEdit.putLong(str + "crc", j9);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i8 = 2;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            editorEdit.putLong(str + "dex.crc." + i8, bVar.crc);
            editorEdit.putLong(str + "dex.time." + i8, bVar.lastModified());
            i8++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f34377f.release();
        this.f34376e.close();
        this.f34375d.close();
    }

    List h(Context context, String str, boolean z8) throws IOException {
        List listJ;
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor.load(");
        sb.append(this.f34372a.getPath());
        sb.append(", ");
        sb.append(z8);
        sb.append(", ");
        sb.append(str);
        sb.append(")");
        if (!this.f34377f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z8 || g(context, this.f34372a, this.f34373b, str)) {
            listJ = j();
            k(context, str, e(this.f34372a), this.f34373b, listJ);
        } else {
            try {
                listJ = i(context, str);
            } catch (IOException e8) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e8);
                listJ = j();
                k(context, str, e(this.f34372a), this.f34373b, listJ);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("load found ");
        sb2.append(listJ.size());
        sb2.append(" secondary dex files");
        return listJ;
    }
}
