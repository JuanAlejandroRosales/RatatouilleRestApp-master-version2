package ratatouillerestapp.upc.edu.pe.ui.login;

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
public final class LoginPresenter_Factory<V extends LoginMvpView, I extends LoginMvpInteractor>
    implements Factory<LoginPresenter<V, I>> {
  private final MembersInjector<LoginPresenter<V, I>> loginPresenterMembersInjector;

  private final Provider<I> mvpInteractorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public LoginPresenter_Factory(
      MembersInjector<LoginPresenter<V, I>> loginPresenterMembersInjector,
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert loginPresenterMembersInjector != null;
    this.loginPresenterMembersInjector = loginPresenterMembersInjector;
    assert mvpInteractorProvider != null;
    this.mvpInteractorProvider = mvpInteractorProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public LoginPresenter<V, I> get() {
    return MembersInjectors.injectMembers(
        loginPresenterMembersInjector,
        new LoginPresenter<V, I>(
            mvpInteractorProvider.get(),
            schedulerProvider.get(),
            compositeDisposableProvider.get()));
  }

  public static <V extends LoginMvpView, I extends LoginMvpInteractor>
      Factory<LoginPresenter<V, I>> create(
          MembersInjector<LoginPresenter<V, I>> loginPresenterMembersInjector,
          Provider<I> mvpInteractorProvider,
          Provider<SchedulerProvider> schedulerProvider,
          Provider<CompositeDisposable> compositeDisposableProvider) {
    return new LoginPresenter_Factory<V, I>(
        loginPresenterMembersInjector,
        mvpInteractorProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
