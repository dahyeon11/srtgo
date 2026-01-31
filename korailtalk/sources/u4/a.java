package U4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import p6.C6060b;

/* loaded from: classes.dex */
public class a {
    public static final int FIRST_SELECTED_NONE = -1;

    /* renamed from: a, reason: collision with root package name */
    private final Context f5032a;

    /* renamed from: b, reason: collision with root package name */
    private final RecyclerView f5033b;

    /* renamed from: c, reason: collision with root package name */
    private b f5034c;

    /* renamed from: U4.a$a, reason: collision with other inner class name */
    class C0078a extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final List f5035d;

        /* renamed from: e, reason: collision with root package name */
        private int f5036e;

        /* renamed from: f, reason: collision with root package name */
        private View.OnClickListener f5037f = new ViewOnClickListenerC0079a();

        /* renamed from: U4.a$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0079a implements View.OnClickListener {
            ViewOnClickListenerC0079a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view instanceof RadioButton) {
                    RadioButton radioButton = (RadioButton) view;
                    radioButton.toggle();
                    int childLayoutPosition = a.this.f5033b.getChildLayoutPosition(view);
                    int childCount = a.this.f5033b.getChildCount();
                    for (int i8 = 0; i8 < childCount; i8++) {
                        if (i8 != childLayoutPosition) {
                            ((RadioButton) a.this.f5033b.getChildAt(i8)).setChecked(false);
                        }
                    }
                    if (a.this.f5034c != null) {
                        a.this.f5034c.onItemSelected(a.this.f5033b, radioButton.getText());
                    }
                }
            }
        }

        /* renamed from: U4.a$a$b */
        class b extends RecyclerView.E {

            /* renamed from: t, reason: collision with root package name */
            private RadioButton f5040t;

            public b(View view) {
                super(view);
                this.f5040t = (RadioButton) view.findViewById(AbstractC5955f.radioTextButton);
            }
        }

        C0078a(List list, int i8) {
            this.f5035d = list;
            this.f5036e = i8;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f5035d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(b bVar, int i8) {
            bVar.f5040t.setText((CharSequence) this.f5035d.get(i8));
            bVar.f5040t.setOnClickListener(this.f5037f);
            if (this.f5036e == i8) {
                bVar.f5040t.setChecked(true);
                this.f5036e = -1;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public b onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return new b(View.inflate(a.this.f5032a, AbstractC5957h.radio_option_item, null));
        }
    }

    interface b {
        void onItemSelected(RecyclerView recyclerView, CharSequence charSequence);
    }

    public a(Context context, RecyclerView recyclerView, List<String> list, int i8, int i9) {
        this.f5032a = context;
        this.f5033b = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(context, i8));
        recyclerView.addItemDecoration(new C6060b(i8));
        recyclerView.setAdapter(new C0078a(list, i9));
    }

    public String getSelectedName() {
        int childCount = this.f5033b.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            RadioButton radioButton = (RadioButton) this.f5033b.getChildAt(i8);
            if (radioButton.isChecked()) {
                return radioButton.getText().toString();
            }
        }
        return null;
    }

    public void setListener(b bVar) {
        this.f5034c = bVar;
    }

    public void unSelectAll() {
        int childCount = this.f5033b.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            ((RadioButton) this.f5033b.getChildAt(i8)).setChecked(false);
        }
    }
}
