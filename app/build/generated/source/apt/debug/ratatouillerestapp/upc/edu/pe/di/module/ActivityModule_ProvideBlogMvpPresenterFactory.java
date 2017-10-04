package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogMvpView;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideBlogMvpPresenterFactory
    implements Factory<BlogMvpPresenter<BlogMvpView, BlogMvpInteractor>> {
  private final ActivityModule module;

  private final Provider<BlogPresenter<BlogMvpView, BlogMvpInteractor>> presenterProvider;

  public ActivityModule_ProvideBlogMvpPresenterFactory(
      ActivityModule module,
      Provider<BlogPresenter<BlogMvpView, BlogMvpInteractor>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public BlogMvpPresenter<BlogMvpView, BlogMvpInteractor> get() {
    return Preconditions.checkNotNull(
        module.provideBlogMvpPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BlogMvpPresenter<BlogMvpView, BlogMvpInteractor>> create(
      ActivityModule module,
      Provider<BlogPresenter<BlogMvpView, BlogMvpInteractor>> presenterProvider) {
    return new ActivityModule_ProvideBlogMvpPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideBlogMvpPresenter(BlogPresenter)}. */
  public static BlogMvpPresenter<BlogMvpView, BlogMvpInteractor> proxyProvideBlogMvpPresenter(
      ActivityModule instance, BlogPresenter<BlogMvpView, BlogMvpInteractor> presenter) {
    return instance.provideBlogMvpPresenter(presenter);
  }
}
