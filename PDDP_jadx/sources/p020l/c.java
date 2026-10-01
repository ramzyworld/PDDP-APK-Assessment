package p020l;

import androidx.lifecycle.m;
import io.flutter.embedding.engine.renderer.b;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f2815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f2816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f2817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f2818h;

    public c(b bVar, m mVar) {
        this.f2815e = bVar;
        this.f2816f = mVar;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2815e.equals(cVar.f2815e) && this.f2816f.equals(cVar.f2816f);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2815e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2816f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2815e.hashCode() ^ this.f2816f.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2815e + "=" + this.f2816f;
    }
}
