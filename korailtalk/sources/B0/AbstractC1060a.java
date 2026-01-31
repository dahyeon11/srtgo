package b0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import b0.C1061b;
import com.j256.ormlite.field.FieldType;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1060a extends BaseAdapter implements Filterable, C1061b.a {

    @Deprecated
    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f11275a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f11276b;

    /* renamed from: c, reason: collision with root package name */
    protected Cursor f11277c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f11278d;

    /* renamed from: e, reason: collision with root package name */
    protected int f11279e;

    /* renamed from: f, reason: collision with root package name */
    protected C0186a f11280f;

    /* renamed from: g, reason: collision with root package name */
    protected DataSetObserver f11281g;

    /* renamed from: h, reason: collision with root package name */
    protected C1061b f11282h;

    /* renamed from: i, reason: collision with root package name */
    protected FilterQueryProvider f11283i;

    /* renamed from: b0.a$a, reason: collision with other inner class name */
    private class C0186a extends ContentObserver {
        C0186a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z8) {
            AbstractC1060a.this.b();
        }
    }

    /* renamed from: b0.a$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC1060a abstractC1060a = AbstractC1060a.this;
            abstractC1060a.f11275a = true;
            abstractC1060a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC1060a abstractC1060a = AbstractC1060a.this;
            abstractC1060a.f11275a = false;
            abstractC1060a.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public AbstractC1060a(Context context, Cursor cursor) {
        a(context, cursor, 1);
    }

    void a(Context context, Cursor cursor, int i8) {
        if ((i8 & 1) == 1) {
            i8 |= 2;
            this.f11276b = true;
        } else {
            this.f11276b = false;
        }
        boolean z8 = cursor != null;
        this.f11277c = cursor;
        this.f11275a = z8;
        this.f11278d = context;
        this.f11279e = z8 ? cursor.getColumnIndexOrThrow(FieldType.FOREIGN_ID_FIELD_SUFFIX) : -1;
        if ((i8 & 2) == 2) {
            this.f11280f = new C0186a();
            this.f11281g = new b();
        } else {
            this.f11280f = null;
            this.f11281g = null;
        }
        if (z8) {
            C0186a c0186a = this.f11280f;
            if (c0186a != null) {
                cursor.registerContentObserver(c0186a);
            }
            DataSetObserver dataSetObserver = this.f11281g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    protected void b() {
        Cursor cursor;
        if (!this.f11276b || (cursor = this.f11277c) == null || cursor.isClosed()) {
            return;
        }
        this.f11275a = this.f11277c.requery();
    }

    public abstract void bindView(View view, Context context, Cursor cursor);

    public void changeCursor(Cursor cursor) {
        Cursor cursorSwapCursor = swapCursor(cursor);
        if (cursorSwapCursor != null) {
            cursorSwapCursor.close();
        }
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f11275a || (cursor = this.f11277c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // b0.C1061b.a
    public Cursor getCursor() {
        return this.f11277c;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f11275a) {
            return null;
        }
        this.f11277c.moveToPosition(i8);
        if (view == null) {
            view = newDropDownView(this.f11278d, this.f11277c, viewGroup);
        }
        bindView(view, this.f11278d, this.f11277c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f11282h == null) {
            this.f11282h = new C1061b(this);
        }
        return this.f11282h;
    }

    public FilterQueryProvider getFilterQueryProvider() {
        return this.f11283i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i8) {
        Cursor cursor;
        if (!this.f11275a || (cursor = this.f11277c) == null) {
            return null;
        }
        cursor.moveToPosition(i8);
        return this.f11277c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        Cursor cursor;
        if (this.f11275a && (cursor = this.f11277c) != null && cursor.moveToPosition(i8)) {
            return this.f11277c.getLong(this.f11279e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f11275a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f11277c.moveToPosition(i8)) {
            if (view == null) {
                view = newView(this.f11278d, this.f11277c, viewGroup);
            }
            bindView(view, this.f11278d, this.f11277c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i8);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return newView(context, cursor, viewGroup);
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewGroup);

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f11283i;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f11277c;
    }

    public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) {
        this.f11283i = filterQueryProvider;
    }

    public Cursor swapCursor(Cursor cursor) {
        Cursor cursor2 = this.f11277c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0186a c0186a = this.f11280f;
            if (c0186a != null) {
                cursor2.unregisterContentObserver(c0186a);
            }
            DataSetObserver dataSetObserver = this.f11281g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f11277c = cursor;
        if (cursor != null) {
            C0186a c0186a2 = this.f11280f;
            if (c0186a2 != null) {
                cursor.registerContentObserver(c0186a2);
            }
            DataSetObserver dataSetObserver2 = this.f11281g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f11279e = cursor.getColumnIndexOrThrow(FieldType.FOREIGN_ID_FIELD_SUFFIX);
            this.f11275a = true;
            notifyDataSetChanged();
        } else {
            this.f11279e = -1;
            this.f11275a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public AbstractC1060a(Context context, Cursor cursor, boolean z8) {
        a(context, cursor, z8 ? 1 : 2);
    }

    public AbstractC1060a(Context context, Cursor cursor, int i8) {
        a(context, cursor, i8);
    }
}
