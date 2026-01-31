package H0;

import java.util.List;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1591a = l.tagWithPrefix("InputMerger");

    public static j fromClassName(String str) {
        try {
            return (j) Class.forName(str).newInstance();
        } catch (Exception e8) {
            l.get().error(f1591a, "Trouble instantiating + " + str, e8);
            return null;
        }
    }

    public abstract androidx.work.b merge(List<androidx.work.b> list);
}
