package Y6;

import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public abstract class k extends j implements FunctionBase {

    /* renamed from: b, reason: collision with root package name */
    private final int f5657b;

    public k(int i8, W6.d<Object> dVar) {
        super(dVar);
        this.f5657b = i8;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.f5657b;
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

    public k(int i8) {
        this(i8, null);
    }
}
