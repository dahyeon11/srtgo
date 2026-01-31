package i6;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.gifticket.GifticketListDao;
import com.korail.talk.network.dao.gifticket.GifticketListDao.GifticketListRequest;
import com.korail.talk.network.dao.gifticket.GifticketReturnDao;
import com.korail.talk.network.dao.gifticket.GifticketReturnDao.GifticketReturnRequest;
import com.korail.talk.ui.ticket.history.gifticket.GifticketHistoryDetailActivity;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractC5837a;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import p6.C6061c;
import s4.C6219c;
import z4.C6634h;
import z4.C6637k;
import z4.N;
import z4.t;

/* renamed from: i6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5706b extends com.korail.talk.view.base.a {
    public static final String TAG = "GifticketReceiveListFragment";

    /* renamed from: d0, reason: collision with root package name */
    private List f31922d0;

    /* renamed from: e0, reason: collision with root package name */
    private C0313b f31923e0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i6.b$b, reason: collision with other inner class name */
    class C0313b extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final int f31924d;

        /* renamed from: e, reason: collision with root package name */
        private final int f31925e;

        /* renamed from: i6.b$b$a */
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
        /* renamed from: i6.b$b$b, reason: collision with other inner class name */
        class C0314b extends a {
            public LinearLayout mLlGifticket_item;
            public TextView mTvBottomBtn;
            public TextView mTvBottomMsg;
            public TextView mTvDate;
            public TextView mTvMessage;
            public TextView mTvMoney;
            public TextView mTvName;
            public TextView mTvRightBtn;
            public TextView mTvState;

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void J(GifticketListDao.GifticketInfo gifticketInfo, DialogInterface dialogInterface, int i8) {
                if (102 == i8) {
                    C5706b.this.A0(gifticketInfo.getTkId());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void K(final GifticketListDao.GifticketInfo gifticketInfo, View view) {
                String string = Integer.toString(Integer.parseInt(gifticketInfo.getTxnAmt()) - Integer.parseInt(gifticketInfo.getRetAmt()));
                C6219c cDialog = C6637k.getCDialog(C5706b.this.getActivity(), 1002, 0, C5706b.this.getString(AbstractC5959j.dialog_title));
                String string2 = C5706b.this.getString(AbstractC5959j.gifticket_dialog_return_content);
                C5706b c5706b = C5706b.this;
                cDialog.setContent(string2, c5706b.getString(AbstractC5959j.ticket_before_return_msg, c5706b.getString(AbstractC5959j.title_gifticket), string)).setButtonNames(N.getStringArray(C5706b.this.getString(AbstractC5959j.ticket_refund_cancel), C5706b.this.getString(AbstractC5959j.ticket_refund_complete))).setButtonListener(new DialogInterface.OnClickListener() { // from class: i6.e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f31933a.J(gifticketInfo, dialogInterface, i8);
                    }
                }).showDialog();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void L(GifticketListDao.GifticketInfo gifticketInfo, View view) {
                Intent intent = new Intent(C5706b.this.getApplicationContext(), (Class<?>) GifticketHistoryDetailActivity.class);
                intent.putExtra("GIFTICKET_ID", gifticketInfo.getTkId());
                intent.putExtra("GIFTICKET_AMOUNT", gifticketInfo.getTxnAmt());
                C5706b.this.startActivity(intent);
            }

            @Override // i6.C5706b.C0313b.a
            public void setEventListener(int i8) {
                super.setEventListener(i8);
                final GifticketListDao.GifticketInfo gifticketInfo = (GifticketListDao.GifticketInfo) C0313b.this.c(i8);
                this.mTvRightBtn.setOnClickListener(new View.OnClickListener() { // from class: i6.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f31929a.K(gifticketInfo, view);
                    }
                });
                this.mTvBottomBtn.setOnClickListener(new View.OnClickListener() { // from class: i6.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f31931a.L(gifticketInfo, view);
                    }
                });
            }

            @Override // i6.C5706b.C0313b.a
            public void setText(int i8) {
                super.setText(i8);
                GifticketListDao.GifticketInfo gifticketInfo = (GifticketListDao.GifticketInfo) C0313b.this.c(i8);
                boolean z8 = Integer.parseInt(gifticketInfo.getUsePontValNum()) > 0;
                t.d("사용금액 : " + Integer.parseInt(gifticketInfo.getUsePontValNum()));
                this.mTvMoney.setText(C5706b.this.getString(AbstractC5959j.common_amount, N.getDecimalFormatString(gifticketInfo.getTxnAmt())));
                this.mTvMessage.setText(C5706b.this.getString(AbstractC5959j.gifticket_item_expire_message, C6634h.convertFormat(gifticketInfo.getUseClsDt(), "yyyyMMdd", "yyyy.MM.dd")));
                this.mTvDate.setText(C5706b.this.getString(AbstractC5959j.gifticket_item_receive_date, C6634h.convertFormat(gifticketInfo.getRcvDt(), "yyyyMMdd", "yyyy.MM.dd")));
                this.mTvName.setText(C5706b.this.getString(AbstractC5959j.gifticket_item_sender, gifticketInfo.getIntgCustNm1()));
                if ("Y".equals(gifticketInfo.getUsePsbFlg())) {
                    this.mTvBottomMsg.setVisibility(8);
                    this.mTvRightBtn.setVisibility(0);
                    TextView textView = this.mTvRightBtn;
                    textView.setPaintFlags(textView.getPaintFlags() | 8);
                } else {
                    this.mTvBottomMsg.setVisibility(0);
                    this.mTvBottomMsg.setText(C5706b.this.getString(AbstractC5959j.gifticket_item_return_message, C6634h.convertFormat(gifticketInfo.getRetDt(), "yyyyMMdd", "yyyy.MM.dd")));
                    this.mTvRightBtn.setVisibility(8);
                    if (z8) {
                        this.mTvState.setVisibility(0);
                        this.mTvState.setText(C5706b.this.getString(AbstractC5959j.gifticket_item_state_return_part));
                    } else {
                        this.mTvState.setVisibility(0);
                        this.mTvState.setText(C5706b.this.getString(AbstractC5959j.gifticket_item_state_return_all));
                    }
                }
                if (!z8) {
                    this.mTvBottomBtn.setVisibility(8);
                    this.mLlGifticket_item.setBackgroundResource(AbstractC5954e.selector_btn_round_stroke_888888);
                    return;
                }
                this.mTvBottomBtn.setVisibility(0);
                this.mLlGifticket_item.setBackgroundResource(AbstractC5954e.selector_btn_top_round_stroke_gray_no_press);
                if (Integer.parseInt(gifticketInfo.getNowPontValNum()) - Integer.parseInt(gifticketInfo.getUsePontValNum()) == 0) {
                    this.mTvState.setText(C5706b.this.getString(AbstractC5959j.gifticket_item_state_used));
                }
            }

            @Override // i6.C5706b.C0313b.a
            public void setView(int i8) {
                super.setView(i8);
                this.mLlGifticket_item = (LinearLayout) this.itemView.findViewById(AbstractC5955f.v_gifticket_item);
                this.mTvMoney = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_money_amount);
                this.mTvState = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_state);
                this.mTvMessage = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_message);
                this.mTvDate = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_date);
                this.mTvName = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_name);
                this.mTvBottomMsg = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_bottom_message);
                this.mTvRightBtn = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_right);
                this.mTvBottomBtn = (TextView) this.itemView.findViewById(AbstractC5955f.tv_list_item_btn);
            }

            private C0314b(View view) {
                super(view);
            }
        }

        private C0313b() {
            this.f31924d = 0;
            this.f31925e = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object c(int i8) {
            return C5706b.this.f31922d0.get(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return C5706b.this.f31922d0.size();
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
            return new C0314b(LayoutInflater.from(C5706b.this.getApplicationContext()).inflate(AbstractC5957h.list_item_gifticket, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(String str) {
        GifticketReturnDao gifticketReturnDao = new GifticketReturnDao();
        GifticketReturnDao.GifticketReturnRequest gifticketReturnRequest = gifticketReturnDao.new GifticketReturnRequest();
        gifticketReturnRequest.setTkId(str);
        gifticketReturnDao.setRequest(gifticketReturnRequest);
        executeDao(gifticketReturnDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            t.d("반환하기");
        }
    }

    private void C0() {
        this.f31922d0 = new ArrayList();
    }

    private void D0() {
        z0();
    }

    private void E0(List list) {
        if (list.isEmpty()) {
            p0(AbstractC5955f.tv_gifticket_empty).setVisibility(0);
            ((TextView) p0(AbstractC5955f.tv_gifticket_empty)).setText(getString(AbstractC5959j.gifticket_no_item, getString(AbstractC5959j.common_s_receive)));
        } else {
            p0(AbstractC5955f.tv_gifticket_empty).setVisibility(8);
            this.f31922d0.addAll(list);
            this.f31923e0.notifyDataSetChanged();
        }
    }

    private void F0() {
        RecyclerView recyclerView = (RecyclerView) p0(AbstractC5955f.rv_gifticket_history_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        C0313b c0313b = new C0313b();
        this.f31923e0 = c0313b;
        recyclerView.setAdapter(c0313b);
        recyclerView.addItemDecoration(new C6061c());
    }

    public static Fragment newInstance() {
        return new C5706b();
    }

    private void z0() {
        GifticketListDao gifticketListDao = new GifticketListDao();
        GifticketListDao.GifticketListRequest gifticketListRequest = gifticketListDao.new GifticketListRequest();
        gifticketListRequest.setQryDvCd("C");
        gifticketListRequest.setQryVal("E");
        gifticketListRequest.setAbrdDtFrom("20210101");
        gifticketListRequest.setAbrdDtTo("20211230");
        gifticketListRequest.setUsePsbFlg("");
        gifticketListDao.setRequest(gifticketListRequest);
        executeDao(gifticketListDao);
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C0();
        F0();
        D0();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_gifticket_history, viewGroup, false);
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_gifticket_list == id) {
            E0(((GifticketListDao.GifticketListResponse) iBaseDao.getResponse()).getGifticketInfoList());
        } else if (AbstractC5955f.dao_gifticket_return == id) {
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.ticket_handling_return_refund_complete)).setContent(getString(AbstractC5959j.common_return_complete, getString(AbstractC5959j.title_gifticket))).setButtonListener(new DialogInterface.OnClickListener() { // from class: i6.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    C5706b.B0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }
}
