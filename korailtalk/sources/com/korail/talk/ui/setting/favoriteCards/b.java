package com.korail.talk.ui.setting.favoriteCards;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.database.model.CreditCard;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractC5837a;
import m4.C5908a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import o4.C6038a;
import p4.C6054a;
import q4.C6111b;
import v4.c;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class b extends com.korail.talk.view.base.a implements View.OnClickListener {
    public static final String TAG = "FavoriteCardListFragment";

    /* renamed from: d0, reason: collision with root package name */
    private final int f28763d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    private final int f28764e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    private ArrayList f28765f0;

    /* renamed from: g0, reason: collision with root package name */
    private c f28766g0;

    /* renamed from: h0, reason: collision with root package name */
    private ViewFlipper f28767h0;

    /* renamed from: i0, reason: collision with root package name */
    private TextView f28768i0;

    /* renamed from: j0, reason: collision with root package name */
    private TextView f28769j0;

    /* renamed from: k0, reason: collision with root package name */
    private Button f28770k0;

    /* renamed from: l0, reason: collision with root package name */
    private C0248b f28771l0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.korail.talk.ui.setting.favoriteCards.b$b, reason: collision with other inner class name */
    class C0248b extends RecyclerView.h implements c.a {

        /* renamed from: d, reason: collision with root package name */
        private int f28772d;

        /* renamed from: com.korail.talk.ui.setting.favoriteCards.b$b$a */
        private class a extends RecyclerView.E {

            /* renamed from: t, reason: collision with root package name */
            private final View f28774t;

            /* renamed from: u, reason: collision with root package name */
            private final TextView f28775u;

            private a(View view) {
                super(view);
                this.f28774t = view.findViewById(AbstractC5955f.v_add_area);
                this.f28775u = (TextView) view.findViewById(AbstractC5955f.tv_add_info);
            }
        }

        /* renamed from: com.korail.talk.ui.setting.favoriteCards.b$b$b, reason: collision with other inner class name */
        private class C0249b extends RecyclerView.E {

            /* renamed from: t, reason: collision with root package name */
            private final View f28777t;

            /* renamed from: u, reason: collision with root package name */
            private final TextView f28778u;

            /* renamed from: v, reason: collision with root package name */
            private final ImageView f28779v;

            private C0249b(View view) {
                super(view);
                this.f28777t = view;
                this.f28778u = (TextView) view.findViewById(AbstractC5955f.cardNickTxt);
                this.f28779v = (ImageView) view.findViewById(AbstractC5955f.deleteBtn);
            }
        }

        private C0248b() {
        }

        private Bundle d(int i8) {
            return (Bundle) b.this.f28765f0.get(i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle, DialogInterface dialogInterface, int i8) {
            if (102 == i8) {
                C6111b.getInstance().deleteCreditCard(bundle.getInt("cardId"));
                b.this.D0();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i8) {
            this.f28772d = i8;
            b.this.F0();
            notifyDataSetChanged();
        }

        public Bundle getData() {
            return d(this.f28772d);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (C6630d.isNull(b.this.f28765f0)) {
                return 0;
            }
            return Math.min(b.this.f28765f0.size(), C6054a.FAVORITE_CARD_CREDIT_LIMIT);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            return d(i8).getInt("type");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.E e8, int i8) {
            if (!(e8 instanceof C0249b)) {
                if (e8 instanceof a) {
                    a aVar = (a) e8;
                    aVar.f28775u.setText(AbstractC5959j.favorite_card_add_message);
                    aVar.f28774t.setOnClickListener(new v4.c(this, i8));
                    return;
                }
                return;
            }
            C0249b c0249b = (C0249b) e8;
            String string = d(i8).getString("CARD_NICK_NAME");
            TextView textView = c0249b.f28778u;
            if (C6630d.isNull(string)) {
                string = "";
            }
            textView.setText(string);
            c0249b.f28777t.setOnClickListener(new v4.c(this, i8));
            c0249b.f28779v.setOnClickListener(new v4.c(this, i8));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.E onCreateViewHolder(ViewGroup viewGroup, int i8) {
            RecyclerView.E c0249b;
            if (i8 == 0) {
                c0249b = new C0249b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.favorite_card_list_item, viewGroup, false));
            } else {
                if (i8 != 1) {
                    return null;
                }
                c0249b = new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.favorite_card_list_add_item, viewGroup, false));
            }
            return c0249b;
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            int id = view.getId();
            if (AbstractC5955f.deleteBtn == id) {
                final Bundle bundleD = d(i8);
                C6637k.getCDialog(b.this.getActivity(), 1002, 0, b.this.getString(AbstractC5959j.dialog_title)).setContent(b.this.getString(AbstractC5959j.favorite_card_delete_pop_message)).setButtonListener(new DialogInterface.OnClickListener() { // from class: com.korail.talk.ui.setting.favoriteCards.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        this.f28781a.e(bundleD, dialogInterface, i9);
                    }
                }).showDialog();
            } else if (AbstractC5955f.v_add_area == id) {
                b.this.f28766g0.callFavoriteCardEdit(null);
            } else {
                f(i8);
            }
        }
    }

    public interface c {
        void callFavoriteCardEdit(Bundle bundle);
    }

    private void A0() {
        this.f28765f0.clear();
        List<CreditCard> creditCardList = C6038a.getCreditCardList(getApplicationContext());
        for (CreditCard creditCard : creditCardList) {
            Bundle bundle = new Bundle();
            bundle.putString("CARD_NICK_NAME", C5908a.decryptAES(getApplicationContext(), creditCard.getCardNickname()));
            bundle.putString("CARD_NO", C5908a.decryptAES(getApplicationContext(), creditCard.getCardNumber()));
            bundle.putString("CARD_MONTH", C5908a.decryptAES(getApplicationContext(), creditCard.getCardValidateMonth()));
            bundle.putString("CARD_YEAR", C5908a.decryptAES(getApplicationContext(), creditCard.getCardValidateYear()));
            bundle.putString("CARD_TYPE", C5908a.decryptAES(getApplicationContext(), creditCard.getCardType()));
            bundle.putInt("cardId", creditCard.getId());
            bundle.putInt("type", 0);
            if (creditCard.getBusinessNum() != null) {
                bundle.putString("CARD_BUSINESS_NUMBER", C5908a.decryptAES(getApplicationContext(), creditCard.getBusinessNum()));
            }
            this.f28765f0.add(bundle);
        }
        for (int i8 = 0; i8 < C6054a.FAVORITE_CARD_CREDIT_LIMIT - creditCardList.size(); i8++) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("type", 1);
            this.f28765f0.add(bundle2);
        }
        this.f28771l0.f(0);
        this.f28767h0.setDisplayedChild(1);
    }

    private void B0() {
        this.f28765f0 = new ArrayList();
    }

    private void C0() {
        this.f28770k0.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        if (C6038a.getCreditCardList(getApplicationContext()).size() == 0) {
            this.f28767h0.setDisplayedChild(0);
        } else {
            A0();
        }
    }

    private void E0() {
        this.f28767h0 = (ViewFlipper) p0(AbstractC5955f.flipper);
        this.f28768i0 = (TextView) p0(AbstractC5955f.selCardNickTxt);
        this.f28769j0 = (TextView) p0(AbstractC5955f.selCardDetailTxt);
        this.f28770k0 = (Button) p0(AbstractC5955f.editBtn);
        RecyclerView recyclerView = (RecyclerView) p0(AbstractC5955f.lv_card_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        C0248b c0248b = new C0248b();
        this.f28771l0 = c0248b;
        recyclerView.setAdapter(c0248b);
        p0(AbstractC5955f.cardAddBtn).setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        Bundle data = this.f28771l0.getData();
        this.f28768i0.setText(data.getString("CARD_NICK_NAME"));
        StringBuilder sb = new StringBuilder(data.getString("CARD_NO"));
        sb.replace(4, 8, "****");
        sb.replace(8, 12, "****");
        sb.insert(4, '-');
        sb.insert(9, '-');
        sb.insert(14, '-');
        this.f28769j0.setText(getString(AbstractC5959j.favorite_card_info, sb.toString(), data.getString("CARD_MONTH"), data.getString("CARD_YEAR")));
    }

    public static b newInstance() {
        return new b();
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            B0();
            E0();
            C0();
            D0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f28766g0 = (c) context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        t0(view);
        int id = view.getId();
        if (AbstractC5955f.editBtn == id) {
            this.f28766g0.callFavoriteCardEdit(this.f28771l0.getData());
        } else if (AbstractC5955f.cardAddBtn == id) {
            this.f28766g0.callFavoriteCardEdit(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.favorite_card_list_fragment, viewGroup, false);
    }

    public void updateListData() {
        D0();
    }
}
