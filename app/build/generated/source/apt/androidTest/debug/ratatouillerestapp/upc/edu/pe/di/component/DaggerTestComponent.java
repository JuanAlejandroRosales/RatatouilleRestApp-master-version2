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
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationTestModule;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationTestModule_ProvideApiHelperFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationTestModule_ProvideApiKeyFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationTestModule_ProvideApplicationFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationTestModule_ProvideCalligraphyDefaultConfigFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationTestModule_ProvideContextFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationTestModule_ProvideDaoSessionFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationTestModule_ProvideDatabaseNameFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationTestModule_ProvidePreferenceNameFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationTestModule_ProvidePreferencesHelperFactory;
import ratatouillerestapp.upc.edu.pe.di.module.ApplicationTestModule_ProvideProtectedApiHeaderFactory;
import ratatouillerestapp.upc.edu.pe.service.SyncInteractor;
import ratatouillerestapp.upc.edu.pe.service.SyncInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.service.SyncService;
import ratatouillerestapp.upc.edu.pe.service.SyncService_MembersInjector;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerTestComponent implements TestComponent {
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

  private DaggerTestComponent(Builder builder) {
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
            ApplicationTestModule_ProvideCalligraphyDefaultConfigFactory.create(
                builder.applicationTestModule));

    this.mvpAppMembersInjector =
        MvpApp_MembersInjector.create(provideCalligraphyDefaultConfigProvider);

    this.provideContextProvider =
        ApplicationTestModule_ProvideContextFactory.create(builder.applicationTestModule);

    this.providePreferenceNameProvider =
        ApplicationTestModule_ProvidePreferenceNameFactory.create(builder.applicationTestModule);

    this.appPreferencesHelperProvider =
        DoubleCheck.provider(
            AppPreferencesHelper_Factory.create(
                provideContextProvider, providePreferenceNameProvider));

    this.providePreferencesHelperProvider =
        DoubleCheck.provider(
            ApplicationTestModule_ProvidePreferencesHelperFactory.create(
                builder.applicationTestModule, appPreferencesHelperProvider));

    this.provideApiKeyProvider =
        ApplicationTestModule_ProvideApiKeyFactory.create(builder.applicationTestModule);

    this.publicApiHeaderProvider = ApiHeader_PublicApiHeader_Factory.create(provideApiKeyProvider);

    this.provideProtectedApiHeaderProvider =
        DoubleCheck.provider(
            ApplicationTestModule_ProvideProtectedApiHeaderFactory.create(
                builder.applicationTestModule,
                provideApiKeyProvider,
                providePreferencesHelperProvider));

    this.apiHeaderProvider =
        DoubleCheck.provider(
            ApiHeader_Factory.create(publicApiHeaderProvider, provideProtectedApiHeaderProvider));

    this.appApiHelperProvider =
        DoubleCheck.provider(AppApiHelper_Factory.create(apiHeaderProvider));

    this.provideApiHelperProvider =
        DoubleCheck.provider(
            ApplicationTestModule_ProvideApiHelperFactory.create(
                builder.applicationTestModule, appApiHelperProvider));

    this.syncInteractorProvider =
        SyncInteractor_Factory.create(
            MembersInjectors.<SyncInteractor>noOp(),
            providePreferencesHelperProvider,
            provideApiHelperProvider);

    this.syncServiceMembersInjector = SyncService_MembersInjector.create(syncInteractorProvider);

    this.provideApplicationProvider =
        ApplicationTestModule_ProvideApplicationFactory.create(builder.applicationTestModule);

    this.provideDatabaseNameProvider =
        ApplicationTestModule_ProvideDatabaseNameFactory.create(builder.applicationTestModule);

    this.dbOpenHelperProvider =
        DoubleCheck.provider(
            DbOpenHelper_Factory.create(
                MembersInjectors.<DbOpenHelper>noOp(),
                provideContextProvider,
                provideDatabaseNameProvider));

    this.provideDaoSessionProvider =
        DoubleCheck.provider(
            ApplicationTestModule_ProvideDaoSessionFactory.create(
                builder.applicationTestModule, dbOpenHelperProvider));
  }

  @Override
  public void inject(MvpApp arg0) {
    mvpAppMembersInjector.injectMembers(arg0);
  }

  @Override
  public void inject(SyncService arg0) {
    syncServiceMembersInjector.injectMembers(arg0);
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
    private ApplicationTestModule applicationTestModule;

    private Builder() {}

    public TestComponent build() {
      if (applicationTestModule == null) {
        throw new IllegalStateException(
            ApplicationTestModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerTestComponent(this);
    }

    public Builder applicationTestModule(ApplicationTestModule applicationTestModule) {
      this.applicationTestModule = Preconditions.checkNotNull(applicationTestModule);
      return this;
    }
  }
}
