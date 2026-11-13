package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class p0j {
    public final poq a;
    public final nb1 b;
    public final g1j c;
    public final z81 d;

    public p0j(poq poqVar, nb1 nb1Var, g1j g1jVar, z81 z81Var) {
        mqd.z(poqVar, "authThemeProvider");
        mqd.z(g1jVar, "passportWrapper");
        mqd.z(z81Var, "authAccountFilterProvider");
        this.a = poqVar;
        this.b = nb1Var;
        this.c = g1jVar;
        this.d = z81Var;
    }

    public final Intent a(String str, String str2) {
        nb1 nb1Var = this.b;
        if (nb1Var == null) {
            throw new IllegalStateException("Passport account is required");
        }
        tb1 tb1Var = new tb1(true);
        poq poqVar = this.a;
        return this.c.a(new da1(this.d.a(), poqVar.s(), tb1Var, str, new e91(nb1Var, poqVar.s(), str2)));
    }

    public final Intent b(String str) {
        return this.c.a(new da1(this.d.a(), this.a.s(), new tb1(false), str, null));
    }

    public final u91 c(v91 v91Var) {
        nb1 nb1Var = this.b;
        if (nb1Var != null) {
            return new u91(nb1Var, v91Var, this.a.s());
        }
        throw new IllegalStateException("Passport account is required");
    }
}
