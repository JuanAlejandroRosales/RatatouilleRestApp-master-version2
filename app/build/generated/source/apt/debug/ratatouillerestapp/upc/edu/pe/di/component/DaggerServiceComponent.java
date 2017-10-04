package ratatouillerestapp.upc.edu.pe.di.component;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;
import ratatouillerestapp.upc.edu.pe.di.module.ServiceModule;
import ratatouillerestapp.upc.edu.pe.service.SyncInteractor;
import ratatouillerestapp.upc.edu.pe.service.SyncInteractor_Factory;
import ratatouillerestapp.upc.edu.pe.service.SyncService;
import ratatouillerestapp.upc.edu.pe.service.SyncService_MembersInjector;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerServiceComponent implements ServiceComponent {
  private Provider<PreferencesHelper> preferencesHelperProvider;

  private Provider<ApiHelper> apiHelperProvider;

  private Provider<SyncInteractor> syncInteractorProvider;

  private MembersInjector<SyncService> syncServiceMembersInjector;

  private DaggerServiceComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.preferencesHelperProvider =
        new Factory<PreferencesHelper>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public PreferencesHelper get() {
            return Preconditions.checkNotNull(
                applicationComponent.preferencesHelper(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.apiHelperProvider =
        new Factory<ApiHelper>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public ApiHelper get() {
            return Preconditions.checkNotNull(
                applicationComponent.apiHelper(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.syncInteractorProvider =
        SyncInteractor_Factory.create(
            MembersInjectors.<SyncInteractor>noOp(), preferencesHelperProvider, apiHelperProvider);

    this.syncServiceMembersInjector = SyncService_MembersInjector.create(syncInteractorProvider);
  }

  @Override
  public void inject(SyncService service) {
    syncServiceMembersInjector.injectMembers(service);
  }

  public static final class Builder {
    private ApplicationComponent applicationComponent;

    private Builder() {}

    public ServiceComponent build() {
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerServiceComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder serviceModule(ServiceModule serviceModule) {
      Preconditions.checkNotNull(serviceModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
