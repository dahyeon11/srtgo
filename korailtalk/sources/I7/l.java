package I7;

import java.util.List;

/* loaded from: classes3.dex */
public interface l {
    public static final l CANCEL = new a();

    boolean onData(int i8, P7.e eVar, int i9, boolean z8);

    boolean onHeaders(int i8, List<c> list, boolean z8);

    boolean onRequest(int i8, List<c> list);

    void onReset(int i8, b bVar);

    class a implements l {
        a() {
        }

        @Override // I7.l
        public boolean onData(int i8, P7.e eVar, int i9, boolean z8) {
            eVar.skip(i9);
            return true;
        }

        @Override // I7.l
        public boolean onHeaders(int i8, List<c> list, boolean z8) {
            return true;
        }

        @Override // I7.l
        public boolean onRequest(int i8, List<c> list) {
            return true;
        }

        @Override // I7.l
        public void onReset(int i8, b bVar) {
        }
    }
}
