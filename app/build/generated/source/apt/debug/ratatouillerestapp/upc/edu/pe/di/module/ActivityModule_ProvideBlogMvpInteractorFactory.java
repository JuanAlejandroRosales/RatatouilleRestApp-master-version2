package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogMvpInteractor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideBlogMvpInteractorFactory
    implements Factory<BlogMvpInteractor> {
  private final ActivityModule module;

  private final Provider<BlogInteractor> interactorProvider;

  public ActivityModule_ProvideBlogMvpInteractorFactory(
      ActivityModule module, Provider<BlogInteractor> interactorProvider) {
    assert module != null;
    this.module = module;
    assert interactorProvider != null;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public BlogMvpInteractor get() {
    return Preconditions.checkNotNull(
        module.provideBlogMvpInteractor(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BlogMvpInteractor> create(
      ActivityModule module, Provider<BlogInteractor> interactorProvider) {
    return new ActivityModule_ProvideBlogMvpInteractorFactory(module, interactorProvider);
  }

  /** Proxies {@link ActivityModule#provideBlogMvpInteractor(BlogInteractor)}. */
  public static BlogMvpInteractor proxyProvideBlogMvpInteractor(
      ActivityModule instance, BlogInteractor interactor) {
    return instance.provideBlogMvpInteractor(interactor);
  }
}
