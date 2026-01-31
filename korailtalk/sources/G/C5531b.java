package g;

import R6.p;
import R6.v;
import S6.AbstractC0765i;
import S6.Q;
import S6.r;
import android.content.Context;
import android.content.Intent;
import g.AbstractC5530a;
import j7.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5531b extends AbstractC5530a {
    public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
    public static final a Companion = new a(null);
    public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
    public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

    /* renamed from: g.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent createIntent$activity_release(String[] input) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent(C5531b.ACTION_REQUEST_PERMISSIONS).putExtra(C5531b.EXTRA_PERMISSIONS, input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        private a() {
        }
    }

    @Override // g.AbstractC5530a
    public Intent createIntent(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return Companion.createIntent$activity_release(input);
    }

    @Override // g.AbstractC5530a
    public AbstractC5530a.C0300a getSynchronousResult(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new AbstractC5530a.C0300a(Q.emptyMap());
        }
        for (String str : input) {
            if (androidx.core.content.a.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s.coerceAtLeast(Q.mapCapacity(input.length), 16));
        for (String str2 : input) {
            p pVar = v.to(str2, Boolean.TRUE);
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return new AbstractC5530a.C0300a(linkedHashMap);
    }

    @Override // g.AbstractC5530a
    public Map<String, Boolean> parseResult(int i8, Intent intent) {
        if (i8 != -1) {
            return Q.emptyMap();
        }
        if (intent == null) {
            return Q.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
        int[] intArrayExtra = intent.getIntArrayExtra(EXTRA_PERMISSION_GRANT_RESULTS);
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Q.emptyMap();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i9 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i9 == 0));
        }
        return Q.toMap(r.zip(AbstractC0765i.filterNotNull(stringArrayExtra), arrayList));
    }
}
