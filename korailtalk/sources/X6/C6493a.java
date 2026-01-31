package x6;

import android.content.Context;
import android.util.AttributeSet;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.List;
import n4.AbstractC5959j;
import s4.x;
import y6.C6542b;
import z4.C6637k;

/* renamed from: x6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6493a extends C6542b {

    /* renamed from: a, reason: collision with root package name */
    private List f37516a;

    public C6493a(Context context) {
        super(context);
    }

    protected void g() {
        ((x) C6637k.getDialog(2, getContext(), 1001, 1, b(AbstractC5959j.dialog_seat_info))).setListData(this.f37516a).showDialog();
    }

    public void setJrnyData(List<ReservationResponse.JrnyInfo> list) {
        this.f37516a = list;
    }

    public C6493a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
