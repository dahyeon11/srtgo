package t0;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n7.C5998o;
import p0.C6048b;

/* renamed from: t0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6328N {
    public static final b Companion = new b(null);
    public static final int MEASUREMENT_API_STATE_DISABLED = 0;
    public static final int MEASUREMENT_API_STATE_ENABLED = 1;

    /* renamed from: t0.N$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC6328N obtain(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            C6048b c6048b = C6048b.INSTANCE;
            sb.append(c6048b.version());
            if (c6048b.version() >= 5) {
                return new a(context);
            }
            return null;
        }

        private b() {
        }
    }

    public static final AbstractC6328N obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object deleteRegistrations(C6336d c6336d, W6.d<? super R6.G> dVar);

    public abstract Object getMeasurementApiStatus(W6.d<? super Integer> dVar);

    public abstract Object registerSource(Uri uri, InputEvent inputEvent, W6.d<? super R6.G> dVar);

    public abstract Object registerTrigger(Uri uri, W6.d<? super R6.G> dVar);

    public abstract Object registerWebSource(C6330P c6330p, W6.d<? super R6.G> dVar);

    public abstract Object registerWebTrigger(C6332S c6332s, W6.d<? super R6.G> dVar);

    /* renamed from: t0.N$a */
    private static final class a extends AbstractC6328N {

        /* renamed from: a, reason: collision with root package name */
        private final MeasurementManager f36865a;

        public a(MeasurementManager mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.f36865a = mMeasurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest a(C6336d c6336d) {
            DeletionRequest deletionRequestBuild = AbstractC6358z.a().setDeletionMode(c6336d.getDeletionMode()).setMatchBehavior(c6336d.getMatchBehavior()).setStart(c6336d.getStart()).setEnd(c6336d.getEnd()).setDomainUris(c6336d.getDomainUris()).setOriginUris(c6336d.getOriginUris()).build();
            Intrinsics.checkNotNullExpressionValue(deletionRequestBuild, "Builder()\n              …\n                .build()");
            return deletionRequestBuild;
        }

        private final List b(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6329O c6329o = (C6329O) it.next();
                AbstractC6357y.a();
                WebSourceParams webSourceParamsBuild = AbstractC6356x.a(c6329o.getRegistrationUri()).setDebugKeyAllowed(c6329o.getDebugKeyAllowed()).build();
                Intrinsics.checkNotNullExpressionValue(webSourceParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webSourceParamsBuild);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest c(C6330P c6330p) {
            AbstractC6317C.a();
            WebSourceRegistrationRequest webSourceRegistrationRequestBuild = AbstractC6316B.a(b(c6330p.getWebSourceParams()), c6330p.getTopOriginUri()).setWebDestination(c6330p.getWebDestination()).setAppDestination(c6330p.getAppDestination()).setInputEvent(c6330p.getInputEvent()).setVerifiedDestination(c6330p.getVerifiedDestination()).build();
            Intrinsics.checkNotNullExpressionValue(webSourceRegistrationRequestBuild, "Builder(\n               …\n                .build()");
            return webSourceRegistrationRequestBuild;
        }

        private final List d(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6331Q c6331q = (C6331Q) it.next();
                AbstractC6355w.a();
                WebTriggerParams webTriggerParamsBuild = AbstractC6354v.a(c6331q.getRegistrationUri()).setDebugKeyAllowed(c6331q.getDebugKeyAllowed()).build();
                Intrinsics.checkNotNullExpressionValue(webTriggerParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webTriggerParamsBuild);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest e(C6332S c6332s) {
            AbstractC6319E.a();
            WebTriggerRegistrationRequest webTriggerRegistrationRequestBuild = AbstractC6318D.a(d(c6332s.getWebTriggerParams()), c6332s.getDestination()).build();
            Intrinsics.checkNotNullExpressionValue(webTriggerRegistrationRequestBuild, "Builder(\n               …\n                .build()");
            return webTriggerRegistrationRequestBuild;
        }

        @Override // t0.AbstractC6328N
        public Object deleteRegistrations(C6336d c6336d, W6.d<? super R6.G> dVar) {
            C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
            c5998o.initCancellability();
            this.f36865a.deleteRegistrations(a(c6336d), new ExecutorC6327M(), androidx.core.os.p.asOutcomeReceiver(c5998o));
            Object result = c5998o.getResult();
            if (result == X6.b.getCOROUTINE_SUSPENDED()) {
                Y6.h.probeCoroutineSuspended(dVar);
            }
            return result == X6.b.getCOROUTINE_SUSPENDED() ? result : R6.G.INSTANCE;
        }

        @Override // t0.AbstractC6328N
        public Object getMeasurementApiStatus(W6.d<? super Integer> dVar) {
            C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
            c5998o.initCancellability();
            this.f36865a.getMeasurementApiStatus(new ExecutorC6327M(), androidx.core.os.p.asOutcomeReceiver(c5998o));
            Object result = c5998o.getResult();
            if (result == X6.b.getCOROUTINE_SUSPENDED()) {
                Y6.h.probeCoroutineSuspended(dVar);
            }
            return result;
        }

        @Override // t0.AbstractC6328N
        public Object registerSource(Uri uri, InputEvent inputEvent, W6.d<? super R6.G> dVar) {
            C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
            c5998o.initCancellability();
            this.f36865a.registerSource(uri, inputEvent, new ExecutorC6327M(), androidx.core.os.p.asOutcomeReceiver(c5998o));
            Object result = c5998o.getResult();
            if (result == X6.b.getCOROUTINE_SUSPENDED()) {
                Y6.h.probeCoroutineSuspended(dVar);
            }
            return result == X6.b.getCOROUTINE_SUSPENDED() ? result : R6.G.INSTANCE;
        }

        @Override // t0.AbstractC6328N
        public Object registerTrigger(Uri uri, W6.d<? super R6.G> dVar) {
            C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
            c5998o.initCancellability();
            this.f36865a.registerTrigger(uri, new ExecutorC6327M(), androidx.core.os.p.asOutcomeReceiver(c5998o));
            Object result = c5998o.getResult();
            if (result == X6.b.getCOROUTINE_SUSPENDED()) {
                Y6.h.probeCoroutineSuspended(dVar);
            }
            return result == X6.b.getCOROUTINE_SUSPENDED() ? result : R6.G.INSTANCE;
        }

        @Override // t0.AbstractC6328N
        public Object registerWebSource(C6330P c6330p, W6.d<? super R6.G> dVar) {
            C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
            c5998o.initCancellability();
            this.f36865a.registerWebSource(c(c6330p), new ExecutorC6327M(), androidx.core.os.p.asOutcomeReceiver(c5998o));
            Object result = c5998o.getResult();
            if (result == X6.b.getCOROUTINE_SUSPENDED()) {
                Y6.h.probeCoroutineSuspended(dVar);
            }
            return result == X6.b.getCOROUTINE_SUSPENDED() ? result : R6.G.INSTANCE;
        }

        @Override // t0.AbstractC6328N
        public Object registerWebTrigger(C6332S c6332s, W6.d<? super R6.G> dVar) {
            C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
            c5998o.initCancellability();
            this.f36865a.registerWebTrigger(e(c6332s), new ExecutorC6327M(), androidx.core.os.p.asOutcomeReceiver(c5998o));
            Object result = c5998o.getResult();
            if (result == X6.b.getCOROUTINE_SUSPENDED()) {
                Y6.h.probeCoroutineSuspended(dVar);
            }
            return result == X6.b.getCOROUTINE_SUSPENDED() ? result : R6.G.INSTANCE;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService((Class<Object>) AbstractC6338f.a());
            Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…:class.java\n            )");
            this(AbstractC6339g.a(systemService));
        }
    }
}
