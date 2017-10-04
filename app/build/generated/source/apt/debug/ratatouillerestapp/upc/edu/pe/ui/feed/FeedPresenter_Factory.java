package ratatouillerestapp.upc.edu.pe.ui.feed;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.base.MvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.base.MvpView;
import ratatouillerestapp.upc.edu.pe.utils.rx.SchedulerProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FeedPresenter_Factory<V extends MvpView, I extends MvpInteractor>
    implements Factory<FeedPresenter<V, I>> {
  private final MembersInjector<FeedPresenter<V, I>> feedPresenterMembersInjector;

  private final Provider<I> mvpInteractorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public FeedPresenter_Factory(
      MembersInjector<FeedPresenter<V, I>> feedPresenterMembersInjector,
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert feedPresenterMembersInjector != null;
    this.feedPresenterMembersInjector = feedPresenterMembersInjector;
    assert mvpInteractorProvider != null;
    this.mvpInteractorProvider = mvpInteractorProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public FeedPresenter<V, I> get() {
    return MembersInjectors.injectMembers(
        feedPresenterMembersInjector,
        new FeedPresenter<V, I>(
            mvpInteractorProvider.get(),
            schedulerProvider.get(),
            compositeDisposableProvider.get()));
  }

  public static <V extends MvpView, I extends MvpInteractor> Factory<FeedPresenter<V, I>> create(
      MembersInjector<FeedPresenter<V, I>> feedPresenterMembersInjector,
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new FeedPresenter_Factory<V, I>(
        feedPresenterMembersInjector,
        mvpInteractorProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
