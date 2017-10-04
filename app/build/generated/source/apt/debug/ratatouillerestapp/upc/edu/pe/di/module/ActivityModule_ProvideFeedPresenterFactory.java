package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedMvpView;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideFeedPresenterFactory
    implements Factory<FeedMvpPresenter<FeedMvpView, FeedMvpInteractor>> {
  private final ActivityModule module;

  private final Provider<FeedPresenter<FeedMvpView, FeedMvpInteractor>> presenterProvider;

  public ActivityModule_ProvideFeedPresenterFactory(
      ActivityModule module,
      Provider<FeedPresenter<FeedMvpView, FeedMvpInteractor>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public FeedMvpPresenter<FeedMvpView, FeedMvpInteractor> get() {
    return Preconditions.checkNotNull(
        module.provideFeedPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<FeedMvpPresenter<FeedMvpView, FeedMvpInteractor>> create(
      ActivityModule module,
      Provider<FeedPresenter<FeedMvpView, FeedMvpInteractor>> presenterProvider) {
    return new ActivityModule_ProvideFeedPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideFeedPresenter(FeedPresenter)}. */
  public static FeedMvpPresenter<FeedMvpView, FeedMvpInteractor> proxyProvideFeedPresenter(
      ActivityModule instance, FeedPresenter<FeedMvpView, FeedMvpInteractor> presenter) {
    return instance.provideFeedPresenter(presenter);
  }
}
