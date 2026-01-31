package s4;

import Q7.X;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.dao.research.MergeSeatInquiryDao;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.viewGroup.DropDownSelector;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6625A;
import z4.C6630d;
import z4.C6634h;

/* renamed from: s4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6221e extends C6219c implements DropDownSelector.b {

    /* renamed from: q, reason: collision with root package name */
    private ArrayList f36199q;

    /* renamed from: r, reason: collision with root package name */
    private c f36200r;

    /* renamed from: s, reason: collision with root package name */
    private ListView f36201s;

    /* renamed from: t, reason: collision with root package name */
    private b f36202t;

    /* renamed from: u, reason: collision with root package name */
    private TextView f36203u;

    /* renamed from: v, reason: collision with root package name */
    private TextView f36204v;

    /* renamed from: s4.e$b */
    private class b extends BaseAdapter {

        /* renamed from: s4.e$b$a */
        private class a {
            public TextView mTvArrivalInfo;
            public TextView mTvDepartureInfo;
            public TextView mTvSeatStatus;

            private a() {
            }
        }

        private b() {
        }

        private RsvInquiryResponse.TrainInfo a(int i8) {
            return (RsvInquiryResponse.TrainInfo) C6221e.this.f36199q.get(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(C6221e.this.f36199q)) {
                return 0;
            }
            return C6221e.this.f36199q.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return C6221e.this.f36199q.get(i8);
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
                viewInflate = View.inflate(viewGroup.getContext(), AbstractC5957h.connecting_station_list_item, null);
                aVar.mTvDepartureInfo = (TextView) viewInflate.findViewById(AbstractC5955f.tv_departure_info);
                aVar.mTvArrivalInfo = (TextView) viewInflate.findViewById(AbstractC5955f.tv_arrival_info);
                aVar.mTvSeatStatus = (TextView) viewInflate.findViewById(AbstractC5955f.tv_seat_status);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            RsvInquiryResponse.TrainInfo trainInfoA = a(i8);
            aVar.mTvDepartureInfo.setText(String.format(C6634h.convertFormat(trainInfoA.getH_dpt_tm(), "HHmmss", "HH:mm"), new Object[0]) + X.LF + trainInfoA.getH_dpt_rs_stn_nm());
            aVar.mTvArrivalInfo.setText(String.format(C6634h.convertFormat(trainInfoA.getH_arv_tm(), "HHmmss", "HH:mm"), new Object[0]) + X.LF + trainInfoA.getH_arv_rs_stn_nm());
            aVar.mTvSeatStatus.setText(trainInfoA.getH_jrny_rsv_nm());
            return viewInflate;
        }
    }

    /* renamed from: s4.e$c */
    public interface c {
        void onMidStationSelect(int i8);
    }

    public C6221e(Context context) {
        super(context);
    }

    private void t(List list) {
        this.f36199q.clear();
        this.f36199q.addAll(list);
        b bVar = new b();
        this.f36202t = bVar;
        this.f36201s.setAdapter((ListAdapter) bVar);
        this.f36202t.notifyDataSetChanged();
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_connecting_station);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        this.f36199q = new ArrayList();
        this.f36201s = (ListView) a(AbstractC5955f.lv_connecting_station);
        this.f36203u = (TextView) a(AbstractC5955f.trainNumber);
        this.f36204v = (TextView) a(AbstractC5955f.dateText);
    }

    @Override // com.korail.talk.viewGroup.DropDownSelector.b
    public void onItemSelected(DropDownSelector dropDownSelector, int i8) {
        if (C6630d.isNotNull(this.f36200r)) {
            this.f36200r.onMidStationSelect(i8);
        }
    }

    public C6221e setMidStationSelectListener(c cVar) {
        this.f36200r = cVar;
        return this;
    }

    public C6221e setStationFilterView(ArrayList<String> arrayList, int i8) {
        DropDownSelector dropDownSelector = (DropDownSelector) a(AbstractC5955f.stationFilter);
        dropDownSelector.changeResourceId(AbstractC5954e.bg_drop_down_selector_pop_dark, AbstractC5954e.ic_unfold_dropdown_big);
        dropDownSelector.setOnSelectorItemClickListener(this);
        dropDownSelector.setEntries(C6625A.toArray(arrayList), (String[]) null, i8);
        return this;
    }

    public C6221e setTrainInfo(MergeSeatInquiryDao.MergeSeatInquiryResponse mergeSeatInquiryResponse) {
        RsvInquiryResponse.TrainInfo trainInfo = mergeSeatInquiryResponse.getTrnInfos().getTrn_info().get(0);
        this.f36203u.setText(mergeSeatInquiryResponse.getTrnInfos().getTrn_info().get(0).getH_trn_clsf_nm() + X.SPACE + mergeSeatInquiryResponse.getTrnInfos().getTrn_info().get(0).getH_trn_no());
        this.f36204v.setText(String.format(C6634h.convertFormat(trainInfo.getH_dpt_dt(), "yyyyMMdd", "yyyy.MM.dd. (E)"), new Object[0]));
        t(mergeSeatInquiryResponse.getTrnInfos().getTrn_info());
        this.f36179p.setEnabled(mergeSeatInquiryResponse.getTrnInfos().getH_merge_rsv_psb_flg().equals("Y"));
        return this;
    }
}
