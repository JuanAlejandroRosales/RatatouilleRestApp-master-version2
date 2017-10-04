package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutInteractor;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpInteractor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideAboutMvpInteractorFactory
    implements Factory<AboutMvpInteractor> {
  private final ActivityModule module;

  private final Provider<AboutInteractor> interactorProvider;

  public ActivityModule_ProvideAboutMvpInteractorFactory(
      ActivityModule module, Provider<AboutInteractor> interactorProvider) {
    assert module != null;
    this.module = module;
    assert interactorProvider != null;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public AboutMvpInteractor get() {
    return Preconditions.checkNotNull(
        module.provideAboutMvpInteractor(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AboutMvpInteractor> create(
      ActivityModule module, Provider<AboutInteractor> interactorProvider) {
    return new ActivityModule_ProvideAboutMvpInteractorFactory(module, interactorProvider);
  }

  /** Proxies {@link ActivityModule#provideAboutMvpInteractor(AboutInteractor)}. */
  public static AboutMvpInteractor proxyProvideAboutMvpInteractor(
      ActivityModule instance, AboutInteractor interactor) {
    return instance.provideAboutMvpInteractor(interactor);
  }
}
