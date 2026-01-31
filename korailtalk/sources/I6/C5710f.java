package i6;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.gifticket.GifticketListDao;
import com.korail.talk.network.dao.gifticket.GifticketListDao.GifticketListRequest;
import com.korail.talk.ui.ticket.history.gifticket.GifticketReceiptActivity;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractC5837a;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import p6.C6061c;
import z4.C6634h;
import z4.N;

/* renamed from: i6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5710f extends com.korail.talk.view.base.a {
    public static final String TAG = "GifticketSendListFragment";

    /* renamed from: d0, reason: collision with root package name */
    private List f31935d0;

    /* renamed from: e0, reason: collision with root package name */
    private b f31936e0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i6.f$b */
    class b extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final int f31937d;

        /* renamed from: e, reason: collision with root package name */
        private final int f31938e;

        /* renamed from: i6.f$b$a */
        private class a extends RecyclerView.E {
            private a(View view) {
                super(view);
            }

            public void setEventListener(int i8) {
            }

            public void setText(int i8) {
            }

            public void setView(int i8) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i6.f$b$b, reason: collision with other inner class name */
        class C0315b extends a {
            public TextView mTvBottomBtn;
            public TextView mTvBottomMsg;
            public TextView mTvDate;
            public TextView mTvMessage;
            public TextView mTvMoney;
            public TextView mTvName;
            public TextView mTvRightBtn;

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void H(View view) {
                C5710f.this.startActivity(new Intent(C5710f.this.getApplicationContext(), (Class<?>) GifticketReceiptActivity.class));
            }

            @Override // i6.C5710f.b.a
            public void setEventListener(int i8) {
                super.setEventListener(i8);
                this.mTvRightBtn.setOnClickListener(new View.OnClickListener() { // from class: i6.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f31942a.H(view);
                    }
                });
            }

            @Override // i6.C5710f.b.a
            public void setText(int i8) {
                super.setText(i8);
                GifticketListDao.GifticketInfo gifticketInfo = (GifticketListDao.GifticketInfo) b.this.c(i8);
                this.mTvMoney.setText(C5710f.this.getString(AbstractC5959j.common_amount, N.getDecimalFormatString(gifticketInfo.getTxnAmt())));
                this.mTvMessage.setVisibility(8);
                this.mTvDate.setText(C5710f.this.getString(AbstractC5959j.gifticket_item_send_date, C6634h.convertFormat(gifticketInfo.getRcvDt(), "yyyyMMdd", "yyyy.MM.dd")));
                this.mTvName.setText(C5710f.this.getString(AbstractC5959j.gifticket_item_receiver, gifticketInfo.getIntgCustNm2()));
                this.mTvRightBtn.setText(AbstractC5959j.common_receipt);
                TextView textView = this.mTvRightBtn;
                textView.setPaintFlags(textView.getPaintFlags() | 8);
                this.mTvBottomBtn.setVisibility(8);
                this.mTvBottomMsg.setVisibility(0);
                TextView textView2 = this.mTvBottomMsg;
                C5710f c5710f = C5710f.this;
                textView2.setText(c5710f.getString(AbstractC5959j.gifticket_item_return_message_detail, "김철도", c5710f.getString(AbstractC5959j.gifticket_item_return_message_detail1), C5710f.this.getString(AbstractC5959j.gifticket_item_return_all)));
            }

            @Override // i6.C5710f.b.a
            public void setView(int i8) {
                super.setView(i8);
                this.itemView.findViewById(AbstractC5955f.v_gifticket_item).setBackgroundResource(AbstractC5954e.selector_btn_round_stroke_888888);
                this.mTvMoney = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_money_amount);
                this.mTvMessage = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_message);
                this.mTvDate = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_date);
                this.mTvName = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_name);
                this.mTvBottomMsg = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_bottom_message);
                this.mTvRightBtn = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_right);
                this.mTvBottomBtn = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_btn);
            }

            private C0315b(View view) {
                super(view);
            }
        }

        private b() {
            this.f31937d = 0;
            this.f31938e = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object c(int i8) {
            return C5710f.this.f31935d0.get(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return C5710f.this.f31935d0.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            c(i8);
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(a aVar, int i8) {
            aVar.setView(i8);
            aVar.setText(i8);
            aVar.setEventListener(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public a onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return new C0315b(LayoutInflater.from(C5710f.this.getApplicationContext()).inflate(AbstractC5957h.list_item_gifticket, viewGroup, false));
        }
    }

    private void A0(List list) {
        if (list.isEmpty()) {
            p0(AbstractC5955f.tv_gifticket_empty).setVisibility(0);
            ((TextView) p0(AbstractC5955f.tv_gifticket_empty)).setText(getString(AbstractC5959j.gifticket_no_item, getString(AbstractC5959j.common_s_send)));
        } else {
            p0(AbstractC5955f.tv_gifticket_empty).setVisibility(8);
            this.f31935d0.addAll(list);
            this.f31936e0.notifyDataSetChanged();
        }
    }

    private void B0() {
        RecyclerView recyclerView = (RecyclerView) p0(AbstractC5955f.rv_gifticket_history_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        b bVar = new b();
        this.f31936e0 = bVar;
        recyclerView.setAdapter(bVar);
        recyclerView.addItemDecoration(new C6061c());
    }

    public static Fragment newInstance() {
        return new C5710f();
    }

    private void x0() {
        GifticketListDao gifticketListDao = new GifticketListDao();
        GifticketListDao.GifticketListRequest gifticketListRequest = gifticketListDao.new GifticketListRequest();
        gifticketListRequest.setQryDvCd("A");
        gifticketListRequest.setQryVal("E");
        gifticketListRequest.setAbrdDtFrom("20210101");
        gifticketListRequest.setAbrdDtTo("20211230");
        gifticketListRequest.setUsePsbFlg("");
        gifticketListDao.setRequest(gifticketListRequest);
        executeDao(gifticketListDao);
    }

    private void y0() {
        this.f31935d0 = new ArrayList();
    }

    private void z0() {
        x0();
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        y0();
        B0();
        z0();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_gifticket_history, viewGroup, false);
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_gifticket_list == iBaseDao.getId()) {
            A0(((GifticketListDao.GifticketListResponse) iBaseDao.getResponse()).getGifticketInfoList());
        }
    }
}
