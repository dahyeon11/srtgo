package d7;

import Q7.C;
import R6.G;
import S6.B;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
class o extends n {

    static final class a extends Lambda implements f7.p {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @Override // f7.p
        public final Void invoke(File file, IOException exception) throws IOException {
            Intrinsics.checkNotNullParameter(file, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(exception, "exception");
            throw exception;
        }
    }

    static final class b extends Lambda implements f7.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.p f30126a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f7.p pVar) {
            super(2);
            this.f30126a = pVar;
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws s {
            invoke((File) obj, (IOException) obj2);
            return G.INSTANCE;
        }

        public final void invoke(File f8, IOException e8) throws s {
            Intrinsics.checkNotNullParameter(f8, "f");
            Intrinsics.checkNotNullParameter(e8, "e");
            if (this.f30126a.invoke(f8, e8) == r.TERMINATE) {
                throw new s(f8);
            }
        }
    }

    private static final g b(g gVar) {
        return new g(gVar.getRoot(), c(gVar.getSegments()));
    }

    private static final List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            if (!Intrinsics.areEqual(name, ".")) {
                if (!Intrinsics.areEqual(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || Intrinsics.areEqual(((File) S6.r.last((List) arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    public static final boolean copyRecursively(File file, File target, boolean z8, f7.p onError) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new q(file, null, "The source file doesn't exist.", 2, null)) != r.TERMINATE;
        }
        try {
            Iterator<File> it = n.walkTopDown(file).onFail(new b(onError)).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.exists()) {
                    File file2 = new File(target, toRelativeString(next, file));
                    if (file2.exists() && (!next.isDirectory() || !file2.isDirectory())) {
                        if (z8) {
                            if (file2.isDirectory()) {
                                if (!deleteRecursively(file2)) {
                                }
                            } else if (!file2.delete()) {
                            }
                        }
                        if (onError.invoke(file2, new C5335f(next, file2, "The destination file already exists.")) == r.TERMINATE) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file2.mkdirs();
                    } else if (copyTo$default(next, file2, z8, 0, 4, null).length() != next.length() && onError.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) == r.TERMINATE) {
                        return false;
                    }
                } else {
                    if (onError.invoke(next, new q(next, null, "The source file doesn't exist.", 2, null)) == r.TERMINATE) {
                        return false;
                    }
                }
            }
            return true;
        } catch (s unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z8, f7.p pVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        if ((i8 & 4) != 0) {
            pVar = a.INSTANCE;
        }
        return copyRecursively(file, file2, z8, pVar);
    }

    public static final File copyTo(File file, File target, boolean z8, int i8) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new q(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z8) {
                throw new C5335f(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new C5335f(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                try {
                    AbstractC5331b.copyTo(fileInputStream, fileOutputStream, i8);
                    AbstractC5332c.closeFinally(fileOutputStream, null);
                    AbstractC5332c.closeFinally(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!target.mkdirs()) {
            throw new h(file, target, "Failed to create target directory.");
        }
        return target;
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 8192;
        }
        return copyTo(file, file2, z8, i8);
    }

    public static final File createTempDir(String prefix, String str, File file) throws IOException {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        fileCreateTempFile.delete();
        if (fileCreateTempFile.mkdir()) {
            Intrinsics.checkNotNull(fileCreateTempFile);
            return fileCreateTempFile;
        }
        throw new IOException("Unable to create temporary directory " + fileCreateTempFile + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "tmp";
        }
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        if ((i8 & 4) != 0) {
            file = null;
        }
        return createTempDir(str, str2, file);
    }

    public static final File createTempFile(String prefix, String str, File file) throws IOException {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "tmp";
        }
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        if ((i8 & 4) != 0) {
            file = null;
        }
        return createTempFile(str, str2, file);
    }

    private static final String d(File file, File file2) throws IOException {
        g gVarB = b(l.toComponents(file));
        g gVarB2 = b(l.toComponents(file2));
        if (!Intrinsics.areEqual(gVarB.getRoot(), gVarB2.getRoot())) {
            return null;
        }
        int size = gVarB2.getSize();
        int size2 = gVarB.getSize();
        int iMin = Math.min(size2, size);
        int i8 = 0;
        while (i8 < iMin && Intrinsics.areEqual(gVarB.getSegments().get(i8), gVarB2.getSegments().get(i8))) {
            i8++;
        }
        StringBuilder sb = new StringBuilder();
        int i9 = size - 1;
        if (i8 <= i9) {
            while (!Intrinsics.areEqual(gVarB2.getSegments().get(i9).getName(), "..")) {
                sb.append("..");
                if (i9 != i8) {
                    sb.append(File.separatorChar);
                }
                if (i9 != i8) {
                    i9--;
                }
            }
            return null;
        }
        if (i8 < size2) {
            if (i8 < size) {
                sb.append(File.separatorChar);
            }
            List listDrop = S6.r.drop(gVarB.getSegments(), i8);
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            B.joinTo(listDrop, sb, (124 & 2) != 0 ? ", " : separator, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        return sb.toString();
    }

    public static final boolean deleteRecursively(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z8 = true;
            for (File file2 : n.walkBottomUp(file)) {
                if (!file2.delete() && file2.exists()) {
                    z8 = false;
                } else {
                    if (z8) {
                        break;
                    }
                    z8 = false;
                }
            }
            return z8;
        }
    }

    public static final boolean endsWith(File file, File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        g components = l.toComponents(file);
        g components2 = l.toComponents(other);
        if (components2.isRooted()) {
            return Intrinsics.areEqual(file, other);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static final String getExtension(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return l7.r.substringAfterLast(name, C.PACKAGE_SEPARATOR_CHAR, "");
    }

    public static final String getInvariantSeparatorsPath(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        char c9 = File.separatorChar;
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return c9 != '/' ? l7.r.replace$default(path, c9, '/', false, 4, (Object) null) : path;
    }

    public static final String getNameWithoutExtension(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return l7.r.substringBeforeLast$default(name, ".", (String) null, 2, (Object) null);
    }

    public static final File normalize(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        g components = l.toComponents(file);
        File root = components.getRoot();
        List listC = c(components.getSegments());
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return resolve(root, S6.r.joinToString$default(listC, separator, null, null, 0, null, null, 62, null));
    }

    public static final File relativeTo(File file, File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        return new File(toRelativeString(file, base));
    }

    public static final File relativeToOrNull(File file, File base) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String strD = d(file, base);
        if (strD != null) {
            return new File(strD);
        }
        return null;
    }

    public static final File relativeToOrSelf(File file, File base) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String strD = d(file, base);
        return strD != null ? new File(strD) : file;
    }

    public static final File resolve(File file, File relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        if (l.isRooted(relative)) {
            return relative;
        }
        String string = file.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() != 0) {
            char c9 = File.separatorChar;
            if (!l7.r.endsWith$default((CharSequence) string, c9, false, 2, (Object) null)) {
                return new File(string + c9 + relative);
            }
        }
        return new File(string + relative);
    }

    public static final File resolveSibling(File file, File relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        g components = l.toComponents(file);
        return resolve(resolve(components.getRoot(), components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1)), relative);
    }

    public static final boolean startsWith(File file, File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        g components = l.toComponents(file);
        g components2 = l.toComponents(other);
        if (Intrinsics.areEqual(components.getRoot(), components2.getRoot()) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    public static final String toRelativeString(File file, File base) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String strD = d(file, base);
        if (strD != null) {
            return strD;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + C.PACKAGE_SEPARATOR_CHAR);
    }

    public static final File resolve(File file, String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return resolve(file, new File(relative));
    }

    public static final File resolveSibling(File file, String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return resolveSibling(file, new File(relative));
    }

    public static final boolean startsWith(File file, String other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return startsWith(file, new File(other));
    }

    public static final boolean endsWith(File file, String other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return endsWith(file, new File(other));
    }
}
