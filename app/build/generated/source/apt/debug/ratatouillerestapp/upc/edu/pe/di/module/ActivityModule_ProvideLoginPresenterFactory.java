package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginMvpView;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideLoginPresenterFactory
    implements Factory<LoginMvpPresenter<LoginMvpView, LoginMvpInteractor>> {
  private final ActivityModule module;

  private final Provider<LoginPresenter<LoginMvpView, LoginMvpInteractor>> presenterProvider;

  public ActivityModule_ProvideLoginPresenterFactory(
      ActivityModule module,
      Provider<LoginPresenter<LoginMvpView, LoginMvpInteractor>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public LoginMvpPresenter<LoginMvpView, LoginMvpInteractor> get() {
    return Preconditions.checkNotNull(
        module.provideLoginPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoginMvpPresenter<LoginMvpView, LoginMvpInteractor>> create(
      ActivityModule module,
      Provider<LoginPresenter<LoginMvpView, LoginMvpInteractor>> presenterProvider) {
    return new ActivityModule_ProvideLoginPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideLoginPresenter(LoginPresenter)}. */
  public static LoginMvpPresenter<LoginMvpView, LoginMvpInteractor> proxyProvideLoginPresenter(
      ActivityModule instance, LoginPresenter<LoginMvpView, LoginMvpInteractor> presenter) {
    return instance.provideLoginPresenter(presenter);
  }
}
