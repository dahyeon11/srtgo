package G0;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class j {
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_DISABLED = 0;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED = 2;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED_WITHOUT_APP_IDENTITY = 1;

    /* renamed from: a, reason: collision with root package name */
    private int f1387a;

    /* renamed from: b, reason: collision with root package name */
    private Map f1388b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f1389a;

        /* renamed from: b, reason: collision with root package name */
        private Map f1390b = new HashMap();

        public a(int i8) {
            this.f1389a = i8;
        }

        public a addOverrideRule(String str, int i8) {
            this.f1390b.put(str, Integer.valueOf(i8));
            return this;
        }

        public j build() {
            return new j(this);
        }

        public a setOverrideRules(Map<String, Integer> map) {
            this.f1390b = map;
            return this;
        }
    }

    public j(a aVar) {
        this.f1387a = aVar.f1389a;
        this.f1388b = aVar.f1390b;
    }

    public int getDefaultStatus() {
        return this.f1387a;
    }

    public Map<String, Integer> getOverrideRules() {
        return this.f1388b;
    }
}
