package ratatouillerestapp.upc.edu.pe.ui.feed.blogs;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.utils.rx.SchedulerProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlogPresenter_Factory<V extends BlogMvpView, I extends BlogMvpInteractor>
    implements Factory<BlogPresenter<V, I>> {
  private final MembersInjector<BlogPresenter<V, I>> blogPresenterMembersInjector;

  private final Provider<I> mvpInteractorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public BlogPresenter_Factory(
      MembersInjector<BlogPresenter<V, I>> blogPresenterMembersInjector,
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert blogPresenterMembersInjector != null;
    this.blogPresenterMembersInjector = blogPresenterMembersInjector;
    assert mvpInteractorProvider != null;
    this.mvpInteractorProvider = mvpInteractorProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public BlogPresenter<V, I> get() {
    return MembersInjectors.injectMembers(
        blogPresenterMembersInjector,
        new BlogPresenter<V, I>(
            mvpInteractorProvider.get(),
            schedulerProvider.get(),
            compositeDisposableProvider.get()));
  }

  public static <V extends BlogMvpView, I extends BlogMvpInteractor>
      Factory<BlogPresenter<V, I>> create(
          MembersInjector<BlogPresenter<V, I>> blogPresenterMembersInjector,
          Provider<I> mvpInteractorProvider,
          Provider<SchedulerProvider> schedulerProvider,
          Provider<CompositeDisposable> compositeDisposableProvider) {
    return new BlogPresenter_Factory<V, I>(
        blogPresenterMembersInjector,
        mvpInteractorProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
