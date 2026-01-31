package K;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private int f2706a = 1;

    /* renamed from: b, reason: collision with root package name */
    private Map f2707b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private List f2708c = new ArrayList();

    private static class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private final int f2709a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f2710b;

        /* renamed from: c, reason: collision with root package name */
        private final List f2711c;

        a(int i8, Map map, List list) {
            this.f2709a = i8;
            this.f2710b = map;
            this.f2711c = list;
        }

        @Override // K.g
        public List<e> getOutputConfigs() {
            return this.f2711c;
        }

        @Override // K.g
        public Map<CaptureRequest.Key<?>, Object> getSessionParameters() {
            return this.f2710b;
        }

        @Override // K.g
        public int getSessionTemplateId() {
            return this.f2709a;
        }
    }

    h() {
    }

    h a(e eVar) {
        this.f2708c.add(eVar);
        return this;
    }

    h b(CaptureRequest.Key key, Object obj) {
        this.f2707b.put(key, obj);
        return this;
    }

    g c() {
        return new a(this.f2706a, this.f2707b, this.f2708c);
    }

    h d(int i8) {
        this.f2706a = i8;
        return this;
    }
}
