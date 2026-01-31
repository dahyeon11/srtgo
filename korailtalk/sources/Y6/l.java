package Y6;

import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public abstract class l extends d implements FunctionBase {

    /* renamed from: d, reason: collision with root package name */
    private final int f5658d;

    public l(int i8, W6.d<Object> dVar) {
        super(dVar);
        this.f5658d = i8;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.f5658d;
    }

    @Override // Y6.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strRenderLambdaToString = Reflection.renderLambdaToString(this);
        Intrinsics.checkNotNullExpressionValue(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }

    public l(int i8) {
        this(i8, null);
    }
}
