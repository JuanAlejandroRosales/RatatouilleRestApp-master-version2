package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.prefs.AppPreferencesHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTestModule_ProvidePreferencesHelperFactory
    implements Factory<PreferencesHelper> {
  private final ApplicationTestModule module;

  private final Provider<AppPreferencesHelper> appPreferencesHelperProvider;

  public ApplicationTestModule_ProvidePreferencesHelperFactory(
      ApplicationTestModule module, Provider<AppPreferencesHelper> appPreferencesHelperProvider) {
    assert module != null;
    this.module = module;
    assert appPreferencesHelperProvider != null;
    this.appPreferencesHelperProvider = appPreferencesHelperProvider;
  }

  @Override
  public PreferencesHelper get() {
    return Preconditions.checkNotNull(
        module.providePreferencesHelper(appPreferencesHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PreferencesHelper> create(
      ApplicationTestModule module, Provider<AppPreferencesHelper> appPreferencesHelperProvider) {
    return new ApplicationTestModule_ProvidePreferencesHelperFactory(
        module, appPreferencesHelperProvider);
  }

  /** Proxies {@link ApplicationTestModule#providePreferencesHelper(AppPreferencesHelper)}. */
  public static PreferencesHelper proxyProvidePreferencesHelper(
      ApplicationTestModule instance, AppPreferencesHelper appPreferencesHelper) {
    return instance.providePreferencesHelper(appPreferencesHelper);
  }
}
