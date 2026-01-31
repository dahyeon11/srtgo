package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import n7.C5998o;
import t0.ExecutorC6327M;

/* loaded from: classes.dex */
public class t extends d {

    /* renamed from: a */
    private final TopicsManager f10117a;

    static final class a extends Y6.d {

        /* renamed from: d */
        Object f10118d;

        /* renamed from: e */
        /* synthetic */ Object f10119e;

        /* renamed from: g */
        int f10121g;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f10119e = obj;
            this.f10121g |= Integer.MIN_VALUE;
            return t.a(t.this, null, this);
        }
    }

    public t(TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.f10117a = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object a(androidx.privacysandbox.ads.adservices.topics.t r4, androidx.privacysandbox.ads.adservices.topics.a r5, W6.d<? super androidx.privacysandbox.ads.adservices.topics.b> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.t.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.t$a r0 = (androidx.privacysandbox.ads.adservices.topics.t.a) r0
            int r1 = r0.f10121g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10121g = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.t$a r0 = new androidx.privacysandbox.ads.adservices.topics.t$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10119e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f10121g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f10118d
            androidx.privacysandbox.ads.adservices.topics.t r4 = (androidx.privacysandbox.ads.adservices.topics.t) r4
            R6.r.throwOnFailure(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            R6.r.throwOnFailure(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.convertRequest$ads_adservices_release(r5)
            r0.f10118d = r4
            r0.f10121g = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r5 = androidx.privacysandbox.ads.adservices.topics.m.a(r6)
            androidx.privacysandbox.ads.adservices.topics.b r4 = r4.convertResponse$ads_adservices_release(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.t.a(androidx.privacysandbox.ads.adservices.topics.t, androidx.privacysandbox.ads.adservices.topics.a, W6.d):java.lang.Object");
    }

    public final Object b(GetTopicsRequest getTopicsRequest, W6.d dVar) {
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.initCancellability();
        this.f10117a.getTopics(getTopicsRequest, new ExecutorC6327M(), androidx.core.os.p.asOutcomeReceiver(c5998o));
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public GetTopicsRequest convertRequest$ads_adservices_release(androidx.privacysandbox.ads.adservices.topics.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest getTopicsRequestBuild = k.a().setAdsSdkName(request.getAdsSdkName()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final b convertResponse$ads_adservices_release(GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicA = o.a(it.next());
            arrayList.add(new c(topicA.getTaxonomyVersion(), topicA.getModelVersion(), topicA.getTopicId()));
        }
        return new b(arrayList);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d
    public Object getTopics(androidx.privacysandbox.ads.adservices.topics.a aVar, W6.d<? super b> dVar) {
        return a(this, aVar, dVar);
    }
}
