package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final /* synthetic */ class q91 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q91(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.a) {
            case 0:
                s91 s91Var = (s91) this.b;
                if ("oauth_token".equals(str)) {
                    if (Looper.myLooper() != s91Var.c) {
                        s91Var.d.post(new rl(s91Var, 13));
                    } else {
                        s91Var.d();
                    }
                    break;
                }
                break;
            default:
                h54 h54Var = (g1k) this.b;
                if (mqd.s(str, "oauth_token")) {
                    h54Var.j(sharedPreferences.getString("oauth_token", null));
                }
                break;
        }
    }
}
