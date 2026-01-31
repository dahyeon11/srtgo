package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC0942b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class e implements W.a {

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f6604A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    private final Context f6605a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f6606b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6607c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6608d;

    /* renamed from: e, reason: collision with root package name */
    private a f6609e;

    /* renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f6617m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f6618n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f6619o;

    /* renamed from: p, reason: collision with root package name */
    View f6620p;

    /* renamed from: x, reason: collision with root package name */
    private h f6628x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f6630z;

    /* renamed from: l, reason: collision with root package name */
    private int f6616l = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6621q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6622r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6623s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f6624t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6625u = false;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f6626v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f6627w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    private boolean f6629y = false;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f6610f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f6611g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private boolean f6612h = true;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f6613i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f6614j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private boolean f6615k = true;

    public interface a {
        boolean onMenuItemSelected(e eVar, MenuItem menuItem);

        void onMenuModeChange(e eVar);
    }

    public interface b {
        boolean invokeItem(h hVar);
    }

    public e(Context context) {
        this.f6605a = context;
        this.f6606b = context.getResources();
        x(true);
    }

    private h b(int i8, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        return new h(this, i8, i9, i10, i11, charSequence, i12);
    }

    private void d(boolean z8) {
        if (this.f6627w.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator it = this.f6627w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            k kVar = (k) weakReference.get();
            if (kVar == null) {
                this.f6627w.remove(weakReference);
            } else {
                kVar.updateMenuView(z8);
            }
        }
        startDispatchingItemsChanged();
    }

    private void e(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f6627w.isEmpty()) {
            return;
        }
        Iterator it = this.f6627w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            k kVar = (k) weakReference.get();
            if (kVar == null) {
                this.f6627w.remove(weakReference);
            } else {
                int id = kVar.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    kVar.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    private void f(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.f6627w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = this.f6627w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            k kVar = (k) weakReference.get();
            if (kVar == null) {
                this.f6627w.remove(weakReference);
            } else {
                int id = kVar.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = kVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private boolean g(n nVar, k kVar) {
        if (this.f6627w.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = kVar != null ? kVar.onSubMenuSelected(nVar) : false;
        Iterator it = this.f6627w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            k kVar2 = (k) weakReference.get();
            if (kVar2 == null) {
                this.f6627w.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = kVar2.onSubMenuSelected(nVar);
            }
        }
        return zOnSubMenuSelected;
    }

    private static int h(ArrayList arrayList, int i8) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((h) arrayList.get(size)).getOrdering() <= i8) {
                return size + 1;
            }
        }
        return 0;
    }

    private static int l(int i8) {
        int i9 = ((-65536) & i8) >> 16;
        if (i9 >= 0) {
            int[] iArr = f6604A;
            if (i9 < iArr.length) {
                return (i8 & 65535) | (iArr[i9] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void p(int i8, boolean z8) {
        if (i8 < 0 || i8 >= this.f6610f.size()) {
            return;
        }
        this.f6610f.remove(i8);
        if (z8) {
            onItemsChanged(true);
        }
    }

    private void t(int i8, CharSequence charSequence, int i9, Drawable drawable, View view) {
        Resources resourcesM = m();
        if (view != null) {
            this.f6620p = view;
            this.f6618n = null;
            this.f6619o = null;
        } else {
            if (i8 > 0) {
                this.f6618n = resourcesM.getText(i8);
            } else if (charSequence != null) {
                this.f6618n = charSequence;
            }
            if (i9 > 0) {
                this.f6619o = androidx.core.content.a.getDrawable(getContext(), i9);
            } else if (drawable != null) {
                this.f6619o = drawable;
            }
            this.f6620p = null;
        }
        onItemsChanged(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void x(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f6606b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f6605a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f6605a
            boolean r3 = androidx.core.view.AbstractC0993t0.shouldShowMenuShortcutsWhenKeyboardPresent(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f6608d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.x(boolean):void");
    }

    protected MenuItem a(int i8, int i9, int i10, CharSequence charSequence) {
        int iL = l(i10);
        h hVarB = b(i8, i9, i10, iL, charSequence, this.f6616l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f6617m;
        if (contextMenuInfo != null) {
            hVarB.g(contextMenuInfo);
        }
        ArrayList arrayList = this.f6610f;
        arrayList.add(h(arrayList, iL), hVarB);
        onItemsChanged(true);
        return hVarB;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i8, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        int i12;
        PackageManager packageManager = this.f6605a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i11 & 1) == 0) {
            removeGroup(i8);
        }
        for (int i13 = 0; i13 < size; i13++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i13);
            int i14 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i14 < 0 ? intent : intentArr[i14]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i8, i9, i10, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i12 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i12] = intent3;
            }
        }
        return size;
    }

    public void addMenuPresenter(k kVar) {
        addMenuPresenter(kVar, this.f6605a);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    boolean c(e eVar, MenuItem menuItem) {
        a aVar = this.f6609e;
        return aVar != null && aVar.onMenuItemSelected(eVar, menuItem);
    }

    public void changeMenuMode() {
        a aVar = this.f6609e;
        if (aVar != null) {
            aVar.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        h hVar = this.f6628x;
        if (hVar != null) {
            collapseItemActionView(hVar);
        }
        this.f6610f.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.f6621q = true;
        clear();
        clearHeader();
        this.f6627w.clear();
        this.f6621q = false;
        this.f6622r = false;
        this.f6623s = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.f6619o = null;
        this.f6618n = null;
        this.f6620p = null;
        onItemsChanged(false);
    }

    public final void close(boolean z8) {
        if (this.f6625u) {
            return;
        }
        this.f6625u = true;
        Iterator it = this.f6627w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            k kVar = (k) weakReference.get();
            if (kVar == null) {
                this.f6627w.remove(weakReference);
            } else {
                kVar.onCloseMenu(this, z8);
            }
        }
        this.f6625u = false;
    }

    public boolean collapseItemActionView(h hVar) {
        boolean zCollapseItemActionView = false;
        if (!this.f6627w.isEmpty() && this.f6628x == hVar) {
            stopDispatchingItemsChanged();
            Iterator it = this.f6627w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                k kVar = (k) weakReference.get();
                if (kVar == null) {
                    this.f6627w.remove(weakReference);
                } else {
                    zCollapseItemActionView = kVar.collapseItemActionView(this, hVar);
                    if (zCollapseItemActionView) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.f6628x = null;
            }
        }
        return zCollapseItemActionView;
    }

    public boolean expandItemActionView(h hVar) {
        boolean zExpandItemActionView = false;
        if (this.f6627w.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator it = this.f6627w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            k kVar = (k) weakReference.get();
            if (kVar == null) {
                this.f6627w.remove(weakReference);
            } else {
                zExpandItemActionView = kVar.expandItemActionView(this, hVar);
                if (zExpandItemActionView) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.f6628x = hVar;
        }
        return zExpandItemActionView;
    }

    public int findGroupIndex(int i8) {
        return findGroupIndex(i8, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i8) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            h hVar = (h) this.f6610f.get(i9);
            if (hVar.getItemId() == i8) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (menuItemFindItem = hVar.getSubMenu().findItem(i8)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((h) this.f6610f.get(i9)).getItemId() == i8) {
                return i9;
            }
        }
        return -1;
    }

    public void flagActionItems() {
        ArrayList<h> visibleItems = getVisibleItems();
        if (this.f6615k) {
            Iterator it = this.f6627w.iterator();
            boolean zFlagActionItems = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                k kVar = (k) weakReference.get();
                if (kVar == null) {
                    this.f6627w.remove(weakReference);
                } else {
                    zFlagActionItems |= kVar.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.f6613i.clear();
                this.f6614j.clear();
                int size = visibleItems.size();
                for (int i8 = 0; i8 < size; i8++) {
                    h hVar = visibleItems.get(i8);
                    if (hVar.isActionButton()) {
                        this.f6613i.add(hVar);
                    } else {
                        this.f6614j.add(hVar);
                    }
                }
            } else {
                this.f6613i.clear();
                this.f6614j.clear();
                this.f6614j.addAll(getVisibleItems());
            }
            this.f6615k = false;
        }
    }

    public ArrayList<h> getActionItems() {
        flagActionItems();
        return this.f6613i;
    }

    protected String getActionViewStatesKey() {
        return "android:menu:actionviewstates";
    }

    public Context getContext() {
        return this.f6605a;
    }

    public h getExpandedItem() {
        return this.f6628x;
    }

    public Drawable getHeaderIcon() {
        return this.f6619o;
    }

    public CharSequence getHeaderTitle() {
        return this.f6618n;
    }

    public View getHeaderView() {
        return this.f6620p;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i8) {
        return (MenuItem) this.f6610f.get(i8);
    }

    public ArrayList<h> getNonActionItems() {
        flagActionItems();
        return this.f6614j;
    }

    public e getRootMenu() {
        return this;
    }

    public ArrayList<h> getVisibleItems() {
        if (!this.f6612h) {
            return this.f6611g;
        }
        this.f6611g.clear();
        int size = this.f6610f.size();
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = (h) this.f6610f.get(i8);
            if (hVar.isVisible()) {
                this.f6611g.add(hVar);
            }
        }
        this.f6612h = false;
        this.f6615k = true;
        return this.f6611g;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f6630z) {
            return true;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((h) this.f6610f.get(i8)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    h i(int i8, KeyEvent keyEvent) {
        ArrayList arrayList = this.f6626v;
        arrayList.clear();
        j(arrayList, i8, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (h) arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i9 = 0; i9 < size; i9++) {
            h hVar = (h) arrayList.get(i9);
            char alphabeticShortcut = zIsQwertyMode ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && alphabeticShortcut == '\b' && i8 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    public boolean isGroupDividerEnabled() {
        return this.f6629y;
    }

    boolean isQwertyMode() {
        return this.f6607c;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i8, KeyEvent keyEvent) {
        return i(i8, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.f6608d;
    }

    void j(List list, int i8, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i8 == 67) {
            int size = this.f6610f.size();
            for (int i9 = 0; i9 < size; i9++) {
                h hVar = (h) this.f6610f.get(i9);
                if (hVar.hasSubMenu()) {
                    ((e) hVar.getSubMenu()).j(list, i8, keyEvent);
                }
                char alphabeticShortcut = zIsQwertyMode ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
                if ((modifiers & W.a.SUPPORTED_MODIFIERS_MASK) == ((zIsQwertyMode ? hVar.getAlphabeticModifiers() : hVar.getNumericModifiers()) & W.a.SUPPORTED_MODIFIERS_MASK) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zIsQwertyMode && alphabeticShortcut == '\b' && i8 == 67)) && hVar.isEnabled()) {
                        list.add(hVar);
                    }
                }
            }
        }
    }

    boolean k() {
        return this.f6624t;
    }

    Resources m() {
        return this.f6606b;
    }

    void n(h hVar) {
        this.f6615k = true;
        onItemsChanged(true);
    }

    void o(h hVar) {
        this.f6612h = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z8) {
        if (this.f6621q) {
            this.f6622r = true;
            if (z8) {
                this.f6623s = true;
                return;
            }
            return;
        }
        if (z8) {
            this.f6612h = true;
            this.f6615k = true;
        }
        d(z8);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i8, int i9) {
        return performItemAction(findItem(i8), i9);
    }

    public boolean performItemAction(MenuItem menuItem, int i8) {
        return performItemAction(menuItem, null, i8);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i8, KeyEvent keyEvent, int i9) {
        h hVarI = i(i8, keyEvent);
        boolean zPerformItemAction = hVarI != null ? performItemAction(hVarI, i9) : false;
        if ((i9 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    void q(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f6610f.size();
        stopDispatchingItemsChanged();
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = (h) this.f6610f.get(i8);
            if (hVar.getGroupId() == groupId && hVar.isExclusiveCheckable() && hVar.isCheckable()) {
                hVar.f(hVar == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    protected e r(int i8) {
        t(0, null, i8, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void removeGroup(int i8) {
        int iFindGroupIndex = findGroupIndex(i8);
        if (iFindGroupIndex >= 0) {
            int size = this.f6610f.size() - iFindGroupIndex;
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                if (i9 >= size || ((h) this.f6610f.get(iFindGroupIndex)).getGroupId() != i8) {
                    break;
                }
                p(iFindGroupIndex, false);
                i9 = i10;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i8) {
        p(findItemIndex(i8), true);
    }

    public void removeItemAt(int i8) {
        p(i8, true);
    }

    public void removeMenuPresenter(k kVar) {
        Iterator it = this.f6627w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            k kVar2 = (k) weakReference.get();
            if (kVar2 == null || kVar2 == kVar) {
                this.f6627w.remove(weakReference);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = getItem(i8);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((n) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i9 = bundle.getInt("android:menu:expandedactionview");
        if (i9 <= 0 || (menuItemFindItem = findItem(i9)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        e(bundle);
    }

    protected e s(Drawable drawable) {
        t(0, null, 0, drawable, null);
        return this;
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = getItem(i8);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((n) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        f(bundle);
    }

    public void setCallback(a aVar) {
        this.f6609e = aVar;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f6617m = contextMenuInfo;
    }

    public e setDefaultShowAsAction(int i8) {
        this.f6616l = i8;
        return this;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i8, boolean z8, boolean z9) {
        int size = this.f6610f.size();
        for (int i9 = 0; i9 < size; i9++) {
            h hVar = (h) this.f6610f.get(i9);
            if (hVar.getGroupId() == i8) {
                hVar.setExclusiveCheckable(z9);
                hVar.setCheckable(z8);
            }
        }
    }

    @Override // W.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z8) {
        this.f6629y = z8;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i8, boolean z8) {
        int size = this.f6610f.size();
        for (int i9 = 0; i9 < size; i9++) {
            h hVar = (h) this.f6610f.get(i9);
            if (hVar.getGroupId() == i8) {
                hVar.setEnabled(z8);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i8, boolean z8) {
        int size = this.f6610f.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            h hVar = (h) this.f6610f.get(i9);
            if (hVar.getGroupId() == i8 && hVar.h(z8)) {
                z9 = true;
            }
        }
        if (z9) {
            onItemsChanged(true);
        }
    }

    public void setOptionalIconsVisible(boolean z8) {
        this.f6624t = z8;
    }

    public void setOverrideVisibleItems(boolean z8) {
        this.f6630z = z8;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z8) {
        this.f6607c = z8;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z8) {
        if (this.f6608d == z8) {
            return;
        }
        x(z8);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f6610f.size();
    }

    public void startDispatchingItemsChanged() {
        this.f6621q = false;
        if (this.f6622r) {
            this.f6622r = false;
            onItemsChanged(this.f6623s);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.f6621q) {
            return;
        }
        this.f6621q = true;
        this.f6622r = false;
        this.f6623s = false;
    }

    protected e u(int i8) {
        t(i8, null, 0, null, null);
        return this;
    }

    protected e v(CharSequence charSequence) {
        t(0, charSequence, 0, null, null);
        return this;
    }

    protected e w(View view) {
        t(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i8) {
        return a(0, 0, 0, this.f6606b.getString(i8));
    }

    public void addMenuPresenter(k kVar, Context context) {
        this.f6627w.add(new WeakReference(kVar));
        kVar.initForMenu(context, this);
        this.f6615k = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8) {
        return addSubMenu(0, 0, 0, this.f6606b.getString(i8));
    }

    public int findGroupIndex(int i8, int i9) {
        int size = size();
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < size) {
            if (((h) this.f6610f.get(i9)).getGroupId() == i8) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public boolean performItemAction(MenuItem menuItem, k kVar, int i8) {
        h hVar = (h) menuItem;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        boolean zInvoke = hVar.invoke();
        AbstractC0942b supportActionProvider = hVar.getSupportActionProvider();
        boolean z8 = supportActionProvider != null && supportActionProvider.hasSubMenu();
        if (hVar.hasCollapsibleActionView()) {
            zInvoke |= hVar.expandActionView();
            if (zInvoke) {
                close(true);
            }
        } else if (hVar.hasSubMenu() || z8) {
            if ((i8 & 4) == 0) {
                close(false);
            }
            if (!hVar.hasSubMenu()) {
                hVar.setSubMenu(new n(getContext(), this, hVar));
            }
            n nVar = (n) hVar.getSubMenu();
            if (z8) {
                supportActionProvider.onPrepareSubMenu(nVar);
            }
            zInvoke |= g(nVar, kVar);
            if (!zInvoke) {
                close(true);
            }
        } else if ((i8 & 1) == 0) {
            close(true);
        }
        return zInvoke;
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, CharSequence charSequence) {
        return a(i8, i9, i10, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, CharSequence charSequence) {
        h hVar = (h) a(i8, i9, i10, charSequence);
        n nVar = new n(this.f6605a, this, hVar);
        hVar.setSubMenu(nVar);
        return nVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i8, int i9, int i10, int i11) {
        return a(i8, i9, i10, this.f6606b.getString(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i8, int i9, int i10, int i11) {
        return addSubMenu(i8, i9, i10, this.f6606b.getString(i11));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }
}
