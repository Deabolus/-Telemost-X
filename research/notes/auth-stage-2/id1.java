package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.yandex.messaging.ui.auth.ProxyPassportActivity;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class id1 extends ye2 implements View.OnClickListener {
    public final Activity i;
    public final pgr j;
    public final g0j k;
    public final ce4 l;
    public final View m;

    public id1(Activity activity, pgr pgrVar, g0j g0jVar, yhm yhmVar, ce4 ce4Var) {
        this.i = activity;
        this.j = pgrVar;
        this.k = g0jVar;
        this.l = ce4Var;
        View viewY = ye2.Y(activity, 2131624128);
        this.m = viewY;
        TextView textView = (TextView) viewY.findViewById(2131428753);
        textView.setText(2132017704);
        textView.setOnClickListener(this);
        yhmVar.Z((jf2) viewY.findViewById(2131428755));
    }

    @Override // defpackage.ye2
    public final View X() {
        return this.m;
    }

    @Override // defpackage.ye2, defpackage.hf2
    public final void a() {
        super.a();
        this.l.b(this.i.getResources().getDimensionPixelSize(2131165338));
        this.j.b(this.m, "auth_without_phone_button", null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        chg chgVar = chg.JOIN_CHAT;
        g0j g0jVar = this.k;
        g0jVar.b.j("login_without_phone_requirement", "am account request", "reason");
        Activity activity = g0jVar.a;
        Intent intent = new Intent(activity, (Class<?>) ProxyPassportActivity.class);
        intent.setAction("LOGIN");
        activity.startActivityForResult(intent, 2571);
    }
}
