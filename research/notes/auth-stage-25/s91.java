package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class s91 implements f1j, z4k {
    public final uyh a;
    public final ryh b;
    public final Looper c;
    public final Handler d;
    public final SharedPreferences e;
    public final ike f;
    public final oxk g;
    public final b5k h;
    public final nb1 i;
    public xc1 j;
    public cw3 k;
    public final q91 l;

    public s91(Looper looper, SharedPreferences sharedPreferences, nb1 nb1Var, ike ikeVar, oxk oxkVar, b5k b5kVar) {
        uyh uyhVar = new uyh();
        this.a = uyhVar;
        this.b = new ryh(uyhVar);
        this.j = new tc1();
        atl.s(looper, Looper.myLooper(), null);
        this.c = looper;
        this.d = new Handler(looper);
        this.e = sharedPreferences;
        this.i = nb1Var;
        this.f = ikeVar;
        this.g = oxkVar;
        this.h = b5kVar;
        String string = sharedPreferences.getString("oauth_token", null);
        if (string != null) {
            Objects.requireNonNull(nb1Var);
            this.j = xc1.e(string, nb1Var.a);
        }
        q91 q91Var = new q91(this, 0);
        this.l = q91Var;
        sharedPreferences.registerOnSharedPreferenceChangeListener(q91Var);
        b5kVar.a(this);
    }

    @Override // defpackage.f1j
    public final void a(e1j e1jVar, boolean z) {
        String str = e1jVar.a;
        atl.s(this.c, Looper.myLooper(), null);
        nb1 nb1Var = this.i;
        Objects.requireNonNull(nb1Var);
        cw3 cw3Var = this.k;
        if (cw3Var != null) {
            cw3Var.cancel();
            this.k = null;
        }
        wc1 wc1VarE = xc1.e(str, nb1Var.a);
        this.j = wc1VarE;
        this.e.edit().putString("oauth_token", str).apply();
        ryh ryhVar = this.b;
        ryhVar.b();
        while (ryhVar.hasNext()) {
            ((t91) ryhVar.next()).g(wc1VarE, z);
        }
    }

    public final void b(wc1 wc1Var) {
        atl.s(this.c, Looper.myLooper(), null);
        if (this.i != null && this.j.equals(wc1Var)) {
            atl.r(this.k, null);
            atl.t(null, this.j.d());
            String strG = this.j.b().g();
            this.j = new tc1();
            this.e.edit().remove("oauth_token").apply();
            c(strG);
        }
    }

    public final void c(String str) {
        nb1 nb1Var = this.i;
        Objects.requireNonNull(nb1Var);
        ryh ryhVar = this.b;
        ryhVar.b();
        while (ryhVar.hasNext()) {
            ((t91) ryhVar.next()).g(this.j, false);
        }
        this.k = ((g1j) this.f.get()).d(this, nb1Var, str, this.g);
    }

    public final void d() {
        atl.s(this.c, Looper.myLooper(), null);
        if (this.h.d.get() || this.i == null || this.e.contains("oauth_token") || !this.j.d()) {
            return;
        }
        atl.r(this.k, null);
        String strG = this.j.b().g();
        this.j = new tc1();
        c(strG);
    }

    @Override // defpackage.z4k
    public final void e() {
        atl.s(this.c, Looper.myLooper(), null);
        this.e.unregisterOnSharedPreferenceChangeListener(this.l);
        cw3 cw3Var = this.k;
        if (cw3Var != null) {
            cw3Var.cancel();
            this.k = null;
        }
    }

    public final r91 f(t91 t91Var) {
        atl.s(this.c, Looper.myLooper(), null);
        this.a.b(t91Var);
        if (this.j.d()) {
            t91Var.g(this.j, false);
        }
        return new r91(0, this, t91Var);
    }
}
