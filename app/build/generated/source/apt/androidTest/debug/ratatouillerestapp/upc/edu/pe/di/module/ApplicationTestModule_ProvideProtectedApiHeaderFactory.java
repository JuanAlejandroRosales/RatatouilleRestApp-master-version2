package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHeader;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTestModule_ProvideProtectedApiHeaderFactory
    implements Factory<ApiHeader.ProtectedApiHeader> {
  private final ApplicationTestModule module;

  private final Provider<String> apiKeyProvider;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  public ApplicationTestModule_ProvideProtectedApiHeaderFactory(
      ApplicationTestModule module,
      Provider<String> apiKeyProvider,
      Provider<PreferencesHelper> preferencesHelperProvider) {
    assert module != null;
    this.module = module;
    assert apiKeyProvider != null;
    this.apiKeyProvider = apiKeyProvider;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
  }

  @Override
  public ApiHeader.ProtectedApiHeader get() {
    return Preconditions.checkNotNull(
        module.provideProtectedApiHeader(apiKeyProvider.get(), preferencesHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApiHeader.ProtectedApiHeader> create(
      ApplicationTestModule module,
      Provider<String> apiKeyProvider,
      Provider<PreferencesHelper> preferencesHelperProvider) {
    return new ApplicationTestModule_ProvideProtectedApiHeaderFactory(
        module, apiKeyProvider, preferencesHelperProvider);
  }

  /** Proxies {@link ApplicationTestModule#provideProtectedApiHeader(String, PreferencesHelper)}. */
  public static ApiHeader.ProtectedApiHeader proxyProvideProtectedApiHeader(
      ApplicationTestModule instance, String apiKey, PreferencesHelper preferencesHelper) {
    return instance.provideProtectedApiHeader(apiKey, preferencesHelper);
  }
}
