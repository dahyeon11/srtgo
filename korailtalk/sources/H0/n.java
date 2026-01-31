package H0;

import H0.y;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends y {
    n(a aVar) {
        super(aVar.f1609b, aVar.f1610c, aVar.f1611d);
    }

    public static n from(Class<? extends ListenableWorker> cls) {
        return (n) new a(cls).build();
    }

    public static List<n> from(List<Class<? extends ListenableWorker>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Class<? extends ListenableWorker>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((n) new a(it.next()).build());
        }
        return arrayList;
    }

    public static final class a extends y.a {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f1610c.inputMergerClassName = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // H0.y.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public n a() {
            if (this.f1608a && this.f1610c.constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new n(this);
        }

        public a setInputMerger(Class<? extends j> cls) {
            this.f1610c.inputMergerClassName = cls.getName();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // H0.y.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b() {
            return this;
        }
    }
}
