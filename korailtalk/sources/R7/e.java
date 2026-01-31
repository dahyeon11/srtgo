package R7;

import java.lang.reflect.Field;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Field) obj).getName();
    }
}
