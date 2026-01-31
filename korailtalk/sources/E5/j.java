package E5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.korail.talk.network.dao.common.CommonCodeDao;
import java.util.ArrayList;
import java.util.Iterator;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.H;
import z4.q;

/* loaded from: classes.dex */
public class j extends BaseExpandableListAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1049a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f1050b;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1051a;

        /* renamed from: b, reason: collision with root package name */
        private final g f1052b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f1053c = new ArrayList();

        a(g gVar) {
            this.f1052b = gVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.j.<init>(android.content.Context):void");
    }

    private a a(g gVar) {
        Iterator it = this.f1050b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f1052b == gVar) {
                return aVar;
            }
        }
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i8, int i9) {
        return i9;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i8, int i9, boolean z8, View view, ViewGroup viewGroup) {
        TextView textView;
        h hVar = (h) ((a) this.f1050b.get(i8)).f1053c.get(i9);
        if (view == null || (textView = (TextView) view.findViewById(AbstractC5955f.subMenuTxt)) == null) {
            view = LayoutInflater.from(this.f1049a).inflate(AbstractC5957h.navigation_menu_list_sub, viewGroup, false);
            textView = (TextView) view.findViewById(AbstractC5955f.subMenuTxt);
        }
        view.setTag(hVar);
        textView.setText(hVar.getNameResId());
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i8) {
        return ((a) this.f1050b.get(i8)).f1053c.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f1050b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i8) {
        return i8;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i8, boolean z8, View view, ViewGroup viewGroup) {
        TextView textView;
        a aVar = (a) this.f1050b.get(i8);
        if (view == null || (textView = (TextView) view.findViewById(AbstractC5955f.cateMenuTxt)) == null) {
            view = LayoutInflater.from(this.f1049a).inflate(AbstractC5957h.navigation_menu_list_cate, viewGroup, false);
            textView = (TextView) view.findViewById(AbstractC5955f.cateMenuTxt);
        }
        view.setTag(aVar.f1052b);
        textView.setText(aVar.f1052b.getNameResId());
        textView.setSelected(z8);
        if (aVar.f1053c.size() == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, AbstractC5954e.selector_arrow_gray, 0);
        }
        if (!z8 && aVar.f1051a && (viewGroup instanceof ExpandableListView)) {
            ((ExpandableListView) viewGroup).expandGroup(i8);
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i8, int i9) {
        return true;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.ExpandableListAdapter
    public void onGroupCollapsed(int i8) {
        super.onGroupCollapsed(i8);
        ((a) this.f1050b.get(i8)).f1051a = false;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.ExpandableListAdapter
    public void onGroupExpanded(int i8) {
        super.onGroupExpanded(i8);
        ((a) this.f1050b.get(i8)).f1051a = true;
    }

    public void setLogin(boolean z8) {
        a aVarA = a(g.SETTINGS);
        if (aVarA == null) {
            return;
        }
        ArrayList arrayList = aVarA.f1053c;
        h hVar = h.LOGIN;
        arrayList.remove(hVar);
        h hVar2 = h.LOGOUT;
        arrayList.remove(hVar2);
        if (z8) {
            arrayList.add(hVar2);
        } else {
            arrayList.add(hVar);
        }
        CommonCodeDao.ViewVisibility viewVisibility = (CommonCodeDao.ViewVisibility) q.fromJson(H.getString(this.f1049a, "VIEW_VISIBILITY"), CommonCodeDao.ViewVisibility.class);
        a aVarA2 = a(g.CUSTOMER_SERVICE);
        if (aVarA2 == null) {
            return;
        }
        ArrayList arrayList2 = aVarA2.f1053c;
        h hVar3 = h.HEARING_IMPAIRED;
        arrayList2.remove(hVar3);
        if (viewVisibility.getHearingImpairedExps() != null && viewVisibility.getHearingImpairedExps().equals("Y") && I4.h.getInstance().isLogin()) {
            arrayList2.add(hVar3);
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public h getChild(int i8, int i9) {
        return (h) ((a) this.f1050b.get(i8)).f1053c.get(i9);
    }

    @Override // android.widget.ExpandableListAdapter
    public a getGroup(int i8) {
        return (a) this.f1050b.get(i8);
    }
}
