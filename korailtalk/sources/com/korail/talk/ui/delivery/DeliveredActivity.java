package com.korail.talk.ui.delivery;

import Q7.X;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.ticket.PbpAcepSpecDao;
import com.korail.talk.network.dao.ticket.PbpAcepSpecDao.PbpAcepSpecRequest;
import com.korail.talk.network.dao.ticket.PbpTkWdrwDao;
import com.korail.talk.network.dao.ticket.PbpTkWdrwDao.PbpTkWdrwRequest;
import com.korail.talk.view.base.BaseViewActivity;
import g5.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.c;
import z4.C6625A;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class DeliveredActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private List f27944i;

    /* renamed from: j, reason: collision with root package name */
    private c f27945j;

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private String f27946a;

        /* renamed from: b, reason: collision with root package name */
        private String f27947b;

        /* renamed from: c, reason: collision with root package name */
        private String f27948c;

        /* renamed from: d, reason: collision with root package name */
        private String f27949d;

        /* renamed from: e, reason: collision with root package name */
        private int f27950e;

        /* renamed from: f, reason: collision with root package name */
        private String f27951f;

        /* renamed from: g, reason: collision with root package name */
        private String f27952g;

        /* renamed from: h, reason: collision with root package name */
        private String f27953h;

        /* renamed from: i, reason: collision with root package name */
        private String f27954i;

        /* renamed from: j, reason: collision with root package name */
        private String f27955j;

        /* renamed from: k, reason: collision with root package name */
        private String f27956k;

        private b() {
        }

        public String getAcepCustNm() {
            return this.f27949d;
        }

        public String getAcepCustTeln() {
            return this.f27952g;
        }

        public String getMbDvNm() {
            return this.f27951f;
        }

        public String getPbpAcepKndNm() {
            return this.f27956k;
        }

        public String getPbpRsvNo() {
            return this.f27947b;
        }

        public String getPnrNo() {
            return this.f27946a;
        }

        public String getRegDt() {
            return this.f27955j;
        }

        public String getSeatInfo() {
            return this.f27953h;
        }

        public int getTkCount() {
            return this.f27950e;
        }

        public String getTkNo() {
            return this.f27954i;
        }

        public String getWdrwPsbFlg() {
            return this.f27948c;
        }

        public void setAcepCustNm(String str) {
            this.f27949d = str;
        }

        public void setAcepCustTeln(String str) {
            this.f27952g = str;
        }

        public void setMbDvNm(String str) {
            this.f27951f = str;
        }

        public void setPbpAcepKndNm(String str) {
            this.f27956k = str;
        }

        public void setPbpRsvNo(String str) {
            this.f27947b = str;
        }

        public void setPnrNo(String str) {
            this.f27946a = str;
        }

        public void setRegDt(String str) {
            this.f27955j = str;
        }

        public void setSeatInfo(String str) {
            this.f27953h = str;
        }

        public void setTkCount(int i8) {
            this.f27950e = i8;
        }

        public void setTkNo(String str) {
            this.f27954i = str;
        }

        public void setWdrwPsbFlg(String str) {
            this.f27948c = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f27958a;

        /* renamed from: b, reason: collision with root package name */
        private List f27959b;

        private class a {

            /* renamed from: a, reason: collision with root package name */
            private TextView f27961a;

            /* renamed from: b, reason: collision with root package name */
            private TextView f27962b;

            /* renamed from: c, reason: collision with root package name */
            private TextView f27963c;

            /* renamed from: d, reason: collision with root package name */
            private TextView f27964d;

            /* renamed from: e, reason: collision with root package name */
            private TextView f27965e;

            /* renamed from: f, reason: collision with root package name */
            private TextView f27966f;

            /* renamed from: g, reason: collision with root package name */
            private TextView f27967g;

            /* renamed from: h, reason: collision with root package name */
            private TextView f27968h;

            private a() {
            }
        }

        public c() {
            this.f27958a = DeliveredActivity.this.getLayoutInflater();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(int i8, DialogInterface dialogInterface, int i9) {
            if (102 == i9) {
                DeliveredActivity.this.x0(i8);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(View view, final int i8) {
            C6637k.getCDialog(DeliveredActivity.this.K(), 1002, 0, DeliveredActivity.this.getString(AbstractC5959j.delivered_redeem_your_ticket)).setContent(DeliveredActivity.this.getString(AbstractC5959j.to_retrieve_message1)).setButtonListener(new DialogInterface.OnClickListener() { // from class: com.korail.talk.ui.delivery.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    this.f27978a.c(i8, dialogInterface, i9);
                }
            }).showDialog();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(this.f27959b)) {
                return 0;
            }
            return this.f27959b.size();
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
                viewInflate = this.f27958a.inflate(AbstractC5957h.list_item_delivered, viewGroup, false);
                aVar.f27961a = (TextView) viewInflate.findViewById(AbstractC5955f.list_item_delivered_name);
                aVar.f27962b = (TextView) viewInflate.findViewById(AbstractC5955f.list_item_delivered_to_retrieve);
                aVar.f27963c = (TextView) viewInflate.findViewById(AbstractC5955f.list_item_delivered_member_id);
                aVar.f27964d = (TextView) viewInflate.findViewById(AbstractC5955f.list_item_delivered_hp_no);
                aVar.f27967g = (TextView) viewInflate.findViewById(AbstractC5955f.list_item_delivered_seat);
                aVar.f27965e = (TextView) viewInflate.findViewById(AbstractC5955f.list_item_delivered_return_no);
                aVar.f27966f = (TextView) viewInflate.findViewById(AbstractC5955f.list_item_delivered_reg_dt);
                aVar.f27968h = (TextView) viewInflate.findViewById(AbstractC5955f.list_item_delivered_pbp_acep_knd_nm);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            b item = getItem(i8);
            String[] strArrSplit = item.getSeatInfo().split(" \\| ");
            aVar.f27961a.setText(item.getAcepCustNm());
            aVar.f27961a.append(N.applySpannable(" | ", new ForegroundColorSpan(Color.parseColor("#CCCCCC"))));
            aVar.f27961a.append(N.applySpannable(DeliveredActivity.this.getString(AbstractC5959j.common_s_ticket_count, Integer.valueOf(item.getTkCount())), new ForegroundColorSpan(Color.parseColor("#1f66ad"))));
            aVar.f27963c.setText(item.getMbDvNm());
            aVar.f27964d.setText(item.getAcepCustTeln());
            aVar.f27965e.setText(item.getTkNo());
            aVar.f27966f.setText(item.getRegDt());
            aVar.f27968h.setText(item.getPbpAcepKndNm());
            aVar.f27967g.setText("");
            for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                aVar.f27967g.append(strArrSplit[i9]);
                if (i9 < strArrSplit.length - 1) {
                    aVar.f27967g.append(N.applySpannable(" | ", new ForegroundColorSpan(Color.parseColor("#CCCCCC"))));
                }
            }
            aVar.f27962b.setVisibility("Y".equals(item.getWdrwPsbFlg()) ? 0 : 4);
            aVar.f27962b.setOnClickListener(new v4.c(new c.a() { // from class: com.korail.talk.ui.delivery.a
                @Override // v4.c.a
                public final void onCustomClick(View view2, int i10) {
                    this.f27977a.d(view2, i10);
                }
            }, i8));
            return viewInflate;
        }

        public void setData(List<b> list) {
            this.f27959b = list;
        }

        @Override // android.widget.Adapter
        public b getItem(int i8) {
            return (b) this.f27959b.get(i8);
        }
    }

    private void A0() {
        this.f27944i = (List) C6625A.getSerializableExtra(getIntent(), "DELIVERED_DATA");
    }

    private void B0() {
        l0();
        this.f27945j = new c();
        ListView listView = (ListView) findViewById(AbstractC5955f.lv_delivered);
        listView.setEmptyView(findViewById(AbstractC5955f.tv_delivered_empty));
        listView.setAdapter((ListAdapter) this.f27945j);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_delivered_history);
    }

    private void v0(PbpAcepSpecDao.PbpAcepSpecResponse pbpAcepSpecResponse) {
        b bVar;
        List<PbpAcepSpecDao.Tk> tkList = pbpAcepSpecResponse.getTkList();
        HashMap map = new HashMap();
        for (PbpAcepSpecDao.Tk tk : tkList) {
            PbpAcepSpecDao.Jrny jrny = tk.getJrnyList().get(0);
            String pbpRsvNo = jrny.getPbpRsvNo();
            int size = jrny.getSeatList().size();
            String str = tk.getSaleWctNo() + e.STATE_NAME_NONE + tk.getSaleDt() + e.STATE_NAME_NONE + tk.getSaleSqno() + e.STATE_NAME_NONE + tk.getTkRetPwd();
            String strY0 = y0(tk.getJrnyList(), size);
            if (map.containsKey(pbpRsvNo)) {
                bVar = (b) map.get(pbpRsvNo);
                bVar.setTkCount(bVar.getTkCount() + size);
                bVar.setTkNo(bVar.getTkNo() + X.LF + str);
                bVar.setSeatInfo(bVar.getSeatInfo() + X.LF + strY0);
            } else {
                bVar = new b();
                bVar.setPnrNo(tk.getPnrNo());
                bVar.setPbpRsvNo(pbpRsvNo);
                bVar.setWdrwPsbFlg(jrny.getWdrwPsbFlg());
                bVar.setAcepCustNm(jrny.getAcepCustNm());
                bVar.setMbDvNm(jrny.getMbDvNm());
                bVar.setAcepCustTeln(jrny.getAcepCustTeln());
                bVar.setRegDt(C6634h.convertFormat(jrny.getRegDt(), "yyyyMMdd", "yyyy.MM.dd"));
                bVar.setPbpAcepKndNm(jrny.getPbpAcepKndNm());
                bVar.setTkCount(size);
                bVar.setTkNo(str);
                bVar.setSeatInfo(strY0);
            }
            map.put(pbpRsvNo, bVar);
        }
        this.f27945j.setData(new ArrayList(map.values()));
        this.f27945j.notifyDataSetChanged();
    }

    private void w0() {
        PbpAcepSpecDao pbpAcepSpecDao = new PbpAcepSpecDao();
        PbpAcepSpecDao.PbpAcepSpecRequest pbpAcepSpecRequest = pbpAcepSpecDao.new PbpAcepSpecRequest();
        pbpAcepSpecRequest.setTkCnt(this.f27944i.size());
        pbpAcepSpecRequest.setTkRetNoList(this.f27944i);
        pbpAcepSpecDao.setRequest(pbpAcepSpecRequest);
        pbpAcepSpecDao.setFinishView(true);
        executeDao(pbpAcepSpecDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(int i8) {
        b item = this.f27945j.getItem(i8);
        String pbpRsvNo = item.getPbpRsvNo();
        String pnrNo = item.getPnrNo();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pbpRsvNo);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(pnrNo);
        PbpTkWdrwDao pbpTkWdrwDao = new PbpTkWdrwDao();
        PbpTkWdrwDao.PbpTkWdrwRequest pbpTkWdrwRequest = pbpTkWdrwDao.new PbpTkWdrwRequest();
        pbpTkWdrwRequest.setPbpCnt(1);
        pbpTkWdrwRequest.setPbpRsvNo(arrayList);
        pbpTkWdrwRequest.setPnrNo(arrayList2);
        pbpTkWdrwRequest.setPosition(i8);
        pbpTkWdrwDao.setRequest(pbpTkWdrwRequest);
        executeDao(pbpTkWdrwDao);
    }

    private String y0(List list, int i8) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = 0;
            while (i10 < list.size()) {
                PbpAcepSpecDao.Jrny jrny = (PbpAcepSpecDao.Jrny) list.get(i10);
                PbpAcepSpecDao.Seat seat = jrny.getSeatList().get(i9);
                if (!r4.e.DIRECT.getCode().equals(jrny.getJrnyTpCd())) {
                    sb.append(getString(i10 == 0 ? AbstractC5959j.common_preceding : AbstractC5959j.common_trailing));
                    sb.append(" | ");
                }
                sb.append(seat.getPsgTpDvNm());
                sb.append(" | ");
                sb.append(seat.getPsrmClNm());
                sb.append(" | ");
                sb.append(getString(AbstractC5959j.common_s_seat, String.valueOf(seat.getScarNo()), seat.getSeatNo()));
                if (i9 != i8 - 1 || i10 != list.size() - 1) {
                    sb.append(X.LF);
                }
                i10++;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(DialogInterface dialogInterface, int i8) {
        w0();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_delivered);
        if (C6630d.isNull(bundle)) {
            A0();
            B0();
            setText();
            w0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_pbp_acep_spec == id) {
            v0((PbpAcepSpecDao.PbpAcepSpecResponse) iBaseDao.getResponse());
        } else if (AbstractC5955f.dao_pbp_tk_wdrw == id) {
            setResult(-1);
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.delivered_redeem_your_ticket)).setContent(getString(AbstractC5959j.to_retrieve_message2)).setButtonListener(new DialogInterface.OnClickListener() { // from class: b5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f11431a.z0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }
}
