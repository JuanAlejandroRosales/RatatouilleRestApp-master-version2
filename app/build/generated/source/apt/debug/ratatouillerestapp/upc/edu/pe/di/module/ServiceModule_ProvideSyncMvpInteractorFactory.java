package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.service.SyncInteractor;
import ratatouillerestapp.upc.edu.pe.service.SyncMvpInteractor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServiceModule_ProvideSyncMvpInteractorFactory
    implements Factory<SyncMvpInteractor> {
  private final ServiceModule module;

  private final Provider<SyncInteractor> interactorProvider;

  public ServiceModule_ProvideSyncMvpInteractorFactory(
      ServiceModule module, Provider<SyncInteractor> interactorProvider) {
    assert module != null;
    this.module = module;
    assert interactorProvider != null;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public SyncMvpInteractor get() {
    return Preconditions.checkNotNull(
        module.provideSyncMvpInteractor(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SyncMvpInteractor> create(
      ServiceModule module, Provider<SyncInteractor> interactorProvider) {
    return new ServiceModule_ProvideSyncMvpInteractorFactory(module, interactorProvider);
  }

  /** Proxies {@link ServiceModule#provideSyncMvpInteractor(SyncInteractor)}. */
  public static SyncMvpInteractor proxyProvideSyncMvpInteractor(
      ServiceModule instance, SyncInteractor interactor) {
    return instance.provideSyncMvpInteractor(interactor);
  }
}
