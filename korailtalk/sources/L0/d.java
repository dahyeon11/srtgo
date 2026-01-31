package L0;

import H0.l;
import M0.c;
import M0.e;
import M0.f;
import M0.g;
import M0.h;
import P0.r;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d implements c.a {

    /* renamed from: d */
    private static final String f3002d = l.tagWithPrefix("WorkConstraintsTracker");

    /* renamed from: a */
    private final c f3003a;

    /* renamed from: b */
    private final M0.c[] f3004b;

    /* renamed from: c */
    private final Object f3005c;

    public d(Context context, R0.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3003a = cVar;
        this.f3004b = new M0.c[]{new M0.a(applicationContext, aVar), new M0.b(applicationContext, aVar), new h(applicationContext, aVar), new M0.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f3005c = new Object();
    }

    public boolean areAllConstraintsMet(String str) {
        synchronized (this.f3005c) {
            try {
                for (M0.c cVar : this.f3004b) {
                    if (cVar.isWorkSpecConstrained(str)) {
                        l.get().debug(f3002d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.c.a
    public void onConstraintMet(List<String> list) {
        synchronized (this.f3005c) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (areAllConstraintsMet(str)) {
                        l.get().debug(f3002d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                c cVar = this.f3003a;
                if (cVar != null) {
                    cVar.onAllConstraintsMet(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.c.a
    public void onConstraintNotMet(List<String> list) {
        synchronized (this.f3005c) {
            try {
                c cVar = this.f3003a;
                if (cVar != null) {
                    cVar.onAllConstraintsNotMet(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void replace(Iterable<r> iterable) {
        synchronized (this.f3005c) {
            try {
                for (M0.c cVar : this.f3004b) {
                    cVar.setCallback(null);
                }
                for (M0.c cVar2 : this.f3004b) {
                    cVar2.replace(iterable);
                }
                for (M0.c cVar3 : this.f3004b) {
                    cVar3.setCallback(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void reset() {
        synchronized (this.f3005c) {
            try {
                for (M0.c cVar : this.f3004b) {
                    cVar.reset();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
