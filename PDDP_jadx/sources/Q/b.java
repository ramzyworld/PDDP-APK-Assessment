package Q;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Drawable.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f595e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f596f;

    public /* synthetic */ b() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f595e) {
            case 0:
                ((e) this.f596f).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        switch (this.f595e) {
            case 0:
                ((e) this.f596f).scheduleSelf(runnable, j2);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f596f;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j2);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f595e) {
            case 0:
                ((e) this.f596f).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f596f;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
        }
    }

    public b(e eVar) {
        this.f596f = eVar;
    }

    private final void a(Drawable drawable) {
    }
}
