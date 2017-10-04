package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedMvpInteractor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideFeedMvpInteractorFactory
    implements Factory<FeedMvpInteractor> {
  private final ActivityModule module;

  private final Provider<FeedInteractor> interactorProvider;

  public ActivityModule_ProvideFeedMvpInteractorFactory(
      ActivityModule module, Provider<FeedInteractor> interactorProvider) {
    assert module != null;
    this.module = module;
    assert interactorProvider != null;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public FeedMvpInteractor get() {
    return Preconditions.checkNotNull(
        module.provideFeedMvpInteractor(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<FeedMvpInteractor> create(
      ActivityModule module, Provider<FeedInteractor> interactorProvider) {
    return new ActivityModule_ProvideFeedMvpInteractorFactory(module, interactorProvider);
  }

  /** Proxies {@link ActivityModule#provideFeedMvpInteractor(FeedInteractor)}. */
  public static FeedMvpInteractor proxyProvideFeedMvpInteractor(
      ActivityModule instance, FeedInteractor interactor) {
    return instance.provideFeedMvpInteractor(interactor);
  }
}
