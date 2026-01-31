package P0;

import java.util.List;

/* loaded from: classes.dex */
public interface p {
    void delete(String str);

    void deleteAll();

    androidx.work.b getProgressForWorkSpecId(String str);

    List<androidx.work.b> getProgressForWorkSpecIds(List<String> list);

    void insert(o oVar);
}
