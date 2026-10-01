package p038v;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentProviderClient f3205b;

    public b(Context context, Uri uri, int i2) {
        this.f3204a = i2;
        switch (i2) {
            case 1:
                this.f3205b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.f3205b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    public final void a() {
        switch (this.f3204a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f3205b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.f3205b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                }
                break;
        }
    }
}
