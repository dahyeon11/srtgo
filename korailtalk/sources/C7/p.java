package C7;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public interface p {
    public static final p NO_COOKIES = new a();

    List<C0481o> loadForRequest(A a9);

    void saveFromResponse(A a9, List<C0481o> list);

    class a implements p {
        a() {
        }

        @Override // C7.p
        public List<C0481o> loadForRequest(A a9) {
            return Collections.emptyList();
        }

        @Override // C7.p
        public void saveFromResponse(A a9, List<C0481o> list) {
        }
    }
}
