package v7;

import f7.q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37325a;

    /* renamed from: b, reason: collision with root package name */
    private final q f37326b;

    /* renamed from: c, reason: collision with root package name */
    private final q f37327c;

    /* renamed from: d, reason: collision with root package name */
    private final q f37328d;

    public e(Object obj, q qVar, q qVar2) {
        this.f37325a = obj;
        this.f37326b = qVar;
        this.f37327c = qVar2;
        this.f37328d = n.f37355a;
    }

    @Override // v7.d, v7.j
    public Object getClauseObject() {
        return this.f37325a;
    }

    @Override // v7.d, v7.j
    public q getOnCancellationConstructor() {
        return this.f37327c;
    }

    @Override // v7.d, v7.j
    public q getProcessResFunc() {
        return this.f37328d;
    }

    @Override // v7.d, v7.j
    public q getRegFunc() {
        return this.f37326b;
    }

    public /* synthetic */ e(Object obj, q qVar, q qVar2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, qVar, (i8 & 4) != 0 ? null : qVar2);
    }
}
