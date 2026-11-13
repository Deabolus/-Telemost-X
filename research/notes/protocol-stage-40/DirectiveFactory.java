package com.yandex.messaging.core.net.entities.directives;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public class DirectiveFactory {
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();
    public final pib a;
    public final lib b;

    static {
        a(OpenBotDirective.class, "open_bot");
        a(OpenDialogDirective.class, "open_dialog");
        a(OpenUriDirective.class, "open_uri");
        a(TypeDirective.class, "type");
        a(CallPhoneDirective.class, "call_phone");
        a(OpenPaymentDirective.class, "open_payment");
        a(SendMessageDirective.class, "send_message");
        a(OpenIFrameDirective.class, "open_iframe");
        a(SetElementsStateDirective.class, "set_elements_state");
    }

    public DirectiveFactory(pib pibVar, lib libVar) {
        this.a = pibVar;
        this.b = libVar;
    }

    public static void a(Class cls, String str) {
        c.put(str, cls);
        d.put(cls, str);
    }

    public final Directive b(Object obj, String str, String str2) {
        str.getClass();
        if (str.equals("client_action")) {
            if ("send_bot_request".equals(str2)) {
                SendBotRequestDirective sendBotRequestDirective = new SendBotRequestDirective();
                sendBotRequestDirective.b = obj;
                return sendBotRequestDirective;
            }
            Class cls = (Class) c.get(str2);
            if (cls != null) {
                return (Directive) this.a.invoke(cls, obj);
            }
            throw new IllegalArgumentException(wq1.h("Unknown client_action: ", str2));
        }
        if (!str.equals("server_action")) {
            throw new IllegalArgumentException("Unknown directive type: ".concat(str));
        }
        if (obj instanceof Map) {
            return new ServerDirective(str2, (String) this.b.invoke((Map) obj));
        }
        if ((obj instanceof String) || obj == null) {
            return new ServerDirective(str2, (String) obj);
        }
        throw new IllegalArgumentException("Impossible to parse ServerDirective payload: " + obj + " (" + obj.getClass() + ")");
    }
}
