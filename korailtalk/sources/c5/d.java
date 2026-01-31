package c5;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.EditText;
import b5.InterfaceC1083d;
import com.korail.talk.network.dao.ticket.RecentDeliveryHistoryDao;
import com.korail.talk.ui.ticket.history.TicketDeliveryHistoryActivity;
import k0.AbstractC5837a;
import n4.AbstractC5959j;
import z4.C;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public abstract class d extends com.korail.talk.view.base.a {

    /* renamed from: d0, reason: collision with root package name */
    private InterfaceC1083d f11493d0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(String str, String str2, String str3, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            this.f11493d0.executeDeliveryMember(str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(String str, String str2, String str3, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            this.f11493d0.executeDeliveryNonMember(str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(String str, String str2, String str3, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            this.f11493d0.executeDeliveryEtc(str, str2, str3);
        }
    }

    protected void C0() {
        startActivityForResult(new Intent(getApplicationContext(), (Class<?>) TicketDeliveryHistoryActivity.class), 126);
    }

    protected abstract void D0(RecentDeliveryHistoryDao.Acep acep);

    protected void E0(final String str, EditText editText, EditText editText2) {
        String string;
        final String strS0 = s0(editText);
        final String strS02 = s0(editText2);
        if (strS0.isEmpty()) {
            string = getString(AbstractC5959j.ticket_delivery_input_name_warning);
        } else if (N.isNull(C.makePhoneNumber(strS02))) {
            string = getString(AbstractC5959j.ticket_delivery_input_cellphone_number_correct_warning);
            editText = editText2;
        } else {
            editText = null;
            string = null;
        }
        if (N.isNull(string)) {
            C6637k.getCDialog(getActivity(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_delivery_input_confirm_popup, strS0, C.makePhoneNumber(strS02), getString(AbstractC5959j.common_empty))).setButtonListener(new DialogInterface.OnClickListener() { // from class: c5.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f11489a.z0(str, strS0, strS02, dialogInterface, i8);
                }
            }).showDialog();
            return;
        }
        C6637k.getCDialog(getContext(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
        if (C6630d.isNotNull(editText)) {
            editText.requestFocus();
        }
    }

    protected void F0(EditText editText, EditText editText2, final String str, boolean z8) {
        String string;
        final String strS0 = s0(editText);
        final String strS02 = s0(editText2);
        if (strS0.isEmpty()) {
            string = getString(AbstractC5959j.ticket_delivery_input_name_warning);
        } else if (N.isNull(str)) {
            string = getString(AbstractC5959j.ticket_delivery_certification_warning);
            editText = null;
        } else if (N.isNull(C.makePhoneNumber(strS02))) {
            string = getString(AbstractC5959j.ticket_delivery_input_cellphone_number_correct_warning);
            editText = editText2;
        } else {
            editText = null;
            string = null;
        }
        if (z8) {
            this.f11493d0.executeDeliveryMember(strS0, strS02, str);
            return;
        }
        if (N.isNull(string)) {
            C6637k.getCDialog(getActivity(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_delivery_input_confirm_popup, strS0, C.makePhoneNumber(strS02), getString(AbstractC5959j.common_empty))).setButtonListener(new DialogInterface.OnClickListener() { // from class: c5.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f11485a.A0(strS0, strS02, str, dialogInterface, i8);
                }
            }).showDialog();
            return;
        }
        C6637k.getCDialog(getContext(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
        if (C6630d.isNotNull(editText)) {
            editText.requestFocus();
        }
    }

    protected void G0(EditText editText, EditText editText2, EditText editText3, EditText editText4) {
        String string;
        String string2;
        final String strS0 = s0(editText);
        final String strS02 = s0(editText2);
        final String strS03 = s0(editText3);
        String strS04 = s0(editText4);
        if (strS0.isEmpty()) {
            string = getString(AbstractC5959j.ticket_delivery_input_name_warning);
        } else if (C.isInvalidName(strS0)) {
            if (strS02.length() == 0) {
                string2 = getString(AbstractC5959j.ticket_delivery_input_receive_cellphone_number_warning);
            } else if (N.isNull(C.makePhoneNumber(strS02))) {
                string2 = getString(AbstractC5959j.ticket_delivery_input_cellphone_number_correct_warning);
            } else {
                if (strS03.length() == 0) {
                    string = getString(AbstractC5959j.ticket_delivery_input_input_pwd);
                } else if (strS03.length() != 5) {
                    string = getString(AbstractC5959j.ticket_delivery_input_pwd_length_5);
                } else {
                    if (strS04.length() == 0) {
                        string = getString(AbstractC5959j.ticket_delivery_input_input_confirm_pwd);
                    } else if (strS04.length() != 5) {
                        string = getString(AbstractC5959j.ticket_delivery_input_pwd_confirm_length_5);
                    } else if (strS03.equals(strS04)) {
                        editText = null;
                        string = null;
                    } else {
                        string = getString(AbstractC5959j.ticket_delivery_input_pwd_not_match);
                    }
                    editText = editText4;
                }
                editText = editText3;
            }
            string = string2;
            editText = editText2;
        } else {
            string = getString(AbstractC5959j.nonmember_check_name_message2);
        }
        if (!N.isNull(string)) {
            C6637k.getCDialog(getContext(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).showDialog();
            if (C6630d.isNotNull(editText)) {
                editText.requestFocus();
                return;
            }
            return;
        }
        C6637k.getCDialog(getActivity(), 1002, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.ticket_delivery_input_confirm_popup, strS0, C.makePhoneNumber(strS02), ", " + getString(AbstractC5959j.common_password))).setButtonListener(new DialogInterface.OnClickListener() { // from class: c5.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f11481a.B0(strS0, strS02, strS03, dialogInterface, i8);
            }
        }).showDialog();
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 == -1 && 126 == i8) {
            D0((RecentDeliveryHistoryDao.Acep) intent.getSerializableExtra("DELIVERY_HISTORY_DATA"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f11493d0 = (InterfaceC1083d) context;
    }
}
