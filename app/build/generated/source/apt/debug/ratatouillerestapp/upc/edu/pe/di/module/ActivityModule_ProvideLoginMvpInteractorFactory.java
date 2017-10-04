package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginInteractor;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginMvpInteractor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideLoginMvpInteractorFactory
    implements Factory<LoginMvpInteractor> {
  private final ActivityModule module;

  private final Provider<LoginInteractor> interactorProvider;

  public ActivityModule_ProvideLoginMvpInteractorFactory(
      ActivityModule module, Provider<LoginInteractor> interactorProvider) {
    assert module != null;
    this.module = module;
    assert interactorProvider != null;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public LoginMvpInteractor get() {
    return Preconditions.checkNotNull(
        module.provideLoginMvpInteractor(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoginMvpInteractor> create(
      ActivityModule module, Provider<LoginInteractor> interactorProvider) {
    return new ActivityModule_ProvideLoginMvpInteractorFactory(module, interactorProvider);
  }

  /** Proxies {@link ActivityModule#provideLoginMvpInteractor(LoginInteractor)}. */
  public static LoginMvpInteractor proxyProvideLoginMvpInteractor(
      ActivityModule instance, LoginInteractor interactor) {
    return instance.provideLoginMvpInteractor(interactor);
  }
}
