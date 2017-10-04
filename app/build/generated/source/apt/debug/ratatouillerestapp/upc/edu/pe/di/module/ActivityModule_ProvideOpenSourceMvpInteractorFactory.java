package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceMvpInteractor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideOpenSourceMvpInteractorFactory
    implements Factory<OpenSourceMvpInteractor> {
  private final ActivityModule module;

  private final Provider<OpenSourceInteractor> interactorProvider;

  public ActivityModule_ProvideOpenSourceMvpInteractorFactory(
      ActivityModule module, Provider<OpenSourceInteractor> interactorProvider) {
    assert module != null;
    this.module = module;
    assert interactorProvider != null;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public OpenSourceMvpInteractor get() {
    return Preconditions.checkNotNull(
        module.provideOpenSourceMvpInteractor(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OpenSourceMvpInteractor> create(
      ActivityModule module, Provider<OpenSourceInteractor> interactorProvider) {
    return new ActivityModule_ProvideOpenSourceMvpInteractorFactory(module, interactorProvider);
  }

  /** Proxies {@link ActivityModule#provideOpenSourceMvpInteractor(OpenSourceInteractor)}. */
  public static OpenSourceMvpInteractor proxyProvideOpenSourceMvpInteractor(
      ActivityModule instance, OpenSourceInteractor interactor) {
    return instance.provideOpenSourceMvpInteractor(interactor);
  }
}
