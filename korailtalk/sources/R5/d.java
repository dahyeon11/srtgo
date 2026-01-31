package R5;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.data.reservation.ReservationMessageData;
import n4.AbstractC5955f;
import z4.N;

/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: v, reason: collision with root package name */
    private TextView f4459v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f4460w;

    public d(P5.d dVar, View view) {
        super(dVar, view);
    }

    @Override // R5.a
    public void setText(Q5.b bVar, int i8) {
        ReservationMessageData commissionList = bVar.getCommissionList();
        String title = commissionList.getTitle();
        this.f4459v.setText(title);
        this.f4459v.setVisibility(N.isNull(title) ? 8 : 0);
        K(commissionList.getMessageList(), this.f4460w);
    }

    @Override // R5.a
    public void setView(Q5.b bVar, int i8) {
        this.f4459v = (TextView) this.itemView.findViewById(AbstractC5955f.tv_reservation_confirm_message_title);
        TextView textView = (TextView) this.itemView.findViewById(AbstractC5955f.tv_reservation_confirm_message);
        this.f4460w = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
