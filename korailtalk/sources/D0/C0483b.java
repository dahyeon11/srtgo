package D0;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: D0.b */
/* loaded from: classes.dex */
public class C0483b extends C0498q {
    public C0483b() {
        K();
    }

    private void K() {
        setOrdering(1);
        addTransition(new C0485d(2)).addTransition(new C0484c()).addTransition(new C0485d(1));
    }

    public C0483b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        K();
    }
}
