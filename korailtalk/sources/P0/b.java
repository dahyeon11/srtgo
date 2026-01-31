package P0;

import java.util.List;

/* loaded from: classes.dex */
public interface b {
    List<String> getDependentWorkIds(String str);

    List<String> getPrerequisites(String str);

    boolean hasCompletedAllPrerequisites(String str);

    boolean hasDependents(String str);

    void insertDependency(a aVar);
}
