package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.main.MainInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.MainMvpInteractor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideMainMvpInteractorFactory
    implements Factory<MainMvpInteractor> {
  private final ActivityModule module;

  private final Provider<MainInteractor> interactorProvider;

  public ActivityModule_ProvideMainMvpInteractorFactory(
      ActivityModule module, Provider<MainInteractor> interactorProvider) {
    assert module != null;
    this.module = module;
    assert interactorProvider != null;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public MainMvpInteractor get() {
    return Preconditions.checkNotNull(
        module.provideMainMvpInteractor(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MainMvpInteractor> create(
      ActivityModule module, Provider<MainInteractor> interactorProvider) {
    return new ActivityModule_ProvideMainMvpInteractorFactory(module, interactorProvider);
  }

  /** Proxies {@link ActivityModule#provideMainMvpInteractor(MainInteractor)}. */
  public static MainMvpInteractor proxyProvideMainMvpInteractor(
      ActivityModule instance, MainInteractor interactor) {
    return instance.provideMainMvpInteractor(interactor);
  }
}
