package H0;

/* loaded from: classes.dex */
public abstract class k {

    class a extends k {
        a() {
        }

        @Override // H0.k
        public j createInputMerger(String str) {
            return null;
        }
    }

    public static k getDefaultInputMergerFactory() {
        return new a();
    }

    public abstract j createInputMerger(String str);

    public final j createInputMergerWithDefaultFallback(String str) {
        j jVarCreateInputMerger = createInputMerger(str);
        return jVarCreateInputMerger == null ? j.fromClassName(str) : jVarCreateInputMerger;
    }
}
