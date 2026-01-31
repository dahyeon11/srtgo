package s4;

import Q7.X;
import android.content.Context;
import android.graphics.Color;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6626B;
import z4.C6630d;
import z4.J;
import z4.N;

/* loaded from: classes.dex */
public class x extends C6219c {

    /* renamed from: q */
    private List f36282q;

    /* renamed from: r */
    private ListView f36283r;

    private class b extends BaseAdapter {

        /* renamed from: a */
        private final int f36284a;

        /* renamed from: b */
        private final LayoutInflater f36285b;

        private class a {

            /* renamed from: a */
            private View f36287a;

            /* renamed from: b */
            private View f36288b;

            /* renamed from: c */
            private FrameLayout f36289c;

            /* renamed from: d */
            private TextView f36290d;

            /* renamed from: e */
            private TextView f36291e;

            /* renamed from: f */
            private TextView f36292f;

            private a() {
            }

            /* synthetic */ a(b bVar, a aVar) {
                this();
            }
        }

        /* synthetic */ b(x xVar, Context context, a aVar) {
            this(context);
        }

        private int a() {
            return (int) Math.ceil(((ReservationResponse.JrnyInfo) x.this.f36282q.get(0)).getSeat_infos().getSeat_info().size() / 2.0d);
        }

        private ReservationResponse.SeatInfo b(int i8, int i9) {
            return ((ReservationResponse.JrnyInfo) x.this.f36282q.get(i8)).getSeat_infos().getSeat_info().get(i9);
        }

        private int c(int i8) {
            return i8 / a();
        }

        private int d(int i8) {
            return (i8 % a()) * 2;
        }

        private void e(int i8, int i9, TextView textView) {
            try {
                ReservationResponse.SeatInfo seatInfoB = b(i8, i9);
                textView.setText(N.applySpannable(x.this.d(AbstractC5959j.common_cart_no, Integer.valueOf(Integer.parseInt(seatInfoB.getH_srcar_no()))) + X.SPACE + seatInfoB.getH_seat_no(), new ForegroundColorSpan(Color.parseColor("#4f3480")), new AbsoluteSizeSpan(N.dpToPx(16.0f))));
                textView.append(X.LF);
                textView.append(N.applySpannable(J.getSeatDirectionName(seatInfoB.getH_dir_seat_att_cd()), new ForegroundColorSpan(Color.parseColor("#666666")), new AbsoluteSizeSpan(N.dpToPx(13.0f))));
                textView.append(N.applySpannable(" | ", new ForegroundColorSpan(Color.parseColor("#CCCCCC")), new AbsoluteSizeSpan(N.dpToPx(13.0f))));
                textView.append(N.applySpannable(C6626B.getPassengerNm(x.this.getContext(), seatInfoB), new ForegroundColorSpan(Color.parseColor("#666666")), new AbsoluteSizeSpan(N.dpToPx(13.0f))));
            } catch (IndexOutOfBoundsException unused) {
                textView.setText("");
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(x.this.f36282q)) {
                return 0;
            }
            return x.this.f36282q.size() * a();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            View viewInflate;
            a aVar;
            if (C6630d.isNull(view)) {
                aVar = new a();
                viewInflate = this.f36285b.inflate(AbstractC5957h.item_seat_info, viewGroup, false);
                aVar.f36289c = (FrameLayout) viewInflate.findViewById(AbstractC5955f.v_item_seat_info_img);
                aVar.f36290d = (TextView) viewInflate.findViewById(AbstractC5955f.tv_item_seat_info_img);
                aVar.f36291e = (TextView) viewInflate.findViewById(AbstractC5955f.tv_item_seat_info_0);
                aVar.f36292f = (TextView) viewInflate.findViewById(AbstractC5955f.tv_item_seat_info_1);
                aVar.f36287a = viewInflate.findViewById(AbstractC5955f.v_item_seat_info_divider_0);
                aVar.f36288b = viewInflate.findViewById(AbstractC5955f.v_item_seat_info_divider_1);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            int iA = a();
            int iC = c(i8);
            int iD = d(i8);
            if (x.this.f36282q.size() == 1) {
                aVar.f36289c.setVisibility(8);
                aVar.f36287a.setVisibility(0);
                aVar.f36288b.setVisibility(0);
            } else {
                if (iC == 0 && iD == 0) {
                    aVar.f36289c.setVisibility(0);
                    aVar.f36290d.setText(x.this.c(AbstractC5959j.common_preceding));
                } else if (1 == iC && iD == 0) {
                    aVar.f36289c.setVisibility(0);
                    aVar.f36290d.setText(x.this.c(AbstractC5959j.common_trailing));
                } else {
                    aVar.f36289c.setVisibility(4);
                }
                if (iD == (iA - 1) * 2) {
                    aVar.f36287a.setVisibility(0);
                } else {
                    aVar.f36287a.setVisibility(4);
                }
            }
            e(iC, iD, aVar.f36291e);
            e(iC, iD + 1, aVar.f36292f);
            return viewInflate;
        }

        private b(Context context) {
            this.f36284a = 2;
            this.f36285b = LayoutInflater.from(context);
        }
    }

    public x(Context context) {
        super(context);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_seat_info);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        this.f36283r = (ListView) a(AbstractC5955f.dialog_list);
    }

    public C6219c setListData(List<ReservationResponse.JrnyInfo> list) {
        this.f36282q = list;
        this.f36283r.setAdapter((ListAdapter) new b(getContext()));
        return this;
    }
}
