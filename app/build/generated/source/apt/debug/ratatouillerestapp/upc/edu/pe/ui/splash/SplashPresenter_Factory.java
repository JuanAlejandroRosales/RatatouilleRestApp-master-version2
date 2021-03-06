package ratatouillerestapp.upc.edu.pe.ui.splash;

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
public final class SplashPresenter_Factory<V extends SplashMvpView, I extends SplashMvpInteractor>
    implements Factory<SplashPresenter<V, I>> {
  private final MembersInjector<SplashPresenter<V, I>> splashPresenterMembersInjector;

  private final Provider<I> mvpInteractorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public SplashPresenter_Factory(
      MembersInjector<SplashPresenter<V, I>> splashPresenterMembersInjector,
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert splashPresenterMembersInjector != null;
    this.splashPresenterMembersInjector = splashPresenterMembersInjector;
    assert mvpInteractorProvider != null;
    this.mvpInteractorProvider = mvpInteractorProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public SplashPresenter<V, I> get() {
    return MembersInjectors.injectMembers(
        splashPresenterMembersInjector,
        new SplashPresenter<V, I>(
            mvpInteractorProvider.get(),
            schedulerProvider.get(),
            compositeDisposableProvider.get()));
  }

  public static <V extends SplashMvpView, I extends SplashMvpInteractor>
      Factory<SplashPresenter<V, I>> create(
          MembersInjector<SplashPresenter<V, I>> splashPresenterMembersInjector,
          Provider<I> mvpInteractorProvider,
          Provider<SchedulerProvider> schedulerProvider,
          Provider<CompositeDisposable> compositeDisposableProvider) {
    return new SplashPresenter_Factory<V, I>(
        splashPresenterMembersInjector,
        mvpInteractorProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
