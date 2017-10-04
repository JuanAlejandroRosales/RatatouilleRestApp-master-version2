// Generated code from Butter Knife. Do not modify!
package ratatouillerestapp.upc.edu.pe.ui.customer;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ratatouillerestapp.upc.edu.pe.R;

public class CustomerFragment_ViewBinding implements Unbinder {
  private CustomerFragment target;

  private View view2131558559;

  @UiThread
  public CustomerFragment_ViewBinding(final CustomerFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.nav_back_btn, "method 'onNavBackClick'");
    view2131558559 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onNavBackClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131558559.setOnClickListener(null);
    view2131558559 = null;
  }
}
