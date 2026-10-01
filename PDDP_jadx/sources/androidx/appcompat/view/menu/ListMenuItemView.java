package androidx.appcompat.view.menu;

import N.C0026b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.deeprf.pddp.R;
import java.lang.reflect.Field;
import p004c.a;
import p014i.j;
import p014i.k;
import p014i.q;
import p042y.x;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f1163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f1164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RadioButton f1165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f1166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CheckBox f1167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f1168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f1169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f1170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f1171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Drawable f1172n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f1174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Drawable f1176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f1177s;
    public LayoutInflater t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1178u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0026b c0026bI = C0026b.I(getContext(), attributeSet, a.f1750n, R.attr.listMenuViewStyle);
        this.f1172n = c0026bI.y(5);
        TypedArray typedArray = (TypedArray) c0026bI.f476f;
        this.f1173o = typedArray.getResourceId(1, -1);
        this.f1175q = typedArray.getBoolean(7, false);
        this.f1174p = context;
        this.f1176r = c0026bI.y(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1177s = typedArrayObtainStyledAttributes.hasValue(0);
        c0026bI.L();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.t == null) {
            this.t = LayoutInflater.from(getContext());
        }
        return this.t;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1169k;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1170l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1170l.getLayoutParams();
        rect.top = this.f1170l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    @Override // p014i.q
    public final void c(k kVar) {
        boolean z2;
        int i2;
        String string;
        boolean z3;
        this.f1163e = kVar;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.f2101e);
        setCheckable(kVar.isCheckable());
        if (kVar.f2110n.n()) {
            if ((kVar.f2110n.m() ? kVar.f2106j : kVar.f2104h) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        kVar.f2110n.m();
        if (z2) {
            k kVar2 = this.f1163e;
            if (kVar2.f2110n.n()) {
                if ((kVar2.f2110n.m() ? kVar2.f2106j : kVar2.f2104h) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            i2 = z3 ? 0 : 8;
        }
        if (i2 == 0) {
            TextView textView = this.f1168j;
            k kVar3 = this.f1163e;
            char c2 = kVar3.f2110n.m() ? kVar3.f2106j : kVar3.f2104h;
            if (c2 == 0) {
                string = "";
            } else {
                j jVar = kVar3.f2110n;
                Resources resources = jVar.f2076a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(jVar.f2076a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = jVar.m() ? kVar3.f2107k : kVar3.f2105i;
                k.a(sb, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                k.a(sb, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                k.a(sb, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                k.a(sb, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                k.a(sb, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                k.a(sb, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c2 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c2 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c2 != ' ') {
                    sb.append(c2);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f1168j.getVisibility() != i2) {
            this.f1168j.setVisibility(i2);
        }
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
        setContentDescription(kVar.f2113q);
    }

    @Override // p014i.q
    public k getItemData() {
        return this.f1163e;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = x.f3474a;
        setBackground(this.f1172n);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1166h = textView;
        int i2 = this.f1173o;
        if (i2 != -1) {
            textView.setTextAppearance(this.f1174p, i2);
        }
        this.f1168j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1169k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1176r);
        }
        this.f1170l = (ImageView) findViewById(R.id.group_divider);
        this.f1171m = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f1164f != null && this.f1175q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1164f.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1165g == null && this.f1167i == null) {
            return;
        }
        if ((this.f1163e.f2119x & 4) != 0) {
            if (this.f1165g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1165g = radioButton;
                LinearLayout linearLayout = this.f1171m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1165g;
            view = this.f1167i;
        } else {
            if (this.f1167i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1167i = checkBox;
                LinearLayout linearLayout2 = this.f1171m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1167i;
            view = this.f1165g;
        }
        if (z2) {
            compoundButton.setChecked(this.f1163e.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1167i;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1165g;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1163e.f2119x & 4) != 0) {
            if (this.f1165g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1165g = radioButton;
                LinearLayout linearLayout = this.f1171m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1165g;
        } else {
            if (this.f1167i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1167i = checkBox;
                LinearLayout linearLayout2 = this.f1171m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1167i;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1178u = z2;
        this.f1175q = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1170l;
        if (imageView != null) {
            imageView.setVisibility((this.f1177s || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1163e.f2110n.getClass();
        boolean z2 = this.f1178u;
        if (z2 || this.f1175q) {
            ImageView imageView = this.f1164f;
            if (imageView == null && drawable == null && !this.f1175q) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1164f = imageView2;
                LinearLayout linearLayout = this.f1171m;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1175q) {
                this.f1164f.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1164f;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1164f.getVisibility() != 0) {
                this.f1164f.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1166h.getVisibility() != 8) {
                this.f1166h.setVisibility(8);
            }
        } else {
            this.f1166h.setText(charSequence);
            if (this.f1166h.getVisibility() != 0) {
                this.f1166h.setVisibility(0);
            }
        }
    }
}
