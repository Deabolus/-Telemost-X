package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public abstract class wc1 extends xc1 {
    @Override // defpackage.xc1
    public final g5l a(g5l g5lVar) {
        g5lVar.a("Authorization", f());
        return g5lVar;
    }

    @Override // defpackage.xc1
    public final wc1 b() {
        return this;
    }

    @Override // defpackage.xc1
    public final boolean c(String str) {
        return f().equals(str);
    }

    @Override // defpackage.xc1
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        return obj instanceof xc1 ? ((xc1) obj).c(f()) : super.equals(obj);
    }

    public abstract String f();

    public abstract String g();

    public boolean h() {
        return this instanceof vc1;
    }

    public final int hashCode() {
        return Objects.hash(g());
    }
}
