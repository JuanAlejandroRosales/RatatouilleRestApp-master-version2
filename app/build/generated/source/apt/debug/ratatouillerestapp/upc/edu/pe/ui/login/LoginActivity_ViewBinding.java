// Generated code from Butter Knife. Do not modify!
package ratatouillerestapp.upc.edu.pe.ui.login;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ratatouillerestapp.upc.edu.pe.R;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view2131558522;

  private View view2131558524;

  private View view2131558525;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.mEmailEditText = Utils.findRequiredViewAsType(source, R.id.et_email, "field 'mEmailEditText'", EditText.class);
    target.mPasswordEditText = Utils.findRequiredViewAsType(source, R.id.et_password, "field 'mPasswordEditText'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_server_login, "method 'onServerLoginClick'");
    view2131558522 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onServerLoginClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ib_google_login, "method 'onGoogleLoginClick'");
    view2131558524 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onGoogleLoginClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ib_fb_login, "method 'onFbLoginClick'");
    view2131558525 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFbLoginClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mEmailEditText = null;
    target.mPasswordEditText = null;

    view2131558522.setOnClickListener(null);
    view2131558522 = null;
    view2131558524.setOnClickListener(null);
    view2131558524 = null;
    view2131558525.setOnClickListener(null);
    view2131558525 = null;
  }
}
