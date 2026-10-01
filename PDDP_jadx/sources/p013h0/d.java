package p013h0;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.n;
import com.deeprf.pddp.R;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p006d.b;
import p011g0.AbstractActivityC0098e;
import p016j.AbstractC0127y;
import p016j.C0118o;
import p016j.P;
import p016j.h0;
import p028p0.k;
import p031r.a;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2002f;

    public d() {
        this.f1997a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f1998b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f1999c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
        this.f2000d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f2001e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f2002f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i2) {
        int iB = h0.b(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{h0.f2653b, h0.f2655d, h0.f2654c, h0.f2657f}, new int[]{h0.a(context, R.attr.colorButtonNormal), a.b(iB, i2), a.b(iB, i2), i2});
    }

    public static void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterH;
        if (AbstractC0127y.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0118o.f2707b;
        }
        PorterDuff.Mode mode2 = C0118o.f2707b;
        synchronized (C0118o.class) {
            porterDuffColorFilterH = P.h(i2, mode);
        }
        drawable.setColorFilter(porterDuffColorFilterH);
    }

    public ColorStateList c(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return b.b(context, R.color.abc_tint_edittext);
        }
        if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
            return b.b(context, R.color.abc_tint_switch_track);
        }
        if (i2 != R.drawable.abc_switch_thumb_material) {
            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, h0.b(context, R.attr.colorButtonNormal));
            }
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return b(context, h0.b(context, R.attr.colorAccent));
            }
            if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return b.b(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.f1998b, i2)) {
                return h0.c(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f2001e, i2)) {
                return b.b(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f2002f, i2)) {
                return b.b(context, R.color.abc_tint_btn_checkable);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return b.b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListC = h0.c(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListC == null || !colorStateListC.isStateful()) {
            iArr[0] = h0.f2653b;
            iArr2[0] = h0.a(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = h0.f2656e;
            iArr2[1] = h0.b(context, R.attr.colorControlActivated);
            iArr[2] = h0.f2657f;
            iArr2[2] = h0.b(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = h0.f2653b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
            iArr[1] = h0.f2656e;
            iArr2[1] = h0.b(context, R.attr.colorControlActivated);
            iArr[2] = h0.f2657f;
            iArr2[2] = colorStateListC.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean d(int i2, int i3, Intent intent) {
        Iterator it = new HashSet((HashSet) this.f1999c).iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                HashMap map = ((p035t0.a) it.next()).f3076h;
                if (map.containsKey(Integer.valueOf(i2))) {
                    ((k) map.remove(Integer.valueOf(i2))).c(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z2) {
                }
                z2 = true;
            }
            return z2;
        }
    }

    public d(AbstractActivityC0098e abstractActivityC0098e, n nVar) {
        this.f1998b = new HashSet();
        this.f1999c = new HashSet();
        this.f2000d = new HashSet();
        this.f2001e = new HashSet();
        new HashSet();
        this.f2002f = new HashSet();
        this.f1997a = abstractActivityC0098e;
        new HiddenLifecycleReference(nVar);
    }
}
