package v7;

import f7.q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37333a;

    /* renamed from: b, reason: collision with root package name */
    private final q f37334b;

    /* renamed from: c, reason: collision with root package name */
    private final q f37335c;

    /* renamed from: d, reason: collision with root package name */
    private final q f37336d;

    public i(Object obj, q qVar, q qVar2, q qVar3) {
        this.f37333a = obj;
        this.f37334b = qVar;
        this.f37335c = qVar2;
        this.f37336d = qVar3;
    }

    @Override // v7.h, v7.j
    public Object getClauseObject() {
        return this.f37333a;
    }

    @Override // v7.h, v7.j
    public q getOnCancellationConstructor() {
        return this.f37336d;
    }

    @Override // v7.h, v7.j
    public q getProcessResFunc() {
        return this.f37335c;
    }

    @Override // v7.h, v7.j
    public q getRegFunc() {
        return this.f37334b;
    }

    public /* synthetic */ i(Object obj, q qVar, q qVar2, q qVar3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, qVar, qVar2, (i8 & 8) != 0 ? null : qVar3);
    }
}
