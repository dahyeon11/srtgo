package z5;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.refund.RefundVerifyTicketDao;
import com.korail.talk.network.dao.refund.RefundVerifyTicketDao.RefundVerifyTicketRequest;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5956g;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import x4.C6491a;
import z4.C6630d;
import z4.C6637k;
import z4.I;
import z4.N;

/* renamed from: z5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnClickListenerC6645c extends com.korail.talk.view.base.a implements View.OnClickListener {
    public static final String TAG = "OfflineReturnInputFragment";

    /* renamed from: g0, reason: collision with root package name */
    private int[] f37916g0;

    /* renamed from: h0, reason: collision with root package name */
    private InterfaceC6646d f37917h0;

    /* renamed from: j0, reason: collision with root package name */
    private EditText f37919j0;

    /* renamed from: k0, reason: collision with root package name */
    private EditText f37920k0;

    /* renamed from: l0, reason: collision with root package name */
    private Button f37921l0;

    /* renamed from: d0, reason: collision with root package name */
    private final String f37913d0 = "ticketNoEdit";

    /* renamed from: e0, reason: collision with root package name */
    private final String f37914e0 = "offline_max_length";

    /* renamed from: f0, reason: collision with root package name */
    private final int f37915f0 = 4;

    /* renamed from: i0, reason: collision with root package name */
    private EditText[] f37918i0 = new EditText[4];

    /* renamed from: z5.c$b */
    private class b extends C6491a {
        @Override // x4.C6491a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            ViewOnClickListenerC6645c.this.f37921l0.setEnabled(ViewOnClickListenerC6645c.this.B0());
        }

        private b(int i8, EditText editText) {
            super(i8, editText);
        }
    }

    private void A0(String str, String str2, String str3, String str4) {
        RefundVerifyTicketDao refundVerifyTicketDao = new RefundVerifyTicketDao();
        RefundVerifyTicketDao.RefundVerifyTicketRequest refundVerifyTicketRequest = refundVerifyTicketDao.new RefundVerifyTicketRequest();
        refundVerifyTicketRequest.setRetNo1(str);
        refundVerifyTicketRequest.setRetNo2(str2);
        refundVerifyTicketRequest.setRetNo3(str3);
        refundVerifyTicketRequest.setRetNo4(str4);
        refundVerifyTicketRequest.setStrName(s0(this.f37919j0));
        refundVerifyTicketDao.setRequest(refundVerifyTicketRequest);
        executeDao(refundVerifyTicketDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B0() {
        boolean z8;
        int i8 = 0;
        while (true) {
            if (i8 >= 4) {
                z8 = true;
                break;
            }
            if (s0(this.f37918i0[i8]).length() < this.f37916g0[i8]) {
                z8 = false;
                break;
            }
            i8++;
        }
        if (s0(this.f37919j0).length() == 0 || s0(this.f37920k0).length() == 0) {
            return false;
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            A0(s0(this.f37918i0[0]), s0(this.f37918i0[1]), s0(this.f37918i0[2]), s0(this.f37918i0[3]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(RefundVerifyTicketDao.RefundVerifyTicketResponse refundVerifyTicketResponse, String str, DialogInterface dialogInterface, int i8) {
        this.f37917h0.addOfflineReturnRequestFragment(refundVerifyTicketResponse, str, s0(this.f37919j0), s0(this.f37920k0));
    }

    private void E0() {
        this.f37918i0 = new EditText[4];
        this.f37916g0 = new int[4];
    }

    private void F0() {
        this.f37918i0[0].addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.offline_max_length0), this.f37918i0[1]));
        this.f37918i0[1].addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.offline_max_length1), this.f37918i0[2]));
        this.f37918i0[2].addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.offline_max_length2), this.f37918i0[3]));
        this.f37918i0[3].addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.offline_max_length3), this.f37919j0));
        p0(AbstractC5955f.tv_refund_ticket_number).setOnClickListener(this);
        this.f37919j0.addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.card_nick_nm_max_length), this.f37920k0));
        this.f37920k0.addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.phone_number_max), 0 == true ? 1 : 0));
        this.f37921l0.setOnClickListener(this);
    }

    private void G0() {
        for (int i8 = 0; i8 < 4; i8++) {
            int viewId = I.getViewId(getApplicationContext(), "ticketNoEdit" + i8);
            int integerId = I.getIntegerId(getApplicationContext(), "offline_max_length" + i8);
            this.f37918i0[i8] = (EditText) p0(viewId);
            this.f37916g0[i8] = getResources().getInteger(integerId);
        }
        this.f37919j0 = (EditText) p0(AbstractC5955f.requestorEdit);
        this.f37920k0 = (EditText) p0(AbstractC5955f.phoneNoEdit);
        Button button = (Button) p0(AbstractC5955f.bottomBtn);
        this.f37921l0 = button;
        button.setEnabled(false);
    }

    public static ViewOnClickListenerC6645c newInstance() {
        return new ViewOnClickListenerC6645c();
    }

    public void clearInput() {
        for (EditText editText : this.f37918i0) {
            editText.setText("");
        }
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            E0();
            G0();
            F0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f37917h0 = (InterfaceC6646d) context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        t0(view);
        int id = view.getId();
        if (AbstractC5955f.bottomBtn == id) {
            C6637k.getCDialog(getActivity(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.offline_return_ticket_refund_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: z5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f37909a.C0(dialogInterface, i8);
                }
            }).showDialog();
        } else if (AbstractC5955f.tv_refund_ticket_number == id) {
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.offline_return_ticket_refund_info)).showDialog();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.offline_return_input_fragment, viewGroup, false);
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_refund_verify_ticket == iBaseDao.getId()) {
            final String str = s0(this.f37918i0[0]) + g5.e.STATE_NAME_NONE + s0(this.f37918i0[1]) + g5.e.STATE_NAME_NONE + s0(this.f37918i0[2]) + g5.e.STATE_NAME_NONE + s0(this.f37918i0[3]);
            final RefundVerifyTicketDao.RefundVerifyTicketResponse refundVerifyTicketResponse = (RefundVerifyTicketDao.RefundVerifyTicketResponse) iBaseDao.getResponse();
            if (N.isNotNull(refundVerifyTicketResponse.getPopMsg())) {
                C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(refundVerifyTicketResponse.getPopMsg()).setButtonListener(new DialogInterface.OnClickListener() { // from class: z5.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        this.f37910a.D0(refundVerifyTicketResponse, str, dialogInterface, i8);
                    }
                }).showDialog();
            } else {
                this.f37917h0.addOfflineReturnRequestFragment(refundVerifyTicketResponse, str, s0(this.f37919j0), s0(this.f37920k0));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        v0(getString(AbstractC5959j.offline_return_ticket_title_refund_input));
    }
}
