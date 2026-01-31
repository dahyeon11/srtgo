package s4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6627a;
import z4.C6630d;

/* loaded from: classes.dex */
public class o extends C6219c {

    private class b extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private LayoutInflater f36263a;

        /* renamed from: b, reason: collision with root package name */
        private List f36264b;

        private class a {

            /* renamed from: a, reason: collision with root package name */
            private TextView f36266a;

            private a() {
            }
        }

        private String a(int i8) {
            return (String) this.f36264b.get(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List list = this.f36264b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return null;
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
                viewInflate = this.f36263a.inflate(AbstractC5957h.list_item_dialog_share, viewGroup, false);
                aVar.f36266a = (TextView) viewInflate.findViewById(AbstractC5955f.tv_nm);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            aVar.f36266a.setText(a(i8));
            C6627a.addClickEvent(aVar.f36266a, o.this.c(AbstractC5959j.open_new_window));
            if (i8 == 0) {
                C6627a.removeClickEvent(aVar.f36266a);
            }
            return viewInflate;
        }

        private b(Context context, List list) {
            this.f36263a = LayoutInflater.from(context);
            this.f36264b = list;
        }
    }

    public o(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(AdapterView.OnItemClickListener onItemClickListener, AdapterView adapterView, View view, int i8, long j8) {
        onItemClickListener.onItemClick(adapterView, view, i8, j8);
        dismissDialog();
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_list);
    }

    public C6219c setListData(List<String> list, final AdapterView.OnItemClickListener onItemClickListener) {
        ListView listView = (ListView) a(AbstractC5955f.lv_dialog_list);
        listView.setAdapter((ListAdapter) new b(getContext(), list));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: s4.n
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                this.f36261a.u(onItemClickListener, adapterView, view, i8, j8);
            }
        });
        return this;
    }
}
