package s4;

import android.content.Context;
import n4.AbstractC5955f;
import n4.AbstractC5957h;

/* loaded from: classes.dex */
public class u extends C6219c {
    public u(Context context) {
        super(context);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_passenger_info);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        if (I4.h.getInstance().isCustLeadFlg()) {
            a(AbstractC5955f.ll_guide_dog_info).setVisibility(0);
        } else {
            a(AbstractC5955f.ll_guide_dog_info).setVisibility(8);
        }
    }
}
