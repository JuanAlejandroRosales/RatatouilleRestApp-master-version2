// Generated code from Butter Knife. Do not modify!
package ratatouillerestapp.upc.edu.pe.ui.main.rating;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ratatouillerestapp.upc.edu.pe.R;

public class RateUsDialog_ViewBinding implements Unbinder {
  private RateUsDialog target;

  private View view2131624099;

  private View view2131624096;

  @UiThread
  public RateUsDialog_ViewBinding(final RateUsDialog target, View source) {
    this.target = target;

    View view;
    target.mRatingBar = Utils.findRequiredViewAsType(source, R.id.rating_bar_feedback, "field 'mRatingBar'", RatingBar.class);
    target.mMessage = Utils.findRequiredViewAsType(source, R.id.et_message, "field 'mMessage'", EditText.class);
    target.mRatingMessageView = Utils.findRequiredView(source, R.id.view_rating_message, "field 'mRatingMessageView'");
    target.mPlayStoreRatingView = Utils.findRequiredView(source, R.id.view_play_store_rating, "field 'mPlayStoreRatingView'");
    target.mSubmitButton = Utils.findRequiredViewAsType(source, R.id.btn_submit, "field 'mSubmitButton'", Button.class);
    view = Utils.findRequiredView(source, R.id.btn_later, "method 'onLaterClick'");
    view2131624099 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLaterClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_rate_on_play_store, "method 'onPlayStoreRateClick'");
    view2131624096 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPlayStoreRateClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    RateUsDialog target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRatingBar = null;
    target.mMessage = null;
    target.mRatingMessageView = null;
    target.mPlayStoreRatingView = null;
    target.mSubmitButton = null;

    view2131624099.setOnClickListener(null);
    view2131624099 = null;
    view2131624096.setOnClickListener(null);
    view2131624096 = null;
  }
}
