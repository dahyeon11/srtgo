package s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import z.AbstractC6599p0;
import z.C6562K;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6205d extends AbstractC6599p0 {

    /* renamed from: s.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f36129a = new ArrayList();

        a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f36129a.add((AbstractC6204c) it.next());
            }
        }

        public List<AbstractC6204c> getCallbacks() {
            return this.f36129a;
        }

        public List<C6562K> onDisableSession() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f36129a.iterator();
            while (it.hasNext()) {
                C6562K c6562kOnDisableSession = ((AbstractC6204c) it.next()).onDisableSession();
                if (c6562kOnDisableSession != null) {
                    arrayList.add(c6562kOnDisableSession);
                }
            }
            return arrayList;
        }

        public List<C6562K> onEnableSession() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f36129a.iterator();
            while (it.hasNext()) {
                C6562K c6562kOnEnableSession = ((AbstractC6204c) it.next()).onEnableSession();
                if (c6562kOnEnableSession != null) {
                    arrayList.add(c6562kOnEnableSession);
                }
            }
            return arrayList;
        }

        public List<C6562K> onPresetSession() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f36129a.iterator();
            while (it.hasNext()) {
                C6562K c6562kOnPresetSession = ((AbstractC6204c) it.next()).onPresetSession();
                if (c6562kOnPresetSession != null) {
                    arrayList.add(c6562kOnPresetSession);
                }
            }
            return arrayList;
        }

        public List<C6562K> onRepeating() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f36129a.iterator();
            while (it.hasNext()) {
                C6562K c6562kOnRepeating = ((AbstractC6204c) it.next()).onRepeating();
                if (c6562kOnRepeating != null) {
                    arrayList.add(c6562kOnRepeating);
                }
            }
            return arrayList;
        }
    }

    public C6205d(AbstractC6204c... abstractC6204cArr) {
        addAll(Arrays.asList(abstractC6204cArr));
    }

    public static C6205d createEmptyCallback() {
        return new C6205d(new AbstractC6204c[0]);
    }

    public a createComboCallback() {
        return new a(getAllItems());
    }

    @Override // z.AbstractC6599p0
    public AbstractC6599p0 clone() {
        C6205d c6205dCreateEmptyCallback = createEmptyCallback();
        c6205dCreateEmptyCallback.addAll(getAllItems());
        return c6205dCreateEmptyCallback;
    }
}
