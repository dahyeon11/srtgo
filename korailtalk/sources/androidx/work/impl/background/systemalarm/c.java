package androidx.work.impl.background.systemalarm;

import H0.l;
import P0.r;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f11165e = l.tagWithPrefix("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f11166a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11167b;

    /* renamed from: c, reason: collision with root package name */
    private final e f11168c;

    /* renamed from: d, reason: collision with root package name */
    private final L0.d f11169d;

    c(Context context, int i8, e eVar) {
        this.f11166a = context;
        this.f11167b = i8;
        this.f11168c = eVar;
        this.f11169d = new L0.d(context, eVar.d(), null);
    }

    void a() {
        List<r> scheduledWork = this.f11168c.e().getWorkDatabase().workSpecDao().getScheduledWork();
        ConstraintProxy.a(this.f11166a, scheduledWork);
        this.f11169d.replace(scheduledWork);
        ArrayList arrayList = new ArrayList(scheduledWork.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (r rVar : scheduledWork) {
            String str = rVar.id;
            if (jCurrentTimeMillis >= rVar.calculateNextRunTime() && (!rVar.hasConstraints() || this.f11169d.areAllConstraintsMet(str))) {
                arrayList.add(rVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((r) it.next()).id;
            Intent intentB = b.b(this.f11166a, str2);
            l.get().debug(f11165e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f11168c;
            eVar.i(new e.b(eVar, intentB, this.f11167b));
        }
        this.f11169d.reset();
    }
}
