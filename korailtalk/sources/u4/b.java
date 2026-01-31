package U4;

import U4.a;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.dao.trainsInfo.TourTrainInfoDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.p;
import r4.r;
import y6.C6550j;
import z4.C6630d;
import z4.J;
import z4.N;

/* loaded from: classes.dex */
public class b extends C6550j implements a.b, View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private final int f5042f;

    /* renamed from: g, reason: collision with root package name */
    private a f5043g;

    /* renamed from: h, reason: collision with root package name */
    private String f5044h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f5045i;

    /* renamed from: j, reason: collision with root package name */
    private U4.a f5046j;

    /* renamed from: k, reason: collision with root package name */
    private U4.a f5047k;

    public interface a {
        void onSeatTypeOptionSelected(p pVar, r rVar);
    }

    public b(Context context) {
        super(context);
        this.f5042f = 3;
    }

    private void i() {
        findViewById(AbstractC5955f.headerView).setOnClickListener(this);
    }

    private void j(String str, TourTrainInfoDao.SeatInfos seatInfos) {
        ArrayList arrayList = new ArrayList();
        if (J.isFamilySeatType(str)) {
            TextView textView = this.f5045i;
            r rVar = r.FAMILY;
            textView.setText(rVar.getName());
            arrayList.add(rVar.getName());
        } else if (C6630d.isNotNull(seatInfos)) {
            List<TourTrainInfoDao.SeatInfo> seat_info = seatInfos.getSeat_info();
            r[] rVarArrValues = r.values();
            Iterator<TourTrainInfoDao.SeatInfo> it = seat_info.iterator();
            while (it.hasNext()) {
                String h_seat_att_cd = it.next().getH_seat_att_cd();
                int length = rVarArrValues.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        r rVar2 = rVarArrValues[i8];
                        if (rVar2.getCode().equals(h_seat_att_cd)) {
                            arrayList.add(rVar2.getName());
                            break;
                        }
                        i8++;
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            findViewById(AbstractC5955f.roomType).setVisibility(8);
            return;
        }
        U4.a aVar = new U4.a(getContext(), (RecyclerView) findViewById(AbstractC5955f.roomTypeList), arrayList, Math.min(arrayList.size(), 3), J.isFamilySeatType(str) ? 0 : -1);
        this.f5047k = aVar;
        aVar.setListener(this);
    }

    private void k(String str, TourTrainInfoDao.SeatInfos seatInfos) {
        View.inflate(getContext(), AbstractC5957h.seat_type_option, this);
        this.f5045i = (TextView) findViewById(AbstractC5955f.headerVal0Txt);
        setSeatOption(str);
        j(str, seatInfos);
    }

    private void setData(String str) {
        this.f5044h = str;
    }

    private void setSeatOption(String str) {
        if (J.isFamilySeatType(str)) {
            findViewById(AbstractC5955f.seatOption).setVisibility(8);
            return;
        }
        U4.a aVar = new U4.a(getContext(), (RecyclerView) findViewById(AbstractC5955f.seatOptionList), J.getProductTrainSeatFilterData(), 3, 0);
        this.f5046j = aVar;
        aVar.setListener(this);
    }

    private void setText() {
        ((TextView) findViewById(AbstractC5955f.headerTitleTxt)).setText(getContext().getString(AbstractC5959j.booking_seat_attributes));
        this.f5045i.setText(p.DEFAULT.getName());
    }

    public String getSeatOption() {
        return this.f5044h;
    }

    public p getSelectedSeatOption() {
        String selectedName = this.f5046j.getSelectedName();
        if (N.isNotNull(selectedName)) {
            for (p pVar : p.values()) {
                if (selectedName.equals(pVar.getName())) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public r getSelectedSpecialRoom() {
        String selectedName = C6630d.isNotNull(this.f5047k) ? this.f5047k.getSelectedName() : null;
        if (!N.isNotNull(selectedName)) {
            return null;
        }
        for (r rVar : r.values()) {
            if (selectedName.equals(rVar.getName())) {
                return rVar;
            }
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.headerView == view.getId()) {
            onHeaderClick();
        }
    }

    @Override // U4.a.b
    public void onItemSelected(RecyclerView recyclerView, CharSequence charSequence) {
        int id = recyclerView.getId();
        if (AbstractC5955f.seatOptionList == id) {
            if (C6630d.isNotNull(this.f5047k)) {
                this.f5047k.unSelectAll();
            }
        } else if (AbstractC5955f.roomTypeList == id && C6630d.isNotNull(this.f5046j)) {
            this.f5046j.unSelectAll();
        }
        this.f5045i.setText(charSequence);
        p selectedSeatOption = getSelectedSeatOption();
        r selectedSpecialRoom = getSelectedSpecialRoom();
        this.f5044h = C6630d.isNotNull(selectedSeatOption) ? selectedSeatOption.getCode() : selectedSpecialRoom.getCode();
        if (C6630d.isNotNull(this.f5043g)) {
            this.f5043g.onSeatTypeOptionSelected(selectedSeatOption, selectedSpecialRoom);
        }
    }

    public void setSeatTypeOptionListener(a aVar) {
        this.f5043g = aVar;
    }

    public b(Context context, String str, TourTrainInfoDao.SeatInfos seatInfos) {
        this(context);
        setData(str);
        k(str, seatInfos);
        setText();
        i();
    }
}
