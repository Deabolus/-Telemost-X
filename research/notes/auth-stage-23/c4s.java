package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class c4s {
    public final SharedPreferences a;
    public final k45 b;
    public final y8q c;
    public final Looper d;
    public final uyh e;
    public l7l f;

    public c4s(SharedPreferences sharedPreferences, k45 k45Var, y8q y8qVar) {
        mqd.z(sharedPreferences, "prefs");
        mqd.z(k45Var, "clock");
        mqd.z(y8qVar, "apiCalls");
        this.a = sharedPreferences;
        this.b = k45Var;
        this.c = y8qVar;
        this.d = Looper.myLooper();
        this.e = new uyh();
    }
}
