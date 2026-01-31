package d7;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a */
    private final File f30098a;

    /* renamed from: b */
    private final List f30099b;

    public g(File root, List<? extends File> segments) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f30098a = root;
        this.f30099b = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g copy$default(g gVar, File file, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            file = gVar.f30098a;
        }
        if ((i8 & 2) != 0) {
            list = gVar.f30099b;
        }
        return gVar.copy(file, list);
    }

    public final File component1() {
        return this.f30098a;
    }

    public final List<File> component2() {
        return this.f30099b;
    }

    public final g copy(File root, List<? extends File> segments) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new g(root, segments);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f30098a, gVar.f30098a) && Intrinsics.areEqual(this.f30099b, gVar.f30099b);
    }

    public final File getRoot() {
        return this.f30098a;
    }

    public final String getRootName() {
        String path = this.f30098a.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    public final List<File> getSegments() {
        return this.f30099b;
    }

    public final int getSize() {
        return this.f30099b.size();
    }

    public int hashCode() {
        return (this.f30098a.hashCode() * 31) + this.f30099b.hashCode();
    }

    public final boolean isRooted() {
        String path = this.f30098a.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path.length() > 0;
    }

    public final File subPath(int i8, int i9) {
        if (i8 < 0 || i8 > i9 || i9 > getSize()) {
            throw new IllegalArgumentException();
        }
        List listSubList = this.f30099b.subList(i8, i9);
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return new File(S6.r.joinToString$default(listSubList, separator, null, null, 0, null, null, 62, null));
    }

    public String toString() {
        return "FilePathComponents(root=" + this.f30098a + ", segments=" + this.f30099b + ')';
    }
}
