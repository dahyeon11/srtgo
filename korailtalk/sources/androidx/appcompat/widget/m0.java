package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b0.AbstractC1062c;
import com.kakao.sdk.template.Constants;
import h.AbstractC5563a;
import h.AbstractC5568f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class m0 extends AbstractC1062c implements View.OnClickListener {

    /* renamed from: m */
    private final SearchView f7182m;

    /* renamed from: n */
    private final SearchableInfo f7183n;

    /* renamed from: o */
    private final Context f7184o;

    /* renamed from: p */
    private final WeakHashMap f7185p;

    /* renamed from: q */
    private final int f7186q;

    /* renamed from: r */
    private boolean f7187r;

    /* renamed from: s */
    private int f7188s;

    /* renamed from: t */
    private ColorStateList f7189t;

    /* renamed from: u */
    private int f7190u;

    /* renamed from: v */
    private int f7191v;

    /* renamed from: w */
    private int f7192w;

    /* renamed from: x */
    private int f7193x;

    /* renamed from: y */
    private int f7194y;

    /* renamed from: z */
    private int f7195z;

    private static final class a {
        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;

        public a(View view) {
            this.mText1 = (TextView) view.findViewById(R.id.text1);
            this.mText2 = (TextView) view.findViewById(R.id.text2);
            this.mIcon1 = (ImageView) view.findViewById(R.id.icon1);
            this.mIcon2 = (ImageView) view.findViewById(R.id.icon2);
            this.mIconRefine = (ImageView) view.findViewById(AbstractC5568f.edit_query);
        }
    }

    public m0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f7187r = false;
        this.f7188s = 1;
        this.f7190u = -1;
        this.f7191v = -1;
        this.f7192w = -1;
        this.f7193x = -1;
        this.f7194y = -1;
        this.f7195z = -1;
        this.f7182m = searchView;
        this.f7183n = searchableInfo;
        this.f7186q = searchView.getSuggestionCommitIconResId();
        this.f7184o = context;
        this.f7185p = weakHashMap;
    }

    private Drawable c(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7185p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence d(CharSequence charSequence) {
        if (this.f7189t == null) {
            TypedValue typedValue = new TypedValue();
            this.f7184o.getTheme().resolveAttribute(AbstractC5563a.textColorSearchUrl, typedValue, true);
            this.f7189t = this.f7184o.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f7189t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable e(ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.f7184o.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("SuggestionsAdapter", e8.toString());
            return null;
        }
    }

    private Drawable f(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f7185p.containsKey(strFlattenToShortString)) {
            Drawable drawableE = e(componentName);
            this.f7185p.put(strFlattenToShortString, drawableE != null ? drawableE.getConstantState() : null);
            return drawableE;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7185p.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f7184o.getResources());
    }

    private Drawable g() throws PackageManager.NameNotFoundException {
        Drawable drawableF = f(this.f7183n.getSearchActivity());
        return drawableF != null ? drawableF : this.f7184o.getPackageManager().getDefaultActivityIcon();
    }

    public static String getColumnString(Cursor cursor, String str) {
        return n(cursor, cursor.getColumnIndex(str));
    }

    private Drawable h(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return i(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f7184o.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e8) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e8);
                }
            }
        } catch (FileNotFoundException e9) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e9.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e9.getMessage());
        return null;
    }

    private Drawable j(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i8 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f7184o.getPackageName() + "/" + i8;
            Drawable drawableC = c(str2);
            if (drawableC != null) {
                return drawableC;
            }
            Drawable drawable = androidx.core.content.a.getDrawable(this.f7184o, i8);
            q(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableC2 = c(str);
            if (drawableC2 != null) {
                return drawableC2;
            }
            Drawable drawableH = h(Uri.parse(str));
            q(str, drawableH);
            return drawableH;
        }
    }

    private Drawable k(Cursor cursor) throws NumberFormatException, IOException {
        int i8 = this.f7193x;
        if (i8 == -1) {
            return null;
        }
        Drawable drawableJ = j(cursor.getString(i8));
        return drawableJ != null ? drawableJ : g();
    }

    private Drawable l(Cursor cursor) {
        int i8 = this.f7194y;
        if (i8 == -1) {
            return null;
        }
        return j(cursor.getString(i8));
    }

    private static String n(Cursor cursor, int i8) {
        if (i8 == -1) {
            return null;
        }
        try {
            return cursor.getString(i8);
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e8);
            return null;
        }
    }

    private void o(ImageView imageView, Drawable drawable, int i8) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i8);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void p(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void q(String str, Drawable drawable) {
        if (drawable != null) {
            this.f7185p.put(str, drawable.getConstantState());
        }
    }

    private void r(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // b0.AbstractC1060a
    public void bindView(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i8 = this.f7195z;
        int i9 = i8 != -1 ? cursor.getInt(i8) : 0;
        if (aVar.mText1 != null) {
            p(aVar.mText1, n(cursor, this.f7190u));
        }
        if (aVar.mText2 != null) {
            String strN = n(cursor, this.f7192w);
            CharSequence charSequenceD = strN != null ? d(strN) : n(cursor, this.f7191v);
            if (TextUtils.isEmpty(charSequenceD)) {
                TextView textView = aVar.mText1;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.mText1.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.mText1;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.mText1.setMaxLines(1);
                }
            }
            p(aVar.mText2, charSequenceD);
        }
        ImageView imageView = aVar.mIcon1;
        if (imageView != null) {
            o(imageView, k(cursor), 4);
        }
        ImageView imageView2 = aVar.mIcon2;
        if (imageView2 != null) {
            o(imageView2, l(cursor), 8);
        }
        int i10 = this.f7188s;
        if (i10 != 2 && (i10 != 1 || (i9 & 1) == 0)) {
            aVar.mIconRefine.setVisibility(8);
            return;
        }
        aVar.mIconRefine.setVisibility(0);
        aVar.mIconRefine.setTag(aVar.mText1.getText());
        aVar.mIconRefine.setOnClickListener(this);
    }

    @Override // b0.AbstractC1060a, b0.C1061b.a
    public void changeCursor(Cursor cursor) {
        if (this.f7187r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f7190u = cursor.getColumnIndex("suggest_text_1");
                this.f7191v = cursor.getColumnIndex("suggest_text_2");
                this.f7192w = cursor.getColumnIndex("suggest_text_2_url");
                this.f7193x = cursor.getColumnIndex("suggest_icon_1");
                this.f7194y = cursor.getColumnIndex("suggest_icon_2");
                this.f7195z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e8);
        }
    }

    public void close() {
        changeCursor(null);
        this.f7187r = true;
    }

    @Override // b0.AbstractC1060a, b0.C1061b.a
    public CharSequence convertToString(Cursor cursor) {
        String columnString;
        String columnString2;
        if (cursor == null) {
            return null;
        }
        String columnString3 = getColumnString(cursor, "suggest_intent_query");
        if (columnString3 != null) {
            return columnString3;
        }
        if (this.f7183n.shouldRewriteQueryFromData() && (columnString2 = getColumnString(cursor, "suggest_intent_data")) != null) {
            return columnString2;
        }
        if (!this.f7183n.shouldRewriteQueryFromText() || (columnString = getColumnString(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return columnString;
    }

    @Override // b0.AbstractC1060a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i8, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View viewNewDropDownView = newDropDownView(this.f7184o, getCursor(), viewGroup);
            if (viewNewDropDownView != null) {
                ((a) viewNewDropDownView.getTag()).mText1.setText(e8.toString());
            }
            return viewNewDropDownView;
        }
    }

    public int getQueryRefinement() {
        return this.f7188s;
    }

    @Override // b0.AbstractC1060a, android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i8, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View viewNewView = newView(this.f7184o, getCursor(), viewGroup);
            if (viewNewView != null) {
                ((a) viewNewView.getTag()).mText1.setText(e8.toString());
            }
            return viewNewView;
        }
    }

    @Override // b0.AbstractC1060a, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    Drawable i(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f7184o.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor m(SearchableInfo searchableInfo, String str, int i8) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(Constants.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i8 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i8));
        }
        return this.f7184o.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // b0.AbstractC1062c, b0.AbstractC1060a
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewNewView = super.newView(context, cursor, viewGroup);
        viewNewView.setTag(new a(viewNewView));
        ((ImageView) viewNewView.findViewById(AbstractC5568f.edit_query)).setImageResource(this.f7186q);
        return viewNewView;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        r(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        r(getCursor());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f7182m.M((CharSequence) tag);
        }
    }

    @Override // b0.AbstractC1060a, b0.C1061b.a
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f7182m.getVisibility() == 0 && this.f7182m.getWindowVisibility() == 0) {
            try {
                Cursor cursorM = m(this.f7183n, string, 50);
                if (cursorM != null) {
                    cursorM.getCount();
                    return cursorM;
                }
            } catch (RuntimeException e8) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e8);
            }
        }
        return null;
    }

    public void setQueryRefinement(int i8) {
        this.f7188s = i8;
    }
}
