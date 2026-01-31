package q5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.dao.certification.BusReservationListDao;
import com.korail.talk.viewGroup.ReserveButton;
import g5.e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6112a extends RecyclerView.h {
    public static final String STATE_NAME_INSUFFICIENT_SEATS = "좌석부족";
    public static final String STATE_NAME_NONE = "예매";
    public static final String STATE_NAME_SOLD_OUT = "매진";

    /* renamed from: d, reason: collision with root package name */
    private Context f34945d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f34946e;

    /* renamed from: f, reason: collision with root package name */
    private int f34947f;

    /* renamed from: g, reason: collision with root package name */
    private String f34948g;

    /* renamed from: h, reason: collision with root package name */
    private c f34949h;
    public final int RES_ID_BACKGROUND_NORMAL = AbstractC5954e.bg_reserve_button_normal;
    public final int RES_ID_BACKGROUND_RED = AbstractC5954e.bg_reserve_button_redbox;
    public final int RES_ID_BACKGROUND_GREY = AbstractC5954e.bg_reserve_button_graybox;
    public final int TEXT_COLOR_NORMAL = e.TEXT_COLOR_NORMAL;
    public final int TEXT_COLOR_RED = e.TEXT_COLOR_RED;
    public final int TEXT_COLOR_ORANGE = e.TEXT_COLOR_ORANGE;
    public final int TEXT_COLOR_GREY = e.TEXT_COLOR_GREY;

    /* renamed from: q5.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0369a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34950a;

        ViewOnClickListenerC0369a(int i8) {
            this.f34950a = i8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C6112a.this.f34949h != null) {
                C6112a.this.f34949h.onClick(this.f34950a);
            }
        }
    }

    /* renamed from: q5.a$b */
    public static class b extends RecyclerView.E {

        /* renamed from: t, reason: collision with root package name */
        private final TextView f34952t;

        /* renamed from: u, reason: collision with root package name */
        private final TextView f34953u;

        /* renamed from: v, reason: collision with root package name */
        private final TextView f34954v;

        /* renamed from: w, reason: collision with root package name */
        private final ReserveButton f34955w;

        public b(View view) {
            super(view);
            this.f34952t = (TextView) view.findViewById(AbstractC5955f.deptTime);
            this.f34953u = (TextView) view.findViewById(AbstractC5955f.deptName);
            this.f34954v = (TextView) view.findViewById(AbstractC5955f.arrvName);
            this.f34955w = (ReserveButton) view.findViewById(AbstractC5955f.reserveButton);
        }

        public TextView getArrvName() {
            return this.f34954v;
        }

        public TextView getDeptName() {
            return this.f34953u;
        }

        public TextView getDeptTime() {
            return this.f34952t;
        }

        public ReserveButton getReserveButton() {
            return this.f34955w;
        }
    }

    /* renamed from: q5.a$c */
    public interface c {
        void onClick(int i8);
    }

    public C6112a(Context context, ArrayList<BusReservationListDao.BusList> arrayList, int i8, String str) {
        this.f34945d = context;
        this.f34946e = arrayList;
        this.f34947f = i8;
        this.f34948g = str;
    }

    private String c(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmss");
        try {
            return new SimpleDateFormat("HH:mm").format(simpleDateFormat.parse(str));
        } catch (ParseException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(com.korail.talk.viewGroup.ReserveButton r5, com.korail.talk.network.dao.certification.BusReservationListDao.BusList r6, int r7) throws java.lang.NumberFormatException {
        /*
            r4 = this;
            java.lang.String r6 = r6.getGnrmRestSeatNum()
            int r6 = java.lang.Integer.parseInt(r6)
            int r0 = r4.RES_ID_BACKGROUND_NORMAL
            r1 = 0
            if (r6 != 0) goto L16
            int r0 = r4.RES_ID_BACKGROUND_RED
            r6 = -1029854(0xfffffffffff04922, float:NaN)
            java.lang.String r2 = "매진"
        L14:
            r3 = r1
            goto L28
        L16:
            int r2 = r4.f34947f
            if (r6 >= r2) goto L22
            int r0 = r4.RES_ID_BACKGROUND_GREY
            r6 = -6710887(0xffffffffff999999, float:NaN)
            java.lang.String r2 = "좌석부족"
            goto L14
        L22:
            r6 = -16750925(0xffffffffff0066b3, float:-1.7067443E38)
            java.lang.String r2 = "예매"
            r3 = 1
        L28:
            r5.setButtonBackground(r0)
            r5.setFirstText(r2, r6, r1)
            java.lang.String r0 = ""
            r5.setSecondText(r0, r6, r1)
            if (r3 == 0) goto L3e
            q5.a$a r6 = new q5.a$a
            r6.<init>(r7)
            r5.setOnClickListener(r6)
            goto L42
        L3e:
            r6 = 0
            r5.setOnClickListener(r6)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.C6112a.d(com.korail.talk.viewGroup.ReserveButton, com.korail.talk.network.dao.certification.BusReservationListDao$BusList, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f34946e.size();
    }

    public void setItemClickListener(c cVar) {
        this.f34949h = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(b bVar, int i8) throws NumberFormatException {
        BusReservationListDao.BusList busList = (BusReservationListDao.BusList) this.f34946e.get(i8);
        bVar.getDeptTime().setText(c(busList.getDptTm()));
        bVar.getArrvName().setText(this.f34948g);
        d(bVar.getReserveButton(), busList, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public b onCreateViewHolder(ViewGroup viewGroup, int i8) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.item_limousine_list, viewGroup, false));
    }
}
