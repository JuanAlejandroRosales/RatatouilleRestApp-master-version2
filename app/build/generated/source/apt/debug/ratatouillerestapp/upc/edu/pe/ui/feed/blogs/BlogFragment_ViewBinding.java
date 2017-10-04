// Generated code from Butter Knife. Do not modify!
package ratatouillerestapp.upc.edu.pe.ui.feed.blogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ratatouillerestapp.upc.edu.pe.R;

public class BlogFragment_ViewBinding implements Unbinder {
  private BlogFragment target;

  @UiThread
  public BlogFragment_ViewBinding(BlogFragment target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.blog_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BlogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
