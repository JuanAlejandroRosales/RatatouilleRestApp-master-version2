package ratatouillerestapp.upc.edu.pe.ui.feed.blogs;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BlogInteractor_Factory implements Factory<BlogInteractor> {
  private final MembersInjector<BlogInteractor> blogInteractorMembersInjector;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public BlogInteractor_Factory(
      MembersInjector<BlogInteractor> blogInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    assert blogInteractorMembersInjector != null;
    this.blogInteractorMembersInjector = blogInteractorMembersInjector;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public BlogInteractor get() {
    return MembersInjectors.injectMembers(
        blogInteractorMembersInjector,
        new BlogInteractor(preferencesHelperProvider.get(), apiHelperProvider.get()));
  }

  public static Factory<BlogInteractor> create(
      MembersInjector<BlogInteractor> blogInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    return new BlogInteractor_Factory(
        blogInteractorMembersInjector, preferencesHelperProvider, apiHelperProvider);
  }
}
