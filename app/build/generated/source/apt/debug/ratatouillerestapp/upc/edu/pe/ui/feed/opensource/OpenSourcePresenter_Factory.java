package ratatouillerestapp.upc.edu.pe.ui.feed.opensource;

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
public final class OpenSourcePresenter_Factory<
        V extends OpenSourceMvpView, I extends OpenSourceMvpInteractor>
    implements Factory<OpenSourcePresenter<V, I>> {
  private final MembersInjector<OpenSourcePresenter<V, I>> openSourcePresenterMembersInjector;

  private final Provider<I> mvpInteractorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public OpenSourcePresenter_Factory(
      MembersInjector<OpenSourcePresenter<V, I>> openSourcePresenterMembersInjector,
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert openSourcePresenterMembersInjector != null;
    this.openSourcePresenterMembersInjector = openSourcePresenterMembersInjector;
    assert mvpInteractorProvider != null;
    this.mvpInteractorProvider = mvpInteractorProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public OpenSourcePresenter<V, I> get() {
    return MembersInjectors.injectMembers(
        openSourcePresenterMembersInjector,
        new OpenSourcePresenter<V, I>(
            mvpInteractorProvider.get(),
            schedulerProvider.get(),
            compositeDisposableProvider.get()));
  }

  public static <V extends OpenSourceMvpView, I extends OpenSourceMvpInteractor>
      Factory<OpenSourcePresenter<V, I>> create(
          MembersInjector<OpenSourcePresenter<V, I>> openSourcePresenterMembersInjector,
          Provider<I> mvpInteractorProvider,
          Provider<SchedulerProvider> schedulerProvider,
          Provider<CompositeDisposable> compositeDisposableProvider) {
    return new OpenSourcePresenter_Factory<V, I>(
        openSourcePresenterMembersInjector,
        mvpInteractorProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
