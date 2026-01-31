package q5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.dao.certification.BusReservationSeatListDao;
import java.util.ArrayList;
import n4.AbstractC5953d;
import n4.AbstractC5955f;
import n4.AbstractC5957h;

/* renamed from: q5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6113b extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private Context f34956d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f34957e;

    /* renamed from: f, reason: collision with root package name */
    private c f34958f;

    /* renamed from: q5.b$a */
    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34959a;

        a(int i8) {
            this.f34959a = i8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C6113b.this.f34958f.onClick(this.f34959a);
        }
    }

    /* renamed from: q5.b$b, reason: collision with other inner class name */
    public static class C0370b extends RecyclerView.E {

        /* renamed from: t, reason: collision with root package name */
        private final ImageView f34961t;

        /* renamed from: u, reason: collision with root package name */
        private final TextView f34962u;

        /* renamed from: v, reason: collision with root package name */
        private final LinearLayout f34963v;

        public C0370b(View view) {
            super(view);
            this.f34961t = (ImageView) view.findViewById(AbstractC5955f.btn_seat);
            this.f34962u = (TextView) view.findViewById(AbstractC5955f.tv_seat_number);
            this.f34963v = (LinearLayout) view.findViewById(AbstractC5955f.contentLayout);
        }

        public ImageView getBtn_seat() {
            return this.f34961t;
        }

        public LinearLayout getContentLayout() {
            return this.f34963v;
        }

        public TextView getTv_seat_number() {
            return this.f34962u;
        }
    }

    /* renamed from: q5.b$c */
    public interface c {
        void onClick(int i8);
    }

    public C6113b(Context context, ArrayList<BusReservationSeatListDao.SeatList> arrayList) {
        this.f34956d = context;
        this.f34957e = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f34957e.size();
    }

    public void setItemClickListener(c cVar) {
        this.f34958f = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(C0370b c0370b, int i8) {
        BusReservationSeatListDao.SeatList seatList = (BusReservationSeatListDao.SeatList) this.f34957e.get(i8);
        if (seatList == null || seatList.getSeat_no() == null) {
            c0370b.getContentLayout().setVisibility(4);
        } else {
            c0370b.getContentLayout().setVisibility(0);
            c0370b.getTv_seat_number().setText(seatList.getSeat_no());
        }
        if (seatList.isSelected()) {
            c0370b.getBtn_seat().setSelected(true);
            c0370b.getTv_seat_number().setTextColor(androidx.core.content.a.getColor(this.f34956d, AbstractC5953d.white_two));
        } else {
            c0370b.getBtn_seat().setSelected(false);
            c0370b.getTv_seat_number().setTextColor(androidx.core.content.a.getColor(this.f34956d, AbstractC5953d.black));
        }
        if ("Y".equals(seatList.getSale_psb_flg())) {
            c0370b.getBtn_seat().setEnabled(true);
            c0370b.getContentLayout().setOnClickListener(new a(i8));
        } else {
            c0370b.getBtn_seat().setEnabled(false);
            c0370b.getContentLayout().setOnClickListener(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public C0370b onCreateViewHolder(ViewGroup viewGroup, int i8) {
        return new C0370b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.item_limousine_select_seat_grid, viewGroup, false));
    }
}
