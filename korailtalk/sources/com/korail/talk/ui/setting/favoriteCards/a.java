package com.korail.talk.ui.setting.favoriteCards;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.korail.talk.database.model.CreditCard;
import f.C5378a;
import f.InterfaceC5379b;
import f.d;
import h1.C5577a;
import j1.C5813c;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import k0.AbstractC5837a;
import m4.C5908a;
import n4.AbstractC5955f;
import n4.AbstractC5956g;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import o4.C6038a;
import q4.C6111b;
import w4.C6467a;
import x4.C6491a;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class a extends com.korail.talk.view.base.a implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    public static final int MODE_INSERT = 1;
    public static final int MODE_UPDATE = 0;
    public static final String TAG = "FavoriteCardEditFragment";

    /* renamed from: d0, reason: collision with root package name */
    private EditText f28749d0;

    /* renamed from: f0, reason: collision with root package name */
    private EditText f28751f0;

    /* renamed from: g0, reason: collision with root package name */
    private EditText f28752g0;

    /* renamed from: h0, reason: collision with root package name */
    private Button f28753h0;

    /* renamed from: i0, reason: collision with root package name */
    private c f28754i0;

    /* renamed from: j0, reason: collision with root package name */
    private RadioGroup f28755j0;

    /* renamed from: l0, reason: collision with root package name */
    private RadioButton f28757l0;

    /* renamed from: m0, reason: collision with root package name */
    private RadioButton f28758m0;

    /* renamed from: n0, reason: collision with root package name */
    private EditText f28759n0;

    /* renamed from: o0, reason: collision with root package name */
    private LinearLayout f28760o0;

    /* renamed from: e0, reason: collision with root package name */
    private final EditText[] f28750e0 = new EditText[4];

    /* renamed from: k0, reason: collision with root package name */
    private int f28756k0 = 0;

    /* renamed from: p0, reason: collision with root package name */
    private final d f28761p0 = registerForActivityResult(new g.c(), new InterfaceC5379b() { // from class: W5.a
        @Override // f.InterfaceC5379b
        public final void onActivityResult(Object obj) {
            this.f5374a.H0((C5378a) obj);
        }
    });

    private class b extends C6491a {
        @Override // x4.C6491a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            a.this.f28753h0.setEnabled(a.this.G0());
            if (C6630d.isNull(this.f37514b) && editable.length() == this.f37513a && a.this.G0()) {
                a aVar = a.this;
                aVar.t0(aVar.f28752g0);
            }
        }

        private b(int i8, EditText editText) {
            super(i8, editText);
        }
    }

    public interface c {
        void callFavoriteCardList();
    }

    private void F0() {
        this.f28749d0.setText((CharSequence) null);
        for (EditText editText : this.f28750e0) {
            editText.setText((CharSequence) null);
        }
        this.f28751f0.setText((CharSequence) null);
        this.f28752g0.setText((CharSequence) null);
        this.f28749d0.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G0() {
        if (s0(this.f28749d0).isEmpty()) {
            return false;
        }
        int length = 0;
        for (EditText editText : this.f28750e0) {
            length += s0(editText).length();
        }
        return length >= getResources().getInteger(AbstractC5956g.card_no_max_length) && s0(this.f28751f0).length() >= getResources().getInteger(AbstractC5956g.card_month_max_length) && s0(this.f28752g0).length() >= getResources().getInteger(AbstractC5956g.card_year_max_length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(C5378a c5378a) {
        C5813c c5813c;
        if (c5378a.getResultCode() != -1 || (c5813c = (C5813c) c5378a.getData().getParcelableExtra("ocrResult")) == null) {
            return;
        }
        cardScanAutoInput(c5813c.getCardNumber(), 4, c5813c.getValidDate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(DialogInterface dialogInterface, int i8) {
        this.f28754i0.callFavoriteCardList();
        onBackFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(DialogInterface dialogInterface, int i8) {
        this.f28754i0.callFavoriteCardList();
        onBackFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean K0(TextView textView, int i8, KeyEvent keyEvent) {
        if (i8 != 5 || !G0()) {
            return false;
        }
        t0(this.f28749d0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean L0(TextView textView, int i8, KeyEvent keyEvent) {
        if (i8 != 6 || !G0()) {
            return false;
        }
        t0(this.f28752g0);
        return false;
    }

    private void M0() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String strS0 = s0(this.f28751f0);
        int i8 = strS0.length() > 0 ? Integer.parseInt(strS0) : 0;
        String strS02 = s0(this.f28752g0);
        if (strS0.length() == 0 || i8 > 12) {
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.favorite_credit_card_check_validity)).showDialog();
            return;
        }
        if (this.f28756k0 == 1) {
            String strS03 = s0(this.f28759n0);
            if (!strS03.isEmpty() && strS03.length() < getResources().getInteger(AbstractC5956g.card_nick_nm_max_length)) {
                C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.favorite_credit_card_biz_num_check_validity)).showDialog();
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (EditText editText : this.f28750e0) {
            sb.append(s0(editText));
        }
        String strEncryptAES = C5908a.encryptAES(getApplicationContext(), s0(this.f28749d0));
        String strEncryptAES2 = C5908a.encryptAES(getApplicationContext(), sb.toString());
        String strEncryptAES3 = C5908a.encryptAES(getApplicationContext(), strS0);
        String strEncryptAES4 = C5908a.encryptAES(getApplicationContext(), strS02);
        String strEncryptAES5 = C5908a.encryptAES(getApplicationContext(), this.f28756k0 + "");
        CreditCard creditCard = new CreditCard();
        creditCard.setCardNickname(strEncryptAES);
        creditCard.setCardNumber(strEncryptAES2);
        creditCard.setCardValidateMonth(strEncryptAES3);
        creditCard.setCardValidateYear(strEncryptAES4);
        creditCard.setCardType(strEncryptAES5);
        if (this.f28756k0 == 1) {
            creditCard.setBusinessNum(C5908a.encryptAES(getApplicationContext(), s0(this.f28759n0)));
        }
        if (!C6630d.isNull(getArguments()) && getArguments().getInt(FavoriteCardsSettingActivity.MODE, 0) != 1) {
            creditCard.setId(getArguments().getInt("cardId"));
            if (C6111b.getInstance().updateCreditCard(creditCard) > 0) {
                C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(s0(this.f28749d0) + getString(AbstractC5959j.favorite_card_modified)).setButtonListener(new DialogInterface.OnClickListener() { // from class: W5.e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        this.f5378a.J0(dialogInterface, i9);
                    }
                }).showDialog();
                return;
            }
            return;
        }
        for (CreditCard creditCard2 : C6038a.getCreditCardList(getApplicationContext())) {
            if (creditCard2.getCardNickname().equals(strEncryptAES)) {
                C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.favorite_same_card_name)).showDialog();
                return;
            } else if (creditCard2.getCardNumber().equals(strEncryptAES2)) {
                C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.favorite_same_card_number)).showDialog();
                return;
            }
        }
        if (C6111b.getInstance().insertCreditCard(creditCard) > 0) {
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(s0(this.f28749d0) + getString(AbstractC5959j.favorite_card_saved)).setButtonListener(new DialogInterface.OnClickListener() { // from class: W5.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    this.f5377a.I0(dialogInterface, i9);
                }
            }).showDialog();
        }
    }

    private void N0() {
        int i8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        byte b14 = 0;
        byte b15 = 0;
        this.f28749d0.addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.card_nick_nm_max_length), this.f28750e0[0]));
        while (true) {
            EditText[] editTextArr = this.f28750e0;
            if (i8 >= editTextArr.length) {
                this.f28751f0.addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.card_month_max_length), this.f28752g0));
                this.f28752g0.addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.card_year_max_length), b12 == true ? 1 : 0));
                this.f28759n0.addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.card_nick_nm_max_length), b10 == true ? 1 : 0));
                p0(AbstractC5955f.resetBtn).setOnClickListener(this);
                this.f28753h0.setOnClickListener(this);
                p0(AbstractC5955f.cardScanBtn).setOnClickListener(this);
                return;
            }
            if (i8 == editTextArr.length - 1) {
                editTextArr[i8].addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.card_each_no_max_length), this.f28751f0));
            } else {
                editTextArr[i8].addTextChangedListener(new b(getResources().getInteger(AbstractC5956g.card_each_no_max_length), this.f28750e0[i8 + 1]));
            }
            i8++;
        }
    }

    private void O0() {
        if (C6630d.isNull(getArguments())) {
            this.f28753h0.setEnabled(false);
            return;
        }
        Bundle arguments = getArguments();
        int i8 = arguments.getInt(FavoriteCardsSettingActivity.MODE, 0);
        if (i8 == 0) {
            this.f28749d0.setText(arguments.getString("CARD_NICK_NAME"));
        }
        this.f28753h0.setEnabled(i8 == 0);
        String string = arguments.getString("CARD_NO");
        this.f28750e0[0].setText(string.substring(0, 4));
        this.f28750e0[1].setText(string.substring(4, 8));
        this.f28750e0[2].setText(string.substring(8, 12));
        this.f28750e0[3].setText(string.substring(12));
        this.f28751f0.setText(arguments.getString("CARD_MONTH"));
        this.f28752g0.setText(arguments.getString("CARD_YEAR"));
        String string2 = arguments.getString("CARD_TYPE");
        if (string2 != null && !string2.equals("")) {
            this.f28756k0 = Integer.parseInt(string2);
            if (string2.equals("0")) {
                this.f28757l0.setChecked(true);
                this.f28758m0.setChecked(false);
            } else {
                this.f28757l0.setChecked(false);
                this.f28758m0.setChecked(true);
                String string3 = arguments.getString("CARD_BUSINESS_NUMBER");
                if (string3 != null && !string3.isEmpty()) {
                    this.f28759n0.setText(string3);
                }
            }
        }
        this.f28749d0.requestFocus();
    }

    private void P0() {
        if (!C6630d.isNull(getActivity())) {
            getActivity().findViewById(AbstractC5955f.addBtn).setVisibility(4);
        }
        EditText editText = (EditText) p0(AbstractC5955f.cardNickEdit);
        this.f28749d0 = editText;
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: W5.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                return this.f5375a.K0(textView, i8, keyEvent);
            }
        });
        this.f28750e0[0] = (EditText) p0(AbstractC5955f.cardNoEdit0);
        this.f28750e0[1] = (EditText) p0(AbstractC5955f.cardNoEdit1);
        this.f28750e0[1].setTransformationMethod(new C6467a());
        this.f28750e0[2] = (EditText) p0(AbstractC5955f.cardNoEdit2);
        this.f28750e0[2].setTransformationMethod(new C6467a());
        this.f28750e0[3] = (EditText) p0(AbstractC5955f.cardNoEdit3);
        this.f28751f0 = (EditText) p0(AbstractC5955f.cardMonthEdit);
        EditText editText2 = (EditText) p0(AbstractC5955f.cardYearEdit);
        this.f28752g0 = editText2;
        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: W5.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                return this.f5376a.L0(textView, i8, keyEvent);
            }
        });
        this.f28760o0 = (LinearLayout) p0(AbstractC5955f.ll_freq_biz_card);
        this.f28759n0 = (EditText) p0(AbstractC5955f.cardBizNoEdit);
        this.f28753h0 = (Button) p0(AbstractC5955f.saveBtn);
        this.f28755j0 = (RadioGroup) p0(AbstractC5955f.rg_card_type);
        this.f28757l0 = (RadioButton) p0(AbstractC5955f.rb_private);
        this.f28758m0 = (RadioButton) p0(AbstractC5955f.rb_corporation);
        this.f28755j0.setOnCheckedChangeListener(this);
    }

    public static a newInstance() {
        return new a();
    }

    public void cardScanAutoInput(String str, int i8, String str2) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < str.length()) {
            try {
                int i11 = i9 + i8;
                this.f28750e0[i10].setText(str.substring(i9, Math.min(i11, str.length())));
                i10++;
                i9 = i11;
            } catch (Exception e8) {
                e8.printStackTrace();
                return;
            }
        }
        String[] strArrSplit = str2.split("/");
        this.f28751f0.setText(strArrSplit[0]);
        this.f28752g0.setText("20" + strArrSplit[1]);
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            P0();
            N0();
            O0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f28754i0 = (c) context;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i8) {
        if (i8 == AbstractC5955f.rb_private) {
            this.f28756k0 = 0;
            this.f28760o0.setVisibility(8);
            this.f28753h0.setEnabled(G0());
        } else if (i8 == AbstractC5955f.rb_corporation) {
            this.f28756k0 = 1;
            this.f28760o0.setVisibility(0);
            this.f28753h0.setEnabled(G0());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        t0(view);
        int id = view.getId();
        if (AbstractC5955f.resetBtn == id) {
            F0();
            return;
        }
        if (AbstractC5955f.saveBtn == id) {
            if (G0()) {
                M0();
            }
        } else if (AbstractC5955f.cardScanBtn == id) {
            this.f28761p0.launch(new C5577a(requireActivity()).startWithCamera(requireActivity()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getActivity().findViewById(AbstractC5955f.v_bn).setVisibility(8);
        return layoutInflater.inflate(AbstractC5957h.favorite_card_edit_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().findViewById(AbstractC5955f.v_bn).setVisibility(0);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (C6630d.isNull(getActivity())) {
            return;
        }
        getActivity().findViewById(AbstractC5955f.addBtn).setVisibility(0);
    }
}
