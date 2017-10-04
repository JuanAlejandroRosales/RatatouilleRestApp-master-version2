package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashInteractor;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashMvpInteractor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideSplashMvpInteractorFactory
    implements Factory<SplashMvpInteractor> {
  private final ActivityModule module;

  private final Provider<SplashInteractor> interactorProvider;

  public ActivityModule_ProvideSplashMvpInteractorFactory(
      ActivityModule module, Provider<SplashInteractor> interactorProvider) {
    assert module != null;
    this.module = module;
    assert interactorProvider != null;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public SplashMvpInteractor get() {
    return Preconditions.checkNotNull(
        module.provideSplashMvpInteractor(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SplashMvpInteractor> create(
      ActivityModule module, Provider<SplashInteractor> interactorProvider) {
    return new ActivityModule_ProvideSplashMvpInteractorFactory(module, interactorProvider);
  }

  /** Proxies {@link ActivityModule#provideSplashMvpInteractor(SplashInteractor)}. */
  public static SplashMvpInteractor proxyProvideSplashMvpInteractor(
      ActivityModule instance, SplashInteractor interactor) {
    return instance.provideSplashMvpInteractor(interactor);
  }
}
