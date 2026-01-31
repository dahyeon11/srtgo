package v7;

import f7.q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37329a;

    /* renamed from: b, reason: collision with root package name */
    private final q f37330b;

    /* renamed from: c, reason: collision with root package name */
    private final q f37331c;

    /* renamed from: d, reason: collision with root package name */
    private final q f37332d;

    public g(Object obj, q qVar, q qVar2, q qVar3) {
        this.f37329a = obj;
        this.f37330b = qVar;
        this.f37331c = qVar2;
        this.f37332d = qVar3;
    }

    @Override // v7.f, v7.j
    public Object getClauseObject() {
        return this.f37329a;
    }

    @Override // v7.f, v7.j
    public q getOnCancellationConstructor() {
        return this.f37332d;
    }

    @Override // v7.f, v7.j
    public q getProcessResFunc() {
        return this.f37331c;
    }

    @Override // v7.f, v7.j
    public q getRegFunc() {
        return this.f37330b;
    }

    public /* synthetic */ g(Object obj, q qVar, q qVar2, q qVar3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, qVar, qVar2, (i8 & 8) != 0 ? null : qVar3);
    }
}
