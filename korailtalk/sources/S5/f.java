package S5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.korail.talk.network.dao.research.SearchSeatListDao;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import r4.l;
import r4.p;
import y6.C6541a;

/* loaded from: classes.dex */
public class f extends C6541a {
    public f(Context context) {
        super(context);
    }

    private void d() {
        View.inflate(getContext(), AbstractC5957h.seat_arrow, this).setEnabled(false);
    }

    private void e() {
        View.inflate(getContext(), AbstractC5957h.seat_normal_forward, this).setVisibility(4);
    }

    private void f() {
        View.inflate(getContext(), AbstractC5957h.seat_floor, this).setEnabled(false);
    }

    private void g(int i8, SearchSeatListDao.Seat seat) {
        boolean zIsAvailabilitySeat = E4.a.isAvailabilitySeat(seat);
        View.inflate(getContext(), i8, this);
        ((TextView) findViewById(AbstractC5955f.seatNoTxt)).setText(seat.getSeat_spec());
        findViewById(AbstractC5955f.seatView).setEnabled(zIsAvailabilitySeat);
        findViewById(AbstractC5955f.seatNoTxt).setEnabled(zIsAvailabilitySeat);
        setEnabled(zIsAvailabilitySeat);
    }

    private void h(int i8, int i9, SearchSeatListDao.Seat seat) {
        g(i8, seat);
        ((ImageView) findViewById(AbstractC5955f.iconImg)).setImageResource(i9);
    }

    private void setSeatInfo(SearchSeatListDao.Seat seat) {
        String rq_seat_att_cd = seat.getRq_seat_att_cd();
        boolean zEquals = l.RIGHT.getCode().equals(seat.getDir_seat_att_cd());
        if (E4.a.isEmptyView(seat)) {
            e();
            return;
        }
        if (E4.a.isFloor(seat)) {
            f();
            return;
        }
        if (E4.a.isArrowView(seat)) {
            d();
            return;
        }
        if (p.WITH_CHILD.getCode().equals(rq_seat_att_cd)) {
            h(zEquals ? AbstractC5957h.seat_util_forward : AbstractC5957h.seat_util_backward, AbstractC5954e.selector_seat_icon_baby_accompany, seat);
            return;
        }
        if (p.NOTEBOOK.getCode().equals(rq_seat_att_cd)) {
            h(zEquals ? AbstractC5957h.seat_util_forward : AbstractC5957h.seat_util_backward, AbstractC5954e.selector_seat_icon_laptop, seat);
            return;
        }
        if (p.WHEELCHAIR.getCode().equals(rq_seat_att_cd)) {
            h(zEquals ? AbstractC5957h.seat_util_forward : AbstractC5957h.seat_util_backward, AbstractC5954e.selector_seat_icon_wheelchair, seat);
            return;
        }
        if (p.AUTO_WHEELCHAIR.getCode().equals(rq_seat_att_cd)) {
            h(zEquals ? AbstractC5957h.seat_util_forward : AbstractC5957h.seat_util_backward, AbstractC5954e.selector_seat_icon_elec_wheelchair, seat);
        } else if (p.BICYCLE.getCode().equals(rq_seat_att_cd)) {
            h(zEquals ? AbstractC5957h.seat_util_forward : AbstractC5957h.seat_util_backward, AbstractC5954e.selector_seat_icon_bicycle, seat);
        } else {
            if (p.DISABLED.getCode().equals(rq_seat_att_cd)) {
                return;
            }
            g(zEquals ? AbstractC5957h.seat_normal_forward : AbstractC5957h.seat_normal_backward, seat);
        }
    }

    public f(Context context, SearchSeatListDao.Seat seat) {
        super(context);
        setSeatInfo(seat);
    }
}
