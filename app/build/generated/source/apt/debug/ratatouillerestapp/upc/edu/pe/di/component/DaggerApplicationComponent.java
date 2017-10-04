package ratatouillerestapp.upc.edu.pe.di.component;

import android.app.Application;
import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.MvpApp;
import ratatouillerestapp.upc.edu.pe.MvpApp_MembersInjector;
import ratatouillerestapp.upc.edu.pe.data.db.DbOpenHelper;
import ratatouillerestapp.upc.edu.pe.data.db.DbOpenHelper_Factory;
import ratatouillerestapp.upc.edu.pe.data.db.model.DaoSession;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHeader;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHeader_Factory;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHeader_PublicApiHeader_Factory;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.network.AppApiHelper;
import ratatouillerestapp.upc.edu.pe.data.network.AppApiHelper_Factory;
import ratatouillerestapp.upc.edu.pe.data.prefs.AppPreferencesHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.AppPreferencesHelper_Factory;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationModule;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationModule_ProvideApiHelperFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationModule_ProvideApiKeyFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationModule_ProvideApplicationFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationModule_ProvideCalligraphyDefaultConfigFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationModule_ProvideContextFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationModule_ProvideDaoSessionFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationModule_ProvideDatabaseNameFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationModule_ProvidePreferenceNameFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationModule_ProvidePreferencesHelperFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationModule_ProvideProtectedApiHeaderFactory;
import ratatouillerestapp.upc.edu.pe.service.SyncInteractor;
import ratatouillerestapp.upc.edu.pe.service.SyncInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.service.SyncService;
import ratatouillerestapp.upc.edu.pe.service.SyncService_MembersInjector;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<CalligraphyConfig> provideCalligraphyDefaultConfigProvider;

  private MembersInjector<MvpApp> mvpAppMembersInjector;

  private Provider<Context> provideContextProvider;

  private Provider<String> providePreferenceNameProvider;

  private Provider<AppPreferencesHelper> appPreferencesHelperProvider;

  private Provider<PreferencesHelper> providePreferencesHelperProvider;

  private Provider<String> provideApiKeyProvider;

  private Provider<ApiHeader.PublicApiHeader> publicApiHeaderProvider;

  private Provider<ApiHeader.ProtectedApiHeader> provideProtectedApiHeaderProvider;

  private Provider<ApiHeader> apiHeaderProvider;

  private Provider<AppApiHelper> appApiHelperProvider;

  private Provider<ApiHelper> provideApiHelperProvider;

  private Provider<SyncInteractor> syncInteractorProvider;

  private MembersInjector<SyncService> syncServiceMembersInjector;

  private Provider<Application> provideApplicationProvider;

  private Provider<String> provideDatabaseNameProvider;

  private Provider<DbOpenHelper> dbOpenHelperProvider;

  private Provider<DaoSession> provideDaoSessionProvider;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideCalligraphyDefaultConfigProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideCalligraphyDefaultConfigFactory.create(
                builder.applicationModule));

    this.mvpAppMembersInjector =
        MvpApp_MembersInjector.create(provideCalligraphyDefaultConfigProvider);

    this.provideContextProvider =
        ApplicationModule_ProvideContextFactory.create(builder.applicationModule);

    this.providePreferenceNameProvider =
        ApplicationModule_ProvidePreferenceNameFactory.create(builder.applicationModule);

    this.appPreferencesHelperProvider =
        DoubleCheck.provider(
            AppPreferencesHelper_Factory.create(
                provideContextProvider, providePreferenceNameProvider));

    this.providePreferencesHelperProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvidePreferencesHelperFactory.create(
                builder.applicationModule, appPreferencesHelperProvider));

    this.provideApiKeyProvider =
        ApplicationModule_ProvideApiKeyFactory.create(builder.applicationModule);

    this.publicApiHeaderProvider = ApiHeader_PublicApiHeader_Factory.create(provideApiKeyProvider);

    this.provideProtectedApiHeaderProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideProtectedApiHeaderFactory.create(
                builder.applicationModule,
                provideApiKeyProvider,
                providePreferencesHelperProvider));

    this.apiHeaderProvider =
        DoubleCheck.provider(
            ApiHeader_Factory.create(publicApiHeaderProvider, provideProtectedApiHeaderProvider));

    this.appApiHelperProvider =
        DoubleCheck.provider(AppApiHelper_Factory.create(apiHeaderProvider));

    this.provideApiHelperProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideApiHelperFactory.create(
                builder.applicationModule, appApiHelperProvider));

    this.syncInteractorProvider =
        SyncInteractor_Factory.create(
            MembersInjectors.<SyncInteractor>noOp(),
            providePreferencesHelperProvider,
            provideApiHelperProvider);

    this.syncServiceMembersInjector = SyncService_MembersInjector.create(syncInteractorProvider);

    this.provideApplicationProvider =
        ApplicationModule_ProvideApplicationFactory.create(builder.applicationModule);

    this.provideDatabaseNameProvider =
        ApplicationModule_ProvideDatabaseNameFactory.create(builder.applicationModule);

    this.dbOpenHelperProvider =
        DoubleCheck.provider(
            DbOpenHelper_Factory.create(
                MembersInjectors.<DbOpenHelper>noOp(),
                provideContextProvider,
                provideDatabaseNameProvider));

    this.provideDaoSessionProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideDaoSessionFactory.create(
                builder.applicationModule, dbOpenHelperProvider));
  }

  @Override
  public void inject(MvpApp app) {
    mvpAppMembersInjector.injectMembers(app);
  }

  @Override
  public void inject(SyncService service) {
    syncServiceMembersInjector.injectMembers(service);
  }

  @Override
  public Context context() {
    return provideContextProvider.get();
  }

  @Override
  public Application application() {
    return provideApplicationProvider.get();
  }

  @Override
  public PreferencesHelper preferencesHelper() {
    return providePreferencesHelperProvider.get();
  }

  @Override
  public ApiHelper apiHelper() {
    return provideApiHelperProvider.get();
  }

  @Override
  public DaoSession daoSession() {
    return provideDaoSessionProvider.get();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }
  }
}
